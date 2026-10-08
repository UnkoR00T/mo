package qe;

import java.util.ArrayList;
import java.util.List;
import zd.k;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?>> f166164a = new ArrayList();

    private static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f166165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k<T> f166166b;

        a(Class<T> cls, k<T> kVar) {
            this.f166165a = cls;
            this.f166166b = kVar;
        }

        boolean a(Class<?> cls) {
            return this.f166165a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, k<Z> kVar) {
        this.f166164a.add(new a<>(cls, kVar));
    }

    public synchronized <Z> k<Z> b(Class<Z> cls) {
        int size = this.f166164a.size();
        for (int i15 = 0; i15 < size; i15++) {
            a<?> aVar = this.f166164a.get(i15);
            if (aVar.a(cls)) {
                return (k<Z>) aVar.f166166b;
            }
        }
        return null;
    }
}
