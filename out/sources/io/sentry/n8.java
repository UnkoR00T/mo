package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class n8 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f95218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s8 f95219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s8 f95220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient b9 f95221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f95222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f95223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected u8 f95224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Map<String, String> f95225h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f95226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Map<String, Object> f95227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f95228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q1 f95229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected d f95230n;

    public static final class a implements t1<n8> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n8 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            String strQ2 = null;
            io.sentry.protocol.v vVarA = null;
            s8 s8VarB = null;
            s8 s8Var = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strQ3 = null;
            u8 u8Var = null;
            String strQ4 = null;
            Map<String, String> mapC = null;
            Map<String, Object> map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "span_id":
                        s8VarB = new s8.a().a(k3Var, v0Var);
                        break;
                    case "parent_span_id":
                        s8Var = (s8) k3Var.M1(v0Var, new s8.a());
                        break;
                    case "description":
                        strQ3 = k3Var.q2();
                        break;
                    case "origin":
                        strQ4 = k3Var.q2();
                        break;
                    case "status":
                        u8Var = (u8) k3Var.M1(v0Var, new u8.a());
                        break;
                    case "op":
                        strQ2 = k3Var.q2();
                        break;
                    case "data":
                        map = (Map) k3Var.K3();
                        break;
                    case "tags":
                        mapC = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "trace_id":
                        vVarA = new io.sentry.protocol.v.a().a(k3Var, v0Var);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            if (vVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                v0Var.b(b7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (s8VarB == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                v0Var.b(b7.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strQ2 == null) {
                strQ2 = "";
            }
            n8 n8Var = new n8(vVarA, s8VarB, strQ2, s8Var, null);
            n8Var.p(strQ3);
            n8Var.t(u8Var);
            n8Var.r(strQ4);
            if (mapC != null) {
                n8Var.f95225h = mapC;
            }
            if (map != null) {
                n8Var.f95227k = map;
            }
            n8Var.u(concurrentHashMap);
            k3Var.h0();
            return n8Var;
        }
    }

    public n8(String str) {
        this(new io.sentry.protocol.v(), new s8(), str, null, null);
    }

    public n8 a(String str, s8 s8Var, s8 s8Var2) {
        io.sentry.protocol.v vVar = this.f95218a;
        if (s8Var2 == null) {
            s8Var2 = new s8();
        }
        return new n8(vVar, s8Var2, s8Var, str, null, this.f95221d, null, "manual");
    }

    public d b() {
        return this.f95230n;
    }

    public String c() {
        return this.f95223f;
    }

    public q1 d() {
        return this.f95229m;
    }

    public String e() {
        return this.f95222e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return this.f95218a.equals(n8Var.f95218a) && this.f95219b.equals(n8Var.f95219b) && io.sentry.util.v.a(this.f95220c, n8Var.f95220c) && this.f95222e.equals(n8Var.f95222e) && io.sentry.util.v.a(this.f95223f, n8Var.f95223f) && l() == n8Var.l();
    }

    public String f() {
        return this.f95226j;
    }

    public s8 g() {
        return this.f95220c;
    }

    public Boolean h() {
        b9 b9Var = this.f95221d;
        if (b9Var == null) {
            return null;
        }
        return b9Var.b();
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95218a, this.f95219b, this.f95220c, this.f95222e, this.f95223f, l());
    }

    public Boolean i() {
        b9 b9Var = this.f95221d;
        if (b9Var == null) {
            return null;
        }
        return b9Var.e();
    }

    public b9 j() {
        return this.f95221d;
    }

    public s8 k() {
        return this.f95219b;
    }

    public u8 l() {
        return this.f95224g;
    }

    public Map<String, String> m() {
        return this.f95225h;
    }

    public io.sentry.protocol.v n() {
        return this.f95218a;
    }

    public void o(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f95227k.remove(str);
        } else {
            this.f95227k.put(str, obj);
        }
    }

    public void p(String str) {
        this.f95223f = str;
    }

    public void q(q1 q1Var) {
        this.f95229m = q1Var;
    }

    public void r(String str) {
        this.f95226j = str;
    }

    public void s(b9 b9Var) {
        this.f95221d = b9Var;
        d dVar = this.f95230n;
        if (dVar != null) {
            dVar.L(b9Var);
        }
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("trace_id");
        this.f95218a.serialize(l3Var, v0Var);
        l3Var.f("span_id");
        this.f95219b.serialize(l3Var, v0Var);
        if (this.f95220c != null) {
            l3Var.f("parent_span_id");
            this.f95220c.serialize(l3Var, v0Var);
        }
        l3Var.f("op").h(this.f95222e);
        if (this.f95223f != null) {
            l3Var.f("description").h(this.f95223f);
        }
        if (l() != null) {
            l3Var.f("status").l(v0Var, l());
        }
        if (this.f95226j != null) {
            l3Var.f("origin").l(v0Var, this.f95226j);
        }
        if (!this.f95225h.isEmpty()) {
            l3Var.f("tags").l(v0Var, this.f95225h);
        }
        if (!this.f95227k.isEmpty()) {
            l3Var.f("data").l(v0Var, this.f95227k);
        }
        Map<String, Object> map = this.f95228l;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95228l.get(str));
            }
        }
        l3Var.h0();
    }

    public void t(u8 u8Var) {
        this.f95224g = u8Var;
    }

    public void u(Map<String, Object> map) {
        this.f95228l = map;
    }

    public n8(io.sentry.protocol.v vVar, s8 s8Var, String str, s8 s8Var2, b9 b9Var) {
        this(vVar, s8Var, s8Var2, str, null, b9Var, null, "manual");
    }

    public n8(io.sentry.protocol.v vVar, s8 s8Var, s8 s8Var2, String str, String str2, b9 b9Var, u8 u8Var, String str3) {
        this.f95225h = new ConcurrentHashMap();
        this.f95226j = "manual";
        this.f95227k = new ConcurrentHashMap();
        this.f95229m = q1.SENTRY;
        this.f95218a = (io.sentry.protocol.v) io.sentry.util.v.c(vVar, "traceId is required");
        this.f95219b = (s8) io.sentry.util.v.c(s8Var, "spanId is required");
        this.f95222e = (String) io.sentry.util.v.c(str, "operation is required");
        this.f95220c = s8Var2;
        this.f95223f = str2;
        this.f95224g = u8Var;
        this.f95226j = str3;
        s(b9Var);
        io.sentry.util.thread.a threadChecker = r4.b().s().getThreadChecker();
        this.f95227k.put("thread.id", String.valueOf(threadChecker.c()));
        this.f95227k.put("thread.name", threadChecker.b());
    }

    public n8(n8 n8Var) {
        this.f95225h = new ConcurrentHashMap();
        this.f95226j = "manual";
        this.f95227k = new ConcurrentHashMap();
        this.f95229m = q1.SENTRY;
        this.f95218a = n8Var.f95218a;
        this.f95219b = n8Var.f95219b;
        this.f95220c = n8Var.f95220c;
        s(n8Var.f95221d);
        this.f95222e = n8Var.f95222e;
        this.f95223f = n8Var.f95223f;
        this.f95224g = n8Var.f95224g;
        Map<String, String> mapC = io.sentry.util.c.c(n8Var.f95225h);
        if (mapC != null) {
            this.f95225h = mapC;
        }
        Map<String, Object> mapC2 = io.sentry.util.c.c(n8Var.f95228l);
        if (mapC2 != null) {
            this.f95228l = mapC2;
        }
        this.f95230n = n8Var.f95230n;
        Map<String, Object> mapC3 = io.sentry.util.c.c(n8Var.f95227k);
        if (mapC3 != null) {
            this.f95227k = mapC3;
        }
    }
}
