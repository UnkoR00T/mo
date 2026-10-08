package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class d1 extends t<Float> implements k1<Float>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d1 f29290d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f29291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29292c;

    static {
        d1 d1Var = new d1();
        f29290d = d1Var;
        d1Var.J();
    }

    d1() {
        this(new float[10], 0);
    }

    private final void g(int i15, float f15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f29292c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        float[] fArr = this.f29291b;
        if (i16 < fArr.length) {
            System.arraycopy(fArr, i15, fArr, i15 + 1, i16 - i15);
        } else {
            float[] fArr2 = new float[((i16 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            System.arraycopy(this.f29291b, i15, fArr2, i15 + 1, this.f29292c - i15);
            this.f29291b = fArr2;
        }
        this.f29291b[i15] = f15;
        this.f29292c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i15) {
        if (i15 < 0 || i15 >= this.f29292c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    private final String i(int i15) {
        int i16 = this.f29292c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1<Float> C1(int i15) {
        if (i15 >= this.f29292c) {
            return new d1(Arrays.copyOf(this.f29291b, i15), this.f29292c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        g(i15, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        e();
        h1.a(collection);
        if (!(collection instanceof d1)) {
            return super.addAll(collection);
        }
        d1 d1Var = (d1) collection;
        int i15 = d1Var.f29292c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29292c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        float[] fArr = this.f29291b;
        if (i17 > fArr.length) {
            this.f29291b = Arrays.copyOf(fArr, i17);
        }
        System.arraycopy(d1Var.f29291b, 0, this.f29291b, this.f29292c, d1Var.f29292c);
        this.f29292c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        if (this.f29292c != d1Var.f29292c) {
            return false;
        }
        float[] fArr = d1Var.f29291b;
        for (int i15 = 0; i15 < this.f29292c; i15++) {
            if (this.f29291b[i15] != fArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f15) {
        g(this.f29292c, f15);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        h(i15);
        return Float.valueOf(this.f29291b[i15]);
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i15 = 0; i15 < this.f29292c; i15++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f29291b[i15]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        h(i15);
        float[] fArr = this.f29291b;
        float f15 = fArr[i15];
        int i16 = this.f29292c;
        if (i15 < i16 - 1) {
            System.arraycopy(fArr, i15 + 1, fArr, i15, i16 - i15);
        }
        this.f29292c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f29291b;
        System.arraycopy(fArr, i16, fArr, i15, this.f29292c - i16);
        this.f29292c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        e();
        h(i15);
        float[] fArr = this.f29291b;
        float f15 = fArr[i15];
        fArr[i15] = fFloatValue;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29292c;
    }

    private d1(float[] fArr, int i15) {
        this.f29291b = fArr;
        this.f29292c = i15;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        for (int i15 = 0; i15 < this.f29292c; i15++) {
            if (obj.equals(Float.valueOf(this.f29291b[i15]))) {
                float[] fArr = this.f29291b;
                System.arraycopy(fArr, i15 + 1, fArr, i15, this.f29292c - i15);
                this.f29292c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
