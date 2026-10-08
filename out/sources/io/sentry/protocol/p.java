package io.sentry.protocol;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import io.sentry.z6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<w> f95480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f95481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f95482e;

    public static final class a implements t1<p> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(k3 k3Var, v0 v0Var) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            k3Var.Y();
            String strQ2 = null;
            String strQ3 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "name":
                        strQ2 = k3Var.q2();
                        break;
                    case "version":
                        strQ3 = k3Var.q2();
                        break;
                    case "packages":
                        List listT3 = k3Var.T3(v0Var, new w.a());
                        if (listT3 == null) {
                            break;
                        } else {
                            arrayList.addAll(listT3);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) k3Var.K3();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            k3Var.h0();
            if (strQ2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                v0Var.b(b7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strQ3 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                v0Var.b(b7.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            p pVar = new p(strQ2, strQ3);
            pVar.f95480c = new CopyOnWriteArraySet(arrayList);
            pVar.f95481d = new CopyOnWriteArraySet(arrayList2);
            pVar.i(map);
            return pVar;
        }
    }

    public p(String str, String str2) {
        this.f95478a = (String) io.sentry.util.v.c(str, "name is required.");
        this.f95479b = (String) io.sentry.util.v.c(str2, "version is required.");
    }

    public static p k(p pVar, String str, String str2) {
        io.sentry.util.v.c(str, "name is required.");
        io.sentry.util.v.c(str2, "version is required.");
        if (pVar == null) {
            return new p(str, str2);
        }
        pVar.h(str);
        pVar.j(str2);
        return pVar;
    }

    public void c(String str, String str2) {
        z6.d().b(str, str2);
    }

    public Set<String> d() {
        Set<String> set = this.f95481d;
        return set != null ? set : z6.d().e();
    }

    public String e() {
        return this.f95478a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f95478a.equals(pVar.f95478a) && this.f95479b.equals(pVar.f95479b)) {
                return true;
            }
        }
        return false;
    }

    public Set<w> f() {
        Set<w> set = this.f95480c;
        return set != null ? set : z6.d().f();
    }

    public String g() {
        return this.f95479b;
    }

    public void h(String str) {
        this.f95478a = (String) io.sentry.util.v.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95478a, this.f95479b);
    }

    public void i(Map<String, Object> map) {
        this.f95482e = map;
    }

    public void j(String str) {
        this.f95479b = (String) io.sentry.util.v.c(str, "version is required.");
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("name").h(this.f95478a);
        l3Var.f("version").h(this.f95479b);
        Set<w> setF = f();
        Set<String> setD = d();
        if (!setF.isEmpty()) {
            l3Var.f("packages").l(v0Var, setF);
        }
        if (!setD.isEmpty()) {
            l3Var.f("integrations").l(v0Var, setD);
        }
        Map<String, Object> map = this.f95482e;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95482e.get(str));
            }
        }
        l3Var.h0();
    }
}
