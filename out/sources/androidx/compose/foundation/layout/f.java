package androidx.compose.foundation.layout;

import f3.m;
import g4.z;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v;
import p036e4.v0;
import p036e4.w;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00106\u001a\u00020\u000f*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Lg4/z;", "Lf3/m$c;", "Lc5/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLfr/k;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "k", "O", "r", "F", "getMinWidth-D9Ej5fM", "()F", "u3", "(F)V", "s", "getMinHeight-D9Ej5fM", "t3", "t", "getMaxWidth-D9Ej5fM", "s3", "v", "getMaxHeight-D9Ej5fM", "r3", "w", "Z", "getEnforceIncoming", "()Z", "q3", "(Z)V", "Lc5/d;", "o3", "(Lc5/d;)J", "targetConstraints", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float maxWidth;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float maxHeight;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    public /* synthetic */ f(float f15, float f16, float f17, float f18, boolean z15, fr.k kVar) {
        this(f15, f16, f17, f18, z15);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    private final long o3(c5.d dVar) {
        int iX0;
        int iX1;
        int iX2;
        int i15 = 0;
        if (Float.isNaN(this.maxWidth)) {
            iX0 = Integer.MAX_VALUE;
        } else {
            iX0 = dVar.X0(this.maxWidth);
            if (iX0 < 0) {
                iX0 = 0;
            }
        }
        if (Float.isNaN(this.maxHeight)) {
            iX1 = Integer.MAX_VALUE;
        } else {
            iX1 = dVar.X0(this.maxHeight);
            if (iX1 < 0) {
                iX1 = 0;
            }
        }
        if (Float.isNaN(this.minWidth)) {
            iX2 = 0;
        } else {
            iX2 = dVar.X0(this.minWidth);
            if (iX2 < 0) {
                iX2 = 0;
            }
            if (iX2 > iX0) {
                iX2 = iX0;
            }
            if (iX2 == Integer.MAX_VALUE) {
                iX2 = 0;
            }
        }
        if (!Float.isNaN(this.minHeight)) {
            int iX3 = dVar.X0(this.minHeight);
            if (iX3 < 0) {
                iX3 = 0;
            }
            if (iX3 > iX1) {
                iX3 = iX1;
            }
            if (iX3 != Integer.MAX_VALUE) {
                i15 = iX3;
            }
        }
        return c5.c.a(iX2, iX0, i15, iX1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p3(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // g4.z
    public int H(w wVar, v vVar, int i15) {
        long jO3 = o3(wVar);
        if (c5.b.i(jO3)) {
            return c5.b.k(jO3);
        }
        if (!this.enforceIncoming) {
            i15 = c5.c.g(jO3, i15);
        }
        return c5.c.f(jO3, vVar.U(i15));
    }

    @Override // g4.z
    public int K(w wVar, v vVar, int i15) {
        long jO3 = o3(wVar);
        if (c5.b.j(jO3)) {
            return c5.b.l(jO3);
        }
        if (!this.enforceIncoming) {
            i15 = c5.c.f(jO3, i15);
        }
        return c5.c.g(jO3, vVar.e0(i15));
    }

    @Override // g4.z
    public int O(w wVar, v vVar, int i15) {
        long jO3 = o3(wVar);
        if (c5.b.i(jO3)) {
            return c5.b.k(jO3);
        }
        if (!this.enforceIncoming) {
            i15 = c5.c.g(jO3, i15);
        }
        return c5.c.f(jO3, vVar.n(i15));
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        int iN;
        int iL;
        int iM;
        int iK;
        long jA;
        long jO3 = o3(y0Var);
        if (this.enforceIncoming) {
            jA = c5.c.e(j15, jO3);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iN = c5.b.n(j15);
                int iL2 = c5.b.l(jO3);
                if (iN > iL2) {
                    iN = iL2;
                }
            } else {
                iN = c5.b.n(jO3);
            }
            if (Float.isNaN(this.maxWidth)) {
                iL = c5.b.l(j15);
                int iN2 = c5.b.n(jO3);
                if (iL < iN2) {
                    iL = iN2;
                }
            } else {
                iL = c5.b.l(jO3);
            }
            if (Float.isNaN(this.minHeight)) {
                iM = c5.b.m(j15);
                int iK2 = c5.b.k(jO3);
                if (iM > iK2) {
                    iM = iK2;
                }
            } else {
                iM = c5.b.m(jO3);
            }
            if (Float.isNaN(this.maxHeight)) {
                iK = c5.b.k(j15);
                int iM2 = c5.b.m(jO3);
                if (iK < iM2) {
                    iK = iM2;
                }
            } else {
                iK = c5.b.k(jO3);
            }
            jA = c5.c.a(iN, iL, iM, iK);
        }
        final a2 a2VarO0 = v0Var.o0(jA);
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: androidx.compose.foundation.layout.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.p3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    @Override // g4.z
    public int k(w wVar, v vVar, int i15) {
        long jO3 = o3(wVar);
        if (c5.b.j(jO3)) {
            return c5.b.l(jO3);
        }
        if (!this.enforceIncoming) {
            i15 = c5.c.f(jO3, i15);
        }
        return c5.c.g(jO3, vVar.m0(i15));
    }

    public final void q3(boolean z15) {
        this.enforceIncoming = z15;
    }

    public final void r3(float f15) {
        this.maxHeight = f15;
    }

    public final void s3(float f15) {
        this.maxWidth = f15;
    }

    public final void t3(float f15) {
        this.minHeight = f15;
    }

    public final void u3(float f15) {
        this.minWidth = f15;
    }

    private f(float f15, float f16, float f17, float f18, boolean z15) {
        this.minWidth = f15;
        this.minHeight = f16;
        this.maxWidth = f17;
        this.maxHeight = f18;
        this.enforceIncoming = z15;
    }
}
