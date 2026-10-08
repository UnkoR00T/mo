package ak;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface h1<E> extends Collection<E> {

    public interface a<E> {
        E b();

        int getCount();
    }

    Set<a<E>> entrySet();

    int l3(Object obj);

    @Override // java.util.Collection
    int size();

    Set<E> y2();
}
