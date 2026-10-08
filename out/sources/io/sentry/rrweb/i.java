package io.sentry.rrweb;

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
public final class i extends b implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f95654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f95655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f95656h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f95657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f95658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f95659l;

    public static final class a implements t1<i> {
        private void c(i iVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("payload")) {
                    d(iVar, k3Var, v0Var);
                } else if (strH1.equals("tag")) {
                    String strO2 = k3Var.O2();
                    if (strO2 == null) {
                        strO2 = "";
                    }
                    iVar.f95651c = strO2;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            iVar.p(concurrentHashMap);
            k3Var.h0();
        }

        private void d(i iVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "description":
                        iVar.f95653e = k3Var.O2();
                        break;
                    case "endTimestamp":
                        iVar.f95655g = k3Var.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f95654f = k3Var.nextDouble();
                        break;
                    case "op":
                        iVar.f95652d = k3Var.O2();
                        break;
                    case "data":
                        Map mapC = io.sentry.util.c.c((Map) k3Var.K3());
                        if (mapC == null) {
                            break;
                        } else {
                            iVar.f95656h = mapC;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            iVar.t(concurrentHashMap);
            k3Var.h0();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("data")) {
                    c(iVar, k3Var, v0Var);
                } else if (!aVar.a(iVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            iVar.v(map);
            k3Var.h0();
            return iVar;
        }
    }

    public i() {
        super(c.Custom);
        this.f95651c = "performanceSpan";
    }

    private void m(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("tag").h(this.f95651c);
        l3Var.f("payload");
        n(l3Var, v0Var);
        Map<String, Object> map = this.f95659l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95659l.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    private void n(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95652d != null) {
            l3Var.f("op").h(this.f95652d);
        }
        if (this.f95653e != null) {
            l3Var.f("description").h(this.f95653e);
        }
        l3Var.f("startTimestamp").l(v0Var, BigDecimal.valueOf(this.f95654f));
        l3Var.f("endTimestamp").l(v0Var, BigDecimal.valueOf(this.f95655g));
        if (this.f95656h != null) {
            l3Var.f("data").l(v0Var, this.f95656h);
        }
        Map<String, Object> map = this.f95658k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95658k.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void o(Map<String, Object> map) {
        this.f95656h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map<String, Object> map) {
        this.f95659l = map;
    }

    public void q(String str) {
        this.f95653e = str;
    }

    public void r(double d15) {
        this.f95655g = d15;
    }

    public void s(String str) {
        this.f95652d = str;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        m(l3Var, v0Var);
        Map<String, Object> map = this.f95657j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95657j.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void t(Map<String, Object> map) {
        this.f95658k = map;
    }

    public void u(double d15) {
        this.f95654f = d15;
    }

    public void v(Map<String, Object> map) {
        this.f95657j = map;
    }
}
