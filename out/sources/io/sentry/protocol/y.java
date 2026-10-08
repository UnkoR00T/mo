package io.sentry.protocol;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.m8;
import io.sentry.s8;
import io.sentry.t1;
import io.sentry.u8;
import io.sentry.v0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f95504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f95505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f95506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s8 f95507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s8 f95508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f95509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f95510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u8 f95511h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f95512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, String> f95513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f95514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, i> f95515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f95516n;

    public static final class a implements t1<y> {
        private Exception c(String str, v0 v0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            v0Var.b(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(k3 k3Var, v0 v0Var) throws Exception {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            v vVarA = null;
            s8 s8VarA = null;
            Map map2 = null;
            String strO2 = null;
            Double dValueOf2 = null;
            s8 s8Var = null;
            String strO3 = null;
            u8 u8Var = null;
            String strO4 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d15 = dValueOf;
                Map map4 = map;
                v vVar = vVarA;
                s8 s8Var2 = s8VarA;
                if (k3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d15 == null) {
                        throw c("start_timestamp", v0Var);
                    }
                    if (vVar == null) {
                        throw c("trace_id", v0Var);
                    }
                    if (s8Var2 == null) {
                        throw c("span_id", v0Var);
                    }
                    if (strO2 == null) {
                        throw c("op", v0Var);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    y yVar = new y(d15, dValueOf2, vVar, s8Var2, s8Var, strO2, strO3, u8Var, strO4, map5, map2, map3);
                    yVar.i(concurrentHashMap2);
                    k3Var.h0();
                    return yVar;
                }
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "span_id":
                        s8VarA = new s8.a().a(k3Var, v0Var);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        break;
                    case "parent_span_id":
                        s8Var = (s8) k3Var.M1(v0Var, new s8.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "description":
                        strO3 = k3Var.O2();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = k3Var.f1();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateP1 = k3Var.p1(v0Var);
                            dValueOf = dateP1 != null ? Double.valueOf(io.sentry.m.b(dateP1)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "origin":
                        strO4 = k3Var.O2();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "status":
                        u8Var = (u8) k3Var.M1(v0Var, new u8.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "measurements":
                        map2 = k3Var.S2(v0Var, new i.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "op":
                        strO2 = k3Var.O2();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "data":
                        map3 = (Map) k3Var.K3();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "tags":
                        map = (Map) k3Var.K3();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = k3Var.f1();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateP2 = k3Var.p1(v0Var);
                            dValueOf2 = dateP2 != null ? Double.valueOf(io.sentry.m.b(dateP2)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                    case "trace_id":
                        vVarA = new v.a().a(k3Var, v0Var);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d15;
                        map = map4;
                        s8VarA = s8Var2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        dValueOf = d15;
                        map = map4;
                        vVarA = vVar;
                        s8VarA = s8Var2;
                        break;
                }
            }
        }
    }

    public y(m8 m8Var) {
        this(m8Var, m8Var.B());
    }

    private BigDecimal a(Double d15) {
        return BigDecimal.valueOf(d15.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map<String, Object> b() {
        return this.f95514l;
    }

    public Map<String, i> c() {
        return this.f95515m;
    }

    public String d() {
        return this.f95509f;
    }

    public s8 e() {
        return this.f95507d;
    }

    public Double f() {
        return this.f95504a;
    }

    public Double g() {
        return this.f95505b;
    }

    public void h(Map<String, Object> map) {
        this.f95514l = map;
    }

    public void i(Map<String, Object> map) {
        this.f95516n = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("start_timestamp").l(v0Var, a(this.f95504a));
        if (this.f95505b != null) {
            l3Var.f("timestamp").l(v0Var, a(this.f95505b));
        }
        l3Var.f("trace_id").l(v0Var, this.f95506c);
        l3Var.f("span_id").l(v0Var, this.f95507d);
        if (this.f95508e != null) {
            l3Var.f("parent_span_id").l(v0Var, this.f95508e);
        }
        l3Var.f("op").h(this.f95509f);
        if (this.f95510g != null) {
            l3Var.f("description").h(this.f95510g);
        }
        if (this.f95511h != null) {
            l3Var.f("status").l(v0Var, this.f95511h);
        }
        if (this.f95512j != null) {
            l3Var.f("origin").l(v0Var, this.f95512j);
        }
        if (!this.f95513k.isEmpty()) {
            l3Var.f("tags").l(v0Var, this.f95513k);
        }
        if (this.f95514l != null) {
            l3Var.f("data").l(v0Var, this.f95514l);
        }
        if (!this.f95515m.isEmpty()) {
            l3Var.f("measurements").l(v0Var, this.f95515m);
        }
        Map<String, Object> map = this.f95516n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95516n.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public y(m8 m8Var, Map<String, Object> map) {
        io.sentry.util.v.c(m8Var, "span is required");
        this.f95510g = m8Var.getDescription();
        this.f95509f = m8Var.E();
        this.f95507d = m8Var.K();
        this.f95508e = m8Var.H();
        this.f95506c = m8Var.M();
        this.f95511h = m8Var.b();
        this.f95512j = m8Var.w().f();
        Map<String, String> mapC = io.sentry.util.c.c(m8Var.L());
        this.f95513k = mapC == null ? new ConcurrentHashMap<>() : mapC;
        Map<String, i> mapC2 = io.sentry.util.c.c(m8Var.D());
        this.f95515m = mapC2 == null ? new ConcurrentHashMap<>() : mapC2;
        this.f95505b = m8Var.x() == null ? null : Double.valueOf(io.sentry.m.m(m8Var.A().k(m8Var.x())));
        this.f95504a = Double.valueOf(io.sentry.m.m(m8Var.A().l()));
        this.f95514l = map;
    }

    public y(Double d15, Double d16, v vVar, s8 s8Var, s8 s8Var2, String str, String str2, u8 u8Var, String str3, Map<String, String> map, Map<String, i> map2, Map<String, Object> map3) {
        this.f95504a = d15;
        this.f95505b = d16;
        this.f95506c = vVar;
        this.f95507d = s8Var;
        this.f95508e = s8Var2;
        this.f95509f = str;
        this.f95510g = str2;
        this.f95511h = u8Var;
        this.f95512j = str3;
        this.f95513k = map;
        this.f95515m = map2;
        this.f95514l = map3;
    }
}
