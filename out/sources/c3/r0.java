package c3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0011\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&¨\u0006+"}, d2 = {"Lc3/r0;", "K", "V", "", "Lc3/h0;", "map", "", "", "iterator", "<init>", "(Lc3/h0;Ljava/util/Iterator;)V", "Loq/i0;", "remove", "()V", "", "hasNext", "()Z", "d", "a", "Lc3/h0;", "f", "()Lc3/h0;", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "c", "I", "getModification", "()I", "setModification", "(I)V", "modification", "Ljava/util/Map$Entry;", "e", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "current", "g", "setNext", "next", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class r0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateMap<K, V> map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Iterator<Map.Entry<K, V>> iterator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Map.Entry<? extends K, ? extends V> current;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.f();
        d();
    }

    protected final void d() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    protected final Map.Entry<K, V> e() {
        return this.current;
    }

    public final SnapshotStateMap<K, V> f() {
        return this.map;
    }

    protected final Map.Entry<K, V> g() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    public final void remove() {
        if (f().f() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.current;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.map.remove(entry.getKey());
        this.current = null;
        oq.i0 i0Var = oq.i0.f148189a;
        this.modification = f().f();
    }
}
