package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes5.dex */
public class KitKatPlatformOpenSSLSocketImplAdapter extends com.android.org.conscrypt.OpenSSLSocketImpl {
    private final AbstractConscryptSocket delegate;

    public KitKatPlatformOpenSSLSocketImplAdapter(AbstractConscryptSocket abstractConscryptSocket) {
        super((com.android.org.conscrypt.SSLParametersImpl) null);
        this.delegate = abstractConscryptSocket;
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.delegate.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void bind(SocketAddress socketAddress) throws IOException {
        this.delegate.bind(socketAddress);
    }

    public void clientCertificateRequested(byte[] bArr, byte[][] bArr2) {
        throw new RuntimeException("Shouldn't be here!");
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public void connect(SocketAddress socketAddress, int i15) throws IOException {
        this.delegate.connect(socketAddress, i15);
    }

    public byte[] getAlpnSelectedProtocol() {
        return this.delegate.getAlpnSelectedProtocol();
    }

    public SocketChannel getChannel() {
        return this.delegate.getChannel();
    }

    public byte[] getChannelId() {
        return this.delegate.getChannelId();
    }

    public boolean getEnableSessionCreation() {
        return this.delegate.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.delegate.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.delegate.getEnabledProtocols();
    }

    public FileDescriptor getFileDescriptor$() {
        return this.delegate.getFileDescriptor$();
    }

    public InetAddress getInetAddress() {
        return this.delegate.getInetAddress();
    }

    public InputStream getInputStream() {
        return this.delegate.getInputStream();
    }

    public boolean getKeepAlive() {
        return this.delegate.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.delegate.getLocalAddress();
    }

    public int getLocalPort() {
        return this.delegate.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.delegate.getLocalSocketAddress();
    }

    public boolean getNeedClientAuth() {
        return this.delegate.getNeedClientAuth();
    }

    public boolean getOOBInline() {
        return this.delegate.getOOBInline();
    }

    public OutputStream getOutputStream() {
        return this.delegate.getOutputStream();
    }

    public int getPort() {
        return this.delegate.getPort();
    }

    public int getReceiveBufferSize() {
        return this.delegate.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.delegate.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() {
        return this.delegate.getReuseAddress();
    }

    public SSLParameters getSSLParameters() {
        return this.delegate.getSSLParameters();
    }

    public int getSendBufferSize() {
        return this.delegate.getSendBufferSize();
    }

    public SSLSession getSession() {
        return this.delegate.getSession();
    }

    public int getSoLinger() {
        return this.delegate.getSoLinger();
    }

    public int getSoTimeout() {
        return this.delegate.getSoTimeout();
    }

    public int getSoWriteTimeout() {
        return this.delegate.getSoWriteTimeout();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.delegate.getSupportedProtocols();
    }

    public boolean getTcpNoDelay() {
        return this.delegate.getTcpNoDelay();
    }

    public int getTrafficClass() {
        return this.delegate.getTrafficClass();
    }

    public boolean getUseClientMode() {
        return this.delegate.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.delegate.getWantClientAuth();
    }

    public void handshakeCompleted() {
        throw new RuntimeException("Shouldn't be here!");
    }

    public boolean isBound() {
        return this.delegate.isBound();
    }

    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    public boolean isConnected() {
        return this.delegate.isConnected();
    }

    public boolean isInputShutdown() {
        return this.delegate.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.delegate.isOutputShutdown();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.delegate.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void sendUrgentData(int i15) throws SocketException {
        this.delegate.sendUrgentData(i15);
    }

    public void setAlpnProtocols(byte[] bArr) {
        this.delegate.setAlpnProtocols(bArr);
    }

    public void setChannelIdEnabled(boolean z15) {
        this.delegate.setChannelIdEnabled(z15);
    }

    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.delegate.setChannelIdPrivateKey(privateKey);
    }

    public void setEnableSessionCreation(boolean z15) {
        this.delegate.setEnableSessionCreation(z15);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.delegate.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.delegate.setEnabledProtocols(strArr);
    }

    public void setHandshakeTimeout(int i15) throws SocketException {
        this.delegate.setHandshakeTimeout(i15);
    }

    public void setHostname(String str) {
        this.delegate.setHostname(str);
    }

    public void setKeepAlive(boolean z15) throws SocketException {
        this.delegate.setKeepAlive(z15);
    }

    public void setNeedClientAuth(boolean z15) {
        this.delegate.setNeedClientAuth(z15);
    }

    public void setOOBInline(boolean z15) throws SocketException {
        this.delegate.setOOBInline(z15);
    }

    public void setPerformancePreferences(int i15, int i16, int i17) {
        this.delegate.setPerformancePreferences(i15, i16, i17);
    }

    public void setReceiveBufferSize(int i15) throws SocketException {
        this.delegate.setReceiveBufferSize(i15);
    }

    public void setReuseAddress(boolean z15) throws SocketException {
        this.delegate.setReuseAddress(z15);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.delegate.setSSLParameters(sSLParameters);
    }

    public void setSendBufferSize(int i15) throws SocketException {
        this.delegate.setSendBufferSize(i15);
    }

    public void setSoLinger(boolean z15, int i15) throws SocketException {
        this.delegate.setSoLinger(z15, i15);
    }

    public void setSoTimeout(int i15) throws SocketException {
        this.delegate.setSoTimeout(i15);
    }

    public void setSoWriteTimeout(int i15) throws SocketException {
        this.delegate.setSoWriteTimeout(i15);
    }

    public void setTcpNoDelay(boolean z15) throws SocketException {
        this.delegate.setTcpNoDelay(z15);
    }

    public void setTrafficClass(int i15) throws SocketException {
        this.delegate.setTrafficClass(i15);
    }

    public void setUseClientMode(boolean z15) {
        this.delegate.setUseClientMode(z15);
    }

    public void setUseSessionTickets(boolean z15) {
        this.delegate.setUseSessionTickets(z15);
    }

    public void setWantClientAuth(boolean z15) {
        this.delegate.setWantClientAuth(z15);
    }

    public void shutdownInput() throws IOException {
        this.delegate.shutdownInput();
    }

    public void shutdownOutput() throws IOException {
        this.delegate.shutdownOutput();
    }

    public void startHandshake() throws IOException {
        this.delegate.startHandshake();
    }

    public String toString() {
        return this.delegate.toString();
    }

    public void verifyCertificateChain(byte[][] bArr, String str) {
        throw new RuntimeException("Shouldn't be here!");
    }

    public void connect(SocketAddress socketAddress) throws IOException {
        this.delegate.connect(socketAddress);
    }
}
