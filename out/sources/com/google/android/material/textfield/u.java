package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class u {
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f35777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f35778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f35779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f35780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f35781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f35782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f35784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f35785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f35786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f35789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f35791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f35792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f35795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f35796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f35797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f35798y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f35799z;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f35801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f35803d;

        a(int i15, TextView textView, int i16, TextView textView2) {
            this.f35800a = i15;
            this.f35801b = textView;
            this.f35802c = i16;
            this.f35803d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f35787n = this.f35800a;
            u.this.f35785l = null;
            TextView textView = this.f35801b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f35802c == 1 && u.this.f35791r != null) {
                    u.this.f35791r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f35803d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f35803d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f35803d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f35803d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f35781h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f35780g = context;
        this.f35781h = textInputLayout;
        this.f35786m = context.getResources().getDimensionPixelSize(ri.d.f173954i);
        this.f35774a = gj.e.f(context, ri.b.C, 217);
        this.f35775b = gj.e.f(context, ri.b.f173931z, 167);
        this.f35776c = gj.e.f(context, ri.b.C, 167);
        this.f35777d = gj.e.g(context, ri.b.E, si.a.f181919d);
        int i15 = ri.b.E;
        TimeInterpolator timeInterpolator = si.a.f181916a;
        this.f35778e = gj.e.g(context, i15, timeInterpolator);
        this.f35779f = gj.e.g(context, ri.b.G, timeInterpolator);
    }

    private void D(int i15, int i16) {
        TextView textViewM;
        TextView textViewM2;
        if (i15 == i16) {
            return;
        }
        if (i16 != 0 && (textViewM2 = m(i16)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i15 != 0 && (textViewM = m(i15)) != null) {
            textViewM.setVisibility(4);
            if (i15 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f35787n = i16;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i15) {
        if (i15 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (this.f35781h.isLaidOut() && this.f35781h.isEnabled()) {
            return (this.f35788o == this.f35787n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i15, int i16, boolean z15) {
        u uVar;
        if (i15 == i16) {
            return;
        }
        if (z15) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f35785l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f35797x, this.f35798y, 2, i15, i16);
            uVar.i(arrayList, uVar.f35790q, uVar.f35791r, 1, i15, i16);
            si.b.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i16, m(i15), i15, m(i16)));
            animatorSet.start();
        } else {
            uVar = this;
            D(i15, i16);
        }
        uVar.f35781h.q0();
        uVar.f35781h.w0(z15);
        uVar.f35781h.C0();
    }

    private boolean g() {
        return (this.f35782i == null || this.f35781h.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z15, TextView textView, int i15, int i16, int i17) {
        if (textView == null || !z15) {
            return;
        }
        if (i15 == i17 || i15 == i16) {
            ObjectAnimator objectAnimatorJ = j(textView, i17 == i15);
            if (i15 == i17 && i16 != 0) {
                objectAnimatorJ.setStartDelay(this.f35776c);
            }
            list.add(objectAnimatorJ);
            if (i17 != i15 || i16 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f35776c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z15) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z15 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z15 ? this.f35775b : this.f35776c);
        objectAnimatorOfFloat.setInterpolator(z15 ? this.f35778e : this.f35779f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f35786m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f35774a);
        objectAnimatorOfFloat.setInterpolator(this.f35777d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i15) {
        if (i15 == 1) {
            return this.f35791r;
        }
        if (i15 != 2) {
            return null;
        }
        return this.f35798y;
    }

    private int v(boolean z15, int i15, int i16) {
        return z15 ? this.f35780g.getResources().getDimensionPixelSize(i15) : i16;
    }

    private boolean y(int i15) {
        return (i15 != 1 || this.f35791r == null || TextUtils.isEmpty(this.f35789p)) ? false : true;
    }

    boolean A() {
        return this.f35790q;
    }

    boolean B() {
        return this.f35797x;
    }

    void C(TextView textView, int i15) {
        FrameLayout frameLayout;
        if (this.f35782i == null) {
            return;
        }
        if (!z(i15) || (frameLayout = this.f35784k) == null) {
            this.f35782i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i16 = this.f35783j - 1;
        this.f35783j = i16;
        O(this.f35782i, i16);
    }

    void E(int i15) {
        this.f35793t = i15;
        TextView textView = this.f35791r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i15);
        }
    }

    void F(CharSequence charSequence) {
        this.f35792s = charSequence;
        TextView textView = this.f35791r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z15) {
        if (this.f35790q == z15) {
            return;
        }
        h();
        if (z15) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f35780g);
            this.f35791r = appCompatTextView;
            appCompatTextView.setId(ri.f.N);
            this.f35791r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f35791r.setTypeface(typeface);
            }
            H(this.f35794u);
            I(this.f35795v);
            F(this.f35792s);
            E(this.f35793t);
            this.f35791r.setVisibility(4);
            e(this.f35791r, 0);
        } else {
            w();
            C(this.f35791r, 0);
            this.f35791r = null;
            this.f35781h.q0();
            this.f35781h.C0();
        }
        this.f35790q = z15;
    }

    void H(int i15) {
        this.f35794u = i15;
        TextView textView = this.f35791r;
        if (textView != null) {
            this.f35781h.c0(textView, i15);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f35795v = colorStateList;
        TextView textView = this.f35791r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i15) {
        this.f35799z = i15;
        TextView textView = this.f35798y;
        if (textView != null) {
            androidx.core.widget.h.m(textView, i15);
        }
    }

    void K(boolean z15) {
        if (this.f35797x == z15) {
            return;
        }
        h();
        if (z15) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f35780g);
            this.f35798y = appCompatTextView;
            appCompatTextView.setId(ri.f.O);
            this.f35798y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f35798y.setTypeface(typeface);
            }
            this.f35798y.setVisibility(4);
            this.f35798y.setAccessibilityLiveRegion(1);
            J(this.f35799z);
            L(this.A);
            e(this.f35798y, 1);
            this.f35798y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f35798y, 1);
            this.f35798y = null;
            this.f35781h.q0();
            this.f35781h.C0();
        }
        this.f35797x = z15;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f35798y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f35791r, typeface);
            M(this.f35798y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f35789p = charSequence;
        this.f35791r.setText(charSequence);
        int i15 = this.f35787n;
        if (i15 != 1) {
            this.f35788o = 1;
        }
        S(i15, this.f35788o, P(this.f35791r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f35796w = charSequence;
        this.f35798y.setText(charSequence);
        int i15 = this.f35787n;
        if (i15 != 2) {
            this.f35788o = 2;
        }
        S(i15, this.f35788o, P(this.f35798y, charSequence));
    }

    void e(TextView textView, int i15) {
        if (this.f35782i == null && this.f35784k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f35780g);
            this.f35782i = linearLayout;
            linearLayout.setOrientation(0);
            this.f35781h.addView(this.f35782i, -1, -2);
            this.f35784k = new FrameLayout(this.f35780g);
            this.f35782i.addView(this.f35784k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f35781h.getEditText() != null) {
                f();
            }
        }
        if (z(i15)) {
            this.f35784k.setVisibility(0);
            this.f35784k.addView(textView);
        } else {
            this.f35782i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f35782i.setVisibility(0);
        this.f35783j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f35781h.getEditText();
            boolean zH = ij.c.h(this.f35780g);
            this.f35782i.setPaddingRelative(v(zH, ri.d.N, editText.getPaddingStart()), v(zH, ri.d.O, this.f35780g.getResources().getDimensionPixelSize(ri.d.M)), v(zH, ri.d.N, editText.getPaddingEnd()), 0);
        }
    }

    void h() {
        Animator animator = this.f35785l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f35788o);
    }

    int n() {
        return this.f35793t;
    }

    CharSequence o() {
        return this.f35792s;
    }

    CharSequence p() {
        return this.f35789p;
    }

    int q() {
        TextView textView = this.f35791r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f35791r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f35796w;
    }

    View t() {
        return this.f35798y;
    }

    int u() {
        TextView textView = this.f35798y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f35789p = null;
        h();
        if (this.f35787n == 1) {
            if (!this.f35797x || TextUtils.isEmpty(this.f35796w)) {
                this.f35788o = 0;
            } else {
                this.f35788o = 2;
            }
        }
        S(this.f35787n, this.f35788o, P(this.f35791r, ""));
    }

    void x() {
        h();
        int i15 = this.f35787n;
        if (i15 == 2) {
            this.f35788o = 0;
        }
        S(i15, this.f35788o, P(this.f35798y, ""));
    }

    boolean z(int i15) {
        return i15 == 0 || i15 == 1;
    }
}
