package org.conscrypt;

import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes5.dex */
public interface SSLClientSessionCache {
    byte[] getSessionData(String str, int i15);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
