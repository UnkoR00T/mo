package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 implements d2 {
    private String A;
    private String B;
    private Date C;
    private final Map<String, io.sentry.profilemeasurements.a> D;
    private String E;
    private Map<String, Object> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f95902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable<List<Integer>> f95903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f95909h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f95910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f95911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f95912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<Integer> f95913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f95914n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f95915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f95916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<x3> f95917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f95918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f95919t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f95920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f95921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f95922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f95923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f95924z;

    public static final class b implements t1<w3> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w3 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            w3 w3Var = new w3();
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "device_manufacturer":
                        String strO2 = k3Var.O2();
                        if (strO2 == null) {
                            break;
                        } else {
                            w3Var.f95906e = strO2;
                            break;
                        }
                        break;
                    case "android_api_level":
                        Integer numZ2 = k3Var.z2();
                        if (numZ2 == null) {
                            break;
                        } else {
                            w3Var.f95904c = numZ2.intValue();
                            break;
                        }
                        break;
                    case "build_id":
                        String strO3 = k3Var.O2();
                        if (strO3 == null) {
                            break;
                        } else {
                            w3Var.f95916q = strO3;
                            break;
                        }
                        break;
                    case "device_locale":
                        String strO4 = k3Var.O2();
                        if (strO4 == null) {
                            break;
                        } else {
                            w3Var.f95905d = strO4;
                            break;
                        }
                        break;
                    case "profile_id":
                        String strO5 = k3Var.O2();
                        if (strO5 == null) {
                            break;
                        } else {
                            w3Var.f95924z = strO5;
                            break;
                        }
                        break;
                    case "device_os_build_number":
                        String strO6 = k3Var.O2();
                        if (strO6 == null) {
                            break;
                        } else {
                            w3Var.f95908g = strO6;
                            break;
                        }
                        break;
                    case "device_model":
                        String strO7 = k3Var.O2();
                        if (strO7 == null) {
                            break;
                        } else {
                            w3Var.f95907f = strO7;
                            break;
                        }
                        break;
                    case "device_is_emulator":
                        Boolean boolU1 = k3Var.u1();
                        if (boolU1 == null) {
                            break;
                        } else {
                            w3Var.f95911k = boolU1.booleanValue();
                            break;
                        }
                        break;
                    case "duration_ns":
                        String strO8 = k3Var.O2();
                        if (strO8 == null) {
                            break;
                        } else {
                            w3Var.f95919t = strO8;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapS2 = k3Var.S2(v0Var, new io.sentry.profilemeasurements.a.C2239a());
                        if (mapS2 == null) {
                            break;
                        } else {
                            w3Var.D.putAll(mapS2);
                            break;
                        }
                        break;
                    case "device_physical_memory_bytes":
                        String strO9 = k3Var.O2();
                        if (strO9 == null) {
                            break;
                        } else {
                            w3Var.f95914n = strO9;
                            break;
                        }
                        break;
                    case "device_cpu_frequencies":
                        List list = (List) k3Var.K3();
                        if (list == null) {
                            break;
                        } else {
                            w3Var.f95913m = list;
                            break;
                        }
                        break;
                    case "version_code":
                        String strO10 = k3Var.O2();
                        if (strO10 == null) {
                            break;
                        } else {
                            w3Var.f95920v = strO10;
                            break;
                        }
                        break;
                    case "version_name":
                        String strO11 = k3Var.O2();
                        if (strO11 == null) {
                            break;
                        } else {
                            w3Var.f95921w = strO11;
                            break;
                        }
                        break;
                    case "environment":
                        String strO12 = k3Var.O2();
                        if (strO12 == null) {
                            break;
                        } else {
                            w3Var.A = strO12;
                            break;
                        }
                        break;
                    case "timestamp":
                        Date dateP1 = k3Var.p1(v0Var);
                        if (dateP1 == null) {
                            break;
                        } else {
                            w3Var.C = dateP1;
                            break;
                        }
                        break;
                    case "transaction_name":
                        String strO13 = k3Var.O2();
                        if (strO13 == null) {
                            break;
                        } else {
                            w3Var.f95918s = strO13;
                            break;
                        }
                        break;
                    case "device_os_name":
                        String strO14 = k3Var.O2();
                        if (strO14 == null) {
                            break;
                        } else {
                            w3Var.f95909h = strO14;
                            break;
                        }
                        break;
                    case "architecture":
                        String strO15 = k3Var.O2();
                        if (strO15 == null) {
                            break;
                        } else {
                            w3Var.f95912l = strO15;
                            break;
                        }
                        break;
                    case "transaction_id":
                        String strO16 = k3Var.O2();
                        if (strO16 == null) {
                            break;
                        } else {
                            w3Var.f95922x = strO16;
                            break;
                        }
                        break;
                    case "device_os_version":
                        String strO17 = k3Var.O2();
                        if (strO17 == null) {
                            break;
                        } else {
                            w3Var.f95910j = strO17;
                            break;
                        }
                        break;
                    case "truncation_reason":
                        String strO18 = k3Var.O2();
                        if (strO18 == null) {
                            break;
                        } else {
                            w3Var.B = strO18;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strO19 = k3Var.O2();
                        if (strO19 == null) {
                            break;
                        } else {
                            w3Var.f95923y = strO19;
                            break;
                        }
                        break;
                    case "platform":
                        String strO20 = k3Var.O2();
                        if (strO20 == null) {
                            break;
                        } else {
                            w3Var.f95915p = strO20;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strO21 = k3Var.O2();
                        if (strO21 == null) {
                            break;
                        } else {
                            w3Var.E = strO21;
                            break;
                        }
                        break;
                    case "transactions":
                        List listT3 = k3Var.T3(v0Var, new x3.a());
                        if (listT3 == null) {
                            break;
                        } else {
                            w3Var.f95917r.addAll(listT3);
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
            w3Var.G(concurrentHashMap);
            k3Var.h0();
            return w3Var;
        }
    }

    private boolean D() {
        return this.B.equals("normal") || this.B.equals("timeout") || this.B.equals("backgrounded");
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f95924z;
    }

    public File C() {
        return this.f95902a;
    }

    public void E() {
        try {
            this.f95913m = this.f95903b.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.E = str;
    }

    public void G(Map<String, Object> map) {
        this.F = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("android_api_level").l(v0Var, Integer.valueOf(this.f95904c));
        l3Var.f("device_locale").l(v0Var, this.f95905d);
        l3Var.f("device_manufacturer").h(this.f95906e);
        l3Var.f("device_model").h(this.f95907f);
        l3Var.f("device_os_build_number").h(this.f95908g);
        l3Var.f("device_os_name").h(this.f95909h);
        l3Var.f("device_os_version").h(this.f95910j);
        l3Var.f("device_is_emulator").d(this.f95911k);
        l3Var.f("architecture").l(v0Var, this.f95912l);
        l3Var.f("device_cpu_frequencies").l(v0Var, this.f95913m);
        l3Var.f("device_physical_memory_bytes").h(this.f95914n);
        l3Var.f("platform").h(this.f95915p);
        l3Var.f("build_id").h(this.f95916q);
        l3Var.f("transaction_name").h(this.f95918s);
        l3Var.f("duration_ns").h(this.f95919t);
        l3Var.f("version_name").h(this.f95921w);
        l3Var.f("version_code").h(this.f95920v);
        if (!this.f95917r.isEmpty()) {
            l3Var.f("transactions").l(v0Var, this.f95917r);
        }
        l3Var.f("transaction_id").h(this.f95922x);
        l3Var.f("trace_id").h(this.f95923y);
        l3Var.f("profile_id").h(this.f95924z);
        l3Var.f("environment").h(this.A);
        l3Var.f("truncation_reason").h(this.B);
        if (this.E != null) {
            l3Var.f("sampled_profile").h(this.E);
        }
        String strA = l3Var.a();
        l3Var.j("");
        l3Var.f("measurements").l(v0Var, this.D);
        l3Var.j(strA);
        l3Var.f("timestamp").l(v0Var, this.C);
        Map<String, Object> map = this.F;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.F.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    private w3() {
        this(new File("dummy"), g3.B());
    }

    public w3(File file, l1 l1Var) {
        this(file, m.d(), new ArrayList(), l1Var.getName(), l1Var.i().toString(), l1Var.w().n().toString(), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1, 0, "", new Callable() { // from class: io.sentry.v3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w3.a();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public w3(File file, Date date, List<x3> list, String str, String str2, String str3, String str4, int i15, String str5, Callable<List<Integer>> callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map<String, io.sentry.profilemeasurements.a> map) {
        this.f95913m = new ArrayList();
        this.E = null;
        this.f95902a = file;
        this.C = date;
        this.f95912l = str5;
        this.f95903b = callable;
        this.f95904c = i15;
        this.f95905d = Locale.getDefault().toString();
        this.f95906e = str6 == null ? "" : str6;
        this.f95907f = str7 == null ? "" : str7;
        this.f95910j = str8 == null ? "" : str8;
        this.f95911k = bool != null ? bool.booleanValue() : false;
        this.f95914n = str9 != null ? str9 : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1;
        this.f95908g = "";
        this.f95909h = "android";
        this.f95915p = "android";
        this.f95916q = str10 != null ? str10 : "";
        this.f95917r = list;
        this.f95918s = str.isEmpty() ? "unknown" : str;
        this.f95919t = str4;
        this.f95920v = "";
        this.f95921w = str11 != null ? str11 : "";
        this.f95922x = str2;
        this.f95923y = str3;
        this.f95924z = g8.a();
        this.A = str12 != null ? str12 : "production";
        this.B = str13;
        if (!D()) {
            this.B = "normal";
        }
        this.D = map;
    }
}
