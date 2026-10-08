package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class sv extends gu implements RandomAccess, gw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final sv f30627d = new sv(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f30628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30629c;

    sv() {
        this(new float[10], 0, true);
    }

    public static sv g() {
        return f30627d;
    }

    private final String i(int i15) {
        return "Index:" + i15 + ", Size:" + this.f30629c;
    }

    private final void j(int i15) {
        if (i15 < 0 || i15 >= this.f30629c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw
    public final /* bridge */ /* synthetic */ jw T1(int i15) {
        if (i15 >= this.f30629c) {
            return new sv(Arrays.copyOf(this.f30628b, i15), this.f30629c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        float fFloatValue = ((Float) obj).floatValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f30629c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        int i17 = i15 + 1;
        float[] fArr = this.f30628b;
        if (i16 < fArr.length) {
            System.arraycopy(fArr, i15, fArr, i17, i16 - i15);
        } else {
            float[] fArr2 = new float[((i16 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            System.arraycopy(this.f30628b, i15, fArr2, i17, this.f30629c - i15);
            this.f30628b = fArr2;
        }
        this.f30628b[i15] = fFloatValue;
        this.f30629c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = kw.f30477b;
        collection.getClass();
        if (!(collection instanceof sv)) {
            return super.addAll(collection);
        }
        sv svVar = (sv) collection;
        int i15 = svVar.f30629c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f30629c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        float[] fArr = this.f30628b;
        if (i17 > fArr.length) {
            this.f30628b = Arrays.copyOf(fArr, i17);
        }
        System.arraycopy(svVar.f30628b, 0, this.f30628b, this.f30629c, svVar.f30629c);
        this.f30629c = i17;
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
        if (!(obj instanceof sv)) {
            return super.equals(obj);
        }
        sv svVar = (sv) obj;
        if (this.f30629c != svVar.f30629c) {
            return false;
        }
        float[] fArr = svVar.f30628b;
        for (int i15 = 0; i15 < this.f30629c; i15++) {
            if (Float.floatToIntBits(this.f30628b[i15]) != Float.floatToIntBits(fArr[i15])) {
                return false;
            }
        }
        return true;
    }

    public final float f(int i15) {
        j(i15);
        return this.f30628b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        j(i15);
        return Float.valueOf(this.f30628b[i15]);
    }

    public final void h(float f15) {
        e();
        int i15 = this.f30629c;
        float[] fArr = this.f30628b;
        if (i15 == fArr.length) {
            float[] fArr2 = new float[((i15 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            this.f30628b = fArr2;
        }
        float[] fArr3 = this.f30628b;
        int i16 = this.f30629c;
        this.f30629c = i16 + 1;
        fArr3[i16] = f15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i15 = 0; i15 < this.f30629c; i15++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f30628b[i15]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i15 = this.f30629c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f30628b[i16] == fFloatValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        j(i15);
        float[] fArr = this.f30628b;
        float f15 = fArr[i15];
        int i16 = this.f30629c;
        if (i15 < i16 - 1) {
            System.arraycopy(fArr, i15 + 1, fArr, i15, (i16 - i15) - 1);
        }
        this.f30629c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f30628b;
        System.arraycopy(fArr, i16, fArr, i15, this.f30629c - i16);
        this.f30629c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        e();
        j(i15);
        float[] fArr = this.f30628b;
        float f15 = fArr[i15];
        fArr[i15] = fFloatValue;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30629c;
    }

    private sv(float[] fArr, int i15, boolean z15) {
        super(z15);
        this.f30628b = fArr;
        this.f30629c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
