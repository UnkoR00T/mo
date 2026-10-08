package j6;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import io.sentry.android.core.c2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f99644b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f99645a;

    private static class d extends c {
        d() {
        }

        @Override // j6.f1.g
        void c(int i15, x5.h hVar) {
            this.f99653c.setInsets(q.a(i15), hVar.f());
        }

        d(f1 f1Var) {
            super(f1Var);
        }
    }

    private static class e extends d {
        e() {
        }

        e(f1 f1Var) {
            super(f1Var);
        }
    }

    private static class f extends e {
        f() {
        }

        @Override // j6.f1.d, j6.f1.g
        void c(int i15, x5.h hVar) {
            this.f99653c.setInsets(r.a(i15), hVar.f());
        }

        f(f1 f1Var) {
            super(f1Var);
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f1 f99654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        x5.h[] f99655b;

        g() {
            this(new f1((f1) null));
        }

        protected final void a() {
            x5.h[] hVarArr = this.f99655b;
            if (hVarArr != null) {
                x5.h hVarF = hVarArr[p.e(1)];
                x5.h hVarF2 = this.f99655b[p.e(2)];
                if (hVarF2 == null) {
                    hVarF2 = this.f99654a.f(2);
                }
                if (hVarF == null) {
                    hVarF = this.f99654a.f(1);
                }
                g(x5.h.a(hVarF, hVarF2));
                x5.h hVar = this.f99655b[p.e(16)];
                if (hVar != null) {
                    f(hVar);
                }
                x5.h hVar2 = this.f99655b[p.e(32)];
                if (hVar2 != null) {
                    d(hVar2);
                }
                x5.h hVar3 = this.f99655b[p.e(64)];
                if (hVar3 != null) {
                    h(hVar3);
                }
            }
        }

        f1 b() {
            throw null;
        }

        void c(int i15, x5.h hVar) {
            if (this.f99655b == null) {
                this.f99655b = new x5.h[10];
            }
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i15 & i16) != 0) {
                    this.f99655b[p.e(i16)] = hVar;
                }
            }
        }

        void d(x5.h hVar) {
        }

        void e(x5.h hVar) {
            throw null;
        }

        void f(x5.h hVar) {
        }

        void g(x5.h hVar) {
            throw null;
        }

        void h(x5.h hVar) {
        }

        g(f1 f1Var) {
            this.f99654a = f1Var;
        }
    }

    private static class j extends i {
        j(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var, windowInsets);
        }

        @Override // j6.f1.o
        f1 a() {
            return f1.y(this.f99661c.consumeDisplayCutout());
        }

        @Override // j6.f1.h, j6.f1.o
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f99661c, jVar.f99661c) && Objects.equals(this.f99665g, jVar.f99665g) && h.C(this.f99666h, jVar.f99666h);
        }

        @Override // j6.f1.o
        j6.j f() {
            return j6.j.h(this.f99661c.getDisplayCutout());
        }

        @Override // j6.f1.o
        public int hashCode() {
            return this.f99661c.hashCode();
        }

        j(f1 f1Var, j jVar) {
            super(f1Var, jVar);
        }
    }

    private static class l extends k {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final f1 f99671r = f1.y(WindowInsets.CONSUMED);

        l(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var, windowInsets);
        }

        @Override // j6.f1.h, j6.f1.o
        final void d(View view) {
        }

        @Override // j6.f1.h, j6.f1.o
        public x5.h g(int i15) {
            return x5.h.e(this.f99661c.getInsets(q.a(i15)));
        }

        @Override // j6.f1.h, j6.f1.o
        public x5.h h(int i15) {
            return x5.h.e(this.f99661c.getInsetsIgnoringVisibility(q.a(i15)));
        }

        @Override // j6.f1.h, j6.f1.o
        public boolean q(int i15) {
            return this.f99661c.isVisible(q.a(i15));
        }

        l(f1 f1Var, l lVar) {
            super(f1Var, lVar);
        }
    }

    private static class m extends l {
        m(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var, windowInsets);
        }

        m(f1 f1Var, m mVar) {
            super(f1Var, mVar);
        }
    }

    private static class n extends m {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final f1 f99672s = f1.y(WindowInsets.CONSUMED);

        n(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var, windowInsets);
        }

        @Override // j6.f1.l, j6.f1.h, j6.f1.o
        public x5.h g(int i15) {
            return x5.h.e(this.f99661c.getInsets(r.a(i15)));
        }

        @Override // j6.f1.l, j6.f1.h, j6.f1.o
        public x5.h h(int i15) {
            return x5.h.e(this.f99661c.getInsetsIgnoringVisibility(r.a(i15)));
        }

        @Override // j6.f1.l, j6.f1.h, j6.f1.o
        public boolean q(int i15) {
            return this.f99661c.isVisible(r.a(i15));
        }

        n(f1 f1Var, n nVar) {
            super(f1Var, nVar);
        }
    }

    private static class o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f1 f99673b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f1 f99674a;

        o(f1 f1Var) {
            this.f99674a = f1Var;
        }

        f1 a() {
            return this.f99674a;
        }

        f1 b() {
            return this.f99674a;
        }

        f1 c() {
            return this.f99674a;
        }

        void d(View view) {
        }

        void e(f1 f1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p() == oVar.p() && o() == oVar.o() && i6.c.a(l(), oVar.l()) && i6.c.a(j(), oVar.j()) && i6.c.a(f(), oVar.f());
        }

        j6.j f() {
            return null;
        }

        x5.h g(int i15) {
            return x5.h.f216812e;
        }

        x5.h h(int i15) {
            if ((i15 & 8) == 0) {
                return x5.h.f216812e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return i6.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        x5.h i() {
            return l();
        }

        x5.h j() {
            return x5.h.f216812e;
        }

        x5.h k() {
            return l();
        }

        x5.h l() {
            return x5.h.f216812e;
        }

        x5.h m() {
            return l();
        }

        f1 n(int i15, int i16, int i17, int i18) {
            return f99673b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i15) {
            return true;
        }

        public void r(x5.h[] hVarArr) {
        }

        void s(x5.h hVar) {
        }

        void t(f1 f1Var) {
        }

        public void u(x5.h hVar) {
        }

        void v(int i15) {
        }
    }

    public static final class p {
        @SuppressLint({"WrongConstant"})
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i15) {
            if (i15 == 1) {
                return 0;
            }
            if (i15 == 2) {
                return 1;
            }
            if (i15 == 4) {
                return 2;
            }
            if (i15 == 8) {
                return 3;
            }
            if (i15 == 16) {
                return 4;
            }
            if (i15 == 32) {
                return 5;
            }
            if (i15 == 64) {
                return 6;
            }
            if (i15 == 128) {
                return 7;
            }
            if (i15 == 256) {
                return 8;
            }
            if (i15 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i15);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 519;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    private static final class q {
        static int a(int i15) {
            int iStatusBars;
            int i16 = 0;
            for (int i17 = 1; i17 <= 512; i17 <<= 1) {
                if ((i15 & i17) != 0) {
                    if (i17 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i17 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i17 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i17 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i17 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i17 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i17 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i17 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i16 |= iStatusBars;
                }
            }
            return i16;
        }
    }

    private static final class r {
        static int a(int i15) {
            int iStatusBars;
            int i16 = 0;
            for (int i17 = 1; i17 <= 512; i17 <<= 1) {
                if ((i15 & i17) != 0) {
                    if (i17 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i17 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i17 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i17 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i17 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i17 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i17 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i17 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i17 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i16 |= iStatusBars;
                }
            }
            return i16;
        }
    }

    static {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            f99644b = n.f99672s;
        } else if (i15 >= 30) {
            f99644b = l.f99671r;
        } else {
            f99644b = o.f99673b;
        }
    }

    private f1(WindowInsets windowInsets) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            this.f99645a = new n(this, windowInsets);
            return;
        }
        if (i15 >= 31) {
            this.f99645a = new m(this, windowInsets);
            return;
        }
        if (i15 >= 30) {
            this.f99645a = new l(this, windowInsets);
            return;
        }
        if (i15 >= 29) {
            this.f99645a = new k(this, windowInsets);
        } else if (i15 >= 28) {
            this.f99645a = new j(this, windowInsets);
        } else {
            this.f99645a = new i(this, windowInsets);
        }
    }

    static x5.h o(x5.h hVar, int i15, int i16, int i17, int i18) {
        int iMax = Math.max(0, hVar.f216813a - i15);
        int iMax2 = Math.max(0, hVar.f216814b - i16);
        int iMax3 = Math.max(0, hVar.f216815c - i17);
        int iMax4 = Math.max(0, hVar.f216816d - i18);
        return (iMax == i15 && iMax2 == i16 && iMax3 == i17 && iMax4 == i18) ? hVar : x5.h.c(iMax, iMax2, iMax3, iMax4);
    }

    public static f1 y(WindowInsets windowInsets) {
        return z(windowInsets, null);
    }

    public static f1 z(WindowInsets windowInsets, View view) {
        f1 f1Var = new f1((WindowInsets) i6.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            f1Var.u(l0.C(view));
            f1Var.d(view.getRootView());
            f1Var.w(view.getWindowSystemUiVisibility());
        }
        return f1Var;
    }

    @Deprecated
    public f1 a() {
        return this.f99645a.a();
    }

    @Deprecated
    public f1 b() {
        return this.f99645a.b();
    }

    @Deprecated
    public f1 c() {
        return this.f99645a.c();
    }

    void d(View view) {
        this.f99645a.d(view);
    }

    public j6.j e() {
        return this.f99645a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return i6.c.a(this.f99645a, ((f1) obj).f99645a);
        }
        return false;
    }

    public x5.h f(int i15) {
        return this.f99645a.g(i15);
    }

    public x5.h g(int i15) {
        return this.f99645a.h(i15);
    }

    @Deprecated
    public x5.h h() {
        return this.f99645a.j();
    }

    public int hashCode() {
        o oVar = this.f99645a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f99645a.l().f216816d;
    }

    @Deprecated
    public int j() {
        return this.f99645a.l().f216813a;
    }

    @Deprecated
    public int k() {
        return this.f99645a.l().f216815c;
    }

    @Deprecated
    public int l() {
        return this.f99645a.l().f216814b;
    }

    public boolean m() {
        x5.h hVarF = f(p.a());
        x5.h hVar = x5.h.f216812e;
        return (hVarF.equals(hVar) && g(p.a() ^ p.d()).equals(hVar) && e() == null) ? false : true;
    }

    public f1 n(int i15, int i16, int i17, int i18) {
        return this.f99645a.n(i15, i16, i17, i18);
    }

    public boolean p() {
        return this.f99645a.o();
    }

    public boolean q(int i15) {
        return this.f99645a.q(i15);
    }

    @Deprecated
    public f1 r(int i15, int i16, int i17, int i18) {
        return new a(this).d(x5.h.c(i15, i16, i17, i18)).a();
    }

    void s(x5.h[] hVarArr) {
        this.f99645a.r(hVarArr);
    }

    void t(x5.h hVar) {
        this.f99645a.s(hVar);
    }

    void u(f1 f1Var) {
        this.f99645a.t(f1Var);
    }

    void v(x5.h hVar) {
        this.f99645a.u(hVar);
    }

    void w(int i15) {
        this.f99645a.v(i15);
    }

    public WindowInsets x() {
        o oVar = this.f99645a;
        if (oVar instanceof h) {
            return ((h) oVar).f99661c;
        }
        return null;
    }

    private static class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f99647e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f99648f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f99649g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f99650h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f99651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x5.h f99652d;

        b() {
            this.f99651c = i();
        }

        private static WindowInsets i() {
            if (!f99648f) {
                try {
                    f99647e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f99648f = true;
            }
            Field field = f99647e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f99650h) {
                try {
                    f99649g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f99650h = true;
            }
            Constructor<WindowInsets> constructor = f99649g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // j6.f1.g
        f1 b() {
            a();
            f1 f1VarY = f1.y(this.f99651c);
            f1VarY.s(this.f99655b);
            f1VarY.v(this.f99652d);
            return f1VarY;
        }

        @Override // j6.f1.g
        void e(x5.h hVar) {
            this.f99652d = hVar;
        }

        @Override // j6.f1.g
        void g(x5.h hVar) {
            WindowInsets windowInsets = this.f99651c;
            if (windowInsets != null) {
                this.f99651c = windowInsets.replaceSystemWindowInsets(hVar.f216813a, hVar.f216814b, hVar.f216815c, hVar.f216816d);
            }
        }

        b(f1 f1Var) {
            super(f1Var);
            this.f99651c = f1Var.x();
        }
    }

    private static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f99653c;

        c() {
            this.f99653c = g6.e.a();
        }

        @Override // j6.f1.g
        f1 b() {
            a();
            f1 f1VarY = f1.y(this.f99653c.build());
            f1VarY.s(this.f99655b);
            return f1VarY;
        }

        @Override // j6.f1.g
        void d(x5.h hVar) {
            this.f99653c.setMandatorySystemGestureInsets(hVar.f());
        }

        @Override // j6.f1.g
        void e(x5.h hVar) {
            this.f99653c.setStableInsets(hVar.f());
        }

        @Override // j6.f1.g
        void f(x5.h hVar) {
            this.f99653c.setSystemGestureInsets(hVar.f());
        }

        @Override // j6.f1.g
        void g(x5.h hVar) {
            this.f99653c.setSystemWindowInsets(hVar.f());
        }

        @Override // j6.f1.g
        void h(x5.h hVar) {
            this.f99653c.setTappableElementInsets(hVar.f());
        }

        c(f1 f1Var) {
            WindowInsets.Builder builderA;
            super(f1Var);
            WindowInsets windowInsetsX = f1Var.x();
            if (windowInsetsX != null) {
                builderA = g1.a(windowInsetsX);
            } else {
                builderA = g6.e.a();
            }
            this.f99653c = builderA;
        }
    }

    private static class i extends h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private x5.h f99667n;

        i(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var, windowInsets);
            this.f99667n = null;
        }

        @Override // j6.f1.o
        f1 b() {
            return f1.y(this.f99661c.consumeStableInsets());
        }

        @Override // j6.f1.o
        f1 c() {
            return f1.y(this.f99661c.consumeSystemWindowInsets());
        }

        @Override // j6.f1.o
        final x5.h j() {
            if (this.f99667n == null) {
                this.f99667n = x5.h.c(this.f99661c.getStableInsetLeft(), this.f99661c.getStableInsetTop(), this.f99661c.getStableInsetRight(), this.f99661c.getStableInsetBottom());
            }
            return this.f99667n;
        }

        @Override // j6.f1.o
        boolean o() {
            return this.f99661c.isConsumed();
        }

        @Override // j6.f1.o
        public void u(x5.h hVar) {
            this.f99667n = hVar;
        }

        i(f1 f1Var, i iVar) {
            super(f1Var, iVar);
            this.f99667n = null;
            this.f99667n = iVar.f99667n;
        }
    }

    private static class h extends o {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f99656i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Method f99657j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Class<?> f99658k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f99659l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static Field f99660m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f99661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x5.h[] f99662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x5.h f99663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private f1 f99664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        x5.h f99665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f99666h;

        h(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var);
            this.f99663e = null;
            this.f99661c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void B() {
            try {
                f99657j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f99658k = cls;
                f99659l = cls.getDeclaredField("mVisibleInsets");
                f99660m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f99659l.setAccessible(true);
                f99660m.setAccessible(true);
            } catch (ReflectiveOperationException e15) {
                c2.f("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e15.getMessage(), e15);
            }
            f99656i = true;
        }

        static boolean C(int i15, int i16) {
            return (i15 & 6) == (i16 & 6);
        }

        @SuppressLint({"WrongConstant"})
        private x5.h w(int i15, boolean z15) {
            x5.h hVarA = x5.h.f216812e;
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i15 & i16) != 0) {
                    hVarA = x5.h.a(hVarA, x(i16, z15));
                }
            }
            return hVarA;
        }

        private x5.h y() {
            f1 f1Var = this.f99664f;
            return f1Var != null ? f1Var.h() : x5.h.f216812e;
        }

        private x5.h z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f99656i) {
                B();
            }
            Method method = f99657j;
            if (method != null && f99658k != null && f99659l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        c2.h("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f99659l.get(f99660m.get(objInvoke));
                    if (rect != null) {
                        return x5.h.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e15) {
                    c2.f("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e15.getMessage(), e15);
                }
            }
            return null;
        }

        protected boolean A(int i15) {
            if (i15 != 1 && i15 != 2) {
                if (i15 == 4) {
                    return false;
                }
                if (i15 != 8 && i15 != 128) {
                    return true;
                }
            }
            return !x(i15, false).equals(x5.h.f216812e);
        }

        @Override // j6.f1.o
        void d(View view) {
            x5.h hVarZ = z(view);
            if (hVarZ == null) {
                hVarZ = x5.h.f216812e;
            }
            s(hVarZ);
        }

        @Override // j6.f1.o
        void e(f1 f1Var) {
            f1Var.u(this.f99664f);
            f1Var.t(this.f99665g);
            f1Var.w(this.f99666h);
        }

        @Override // j6.f1.o
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f99665g, hVar.f99665g) && C(this.f99666h, hVar.f99666h);
        }

        @Override // j6.f1.o
        public x5.h g(int i15) {
            return w(i15, false);
        }

        @Override // j6.f1.o
        public x5.h h(int i15) {
            return w(i15, true);
        }

        @Override // j6.f1.o
        final x5.h l() {
            if (this.f99663e == null) {
                this.f99663e = x5.h.c(this.f99661c.getSystemWindowInsetLeft(), this.f99661c.getSystemWindowInsetTop(), this.f99661c.getSystemWindowInsetRight(), this.f99661c.getSystemWindowInsetBottom());
            }
            return this.f99663e;
        }

        @Override // j6.f1.o
        f1 n(int i15, int i16, int i17, int i18) {
            a aVar = new a(f1.y(this.f99661c));
            aVar.d(f1.o(l(), i15, i16, i17, i18));
            aVar.c(f1.o(j(), i15, i16, i17, i18));
            return aVar.a();
        }

        @Override // j6.f1.o
        boolean p() {
            return this.f99661c.isRound();
        }

        @Override // j6.f1.o
        @SuppressLint({"WrongConstant"})
        boolean q(int i15) {
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i15 & i16) != 0 && !A(i16)) {
                    return false;
                }
            }
            return true;
        }

        @Override // j6.f1.o
        public void r(x5.h[] hVarArr) {
            this.f99662d = hVarArr;
        }

        @Override // j6.f1.o
        void s(x5.h hVar) {
            this.f99665g = hVar;
        }

        @Override // j6.f1.o
        void t(f1 f1Var) {
            this.f99664f = f1Var;
        }

        @Override // j6.f1.o
        void v(int i15) {
            this.f99666h = i15;
        }

        protected x5.h x(int i15, boolean z15) {
            x5.h hVarH;
            int i16;
            if (i15 == 1) {
                if (z15) {
                    return x5.h.c(0, Math.max(y().f216814b, l().f216814b), 0, 0);
                }
                return (this.f99666h & 4) != 0 ? x5.h.f216812e : x5.h.c(0, l().f216814b, 0, 0);
            }
            if (i15 == 2) {
                if (z15) {
                    x5.h hVarY = y();
                    x5.h hVarJ = j();
                    return x5.h.c(Math.max(hVarY.f216813a, hVarJ.f216813a), 0, Math.max(hVarY.f216815c, hVarJ.f216815c), Math.max(hVarY.f216816d, hVarJ.f216816d));
                }
                if ((this.f99666h & 2) != 0) {
                    return x5.h.f216812e;
                }
                x5.h hVarL = l();
                f1 f1Var = this.f99664f;
                hVarH = f1Var != null ? f1Var.h() : null;
                int iMin = hVarL.f216816d;
                if (hVarH != null) {
                    iMin = Math.min(iMin, hVarH.f216816d);
                }
                return x5.h.c(hVarL.f216813a, 0, hVarL.f216815c, iMin);
            }
            if (i15 != 8) {
                if (i15 == 16) {
                    return k();
                }
                if (i15 == 32) {
                    return i();
                }
                if (i15 == 64) {
                    return m();
                }
                if (i15 != 128) {
                    return x5.h.f216812e;
                }
                f1 f1Var2 = this.f99664f;
                j6.j jVarE = f1Var2 != null ? f1Var2.e() : f();
                return jVarE != null ? x5.h.c(jVarE.d(), jVarE.f(), jVarE.e(), jVarE.c()) : x5.h.f216812e;
            }
            x5.h[] hVarArr = this.f99662d;
            hVarH = hVarArr != null ? hVarArr[p.e(8)] : null;
            if (hVarH != null) {
                return hVarH;
            }
            x5.h hVarL2 = l();
            x5.h hVarY2 = y();
            int i17 = hVarL2.f216816d;
            if (i17 > hVarY2.f216816d) {
                return x5.h.c(0, 0, 0, i17);
            }
            x5.h hVar = this.f99665g;
            return (hVar == null || hVar.equals(x5.h.f216812e) || (i16 = this.f99665g.f216816d) <= hVarY2.f216816d) ? x5.h.f216812e : x5.h.c(0, 0, 0, i16);
        }

        h(f1 f1Var, h hVar) {
            this(f1Var, new WindowInsets(hVar.f99661c));
        }
    }

    private static class k extends j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private x5.h f99668o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private x5.h f99669p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private x5.h f99670q;

        k(f1 f1Var, WindowInsets windowInsets) {
            super(f1Var, windowInsets);
            this.f99668o = null;
            this.f99669p = null;
            this.f99670q = null;
        }

        @Override // j6.f1.o
        x5.h i() {
            if (this.f99669p == null) {
                this.f99669p = x5.h.e(this.f99661c.getMandatorySystemGestureInsets());
            }
            return this.f99669p;
        }

        @Override // j6.f1.o
        x5.h k() {
            if (this.f99668o == null) {
                this.f99668o = x5.h.e(this.f99661c.getSystemGestureInsets());
            }
            return this.f99668o;
        }

        @Override // j6.f1.o
        x5.h m() {
            if (this.f99670q == null) {
                this.f99670q = x5.h.e(this.f99661c.getTappableElementInsets());
            }
            return this.f99670q;
        }

        @Override // j6.f1.h, j6.f1.o
        f1 n(int i15, int i16, int i17, int i18) {
            return f1.y(this.f99661c.inset(i15, i16, i17, i18));
        }

        @Override // j6.f1.i, j6.f1.o
        public void u(x5.h hVar) {
        }

        k(f1 f1Var, k kVar) {
            super(f1Var, kVar);
            this.f99668o = null;
            this.f99669p = null;
            this.f99670q = null;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f99646a;

        public a() {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                this.f99646a = new f();
                return;
            }
            if (i15 >= 31) {
                this.f99646a = new e();
                return;
            }
            if (i15 >= 30) {
                this.f99646a = new d();
            } else if (i15 >= 29) {
                this.f99646a = new c();
            } else {
                this.f99646a = new b();
            }
        }

        public f1 a() {
            return this.f99646a.b();
        }

        public a b(int i15, x5.h hVar) {
            this.f99646a.c(i15, hVar);
            return this;
        }

        @Deprecated
        public a c(x5.h hVar) {
            this.f99646a.e(hVar);
            return this;
        }

        @Deprecated
        public a d(x5.h hVar) {
            this.f99646a.g(hVar);
            return this;
        }

        public a(f1 f1Var) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                this.f99646a = new f(f1Var);
                return;
            }
            if (i15 >= 31) {
                this.f99646a = new e(f1Var);
                return;
            }
            if (i15 >= 30) {
                this.f99646a = new d(f1Var);
            } else if (i15 >= 29) {
                this.f99646a = new c(f1Var);
            } else {
                this.f99646a = new b(f1Var);
            }
        }
    }

    public f1(f1 f1Var) {
        if (f1Var != null) {
            o oVar = f1Var.f99645a;
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34 && (oVar instanceof n)) {
                this.f99645a = new n(this, (n) oVar);
            } else if (i15 >= 31 && (oVar instanceof m)) {
                this.f99645a = new m(this, (m) oVar);
            } else if (i15 >= 30 && (oVar instanceof l)) {
                this.f99645a = new l(this, (l) oVar);
            } else if (i15 >= 29 && (oVar instanceof k)) {
                this.f99645a = new k(this, (k) oVar);
            } else if (i15 >= 28 && (oVar instanceof j)) {
                this.f99645a = new j(this, (j) oVar);
            } else if (oVar instanceof i) {
                this.f99645a = new i(this, (i) oVar);
            } else if (oVar instanceof h) {
                this.f99645a = new h(this, (h) oVar);
            } else {
                this.f99645a = new o(this);
            }
            oVar.e(this);
            return;
        }
        this.f99645a = new o(this);
    }
}
