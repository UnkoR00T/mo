package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class v20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f80 f34020a;

    private v20() {
    }

    public static f80 a() {
        f80 f80VarF;
        f80 f80Var = f34020a;
        if (f80Var != null) {
            return f80Var;
        }
        synchronized (v20.class) {
            try {
                f80VarF = f34020a;
                if (f80VarF == null) {
                    b80 b80VarI = f80.i(null, null);
                    b80VarI.c(d80.UNARY);
                    b80VarI.d(f80.h("google.internal.maps.mapsmobilesdks.v1.MapsMobileSDKsService", "GetSession"));
                    b80VarI.e(true);
                    b80VarI.a(gq0.a(q20.J()));
                    b80VarI.b(gq0.a(s20.J()));
                    f80VarF = b80VarI.f();
                    f34020a = f80VarF;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f80VarF;
    }

    public static u20 b(g40 g40Var) {
        return (u20) hq0.e(new t20(), g40Var, f40.f32247h);
    }
}
