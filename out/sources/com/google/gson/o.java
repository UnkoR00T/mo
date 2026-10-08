package com.google.gson;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wl.a0<String, l> f36857a = new wl.a0<>(false);

    public Set<Map.Entry<String, l>> entrySet() {
        return this.f36857a.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f36857a.equals(this.f36857a);
        }
        return true;
    }

    public int hashCode() {
        return this.f36857a.hashCode();
    }

    public void o(String str, l lVar) {
        wl.a0<String, l> a0Var = this.f36857a;
        if (lVar == null) {
            lVar = n.f36856a;
        }
        a0Var.put(str, lVar);
    }

    public void q(String str, Number number) {
        o(str, number == null ? n.f36856a : new r(number));
    }

    public void s(String str, String str2) {
        o(str, str2 == null ? n.f36856a : new r(str2));
    }

    public l t(String str) {
        return this.f36857a.get(str);
    }

    public o u(String str) {
        return (o) this.f36857a.get(str);
    }

    public boolean v(String str) {
        return this.f36857a.containsKey(str);
    }
}
