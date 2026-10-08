package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f95405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f95408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f95410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f95411h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f95412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f95413k;

    public static final class a implements t1<h> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            h hVar = new h();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "npot_support":
                        hVar.f95412j = k3Var.O2();
                        break;
                    case "vendor_id":
                        hVar.f95406c = k3Var.O2();
                        break;
                    case "multi_threaded_rendering":
                        hVar.f95410g = k3Var.u1();
                        break;
                    case "id":
                        hVar.f95405b = k3Var.z2();
                        break;
                    case "name":
                        hVar.f95404a = k3Var.O2();
                        break;
                    case "vendor_name":
                        hVar.f95407d = k3Var.O2();
                        break;
                    case "version":
                        hVar.f95411h = k3Var.O2();
                        break;
                    case "api_type":
                        hVar.f95409f = k3Var.O2();
                        break;
                    case "memory_size":
                        hVar.f95408e = k3Var.z2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            hVar.j(concurrentHashMap);
            k3Var.h0();
            return hVar;
        }
    }

    public h() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.util.v.a(this.f95404a, hVar.f95404a) && io.sentry.util.v.a(this.f95405b, hVar.f95405b) && io.sentry.util.v.a(this.f95406c, hVar.f95406c) && io.sentry.util.v.a(this.f95407d, hVar.f95407d) && io.sentry.util.v.a(this.f95408e, hVar.f95408e) && io.sentry.util.v.a(this.f95409f, hVar.f95409f) && io.sentry.util.v.a(this.f95410g, hVar.f95410g) && io.sentry.util.v.a(this.f95411h, hVar.f95411h) && io.sentry.util.v.a(this.f95412j, hVar.f95412j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95404a, this.f95405b, this.f95406c, this.f95407d, this.f95408e, this.f95409f, this.f95410g, this.f95411h, this.f95412j);
    }

    public void j(Map<String, Object> map) {
        this.f95413k = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95404a != null) {
            l3Var.f("name").h(this.f95404a);
        }
        if (this.f95405b != null) {
            l3Var.f("id").k(this.f95405b);
        }
        if (this.f95406c != null) {
            l3Var.f("vendor_id").h(this.f95406c);
        }
        if (this.f95407d != null) {
            l3Var.f("vendor_name").h(this.f95407d);
        }
        if (this.f95408e != null) {
            l3Var.f("memory_size").k(this.f95408e);
        }
        if (this.f95409f != null) {
            l3Var.f("api_type").h(this.f95409f);
        }
        if (this.f95410g != null) {
            l3Var.f("multi_threaded_rendering").m(this.f95410g);
        }
        if (this.f95411h != null) {
            l3Var.f("version").h(this.f95411h);
        }
        if (this.f95412j != null) {
            l3Var.f("npot_support").h(this.f95412j);
        }
        Map<String, Object> map = this.f95413k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95413k.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    h(h hVar) {
        this.f95404a = hVar.f95404a;
        this.f95405b = hVar.f95405b;
        this.f95406c = hVar.f95406c;
        this.f95407d = hVar.f95407d;
        this.f95408e = hVar.f95408e;
        this.f95409f = hVar.f95409f;
        this.f95410g = hVar.f95410g;
        this.f95411h = hVar.f95411h;
        this.f95412j = hVar.f95412j;
        this.f95413k = io.sentry.util.c.c(hVar.f95413k);
    }
}
