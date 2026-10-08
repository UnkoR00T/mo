package bt;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<v<K, V>.c> f21482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f21483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile v<K, V>.e f21485e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    static class a<FieldDescriptorType> extends v<FieldDescriptorType, Object> {
        a(int i15) {
            super(i15, null);
        }

        @Override // bt.v
        public void n() {
            if (!m()) {
                for (int i15 = 0; i15 < i(); i15++) {
                    Map.Entry<FieldDescriptorType, Object> entryH = h(i15);
                    if (((h.b) entryH.getKey()).C()) {
                        entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : k()) {
                    if (((h.b) entry.getKey()).C()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((h.b) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f21486a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f21487b = new C0559b();

        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: bt.v$b$b, reason: collision with other inner class name */
        static class C0559b implements Iterable<Object> {
            C0559b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f21486a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f21487b;
        }
    }

    private class c implements Comparable<v<K, V>.c>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f21488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f21489b;

        c(v vVar, Map.Entry<K, V> entry) {
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
        public int compareTo(v<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
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
            return e(this.f21488a, entry.getKey()) && e(this.f21489b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f21488a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f21489b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k15 = this.f21488a;
            int iHashCode = k15 == null ? 0 : k15.hashCode();
            V v15 = this.f21489b;
            return iHashCode ^ (v15 != null ? v15.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            v.this.f();
            V v16 = this.f21489b;
            this.f21489b = v15;
            return v16;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f21488a);
            String strValueOf2 = String.valueOf(this.f21489b);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb5.append(strValueOf);
            sb5.append("=");
            sb5.append(strValueOf2);
            return sb5.toString();
        }

        c(K k15, V v15) {
            this.f21488a = k15;
            this.f21489b = v15;
        }
    }

    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = v.this.get(entry.getKey());
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
            v.this.p(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            v.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.size();
        }

        /* synthetic */ e(v vVar, a aVar) {
            this();
        }
    }

    /* synthetic */ v(int i15, a aVar) {
        this(i15);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int e(K k15) {
        int i15;
        int i16;
        int i17;
        int iCompareTo;
        int size = this.f21482b.size();
        int i18 = size - 1;
        if (i18 < 0) {
            i15 = 0;
            while (i15 <= i18) {
                i17 = (i15 + i18) / 2;
                iCompareTo = k15.compareTo(this.f21482b.get(i17).getKey());
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
            int iCompareTo2 = k15.compareTo(this.f21482b.get(i18).getKey());
            if (iCompareTo2 > 0) {
                i16 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i18;
                }
                i15 = 0;
                while (i15 <= i18) {
                    i17 = (i15 + i18) / 2;
                    iCompareTo = k15.compareTo(this.f21482b.get(i17).getKey());
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
    public void f() {
        if (this.f21484d) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f21482b.isEmpty() || (this.f21482b instanceof ArrayList)) {
            return;
        }
        this.f21482b = new ArrayList(this.f21481a);
    }

    private SortedMap<K, V> l() {
        f();
        if (this.f21483c.isEmpty() && !(this.f21483c instanceof TreeMap)) {
            this.f21483c = new TreeMap();
        }
        return (SortedMap) this.f21483c;
    }

    static <FieldDescriptorType extends h.b<FieldDescriptorType>> v<FieldDescriptorType, Object> o(int i15) {
        return new a(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V q(int i15) {
        f();
        V value = this.f21482b.remove(i15).getValue();
        if (!this.f21483c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = l().entrySet().iterator();
            this.f21482b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f21482b.isEmpty()) {
            this.f21482b.clear();
        }
        if (this.f21483c.isEmpty()) {
            return;
        }
        this.f21483c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f21483c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f21485e == null) {
            this.f21485e = new e(this, null);
        }
        return this.f21485e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? this.f21482b.get(iE).getValue() : this.f21483c.get(comparable);
    }

    public Map.Entry<K, V> h(int i15) {
        return this.f21482b.get(i15);
    }

    public int i() {
        return this.f21482b.size();
    }

    public Iterable<Map.Entry<K, V>> k() {
        return this.f21483c.isEmpty() ? b.b() : this.f21483c.entrySet();
    }

    public boolean m() {
        return this.f21484d;
    }

    public void n() {
        if (this.f21484d) {
            return;
        }
        this.f21483c = this.f21483c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21483c);
        this.f21484d = true;
    }

    public V p(K k15, V v15) {
        f();
        int iE = e(k15);
        if (iE >= 0) {
            return this.f21482b.get(iE).setValue(v15);
        }
        g();
        int i15 = -(iE + 1);
        if (i15 >= this.f21481a) {
            return l().put(k15, v15);
        }
        int size = this.f21482b.size();
        int i16 = this.f21481a;
        if (size == i16) {
            v<K, V>.c cVarRemove = this.f21482b.remove(i16 - 1);
            l().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f21482b.add(i15, new c(k15, v15));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return q(iE);
        }
        if (this.f21483c.isEmpty()) {
            return null;
        }
        return this.f21483c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f21482b.size() + this.f21483c.size();
    }

    private class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f21493c;

        private d() {
            this.f21491a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f21493c == null) {
                this.f21493c = v.this.f21483c.entrySet().iterator();
            }
            return this.f21493c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f21492b = true;
            int i15 = this.f21491a + 1;
            this.f21491a = i15;
            return i15 < v.this.f21482b.size() ? (Map.Entry) v.this.f21482b.get(this.f21491a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21491a + 1 < v.this.f21482b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f21492b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f21492b = false;
            v.this.f();
            if (this.f21491a >= v.this.f21482b.size()) {
                a().remove();
                return;
            }
            v vVar = v.this;
            int i15 = this.f21491a;
            this.f21491a = i15 - 1;
            vVar.q(i15);
        }

        /* synthetic */ d(v vVar, a aVar) {
            this();
        }
    }

    private v(int i15) {
        this.f21481a = i15;
        this.f21482b = Collections.EMPTY_LIST;
        this.f21483c = Collections.EMPTY_MAP;
    }
}
