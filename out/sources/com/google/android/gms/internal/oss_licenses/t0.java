package com.google.android.gms.internal.oss_licenses;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends m0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient p0 f30892b;

    t0() {
    }

    public static t0 j() {
        return b1.f30746j;
    }

    public static t0 k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return v(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
    }

    static int n(int i15) {
        int iMax = Math.max(i15, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static t0 o(Object[] objArr) {
        return v(objArr.length, (Object[]) objArr.clone());
    }

    private static t0 v(int i15, Object... objArr) {
        if (i15 == 0) {
            return b1.f30746j;
        }
        if (i15 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new d1(obj);
        }
        int iN = n(i15);
        Object[] objArr2 = new Object[iN];
        int i16 = iN - 1;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            Object obj2 = objArr[i19];
            if (obj2 == null) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(i19).length() + 9);
                sb5.append("at index ");
                sb5.append(i19);
                throw new NullPointerException(sb5.toString());
            }
            int iHashCode = obj2.hashCode();
            int iA = l0.a(iHashCode);
            while (true) {
                int i25 = iA & i16;
                Object obj3 = objArr2[i25];
                if (obj3 == null) {
                    objArr[i18] = obj2;
                    objArr2[i25] = obj2;
                    i17 += iHashCode;
                    i18++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i18, i15, (Object) null);
        if (i18 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new d1(obj4);
        }
        if (n(i18) < iN / 2) {
            return v(i18, objArr);
        }
        int length = objArr.length;
        if (i18 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i18);
        }
        return new b1(objArr, i17, objArr2, i16, i18);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && s() && ((t0) obj).s() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c1.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract e1 iterator();

    boolean s() {
        return false;
    }

    public final p0 t() {
        p0 p0Var = this.f30892b;
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0VarU = u();
        this.f30892b = p0VarU;
        return p0VarU;
    }

    p0 u() {
        Object[] array = toArray();
        int i15 = p0.f30862c;
        return p0.j(array, array.length);
    }
}
