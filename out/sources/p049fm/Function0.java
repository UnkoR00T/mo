package p049fm;

import er.a;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: renamed from: fm.r5, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "b", "(Lm2/r;I)Ler/a;", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class Function0 {
    public static final a<i0> b(r rVar, int i15) {
        if (t.k()) {
            t.o(1516905133, i15, -1, "com.google.maps.android.compose.rememberReattachClickListenersHandle (ReattachClickListeners.kt:16)");
        }
        final g1 g1Var = (g1) rVar.l();
        boolean zW = rVar.W(g1Var);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new a() { // from class: fm.q5
                @Override // er.a
                public final Object a() {
                    return Function0.c(g1Var);
                }
            };
            rVar.v(objE);
        }
        a<i0> aVar = (a) objE;
        if (t.k()) {
            t.n();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(g1 g1Var) {
        g1Var.J();
        return i0.f148189a;
    }
}
