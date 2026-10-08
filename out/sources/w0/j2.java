package w0;

import p071kotlin.Metadata;
import p076m2.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lw0/g2;", "d", "(Lm2/r;I)Lw0/g2;", "Lm2/b4;", "Lw0/h2;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "LocalOverscrollFactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<h2> f208971a = p076m2.d0.i(new er.l() { // from class: w0.i2
        @Override // er.l
        public final Object b(Object obj) {
            return j2.b((p076m2.a0) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 b(p076m2.a0 a0Var) {
        return f.b(a0Var);
    }

    public static final b4<h2> c() {
        return f208971a;
    }

    public static final g2 d(p076m2.r rVar, int i15) {
        rVar.X(282942128);
        if (p076m2.t.k()) {
            p076m2.t.o(282942128, i15, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:343)");
        }
        h2 h2Var = (h2) rVar.N(f208971a);
        if (h2Var == null) {
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return null;
        }
        boolean zW = rVar.W(h2Var);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = h2Var.a();
            rVar.v(objE);
        }
        g2 g2Var = (g2) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return g2Var;
    }
}
