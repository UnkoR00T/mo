package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class z8 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f96003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f96004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f96005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f96006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f96007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f96008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f96009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f96010h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f96011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.protocol.v f96012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f96013l;

    public static final class a implements t1<z8> {
        private Exception c(String str, v0 v0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            v0Var.b(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z8 a(k3 k3Var, v0 v0Var) throws Exception {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.v vVarA = null;
            String strQ2 = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            String strO6 = null;
            String strO7 = null;
            io.sentry.protocol.v vVarA2 = null;
            String strO8 = null;
            while (true) {
                io.sentry.protocol.v vVar = vVarA;
                String str = strQ2;
                if (k3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (vVar == null) {
                        throw c("trace_id", v0Var);
                    }
                    if (str == null) {
                        throw c("public_key", v0Var);
                    }
                    z8 z8Var = new z8(vVar, str, strO2, strO3, strO4, strO5, strO6, strO7, vVarA2, strO8);
                    z8Var.c(concurrentHashMap);
                    k3Var.h0();
                    return z8Var;
                }
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "replay_id":
                        vVarA2 = new io.sentry.protocol.v.a().a(k3Var, v0Var);
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "user_id":
                        strO4 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "environment":
                        strO3 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "sample_rand":
                        strO8 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "sample_rate":
                        strO6 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "release":
                        strO2 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "trace_id":
                        vVarA = new io.sentry.protocol.v.a().a(k3Var, v0Var);
                        strQ2 = str;
                        break;
                    case "sampled":
                        strO7 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    case "public_key":
                        strQ2 = k3Var.q2();
                        vVarA = vVar;
                        break;
                    case "transaction":
                        strO5 = k3Var.O2();
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        vVarA = vVar;
                        strQ2 = str;
                        break;
                }
            }
        }
    }

    z8(io.sentry.protocol.v vVar, String str) {
        this(vVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f96010h;
    }

    public String b() {
        return this.f96009g;
    }

    public void c(Map<String, Object> map) {
        this.f96013l = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("trace_id").l(v0Var, this.f96003a);
        l3Var.f("public_key").h(this.f96004b);
        if (this.f96005c != null) {
            l3Var.f(BuildConfig.BUILD_TYPE).h(this.f96005c);
        }
        if (this.f96006d != null) {
            l3Var.f("environment").h(this.f96006d);
        }
        if (this.f96007e != null) {
            l3Var.f("user_id").h(this.f96007e);
        }
        if (this.f96008f != null) {
            l3Var.f("transaction").h(this.f96008f);
        }
        if (this.f96009g != null) {
            l3Var.f("sample_rate").h(this.f96009g);
        }
        if (this.f96010h != null) {
            l3Var.f("sample_rand").h(this.f96010h);
        }
        if (this.f96011j != null) {
            l3Var.f("sampled").h(this.f96011j);
        }
        if (this.f96012k != null) {
            l3Var.f("replay_id").l(v0Var, this.f96012k);
        }
        Map<String, Object> map = this.f96013l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f96013l.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    @Deprecated
    z8(io.sentry.protocol.v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.v vVar2) {
        this(vVar, str, str2, str3, str4, str5, str6, str7, vVar2, null);
    }

    z8(io.sentry.protocol.v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.v vVar2, String str8) {
        this.f96003a = vVar;
        this.f96004b = str;
        this.f96005c = str2;
        this.f96006d = str3;
        this.f96007e = str4;
        this.f96008f = str5;
        this.f96009g = str6;
        this.f96011j = str7;
        this.f96012k = vVar2;
        this.f96010h = str8;
    }
}
