package io.sentry.protocol;

import io.sentry.c7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f95334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f95335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f95338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f95339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f95340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f95341h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a0 f95342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, c7> f95343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f95344l;

    public static final class a implements t1<b0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(k3 k3Var, v0 v0Var) {
            b0 b0Var = new b0();
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "daemon":
                        b0Var.f95340g = k3Var.u1();
                        break;
                    case "priority":
                        b0Var.f95335b = k3Var.z2();
                        break;
                    case "held_locks":
                        Map mapS2 = k3Var.S2(v0Var, new c7.a());
                        if (mapS2 == null) {
                            break;
                        } else {
                            b0Var.f95343k = new HashMap(mapS2);
                            break;
                        }
                        break;
                    case "id":
                        b0Var.f95334a = k3Var.E2();
                        break;
                    case "main":
                        b0Var.f95341h = k3Var.u1();
                        break;
                    case "name":
                        b0Var.f95336c = k3Var.O2();
                        break;
                    case "state":
                        b0Var.f95337d = k3Var.O2();
                        break;
                    case "crashed":
                        b0Var.f95338e = k3Var.u1();
                        break;
                    case "current":
                        b0Var.f95339f = k3Var.u1();
                        break;
                    case "stacktrace":
                        b0Var.f95342j = (a0) k3Var.M1(v0Var, new a0.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            b0Var.A(concurrentHashMap);
            k3Var.h0();
            return b0Var;
        }
    }

    public void A(Map<String, Object> map) {
        this.f95344l = map;
    }

    public Map<String, c7> k() {
        return this.f95343k;
    }

    public Long l() {
        return this.f95334a;
    }

    public String m() {
        return this.f95336c;
    }

    public a0 n() {
        return this.f95342j;
    }

    public Boolean o() {
        return this.f95339f;
    }

    public Boolean p() {
        return this.f95341h;
    }

    public void q(Boolean bool) {
        this.f95338e = bool;
    }

    public void r(Boolean bool) {
        this.f95339f = bool;
    }

    public void s(Boolean bool) {
        this.f95340g = bool;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95334a != null) {
            l3Var.f("id").k(this.f95334a);
        }
        if (this.f95335b != null) {
            l3Var.f("priority").k(this.f95335b);
        }
        if (this.f95336c != null) {
            l3Var.f("name").h(this.f95336c);
        }
        if (this.f95337d != null) {
            l3Var.f("state").h(this.f95337d);
        }
        if (this.f95338e != null) {
            l3Var.f("crashed").m(this.f95338e);
        }
        if (this.f95339f != null) {
            l3Var.f("current").m(this.f95339f);
        }
        if (this.f95340g != null) {
            l3Var.f("daemon").m(this.f95340g);
        }
        if (this.f95341h != null) {
            l3Var.f("main").m(this.f95341h);
        }
        if (this.f95342j != null) {
            l3Var.f("stacktrace").l(v0Var, this.f95342j);
        }
        if (this.f95343k != null) {
            l3Var.f("held_locks").l(v0Var, this.f95343k);
        }
        Map<String, Object> map = this.f95344l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95344l.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void t(Map<String, c7> map) {
        this.f95343k = map;
    }

    public void u(Long l15) {
        this.f95334a = l15;
    }

    public void v(Boolean bool) {
        this.f95341h = bool;
    }

    public void w(String str) {
        this.f95336c = str;
    }

    public void x(Integer num) {
        this.f95335b = num;
    }

    public void y(a0 a0Var) {
        this.f95342j = a0Var;
    }

    public void z(String str) {
        this.f95337d = str;
    }
}
