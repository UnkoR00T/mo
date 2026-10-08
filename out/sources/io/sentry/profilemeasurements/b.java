package io.sentry.profilemeasurements;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.m;
import io.sentry.t1;
import io.sentry.util.v;
import io.sentry.v0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f95309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f95310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f95312d;

    public static final class a implements t1<b> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(k3 k3Var, v0 v0Var) {
            Double dValueOf;
            k3Var.Y();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "elapsed_since_start_ns":
                        String strO2 = k3Var.O2();
                        if (strO2 == null) {
                            break;
                        } else {
                            bVar.f95311c = strO2;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = k3Var.f1();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateP1 = k3Var.p1(v0Var);
                            dValueOf = dateP1 != null ? Double.valueOf(m.b(dateP1)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.f95310b = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dF1 = k3Var.f1();
                        if (dF1 == null) {
                            break;
                        } else {
                            bVar.f95312d = dF1.doubleValue();
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            bVar.e(concurrentHashMap);
            k3Var.h0();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    private BigDecimal d(Double d15) {
        return BigDecimal.valueOf(d15.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map<String, Object> map) {
        this.f95309a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (v.a(this.f95309a, bVar.f95309a) && this.f95311c.equals(bVar.f95311c) && this.f95312d == bVar.f95312d && this.f95310b == bVar.f95310b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v.b(this.f95309a, this.f95311c, Double.valueOf(this.f95312d));
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("value").l(v0Var, Double.valueOf(this.f95312d));
        l3Var.f("elapsed_since_start_ns").l(v0Var, this.f95311c);
        l3Var.f("timestamp").l(v0Var, d(Double.valueOf(this.f95310b)));
        Map<String, Object> map = this.f95309a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95309a.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public b(Long l15, Number number, long j15) {
        this.f95311c = l15.toString();
        this.f95312d = number.doubleValue();
        this.f95310b = m.m(j15);
    }
}
