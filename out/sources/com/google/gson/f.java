package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
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
import wl.e0;
import wl.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    static final com.google.gson.e A = com.google.gson.e.f36643d;
    static final String B = null;
    static final com.google.gson.d C = com.google.gson.c.f36635a;
    static final z D = y.f36874a;
    static final z E = y.f36875b;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final x f36648z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, a0<?>>> f36649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<com.google.gson.reflect.a<?>, a0<?>> f36650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wl.v f36651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f36652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<b0> f36653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Excluder f36654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.gson.d f36655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<Type, h<?>> f36656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f36657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f36658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f36659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f36660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final com.google.gson.e f36661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final x f36662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f36663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f36664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f36665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f36666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f36667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final v f36668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List<b0> f36669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List<b0> f36670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final z f36671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final z f36672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List<w> f36673y;

    class a extends a0<Number> {
        a() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            cVar.n0(dDoubleValue);
        }
    }

    class b extends a0<Number> {
        b() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
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

    class c extends a0<Number> {
        c() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.H0(number.toString());
            }
        }
    }

    class d extends a0<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f36676a;

        d(a0 a0Var) {
            this.f36676a = a0Var;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(zl.a aVar) {
            return new AtomicLong(((Number) this.f36676a.b(aVar)).longValue());
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, AtomicLong atomicLong) {
            this.f36676a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends a0<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f36677a;

        e(a0 a0Var) {
            this.f36677a = a0Var;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(zl.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.h();
            while (aVar.I()) {
                arrayList.add(Long.valueOf(((Number) this.f36677a.b(aVar)).longValue()));
            }
            aVar.u();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i15 = 0; i15 < size; i15++) {
                atomicLongArray.set(i15, ((Long) arrayList.get(i15)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.p();
            int length = atomicLongArray.length();
            for (int i15 = 0; i15 < length; i15++) {
                this.f36677a.d(cVar, Long.valueOf(atomicLongArray.get(i15)));
            }
            cVar.y();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.f$f, reason: collision with other inner class name */
    static class C0763f<T> extends com.google.gson.internal.bind.d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a0<T> f36678a = null;

        C0763f() {
        }

        private a0<T> f() {
            a0<T> a0Var = this.f36678a;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.a0
        public T b(zl.a aVar) {
            return f().b(aVar);
        }

        @Override // com.google.gson.a0
        public void d(zl.c cVar, T t15) {
            f().d(cVar, t15);
        }

        @Override // com.google.gson.internal.bind.d
        public a0<T> e() {
            return f();
        }

        public void g(a0<T> a0Var) {
            if (this.f36678a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f36678a = a0Var;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        Excluder excluder = Excluder.f36700g;
        com.google.gson.d dVar = C;
        Map map = Collections.EMPTY_MAP;
        com.google.gson.e eVar = A;
        x xVar = f36648z;
        v vVar = v.f36862a;
        String str = B;
        List list = Collections.EMPTY_LIST;
        this(excluder, dVar, map, false, false, false, true, eVar, xVar, false, true, vVar, str, 2, 2, list, list, list, D, E, list);
    }

    private static void a(Object obj, zl.a aVar) {
        if (obj != null) {
            try {
                if (aVar.a0() == zl.b.END_DOCUMENT) {
                } else {
                    throw new u("JSON document was not fully consumed.");
                }
            } catch (zl.d e15) {
                throw new u(e15);
            } catch (IOException e16) {
                throw new m(e16);
            }
        }
    }

    private static a0<AtomicLong> b(a0<Number> a0Var) {
        return new d(a0Var).a();
    }

    private static a0<AtomicLongArray> c(a0<Number> a0Var) {
        return new e(a0Var).a();
    }

    static void d(double d15) {
        if (Double.isNaN(d15) || Double.isInfinite(d15)) {
            throw new IllegalArgumentException(d15 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private a0<Number> e(boolean z15) {
        return z15 ? TypeAdapters.f36807v : new a();
    }

    private a0<Number> f(boolean z15) {
        return z15 ? TypeAdapters.f36806u : new b();
    }

    private static a0<Number> o(v vVar) {
        return vVar == v.f36862a ? TypeAdapters.f36805t : new c();
    }

    public l A(Object obj, Type type) {
        com.google.gson.internal.bind.c cVar = new com.google.gson.internal.bind.c();
        y(obj, type, cVar);
        return cVar.Y0();
    }

    public <T> T g(Reader reader, com.google.gson.reflect.a<T> aVar) {
        zl.a aVarQ = q(reader);
        T t15 = (T) k(aVarQ, aVar);
        a(t15, aVarQ);
        return t15;
    }

    public <T> T h(String str, com.google.gson.reflect.a<T> aVar) {
        if (str == null) {
            return null;
        }
        return (T) g(new StringReader(str), aVar);
    }

    public <T> T i(String str, Class<T> cls) {
        return (T) h(str, com.google.gson.reflect.a.a(cls));
    }

    public <T> T j(String str, Type type) {
        return (T) h(str, com.google.gson.reflect.a.b(type));
    }

    public <T> T k(zl.a aVar, com.google.gson.reflect.a<T> aVar2) {
        boolean z15;
        x xVarH = aVar.H();
        x xVar = this.f36662n;
        if (xVar != null) {
            aVar.t0(xVar);
        } else if (aVar.H() == x.LEGACY_STRICT) {
            aVar.t0(x.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.a0();
                        z15 = false;
                        try {
                            a0<T> a0VarL = l(aVar2);
                            T tB = a0VarL.b(aVar);
                            Class clsB = e0.b(aVar2.c());
                            if (tB != null && !clsB.isInstance(tB)) {
                                throw new ClassCastException("Type adapter '" + a0VarL + "' returned wrong type; requested " + aVar2.c() + " but got instance of " + tB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            aVar.t0(xVarH);
                            return tB;
                        } catch (EOFException e15) {
                            e = e15;
                            if (!z15) {
                                throw new u(e);
                            }
                            aVar.t0(xVarH);
                            return null;
                        }
                    } catch (EOFException e16) {
                        e = e16;
                        z15 = true;
                    }
                } catch (IOException e17) {
                    throw new u(e17);
                }
            } catch (AssertionError e18) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e18.getMessage(), e18);
            } catch (IllegalStateException e19) {
                throw new u(e19);
            }
        } catch (Throwable th4) {
            aVar.t0(xVarH);
            throw th4;
        }
    }

    public <T> a0<T> l(com.google.gson.reflect.a<T> aVar) {
        boolean z15;
        Objects.requireNonNull(aVar, "type must not be null");
        a0<T> a0Var = (a0) this.f36650b.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        Map<? extends com.google.gson.reflect.a<?>, ? extends a0<?>> map = this.f36649a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f36649a.set((Map<com.google.gson.reflect.a<?>, a0<?>>) map);
            z15 = true;
        } else {
            a0<T> a0Var2 = (a0) map.get(aVar);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z15 = false;
        }
        try {
            C0763f c0763f = new C0763f();
            map.put(aVar, c0763f);
            Iterator<b0> it = this.f36653e.iterator();
            a0<T> a0VarB = null;
            while (it.hasNext()) {
                a0VarB = it.next().b(this, aVar);
                if (a0VarB != null) {
                    c0763f.g(a0VarB);
                    map.put(aVar, a0VarB);
                    break;
                }
            }
            if (z15) {
                this.f36649a.remove();
            }
            if (a0VarB != null) {
                if (z15) {
                    this.f36650b.putAll(map);
                }
                return a0VarB;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th4) {
            if (z15) {
                this.f36649a.remove();
            }
            throw th4;
        }
    }

    public <T> a0<T> m(Class<T> cls) {
        return l(com.google.gson.reflect.a.a(cls));
    }

    public <T> a0<T> n(b0 b0Var, com.google.gson.reflect.a<T> aVar) {
        Objects.requireNonNull(b0Var, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f36652d.e(aVar, b0Var)) {
            b0Var = this.f36652d;
        }
        boolean z15 = false;
        for (b0 b0Var2 : this.f36653e) {
            if (z15) {
                a0<T> a0VarB = b0Var2.b(this, aVar);
                if (a0VarB != null) {
                    return a0VarB;
                }
            } else if (b0Var2 == b0Var) {
                z15 = true;
            }
        }
        if (!z15) {
            return l(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public g p() {
        return new g(this);
    }

    public zl.a q(Reader reader) {
        zl.a aVar = new zl.a(reader);
        x xVar = this.f36662n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        aVar.t0(xVar);
        return aVar;
    }

    public zl.c r(Writer writer) throws IOException {
        if (this.f36659k) {
            writer.write(")]}'\n");
        }
        zl.c cVar = new zl.c(writer);
        cVar.Z(this.f36661m);
        cVar.a0(this.f36660l);
        x xVar = this.f36662n;
        if (xVar == null) {
            xVar = x.LEGACY_STRICT;
        }
        cVar.c0(xVar);
        cVar.b0(this.f36657i);
        return cVar;
    }

    public String s(l lVar) {
        StringBuilder sb5 = new StringBuilder();
        v(lVar, sb5);
        return sb5.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(n.f36856a) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f36657i + ",factories:" + this.f36653e + ",instanceCreators:" + this.f36651c + "}";
    }

    public String u(Object obj, Type type) {
        StringBuilder sb5 = new StringBuilder();
        x(obj, type, sb5);
        return sb5.toString();
    }

    public void v(l lVar, Appendable appendable) {
        try {
            w(lVar, r(g0.c(appendable)));
        } catch (IOException e15) {
            throw new m(e15);
        }
    }

    public void w(l lVar, zl.c cVar) {
        x xVarH = cVar.H();
        boolean zI = cVar.I();
        boolean zE = cVar.E();
        cVar.a0(this.f36660l);
        cVar.b0(this.f36657i);
        x xVar = this.f36662n;
        if (xVar != null) {
            cVar.c0(xVar);
        } else if (cVar.H() == x.LEGACY_STRICT) {
            cVar.c0(x.LENIENT);
        }
        try {
            try {
                g0.b(lVar, cVar);
                cVar.c0(xVarH);
                cVar.a0(zI);
                cVar.b0(zE);
            } catch (IOException e15) {
                throw new m(e15);
            } catch (AssertionError e16) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e16.getMessage(), e16);
            }
        } catch (Throwable th4) {
            cVar.c0(xVarH);
            cVar.a0(zI);
            cVar.b0(zE);
            throw th4;
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            y(obj, type, r(g0.c(appendable)));
        } catch (IOException e15) {
            throw new m(e15);
        }
    }

    public void y(Object obj, Type type, zl.c cVar) {
        a0 a0VarL = l(com.google.gson.reflect.a.b(type));
        x xVarH = cVar.H();
        x xVar = this.f36662n;
        if (xVar != null) {
            cVar.c0(xVar);
        } else if (cVar.H() == x.LEGACY_STRICT) {
            cVar.c0(x.LENIENT);
        }
        boolean zI = cVar.I();
        boolean zE = cVar.E();
        cVar.a0(this.f36660l);
        cVar.b0(this.f36657i);
        try {
            try {
                try {
                    a0VarL.d(cVar, obj);
                    cVar.c0(xVarH);
                    cVar.a0(zI);
                    cVar.b0(zE);
                } catch (AssertionError e15) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e15.getMessage(), e15);
                }
            } catch (IOException e16) {
                throw new m(e16);
            }
        } catch (Throwable th4) {
            cVar.c0(xVarH);
            cVar.a0(zI);
            cVar.b0(zE);
            throw th4;
        }
    }

    public l z(Object obj) {
        return obj == null ? n.f36856a : A(obj, obj.getClass());
    }

    f(Excluder excluder, com.google.gson.d dVar, Map<Type, h<?>> map, boolean z15, boolean z16, boolean z17, boolean z18, com.google.gson.e eVar, x xVar, boolean z19, boolean z25, v vVar, String str, int i15, int i16, List<b0> list, List<b0> list2, List<b0> list3, z zVar, z zVar2, List<w> list4) {
        this.f36649a = new ThreadLocal<>();
        this.f36650b = new ConcurrentHashMap();
        this.f36654f = excluder;
        this.f36655g = dVar;
        this.f36656h = map;
        wl.v vVar2 = new wl.v(map, z25, list4);
        this.f36651c = vVar2;
        this.f36657i = z15;
        this.f36658j = z16;
        this.f36659k = z17;
        this.f36660l = z18;
        this.f36661m = eVar;
        this.f36662n = xVar;
        this.f36663o = z19;
        this.f36664p = z25;
        this.f36668t = vVar;
        this.f36665q = str;
        this.f36666r = i15;
        this.f36667s = i16;
        this.f36669u = list;
        this.f36670v = list2;
        this.f36671w = zVar;
        this.f36672x = zVar2;
        this.f36673y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.W);
        arrayList.add(ObjectTypeAdapter.e(zVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.C);
        arrayList.add(TypeAdapters.f36798m);
        arrayList.add(TypeAdapters.f36792g);
        arrayList.add(TypeAdapters.f36794i);
        arrayList.add(TypeAdapters.f36796k);
        a0<Number> a0VarO = o(vVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, a0VarO));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z19)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z19)));
        arrayList.add(NumberTypeAdapter.e(zVar2));
        arrayList.add(TypeAdapters.f36800o);
        arrayList.add(TypeAdapters.f36802q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(a0VarO)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(a0VarO)));
        arrayList.add(TypeAdapters.f36804s);
        arrayList.add(TypeAdapters.f36809x);
        arrayList.add(TypeAdapters.E);
        arrayList.add(TypeAdapters.G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f36811z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.b(wl.z.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.I);
        arrayList.add(TypeAdapters.K);
        arrayList.add(TypeAdapters.O);
        arrayList.add(TypeAdapters.Q);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TypeAdapters.M);
        arrayList.add(TypeAdapters.f36789d);
        arrayList.add(DefaultDateTypeAdapter.f36719c);
        arrayList.add(TypeAdapters.S);
        if (com.google.gson.internal.sql.a.f36850a) {
            arrayList.add(com.google.gson.internal.sql.a.f36854e);
            arrayList.add(com.google.gson.internal.sql.a.f36853d);
            arrayList.add(com.google.gson.internal.sql.a.f36855f);
        }
        arrayList.add(ArrayTypeAdapter.f36713c);
        arrayList.add(TypeAdapters.f36787b);
        arrayList.add(new CollectionTypeAdapterFactory(vVar2));
        arrayList.add(new MapTypeAdapterFactory(vVar2, z16));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(vVar2);
        this.f36652d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(vVar2, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f36653e = Collections.unmodifiableList(arrayList);
    }
}
