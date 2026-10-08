package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class i0 extends c<Long> implements z.e, RandomAccess, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i0 f11991d = new i0(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f11992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11993c;

    i0() {
        this(new long[10], 0, true);
    }

    private void h(int i15, long j15) {
        int i16;
        e();
        if (i15 < 0 || i15 > (i16 = this.f11993c)) {
            throw new IndexOutOfBoundsException(n(i15));
        }
        long[] jArr = this.f11992b;
        if (i16 < jArr.length) {
            System.arraycopy(jArr, i15, jArr, i15 + 1, i16 - i15);
        } else {
            long[] jArr2 = new long[((i16 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            System.arraycopy(this.f11992b, i15, jArr2, i15 + 1, this.f11993c - i15);
            this.f11992b = jArr2;
        }
        this.f11992b[i15] = j15;
        this.f11993c++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i15) {
        if (i15 < 0 || i15 >= this.f11993c) {
            throw new IndexOutOfBoundsException(n(i15));
        }
    }

    private String n(int i15) {
        return "Index:" + i15 + ", Size:" + this.f11993c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        e();
        z.a(collection);
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i15 = i0Var.f11993c;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.f11993c;
        if (Integer.MAX_VALUE - i16 < i15) {
            throw new OutOfMemoryError();
        }
        int i17 = i16 + i15;
        long[] jArr = this.f11992b;
        if (i17 > jArr.length) {
            this.f11992b = Arrays.copyOf(jArr, i17);
        }
        System.arraycopy(i0Var.f11992b, 0, this.f11992b, this.f11993c, i0Var.f11993c);
        this.f11993c = i17;
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
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.f11993c != i0Var.f11993c) {
            return false;
        }
        long[] jArr = i0Var.f11992b;
        for (int i15 = 0; i15 < this.f11993c; i15++) {
            if (this.f11992b[i15] != jArr[i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i15, Long l15) {
        h(i15, l15.longValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l15) {
        i(l15.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i15 = 0; i15 < this.f11993c; i15++) {
            iF = (iF * 31) + z.f(this.f11992b[i15]);
        }
        return iF;
    }

    public void i(long j15) {
        e();
        int i15 = this.f11993c;
        long[] jArr = this.f11992b;
        if (i15 == jArr.length) {
            long[] jArr2 = new long[((i15 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i15);
            this.f11992b = jArr2;
        }
        long[] jArr3 = this.f11992b;
        int i16 = this.f11993c;
        this.f11993c = i16 + 1;
        jArr3[i16] = j15;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f11992b[i15] == jLongValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long get(int i15) {
        return Long.valueOf(l(i15));
    }

    public long l(int i15) {
        j(i15);
        return this.f11992b[i15];
    }

    @Override // androidx.datastore.preferences.protobuf.z.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z.e d0(int i15) {
        if (i15 >= this.f11993c) {
            return new i0(Arrays.copyOf(this.f11992b, i15), this.f11993c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i15) {
        e();
        j(i15);
        long[] jArr = this.f11992b;
        long j15 = jArr[i15];
        int i16 = this.f11993c;
        if (i15 < i16 - 1) {
            System.arraycopy(jArr, i15 + 1, jArr, i15, (i16 - i15) - 1);
        }
        this.f11993c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j15);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i15, int i16) {
        e();
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11992b;
        System.arraycopy(jArr, i16, jArr, i15, this.f11993c - i16);
        this.f11993c -= i16 - i15;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long set(int i15, Long l15) {
        return Long.valueOf(t(i15, l15.longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11993c;
    }

    public long t(int i15, long j15) {
        e();
        j(i15);
        long[] jArr = this.f11992b;
        long j16 = jArr[i15];
        jArr[i15] = j15;
        return j16;
    }

    private i0(long[] jArr, int i15, boolean z15) {
        super(z15);
        this.f11992b = jArr;
        this.f11993c = i15;
    }
}
