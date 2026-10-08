package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00192\b\b\u0002\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001f"}, d2 = {"Ld1/c4;", "insets", "i", "(Ld1/c4;Ld1/c4;)Ld1/c4;", "g", "Ld1/u4;", "sides", "h", "(Ld1/c4;I)Ld1/c4;", "Ld1/d3;", "f", "(Ld1/c4;Lm2/r;I)Ld1/d3;", "Lc5/d;", "density", "e", "(Ld1/c4;Lc5/d;)Ld1/d3;", "a", "()Ld1/c4;", "", "left", "top", "right", "bottom", "b", "(IIII)Ld1/c4;", "Lc5/h;", "c", "(FFFF)Ld1/c4;", "Ld1/q0;", "Ld1/q0;", "EmptyWindowInsets", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Insets f39135a = new Insets(0, 0, 0, 0);

    public static final c4 a() {
        return f39135a;
    }

    public static final c4 b(int i15, int i16, int i17, int i18) {
        return new Insets(i15, i16, i17, i18);
    }

    public static final c4 c(float f15, float f16, float f17, float f18) {
        return new Insets(f15, f16, f17, f18, null);
    }

    public static /* synthetic */ c4 d(float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.n(0);
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.n(0);
        }
        if ((i15 & 4) != 0) {
            f17 = c5.h.n(0);
        }
        if ((i15 & 8) != 0) {
            f18 = c5.h.n(0);
        }
        return c(f15, f16, f17, f18);
    }

    public static final d3 e(c4 c4Var, c5.d dVar) {
        return new InsetsPaddingValues(c4Var, dVar);
    }

    public static final d3 f(c4 c4Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1485016250, i15, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:221)");
        }
        InsetsPaddingValues w1Var = new InsetsPaddingValues(c4Var, (c5.d) rVar.N(androidx.compose.ui.platform.g1.f()));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return w1Var;
    }

    public static final c4 g(c4 c4Var, c4 c4Var2) {
        return new o0(c4Var, c4Var2);
    }

    public static final c4 h(c4 c4Var, int i15) {
        return new k2(c4Var, i15, null);
    }

    public static final c4 i(c4 c4Var, c4 c4Var2) {
        return new w3(c4Var, c4Var2);
    }
}
