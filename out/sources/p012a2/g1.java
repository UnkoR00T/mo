package p012a2;

import er.p;
import er.q;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f1556a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<i4, r, Integer, i0> f1557b = m.b(937349512, false, new q() { // from class: a2.d1
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return g1.h((i4) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p<r, Integer, i0> f1558c = m.b(-505419337, false, new p() { // from class: a2.e1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return g1.i((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p<r, Integer, i0> f1559d = m.b(687232378, false, new p() { // from class: a2.f1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return g1.g((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(687232378, i15, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$687232378.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i4 i4Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(i4Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(937349512, i15, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$937349512.<anonymous> (BottomSheetScaffold.kt:324)");
            }
            h4.r(i4Var, null, null, rVar, i15 & 14, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-505419337, i15, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$-505419337.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> d() {
        return f1558c;
    }

    public final p<r, Integer, i0> e() {
        return f1559d;
    }

    public final q<i4, r, Integer, i0> f() {
        return f1557b;
    }
}
