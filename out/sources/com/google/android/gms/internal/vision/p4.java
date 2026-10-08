package com.google.android.gms.internal.vision;

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
class p4<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<u4> f31228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f31229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile w4 f31231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f31232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile q4 f31233g;

    private p4(int i15) {
        this.f31227a = i15;
        this.f31228b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f31229c = map;
        this.f31232f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[SYNTHETIC] */
    private final int a(K k15) {
        int i15;
        int i16;
        int i17;
        int iCompareTo;
        int size = this.f31228b.size();
        int i18 = size - 1;
        if (i18 < 0) {
            i15 = 0;
            while (i15 <= i18) {
                i17 = (i15 + i18) / 2;
                iCompareTo = k15.compareTo((Comparable) this.f31228b.get(i17).getKey());
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
            int iCompareTo2 = k15.compareTo((Comparable) this.f31228b.get(i18).getKey());
            if (iCompareTo2 > 0) {
                i16 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i18;
                }
                i15 = 0;
                while (i15 <= i18) {
                    i17 = (i15 + i18) / 2;
                    iCompareTo = k15.compareTo((Comparable) this.f31228b.get(i17).getKey());
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

    static <FieldDescriptorType extends g2<FieldDescriptorType>> p4<FieldDescriptorType, Object> b(int i15) {
        return new o4(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V l(int i15) {
        q();
        V v15 = (V) this.f31228b.remove(i15).getValue();
        if (!this.f31229c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            this.f31228b.add(new u4(this, it.next()));
            it.remove();
        }
        return v15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.f31230d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> r() {
        q();
        if (this.f31229c.isEmpty() && !(this.f31229c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f31229c = treeMap;
            this.f31232f = treeMap.descendingMap();
        }
        return (SortedMap) this.f31229c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.f31228b.isEmpty()) {
            this.f31228b.clear();
        }
        if (this.f31229c.isEmpty()) {
            return;
        }
        this.f31229c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f31229c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k15, V v15) {
        q();
        int iA = a(k15);
        if (iA >= 0) {
            return (V) this.f31228b.get(iA).setValue(v15);
        }
        q();
        if (this.f31228b.isEmpty() && !(this.f31228b instanceof ArrayList)) {
            this.f31228b = new ArrayList(this.f31227a);
        }
        int i15 = -(iA + 1);
        if (i15 >= this.f31227a) {
            return r().put(k15, v15);
        }
        int size = this.f31228b.size();
        int i16 = this.f31227a;
        if (size == i16) {
            u4 u4VarRemove = this.f31228b.remove(i16 - 1);
            r().put((Comparable) u4VarRemove.getKey(), u4VarRemove.getValue());
        }
        this.f31228b.add(i15, new u4(this, k15, v15));
        return null;
    }

    public void e() {
        if (this.f31230d) {
            return;
        }
        this.f31229c = this.f31229c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31229c);
        this.f31232f = this.f31232f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31232f);
        this.f31230d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f31231e == null) {
            this.f31231e = new w4(this, null);
        }
        return this.f31231e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return super.equals(obj);
        }
        p4 p4Var = (p4) obj;
        int size = size();
        if (size != p4Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != p4Var.k()) {
            return entrySet().equals(p4Var.entrySet());
        }
        for (int i15 = 0; i15 < iK; i15++) {
            if (!h(i15).equals(p4Var.h(i15))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f31229c.equals(p4Var.f31229c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.f31228b.get(iA).getValue() : this.f31229c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i15) {
        return this.f31228b.get(i15);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i15 = 0; i15 < iK; i15++) {
            iHashCode += this.f31228b.get(i15).hashCode();
        }
        return this.f31229c.size() > 0 ? iHashCode + this.f31229c.hashCode() : iHashCode;
    }

    public final boolean i() {
        return this.f31230d;
    }

    public final int k() {
        return this.f31228b.size();
    }

    public final Iterable<Map.Entry<K, V>> n() {
        return this.f31229c.isEmpty() ? t4.a() : this.f31229c.entrySet();
    }

    final Set<Map.Entry<K, V>> p() {
        if (this.f31233g == null) {
            this.f31233g = new q4(this, null);
        }
        return this.f31233g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return l(iA);
        }
        if (this.f31229c.isEmpty()) {
            return null;
        }
        return this.f31229c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f31228b.size() + this.f31229c.size();
    }

    /* synthetic */ p4(int i15, o4 o4Var) {
        this(i15);
    }
}
