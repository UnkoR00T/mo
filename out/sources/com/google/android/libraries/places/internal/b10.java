package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class b10 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f31719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f31721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile a10 f31723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f31724f;

    /* synthetic */ b10(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f31721c = map;
        this.f31724f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object g(int i15) {
        h();
        Object value = ((y00) this.f31719a[i15]).getValue();
        Object[] objArr = this.f31719a;
        System.arraycopy(objArr, i15 + 1, objArr, i15, (this.f31720b - i15) - 1);
        this.f31720b--;
        if (!this.f31721c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f31719a;
            int i16 = this.f31720b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i16] = new y00(this, (Comparable) entry.getKey(), entry.getValue());
            this.f31720b++;
            it.remove();
        }
        return value;
    }

    private final int n(Comparable comparable) {
        int i15 = this.f31720b;
        int i16 = i15 - 1;
        int i17 = 0;
        if (i16 >= 0) {
            int iCompareTo = comparable.compareTo(((y00) this.f31719a[i16]).b());
            if (iCompareTo > 0) {
                return -(i15 + 1);
            }
            if (iCompareTo == 0) {
                return i16;
            }
        }
        while (i17 <= i16) {
            int i18 = (i17 + i16) / 2;
            int iCompareTo2 = comparable.compareTo(((y00) this.f31719a[i18]).b());
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
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f31722d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap p() {
        h();
        if (this.f31721c.isEmpty() && !(this.f31721c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f31721c = treeMap;
            this.f31724f = treeMap.descendingMap();
        }
        return (SortedMap) this.f31721c;
    }

    public void a() {
        if (this.f31722d) {
            return;
        }
        this.f31721c = this.f31721c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31721c);
        this.f31724f = this.f31724f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31724f);
        this.f31722d = true;
    }

    public final boolean b() {
        return this.f31722d;
    }

    public final int c() {
        return this.f31720b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f31720b != 0) {
            this.f31719a = null;
            this.f31720b = 0;
        }
        if (this.f31721c.isEmpty()) {
            return;
        }
        this.f31721c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f31721c.containsKey(comparable);
    }

    public final Map.Entry d(int i15) {
        if (i15 < this.f31720b) {
            return (y00) this.f31719a[i15];
        }
        throw new ArrayIndexOutOfBoundsException(i15);
    }

    public final Iterable e() {
        return this.f31721c.isEmpty() ? Collections.EMPTY_SET : this.f31721c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f31723e == null) {
            this.f31723e = new a10(this, null);
        }
        return this.f31723e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10)) {
            return super.equals(obj);
        }
        b10 b10Var = (b10) obj;
        int size = size();
        if (size != b10Var.size()) {
            return false;
        }
        int i15 = this.f31720b;
        if (i15 != b10Var.f31720b) {
            return entrySet().equals(b10Var.entrySet());
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!d(i16).equals(b10Var.d(i16))) {
                return false;
            }
        }
        if (i15 != size) {
            return this.f31721c.equals(b10Var.f31721c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((y00) this.f31719a[iN]).setValue(obj);
        }
        h();
        if (this.f31719a == null) {
            this.f31719a = new Object[16];
        }
        int i15 = -(iN + 1);
        if (i15 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f31720b == 16) {
            y00 y00Var = (y00) this.f31719a[15];
            this.f31720b = 15;
            p().put(y00Var.b(), y00Var.getValue());
        }
        Object[] objArr = this.f31719a;
        int length = objArr.length;
        System.arraycopy(objArr, i15, objArr, i15 + 1, 15 - i15);
        this.f31719a[i15] = new y00(this, comparable, obj);
        this.f31720b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((y00) this.f31719a[iN]).getValue() : this.f31721c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i15 = this.f31720b;
        int iHashCode = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode += this.f31719a[i16].hashCode();
        }
        return this.f31721c.size() > 0 ? iHashCode + this.f31721c.hashCode() : iHashCode;
    }

    final /* synthetic */ Object[] i() {
        return this.f31719a;
    }

    final /* synthetic */ int k() {
        return this.f31720b;
    }

    final /* synthetic */ Map l() {
        return this.f31721c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return g(iN);
        }
        if (this.f31721c.isEmpty()) {
            return null;
        }
        return this.f31721c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f31720b + this.f31721c.size();
    }
}
