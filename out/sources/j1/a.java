package j1;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lj1/a;", "", "Lm3/g;", "rect", "Loq/i0;", "b", "(Lm3/g;Ltq/e;)Ljava/lang/Object;", "Lj1/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object a(a aVar, m3.g gVar, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i15 & 1) != 0) {
            gVar = null;
        }
        return aVar.b(gVar, eVar);
    }

    Object b(m3.g gVar, tq.e<? super i0> eVar);
}
