package td;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private fd.f f189598m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f189590d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f189591e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f189592f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f189593g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f189594h = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f189595j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f189596k = -2.1474836E9f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f189597l = 2.1474836E9f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f189599n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f189600p = false;

    private void O() {
        if (this.f189598m == null) {
            return;
        }
        float f15 = this.f189594h;
        if (f15 < this.f189596k || f15 > this.f189597l) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f189596k), Float.valueOf(this.f189597l), Float.valueOf(this.f189594h)));
        }
    }

    private void m(float f15) {
        if (this.f189600p && this.f189593g == f15) {
            return;
        }
        l();
    }

    private float s() {
        fd.f fVar = this.f189598m;
        if (fVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / fVar.i()) / Math.abs(this.f189590d);
    }

    private boolean x() {
        return w() < 0.0f;
    }

    protected void A() {
        if (isRunning()) {
            F(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void D() {
        F(true);
    }

    protected void F(boolean z15) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z15) {
            this.f189599n = false;
        }
    }

    public void G() {
        this.f189599n = true;
        A();
        this.f189592f = 0L;
        if (x() && q() == v()) {
            J(t());
        } else if (!x() && q() == t()) {
            J(v());
        }
        i();
    }

    public void H() {
        N(-w());
    }

    public void I(fd.f fVar) {
        boolean z15 = this.f189598m == null;
        this.f189598m = fVar;
        if (z15) {
            K(Math.max(this.f189596k, fVar.p()), Math.min(this.f189597l, fVar.f()));
        } else {
            K((int) fVar.p(), (int) fVar.f());
        }
        float f15 = this.f189594h;
        this.f189594h = 0.0f;
        this.f189593g = 0.0f;
        J((int) f15);
        l();
    }

    public void J(float f15) {
        if (this.f189593g == f15) {
            return;
        }
        float fB = j.b(f15, v(), t());
        this.f189593g = fB;
        if (this.f189600p) {
            fB = (float) Math.floor(fB);
        }
        this.f189594h = fB;
        this.f189592f = 0L;
        l();
    }

    public void K(float f15, float f16) {
        if (f15 > f16) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f15), Float.valueOf(f16)));
        }
        fd.f fVar = this.f189598m;
        float fP = fVar == null ? -3.4028235E38f : fVar.p();
        fd.f fVar2 = this.f189598m;
        float f17 = fVar2 == null ? Float.MAX_VALUE : fVar2.f();
        float fB = j.b(f15, fP, f17);
        float fB2 = j.b(f16, fP, f17);
        if (fB == this.f189596k && fB2 == this.f189597l) {
            return;
        }
        this.f189596k = fB;
        this.f189597l = fB2;
        J((int) j.b(this.f189594h, fB, fB2));
    }

    public void N(float f15) {
        this.f189590d = f15;
    }

    @Override // td.a
    void b() {
        super.b();
        c(x());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        D();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j15) {
        A();
        if (this.f189598m == null || !isRunning()) {
            return;
        }
        if (fd.e.h()) {
            fd.e.b("LottieValueAnimator#doFrame");
        }
        long j16 = this.f189592f;
        float fS = (j16 != 0 ? j15 - j16 : 0L) / s();
        float f15 = this.f189593g;
        if (x()) {
            fS = -fS;
        }
        float f16 = f15 + fS;
        boolean zD = j.d(f16, v(), t());
        float f17 = this.f189593g;
        float fB = j.b(f16, v(), t());
        this.f189593g = fB;
        if (this.f189600p) {
            fB = (float) Math.floor(fB);
        }
        this.f189594h = fB;
        this.f189592f = j15;
        if (zD) {
            m(f17);
        } else if (getRepeatCount() == -1 || this.f189595j < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f189591e = !this.f189591e;
                H();
            } else {
                float fT = x() ? t() : v();
                this.f189593g = fT;
                this.f189594h = fT;
            }
            this.f189592f = j15;
            m(f17);
            g();
            this.f189595j++;
        } else {
            float fV = this.f189590d < 0.0f ? v() : t();
            this.f189593g = fV;
            this.f189594h = fV;
            D();
            m(f17);
            c(x());
        }
        O();
        if (fd.e.h()) {
            fd.e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fV;
        float fT;
        float fV2;
        if (this.f189598m == null) {
            return 0.0f;
        }
        if (x()) {
            fV = t() - this.f189594h;
            fT = t();
            fV2 = v();
        } else {
            fV = this.f189594h - v();
            fT = t();
            fV2 = v();
        }
        return fV / (fT - fV2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        fd.f fVar = this.f189598m;
        if (fVar == null) {
            return 0L;
        }
        return (long) fVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f189599n;
    }

    public void n() {
        this.f189598m = null;
        this.f189596k = -2.1474836E9f;
        this.f189597l = 2.1474836E9f;
    }

    public void o() {
        D();
        c(x());
    }

    public float p() {
        fd.f fVar = this.f189598m;
        if (fVar == null) {
            return 0.0f;
        }
        return (this.f189594h - fVar.p()) / (this.f189598m.f() - this.f189598m.p());
    }

    public float q() {
        return this.f189594h;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i15) {
        super.setRepeatMode(i15);
        if (i15 == 2 || !this.f189591e) {
            return;
        }
        this.f189591e = false;
        H();
    }

    public float t() {
        fd.f fVar = this.f189598m;
        if (fVar == null) {
            return 0.0f;
        }
        float f15 = this.f189597l;
        return f15 == 2.1474836E9f ? fVar.f() : f15;
    }

    public float v() {
        fd.f fVar = this.f189598m;
        if (fVar == null) {
            return 0.0f;
        }
        float f15 = this.f189596k;
        return f15 == -2.1474836E9f ? fVar.p() : f15;
    }

    public float w() {
        return this.f189590d;
    }

    public void y() {
        D();
        e();
    }

    public void z() {
        this.f189599n = true;
        j(x());
        J((int) (x() ? t() : v()));
        this.f189592f = 0L;
        this.f189595j = 0;
        A();
    }
}
