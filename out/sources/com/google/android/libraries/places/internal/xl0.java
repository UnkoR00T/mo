package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f34298b;

    public xl0(String str, Map map) {
        this.f34297a = (String) zj.p.r(str, "policyName");
        this.f34298b = (Map) zj.p.r(map, "rawConfigValue");
    }

    public final String a() {
        return this.f34297a;
    }

    public final Map b() {
        return this.f34298b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xl0) {
            xl0 xl0Var = (xl0) obj;
            if (this.f34297a.equals(xl0Var.f34297a) && this.f34298b.equals(xl0Var.f34298b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f34297a, this.f34298b);
    }

    public final String toString() {
        return zj.j.c(this).d("policyName", this.f34297a).d("rawConfigValue", this.f34298b).toString();
    }
}
