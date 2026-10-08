package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.v f94844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f94845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f94846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g7 f94847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f94848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, e7> f94849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f94850g;

    public static final class a implements t1<d7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d7 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            io.sentry.protocol.v vVar = null;
            Double dF1 = null;
            String strO2 = null;
            HashMap map = null;
            g7 g7Var = null;
            Map<String, e7> mapS2 = null;
            Integer numZ2 = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "severity_number":
                        numZ2 = k3Var.z2();
                        break;
                    case "body":
                        strO2 = k3Var.O2();
                        break;
                    case "timestamp":
                        dF1 = k3Var.f1();
                        break;
                    case "level":
                        g7Var = (g7) k3Var.M1(v0Var, new g7.a());
                        break;
                    case "attributes":
                        mapS2 = k3Var.S2(v0Var, new e7.a());
                        break;
                    case "trace_id":
                        vVar = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
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
            if (vVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                v0Var.b(b7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dF1 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                v0Var.b(b7.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strO2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                v0Var.b(b7.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (g7Var == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                v0Var.b(b7.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            d7 d7Var = new d7(vVar, dF1, strO2, g7Var);
            d7Var.b(mapS2);
            d7Var.c(numZ2);
            d7Var.d(map);
            return d7Var;
        }
    }

    public d7(io.sentry.protocol.v vVar, n5 n5Var, String str, g7 g7Var) {
        this(vVar, Double.valueOf(m.m(n5Var.l())), str, g7Var);
    }

    public void a(String str, e7 e7Var) {
        if (str == null) {
            return;
        }
        if (this.f94849f == null) {
            this.f94849f = new HashMap();
        }
        this.f94849f.put(str, e7Var);
    }

    public void b(Map<String, e7> map) {
        this.f94849f = map;
    }

    public void c(Integer num) {
        this.f94848e = num;
    }

    public void d(Map<String, Object> map) {
        this.f94850g = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("timestamp").l(v0Var, m.c(this.f94845b));
        l3Var.f("trace_id").l(v0Var, this.f94844a);
        l3Var.f("body").h(this.f94846c);
        l3Var.f("level").l(v0Var, this.f94847d);
        if (this.f94848e != null) {
            l3Var.f("severity_number").l(v0Var, this.f94848e);
        }
        if (this.f94849f != null) {
            l3Var.f("attributes").l(v0Var, this.f94849f);
        }
        Map<String, Object> map = this.f94850g;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f94850g.get(str));
            }
        }
        l3Var.h0();
    }

    public d7(io.sentry.protocol.v vVar, Double d15, String str, g7 g7Var) {
        this.f94844a = vVar;
        this.f94845b = d15;
        this.f94846c = str;
        this.f94847d = g7Var;
    }
}
