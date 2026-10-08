package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class m3 extends v1 implements RandomAccess, r3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m3 f29761d = new m3(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f29762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29763c;

    m3() {
        this(new int[10], 0, true);
    }

    public static m3 g() {
        return f29761d;
    }

    private final String i(int i15) {
        return "Index:" + i15 + ", Size:" + this.f29763c;
    }

    private final void j(int i15) {
        if (i15 < 0 || i15 >= this.f29763c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f29763c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        int i17 = i15 + 1;
        int[] iArr = this.f29762b;
        if (i16 < iArr.length) {
            System.arraycopy(iArr, i15, iArr, i17, i16 - i15);
        } else {
            int[] iArr2 = new int[((i16 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            System.arraycopy(this.f29762b, i15, iArr2, i17, this.f29763c - i15);
            this.f29762b = iArr2;
        }
        this.f29762b[i15] = iIntValue;
        this.f29763c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = t3.f30242b;
        collection.getClass();
        if (!(collection instanceof m3)) {
            return super.addAll(collection);
        }
        m3 m3Var = (m3) collection;
        int i15 = m3Var.f29763c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29763c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        int[] iArr = this.f29762b;
        if (i17 > iArr.length) {
            this.f29762b = Arrays.copyOf(iArr, i17);
        }
        System.arraycopy(m3Var.f29762b, 0, this.f29762b, this.f29763c, m3Var.f29763c);
        this.f29763c = i17;
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
        if (!(obj instanceof m3)) {
            return super.equals(obj);
        }
        m3 m3Var = (m3) obj;
        if (this.f29763c != m3Var.f29763c) {
            return false;
        }
        int[] iArr = m3Var.f29762b;
        for (int i15 = 0; i15 < this.f29763c; i15++) {
            if (this.f29762b[i15] != iArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i15) {
        j(i15);
        return this.f29762b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        j(i15);
        return Integer.valueOf(this.f29762b[i15]);
    }

    public final void h(int i15) {
        e();
        int i16 = this.f29763c;
        int[] iArr = this.f29762b;
        if (i16 == iArr.length) {
            int[] iArr2 = new int[((i16 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i16);
            this.f29762b = iArr2;
        }
        int[] iArr3 = this.f29762b;
        int i17 = this.f29763c;
        this.f29763c = i17 + 1;
        iArr3[i17] = i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f29763c; i16++) {
            i15 = (i15 * 31) + this.f29762b[i16];
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i15 = this.f29763c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f29762b[i16] == iIntValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        j(i15);
        int[] iArr = this.f29762b;
        int i16 = iArr[i15];
        int i17 = this.f29763c;
        if (i15 < i17 - 1) {
            System.arraycopy(iArr, i15 + 1, iArr, i15, (i17 - i15) - 1);
        }
        this.f29763c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29762b;
        System.arraycopy(iArr, i16, iArr, i15, this.f29763c - i16);
        this.f29763c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        j(i15);
        int[] iArr = this.f29762b;
        int i16 = iArr[i15];
        iArr[i15] = iIntValue;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29763c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3
    public final /* bridge */ /* synthetic */ s3 u0(int i15) {
        if (i15 >= this.f29763c) {
            return new m3(Arrays.copyOf(this.f29762b, i15), this.f29763c, true);
        }
        throw new IllegalArgumentException();
    }

    private m3(int[] iArr, int i15, boolean z15) {
        super(z15);
        this.f29762b = iArr;
        this.f29763c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
