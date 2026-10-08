package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class u5 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f30265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f30267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile s5 f30269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f30270f;

    /* synthetic */ u5(t5 t5Var) {
        Map map = Collections.EMPTY_MAP;
        this.f30267c = map;
        this.f30270f = map;
    }

    private final int m(Comparable comparable) {
        int i15 = this.f30266b;
        int i16 = i15 - 1;
        int i17 = 0;
        if (i16 >= 0) {
            int iCompareTo = comparable.compareTo(((o5) this.f30265a[i16]).b());
            if (iCompareTo > 0) {
                return -(i15 + 1);
            }
            if (iCompareTo == 0) {
                return i16;
            }
        }
        while (i17 <= i16) {
            int i18 = (i17 + i16) / 2;
            int iCompareTo2 = comparable.compareTo(((o5) this.f30265a[i18]).b());
            if (iCompareTo2 < 0) {
                i16 = i18 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i18;
                }
                i17 = i18 + 1;
            }
        }
        return -(i17 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(int i15) {
        p();
        Object value = ((o5) this.f30265a[i15]).getValue();
        Object[] objArr = this.f30265a;
        System.arraycopy(objArr, i15 + 1, objArr, i15, (this.f30266b - i15) - 1);
        this.f30266b--;
        if (!this.f30267c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f30265a;
            int i16 = this.f30266b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i16] = new o5(this, (Comparable) entry.getKey(), entry.getValue());
            this.f30266b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap o() {
        p();
        if (this.f30267c.isEmpty() && !(this.f30267c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30267c = treeMap;
            this.f30270f = treeMap.descendingMap();
        }
        return (SortedMap) this.f30267c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.f30268d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f30268d) {
            return;
        }
        this.f30267c = this.f30267c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f30267c);
        this.f30270f = this.f30270f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f30270f);
        this.f30268d = true;
    }

    public final int c() {
        return this.f30266b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p();
        if (this.f30266b != 0) {
            this.f30265a = null;
            this.f30266b = 0;
        }
        if (this.f30267c.isEmpty()) {
            return;
        }
        this.f30267c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f30267c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f30267c.isEmpty() ? Collections.EMPTY_SET : this.f30267c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f30269e == null) {
            this.f30269e = new s5(this, null);
        }
        return this.f30269e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return super.equals(obj);
        }
        u5 u5Var = (u5) obj;
        int size = size();
        if (size != u5Var.size()) {
            return false;
        }
        int i15 = this.f30266b;
        if (i15 != u5Var.f30266b) {
            return entrySet().equals(u5Var.entrySet());
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!g(i16).equals(u5Var.g(i16))) {
                return false;
            }
        }
        if (i15 != size) {
            return this.f30267c.equals(u5Var.f30267c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        p();
        int iM = m(comparable);
        if (iM >= 0) {
            return ((o5) this.f30265a[iM]).setValue(obj);
        }
        p();
        if (this.f30265a == null) {
            this.f30265a = new Object[16];
        }
        int i15 = -(iM + 1);
        if (i15 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f30266b == 16) {
            o5 o5Var = (o5) this.f30265a[15];
            this.f30266b = 15;
            o().put(o5Var.b(), o5Var.getValue());
        }
        Object[] objArr = this.f30265a;
        int length = objArr.length;
        System.arraycopy(objArr, i15, objArr, i15 + 1, 15 - i15);
        this.f30265a[i15] = new o5(this, comparable, obj);
        this.f30266b++;
        return null;
    }

    public final Map.Entry g(int i15) {
        if (i15 < this.f30266b) {
            return (o5) this.f30265a[i15];
        }
        throw new ArrayIndexOutOfBoundsException(i15);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? ((o5) this.f30265a[iM]).getValue() : this.f30267c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i15 = this.f30266b;
        int iHashCode = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode += this.f30265a[i16].hashCode();
        }
        return this.f30267c.size() > 0 ? iHashCode + this.f30267c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f30268d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return n(iM);
        }
        if (this.f30267c.isEmpty()) {
            return null;
        }
        return this.f30267c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30266b + this.f30267c.size();
    }
}
