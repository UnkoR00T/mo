package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class p0 extends t<Double> implements k1<Double>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p0 f29496d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f29497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29498c;

    static {
        p0 p0Var = new p0();
        f29496d = p0Var;
        p0Var.J();
    }

    p0() {
        this(new double[10], 0);
    }

    private final void g(int i15, double d15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f29498c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        double[] dArr = this.f29497b;
        if (i16 < dArr.length) {
            System.arraycopy(dArr, i15, dArr, i15 + 1, i16 - i15);
        } else {
            double[] dArr2 = new double[((i16 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            System.arraycopy(this.f29497b, i15, dArr2, i15 + 1, this.f29498c - i15);
            this.f29497b = dArr2;
        }
        this.f29497b[i15] = d15;
        this.f29498c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i15) {
        if (i15 < 0 || i15 >= this.f29498c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    private final String i(int i15) {
        int i16 = this.f29498c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1<Double> C1(int i15) {
        if (i15 >= this.f29498c) {
            return new p0(Arrays.copyOf(this.f29497b, i15), this.f29498c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        g(i15, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        h1.a(collection);
        if (!(collection instanceof p0)) {
            return super.addAll(collection);
        }
        p0 p0Var = (p0) collection;
        int i15 = p0Var.f29498c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29498c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        double[] dArr = this.f29497b;
        if (i17 > dArr.length) {
            this.f29497b = Arrays.copyOf(dArr, i17);
        }
        System.arraycopy(p0Var.f29497b, 0, this.f29497b, this.f29498c, p0Var.f29498c);
        this.f29498c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return super.equals(obj);
        }
        p0 p0Var = (p0) obj;
        if (this.f29498c != p0Var.f29498c) {
            return false;
        }
        double[] dArr = p0Var.f29497b;
        for (int i15 = 0; i15 < this.f29498c; i15++) {
            if (this.f29497b[i15] != dArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d15) {
        g(this.f29498c, d15);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        h(i15);
        return Double.valueOf(this.f29497b[i15]);
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iJ = 1;
        for (int i15 = 0; i15 < this.f29498c; i15++) {
            iJ = (iJ * 31) + h1.j(Double.doubleToLongBits(this.f29497b[i15]));
        }
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        h(i15);
        double[] dArr = this.f29497b;
        double d15 = dArr[i15];
        int i16 = this.f29498c;
        if (i15 < i16 - 1) {
            System.arraycopy(dArr, i15 + 1, dArr, i15, i16 - i15);
        }
        this.f29498c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f29497b;
        System.arraycopy(dArr, i16, dArr, i15, this.f29498c - i16);
        this.f29498c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        h(i15);
        double[] dArr = this.f29497b;
        double d15 = dArr[i15];
        dArr[i15] = dDoubleValue;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29498c;
    }

    private p0(double[] dArr, int i15) {
        this.f29497b = dArr;
        this.f29498c = i15;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        for (int i15 = 0; i15 < this.f29498c; i15++) {
            if (obj.equals(Double.valueOf(this.f29497b[i15]))) {
                double[] dArr = this.f29497b;
                System.arraycopy(dArr, i15 + 1, dArr, i15, this.f29498c - i15);
                this.f29498c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
