package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class n2 extends x0<Integer> implements v2<Integer>, f4, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n2 f31198d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f31199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31200c;

    static {
        n2 n2Var = new n2(new int[0], 0);
        f31198d = n2Var;
        n2Var.zzb();
    }

    n2() {
        this(new int[10], 0);
    }

    public static n2 h() {
        return f31198d;
    }

    private final void i(int i15) {
        if (i15 < 0 || i15 >= this.f31200c) {
            throw new IndexOutOfBoundsException(j(i15));
        }
    }

    private final String j(int i15) {
        int i16 = this.f31200c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f31200c)) {
            throw new IndexOutOfBoundsException(j(i15));
        }
        int[] iArr = this.f31199b;
        if (i16 < iArr.length) {
            System.arraycopy(iArr, i15, iArr, i15 + 1, i16 - i15);
        } else {
            int[] iArr2 = new int[((i16 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            System.arraycopy(this.f31199b, i15, iArr2, i15 + 1, this.f31200c - i15);
            this.f31199b = iArr2;
        }
        this.f31199b[i15] = iIntValue;
        this.f31200c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        p2.d(collection);
        if (!(collection instanceof n2)) {
            return super.addAll(collection);
        }
        n2 n2Var = (n2) collection;
        int i15 = n2Var.f31200c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f31200c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        int[] iArr = this.f31199b;
        if (i17 > iArr.length) {
            this.f31199b = Arrays.copyOf(iArr, i17);
        }
        System.arraycopy(n2Var.f31199b, 0, this.f31199b, this.f31200c, n2Var.f31200c);
        this.f31200c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2<Integer> b(int i15) {
        if (i15 >= this.f31200c) {
            return new n2(Arrays.copyOf(this.f31199b, i15), this.f31200c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return super.equals(obj);
        }
        n2 n2Var = (n2) obj;
        if (this.f31200c != n2Var.f31200c) {
            return false;
        }
        int[] iArr = n2Var.f31199b;
        for (int i15 = 0; i15 < this.f31200c; i15++) {
            if (this.f31199b[i15] != iArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i15) {
        i(i15);
        return this.f31199b[i15];
    }

    public final void g(int i15) {
        e();
        int i16 = this.f31200c;
        int[] iArr = this.f31199b;
        if (i16 == iArr.length) {
            int[] iArr2 = new int[((i16 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i16);
            this.f31199b = iArr2;
        }
        int[] iArr3 = this.f31199b;
        int i17 = this.f31200c;
        this.f31200c = i17 + 1;
        iArr3[i17] = i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        return Integer.valueOf(f(i15));
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f31200c; i16++) {
            i15 = (i15 * 31) + this.f31199b[i16];
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f31199b[i15] == iIntValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        i(i15);
        int[] iArr = this.f31199b;
        int i16 = iArr[i15];
        int i17 = this.f31200c;
        if (i15 < i17 - 1) {
            System.arraycopy(iArr, i15 + 1, iArr, i15, (i17 - i15) - 1);
        }
        this.f31200c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f31199b;
        System.arraycopy(iArr, i16, iArr, i15, this.f31200c - i16);
        this.f31200c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        i(i15);
        int[] iArr = this.f31199b;
        int i16 = iArr[i15];
        iArr[i15] = iIntValue;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31200c;
    }

    private n2(int[] iArr, int i15) {
        this.f31199b = iArr;
        this.f31200c = i15;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
