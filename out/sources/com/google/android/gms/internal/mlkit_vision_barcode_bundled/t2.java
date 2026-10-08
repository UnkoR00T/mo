package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class t2 extends v1 implements RandomAccess, s3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f30239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30240c;

    static {
        new t2(new double[0], 0, false);
    }

    t2() {
        this(new double[10], 0, true);
    }

    private final void D(int i15) {
        if (i15 < 0 || i15 >= this.f30240c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    private final String h(int i15) {
        return "Index:" + i15 + ", Size:" + this.f30240c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f30240c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        int i17 = i15 + 1;
        double[] dArr = this.f30239b;
        if (i16 < dArr.length) {
            System.arraycopy(dArr, i15, dArr, i17, i16 - i15);
        } else {
            double[] dArr2 = new double[((i16 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            System.arraycopy(this.f30239b, i15, dArr2, i17, this.f30240c - i15);
            this.f30239b = dArr2;
        }
        this.f30239b[i15] = dDoubleValue;
        this.f30240c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = t3.f30242b;
        collection.getClass();
        if (!(collection instanceof t2)) {
            return super.addAll(collection);
        }
        t2 t2Var = (t2) collection;
        int i15 = t2Var.f30240c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f30240c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        double[] dArr = this.f30239b;
        if (i17 > dArr.length) {
            this.f30239b = Arrays.copyOf(dArr, i17);
        }
        System.arraycopy(t2Var.f30239b, 0, this.f30239b, this.f30240c, t2Var.f30240c);
        this.f30240c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return super.equals(obj);
        }
        t2 t2Var = (t2) obj;
        if (this.f30240c != t2Var.f30240c) {
            return false;
        }
        double[] dArr = t2Var.f30239b;
        for (int i15 = 0; i15 < this.f30240c; i15++) {
            if (Double.doubleToLongBits(this.f30239b[i15]) != Double.doubleToLongBits(dArr[i15])) {
                return false;
            }
        }
        return true;
    }

    public final double f(int i15) {
        D(i15);
        return this.f30239b[i15];
    }

    public final void g(double d15) {
        e();
        int i15 = this.f30240c;
        double[] dArr = this.f30239b;
        if (i15 == dArr.length) {
            double[] dArr2 = new double[((i15 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            this.f30239b = dArr2;
        }
        double[] dArr3 = this.f30239b;
        int i16 = this.f30240c;
        this.f30240c = i16 + 1;
        dArr3[i16] = d15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        D(i15);
        return Double.valueOf(this.f30239b[i15]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f30240c; i16++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f30239b[i16]);
            byte[] bArr = t3.f30242b;
            i15 = (i15 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i15 = this.f30240c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f30239b[i16] == dDoubleValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        D(i15);
        double[] dArr = this.f30239b;
        double d15 = dArr[i15];
        int i16 = this.f30240c;
        if (i15 < i16 - 1) {
            System.arraycopy(dArr, i15 + 1, dArr, i15, (i16 - i15) - 1);
        }
        this.f30240c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f30239b;
        System.arraycopy(dArr, i16, dArr, i15, this.f30240c - i16);
        this.f30240c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        D(i15);
        double[] dArr = this.f30239b;
        double d15 = dArr[i15];
        dArr[i15] = dDoubleValue;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30240c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3
    public final /* bridge */ /* synthetic */ s3 u0(int i15) {
        if (i15 >= this.f30240c) {
            return new t2(Arrays.copyOf(this.f30239b, i15), this.f30240c, true);
        }
        throw new IllegalArgumentException();
    }

    private t2(double[] dArr, int i15, boolean z15) {
        super(z15);
        this.f30239b = dArr;
        this.f30240c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
