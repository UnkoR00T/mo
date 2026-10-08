package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import j6.l0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
class i extends RecyclerView.o implements RecyclerView.t {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f13342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f13343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f13346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f13347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f13350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f13351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f13352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f13353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f13354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f13355p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f13358s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f13365z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13356q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13357r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13359t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f13360u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f13361v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13362w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f13363x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f13364y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.q(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i15, int i16) {
            i.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f13368a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13368a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13368a) {
                this.f13368a = false;
                return;
            }
            if (((Float) i.this.f13365z.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.A = 0;
                iVar.y(0);
            } else {
                i iVar2 = i.this;
                iVar2.A = 2;
                iVar2.v();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f13342c.setAlpha(iFloatValue);
            i.this.f13343d.setAlpha(iFloatValue);
            i.this.v();
        }
    }

    i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i15, int i16, int i17) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13365z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f13342c = stateListDrawable;
        this.f13343d = drawable;
        this.f13346g = stateListDrawable2;
        this.f13347h = drawable2;
        this.f13344e = Math.max(i15, stateListDrawable.getIntrinsicWidth());
        this.f13345f = Math.max(i15, drawable.getIntrinsicWidth());
        this.f13348i = Math.max(i15, stateListDrawable2.getIntrinsicWidth());
        this.f13349j = Math.max(i15, drawable2.getIntrinsicWidth());
        this.f13340a = i16;
        this.f13341b = i17;
        stateListDrawable.setAlpha(GF2Field.MASK);
        drawable.setAlpha(GF2Field.MASK);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f15) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f15));
        if (Math.abs(this.f13351l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f13352m, fMax, iArrP, this.f13358s.computeVerticalScrollRange(), this.f13358s.computeVerticalScrollOffset(), this.f13357r);
        if (iX != 0) {
            this.f13358s.scrollBy(0, iX);
        }
        this.f13352m = fMax;
    }

    private void k() {
        this.f13358s.removeCallbacks(this.B);
    }

    private void l() {
        this.f13358s.f1(this);
        this.f13358s.g1(this);
        this.f13358s.h1(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i15 = this.f13357r;
        int i16 = this.f13348i;
        int i17 = i15 - i16;
        int i18 = this.f13354o;
        int i19 = this.f13353n;
        int i25 = i18 - (i19 / 2);
        this.f13346g.setBounds(0, 0, i19, i16);
        this.f13347h.setBounds(0, 0, this.f13356q, this.f13349j);
        canvas.translate(0.0f, i17);
        this.f13347h.draw(canvas);
        canvas.translate(i25, 0.0f);
        this.f13346g.draw(canvas);
        canvas.translate(-i25, -i17);
    }

    private void n(Canvas canvas) {
        int i15 = this.f13356q;
        int i16 = this.f13344e;
        int i17 = i15 - i16;
        int i18 = this.f13351l;
        int i19 = this.f13350k;
        int i25 = i18 - (i19 / 2);
        this.f13342c.setBounds(0, 0, i16, i19);
        this.f13343d.setBounds(0, 0, this.f13345f, this.f13357r);
        if (!s()) {
            canvas.translate(i17, 0.0f);
            this.f13343d.draw(canvas);
            canvas.translate(0.0f, i25);
            this.f13342c.draw(canvas);
            canvas.translate(-i17, -i25);
            return;
        }
        this.f13343d.draw(canvas);
        canvas.translate(this.f13344e, i25);
        canvas.scale(-1.0f, 1.0f);
        this.f13342c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f13344e, -i25);
    }

    private int[] o() {
        int[] iArr = this.f13364y;
        int i15 = this.f13341b;
        iArr[0] = i15;
        iArr[1] = this.f13356q - i15;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f13363x;
        int i15 = this.f13341b;
        iArr[0] = i15;
        iArr[1] = this.f13357r - i15;
        return iArr;
    }

    private void r(float f15) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f15));
        if (Math.abs(this.f13354o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f13355p, fMax, iArrO, this.f13358s.computeHorizontalScrollRange(), this.f13358s.computeHorizontalScrollOffset(), this.f13356q);
        if (iX != 0) {
            this.f13358s.scrollBy(iX, 0);
        }
        this.f13355p = fMax;
    }

    private boolean s() {
        return l0.y(this.f13358s) == 1;
    }

    private void w(int i15) {
        k();
        this.f13358s.postDelayed(this.B, i15);
    }

    private int x(float f15, float f16, int[] iArr, int i15, int i16, int i17) {
        int i18 = iArr[1] - iArr[0];
        if (i18 == 0) {
            return 0;
        }
        int i19 = i15 - i17;
        int i25 = (int) (((f16 - f15) / i18) * i19);
        int i26 = i16 + i25;
        if (i26 >= i19 || i26 < 0) {
            return 0;
        }
        return i25;
    }

    private void z() {
        this.f13358s.j(this);
        this.f13358s.m(this);
        this.f13358s.n(this.C);
    }

    public void A() {
        int i15 = this.A;
        if (i15 != 0) {
            if (i15 != 3) {
                return;
            } else {
                this.f13365z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f13365z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f13365z.setDuration(500L);
        this.f13365z.setStartDelay(0L);
        this.f13365z.start();
    }

    void B(int i15, int i16) {
        int iComputeVerticalScrollRange = this.f13358s.computeVerticalScrollRange();
        int i17 = this.f13357r;
        this.f13359t = iComputeVerticalScrollRange - i17 > 0 && i17 >= this.f13340a;
        int iComputeHorizontalScrollRange = this.f13358s.computeHorizontalScrollRange();
        int i18 = this.f13356q;
        boolean z15 = iComputeHorizontalScrollRange - i18 > 0 && i18 >= this.f13340a;
        this.f13360u = z15;
        boolean z16 = this.f13359t;
        if (!z16 && !z15) {
            if (this.f13361v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z16) {
            float f15 = i17;
            this.f13351l = (int) ((f15 * (i16 + (f15 / 2.0f))) / iComputeVerticalScrollRange);
            this.f13350k = Math.min(i17, (i17 * i17) / iComputeVerticalScrollRange);
        }
        if (this.f13360u) {
            float f16 = i18;
            this.f13354o = (int) ((f16 * (i15 + (f16 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f13353n = Math.min(i18, (i18 * i18) / iComputeHorizontalScrollRange);
        }
        int i19 = this.f13361v;
        if (i19 == 0 || i19 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f13361v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f13362w = 1;
                    this.f13355p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f13362w = 2;
                    this.f13352m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f13361v == 2) {
            this.f13352m = 0.0f;
            this.f13355p = 0.0f;
            y(1);
            this.f13362w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f13361v == 2) {
            A();
            if (this.f13362w == 1) {
                r(motionEvent.getX());
            }
            if (this.f13362w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i15 = this.f13361v;
        if (i15 != 1) {
            return i15 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.f13362w = 1;
            this.f13355p = (int) motionEvent.getX();
        } else if (zU) {
            this.f13362w = 2;
            this.f13352m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z15) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f13356q != this.f13358s.getWidth() || this.f13357r != this.f13358s.getHeight()) {
            this.f13356q = this.f13358s.getWidth();
            this.f13357r = this.f13358s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f13359t) {
                n(canvas);
            }
            if (this.f13360u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13358s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f13358s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i15) {
        int i16 = this.A;
        if (i16 == 1) {
            this.f13365z.cancel();
        } else if (i16 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f13365z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f13365z.setDuration(i15);
        this.f13365z.start();
    }

    boolean t(float f15, float f16) {
        if (f16 < this.f13357r - this.f13348i) {
            return false;
        }
        int i15 = this.f13354o;
        int i16 = this.f13353n;
        return f15 >= ((float) (i15 - (i16 / 2))) && f15 <= ((float) (i15 + (i16 / 2)));
    }

    boolean u(float f15, float f16) {
        if (s()) {
            if (f15 > this.f13344e) {
                return false;
            }
        } else if (f15 < this.f13356q - this.f13344e) {
            return false;
        }
        int i15 = this.f13351l;
        int i16 = this.f13350k;
        return f16 >= ((float) (i15 - (i16 / 2))) && f16 <= ((float) (i15 + (i16 / 2)));
    }

    void v() {
        this.f13358s.invalidate();
    }

    void y(int i15) {
        if (i15 == 2 && this.f13361v != 2) {
            this.f13342c.setState(D);
            k();
        }
        if (i15 == 0) {
            v();
        } else {
            A();
        }
        if (this.f13361v == 2 && i15 != 2) {
            this.f13342c.setState(E);
            w(1200);
        } else if (i15 == 1) {
            w(1500);
        }
        this.f13361v = i15;
    }
}
