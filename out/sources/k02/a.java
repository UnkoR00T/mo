package k02;

import dx.b;
import dx.i;
import k34.u;
import m02.PersonalData;
import m02.UserDocumentData;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0002H¦@¢\u0006\u0004\b\n\u0010\u0006J&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0010\u001a\u00020\rH¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lk02/a;", "", "Ldx/i;", "Ldx/b;", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lm02/g;", "d", "Lm02/i;", "c", "", "withValidCert", "Lk34/u;", "a", "(ZLtq/e;)Ljava/lang/Object;", "identityType", "Lry/c;", "b", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    Object c(e<? super i<? extends b, UserDocumentData>> eVar);

    Object d(e<? super i<? extends b, PersonalData>> eVar);

    Object e(e<? super i<? extends b, ? extends rq0.b>> eVar);
}
