package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import wl.c0;
import wl.v;
import wl.w;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f36716a;

    private static final class a<E> extends a0<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0<E> f36717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0<? extends Collection<E>> f36718b;

        a(a0<E> a0Var, c0<? extends Collection<E>> c0Var) {
            this.f36717a = a0Var;
            this.f36718b = c0Var;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            Collection<E> collectionA = this.f36718b.a();
            aVar.h();
            while (aVar.I()) {
                collectionA.add(this.f36717a.b(aVar));
            }
            aVar.u();
            return collectionA;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.M();
                return;
            }
            cVar.p();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f36717a.d(cVar, it.next());
            }
            cVar.y();
        }
    }

    public CollectionTypeAdapterFactory(v vVar) {
        this.f36716a = vVar;
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = w.h(typeD, clsC);
        return new a(new e(fVar, fVar.l(com.google.gson.reflect.a.b(typeH)), typeH), this.f36716a.w(aVar, false));
    }
}
