package c3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lc3/a0;", "K", "V", "Lc3/z;", "Lc3/h0;", "map", "<init>", "(Lc3/h0;)V", "element", "", "g", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "h", "(Ljava/util/Collection;)Ljava/lang/Void;", "Lc3/t0;", "i", "()Lc3/t0;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a0<K, V> extends z<K, V, V> {
    public a0(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) g(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return e().containsValue(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Collection<?> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!e().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void g(V element) {
        i0.b();
        throw new oq.g();
    }

    public Void h(Collection<? extends V> elements) {
        i0.b();
        throw new oq.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public t0<K, V> iterator() {
        return new t0<>(e(), ((t2.d) e().g().j().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return e().m(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        t2.f<K, V> fVarJ;
        int modification;
        l lVarC;
        boolean zB;
        Set setK1 = pq.v.k1(elements);
        SnapshotStateMap<K, V> snapshotStateMapE = e();
        boolean z15 = false;
        do {
            synchronized (i0.f22824a) {
                SnapshotStateMap.a aVar = (SnapshotStateMap.a) w.I((SnapshotStateMap.a) snapshotStateMapE.getFirstStateRecord());
                fVarJ = aVar.j();
                modification = aVar.getModification();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            for (Map.Entry<K, V> entry : snapshotStateMapE.entrySet()) {
                if (setK1.contains(entry.getValue())) {
                    aVarBuilder2.remove(entry.getKey());
                    z15 = true;
                }
            }
            oq.i0 i0Var2 = oq.i0.f148189a;
            t2.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (fr.t.c(fVarBuild2, fVarJ)) {
                break;
            }
            SnapshotStateMap.a aVar2 = (SnapshotStateMap.a) snapshotStateMapE.getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zB = snapshotStateMapE.b((SnapshotStateMap.a) w.n0(aVar2, snapshotStateMapE, lVarC), modification, fVarBuild2);
            }
            w.V(lVarC, snapshotStateMapE);
        } while (!zB);
        return z15;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        t2.f<K, V> fVarJ;
        int modification;
        l lVarC;
        boolean zB;
        Set setK1 = pq.v.k1(elements);
        SnapshotStateMap<K, V> snapshotStateMapE = e();
        boolean z15 = false;
        do {
            synchronized (i0.f22824a) {
                SnapshotStateMap.a aVar = (SnapshotStateMap.a) w.I((SnapshotStateMap.a) snapshotStateMapE.getFirstStateRecord());
                fVarJ = aVar.j();
                modification = aVar.getModification();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            for (Map.Entry<K, V> entry : snapshotStateMapE.entrySet()) {
                if (!setK1.contains(entry.getValue())) {
                    aVarBuilder2.remove(entry.getKey());
                    z15 = true;
                }
            }
            oq.i0 i0Var2 = oq.i0.f148189a;
            t2.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (fr.t.c(fVarBuild2, fVarJ)) {
                break;
            }
            SnapshotStateMap.a aVar2 = (SnapshotStateMap.a) snapshotStateMapE.getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zB = snapshotStateMapE.b((SnapshotStateMap.a) w.n0(aVar2, snapshotStateMapE, lVarC), modification, fVarBuild2);
            }
            w.V(lVarC, snapshotStateMapE);
        } while (!zB);
        return z15;
    }
}
