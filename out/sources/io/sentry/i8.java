package io.sentry;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class i8 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f95046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f95047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f95048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f95049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f95050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f95051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f95052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f95053h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f95054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f95055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f95056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f95057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f95058n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f95059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final io.sentry.util.a f95060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map<String, Object> f95061r;

    public static final class a implements t1<i8> {
        private Exception c(String str, v0 v0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            v0Var.b(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i8 a(k3 k3Var, v0 v0Var) throws Exception {
            k3Var.Y();
            Integer numZ2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVarValueOf = null;
            Date dateP1 = null;
            Date dateP2 = null;
            String strO2 = null;
            String str = null;
            Boolean boolU1 = null;
            Long lE2 = null;
            Double dF1 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            String strO6 = null;
            String strO7 = null;
            while (true) {
                Integer num = numZ2;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                b bVar = bVarValueOf;
                Date date = dateP1;
                Date date2 = dateP2;
                if (k3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (bVar == null) {
                        throw c("status", v0Var);
                    }
                    if (date == null) {
                        throw c("started", v0Var);
                    }
                    if (num == null) {
                        throw c("errors", v0Var);
                    }
                    if (strO6 == null) {
                        throw c(BuildConfig.BUILD_TYPE, v0Var);
                    }
                    i8 i8Var = new i8(bVar, date, date2, num.intValue(), strO2, str, boolU1, lE2, dF1, strO3, strO4, strO5, strO6, strO7);
                    i8Var.o(concurrentHashMap2);
                    k3Var.h0();
                    return i8Var;
                }
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "duration":
                        dF1 = k3Var.f1();
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "started":
                        dateP1 = k3Var.p1(v0Var);
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP2 = date2;
                        break;
                    case "errors":
                        numZ2 = k3Var.z2();
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "status":
                        String strD = io.sentry.util.d0.d(k3Var.O2());
                        if (strD != null) {
                            bVarValueOf = b.valueOf(strD);
                            numZ2 = num;
                            concurrentHashMap = concurrentHashMap2;
                        } else {
                            numZ2 = num;
                            concurrentHashMap = concurrentHashMap2;
                            bVarValueOf = bVar;
                        }
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "did":
                        strO2 = k3Var.O2();
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "seq":
                        lE2 = k3Var.E2();
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "sid":
                        String strO8 = k3Var.O2();
                        if (strO8 == null || !(strO8.length() == 36 || strO8.length() == 32)) {
                            v0Var.c(b7.ERROR, "%s sid is not valid.", strO8);
                        } else {
                            str = strO8;
                        }
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "init":
                        boolU1 = k3Var.u1();
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "timestamp":
                        dateP2 = k3Var.p1(v0Var);
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        break;
                    case "attrs":
                        k3Var.Y();
                        while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strH2 = k3Var.h1();
                            strH2.getClass();
                            switch (strH2) {
                                case "environment":
                                    strO5 = k3Var.O2();
                                    break;
                                case "release":
                                    strO6 = k3Var.O2();
                                    break;
                                case "ip_address":
                                    strO3 = k3Var.O2();
                                    break;
                                case "user_agent":
                                    strO4 = k3Var.O2();
                                    break;
                                default:
                                    k3Var.G0();
                                    break;
                            }
                        }
                        k3Var.h0();
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    case "abnormal_mechanism":
                        strO7 = k3Var.O2();
                        numZ2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        numZ2 = num;
                        bVarValueOf = bVar;
                        dateP1 = date;
                        dateP2 = date2;
                        break;
                }
            }
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public i8(b bVar, Date date, Date date2, int i15, String str, String str2, Boolean bool, Long l15, Double d15, String str3, String str4, String str5, String str6, String str7) {
        this.f95060q = new io.sentry.util.a();
        this.f95052g = bVar;
        this.f95046a = date;
        this.f95047b = date2;
        this.f95048c = new AtomicInteger(i15);
        this.f95049d = str;
        this.f95050e = str2;
        this.f95051f = bool;
        this.f95053h = l15;
        this.f95054j = d15;
        this.f95055k = str3;
        this.f95056l = str4;
        this.f95057m = str5;
        this.f95058n = str6;
        this.f95059p = str7;
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f95046a.getTime()) / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i8 clone() {
        return new i8(this.f95052g, this.f95046a, this.f95047b, this.f95048c.get(), this.f95049d, this.f95050e, this.f95051f, this.f95053h, this.f95054j, this.f95055k, this.f95056l, this.f95057m, this.f95058n, this.f95059p);
    }

    public void c() {
        d(m.d());
    }

    public void d(Date date) {
        g1 g1VarA = this.f95060q.a();
        try {
            this.f95051f = null;
            if (this.f95052g == b.Ok) {
                this.f95052g = b.Exited;
            }
            if (date != null) {
                this.f95047b = date;
            } else {
                this.f95047b = m.d();
            }
            Date date2 = this.f95047b;
            if (date2 != null) {
                this.f95054j = Double.valueOf(a(date2));
                this.f95053h = Long.valueOf(i(this.f95047b));
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public int e() {
        return this.f95048c.get();
    }

    public String f() {
        return this.f95059p;
    }

    public Boolean g() {
        return this.f95051f;
    }

    public String h() {
        return this.f95058n;
    }

    public String j() {
        return this.f95050e;
    }

    public Date k() {
        Date date = this.f95046a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f95052g;
    }

    public boolean m() {
        return this.f95052g != b.Ok;
    }

    public void n() {
        this.f95051f = Boolean.TRUE;
    }

    public void o(Map<String, Object> map) {
        this.f95061r = map;
    }

    public boolean p(b bVar, String str, boolean z15) {
        return q(bVar, str, z15, null);
    }

    public boolean q(b bVar, String str, boolean z15, String str2) {
        boolean z16;
        g1 g1VarA = this.f95060q.a();
        boolean z17 = true;
        if (bVar != null) {
            try {
                this.f95052g = bVar;
                z16 = true;
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } else {
            z16 = false;
        }
        if (str != null) {
            this.f95056l = str;
            z16 = true;
        }
        if (z15) {
            this.f95048c.addAndGet(1);
            z16 = true;
        }
        if (str2 != null) {
            this.f95059p = str2;
        } else {
            z17 = z16;
        }
        if (z17) {
            this.f95051f = null;
            Date dateD = m.d();
            this.f95047b = dateD;
            if (dateD != null) {
                this.f95053h = Long.valueOf(i(dateD));
            }
        }
        if (g1VarA != null) {
            g1VarA.close();
        }
        return z17;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95050e != null) {
            l3Var.f("sid").h(this.f95050e);
        }
        if (this.f95049d != null) {
            l3Var.f("did").h(this.f95049d);
        }
        if (this.f95051f != null) {
            l3Var.f("init").m(this.f95051f);
        }
        l3Var.f("started").l(v0Var, this.f95046a);
        l3Var.f("status").l(v0Var, this.f95052g.name().toLowerCase(Locale.ROOT));
        if (this.f95053h != null) {
            l3Var.f("seq").k(this.f95053h);
        }
        l3Var.f("errors").b(this.f95048c.intValue());
        if (this.f95054j != null) {
            l3Var.f("duration").k(this.f95054j);
        }
        if (this.f95047b != null) {
            l3Var.f("timestamp").l(v0Var, this.f95047b);
        }
        if (this.f95059p != null) {
            l3Var.f("abnormal_mechanism").l(v0Var, this.f95059p);
        }
        l3Var.f("attrs");
        l3Var.Y();
        l3Var.f(BuildConfig.BUILD_TYPE).l(v0Var, this.f95058n);
        if (this.f95057m != null) {
            l3Var.f("environment").l(v0Var, this.f95057m);
        }
        if (this.f95055k != null) {
            l3Var.f("ip_address").l(v0Var, this.f95055k);
        }
        if (this.f95056l != null) {
            l3Var.f("user_agent").l(v0Var, this.f95056l);
        }
        l3Var.h0();
        Map<String, Object> map = this.f95061r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95061r.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public i8(String str, io.sentry.protocol.g0 g0Var, String str2, String str3) {
        this(b.Ok, m.d(), m.d(), 0, str, g8.a(), Boolean.TRUE, null, null, g0Var != null ? g0Var.j() : null, null, str2, str3, null);
    }
}
