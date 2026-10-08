package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b40 f32167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f32168c;

    /* synthetic */ e70(List list, b40 b40Var, Object obj, byte[] bArr) {
        this.f32166a = Collections.unmodifiableList(new ArrayList((Collection) zj.p.r(list, "addresses")));
        this.f32167b = (b40) zj.p.r(b40Var, "attributes");
        this.f32168c = obj;
    }

    public static d70 a() {
        return new d70();
    }

    public final d70 b() {
        d70 d70Var = new d70();
        d70Var.a(this.f32166a);
        d70Var.b(this.f32167b);
        d70Var.c(this.f32168c);
        return d70Var;
    }

    public final List c() {
        return this.f32166a;
    }

    public final b40 d() {
        return this.f32167b;
    }

    public final Object e() {
        return this.f32168c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e70)) {
            return false;
        }
        e70 e70Var = (e70) obj;
        return zj.l.a(this.f32166a, e70Var.f32166a) && zj.l.a(this.f32167b, e70Var.f32167b) && zj.l.a(this.f32168c, e70Var.f32168c);
    }

    public final int hashCode() {
        return zj.l.b(this.f32166a, this.f32167b, this.f32168c);
    }

    public final String toString() {
        return zj.j.c(this).d("addresses", this.f32166a).d("attributes", this.f32167b).d("loadBalancingPolicyConfig", this.f32168c).toString();
    }
}
