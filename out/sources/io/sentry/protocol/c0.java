package io.sentry.protocol;

import io.sentry.b9;
import io.sentry.d2;
import io.sentry.f8;
import io.sentry.i5;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.m8;
import io.sentry.n8;
import io.sentry.t1;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends i5 implements d2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f95347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Double f95348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Double f95349t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<y> f95350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f95351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map<String, i> f95352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e0 f95353y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map<String, Object> f95354z;

    public static final class a implements t1<c0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            c0 c0Var = new c0("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new e0(f0.CUSTOM.apiName()));
            i5.a aVar = new i5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "start_timestamp":
                        try {
                            Double dF1 = k3Var.f1();
                            if (dF1 != null) {
                                c0Var.f95348s = dF1;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateP1 = k3Var.p1(v0Var);
                            if (dateP1 != null) {
                                c0Var.f95348s = Double.valueOf(io.sentry.m.b(dateP1));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapS2 = k3Var.S2(v0Var, new i.a());
                        if (mapS2 != null) {
                            c0Var.f95352x.putAll(mapS2);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        k3Var.q2();
                        break;
                    case "timestamp":
                        try {
                            Double dF2 = k3Var.f1();
                            if (dF2 != null) {
                                c0Var.f95349t = dF2;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateP2 = k3Var.p1(v0Var);
                            if (dateP2 != null) {
                                c0Var.f95349t = Double.valueOf(io.sentry.m.b(dateP2));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listT3 = k3Var.T3(v0Var, new y.a());
                        if (listT3 != null) {
                            c0Var.f95350v.addAll(listT3);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        c0Var.f95353y = new e0.a().a(k3Var, v0Var);
                        break;
                    case "transaction":
                        c0Var.f95347r = k3Var.O2();
                        break;
                    default:
                        if (aVar.a(c0Var, strH1, k3Var, v0Var)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            k3Var.U2(v0Var, concurrentHashMap, strH1);
                            break;
                        }
                        break;
                }
            }
            c0Var.s0(concurrentHashMap);
            k3Var.h0();
            return c0Var;
        }
    }

    public c0(f8 f8Var) {
        super(f8Var.i());
        this.f95350v = new ArrayList();
        this.f95351w = "transaction";
        this.f95352x = new HashMap();
        io.sentry.util.v.c(f8Var, "sentryTracer is required");
        this.f95348s = Double.valueOf(io.sentry.m.m(f8Var.A().l()));
        this.f95349t = Double.valueOf(io.sentry.m.m(f8Var.A().k(f8Var.x())));
        this.f95347r = f8Var.getName();
        for (m8 m8Var : f8Var.Q()) {
            if (Boolean.TRUE.equals(m8Var.f())) {
                this.f95350v.add(new y(m8Var));
            }
        }
        c cVarC = C();
        cVarC.l(f8Var.R());
        n8 n8VarW = f8Var.w();
        Map<String, Object> mapS = f8Var.S();
        n8 n8Var = new n8(n8VarW.n(), n8VarW.k(), n8VarW.g(), n8VarW.e(), n8VarW.c(), n8VarW.j(), n8VarW.l(), n8VarW.f());
        for (Map.Entry<String, String> entry : n8VarW.m().entrySet()) {
            d0(entry.getKey(), entry.getValue());
        }
        if (mapS != null) {
            for (Map.Entry<String, Object> entry2 : mapS.entrySet()) {
                n8Var.o(entry2.getKey(), entry2.getValue());
            }
        }
        cVarC.x(n8Var);
        this.f95353y = new e0(f8Var.W().apiName());
    }

    public Map<String, i> m0() {
        return this.f95352x;
    }

    public b9 n0() {
        n8 n8VarI = C().i();
        if (n8VarI == null) {
            return null;
        }
        return n8VarI.j();
    }

    public List<y> o0() {
        return this.f95350v;
    }

    public String p0() {
        return this.f95347r;
    }

    public boolean q0() {
        return this.f95349t != null;
    }

    public boolean r0() {
        b9 b9VarN0 = n0();
        if (b9VarN0 == null) {
            return false;
        }
        return b9VarN0.e().booleanValue();
    }

    public void s0(Map<String, Object> map) {
        this.f95354z = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95347r != null) {
            l3Var.f("transaction").h(this.f95347r);
        }
        l3Var.f("start_timestamp").l(v0Var, io.sentry.m.c(this.f95348s));
        if (this.f95349t != null) {
            l3Var.f("timestamp").l(v0Var, io.sentry.m.c(this.f95349t));
        }
        if (!this.f95350v.isEmpty()) {
            l3Var.f("spans").l(v0Var, this.f95350v);
        }
        l3Var.f("type").h("transaction");
        if (!this.f95352x.isEmpty()) {
            l3Var.f("measurements").l(v0Var, this.f95352x);
        }
        l3Var.f("transaction_info").l(v0Var, this.f95353y);
        new i5.b().a(this, l3Var, v0Var);
        Map<String, Object> map = this.f95354z;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95354z.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public c0(String str, Double d15, Double d16, List<y> list, Map<String, i> map, e0 e0Var) {
        ArrayList arrayList = new ArrayList();
        this.f95350v = arrayList;
        this.f95351w = "transaction";
        HashMap map2 = new HashMap();
        this.f95352x = map2;
        this.f95347r = str;
        this.f95348s = d15;
        this.f95349t = d16;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator<y> it = list.iterator();
        while (it.hasNext()) {
            this.f95352x.putAll(it.next().c());
        }
        this.f95353y = e0Var;
    }
}
