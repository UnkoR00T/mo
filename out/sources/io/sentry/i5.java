package io.sentry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.v f95027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.c f95028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.p f95029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.m f95030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f95031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f95034h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.protocol.g0 f95035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected transient Throwable f95036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f95037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f95038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<f> f95039n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.sentry.protocol.d f95040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, Object> f95041q;

    public static final class a {
        public boolean a(i5 i5Var, String str, k3 k3Var, v0 v0Var) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    i5Var.f95040p = (io.sentry.protocol.d) k3Var.M1(v0Var, new io.sentry.protocol.d.a());
                    return true;
                case "server_name":
                    i5Var.f95037l = k3Var.O2();
                    return true;
                case "contexts":
                    i5Var.f95028b.l(new io.sentry.protocol.c.a().a(k3Var, v0Var));
                    return true;
                case "environment":
                    i5Var.f95033g = k3Var.O2();
                    return true;
                case "breadcrumbs":
                    i5Var.f95039n = k3Var.T3(v0Var, new f.a());
                    return true;
                case "sdk":
                    i5Var.f95029c = (io.sentry.protocol.p) k3Var.M1(v0Var, new io.sentry.protocol.p.a());
                    return true;
                case "dist":
                    i5Var.f95038m = k3Var.O2();
                    return true;
                case "tags":
                    i5Var.f95031e = io.sentry.util.c.c((Map) k3Var.K3());
                    return true;
                case "user":
                    i5Var.f95035j = (io.sentry.protocol.g0) k3Var.M1(v0Var, new io.sentry.protocol.g0.a());
                    return true;
                case "extra":
                    i5Var.f95041q = io.sentry.util.c.c((Map) k3Var.K3());
                    return true;
                case "event_id":
                    i5Var.f95027a = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
                    return true;
                case "release":
                    i5Var.f95032f = k3Var.O2();
                    return true;
                case "request":
                    i5Var.f95030d = (io.sentry.protocol.m) k3Var.M1(v0Var, new io.sentry.protocol.m.a());
                    return true;
                case "platform":
                    i5Var.f95034h = k3Var.O2();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class b {
        public void a(i5 i5Var, l3 l3Var, v0 v0Var) {
            if (i5Var.f95027a != null) {
                l3Var.f("event_id").l(v0Var, i5Var.f95027a);
            }
            l3Var.f("contexts").l(v0Var, i5Var.f95028b);
            if (i5Var.f95029c != null) {
                l3Var.f("sdk").l(v0Var, i5Var.f95029c);
            }
            if (i5Var.f95030d != null) {
                l3Var.f("request").l(v0Var, i5Var.f95030d);
            }
            if (i5Var.f95031e != null && !i5Var.f95031e.isEmpty()) {
                l3Var.f("tags").l(v0Var, i5Var.f95031e);
            }
            if (i5Var.f95032f != null) {
                l3Var.f(BuildConfig.BUILD_TYPE).h(i5Var.f95032f);
            }
            if (i5Var.f95033g != null) {
                l3Var.f("environment").h(i5Var.f95033g);
            }
            if (i5Var.f95034h != null) {
                l3Var.f("platform").h(i5Var.f95034h);
            }
            if (i5Var.f95035j != null) {
                l3Var.f("user").l(v0Var, i5Var.f95035j);
            }
            if (i5Var.f95037l != null) {
                l3Var.f("server_name").h(i5Var.f95037l);
            }
            if (i5Var.f95038m != null) {
                l3Var.f("dist").h(i5Var.f95038m);
            }
            if (i5Var.f95039n != null && !i5Var.f95039n.isEmpty()) {
                l3Var.f("breadcrumbs").l(v0Var, i5Var.f95039n);
            }
            if (i5Var.f95040p != null) {
                l3Var.f("debug_meta").l(v0Var, i5Var.f95040p);
            }
            if (i5Var.f95041q == null || i5Var.f95041q.isEmpty()) {
                return;
            }
            l3Var.f("extra").l(v0Var, i5Var.f95041q);
        }
    }

    protected i5(io.sentry.protocol.v vVar) {
        this.f95028b = new io.sentry.protocol.c();
        this.f95027a = vVar;
    }

    public List<f> B() {
        return this.f95039n;
    }

    public io.sentry.protocol.c C() {
        return this.f95028b;
    }

    public io.sentry.protocol.d D() {
        return this.f95040p;
    }

    public String E() {
        return this.f95038m;
    }

    public String F() {
        return this.f95033g;
    }

    public io.sentry.protocol.v G() {
        return this.f95027a;
    }

    public Map<String, Object> H() {
        return this.f95041q;
    }

    public String I() {
        return this.f95034h;
    }

    public String J() {
        return this.f95032f;
    }

    public io.sentry.protocol.m K() {
        return this.f95030d;
    }

    public io.sentry.protocol.p L() {
        return this.f95029c;
    }

    public String M() {
        return this.f95037l;
    }

    public Map<String, String> N() {
        return this.f95031e;
    }

    public Throwable O() {
        Throwable th4 = this.f95036k;
        return th4 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th4).c() : th4;
    }

    public Throwable P() {
        return this.f95036k;
    }

    public io.sentry.protocol.g0 Q() {
        return this.f95035j;
    }

    public void R(String str) {
        Map<String, String> map = this.f95031e;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void S(List<f> list) {
        this.f95039n = io.sentry.util.c.b(list);
    }

    public void T(io.sentry.protocol.d dVar) {
        this.f95040p = dVar;
    }

    public void U(String str) {
        this.f95038m = str;
    }

    public void V(String str) {
        this.f95033g = str;
    }

    public void W(io.sentry.protocol.v vVar) {
        this.f95027a = vVar;
    }

    public void X(Map<String, Object> map) {
        this.f95041q = io.sentry.util.c.d(map);
    }

    public void Y(String str) {
        this.f95034h = str;
    }

    public void Z(String str) {
        this.f95032f = str;
    }

    public void a0(io.sentry.protocol.m mVar) {
        this.f95030d = mVar;
    }

    public void b0(io.sentry.protocol.p pVar) {
        this.f95029c = pVar;
    }

    public void c0(String str) {
        this.f95037l = str;
    }

    public void d0(String str, String str2) {
        if (this.f95031e == null) {
            this.f95031e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            R(str);
        } else {
            this.f95031e.put(str, str2);
        }
    }

    public void e0(Map<String, String> map) {
        this.f95031e = io.sentry.util.c.d(map);
    }

    public void f0(io.sentry.protocol.g0 g0Var) {
        this.f95035j = g0Var;
    }

    protected i5() {
        this(new io.sentry.protocol.v());
    }
}
