package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class z1 extends t<Long> implements k1<Long>, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z1 f29608d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f29609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29610c;

    static {
        z1 z1Var = new z1();
        f29608d = z1Var;
        z1Var.J();
    }

    z1() {
        this(new long[10], 0);
    }

    private final void g(int i15) {
        if (i15 < 0 || i15 >= this.f29610c) {
            throw new IndexOutOfBoundsException(h(i15));
        }
    }

    private final String h(int i15) {
        int i16 = this.f29610c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    private final void i(int i15, long j15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f29610c)) {
            throw new IndexOutOfBoundsException(h(i15));
        }
        long[] jArr = this.f29609b;
        if (i16 < jArr.length) {
            System.arraycopy(jArr, i15, jArr, i15 + 1, i16 - i15);
        } else {
            long[] jArr2 = new long[((i16 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            System.arraycopy(this.f29609b, i15, jArr2, i15 + 1, this.f29610c - i15);
            this.f29609b = jArr2;
        }
        this.f29609b[i15] = j15;
        this.f29610c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1<Long> C1(int i15) {
        if (i15 >= this.f29610c) {
            return new z1(Arrays.copyOf(this.f29609b, i15), this.f29610c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        i(i15, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        h1.a(collection);
        if (!(collection instanceof z1)) {
            return super.addAll(collection);
        }
        z1 z1Var = (z1) collection;
        int i15 = z1Var.f29610c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f29610c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        long[] jArr = this.f29609b;
        if (i17 > jArr.length) {
            this.f29609b = Arrays.copyOf(jArr, i17);
        }
        System.arraycopy(z1Var.f29609b, 0, this.f29609b, this.f29610c, z1Var.f29610c);
        this.f29610c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return super.equals(obj);
        }
        z1 z1Var = (z1) obj;
        if (this.f29610c != z1Var.f29610c) {
            return false;
        }
        long[] jArr = z1Var.f29609b;
        for (int i15 = 0; i15 < this.f29610c; i15++) {
            if (this.f29609b[i15] != jArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i15) {
        g(i15);
        return this.f29609b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        return Long.valueOf(f(i15));
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iJ = 1;
        for (int i15 = 0; i15 < this.f29610c; i15++) {
            iJ = (iJ * 31) + h1.j(this.f29609b[i15]);
        }
        return iJ;
    }

    public final void j(long j15) {
        i(this.f29610c, j15);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        g(i15);
        long[] jArr = this.f29609b;
        long j15 = jArr[i15];
        int i16 = this.f29610c;
        if (i15 < i16 - 1) {
            System.arraycopy(jArr, i15 + 1, jArr, i15, i16 - i15);
        }
        this.f29610c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f29609b;
        System.arraycopy(jArr, i16, jArr, i15, this.f29610c - i16);
        this.f29610c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        g(i15);
        long[] jArr = this.f29609b;
        long j15 = jArr[i15];
        jArr[i15] = jLongValue;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29610c;
    }

    private z1(long[] jArr, int i15) {
        this.f29609b = jArr;
        this.f29610c = i15;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        for (int i15 = 0; i15 < this.f29610c; i15++) {
            if (obj.equals(Long.valueOf(this.f29609b[i15]))) {
                long[] jArr = this.f29609b;
                System.arraycopy(jArr, i15 + 1, jArr, i15, this.f29610c - i15);
                this.f29610c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
