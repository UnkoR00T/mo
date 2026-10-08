package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class x1 extends x0<Double> implements v2<Double>, f4, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x1 f31325d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f31326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31327c;

    static {
        x1 x1Var = new x1(new double[0], 0);
        f31325d = x1Var;
        x1Var.zzb();
    }

    x1() {
        this(new double[10], 0);
    }

    private final void g(int i15) {
        if (i15 < 0 || i15 >= this.f31327c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    private final String h(int i15) {
        int i16 = this.f31327c;
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
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f31327c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        double[] dArr = this.f31326b;
        if (i16 < dArr.length) {
            System.arraycopy(dArr, i15, dArr, i15 + 1, i16 - i15);
        } else {
            double[] dArr2 = new double[((i16 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            System.arraycopy(this.f31326b, i15, dArr2, i15 + 1, this.f31327c - i15);
            this.f31326b = dArr2;
        }
        this.f31326b[i15] = dDoubleValue;
        this.f31327c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        p2.d(collection);
        if (!(collection instanceof x1)) {
            return super.addAll(collection);
        }
        x1 x1Var = (x1) collection;
        int i15 = x1Var.f31327c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f31327c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        double[] dArr = this.f31326b;
        if (i17 > dArr.length) {
            this.f31326b = Arrays.copyOf(dArr, i17);
        }
        System.arraycopy(x1Var.f31326b, 0, this.f31326b, this.f31327c, x1Var.f31327c);
        this.f31327c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2<Double> b(int i15) {
        if (i15 >= this.f31327c) {
            return new x1(Arrays.copyOf(this.f31326b, i15), this.f31327c);
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
        if (!(obj instanceof x1)) {
            return super.equals(obj);
        }
        x1 x1Var = (x1) obj;
        if (this.f31327c != x1Var.f31327c) {
            return false;
        }
        double[] dArr = x1Var.f31326b;
        for (int i15 = 0; i15 < this.f31327c; i15++) {
            if (Double.doubleToLongBits(this.f31326b[i15]) != Double.doubleToLongBits(dArr[i15])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d15) {
        e();
        int i15 = this.f31327c;
        double[] dArr = this.f31326b;
        if (i15 == dArr.length) {
            double[] dArr2 = new double[((i15 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i15);
            this.f31326b = dArr2;
        }
        double[] dArr3 = this.f31326b;
        int i16 = this.f31327c;
        this.f31327c = i16 + 1;
        dArr3[i16] = d15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        g(i15);
        return Double.valueOf(this.f31326b[i15]);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i15 = 0; i15 < this.f31327c; i15++) {
            iB = (iB * 31) + p2.b(Double.doubleToLongBits(this.f31326b[i15]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f31326b[i15] == dDoubleValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        g(i15);
        double[] dArr = this.f31326b;
        double d15 = dArr[i15];
        int i16 = this.f31327c;
        if (i15 < i16 - 1) {
            System.arraycopy(dArr, i15 + 1, dArr, i15, (i16 - i15) - 1);
        }
        this.f31327c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f31326b;
        System.arraycopy(dArr, i16, dArr, i15, this.f31327c - i16);
        this.f31327c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        e();
        g(i15);
        double[] dArr = this.f31326b;
        double d15 = dArr[i15];
        dArr[i15] = dDoubleValue;
        return Double.valueOf(d15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31327c;
    }

    private x1(double[] dArr, int i15) {
        this.f31326b = dArr;
        this.f31327c = i15;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
