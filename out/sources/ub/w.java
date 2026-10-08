package ub;

import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f197187a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile w f197188b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f197189c = 20;

    public static class a extends w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f197190d;

        public a(int i15) {
            super(i15);
            this.f197190d = i15;
        }

        @Override // ub.w
        public void a(String str, String str2) {
        }

        @Override // ub.w
        public void b(String str, String str2, Throwable th4) {
        }

        @Override // ub.w
        public void c(String str, String str2) {
            if (this.f197190d <= 6) {
                c2.e(str, str2);
            }
        }

        @Override // ub.w
        public void d(String str, String str2, Throwable th4) {
            if (this.f197190d <= 6) {
                c2.f(str, str2, th4);
            }
        }

        @Override // ub.w
        public void f(String str, String str2) {
        }

        @Override // ub.w
        public void g(String str, String str2, Throwable th4) {
        }

        @Override // ub.w
        public void j(String str, String str2) {
        }

        @Override // ub.w
        public void k(String str, String str2) {
            if (this.f197190d <= 5) {
                c2.g(str, str2);
            }
        }

        @Override // ub.w
        public void l(String str, String str2, Throwable th4) {
            if (this.f197190d <= 5) {
                c2.h(str, str2, th4);
            }
        }
    }

    public w(int i15) {
    }

    public static w e() {
        w wVar;
        synchronized (f197187a) {
            try {
                if (f197188b == null) {
                    f197188b = new a(3);
                }
                wVar = f197188b;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return wVar;
    }

    public static void h(w wVar) {
        synchronized (f197187a) {
            try {
                if (f197188b == null) {
                    f197188b = wVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append("WM-");
        int i15 = f197189c;
        if (length >= i15) {
            sb5.append(str.substring(0, i15));
        } else {
            sb5.append(str);
        }
        return sb5.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th4);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th4);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th4);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th4);
}
