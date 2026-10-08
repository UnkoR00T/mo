package v43;

import dx.b;
import dx.i;
import k34.u;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lv43/a;", "", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Lry/c;", "b", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object c(a aVar, boolean z15, e eVar, int i15, Object obj) {
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
}
