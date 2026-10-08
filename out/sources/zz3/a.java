package zz3;

import dx.i;
import iy.a0;
import iy.b0;
import k34.u;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0004H¦@¢\u0006\u0004\b\u0016\u0010\u0014J&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lzz3/a;", "", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Lry/c;", "b", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Liy/b0;", "peselTicket", "Liy/a0;", "decryptedCert", "password", "Loq/i0;", "c", "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "d", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    Object a(boolean z15, e<? super i<? extends dx.b, ? extends u>> eVar);

    Object b(u uVar, e<? super i<? extends dx.b, CertKeyPair>> eVar);

    Object c(rq0.b bVar, b0 b0Var, a0 a0Var, b0 b0Var2, e<? super i<? extends dx.b, i0>> eVar);

    Object d(e<? super i<? extends dx.b, Boolean>> eVar);

    Object e(e<? super i<? extends dx.b, i0>> eVar);
}
