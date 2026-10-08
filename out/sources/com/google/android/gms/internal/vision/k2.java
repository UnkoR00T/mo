package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class k2 extends x0<Float> implements v2<Float>, f4, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k2 f31110d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f31111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31112c;

    static {
        k2 k2Var = new k2(new float[0], 0);
        f31110d = k2Var;
        k2Var.zzb();
    }

    k2() {
        this(new float[10], 0);
    }

    private final void g(int i15) {
        if (i15 < 0 || i15 >= this.f31112c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    private final String h(int i15) {
        int i16 = this.f31112c;
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
        float fFloatValue = ((Float) obj).floatValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f31112c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        float[] fArr = this.f31111b;
        if (i16 < fArr.length) {
            System.arraycopy(fArr, i15, fArr, i15 + 1, i16 - i15);
        } else {
            float[] fArr2 = new float[((i16 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            System.arraycopy(this.f31111b, i15, fArr2, i15 + 1, this.f31112c - i15);
            this.f31111b = fArr2;
        }
        this.f31111b[i15] = fFloatValue;
        this.f31112c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        e();
        p2.d(collection);
        if (!(collection instanceof k2)) {
            return super.addAll(collection);
        }
        k2 k2Var = (k2) collection;
        int i15 = k2Var.f31112c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f31112c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        float[] fArr = this.f31111b;
        if (i17 > fArr.length) {
            this.f31111b = Arrays.copyOf(fArr, i17);
        }
        System.arraycopy(k2Var.f31111b, 0, this.f31111b, this.f31112c, k2Var.f31112c);
        this.f31112c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2<Float> b(int i15) {
        if (i15 >= this.f31112c) {
            return new k2(Arrays.copyOf(this.f31111b, i15), this.f31112c);
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
        if (!(obj instanceof k2)) {
            return super.equals(obj);
        }
        k2 k2Var = (k2) obj;
        if (this.f31112c != k2Var.f31112c) {
            return false;
        }
        float[] fArr = k2Var.f31111b;
        for (int i15 = 0; i15 < this.f31112c; i15++) {
            if (Float.floatToIntBits(this.f31111b[i15]) != Float.floatToIntBits(fArr[i15])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f15) {
        e();
        int i15 = this.f31112c;
        float[] fArr = this.f31111b;
        if (i15 == fArr.length) {
            float[] fArr2 = new float[((i15 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            this.f31111b = fArr2;
        }
        float[] fArr3 = this.f31111b;
        int i16 = this.f31112c;
        this.f31112c = i16 + 1;
        fArr3[i16] = f15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        g(i15);
        return Float.valueOf(this.f31111b[i15]);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i15 = 0; i15 < this.f31112c; i15++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f31111b[i15]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f31111b[i15] == fFloatValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        g(i15);
        float[] fArr = this.f31111b;
        float f15 = fArr[i15];
        int i16 = this.f31112c;
        if (i15 < i16 - 1) {
            System.arraycopy(fArr, i15 + 1, fArr, i15, (i16 - i15) - 1);
        }
        this.f31112c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f31111b;
        System.arraycopy(fArr, i16, fArr, i15, this.f31112c - i16);
        this.f31112c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        e();
        g(i15);
        float[] fArr = this.f31111b;
        float f15 = fArr[i15];
        fArr[i15] = fFloatValue;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31112c;
    }

    private k2(float[] fArr, int i15) {
        this.f31111b = fArr;
        this.f31112c = i15;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
