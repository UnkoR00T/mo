package io.sentry.rrweb;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f95613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b7 f95617h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f95618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f95619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f95620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f95621m;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C2241a implements t1<a> {
        private void c(a aVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("payload")) {
                    d(aVar, k3Var, v0Var);
                } else if (strH1.equals("tag")) {
                    String strO2 = k3Var.O2();
                    if (strO2 == null) {
                        strO2 = "";
                    }
                    aVar.f95612c = strO2;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            aVar.v(concurrentHashMap);
            k3Var.h0();
        }

        private void d(a aVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "data":
                        Map mapC = io.sentry.util.c.c((Map) k3Var.K3());
                        if (mapC == null) {
                            break;
                        } else {
                            aVar.f95618j = mapC;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f95614e = k3Var.O2();
                        break;
                    case "category":
                        aVar.f95615f = k3Var.O2();
                        break;
                    case "timestamp":
                        aVar.f95613d = k3Var.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f95617h = new b7.a().a(k3Var, v0Var);
                            break;
                        } catch (Exception e15) {
                            v0Var.a(b7.DEBUG, e15, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f95616g = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            k3Var.h0();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("data")) {
                    c(aVar, k3Var, v0Var);
                } else if (!aVar2.a(aVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            aVar.z(map);
            k3Var.h0();
            return aVar;
        }
    }

    public a() {
        super(c.Custom);
        this.f95612c = "breadcrumb";
    }

    private void p(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("tag").h(this.f95612c);
        l3Var.f("payload");
        q(l3Var, v0Var);
        Map<String, Object> map = this.f95621m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95621m.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    private void q(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95614e != null) {
            l3Var.f("type").h(this.f95614e);
        }
        l3Var.f("timestamp").l(v0Var, BigDecimal.valueOf(this.f95613d));
        if (this.f95615f != null) {
            l3Var.f("category").h(this.f95615f);
        }
        if (this.f95616g != null) {
            l3Var.f("message").h(this.f95616g);
        }
        if (this.f95617h != null) {
            l3Var.f("level").l(v0Var, this.f95617h);
        }
        if (this.f95618j != null) {
            l3Var.f("data").l(v0Var, this.f95618j);
        }
        Map<String, Object> map = this.f95620l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95620l.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public String n() {
        return this.f95615f;
    }

    public Map<String, Object> o() {
        return this.f95618j;
    }

    public void r(double d15) {
        this.f95613d = d15;
    }

    public void s(String str) {
        this.f95614e = str;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        p(l3Var, v0Var);
        Map<String, Object> map = this.f95619k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95619k.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void t(String str) {
        this.f95615f = str;
    }

    public void u(Map<String, Object> map) {
        this.f95618j = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map<String, Object> map) {
        this.f95621m = map;
    }

    public void w(b7 b7Var) {
        this.f95617h = b7Var;
    }

    public void x(String str) {
        this.f95616g = str;
    }

    public void y(Map<String, Object> map) {
        this.f95620l = map;
    }

    public void z(Map<String, Object> map) {
        this.f95619k = map;
    }
}
