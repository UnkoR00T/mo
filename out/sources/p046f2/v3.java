package p046f2;

import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3 f58047a = new v3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<nk, r, Integer, i0> f58048b = m.b(-1548712596, false, new q() { // from class: f2.u3
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return v3.c((nk) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(nk nkVar, r rVar, int i15) {
        nk nkVar2;
        int i16;
        if ((i15 & 6) == 0) {
            nkVar2 = nkVar;
            i16 = i15 | (rVar.W(nkVar2) ? 4 : 2);
        } else {
            nkVar2 = nkVar;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1548712596, i16, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            ul.B(nkVar2, null, false, null, 0L, 0L, 0L, 0L, 0L, rVar, i16 & 14, 510);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<nk, r, Integer, i0> b() {
        return f58048b;
    }
}
