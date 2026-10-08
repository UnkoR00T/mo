package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import j6.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f11869t = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f11872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f11873d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11877h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f11882n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f11883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f11884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11886s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0255a f11870a = new C0255a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f11871b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f11874e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f11875f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f11878j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f11879k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f11880l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0255a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f11889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f11890d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f11896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f11897k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f11891e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f11895i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f11892f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11893g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f11894h = 0;

        C0255a() {
        }

        private float e(long j15) {
            long j16 = this.f11891e;
            if (j15 < j16) {
                return 0.0f;
            }
            long j17 = this.f11895i;
            if (j17 < 0 || j15 < j17) {
                return a.e((j15 - j16) / this.f11887a, 0.0f, 1.0f) * 0.5f;
            }
            float f15 = this.f11896j;
            return (1.0f - f15) + (f15 * a.e((j15 - j17) / this.f11897k, 0.0f, 1.0f));
        }

        private float g(float f15) {
            return ((-4.0f) * f15 * f15) + (f15 * 4.0f);
        }

        public void a() {
            if (this.f11892f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j15 = jCurrentAnimationTimeMillis - this.f11892f;
            this.f11892f = jCurrentAnimationTimeMillis;
            float f15 = j15 * fG;
            this.f11893g = (int) (this.f11889c * f15);
            this.f11894h = (int) (f15 * this.f11890d);
        }

        public int b() {
            return this.f11893g;
        }

        public int c() {
            return this.f11894h;
        }

        public int d() {
            float f15 = this.f11889c;
            return (int) (f15 / Math.abs(f15));
        }

        public int f() {
            float f15 = this.f11890d;
            return (int) (f15 / Math.abs(f15));
        }

        public boolean h() {
            return this.f11895i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f11895i + ((long) this.f11897k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11897k = a.f((int) (jCurrentAnimationTimeMillis - this.f11891e), 0, this.f11888b);
            this.f11896j = e(jCurrentAnimationTimeMillis);
            this.f11895i = jCurrentAnimationTimeMillis;
        }

        public void j(int i15) {
            this.f11888b = i15;
        }

        public void k(int i15) {
            this.f11887a = i15;
        }

        public void l(float f15, float f16) {
            this.f11889c = f15;
            this.f11890d = f16;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11891e = jCurrentAnimationTimeMillis;
            this.f11895i = -1L;
            this.f11892f = jCurrentAnimationTimeMillis;
            this.f11896j = 0.5f;
            this.f11893g = 0;
            this.f11894h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f11884q) {
                if (aVar.f11882n) {
                    aVar.f11882n = false;
                    aVar.f11870a.m();
                }
                C0255a c0255a = a.this.f11870a;
                if (c0255a.h() || !a.this.u()) {
                    a.this.f11884q = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f11883p) {
                    aVar2.f11883p = false;
                    aVar2.c();
                }
                c0255a.a();
                a.this.j(c0255a.b(), c0255a.c());
                l0.Z(a.this.f11872c, this);
            }
        }
    }

    public a(View view) {
        this.f11872c = view;
        float f15 = Resources.getSystem().getDisplayMetrics().density;
        float f16 = (int) ((1575.0f * f15) + 0.5f);
        o(f16, f16);
        float f17 = (int) ((f15 * 315.0f) + 0.5f);
        p(f17, f17);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f11869t);
        r(500);
        q(500);
    }

    private float d(int i15, float f15, float f16, float f17) {
        float fH = h(this.f11874e[i15], f16, this.f11875f[i15], f15);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f18 = this.f11878j[i15];
        float f19 = this.f11879k[i15];
        float f25 = this.f11880l[i15];
        float f26 = f18 * f17;
        return fH > 0.0f ? e(fH * f26, f19, f25) : -e((-fH) * f26, f19, f25);
    }

    static float e(float f15, float f16, float f17) {
        if (f15 > f17) {
            return f17;
        }
        return f15 < f16 ? f16 : f15;
    }

    static int f(int i15, int i16, int i17) {
        if (i15 > i17) {
            return i17;
        }
        return i15 < i16 ? i16 : i15;
    }

    private float g(float f15, float f16) {
        if (f16 == 0.0f) {
            return 0.0f;
        }
        int i15 = this.f11876g;
        if (i15 == 0 || i15 == 1) {
            if (f15 < f16) {
                if (f15 >= 0.0f) {
                    return 1.0f - (f15 / f16);
                }
                if (this.f11884q && i15 == 1) {
                    return 1.0f;
                }
            }
        } else if (i15 == 2 && f15 < 0.0f) {
            return f15 / (-f16);
        }
        return 0.0f;
    }

    private float h(float f15, float f16, float f17, float f18) {
        float interpolation;
        float fE = e(f15 * f16, 0.0f, f17);
        float fG = g(f16 - f18, fE) - g(f18, fE);
        if (fG < 0.0f) {
            interpolation = -this.f11871b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f11871b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f11882n) {
            this.f11884q = false;
        } else {
            this.f11870a.i();
        }
    }

    private void v() {
        int i15;
        if (this.f11873d == null) {
            this.f11873d = new b();
        }
        this.f11884q = true;
        this.f11882n = true;
        if (this.f11881m || (i15 = this.f11877h) <= 0) {
            this.f11873d.run();
        } else {
            l0.a0(this.f11872c, this.f11873d, i15);
        }
        this.f11881m = true;
    }

    public abstract boolean a(int i15);

    public abstract boolean b(int i15);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f11872c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i15, int i16);

    public a k(int i15) {
        this.f11877h = i15;
        return this;
    }

    public a l(int i15) {
        this.f11876g = i15;
        return this;
    }

    public a m(boolean z15) {
        if (this.f11885r && !z15) {
            i();
        }
        this.f11885r = z15;
        return this;
    }

    public a n(float f15, float f16) {
        float[] fArr = this.f11875f;
        fArr[0] = f15;
        fArr[1] = f16;
        return this;
    }

    public a o(float f15, float f16) {
        float[] fArr = this.f11880l;
        fArr[0] = f15 / 1000.0f;
        fArr[1] = f16 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f11885r) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f11886s && this.f11884q;
        }
        this.f11883p = true;
        this.f11881m = false;
        this.f11870a.l(d(0, motionEvent.getX(), view.getWidth(), this.f11872c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f11872c.getHeight()));
        if (!this.f11884q && u()) {
            v();
        }
        if (this.f11886s) {
        }
    }

    public a p(float f15, float f16) {
        float[] fArr = this.f11879k;
        fArr[0] = f15 / 1000.0f;
        fArr[1] = f16 / 1000.0f;
        return this;
    }

    public a q(int i15) {
        this.f11870a.j(i15);
        return this;
    }

    public a r(int i15) {
        this.f11870a.k(i15);
        return this;
    }

    public a s(float f15, float f16) {
        float[] fArr = this.f11874e;
        fArr[0] = f15;
        fArr[1] = f16;
        return this;
    }

    public a t(float f15, float f16) {
        float[] fArr = this.f11878j;
        fArr[0] = f15 / 1000.0f;
        fArr[1] = f16 / 1000.0f;
        return this;
    }

    boolean u() {
        C0255a c0255a = this.f11870a;
        int iF = c0255a.f();
        int iD = c0255a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
