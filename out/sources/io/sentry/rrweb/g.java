package io.sentry.rrweb;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.util.v;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends b implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f95645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f95646g;

    public static final class a implements t1<g> {
        private void c(g gVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "height":
                        Integer numZ2 = k3Var.z2();
                        gVar.f95643d = numZ2 != null ? numZ2.intValue() : 0;
                        break;
                    case "href":
                        String strO2 = k3Var.O2();
                        if (strO2 == null) {
                            strO2 = "";
                        }
                        gVar.f95642c = strO2;
                        break;
                    case "width":
                        Integer numZ3 = k3Var.z2();
                        gVar.f95644e = numZ3 != null ? numZ3.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            k3Var.h0();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("data")) {
                    c(gVar, k3Var, v0Var);
                } else if (!aVar.a(gVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            gVar.m(map);
            k3Var.h0();
            return gVar;
        }
    }

    public g() {
        super(c.Meta);
        this.f95642c = "";
    }

    private void j(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("href").h(this.f95642c);
        l3Var.f("height").b(this.f95643d);
        l3Var.f("width").b(this.f95644e);
        Map<String, Object> map = this.f95645f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95645f.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f95643d == gVar.f95643d && this.f95644e == gVar.f95644e && v.a(this.f95642c, gVar.f95642c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return v.b(Integer.valueOf(super.hashCode()), this.f95642c, Integer.valueOf(this.f95643d), Integer.valueOf(this.f95644e));
    }

    public void k(Map<String, Object> map) {
        this.f95646g = map;
    }

    public void l(int i15) {
        this.f95643d = i15;
    }

    public void m(Map<String, Object> map) {
        this.f95645f = map;
    }

    public void n(int i15) {
        this.f95644e = i15;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        j(l3Var, v0Var);
        l3Var.h0();
    }
}
