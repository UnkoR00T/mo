package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class xw extends gu implements RandomAccess, iw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final xw f30703d = new xw(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f30704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30705c;

    xw() {
        this(new long[10], 0, true);
    }

    public static xw g() {
        return f30703d;
    }

    private final String i(int i15) {
        return "Index:" + i15 + ", Size:" + this.f30705c;
    }

    private final void j(int i15) {
        if (i15 < 0 || i15 >= this.f30705c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw
    public final /* bridge */ /* synthetic */ jw T1(int i15) {
        if (i15 >= this.f30705c) {
            return new xw(Arrays.copyOf(this.f30704b, i15), this.f30705c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f30705c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        int i17 = i15 + 1;
        long[] jArr = this.f30704b;
        if (i16 < jArr.length) {
            System.arraycopy(jArr, i15, jArr, i17, i16 - i15);
        } else {
            long[] jArr2 = new long[((i16 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            System.arraycopy(this.f30704b, i15, jArr2, i17, this.f30705c - i15);
            this.f30704b = jArr2;
        }
        this.f30704b[i15] = jLongValue;
        this.f30705c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = kw.f30477b;
        collection.getClass();
        if (!(collection instanceof xw)) {
            return super.addAll(collection);
        }
        xw xwVar = (xw) collection;
        int i15 = xwVar.f30705c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f30705c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        long[] jArr = this.f30704b;
        if (i17 > jArr.length) {
            this.f30704b = Arrays.copyOf(jArr, i17);
        }
        System.arraycopy(xwVar.f30704b, 0, this.f30704b, this.f30705c, xwVar.f30705c);
        this.f30705c = i17;
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
        if (!(obj instanceof xw)) {
            return super.equals(obj);
        }
        xw xwVar = (xw) obj;
        if (this.f30705c != xwVar.f30705c) {
            return false;
        }
        long[] jArr = xwVar.f30704b;
        for (int i15 = 0; i15 < this.f30705c; i15++) {
            if (this.f30704b[i15] != jArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i15) {
        j(i15);
        return this.f30704b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        j(i15);
        return Long.valueOf(this.f30704b[i15]);
    }

    public final void h(long j15) {
        e();
        int i15 = this.f30705c;
        long[] jArr = this.f30704b;
        if (i15 == jArr.length) {
            long[] jArr2 = new long[((i15 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            this.f30704b = jArr2;
        }
        long[] jArr3 = this.f30704b;
        int i16 = this.f30705c;
        this.f30705c = i16 + 1;
        jArr3[i16] = j15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f30705c; i16++) {
            long j15 = this.f30704b[i16];
            byte[] bArr = kw.f30477b;
            i15 = (i15 * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i15 = this.f30705c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f30704b[i16] == jLongValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        j(i15);
        long[] jArr = this.f30704b;
        long j15 = jArr[i15];
        int i16 = this.f30705c;
        if (i15 < i16 - 1) {
            System.arraycopy(jArr, i15 + 1, jArr, i15, (i16 - i15) - 1);
        }
        this.f30705c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f30704b;
        System.arraycopy(jArr, i16, jArr, i15, this.f30705c - i16);
        this.f30705c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        j(i15);
        long[] jArr = this.f30704b;
        long j15 = jArr[i15];
        jArr[i15] = jLongValue;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30705c;
    }

    private xw(long[] jArr, int i15, boolean z15) {
        super(z15);
        this.f30704b = jArr;
        this.f30705c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
