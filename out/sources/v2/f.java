package v2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import x2.DeltaCounter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010>\u001a\u0002062\u0006\u0010\u0011\u001a\u0002068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b(\u00109\"\u0004\b=\u0010;R&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010E¨\u0006G"}, d2 = {"Lv2/f;", "K", "V", "Lt2/f$a;", "Lpq/i;", "Lv2/d;", "map", "<init>", "(Lv2/d;)V", "e", "()Lv2/d;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Loq/i0;", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "a", "Lv2/d;", "Lx2/e;", "b", "Lx2/e;", "h", "()Lx2/e;", "l", "(Lx2/e;)V", "ownership", "Lv2/t;", "c", "Lv2/t;", "g", "()Lv2/t;", "setNode$runtime", "(Lv2/t;)V", "node", "d", "Ljava/lang/Object;", "getOperationResult$runtime", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "operationResult", "", "I", "f", "()I", "i", "(I)V", "modCount", "m", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f<K, V> extends pq.i<K, V> implements t2.f.a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d<K, V> map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private x2.e ownership = new x2.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t<K, V> node;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V operationResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int size;

    public f(d<K, V> dVar) {
        this.map = dVar;
        this.node = this.map.p();
        this.size = this.map.size();
    }

    @Override // pq.i
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // pq.i
    public Set<K> b() {
        return new j(this);
    }

    @Override // pq.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.node = t.INSTANCE.a();
        m(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // pq.i
    public Collection<V> d() {
        return new l(this);
    }

    @Override // t2.f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d<K, V> build2() {
        d<K, V> dVar;
        if (this.node == this.map.p()) {
            dVar = this.map;
        } else {
            this.ownership = new x2.e();
            dVar = new d<>(this.node, size());
        }
        this.map = dVar;
        return dVar;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    public final t<K, V> g() {
        return this.node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final x2.e getOwnership() {
        return this.ownership;
    }

    public final void i(int i15) {
        this.modCount = i15;
    }

    public final void k(V v15) {
        this.operationResult = v15;
    }

    protected final void l(x2.e eVar) {
        this.ownership = eVar;
    }

    public void m(int i15) {
        this.size = i15;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.D(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        d<K, V> dVarBuild = from instanceof d ? (d) from : null;
        if (dVarBuild == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVarBuild = fVar != null ? fVar.build2() : null;
        }
        if (dVarBuild == null) {
            super.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        this.node = this.node.E(dVarBuild.p(), 0, deltaCounter, this);
        int size2 = (dVarBuild.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            m(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object key) {
        this.operationResult = null;
        t tVarG = this.node.G(key != null ? key.hashCode() : 0, key, 0, this);
        if (tVarG == null) {
            tVarG = t.INSTANCE.a();
        }
        this.node = tVarG;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        t tVarH = this.node.H(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (tVarH == null) {
            tVarH = t.INSTANCE.a();
        }
        this.node = tVarH;
        return size != size();
    }
}
