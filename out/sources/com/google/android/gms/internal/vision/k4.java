package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class k4<E> extends x0<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k4<Object> f31113d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E[] f31114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31115c;

    static {
        k4<Object> k4Var = new k4<>(new Object[0], 0);
        f31113d = k4Var;
        k4Var.zzb();
    }

    private k4(E[] eArr, int i15) {
        this.f31114b = eArr;
        this.f31115c = i15;
    }

    private final void f(int i15) {
        if (i15 < 0 || i15 >= this.f31115c) {
            throw new IndexOutOfBoundsException(g(i15));
        }
    }

    private final String g(int i15) {
        int i16 = this.f31115c;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("Index:");
        sb5.append(i15);
        sb5.append(", Size:");
        sb5.append(i16);
        return sb5.toString();
    }

    public static <E> k4<E> h() {
        return (k4<E>) f31113d;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e15) {
        e();
        int i15 = this.f31115c;
        E[] eArr = this.f31114b;
        if (i15 == eArr.length) {
            this.f31114b = (E[]) Arrays.copyOf(eArr, ((i15 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f31114b;
        int i16 = this.f31115c;
        this.f31115c = i16 + 1;
        eArr2[i16] = e15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2 b(int i15) {
        if (i15 >= this.f31115c) {
            return new k4(Arrays.copyOf(this.f31114b, i15), this.f31115c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i15) {
        f(i15);
        return this.f31114b[i15];
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final E remove(int i15) {
        e();
        f(i15);
        E[] eArr = this.f31114b;
        E e15 = eArr[i15];
        int i16 = this.f31115c;
        if (i15 < i16 - 1) {
            System.arraycopy(eArr, i15 + 1, eArr, i15, (i16 - i15) - 1);
        }
        this.f31115c--;
        ((AbstractList) this).modCount++;
        return e15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i15, E e15) {
        e();
        f(i15);
        E[] eArr = this.f31114b;
        E e16 = eArr[i15];
        eArr[i15] = e15;
        ((AbstractList) this).modCount++;
        return e16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31115c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i15, E e15) {
        int i16;
        e();
        if (i15 >= 0 && i15 <= (i16 = this.f31115c)) {
            E[] eArr = this.f31114b;
            if (i16 < eArr.length) {
                System.arraycopy(eArr, i15, eArr, i15 + 1, i16 - i15);
            } else {
                E[] eArr2 = (E[]) new Object[((i16 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i15);
                System.arraycopy(this.f31114b, i15, eArr2, i15 + 1, this.f31115c - i15);
                this.f31114b = eArr2;
            }
            this.f31114b[i15] = e15;
            this.f31115c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i15));
    }
}
