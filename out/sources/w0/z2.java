package w0;

import n4.ScrollAxisRange;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b\b\u0010*\"\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lw0/z2;", "Lg4/z;", "Lg4/i1;", "Lf3/m$c;", "Lw0/f3;", "state", "", "reverseScrolling", "isVertical", "<init>", "(Lw0/f3;ZZ)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "k", "O", "Ln4/i0;", "Loq/i0;", "E2", "(Ln4/i0;)V", "r", "Lw0/f3;", "getState", "()Lw0/f3;", "w3", "(Lw0/f3;)V", "s", "Z", "getReverseScrolling", "()Z", "v3", "(Z)V", "t", "x3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z2 extends f3.m.c implements g4.z, g4.i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private f3 state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    public z2(f3 f3Var, boolean z15, boolean z16) {
        this.state = f3Var;
        this.reverseScrolling = z15;
        this.isVertical = z16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r3(z2 z2Var) {
        return z2Var.state.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float s3(z2 z2Var) {
        return z2Var.state.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t3(z2 z2Var, int i15, final p036e4.a2 a2Var, e4.a2.a aVar) {
        int iU = z2Var.state.u();
        if (iU < 0) {
            iU = 0;
        }
        if (iU > i15) {
            iU = i15;
        }
        int i16 = z2Var.reverseScrolling ? iU - i15 : -iU;
        boolean z15 = z2Var.isVertical;
        final int i17 = z15 ? 0 : i16;
        final int i18 = z15 ? i16 : 0;
        aVar.r0(new er.l() { // from class: w0.y2
            @Override // er.l
            public final Object b(Object obj) {
                return z2.u3(a2Var, i17, i18, (e4.a2.a) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u3(p036e4.a2 a2Var, int i15, int i16, e4.a2.a aVar) {
        e4.a2.a.R(aVar, a2Var, i15, i16, 0.0f, null, 12, null);
        return oq.i0.f148189a;
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new er.a() { // from class: w0.w2
            @Override // er.a
            public final Object a() {
                return Float.valueOf(z2.r3(this.f209100a));
            }
        }, new er.a() { // from class: w0.x2
            @Override // er.a
            public final Object a() {
                return Float.valueOf(z2.s3(this.f209112a));
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            n4.f0.J0(i0Var, scrollAxisRange);
        } else {
            n4.f0.j0(i0Var, scrollAxisRange);
        }
    }

    @Override // g4.z
    public int H(p036e4.w wVar, p036e4.v vVar, int i15) {
        if (!this.isVertical) {
            i15 = Integer.MAX_VALUE;
        }
        return vVar.U(i15);
    }

    @Override // g4.z
    public int K(p036e4.w wVar, p036e4.v vVar, int i15) {
        if (this.isVertical) {
            i15 = Integer.MAX_VALUE;
        }
        return vVar.e0(i15);
    }

    @Override // g4.z
    public int O(p036e4.w wVar, p036e4.v vVar, int i15) {
        if (!this.isVertical) {
            i15 = Integer.MAX_VALUE;
        }
        return vVar.n(i15);
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        a0.a(j15, this.isVertical ? p143z0.a2.Vertical : p143z0.a2.Horizontal);
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.b.d(j15, 0, this.isVertical ? c5.b.l(j15) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : c5.b.k(j15), 5, null));
        int iJ = lr.m.j(a2VarO0.getWidth(), c5.b.l(j15));
        int iJ2 = lr.m.j(a2VarO0.getHeight(), c5.b.k(j15));
        final int height = a2VarO0.getHeight() - iJ2;
        int width = a2VarO0.getWidth() - iJ;
        if (!this.isVertical) {
            height = width;
        }
        this.state.y(height);
        this.state.A(this.isVertical ? iJ2 : iJ);
        this.state.x(this.isVertical ? a2VarO0.getHeight() : a2VarO0.getWidth());
        return p036e4.y0.j2(y0Var, iJ, iJ2, null, new er.l() { // from class: w0.v2
            @Override // er.l
            public final Object b(Object obj) {
                return z2.t3(this.f209093a, height, a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    @Override // g4.z
    public int k(p036e4.w wVar, p036e4.v vVar, int i15) {
        if (this.isVertical) {
            i15 = Integer.MAX_VALUE;
        }
        return vVar.m0(i15);
    }

    public final void v3(boolean z15) {
        this.reverseScrolling = z15;
    }

    public final void w3(f3 f3Var) {
        this.state = f3Var;
    }

    public final void x3(boolean z15) {
        this.isVertical = z15;
    }
}
