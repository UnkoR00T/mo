package zt;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<K, V> implements Iterable<V>, gr.a {

    /* JADX INFO: renamed from: zt.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC6406a<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f237201a;

        public AbstractC6406a(int i15) {
            this.f237201a = i15;
        }

        protected final T c(a<K, V> aVar) {
            return aVar.e().get(this.f237201a);
        }
    }

    protected abstract c<V> e();

    protected abstract z<K, V> f();

    protected abstract void g(String str, V v15);

    protected final void h(mr.c<? extends K> cVar, V v15) {
        g(cVar.C(), v15);
    }

    public final boolean isEmpty() {
        return e().e() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return e().iterator();
    }
}
