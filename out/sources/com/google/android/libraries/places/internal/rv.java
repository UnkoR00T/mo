package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f80 f33597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile f80 f33598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile f80 f33599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile f80 f33600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile f80 f33601e;

    private rv() {
    }

    public static f80 a() {
        f80 f80VarF;
        f80 f80Var = f33597a;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (rv.class) {
            try {
                f80VarF = f33597a;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.maps.places.v1.Places", "SearchNearby"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(pw.J()));
                    b80VarI.b(gq0.a(rw.K()));
                    f80VarF = b80VarI.f();
                    f33597a = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static f80 b() {
        f80 f80VarF;
        f80 f80Var = f33598b;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (rv.class) {
            try {
                f80VarF = f33598b;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.maps.places.v1.Places", "SearchText"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(bx.J()));
                    b80VarI.b(gq0.a(dx.M()));
                    f80VarF = b80VarI.f();
                    f33598b = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static f80 c() {
        f80 f80VarF;
        f80 f80Var = f33599c;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (rv.class) {
            try {
                f80VarF = f33599c;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.maps.places.v1.Places", "GetPhotoMedia"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(ht.J()));
                    b80VarI.b(gq0.a(st.J()));
                    f80VarF = b80VarI.f();
                    f33599c = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static f80 d() {
        f80 f80VarF;
        f80 f80Var = f33600d;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (rv.class) {
            try {
                f80VarF = f33600d;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.maps.places.v1.Places", "GetPlace"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(kt.J()));
                    b80VarI.b(gq0.a(ov.A1()));
                    f80VarF = b80VarI.f();
                    f33600d = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static f80 e() {
        f80 f80VarF;
        f80 f80Var = f33601e;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (rv.class) {
            try {
                f80VarF = f33601e;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.maps.places.v1.Places", "AutocompletePlaces"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(hr.J()));
                    b80VarI.b(gq0.a(vr.J()));
                    f80VarF = b80VarI.f();
                    f33601e = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static qv f(g40 g40Var) {
        return (qv) hq0.e(new pv(), g40Var, f40.f32247h);
    }
}
