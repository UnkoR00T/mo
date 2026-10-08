package xp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class f<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f220425a;

    private class a implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f220426a;

        a(int i15) {
            this.f220426a = i15;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return getKey().equals(aVar.getKey()) && getValue().equals(aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) f.this.f220425a[this.f220426a];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) f.this.f220425a[this.f220426a + 1];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            if (v15 == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            V v16 = (V) getValue();
            f.this.f220425a[this.f220426a + 1] = v15;
            return v16;
        }
    }

    private int b(Object obj) {
        if (!isEmpty() && obj != null) {
            int i15 = 0;
            while (true) {
                Object[] objArr = this.f220425a;
                if (i15 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i15])) {
                    return i15;
                }
                i15 += 2;
            }
        }
        return -1;
    }

    private int c(Object obj) {
        if (!isEmpty() && obj != null) {
            int i15 = 1;
            while (true) {
                Object[] objArr = this.f220425a;
                if (i15 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i15])) {
                    return i15;
                }
                i15 += 2;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public void clear() {
        this.f220425a = null;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i15 = 0; i15 < this.f220425a.length; i15 += 2) {
            linkedHashSet.add(new a(i15));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        return (V) this.f220425a[iB + 1];
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Object[] objArr = this.f220425a;
        return objArr == null || objArr.length == 0;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i15 = 0;
        while (true) {
            Object[] objArr = this.f220425a;
            if (i15 >= objArr.length) {
                return Collections.unmodifiableSet(linkedHashSet);
            }
            linkedHashSet.add(objArr[i15]);
            i15 += 2;
        }
    }

    @Override // java.util.Map
    public V put(K k15, V v15) {
        if (k15 == null || v15 == null) {
            throw new NullPointerException("Key or value must not be null.");
        }
        if (this.f220425a == null) {
            this.f220425a = new Object[]{k15, v15};
            return null;
        }
        int iB = b(k15);
        if (iB >= 0) {
            Object[] objArr = this.f220425a;
            int i15 = iB + 1;
            V v16 = (V) objArr[i15];
            objArr[i15] = v15;
            return v16;
        }
        Object[] objArr2 = this.f220425a;
        int length = objArr2.length;
        Object[] objArr3 = new Object[length + 2];
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        objArr3[length] = k15;
        objArr3[length + 1] = v15;
        this.f220425a = objArr3;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = this.f220425a;
        int i15 = 0;
        if (objArr == null || objArr.length == 0) {
            this.f220425a = new Object[map.size() << 1];
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new NullPointerException("Key or value must not be null.");
                }
                int i16 = i15 + 1;
                this.f220425a[i15] = entry.getKey();
                i15 += 2;
                this.f220425a[i16] = entry.getValue();
            }
            return;
        }
        int length = objArr.length;
        int size = (map.size() << 1) + length;
        Object[] objArr2 = new Object[size];
        System.arraycopy(this.f220425a, 0, objArr2, 0, length);
        for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
            if (entry2.getKey() == null || entry2.getValue() == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            int iB = b(entry2.getKey());
            if (iB >= 0) {
                objArr2[iB + 1] = entry2.getValue();
            } else {
                int i17 = length + 1;
                objArr2[length] = entry2.getKey();
                length += 2;
                objArr2[i17] = entry2.getValue();
            }
        }
        if (length < size) {
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr2 = objArr3;
        }
        this.f220425a = objArr2;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.f220425a;
        V v15 = (V) objArr[iB + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f220425a = null;
            return v15;
        }
        Object[] objArr2 = new Object[length - 2];
        System.arraycopy(objArr, 0, objArr2, 0, iB);
        System.arraycopy(this.f220425a, iB + 2, objArr2, iB, (length - iB) - 2);
        this.f220425a = objArr2;
        return v15;
    }

    @Override // java.util.Map
    public int size() {
        Object[] objArr = this.f220425a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        int i15 = 1;
        ArrayList arrayList = new ArrayList(this.f220425a.length >> 1);
        while (true) {
            Object[] objArr = this.f220425a;
            if (i15 >= objArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(objArr[i15]);
            i15 += 2;
        }
    }
}
