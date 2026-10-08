package s6;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import j6.l0;
import java.util.ArrayList;
import java.util.List;
import k6.p;
import k6.q;
import k6.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends j6.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Rect f178191p = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final s6.b.a<p> f178192q = new C4561a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final s6.b.InterfaceC4562b<m1<p>, p> f178193r = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f178198h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f178199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f178200k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f178194d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f178195e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f178196f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f178197g = new int[2];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f178201l = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f178202m = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f178203n = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    class C4561a implements s6.b.a<p> {
        C4561a() {
        }

        @Override // s6.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, Rect rect) {
            pVar.k(rect);
        }
    }

    class b implements s6.b.InterfaceC4562b<m1<p>, p> {
        b() {
        }

        @Override // s6.b.InterfaceC4562b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p a(m1<p> m1Var, int i15) {
            return m1Var.t(i15);
        }

        @Override // s6.b.InterfaceC4562b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(m1<p> m1Var) {
            return m1Var.s();
        }
    }

    private class c extends q {
        c() {
        }

        @Override // k6.q
        public p b(int i15) {
            return p.c0(a.this.H(i15));
        }

        @Override // k6.q
        public p d(int i15) {
            int i16 = i15 == 2 ? a.this.f178201l : a.this.f178202m;
            if (i16 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i16);
        }

        @Override // k6.q
        public boolean f(int i15, int i16, Bundle bundle) {
            return a.this.P(i15, i16, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f178199j = view;
        this.f178198h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (l0.w(view) == 0) {
            l0.n0(view, 1);
        }
    }

    private static Rect D(View view, int i15, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i15 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i15 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i15 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i15 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f178199j.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f178199j.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i15) {
        if (i15 == 19) {
            return 33;
        }
        if (i15 != 21) {
            return i15 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i15, Rect rect) {
        p pVar;
        m1<p> m1VarY = y();
        int i16 = this.f178202m;
        int iM = PKIFailureInfo.systemUnavail;
        p pVarI = i16 == Integer.MIN_VALUE ? null : m1VarY.i(i16);
        if (i15 == 1 || i15 == 2) {
            pVar = (p) s6.b.d(m1VarY, f178193r, f178192q, pVarI, i15, l0.y(this.f178199j) == 1, false);
        } else {
            if (i15 != 17 && i15 != 33 && i15 != 66 && i15 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i17 = this.f178202m;
            if (i17 != Integer.MIN_VALUE) {
                z(i17, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f178199j, i15, rect2);
            }
            pVar = (p) s6.b.c(m1VarY, f178193r, f178192q, pVarI, rect2, i15);
        }
        if (pVar != null) {
            iM = m1VarY.m(m1VarY.l(pVar));
        }
        return T(iM);
    }

    private boolean Q(int i15, int i16, Bundle bundle) {
        if (i16 == 1) {
            return T(i15);
        }
        if (i16 == 2) {
            return o(i15);
        }
        if (i16 != 64) {
            return i16 != 128 ? J(i15, i16, bundle) : n(i15);
        }
        return S(i15);
    }

    private boolean R(int i15, Bundle bundle) {
        return l0.V(this.f178199j, i15, bundle);
    }

    private boolean S(int i15) {
        int i16;
        if (!this.f178198h.isEnabled() || !this.f178198h.isTouchExplorationEnabled() || (i16 = this.f178201l) == i15) {
            return false;
        }
        if (i16 != Integer.MIN_VALUE) {
            n(i16);
        }
        this.f178201l = i15;
        this.f178199j.invalidate();
        U(i15, 32768);
        return true;
    }

    private void V(int i15) {
        int i16 = this.f178203n;
        if (i16 == i15) {
            return;
        }
        this.f178203n = i15;
        U(i15, 128);
        U(i16, 256);
    }

    private boolean n(int i15) {
        if (this.f178201l != i15) {
            return false;
        }
        this.f178201l = PKIFailureInfo.systemUnavail;
        this.f178199j.invalidate();
        U(i15, PKIFailureInfo.notAuthorized);
        return true;
    }

    private boolean p() {
        int i15 = this.f178202m;
        return i15 != Integer.MIN_VALUE && J(i15, 16, null);
    }

    private AccessibilityEvent q(int i15, int i16) {
        return i15 != -1 ? r(i15, i16) : s(i16);
    }

    private AccessibilityEvent r(int i15, int i16) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i16);
        p pVarH = H(i15);
        accessibilityEventObtain.getText().add(pVarH.D());
        accessibilityEventObtain.setContentDescription(pVarH.t());
        accessibilityEventObtain.setScrollable(pVarH.V());
        accessibilityEventObtain.setPassword(pVarH.U());
        accessibilityEventObtain.setEnabled(pVarH.N());
        accessibilityEventObtain.setChecked(pVarH.K());
        L(i15, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(pVarH.q());
        r.c(accessibilityEventObtain, this.f178199j, i15);
        accessibilityEventObtain.setPackageName(this.f178199j.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i15) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i15);
        this.f178199j.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private p t(int i15) {
        p pVarA0 = p.a0();
        pVarA0.w0(true);
        pVarA0.y0(true);
        pVarA0.o0("android.view.View");
        Rect rect = f178191p;
        pVarA0.k0(rect);
        pVarA0.l0(rect);
        pVarA0.K0(this.f178199j);
        N(i15, pVarA0);
        if (pVarA0.D() == null && pVarA0.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        pVarA0.k(this.f178195e);
        if (this.f178195e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i16 = pVarA0.i();
        if ((i16 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i16 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        pVarA0.I0(this.f178199j.getContext().getPackageName());
        pVarA0.T0(this.f178199j, i15);
        if (this.f178201l == i15) {
            pVarA0.h0(true);
            pVarA0.a(128);
        } else {
            pVarA0.h0(false);
            pVarA0.a(64);
        }
        boolean z15 = this.f178202m == i15;
        if (z15) {
            pVarA0.a(2);
        } else if (pVarA0.P()) {
            pVarA0.a(1);
        }
        pVarA0.z0(z15);
        this.f178199j.getLocationOnScreen(this.f178197g);
        pVarA0.l(this.f178194d);
        if (this.f178194d.equals(rect)) {
            pVarA0.k(this.f178194d);
            if (pVarA0.f108659b != -1) {
                p pVarA1 = p.a0();
                for (int i17 = pVarA0.f108659b; i17 != -1; i17 = pVarA1.f108659b) {
                    pVarA1.L0(this.f178199j, -1);
                    pVarA1.k0(f178191p);
                    N(i17, pVarA1);
                    pVarA1.k(this.f178195e);
                    Rect rect2 = this.f178194d;
                    Rect rect3 = this.f178195e;
                    rect2.offset(rect3.left, rect3.top);
                }
                pVarA1.e0();
            }
            this.f178194d.offset(this.f178197g[0] - this.f178199j.getScrollX(), this.f178197g[1] - this.f178199j.getScrollY());
        }
        if (this.f178199j.getLocalVisibleRect(this.f178196f)) {
            this.f178196f.offset(this.f178197g[0] - this.f178199j.getScrollX(), this.f178197g[1] - this.f178199j.getScrollY());
            if (this.f178194d.intersect(this.f178196f)) {
                pVarA0.l0(this.f178194d);
                if (E(this.f178194d)) {
                    pVarA0.d1(true);
                }
            }
        }
        return pVarA0;
    }

    private p u() {
        p pVarB0 = p.b0(this.f178199j);
        l0.T(this.f178199j, pVarB0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (pVarB0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            pVarB0.d(this.f178199j, ((Integer) arrayList.get(i15)).intValue());
        }
        return pVarB0;
    }

    private m1<p> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        m1<p> m1Var = new m1<>();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            m1Var.n(arrayList.get(i15).intValue(), t(arrayList.get(i15).intValue()));
        }
        return m1Var;
    }

    private void z(int i15, Rect rect) {
        H(i15).k(rect);
    }

    public final int A() {
        return this.f178202m;
    }

    protected abstract int B(float f15, float f16);

    protected abstract void C(List<Integer> list);

    p H(int i15) {
        return i15 == -1 ? u() : t(i15);
    }

    public final void I(boolean z15, int i15, Rect rect) {
        int i16 = this.f178202m;
        if (i16 != Integer.MIN_VALUE) {
            o(i16);
        }
        if (z15) {
            G(i15, rect);
        }
    }

    protected abstract boolean J(int i15, int i16, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i15, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(p pVar);

    protected abstract void N(int i15, p pVar);

    protected abstract void O(int i15, boolean z15);

    boolean P(int i15, int i16, Bundle bundle) {
        return i15 != -1 ? Q(i15, i16, bundle) : R(i16, bundle);
    }

    public final boolean T(int i15) {
        int i16;
        if ((!this.f178199j.isFocused() && !this.f178199j.requestFocus()) || (i16 = this.f178202m) == i15) {
            return false;
        }
        if (i16 != Integer.MIN_VALUE) {
            o(i16);
        }
        if (i15 == Integer.MIN_VALUE) {
            return false;
        }
        this.f178202m = i15;
        O(i15, true);
        U(i15, 8);
        return true;
    }

    public final boolean U(int i15, int i16) {
        ViewParent parent;
        if (i15 == Integer.MIN_VALUE || !this.f178198h.isEnabled() || (parent = this.f178199j.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f178199j, q(i15, i16));
    }

    @Override // j6.a
    public q b(View view) {
        if (this.f178200k == null) {
            this.f178200k = new c();
        }
        return this.f178200k;
    }

    @Override // j6.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // j6.a
    public void g(View view, p pVar) {
        super.g(view, pVar);
        M(pVar);
    }

    public final boolean o(int i15) {
        if (this.f178202m != i15) {
            return false;
        }
        this.f178202m = PKIFailureInfo.systemUnavail;
        O(i15, false);
        U(i15, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f178198h.isEnabled() && this.f178198h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f178203n == Integer.MIN_VALUE) {
                    return false;
                }
                V(PKIFailureInfo.systemUnavail);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean w(KeyEvent keyEvent) {
        int i15 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iF = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z15 = false;
                                while (i15 < repeatCount && G(iF, null)) {
                                    i15++;
                                    z15 = true;
                                }
                                return z15;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                p();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.f178201l;
    }
}
