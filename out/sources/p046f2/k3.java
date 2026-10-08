package p046f2;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3 f56525a = new k3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f56526b = m.b(-1568572631, false, new p() { // from class: f2.i3
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return k3.f((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p<r, Integer, i0> f56527c = m.b(412247037, false, new p() { // from class: f2.j3
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return k3.e((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(412247037, i15, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetKt.lambda$412247037.<anonymous> (BottomSheet.kt:199)");
            }
            n0.f56958a.d(null, 0.0f, 0.0f, null, 0L, rVar, 196608, 31);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1568572631, i15, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetKt.lambda$-1568572631.<anonymous> (BottomSheet.kt:123)");
            }
            n0.f56958a.d(null, 0.0f, 0.0f, null, 0L, rVar, 196608, 31);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> c() {
        return f56526b;
    }

    public final p<r, Integer, i0> d() {
        return f56527c;
    }
}
