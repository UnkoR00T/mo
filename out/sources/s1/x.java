package s1;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f177383a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.s<q1.g, u1.j, er.a<? extends p036e4.b0>, p076m2.r, Integer, oq.i0> f177384b = y2.m.b(129995601, false, new er.s() { // from class: s1.u
        @Override // er.s
        public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return x.f((q1.g) obj, (u1.j) obj2, (er.a) obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.s<q1.g, u1.j, er.a<? extends p036e4.b0>, p076m2.r, Integer, oq.i0> f177385c = y2.m.b(636288403, false, new er.s() { // from class: s1.v
        @Override // er.s
        public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return x.g((q1.g) obj, (u1.j) obj2, (er.a) obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static er.s<q1.g, u1.j, er.a<? extends p036e4.b0>, p076m2.r, Integer, oq.i0> f177386d = y2.m.b(-1357803046, false, new er.s() { // from class: s1.w
        @Override // er.s
        public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return x.h((q1.g) obj, (u1.j) obj2, (er.a) obj3, (p076m2.r) obj4, ((Integer) obj5).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(q1.g gVar, u1.j jVar, er.a aVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(gVar) : rVar.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVar.W(jVar) : rVar.G(jVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVar.G(aVar) ? 256 : 128;
        }
        if (rVar.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(129995601, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:75)");
            }
            j0.t(gVar, jVar, aVar, rVar, i16 & 1022);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(q1.g gVar, u1.j jVar, er.a aVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(gVar) : rVar.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVar.W(jVar) : rVar.G(jVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVar.G(aVar) ? 256 : 128;
        }
        if (rVar.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(636288403, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            j0.t(gVar, jVar, aVar, rVar, i16 & 1022);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(q1.g gVar, u1.j jVar, er.a aVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(gVar) : rVar.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVar.W(jVar) : rVar.G(jVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVar.G(aVar) ? 256 : 128;
        }
        if (rVar.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1357803046, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:99)");
            }
            j0.t(gVar, jVar, aVar, rVar, i16 & 1022);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.s<q1.g, u1.j, er.a<? extends p036e4.b0>, p076m2.r, Integer, oq.i0> d() {
        return f177386d;
    }

    public final er.s<q1.g, u1.j, er.a<? extends p036e4.b0>, p076m2.r, Integer, oq.i0> e() {
        return f177385c;
    }
}
