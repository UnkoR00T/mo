package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f35846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f35847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f35850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35852h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<b> f35854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f35855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f35856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f35857n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f35858p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f35859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f35862t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35863v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35864w;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f15, boolean z15);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.f173923r);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f15, float f16) {
        this.f35864w = fj.a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f15, f16) > ((float) h(2)) + q.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f35864w);
        float f15 = width;
        float f16 = iH;
        float fCos = (((float) Math.cos(this.f35862t)) * f16) + f15;
        float f17 = height;
        float fSin = (f16 * ((float) Math.sin(this.f35862t))) + f17;
        this.f35857n.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f35855l, this.f35857n);
        double dSin = Math.sin(this.f35862t);
        double dCos = Math.cos(this.f35862t);
        double d15 = iH - this.f35855l;
        this.f35857n.setStrokeWidth(this.f35859q);
        canvas.drawLine(f15, f17, width + ((int) (dCos * d15)), height + ((int) (d15 * dSin)), this.f35857n);
        canvas.drawCircle(f15, f17, this.f35856m, this.f35857n);
    }

    private int f(float f15, float f16) {
        int degrees = (int) Math.toDegrees(Math.atan2(f16 - (getHeight() / 2), f15 - (getWidth() / 2)));
        int i15 = degrees + 90;
        return i15 < 0 ? degrees + 450 : i15;
    }

    private int h(int i15) {
        return i15 == 2 ? Math.round(this.f35863v * 0.66f) : this.f35863v;
    }

    private Pair<Float, Float> j(float f15) {
        float fG = g();
        if (Math.abs(fG - f15) > 180.0f) {
            if (fG > 180.0f && f15 < 180.0f) {
                f15 += 360.0f;
            }
            if (fG < 180.0f && f15 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fG), Float.valueOf(f15));
    }

    private boolean k(float f15, float f16, boolean z15, boolean z16, boolean z17) {
        float f17 = f(f15, f16);
        boolean z18 = false;
        boolean z19 = g() != f17;
        if (z16 && z19) {
            return true;
        }
        if (!z19 && !z15) {
            return false;
        }
        if (z17 && this.f35848d) {
            z18 = true;
        }
        o(f17, z18);
        return true;
    }

    private void l() {
        this.f35847c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f35870a, valueAnimator);
            }
        });
        this.f35847c.addListener(new a());
    }

    private void p(float f15, boolean z15) {
        float f16 = f15 % 360.0f;
        this.f35860r = f16;
        this.f35862t = Math.toRadians(f16 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f35864w);
        float fCos = width + (((float) Math.cos(this.f35862t)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f35862t)));
        RectF rectF = this.f35858p;
        int i15 = this.f35855l;
        rectF.set(fCos - i15, fSin - i15, fCos + i15, fSin + i15);
        Iterator<b> it = this.f35854k.iterator();
        while (it.hasNext()) {
            it.next().a(f16, z15);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f35854k.add(bVar);
    }

    public RectF e() {
        return this.f35858p;
    }

    public float g() {
        return this.f35860r;
    }

    public int i() {
        return this.f35855l;
    }

    public void m(int i15) {
        this.f35863v = i15;
        invalidate();
    }

    public void n(float f15) {
        o(f15, false);
    }

    public void o(float f15, boolean z15) {
        this.f35847c.cancel();
        if (!z15) {
            p(f15, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f15);
        this.f35847c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f35847c.setDuration(this.f35845a);
        this.f35847c.setInterpolator(this.f35846b);
        this.f35847c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        if (this.f35847c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z15;
        boolean z16;
        boolean z17;
        int actionMasked = motionEvent.getActionMasked();
        float x15 = motionEvent.getX();
        float y15 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f35849e = x15;
            this.f35850f = y15;
            this.f35851g = true;
            this.f35861s = false;
            z15 = true;
            z16 = false;
            z17 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i15 = (int) (x15 - this.f35849e);
            int i16 = (int) (y15 - this.f35850f);
            this.f35851g = (i15 * i15) + (i16 * i16) > this.f35852h;
            z16 = this.f35861s;
            boolean z18 = actionMasked == 1;
            if (this.f35853j) {
                c(x15, y15);
            }
            z17 = z18;
            z15 = false;
        } else {
            z16 = false;
            z15 = false;
            z17 = false;
        }
        this.f35861s |= k(x15, y15, z16, z15, z17);
        return true;
    }

    void q(boolean z15) {
        if (this.f35853j && !z15) {
            this.f35864w = 1;
        }
        this.f35853j = z15;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f35847c = new ValueAnimator();
        this.f35854k = new ArrayList();
        Paint paint = new Paint();
        this.f35857n = paint;
        this.f35858p = new RectF();
        this.f35864w = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f174151h1, i15, k.B);
        this.f35845a = gj.e.f(context, ri.b.f173928w, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        this.f35846b = gj.e.g(context, ri.b.F, si.a.f181917b);
        this.f35863v = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f174167j1, 0);
        this.f35855l = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f174175k1, 0);
        Resources resources = getResources();
        this.f35859q = resources.getDimensionPixelSize(ri.d.D);
        this.f35856m = resources.getDimensionPixelSize(ri.d.B);
        int color = typedArrayObtainStyledAttributes.getColor(l.f174159i1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f35852h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        l();
    }
}
