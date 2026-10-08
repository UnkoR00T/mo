package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class nu extends gu implements RandomAccess, jw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f30527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30528c;

    static {
        new nu(new boolean[0], 0, false);
    }

    nu() {
        this(new boolean[10], 0, true);
    }

    private final String h(int i15) {
        return "Index:" + i15 + ", Size:" + this.f30528c;
    }

    private final void i(int i15) {
        if (i15 < 0 || i15 >= this.f30528c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw
    public final /* bridge */ /* synthetic */ jw T1(int i15) {
        if (i15 >= this.f30528c) {
            return new nu(Arrays.copyOf(this.f30527b, i15), this.f30528c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f30528c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        int i17 = i15 + 1;
        boolean[] zArr = this.f30527b;
        if (i16 < zArr.length) {
            System.arraycopy(zArr, i15, zArr, i17, i16 - i15);
        } else {
            boolean[] zArr2 = new boolean[((i16 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            System.arraycopy(this.f30527b, i15, zArr2, i17, this.f30528c - i15);
            this.f30527b = zArr2;
        }
        this.f30527b[i15] = zBooleanValue;
        this.f30528c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = kw.f30477b;
        collection.getClass();
        if (!(collection instanceof nu)) {
            return super.addAll(collection);
        }
        nu nuVar = (nu) collection;
        int i15 = nuVar.f30528c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f30528c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        boolean[] zArr = this.f30527b;
        if (i17 > zArr.length) {
            this.f30527b = Arrays.copyOf(zArr, i17);
        }
        System.arraycopy(nuVar.f30527b, 0, this.f30527b, this.f30528c, nuVar.f30528c);
        this.f30528c = i17;
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
        if (!(obj instanceof nu)) {
            return super.equals(obj);
        }
        nu nuVar = (nu) obj;
        if (this.f30528c != nuVar.f30528c) {
            return false;
        }
        boolean[] zArr = nuVar.f30527b;
        for (int i15 = 0; i15 < this.f30528c; i15++) {
            if (this.f30527b[i15] != zArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z15) {
        e();
        int i15 = this.f30528c;
        boolean[] zArr = this.f30527b;
        if (i15 == zArr.length) {
            boolean[] zArr2 = new boolean[((i15 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            this.f30527b = zArr2;
        }
        boolean[] zArr3 = this.f30527b;
        int i16 = this.f30528c;
        this.f30528c = i16 + 1;
        zArr3[i16] = z15;
    }

    public final boolean g(int i15) {
        i(i15);
        return this.f30527b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        i(i15);
        return Boolean.valueOf(this.f30527b[i15]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i15 = 0; i15 < this.f30528c; i15++) {
            iA = (iA * 31) + kw.a(this.f30527b[i15]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i15 = this.f30528c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f30527b[i16] == zBooleanValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        i(i15);
        boolean[] zArr = this.f30527b;
        boolean z15 = zArr[i15];
        int i16 = this.f30528c;
        if (i15 < i16 - 1) {
            System.arraycopy(zArr, i15 + 1, zArr, i15, (i16 - i15) - 1);
        }
        this.f30528c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f30527b;
        System.arraycopy(zArr, i16, zArr, i15, this.f30528c - i16);
        this.f30528c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e();
        i(i15);
        boolean[] zArr = this.f30527b;
        boolean z15 = zArr[i15];
        zArr[i15] = zBooleanValue;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30528c;
    }

    private nu(boolean[] zArr, int i15, boolean z15) {
        super(z15);
        this.f30527b = zArr;
        this.f30528c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
