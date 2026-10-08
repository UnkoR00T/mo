package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f94860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Double f94861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f94862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Double f94863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f94864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f94865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f94866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f94867h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f94868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f94869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f94870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    u3 f94871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f94872n;

    public static final class a implements t1<e5> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e5 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            e5 e5Var = new e5();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "is_enable_app_start_profiling":
                        Boolean boolU1 = k3Var.u1();
                        if (boolU1 != null) {
                            e5Var.f94869k = boolU1.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sampled":
                        Boolean boolU2 = k3Var.u1();
                        if (boolU2 != null) {
                            e5Var.f94862c = boolU2.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strO2 = k3Var.O2();
                        if (strO2 != null) {
                            e5Var.f94864e = strO2;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_continuous_profiling_enabled":
                        Boolean boolU3 = k3Var.u1();
                        if (boolU3 != null) {
                            e5Var.f94866g = boolU3.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolU4 = k3Var.u1();
                        if (boolU4 != null) {
                            e5Var.f94865f = boolU4.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_start_profiler_on_app_start":
                        Boolean boolU5 = k3Var.u1();
                        if (boolU5 != null) {
                            e5Var.f94870l = boolU5.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolU6 = k3Var.u1();
                        if (boolU6 != null) {
                            e5Var.f94860a = boolU6.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_lifecycle":
                        String strO3 = k3Var.O2();
                        if (strO3 != null) {
                            try {
                                e5Var.f94871m = u3.valueOf(strO3);
                            } catch (IllegalArgumentException unused) {
                                v0Var.c(b7.ERROR, "Error when deserializing ProfileLifecycle: " + strO3, new Object[0]);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "continuous_profile_sampled":
                        Boolean boolU7 = k3Var.u1();
                        if (boolU7 != null) {
                            e5Var.f94868j = boolU7.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numZ2 = k3Var.z2();
                        if (numZ2 != null) {
                            e5Var.f94867h = numZ2.intValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dF1 = k3Var.f1();
                        if (dF1 != null) {
                            e5Var.f94863d = dF1;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dF2 = k3Var.f1();
                        if (dF2 != null) {
                            e5Var.f94861b = dF2;
                            break;
                        } else {
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
            e5Var.m(concurrentHashMap);
            k3Var.h0();
            return e5Var;
        }
    }

    public e5() {
        this.f94862c = false;
        this.f94863d = null;
        this.f94860a = false;
        this.f94861b = null;
        this.f94868j = false;
        this.f94864e = null;
        this.f94865f = false;
        this.f94866g = false;
        this.f94871m = u3.MANUAL;
        this.f94867h = 0;
        this.f94869k = true;
        this.f94870l = false;
    }

    public u3 a() {
        return this.f94871m;
    }

    public Double b() {
        return this.f94861b;
    }

    public String c() {
        return this.f94864e;
    }

    public int d() {
        return this.f94867h;
    }

    public Double e() {
        return this.f94863d;
    }

    public boolean f() {
        return this.f94868j;
    }

    public boolean g() {
        return this.f94866g;
    }

    public boolean h() {
        return this.f94869k;
    }

    public boolean i() {
        return this.f94860a;
    }

    public boolean j() {
        return this.f94865f;
    }

    public boolean k() {
        return this.f94870l;
    }

    public boolean l() {
        return this.f94862c;
    }

    public void m(Map<String, Object> map) {
        this.f94872n = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("profile_sampled").l(v0Var, Boolean.valueOf(this.f94860a));
        l3Var.f("profile_sample_rate").l(v0Var, this.f94861b);
        l3Var.f("continuous_profile_sampled").l(v0Var, Boolean.valueOf(this.f94868j));
        l3Var.f("trace_sampled").l(v0Var, Boolean.valueOf(this.f94862c));
        l3Var.f("trace_sample_rate").l(v0Var, this.f94863d);
        l3Var.f("profiling_traces_dir_path").l(v0Var, this.f94864e);
        l3Var.f("is_profiling_enabled").l(v0Var, Boolean.valueOf(this.f94865f));
        l3Var.f("is_continuous_profiling_enabled").l(v0Var, Boolean.valueOf(this.f94866g));
        l3Var.f("profile_lifecycle").l(v0Var, this.f94871m.name());
        l3Var.f("profiling_traces_hz").l(v0Var, Integer.valueOf(this.f94867h));
        l3Var.f("is_enable_app_start_profiling").l(v0Var, Boolean.valueOf(this.f94869k));
        l3Var.f("is_start_profiler_on_app_start").l(v0Var, Boolean.valueOf(this.f94870l));
        Map<String, Object> map = this.f94872n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f94872n.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    e5(q7 q7Var, b9 b9Var) {
        this.f94862c = b9Var.e().booleanValue();
        this.f94863d = b9Var.d();
        this.f94860a = b9Var.b().booleanValue();
        this.f94861b = b9Var.a();
        this.f94868j = q7Var.getInternalTracesSampler().c(io.sentry.util.b0.a().c());
        this.f94864e = q7Var.getProfilingTracesDirPath();
        this.f94865f = q7Var.isProfilingEnabled();
        this.f94866g = q7Var.isContinuousProfilingEnabled();
        this.f94871m = q7Var.getProfileLifecycle();
        this.f94867h = q7Var.getProfilingTracesHz();
        this.f94869k = q7Var.isEnableAppStartProfiling();
        this.f94870l = q7Var.isStartProfilerOnAppStart();
    }
}
