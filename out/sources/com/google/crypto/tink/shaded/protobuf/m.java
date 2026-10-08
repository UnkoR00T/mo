package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class m extends c<Double> implements a0.b, RandomAccess, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m f36149d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f36150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36151c;

    static {
        m mVar = new m(new double[0], 0);
        f36149d = mVar;
        mVar.O();
    }

    m() {
        this(new double[10], 0);
    }

    private void i(int i15, double d15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f36151c)) {
            throw new IndexOutOfBoundsException(n(i15));
        }
        double[] dArr = this.f36150b;
        if (i16 < dArr.length) {
            System.arraycopy(dArr, i15, dArr, i15 + 1, i16 - i15);
        } else {
            double[] dArr2 = new double[((i16 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            System.arraycopy(this.f36150b, i15, dArr2, i15 + 1, this.f36151c - i15);
            this.f36150b = dArr2;
        }
        this.f36150b[i15] = d15;
        this.f36151c++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i15) {
        if (i15 < 0 || i15 >= this.f36151c) {
            throw new IndexOutOfBoundsException(n(i15));
        }
    }

    private String n(int i15) {
        return "Index:" + i15 + ", Size:" + this.f36151c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        e();
        a0.a(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i15 = mVar.f36151c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f36151c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        double[] dArr = this.f36150b;
        if (i17 > dArr.length) {
            this.f36150b = Arrays.copyOf(dArr, i17);
        }
        System.arraycopy(mVar.f36150b, 0, this.f36150b, this.f36151c, mVar.f36151c);
        this.f36151c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f36151c != mVar.f36151c) {
            return false;
        }
        double[] dArr = mVar.f36150b;
        for (int i15 = 0; i15 < this.f36151c; i15++) {
            if (Double.doubleToLongBits(this.f36150b[i15]) != Double.doubleToLongBits(dArr[i15])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i15, Double d15) {
        i(i15, d15.doubleValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d15) {
        h(d15.doubleValue());
        return true;
    }

    public void h(double d15) {
        e();
        int i15 = this.f36151c;
        double[] dArr = this.f36150b;
        if (i15 == dArr.length) {
            double[] dArr2 = new double[((i15 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            this.f36150b = dArr2;
        }
        double[] dArr3 = this.f36150b;
        int i16 = this.f36151c;
        this.f36151c = i16 + 1;
        dArr3[i16] = d15;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i15 = 0; i15 < this.f36151c; i15++) {
            iF = (iF * 31) + a0.f(Double.doubleToLongBits(this.f36150b[i15]));
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f36150b[i15] == dDoubleValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Double get(int i15) {
        return Double.valueOf(l(i15));
    }

    public double l(int i15) {
        j(i15);
        return this.f36150b[i15];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a0.b d0(int i15) {
        if (i15 >= this.f36151c) {
            return new m(Arrays.copyOf(this.f36150b, i15), this.f36151c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i15) {
        e();
        j(i15);
        double[] dArr = this.f36150b;
        double d15 = dArr[i15];
        int i16 = this.f36151c;
        if (i15 < i16 - 1) {
            System.arraycopy(dArr, i15 + 1, dArr, i15, (i16 - i15) - 1);
        }
        this.f36151c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f36150b;
        System.arraycopy(dArr, i16, dArr, i15, this.f36151c - i16);
        this.f36151c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Double set(int i15, Double d15) {
        return Double.valueOf(t(i15, d15.doubleValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36151c;
    }

    public double t(int i15, double d15) {
        e();
        j(i15);
        double[] dArr = this.f36150b;
        double d16 = dArr[i15];
        dArr[i15] = d15;
        return d16;
    }

    private m(double[] dArr, int i15) {
        this.f36150b = dArr;
        this.f36151c = i15;
    }
}
