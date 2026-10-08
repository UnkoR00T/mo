package qt;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pq.e1;
import pq.v0;
import vr.g1;
import vr.l1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends lt.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f168398f = {fr.q0.j(new fr.h0(w.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), fr.q0.j(new fr.h0(w.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ot.p f168399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f168400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i f168401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.j f168402e;

    private interface a {
        Collection<g1> a(zs.f fVar, ds.b bVar);

        Set<zs.f> b();

        Collection<z0> c(zs.f fVar, ds.b bVar);

        Set<zs.f> d();

        void e(Collection<vr.m> collection, lt.d dVar, er.l<? super zs.f, Boolean> lVar, ds.b bVar);

        Set<zs.f> f();

        l1 g(zs.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ mr.l<Object>[] f168403o = {fr.q0.j(new fr.h0(b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), fr.q0.j(new fr.h0(b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), fr.q0.j(new fr.h0(b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), fr.q0.j(new fr.h0(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), fr.q0.j(new fr.h0(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<us.j> f168404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<us.o> f168405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<us.s> f168406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final rt.i f168407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final rt.i f168408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final rt.i f168409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final rt.i f168410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final rt.i f168411h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final rt.i f168412i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final rt.i f168413j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final rt.i f168414k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final rt.i f168415l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final rt.i f168416m;

        public b(List<us.j> list, List<us.o> list2, List<us.s> list3) {
            this.f168404a = list;
            this.f168405b = list2;
            this.f168406c = w.this.s().c().g().c() ? list3 : pq.v.n();
            this.f168407d = w.this.s().h().d(new x(this));
            this.f168408e = w.this.s().h().d(new y(this));
            this.f168409f = w.this.s().h().d(new z(this));
            this.f168410g = w.this.s().h().d(new a0(this));
            this.f168411h = w.this.s().h().d(new b0(this));
            this.f168412i = w.this.s().h().d(new c0(this));
            this.f168413j = w.this.s().h().d(new d0(this));
            this.f168414k = w.this.s().h().d(new e0(this));
            this.f168415l = w.this.s().h().d(new f0(this, w.this));
            this.f168416m = w.this.s().h().d(new g0(this, w.this));
        }

        private final List<l1> A() {
            List<us.s> list = this.f168406c;
            w wVar = w.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                l1 l1VarD = wVar.s().f().D((us.s) ((bt.q) it.next()));
                if (l1VarD != null) {
                    arrayList.add(l1VarD);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, w wVar) {
            List<us.j> list = bVar.f168404a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = w.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ot.m0.b(wVar2.s().g(), ((us.j) ((bt.q) it.next())).D0()));
            }
            return e1.l(linkedHashSet, wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List<g1> listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                zs.f name = ((g1) obj).getName();
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List<g1> F() {
            return (List) rt.m.a(this.f168410g, this, f168403o[3]);
        }

        private final List<z0> G() {
            return (List) rt.m.a(this.f168411h, this, f168403o[4]);
        }

        private final List<l1> H() {
            return (List) rt.m.a(this.f168409f, this, f168403o[2]);
        }

        private final List<g1> I() {
            return (List) rt.m.a(this.f168407d, this, f168403o[0]);
        }

        private final List<z0> J() {
            return (List) rt.m.a(this.f168408e, this, f168403o[1]);
        }

        private final Map<zs.f, Collection<g1>> K() {
            return (Map) rt.m.a(this.f168413j, this, f168403o[6]);
        }

        private final Map<zs.f, Collection<z0>> L() {
            return (Map) rt.m.a(this.f168414k, this, f168403o[7]);
        }

        private final Map<zs.f, l1> M() {
            return (Map) rt.m.a(this.f168412i, this, f168403o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List<z0> listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                zs.f name = ((z0) obj).getName();
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List<l1> listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listH, 10)), 16));
            for (Object obj : listH) {
                linkedHashMap.put(((l1) obj).getName(), obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, w wVar) {
            List<us.o> list = bVar.f168405b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = w.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ot.m0.b(wVar2.s().g(), ((us.o) ((bt.q) it.next())).T0()));
            }
            return e1.l(linkedHashSet, wVar.x());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return pq.v.L0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return pq.v.L0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List<g1> u() {
            Set<zs.f> setW = w.this.w();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setW.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, x((zs.f) it.next()));
            }
            return arrayList;
        }

        private final List<z0> v() {
            Set<zs.f> setX = w.this.x();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setX.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, y((zs.f) it.next()));
            }
            return arrayList;
        }

        private final List<g1> w() {
            List<us.j> list = this.f168404a;
            w wVar = w.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g1 g1VarV = wVar.s().f().v((us.j) ((bt.q) it.next()));
                if (!wVar.A(g1VarV)) {
                    g1VarV = null;
                }
                if (g1VarV != null) {
                    arrayList.add(g1VarV);
                }
            }
            return arrayList;
        }

        private final List<g1> x(zs.f fVar) {
            List<g1> listI = I();
            w wVar = w.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (fr.t.c(((vr.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<z0> y(zs.f fVar) {
            List<z0> listJ = J();
            w wVar = w.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (fr.t.c(((vr.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<z0> z() {
            List<us.o> list = this.f168405b;
            w wVar = w.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                z0 z0VarY = ot.l0.y(wVar.s().f(), (us.o) ((bt.q) it.next()), false, 2, null);
                if (z0VarY != null) {
                    arrayList.add(z0VarY);
                }
            }
            return arrayList;
        }

        @Override // qt.w.a
        public Collection<g1> a(zs.f fVar, ds.b bVar) {
            Collection<g1> collection;
            return (b().contains(fVar) && (collection = K().get(fVar)) != null) ? collection : pq.v.n();
        }

        @Override // qt.w.a
        public Set<zs.f> b() {
            return (Set) rt.m.a(this.f168415l, this, f168403o[8]);
        }

        @Override // qt.w.a
        public Collection<z0> c(zs.f fVar, ds.b bVar) {
            Collection<z0> collection;
            return (d().contains(fVar) && (collection = L().get(fVar)) != null) ? collection : pq.v.n();
        }

        @Override // qt.w.a
        public Set<zs.f> d() {
            return (Set) rt.m.a(this.f168416m, this, f168403o[9]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qt.w.a
        public void e(Collection<vr.m> collection, lt.d dVar, er.l<? super zs.f, Boolean> lVar, ds.b bVar) {
            if (dVar.a(lt.d.f120091c.i())) {
                for (Object obj : G()) {
                    if (lVar.b(((z0) obj).getName()).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (dVar.a(lt.d.f120091c.d())) {
                for (Object obj2 : F()) {
                    if (lVar.b(((g1) obj2).getName()).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // qt.w.a
        public Set<zs.f> f() {
            List<us.s> list = this.f168406c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = w.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ot.m0.b(wVar.s().g(), ((us.s) ((bt.q) it.next())).h0()));
            }
            return linkedHashSet;
        }

        @Override // qt.w.a
        public l1 g(zs.f fVar) {
            return M().get(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ mr.l<Object>[] f168418j = {fr.q0.j(new fr.h0(c.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), fr.q0.j(new fr.h0(c.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<zs.f, byte[]> f168419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<zs.f, byte[]> f168420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<zs.f, byte[]> f168421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final rt.g<zs.f, Collection<g1>> f168422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final rt.g<zs.f, Collection<z0>> f168423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final rt.h<zs.f, l1> f168424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final rt.i f168425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final rt.i f168426h;

        public static final class a implements er.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ bt.s f168428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f168429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f168430c;

            public a(bt.s sVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f168428a = sVar;
                this.f168429b = byteArrayInputStream;
                this.f168430c = wVar;
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final bt.q a() {
                return (bt.q) this.f168428a.a(this.f168429b, this.f168430c.s().c().k());
            }
        }

        public c(List<us.j> list, List<us.o> list2, List<us.s> list3) throws IOException {
            Map<zs.f, byte[]> mapI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                zs.f fVarB = ot.m0.b(w.this.s().g(), ((us.j) ((bt.q) obj)).D0());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f168419a = r(linkedHashMap);
            w wVar = w.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                zs.f fVarB2 = ot.m0.b(wVar.s().g(), ((us.o) ((bt.q) obj2)).T0());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f168420b = r(linkedHashMap2);
            if (w.this.s().c().g().c()) {
                w wVar2 = w.this;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    zs.f fVarB3 = ot.m0.b(wVar2.s().g(), ((us.s) ((bt.q) obj3)).h0());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapI = r(linkedHashMap3);
            } else {
                mapI = v0.i();
            }
            this.f168421c = mapI;
            this.f168422d = w.this.s().h().i(new h0(this));
            this.f168423e = w.this.s().h().i(new i0(this));
            this.f168424f = w.this.s().h().a(new j0(this));
            this.f168425g = w.this.s().h().d(new k0(this, w.this));
            this.f168426h = w.this.s().h().d(new l0(this, w.this));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0027  */
        private final Collection<g1> m(zs.f fVar) {
            List listN;
            Map<zs.f, byte[]> map = this.f168419a;
            bt.s<us.j> sVar = us.j.D;
            w wVar = w.this;
            byte[] bArr = map.get(fVar);
            if (bArr != null) {
                List listP = eu.k.P(eu.k.n(new a(sVar, new ByteArrayInputStream(bArr), w.this)));
                if (listP != null) {
                    listN = listP;
                } else {
                    listN = pq.v.n();
                }
            } else {
                listN = pq.v.n();
            }
            ArrayList arrayList = new ArrayList(listN.size());
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                g1 g1VarV = wVar.s().f().v((us.j) it.next());
                if (!wVar.A(g1VarV)) {
                    g1VarV = null;
                }
                if (g1VarV != null) {
                    arrayList.add(g1VarV);
                }
            }
            wVar.n(fVar, arrayList);
            return cu.a.c(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0027  */
        private final Collection<z0> n(zs.f fVar) {
            List listN;
            Map<zs.f, byte[]> map = this.f168420b;
            bt.s<us.o> sVar = us.o.H;
            w wVar = w.this;
            byte[] bArr = map.get(fVar);
            if (bArr != null) {
                List listP = eu.k.P(eu.k.n(new a(sVar, new ByteArrayInputStream(bArr), w.this)));
                if (listP != null) {
                    listN = listP;
                } else {
                    listN = pq.v.n();
                }
            } else {
                listN = pq.v.n();
            }
            ArrayList arrayList = new ArrayList(listN.size());
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                z0 z0VarY = ot.l0.y(wVar.s().f(), (us.o) it.next(), false, 2, null);
                if (z0VarY != null) {
                    arrayList.add(z0VarY);
                }
            }
            wVar.o(fVar, arrayList);
            return cu.a.c(arrayList);
        }

        private final l1 o(zs.f fVar) {
            us.s sVarY0;
            byte[] bArr = this.f168421c.get(fVar);
            if (bArr == null || (sVarY0 = us.s.y0(new ByteArrayInputStream(bArr), w.this.s().c().k())) == null) {
                return null;
            }
            return w.this.s().f().D(sVarY0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(c cVar, w wVar) {
            return e1.l(cVar.f168419a.keySet(), wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(c cVar, zs.f fVar) {
            return cVar.m(fVar);
        }

        private final Map<zs.f, byte[]> r(Map<zs.f, ? extends Collection<? extends bt.a>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    ((bt.a) it4.next()).d(byteArrayOutputStream);
                    arrayList.add(oq.i0.f148189a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(c cVar, zs.f fVar) {
            return cVar.n(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l1 t(c cVar, zs.f fVar) {
            return cVar.o(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(c cVar, w wVar) {
            return e1.l(cVar.f168420b.keySet(), wVar.x());
        }

        @Override // qt.w.a
        public Collection<g1> a(zs.f fVar, ds.b bVar) {
            return !b().contains(fVar) ? pq.v.n() : this.f168422d.b(fVar);
        }

        @Override // qt.w.a
        public Set<zs.f> b() {
            return (Set) rt.m.a(this.f168425g, this, f168418j[0]);
        }

        @Override // qt.w.a
        public Collection<z0> c(zs.f fVar, ds.b bVar) {
            return !d().contains(fVar) ? pq.v.n() : this.f168423e.b(fVar);
        }

        @Override // qt.w.a
        public Set<zs.f> d() {
            return (Set) rt.m.a(this.f168426h, this, f168418j[1]);
        }

        @Override // qt.w.a
        public void e(Collection<vr.m> collection, lt.d dVar, er.l<? super zs.f, Boolean> lVar, ds.b bVar) {
            if (dVar.a(lt.d.f120091c.i())) {
                Set<zs.f> setD = d();
                ArrayList arrayList = new ArrayList();
                for (zs.f fVar : setD) {
                    if (lVar.b(fVar).booleanValue()) {
                        arrayList.addAll(c(fVar, bVar));
                    }
                }
                pq.v.C(arrayList, dt.l.f44492a);
                collection.addAll(arrayList);
            }
            if (dVar.a(lt.d.f120091c.d())) {
                Set<zs.f> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (zs.f fVar2 : setB) {
                    if (lVar.b(fVar2).booleanValue()) {
                        arrayList2.addAll(a(fVar2, bVar));
                    }
                }
                pq.v.C(arrayList2, dt.l.f44492a);
                collection.addAll(arrayList2);
            }
        }

        @Override // qt.w.a
        public Set<zs.f> f() {
            return this.f168421c.keySet();
        }

        @Override // qt.w.a
        public l1 g(zs.f fVar) {
            return this.f168424f.b(fVar);
        }
    }

    protected w(ot.p pVar, List<us.j> list, List<us.o> list2, List<us.s> list3, er.a<? extends Collection<zs.f>> aVar) {
        this.f168399b = pVar;
        this.f168400c = q(list, list2, list3);
        this.f168401d = pVar.h().d(new u(aVar));
        this.f168402e = pVar.h().c(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(er.a aVar) {
        return pq.v.k1((Iterable) aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(w wVar) {
        Set<zs.f> setV = wVar.v();
        if (setV == null) {
            return null;
        }
        return e1.l(e1.l(wVar.t(), wVar.f168400c.f()), setV);
    }

    private final a q(List<us.j> list, List<us.o> list2, List<us.s> list3) {
        return this.f168399b.c().g().a() ? new b(list, list2, list3) : new c(list, list2, list3);
    }

    private final vr.e r(zs.f fVar) {
        return this.f168399b.c().b(p(fVar));
    }

    private final Set<zs.f> u() {
        return (Set) rt.m.b(this.f168402e, this, f168398f[1]);
    }

    private final l1 y(zs.f fVar) {
        return this.f168400c.g(fVar);
    }

    protected boolean A(g1 g1Var) {
        return true;
    }

    @Override // lt.l, lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        return this.f168400c.a(fVar, bVar);
    }

    @Override // lt.l, lt.k
    public Set<zs.f> b() {
        return this.f168400c.b();
    }

    @Override // lt.l, lt.k
    public Collection<z0> c(zs.f fVar, ds.b bVar) {
        return this.f168400c.c(fVar, bVar);
    }

    @Override // lt.l, lt.k
    public Set<zs.f> d() {
        return this.f168400c.d();
    }

    @Override // lt.l, lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        if (z(fVar)) {
            return r(fVar);
        }
        if (this.f168400c.f().contains(fVar)) {
            return y(fVar);
        }
        return null;
    }

    @Override // lt.l, lt.k
    public Set<zs.f> g() {
        return u();
    }

    protected abstract void j(Collection<vr.m> collection, er.l<? super zs.f, Boolean> lVar);

    protected final Collection<vr.m> m(lt.d dVar, er.l<? super zs.f, Boolean> lVar, ds.b bVar) {
        ArrayList arrayList = new ArrayList(0);
        lt.d.a aVar = lt.d.f120091c;
        if (dVar.a(aVar.g())) {
            j(arrayList, lVar);
        }
        this.f168400c.e(arrayList, dVar, lVar, bVar);
        if (dVar.a(aVar.c())) {
            for (zs.f fVar : t()) {
                if (lVar.b(fVar).booleanValue()) {
                    cu.a.a(arrayList, r(fVar));
                }
            }
        }
        if (dVar.a(lt.d.f120091c.h())) {
            for (zs.f fVar2 : this.f168400c.f()) {
                if (lVar.b(fVar2).booleanValue()) {
                    cu.a.a(arrayList, this.f168400c.g(fVar2));
                }
            }
        }
        return cu.a.c(arrayList);
    }

    protected void n(zs.f fVar, List<g1> list) {
    }

    protected void o(zs.f fVar, List<z0> list) {
    }

    protected abstract zs.b p(zs.f fVar);

    protected final ot.p s() {
        return this.f168399b;
    }

    public final Set<zs.f> t() {
        return (Set) rt.m.a(this.f168401d, this, f168398f[0]);
    }

    protected abstract Set<zs.f> v();

    protected abstract Set<zs.f> w();

    protected abstract Set<zs.f> x();

    protected boolean z(zs.f fVar) {
        return t().contains(fVar);
    }
}
