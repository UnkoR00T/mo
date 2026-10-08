package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.conscrypt.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {
    private Boolean A;
    private Boolean B;
    private String C;
    private List<String> D;
    private List<String> E;
    private Boolean F;
    private Boolean G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private Boolean K;
    private q7.f L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f94967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f94968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f94969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f94971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f94972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f94973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f94974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f94975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f94976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q7.l f94977k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q7.k f94979m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f94984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f94985s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<String> f94987u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f94988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f94989w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f94991y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f94992z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f94978l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<String> f94980n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<String> f94981o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<String> f94982p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<String> f94983q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set<Class<? extends Throwable>> f94986t = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<String> f94990x = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    public static g0 g(io.sentry.config.f fVar, v0 v0Var) {
        g0 g0Var = new g0();
        g0Var.X(fVar.getProperty("dsn"));
        g0Var.f0(fVar.getProperty("environment"));
        g0Var.r0(fVar.getProperty(BuildConfig.BUILD_TYPE));
        g0Var.W(fVar.getProperty("dist"));
        g0Var.v0(fVar.getProperty("servername"));
        g0Var.d0(fVar.f("uncaught.handler.enabled"));
        g0Var.n0(fVar.f("uncaught.handler.print-stacktrace"));
        g0Var.y0(fVar.c("traces-sample-rate"));
        g0Var.o0(fVar.c("profiles-sample-rate"));
        g0Var.V(fVar.f("debug"));
        g0Var.Z(fVar.f("enable-deduplication"));
        g0Var.s0(fVar.f("send-client-reports"));
        g0Var.g0(fVar.f("force-init"));
        String property = fVar.getProperty("max-request-body-size");
        if (property != null) {
            g0Var.m0(q7.l.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : fVar.a("tags").entrySet()) {
            g0Var.x0(entry.getKey(), entry.getValue());
        }
        String property2 = fVar.getProperty("proxy.host");
        String property3 = fVar.getProperty("proxy.user");
        String property4 = fVar.getProperty("proxy.pass");
        String strD = fVar.d("proxy.port", "80");
        if (property2 != null) {
            g0Var.q0(new q7.k(property2, strD, property3, property4));
        }
        Iterator<String> it = fVar.e("in-app-includes").iterator();
        while (it.hasNext()) {
            g0Var.e(it.next());
        }
        Iterator<String> it4 = fVar.e("in-app-excludes").iterator();
        while (it4.hasNext()) {
            g0Var.d(it4.next());
        }
        List<String> listE = fVar.getProperty("trace-propagation-targets") != null ? fVar.e("trace-propagation-targets") : null;
        if (listE == null && fVar.getProperty("tracing-origins") != null) {
            listE = fVar.e("tracing-origins");
        }
        if (listE != null) {
            Iterator<String> it5 = listE.iterator();
            while (it5.hasNext()) {
                g0Var.f(it5.next());
            }
        }
        Iterator<String> it6 = fVar.e("context-tags").iterator();
        while (it6.hasNext()) {
            g0Var.b(it6.next());
        }
        g0Var.p0(fVar.getProperty("proguard-uuid"));
        Iterator<String> it7 = fVar.e("bundle-ids").iterator();
        while (it7.hasNext()) {
            g0Var.a(it7.next());
        }
        g0Var.i0(fVar.b("idle-timeout"));
        g0Var.k0(fVar.g("ignored-errors"));
        g0Var.e0(fVar.f("enabled"));
        g0Var.b0(fVar.f("enable-pretty-serialization-output"));
        g0Var.u0(fVar.f("send-modules"));
        g0Var.t0(fVar.f("send-default-pii"));
        g0Var.j0(fVar.g("ignored-checkins"));
        g0Var.l0(fVar.g("ignored-transactions"));
        g0Var.Y(fVar.f("enable-backpressure-handling"));
        g0Var.h0(fVar.f("global-hub-mode"));
        g0Var.T(fVar.f("capture-open-telemetry-events"));
        g0Var.a0(fVar.f("logs.enabled"));
        for (String str : fVar.e("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    g0Var.c(cls);
                } else {
                    v0Var.c(b7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                v0Var.c(b7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long lB = fVar.b("cron.default-checkin-margin");
        Long lB2 = fVar.b("cron.default-max-runtime");
        String property5 = fVar.getProperty("cron.default-timezone");
        Long lB3 = fVar.b("cron.default-failure-issue-threshold");
        Long lB4 = fVar.b("cron.default-recovery-threshold");
        if (lB != null || lB2 != null || property5 != null || lB3 != null || lB4 != null) {
            q7.f fVar2 = new q7.f();
            fVar2.f(lB);
            fVar2.h(lB2);
            fVar2.j(property5);
            fVar2.g(lB3);
            fVar2.i(lB4);
            g0Var.U(fVar2);
        }
        g0Var.c0(fVar.f("enable-spotlight"));
        g0Var.w0(fVar.getProperty("spotlight-connection-url"));
        return g0Var;
    }

    public String A() {
        return this.f94984r;
    }

    public q7.k B() {
        return this.f94979m;
    }

    public String C() {
        return this.f94969c;
    }

    public Boolean D() {
        return this.f94989w;
    }

    public String E() {
        return this.f94971e;
    }

    public String F() {
        return this.C;
    }

    public Map<String, String> G() {
        return this.f94978l;
    }

    public List<String> H() {
        return this.f94982p;
    }

    public Double I() {
        return this.f94975i;
    }

    public Boolean J() {
        return this.K;
    }

    public Boolean K() {
        return this.H;
    }

    public Boolean L() {
        return this.B;
    }

    public Boolean M() {
        return this.f94992z;
    }

    public Boolean N() {
        return this.A;
    }

    public Boolean O() {
        return this.f94991y;
    }

    public Boolean P() {
        return this.J;
    }

    public Boolean Q() {
        return this.I;
    }

    public Boolean R() {
        return this.G;
    }

    public Boolean S() {
        return this.F;
    }

    public void T(Boolean bool) {
        this.K = bool;
    }

    public void U(q7.f fVar) {
        this.L = fVar;
    }

    public void V(Boolean bool) {
        this.f94973g = bool;
    }

    public void W(String str) {
        this.f94970d = str;
    }

    public void X(String str) {
        this.f94967a = str;
    }

    public void Y(Boolean bool) {
        this.H = bool;
    }

    public void Z(Boolean bool) {
        this.f94974h = bool;
    }

    public void a(String str) {
        this.f94990x.add(str);
    }

    public void a0(Boolean bool) {
        this.B = bool;
    }

    public void b(String str) {
        this.f94983q.add(str);
    }

    public void b0(Boolean bool) {
        this.f94992z = bool;
    }

    public void c(Class<? extends Throwable> cls) {
        this.f94986t.add(cls);
    }

    public void c0(Boolean bool) {
        this.A = bool;
    }

    public void d(String str) {
        this.f94980n.add(str);
    }

    public void d0(Boolean bool) {
        this.f94972f = bool;
    }

    public void e(String str) {
        this.f94981o.add(str);
    }

    public void e0(Boolean bool) {
        this.f94991y = bool;
    }

    public void f(String str) {
        if (this.f94982p == null) {
            this.f94982p = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f94982p.add(str);
    }

    public void f0(String str) {
        this.f94968b = str;
    }

    public void g0(Boolean bool) {
        this.J = bool;
    }

    public Set<String> h() {
        return this.f94990x;
    }

    public void h0(Boolean bool) {
        this.I = bool;
    }

    public List<String> i() {
        return this.f94983q;
    }

    public void i0(Long l15) {
        this.f94985s = l15;
    }

    public q7.f j() {
        return this.L;
    }

    public void j0(List<String> list) {
        this.D = list;
    }

    public Boolean k() {
        return this.f94973g;
    }

    public void k0(List<String> list) {
        this.f94987u = list;
    }

    public String l() {
        return this.f94970d;
    }

    public void l0(List<String> list) {
        this.E = list;
    }

    public String m() {
        return this.f94967a;
    }

    public void m0(q7.l lVar) {
        this.f94977k = lVar;
    }

    public Boolean n() {
        return this.f94974h;
    }

    public void n0(Boolean bool) {
        this.f94988v = bool;
    }

    public Boolean o() {
        return this.f94972f;
    }

    public void o0(Double d15) {
        this.f94976j = d15;
    }

    public String p() {
        return this.f94968b;
    }

    public void p0(String str) {
        this.f94984r = str;
    }

    public Long q() {
        return this.f94985s;
    }

    public void q0(q7.k kVar) {
        this.f94979m = kVar;
    }

    public List<String> r() {
        return this.D;
    }

    public void r0(String str) {
        this.f94969c = str;
    }

    public List<String> s() {
        return this.f94987u;
    }

    public void s0(Boolean bool) {
        this.f94989w = bool;
    }

    public Set<Class<? extends Throwable>> t() {
        return this.f94986t;
    }

    public void t0(Boolean bool) {
        this.G = bool;
    }

    public List<String> u() {
        return this.E;
    }

    public void u0(Boolean bool) {
        this.F = bool;
    }

    public List<String> v() {
        return this.f94980n;
    }

    public void v0(String str) {
        this.f94971e = str;
    }

    public List<String> w() {
        return this.f94981o;
    }

    public void w0(String str) {
        this.C = str;
    }

    public q7.l x() {
        return this.f94977k;
    }

    public void x0(String str, String str2) {
        this.f94978l.put(str, str2);
    }

    public Boolean y() {
        return this.f94988v;
    }

    public void y0(Double d15) {
        this.f94975i = d15;
    }

    public Double z() {
        return this.f94976j;
    }
}
