package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Double f95424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f95425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f95426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Double f95427h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f95428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Double f95429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<i0> f95430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f95431m;

    public static final class a implements t1<i0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(k3 k3Var, v0 v0Var) {
            i0 i0Var = new i0();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "rendering_system":
                        i0Var.f95420a = k3Var.O2();
                        break;
                    case "identifier":
                        i0Var.f95422c = k3Var.O2();
                        break;
                    case "height":
                        i0Var.f95425f = k3Var.f1();
                        break;
                    case "x":
                        i0Var.f95426g = k3Var.f1();
                        break;
                    case "y":
                        i0Var.f95427h = k3Var.f1();
                        break;
                    case "tag":
                        i0Var.f95423d = k3Var.O2();
                        break;
                    case "type":
                        i0Var.f95421b = k3Var.O2();
                        break;
                    case "alpha":
                        i0Var.f95429k = k3Var.f1();
                        break;
                    case "width":
                        i0Var.f95424e = k3Var.f1();
                        break;
                    case "children":
                        i0Var.f95430l = k3Var.T3(v0Var, this);
                        break;
                    case "visibility":
                        i0Var.f95428j = k3Var.O2();
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
            i0Var.t(map);
            return i0Var;
        }
    }

    public List<i0> l() {
        return this.f95430l;
    }

    public String m() {
        return this.f95423d;
    }

    public void n(Double d15) {
        this.f95429k = d15;
    }

    public void o(List<i0> list) {
        this.f95430l = list;
    }

    public void p(Double d15) {
        this.f95425f = d15;
    }

    public void q(String str) {
        this.f95422c = str;
    }

    public void r(String str) {
        this.f95423d = str;
    }

    public void s(String str) {
        this.f95421b = str;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95420a != null) {
            l3Var.f("rendering_system").h(this.f95420a);
        }
        if (this.f95421b != null) {
            l3Var.f("type").h(this.f95421b);
        }
        if (this.f95422c != null) {
            l3Var.f("identifier").h(this.f95422c);
        }
        if (this.f95423d != null) {
            l3Var.f("tag").h(this.f95423d);
        }
        if (this.f95424e != null) {
            l3Var.f("width").k(this.f95424e);
        }
        if (this.f95425f != null) {
            l3Var.f("height").k(this.f95425f);
        }
        if (this.f95426g != null) {
            l3Var.f("x").k(this.f95426g);
        }
        if (this.f95427h != null) {
            l3Var.f("y").k(this.f95427h);
        }
        if (this.f95428j != null) {
            l3Var.f("visibility").h(this.f95428j);
        }
        if (this.f95429k != null) {
            l3Var.f("alpha").k(this.f95429k);
        }
        List<i0> list = this.f95430l;
        if (list != null && !list.isEmpty()) {
            l3Var.f("children").l(v0Var, this.f95430l);
        }
        Map<String, Object> map = this.f95431m;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95431m.get(str));
            }
        }
        l3Var.h0();
    }

    public void t(Map<String, Object> map) {
        this.f95431m = map;
    }

    public void u(String str) {
        this.f95428j = str;
    }

    public void v(Double d15) {
        this.f95424e = d15;
    }

    public void w(Double d15) {
        this.f95426g = d15;
    }

    public void x(Double d15) {
        this.f95427h = d15;
    }
}
