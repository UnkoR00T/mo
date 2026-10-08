package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class c1 extends x0<Boolean> implements v2<Boolean>, f4, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c1 f30975d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f30976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30977c;

    static {
        c1 c1Var = new c1(new boolean[0], 0);
        f30975d = c1Var;
        c1Var.zzb();
    }

    c1() {
        this(new boolean[10], 0);
    }

    private final void g(int i15) {
        if (i15 < 0 || i15 >= this.f30977c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    private final String h(int i15) {
        int i16 = this.f30977c;
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f30977c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        boolean[] zArr = this.f30976b;
        if (i16 < zArr.length) {
            System.arraycopy(zArr, i15, zArr, i15 + 1, i16 - i15);
        } else {
            boolean[] zArr2 = new boolean[((i16 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            System.arraycopy(this.f30976b, i15, zArr2, i15 + 1, this.f30977c - i15);
            this.f30976b = zArr2;
        }
        this.f30976b[i15] = zBooleanValue;
        this.f30977c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        e();
        p2.d(collection);
        if (!(collection instanceof c1)) {
            return super.addAll(collection);
        }
        c1 c1Var = (c1) collection;
        int i15 = c1Var.f30977c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f30977c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        boolean[] zArr = this.f30976b;
        if (i17 > zArr.length) {
            this.f30976b = Arrays.copyOf(zArr, i17);
        }
        System.arraycopy(c1Var.f30976b, 0, this.f30976b, this.f30977c, c1Var.f30977c);
        this.f30977c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2<Boolean> b(int i15) {
        if (i15 >= this.f30977c) {
            return new c1(Arrays.copyOf(this.f30976b, i15), this.f30977c);
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
        if (!(obj instanceof c1)) {
            return super.equals(obj);
        }
        c1 c1Var = (c1) obj;
        if (this.f30977c != c1Var.f30977c) {
            return false;
        }
        boolean[] zArr = c1Var.f30976b;
        for (int i15 = 0; i15 < this.f30977c; i15++) {
            if (this.f30976b[i15] != zArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z15) {
        e();
        int i15 = this.f30977c;
        boolean[] zArr = this.f30976b;
        if (i15 == zArr.length) {
            boolean[] zArr2 = new boolean[((i15 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            this.f30976b = zArr2;
        }
        boolean[] zArr3 = this.f30976b;
        int i16 = this.f30977c;
        this.f30977c = i16 + 1;
        zArr3[i16] = z15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        g(i15);
        return Boolean.valueOf(this.f30976b[i15]);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i15 = 0; i15 < this.f30977c; i15++) {
            iC = (iC * 31) + p2.c(this.f30976b[i15]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f30976b[i15] == zBooleanValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        g(i15);
        boolean[] zArr = this.f30976b;
        boolean z15 = zArr[i15];
        int i16 = this.f30977c;
        if (i15 < i16 - 1) {
            System.arraycopy(zArr, i15 + 1, zArr, i15, (i16 - i15) - 1);
        }
        this.f30977c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f30976b;
        System.arraycopy(zArr, i16, zArr, i15, this.f30977c - i16);
        this.f30977c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        g(i15);
        boolean[] zArr = this.f30976b;
        boolean z15 = zArr[i15];
        zArr[i15] = zBooleanValue;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30977c;
    }

    private c1(boolean[] zArr, int i15) {
        this.f30976b = zArr;
        this.f30977c = i15;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
