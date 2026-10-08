package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements d2 {
    private Integer A;
    private Date B;
    private TimeZone C;
    private String D;
    private String E;
    private String F;
    private Float G;
    private Integer H;
    private Double I;
    private String K;
    private String L;
    private Map<String, Object> O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f95366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f95367h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f95368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f95369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f95370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f95371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f95372n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Long f95373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f95374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f95375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f95376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Long f95377t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Long f95378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Long f95379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f95380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Integer f95381y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Float f95382z;

    public static final class a implements t1<e> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "timezone":
                        eVar.C = k3Var.N0(v0Var);
                        break;
                    case "boot_time":
                        if (k3Var.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            eVar.B = k3Var.p1(v0Var);
                            break;
                        }
                        break;
                    case "simulator":
                        eVar.f95371m = k3Var.u1();
                        break;
                    case "manufacturer":
                        eVar.f95361b = k3Var.O2();
                        break;
                    case "processor_count":
                        eVar.H = k3Var.z2();
                        break;
                    case "orientation":
                        eVar.f95370l = (b) k3Var.M1(v0Var, new b.a());
                        break;
                    case "battery_temperature":
                        eVar.G = k3Var.z3();
                        break;
                    case "family":
                        eVar.f95363d = k3Var.O2();
                        break;
                    case "locale":
                        eVar.E = k3Var.O2();
                        break;
                    case "online":
                        eVar.f95369k = k3Var.u1();
                        break;
                    case "battery_level":
                        eVar.f95367h = k3Var.z3();
                        break;
                    case "model_id":
                        eVar.f95365f = k3Var.O2();
                        break;
                    case "screen_density":
                        eVar.f95382z = k3Var.z3();
                        break;
                    case "screen_dpi":
                        eVar.A = k3Var.z2();
                        break;
                    case "free_memory":
                        eVar.f95373p = k3Var.E2();
                        break;
                    case "id":
                        eVar.D = k3Var.O2();
                        break;
                    case "name":
                        eVar.f95360a = k3Var.O2();
                        break;
                    case "low_memory":
                        eVar.f95375r = k3Var.u1();
                        break;
                    case "archs":
                        List list = (List) k3Var.K3();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.f95366g = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        eVar.f95362c = k3Var.O2();
                        break;
                    case "model":
                        eVar.f95364e = k3Var.O2();
                        break;
                    case "cpu_description":
                        eVar.K = k3Var.O2();
                        break;
                    case "processor_frequency":
                        eVar.I = k3Var.f1();
                        break;
                    case "connection_type":
                        eVar.F = k3Var.O2();
                        break;
                    case "chipset":
                        eVar.L = k3Var.O2();
                        break;
                    case "screen_width_pixels":
                        eVar.f95380x = k3Var.z2();
                        break;
                    case "external_storage_size":
                        eVar.f95378v = k3Var.E2();
                        break;
                    case "storage_size":
                        eVar.f95376s = k3Var.E2();
                        break;
                    case "usable_memory":
                        eVar.f95374q = k3Var.E2();
                        break;
                    case "memory_size":
                        eVar.f95372n = k3Var.E2();
                        break;
                    case "charging":
                        eVar.f95368j = k3Var.u1();
                        break;
                    case "external_free_storage":
                        eVar.f95379w = k3Var.E2();
                        break;
                    case "free_storage":
                        eVar.f95377t = k3Var.E2();
                        break;
                    case "screen_height_pixels":
                        eVar.f95381y = k3Var.z2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            eVar.q0(concurrentHashMap);
            k3Var.h0();
            return eVar;
        }
    }

    public enum b implements d2 {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements t1<b> {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(k3 k3Var, v0 v0Var) {
                return b.valueOf(k3Var.q2().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.d2
        public void serialize(l3 l3Var, v0 v0Var) {
            l3Var.h(toString().toLowerCase(Locale.ROOT));
        }
    }

    public e() {
    }

    public String I() {
        return this.F;
    }

    public String J() {
        return this.D;
    }

    public String K() {
        return this.E;
    }

    public void L(String[] strArr) {
        this.f95366g = strArr;
    }

    public void M(Float f15) {
        this.f95367h = f15;
    }

    public void N(Float f15) {
        this.G = f15;
    }

    public void O(Date date) {
        this.B = date;
    }

    public void P(String str) {
        this.f95362c = str;
    }

    public void Q(Boolean bool) {
        this.f95368j = bool;
    }

    public void R(String str) {
        this.L = str;
    }

    public void S(String str) {
        this.F = str;
    }

    public void T(Long l15) {
        this.f95379w = l15;
    }

    public void U(Long l15) {
        this.f95378v = l15;
    }

    public void V(String str) {
        this.f95363d = str;
    }

    public void W(Long l15) {
        this.f95373p = l15;
    }

    public void X(Long l15) {
        this.f95377t = l15;
    }

    public void Y(String str) {
        this.D = str;
    }

    public void Z(String str) {
        this.E = str;
    }

    public void a0(Boolean bool) {
        this.f95375r = bool;
    }

    public void b0(String str) {
        this.f95361b = str;
    }

    public void c0(Long l15) {
        this.f95372n = l15;
    }

    public void d0(String str) {
        this.f95364e = str;
    }

    public void e0(String str) {
        this.f95365f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (io.sentry.util.v.a(this.f95360a, eVar.f95360a) && io.sentry.util.v.a(this.f95361b, eVar.f95361b) && io.sentry.util.v.a(this.f95362c, eVar.f95362c) && io.sentry.util.v.a(this.f95363d, eVar.f95363d) && io.sentry.util.v.a(this.f95364e, eVar.f95364e) && io.sentry.util.v.a(this.f95365f, eVar.f95365f) && Arrays.equals(this.f95366g, eVar.f95366g) && io.sentry.util.v.a(this.f95367h, eVar.f95367h) && io.sentry.util.v.a(this.f95368j, eVar.f95368j) && io.sentry.util.v.a(this.f95369k, eVar.f95369k) && this.f95370l == eVar.f95370l && io.sentry.util.v.a(this.f95371m, eVar.f95371m) && io.sentry.util.v.a(this.f95372n, eVar.f95372n) && io.sentry.util.v.a(this.f95373p, eVar.f95373p) && io.sentry.util.v.a(this.f95374q, eVar.f95374q) && io.sentry.util.v.a(this.f95375r, eVar.f95375r) && io.sentry.util.v.a(this.f95376s, eVar.f95376s) && io.sentry.util.v.a(this.f95377t, eVar.f95377t) && io.sentry.util.v.a(this.f95378v, eVar.f95378v) && io.sentry.util.v.a(this.f95379w, eVar.f95379w) && io.sentry.util.v.a(this.f95380x, eVar.f95380x) && io.sentry.util.v.a(this.f95381y, eVar.f95381y) && io.sentry.util.v.a(this.f95382z, eVar.f95382z) && io.sentry.util.v.a(this.A, eVar.A) && io.sentry.util.v.a(this.B, eVar.B) && io.sentry.util.v.a(this.D, eVar.D) && io.sentry.util.v.a(this.E, eVar.E) && io.sentry.util.v.a(this.F, eVar.F) && io.sentry.util.v.a(this.G, eVar.G) && io.sentry.util.v.a(this.H, eVar.H) && io.sentry.util.v.a(this.I, eVar.I) && io.sentry.util.v.a(this.K, eVar.K) && io.sentry.util.v.a(this.L, eVar.L)) {
                return true;
            }
        }
        return false;
    }

    public void f0(Boolean bool) {
        this.f95369k = bool;
    }

    public void g0(b bVar) {
        this.f95370l = bVar;
    }

    public void h0(Integer num) {
        this.H = num;
    }

    public int hashCode() {
        return (io.sentry.util.v.b(this.f95360a, this.f95361b, this.f95362c, this.f95363d, this.f95364e, this.f95365f, this.f95367h, this.f95368j, this.f95369k, this.f95370l, this.f95371m, this.f95372n, this.f95373p, this.f95374q, this.f95375r, this.f95376s, this.f95377t, this.f95378v, this.f95379w, this.f95380x, this.f95381y, this.f95382z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.K, this.L) * 31) + Arrays.hashCode(this.f95366g);
    }

    public void i0(Double d15) {
        this.I = d15;
    }

    public void j0(Float f15) {
        this.f95382z = f15;
    }

    public void k0(Integer num) {
        this.A = num;
    }

    public void l0(Integer num) {
        this.f95381y = num;
    }

    public void m0(Integer num) {
        this.f95380x = num;
    }

    public void n0(Boolean bool) {
        this.f95371m = bool;
    }

    public void o0(Long l15) {
        this.f95376s = l15;
    }

    public void p0(TimeZone timeZone) {
        this.C = timeZone;
    }

    public void q0(Map<String, Object> map) {
        this.O = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95360a != null) {
            l3Var.f("name").h(this.f95360a);
        }
        if (this.f95361b != null) {
            l3Var.f("manufacturer").h(this.f95361b);
        }
        if (this.f95362c != null) {
            l3Var.f("brand").h(this.f95362c);
        }
        if (this.f95363d != null) {
            l3Var.f("family").h(this.f95363d);
        }
        if (this.f95364e != null) {
            l3Var.f("model").h(this.f95364e);
        }
        if (this.f95365f != null) {
            l3Var.f("model_id").h(this.f95365f);
        }
        if (this.f95366g != null) {
            l3Var.f("archs").l(v0Var, this.f95366g);
        }
        if (this.f95367h != null) {
            l3Var.f("battery_level").k(this.f95367h);
        }
        if (this.f95368j != null) {
            l3Var.f("charging").m(this.f95368j);
        }
        if (this.f95369k != null) {
            l3Var.f("online").m(this.f95369k);
        }
        if (this.f95370l != null) {
            l3Var.f("orientation").l(v0Var, this.f95370l);
        }
        if (this.f95371m != null) {
            l3Var.f("simulator").m(this.f95371m);
        }
        if (this.f95372n != null) {
            l3Var.f("memory_size").k(this.f95372n);
        }
        if (this.f95373p != null) {
            l3Var.f("free_memory").k(this.f95373p);
        }
        if (this.f95374q != null) {
            l3Var.f("usable_memory").k(this.f95374q);
        }
        if (this.f95375r != null) {
            l3Var.f("low_memory").m(this.f95375r);
        }
        if (this.f95376s != null) {
            l3Var.f("storage_size").k(this.f95376s);
        }
        if (this.f95377t != null) {
            l3Var.f("free_storage").k(this.f95377t);
        }
        if (this.f95378v != null) {
            l3Var.f("external_storage_size").k(this.f95378v);
        }
        if (this.f95379w != null) {
            l3Var.f("external_free_storage").k(this.f95379w);
        }
        if (this.f95380x != null) {
            l3Var.f("screen_width_pixels").k(this.f95380x);
        }
        if (this.f95381y != null) {
            l3Var.f("screen_height_pixels").k(this.f95381y);
        }
        if (this.f95382z != null) {
            l3Var.f("screen_density").k(this.f95382z);
        }
        if (this.A != null) {
            l3Var.f("screen_dpi").k(this.A);
        }
        if (this.B != null) {
            l3Var.f("boot_time").l(v0Var, this.B);
        }
        if (this.C != null) {
            l3Var.f("timezone").l(v0Var, this.C);
        }
        if (this.D != null) {
            l3Var.f("id").h(this.D);
        }
        if (this.F != null) {
            l3Var.f("connection_type").h(this.F);
        }
        if (this.G != null) {
            l3Var.f("battery_temperature").k(this.G);
        }
        if (this.E != null) {
            l3Var.f("locale").h(this.E);
        }
        if (this.H != null) {
            l3Var.f("processor_count").k(this.H);
        }
        if (this.I != null) {
            l3Var.f("processor_frequency").k(this.I);
        }
        if (this.K != null) {
            l3Var.f("cpu_description").h(this.K);
        }
        if (this.L != null) {
            l3Var.f("chipset").h(this.L);
        }
        Map<String, Object> map = this.O;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.O.get(str));
            }
        }
        l3Var.h0();
    }

    e(e eVar) {
        this.f95360a = eVar.f95360a;
        this.f95361b = eVar.f95361b;
        this.f95362c = eVar.f95362c;
        this.f95363d = eVar.f95363d;
        this.f95364e = eVar.f95364e;
        this.f95365f = eVar.f95365f;
        this.f95368j = eVar.f95368j;
        this.f95369k = eVar.f95369k;
        this.f95370l = eVar.f95370l;
        this.f95371m = eVar.f95371m;
        this.f95372n = eVar.f95372n;
        this.f95373p = eVar.f95373p;
        this.f95374q = eVar.f95374q;
        this.f95375r = eVar.f95375r;
        this.f95376s = eVar.f95376s;
        this.f95377t = eVar.f95377t;
        this.f95378v = eVar.f95378v;
        this.f95379w = eVar.f95379w;
        this.f95380x = eVar.f95380x;
        this.f95381y = eVar.f95381y;
        this.f95382z = eVar.f95382z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.D = eVar.D;
        this.F = eVar.F;
        this.G = eVar.G;
        this.f95367h = eVar.f95367h;
        String[] strArr = eVar.f95366g;
        this.f95366g = strArr != null ? (String[]) strArr.clone() : null;
        this.E = eVar.E;
        TimeZone timeZone = eVar.C;
        this.C = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.H = eVar.H;
        this.I = eVar.I;
        this.K = eVar.K;
        this.L = eVar.L;
        this.O = io.sentry.util.c.c(eVar.O);
    }
}
