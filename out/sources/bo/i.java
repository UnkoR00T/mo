package bo;

import ao.d0;
import ao.h0;
import ao.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import yn.a0;
import yn.q;
import yn.t;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f20484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f20485b;

    private final class a<K, V> extends z<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z<K> f20486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z<V> f20487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0<? extends Map<K, V>> f20488c;

        public a(z<K> zVar, z<V> zVar2, d0<? extends Map<K, V>> d0Var) {
            this.f20486a = zVar;
            this.f20487b = zVar2;
            this.f20488c = d0Var;
        }

        private String e(yn.l lVar) {
            if (!lVar.k()) {
                if (lVar.i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            q qVarG = lVar.g();
            if (qVarG.w()) {
                return String.valueOf(qVarG.s());
            }
            if (qVarG.u()) {
                return Boolean.toString(qVarG.o());
            }
            if (qVarG.x()) {
                return qVarG.t();
            }
            throw new AssertionError();
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(ho.a aVar) throws IOException {
            ho.b bVarA0 = aVar.a0();
            if (bVarA0 == ho.b.NULL) {
                aVar.O();
                return null;
            }
            Map<K, V> mapA = this.f20488c.a();
            if (bVarA0 != ho.b.BEGIN_ARRAY) {
                aVar.Y();
                while (aVar.I()) {
                    ao.z.f13952a.a(aVar);
                    K kB = this.f20486a.b(aVar);
                    if (mapA.put(kB, this.f20487b.b(aVar)) != null) {
                        throw new t("duplicate key: " + kB);
                    }
                }
                aVar.h0();
                return mapA;
            }
            aVar.h();
            while (aVar.I()) {
                aVar.h();
                K kB2 = this.f20486a.b(aVar);
                if (mapA.put(kB2, this.f20487b.b(aVar)) != null) {
                    throw new t("duplicate key: " + kB2);
                }
                aVar.u();
            }
            aVar.u();
            return mapA;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.M();
                return;
            }
            if (!i.this.f20485b) {
                cVar.r();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.K(String.valueOf(entry.getKey()));
                    this.f20487b.d(cVar, entry.getValue());
                }
                cVar.C();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i15 = 0;
            boolean z15 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                yn.l lVarC = this.f20486a.c(entry2.getKey());
                arrayList.add(lVarC);
                arrayList2.add(entry2.getValue());
                z15 |= lVarC.h() || lVarC.j();
            }
            if (!z15) {
                cVar.r();
                int size = arrayList.size();
                while (i15 < size) {
                    cVar.K(e((yn.l) arrayList.get(i15)));
                    this.f20487b.d(cVar, (V) arrayList2.get(i15));
                    i15++;
                }
                cVar.C();
                return;
            }
            cVar.p();
            int size2 = arrayList.size();
            while (i15 < size2) {
                cVar.p();
                h0.b((yn.l) arrayList.get(i15), cVar);
                this.f20487b.d(cVar, (V) arrayList2.get(i15));
                cVar.y();
                i15++;
            }
            cVar.y();
        }
    }

    public i(w wVar, boolean z15) {
        this.f20484a = wVar;
        this.f20485b = z15;
    }

    private z<?> a(yn.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? p.f20541f : fVar.k(go.a.b(type));
    }

    @Override // yn.a0
    public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsD = aVar.d();
        if (!Map.class.isAssignableFrom(clsD)) {
            return null;
        }
        Type[] typeArrJ = ao.b.j(typeE, clsD);
        Type type = typeArrJ[0];
        Type type2 = typeArrJ[1];
        return new a(new o(fVar, a(fVar, type), type), new o(fVar, fVar.k(go.a.b(type2)), type2), this.f20484a.v(aVar));
    }
}
