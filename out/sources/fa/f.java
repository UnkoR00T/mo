package fa;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f60376a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<er.p<? super p076m2.r, ? super Integer, i0>, p076m2.r, Integer, i0> f60377b = y2.m.b(-51699941, false, new er.q() { // from class: fa.e
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.c((er.p) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(er.p pVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(pVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-51699941, i15, -1, "androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt.lambda$-51699941.<anonymous> (SceneSetupNavEntryDecorator.kt:74)");
            }
            pVar.B(rVar, Integer.valueOf(i15 & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<er.p<? super p076m2.r, ? super Integer, i0>, p076m2.r, Integer, i0> b() {
        return f60377b;
    }
}
