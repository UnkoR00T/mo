package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class uz extends jx implements RandomAccess, hz, q00 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f33995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final uz f33996e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f33997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33998c;

    static {
        long[] jArr = new long[0];
        f33995d = jArr;
        f33996e = new uz(jArr, 0, false);
    }

    uz() {
        this(f33995d, 0, true);
    }

    public static uz h() {
        return f33996e;
    }

    private static int k(int i15) {
        return Math.max(((i15 * 3) / 2) + 1, 10);
    }

    private final void l(int i15) {
        if (i15 < 0 || i15 >= this.f33998c) {
            throw new IndexOutOfBoundsException(n(i15));
        }
    }

    private final String n(int i15) {
        return mx.b(this.f33998c, i15, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f33998c)) {
            throw new IndexOutOfBoundsException(n(i15));
        }
        int i17 = i15 + 1;
        long[] jArr = this.f33997b;
        int length = jArr.length;
        if (i16 < length) {
            System.arraycopy(jArr, i15, jArr, i17, i16 - i15);
        } else {
            long[] jArr2 = new long[k(length)];
            System.arraycopy(this.f33997b, 0, jArr2, 0, i15);
            System.arraycopy(this.f33997b, i15, jArr2, i17, this.f33998c - i15);
            this.f33997b = jArr2;
        }
        this.f33997b[i15] = jLongValue;
        this.f33998c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        collection.getClass();
        if (!(collection instanceof uz)) {
            return super.addAll(collection);
        }
        uz uzVar = (uz) collection;
        int i15 = uzVar.f33998c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f33998c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        long[] jArr = this.f33997b;
        if (i17 > jArr.length) {
            this.f33997b = Arrays.copyOf(jArr, i17);
        }
        System.arraycopy(uzVar.f33997b, 0, this.f33997b, this.f33998c, uzVar.f33998c);
        this.f33998c = i17;
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
        if (!(obj instanceof uz)) {
            return super.equals(obj);
        }
        uz uzVar = (uz) obj;
        if (this.f33998c != uzVar.f33998c) {
            return false;
        }
        long[] jArr = uzVar.f33997b;
        for (int i15 = 0; i15 < this.f33998c; i15++) {
            if (this.f33997b[i15] != jArr[i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.iz
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final hz a0(int i15) {
        if (i15 >= this.f33998c) {
            return new uz(i15 == 0 ? f33995d : Arrays.copyOf(this.f33997b, i15), this.f33998c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        l(i15);
        return Long.valueOf(this.f33997b[i15]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f33998c; i16++) {
            long j15 = this.f33997b[i16];
            byte[] bArr = jz.f32680a;
            i15 = (i15 * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
        return i15;
    }

    public final long i(int i15) {
        l(i15);
        return this.f33997b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i15 = this.f33998c;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f33997b[i16] == jLongValue) {
                return i16;
            }
        }
        return -1;
    }

    public final void j(long j15) {
        e();
        int i15 = this.f33998c;
        int length = this.f33997b.length;
        if (i15 == length) {
            long[] jArr = new long[k(length)];
            System.arraycopy(this.f33997b, 0, jArr, 0, this.f33998c);
            this.f33997b = jArr;
        }
        long[] jArr2 = this.f33997b;
        int i16 = this.f33998c;
        this.f33998c = i16 + 1;
        jArr2[i16] = j15;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i15) {
        e();
        l(i15);
        long[] jArr = this.f33997b;
        long j15 = jArr[i15];
        int i16 = this.f33998c;
        if (i15 < i16 - 1) {
            System.arraycopy(jArr, i15 + 1, jArr, i15, (i16 - i15) - 1);
        }
        this.f33998c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f33997b;
        System.arraycopy(jArr, i16, jArr, i15, this.f33998c - i16);
        this.f33998c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i15, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        l(i15);
        long[] jArr = this.f33997b;
        long j15 = jArr[i15];
        jArr[i15] = jLongValue;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33998c;
    }

    private uz(long[] jArr, int i15, boolean z15) {
        super(z15);
        this.f33997b = jArr;
        this.f33998c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Long) obj).longValue());
        return true;
    }
}
