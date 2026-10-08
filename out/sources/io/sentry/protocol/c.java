package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.g1;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.n8;
import io.sentry.t1;
import io.sentry.t3;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f95345a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.a f95346b = new io.sentry.util.a();

    public static final class a implements t1<c> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(k3 k3Var, v0 v0Var) {
            c cVar = new c();
            k3Var.Y();
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "device":
                        cVar.p(new e.a().a(k3Var, v0Var));
                        break;
                    case "spring":
                        cVar.w(new d0.a().a(k3Var, v0Var));
                        break;
                    case "response":
                        cVar.u(new n.a().a(k3Var, v0Var));
                        break;
                    case "profile":
                        cVar.t(new t3.a().a(k3Var, v0Var));
                        break;
                    case "feedback":
                        cVar.q(new f.a().a(k3Var, v0Var));
                        break;
                    case "os":
                        cVar.s(new l.a().a(k3Var, v0Var));
                        break;
                    case "app":
                        cVar.n(new io.sentry.protocol.a.C2240a().a(k3Var, v0Var));
                        break;
                    case "gpu":
                        cVar.r(new h.a().a(k3Var, v0Var));
                        break;
                    case "trace":
                        cVar.x(new n8.a().a(k3Var, v0Var));
                        break;
                    case "browser":
                        cVar.o(new b.a().a(k3Var, v0Var));
                        break;
                    case "runtime":
                        cVar.v(new x.a().a(k3Var, v0Var));
                        break;
                    default:
                        Object objK3 = k3Var.K3();
                        if (objK3 == null) {
                            break;
                        } else {
                            cVar.k(strH1, objK3);
                            break;
                        }
                        break;
                }
            }
            k3Var.h0();
            return cVar;
        }
    }

    public c() {
    }

    private <T> T y(String str, Class<T> cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f95345a.containsKey(obj);
    }

    public Set<Map.Entry<String, Object>> b() {
        return this.f95345a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f95345a.get(obj);
    }

    public io.sentry.protocol.a d() {
        return (io.sentry.protocol.a) y("app", io.sentry.protocol.a.class);
    }

    public e e() {
        return (e) y("device", e.class);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f95345a.equals(((c) obj).f95345a);
    }

    public f f() {
        return (f) y("feedback", f.class);
    }

    public l g() {
        return (l) y("os", l.class);
    }

    public x h() {
        return (x) y("runtime", x.class);
    }

    public int hashCode() {
        return this.f95345a.hashCode();
    }

    public n8 i() {
        return (n8) y("trace", n8.class);
    }

    public Enumeration<String> j() {
        return this.f95345a.keys();
    }

    public Object k(String str, Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f95345a.remove(str) : this.f95345a.put(str, obj);
    }

    public void l(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f95345a.putAll(cVar.f95345a);
    }

    public Object m(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f95345a.remove(obj);
    }

    public void n(io.sentry.protocol.a aVar) {
        k("app", aVar);
    }

    public void o(b bVar) {
        k("browser", bVar);
    }

    public void p(e eVar) {
        k("device", eVar);
    }

    public void q(f fVar) {
        k("feedback", fVar);
    }

    public void r(h hVar) {
        k("gpu", hVar);
    }

    public void s(l lVar) {
        k("os", lVar);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        ArrayList<String> list = Collections.list(j());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                l3Var.f(str).l(v0Var, objC);
            }
        }
        l3Var.h0();
    }

    public void t(t3 t3Var) {
        io.sentry.util.v.c(t3Var, "profileContext is required");
        k("profile", t3Var);
    }

    public void u(n nVar) {
        g1 g1VarA = this.f95346b.a();
        try {
            k("response", nVar);
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

    public void v(x xVar) {
        k("runtime", xVar);
    }

    public void w(d0 d0Var) {
        k("spring", d0Var);
    }

    public void x(n8 n8Var) {
        io.sentry.util.v.c(n8Var, "traceContext is required");
        k("trace", n8Var);
    }

    public c(c cVar) {
        for (Map.Entry<String, Object> entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    n(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    o(new b((b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof e)) {
                    p(new e((e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof l)) {
                    s(new l((l) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof x)) {
                    v(new x((x) value));
                } else if ("feedback".equals(entry.getKey()) && (value instanceof f)) {
                    q(new f((f) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof h)) {
                    r(new h((h) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof n8)) {
                    x(new n8((n8) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof t3)) {
                    t(new t3((t3) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof n)) {
                    u(new n((n) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof d0)) {
                    w(new d0((d0) value));
                } else {
                    k(entry.getKey(), value);
                }
            }
        }
    }
}
