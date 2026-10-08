package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f95458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f95460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f95461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f95462h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, String> f95463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f95464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f95465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f95466m;

    public static final class a implements t1<m> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "fragment":
                        mVar.f95464k = k3Var.O2();
                        break;
                    case "method":
                        mVar.f95456b = k3Var.O2();
                        break;
                    case "env":
                        Map map = (Map) k3Var.K3();
                        if (map == null) {
                            break;
                        } else {
                            mVar.f95461g = io.sentry.util.c.c(map);
                            break;
                        }
                        break;
                    case "url":
                        mVar.f95455a = k3Var.O2();
                        break;
                    case "data":
                        mVar.f95458d = k3Var.K3();
                        break;
                    case "other":
                        Map map2 = (Map) k3Var.K3();
                        if (map2 == null) {
                            break;
                        } else {
                            mVar.f95463j = io.sentry.util.c.c(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) k3Var.K3();
                        if (map3 == null) {
                            break;
                        } else {
                            mVar.f95460f = io.sentry.util.c.c(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        mVar.f95459e = k3Var.O2();
                        break;
                    case "body_size":
                        mVar.f95462h = k3Var.E2();
                        break;
                    case "query_string":
                        mVar.f95457c = k3Var.O2();
                        break;
                    case "api_target":
                        mVar.f95465l = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            mVar.s(concurrentHashMap);
            k3Var.h0();
            return mVar;
        }
    }

    public m() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (io.sentry.util.v.a(this.f95455a, mVar.f95455a) && io.sentry.util.v.a(this.f95456b, mVar.f95456b) && io.sentry.util.v.a(this.f95457c, mVar.f95457c) && io.sentry.util.v.a(this.f95459e, mVar.f95459e) && io.sentry.util.v.a(this.f95460f, mVar.f95460f) && io.sentry.util.v.a(this.f95461g, mVar.f95461g) && io.sentry.util.v.a(this.f95462h, mVar.f95462h) && io.sentry.util.v.a(this.f95464k, mVar.f95464k) && io.sentry.util.v.a(this.f95465l, mVar.f95465l)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95455a, this.f95456b, this.f95457c, this.f95459e, this.f95460f, this.f95461g, this.f95462h, this.f95464k, this.f95465l);
    }

    public Map<String, String> l() {
        return this.f95460f;
    }

    public void m(Long l15) {
        this.f95462h = l15;
    }

    public void n(String str) {
        this.f95459e = str;
    }

    public void o(String str) {
        this.f95464k = str;
    }

    public void p(Map<String, String> map) {
        this.f95460f = io.sentry.util.c.c(map);
    }

    public void q(String str) {
        this.f95456b = str;
    }

    public void r(String str) {
        this.f95457c = str;
    }

    public void s(Map<String, Object> map) {
        this.f95466m = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95455a != null) {
            l3Var.f("url").h(this.f95455a);
        }
        if (this.f95456b != null) {
            l3Var.f("method").h(this.f95456b);
        }
        if (this.f95457c != null) {
            l3Var.f("query_string").h(this.f95457c);
        }
        if (this.f95458d != null) {
            l3Var.f("data").l(v0Var, this.f95458d);
        }
        if (this.f95459e != null) {
            l3Var.f("cookies").h(this.f95459e);
        }
        if (this.f95460f != null) {
            l3Var.f("headers").l(v0Var, this.f95460f);
        }
        if (this.f95461g != null) {
            l3Var.f("env").l(v0Var, this.f95461g);
        }
        if (this.f95463j != null) {
            l3Var.f("other").l(v0Var, this.f95463j);
        }
        if (this.f95464k != null) {
            l3Var.f("fragment").l(v0Var, this.f95464k);
        }
        if (this.f95462h != null) {
            l3Var.f("body_size").l(v0Var, this.f95462h);
        }
        if (this.f95465l != null) {
            l3Var.f("api_target").l(v0Var, this.f95465l);
        }
        Map<String, Object> map = this.f95466m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95466m.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void t(String str) {
        this.f95455a = str;
    }

    public m(m mVar) {
        this.f95455a = mVar.f95455a;
        this.f95459e = mVar.f95459e;
        this.f95456b = mVar.f95456b;
        this.f95457c = mVar.f95457c;
        this.f95460f = io.sentry.util.c.c(mVar.f95460f);
        this.f95461g = io.sentry.util.c.c(mVar.f95461g);
        this.f95463j = io.sentry.util.c.c(mVar.f95463j);
        this.f95466m = io.sentry.util.c.c(mVar.f95466m);
        this.f95458d = mVar.f95458d;
        this.f95464k = mVar.f95464k;
        this.f95462h = mVar.f95462h;
        this.f95465l = mVar.f95465l;
    }
}
