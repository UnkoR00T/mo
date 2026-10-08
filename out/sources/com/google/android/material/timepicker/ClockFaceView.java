package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import j6.l0;
import java.util.Arrays;
import k6.p;
import p082nUL.y;
import ri.h;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
class ClockFaceView extends d implements ClockHandView.b {
    private final ClockHandView F;
    private final Rect G;
    private final RectF H;
    private final Rect I;
    private final SparseArray<TextView> K;
    private final j6.a L;
    private final int[] O;
    private final float[] P;
    private final int R;
    private final int T;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final int f35838h0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final int f35839q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private String[] f35840r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f35841s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final ColorStateList f35842t0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.F.i()) - ClockFaceView.this.R);
            return true;
        }
    }

    class b extends j6.a {
        b() {
        }

        @Override // j6.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            int iIntValue = ((Integer) view.getTag(ri.f.f174006p)).intValue();
            if (iIntValue > 0) {
                pVar.Y0((View) ClockFaceView.this.K.get(iIntValue - 1));
            }
            pVar.r0(p.g.a(0, 1, iIntValue, 1, false, view.isSelected()));
            pVar.p0(true);
            pVar.b(p.a.f108665i);
        }

        @Override // j6.a
        public boolean j(View view, int i15, Bundle bundle) {
            if (i15 != 16) {
                return super.j(view, i15, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.G);
            float fCenterX = ClockFaceView.this.G.centerX();
            float fCenterY = ClockFaceView.this.G.centerY();
            ClockFaceView.this.F.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.F.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.f173923r);
    }

    private void P() {
        RectF rectFE = this.F.e();
        TextView textViewR = R(rectFE);
        for (int i15 = 0; i15 < this.K.size(); i15++) {
            TextView textView = this.K.get(i15);
            if (textView != null) {
                textView.setSelected(textView == textViewR);
                textView.getPaint().setShader(Q(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.G);
        this.H.set(this.G);
        textView.getLineBounds(0, this.I);
        RectF rectF2 = this.H;
        Rect rect = this.I;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.H)) {
            return new RadialGradient(rectF.centerX() - this.H.left, rectF.centerY() - this.H.top, rectF.width() * 0.5f, this.O, this.P, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView R(RectF rectF) {
        float f15 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i15 = 0; i15 < this.K.size(); i15++) {
            TextView textView2 = this.K.get(i15);
            if (textView2 != null) {
                textView2.getHitRect(this.G);
                this.H.set(this.G);
                this.H.union(rectF);
                float fWidth = this.H.width() * this.H.height();
                if (fWidth < f15) {
                    textView = textView2;
                    f15 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float S(float f15, float f16, float f17) {
        return Math.max(Math.max(f15, f16), f17);
    }

    private void U(int i15) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.K.size();
        boolean z15 = false;
        for (int i16 = 0; i16 < Math.max(this.f35840r0.length, size); i16++) {
            TextView textView = this.K.get(i16);
            if (i16 >= this.f35840r0.length) {
                removeView(textView);
                this.K.remove(i16);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f174025f, (ViewGroup) this, false);
                    this.K.put(i16, textView);
                    addView(textView);
                }
                textView.setText(this.f35840r0[i16]);
                textView.setTag(ri.f.f174006p, Integer.valueOf(i16));
                int i17 = (i16 / 12) + 1;
                textView.setTag(ri.f.f174001k, Integer.valueOf(i17));
                if (i17 > 1) {
                    z15 = true;
                }
                l0.h0(textView, this.L);
                textView.setTextColor(this.f35842t0);
                if (i15 != 0) {
                    textView.setContentDescription(getResources().getString(i15, this.f35840r0[i16]));
                }
            }
        }
        this.F.q(z15);
    }

    @Override // com.google.android.material.timepicker.d
    public void H(int i15) {
        if (i15 != G()) {
            super.H(i15);
            this.F.m(G());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void J() {
        super.J();
        for (int i15 = 0; i15 < this.K.size(); i15++) {
            this.K.get(i15).setVisibility(0);
        }
    }

    public void T(String[] strArr, int i15) {
        this.f35840r0 = strArr;
        U(i15);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f15, boolean z15) {
        if (Math.abs(this.f35841s0 - f15) > 0.001f) {
            this.f35841s0 = f15;
            P();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.f1(accessibilityNodeInfo).q0(p.f.a(1, this.f35840r0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iS = (int) (this.f35839q0 / S(this.T / displayMetrics.heightPixels, this.f35838h0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iS, 1073741824);
        setMeasuredDimension(iS, iS);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.G = new Rect();
        this.H = new RectF();
        this.I = new Rect();
        this.K = new SparseArray<>();
        this.P = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f174127e1, i15, k.B);
        Resources resources = getResources();
        ColorStateList colorStateListA = ij.c.a(context, typedArrayObtainStyledAttributes, l.f174143g1);
        this.f35842t0 = colorStateListA;
        LayoutInflater.from(context).inflate(h.f174026g, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(ri.f.f174000j);
        this.F = clockHandView;
        this.R = resources.getDimensionPixelSize(ri.d.C);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.O = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = y.a(context, ri.c.f173933b).getDefaultColor();
        ColorStateList colorStateListA2 = ij.c.a(context, typedArrayObtainStyledAttributes, l.f174135f1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.L = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        T(strArr, 0);
        this.T = resources.getDimensionPixelSize(ri.d.Q);
        this.f35838h0 = resources.getDimensionPixelSize(ri.d.R);
        this.f35839q0 = resources.getDimensionPixelSize(ri.d.E);
    }
}
