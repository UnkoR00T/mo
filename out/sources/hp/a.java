package hp;

import bp.i;
import bp.j;
import bp.k;
import bp.l;
import bp.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public class a<E> implements List<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.a f86136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<E> f86137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f86138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bp.d f86139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f86140e;

    public a() {
        this.f86138c = false;
        this.f86136a = new bp.a();
        this.f86137b = new ArrayList();
    }

    public static List<String> e(bp.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            arrayList.add(((p) aVar.k4(i15)).J3());
        }
        return new a(arrayList, aVar);
    }

    public static List<Float> f(bp.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(aVar.size());
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            bp.b bVarK4 = aVar.k4(i15);
            if (bVarK4 instanceof k) {
                arrayList.add(Float.valueOf(((k) bVarK4).i3()));
            } else {
                arrayList.add(null);
            }
        }
        return new a(arrayList, aVar);
    }

    public static List<Integer> g(bp.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            arrayList.add(Integer.valueOf(((k) (aVar.g4(i15) instanceof l ? ((l) aVar.g4(i15)).X3() : aVar.g4(i15))).J3()));
        }
        return new a(arrayList, aVar);
    }

    public static bp.a h(List<?> list) {
        if (list == null) {
            return null;
        }
        if (list instanceof a) {
            return ((a) list).f86136a;
        }
        bp.a aVar = new bp.a();
        for (Object obj : list) {
            if (obj instanceof String) {
                aVar.A3(new p((String) obj));
            } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                aVar.A3(bp.h.g4(((Number) obj).longValue()));
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                aVar.A3(new bp.f(((Number) obj).floatValue()));
            } else if (obj instanceof c) {
                aVar.A3(((c) obj).D1());
            } else {
                if (obj != null) {
                    throw new IllegalArgumentException("Error: Don't know how to convert type to COSBase '" + obj.getClass().getName() + "'");
                }
                aVar.A3(j.f20954c);
            }
        }
        return aVar;
    }

    private List<bp.b> i(Collection<?> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof String) {
                arrayList.add(new p((String) obj));
            } else {
                arrayList.add(((c) obj).D1());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean add(E e15) {
        bp.d dVar = this.f86139d;
        if (dVar != null) {
            dVar.Y4(this.f86140e, this.f86136a);
            this.f86139d = null;
        }
        if (e15 instanceof String) {
            this.f86136a.A3(new p((String) e15));
        } else {
            bp.a aVar = this.f86136a;
            if (aVar != null) {
                aVar.A3(((c) e15).D1());
            }
        }
        return this.f86137b.add(e15);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (this.f86138c) {
            throw new UnsupportedOperationException("Adding to a filtered List is not permitted");
        }
        if (this.f86139d != null && collection.size() > 0) {
            this.f86139d.Y4(this.f86140e, this.f86136a);
            this.f86139d = null;
        }
        this.f86136a.X3(i(collection));
        return this.f86137b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        bp.d dVar = this.f86139d;
        if (dVar != null) {
            dVar.Y4(this.f86140e, null);
        }
        this.f86137b.clear();
        this.f86136a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f86137b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f86137b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f86137b.equals(obj);
    }

    @Override // java.util.List
    public E get(int i15) {
        return this.f86137b.get(i15);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f86137b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f86137b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f86137b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f86137b.iterator();
    }

    @Deprecated
    public bp.a j() {
        return this.f86136a;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f86137b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f86137b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        if (this.f86138c) {
            throw new UnsupportedOperationException("removing entries from a filtered List is not permitted");
        }
        int iIndexOf = this.f86137b.indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        this.f86137b.remove(iIndexOf);
        this.f86136a.m4(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            bp.b bVarD1 = ((c) it.next()).D1();
            for (int size = this.f86136a.size() - 1; size >= 0; size--) {
                if (bVarD1.equals(this.f86136a.k4(size))) {
                    this.f86136a.m4(size);
                }
            }
        }
        return this.f86137b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            bp.b bVarD1 = ((c) it.next()).D1();
            for (int size = this.f86136a.size() - 1; size >= 0; size--) {
                if (!bVarD1.equals(this.f86136a.k4(size))) {
                    this.f86136a.m4(size);
                }
            }
        }
        return this.f86137b.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public E set(int i15, E e15) {
        if (this.f86138c) {
            throw new UnsupportedOperationException("Replacing an element in a filtered List is not permitted");
        }
        if (e15 instanceof String) {
            p pVar = new p((String) e15);
            bp.d dVar = this.f86139d;
            if (dVar != null && i15 == 0) {
                dVar.Y4(this.f86140e, pVar);
            }
            this.f86136a.p4(i15, pVar);
        } else {
            bp.d dVar2 = this.f86139d;
            if (dVar2 != null && i15 == 0) {
                dVar2.Y4(this.f86140e, ((c) e15).D1());
            }
            this.f86136a.p4(i15, ((c) e15).D1());
        }
        return this.f86137b.set(i15, e15);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f86137b.size();
    }

    @Override // java.util.List
    public List<E> subList(int i15, int i16) {
        return this.f86137b.subList(i15, i16);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f86137b.toArray();
    }

    public String toString() {
        return "COSArrayList{" + this.f86136a.toString() + "}";
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i15) {
        return this.f86137b.listIterator(i15);
    }

    @Override // java.util.List, java.util.Collection
    public <X> X[] toArray(X[] xArr) {
        return (X[]) this.f86137b.toArray(xArr);
    }

    public a(List<E> list, bp.a aVar) {
        this.f86138c = false;
        this.f86137b = list;
        this.f86136a = aVar;
        if (list.size() != aVar.size()) {
            this.f86138c = true;
        }
    }

    @Override // java.util.List
    public E remove(int i15) {
        if (!this.f86138c) {
            this.f86136a.m4(i15);
            return this.f86137b.remove(i15);
        }
        throw new UnsupportedOperationException("removing entries from a filtered List is not permitted");
    }

    @Override // java.util.List
    public boolean addAll(int i15, Collection<? extends E> collection) {
        if (!this.f86138c) {
            if (this.f86139d != null && collection.size() > 0) {
                this.f86139d.Y4(this.f86140e, this.f86136a);
                this.f86139d = null;
            }
            this.f86136a.N3(i15, i(collection));
            return this.f86137b.addAll(i15, collection);
        }
        throw new UnsupportedOperationException("Inserting to a filtered List is not permitted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public void add(int i15, E e15) {
        if (!this.f86138c) {
            bp.d dVar = this.f86139d;
            if (dVar != null) {
                dVar.Y4(this.f86140e, this.f86136a);
                this.f86139d = null;
            }
            this.f86137b.add(i15, e15);
            if (e15 instanceof String) {
                this.f86136a.i3(i15, new p((String) e15));
                return;
            } else {
                this.f86136a.i3(i15, ((c) e15).D1());
                return;
            }
        }
        throw new UnsupportedOperationException("Adding an element in a filtered List is not permitted");
    }

    public a(bp.d dVar, i iVar) {
        this.f86138c = false;
        this.f86136a = new bp.a();
        this.f86137b = new ArrayList();
        this.f86139d = dVar;
        this.f86140e = iVar;
    }

    public a(E e15, bp.b bVar, bp.d dVar, i iVar) {
        this.f86138c = false;
        bp.a aVar = new bp.a();
        this.f86136a = aVar;
        aVar.A3(bVar);
        ArrayList arrayList = new ArrayList();
        this.f86137b = arrayList;
        arrayList.add(e15);
        this.f86139d = dVar;
        this.f86140e = iVar;
    }
}
