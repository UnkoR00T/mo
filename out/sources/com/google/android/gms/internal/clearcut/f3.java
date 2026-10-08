package com.google.android.gms.internal.clearcut;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class f3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<m3> f29337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f29338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile o3 f29340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f29341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile i3 f29342g;

    private f3(int i15) {
        this.f29336a = i15;
        this.f29337b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f29338c = map;
        this.f29341f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[SYNTHETIC] */
    private final int b(K k15) {
        int i15;
        int i16;
        int i17;
        int iCompareTo;
        int size = this.f29337b.size();
        int i18 = size - 1;
        if (i18 < 0) {
            i15 = 0;
            while (i15 <= i18) {
                i17 = (i15 + i18) / 2;
                iCompareTo = k15.compareTo((Comparable) this.f29337b.get(i17).getKey());
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
            int iCompareTo2 = k15.compareTo((Comparable) this.f29337b.get(i18).getKey());
            if (iCompareTo2 > 0) {
                i16 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i18;
                }
                i15 = 0;
                while (i15 <= i18) {
                    i17 = (i15 + i18) / 2;
                    iCompareTo = k15.compareTo((Comparable) this.f29337b.get(i17).getKey());
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

    static <FieldDescriptorType extends z0<FieldDescriptorType>> f3<FieldDescriptorType, Object> f(int i15) {
        return new g3(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V h(int i15) {
        p();
        V v15 = (V) this.f29337b.remove(i15).getValue();
        if (!this.f29338c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f29337b.add(new m3(this, it.next()));
            it.remove();
        }
        return v15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.f29339d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f29338c.isEmpty() && !(this.f29338c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29338c = treeMap;
            this.f29341f = treeMap.descendingMap();
        }
        return (SortedMap) this.f29338c;
    }

    public final boolean a() {
        return this.f29339d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        p();
        if (!this.f29337b.isEmpty()) {
            this.f29337b.clear();
        }
        if (this.f29338c.isEmpty()) {
            return;
        }
        this.f29338c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f29338c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k15, V v15) {
        p();
        int iB = b(k15);
        if (iB >= 0) {
            return (V) this.f29337b.get(iB).setValue(v15);
        }
        p();
        if (this.f29337b.isEmpty() && !(this.f29337b instanceof ArrayList)) {
            this.f29337b = new ArrayList(this.f29336a);
        }
        int i15 = -(iB + 1);
        if (i15 >= this.f29336a) {
            return q().put(k15, v15);
        }
        int size = this.f29337b.size();
        int i16 = this.f29336a;
        if (size == i16) {
            m3 m3VarRemove = this.f29337b.remove(i16 - 1);
            q().put((Comparable) m3VarRemove.getKey(), m3VarRemove.getValue());
        }
        this.f29337b.add(i15, new m3(this, k15, v15));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f29340e == null) {
            this.f29340e = new o3(this, null);
        }
        return this.f29340e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return super.equals(obj);
        }
        f3 f3Var = (f3) obj;
        int size = size();
        if (size != f3Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != f3Var.m()) {
            return entrySet().equals(f3Var.entrySet());
        }
        for (int i15 = 0; i15 < iM; i15++) {
            if (!g(i15).equals(f3Var.g(i15))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f29338c.equals(f3Var.f29338c);
        }
        return true;
    }

    public final Map.Entry<K, V> g(int i15) {
        return this.f29337b.get(i15);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? (V) this.f29337b.get(iB).getValue() : this.f29338c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i15 = 0; i15 < iM; i15++) {
            iHashCode += this.f29337b.get(i15).hashCode();
        }
        return this.f29338c.size() > 0 ? iHashCode + this.f29338c.hashCode() : iHashCode;
    }

    public final int m() {
        return this.f29337b.size();
    }

    public final Iterable<Map.Entry<K, V>> n() {
        return this.f29338c.isEmpty() ? j3.a() : this.f29338c.entrySet();
    }

    final Set<Map.Entry<K, V>> o() {
        if (this.f29342g == null) {
            this.f29342g = new i3(this, null);
        }
        return this.f29342g;
    }

    public void r() {
        if (this.f29339d) {
            return;
        }
        this.f29338c = this.f29338c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29338c);
        this.f29341f = this.f29341f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29341f);
        this.f29339d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return h(iB);
        }
        if (this.f29338c.isEmpty()) {
            return null;
        }
        return this.f29338c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f29337b.size() + this.f29338c.size();
    }

    /* synthetic */ f3(int i15, g3 g3Var) {
        this(i15);
    }
}
