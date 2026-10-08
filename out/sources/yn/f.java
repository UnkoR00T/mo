package yn;

import ao.h0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    static final yn.e A = yn.e.f228012d;
    static final String B = null;
    static final yn.d C = yn.c.f228004a;
    static final y D = x.f228084a;
    static final y E = x.f228085b;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final w f228017z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<go.a<?>, z<?>>> f228018a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<go.a<?>, z<?>> f228019b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ao.w f228020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bo.e f228021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<a0> f228022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ao.x f228023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final yn.d f228024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<Type, h<?>> f228025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f228026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f228027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f228028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f228029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final yn.e f228030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final w f228031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f228032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f228033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f228034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f228035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f228036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final u f228037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List<a0> f228038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List<a0> f228039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final y f228040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final y f228041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List<v> f228042y;

    class a extends z<Number> {
        a() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            cVar.n0(dDoubleValue);
        }
    }

    class b extends z<Number> {
        b() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.C0(number);
        }
    }

    class c extends z<Number> {
        c() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.H0(number.toString());
            }
        }
    }

    class d extends z<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f228045a;

        d(z zVar) {
            this.f228045a = zVar;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(ho.a aVar) {
            return new AtomicLong(((Number) this.f228045a.b(aVar)).longValue());
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, AtomicLong atomicLong) {
            this.f228045a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends z<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f228046a;

        e(z zVar) {
            this.f228046a = zVar;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(ho.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.h();
            while (aVar.I()) {
                arrayList.add(Long.valueOf(((Number) this.f228046a.b(aVar)).longValue()));
            }
            aVar.u();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i15 = 0; i15 < size; i15++) {
                atomicLongArray.set(i15, ((Long) arrayList.get(i15)).longValue());
            }
            return atomicLongArray;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.p();
            int length = atomicLongArray.length();
            for (int i15 = 0; i15 < length; i15++) {
                this.f228046a.d(cVar, Long.valueOf(atomicLongArray.get(i15)));
            }
            cVar.y();
        }
    }

    /* JADX INFO: renamed from: yn.f$f, reason: collision with other inner class name */
    static class C6126f<T> extends bo.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z<T> f228047a = null;

        C6126f() {
        }

        private z<T> f() {
            z<T> zVar = this.f228047a;
            if (zVar != null) {
                return zVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // yn.z
        public T b(ho.a aVar) {
            return f().b(aVar);
        }

        @Override // yn.z
        public void d(ho.c cVar, T t15) {
            f().d(cVar, t15);
        }

        @Override // bo.m
        public z<T> e() {
            return f();
        }

        public void g(z<T> zVar) {
            if (this.f228047a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f228047a = zVar;
        }
    }

    f(ao.x xVar, yn.d dVar, Map<Type, h<?>> map, boolean z15, boolean z16, boolean z17, boolean z18, yn.e eVar, w wVar, boolean z19, boolean z25, u uVar, String str, int i15, int i16, List<a0> list, List<a0> list2, List<a0> list3, y yVar, y yVar2, List<v> list4) {
        this.f228023f = xVar;
        this.f228024g = dVar;
        this.f228025h = map;
        ao.w wVar2 = new ao.w(map, z25, list4);
        this.f228020c = wVar2;
        this.f228026i = z15;
        this.f228027j = z16;
        this.f228028k = z17;
        this.f228029l = z18;
        this.f228030m = eVar;
        this.f228031n = wVar;
        this.f228032o = z19;
        this.f228033p = z25;
        this.f228037t = uVar;
        this.f228034q = str;
        this.f228035r = i15;
        this.f228036s = i16;
        this.f228038u = list;
        this.f228039v = list2;
        this.f228040w = yVar;
        this.f228041x = yVar2;
        this.f228042y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bo.p.W);
        arrayList.add(bo.k.e(yVar));
        arrayList.add(xVar);
        arrayList.addAll(list3);
        arrayList.add(bo.p.C);
        arrayList.add(bo.p.f20548m);
        arrayList.add(bo.p.f20542g);
        arrayList.add(bo.p.f20544i);
        arrayList.add(bo.p.f20546k);
        z<Number> zVarN = n(uVar);
        arrayList.add(bo.p.a(Long.TYPE, Long.class, zVarN));
        arrayList.add(bo.p.a(Double.TYPE, Double.class, e(z19)));
        arrayList.add(bo.p.a(Float.TYPE, Float.class, f(z19)));
        arrayList.add(bo.j.e(yVar2));
        arrayList.add(bo.p.f20550o);
        arrayList.add(bo.p.f20552q);
        arrayList.add(bo.p.b(AtomicLong.class, b(zVarN)));
        arrayList.add(bo.p.b(AtomicLongArray.class, c(zVarN)));
        arrayList.add(bo.p.f20554s);
        arrayList.add(bo.p.f20559x);
        arrayList.add(bo.p.E);
        arrayList.add(bo.p.G);
        arrayList.add(bo.p.b(BigDecimal.class, bo.p.f20561z));
        arrayList.add(bo.p.b(BigInteger.class, bo.p.A));
        arrayList.add(bo.p.b(ao.a0.class, bo.p.B));
        arrayList.add(bo.p.I);
        arrayList.add(bo.p.K);
        arrayList.add(bo.p.O);
        arrayList.add(bo.p.Q);
        arrayList.add(bo.p.U);
        arrayList.add(bo.p.M);
        arrayList.add(bo.p.f20539d);
        arrayList.add(bo.c.f20464c);
        arrayList.add(bo.p.S);
        if (fo.d.f65539a) {
            arrayList.add(fo.d.f65543e);
            arrayList.add(fo.d.f65542d);
            arrayList.add(fo.d.f65544f);
        }
        arrayList.add(bo.a.f20458c);
        arrayList.add(bo.p.f20537b);
        arrayList.add(new bo.b(wVar2));
        arrayList.add(new bo.i(wVar2, z16));
        bo.e eVar2 = new bo.e(wVar2);
        this.f228021d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(bo.p.X);
        arrayList.add(new bo.l(wVar2, dVar, xVar, eVar2, list4));
        this.f228022e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, ho.a aVar) {
        if (obj != null) {
            try {
                if (aVar.a0() == ho.b.END_DOCUMENT) {
                } else {
                    throw new t("JSON document was not fully consumed.");
                }
            } catch (ho.d e15) {
                throw new t(e15);
            } catch (IOException e16) {
                throw new m(e16);
            }
        }
    }

    private static z<AtomicLong> b(z<Number> zVar) {
        return new d(zVar).a();
    }

    private static z<AtomicLongArray> c(z<Number> zVar) {
        return new e(zVar).a();
    }

    static void d(double d15) {
        if (Double.isNaN(d15) || Double.isInfinite(d15)) {
            throw new IllegalArgumentException(d15 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private z<Number> e(boolean z15) {
        return z15 ? bo.p.f20557v : new a();
    }

    private z<Number> f(boolean z15) {
        return z15 ? bo.p.f20556u : new b();
    }

    private static z<Number> n(u uVar) {
        return uVar == u.f228072a ? bo.p.f20555t : new c();
    }

    public <T> T g(ho.a aVar, go.a<T> aVar2) {
        boolean z15;
        w wVarH = aVar.H();
        w wVar = this.f228031n;
        if (wVar != null) {
            aVar.t0(wVar);
        } else if (aVar.H() == w.LEGACY_STRICT) {
            aVar.t0(w.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.a0();
                        z15 = false;
                        try {
                            T tB = k(aVar2).b(aVar);
                            aVar.t0(wVarH);
                            return tB;
                        } catch (EOFException e15) {
                            e = e15;
                            if (!z15) {
                                throw new t(e);
                            }
                            aVar.t0(wVarH);
                            return null;
                        }
                    } catch (Throwable th4) {
                        aVar.t0(wVarH);
                        throw th4;
                    }
                } catch (EOFException e16) {
                    e = e16;
                    z15 = true;
                }
            } catch (IOException e17) {
                throw new t(e17);
            }
        } catch (AssertionError e18) {
            throw new AssertionError("AssertionError (GSON 2.12.1): " + e18.getMessage(), e18);
        } catch (IllegalStateException e19) {
            throw new t(e19);
        }
    }

    public <T> T h(Reader reader, go.a<T> aVar) {
        ho.a aVarO = o(reader);
        T t15 = (T) g(aVarO, aVar);
        a(t15, aVarO);
        return t15;
    }

    public <T> T i(String str, go.a<T> aVar) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), aVar);
    }

    public <T> T j(String str, Type type) {
        return (T) i(str, go.a.b(type));
    }

    public <T> z<T> k(go.a<T> aVar) {
        boolean z15;
        Objects.requireNonNull(aVar, "type must not be null");
        z<T> zVar = (z) this.f228019b.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        Map<? extends go.a<?>, ? extends z<?>> map = this.f228018a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f228018a.set((Map<go.a<?>, z<?>>) map);
            z15 = true;
        } else {
            z<T> zVar2 = (z) map.get(aVar);
            if (zVar2 != null) {
                return zVar2;
            }
            z15 = false;
        }
        try {
            C6126f c6126f = new C6126f();
            map.put(aVar, c6126f);
            Iterator<a0> it = this.f228022e.iterator();
            z<T> zVarB = null;
            while (it.hasNext()) {
                zVarB = it.next().b(this, aVar);
                if (zVarB != null) {
                    c6126f.g(zVarB);
                    map.put(aVar, zVarB);
                    break;
                }
            }
            if (z15) {
                this.f228018a.remove();
            }
            if (zVarB != null) {
                if (z15) {
                    this.f228019b.putAll(map);
                }
                return zVarB;
            }
            throw new IllegalArgumentException("GSON (2.12.1) cannot handle " + aVar);
        } catch (Throwable th4) {
            if (z15) {
                this.f228018a.remove();
            }
            throw th4;
        }
    }

    public <T> z<T> l(Class<T> cls) {
        return k(go.a.a(cls));
    }

    public <T> z<T> m(a0 a0Var, go.a<T> aVar) {
        Objects.requireNonNull(a0Var, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f228021d.e(aVar, a0Var)) {
            a0Var = this.f228021d;
        }
        boolean z15 = false;
        for (a0 a0Var2 : this.f228022e) {
            if (z15) {
                z<T> zVarB = a0Var2.b(this, aVar);
                if (zVarB != null) {
                    return zVarB;
                }
            } else if (a0Var2 == a0Var) {
                z15 = true;
            }
        }
        if (!z15) {
            return k(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public ho.a o(Reader reader) {
        ho.a aVar = new ho.a(reader);
        w wVar = this.f228031n;
        if (wVar == null) {
            wVar = w.LEGACY_STRICT;
        }
        aVar.t0(wVar);
        return aVar;
    }

    public ho.c p(Writer writer) throws IOException {
        if (this.f228028k) {
            writer.write(")]}'\n");
        }
        ho.c cVar = new ho.c(writer);
        cVar.Z(this.f228030m);
        cVar.a0(this.f228029l);
        w wVar = this.f228031n;
        if (wVar == null) {
            wVar = w.LEGACY_STRICT;
        }
        cVar.c0(wVar);
        cVar.b0(this.f228026i);
        return cVar;
    }

    public String q(Object obj) {
        return obj == null ? s(n.f228069a) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        u(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String s(l lVar) {
        StringWriter stringWriter = new StringWriter();
        w(lVar, stringWriter);
        return stringWriter.toString();
    }

    public void t(Object obj, Type type, ho.c cVar) {
        z zVarK = k(go.a.b(type));
        w wVarH = cVar.H();
        w wVar = this.f228031n;
        if (wVar != null) {
            cVar.c0(wVar);
        } else if (cVar.H() == w.LEGACY_STRICT) {
            cVar.c0(w.LENIENT);
        }
        boolean zI = cVar.I();
        boolean zE = cVar.E();
        cVar.a0(this.f228029l);
        cVar.b0(this.f228026i);
        try {
            try {
                try {
                    zVarK.d(cVar, obj);
                    cVar.c0(wVarH);
                    cVar.a0(zI);
                    cVar.b0(zE);
                } catch (AssertionError e15) {
                    throw new AssertionError("AssertionError (GSON 2.12.1): " + e15.getMessage(), e15);
                }
            } catch (IOException e16) {
                throw new m(e16);
            }
        } catch (Throwable th4) {
            cVar.c0(wVarH);
            cVar.a0(zI);
            cVar.b0(zE);
            throw th4;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f228026i + ",factories:" + this.f228022e + ",instanceCreators:" + this.f228020c + "}";
    }

    public void u(Object obj, Type type, Appendable appendable) {
        try {
            t(obj, type, p(h0.c(appendable)));
        } catch (IOException e15) {
            throw new m(e15);
        }
    }

    public void v(l lVar, ho.c cVar) {
        w wVarH = cVar.H();
        boolean zI = cVar.I();
        boolean zE = cVar.E();
        cVar.a0(this.f228029l);
        cVar.b0(this.f228026i);
        w wVar = this.f228031n;
        if (wVar != null) {
            cVar.c0(wVar);
        } else if (cVar.H() == w.LEGACY_STRICT) {
            cVar.c0(w.LENIENT);
        }
        try {
            try {
                h0.b(lVar, cVar);
                cVar.c0(wVarH);
                cVar.a0(zI);
                cVar.b0(zE);
            } catch (IOException e15) {
                throw new m(e15);
            } catch (AssertionError e16) {
                throw new AssertionError("AssertionError (GSON 2.12.1): " + e16.getMessage(), e16);
            }
        } catch (Throwable th4) {
            cVar.c0(wVarH);
            cVar.a0(zI);
            cVar.b0(zE);
            throw th4;
        }
    }

    public void w(l lVar, Appendable appendable) {
        try {
            v(lVar, p(h0.c(appendable)));
        } catch (IOException e15) {
            throw new m(e15);
        }
    }
}
