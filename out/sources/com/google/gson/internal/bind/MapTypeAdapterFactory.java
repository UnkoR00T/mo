package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import wl.c0;
import wl.g0;
import wl.v;
import wl.w;
import wl.y;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f36732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f36733b;

    private final class a<K, V> extends a0<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0<K> f36734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a0<V> f36735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c0<? extends Map<K, V>> f36736c;

        a(a0<K> a0Var, a0<V> a0Var2, c0<? extends Map<K, V>> c0Var) {
            this.f36734a = a0Var;
            this.f36735b = a0Var2;
            this.f36736c = c0Var;
        }

        private String e(l lVar) {
            if (!lVar.n()) {
                if (lVar.k()) {
                    return "null";
                }
                throw new AssertionError();
            }
            r rVarG = lVar.g();
            if (rVarG.z()) {
                return String.valueOf(rVarG.h());
            }
            if (rVarG.w()) {
                return Boolean.toString(rVarG.s());
            }
            if (rVarG.A()) {
                return rVarG.i();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(zl.a aVar) throws IOException {
            zl.b bVarA0 = aVar.a0();
            if (bVarA0 == zl.b.NULL) {
                aVar.O();
                return null;
            }
            Map<K, V> mapA = this.f36736c.a();
            if (bVarA0 != zl.b.BEGIN_ARRAY) {
                aVar.Y();
                while (aVar.I()) {
                    y.f214061a.a(aVar);
                    K kB = this.f36734a.b(aVar);
                    if (mapA.put(kB, this.f36735b.b(aVar)) != null) {
                        throw new u("duplicate key: " + kB);
                    }
                }
                aVar.h0();
                return mapA;
            }
            aVar.h();
            while (aVar.I()) {
                aVar.h();
                K kB2 = this.f36734a.b(aVar);
                if (mapA.put(kB2, this.f36735b.b(aVar)) != null) {
                    throw new u("duplicate key: " + kB2);
                }
                aVar.u();
            }
            aVar.u();
            return mapA;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.M();
                return;
            }
            if (!MapTypeAdapterFactory.this.f36733b) {
                cVar.r();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.K(String.valueOf(entry.getKey()));
                    this.f36735b.d(cVar, entry.getValue());
                }
                cVar.C();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i15 = 0;
            boolean z15 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                l lVarC = this.f36734a.c(entry2.getKey());
                arrayList.add(lVarC);
                arrayList2.add(entry2.getValue());
                z15 |= lVarC.j() || lVarC.l();
            }
            if (!z15) {
                cVar.r();
                int size = arrayList.size();
                while (i15 < size) {
                    cVar.K(e((l) arrayList.get(i15)));
                    this.f36735b.d(cVar, (V) arrayList2.get(i15));
                    i15++;
                }
                cVar.C();
                return;
            }
            cVar.p();
            int size2 = arrayList.size();
            while (i15 < size2) {
                cVar.p();
                g0.b((l) arrayList.get(i15), cVar);
                this.f36735b.d(cVar, (V) arrayList2.get(i15));
                cVar.y();
                i15++;
            }
            cVar.y();
        }
    }

    public MapTypeAdapterFactory(v vVar, boolean z15) {
        this.f36732a = vVar;
        this.f36733b = z15;
    }

    private a0<?> a(f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f36791f : fVar.l(com.google.gson.reflect.a.b(type));
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = w.j(typeD, clsC);
        Type type = typeArrJ[0];
        Type type2 = typeArrJ[1];
        return new a(new e(fVar, a(fVar, type), type), new e(fVar, fVar.l(com.google.gson.reflect.a.b(type2)), type2), this.f36732a.w(aVar, false));
    }
}
