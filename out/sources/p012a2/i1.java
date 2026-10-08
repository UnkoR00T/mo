package p012a2;

import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f1696a = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<v3, r, Integer, i0> f1697b = m.b(1890101041, false, new q() { // from class: a2.h1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return i1.c((v3) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(v3 v3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVar.W(v3Var) : rVar.G(v3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1890101041, i16, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda$1890101041.<anonymous> (SnackbarHost.kt:154)");
            }
            w4.r(v3Var, null, false, null, 0L, 0L, 0L, 0.0f, rVar, i16 & 14, 254);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<v3, r, Integer, i0> b() {
        return f1697b;
    }
}
