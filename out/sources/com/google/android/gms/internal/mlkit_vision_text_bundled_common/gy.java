package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class gy extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f30436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f30438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile ey f30440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f30441f;

    /* synthetic */ gy(fy fyVar) {
        Map map = Collections.EMPTY_MAP;
        this.f30438c = map;
        this.f30441f = map;
    }

    private final int m(Comparable comparable) {
        int i15 = this.f30437b;
        int i16 = i15 - 1;
        int i17 = 0;
        if (i16 >= 0) {
            int iCompareTo = comparable.compareTo(((zx) this.f30436a[i16]).b());
            if (iCompareTo > 0) {
                return -(i15 + 1);
            }
            if (iCompareTo == 0) {
                return i16;
            }
        }
        while (i17 <= i16) {
            int i18 = (i17 + i16) / 2;
            int iCompareTo2 = comparable.compareTo(((zx) this.f30436a[i18]).b());
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
        Object value = ((zx) this.f30436a[i15]).getValue();
        Object[] objArr = this.f30436a;
        System.arraycopy(objArr, i15 + 1, objArr, i15, (this.f30437b - i15) - 1);
        this.f30437b--;
        if (!this.f30438c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f30436a;
            int i16 = this.f30437b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i16] = new zx(this, (Comparable) entry.getKey(), entry.getValue());
            this.f30437b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap o() {
        p();
        if (this.f30438c.isEmpty() && !(this.f30438c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30438c = treeMap;
            this.f30441f = treeMap.descendingMap();
        }
        return (SortedMap) this.f30438c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.f30439d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f30439d) {
            return;
        }
        this.f30438c = this.f30438c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f30438c);
        this.f30441f = this.f30441f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f30441f);
        this.f30439d = true;
    }

    public final int c() {
        return this.f30437b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p();
        if (this.f30437b != 0) {
            this.f30436a = null;
            this.f30437b = 0;
        }
        if (this.f30438c.isEmpty()) {
            return;
        }
        this.f30438c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f30438c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f30438c.isEmpty() ? Collections.EMPTY_SET : this.f30438c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f30440e == null) {
            this.f30440e = new ey(this, null);
        }
        return this.f30440e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy)) {
            return super.equals(obj);
        }
        gy gyVar = (gy) obj;
        int size = size();
        if (size != gyVar.size()) {
            return false;
        }
        int i15 = this.f30437b;
        if (i15 != gyVar.f30437b) {
            return entrySet().equals(gyVar.entrySet());
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!g(i16).equals(gyVar.g(i16))) {
                return false;
            }
        }
        if (i15 != size) {
            return this.f30438c.equals(gyVar.f30438c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        p();
        int iM = m(comparable);
        if (iM >= 0) {
            return ((zx) this.f30436a[iM]).setValue(obj);
        }
        p();
        if (this.f30436a == null) {
            this.f30436a = new Object[16];
        }
        int i15 = -(iM + 1);
        if (i15 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f30437b == 16) {
            zx zxVar = (zx) this.f30436a[15];
            this.f30437b = 15;
            o().put(zxVar.b(), zxVar.getValue());
        }
        Object[] objArr = this.f30436a;
        int length = objArr.length;
        System.arraycopy(objArr, i15, objArr, i15 + 1, 15 - i15);
        this.f30436a[i15] = new zx(this, comparable, obj);
        this.f30437b++;
        return null;
    }

    public final Map.Entry g(int i15) {
        if (i15 < this.f30437b) {
            return (zx) this.f30436a[i15];
        }
        throw new ArrayIndexOutOfBoundsException(i15);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? ((zx) this.f30436a[iM]).getValue() : this.f30438c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i15 = this.f30437b;
        int iHashCode = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode += this.f30436a[i16].hashCode();
        }
        return this.f30438c.size() > 0 ? iHashCode + this.f30438c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f30439d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return n(iM);
        }
        if (this.f30438c.isEmpty()) {
            return null;
        }
        return this.f30438c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30437b + this.f30438c.size();
    }
}
