package p076m2;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f122991a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f122992b = m.b(954879418, false, new p() { // from class: m2.j
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l.f((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p<r, Integer, i0> f122993c = m.b(1918065384, false, new p() { // from class: m2.k
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l.e((r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1918065384, i15, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:917)");
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
    public static final i0 f(r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(954879418, i15, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:680)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final p<r, Integer, i0> c() {
        return f122993c;
    }

    public final p<r, Integer, i0> d() {
        return f122992b;
    }
}
