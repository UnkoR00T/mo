package fe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f61679b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C1400a<?>> f61680a = new HashMap();

        /* JADX INFO: renamed from: fe.q$a$a, reason: collision with other inner class name */
        private static class C1400a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f61681a;

            public C1400a(List<o<Model, ?>> list) {
                this.f61681a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f61680a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C1400a<?> c1400a = this.f61680a.get(cls);
            if (c1400a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c1400a.f61681a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f61680a.put(cls, new C1400a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(i6.f<List<Throwable>> fVar) {
        this(new s(fVar));
    }

    private static <A> Class<A> b(A a15) {
        return (Class<A>) a15.getClass();
    }

    private synchronized <A> List<o<A, ?>> e(Class<A> cls) {
        List<o<A, ?>> listB;
        listB = this.f61679b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f61678a.e(cls));
            this.f61679b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f61678a.b(cls, cls2, pVar);
        this.f61679b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f61678a.g(cls);
    }

    public <A> List<o<A, ?>> d(A a15) {
        List<o<A, ?>> listE = e(b(a15));
        if (listE.isEmpty()) {
            throw new com.bumptech.glide.i.c(a15);
        }
        int size = listE.size();
        List<o<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z15 = true;
        for (int i15 = 0; i15 < size; i15++) {
            o<A, ?> oVar = listE.get(i15);
            if (oVar.b(a15)) {
                if (z15) {
                    arrayList = new ArrayList<>(size - i15);
                    z15 = false;
                }
                arrayList.add(oVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new com.bumptech.glide.i.c(a15, listE);
        }
        return arrayList;
    }

    private q(s sVar) {
        this.f61679b = new a();
        this.f61678a = sVar;
    }
}
