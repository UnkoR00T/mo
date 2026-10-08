package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class d1<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d1<Object> f11942d = new d1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E[] f11943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11944c;

    private d1(E[] eArr, int i15, boolean z15) {
        super(z15);
        this.f11943b = eArr;
        this.f11944c = i15;
    }

    private static <E> E[] f(int i15) {
        return (E[]) new Object[i15];
    }

    public static <E> d1<E> g() {
        return (d1<E>) f11942d;
    }

    private void h(int i15) {
        if (i15 < 0 || i15 >= this.f11944c) {
            throw new IndexOutOfBoundsException(i(i15));
        }
    }

    private String i(int i15) {
        return "Index:" + i15 + ", Size:" + this.f11944c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e15) {
        e();
        int i15 = this.f11944c;
        E[] eArr = this.f11943b;
        if (i15 == eArr.length) {
            this.f11943b = (E[]) Arrays.copyOf(eArr, ((i15 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f11943b;
        int i16 = this.f11944c;
        this.f11944c = i16 + 1;
        eArr2[i16] = e15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i15) {
        h(i15);
        return this.f11943b[i15];
    }

    @Override // androidx.datastore.preferences.protobuf.z.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public d1<E> d0(int i15) {
        if (i15 >= this.f11944c) {
            return new d1<>(Arrays.copyOf(this.f11943b, i15), this.f11944c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i15) {
        e();
        h(i15);
        E[] eArr = this.f11943b;
        E e15 = eArr[i15];
        int i16 = this.f11944c;
        if (i15 < i16 - 1) {
            System.arraycopy(eArr, i15 + 1, eArr, i15, (i16 - i15) - 1);
        }
        this.f11944c--;
        ((AbstractList) this).modCount++;
        return e15;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i15, E e15) {
        e();
        h(i15);
        E[] eArr = this.f11943b;
        E e16 = eArr[i15];
        eArr[i15] = e15;
        ((AbstractList) this).modCount++;
        return e16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11944c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i15, E e15) {
        int i16;
        e();
        if (i15 >= 0 && i15 <= (i16 = this.f11944c)) {
            E[] eArr = this.f11943b;
            if (i16 < eArr.length) {
                System.arraycopy(eArr, i15, eArr, i15 + 1, i16 - i15);
            } else {
                E[] eArr2 = (E[]) f(((i16 * 3) / 2) + 1);
                System.arraycopy(this.f11943b, 0, eArr2, 0, i15);
                System.arraycopy(this.f11943b, i15, eArr2, i15 + 1, this.f11944c - i15);
                this.f11943b = eArr2;
            }
            this.f11943b[i15] = e15;
            this.f11944c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i15));
    }
}
