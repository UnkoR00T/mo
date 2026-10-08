package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public class l extends RecyclerView.a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    protected PointF f13397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f13398l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f13400n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f13395i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f13396j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f13399m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f13401o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f13402p = 0;

    @SuppressLint({"UnknownNullness"})
    public l(Context context) {
        this.f13398l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f13399m) {
            this.f13400n = v(this.f13398l);
            this.f13399m = true;
        }
        return this.f13400n;
    }

    private int y(int i15, int i16) {
        int i17 = i15 - i16;
        if (i15 * i17 <= 0) {
            return 0;
        }
        return i17;
    }

    protected int B() {
        PointF pointF = this.f13397k;
        if (pointF == null) {
            return 0;
        }
        float f15 = pointF.y;
        if (f15 == 0.0f) {
            return 0;
        }
        return f15 > 0.0f ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    protected void C(RecyclerView.a0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f13397k = pointFA;
        this.f13401o = (int) (pointFA.x * 10000.0f);
        this.f13402p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f13401o * 1.2f), (int) (this.f13402p * 1.2f), (int) (x(10000) * 1.2f), this.f13395i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    protected void l(int i15, int i16, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f13401o = y(this.f13401o, i15);
        int iY = y(this.f13402p, i16);
        this.f13402p = iY;
        if (this.f13401o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    protected void n() {
        this.f13402p = 0;
        this.f13401o = 0;
        this.f13397k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f13396j);
        }
    }

    public int s(int i15, int i16, int i17, int i18, int i19) {
        if (i19 == -1) {
            return i17 - i15;
        }
        if (i19 != 0) {
            if (i19 == 1) {
                return i18 - i16;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i25 = i17 - i15;
        if (i25 > 0) {
            return i25;
        }
        int i26 = i18 - i16;
        if (i26 < 0) {
            return i26;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i15) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.p()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.V(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.i0(), pVarE.s0() - pVarE.j0(), i15);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i15) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.q()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.Z(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.T(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.k0(), pVarE.b0() - pVarE.h0(), i15);
    }

    @SuppressLint({"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i15) {
        return (int) Math.ceil(((double) x(i15)) / 0.3356d);
    }

    protected int x(int i15) {
        return (int) Math.ceil(Math.abs(i15) * A());
    }

    protected int z() {
        PointF pointF = this.f13397k;
        if (pointF == null) {
            return 0;
        }
        float f15 = pointF.x;
        if (f15 == 0.0f) {
            return 0;
        }
        return f15 > 0.0f ? 1 : -1;
    }
}
