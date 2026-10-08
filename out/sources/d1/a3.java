package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lf3/m;", "Lc5/h;", "start", "top", "end", "bottom", "q", "(Lf3/m;FFFF)Lf3/m;", "horizontal", "vertical", "o", "(Lf3/m;FF)Lf3/m;", "all", "n", "(Lf3/m;F)Lf3/m;", "Ld1/d3;", "paddingValues", "l", "(Lf3/m;Ld1/d3;)Lf3/m;", "Lc5/t;", "layoutDirection", "k", "(Ld1/d3;Lc5/t;)F", "j", "e", "(F)Ld1/d3;", "f", "(FF)Ld1/d3;", "h", "(FFFF)Ld1/d3;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a3 {
    public static final d3 e(float f15) {
        return new PaddingValues(f15, f15, f15, f15, null);
    }

    public static final d3 f(float f15, float f16) {
        return new PaddingValues(f15, f16, f15, f16, null);
    }

    public static /* synthetic */ d3 g(float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.n(0);
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.n(0);
        }
        return f(f15, f16);
    }

    public static final d3 h(float f15, float f16, float f17, float f18) {
        return new PaddingValues(f15, f16, f17, f18, null);
    }

    public static /* synthetic */ d3 i(float f15, float f16, float f17, float f18, int i15, Object obj) {
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
        return h(f15, f16, f17, f18);
    }

    public static final float j(d3 d3Var, c5.t tVar) {
        return tVar == c5.t.Ltr ? d3Var.b(tVar) : d3Var.c(tVar);
    }

    public static final float k(d3 d3Var, c5.t tVar) {
        return tVar == c5.t.Ltr ? d3Var.c(tVar) : d3Var.b(tVar);
    }

    public static final f3.m l(f3.m mVar, final d3 d3Var) {
        return mVar.u(new e3(d3Var, new er.l() { // from class: d1.w2
            @Override // er.l
            public final Object b(Object obj) {
                return a3.m(d3Var, (androidx.compose.ui.platform.v1) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d3 d3Var, androidx.compose.ui.platform.v1 v1Var) {
        v1Var.b("padding");
        v1Var.getProperties().b("paddingValues", d3Var);
        return oq.i0.f148189a;
    }

    public static final f3.m n(f3.m mVar, final float f15) {
        return mVar.u(new v2(f15, f15, f15, f15, true, new er.l() { // from class: d1.x2
            @Override // er.l
            public final Object b(Object obj) {
                return a3.s(f15, (androidx.compose.ui.platform.v1) obj);
            }
        }, null));
    }

    public static final f3.m o(f3.m mVar, final float f15, final float f16) {
        return mVar.u(new v2(f15, f16, f15, f16, true, new er.l() { // from class: d1.z2
            @Override // er.l
            public final Object b(Object obj) {
                return a3.t(f15, f16, (androidx.compose.ui.platform.v1) obj);
            }
        }, null));
    }

    public static /* synthetic */ f3.m p(f3.m mVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.n(0);
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.n(0);
        }
        return o(mVar, f15, f16);
    }

    public static final f3.m q(f3.m mVar, final float f15, final float f16, final float f17, final float f18) {
        return mVar.u(new v2(f15, f16, f17, f18, true, new er.l() { // from class: d1.y2
            @Override // er.l
            public final Object b(Object obj) {
                return a3.u(f15, f16, f17, f18, (androidx.compose.ui.platform.v1) obj);
            }
        }, null));
    }

    public static /* synthetic */ f3.m r(f3.m mVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
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
        return q(mVar, f15, f16, f17, f18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(float f15, androidx.compose.ui.platform.v1 v1Var) {
        v1Var.b("padding");
        v1Var.c(c5.h.j(f15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(float f15, float f16, androidx.compose.ui.platform.v1 v1Var) {
        v1Var.b("padding");
        v1Var.getProperties().b("horizontal", c5.h.j(f15));
        v1Var.getProperties().b("vertical", c5.h.j(f16));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(float f15, float f16, float f17, float f18, androidx.compose.ui.platform.v1 v1Var) {
        v1Var.b("padding");
        v1Var.getProperties().b("start", c5.h.j(f15));
        v1Var.getProperties().b("top", c5.h.j(f16));
        v1Var.getProperties().b("end", c5.h.j(f17));
        v1Var.getProperties().b("bottom", c5.h.j(f18));
        return oq.i0.f148189a;
    }
}
