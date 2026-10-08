package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class a5 extends v1 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a5 f29639d = new a5(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f29640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29641c;

    private a5(Object[] objArr, int i15, boolean z15) {
        super(z15);
        this.f29640b = objArr;
        this.f29641c = i15;
    }

    public static a5 f() {
        return f29639d;
    }

    private final String g(int i15) {
        return "Index:" + i15 + ", Size:" + this.f29641c;
    }

    private final void h(int i15) {
        if (i15 < 0 || i15 >= this.f29641c) {
            throw new IndexOutOfBoundsException(g(i15));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i15, Object obj) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f29641c)) {
            throw new IndexOutOfBoundsException(g(i15));
        }
        int i17 = i15 + 1;
        Object[] objArr = this.f29640b;
        if (i16 < objArr.length) {
            System.arraycopy(objArr, i15, objArr, i17, i16 - i15);
        } else {
            Object[] objArr2 = new Object[((i16 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i15);
            System.arraycopy(this.f29640b, i15, objArr2, i17, this.f29641c - i15);
            this.f29640b = objArr2;
        }
        this.f29640b[i15] = obj;
        this.f29641c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i15) {
        h(i15);
        return this.f29640b[i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, java.util.AbstractList, java.util.List
    public final Object remove(int i15) {
        e();
        h(i15);
        Object[] objArr = this.f29640b;
        Object obj = objArr[i15];
        int i16 = this.f29641c;
        if (i15 < i16 - 1) {
            System.arraycopy(objArr, i15 + 1, objArr, i15, (i16 - i15) - 1);
        }
        this.f29641c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i15, Object obj) {
        e();
        h(i15);
        Object[] objArr = this.f29640b;
        Object obj2 = objArr[i15];
        objArr[i15] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29641c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3
    public final /* bridge */ /* synthetic */ s3 u0(int i15) {
        if (i15 >= this.f29641c) {
            return new a5(Arrays.copyOf(this.f29640b, i15), this.f29641c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i15 = this.f29641c;
        Object[] objArr = this.f29640b;
        if (i15 == objArr.length) {
            this.f29640b = Arrays.copyOf(objArr, ((i15 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f29640b;
        int i16 = this.f29641c;
        this.f29641c = i16 + 1;
        objArr2[i16] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
