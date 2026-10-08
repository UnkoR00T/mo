package pl.gov.coi.common.network;

import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0014\u0010\u001c\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005R\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$À\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/r;", "", "", "Lpl/gov/coi/common/network/c;", "k", "()Ljava/util/List;", "", "g", "()Z", "sslEnabled", "m", "certificateTransparencyEnabled", "", "", "c", "()Ljava/util/Set;", "ctWhitelistedHostnames", "f", "followRedirects", "", "o", "()J", "defaultCallTimeoutInSeconds", "a", "defaultReadTimeoutInSeconds", "d", "ocspRevocationCheckEnabled", "b", "crlRevocationCheckEnabled", "Lpl/gov/coi/common/network/g;", "h", "customDns", "Lpl/gov/coi/common/network/x0;", "j", "()Lpl/gov/coi/common/network/x0;", "mTLS", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r {
    long a();

    boolean b();

    default Set<String> c() {
        return e1.e();
    }

    boolean d();

    boolean f();

    boolean g();

    List<CustomDns> h();

    x0 j();

    List<CertificatePin> k();

    boolean m();

    long o();
}
