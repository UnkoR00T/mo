package p076m2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {i.f37086m, "Lkotlin/Function1;", "Loq/i0;", "content", "b", "(Ler/q;)Ler/q;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q2 {
    public static final <P> q<P, r, Integer, i0> b(q<? super P, ? super r, ? super Integer, i0> qVar) {
        final o2 o2Var = new o2(qVar);
        return m.b(1032736913, true, new q() { // from class: m2.p2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q2.c(o2Var, obj, (r) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(o2 o2Var, Object obj, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(obj) : rVar.G(obj) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1032736913, i15, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
            }
            rVar.o(o2Var, obj);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
