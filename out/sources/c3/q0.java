package c3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc3/q0;", "K", "V", "Lc3/r0;", "", "", "Lc3/h0;", "map", "", "", "iterator", "<init>", "(Lc3/h0;Ljava/util/Iterator;)V", "h", "()Ljava/util/Map$Entry;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q0<K, V> extends r0<K, V> implements Iterator<Map.Entry<K, V>>, gr.a {

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"c3/q0$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "b", "getValue", "(Ljava/lang/Object;)V", "value", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Map.Entry<K, V>, gr.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private V value;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0<K, V> f22895c;

        a(q0<K, V> q0Var) {
            this.f22895c = q0Var;
            this.key = q0Var.e().getKey();
            this.value = q0Var.e().getValue();
        }

        public void a(V v15) {
            this.value = v15;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            q0<K, V> q0Var = this.f22895c;
            if (q0Var.f().f() != ((r0) q0Var).modification) {
                throw new ConcurrentModificationException();
            }
            V v15 = (V) getValue();
            q0Var.f().put(getKey(), newValue);
            a(newValue);
            return v15;
        }
    }

    public q0(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        d();
        if (e() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
