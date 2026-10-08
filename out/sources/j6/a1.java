package j6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f99581a;

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f1 f99584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f99585b;

        public b(int i15) {
            this.f99585b = i15;
        }

        public final int a() {
            return this.f99585b;
        }

        public void c(a1 a1Var) {
        }

        public void d(a1 a1Var) {
        }

        public abstract f1 e(f1 f1Var, List<a1> list);

        public a f(a1 a1Var, a aVar) {
            return aVar;
        }
    }

    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f99586f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f99587g = new l7.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Interpolator f99588h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Interpolator f99589i = new AccelerateInterpolator(1.5f);

        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f99590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private f1 f99591b;

            /* JADX INFO: renamed from: j6.a1$c$a$a, reason: collision with other inner class name */
            class C2338a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a1 f99592a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f1 f99593b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ f1 f99594c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f99595d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f99596e;

                C2338a(a1 a1Var, f1 f1Var, f1 f1Var2, int i15, View view) {
                    this.f99592a = a1Var;
                    this.f99593b = f1Var;
                    this.f99594c = f1Var2;
                    this.f99595d = i15;
                    this.f99596e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f99592a.f(valueAnimator.getAnimatedFraction());
                    c.l(this.f99596e, c.p(this.f99593b, this.f99594c, this.f99592a.c(), this.f99595d), Collections.singletonList(this.f99592a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a1 f99598a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f99599b;

                b(a1 a1Var, View view) {
                    this.f99598a = a1Var;
                    this.f99599b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f99598a.f(1.0f);
                    c.j(this.f99599b, this.f99598a);
                }
            }

            /* JADX INFO: renamed from: j6.a1$c$a$c, reason: collision with other inner class name */
            class RunnableC2339c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f99601a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a1 f99602b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f99603c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f99604d;

                RunnableC2339c(View view, a1 a1Var, a aVar, ValueAnimator valueAnimator) {
                    this.f99601a = view;
                    this.f99602b = a1Var;
                    this.f99603c = aVar;
                    this.f99604d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m(this.f99601a, this.f99602b, this.f99603c);
                    this.f99604d.start();
                }
            }

            a(View view, b bVar) {
                this.f99590a = bVar;
                f1 f1VarC = l0.C(view);
                this.f99591b = f1VarC != null ? new f1.a(f1VarC).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f99591b = f1.z(windowInsets, view);
                    return c.n(view, windowInsets);
                }
                f1 f1VarZ = f1.z(windowInsets, view);
                if (this.f99591b == null) {
                    this.f99591b = l0.C(view);
                }
                if (this.f99591b == null) {
                    this.f99591b = f1VarZ;
                    return c.n(view, windowInsets);
                }
                b bVarO = c.o(view);
                if (bVarO != null && Objects.equals(bVarO.f99584a, f1VarZ)) {
                    return c.n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.f(f1VarZ, this.f99591b, iArr, iArr2);
                int i15 = iArr[0];
                int i16 = iArr2[0];
                int i17 = i15 | i16;
                if (i17 == 0) {
                    this.f99591b = f1VarZ;
                    return c.n(view, windowInsets);
                }
                f1 f1Var = this.f99591b;
                a1 a1Var = new a1(i17, c.h(i15, i16), (f1.p.d() & i17) != 0 ? 160L : 250L);
                a1Var.f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a1Var.b());
                a aVarG = c.g(f1VarZ, f1Var, i17);
                c.k(view, a1Var, f1VarZ, false);
                duration.addUpdateListener(new C2338a(a1Var, f1VarZ, f1Var, i17, view));
                duration.addListener(new b(a1Var, view));
                b0.a(view, new RunnableC2339c(view, a1Var, aVarG, duration));
                this.f99591b = f1VarZ;
                return c.n(view, windowInsets);
            }
        }

        c(int i15, Interpolator interpolator, long j15) {
            super(i15, interpolator, j15);
        }

        @SuppressLint({"WrongConstant"})
        static void f(f1 f1Var, f1 f1Var2, int[] iArr, int[] iArr2) {
            for (int i15 = 1; i15 <= 512; i15 <<= 1) {
                x5.h hVarF = f1Var.f(i15);
                x5.h hVarF2 = f1Var2.f(i15);
                int i16 = hVarF.f216813a;
                int i17 = hVarF2.f216813a;
                boolean z15 = i16 > i17 || hVarF.f216814b > hVarF2.f216814b || hVarF.f216815c > hVarF2.f216815c || hVarF.f216816d > hVarF2.f216816d;
                if (z15 != (i16 < i17 || hVarF.f216814b < hVarF2.f216814b || hVarF.f216815c < hVarF2.f216815c || hVarF.f216816d < hVarF2.f216816d)) {
                    if (z15) {
                        iArr[0] = iArr[0] | i15;
                    } else {
                        iArr2[0] = iArr2[0] | i15;
                    }
                }
            }
        }

        static a g(f1 f1Var, f1 f1Var2, int i15) {
            x5.h hVarF = f1Var.f(i15);
            x5.h hVarF2 = f1Var2.f(i15);
            return new a(x5.h.c(Math.min(hVarF.f216813a, hVarF2.f216813a), Math.min(hVarF.f216814b, hVarF2.f216814b), Math.min(hVarF.f216815c, hVarF2.f216815c), Math.min(hVarF.f216816d, hVarF2.f216816d)), x5.h.c(Math.max(hVarF.f216813a, hVarF2.f216813a), Math.max(hVarF.f216814b, hVarF2.f216814b), Math.max(hVarF.f216815c, hVarF2.f216815c), Math.max(hVarF.f216816d, hVarF2.f216816d)));
        }

        static Interpolator h(int i15, int i16) {
            if ((f1.p.d() & i15) != 0) {
                return f99586f;
            }
            if ((f1.p.d() & i16) != 0) {
                return f99587g;
            }
            if ((i15 & f1.p.i()) != 0) {
                return f99588h;
            }
            if ((f1.p.i() & i16) != 0) {
                return f99589i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener i(View view, b bVar) {
            return new a(view, bVar);
        }

        static void j(View view, a1 a1Var) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.c(a1Var);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                    j(viewGroup.getChildAt(i15), a1Var);
                }
            }
        }

        static void k(View view, a1 a1Var, f1 f1Var, boolean z15) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.f99584a = f1Var;
                if (!z15) {
                    bVarO.d(a1Var);
                    z15 = bVarO.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                    k(viewGroup.getChildAt(i15), a1Var, f1Var, z15);
                }
            }
        }

        static void l(View view, f1 f1Var, List<a1> list) {
            b bVarO = o(view);
            if (bVarO != null) {
                f1Var = bVarO.e(f1Var, list);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                    l(viewGroup.getChildAt(i15), f1Var, list);
                }
            }
        }

        static void m(View view, a1 a1Var, a aVar) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.f(a1Var, aVar);
                if (bVarO.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                    m(viewGroup.getChildAt(i15), a1Var, aVar);
                }
            }
        }

        static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.getTag(r5.e.M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b o(View view) {
            Object tag = view.getTag(r5.e.U);
            if (tag instanceof a) {
                return ((a) tag).f99590a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static f1 p(f1 f1Var, f1 f1Var2, float f15, int i15) {
            f1.a aVar = new f1.a(f1Var);
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i15 & i16) == 0) {
                    aVar.b(i16, f1Var.f(i16));
                } else {
                    x5.h hVarF = f1Var.f(i16);
                    x5.h hVarF2 = f1Var2.f(i16);
                    float f16 = 1.0f - f15;
                    aVar.b(i16, f1.o(hVarF, (int) (((double) ((hVarF.f216813a - hVarF2.f216813a) * f16)) + 0.5d), (int) (((double) ((hVarF.f216814b - hVarF2.f216814b) * f16)) + 0.5d), (int) (((double) ((hVarF.f216815c - hVarF2.f216815c) * f16)) + 0.5d), (int) (((double) ((hVarF.f216816d - hVarF2.f216816d) * f16)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerI = bVar != null ? i(view, bVar) : null;
            view.setTag(r5.e.U, onApplyWindowInsetsListenerI);
            if (view.getTag(r5.e.L) == null && view.getTag(r5.e.M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerI);
            }
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f99611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f99612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Interpolator f99613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f99614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f99615e = 1.0f;

        e(int i15, Interpolator interpolator, long j15) {
            this.f99611a = i15;
            this.f99613c = interpolator;
            this.f99614d = j15;
        }

        public float a() {
            return this.f99615e;
        }

        public long b() {
            return this.f99614d;
        }

        public float c() {
            Interpolator interpolator = this.f99613c;
            return interpolator != null ? interpolator.getInterpolation(this.f99612b) : this.f99612b;
        }

        public int d() {
            return this.f99611a;
        }

        public void e(float f15) {
            this.f99612b = f15;
        }
    }

    public a1(int i15, Interpolator interpolator, long j15) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f99581a = new d(i15, interpolator, j15);
        } else {
            this.f99581a = new c(i15, interpolator, j15);
        }
    }

    static void e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.i(view, bVar);
        } else {
            c.q(view, bVar);
        }
    }

    static a1 g(WindowInsetsAnimation windowInsetsAnimation) {
        return new a1(windowInsetsAnimation);
    }

    public float a() {
        return this.f99581a.a();
    }

    public long b() {
        return this.f99581a.b();
    }

    public float c() {
        return this.f99581a.c();
    }

    public int d() {
        return this.f99581a.d();
    }

    public void f(float f15) {
        this.f99581a.e(f15);
    }

    private static class d extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WindowInsetsAnimation f99606f;

        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f99607a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<a1> f99608b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList<a1> f99609c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, a1> f99610d;

            a(b bVar) {
                super(bVar.a());
                this.f99610d = new HashMap<>();
                this.f99607a = bVar;
            }

            private a1 a(WindowInsetsAnimation windowInsetsAnimation) {
                a1 a1Var = this.f99610d.get(windowInsetsAnimation);
                if (a1Var != null) {
                    return a1Var;
                }
                a1 a1VarG = a1.g(windowInsetsAnimation);
                this.f99610d.put(windowInsetsAnimation, a1VarG);
                return a1VarG;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f99607a.c(a(windowInsetsAnimation));
                this.f99610d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f99607a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<a1> arrayList = this.f99609c;
                if (arrayList == null) {
                    ArrayList<a1> arrayList2 = new ArrayList<>(list.size());
                    this.f99609c = arrayList2;
                    this.f99608b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = e1.a(list.get(size));
                    a1 a1VarA = a(windowInsetsAnimationA);
                    a1VarA.f(windowInsetsAnimationA.getFraction());
                    this.f99609c.add(a1VarA);
                }
                return this.f99607a.e(f1.y(windowInsets), this.f99608b).x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f99607a.f(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f99606f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds f(a aVar) {
            d1.a();
            return c1.a(aVar.a().f(), aVar.b().f());
        }

        public static x5.h g(WindowInsetsAnimation.Bounds bounds) {
            return x5.h.e(bounds.getUpperBound());
        }

        public static x5.h h(WindowInsetsAnimation.Bounds bounds) {
            return x5.h.e(bounds.getLowerBound());
        }

        public static void i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // j6.a1.e
        public float a() {
            return this.f99606f.getAlpha();
        }

        @Override // j6.a1.e
        public long b() {
            return this.f99606f.getDurationMillis();
        }

        @Override // j6.a1.e
        public float c() {
            return this.f99606f.getInterpolatedFraction();
        }

        @Override // j6.a1.e
        public int d() {
            return this.f99606f.getTypeMask();
        }

        @Override // j6.a1.e
        public void e(float f15) {
            this.f99606f.setFraction(f15);
        }

        d(int i15, Interpolator interpolator, long j15) {
            this(b1.a(i15, interpolator, j15));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x5.h f99582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x5.h f99583b;

        public a(x5.h hVar, x5.h hVar2) {
            this.f99582a = hVar;
            this.f99583b = hVar2;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public x5.h a() {
            return this.f99582a;
        }

        public x5.h b() {
            return this.f99583b;
        }

        public a c(x5.h hVar) {
            return new a(f1.o(this.f99582a, hVar.f216813a, hVar.f216814b, hVar.f216815c, hVar.f216816d), f1.o(this.f99583b, hVar.f216813a, hVar.f216814b, hVar.f216815c, hVar.f216816d));
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f99582a + " upper=" + this.f99583b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f99582a = d.h(bounds);
            this.f99583b = d.g(bounds);
        }
    }

    private a1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f99581a = new d(windowInsetsAnimation);
        }
    }
}
