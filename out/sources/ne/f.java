package ne;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f134850a = new ArrayList();

    private static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<Z> f134851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f134852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e<Z, R> f134853c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f134851a = cls;
            this.f134852b = cls2;
            this.f134853c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f134851a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f134852b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f134850a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f134853c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f134850a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f134852b)) {
                arrayList.add(aVar.f134852b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f134850a.add(new a<>(cls, cls2, eVar));
    }
}
