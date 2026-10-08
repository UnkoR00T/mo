package ed;

import java.util.Iterator;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0007J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u0007R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Led/u;", "", "K", "V", "", "maxSize", "<init>", "(J)V", "g", "()J", "key", "value", "i", "(Ljava/lang/Object;Ljava/lang/Object;)J", "k", "oldValue", "newValue", "Loq/i0;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "size", "l", "a", "()V", "", "Ljava/util/Map;", "map", "J", "d", "j", "e", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class u<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<K, V> map = c.b(0, 0.0f, 3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long size;

    public u(long j15) {
        this.maxSize = j15;
        if (j15 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long g() {
        Iterator<T> it = this.map.entrySet().iterator();
        long jI = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jI += i(entry.getKey(), entry.getValue());
        }
        return jI;
    }

    private final long i(K key, V value) throws Exception {
        try {
            long jK = k(key, value);
            if (jK >= 0) {
                return jK;
            }
            throw new IllegalStateException(("sizeOf(" + key + ", " + value + ") returned a negative value: " + jK).toString());
        } catch (Exception e15) {
            this.size = -1L;
            throw e15;
        }
    }

    public final void a() {
        l(-1L);
    }

    public void b(K key, V oldValue, V newValue) {
        throw null;
    }

    public final V c(K key) {
        return this.map.get(key);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMaxSize() {
        return this.maxSize;
    }

    public final long e() {
        if (this.size == -1) {
            this.size = g();
        }
        return this.size;
    }

    public final V f(K key, V value) {
        V vPut = this.map.put(key, value);
        this.size = e() + i(key, value);
        if (vPut != null) {
            this.size = e() - i(key, vPut);
            b(key, vPut, value);
        }
        l(this.maxSize);
        return vPut;
    }

    public final V h(K key) {
        V vRemove = this.map.remove(key);
        if (vRemove != null) {
            this.size = e() - i(key, vRemove);
            b(key, vRemove, null);
        }
        return vRemove;
    }

    public final void j(long j15) {
        this.maxSize = j15;
        l(j15);
    }

    public long k(K key, V value) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(long size) {
        while (e() > size) {
            if (this.map.isEmpty()) {
                if (e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) pq.v.k0(this.map.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.map.remove(key);
            this.size = e() - i(key, value);
            b(key, value, null);
        }
    }
}
