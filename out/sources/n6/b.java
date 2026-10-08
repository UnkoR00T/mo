package n6;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import x5.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Interpolator f132329l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Interpolator f132330m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Interpolator f132331n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Interpolator f132332o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f132333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f132334b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f132335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f132336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f132337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f132338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f132339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f132340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f132341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ValueAnimator f132342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ValueAnimator f132343k;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f132344a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f132345b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f132346c = h.f216812e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f132347d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Drawable f132348e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f132349f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f132350g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f132351h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private InterfaceC3287a f132352i;

        /* JADX INFO: renamed from: n6.b$a$a, reason: collision with other inner class name */
        interface InterfaceC3287a {
            default void a(int i15) {
            }

            default void b(boolean z15) {
            }

            default void c(float f15) {
            }

            default void d(int i15) {
            }

            default void e(float f15) {
            }

            default void f(float f15) {
            }

            default void g(Drawable drawable) {
            }

            default void h(h hVar) {
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A(int i15) {
            if (this.f132344a != i15) {
                this.f132344a = i15;
                InterfaceC3287a interfaceC3287a = this.f132352i;
                if (interfaceC3287a != null) {
                    interfaceC3287a.d(i15);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f15) {
            if (this.f132351h != f15) {
                this.f132351h = f15;
                InterfaceC3287a interfaceC3287a = this.f132352i;
                if (interfaceC3287a != null) {
                    interfaceC3287a.c(f15);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(Drawable drawable) {
            this.f132348e = drawable;
            InterfaceC3287a interfaceC3287a = this.f132352i;
            if (interfaceC3287a != null) {
                interfaceC3287a.g(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(int i15) {
            if (this.f132345b != i15) {
                this.f132345b = i15;
                InterfaceC3287a interfaceC3287a = this.f132352i;
                if (interfaceC3287a != null) {
                    interfaceC3287a.a(i15);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(h hVar) {
            if (this.f132346c.equals(hVar)) {
                return;
            }
            this.f132346c = hVar;
            InterfaceC3287a interfaceC3287a = this.f132352i;
            if (interfaceC3287a != null) {
                interfaceC3287a.h(hVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x(float f15) {
            if (this.f132349f != f15) {
                this.f132349f = f15;
                InterfaceC3287a interfaceC3287a = this.f132352i;
                if (interfaceC3287a != null) {
                    interfaceC3287a.e(f15);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(float f15) {
            if (this.f132350g != f15) {
                this.f132350g = f15;
                InterfaceC3287a interfaceC3287a = this.f132352i;
                if (interfaceC3287a != null) {
                    interfaceC3287a.f(f15);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(boolean z15) {
            if (this.f132347d != z15) {
                this.f132347d = z15;
                InterfaceC3287a interfaceC3287a = this.f132352i;
                if (interfaceC3287a != null) {
                    interfaceC3287a.b(z15);
                }
            }
        }

        float k() {
            return this.f132351h;
        }

        Drawable l() {
            return this.f132348e;
        }

        int m() {
            return this.f132345b;
        }

        h n() {
            return this.f132346c;
        }

        float o() {
            return this.f132349f;
        }

        float p() {
            return this.f132350g;
        }

        int q() {
            return this.f132344a;
        }

        boolean r() {
            return this.f132347d;
        }

        void t(InterfaceC3287a interfaceC3287a) {
            if (this.f132352i != null && interfaceC3287a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.f132352i = interfaceC3287a;
        }
    }

    public b(int i15) {
        h hVar = h.f216812e;
        this.f132335c = hVar;
        this.f132336d = hVar;
        this.f132337e = 1.0f;
        this.f132338f = 1.0f;
        this.f132339g = 1.0f;
        this.f132340h = 1.0f;
        this.f132341i = null;
        this.f132342j = null;
        this.f132343k = null;
        if (i15 == 1 || i15 == 2 || i15 == 4 || i15 == 8) {
            this.f132333a = i15;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i15);
    }

    private void m() {
        this.f132334b.s(this.f132337e * this.f132338f);
    }

    private void n() {
        float f15 = this.f132340h * this.f132339g;
        int i15 = this.f132333a;
        if (i15 == 1) {
            a aVar = this.f132334b;
            aVar.x((-(1.0f - f15)) * aVar.f132344a);
            return;
        }
        if (i15 == 2) {
            a aVar2 = this.f132334b;
            aVar2.y((-(1.0f - f15)) * aVar2.f132345b);
        } else if (i15 == 4) {
            a aVar3 = this.f132334b;
            aVar3.x((1.0f - f15) * aVar3.f132344a);
        } else {
            if (i15 != 8) {
                return;
            }
            a aVar4 = this.f132334b;
            aVar4.y((1.0f - f15) * aVar4.f132345b);
        }
    }

    void a(int i15) {
    }

    h b(h hVar, h hVar2, h hVar3) {
        this.f132335c = hVar;
        this.f132336d = hVar2;
        this.f132334b.w(hVar3);
        return o();
    }

    a c() {
        return this.f132334b;
    }

    Object d() {
        return this.f132341i;
    }

    public int e() {
        return this.f132333a;
    }

    int f(int i15) {
        return i15;
    }

    boolean g() {
        return false;
    }

    void h(Object obj) {
        this.f132341i = obj;
    }

    void i(Drawable drawable) {
        this.f132334b.u(drawable);
    }

    void j(float f15) {
        this.f132337e = f15;
        m();
    }

    void k(float f15) {
        this.f132339g = f15;
        n();
    }

    void l(boolean z15) {
        this.f132334b.z(z15);
    }

    h o() {
        int i15;
        h hVarC = h.f216812e;
        int i16 = this.f132333a;
        if (i16 == 1) {
            i15 = this.f132335c.f216813a;
            this.f132334b.A(f(this.f132336d.f216813a));
            if (g()) {
                hVarC = h.c(f(i15), 0, 0, 0);
            }
        } else if (i16 == 2) {
            i15 = this.f132335c.f216814b;
            this.f132334b.v(f(this.f132336d.f216814b));
            if (g()) {
                hVarC = h.c(0, f(i15), 0, 0);
            }
        } else if (i16 == 4) {
            i15 = this.f132335c.f216815c;
            this.f132334b.A(f(this.f132336d.f216815c));
            if (g()) {
                hVarC = h.c(0, 0, f(i15), 0);
            }
        } else if (i16 != 8) {
            i15 = 0;
        } else {
            i15 = this.f132335c.f216816d;
            this.f132334b.v(f(this.f132336d.f216816d));
            if (g()) {
                hVarC = h.c(0, 0, 0, f(i15));
            }
        }
        l(i15 > 0);
        j(i15 > 0 ? 1.0f : 0.0f);
        k(i15 > 0 ? 1.0f : 0.0f);
        return hVarC;
    }
}
