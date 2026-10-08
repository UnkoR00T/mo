package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes4.dex */
class p extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f35727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f35728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f35729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f35730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f35731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f35735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f35736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f35737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f35738r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f35738r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f35729i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35721a.J();
            }
        };
        this.f35730j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z15) {
                p.y(this.f35722a, view, z15);
            }
        };
        this.f35731k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z15) {
                p.w(this.f35723a, z15);
            }
        };
        this.f35735o = Long.MAX_VALUE;
        this.f35726f = gj.e.f(rVar.getContext(), ri.b.B, 67);
        this.f35725e = gj.e.f(rVar.getContext(), ri.b.B, 50);
        this.f35727g = gj.e.g(rVar.getContext(), ri.b.G, si.a.f181916a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i15, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f35727g);
        valueAnimatorOfFloat.setDuration(i15);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f35718a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f35738r = E(this.f35726f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f35725e, 1.0f, 0.0f);
        this.f35737q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f35735o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    private void H(boolean z15) {
        if (this.f35734n != z15) {
            this.f35734n = z15;
            this.f35738r.cancel();
            this.f35737q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        this.f35728h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f35719a, view, motionEvent);
            }
        });
        this.f35728h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                p.A(this.f35720a);
            }
        });
        this.f35728h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f35728h == null) {
            return;
        }
        if (G()) {
            this.f35733m = false;
        }
        if (this.f35733m) {
            this.f35733m = false;
            return;
        }
        H(!this.f35734n);
        if (!this.f35734n) {
            this.f35728h.dismissDropDown();
        } else {
            this.f35728h.requestFocus();
            this.f35728h.showDropDown();
        }
    }

    private void K() {
        this.f35733m = true;
        this.f35735o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f35728h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f35733m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z15) {
        AutoCompleteTextView autoCompleteTextView = pVar.f35728h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        pVar.f35773d.setImportantForAccessibility(z15 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f35773d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z15) {
        pVar.f35732l = z15;
        pVar.r();
        if (z15) {
            return;
        }
        pVar.H(false);
        pVar.f35733m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f35733m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f35736p.isTouchExplorationEnabled() && q.a(this.f35728h) && !this.f35773d.hasFocus()) {
            this.f35728h.dismissDropDown();
        }
        this.f35728h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f35724a);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return ri.j.f174047g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return ri.e.f173988i;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f35730j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f35729i;
    }

    @Override // com.google.android.material.textfield.s
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f35731k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i15) {
        return i15 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f35732l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f35734n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f35728h = D(editText);
        I();
        this.f35770a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f35736p.isTouchExplorationEnabled()) {
            this.f35773d.setImportantForAccessibility(2);
        }
        this.f35770a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, k6.p pVar) {
        if (!q.a(this.f35728h)) {
            pVar.o0(Spinner.class.getName());
        }
        if (pVar.X()) {
            pVar.B0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f35736p.isEnabled() || q.a(this.f35728h)) {
            return;
        }
        boolean z15 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f35734n && !this.f35728h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z15) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f35736p = (AccessibilityManager) this.f35772c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f35728h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f35728h.setOnDismissListener(null);
        }
    }
}
