package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class h20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f80 f32430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile f80 f32431b;

    private h20() {
    }

    public static f80 a() {
        f80 f80VarF;
        f80 f80Var = f32430a;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (h20.class) {
            try {
                f80VarF = f32430a;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "InitMapsJwt"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(k20.J()));
                    b80VarI.b(gq0.a(m20.K()));
                    f80VarF = b80VarI.f();
                    f32430a = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static f80 b() {
        f80 f80VarF;
        f80 f80Var = f32431b;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (h20.class) {
            try {
                f80VarF = f32431b;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "GetPlaceWidgetMetadata"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(e20.J()));
                    b80VarI.b(gq0.a(o20.J()));
                    f80VarF = b80VarI.f();
                    f32431b = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static g20 c(g40 g40Var) {
        return (g20) hq0.e(new f20(), g40Var, f40.f32247h);
    }
}
