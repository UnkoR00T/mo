package ur;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f200031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f200032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f200033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f200034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f200035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final zs.b f200036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final zs.c f200037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final zs.b f200038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final zs.b f200039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final zs.b f200040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap<zs.d, zs.b> f200041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashMap<zs.d, zs.b> f200042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final HashMap<zs.d, zs.c> f200043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HashMap<zs.d, zs.c> f200044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashMap<zs.b, zs.b> f200045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final HashMap<zs.b, zs.b> f200046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List<a> f200047q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zs.b f200048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final zs.b f200049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zs.b f200050c;

        public a(zs.b bVar, zs.b bVar2, zs.b bVar3) {
            this.f200048a = bVar;
            this.f200049b = bVar2;
            this.f200050c = bVar3;
        }

        public final zs.b a() {
            return this.f200048a;
        }

        public final zs.b b() {
            return this.f200049b;
        }

        public final zs.b c() {
            return this.f200050c;
        }

        public final zs.b d() {
            return this.f200048a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fr.t.c(this.f200048a, aVar.f200048a) && fr.t.c(this.f200049b, aVar.f200049b) && fr.t.c(this.f200050c, aVar.f200050c);
        }

        public int hashCode() {
            return (((this.f200048a.hashCode() * 31) + this.f200049b.hashCode()) * 31) + this.f200050c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f200048a + ", kotlinReadOnly=" + this.f200049b + ", kotlinMutable=" + this.f200050c + ')';
        }
    }

    static {
        c cVar = new c();
        f200031a = cVar;
        StringBuilder sb5 = new StringBuilder();
        tr.f.a aVar = tr.f.a.f191725f;
        sb5.append(aVar.b());
        sb5.append('.');
        sb5.append(aVar.a());
        f200032b = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        tr.f.b bVar = tr.f.b.f191726f;
        sb6.append(bVar.b());
        sb6.append('.');
        sb6.append(bVar.a());
        f200033c = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        tr.f.d dVar = tr.f.d.f191728f;
        sb7.append(dVar.b());
        sb7.append('.');
        sb7.append(dVar.a());
        f200034d = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        tr.f.c cVar2 = tr.f.c.f191727f;
        sb8.append(cVar2.b());
        sb8.append('.');
        sb8.append(cVar2.a());
        f200035e = sb8.toString();
        zs.b.a aVar2 = zs.b.f236634d;
        zs.b bVarC = aVar2.c(new zs.c("kotlin.jvm.functions.FunctionN"));
        f200036f = bVarC;
        f200037g = bVarC.a();
        zs.i iVar = zs.i.f236674a;
        f200038h = iVar.l();
        f200039i = iVar.k();
        f200040j = cVar.g(Class.class);
        f200041k = new HashMap<>();
        f200042l = new HashMap<>();
        f200043m = new HashMap<>();
        f200044n = new HashMap<>();
        f200045o = new HashMap<>();
        f200046p = new HashMap<>();
        zs.b bVarC2 = aVar2.c(sr.p.a.W);
        a aVar3 = new a(cVar.g(Iterable.class), bVarC2, new zs.b(bVarC2.f(), zs.e.g(sr.p.a.f183638e0, bVarC2.f()), false));
        zs.b bVarC3 = aVar2.c(sr.p.a.V);
        a aVar4 = new a(cVar.g(Iterator.class), bVarC3, new zs.b(bVarC3.f(), zs.e.g(sr.p.a.f183636d0, bVarC3.f()), false));
        zs.b bVarC4 = aVar2.c(sr.p.a.X);
        a aVar5 = new a(cVar.g(Collection.class), bVarC4, new zs.b(bVarC4.f(), zs.e.g(sr.p.a.f183640f0, bVarC4.f()), false));
        zs.b bVarC5 = aVar2.c(sr.p.a.Y);
        a aVar6 = new a(cVar.g(List.class), bVarC5, new zs.b(bVarC5.f(), zs.e.g(sr.p.a.f183642g0, bVarC5.f()), false));
        zs.b bVarC6 = aVar2.c(sr.p.a.f183630a0);
        a aVar7 = new a(cVar.g(Set.class), bVarC6, new zs.b(bVarC6.f(), zs.e.g(sr.p.a.f183646i0, bVarC6.f()), false));
        zs.b bVarC7 = aVar2.c(sr.p.a.Z);
        a aVar8 = new a(cVar.g(ListIterator.class), bVarC7, new zs.b(bVarC7.f(), zs.e.g(sr.p.a.f183644h0, bVarC7.f()), false));
        zs.c cVar3 = sr.p.a.f183632b0;
        zs.b bVarC8 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), bVarC8, new zs.b(bVarC8.f(), zs.e.g(sr.p.a.f183648j0, bVarC8.f()), false));
        zs.b bVarD = aVar2.c(cVar3).d(sr.p.a.f183634c0.f());
        List<a> listQ = pq.v.q(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), bVarD, new zs.b(bVarD.f(), zs.e.g(sr.p.a.f183650k0, bVarD.f()), false)));
        f200047q = listQ;
        cVar.f(Object.class, sr.p.a.f183631b);
        cVar.f(String.class, sr.p.a.f183643h);
        cVar.f(CharSequence.class, sr.p.a.f183641g);
        cVar.e(Throwable.class, sr.p.a.f183669u);
        cVar.f(Cloneable.class, sr.p.a.f183635d);
        cVar.f(Number.class, sr.p.a.f183663r);
        cVar.e(Comparable.class, sr.p.a.f183671v);
        cVar.f(Enum.class, sr.p.a.f183665s);
        cVar.e(Annotation.class, sr.p.a.G);
        Iterator<a> it = listQ.iterator();
        while (it.hasNext()) {
            f200031a.d(it.next());
        }
        for (jt.e eVar : jt.e.values()) {
            c cVar4 = f200031a;
            zs.b.a aVar10 = zs.b.f236634d;
            cVar4.a(aVar10.c(eVar.o()), aVar10.c(sr.p.c(eVar.n())));
        }
        for (zs.b bVar2 : sr.d.f183551a.a()) {
            f200031a.a(zs.b.f236634d.c(new zs.c("kotlin.jvm.internal." + bVar2.h().e() + "CompanionObject")), bVar2.d(zs.h.f236658d));
        }
        for (int i15 = 0; i15 < 23; i15++) {
            c cVar5 = f200031a;
            cVar5.a(zs.b.f236634d.c(new zs.c("kotlin.jvm.functions.Function" + i15)), sr.p.a(i15));
            cVar5.c(new zs.c(f200033c + i15), f200038h);
        }
        for (int i16 = 0; i16 < 22; i16++) {
            tr.f.c cVar6 = tr.f.c.f191727f;
            f200031a.c(new zs.c((cVar6.b() + '.' + cVar6.a()) + i16), f200038h);
        }
        c cVar7 = f200031a;
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicInt"), cVar7.g(AtomicInteger.class));
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicLong"), cVar7.g(AtomicLong.class));
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicBoolean"), cVar7.g(AtomicBoolean.class));
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicReference"), cVar7.g(AtomicReference.class));
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicIntArray"), cVar7.g(AtomicIntegerArray.class));
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicLongArray"), cVar7.g(AtomicLongArray.class));
        cVar7.c(new zs.c("kotlin.concurrent.atomics.AtomicArray"), cVar7.g(AtomicReferenceArray.class));
        cVar7.c(sr.p.a.f183633c.m(), cVar7.g(Void.class));
    }

    private c() {
    }

    private final void a(zs.b bVar, zs.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(zs.b bVar, zs.b bVar2) {
        f200041k.put(bVar.a().i(), bVar2);
    }

    private final void c(zs.c cVar, zs.b bVar) {
        f200042l.put(cVar.i(), bVar);
    }

    private final void d(a aVar) {
        zs.b bVarA = aVar.a();
        zs.b bVarB = aVar.b();
        zs.b bVarC = aVar.c();
        a(bVarA, bVarB);
        c(bVarC.a(), bVarA);
        f200045o.put(bVarC, bVarB);
        f200046p.put(bVarB, bVarC);
        zs.c cVarA = bVarB.a();
        zs.c cVarA2 = bVarC.a();
        f200043m.put(bVarC.a().i(), cVarA);
        f200044n.put(cVarA.i(), cVarA2);
    }

    private final void e(Class<?> cls, zs.c cVar) {
        a(g(cls), zs.b.f236634d.c(cVar));
    }

    private final void f(Class<?> cls, zs.d dVar) {
        e(cls, dVar.m());
    }

    private final zs.b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? zs.b.f236634d.c(new zs.c(cls.getCanonicalName())) : g(declaringClass).d(zs.f.l(cls.getSimpleName()));
    }

    private final boolean j(zs.d dVar, String str) {
        Integer numU;
        String strA = dVar.a();
        if (!fu.r.V(strA, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strA.substring(str.length());
        return (fu.r.Y0(strSubstring, '0', false, 2, null) || (numU = fu.r.u(strSubstring)) == null || numU.intValue() < 23) ? false : true;
    }

    public final zs.c h() {
        return f200037g;
    }

    public final List<a> i() {
        return f200047q;
    }

    public final boolean k(zs.d dVar) {
        return f200043m.containsKey(dVar);
    }

    public final boolean l(zs.d dVar) {
        return f200044n.containsKey(dVar);
    }

    public final zs.b m(zs.c cVar) {
        return f200041k.get(cVar.i());
    }

    public final zs.b n(zs.d dVar) {
        if (!j(dVar, f200032b) && !j(dVar, f200034d)) {
            if (!j(dVar, f200033c) && !j(dVar, f200035e)) {
                return f200042l.get(dVar);
            }
            return f200038h;
        }
        return f200036f;
    }

    public final zs.c o(zs.d dVar) {
        return f200043m.get(dVar);
    }

    public final zs.c p(zs.d dVar) {
        return f200044n.get(dVar);
    }
}
