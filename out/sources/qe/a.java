package qe;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C4161a<?>> f166150a = new ArrayList();

    /* JADX INFO: renamed from: qe.a$a, reason: collision with other inner class name */
    private static final class C4161a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f166151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final zd.d<T> f166152b;

        C4161a(Class<T> cls, zd.d<T> dVar) {
            this.f166151a = cls;
            this.f166152b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.f166151a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, zd.d<T> dVar) {
        this.f166150a.add(new C4161a<>(cls, dVar));
    }

    public synchronized <T> zd.d<T> b(Class<T> cls) {
        for (C4161a<?> c4161a : this.f166150a) {
            if (c4161a.a(cls)) {
                return (zd.d<T>) c4161a.f166152b;
            }
        }
        return null;
    }
}
