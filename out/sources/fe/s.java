package fe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f61691e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f61692f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f61693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f61694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f61695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i6.f<List<Throwable>> f61696d;

    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // fe.o
        public o.a<Object> a(Object obj, int i15, int i16, zd.h hVar) {
            return null;
        }

        @Override // fe.o
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<Model> f61697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<Data> f61698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f61699c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f61697a = cls;
            this.f61698b = cls2;
            this.f61699c = pVar;
        }

        public boolean a(Class<?> cls) {
            return this.f61697a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f61698b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public <Model, Data> r<Model, Data> a(List<o<Model, Data>> list, i6.f<List<Throwable>> fVar) {
            return new r<>(list, fVar);
        }
    }

    public s(i6.f<List<Throwable>> fVar) {
        this(fVar, f61691e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar, boolean z15) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f61693a;
        list.add(z15 ? list.size() : 0, bVar);
    }

    private <Model, Data> o<Model, Data> c(b<?, ?> bVar) {
        return (o) ve.k.d(bVar.f61699c.d(this));
    }

    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f61692f;
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    public synchronized <Model, Data> o<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z15 = false;
            for (b<?, ?> bVar : this.f61693a) {
                if (this.f61695c.contains(bVar)) {
                    z15 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f61695c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f61695c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f61694b.a(arrayList, this.f61696d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z15) {
                throw new com.bumptech.glide.i.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th4) {
            this.f61695c.clear();
            throw th4;
        }
    }

    synchronized <Model> List<o<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f61693a) {
                if (!this.f61695c.contains(bVar) && bVar.a(cls)) {
                    this.f61695c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f61695c.remove(bVar);
                }
            }
        } catch (Throwable th4) {
            this.f61695c.clear();
            throw th4;
        }
        return arrayList;
    }

    synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f61693a) {
            if (!arrayList.contains(bVar.f61698b) && bVar.a(cls)) {
                arrayList.add(bVar.f61698b);
            }
        }
        return arrayList;
    }

    s(i6.f<List<Throwable>> fVar, c cVar) {
        this.f61693a = new ArrayList();
        this.f61695c = new HashSet();
        this.f61696d = fVar;
        this.f61694b = cVar;
    }
}
