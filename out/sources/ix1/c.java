package ix1;

import java.security.cert.X509Certificate;
import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lix1/c;", "", "", "pdf", "Ljava/security/cert/X509Certificate;", "certificate", "Ljava/time/Instant;", "signingTime", "Lkx1/a;", "a", "([BLjava/security/cert/X509Certificate;Ljava/time/Instant;)Lkx1/a;", "parameters", "signature", "b", "(Lkx1/a;[B)[B", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    kx1.a a(byte[] pdf, X509Certificate certificate, Instant signingTime);

    byte[] b(kx1.a parameters, byte[] signature);
}
