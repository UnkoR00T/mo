package ak;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u0<E> extends l0<E> implements Set<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient n0<E> f6972b;

    public static class a<E> extends l0.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f6973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6974e;

        public a() {
            super(4);
        }

        private void j(E e15) {
            Objects.requireNonNull(this.f6973d);
            int length = this.f6973d.length - 1;
            int iHashCode = e15.hashCode();
            int iB = k0.b(iHashCode);
            while (true) {
                int i15 = iB & length;
                Object[] objArr = this.f6973d;
                Object obj = objArr[i15];
                if (obj == null) {
                    objArr[i15] = e15;
                    this.f6974e += iHashCode;
                    super.d(e15);
                    return;
                } else if (obj.equals(e15)) {
                    return;
                } else {
                    iB = i15 + 1;
                }
            }
        }

        @Override // ak.l0.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e15) {
            zj.p.q(e15);
            if (this.f6973d != null && u0.t(this.f6903b) <= this.f6973d.length) {
                j(e15);
                return this;
            }
            this.f6973d = null;
            super.d(e15);
            return this;
        }

        public a<E> i(Iterable<? extends E> iterable) {
            zj.p.q(iterable);
            if (this.f6973d == null) {
                super.b(iterable);
                return this;
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public u0<E> k() {
            u0<E> u0VarU;
            int i15 = this.f6903b;
            if (i15 == 0) {
                return u0.C();
            }
            if (i15 == 1) {
                Object obj = this.f6902a[0];
                Objects.requireNonNull(obj);
                return u0.E(obj);
            }
            if (this.f6973d == null || u0.t(i15) != this.f6973d.length) {
                u0VarU = u0.u(this.f6903b, this.f6902a);
                this.f6903b = u0VarU.size();
            } else {
                Object[] objArrCopyOf = u0.R(this.f6903b, this.f6902a.length) ? Arrays.copyOf(this.f6902a, this.f6903b) : this.f6902a;
                int i16 = this.f6974e;
                Object[] objArr = this.f6973d;
                u0VarU = new w1<>(objArrCopyOf, i16, objArr, objArr.length - 1, this.f6903b);
            }
            this.f6904c = true;
            this.f6973d = null;
            return u0VarU;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a<E> l(a<E> aVar) {
            if (this.f6973d == null) {
                f(aVar.f6902a, aVar.f6903b);
                return this;
            }
            for (int i15 = 0; i15 < aVar.f6903b; i15++) {
                Object obj = aVar.f6902a[i15];
                Objects.requireNonNull(obj);
                a(obj);
            }
            return this;
        }
    }

    u0() {
    }

    public static <E> u0<E> C() {
        return w1.f6998j;
    }

    public static <E> u0<E> E(E e15) {
        return new c2(e15);
    }

    public static <E> u0<E> F(E e15, E e16) {
        return u(2, e15, e16);
    }

    public static <E> u0<E> G(E e15, E e16, E e17) {
        return u(3, e15, e16, e17);
    }

    public static <E> u0<E> L(E e15, E e16, E e17, E e18) {
        return u(4, e15, e16, e17, e18);
    }

    public static <E> u0<E> M(E e15, E e16, E e17, E e18, E e19) {
        return u(5, e15, e16, e17, e18, e19);
    }

    @SafeVarargs
    public static <E> u0<E> Q(E e15, E e16, E e17, E e18, E e19, E e25, E... eArr) {
        zj.p.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e15;
        objArr[1] = e16;
        objArr[2] = e17;
        objArr[3] = e18;
        objArr[4] = e19;
        objArr[5] = e25;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return u(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean R(int i15, int i16) {
        return i15 < (i16 >> 1) + (i16 >> 2);
    }

    public static <E> a<E> s() {
        return new a<>();
    }

    static int t(int i15) {
        int iMax = Math.max(i15, 2);
        if (iMax >= 751619276) {
            zj.p.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> u0<E> u(int i15, Object... objArr) {
        if (i15 == 0) {
            return C();
        }
        if (i15 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return E(obj);
        }
        int iT = t(i15);
        Object[] objArr2 = new Object[iT];
        int i16 = iT - 1;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            Object objA = l1.a(objArr[i19], i19);
            int iHashCode = objA.hashCode();
            int iB = k0.b(iHashCode);
            while (true) {
                int i25 = iB & i16;
                Object obj2 = objArr2[i25];
                if (obj2 == null) {
                    objArr[i18] = objA;
                    objArr2[i25] = objA;
                    i17 += iHashCode;
                    i18++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i18, i15, (Object) null);
        if (i18 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new c2(obj3);
        }
        if (t(i18) < iT / 2) {
            return u(i18, objArr);
        }
        if (R(i18, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i18);
        }
        return new w1(objArr, i17, objArr2, i16, i18);
    }

    public static <E> u0<E> v(Collection<? extends E> collection) {
        if ((collection instanceof u0) && !(collection instanceof SortedSet)) {
            u0<E> u0Var = (u0) collection;
            if (!u0Var.j()) {
                return u0Var;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    public static <E> u0<E> w(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? u(eArr.length, (Object[]) eArr.clone()) : E(eArr[0]);
        }
        return C();
    }

    n0<E> A() {
        return n0.n(toArray());
    }

    boolean B() {
        return false;
    }

    @Override // ak.l0
    public n0<E> e() {
        n0<E> n0Var = this.f6972b;
        if (n0Var != null) {
            return n0Var;
        }
        n0<E> n0VarA = A();
        this.f6972b = n0VarA;
        return n0VarA;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u0) && B() && ((u0) obj).B() && hashCode() != obj.hashCode()) {
            return false;
        }
        return b2.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return b2.d(this);
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public abstract h2<E> iterator();
}
