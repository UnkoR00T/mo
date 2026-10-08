package io.sentry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class q5 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f95554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.p f95555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z8 f95556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Date f95557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f95558e;

    public static final class a implements t1<q5> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q5 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            io.sentry.protocol.v vVar = null;
            io.sentry.protocol.p pVar = null;
            z8 z8Var = null;
            Date dateP1 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "sdk":
                        pVar = (io.sentry.protocol.p) k3Var.M1(v0Var, new io.sentry.protocol.p.a());
                        break;
                    case "trace":
                        z8Var = (z8) k3Var.M1(v0Var, new z8.a());
                        break;
                    case "event_id":
                        vVar = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
                        break;
                    case "sent_at":
                        dateP1 = k3Var.p1(v0Var);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            q5 q5Var = new q5(vVar, pVar, z8Var);
            q5Var.d(dateP1);
            q5Var.e(map);
            k3Var.h0();
            return q5Var;
        }
    }

    public q5(io.sentry.protocol.v vVar, io.sentry.protocol.p pVar) {
        this(vVar, pVar, null);
    }

    public io.sentry.protocol.v a() {
        return this.f95554a;
    }

    public io.sentry.protocol.p b() {
        return this.f95555b;
    }

    public z8 c() {
        return this.f95556c;
    }

    public void d(Date date) {
        this.f95557d = date;
    }

    public void e(Map<String, Object> map) {
        this.f95558e = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95554a != null) {
            l3Var.f("event_id").l(v0Var, this.f95554a);
        }
        if (this.f95555b != null) {
            l3Var.f("sdk").l(v0Var, this.f95555b);
        }
        if (this.f95556c != null) {
            l3Var.f("trace").l(v0Var, this.f95556c);
        }
        if (this.f95557d != null) {
            l3Var.f("sent_at").l(v0Var, m.h(this.f95557d));
        }
        Map<String, Object> map = this.f95558e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95558e.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public q5(io.sentry.protocol.v vVar, io.sentry.protocol.p pVar, z8 z8Var) {
        this.f95554a = vVar;
        this.f95555b = pVar;
        this.f95556c = z8Var;
    }

    public q5(io.sentry.protocol.v vVar) {
        this(vVar, null);
    }

    public q5() {
        this(new io.sentry.protocol.v());
    }
}
