package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f95468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f95469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f95470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f95471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f95472f;

    public static final class a implements t1<n> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "status_code":
                        nVar.f95469c = k3Var.z2();
                        break;
                    case "data":
                        nVar.f95471e = k3Var.K3();
                        break;
                    case "headers":
                        Map map = (Map) k3Var.K3();
                        if (map == null) {
                            break;
                        } else {
                            nVar.f95468b = io.sentry.util.c.c(map);
                            break;
                        }
                        break;
                    case "cookies":
                        nVar.f95467a = k3Var.O2();
                        break;
                    case "body_size":
                        nVar.f95470d = k3Var.E2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            nVar.j(concurrentHashMap);
            k3Var.h0();
            return nVar;
        }
    }

    public n() {
    }

    public void f(Long l15) {
        this.f95470d = l15;
    }

    public void g(String str) {
        this.f95467a = str;
    }

    public void h(Map<String, String> map) {
        this.f95468b = io.sentry.util.c.c(map);
    }

    public void i(Integer num) {
        this.f95469c = num;
    }

    public void j(Map<String, Object> map) {
        this.f95472f = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95467a != null) {
            l3Var.f("cookies").h(this.f95467a);
        }
        if (this.f95468b != null) {
            l3Var.f("headers").l(v0Var, this.f95468b);
        }
        if (this.f95469c != null) {
            l3Var.f("status_code").l(v0Var, this.f95469c);
        }
        if (this.f95470d != null) {
            l3Var.f("body_size").l(v0Var, this.f95470d);
        }
        if (this.f95471e != null) {
            l3Var.f("data").l(v0Var, this.f95471e);
        }
        Map<String, Object> map = this.f95472f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95472f.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public n(n nVar) {
        this.f95467a = nVar.f95467a;
        this.f95468b = io.sentry.util.c.c(nVar.f95468b);
        this.f95472f = io.sentry.util.c.c(nVar.f95472f);
        this.f95469c = nVar.f95469c;
        this.f95470d = nVar.f95470d;
        this.f95471e = nVar.f95471e;
    }
}
