package js;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104736a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<a.C2486a> f104737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f104738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f104739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<a.C2486a, c> f104740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, c> f104741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<zs.f> f104742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<String> f104743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a.C2486a f104744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<a.C2486a, zs.f> f104745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, zs.f> f104746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set<String> f104747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set<zs.f> f104748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map<zs.f, zs.f> f104749n;

    public static final class a {

        /* JADX INFO: renamed from: js.u0$a$a, reason: collision with other inner class name */
        public static final class C2486a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f104750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final zs.f f104751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f104752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f104753d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f104754e;

            public C2486a(String str, zs.f fVar, String str2, String str3) {
                this.f104750a = str;
                this.f104751b = fVar;
                this.f104752c = str2;
                this.f104753d = str3;
                this.f104754e = ss.f0.f183849a.m(str, fVar + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ C2486a b(C2486a c2486a, String str, zs.f fVar, String str2, String str3, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = c2486a.f104750a;
                }
                if ((i15 & 2) != 0) {
                    fVar = c2486a.f104751b;
                }
                if ((i15 & 4) != 0) {
                    str2 = c2486a.f104752c;
                }
                if ((i15 & 8) != 0) {
                    str3 = c2486a.f104753d;
                }
                return c2486a.a(str, fVar, str2, str3);
            }

            public final C2486a a(String str, zs.f fVar, String str2, String str3) {
                return new C2486a(str, fVar, str2, str3);
            }

            public final zs.f c() {
                return this.f104751b;
            }

            public final String d() {
                return this.f104754e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2486a)) {
                    return false;
                }
                C2486a c2486a = (C2486a) obj;
                return fr.t.c(this.f104750a, c2486a.f104750a) && fr.t.c(this.f104751b, c2486a.f104751b) && fr.t.c(this.f104752c, c2486a.f104752c) && fr.t.c(this.f104753d, c2486a.f104753d);
            }

            public int hashCode() {
                return (((((this.f104750a.hashCode() * 31) + this.f104751b.hashCode()) * 31) + this.f104752c.hashCode()) * 31) + this.f104753d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f104750a + ", name=" + this.f104751b + ", parameters=" + this.f104752c + ", returnType=" + this.f104753d + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2486a m(String str, String str2, String str3, String str4) {
            return new C2486a(str, zs.f.l(str2), str3, str4);
        }

        public final zs.f b(zs.f fVar) {
            return f().get(fVar);
        }

        public final List<String> c() {
            return u0.f104738c;
        }

        public final Set<zs.f> d() {
            return u0.f104742g;
        }

        public final Set<String> e() {
            return u0.f104743h;
        }

        public final Map<zs.f, zs.f> f() {
            return u0.f104749n;
        }

        public final Set<zs.f> g() {
            return u0.f104748m;
        }

        public final C2486a h() {
            return u0.f104744i;
        }

        public final Map<String, c> i() {
            return u0.f104741f;
        }

        public final Map<String, zs.f> j() {
            return u0.f104746k;
        }

        public final boolean k(zs.f fVar) {
            return g().contains(fVar);
        }

        public final b l(String str) {
            if (c().contains(str)) {
                return b.ONE_COLLECTION_PARAMETER;
            }
            return ((c) pq.v0.j(i(), str)) == c.f104762b ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        private a() {
        }
    }

    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f104759g = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f104760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f104761b;

        b(String str, boolean z15) {
            this.f104760a = str;
            this.f104761b = z15;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f104762b = new c("NULL", 0, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f104763c = new c("INDEX", 1, -1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f104764d = new c("FALSE", 2, Boolean.FALSE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f104765e = new a("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ c[] f104766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f104767g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f104768a;

        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i15) {
                fr.k kVar = null;
                super(str, i15, kVar, kVar);
            }
        }

        static {
            c[] cVarArrB = b();
            f104766f = cVarArrB;
            f104767g = wq.b.a(cVarArrB);
        }

        public /* synthetic */ c(String str, int i15, Object obj, fr.k kVar) {
            this(str, i15, obj);
        }

        private static final /* synthetic */ c[] b() {
            return new c[]{f104762b, f104763c, f104764d, f104765e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f104766f.clone();
        }

        private c(String str, int i15, Object obj) {
            super(str, i15);
            this.f104768a = obj;
        }
    }

    static {
        Set setI = e1.i("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(pq.v.y(setI, 10));
        Iterator it = setI.iterator();
        while (it.hasNext()) {
            arrayList.add(f104736a.m("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", jt.e.BOOLEAN.j()));
        }
        f104737b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(pq.v.y(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((a.C2486a) it4.next()).d());
        }
        f104738c = arrayList3;
        List<a.C2486a> list = f104737b;
        ArrayList arrayList4 = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((a.C2486a) it5.next()).c().e());
        }
        f104739d = arrayList4;
        ss.f0 f0Var = ss.f0.f183849a;
        a aVar = f104736a;
        String strI = f0Var.i("Collection");
        jt.e eVar = jt.e.BOOLEAN;
        a.C2486a c2486aM = aVar.m(strI, "contains", "Ljava/lang/Object;", eVar.j());
        c cVar = c.f104764d;
        oq.r rVarA = oq.y.a(c2486aM, cVar);
        oq.r rVarA2 = oq.y.a(aVar.m(f0Var.i("Collection"), "remove", "Ljava/lang/Object;", eVar.j()), cVar);
        oq.r rVarA3 = oq.y.a(aVar.m(f0Var.i("Map"), "containsKey", "Ljava/lang/Object;", eVar.j()), cVar);
        oq.r rVarA4 = oq.y.a(aVar.m(f0Var.i("Map"), "containsValue", "Ljava/lang/Object;", eVar.j()), cVar);
        oq.r rVarA5 = oq.y.a(aVar.m(f0Var.i("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", eVar.j()), cVar);
        oq.r rVarA6 = oq.y.a(aVar.m(f0Var.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f104765e);
        a.C2486a c2486aM2 = aVar.m(f0Var.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f104762b;
        oq.r rVarA7 = oq.y.a(c2486aM2, cVar2);
        oq.r rVarA8 = oq.y.a(aVar.m(f0Var.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI2 = f0Var.i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d);
        jt.e eVar2 = jt.e.INT;
        a.C2486a c2486aM3 = aVar.m(strI2, "indexOf", "Ljava/lang/Object;", eVar2.j());
        c cVar3 = c.f104763c;
        Map<a.C2486a, c> mapL = pq.v0.l(rVarA, rVarA2, rVarA3, rVarA4, rVarA5, rVarA6, rVarA7, rVarA8, oq.y.a(c2486aM3, cVar3), oq.y.a(aVar.m(f0Var.i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d), "lastIndexOf", "Ljava/lang/Object;", eVar2.j()), cVar3));
        f104740e = mapL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(mapL.size()));
        Iterator<T> it6 = mapL.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry = (Map.Entry) it6.next();
            linkedHashMap.put(((a.C2486a) entry.getKey()).d(), entry.getValue());
        }
        f104741f = linkedHashMap;
        Set setL = e1.l(f104740e.keySet(), f104737b);
        ArrayList arrayList5 = new ArrayList(pq.v.y(setL, 10));
        Iterator it7 = setL.iterator();
        while (it7.hasNext()) {
            arrayList5.add(((a.C2486a) it7.next()).c());
        }
        f104742g = pq.v.k1(arrayList5);
        ArrayList arrayList6 = new ArrayList(pq.v.y(setL, 10));
        Iterator it8 = setL.iterator();
        while (it8.hasNext()) {
            arrayList6.add(((a.C2486a) it8.next()).d());
        }
        f104743h = pq.v.k1(arrayList6);
        a aVar2 = f104736a;
        jt.e eVar3 = jt.e.INT;
        a.C2486a c2486aM4 = aVar2.m("java/util/List", "removeAt", eVar3.j(), "Ljava/lang/Object;");
        f104744i = c2486aM4;
        ss.f0 f0Var2 = ss.f0.f183849a;
        Map<a.C2486a, zs.f> mapL2 = pq.v0.l(oq.y.a(aVar2.m(f0Var2.h("Number"), "toByte", "", jt.e.BYTE.j()), zs.f.l("byteValue")), oq.y.a(aVar2.m(f0Var2.h("Number"), "toShort", "", jt.e.SHORT.j()), zs.f.l("shortValue")), oq.y.a(aVar2.m(f0Var2.h("Number"), "toInt", "", eVar3.j()), zs.f.l("intValue")), oq.y.a(aVar2.m(f0Var2.h("Number"), "toLong", "", jt.e.LONG.j()), zs.f.l("longValue")), oq.y.a(aVar2.m(f0Var2.h("Number"), "toFloat", "", jt.e.FLOAT.j()), zs.f.l("floatValue")), oq.y.a(aVar2.m(f0Var2.h("Number"), "toDouble", "", jt.e.DOUBLE.j()), zs.f.l("doubleValue")), oq.y.a(c2486aM4, zs.f.l("remove")), oq.y.a(aVar2.m(f0Var2.h("CharSequence"), "get", eVar3.j(), jt.e.CHAR.j()), zs.f.l("charAt")), oq.y.a(aVar2.m(f0Var2.j("AtomicInteger"), "load", "", "I"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicInteger"), "store", "I", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicInteger"), "exchange", "I", "I"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicInteger"), "fetchAndAdd", "I", "I"), zs.f.l("getAndAdd")), oq.y.a(aVar2.m(f0Var2.j("AtomicInteger"), "addAndFetch", "I", "I"), zs.f.l("addAndGet")), oq.y.a(aVar2.m(f0Var2.j("AtomicLong"), "load", "", "J"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicLong"), "store", "J", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicLong"), "exchange", "J", "J"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicLong"), "fetchAndAdd", "J", "J"), zs.f.l("getAndAdd")), oq.y.a(aVar2.m(f0Var2.j("AtomicLong"), "addAndFetch", "J", "J"), zs.f.l("addAndGet")), oq.y.a(aVar2.m(f0Var2.j("AtomicBoolean"), "load", "", "Z"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicBoolean"), "store", "Z", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicBoolean"), "exchange", "Z", "Z"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicReference"), "load", "", "Ljava/lang/Object;"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicReference"), "store", "Ljava/lang/Object;", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicIntegerArray"), "loadAt", "I", "I"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicIntegerArray"), "storeAt", "II", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicIntegerArray"), "exchangeAt", "II", "I"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), zs.f.l("compareAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), zs.f.l("getAndAdd")), oq.y.a(aVar2.m(f0Var2.j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), zs.f.l("addAndGet")), oq.y.a(aVar2.m(f0Var2.j("AtomicLongArray"), "loadAt", "I", "J"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicLongArray"), "storeAt", "IJ", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicLongArray"), "exchangeAt", "IJ", "J"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), zs.f.l("compareAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), zs.f.l("getAndAdd")), oq.y.a(aVar2.m(f0Var2.j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), zs.f.l("addAndGet")), oq.y.a(aVar2.m(f0Var2.j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), zs.f.l("get")), oq.y.a(aVar2.m(f0Var2.j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), zs.f.l("set")), oq.y.a(aVar2.m(f0Var2.j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), zs.f.l("getAndSet")), oq.y.a(aVar2.m(f0Var2.j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), zs.f.l("compareAndSet")));
        f104745j = mapL2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(pq.v0.e(mapL2.size()));
        Iterator<T> it9 = mapL2.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it9.next();
            linkedHashMap2.put(((a.C2486a) entry2.getKey()).d(), entry2.getValue());
        }
        f104746k = linkedHashMap2;
        Map<a.C2486a, zs.f> map = f104745j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<a.C2486a, zs.f> entry3 : map.entrySet()) {
            linkedHashSet.add(a.C2486a.b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).d());
        }
        f104747l = linkedHashSet;
        Set<a.C2486a> setKeySet = f104745j.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it10 = setKeySet.iterator();
        while (it10.hasNext()) {
            hashSet.add(((a.C2486a) it10.next()).c());
        }
        f104748m = hashSet;
        Set<Map.Entry<a.C2486a, zs.f>> setEntrySet = f104745j.entrySet();
        ArrayList<oq.r> arrayList7 = new ArrayList(pq.v.y(setEntrySet, 10));
        Iterator<T> it11 = setEntrySet.iterator();
        while (it11.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it11.next();
            arrayList7.add(new oq.r(((a.C2486a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(arrayList7, 10)), 16));
        for (oq.r rVar : arrayList7) {
            linkedHashMap3.put((zs.f) rVar.d(), (zs.f) rVar.c());
        }
        f104749n = linkedHashMap3;
    }
}
