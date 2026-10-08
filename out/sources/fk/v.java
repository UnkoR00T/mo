package fk;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import sk.c0;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class v<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<d, List<c<P>>> f64382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<P> f64383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<P> f64384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qk.a f64385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f64386e;

    public static class b<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<P> f64387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConcurrentMap<d, List<c<P>>> f64388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c<P> f64389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qk.a f64390d;

        private b<P> c(P p15, P p16, c0.c cVar, boolean z15) throws GeneralSecurityException {
            if (this.f64388b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (p15 == null && p16 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.d0() != sk.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVarB = v.b(p15, p16, cVar, this.f64388b);
            if (!z15) {
                return this;
            }
            if (this.f64389c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f64389c = cVarB;
            return this;
        }

        public b<P> a(P p15, P p16, c0.c cVar) {
            return c(p15, p16, cVar, false);
        }

        public b<P> b(P p15, P p16, c0.c cVar) {
            return c(p15, p16, cVar, true);
        }

        public v<P> d() {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.f64388b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v<P> vVar = new v<>(concurrentMap, this.f64389c, this.f64390d, this.f64387a);
            this.f64388b = null;
            return vVar;
        }

        public b<P> e(qk.a aVar) {
            if (this.f64388b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f64390d = aVar;
            return this;
        }

        private b(Class<P> cls) {
            this.f64388b = new ConcurrentHashMap();
            this.f64387a = cls;
            this.f64390d = qk.a.f167012b;
        }
    }

    public static final class c<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final P f64391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final P f64392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f64393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sk.z f64394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final i0 f64395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f64396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f64397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final g f64398h;

        c(P p15, P p16, byte[] bArr, sk.z zVar, i0 i0Var, int i15, String str, g gVar) {
            this.f64391a = p15;
            this.f64392b = p16;
            this.f64393c = Arrays.copyOf(bArr, bArr.length);
            this.f64394d = zVar;
            this.f64395e = i0Var;
            this.f64396f = i15;
            this.f64397g = str;
            this.f64398h = gVar;
        }

        public P a() {
            return this.f64391a;
        }

        public final byte[] b() {
            byte[] bArr = this.f64393c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public g c() {
            return this.f64398h;
        }

        public int d() {
            return this.f64396f;
        }

        public String e() {
            return this.f64397g;
        }

        public i0 f() {
            return this.f64395e;
        }

        public P g() {
            return this.f64392b;
        }

        public sk.z h() {
            return this.f64394d;
        }
    }

    private static class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f64399a;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f64399a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f64399a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i15 = 0;
            while (true) {
                byte[] bArr3 = this.f64399a;
                if (i15 >= bArr3.length) {
                    return 0;
                }
                byte b15 = bArr3[i15];
                byte b16 = dVar.f64399a[i15];
                if (b15 != b16) {
                    return b15 - b16;
                }
                i15++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f64399a, ((d) obj).f64399a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f64399a);
        }

        public String toString() {
            return tk.k.b(this.f64399a);
        }

        private d(byte[] bArr) {
            this.f64399a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> c<P> b(P p15, P p16, c0.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) {
        Integer numValueOf = Integer.valueOf(cVar.b0());
        if (cVar.c0() == i0.RAW) {
            numValueOf = null;
        }
        c<P> cVar2 = new c<>(p15, p16, fk.d.a(cVar), cVar.d0(), cVar.c0(), cVar.b0(), cVar.a0().b0(), nk.i.a().d(nk.o.b(cVar.a0().b0(), cVar.a0().c0(), cVar.a0().a0(), cVar.c0(), numValueOf), f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List<c<P>> listPut = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static <P> b<P> j(Class<P> cls) {
        return new b<>(cls);
    }

    public Collection<List<c<P>>> c() {
        return this.f64382a.values();
    }

    public qk.a d() {
        return this.f64385d;
    }

    public c<P> e() {
        return this.f64383b;
    }

    public List<c<P>> f(byte[] bArr) {
        List<c<P>> list = this.f64382a.get(new d(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class<P> g() {
        return this.f64384c;
    }

    public List<c<P>> h() {
        return f(fk.d.f64352a);
    }

    public boolean i() {
        return !this.f64385d.b().isEmpty();
    }

    private v(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, qk.a aVar, Class<P> cls) {
        this.f64382a = concurrentMap;
        this.f64383b = cVar;
        this.f64384c = cls;
        this.f64385d = aVar;
        this.f64386e = false;
    }
}
