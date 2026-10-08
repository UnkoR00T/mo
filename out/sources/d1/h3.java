package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Ld1/h3;", "Lg4/z;", "Lf3/m$c;", "Ld1/d3;", "paddingValues", "<init>", "(Ld1/d3;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Ld1/d3;", "getPaddingValues", "()Ld1/d3;", "p3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h3 extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private d3 paddingValues;

    public h3(d3 d3Var) {
        this.paddingValues = d3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o3(p036e4.a2 a2Var, int i15, int i16, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, i15, i16, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        float fC = this.paddingValues.c(y0Var.getLayoutDirection());
        float top = this.paddingValues.getTop();
        float fB = this.paddingValues.b(y0Var.getLayoutDirection());
        float bottom = this.paddingValues.getBottom();
        float f15 = 0;
        if (!((c5.h.l(bottom, c5.h.n(f15)) >= 0) & (c5.h.l(fC, c5.h.n(f15)) >= 0) & (c5.h.l(top, c5.h.n(f15)) >= 0) & (c5.h.l(fB, c5.h.n(f15)) >= 0))) {
            e1.a.a("Padding must be non-negative");
        }
        final int iX0 = y0Var.X0(fC);
        int iX1 = y0Var.X0(fB) + iX0;
        final int iX2 = y0Var.X0(top);
        int iX3 = y0Var.X0(bottom) + iX2;
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.c.i(j15, -iX1, -iX3));
        return p036e4.y0.j2(y0Var, c5.c.g(j15, a2VarO0.getWidth() + iX1), c5.c.f(j15, a2VarO0.getHeight() + iX3), null, new er.l() { // from class: d1.g3
            @Override // er.l
            public final Object b(Object obj) {
                return h3.o3(a2VarO0, iX0, iX2, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(d3 d3Var) {
        this.paddingValues = d3Var;
    }
}
