package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class h10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f32428a = 100;

    h10() {
    }

    abstract void a(Object obj, int i15, long j15);

    abstract void b(Object obj, int i15, int i16);

    abstract void c(Object obj, int i15, long j15);

    abstract void d(Object obj, int i15, tx txVar);

    abstract void e(Object obj, int i15, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract Object h(Object obj);

    abstract void i(Object obj, Object obj2);

    abstract void j(Object obj);

    final boolean k(Object obj, u00 u00Var, int i15) throws lz {
        int iA = u00Var.a();
        int i16 = iA >>> 3;
        int i17 = iA & 7;
        if (i17 == 0) {
            a(obj, i16, u00Var.j());
            return true;
        }
        if (i17 == 1) {
            c(obj, i16, u00Var.k());
            return true;
        }
        if (i17 == 2) {
            d(obj, i16, u00Var.M());
            return true;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                if (i15 != 0) {
                    return false;
                }
                throw new lz("Protocol message end-group tag did not match expected tag.");
            }
            if (i17 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            b(obj, i16, u00Var.h());
            return true;
        }
        Object objF = f();
        int i18 = i16 << 3;
        int i19 = i15 + 1;
        if (i19 >= f32428a) {
            throw new lz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (u00Var.zzb() != Integer.MAX_VALUE && k(objF, u00Var, i19)) {
        }
        if ((i18 | 4) != u00Var.a()) {
            throw new lz("Protocol message end-group tag did not match expected tag.");
        }
        e(obj, i16, g(objF));
        return true;
    }
}
