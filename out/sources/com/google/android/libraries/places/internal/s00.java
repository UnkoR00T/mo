package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class s00 extends jx implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f33639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s00 f33640e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f33641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33642c;

    static {
        Object[] objArr = new Object[0];
        f33639d = objArr;
        f33640e = new s00(objArr, 0, false);
    }

    s00() {
        this(f33639d, 0, true);
    }

    private final void D(int i15) {
        if (i15 < 0 || i15 >= this.f33642c) {
            throw new IndexOutOfBoundsException(j(i15));
        }
    }

    public static s00 g() {
        return f33640e;
    }

    private static int i(int i15) {
        return Math.max(((i15 * 3) / 2) + 1, 10);
    }

    private final String j(int i15) {
        return mx.b(this.f33642c, i15, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.libraries.places.internal.iz
    public final /* bridge */ /* synthetic */ iz a0(int i15) {
        if (i15 >= this.f33642c) {
            return new s00(i15 == 0 ? f33639d : Arrays.copyOf(this.f33641b, i15), this.f33642c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i15, Object obj) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f33642c)) {
            throw new IndexOutOfBoundsException(j(i15));
        }
        int i17 = i15 + 1;
        Object[] objArr = this.f33641b;
        int length = objArr.length;
        if (i16 < length) {
            System.arraycopy(objArr, i15, objArr, i17, i16 - i15);
        } else {
            Object[] objArr2 = new Object[i(length)];
            System.arraycopy(this.f33641b, 0, objArr2, 0, i15);
            System.arraycopy(this.f33641b, i15, objArr2, i17, this.f33642c - i15);
            this.f33641b = objArr2;
        }
        this.f33641b[i15] = obj;
        this.f33642c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i15 = this.f33642c;
        if (i15 != list.size()) {
            return false;
        }
        if (!(obj instanceof s00)) {
            for (int i16 = 0; i16 < i15; i16++) {
                if (!this.f33641b[i16].equals(list.get(i16))) {
                    return false;
                }
            }
            return true;
        }
        s00 s00Var = (s00) obj;
        for (int i17 = 0; i17 < i15; i17++) {
            if (!this.f33641b[i17].equals(s00Var.f33641b[i17])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i15) {
        D(i15);
        return this.f33641b[i15];
    }

    final void h(int i15) {
        int length = this.f33641b.length;
        if (i15 <= length) {
            return;
        }
        if (length == 0) {
            this.f33641b = new Object[Math.max(i15, 10)];
            return;
        }
        while (length < i15) {
            length = i(length);
        }
        this.f33641b = Arrays.copyOf(this.f33641b, length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i15 = this.f33642c;
        int iHashCode = 1;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + this.f33641b[i16].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.libraries.places.internal.jx, java.util.AbstractList, java.util.List
    public final Object remove(int i15) {
        e();
        D(i15);
        Object[] objArr = this.f33641b;
        Object obj = objArr[i15];
        int i16 = this.f33642c;
        if (i15 < i16 - 1) {
            System.arraycopy(objArr, i15 + 1, objArr, i15, (i16 - i15) - 1);
        }
        this.f33642c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i15, Object obj) {
        e();
        D(i15);
        Object[] objArr = this.f33641b;
        Object obj2 = objArr[i15];
        objArr[i15] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33642c;
    }

    private s00(Object[] objArr, int i15, boolean z15) {
        super(z15);
        this.f33641b = objArr;
        this.f33642c = i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i15 = this.f33642c;
        int length = this.f33641b.length;
        if (i15 == length) {
            this.f33641b = Arrays.copyOf(this.f33641b, i(length));
        }
        Object[] objArr = this.f33641b;
        int i16 = this.f33642c;
        this.f33642c = i16 + 1;
        objArr[i16] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
