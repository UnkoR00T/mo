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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/i;", "Lg4/z;", "Lf3/m$c;", "Lc5/h;", "minWidth", "minHeight", "<init>", "(FFLfr/k;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "k", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "O", "r", "F", "getMinWidth-D9Ej5fM", "()F", "q3", "(F)V", "s", "getMinHeight-D9Ej5fM", "p3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    public /* synthetic */ i(float f15, float f16, fr.k kVar) {
        this(f15, f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // g4.z
    public int H(w wVar, v vVar, int i15) {
        int iU = vVar.U(i15);
        int iX0 = !Float.isNaN(this.minHeight) ? wVar.X0(this.minHeight) : 0;
        return iU < iX0 ? iX0 : iU;
    }

    @Override // g4.z
    public int K(w wVar, v vVar, int i15) {
        int iE0 = vVar.e0(i15);
        int iX0 = !Float.isNaN(this.minWidth) ? wVar.X0(this.minWidth) : 0;
        return iE0 < iX0 ? iX0 : iE0;
    }

    @Override // g4.z
    public int O(w wVar, v vVar, int i15) {
        int iN = vVar.n(i15);
        int iX0 = !Float.isNaN(this.minHeight) ? wVar.X0(this.minHeight) : 0;
        return iN < iX0 ? iX0 : iN;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        int iN;
        int iM;
        if (Float.isNaN(this.minWidth) || c5.b.n(j15) != 0) {
            iN = c5.b.n(j15);
        } else {
            int iX0 = y0Var.X0(this.minWidth);
            iN = c5.b.l(j15);
            if (iX0 < 0) {
                iX0 = 0;
            }
            if (iX0 <= iN) {
                iN = iX0;
            }
        }
        int iL = c5.b.l(j15);
        if (Float.isNaN(this.minHeight) || c5.b.m(j15) != 0) {
            iM = c5.b.m(j15);
        } else {
            int iX1 = y0Var.X0(this.minHeight);
            iM = c5.b.k(j15);
            int i15 = iX1 >= 0 ? iX1 : 0;
            if (i15 <= iM) {
                iM = i15;
            }
        }
        final a2 a2VarO0 = v0Var.o0(c5.c.a(iN, iL, iM, c5.b.k(j15)));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: androidx.compose.foundation.layout.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.o3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    @Override // g4.z
    public int k(w wVar, v vVar, int i15) {
        int iM0 = vVar.m0(i15);
        int iX0 = !Float.isNaN(this.minWidth) ? wVar.X0(this.minWidth) : 0;
        return iM0 < iX0 ? iX0 : iM0;
    }

    public final void p3(float f15) {
        this.minHeight = f15;
    }

    public final void q3(float f15) {
        this.minWidth = f15;
    }

    private i(float f15, float f16) {
        this.minWidth = f15;
        this.minHeight = f16;
    }
}
