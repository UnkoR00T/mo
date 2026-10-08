package s73;

import dx.b;
import dx.i;
import iy.b0;
import k34.u;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\bJ&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004H¦@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Ls73/a;", "", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Liy/b0;", "g", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "e", "Lry/c;", "b", "", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "packageData", "password", "d", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object f(a aVar, boolean z15, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMainIdentityType");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return aVar.a(z15, eVar);
    }

    Object a(boolean z15, e<? super i<? extends b, ? extends u>> eVar);

    Object b(u uVar, e<? super i<? extends b, CertKeyPair>> eVar);

    Object c(e<? super i<? extends b, i0>> eVar);

    Object d(String str, b0 b0Var, e<? super i<? extends b, i0>> eVar);

    Object e(u uVar, e<? super i<? extends b, b0>> eVar);

    Object g(u uVar, e<? super i<? extends b, b0>> eVar);
}
