package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<j1<K, V>.d> f12014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<K, V> f12015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile j1<K, V>.f f12017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<K, V> f12018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile j1<K, V>.c f12019f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.j1
        public void q() {
            if (!p()) {
                for (int i15 = 0; i15 < l(); i15++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i15);
                    if (((t.b) entryK.getKey()).C()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((t.b) entry.getKey()).C()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    private class c extends j1<K, V>.f {
        private c() {
            super(j1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.j1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }

        /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry<K, V>, Comparable<j1<K, V>.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f12024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f12025b;

        d(j1 j1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean e(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(j1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e(this.f12024a, entry.getKey()) && e(this.f12025b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f12024a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12025b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k15 = this.f12024a;
            int iHashCode = k15 == null ? 0 : k15.hashCode();
            V v15 = this.f12025b;
            return iHashCode ^ (v15 != null ? v15.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            j1.this.g();
            V v16 = this.f12025b;
            this.f12025b = v15;
            return v16;
        }

        public String toString() {
            return this.f12024a + "=" + this.f12025b;
        }

        d(K k15, V v15) {
            this.f12024a = k15;
            this.f12025b = v15;
        }
    }

    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            j1.this.s(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j1.this.size();
        }

        /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ j1(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int f(K k15) {
        int i15;
        int i16;
        int i17;
        int iCompareTo;
        int size = this.f12014a.size();
        int i18 = size - 1;
        if (i18 < 0) {
            i15 = 0;
            while (i15 <= i18) {
                i17 = (i15 + i18) / 2;
                iCompareTo = k15.compareTo(this.f12014a.get(i17).getKey());
                if (iCompareTo < 0) {
                    i18 = i17 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i17;
                    }
                    i15 = i17 + 1;
                }
            }
            i16 = i15 + 1;
        } else {
            int iCompareTo2 = k15.compareTo(this.f12014a.get(i18).getKey());
            if (iCompareTo2 > 0) {
                i16 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i18;
                }
                i15 = 0;
                while (i15 <= i18) {
                    i17 = (i15 + i18) / 2;
                    iCompareTo = k15.compareTo(this.f12014a.get(i17).getKey());
                    if (iCompareTo < 0) {
                        i18 = i17 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i17;
                        }
                        i15 = i17 + 1;
                    }
                }
                i16 = i15 + 1;
            }
        }
        return -i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f12016c) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f12014a.isEmpty() || (this.f12014a instanceof ArrayList)) {
            return;
        }
        this.f12014a = new ArrayList(16);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f12015b.isEmpty() && !(this.f12015b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12015b = treeMap;
            this.f12018e = treeMap.descendingMap();
        }
        return (SortedMap) this.f12015b;
    }

    static <FieldDescriptorType extends t.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i15) {
        g();
        V value = this.f12014a.remove(i15).getValue();
        if (!this.f12015b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f12014a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f12014a.isEmpty()) {
            this.f12014a.clear();
        }
        if (this.f12015b.isEmpty()) {
            return;
        }
        this.f12015b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f12015b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f12017d == null) {
            this.f12017d = new f(this, null);
        }
        return this.f12017d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != j1Var.l()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i15 = 0; i15 < iL; i15++) {
            if (!k(i15).equals(j1Var.k(i15))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f12015b.equals(j1Var.f12015b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f12014a.get(iF).getValue() : this.f12015b.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f12019f == null) {
            this.f12019f = new c(this, null);
        }
        return this.f12019f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i15 = 0; i15 < iL; i15++) {
            iHashCode += this.f12014a.get(i15).hashCode();
        }
        return m() > 0 ? iHashCode + this.f12015b.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> k(int i15) {
        return this.f12014a.get(i15);
    }

    public int l() {
        return this.f12014a.size();
    }

    public int m() {
        return this.f12015b.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f12015b.isEmpty() ? Collections.EMPTY_SET : this.f12015b.entrySet();
    }

    public boolean p() {
        return this.f12016c;
    }

    public void q() {
        if (this.f12016c) {
            return;
        }
        this.f12015b = this.f12015b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f12015b);
        this.f12018e = this.f12018e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f12018e);
        this.f12016c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return t(iF);
        }
        if (this.f12015b.isEmpty()) {
            return null;
        }
        return this.f12015b.remove(comparable);
    }

    public V s(K k15, V v15) {
        g();
        int iF = f(k15);
        if (iF >= 0) {
            return this.f12014a.get(iF).setValue(v15);
        }
        i();
        int i15 = -(iF + 1);
        if (i15 >= 16) {
            return o().put(k15, v15);
        }
        if (this.f12014a.size() == 16) {
            j1<K, V>.d dVarRemove = this.f12014a.remove(15);
            o().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f12014a.add(i15, new d(k15, v15));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12014a.size() + this.f12015b.size();
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f12021b;

        private b() {
            this.f12020a = j1.this.f12014a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f12021b == null) {
                this.f12021b = j1.this.f12018e.entrySet().iterator();
            }
            return this.f12021b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = j1.this.f12014a;
            int i15 = this.f12020a - 1;
            this.f12020a = i15;
            return (Map.Entry) list.get(i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i15 = this.f12020a;
            return (i15 > 0 && i15 <= j1.this.f12014a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f12029c;

        private e() {
            this.f12027a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f12029c == null) {
                this.f12029c = j1.this.f12015b.entrySet().iterator();
            }
            return this.f12029c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f12028b = true;
            int i15 = this.f12027a + 1;
            this.f12027a = i15;
            return i15 < j1.this.f12014a.size() ? (Map.Entry) j1.this.f12014a.get(this.f12027a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12027a + 1 < j1.this.f12014a.size() || (!j1.this.f12015b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f12028b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f12028b = false;
            j1.this.g();
            if (this.f12027a >= j1.this.f12014a.size()) {
                a().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i15 = this.f12027a;
            this.f12027a = i15 - 1;
            j1Var.t(i15);
        }

        /* synthetic */ e(j1 j1Var, a aVar) {
            this();
        }
    }

    private j1() {
        this.f12014a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f12015b = map;
        this.f12018e = map;
    }
}
