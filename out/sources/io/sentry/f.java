package io.sentry;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements d2, Comparable<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f94890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f94891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f94892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f94894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f94895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f94896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f94897h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b7 f94898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f94899k;

    public static final class a implements t1<f> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            Date dateD = m.d();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            b7 b7VarA = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "origin":
                        strO5 = k3Var.O2();
                        break;
                    case "data":
                        Map mapC = io.sentry.util.c.c((Map) k3Var.K3());
                        if (mapC == null) {
                            break;
                        } else {
                            concurrentHashMap = mapC;
                            break;
                        }
                        break;
                    case "type":
                        strO3 = k3Var.O2();
                        break;
                    case "category":
                        strO4 = k3Var.O2();
                        break;
                    case "timestamp":
                        Date dateP1 = k3Var.p1(v0Var);
                        if (dateP1 == null) {
                            break;
                        } else {
                            dateD = dateP1;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            b7VarA = new b7.a().a(k3Var, v0Var);
                            break;
                        } catch (Exception e15) {
                            v0Var.a(b7.ERROR, e15, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strO2 = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap2, strH1);
                        break;
                }
            }
            f fVar = new f(dateD);
            fVar.f94893d = strO2;
            fVar.f94894e = strO3;
            fVar.f94895f = concurrentHashMap;
            fVar.f94896g = strO4;
            fVar.f94897h = strO5;
            fVar.f94898j = b7VarA;
            fVar.G(concurrentHashMap2);
            k3Var.h0();
            return fVar;
        }
    }

    public f(Date date) {
        this.f94895f = new ConcurrentHashMap();
        this.f94892c = Long.valueOf(System.nanoTime());
        this.f94891b = date;
        this.f94890a = null;
    }

    public static f H(String str, String str2, String str3, String str4, Map<String, Object> map) {
        f fVar = new f();
        fVar.F("user");
        fVar.z("ui." + str);
        if (str2 != null) {
            fVar.A("view.id", str2);
        }
        if (str3 != null) {
            fVar.A("view.class", str3);
        }
        if (str4 != null) {
            fVar.A("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            fVar.p().put(entry.getKey(), entry.getValue());
        }
        fVar.B(b7.INFO);
        return fVar;
    }

    public static f v(String str, String str2) {
        f fVar = new f();
        io.sentry.util.l0.a aVarC = io.sentry.util.l0.c(str);
        fVar.F("http");
        fVar.z("http");
        if (aVarC.e() != null) {
            fVar.A("url", aVarC.e());
        }
        fVar.A("method", str2.toUpperCase(Locale.ROOT));
        if (aVarC.d() != null) {
            fVar.A("http.query", aVarC.d());
        }
        if (aVarC.c() != null) {
            fVar.A("http.fragment", aVarC.c());
        }
        return fVar;
    }

    public static f w(String str, String str2, Integer num) {
        f fVarV = v(str, str2);
        if (num != null) {
            fVarV.A("status_code", num);
            fVarV.B(x(num));
        }
        return fVarV;
    }

    private static b7 x(Integer num) {
        if (io.sentry.util.n.b(num.intValue())) {
            return b7.WARNING;
        }
        if (io.sentry.util.n.c(num.intValue())) {
            return b7.ERROR;
        }
        return null;
    }

    public void A(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            y(str);
        } else {
            this.f94895f.put(str, obj);
        }
    }

    public void B(b7 b7Var) {
        this.f94898j = b7Var;
    }

    public void D(String str) {
        this.f94893d = str;
    }

    public void F(String str) {
        this.f94894e = str;
    }

    public void G(Map<String, Object> map) {
        this.f94899k = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (s().getTime() == fVar.s().getTime() && io.sentry.util.v.a(this.f94893d, fVar.f94893d) && io.sentry.util.v.a(this.f94894e, fVar.f94894e) && io.sentry.util.v.a(this.f94896g, fVar.f94896g) && io.sentry.util.v.a(this.f94897h, fVar.f94897h) && this.f94898j == fVar.f94898j) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f94891b, this.f94893d, this.f94894e, this.f94896g, this.f94897h, this.f94898j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f94892c.compareTo(fVar.f94892c);
    }

    public String o() {
        return this.f94896g;
    }

    public Map<String, Object> p() {
        return this.f94895f;
    }

    public b7 q() {
        return this.f94898j;
    }

    public String r() {
        return this.f94893d;
    }

    public Date s() {
        Date date = this.f94891b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l15 = this.f94890a;
        if (l15 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateE = m.e(l15.longValue());
        this.f94891b = dateE;
        return dateE;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("timestamp").l(v0Var, s());
        if (this.f94893d != null) {
            l3Var.f("message").h(this.f94893d);
        }
        if (this.f94894e != null) {
            l3Var.f("type").h(this.f94894e);
        }
        l3Var.f("data").l(v0Var, this.f94895f);
        if (this.f94896g != null) {
            l3Var.f("category").h(this.f94896g);
        }
        if (this.f94897h != null) {
            l3Var.f("origin").h(this.f94897h);
        }
        if (this.f94898j != null) {
            l3Var.f("level").l(v0Var, this.f94898j);
        }
        Map<String, Object> map = this.f94899k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f94899k.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public String t() {
        return this.f94894e;
    }

    public void y(String str) {
        if (str == null) {
            return;
        }
        this.f94895f.remove(str);
    }

    public void z(String str) {
        this.f94896g = str;
    }

    public f(long j15) {
        this.f94895f = new ConcurrentHashMap();
        this.f94892c = Long.valueOf(System.nanoTime());
        this.f94890a = Long.valueOf(j15);
        this.f94891b = null;
    }

    f(f fVar) {
        this.f94895f = new ConcurrentHashMap();
        this.f94892c = Long.valueOf(System.nanoTime());
        this.f94891b = fVar.f94891b;
        this.f94890a = fVar.f94890a;
        this.f94893d = fVar.f94893d;
        this.f94894e = fVar.f94894e;
        this.f94896g = fVar.f94896g;
        this.f94897h = fVar.f94897h;
        Map<String, Object> mapC = io.sentry.util.c.c(fVar.f94895f);
        if (mapC != null) {
            this.f94895f = mapC;
        }
        this.f94899k = io.sentry.util.c.c(fVar.f94899k);
        this.f94898j = fVar.f94898j;
    }

    public f() {
        this(System.currentTimeMillis());
    }
}
