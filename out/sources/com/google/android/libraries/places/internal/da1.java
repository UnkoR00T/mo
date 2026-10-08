package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class da1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ga1 f31999e = new ba1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final fa1 f32000f = new ca1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ga1 f32003c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32001a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32002b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fa1 f32004d = null;

    public final da1 a(fa1 fa1Var) {
        this.f32004d = fa1Var;
        return this;
    }

    final void b(u91 u91Var) {
        j.a(u91Var, "key");
        if (!u91Var.b()) {
            ga1 ga1Var = f31999e;
            j.a(u91Var, "key");
            this.f32002b.remove(u91Var);
            this.f32001a.put(u91Var, ga1Var);
            return;
        }
        fa1 fa1Var = f32000f;
        j.a(u91Var, "key");
        j.b(u91Var.b(), "key must be repeating");
        this.f32001a.remove(u91Var);
        this.f32002b.put(u91Var, fa1Var);
    }

    public final ha1 c() {
        return new ea1(this, null);
    }

    final /* synthetic */ Map d() {
        return this.f32001a;
    }

    final /* synthetic */ Map e() {
        return this.f32002b;
    }

    final /* synthetic */ ga1 f() {
        return this.f32003c;
    }

    final /* synthetic */ fa1 g() {
        return this.f32004d;
    }
}
