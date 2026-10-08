package fb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b extends k {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String[] f60534q0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Property<i, PointF> f60535r0 = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Property<i, PointF> f60536s0 = new C1369b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Property<View, PointF> f60537t0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Property<View, PointF> f60538u0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Property<View, PointF> f60539v0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final fb.i f60540w0 = new fb.i();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f60541h0 = false;

    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: fb.b$b, reason: collision with other inner class name */
    class C1369b extends Property<i, PointF> {
        C1369b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            b0.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            b0.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            b0.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f60542a;
        private final i mViewBounds;

        f(i iVar) {
            this.f60542a = iVar;
            this.mViewBounds = iVar;
        }
    }

    private static class g extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f60544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f60545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f60546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f60547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f60548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f60549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f60550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f60551h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f60552i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f60553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f60554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f60555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f60556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f60557n;

        g(View view, Rect rect, boolean z15, Rect rect2, boolean z16, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
            this.f60544a = view;
            this.f60545b = rect;
            this.f60546c = z15;
            this.f60547d = rect2;
            this.f60548e = z16;
            this.f60549f = i15;
            this.f60550g = i16;
            this.f60551h = i17;
            this.f60552i = i18;
            this.f60553j = i19;
            this.f60554k = i25;
            this.f60555l = i26;
            this.f60556m = i27;
        }

        @Override // fb.k.h
        public void a(k kVar) {
            Rect rect = (Rect) this.f60544a.getTag(fb.h.f60599b);
            this.f60544a.setTag(fb.h.f60599b, null);
            this.f60544a.setClipBounds(rect);
        }

        @Override // fb.k.h
        public void d(k kVar) {
            this.f60544a.setTag(fb.h.f60599b, this.f60544a.getClipBounds());
            this.f60544a.setClipBounds(this.f60548e ? null : this.f60547d);
        }

        @Override // fb.k.h
        public void h(k kVar) {
        }

        @Override // fb.k.h
        public void k(k kVar) {
        }

        @Override // fb.k.h
        public void l(k kVar) {
            this.f60557n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z15) {
            if (this.f60557n) {
                return;
            }
            Rect rect = null;
            if (z15) {
                if (!this.f60546c) {
                    rect = this.f60545b;
                }
            } else if (!this.f60548e) {
                rect = this.f60547d;
            }
            this.f60544a.setClipBounds(rect);
            if (z15) {
                b0.d(this.f60544a, this.f60549f, this.f60550g, this.f60551h, this.f60552i);
            } else {
                b0.d(this.f60544a, this.f60553j, this.f60554k, this.f60555l, this.f60556m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z15) {
            int iMax = Math.max(this.f60551h - this.f60549f, this.f60555l - this.f60553j);
            int iMax2 = Math.max(this.f60552i - this.f60550g, this.f60556m - this.f60554k);
            int i15 = z15 ? this.f60553j : this.f60549f;
            int i16 = z15 ? this.f60554k : this.f60550g;
            b0.d(this.f60544a, i15, i16, iMax + i15, iMax2 + i16);
            this.f60544a.setClipBounds(z15 ? this.f60547d : this.f60545b);
        }
    }

    private static class h extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f60558a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f60559b;

        h(ViewGroup viewGroup) {
            this.f60559b = viewGroup;
        }

        @Override // fb.r, fb.k.h
        public void a(k kVar) {
            a0.b(this.f60559b, true);
        }

        @Override // fb.r, fb.k.h
        public void d(k kVar) {
            a0.b(this.f60559b, false);
        }

        @Override // fb.r, fb.k.h
        public void k(k kVar) {
            if (!this.f60558a) {
                a0.b(this.f60559b, false);
            }
            kVar.n0(this);
        }

        @Override // fb.r, fb.k.h
        public void l(k kVar) {
            a0.b(this.f60559b, false);
            this.f60558a = true;
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f60561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f60562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f60563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f60564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f60565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f60566g;

        i(View view) {
            this.f60564e = view;
        }

        private void b() {
            b0.d(this.f60564e, this.f60560a, this.f60561b, this.f60562c, this.f60563d);
            this.f60565f = 0;
            this.f60566g = 0;
        }

        void a(PointF pointF) {
            this.f60562c = Math.round(pointF.x);
            this.f60563d = Math.round(pointF.y);
            int i15 = this.f60566g + 1;
            this.f60566g = i15;
            if (this.f60565f == i15) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f60560a = Math.round(pointF.x);
            this.f60561b = Math.round(pointF.y);
            int i15 = this.f60565f + 1;
            this.f60565f = i15;
            if (i15 == this.f60566g) {
                b();
            }
        }
    }

    private void B0(x xVar) {
        View view = xVar.f60692b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f60691a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f60691a.put("android:changeBounds:parent", xVar.f60692b.getParent());
        if (this.f60541h0) {
            xVar.f60691a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // fb.k
    public String[] T() {
        return f60534q0;
    }

    @Override // fb.k
    public boolean X() {
        return true;
    }

    @Override // fb.k
    public void m(x xVar) {
        B0(xVar);
    }

    @Override // fb.k
    public void p(x xVar) {
        Rect rect;
        B0(xVar);
        if (!this.f60541h0 || (rect = (Rect) xVar.f60692b.getTag(fb.h.f60599b)) == null) {
            return;
        }
        xVar.f60691a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb.k
    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        int i15;
        int i16;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map<String, Object> map = xVar.f60691a;
        Map<String, Object> map2 = xVar2.f60691a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = xVar2.f60692b;
        Rect rect2 = (Rect) xVar.f60691a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) xVar2.f60691a.get("android:changeBounds:bounds");
        int i17 = rect2.left;
        int i18 = rect3.left;
        int i19 = rect2.top;
        int i25 = rect3.top;
        int i26 = rect2.right;
        int i27 = rect3.right;
        int i28 = rect2.bottom;
        int i29 = rect3.bottom;
        int i35 = i26 - i17;
        int i36 = i28 - i19;
        int i37 = i27 - i18;
        int i38 = i29 - i25;
        Rect rect4 = (Rect) xVar.f60691a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) xVar2.f60691a.get("android:changeBounds:clip");
        if ((i35 == 0 || i36 == 0) && (i37 == 0 || i38 == 0)) {
            i15 = 0;
        } else {
            i15 = (i17 == i18 && i19 == i25) ? 0 : 1;
            if (i26 != i27 || i28 != i29) {
                i15++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i15++;
        }
        int i39 = i15;
        if (i39 <= 0) {
            return null;
        }
        if (this.f60541h0) {
            b0.d(view, i17, i19, Math.max(i35, i37) + i17, i19 + Math.max(i36, i38));
            ObjectAnimator objectAnimatorA = (i17 == i18 && i19 == i25) ? null : fb.f.a(view, f60539v0, H().a(i17, i19, i18, i25));
            boolean z15 = rect4 == null;
            if (z15) {
                i16 = 0;
                rect = new Rect(0, 0, i35, i36);
            } else {
                i16 = 0;
                rect = rect4;
            }
            int i45 = rect5 == null ? 1 : i16;
            Rect rect6 = i45 != 0 ? new Rect(i16, i16, i37, i38) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f60540w0, rect, rect6);
                g gVar = new g(view, rect, z15, rect6, i45, i17, i19, i26, i28, i18, i25, i27, i29);
                objectAnimatorOfObject.addListener(gVar);
                e(gVar);
            }
            animatorC = w.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            b0.d(view, i17, i19, i26, i28);
            if (i39 != 2) {
                animatorC = (i17 == i18 && i19 == i25) ? fb.f.a(view, f60537t0, H().a(i26, i28, i27, i29)) : fb.f.a(view, f60538u0, H().a(i17, i19, i18, i25));
            } else if (i35 == i37 && i36 == i38) {
                animatorC = fb.f.a(view, f60539v0, H().a(i17, i19, i18, i25));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = fb.f.a(iVar, f60535r0, H().a(i17, i19, i18, i25));
                ObjectAnimator objectAnimatorA3 = fb.f.a(iVar, f60536s0, H().a(i26, i28, i27, i29));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            a0.b(viewGroup4, true);
            J().e(new h(viewGroup4));
        }
        return animatorC;
    }
}
