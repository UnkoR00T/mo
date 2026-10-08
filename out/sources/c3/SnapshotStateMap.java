package c3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: c3.h0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0006J!\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b)\u0010\u0018R$\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R,\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R \u00106\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b5\u00103R \u0010;\u001a\b\u0012\u0004\u0012\u00028\u0001078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lc3/h0;", "K", "V", "Lc3/u0;", "", "<init>", "()V", "Lc3/h0$a;", "", "currentModification", "Lt2/f;", "newMap", "", "b", "(Lc3/h0$a;ILt2/f;)Z", "c", "(Lc3/h0$a;Lt2/f;)I", "Lc3/w0;", "value", "Loq/i0;", "l", "(Lc3/w0;)V", "key", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "m", "a", "Lc3/w0;", "k", "()Lc3/w0;", "firstStateRecord", "", "", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "entries", "e", "keys", "", "Ljava/util/Collection;", "i", "()Ljava/util/Collection;", "values", "h", "()I", "size", "f", "modification", "g", "()Lc3/h0$a;", "getReadable$runtime$annotations", "readable", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateMap<K, V> implements u0, Map<K, V>, gr.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private w0 firstStateRecord;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<Map.Entry<K, V>> entries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<K> keys;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Collection<V> values;

    /* JADX INFO: renamed from: c3.h0$a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lc3/h0$a;", "K", "V", "Lc3/w0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lt2/f;", "map", "<init>", "(JLt2/f;)V", "value", "Loq/i0;", "c", "(Lc3/w0;)V", "d", "()Lc3/w0;", "e", "(J)Lc3/w0;", "Lt2/f;", "j", "()Lt2/f;", "l", "(Lt2/f;)V", "", "I", "k", "()I", "m", "(I)V", "modification", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<K, V> extends w0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private t2.f<K, ? extends V> map;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int modification;

        public a(long j15, t2.f<K, ? extends V> fVar) {
            super(j15);
            this.map = fVar;
        }

        @Override // c3.w0
        public void c(w0 value) {
            a aVar = (a) value;
            synchronized (i0.f22824a) {
                this.map = aVar.map;
                this.modification = aVar.modification;
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }

        @Override // c3.w0
        public w0 d() {
            return new a(w.K().getSnapshotId(), this.map);
        }

        @Override // c3.w0
        public w0 e(long snapshotId) {
            return new a(snapshotId, this.map);
        }

        public final t2.f<K, V> j() {
            return this.map;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void l(t2.f<K, ? extends V> fVar) {
            this.map = fVar;
        }

        public final void m(int i15) {
            this.modification = i15;
        }
    }

    public SnapshotStateMap() {
        t2.f fVarA = t2.a.a();
        l lVarK = w.K();
        a aVar = new a(lVarK.getSnapshotId(), fVarA);
        if (!(lVarK instanceof b)) {
            aVar.h(new a(r.c(1), fVarA));
        }
        this.firstStateRecord = aVar;
        this.entries = new x(this);
        this.keys = new y(this);
        this.values = new a0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(a<K, V> aVar, int i15, t2.f<K, ? extends V> fVar) {
        boolean z15;
        synchronized (i0.f22824a) {
            if (aVar.getModification() == i15) {
                aVar.l(fVar);
                z15 = true;
                aVar.m(aVar.getModification() + 1);
            } else {
                z15 = false;
            }
        }
        return z15;
    }

    private final int c(a<K, V> aVar, t2.f<K, ? extends V> fVar) {
        int modification;
        synchronized (i0.f22824a) {
            aVar.l(fVar);
            modification = aVar.getModification();
            aVar.m(modification + 1);
        }
        return modification;
    }

    @Override // java.util.Map
    public void clear() {
        l lVarC;
        a aVar = (a) w.I((a) getFirstStateRecord());
        aVar.j();
        t2.f<K, ? extends V> fVarA = t2.a.a();
        if (fVarA != aVar.j()) {
            a aVar2 = (a) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                c((a) w.n0(aVar2, this, lVarC), fVarA);
            }
            w.V(lVarC, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return g().j().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return g().j().containsValue(value);
    }

    public Set<Map.Entry<K, V>> d() {
        return this.entries;
    }

    public Set<K> e() {
        return this.keys;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    public final int f() {
        return g().getModification();
    }

    public final a<K, V> g() {
        return (a) w.c0((a) getFirstStateRecord(), this);
    }

    @Override // java.util.Map
    public V get(Object key) {
        return g().j().get(key);
    }

    public int h() {
        return g().j().size();
    }

    public Collection<V> i() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return g().j().isEmpty();
    }

    @Override // c3.u0
    /* JADX INFO: renamed from: k, reason: from getter */
    public w0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
    }

    @Override // c3.u0
    public void l(w0 value) {
        this.firstStateRecord = (a) value;
    }

    public final boolean m(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((Map.Entry) next).getValue(), value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        t2.f<K, V> fVarJ;
        int modification;
        V vPut;
        l lVarC;
        boolean zB;
        do {
            synchronized (i0.f22824a) {
                a aVar = (a) w.I((a) getFirstStateRecord());
                fVarJ = aVar.j();
                modification = aVar.getModification();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            vPut = aVarBuilder2.put(key, value);
            t2.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (fr.t.c(fVarBuild2, fVarJ)) {
                break;
            }
            a aVar2 = (a) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zB = b((a) w.n0(aVar2, this, lVarC), modification, fVarBuild2);
            }
            w.V(lVarC, this);
        } while (!zB);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        t2.f<K, V> fVarJ;
        int modification;
        l lVarC;
        boolean zB;
        do {
            synchronized (i0.f22824a) {
                a aVar = (a) w.I((a) getFirstStateRecord());
                fVarJ = aVar.j();
                modification = aVar.getModification();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            aVarBuilder2.putAll(from);
            t2.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (fr.t.c(fVarBuild2, fVarJ)) {
                return;
            }
            a aVar2 = (a) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zB = b((a) w.n0(aVar2, this, lVarC), modification, fVarBuild2);
            }
            w.V(lVarC, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public V remove(Object key) {
        t2.f<K, V> fVarJ;
        int modification;
        V vRemove;
        l lVarC;
        boolean zB;
        do {
            synchronized (i0.f22824a) {
                a aVar = (a) w.I((a) getFirstStateRecord());
                fVarJ = aVar.j();
                modification = aVar.getModification();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            vRemove = aVarBuilder2.remove(key);
            t2.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (fr.t.c(fVarBuild2, fVarJ)) {
                break;
            }
            a aVar2 = (a) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zB = b((a) w.n0(aVar2, this, lVarC), modification, fVarBuild2);
            }
            w.V(lVarC, this);
        } while (!zB);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    public String toString() {
        return "SnapshotStateMap(value=" + ((a) w.I((a) getFirstStateRecord())).j() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
