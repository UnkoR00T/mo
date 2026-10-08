package z00;

import java.security.cert.X509Certificate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lz00/e;", "", "", "Ljava/security/cert/X509Certificate;", "chain", "", "tlsData", "ocspData", "Loq/i0;", "a", "(Ljava/util/List;[B[B)V", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    void a(List<? extends X509Certificate> chain, byte[] tlsData, byte[] ocspData);
}
