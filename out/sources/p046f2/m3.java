package p046f2;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3 f56824a = new m3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f56825b = m.b(1121996006, false, new p() { // from class: f2.l3
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return m3.c((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1121996006, i15, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$1121996006.<anonymous> (ModalBottomSheet.kt:103)");
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

    public final p<r, Integer, i0> b() {
        return f56825b;
    }
}
