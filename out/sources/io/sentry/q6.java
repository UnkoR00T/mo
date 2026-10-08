package io.sentry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class q6 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f95560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f95561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f95562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a7 f95563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f95564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Callable<Integer> f95565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f95566h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f95567j;

    public static final class a implements t1<q6> {
        private Exception c(String str, v0 v0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            v0Var.b(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q6 a(k3 k3Var, v0 v0Var) throws Exception {
            k3Var.Y();
            HashMap map = null;
            a7 a7Var = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            Integer numZ2 = null;
            int iNextInt = 0;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "item_count":
                        numZ2 = k3Var.z2();
                        break;
                    case "length":
                        iNextInt = k3Var.nextInt();
                        break;
                    case "filename":
                        strO3 = k3Var.O2();
                        break;
                    case "attachment_type":
                        strO4 = k3Var.O2();
                        break;
                    case "type":
                        a7Var = (a7) k3Var.M1(v0Var, new a7.a());
                        break;
                    case "content_type":
                        strO2 = k3Var.O2();
                        break;
                    case "platform":
                        strO5 = k3Var.O2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            if (a7Var == null) {
                throw c("type", v0Var);
            }
            q6 q6Var = new q6(a7Var, iNextInt, strO2, strO3, strO4, strO5, numZ2);
            q6Var.c(map);
            k3Var.h0();
            return q6Var;
        }
    }

    public q6(a7 a7Var, int i15, String str, String str2, String str3, String str4, Integer num) {
        this.f95563e = (a7) io.sentry.util.v.c(a7Var, "type is required");
        this.f95559a = str;
        this.f95564f = i15;
        this.f95561c = str2;
        this.f95565g = null;
        this.f95566h = str3;
        this.f95562d = str4;
        this.f95560b = num;
    }

    public int a() {
        Callable<Integer> callable = this.f95565g;
        if (callable == null) {
            return this.f95564f;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public a7 b() {
        return this.f95563e;
    }

    public void c(Map<String, Object> map) {
        this.f95567j = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95559a != null) {
            l3Var.f("content_type").h(this.f95559a);
        }
        if (this.f95561c != null) {
            l3Var.f("filename").h(this.f95561c);
        }
        l3Var.f("type").l(v0Var, this.f95563e);
        if (this.f95566h != null) {
            l3Var.f("attachment_type").h(this.f95566h);
        }
        if (this.f95562d != null) {
            l3Var.f("platform").h(this.f95562d);
        }
        if (this.f95560b != null) {
            l3Var.f("item_count").k(this.f95560b);
        }
        l3Var.f("length").b(a());
        Map<String, Object> map = this.f95567j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95567j.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    q6(a7 a7Var, Callable<Integer> callable, String str, String str2, String str3) {
        this(a7Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    q6(a7 a7Var, Callable<Integer> callable, String str, String str2, String str3, String str4, Integer num) {
        this.f95563e = (a7) io.sentry.util.v.c(a7Var, "type is required");
        this.f95559a = str;
        this.f95564f = -1;
        this.f95561c = str2;
        this.f95565g = callable;
        this.f95566h = str3;
        this.f95562d = str4;
        this.f95560b = num;
    }

    q6(a7 a7Var, Callable<Integer> callable, String str, String str2) {
        this(a7Var, callable, str, str2, null);
    }
}
