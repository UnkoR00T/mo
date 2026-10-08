package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractConscryptSocket extends SSLSocket {
    private final boolean autoClose;
    private final List<HandshakeCompletedListener> listeners;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final int peerPort;
    private int readTimeoutMilliseconds;
    final Socket socket;

    AbstractConscryptSocket() {
        this.peerInfoProvider = new PeerInfoProvider() { // from class: org.conscrypt.AbstractConscryptSocket.1
            @Override // org.conscrypt.PeerInfoProvider
            String getHostname() {
                return AbstractConscryptSocket.this.getHostname();
            }

            @Override // org.conscrypt.PeerInfoProvider
            String getHostnameOrIP() {
                return AbstractConscryptSocket.this.getHostnameOrIP();
            }

            @Override // org.conscrypt.PeerInfoProvider
            int getPort() {
                return AbstractConscryptSocket.this.getPort();
            }
        };
        this.listeners = new ArrayList(2);
        this.socket = this;
        this.peerHostname = null;
        this.peerPort = -1;
        this.autoClose = false;
    }

    private boolean isDelegating() {
        Socket socket = this.socket;
        return (socket == null || socket == this) ? false : true;
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        Preconditions.checkArgument(handshakeCompletedListener != null, "Provided listener is null");
        this.listeners.add(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        if (isDelegating()) {
            this.socket.bind(socketAddress);
        } else {
            super.bind(socketAddress);
        }
    }

    final void checkOpen() throws SocketException {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!isDelegating()) {
            if (super.isClosed()) {
                return;
            }
            super.close();
        } else {
            if (!this.autoClose || this.socket.isClosed()) {
                return;
            }
            this.socket.close();
        }
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        connect(socketAddress, 0);
    }

    abstract byte[] exportKeyingMaterial(String str, byte[] bArr, int i15);

    abstract SSLSession getActiveSession();

    @Deprecated
    abstract byte[] getAlpnSelectedProtocol();

    @Override // javax.net.ssl.SSLSocket
    public abstract String getApplicationProtocol();

    abstract String[] getApplicationProtocols();

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return null;
    }

    abstract byte[] getChannelId();

    abstract String getCurveNameForTesting();

    public FileDescriptor getFileDescriptor$() {
        return isDelegating() ? Platform.getFileDescriptor(this.socket) : Platform.getFileDescriptorFromSSLSocket(this);
    }

    @Override // javax.net.ssl.SSLSocket
    public abstract String getHandshakeApplicationProtocol();

    @Override // javax.net.ssl.SSLSocket
    public abstract SSLSession getHandshakeSession();

    String getHostname() {
        return this.peerHostname;
    }

    String getHostnameOrIP() {
        String str = this.peerHostname;
        if (str != null) {
            return str;
        }
        InetAddress inetAddress = getInetAddress();
        if (inetAddress != null) {
            return Platform.getOriginalHostNameFromInetAddress(inetAddress);
        }
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return isDelegating() ? this.socket.getInetAddress() : super.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return isDelegating() ? this.socket.getInputStream() : super.getInputStream();
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return isDelegating() ? this.socket.getKeepAlive() : super.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return isDelegating() ? this.socket.getLocalAddress() : super.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return isDelegating() ? this.socket.getLocalPort() : super.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return isDelegating() ? this.socket.getLocalSocketAddress() : super.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return false;
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return isDelegating() ? this.socket.getOutputStream() : super.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        if (isDelegating()) {
            return this.socket.getPort();
        }
        int i15 = this.peerPort;
        return i15 != -1 ? i15 : super.getPort();
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() {
        return isDelegating() ? this.socket.getReceiveBufferSize() : super.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return isDelegating() ? this.socket.getRemoteSocketAddress() : super.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return isDelegating() ? this.socket.getReuseAddress() : super.getReuseAddress();
    }

    @Override // java.net.Socket
    public int getSendBufferSize() {
        return isDelegating() ? this.socket.getSendBufferSize() : super.getSendBufferSize();
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return isDelegating() ? this.socket.getSoLinger() : super.getSoLinger();
    }

    @Override // java.net.Socket
    public final int getSoTimeout() {
        return isDelegating() ? this.socket.getSoTimeout() : this.readTimeoutMilliseconds;
    }

    int getSoWriteTimeout() {
        return 0;
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return isDelegating() ? this.socket.getTcpNoDelay() : super.getTcpNoDelay();
    }

    abstract byte[] getTlsUnique();

    @Override // java.net.Socket
    public int getTrafficClass() {
        return isDelegating() ? this.socket.getTrafficClass() : super.getTrafficClass();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return isDelegating() ? this.socket.isBound() : super.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return isDelegating() ? this.socket.isClosed() : super.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return isDelegating() ? this.socket.isConnected() : super.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return isDelegating() ? this.socket.isInputShutdown() : super.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return isDelegating() ? this.socket.isOutputShutdown() : super.isOutputShutdown();
    }

    final void notifyHandshakeCompletedListeners() {
        ArrayList arrayList = new ArrayList(this.listeners);
        if (arrayList.isEmpty()) {
            return;
        }
        HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, getActiveSession());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((HandshakeCompletedListener) it.next()).handshakeCompleted(handshakeCompletedEvent);
            } catch (RuntimeException e15) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e15);
            }
        }
    }

    final PeerInfoProvider peerInfoProvider() {
        return this.peerInfoProvider;
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        Preconditions.checkArgument(handshakeCompletedListener != null, "Provided listener is null");
        if (!this.listeners.remove(handshakeCompletedListener)) {
            throw new IllegalArgumentException("Provided listener is not registered");
        }
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i15) throws SocketException {
        throw new SocketException("Method sendUrgentData() is not supported.");
    }

    @Deprecated
    abstract void setAlpnProtocols(byte[] bArr);

    @Deprecated
    abstract void setAlpnProtocols(String[] strArr);

    abstract void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector);

    abstract void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter);

    abstract void setApplicationProtocols(String[] strArr);

    abstract void setChannelIdEnabled(boolean z15);

    abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    void setHandshakeTimeout(int i15) throws SocketException {
        throw new SocketException("Method setHandshakeTimeout() is not supported.");
    }

    void setHostname(String str) {
        this.peerHostname = str;
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z15) throws SocketException {
        if (isDelegating()) {
            this.socket.setKeepAlive(z15);
        } else {
            super.setKeepAlive(z15);
        }
    }

    public abstract void setNamedGroups(String[] strArr);

    @Override // java.net.Socket
    public final void setOOBInline(boolean z15) throws SocketException {
        throw new SocketException("Method setOOBInline() is not supported.");
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i15, int i16, int i17) {
        if (isDelegating()) {
            this.socket.setPerformancePreferences(i15, i16, i17);
        } else {
            super.setPerformancePreferences(i15, i16, i17);
        }
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i15) throws SocketException {
        if (isDelegating()) {
            this.socket.setReceiveBufferSize(i15);
        } else {
            super.setReceiveBufferSize(i15);
        }
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z15) throws SocketException {
        if (isDelegating()) {
            this.socket.setReuseAddress(z15);
        } else {
            super.setReuseAddress(z15);
        }
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i15) throws SocketException {
        if (isDelegating()) {
            this.socket.setSendBufferSize(i15);
        } else {
            super.setSendBufferSize(i15);
        }
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z15, int i15) throws SocketException {
        if (isDelegating()) {
            this.socket.setSoLinger(z15, i15);
        } else {
            super.setSoLinger(z15, i15);
        }
    }

    @Override // java.net.Socket
    public final void setSoTimeout(int i15) throws SocketException {
        if (isDelegating()) {
            this.socket.setSoTimeout(i15);
        } else {
            super.setSoTimeout(i15);
            this.readTimeoutMilliseconds = i15;
        }
    }

    void setSoWriteTimeout(int i15) throws SocketException {
        throw new SocketException("Method setSoWriteTimeout() is not supported.");
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z15) throws SocketException {
        if (isDelegating()) {
            this.socket.setTcpNoDelay(z15);
        } else {
            super.setTcpNoDelay(z15);
        }
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i15) throws SocketException {
        if (isDelegating()) {
            this.socket.setTrafficClass(i15);
        } else {
            super.setTrafficClass(i15);
        }
    }

    abstract void setUseSessionTickets(boolean z15);

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        if (isDelegating()) {
            this.socket.shutdownInput();
        } else {
            super.shutdownInput();
        }
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        if (isDelegating()) {
            this.socket.shutdownOutput();
        } else {
            super.shutdownOutput();
        }
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public String toString() {
        StringBuilder sb5 = new StringBuilder("SSL socket over ");
        if (isDelegating()) {
            sb5.append(this.socket.toString());
        } else {
            sb5.append(super.toString());
        }
        return sb5.toString();
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i15) throws IOException {
        if (this.peerHostname == null && (socketAddress instanceof InetSocketAddress)) {
            this.peerHostname = Platform.getHostStringFromInetSocketAddress((InetSocketAddress) socketAddress);
        }
        if (isDelegating()) {
            this.socket.connect(socketAddress, i15);
        } else {
            super.connect(socketAddress, i15);
        }
    }

    AbstractConscryptSocket(String str, int i15) {
        super(str, i15);
        this.peerInfoProvider = new PeerInfoProvider() { // from class: org.conscrypt.AbstractConscryptSocket.1
            @Override // org.conscrypt.PeerInfoProvider
            String getHostname() {
                return AbstractConscryptSocket.this.getHostname();
            }

            @Override // org.conscrypt.PeerInfoProvider
            String getHostnameOrIP() {
                return AbstractConscryptSocket.this.getHostnameOrIP();
            }

            @Override // org.conscrypt.PeerInfoProvider
            int getPort() {
                return AbstractConscryptSocket.this.getPort();
            }
        };
        this.listeners = new ArrayList(2);
        this.socket = this;
        this.peerHostname = str;
        this.peerPort = i15;
        this.autoClose = false;
    }

    AbstractConscryptSocket(InetAddress inetAddress, int i15) {
        super(inetAddress, i15);
        this.peerInfoProvider = new PeerInfoProvider() { // from class: org.conscrypt.AbstractConscryptSocket.1
            @Override // org.conscrypt.PeerInfoProvider
            String getHostname() {
                return AbstractConscryptSocket.this.getHostname();
            }

            @Override // org.conscrypt.PeerInfoProvider
            String getHostnameOrIP() {
                return AbstractConscryptSocket.this.getHostnameOrIP();
            }

            @Override // org.conscrypt.PeerInfoProvider
            int getPort() {
                return AbstractConscryptSocket.this.getPort();
            }
        };
        this.listeners = new ArrayList(2);
        this.socket = this;
        this.peerHostname = null;
        this.peerPort = -1;
        this.autoClose = false;
    }

    AbstractConscryptSocket(String str, int i15, InetAddress inetAddress, int i16) {
        super(str, i15, inetAddress, i16);
        this.peerInfoProvider = new PeerInfoProvider() { // from class: org.conscrypt.AbstractConscryptSocket.1
            @Override // org.conscrypt.PeerInfoProvider
            String getHostname() {
                return AbstractConscryptSocket.this.getHostname();
            }

            @Override // org.conscrypt.PeerInfoProvider
            String getHostnameOrIP() {
                return AbstractConscryptSocket.this.getHostnameOrIP();
            }

            @Override // org.conscrypt.PeerInfoProvider
            int getPort() {
                return AbstractConscryptSocket.this.getPort();
            }
        };
        this.listeners = new ArrayList(2);
        this.socket = this;
        this.peerHostname = str;
        this.peerPort = i15;
        this.autoClose = false;
    }

    AbstractConscryptSocket(InetAddress inetAddress, int i15, InetAddress inetAddress2, int i16) {
        super(inetAddress, i15, inetAddress2, i16);
        this.peerInfoProvider = new PeerInfoProvider() { // from class: org.conscrypt.AbstractConscryptSocket.1
            @Override // org.conscrypt.PeerInfoProvider
            String getHostname() {
                return AbstractConscryptSocket.this.getHostname();
            }

            @Override // org.conscrypt.PeerInfoProvider
            String getHostnameOrIP() {
                return AbstractConscryptSocket.this.getHostnameOrIP();
            }

            @Override // org.conscrypt.PeerInfoProvider
            int getPort() {
                return AbstractConscryptSocket.this.getPort();
            }
        };
        this.listeners = new ArrayList(2);
        this.socket = this;
        this.peerHostname = null;
        this.peerPort = -1;
        this.autoClose = false;
    }

    AbstractConscryptSocket(Socket socket, String str, int i15, boolean z15) {
        this.peerInfoProvider = new PeerInfoProvider() { // from class: org.conscrypt.AbstractConscryptSocket.1
            @Override // org.conscrypt.PeerInfoProvider
            String getHostname() {
                return AbstractConscryptSocket.this.getHostname();
            }

            @Override // org.conscrypt.PeerInfoProvider
            String getHostnameOrIP() {
                return AbstractConscryptSocket.this.getHostnameOrIP();
            }

            @Override // org.conscrypt.PeerInfoProvider
            int getPort() {
                return AbstractConscryptSocket.this.getPort();
            }
        };
        this.listeners = new ArrayList(2);
        this.socket = (Socket) Preconditions.checkNotNull(socket, "socket");
        this.peerHostname = str;
        this.peerPort = i15;
        this.autoClose = z15;
    }
}
