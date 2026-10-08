package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class d3 extends v1 implements RandomAccess, q3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d3 f29697d = new d3(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f29698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29699c;

    d3() {
        this(new float[10], 0, true);
    }

    public static d3 g() {
        return f29697d;
    }

    private final String h(int i15) {
        return "Index:" + i15 + ", Size:" + this.f29699c;
    }

    private final void i(int i15) {
        if (i15 < 0 || i15 >= this.f29699c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final q3 u0(int i15) {
        if (i15 >= this.f29699c) {
            return new d3(Arrays.copyOf(this.f29698b, i15), this.f29699c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        float fFloatValue = ((Float) obj).floatValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f29699c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        int i17 = i15 + 1;
        float[] fArr = this.f29698b;
        if (i16 < fArr.length) {
            System.arraycopy(fArr, i15, fArr, i17, i16 - i15);
        } else {
            float[] fArr2 = new float[((i16 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            System.arraycopy(this.f29698b, i15, fArr2, i17, this.f29699c - i15);
            this.f29698b = fArr2;
        }
        this.f29698b[i15] = fFloatValue;
        this.f29699c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = t3.f30242b;
        collection.getClass();
        if (!(collection instanceof d3)) {
            return super.addAll(collection);
        }
        d3 d3Var = (d3) collection;
        int i15 = d3Var.f29699c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29699c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        float[] fArr = this.f29698b;
        if (i17 > fArr.length) {
            this.f29698b = Arrays.copyOf(fArr, i17);
        }
        System.arraycopy(d3Var.f29698b, 0, this.f29698b, this.f29699c, d3Var.f29699c);
        this.f29699c = i17;
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
        if (!(obj instanceof d3)) {
            return super.equals(obj);
        }
        d3 d3Var = (d3) obj;
        if (this.f29699c != d3Var.f29699c) {
            return false;
        }
        float[] fArr = d3Var.f29698b;
        for (int i15 = 0; i15 < this.f29699c; i15++) {
            if (Float.floatToIntBits(this.f29698b[i15]) != Float.floatToIntBits(fArr[i15])) {
                return false;
            }
        }
        return true;
    }

    public final float f(int i15) {
        i(i15);
        return this.f29698b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        i(i15);
        return Float.valueOf(this.f29698b[i15]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i15 = 0; i15 < this.f29699c; i15++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f29698b[i15]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i15 = this.f29699c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f29698b[i16] == fFloatValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q3
    public final void j2(float f15) {
        e();
        int i15 = this.f29699c;
        float[] fArr = this.f29698b;
        if (i15 == fArr.length) {
            float[] fArr2 = new float[((i15 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            this.f29698b = fArr2;
        }
        float[] fArr3 = this.f29698b;
        int i16 = this.f29699c;
        this.f29699c = i16 + 1;
        fArr3[i16] = f15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        i(i15);
        float[] fArr = this.f29698b;
        float f15 = fArr[i15];
        int i16 = this.f29699c;
        if (i15 < i16 - 1) {
            System.arraycopy(fArr, i15 + 1, fArr, i15, (i16 - i15) - 1);
        }
        this.f29699c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f29698b;
        System.arraycopy(fArr, i16, fArr, i15, this.f29699c - i16);
        this.f29699c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        e();
        i(i15);
        float[] fArr = this.f29698b;
        float f15 = fArr[i15];
        fArr[i15] = fFloatValue;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29699c;
    }

    private d3(float[] fArr, int i15, boolean z15) {
        super(z15);
        this.f29698b = fArr;
        this.f29699c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j2(((Float) obj).floatValue());
        return true;
    }
}
