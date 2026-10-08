package w0;

import androidx.compose.foundation.ScrollingLayoutElement;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "initial", "Lw0/f3;", "b", "(ILm2/r;II)Lw0/f3;", "Lf3/m;", "state", "", "enabled", "Lz0/e1;", "flingBehavior", "reverseScrolling", "f", "(Lf3/m;Lw0/f3;ZLz0/e1;Z)Lf3/m;", "isScrollable", "isVertical", "useLocalOverscrollFactory", "Lw0/g2;", "overscrollEffect", "d", "(Lf3/m;Lw0/f3;ZLz0/e1;ZZZLw0/g2;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u2 {
    public static final f3 b(final int i15, p076m2.r rVar, int i16, int i17) {
        boolean z15 = true;
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-1464256199, i16, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Object[] objArr = new Object[0];
        b3.x<f3, ?> xVarA = f3.INSTANCE.a();
        if ((((i16 & 14) ^ 6) <= 4 || !rVar.c(i15)) && (i16 & 6) != 4) {
            z15 = false;
        }
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: w0.t2
                @Override // er.a
                public final Object a() {
                    return u2.c(i15);
                }
            };
            rVar.v(objE);
        }
        f3 f3Var = (f3) b3.f.i(objArr, xVarA, (er.a) objE, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3 c(int i15) {
        return new f3(i15);
    }

    private static final f3.m d(f3.m mVar, f3 f3Var, boolean z15, p143z0.e1 e1Var, boolean z16, boolean z17, boolean z18, g2 g2Var) {
        p143z0.a2 a2Var = z17 ? p143z0.a2.Vertical : p143z0.a2.Horizontal;
        return (z18 ? h3.d(mVar, f3Var, a2Var, z16, z15, e1Var, f3Var.getInternalInteractionSource(), null, 64, null) : h3.c(mVar, f3Var, a2Var, g2Var, z16, z15, e1Var, f3Var.getInternalInteractionSource(), null, 128, null)).u(new ScrollingLayoutElement(f3Var, z15, z17));
    }

    static /* synthetic */ f3.m e(f3.m mVar, f3 f3Var, boolean z15, p143z0.e1 e1Var, boolean z16, boolean z17, boolean z18, g2 g2Var, int i15, Object obj) {
        return d(mVar, f3Var, z15, e1Var, z16, z17, z18, (i15 & 64) != 0 ? null : g2Var);
    }

    public static final f3.m f(f3.m mVar, f3 f3Var, boolean z15, p143z0.e1 e1Var, boolean z16) {
        return e(mVar, f3Var, z16, e1Var, z15, true, true, null, 64, null);
    }

    public static /* synthetic */ f3.m g(f3.m mVar, f3 f3Var, boolean z15, p143z0.e1 e1Var, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        if ((i15 & 4) != 0) {
            e1Var = null;
        }
        if ((i15 & 8) != 0) {
            z16 = false;
        }
        return f(mVar, f3Var, z15, e1Var, z16);
    }
}
