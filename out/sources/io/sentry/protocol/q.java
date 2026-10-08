package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f95486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a0 f95487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f95488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f95489g;

    public static final class a implements t1<q> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(k3 k3Var, v0 v0Var) {
            q qVar = new q();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "thread_id":
                        qVar.f95486d = k3Var.E2();
                        break;
                    case "module":
                        qVar.f95485c = k3Var.O2();
                        break;
                    case "type":
                        qVar.f95483a = k3Var.O2();
                        break;
                    case "value":
                        qVar.f95484b = k3Var.O2();
                        break;
                    case "mechanism":
                        qVar.f95488f = (j) k3Var.M1(v0Var, new j.a());
                        break;
                    case "stacktrace":
                        qVar.f95487e = (a0) k3Var.M1(v0Var, new a0.a());
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
            qVar.q(map);
            return qVar;
        }
    }

    public j g() {
        return this.f95488f;
    }

    public String h() {
        return this.f95485c;
    }

    public a0 i() {
        return this.f95487e;
    }

    public Long j() {
        return this.f95486d;
    }

    public String k() {
        return this.f95483a;
    }

    public void l(j jVar) {
        this.f95488f = jVar;
    }

    public void m(String str) {
        this.f95485c = str;
    }

    public void n(a0 a0Var) {
        this.f95487e = a0Var;
    }

    public void o(Long l15) {
        this.f95486d = l15;
    }

    public void p(String str) {
        this.f95483a = str;
    }

    public void q(Map<String, Object> map) {
        this.f95489g = map;
    }

    public void r(String str) {
        this.f95484b = str;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95483a != null) {
            l3Var.f("type").h(this.f95483a);
        }
        if (this.f95484b != null) {
            l3Var.f("value").h(this.f95484b);
        }
        if (this.f95485c != null) {
            l3Var.f("module").h(this.f95485c);
        }
        if (this.f95486d != null) {
            l3Var.f("thread_id").k(this.f95486d);
        }
        if (this.f95487e != null) {
            l3Var.f("stacktrace").l(v0Var, this.f95487e);
        }
        if (this.f95488f != null) {
            l3Var.f("mechanism").l(v0Var, this.f95488f);
        }
        Map<String, Object> map = this.f95489g;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95489g.get(str));
            }
        }
        l3Var.h0();
    }
}
