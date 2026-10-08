package io.sentry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class r6 extends i5 implements d2 {
    private Map<String, Object> A;
    private Map<String, String> B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Date f95595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.k f95596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f95597t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h8<io.sentry.protocol.b0> f95598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h8<io.sentry.protocol.q> f95599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b7 f95600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f95601y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<String> f95602z;

    public static final class a implements t1<r6> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r6 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            r6 r6Var = new r6();
            i5.a aVar = new i5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "fingerprint":
                        List list = (List) k3Var.K3();
                        if (list == null) {
                            break;
                        } else {
                            r6Var.f95602z = list;
                            break;
                        }
                        break;
                    case "threads":
                        k3Var.Y();
                        k3Var.h1();
                        r6Var.f95598v = new h8(k3Var.T3(v0Var, new io.sentry.protocol.b0.a()));
                        k3Var.h0();
                        break;
                    case "logger":
                        r6Var.f95597t = k3Var.O2();
                        break;
                    case "timestamp":
                        Date dateP1 = k3Var.p1(v0Var);
                        if (dateP1 == null) {
                            break;
                        } else {
                            r6Var.f95595r = dateP1;
                            break;
                        }
                        break;
                    case "level":
                        r6Var.f95600x = (b7) k3Var.M1(v0Var, new b7.a());
                        break;
                    case "message":
                        r6Var.f95596s = (io.sentry.protocol.k) k3Var.M1(v0Var, new io.sentry.protocol.k.a());
                        break;
                    case "modules":
                        r6Var.B = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "exception":
                        k3Var.Y();
                        k3Var.h1();
                        r6Var.f95599w = new h8(k3Var.T3(v0Var, new io.sentry.protocol.q.a()));
                        k3Var.h0();
                        break;
                    case "transaction":
                        r6Var.f95601y = k3Var.O2();
                        break;
                    default:
                        if (!aVar.a(r6Var, strH1, k3Var, v0Var)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            k3Var.U2(v0Var, concurrentHashMap, strH1);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            r6Var.I0(concurrentHashMap);
            k3Var.h0();
            return r6Var;
        }
    }

    r6(io.sentry.protocol.v vVar, Date date) {
        super(vVar);
        this.f95595r = date;
    }

    public void A0(List<io.sentry.protocol.q> list) {
        this.f95599w = new h8<>(list);
    }

    public void B0(List<String> list) {
        this.f95602z = list != null ? new ArrayList(list) : null;
    }

    public void C0(b7 b7Var) {
        this.f95600x = b7Var;
    }

    public void D0(io.sentry.protocol.k kVar) {
        this.f95596s = kVar;
    }

    public void E0(Map<String, String> map) {
        this.B = io.sentry.util.c.d(map);
    }

    public void F0(List<io.sentry.protocol.b0> list) {
        this.f95598v = new h8<>(list);
    }

    public void G0(Date date) {
        this.f95595r = date;
    }

    public void H0(String str) {
        this.f95601y = str;
    }

    public void I0(Map<String, Object> map) {
        this.A = map;
    }

    public List<io.sentry.protocol.q> p0() {
        h8<io.sentry.protocol.q> h8Var = this.f95599w;
        if (h8Var == null) {
            return null;
        }
        return h8Var.a();
    }

    public List<String> q0() {
        return this.f95602z;
    }

    public b7 r0() {
        return this.f95600x;
    }

    public io.sentry.protocol.k s0() {
        return this.f95596s;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("timestamp").l(v0Var, this.f95595r);
        if (this.f95596s != null) {
            l3Var.f("message").l(v0Var, this.f95596s);
        }
        if (this.f95597t != null) {
            l3Var.f("logger").h(this.f95597t);
        }
        h8<io.sentry.protocol.b0> h8Var = this.f95598v;
        if (h8Var != null && !h8Var.a().isEmpty()) {
            l3Var.f("threads");
            l3Var.Y();
            l3Var.f("values").l(v0Var, this.f95598v.a());
            l3Var.h0();
        }
        h8<io.sentry.protocol.q> h8Var2 = this.f95599w;
        if (h8Var2 != null && !h8Var2.a().isEmpty()) {
            l3Var.f("exception");
            l3Var.Y();
            l3Var.f("values").l(v0Var, this.f95599w.a());
            l3Var.h0();
        }
        if (this.f95600x != null) {
            l3Var.f("level").l(v0Var, this.f95600x);
        }
        if (this.f95601y != null) {
            l3Var.f("transaction").h(this.f95601y);
        }
        if (this.f95602z != null) {
            l3Var.f("fingerprint").l(v0Var, this.f95602z);
        }
        if (this.B != null) {
            l3Var.f("modules").l(v0Var, this.B);
        }
        new i5.b().a(this, l3Var, v0Var);
        Map<String, Object> map = this.A;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.A.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    Map<String, String> t0() {
        return this.B;
    }

    public List<io.sentry.protocol.b0> u0() {
        h8<io.sentry.protocol.b0> h8Var = this.f95598v;
        if (h8Var != null) {
            return h8Var.a();
        }
        return null;
    }

    public Date v0() {
        return (Date) this.f95595r.clone();
    }

    public String w0() {
        return this.f95601y;
    }

    public io.sentry.protocol.q x0() {
        h8<io.sentry.protocol.q> h8Var = this.f95599w;
        if (h8Var == null) {
            return null;
        }
        for (io.sentry.protocol.q qVar : h8Var.a()) {
            if (qVar.g() != null && qVar.g().l() != null && !qVar.g().l().booleanValue()) {
                return qVar;
            }
        }
        return null;
    }

    public boolean y0() {
        return x0() != null;
    }

    public boolean z0() {
        h8<io.sentry.protocol.q> h8Var = this.f95599w;
        return (h8Var == null || h8Var.a().isEmpty()) ? false : true;
    }

    public r6(Throwable th4) {
        this();
        this.f95036k = th4;
    }

    public r6() {
        this(new io.sentry.protocol.v(), m.d());
    }
}
