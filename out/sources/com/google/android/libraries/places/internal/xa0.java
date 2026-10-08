package com.google.android.libraries.places.internal;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class xa0 extends i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ya0 f34250a;

    xa0(ya0 ya0Var, nm0 nm0Var) {
        this.f34250a = (ya0) zj.p.r(ya0Var, "tracer");
    }

    static void c(n60 n60Var, int i15, String str) {
        Level levelF = f(i15);
        if (ya0.f34377c.isLoggable(levelF)) {
            ya0.c(n60Var, levelF, str);
        }
    }

    static void d(n60 n60Var, int i15, String str, Object... objArr) {
        Level levelF = f(2);
        if (ya0.f34377c.isLoggable(levelF)) {
            ya0.c(n60Var, levelF, MessageFormat.format(str, objArr));
        }
    }

    private final boolean e(int i15) {
        if (i15 == 1) {
            return false;
        }
        this.f34250a.b();
        return false;
    }

    private static Level f(int i15) {
        int i16 = i15 - 1;
        if (i16 != 1) {
            return (i16 == 2 || i16 == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    @Override // com.google.android.libraries.places.internal.i40
    public final void a(int i15, String str) {
        c(this.f34250a.d(), i15, str);
        e(i15);
    }

    @Override // com.google.android.libraries.places.internal.i40
    public final void b(int i15, String str, Object... objArr) {
        Level levelF = f(i15);
        e(i15);
        a(i15, ya0.f34377c.isLoggable(levelF) ? MessageFormat.format(str, objArr) : null);
    }
}
