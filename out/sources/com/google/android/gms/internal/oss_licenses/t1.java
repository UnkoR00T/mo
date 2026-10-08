package com.google.android.gms.internal.oss_licenses;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w1 f30893c = new r1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v1 f30894d = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30895a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30896b = new HashMap();

    /* synthetic */ t1(w1 w1Var, byte[] bArr) {
    }

    final void a(m1 m1Var) {
        z2.a(m1Var, "key");
        if (!m1Var.b()) {
            w1 w1Var = f30893c;
            z2.a(m1Var, "key");
            this.f30896b.remove(m1Var);
            this.f30895a.put(m1Var, w1Var);
            return;
        }
        v1 v1Var = f30894d;
        z2.a(m1Var, "key");
        if (!m1Var.b()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.f30895a.remove(m1Var);
        this.f30896b.put(m1Var, v1Var);
    }

    public final x1 b() {
        return new u1(this, null);
    }

    final /* synthetic */ Map c() {
        return this.f30895a;
    }

    final /* synthetic */ Map d() {
        return this.f30896b;
    }
}
