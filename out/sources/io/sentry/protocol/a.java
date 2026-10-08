package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f95314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f95320h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<String> f95321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f95322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f95323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f95324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<String> f95325n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, Object> f95326p;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C2240a implements t1<a> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "split_names":
                        List<String> list = (List) k3Var.K3();
                        if (list == null) {
                            break;
                        } else {
                            aVar.u(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        aVar.f95315c = k3Var.O2();
                        break;
                    case "start_type":
                        aVar.f95322k = k3Var.O2();
                        break;
                    case "view_names":
                        List<String> list2 = (List) k3Var.K3();
                        if (list2 == null) {
                            break;
                        } else {
                            aVar.x(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        aVar.f95318f = k3Var.O2();
                        break;
                    case "in_foreground":
                        aVar.f95323l = k3Var.u1();
                        break;
                    case "build_type":
                        aVar.f95316d = k3Var.O2();
                        break;
                    case "app_identifier":
                        aVar.f95313a = k3Var.O2();
                        break;
                    case "app_start_time":
                        aVar.f95314b = k3Var.p1(v0Var);
                        break;
                    case "permissions":
                        aVar.f95320h = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "app_name":
                        aVar.f95317e = k3Var.O2();
                        break;
                    case "app_build":
                        aVar.f95319g = k3Var.O2();
                        break;
                    case "is_split_apks":
                        aVar.f95324m = k3Var.u1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            aVar.w(concurrentHashMap);
            k3Var.h0();
            return aVar;
        }
    }

    public a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (io.sentry.util.v.a(this.f95313a, aVar.f95313a) && io.sentry.util.v.a(this.f95314b, aVar.f95314b) && io.sentry.util.v.a(this.f95315c, aVar.f95315c) && io.sentry.util.v.a(this.f95316d, aVar.f95316d) && io.sentry.util.v.a(this.f95317e, aVar.f95317e) && io.sentry.util.v.a(this.f95318f, aVar.f95318f) && io.sentry.util.v.a(this.f95319g, aVar.f95319g) && io.sentry.util.v.a(this.f95320h, aVar.f95320h) && io.sentry.util.v.a(this.f95323l, aVar.f95323l) && io.sentry.util.v.a(this.f95321j, aVar.f95321j) && io.sentry.util.v.a(this.f95322k, aVar.f95322k) && io.sentry.util.v.a(this.f95324m, aVar.f95324m) && io.sentry.util.v.a(this.f95325n, aVar.f95325n)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95313a, this.f95314b, this.f95315c, this.f95316d, this.f95317e, this.f95318f, this.f95319g, this.f95320h, this.f95323l, this.f95321j, this.f95322k, this.f95324m, this.f95325n);
    }

    public Boolean l() {
        return this.f95323l;
    }

    public void m(String str) {
        this.f95319g = str;
    }

    public void n(String str) {
        this.f95313a = str;
    }

    public void o(String str) {
        this.f95317e = str;
    }

    public void p(Date date) {
        this.f95314b = date;
    }

    public void q(String str) {
        this.f95318f = str;
    }

    public void r(Boolean bool) {
        this.f95323l = bool;
    }

    public void s(Map<String, String> map) {
        this.f95320h = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95313a != null) {
            l3Var.f("app_identifier").h(this.f95313a);
        }
        if (this.f95314b != null) {
            l3Var.f("app_start_time").l(v0Var, this.f95314b);
        }
        if (this.f95315c != null) {
            l3Var.f("device_app_hash").h(this.f95315c);
        }
        if (this.f95316d != null) {
            l3Var.f("build_type").h(this.f95316d);
        }
        if (this.f95317e != null) {
            l3Var.f("app_name").h(this.f95317e);
        }
        if (this.f95318f != null) {
            l3Var.f("app_version").h(this.f95318f);
        }
        if (this.f95319g != null) {
            l3Var.f("app_build").h(this.f95319g);
        }
        Map<String, String> map = this.f95320h;
        if (map != null && !map.isEmpty()) {
            l3Var.f("permissions").l(v0Var, this.f95320h);
        }
        if (this.f95323l != null) {
            l3Var.f("in_foreground").m(this.f95323l);
        }
        if (this.f95321j != null) {
            l3Var.f("view_names").l(v0Var, this.f95321j);
        }
        if (this.f95322k != null) {
            l3Var.f("start_type").h(this.f95322k);
        }
        if (this.f95324m != null) {
            l3Var.f("is_split_apks").m(this.f95324m);
        }
        List<String> list = this.f95325n;
        if (list != null && !list.isEmpty()) {
            l3Var.f("split_names").l(v0Var, this.f95325n);
        }
        Map<String, Object> map2 = this.f95326p;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                l3Var.f(str).l(v0Var, this.f95326p.get(str));
            }
        }
        l3Var.h0();
    }

    public void t(Boolean bool) {
        this.f95324m = bool;
    }

    public void u(List<String> list) {
        this.f95325n = list;
    }

    public void v(String str) {
        this.f95322k = str;
    }

    public void w(Map<String, Object> map) {
        this.f95326p = map;
    }

    public void x(List<String> list) {
        this.f95321j = list;
    }

    a(a aVar) {
        this.f95319g = aVar.f95319g;
        this.f95313a = aVar.f95313a;
        this.f95317e = aVar.f95317e;
        this.f95314b = aVar.f95314b;
        this.f95318f = aVar.f95318f;
        this.f95316d = aVar.f95316d;
        this.f95315c = aVar.f95315c;
        this.f95320h = io.sentry.util.c.c(aVar.f95320h);
        this.f95323l = aVar.f95323l;
        this.f95321j = io.sentry.util.c.b(aVar.f95321j);
        this.f95322k = aVar.f95322k;
        this.f95324m = aVar.f95324m;
        this.f95325n = aVar.f95325n;
        this.f95326p = io.sentry.util.c.c(aVar.f95326p);
    }
}
