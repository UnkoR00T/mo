package com.google.android.libraries.places.internal;

import android.content.Context;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class c01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uz0 f31835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g20 f31836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fz0 f31837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f31838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f31839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d20 f31840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31841h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b41 f31842i;

    c01(Context context, r70 r70Var, b41 b41Var, fz0 fz0Var, uz0 uz0Var) {
        this.f31834a = context;
        this.f31836c = h20.c(r70Var);
        this.f31837d = fz0Var;
        this.f31842i = b41Var;
        this.f31835b = uz0Var;
    }

    public final com.google.common.util.concurrent.q a(final d20 d20Var) {
        if (d20Var == d20.PLACE_AUTOCOMPLETE) {
            throw new IllegalArgumentException("Autocomplete widget should call getOrRefreshToken()");
        }
        if (this.f31838e != null && e()) {
            throw new IllegalStateException("Token is expired");
        }
        d20 d20Var2 = this.f31840g;
        if (d20Var2 != null && d20Var2 != d20Var) {
            throw new IllegalArgumentException(String.format("Token type %s does not match requested type %s", d20Var2.name(), d20Var.name()));
        }
        String str = this.f31838e;
        return str != null ? com.google.common.util.concurrent.k.c(str) : com.google.common.util.concurrent.f.G(this.f31835b.a()).I(new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.a01
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return this.f31550a.d((String) obj, d20Var);
            }
        }, com.google.common.util.concurrent.u.a()).H(yz0.f34455a, com.google.common.util.concurrent.u.a());
    }

    public final com.google.common.util.concurrent.q b(final d20 d20Var) {
        String str;
        if (d20Var != d20.PLACE_AUTOCOMPLETE) {
            throw new IllegalArgumentException("Only Autocomplete widget should call getOrRefreshToken()");
        }
        d20 d20Var2 = this.f31840g;
        if (d20Var2 == null || d20Var2 == d20Var) {
            return (e() || (str = this.f31838e) == null) ? com.google.common.util.concurrent.f.G(this.f31835b.a()).I(new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.zz0
                @Override // com.google.common.util.concurrent.d
                public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                    return this.f34579a.d((String) obj, d20Var);
                }
            }, com.google.common.util.concurrent.u.a()).H(xz0.f34328a, com.google.common.util.concurrent.u.a()) : com.google.common.util.concurrent.k.c(str);
        }
        throw new IllegalArgumentException(String.format("Token type %s does not match requested type %s", d20Var2.name(), d20Var.name()));
    }

    public final void c() {
        this.f31838e = null;
        this.f31839f = null;
        this.f31840g = null;
    }

    final com.google.common.util.concurrent.q d(String str, d20 d20Var) {
        if (this.f31841h) {
            throw new IllegalStateException("Too many concurrent requests");
        }
        this.f31841h = true;
        c20 c20VarI = e20.I();
        c20VarI.A(d20Var);
        c20VarI.D(str);
        c20VarI.F(this.f31834a.getPackageName());
        c20VarI.G(4);
        e20 e20Var = (e20) c20VarI.H0();
        g20 g20Var = (g20) this.f31836c.d(rq0.a(this.f31837d.a(this.f31842i.c(), "")));
        com.google.common.util.concurrent.q qVarA = oq0.a(g20Var.b().b(h20.b(), g20Var.c()), e20Var);
        com.google.common.util.concurrent.k.a(qVarA, new wz0(this, d20Var), com.google.common.util.concurrent.u.a());
        return qVarA;
    }

    final boolean e() {
        Long l15 = this.f31839f;
        if (l15 == null) {
            return true;
        }
        return Instant.ofEpochSecond(l15.longValue()).isBefore(Instant.now());
    }

    final /* synthetic */ void f(boolean z15) {
        this.f31841h = false;
    }
}
