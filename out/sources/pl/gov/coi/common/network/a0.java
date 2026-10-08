package pl.gov.coi.common.network;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpl/gov/coi/common/network/a0;", "", "<init>", "()V", "Ljavax/net/ssl/HostnameVerifier;", "b", "()Ljavax/net/ssl/HostnameVerifier;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(String str, SSLSession sSLSession) {
        return true;
    }

    public final HostnameVerifier b() {
        return new HostnameVerifier() { // from class: pl.gov.coi.common.network.z
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return a0.c(str, sSLSession);
            }
        };
    }
}
