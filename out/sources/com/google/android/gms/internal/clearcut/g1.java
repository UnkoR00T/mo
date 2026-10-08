package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class g1 extends t<Integer> implements k1<Integer>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g1 f29345d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f29346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29347c;

    static {
        g1 g1Var = new g1();
        f29345d = g1Var;
        g1Var.J();
    }

    g1() {
        this(new int[10], 0);
    }

    private final void h(int i15) {
        if (i15 < 0 || i15 >= this.f29347c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    private final String i(int i15) {
        int i16 = this.f29347c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    private final void j(int i15, int i16) {
        int i17;
        e();
        if (i15 < 0 || i15 > (i17 = this.f29347c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        int[] iArr = this.f29346b;
        if (i17 < iArr.length) {
            System.arraycopy(iArr, i15, iArr, i15 + 1, i17 - i15);
        } else {
            int[] iArr2 = new int[((i17 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            System.arraycopy(this.f29346b, i15, iArr2, i15 + 1, this.f29347c - i15);
            this.f29346b = iArr2;
        }
        this.f29346b[i15] = i16;
        this.f29347c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1<Integer> C1(int i15) {
        if (i15 >= this.f29347c) {
            return new g1(Arrays.copyOf(this.f29346b, i15), this.f29347c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        j(i15, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        h1.a(collection);
        if (!(collection instanceof g1)) {
            return super.addAll(collection);
        }
        g1 g1Var = (g1) collection;
        int i15 = g1Var.f29347c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29347c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        int[] iArr = this.f29346b;
        if (i17 > iArr.length) {
            this.f29346b = Arrays.copyOf(iArr, i17);
        }
        System.arraycopy(g1Var.f29346b, 0, this.f29346b, this.f29347c, g1Var.f29347c);
        this.f29347c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return super.equals(obj);
        }
        g1 g1Var = (g1) obj;
        if (this.f29347c != g1Var.f29347c) {
            return false;
        }
        int[] iArr = g1Var.f29346b;
        for (int i15 = 0; i15 < this.f29347c; i15++) {
            if (this.f29346b[i15] != iArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i15) {
        h(i15);
        return this.f29346b[i15];
    }

    public final void g(int i15) {
        j(this.f29347c, i15);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        return Integer.valueOf(f(i15));
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f29347c; i16++) {
            i15 = (i15 * 31) + this.f29346b[i16];
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        h(i15);
        int[] iArr = this.f29346b;
        int i16 = iArr[i15];
        int i17 = this.f29347c;
        if (i15 < i17 - 1) {
            System.arraycopy(iArr, i15 + 1, iArr, i15, i17 - i15);
        }
        this.f29347c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29346b;
        System.arraycopy(iArr, i16, iArr, i15, this.f29347c - i16);
        this.f29347c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        h(i15);
        int[] iArr = this.f29346b;
        int i16 = iArr[i15];
        iArr[i15] = iIntValue;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29347c;
    }

    private g1(int[] iArr, int i15) {
        this.f29346b = iArr;
        this.f29347c = i15;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        for (int i15 = 0; i15 < this.f29347c; i15++) {
            if (obj.equals(Integer.valueOf(this.f29346b[i15]))) {
                int[] iArr = this.f29346b;
                System.arraycopy(iArr, i15 + 1, iArr, i15, this.f29347c - i15);
                this.f29347c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
