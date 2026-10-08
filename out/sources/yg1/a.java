package yg1;

import cb4.DialogData;
import dx.i;
import k34.u;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\nJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H¦@¢\u0006\u0004\b\u0015\u0010\nJ\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0004H¦@¢\u0006\u0004\b\u0017\u0010\nJ@\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001e\u0010\b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lyg1/a;", "", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "", "k", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lk34/u;", "g", "e", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "Lmu/g;", "Loq/i0;", "i", "()Lmu/g;", "c", "Lry/c;", "j", "Lkotlin/Function0;", "onDelete", "onClose", "Lcb4/d;", "f", "(Lrq0/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "b", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object h(a aVar, boolean z15, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMainIdentityType");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return aVar.a(z15, eVar);
    }

    Object a(boolean z15, e<? super i<? extends dx.b, ? extends u>> eVar);

    Object b(rq0.b bVar, e<? super i<? extends dx.b, i0>> eVar);

    Object c(e<? super i<? extends dx.b, i0>> eVar);

    Object d(e<? super i<? extends dx.b, Boolean>> eVar);

    Object e(e<? super i<? extends dx.b, ? extends rq0.b>> eVar);

    Object f(rq0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, e<? super i<? extends dx.b, DialogData>> eVar);

    Object g(rq0.b bVar, e<? super u> eVar);

    g<i0> i();

    Object j(e<? super i<? extends dx.b, CertKeyPair>> eVar);

    Object k(rq0.b bVar, e<? super i<? extends dx.b, Boolean>> eVar);
}
