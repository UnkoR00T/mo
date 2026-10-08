package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class f extends c<Boolean> implements a0.a, RandomAccess, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f36052d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f36053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36054c;

    static {
        f fVar = new f(new boolean[0], 0);
        f36052d = fVar;
        fVar.O();
    }

    f() {
        this(new boolean[10], 0);
    }

    private void h(int i15, boolean z15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f36054c)) {
            throw new IndexOutOfBoundsException(n(i15));
        }
        boolean[] zArr = this.f36053b;
        if (i16 < zArr.length) {
            System.arraycopy(zArr, i15, zArr, i15 + 1, i16 - i15);
        } else {
            boolean[] zArr2 = new boolean[((i16 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            System.arraycopy(this.f36053b, i15, zArr2, i15 + 1, this.f36054c - i15);
            this.f36053b = zArr2;
        }
        this.f36053b[i15] = z15;
        this.f36054c++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i15) {
        if (i15 < 0 || i15 >= this.f36054c) {
            throw new IndexOutOfBoundsException(n(i15));
        }
    }

    private String n(int i15) {
        return "Index:" + i15 + ", Size:" + this.f36054c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        e();
        a0.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i15 = fVar.f36054c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f36054c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        boolean[] zArr = this.f36053b;
        if (i17 > zArr.length) {
            this.f36053b = Arrays.copyOf(zArr, i17);
        }
        System.arraycopy(fVar.f36053b, 0, this.f36053b, this.f36054c, fVar.f36054c);
        this.f36054c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f36054c != fVar.f36054c) {
            return false;
        }
        boolean[] zArr = fVar.f36053b;
        for (int i15 = 0; i15 < this.f36054c; i15++) {
            if (this.f36053b[i15] != zArr[i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i15, Boolean bool) {
        h(i15, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        i(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i15 = 0; i15 < this.f36054c; i15++) {
            iC = (iC * 31) + a0.c(this.f36053b[i15]);
        }
        return iC;
    }

    public void i(boolean z15) {
        e();
        int i15 = this.f36054c;
        boolean[] zArr = this.f36053b;
        if (i15 == zArr.length) {
            boolean[] zArr2 = new boolean[((i15 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i15);
            this.f36053b = zArr2;
        }
        boolean[] zArr3 = this.f36053b;
        int i16 = this.f36054c;
        this.f36054c = i16 + 1;
        zArr3[i16] = z15;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f36053b[i15] == zBooleanValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i15) {
        return Boolean.valueOf(l(i15));
    }

    public boolean l(int i15) {
        j(i15);
        return this.f36053b[i15];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a0.a d0(int i15) {
        if (i15 >= this.f36054c) {
            return new f(Arrays.copyOf(this.f36053b, i15), this.f36054c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i15) {
        e();
        j(i15);
        boolean[] zArr = this.f36053b;
        boolean z15 = zArr[i15];
        int i16 = this.f36054c;
        if (i15 < i16 - 1) {
            System.arraycopy(zArr, i15 + 1, zArr, i15, (i16 - i15) - 1);
        }
        this.f36054c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z15);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f36053b;
        System.arraycopy(zArr, i16, zArr, i15, this.f36054c - i16);
        this.f36054c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i15, Boolean bool) {
        return Boolean.valueOf(t(i15, bool.booleanValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36054c;
    }

    public boolean t(int i15, boolean z15) {
        e();
        j(i15);
        boolean[] zArr = this.f36053b;
        boolean z16 = zArr[i15];
        zArr[i15] = z15;
        return z16;
    }

    private f(boolean[] zArr, int i15) {
        this.f36053b = zArr;
        this.f36054c = i15;
    }
}
