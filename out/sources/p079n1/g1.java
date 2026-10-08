package p079n1;

import er.p;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f130036a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<p<? super r, ? super Integer, i0>, r, Integer, i0> f130037b = m.b(559628295, false, new q() { // from class: n1.f1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return g1.c((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(p pVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(pVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(559628295, i15, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:206)");
            }
            pVar.B(rVar, Integer.valueOf(i15 & 14));
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<p<? super r, ? super Integer, i0>, r, Integer, i0> b() {
        return f130037b;
    }
}
