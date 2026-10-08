package w0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lw0/k0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "b", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "e", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "Loq/i0;", "d", "(Landroid/widget/EdgeEffect;I)V", "edgeEffectLength", "Lc5/d;", "density", "a", "(Landroid/widget/EdgeEffect;FFLc5/d;)F", "delta", "f", "(Landroid/widget/EdgeEffect;F)V", "c", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f208985a = new k0();

    private k0() {
    }

    public final float a(EdgeEffect edgeEffect, float f15, float f16, c5.d dVar) {
        if (l0.b(dVar, f15) > c(edgeEffect) * f16) {
            return 0.0f;
        }
        d(edgeEffect, hr.a.d(f15));
        return f15;
    }

    public final EdgeEffect b(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? g.f208910a.a(context, null) : new z0(context);
    }

    public final float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g.f208910a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void d(EdgeEffect edgeEffect, int i15) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i15);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i15);
        }
    }

    public final float e(EdgeEffect edgeEffect, float f15, float f16) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g.f208910a.c(edgeEffect, f15, f16);
        }
        edgeEffect.onPull(f15, f16);
        return f15;
    }

    public final void f(EdgeEffect edgeEffect, float f15) {
        if (edgeEffect instanceof z0) {
            ((z0) edgeEffect).a(f15);
        } else {
            edgeEffect.onRelease();
        }
    }
}
