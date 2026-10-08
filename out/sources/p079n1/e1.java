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
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f130009a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<p<? super r, ? super Integer, i0>, r, Integer, i0> f130010b = m.b(759698998, false, new q() { // from class: n1.a1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e1.i((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<p<? super r, ? super Integer, i0>, r, Integer, i0> f130011c = m.b(486633673, false, new q() { // from class: n1.b1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e1.h((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q<p<? super r, ? super Integer, i0>, r, Integer, i0> f130012d = m.b(444370233, false, new q() { // from class: n1.c1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e1.g((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static q<p<? super r, ? super Integer, i0>, r, Integer, i0> f130013e = m.b(-665310900, false, new q() { // from class: n1.d1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e1.j((p) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(p pVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(pVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(444370233, i15, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$444370233.<anonymous> (BasicTextField.kt:977)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(p pVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(pVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(486633673, i15, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$486633673.<anonymous> (BasicTextField.kt:933)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(p pVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(pVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(759698998, i15, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$759698998.<anonymous> (BasicTextField.kt:776)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(p pVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(pVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-665310900, i15, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$-665310900.<anonymous> (BasicTextField.kt:1017)");
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

    public final q<p<? super r, ? super Integer, i0>, r, Integer, i0> e() {
        return f130011c;
    }

    public final q<p<? super r, ? super Integer, i0>, r, Integer, i0> f() {
        return f130010b;
    }
}
