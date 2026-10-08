package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public class uq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i70 f33968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b50 f33969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g70 f33970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ wq0 f33971e;

    public uq0(wq0 wq0Var, Object obj, x60 x60Var) {
        Objects.requireNonNull(wq0Var);
        this.f33971e = wq0Var;
        this.f33970d = new y60(b70.d());
        this.f33967a = obj;
        this.f33968b = x60Var.a(a());
        this.f33969c = b50.CONNECTING;
    }

    protected tq0 a() {
        return new tq0(this);
    }

    protected final void b() {
        this.f33968b.c();
        this.f33969c = b50.SHUTDOWN;
        wq0.f34193k.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.f33967a);
    }

    public final Object c() {
        return this.f33967a;
    }

    public final i70 d() {
        return this.f33968b;
    }

    public final g70 e() {
        return this.f33970d;
    }

    public final b50 f() {
        return this.f33969c;
    }

    final /* synthetic */ i70 g() {
        return this.f33968b;
    }

    final /* synthetic */ b50 h() {
        return this.f33969c;
    }

    final /* synthetic */ void i(b50 b50Var) {
        this.f33969c = b50Var;
    }

    final /* synthetic */ void j(g70 g70Var) {
        this.f33970d = g70Var;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f33967a);
        String strValueOf2 = String.valueOf(this.f33969c);
        String strValueOf3 = String.valueOf(this.f33970d.getClass());
        String strValueOf4 = String.valueOf(this.f33968b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb5 = new StringBuilder(length + 20 + length2 + 15 + strValueOf3.length() + 6 + strValueOf4.length());
        sb5.append("Address = ");
        sb5.append(strValueOf);
        sb5.append(", state = ");
        sb5.append(strValueOf2);
        sb5.append(", picker type: ");
        sb5.append(strValueOf3);
        sb5.append(", lb: ");
        sb5.append(strValueOf4);
        return sb5.toString();
    }
}
