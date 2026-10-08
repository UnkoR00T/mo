package sn;

import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<String> f182543r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f182544q;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f182545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j f182546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f182547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<String> f182548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private URI f182549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private xn.d f182550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private URI f182551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        private io.c f182552h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private io.c f182553i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<io.a> f182554j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f182555k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f182556l = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map<String, Object> f182557m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private io.c f182558n;

        public a(q qVar) {
            if (qVar.a().equals(b.f182422c.a())) {
                throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
            }
            this.f182545a = qVar;
        }

        public a a(boolean z15) {
            this.f182556l = z15;
            return this;
        }

        public r b() {
            return new r(this.f182545a, this.f182546b, this.f182547c, this.f182548d, this.f182549e, this.f182550f, this.f182551g, this.f182552h, this.f182553i, this.f182554j, this.f182555k, this.f182556l, this.f182557m, this.f182558n);
        }

        public a c(String str) {
            this.f182547c = str;
            return this;
        }

        public a d(Set<String> set) {
            this.f182548d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!r.u().contains(str)) {
                if (this.f182557m == null) {
                    this.f182557m = new HashMap();
                }
                this.f182557m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(xn.d dVar) {
            if (dVar != null && dVar.r()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f182550f = dVar;
            return this;
        }

        public a g(URI uri) {
            this.f182549e = uri;
            return this;
        }

        public a h(String str) {
            this.f182555k = str;
            return this;
        }

        public a i(io.c cVar) {
            this.f182558n = cVar;
            return this;
        }

        public a j(j jVar) {
            this.f182546b = jVar;
            return this;
        }

        public a k(List<io.a> list) {
            this.f182554j = list;
            return this;
        }

        public a l(io.c cVar) {
            this.f182553i = cVar;
            return this;
        }

        @Deprecated
        public a m(io.c cVar) {
            this.f182552h = cVar;
            return this;
        }

        public a n(URI uri) {
            this.f182551g = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f182543r = Collections.unmodifiableSet(hashSet);
    }

    public r(q qVar, j jVar, String str, Set<String> set, URI uri, xn.d dVar, URI uri2, io.c cVar, io.c cVar2, List<io.a> list, String str2, boolean z15, Map<String, Object> map, io.c cVar3) {
        super(qVar, jVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar3);
        if (qVar.a().equals(b.f182422c.a())) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.f182544q = z15;
    }

    public static r A(Map<String, Object> map, io.c cVar) throws ParseException {
        b bVarG = g.g(map);
        if (!(bVarG instanceof q)) {
            throw new ParseException("Not a JWS header", 0);
        }
        a aVarI = new a((q) bVarG).i(cVar);
        for (String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if ("typ".equals(str)) {
                    String strH = io.k.h(map, str);
                    if (strH != null) {
                        aVarI = aVarI.j(new j(strH));
                    }
                } else if ("cty".equals(str)) {
                    aVarI = aVarI.c(io.k.h(map, str));
                } else if ("crit".equals(str)) {
                    List<String> listJ = io.k.j(map, str);
                    if (listJ != null) {
                        aVarI = aVarI.d(new HashSet(listJ));
                    }
                } else if ("jku".equals(str)) {
                    aVarI = aVarI.g(io.k.k(map, str));
                } else if ("jwk".equals(str)) {
                    aVarI = aVarI.f(c.s(io.k.f(map, str)));
                } else if ("x5u".equals(str)) {
                    aVarI = aVarI.n(io.k.k(map, str));
                } else if ("x5t".equals(str)) {
                    aVarI = aVarI.m(io.c.i(io.k.h(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    aVarI = aVarI.l(io.c.i(io.k.h(map, str)));
                } else if ("x5c".equals(str)) {
                    aVarI = aVarI.k(io.n.b(io.k.e(map, str)));
                } else if ("kid".equals(str)) {
                    aVarI = aVarI.h(io.k.h(map, str));
                } else {
                    aVarI = "b64".equals(str) ? aVarI.a(io.k.b(map, str)) : aVarI.e(str, map.get(str));
                }
            }
        }
        return aVarI.b();
    }

    public static Set<String> u() {
        return f182543r;
    }

    public static r w(io.c cVar) {
        return y(cVar.c(), cVar);
    }

    public static r y(String str, io.c cVar) {
        return A(io.k.n(str, 20000), cVar);
    }

    @Override // sn.c, sn.g
    public Map<String, Object> i() {
        Map<String, Object> mapI = super.i();
        if (!v()) {
            mapI.put("b64", Boolean.FALSE);
        }
        return mapI;
    }

    public q t() {
        return (q) super.a();
    }

    public boolean v() {
        return this.f182544q;
    }
}
