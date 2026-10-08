package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class x extends t<Boolean> implements k1<Boolean>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x f29586d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f29587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29588c;

    static {
        x xVar = new x();
        f29586d = xVar;
        xVar.J();
    }

    x() {
        this(new boolean[10], 0);
    }

    private final void g(int i15, boolean z15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f29588c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        boolean[] zArr = this.f29587b;
        if (i16 < zArr.length) {
            System.arraycopy(zArr, i15, zArr, i15 + 1, i16 - i15);
        } else {
            boolean[] zArr2 = new boolean[((i16 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            System.arraycopy(this.f29587b, i15, zArr2, i15 + 1, this.f29588c - i15);
            this.f29587b = zArr2;
        }
        this.f29587b[i15] = z15;
        this.f29588c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i15) {
        if (i15 < 0 || i15 >= this.f29588c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    private final String i(int i15) {
        int i16 = this.f29588c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1<Boolean> C1(int i15) {
        if (i15 >= this.f29588c) {
            return new x(Arrays.copyOf(this.f29587b, i15), this.f29588c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        g(i15, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        e();
        h1.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i15 = xVar.f29588c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29588c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        boolean[] zArr = this.f29587b;
        if (i17 > zArr.length) {
            this.f29587b = Arrays.copyOf(zArr, i17);
        }
        System.arraycopy(xVar.f29587b, 0, this.f29587b, this.f29588c, xVar.f29588c);
        this.f29588c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f29588c != xVar.f29588c) {
            return false;
        }
        boolean[] zArr = xVar.f29587b;
        for (int i15 = 0; i15 < this.f29588c; i15++) {
            if (this.f29587b[i15] != zArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z15) {
        g(this.f29588c, z15);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        h(i15);
        return Boolean.valueOf(this.f29587b[i15]);
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iF = 1;
        for (int i15 = 0; i15 < this.f29588c; i15++) {
            iF = (iF * 31) + h1.f(this.f29587b[i15]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        h(i15);
        boolean[] zArr = this.f29587b;
        boolean z15 = zArr[i15];
        int i16 = this.f29588c;
        if (i15 < i16 - 1) {
            System.arraycopy(zArr, i15 + 1, zArr, i15, i16 - i15);
        }
        this.f29588c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f29587b;
        System.arraycopy(zArr, i16, zArr, i15, this.f29588c - i16);
        this.f29588c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        h(i15);
        boolean[] zArr = this.f29587b;
        boolean z15 = zArr[i15];
        zArr[i15] = zBooleanValue;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29588c;
    }

    private x(boolean[] zArr, int i15) {
        this.f29587b = zArr;
        this.f29588c = i15;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        for (int i15 = 0; i15 < this.f29588c; i15++) {
            if (obj.equals(Boolean.valueOf(this.f29587b[i15]))) {
                boolean[] zArr = this.f29587b;
                System.arraycopy(zArr, i15 + 1, zArr, i15, this.f29588c - i15);
                this.f29588c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
