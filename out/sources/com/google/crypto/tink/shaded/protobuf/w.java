package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class w extends c<Float> implements a0.f, RandomAccess, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w f36313d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f36314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36315c;

    static {
        w wVar = new w(new float[0], 0);
        f36313d = wVar;
        wVar.O();
    }

    w() {
        this(new float[10], 0);
    }

    private void i(int i15, float f15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f36315c)) {
            throw new IndexOutOfBoundsException(n(i15));
        }
        float[] fArr = this.f36314b;
        if (i16 < fArr.length) {
            System.arraycopy(fArr, i15, fArr, i15 + 1, i16 - i15);
        } else {
            float[] fArr2 = new float[((i16 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            System.arraycopy(this.f36314b, i15, fArr2, i15 + 1, this.f36315c - i15);
            this.f36314b = fArr2;
        }
        this.f36314b[i15] = f15;
        this.f36315c++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i15) {
        if (i15 < 0 || i15 >= this.f36315c) {
            throw new IndexOutOfBoundsException(n(i15));
        }
    }

    private String n(int i15) {
        return "Index:" + i15 + ", Size:" + this.f36315c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        e();
        a0.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i15 = wVar.f36315c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f36315c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        float[] fArr = this.f36314b;
        if (i17 > fArr.length) {
            this.f36314b = Arrays.copyOf(fArr, i17);
        }
        System.arraycopy(wVar.f36314b, 0, this.f36314b, this.f36315c, wVar.f36315c);
        this.f36315c = i17;
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
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f36315c != wVar.f36315c) {
            return false;
        }
        float[] fArr = wVar.f36314b;
        for (int i15 = 0; i15 < this.f36315c; i15++) {
            if (Float.floatToIntBits(this.f36314b[i15]) != Float.floatToIntBits(fArr[i15])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i15, Float f15) {
        i(i15, f15.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f15) {
        h(f15.floatValue());
        return true;
    }

    public void h(float f15) {
        e();
        int i15 = this.f36315c;
        float[] fArr = this.f36314b;
        if (i15 == fArr.length) {
            float[] fArr2 = new float[((i15 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            this.f36314b = fArr2;
        }
        float[] fArr3 = this.f36314b;
        int i16 = this.f36315c;
        this.f36315c = i16 + 1;
        fArr3[i16] = f15;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i15 = 0; i15 < this.f36315c; i15++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f36314b[i15]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f36314b[i15] == fFloatValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float get(int i15) {
        return Float.valueOf(l(i15));
    }

    public float l(int i15) {
        j(i15);
        return this.f36314b[i15];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a0.f d0(int i15) {
        if (i15 >= this.f36315c) {
            return new w(Arrays.copyOf(this.f36314b, i15), this.f36315c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i15) {
        e();
        j(i15);
        float[] fArr = this.f36314b;
        float f15 = fArr[i15];
        int i16 = this.f36315c;
        if (i15 < i16 - 1) {
            System.arraycopy(fArr, i15 + 1, fArr, i15, (i16 - i15) - 1);
        }
        this.f36315c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f15);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f36314b;
        System.arraycopy(fArr, i16, fArr, i15, this.f36315c - i16);
        this.f36315c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float set(int i15, Float f15) {
        return Float.valueOf(t(i15, f15.floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36315c;
    }

    public float t(int i15, float f15) {
        e();
        j(i15);
        float[] fArr = this.f36314b;
        float f16 = fArr[i15];
        fArr[i15] = f15;
        return f16;
    }

    private w(float[] fArr, int i15) {
        this.f36314b = fArr;
        this.f36315c = i15;
    }
}
