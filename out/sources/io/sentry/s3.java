package io.sentry;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class s3 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.d f95678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.v f95679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.v f95680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.p f95681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, io.sentry.profilemeasurements.a> f95682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f95685h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f95686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f95687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final File f95688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f95689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f95690n;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.protocol.v f95691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.protocol.v f95692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, io.sentry.profilemeasurements.a> f95693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File f95694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f95695e;

        public a(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, Map<String, io.sentry.profilemeasurements.a> map, File file, n5 n5Var) {
            this.f95691a = vVar;
            this.f95692b = vVar2;
            this.f95693c = new ConcurrentHashMap(map);
            this.f95694d = file;
            this.f95695e = m.m(n5Var.l());
        }

        public s3 a(q7 q7Var) {
            return new s3(this.f95691a, this.f95692b, this.f95694d, this.f95693c, Double.valueOf(this.f95695e), q7Var);
        }
    }

    public static final class b implements t1<s3> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s3 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            s3 s3Var = new s3();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "debug_meta":
                        io.sentry.protocol.d dVar = (io.sentry.protocol.d) k3Var.M1(v0Var, new io.sentry.protocol.d.a());
                        if (dVar == null) {
                            break;
                        } else {
                            s3Var.f95678a = dVar;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapS2 = k3Var.S2(v0Var, new io.sentry.profilemeasurements.a.C2239a());
                        if (mapS2 == null) {
                            break;
                        } else {
                            s3Var.f95682e.putAll(mapS2);
                            break;
                        }
                        break;
                    case "environment":
                        String strO2 = k3Var.O2();
                        if (strO2 == null) {
                            break;
                        } else {
                            s3Var.f95685h = strO2;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dF1 = k3Var.f1();
                        if (dF1 == null) {
                            break;
                        } else {
                            s3Var.f95687k = dF1.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        io.sentry.protocol.v vVar = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
                        if (vVar == null) {
                            break;
                        } else {
                            s3Var.f95679b = vVar;
                            break;
                        }
                        break;
                    case "version":
                        String strO3 = k3Var.O2();
                        if (strO3 == null) {
                            break;
                        } else {
                            s3Var.f95686j = strO3;
                            break;
                        }
                        break;
                    case "release":
                        String strO4 = k3Var.O2();
                        if (strO4 == null) {
                            break;
                        } else {
                            s3Var.f95684g = strO4;
                            break;
                        }
                        break;
                    case "client_sdk":
                        io.sentry.protocol.p pVar = (io.sentry.protocol.p) k3Var.M1(v0Var, new io.sentry.protocol.p.a());
                        if (pVar == null) {
                            break;
                        } else {
                            s3Var.f95681d = pVar;
                            break;
                        }
                        break;
                    case "platform":
                        String strO5 = k3Var.O2();
                        if (strO5 == null) {
                            break;
                        } else {
                            s3Var.f95683f = strO5;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strO6 = k3Var.O2();
                        if (strO6 == null) {
                            break;
                        } else {
                            s3Var.f95689m = strO6;
                            break;
                        }
                        break;
                    case "chunk_id":
                        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
                        if (vVar2 == null) {
                            break;
                        } else {
                            s3Var.f95680c = vVar2;
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
            s3Var.r(concurrentHashMap);
            k3Var.h0();
            return s3Var;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s3() {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        this(vVar, vVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), q7.empty());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return Objects.equals(this.f95678a, s3Var.f95678a) && Objects.equals(this.f95679b, s3Var.f95679b) && Objects.equals(this.f95680c, s3Var.f95680c) && Objects.equals(this.f95681d, s3Var.f95681d) && Objects.equals(this.f95682e, s3Var.f95682e) && Objects.equals(this.f95683f, s3Var.f95683f) && Objects.equals(this.f95684g, s3Var.f95684g) && Objects.equals(this.f95685h, s3Var.f95685h) && Objects.equals(this.f95686j, s3Var.f95686j) && Objects.equals(this.f95689m, s3Var.f95689m) && Objects.equals(this.f95690n, s3Var.f95690n);
    }

    public int hashCode() {
        return Objects.hash(this.f95678a, this.f95679b, this.f95680c, this.f95681d, this.f95682e, this.f95683f, this.f95684g, this.f95685h, this.f95686j, this.f95689m, this.f95690n);
    }

    public io.sentry.protocol.v l() {
        return this.f95680c;
    }

    public io.sentry.protocol.d m() {
        return this.f95678a;
    }

    public String n() {
        return this.f95683f;
    }

    public File o() {
        return this.f95688l;
    }

    public void p(io.sentry.protocol.d dVar) {
        this.f95678a = dVar;
    }

    public void q(String str) {
        this.f95689m = str;
    }

    public void r(Map<String, Object> map) {
        this.f95690n = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95678a != null) {
            l3Var.f("debug_meta").l(v0Var, this.f95678a);
        }
        l3Var.f("profiler_id").l(v0Var, this.f95679b);
        l3Var.f("chunk_id").l(v0Var, this.f95680c);
        if (this.f95681d != null) {
            l3Var.f("client_sdk").l(v0Var, this.f95681d);
        }
        if (!this.f95682e.isEmpty()) {
            String strA = l3Var.a();
            l3Var.j("");
            l3Var.f("measurements").l(v0Var, this.f95682e);
            l3Var.j(strA);
        }
        l3Var.f("platform").l(v0Var, this.f95683f);
        l3Var.f(BuildConfig.BUILD_TYPE).l(v0Var, this.f95684g);
        if (this.f95685h != null) {
            l3Var.f("environment").l(v0Var, this.f95685h);
        }
        l3Var.f("version").l(v0Var, this.f95686j);
        if (this.f95689m != null) {
            l3Var.f("sampled_profile").l(v0Var, this.f95689m);
        }
        l3Var.f("timestamp").l(v0Var, Double.valueOf(this.f95687k));
        Map<String, Object> map = this.f95690n;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95690n.get(str));
            }
        }
        l3Var.h0();
    }

    public s3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, File file, Map<String, io.sentry.profilemeasurements.a> map, Double d15, q7 q7Var) {
        this.f95689m = null;
        this.f95679b = vVar;
        this.f95680c = vVar2;
        this.f95688l = file;
        this.f95682e = map;
        this.f95678a = null;
        this.f95681d = q7Var.getSdkVersion();
        this.f95684g = q7Var.getRelease() != null ? q7Var.getRelease() : "";
        this.f95685h = q7Var.getEnvironment();
        this.f95683f = "android";
        this.f95686j = "2";
        this.f95687k = d15.doubleValue();
    }
}
