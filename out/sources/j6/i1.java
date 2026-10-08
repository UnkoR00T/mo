package j6;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.l1;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99690a;

    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f99691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f99692b;

        a(Window window, f0 f0Var) {
            this.f99691a = window;
            this.f99692b = f0Var;
        }

        private void f(int i15) {
            if (i15 == 1) {
                g(4);
                h(1024);
            } else if (i15 == 2) {
                g(2);
            } else {
                if (i15 != 8) {
                    return;
                }
                this.f99692b.b();
            }
        }

        @Override // j6.i1.g
        void c(int i15) {
            for (int i16 = 1; i16 <= 512; i16 <<= 1) {
                if ((i15 & i16) != 0) {
                    f(i16);
                }
            }
        }

        protected void d(int i15) {
            View decorView = this.f99691a.getDecorView();
            decorView.setSystemUiVisibility(i15 | decorView.getSystemUiVisibility());
        }

        protected void e(int i15) {
            this.f99691a.addFlags(i15);
        }

        protected void g(int i15) {
            View decorView = this.f99691a.getDecorView();
            decorView.setSystemUiVisibility((~i15) & decorView.getSystemUiVisibility());
        }

        protected void h(int i15) {
            this.f99691a.clearFlags(i15);
        }
    }

    private static class b extends a {
        b(Window window, f0 f0Var) {
            super(window, f0Var);
        }

        @Override // j6.i1.g
        public void b(boolean z15) {
            if (!z15) {
                g(PKIFailureInfo.certRevoked);
                return;
            }
            h(67108864);
            e(PKIFailureInfo.systemUnavail);
            d(PKIFailureInfo.certRevoked);
        }
    }

    private static class c extends b {
        c(Window window, f0 f0Var) {
            super(window, f0Var);
        }

        @Override // j6.i1.g
        public void a(boolean z15) {
            if (!z15) {
                g(16);
                return;
            }
            h(134217728);
            e(PKIFailureInfo.systemUnavail);
            d(16);
        }
    }

    private static class e extends d {
        e(Window window, i1 i1Var, f0 f0Var) {
            super(window, i1Var, f0Var);
        }

        e(WindowInsetsController windowInsetsController, i1 i1Var, f0 f0Var) {
            super(windowInsetsController, i1Var, f0Var);
        }
    }

    private static class f extends e {
        f(Window window, i1 i1Var, f0 f0Var) {
            super(window, i1Var, f0Var);
        }

        f(WindowInsetsController windowInsetsController, i1 i1Var, f0 f0Var) {
            super(windowInsetsController, i1Var, f0Var);
        }
    }

    private static class g {
        g() {
        }

        public void a(boolean z15) {
            throw null;
        }

        public void b(boolean z15) {
            throw null;
        }

        void c(int i15) {
            throw null;
        }
    }

    @Deprecated
    private i1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f99690a = new f(windowInsetsController, this, new f0(windowInsetsController));
        } else {
            this.f99690a = new d(windowInsetsController, this, new f0(windowInsetsController));
        }
    }

    @Deprecated
    public static i1 d(WindowInsetsController windowInsetsController) {
        return new i1(windowInsetsController);
    }

    public void a(boolean z15) {
        this.f99690a.a(z15);
    }

    public void b(boolean z15) {
        this.f99690a.b(z15);
    }

    public void c(int i15) {
        this.f99690a.c(i15);
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i1 f99693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f99694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final f0 f99695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l1<Object, WindowInsetsController.OnControllableInsetsChangedListener> f99696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f99697e;

        d(Window window, i1 i1Var, f0 f0Var) {
            this(window.getInsetsController(), i1Var, f0Var);
            this.f99697e = window;
        }

        @Override // j6.i1.g
        public void a(boolean z15) {
            if (z15) {
                if (this.f99697e != null) {
                    d(16);
                }
                this.f99694b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f99697e != null) {
                    e(16);
                }
                this.f99694b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // j6.i1.g
        public void b(boolean z15) {
            if (z15) {
                if (this.f99697e != null) {
                    d(PKIFailureInfo.certRevoked);
                }
                this.f99694b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f99697e != null) {
                    e(PKIFailureInfo.certRevoked);
                }
                this.f99694b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // j6.i1.g
        void c(int i15) {
            if ((i15 & 8) != 0) {
                this.f99695c.b();
            }
            this.f99694b.show(i15 & (-9));
        }

        protected void d(int i15) {
            View decorView = this.f99697e.getDecorView();
            decorView.setSystemUiVisibility(i15 | decorView.getSystemUiVisibility());
        }

        protected void e(int i15) {
            View decorView = this.f99697e.getDecorView();
            decorView.setSystemUiVisibility((~i15) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, i1 i1Var, f0 f0Var) {
            this.f99696d = new l1<>();
            this.f99694b = windowInsetsController;
            this.f99693a = i1Var;
            this.f99695c = f0Var;
        }
    }

    public i1(Window window, View view) {
        f0 f0Var = new f0(view);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 35) {
            this.f99690a = new f(window, this, f0Var);
        } else if (i15 >= 30) {
            this.f99690a = new d(window, this, f0Var);
        } else {
            this.f99690a = new c(window, f0Var);
        }
    }
}
