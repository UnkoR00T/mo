package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class i3 extends x0<Long> implements v2<Long>, f4, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i3 f31071d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f31072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31073c;

    static {
        i3 i3Var = new i3(new long[0], 0);
        f31071d = i3Var;
        i3Var.zzb();
    }

    i3() {
        this(new long[10], 0);
    }

    private final void h(int i15) {
        if (i15 < 0 || i15 >= this.f31073c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    private final String i(int i15) {
        int i16 = this.f31073c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        int i16;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i15 < 0 || i15 > (i16 = this.f31073c)) {
            throw new IndexOutOfBoundsException(i(i15));
        }
        long[] jArr = this.f31072b;
        if (i16 < jArr.length) {
            System.arraycopy(jArr, i15, jArr, i15 + 1, i16 - i15);
        } else {
            long[] jArr2 = new long[((i16 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            System.arraycopy(this.f31072b, i15, jArr2, i15 + 1, this.f31073c - i15);
            this.f31072b = jArr2;
        }
        this.f31072b[i15] = jLongValue;
        this.f31073c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        p2.d(collection);
        if (!(collection instanceof i3)) {
            return super.addAll(collection);
        }
        i3 i3Var = (i3) collection;
        int i15 = i3Var.f31073c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f31073c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        long[] jArr = this.f31072b;
        if (i17 > jArr.length) {
            this.f31072b = Arrays.copyOf(jArr, i17);
        }
        System.arraycopy(i3Var.f31072b, 0, this.f31072b, this.f31073c, i3Var.f31073c);
        this.f31073c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2<Long> b(int i15) {
        if (i15 >= this.f31073c) {
            return new i3(Arrays.copyOf(this.f31072b, i15), this.f31073c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return super.equals(obj);
        }
        i3 i3Var = (i3) obj;
        if (this.f31073c != i3Var.f31073c) {
            return false;
        }
        long[] jArr = i3Var.f31072b;
        for (int i15 = 0; i15 < this.f31073c; i15++) {
            if (this.f31072b[i15] != jArr[i15]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j15) {
        e();
        int i15 = this.f31073c;
        long[] jArr = this.f31072b;
        if (i15 == jArr.length) {
            long[] jArr2 = new long[((i15 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            this.f31072b = jArr2;
        }
        long[] jArr3 = this.f31072b;
        int i16 = this.f31073c;
        this.f31073c = i16 + 1;
        jArr3[i16] = j15;
    }

    public final long g(int i15) {
        h(i15);
        return this.f31072b[i15];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        return Long.valueOf(g(i15));
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i15 = 0; i15 < this.f31073c; i15++) {
            iB = (iB * 31) + p2.b(this.f31072b[i15]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f31072b[i15] == jLongValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        h(i15);
        long[] jArr = this.f31072b;
        long j15 = jArr[i15];
        int i16 = this.f31073c;
        if (i15 < i16 - 1) {
            System.arraycopy(jArr, i15 + 1, jArr, i15, (i16 - i15) - 1);
        }
        this.f31073c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f31072b;
        System.arraycopy(jArr, i16, jArr, i15, this.f31073c - i16);
        this.f31073c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        h(i15);
        long[] jArr = this.f31072b;
        long j15 = jArr[i15];
        jArr[i15] = jLongValue;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31073c;
    }

    private i3(long[] jArr, int i15) {
        this.f31072b = jArr;
        this.f31073c = i15;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
