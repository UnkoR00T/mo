package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class bz extends jx implements RandomAccess, fz, q00 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f31824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final bz f31825e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f31826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31827c;

    static {
        int[] iArr = new int[0];
        f31824d = iArr;
        f31825e = new bz(iArr, 0, false);
    }

    bz() {
        this(f31824d, 0, true);
    }

    public static bz g() {
        return f31825e;
    }

    private static int i(int i15) {
        return Math.max(((i15 * 3) / 2) + 1, 10);
    }

    private final void j(int i15) {
        if (i15 < 0 || i15 >= this.f31827c) {
            throw new IndexOutOfBoundsException(k(i15));
        }
    }

    private final String k(int i15) {
        return mx.b(this.f31827c, i15, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.libraries.places.internal.iz
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final fz a0(int i15) {
        if (i15 >= this.f31827c) {
            return new bz(i15 == 0 ? f31824d : Arrays.copyOf(this.f31826b, i15), this.f31827c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.libraries.places.internal.fz
    public final void D(int i15) {
        e();
        int i16 = this.f31827c;
        int length = this.f31826b.length;
        if (i16 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f31826b, 0, iArr, 0, this.f31827c);
            this.f31826b = iArr;
        }
        int[] iArr2 = this.f31826b;
        int i17 = this.f31827c;
        this.f31827c = i17 + 1;
        iArr2[i17] = i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f31827c)) {
            throw new IndexOutOfBoundsException(k(i15));
        }
        int i17 = i15 + 1;
        int[] iArr = this.f31826b;
        int length = iArr.length;
        if (i16 < length) {
            System.arraycopy(iArr, i15, iArr, i17, i16 - i15);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f31826b, 0, iArr2, 0, i15);
            System.arraycopy(this.f31826b, i15, iArr2, i17, this.f31827c - i15);
            this.f31826b = iArr2;
        }
        this.f31826b[i15] = iIntValue;
        this.f31827c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        collection.getClass();
        if (!(collection instanceof bz)) {
            return super.addAll(collection);
        }
        bz bzVar = (bz) collection;
        int i15 = bzVar.f31827c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f31827c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        int[] iArr = this.f31826b;
        if (i17 > iArr.length) {
            this.f31826b = Arrays.copyOf(iArr, i17);
        }
        System.arraycopy(bzVar.f31826b, 0, this.f31826b, this.f31827c, bzVar.f31827c);
        this.f31827c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return super.equals(obj);
        }
        bz bzVar = (bz) obj;
        if (this.f31827c != bzVar.f31827c) {
            return false;
        }
        int[] iArr = bzVar.f31826b;
        for (int i15 = 0; i15 < this.f31827c; i15++) {
            if (this.f31826b[i15] != iArr[i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        j(i15);
        return Integer.valueOf(this.f31826b[i15]);
    }

    public final int h(int i15) {
        j(i15);
        return this.f31826b[i15];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f31827c; i16++) {
            i15 = (i15 * 31) + this.f31826b[i16];
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i15 = this.f31827c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f31826b[i16] == iIntValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        j(i15);
        int[] iArr = this.f31826b;
        int i16 = iArr[i15];
        int i17 = this.f31827c;
        if (i15 < i17 - 1) {
            System.arraycopy(iArr, i15 + 1, iArr, i15, (i17 - i15) - 1);
        }
        this.f31827c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f31826b;
        System.arraycopy(iArr, i16, iArr, i15, this.f31827c - i16);
        this.f31827c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        j(i15);
        int[] iArr = this.f31826b;
        int i16 = iArr[i15];
        iArr[i15] = iIntValue;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31827c;
    }

    private bz(int[] iArr, int i15, boolean z15) {
        super(z15);
        this.f31826b = iArr;
        this.f31827c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        D(((Integer) obj).intValue());
        return true;
    }
}
