package com.google.crypto.tink.shaded.protobuf;

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
class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<j1<K, V>.e> f36111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f36112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile j1<K, V>.g f36114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f36115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile j1<K, V>.c f36116g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        a(int i15) {
            super(i15, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j1
        public void q() {
            if (!p()) {
                for (int i15 = 0; i15 < l(); i15++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i15);
                    if (((u.b) entryK.getKey()).C()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((u.b) entry.getKey()).C()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    private class c extends j1<K, V>.g {
        private c() {
            super(j1.this, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }

        /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f36121a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f36122b = new b();

        class a implements Iterator<Object> {
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

        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f36121a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f36122b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<j1<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f36123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f36124b;

        e(j1 j1Var, Map.Entry<K, V> entry) {
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
        public int compareTo(j1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return e(this.f36123a, entry.getKey()) && e(this.f36124b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f36123a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f36124b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k15 = this.f36123a;
            int iHashCode = k15 == null ? 0 : k15.hashCode();
            V v15 = this.f36124b;
            return iHashCode ^ (v15 != null ? v15.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            j1.this.g();
            V v16 = this.f36124b;
            this.f36124b = v15;
            return v16;
        }

        public String toString() {
            return this.f36123a + "=" + this.f36124b;
        }

        e(K k15, V v15) {
            this.f36123a = k15;
            this.f36124b = v15;
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
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
            return new f(j1.this, null);
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

        /* synthetic */ g(j1 j1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ j1(int i15, a aVar) {
        this(i15);
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
        int size = this.f36111b.size();
        int i18 = size - 1;
        if (i18 < 0) {
            i15 = 0;
            while (i15 <= i18) {
                i17 = (i15 + i18) / 2;
                iCompareTo = k15.compareTo(this.f36111b.get(i17).getKey());
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
            int iCompareTo2 = k15.compareTo(this.f36111b.get(i18).getKey());
            if (iCompareTo2 > 0) {
                i16 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i18;
                }
                i15 = 0;
                while (i15 <= i18) {
                    i17 = (i15 + i18) / 2;
                    iCompareTo = k15.compareTo(this.f36111b.get(i17).getKey());
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
        if (this.f36113d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f36111b.isEmpty() || (this.f36111b instanceof ArrayList)) {
            return;
        }
        this.f36111b = new ArrayList(this.f36110a);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f36112c.isEmpty() && !(this.f36112c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f36112c = treeMap;
            this.f36115f = treeMap.descendingMap();
        }
        return (SortedMap) this.f36112c;
    }

    static <FieldDescriptorType extends u.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r(int i15) {
        return new a(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i15) {
        g();
        V value = this.f36111b.remove(i15).getValue();
        if (!this.f36112c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f36111b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f36111b.isEmpty()) {
            this.f36111b.clear();
        }
        if (this.f36112c.isEmpty()) {
            return;
        }
        this.f36112c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f36112c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f36114e == null) {
            this.f36114e = new g(this, null);
        }
        return this.f36114e;
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
            return this.f36112c.equals(j1Var.f36112c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f36111b.get(iF).getValue() : this.f36112c.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f36116g == null) {
            this.f36116g = new c(this, null);
        }
        return this.f36116g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i15 = 0; i15 < iL; i15++) {
            iHashCode += this.f36111b.get(i15).hashCode();
        }
        return m() > 0 ? iHashCode + this.f36112c.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> k(int i15) {
        return this.f36111b.get(i15);
    }

    public int l() {
        return this.f36111b.size();
    }

    public int m() {
        return this.f36112c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f36112c.isEmpty() ? d.b() : this.f36112c.entrySet();
    }

    public boolean p() {
        return this.f36113d;
    }

    public void q() {
        if (this.f36113d) {
            return;
        }
        this.f36112c = this.f36112c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f36112c);
        this.f36115f = this.f36115f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f36115f);
        this.f36113d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return t(iF);
        }
        if (this.f36112c.isEmpty()) {
            return null;
        }
        return this.f36112c.remove(comparable);
    }

    public V s(K k15, V v15) {
        g();
        int iF = f(k15);
        if (iF >= 0) {
            return this.f36111b.get(iF).setValue(v15);
        }
        i();
        int i15 = -(iF + 1);
        if (i15 >= this.f36110a) {
            return o().put(k15, v15);
        }
        int size = this.f36111b.size();
        int i16 = this.f36110a;
        if (size == i16) {
            j1<K, V>.e eVarRemove = this.f36111b.remove(i16 - 1);
            o().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f36111b.add(i15, new e(k15, v15));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f36111b.size() + this.f36112c.size();
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f36118b;

        private b() {
            this.f36117a = j1.this.f36111b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f36118b == null) {
                this.f36118b = j1.this.f36115f.entrySet().iterator();
            }
            return this.f36118b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = j1.this.f36111b;
            int i15 = this.f36117a - 1;
            this.f36117a = i15;
            return (Map.Entry) list.get(i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i15 = this.f36117a;
            return (i15 > 0 && i15 <= j1.this.f36111b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f36128c;

        private f() {
            this.f36126a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f36128c == null) {
                this.f36128c = j1.this.f36112c.entrySet().iterator();
            }
            return this.f36128c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f36127b = true;
            int i15 = this.f36126a + 1;
            this.f36126a = i15;
            return i15 < j1.this.f36111b.size() ? (Map.Entry) j1.this.f36111b.get(this.f36126a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36126a + 1 < j1.this.f36111b.size() || (!j1.this.f36112c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f36127b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f36127b = false;
            j1.this.g();
            if (this.f36126a >= j1.this.f36111b.size()) {
                a().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i15 = this.f36126a;
            this.f36126a = i15 - 1;
            j1Var.t(i15);
        }

        /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }
    }

    private j1(int i15) {
        this.f36110a = i15;
        this.f36111b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f36112c = map;
        this.f36115f = map;
    }
}
