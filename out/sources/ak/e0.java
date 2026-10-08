package ak;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class e0<T> extends n1<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super T>[] f6874a;

    e0(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f6874a = new Comparator[]{comparator, comparator2};
    }

    @Override // ak.n1, java.util.Comparator
    public int compare(T t15, T t16) {
        int i15 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f6874a;
            if (i15 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i15].compare(t15, t16);
            if (iCompare != 0) {
                return iCompare;
            }
            i15++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            return Arrays.equals(this.f6874a, ((e0) obj).f6874a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6874a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f6874a) + ")";
    }
}
