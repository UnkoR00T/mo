package fb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j6.l0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends k {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String[] f60602q0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f60603h0 = 3;

    private static class a extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f60604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f60606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f60607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f60608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f60609f = false;

        a(View view, int i15, boolean z15) {
            this.f60604a = view;
            this.f60605b = i15;
            this.f60606c = (ViewGroup) view.getParent();
            this.f60607d = z15;
            c(true);
        }

        private void b() {
            if (!this.f60609f) {
                b0.f(this.f60604a, this.f60605b);
                ViewGroup viewGroup = this.f60606c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        private void c(boolean z15) {
            ViewGroup viewGroup;
            if (!this.f60607d || this.f60608e == z15 || (viewGroup = this.f60606c) == null) {
                return;
            }
            this.f60608e = z15;
            a0.b(viewGroup, z15);
        }

        @Override // fb.k.h
        public void a(k kVar) {
            c(true);
            if (this.f60609f) {
                return;
            }
            b0.f(this.f60604a, 0);
        }

        @Override // fb.k.h
        public void d(k kVar) {
            c(false);
            if (this.f60609f) {
                return;
            }
            b0.f(this.f60604a, this.f60605b);
        }

        @Override // fb.k.h
        public void h(k kVar) {
        }

        @Override // fb.k.h
        public void k(k kVar) {
            kVar.n0(this);
        }

        @Override // fb.k.h
        public void l(k kVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f60609f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z15) {
            if (z15) {
                return;
            }
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z15) {
            if (z15) {
                b0.f(this.f60604a, 0);
                ViewGroup viewGroup = this.f60606c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f60610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f60611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f60612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f60613d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f60610a = viewGroup;
            this.f60611b = view;
            this.f60612c = view2;
        }

        private void b() {
            this.f60612c.setTag(h.f60598a, null);
            this.f60610a.getOverlay().remove(this.f60611b);
            this.f60613d = false;
        }

        @Override // fb.k.h
        public void a(k kVar) {
        }

        @Override // fb.k.h
        public void d(k kVar) {
        }

        @Override // fb.k.h
        public void h(k kVar) {
        }

        @Override // fb.k.h
        public void k(k kVar) {
            kVar.n0(this);
        }

        @Override // fb.k.h
        public void l(k kVar) {
            if (this.f60613d) {
                b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f60610a.getOverlay().remove(this.f60611b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f60611b.getParent() == null) {
                l0.e(this.f60610a, this.f60611b);
            } else {
                h0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z15) {
            if (z15) {
                this.f60612c.setTag(h.f60598a, this.f60611b);
                l0.e(this.f60610a, this.f60611b);
                this.f60613d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z15) {
            if (z15) {
                return;
            }
            b();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f60615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f60616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f60617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f60618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f60619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f60620f;

        c() {
        }
    }

    private void B0(x xVar) {
        xVar.f60691a.put("android:visibility:visibility", Integer.valueOf(xVar.f60692b.getVisibility()));
        xVar.f60691a.put("android:visibility:parent", xVar.f60692b.getParent());
        int[] iArr = new int[2];
        xVar.f60692b.getLocationOnScreen(iArr);
        xVar.f60691a.put("android:visibility:screenLocation", iArr);
    }

    private c C0(x xVar, x xVar2) {
        c cVar = new c();
        cVar.f60615a = false;
        cVar.f60616b = false;
        if (xVar == null || !xVar.f60691a.containsKey("android:visibility:visibility")) {
            cVar.f60617c = -1;
            cVar.f60619e = null;
        } else {
            cVar.f60617c = ((Integer) xVar.f60691a.get("android:visibility:visibility")).intValue();
            cVar.f60619e = (ViewGroup) xVar.f60691a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.f60691a.containsKey("android:visibility:visibility")) {
            cVar.f60618d = -1;
            cVar.f60620f = null;
        } else {
            cVar.f60618d = ((Integer) xVar2.f60691a.get("android:visibility:visibility")).intValue();
            cVar.f60620f = (ViewGroup) xVar2.f60691a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i15 = cVar.f60617c;
            int i16 = cVar.f60618d;
            if (i15 != i16 || cVar.f60619e != cVar.f60620f) {
                if (i15 != i16) {
                    if (i15 == 0) {
                        cVar.f60616b = false;
                        cVar.f60615a = true;
                        return cVar;
                    }
                    if (i16 == 0) {
                        cVar.f60616b = true;
                        cVar.f60615a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f60620f == null) {
                        cVar.f60616b = false;
                        cVar.f60615a = true;
                        return cVar;
                    }
                    if (cVar.f60619e == null) {
                        cVar.f60616b = true;
                        cVar.f60615a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (xVar == null && cVar.f60618d == 0) {
                cVar.f60616b = true;
                cVar.f60615a = true;
                return cVar;
            }
            if (xVar2 == null && cVar.f60617c == 0) {
                cVar.f60616b = false;
                cVar.f60615a = true;
            }
        }
        return cVar;
    }

    public abstract Animator D0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    public Animator E0(ViewGroup viewGroup, x xVar, int i15, x xVar2, int i16) {
        if ((this.f60603h0 & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.f60692b.getParent();
            if (C0(F(view, false), U(view, false)).f60615a) {
                return null;
            }
        }
        return D0(viewGroup, xVar2.f60692b, xVar, xVar2);
    }

    public abstract Animator F0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator G0(ViewGroup viewGroup, x xVar, int i15, x xVar2, int i16) {
        View view;
        boolean z15;
        View view2;
        boolean z16;
        if ((this.f60603h0 & 2) != 2 || xVar == null) {
            return null;
        }
        View view3 = xVar.f60692b;
        View viewA = xVar2 != null ? xVar2.f60692b : null;
        View view4 = (View) view3.getTag(h.f60598a);
        if (view4 != null) {
            view2 = null;
            z16 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z15 = false;
                } else {
                    viewA = null;
                    view = null;
                    z15 = true;
                }
            } else if (i16 == 4 || view3 == viewA) {
                view = viewA;
                z15 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z15 = true;
            }
            if (z15) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (C0(U(view5, true), F(view5, true)).f60615a) {
                            int id5 = view5.getId();
                            if (view5.getParent() != null || id5 == -1 || viewGroup.findViewById(id5) == null || !this.f60646z) {
                            }
                        } else {
                            viewA = w.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z16 = false;
                }
                view2 = view;
                z16 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z16 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            b0.f(view2, 0);
            Animator animatorF0 = F0(viewGroup, view2, xVar, xVar2);
            if (animatorF0 == null) {
                b0.f(view2, visibility);
                return animatorF0;
            }
            a aVar = new a(view2, i16, true);
            animatorF0.addListener(aVar);
            J().e(aVar);
            return animatorF0;
        }
        if (!z16) {
            int[] iArr = (int[]) xVar.f60691a.get("android:visibility:screenLocation");
            int i17 = iArr[0];
            int i18 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i17 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i18 - iArr2[1]) - view4.getTop());
            l0.e(viewGroup, view4);
        }
        Animator animatorF1 = F0(viewGroup, view4, xVar, xVar2);
        if (!z16) {
            if (animatorF1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorF1;
            }
            view3.setTag(h.f60598a, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorF1.addListener(bVar);
            animatorF1.addPauseListener(bVar);
            J().e(bVar);
        }
        return animatorF1;
    }

    public void I0(int i15) {
        if ((i15 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f60603h0 = i15;
    }

    @Override // fb.k
    public String[] T() {
        return f60602q0;
    }

    @Override // fb.k
    public boolean Y(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f60691a.containsKey("android:visibility:visibility") != xVar.f60691a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarC0 = C0(xVar, xVar2);
        return cVarC0.f60615a && (cVarC0.f60617c == 0 || cVarC0.f60618d == 0);
    }

    @Override // fb.k
    public void m(x xVar) {
        B0(xVar);
    }

    @Override // fb.k
    public void p(x xVar) {
        B0(xVar);
    }

    @Override // fb.k
    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        c cVarC0 = C0(xVar, xVar2);
        if (!cVarC0.f60615a) {
            return null;
        }
        if (cVarC0.f60619e == null && cVarC0.f60620f == null) {
            return null;
        }
        return cVarC0.f60616b ? E0(viewGroup, xVar, cVarC0.f60617c, xVar2, cVarC0.f60618d) : G0(viewGroup, xVar, cVarC0.f60617c, xVar2, cVarC0.f60618d);
    }
}
