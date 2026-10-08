package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class g4 extends v1 implements RandomAccess, s3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f29728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29729c;

    static {
        new g4(new long[0], 0, false);
    }

    g4() {
        this(new long[10], 0, true);
    }

    private final void D(int i15) {
        if (i15 < 0 || i15 >= this.f29729c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    private final String h(int i15) {
        return "Index:" + i15 + ", Size:" + this.f29729c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f29729c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        int i17 = i15 + 1;
        long[] jArr = this.f29728b;
        if (i16 < jArr.length) {
            System.arraycopy(jArr, i15, jArr, i17, i16 - i15);
        } else {
            long[] jArr2 = new long[((i16 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            System.arraycopy(this.f29728b, i15, jArr2, i17, this.f29729c - i15);
            this.f29728b = jArr2;
        }
        this.f29728b[i15] = jLongValue;
        this.f29729c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = t3.f30242b;
        collection.getClass();
        if (!(collection instanceof g4)) {
            return super.addAll(collection);
        }
        g4 g4Var = (g4) collection;
        int i15 = g4Var.f29729c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29729c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        long[] jArr = this.f29728b;
        if (i17 > jArr.length) {
            this.f29728b = Arrays.copyOf(jArr, i17);
        }
        System.arraycopy(g4Var.f29728b, 0, this.f29728b, this.f29729c, g4Var.f29729c);
        this.f29729c = i17;
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
        if (!(obj instanceof g4)) {
            return super.equals(obj);
        }
        g4 g4Var = (g4) obj;
        if (this.f29729c != g4Var.f29729c) {
            return false;
        }
        long[] jArr = g4Var.f29728b;
        for (int i15 = 0; i15 < this.f29729c; i15++) {
            if (this.f29728b[i15] != jArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i15) {
        D(i15);
        return this.f29728b[i15];
    }

    public final void g(long j15) {
        e();
        int i15 = this.f29729c;
        long[] jArr = this.f29728b;
        if (i15 == jArr.length) {
            long[] jArr2 = new long[((i15 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            this.f29728b = jArr2;
        }
        long[] jArr3 = this.f29728b;
        int i16 = this.f29729c;
        this.f29729c = i16 + 1;
        jArr3[i16] = j15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        D(i15);
        return Long.valueOf(this.f29728b[i15]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f29729c; i16++) {
            long j15 = this.f29728b[i16];
            byte[] bArr = t3.f30242b;
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
        int i15 = this.f29729c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f29728b[i16] == jLongValue) {
                return i16;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        D(i15);
        long[] jArr = this.f29728b;
        long j15 = jArr[i15];
        int i16 = this.f29729c;
        if (i15 < i16 - 1) {
            System.arraycopy(jArr, i15 + 1, jArr, i15, (i16 - i15) - 1);
        }
        this.f29729c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f29728b;
        System.arraycopy(jArr, i16, jArr, i15, this.f29729c - i16);
        this.f29729c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        D(i15);
        long[] jArr = this.f29728b;
        long j15 = jArr[i15];
        jArr[i15] = jLongValue;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29729c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3
    public final /* bridge */ /* synthetic */ s3 u0(int i15) {
        if (i15 >= this.f29729c) {
            return new g4(Arrays.copyOf(this.f29728b, i15), this.f29729c, true);
        }
        throw new IllegalArgumentException();
    }

    private g4(long[] jArr, int i15, boolean z15) {
        super(z15);
        this.f29728b = jArr;
        this.f29729c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
