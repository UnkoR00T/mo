package org.conscrypt;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseOpenSSLSocketAdapterFactory extends SSLSocketFactory {
    private final OpenSSLSocketFactoryImpl delegate;

    protected BaseOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        this.delegate = openSSLSocketFactoryImpl;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    protected abstract Socket wrap(OpenSSLSocketImpl openSSLSocketImpl);

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i15) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i15));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i15, InetAddress inetAddress, int i16) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i15, inetAddress, i16));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i15) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i15));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i15, InetAddress inetAddress2, int i16) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i15, inetAddress2, i16));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i15, boolean z15) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(socket, str, i15, z15));
    }
}
