package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class iv extends gu implements RandomAccess, jw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f30454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30455c;

    static {
        new iv(new double[0], 0, false);
    }

    iv() {
        this(new double[10], 0, true);
    }

    private final String h(int i15) {
        return "Index:" + i15 + ", Size:" + this.f30455c;
    }

    private final void i(int i15) {
        if (i15 < 0 || i15 >= this.f30455c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw
    public final /* bridge */ /* synthetic */ jw T1(int i15) {
        if (i15 >= this.f30455c) {
            return new iv(Arrays.copyOf(this.f30454b, i15), this.f30455c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f30455c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        int i17 = i15 + 1;
        double[] dArr = this.f30454b;
        if (i16 < dArr.length) {
            System.arraycopy(dArr, i15, dArr, i17, i16 - i15);
        } else {
            double[] dArr2 = new double[((i16 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            System.arraycopy(this.f30454b, i15, dArr2, i17, this.f30455c - i15);
            this.f30454b = dArr2;
        }
        this.f30454b[i15] = dDoubleValue;
        this.f30455c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = kw.f30477b;
        collection.getClass();
        if (!(collection instanceof iv)) {
            return super.addAll(collection);
        }
        iv ivVar = (iv) collection;
        int i15 = ivVar.f30455c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f30455c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        double[] dArr = this.f30454b;
        if (i17 > dArr.length) {
            this.f30454b = Arrays.copyOf(dArr, i17);
        }
        System.arraycopy(ivVar.f30454b, 0, this.f30454b, this.f30455c, ivVar.f30455c);
        this.f30455c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return super.equals(obj);
        }
        iv ivVar = (iv) obj;
        if (this.f30455c != ivVar.f30455c) {
            return false;
        }
        double[] dArr = ivVar.f30454b;
        for (int i15 = 0; i15 < this.f30455c; i15++) {
            if (Double.doubleToLongBits(this.f30454b[i15]) != Double.doubleToLongBits(dArr[i15])) {
                return false;
            }
        }
        return true;
    }

    public final double f(int i15) {
        i(i15);
        return this.f30454b[i15];
    }

    public final void g(double d15) {
        e();
        int i15 = this.f30455c;
        double[] dArr = this.f30454b;
        if (i15 == dArr.length) {
            double[] dArr2 = new double[((i15 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            this.f30454b = dArr2;
        }
        double[] dArr3 = this.f30454b;
        int i16 = this.f30455c;
        this.f30455c = i16 + 1;
        dArr3[i16] = d15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        i(i15);
        return Double.valueOf(this.f30454b[i15]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f30455c; i16++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f30454b[i16]);
            byte[] bArr = kw.f30477b;
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
        int i15 = this.f30455c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f30454b[i16] == dDoubleValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        i(i15);
        double[] dArr = this.f30454b;
        double d15 = dArr[i15];
        int i16 = this.f30455c;
        if (i15 < i16 - 1) {
            System.arraycopy(dArr, i15 + 1, dArr, i15, (i16 - i15) - 1);
        }
        this.f30455c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f30454b;
        System.arraycopy(dArr, i16, dArr, i15, this.f30455c - i16);
        this.f30455c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        i(i15);
        double[] dArr = this.f30454b;
        double d15 = dArr[i15];
        dArr[i15] = dDoubleValue;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30455c;
    }

    private iv(double[] dArr, int i15, boolean z15) {
        super(z15);
        this.f30454b = dArr;
        this.f30455c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
