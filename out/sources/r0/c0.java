package r0;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"¨\u0006/"}, d2 = {"Lr0/c0;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "g", "(Ljava/lang/Object;Ljava/lang/Object;)I", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Loq/i0;", "j", "f", "", "evicted", "oldValue", "newValue", "b", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "i", "c", "()V", "h", "()I", "", "toString", "()Ljava/lang/String;", "I", "Ls0/c;", "Ls0/c;", "map", "Ls0/b;", "Ls0/b;", "lock", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class c0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0.c<K, V> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s0.b lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int putCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int createCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int evictionCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int missCount;

    public c0(int i15) {
        this.maxSize = i15;
        if (!(i15 > 0)) {
            s0.d.a("maxSize <= 0");
        }
        this.map = new s0.c<>(0, 0.75f);
        this.lock = new s0.b();
    }

    private final int g(K key, V value) {
        int i15 = i(key, value);
        if (!(i15 >= 0)) {
            s0.d.b("Negative size: " + key + '=' + value);
        }
        return i15;
    }

    protected V a(K key) {
        return null;
    }

    protected void b(boolean evicted, K key, V oldValue, V newValue) {
    }

    public final void c() {
        j(-1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V d(K key) {
        V v15;
        synchronized (this.lock) {
            V vA = this.map.a(key);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vA2 = a(key);
            if (vA2 == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v15 = (V) this.map.d(key, vA2);
                    if (v15 != null) {
                        this.map.d(key, v15);
                    } else {
                        this.size += g(key, vA2);
                        oq.i0 i0Var = oq.i0.f148189a;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (v15 != null) {
                b(false, key, vA2, v15);
                return v15;
            }
            j(this.maxSize);
            return vA2;
        }
    }

    public final V e(K key, V value) {
        V vD;
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += g(key, value);
                vD = this.map.d(key, value);
                if (vD != null) {
                    this.size -= g(key, vD);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (vD != null) {
            b(false, key, vD, value);
        }
        j(this.maxSize);
        return vD;
    }

    public final V f(K key) {
        V vE;
        synchronized (this.lock) {
            try {
                vE = this.map.e(key);
                if (vE != null) {
                    this.size -= g(key, vE);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (vE != null) {
            b(false, key, vE, null);
        }
        return vE;
    }

    public final int h() {
        int i15;
        synchronized (this.lock) {
            i15 = this.size;
        }
        return i15;
    }

    protected int i(K key, V value) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(int maxSize) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.c() || this.size == 0))) {
                        s0.d.b("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= maxSize || this.map.c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) pq.v.m0(this.map.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.e((K) key);
                    this.size -= g(key, value);
                    this.evictionCount++;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            b(true, key, value, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i15 = this.hitCount;
                int i16 = this.missCount + i15;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i16 != 0 ? (i15 * 100) / i16 : 0) + "%]";
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return str;
    }
}
