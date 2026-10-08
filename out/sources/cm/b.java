package cm;

import bm.b;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface b<T extends bm.b> {
    Collection<T> a();

    boolean c(Collection<T> collection);

    void d();

    Set<? extends bm.a<T>> f(float f15);

    int g();

    void lock();

    void unlock();
}
