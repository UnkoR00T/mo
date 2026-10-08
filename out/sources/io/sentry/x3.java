package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class x3 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f95956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f95957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f95958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f95959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f95960h;

    public static final class a implements t1<x3> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x3 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            x3 x3Var = new x3();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "relative_start_ns":
                        Long lE2 = k3Var.E2();
                        if (lE2 == null) {
                            break;
                        } else {
                            x3Var.f95956d = lE2;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lE3 = k3Var.E2();
                        if (lE3 == null) {
                            break;
                        } else {
                            x3Var.f95957e = lE3;
                            break;
                        }
                        break;
                    case "id":
                        String strO2 = k3Var.O2();
                        if (strO2 == null) {
                            break;
                        } else {
                            x3Var.f95953a = strO2;
                            break;
                        }
                        break;
                    case "name":
                        String strO3 = k3Var.O2();
                        if (strO3 == null) {
                            break;
                        } else {
                            x3Var.f95955c = strO3;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strO4 = k3Var.O2();
                        if (strO4 == null) {
                            break;
                        } else {
                            x3Var.f95954b = strO4;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lE4 = k3Var.E2();
                        if (lE4 == null) {
                            break;
                        } else {
                            x3Var.f95959g = lE4;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lE5 = k3Var.E2();
                        if (lE5 == null) {
                            break;
                        } else {
                            x3Var.f95958f = lE5;
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
            x3Var.l(concurrentHashMap);
            k3Var.h0();
            return x3Var;
        }
    }

    public x3() {
        this(g3.B(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x3.class == obj.getClass()) {
            x3 x3Var = (x3) obj;
            if (this.f95953a.equals(x3Var.f95953a) && this.f95954b.equals(x3Var.f95954b) && this.f95955c.equals(x3Var.f95955c) && this.f95956d.equals(x3Var.f95956d) && this.f95958f.equals(x3Var.f95958f) && io.sentry.util.v.a(this.f95959g, x3Var.f95959g) && io.sentry.util.v.a(this.f95957e, x3Var.f95957e) && io.sentry.util.v.a(this.f95960h, x3Var.f95960h)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f95953a;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95953a, this.f95954b, this.f95955c, this.f95956d, this.f95957e, this.f95958f, this.f95959g, this.f95960h);
    }

    public String i() {
        return this.f95955c;
    }

    public String j() {
        return this.f95954b;
    }

    public void k(Long l15, Long l16, Long l17, Long l18) {
        if (this.f95957e == null) {
            this.f95957e = Long.valueOf(l15.longValue() - l16.longValue());
            this.f95956d = Long.valueOf(this.f95956d.longValue() - l16.longValue());
            this.f95959g = Long.valueOf(l17.longValue() - l18.longValue());
            this.f95958f = Long.valueOf(this.f95958f.longValue() - l18.longValue());
        }
    }

    public void l(Map<String, Object> map) {
        this.f95960h = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("id").l(v0Var, this.f95953a);
        l3Var.f("trace_id").l(v0Var, this.f95954b);
        l3Var.f("name").l(v0Var, this.f95955c);
        l3Var.f("relative_start_ns").l(v0Var, this.f95956d);
        l3Var.f("relative_end_ns").l(v0Var, this.f95957e);
        l3Var.f("relative_cpu_start_ms").l(v0Var, this.f95958f);
        l3Var.f("relative_cpu_end_ms").l(v0Var, this.f95959g);
        Map<String, Object> map = this.f95960h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95960h.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public x3(l1 l1Var, Long l15, Long l16) {
        this.f95953a = l1Var.i().toString();
        this.f95954b = l1Var.w().n().toString();
        this.f95955c = l1Var.getName().isEmpty() ? "unknown" : l1Var.getName();
        this.f95956d = l15;
        this.f95958f = l16;
    }
}
