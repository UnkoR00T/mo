package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    private String f95400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f95401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f95402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f95403h;

    public static final class a implements t1<g0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            g0 g0Var = new g0();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "username":
                        g0Var.f95398c = k3Var.O2();
                        break;
                    case "id":
                        g0Var.f95397b = k3Var.O2();
                        break;
                    case "geo":
                        g0Var.f95401f = new g.a().a(k3Var, v0Var);
                        break;
                    case "data":
                        g0Var.f95402g = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "name":
                        g0Var.f95400e = k3Var.O2();
                        break;
                    case "email":
                        g0Var.f95396a = k3Var.O2();
                        break;
                    case "ip_address":
                        g0Var.f95399d = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            g0Var.n(concurrentHashMap);
            k3Var.h0();
            return g0Var;
        }
    }

    public g0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (io.sentry.util.v.a(this.f95396a, g0Var.f95396a) && io.sentry.util.v.a(this.f95397b, g0Var.f95397b) && io.sentry.util.v.a(this.f95398c, g0Var.f95398c) && io.sentry.util.v.a(this.f95399d, g0Var.f95399d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f95396a;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95396a, this.f95397b, this.f95398c, this.f95399d);
    }

    public String i() {
        return this.f95397b;
    }

    public String j() {
        return this.f95399d;
    }

    public String k() {
        return this.f95398c;
    }

    public void l(String str) {
        this.f95397b = str;
    }

    public void m(String str) {
        this.f95399d = str;
    }

    public void n(Map<String, Object> map) {
        this.f95403h = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95396a != null) {
            l3Var.f("email").h(this.f95396a);
        }
        if (this.f95397b != null) {
            l3Var.f("id").h(this.f95397b);
        }
        if (this.f95398c != null) {
            l3Var.f("username").h(this.f95398c);
        }
        if (this.f95399d != null) {
            l3Var.f("ip_address").h(this.f95399d);
        }
        if (this.f95400e != null) {
            l3Var.f("name").h(this.f95400e);
        }
        if (this.f95401f != null) {
            l3Var.f("geo");
            this.f95401f.serialize(l3Var, v0Var);
        }
        if (this.f95402g != null) {
            l3Var.f("data").l(v0Var, this.f95402g);
        }
        Map<String, Object> map = this.f95403h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95403h.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public g0(g0 g0Var) {
        this.f95396a = g0Var.f95396a;
        this.f95398c = g0Var.f95398c;
        this.f95397b = g0Var.f95397b;
        this.f95399d = g0Var.f95399d;
        this.f95400e = g0Var.f95400e;
        this.f95401f = g0Var.f95401f;
        this.f95402g = io.sentry.util.c.c(g0Var.f95402g);
        this.f95403h = io.sentry.util.c.c(g0Var.f95403h);
    }
}
