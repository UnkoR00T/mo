package bo;

import ao.d0;
import ao.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import yn.a0;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f20461a;

    private static final class a<E> extends z<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z<E> f20462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0<? extends Collection<E>> f20463b;

        public a(z<E> zVar, d0<? extends Collection<E>> d0Var) {
            this.f20462a = zVar;
            this.f20463b = d0Var;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            Collection<E> collectionA = this.f20463b.a();
            aVar.h();
            while (aVar.I()) {
                collectionA.add(this.f20462a.b(aVar));
            }
            aVar.u();
            return collectionA;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.M();
                return;
            }
            cVar.p();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f20462a.d(cVar, it.next());
            }
            cVar.y();
        }
    }

    public b(w wVar) {
        this.f20461a = wVar;
    }

    @Override // yn.a0
    public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsD = aVar.d();
        if (!Collection.class.isAssignableFrom(clsD)) {
            return null;
        }
        Type typeH = ao.b.h(typeE, clsD);
        return new a(new o(fVar, fVar.k(go.a.b(typeH)), typeH), this.f20461a.v(aVar));
    }
}
