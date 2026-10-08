package androidx.compose.ui.graphics.painter;

import c5.t;
import er.l;
import fr.w;
import m3.e;
import m3.g;
import m3.h;
import m3.k;
import n3.h1;
import n3.k2;
import n3.n1;
import n3.o0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u00102\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/painter/a;", "", "<init>", "()V", "Ln3/k2;", "m", "()Ln3/k2;", "Ln3/n1;", "colorFilter", "Loq/i0;", "h", "(Ln3/n1;)V", "", "alpha", "g", "(F)V", "Lc5/t;", "rtl", "i", "(Lc5/t;)V", "Lp3/f;", "n", "(Lp3/f;)V", "", "a", "(F)Z", "b", "(Ln3/n1;)Z", "layoutDirection", "f", "(Lc5/t;)Z", "Lm3/k;", "size", "j", "(Lp3/f;JFLn3/n1;)V", "Ln3/k2;", "layerPaint", "Z", "useLayer", "c", "Ln3/n1;", "d", "F", "e", "Lc5/t;", "Lkotlin/Function1;", "Ler/l;", "drawLambda", "l", "()J", "intrinsicSize", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9956g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k2 layerPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean useLayer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<f, i0> drawLambda = new C0212a();

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0212a extends w implements l<f, i0> {
        C0212a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(f fVar) {
            a.this.n(fVar);
        }
    }

    private final void g(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!a(alpha)) {
            if (alpha == 1.0f) {
                k2 k2Var = this.layerPaint;
                if (k2Var != null) {
                    k2Var.g(alpha);
                }
                this.useLayer = false;
            } else {
                m().g(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void h(n1 colorFilter) {
        if (fr.t.c(this.colorFilter, colorFilter)) {
            return;
        }
        if (!b(colorFilter)) {
            if (colorFilter == null) {
                k2 k2Var = this.layerPaint;
                if (k2Var != null) {
                    k2Var.d(null);
                }
                this.useLayer = false;
            } else {
                m().d(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void i(t rtl) {
        if (this.layoutDirection != rtl) {
            f(rtl);
            this.layoutDirection = rtl;
        }
    }

    public static /* synthetic */ void k(a aVar, f fVar, long j15, float f15, n1 n1Var, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i15 & 2) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i15 & 4) != 0) {
            n1Var = null;
        }
        aVar.j(fVar, j15, f16, n1Var);
    }

    private final k2 m() {
        k2 k2Var = this.layerPaint;
        if (k2Var != null) {
            return k2Var;
        }
        k2 k2VarA = o0.a();
        this.layerPaint = k2VarA;
        return k2VarA;
    }

    protected boolean a(float alpha) {
        return false;
    }

    protected boolean b(n1 colorFilter) {
        return false;
    }

    protected boolean f(t layoutDirection) {
        return false;
    }

    public final void j(f fVar, long j15, float f15, n1 n1Var) {
        g(f15);
        h(n1Var);
        i(fVar.getLayoutDirection());
        int i15 = (int) (j15 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.a() >> 32)) - Float.intBitsToFloat(i15);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax));
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat3 = fIntBitsToFloat2 - Float.intBitsToFloat(i16);
        fVar.getDrawContext().getTransform().j(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat3);
        if (f15 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i15) > 0.0f && Float.intBitsToFloat(i16) > 0.0f) {
                    if (this.useLayer) {
                        long jC = e.INSTANCE.c();
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
                        g gVarC = h.c(jC, k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i16))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32)));
                        h1 h1VarF = fVar.getDrawContext().f();
                        try {
                            h1VarF.v(gVarC, m());
                            n(fVar);
                            h1VarF.j();
                        } catch (Throwable th4) {
                            h1VarF.j();
                            throw th4;
                        }
                    } else {
                        n(fVar);
                    }
                }
            } catch (Throwable th5) {
                fVar.getDrawContext().getTransform().j(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat3);
                throw th5;
            }
        }
        fVar.getDrawContext().getTransform().j(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat3);
    }

    public abstract long l();

    protected abstract void n(f fVar);
}
