package ek;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f51761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f51762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f51763c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && g.k(this.f51761a, ((Integer) obj).intValue(), this.f51762b, this.f51763c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(int i15) {
            p.o(i15, size());
            return Integer.valueOf(this.f51761a[this.f51762b + i15]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i15 = 0; i15 < size; i15++) {
                if (this.f51761a[this.f51762b + i15] != aVar.f51761a[aVar.f51762b + i15]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer set(int i15, Integer num) {
            p.o(i15, size());
            int[] iArr = this.f51761a;
            int i16 = this.f51762b;
            int i17 = iArr[i16 + i15];
            iArr[i16 + i15] = ((Integer) p.q(num)).intValue();
            return Integer.valueOf(i17);
        }

        int[] g() {
            return Arrays.copyOfRange(this.f51761a, this.f51762b, this.f51763c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iJ = 1;
            for (int i15 = this.f51762b; i15 < this.f51763c; i15++) {
                iJ = (iJ * 31) + g.j(this.f51761a[i15]);
            }
            return iJ;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iK;
            if (!(obj instanceof Integer) || (iK = g.k(this.f51761a, ((Integer) obj).intValue(), this.f51762b, this.f51763c)) < 0) {
                return -1;
            }
            return iK - this.f51762b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iL;
            if (!(obj instanceof Integer) || (iL = g.l(this.f51761a, ((Integer) obj).intValue(), this.f51762b, this.f51763c)) < 0) {
                return -1;
            }
            return iL - this.f51762b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f51763c - this.f51762b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i15, int i16) {
            p.v(i15, i16, size());
            if (i15 == i16) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f51761a;
            int i17 = this.f51762b;
            return new a(iArr, i15 + i17, i17 + i16);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb5 = new StringBuilder(size() * 5);
            sb5.append('[');
            sb5.append(this.f51761a[this.f51762b]);
            int i15 = this.f51762b;
            while (true) {
                i15++;
                if (i15 >= this.f51763c) {
                    sb5.append(']');
                    return sb5.toString();
                }
                sb5.append(", ");
                sb5.append(this.f51761a[i15]);
            }
        }

        a(int[] iArr, int i15, int i16) {
            this.f51761a = iArr;
            this.f51762b = i15;
            this.f51763c = i16;
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    private static int d(long j15) {
        int i15 = (int) j15;
        p.k(j15 == ((long) i15), "the total number of elements (%s) in the arrays must fit in an int", j15);
        return i15;
    }

    public static int e(long j15) {
        int i15 = (int) j15;
        p.k(((long) i15) == j15, "Out of range: %s", j15);
        return i15;
    }

    public static int[] f(int[]... iArr) {
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int[] iArr3 = new int[d(length)];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int g(int i15, int i16, int i17) {
        p.i(i16 <= i17, "min (%s) must be less than or equal to max (%s)", i16, i17);
        return Math.min(Math.max(i15, i16), i17);
    }

    public static int h(byte[] bArr) {
        p.i(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return i(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int i(byte b15, byte b16, byte b17, byte b18) {
        return (b15 << 24) | ((b16 & 255) << 16) | ((b17 & 255) << 8) | (b18 & 255);
    }

    public static int j(int i15) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int[] iArr, int i15, int i16, int i17) {
        while (i16 < i17) {
            if (iArr[i16] == i15) {
                return i16;
            }
            i16++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int[] iArr, int i15, int i16, int i17) {
        for (int i18 = i17 - 1; i18 >= i16; i18--) {
            if (iArr[i18] == i15) {
                return i18;
            }
        }
        return -1;
    }

    public static int m(long j15) {
        if (j15 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j15 < -2147483648L ? PKIFailureInfo.systemUnavail : (int) j15;
    }

    public static int[] n(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            iArr[i15] = ((Number) p.q(array[i15])).intValue();
        }
        return iArr;
    }

    public static byte[] o(int i15) {
        return new byte[]{(byte) (i15 >> 24), (byte) (i15 >> 16), (byte) (i15 >> 8), (byte) i15};
    }

    public static Integer p(String str) {
        return q(str, 10);
    }

    public static Integer q(String str, int i15) {
        Long lE = i.e(str, i15);
        if (lE == null || lE.longValue() != lE.intValue()) {
            return null;
        }
        return Integer.valueOf(lE.intValue());
    }
}
