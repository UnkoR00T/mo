package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f95453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f95454g;

    public static final class a implements t1<l> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            l lVar = new l();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "rooted":
                        lVar.f95453f = k3Var.u1();
                        break;
                    case "raw_description":
                        lVar.f95450c = k3Var.O2();
                        break;
                    case "name":
                        lVar.f95448a = k3Var.O2();
                        break;
                    case "build":
                        lVar.f95451d = k3Var.O2();
                        break;
                    case "version":
                        lVar.f95449b = k3Var.O2();
                        break;
                    case "kernel_version":
                        lVar.f95452e = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            lVar.l(concurrentHashMap);
            k3Var.h0();
            return lVar;
        }
    }

    public l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (io.sentry.util.v.a(this.f95448a, lVar.f95448a) && io.sentry.util.v.a(this.f95449b, lVar.f95449b) && io.sentry.util.v.a(this.f95450c, lVar.f95450c) && io.sentry.util.v.a(this.f95451d, lVar.f95451d) && io.sentry.util.v.a(this.f95452e, lVar.f95452e) && io.sentry.util.v.a(this.f95453f, lVar.f95453f)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f95448a;
    }

    public void h(String str) {
        this.f95451d = str;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95448a, this.f95449b, this.f95450c, this.f95451d, this.f95452e, this.f95453f);
    }

    public void i(String str) {
        this.f95452e = str;
    }

    public void j(String str) {
        this.f95448a = str;
    }

    public void k(Boolean bool) {
        this.f95453f = bool;
    }

    public void l(Map<String, Object> map) {
        this.f95454g = map;
    }

    public void m(String str) {
        this.f95449b = str;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95448a != null) {
            l3Var.f("name").h(this.f95448a);
        }
        if (this.f95449b != null) {
            l3Var.f("version").h(this.f95449b);
        }
        if (this.f95450c != null) {
            l3Var.f("raw_description").h(this.f95450c);
        }
        if (this.f95451d != null) {
            l3Var.f("build").h(this.f95451d);
        }
        if (this.f95452e != null) {
            l3Var.f("kernel_version").h(this.f95452e);
        }
        if (this.f95453f != null) {
            l3Var.f("rooted").m(this.f95453f);
        }
        Map<String, Object> map = this.f95454g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95454g.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    l(l lVar) {
        this.f95448a = lVar.f95448a;
        this.f95449b = lVar.f95449b;
        this.f95450c = lVar.f95450c;
        this.f95451d = lVar.f95451d;
        this.f95452e = lVar.f95452e;
        this.f95453f = lVar.f95453f;
        this.f95454g = io.sentry.util.c.c(lVar.f95454g);
    }
}
