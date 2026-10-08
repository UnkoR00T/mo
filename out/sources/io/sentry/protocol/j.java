package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Thread f95432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f95436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f95437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f95438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f95439h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f95440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f95441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f95442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f95443m;

    public static final class a implements t1<j> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(k3 k3Var, v0 v0Var) {
            j jVar = new j();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "description":
                        jVar.f95434c = k3Var.O2();
                        break;
                    case "exception_id":
                        jVar.f95440j = k3Var.z2();
                        break;
                    case "data":
                        jVar.f95438g = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "meta":
                        jVar.f95437f = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "type":
                        jVar.f95433b = k3Var.O2();
                        break;
                    case "handled":
                        jVar.f95436e = k3Var.u1();
                        break;
                    case "synthetic":
                        jVar.f95439h = k3Var.u1();
                        break;
                    case "is_exception_group":
                        jVar.f95442l = k3Var.u1();
                        break;
                    case "help_link":
                        jVar.f95435d = k3Var.O2();
                        break;
                    case "parent_id":
                        jVar.f95441k = k3Var.z2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            k3Var.h0();
            jVar.q(map);
            return jVar;
        }
    }

    public j() {
        this(null);
    }

    public String k() {
        return this.f95433b;
    }

    public Boolean l() {
        return this.f95436e;
    }

    public void m(Integer num) {
        this.f95440j = num;
    }

    public void n(Boolean bool) {
        this.f95436e = bool;
    }

    public void o(Integer num) {
        this.f95441k = num;
    }

    public void p(String str) {
        this.f95433b = str;
    }

    public void q(Map<String, Object> map) {
        this.f95443m = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95433b != null) {
            l3Var.f("type").h(this.f95433b);
        }
        if (this.f95434c != null) {
            l3Var.f("description").h(this.f95434c);
        }
        if (this.f95435d != null) {
            l3Var.f("help_link").h(this.f95435d);
        }
        if (this.f95436e != null) {
            l3Var.f("handled").m(this.f95436e);
        }
        if (this.f95437f != null) {
            l3Var.f("meta").l(v0Var, this.f95437f);
        }
        if (this.f95438g != null) {
            l3Var.f("data").l(v0Var, this.f95438g);
        }
        if (this.f95439h != null) {
            l3Var.f("synthetic").m(this.f95439h);
        }
        if (this.f95440j != null) {
            l3Var.f("exception_id").l(v0Var, this.f95440j);
        }
        if (this.f95441k != null) {
            l3Var.f("parent_id").l(v0Var, this.f95441k);
        }
        if (this.f95442l != null) {
            l3Var.f("is_exception_group").m(this.f95442l);
        }
        Map<String, Object> map = this.f95443m;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95443m.get(str));
            }
        }
        l3Var.h0();
    }

    public j(Thread thread) {
        this.f95432a = thread;
    }
}
