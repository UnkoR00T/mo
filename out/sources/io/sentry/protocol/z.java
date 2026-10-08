package io.sentry.protocol;

import io.sentry.c7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f95517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f95518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f95519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f95523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f95524h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f95525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f95526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f95527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f95528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f95529n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f95530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f95531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f95532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f95533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f95534t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f95535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, Object> f95536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f95537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c7 f95538y;

    public static final class a implements t1<z> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(k3 k3Var, v0 v0Var) {
            z zVar = new z();
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "post_context":
                        zVar.f95518b = (List) k3Var.K3();
                        break;
                    case "image_addr":
                        zVar.f95531q = k3Var.O2();
                        break;
                    case "in_app":
                        zVar.f95527l = k3Var.u1();
                        break;
                    case "raw_function":
                        zVar.f95537x = k3Var.O2();
                        break;
                    case "lineno":
                        zVar.f95523g = k3Var.z2();
                        break;
                    case "module":
                        zVar.f95522f = k3Var.O2();
                        break;
                    case "native":
                        zVar.f95529n = k3Var.u1();
                        break;
                    case "symbol":
                        zVar.f95535v = k3Var.O2();
                        break;
                    case "package":
                        zVar.f95528m = k3Var.O2();
                        break;
                    case "filename":
                        zVar.f95520d = k3Var.O2();
                        break;
                    case "symbol_addr":
                        zVar.f95532r = k3Var.O2();
                        break;
                    case "lock":
                        zVar.f95538y = (c7) k3Var.M1(v0Var, new c7.a());
                        break;
                    case "vars":
                        zVar.f95519c = (Map) k3Var.K3();
                        break;
                    case "colno":
                        zVar.f95524h = k3Var.z2();
                        break;
                    case "instruction_addr":
                        zVar.f95533s = k3Var.O2();
                        break;
                    case "pre_context":
                        zVar.f95517a = (List) k3Var.K3();
                        break;
                    case "addr_mode":
                        zVar.f95534t = k3Var.O2();
                        break;
                    case "context_line":
                        zVar.f95526k = k3Var.O2();
                        break;
                    case "function":
                        zVar.f95521e = k3Var.O2();
                        break;
                    case "abs_path":
                        zVar.f95525j = k3Var.O2();
                        break;
                    case "platform":
                        zVar.f95530p = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            zVar.I(concurrentHashMap);
            k3Var.h0();
            return zVar;
        }
    }

    public void A(Boolean bool) {
        this.f95527l = bool;
    }

    public void B(String str) {
        this.f95533s = str;
    }

    public void C(Integer num) {
        this.f95523g = num;
    }

    public void D(c7 c7Var) {
        this.f95538y = c7Var;
    }

    public void E(String str) {
        this.f95522f = str;
    }

    public void F(Boolean bool) {
        this.f95529n = bool;
    }

    public void G(String str) {
        this.f95528m = str;
    }

    public void H(String str) {
        this.f95530p = str;
    }

    public void I(Map<String, Object> map) {
        this.f95536w = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95520d != null) {
            l3Var.f("filename").h(this.f95520d);
        }
        if (this.f95521e != null) {
            l3Var.f("function").h(this.f95521e);
        }
        if (this.f95522f != null) {
            l3Var.f("module").h(this.f95522f);
        }
        if (this.f95523g != null) {
            l3Var.f("lineno").k(this.f95523g);
        }
        if (this.f95524h != null) {
            l3Var.f("colno").k(this.f95524h);
        }
        if (this.f95525j != null) {
            l3Var.f("abs_path").h(this.f95525j);
        }
        if (this.f95526k != null) {
            l3Var.f("context_line").h(this.f95526k);
        }
        if (this.f95527l != null) {
            l3Var.f("in_app").m(this.f95527l);
        }
        if (this.f95528m != null) {
            l3Var.f("package").h(this.f95528m);
        }
        if (this.f95529n != null) {
            l3Var.f("native").m(this.f95529n);
        }
        if (this.f95530p != null) {
            l3Var.f("platform").h(this.f95530p);
        }
        if (this.f95531q != null) {
            l3Var.f("image_addr").h(this.f95531q);
        }
        if (this.f95532r != null) {
            l3Var.f("symbol_addr").h(this.f95532r);
        }
        if (this.f95533s != null) {
            l3Var.f("instruction_addr").h(this.f95533s);
        }
        if (this.f95534t != null) {
            l3Var.f("addr_mode").h(this.f95534t);
        }
        if (this.f95537x != null) {
            l3Var.f("raw_function").h(this.f95537x);
        }
        if (this.f95535v != null) {
            l3Var.f("symbol").h(this.f95535v);
        }
        if (this.f95538y != null) {
            l3Var.f("lock").l(v0Var, this.f95538y);
        }
        List<String> list = this.f95517a;
        if (list != null && !list.isEmpty()) {
            l3Var.f("pre_context").l(v0Var, this.f95517a);
        }
        List<String> list2 = this.f95518b;
        if (list2 != null && !list2.isEmpty()) {
            l3Var.f("post_context").l(v0Var, this.f95518b);
        }
        Map<String, Object> map = this.f95519c;
        if (map != null && !map.isEmpty()) {
            l3Var.f("vars").l(v0Var, this.f95519c);
        }
        Map<String, Object> map2 = this.f95536w;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.f95536w.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public String v() {
        return this.f95522f;
    }

    public Boolean w() {
        return this.f95527l;
    }

    public void x(String str) {
        this.f95534t = str;
    }

    public void y(String str) {
        this.f95520d = str;
    }

    public void z(String str) {
        this.f95521e = str;
    }
}
