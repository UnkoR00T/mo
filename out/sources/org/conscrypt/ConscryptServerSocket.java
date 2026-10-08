package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;

/* JADX INFO: loaded from: classes5.dex */
final class ConscryptServerSocket extends SSLServerSocket {
    private boolean channelIdEnabled;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    ConscryptServerSocket(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
    }

    @Override // java.net.ServerSocket
    public Socket accept() throws IOException {
        AbstractConscryptSocket abstractConscryptSocketCreateEngineSocket = this.useEngineSocket ? Platform.createEngineSocket(this.sslParameters) : Platform.createFileDescriptorSocket(this.sslParameters);
        abstractConscryptSocketCreateEngineSocket.setChannelIdEnabled(this.channelIdEnabled);
        implAccept(abstractConscryptSocketCreateEngineSocket);
        return abstractConscryptSocketCreateEngineSocket;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters);
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    boolean isChannelIdEnabled() {
        return this.channelIdEnabled;
    }

    void setChannelIdEnabled(boolean z15) {
        this.channelIdEnabled = z15;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnableSessionCreation(boolean z15) {
        this.sslParameters.setEnableSessionCreation(z15);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setNeedClientAuth(boolean z15) {
        this.sslParameters.setNeedClientAuth(z15);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setUseClientMode(boolean z15) {
        this.sslParameters.setUseClientMode(z15);
    }

    ConscryptServerSocket setUseEngineSocket(boolean z15) {
        this.useEngineSocket = z15;
        return this;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setWantClientAuth(boolean z15) {
        this.sslParameters.setWantClientAuth(z15);
    }

    ConscryptServerSocket(int i15, SSLParametersImpl sSLParametersImpl) {
        super(i15);
        this.sslParameters = sSLParametersImpl;
    }

    ConscryptServerSocket(int i15, int i16, SSLParametersImpl sSLParametersImpl) {
        super(i15, i16);
        this.sslParameters = sSLParametersImpl;
    }

    ConscryptServerSocket(int i15, int i16, InetAddress inetAddress, SSLParametersImpl sSLParametersImpl) {
        super(i15, i16, inetAddress);
        this.sslParameters = sSLParametersImpl;
    }
}
