package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class y extends c<Integer> implements z.d, RandomAccess, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y f12222d = new y(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f12223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12224c;

    y() {
        this(new int[10], 0, true);
    }

    private void i(int i15, int i16) {
        int i17;
        e();
        if (i15 < 0 || i15 > (i17 = this.f12224c)) {
            throw new IndexOutOfBoundsException(n(i15));
        }
        int[] iArr = this.f12223b;
        if (i17 < iArr.length) {
            System.arraycopy(iArr, i15, iArr, i15 + 1, i17 - i15);
        } else {
            int[] iArr2 = new int[((i17 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            System.arraycopy(this.f12223b, i15, iArr2, i15 + 1, this.f12224c - i15);
            this.f12223b = iArr2;
        }
        this.f12223b[i15] = i16;
        this.f12224c++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i15) {
        if (i15 < 0 || i15 >= this.f12224c) {
            throw new IndexOutOfBoundsException(n(i15));
        }
    }

    private String n(int i15) {
        return "Index:" + i15 + ", Size:" + this.f12224c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        e();
        z.a(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i15 = yVar.f12224c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f12224c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        int[] iArr = this.f12223b;
        if (i17 > iArr.length) {
            this.f12223b = Arrays.copyOf(iArr, i17);
        }
        System.arraycopy(yVar.f12223b, 0, this.f12223b, this.f12224c, yVar.f12224c);
        this.f12224c = i17;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f12224c != yVar.f12224c) {
            return false;
        }
        int[] iArr = yVar.f12223b;
        for (int i15 = 0; i15 < this.f12224c; i15++) {
            if (this.f12223b[i15] != iArr[i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i15, Integer num) {
        i(i15, num.intValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        h(num.intValue());
        return true;
    }

    public void h(int i15) {
        e();
        int i16 = this.f12224c;
        int[] iArr = this.f12223b;
        if (i16 == iArr.length) {
            int[] iArr2 = new int[((i16 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i16);
            this.f12223b = iArr2;
        }
        int[] iArr3 = this.f12223b;
        int i17 = this.f12224c;
        this.f12224c = i17 + 1;
        iArr3[i17] = i15;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i15 = 1;
        for (int i16 = 0; i16 < this.f12224c; i16++) {
            i15 = (i15 * 31) + this.f12223b[i16];
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f12223b[i15] == iIntValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer get(int i15) {
        return Integer.valueOf(l(i15));
    }

    public int l(int i15) {
        j(i15);
        return this.f12223b[i15];
    }

    @Override // androidx.datastore.preferences.protobuf.z.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z.d d0(int i15) {
        if (i15 >= this.f12224c) {
            return new y(Arrays.copyOf(this.f12223b, i15), this.f12224c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i15) {
        e();
        j(i15);
        int[] iArr = this.f12223b;
        int i16 = iArr[i15];
        int i17 = this.f12224c;
        if (i15 < i17 - 1) {
            System.arraycopy(iArr, i15 + 1, iArr, i15, (i17 - i15) - 1);
        }
        this.f12224c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i16);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12223b;
        System.arraycopy(iArr, i16, iArr, i15, this.f12224c - i16);
        this.f12224c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer set(int i15, Integer num) {
        return Integer.valueOf(t(i15, num.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12224c;
    }

    public int t(int i15, int i16) {
        e();
        j(i15);
        int[] iArr = this.f12223b;
        int i17 = iArr[i15];
        iArr[i15] = i16;
        return i17;
    }

    private y(int[] iArr, int i15, boolean z15) {
        super(z15);
        this.f12223b = iArr;
        this.f12224c = i15;
    }
}
