package org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes5.dex */
interface ConscryptSession extends SSLSession {
    String getApplicationProtocol();

    String[] getLocalSupportedSignatureAlgorithms();

    @Override // javax.net.ssl.SSLSession
    X509Certificate[] getPeerCertificates();

    byte[] getPeerSignedCertificateTimestamp();

    String[] getPeerSupportedSignatureAlgorithms();

    String getRequestedServerName();

    List<byte[]> getStatusResponses();
}
