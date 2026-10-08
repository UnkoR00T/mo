package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.z0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ViewConstructor"})
class r extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f35740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f35741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f35742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f35743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f35744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f35745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f35746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f35747h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.h> f35749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f35750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PorterDuff.Mode f35751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35752n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView.ScaleType f35753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View.OnLongClickListener f35754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f35755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f35756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35757t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private EditText f35758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AccessibilityManager f35759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f35760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final TextWatcher f35761y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final TextInputLayout.g f35762z;

    class a extends com.google.android.material.internal.m {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
            r.this.m().b(charSequence, i15, i16, i17);
        }
    }

    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f35758v == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f35758v != null) {
                r.this.f35758v.removeTextChangedListener(r.this.f35761y);
                if (r.this.f35758v.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f35758v.setOnFocusChangeListener(null);
                }
            }
            r.this.f35758v = textInputLayout.getEditText();
            if (r.this.f35758v != null) {
                r.this.f35758v.addTextChangedListener(r.this.f35761y);
            }
            r.this.m().n(r.this.f35758v);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<s> f35766a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f35767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f35768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f35769d;

        d(r rVar, z0 z0Var) {
            this.f35767b = rVar;
            this.f35768c = z0Var.n(ri.l.X5, 0);
            this.f35769d = z0Var.n(ri.l.f174276w6, 0);
        }

        private s b(int i15) {
            if (i15 == -1) {
                return new g(this.f35767b);
            }
            if (i15 == 0) {
                return new w(this.f35767b);
            }
            if (i15 == 1) {
                return new y(this.f35767b, this.f35769d);
            }
            if (i15 == 2) {
                return new f(this.f35767b);
            }
            if (i15 == 3) {
                return new p(this.f35767b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i15);
        }

        s c(int i15) {
            s sVar = this.f35766a.get(i15);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i15);
            this.f35766a.append(i15, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f35748j = 0;
        this.f35749k = new LinkedHashSet<>();
        this.f35761y = new a();
        b bVar = new b();
        this.f35762z = bVar;
        this.f35759w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f35740a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f35741b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, ri.f.L);
        this.f35742c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, ri.f.K);
        this.f35746g = checkableImageButtonI2;
        this.f35747h = new d(this, z0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f35756s = appCompatTextView;
        C(z0Var);
        B(z0Var);
        D(z0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(z0 z0Var) {
        if (!z0Var.s(ri.l.f174284x6)) {
            if (z0Var.s(ri.l.f174108b6)) {
                this.f35750l = ij.c.b(getContext(), z0Var, ri.l.f174108b6);
            }
            if (z0Var.s(ri.l.f174116c6)) {
                this.f35751m = com.google.android.material.internal.q.h(z0Var.k(ri.l.f174116c6, -1), null);
            }
        }
        if (z0Var.s(ri.l.Z5)) {
            U(z0Var.k(ri.l.Z5, 0));
            if (z0Var.s(ri.l.W5)) {
                Q(z0Var.p(ri.l.W5));
            }
            O(z0Var.a(ri.l.V5, true));
        } else if (z0Var.s(ri.l.f174284x6)) {
            if (z0Var.s(ri.l.f174292y6)) {
                this.f35750l = ij.c.b(getContext(), z0Var, ri.l.f174292y6);
            }
            if (z0Var.s(ri.l.f174300z6)) {
                this.f35751m = com.google.android.material.internal.q.h(z0Var.k(ri.l.f174300z6, -1), null);
            }
            U(z0Var.a(ri.l.f174284x6, false) ? 1 : 0);
            Q(z0Var.p(ri.l.f174268v6));
        }
        T(z0Var.f(ri.l.Y5, getResources().getDimensionPixelSize(ri.d.f173957j0)));
        if (z0Var.s(ri.l.f174100a6)) {
            X(t.b(z0Var.k(ri.l.f174100a6, -1)));
        }
    }

    private void C(z0 z0Var) {
        if (z0Var.s(ri.l.f174156h6)) {
            this.f35743d = ij.c.b(getContext(), z0Var, ri.l.f174156h6);
        }
        if (z0Var.s(ri.l.f174164i6)) {
            this.f35744e = com.google.android.material.internal.q.h(z0Var.k(ri.l.f174164i6, -1), null);
        }
        if (z0Var.s(ri.l.f174148g6)) {
            c0(z0Var.g(ri.l.f174148g6));
        }
        this.f35742c.setContentDescription(getResources().getText(ri.j.f174046f));
        this.f35742c.setImportantForAccessibility(2);
        this.f35742c.setClickable(false);
        this.f35742c.setPressable(false);
        this.f35742c.setCheckable(false);
        this.f35742c.setFocusable(false);
    }

    private void D(z0 z0Var) {
        this.f35756s.setVisibility(8);
        this.f35756s.setId(ri.f.R);
        this.f35756s.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f35756s.setAccessibilityLiveRegion(1);
        q0(z0Var.n(ri.l.O6, 0));
        if (z0Var.s(ri.l.P6)) {
            r0(z0Var.c(ri.l.P6));
        }
        p0(z0Var.p(ri.l.N6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f35760x;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f35759w) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f35760x == null || this.f35759w == null || !isAttachedToWindow()) {
            return;
        }
        this.f35759w.addTouchExplorationStateChangeListener(this.f35760x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.f35758v == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f35758v.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f35746g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i15) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(ri.h.f174023d, viewGroup, false);
        checkableImageButton.setId(i15);
        t.e(checkableImageButton);
        if (ij.c.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void j(int i15) {
        Iterator<TextInputLayout.h> it = this.f35749k.iterator();
        while (it.hasNext()) {
            it.next().a(this.f35740a, i15);
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f35760x = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i15 = this.f35747h.f35768c;
        return i15 == 0 ? sVar.d() : i15;
    }

    private void t0(s sVar) {
        M();
        this.f35760x = null;
        sVar.u();
    }

    private void u0(boolean z15) {
        if (!z15 || n() == null) {
            t.a(this.f35740a, this.f35746g, this.f35750l, this.f35751m);
            return;
        }
        Drawable drawableMutate = y5.a.r(n()).mutate();
        drawableMutate.setTint(this.f35740a.getErrorCurrentTextColors());
        this.f35746g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f35741b.setVisibility((this.f35746g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f35755r == null || this.f35757t) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f35742c.setVisibility(s() != null && this.f35740a.O() && this.f35740a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f35740a.p0();
    }

    private void y0() {
        int visibility = this.f35756s.getVisibility();
        int i15 = (this.f35755r == null || this.f35757t) ? 8 : 0;
        if (visibility != i15) {
            m().q(i15 == 0);
        }
        v0();
        this.f35756s.setVisibility(i15);
        this.f35740a.p0();
    }

    boolean A() {
        return this.f35748j != 0;
    }

    boolean E() {
        return A() && this.f35746g.isChecked();
    }

    boolean F() {
        return this.f35741b.getVisibility() == 0 && this.f35746g.getVisibility() == 0;
    }

    boolean G() {
        return this.f35742c.getVisibility() == 0;
    }

    void H(boolean z15) {
        this.f35757t = z15;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f35740a.d0());
        }
    }

    void J() {
        t.d(this.f35740a, this.f35746g, this.f35750l);
    }

    void K() {
        t.d(this.f35740a, this.f35742c, this.f35743d);
    }

    void L(boolean z15) {
        boolean z16;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z17 = true;
        if (!sVarM.l() || (zIsChecked = this.f35746g.isChecked()) == sVarM.m()) {
            z16 = false;
        } else {
            this.f35746g.setChecked(!zIsChecked);
            z16 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f35746g.isActivated()) == sVarM.k()) {
            z17 = z16;
        } else {
            N(!zIsActivated);
        }
        if (z15 || z17) {
            J();
        }
    }

    void N(boolean z15) {
        this.f35746g.setActivated(z15);
    }

    void O(boolean z15) {
        this.f35746g.setCheckable(z15);
    }

    void P(int i15) {
        Q(i15 != 0 ? getResources().getText(i15) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f35746g.setContentDescription(charSequence);
        }
    }

    void R(int i15) {
        S(i15 != 0 ? p082nUL.y.b(getContext(), i15) : null);
    }

    void S(Drawable drawable) {
        this.f35746g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f35740a, this.f35746g, this.f35750l, this.f35751m);
            J();
        }
    }

    void T(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i15 != this.f35752n) {
            this.f35752n = i15;
            t.g(this.f35746g, i15);
            t.g(this.f35742c, i15);
        }
    }

    void U(int i15) {
        if (this.f35748j == i15) {
            return;
        }
        t0(m());
        int i16 = this.f35748j;
        this.f35748j = i15;
        j(i16);
        a0(i15 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f35740a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f35740a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i15);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f35758v;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f35740a, this.f35746g, this.f35750l, this.f35751m);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f35746g, onClickListener, this.f35754q);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f35754q = onLongClickListener;
        t.i(this.f35746g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f35753p = scaleType;
        t.j(this.f35746g, scaleType);
        t.j(this.f35742c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f35750l != colorStateList) {
            this.f35750l = colorStateList;
            t.a(this.f35740a, this.f35746g, colorStateList, this.f35751m);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f35751m != mode) {
            this.f35751m = mode;
            t.a(this.f35740a, this.f35746g, this.f35750l, mode);
        }
    }

    void a0(boolean z15) {
        if (F() != z15) {
            this.f35746g.setVisibility(z15 ? 0 : 8);
            v0();
            x0();
            this.f35740a.p0();
        }
    }

    void b0(int i15) {
        c0(i15 != 0 ? p082nUL.y.b(getContext(), i15) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f35742c.setImageDrawable(drawable);
        w0();
        t.a(this.f35740a, this.f35742c, this.f35743d, this.f35744e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f35742c, onClickListener, this.f35745f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f35745f = onLongClickListener;
        t.i(this.f35742c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f35743d != colorStateList) {
            this.f35743d = colorStateList;
            t.a(this.f35740a, this.f35742c, colorStateList, this.f35744e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f35744e != mode) {
            this.f35744e = mode;
            t.a(this.f35740a, this.f35742c, this.f35743d, mode);
        }
    }

    void h() {
        this.f35746g.performClick();
        this.f35746g.jumpDrawablesToCurrentState();
    }

    void i0(int i15) {
        j0(i15 != 0 ? getResources().getText(i15) : null);
    }

    void j0(CharSequence charSequence) {
        this.f35746g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f35742c;
        }
        if (A() && F()) {
            return this.f35746g;
        }
        return null;
    }

    void k0(int i15) {
        l0(i15 != 0 ? p082nUL.y.b(getContext(), i15) : null);
    }

    CharSequence l() {
        return this.f35746g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f35746g.setImageDrawable(drawable);
    }

    s m() {
        return this.f35747h.c(this.f35748j);
    }

    void m0(boolean z15) {
        if (z15 && this.f35748j != 1) {
            U(1);
        } else {
            if (z15) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f35746g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f35750l = colorStateList;
        t.a(this.f35740a, this.f35746g, colorStateList, this.f35751m);
    }

    int o() {
        return this.f35752n;
    }

    void o0(PorterDuff.Mode mode) {
        this.f35751m = mode;
        t.a(this.f35740a, this.f35746g, this.f35750l, mode);
    }

    int p() {
        return this.f35748j;
    }

    void p0(CharSequence charSequence) {
        this.f35755r = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f35756s.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f35753p;
    }

    void q0(int i15) {
        androidx.core.widget.h.m(this.f35756s, i15);
    }

    CheckableImageButton r() {
        return this.f35746g;
    }

    void r0(ColorStateList colorStateList) {
        this.f35756s.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f35742c.getDrawable();
    }

    CharSequence u() {
        return this.f35746g.getContentDescription();
    }

    Drawable v() {
        return this.f35746g.getDrawable();
    }

    CharSequence w() {
        return this.f35755r;
    }

    ColorStateList x() {
        return this.f35756s.getTextColors();
    }

    void x0() {
        if (this.f35740a.f35660e == null) {
            return;
        }
        this.f35756s.setPaddingRelative(getContext().getResources().getDimensionPixelSize(ri.d.P), this.f35740a.f35660e.getPaddingTop(), (F() || G()) ? 0 : this.f35740a.f35660e.getPaddingEnd(), this.f35740a.f35660e.getPaddingBottom());
    }

    int y() {
        return getPaddingEnd() + this.f35756s.getPaddingEnd() + ((F() || G()) ? this.f35746g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f35746g.getLayoutParams()).getMarginStart() : 0);
    }

    TextView z() {
        return this.f35756s;
    }
}
