package c3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lc3/x;", "K", "V", "Lc3/z;", "", "Lc3/h0;", "map", "<init>", "(Lc3/h0;)V", "element", "", "g", "(Ljava/util/Map$Entry;)Ljava/lang/Void;", "", "elements", "h", "(Ljava/util/Collection;)Ljava/lang/Void;", "", "iterator", "()Ljava/util/Iterator;", "", "k", "(Ljava/util/Map$Entry;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "i", "containsAll", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x<K, V> extends z<K, V, Map.Entry<K, V>> {
    public x(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) g((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (fr.w0.q(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Collection<?> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void g(Map.Entry<K, V> element) {
        i0.b();
        throw new oq.g();
    }

    public Void h(Collection<? extends Map.Entry<K, V>> elements) {
        i0.b();
        throw new oq.g();
    }

    public boolean i(Map.Entry<K, V> element) {
        return fr.t.c(e().get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new q0(e(), ((t2.d) e().g().j().entrySet()).iterator());
    }

    public boolean k(Map.Entry<K, V> element) {
        return e().remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (fr.w0.q(obj)) {
            return k((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        Iterator<?> it = elements.iterator();
        while (true) {
            boolean z15 = false;
            while (it.hasNext()) {
                if (e().remove(((Map.Entry) it.next()).getKey()) != null || z15) {
                    z15 = true;
                }
            }
            return z15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        t2.f<K, V> fVarJ;
        int modification;
        l lVarC;
        boolean zB;
        Collection<?> collection = elements;
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(collection, 10)), 16));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            oq.r rVarA = oq.y.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
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
            for (Map.Entry<K, V> entry2 : snapshotStateMapE.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !fr.t.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder2.remove(entry2.getKey());
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
