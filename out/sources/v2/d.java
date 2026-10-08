package v2;

import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001.B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lv2/d;", "K", "V", "Lpq/f;", "Lt2/f;", "Lv2/t;", "node", "", "size", "<init>", "(Lv2/t;I)V", "Lt2/d;", "", "n", "()Lt2/d;", "", "d", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Lv2/d;", "s", "(Ljava/lang/Object;)Lv2/d;", "Lv2/f;", "m", "()Lv2/f;", "b", "Lv2/t;", "p", "()Lv2/t;", "c", "I", "f", "()I", "o", "keys", "Lt2/b;", "q", "()Lt2/b;", "values", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d<K, V> extends pq.f<K, V> implements t2.f<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f203276e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f203277f = new d(t.INSTANCE.a(), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t<K, V> node;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: v2.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv2/d$a;", "", "<init>", "()V", "K", "V", "Lv2/d;", "a", "()Lv2/d;", "", "EMPTY", "Lv2/d;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final <K, V> d<K, V> a() {
            return d.f203277f;
        }

        private Companion() {
        }
    }

    public d(t<K, V> tVar, int i15) {
        this.node = tVar;
        this.size = i15;
    }

    private final t2.d<Map.Entry<K, V>> n() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // pq.f
    public final Set<Map.Entry<K, V>> d() {
        return n();
    }

    @Override // pq.f
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Map
    public V get(Object key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // t2.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder2() {
        return new f<>(this);
    }

    @Override // pq.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public t2.d<K> e() {
        return new p(this);
    }

    public final t<K, V> p() {
        return this.node;
    }

    @Override // pq.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public t2.b<V> g() {
        return new r(this);
    }

    public d<K, V> r(K key, V value) {
        t.b<K, V> bVarP = this.node.P(key != null ? key.hashCode() : 0, key, value, 0);
        return bVarP == null ? this : new d<>(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    public d<K, V> s(K key) {
        t<K, V> tVarQ = this.node.Q(key != null ? key.hashCode() : 0, key, 0);
        if (this.node == tVarQ) {
            return this;
        }
        return tVarQ == null ? INSTANCE.a() : new d<>(tVarQ, size() - 1);
    }
}
