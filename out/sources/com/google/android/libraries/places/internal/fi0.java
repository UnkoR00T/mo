package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class fi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final di0 f32300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kl0 f32303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f32304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f32305f;

    fi0(di0 di0Var, Map map, Map map2, kl0 kl0Var, Object obj, Map map3) {
        this.f32300a = di0Var;
        this.f32301b = Collections.unmodifiableMap(new HashMap(map));
        this.f32302c = Collections.unmodifiableMap(new HashMap(map2));
        this.f32303d = kl0Var;
        this.f32304e = obj;
        this.f32305f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final Map a() {
        return this.f32305f;
    }

    final g60 b() {
        if (this.f32302c.isEmpty() && this.f32301b.isEmpty() && this.f32300a == null) {
            return null;
        }
        return new ei0(this, null);
    }

    final Object c() {
        return this.f32304e;
    }

    final kl0 d() {
        return this.f32303d;
    }

    final di0 e(f80 f80Var) {
        di0 di0Var = (di0) this.f32301b.get(f80Var.b());
        if (di0Var == null) {
            di0Var = (di0) this.f32302c.get(f80Var.c());
        }
        return di0Var == null ? this.f32300a : di0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fi0.class == obj.getClass()) {
            fi0 fi0Var = (fi0) obj;
            if (zj.l.a(this.f32300a, fi0Var.f32300a) && zj.l.a(this.f32301b, fi0Var.f32301b) && zj.l.a(this.f32302c, fi0Var.f32302c) && zj.l.a(this.f32303d, fi0Var.f32303d) && zj.l.a(this.f32304e, fi0Var.f32304e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f32300a, this.f32301b, this.f32302c, this.f32303d, this.f32304e);
    }

    public final String toString() {
        return zj.j.c(this).d("defaultMethodConfig", this.f32300a).d("serviceMethodMap", this.f32301b).d("serviceMap", this.f32302c).d("retryThrottling", this.f32303d).d("loadBalancingConfig", this.f32304e).toString();
    }
}
