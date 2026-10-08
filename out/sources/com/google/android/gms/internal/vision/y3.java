package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class y3<T> implements l4<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f31339r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f31340s = i5.t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f31341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f31342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u3 f31345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f31348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f31349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f31350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f31352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b4 f31353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e3 f31354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c5<?, ?> f31355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a2<?> f31356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r3 f31357q;

    private y3(int[] iArr, Object[] objArr, int i15, int i16, u3 u3Var, boolean z15, boolean z16, int[] iArr2, int i17, int i18, b4 b4Var, e3 e3Var, c5<?, ?> c5Var, a2<?> a2Var, r3 r3Var) {
        this.f31341a = iArr;
        this.f31342b = objArr;
        this.f31343c = i15;
        this.f31344d = i16;
        this.f31347g = u3Var instanceof l2;
        this.f31348h = z15;
        this.f31346f = a2Var != null && a2Var.e(u3Var);
        this.f31349i = false;
        this.f31350j = iArr2;
        this.f31351k = i17;
        this.f31352l = i18;
        this.f31353m = b4Var;
        this.f31354n = e3Var;
        this.f31355o = c5Var;
        this.f31356p = a2Var;
        this.f31345e = u3Var;
        this.f31357q = r3Var;
    }

    private final boolean A(T t15, int i15, int i16, int i17, int i18) {
        if (i16 == 1048575) {
            return y(t15, i15);
        }
        return (i17 & i18) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean B(Object obj, int i15, l4 l4Var) {
        return l4Var.f(i5.F(obj, i15 & 1048575));
    }

    private static <T> double C(T t15, long j15) {
        return ((Double) i5.F(t15, j15)).doubleValue();
    }

    private final int D(int i15, int i16) {
        int length = (this.f31341a.length / 3) - 1;
        while (i16 <= length) {
            int i17 = (length + i16) >>> 1;
            int i18 = i17 * 3;
            int i19 = this.f31341a[i18];
            if (i15 == i19) {
                return i18;
            }
            if (i15 < i19) {
                length = i17 - 1;
            } else {
                i16 = i17 + 1;
            }
        }
        return -1;
    }

    private final Object E(int i15) {
        return this.f31342b[(i15 / 3) << 1];
    }

    private final void F(T t15, int i15) {
        int iO = O(i15);
        long j15 = 1048575 & iO;
        if (j15 == 1048575) {
            return;
        }
        i5.h(t15, j15, (1 << (iO >>> 20)) | i5.b(t15, j15));
    }

    private final void G(T t15, int i15, int i16) {
        i5.h(t15, O(i16) & 1048575, i15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void H(T t15, z5 z5Var) {
        Iterator itO;
        Map.Entry<?, ?> entry;
        int i15;
        if (this.f31346f) {
            e2<T> e2VarB = this.f31356p.b(t15);
            if (e2VarB.f31003a.isEmpty()) {
                itO = null;
                entry = null;
            } else {
                itO = e2VarB.o();
                entry = (Map.Entry) itO.next();
            }
        } else {
            itO = null;
            entry = null;
        }
        int length = this.f31341a.length;
        Unsafe unsafe = f31340s;
        int i16 = 1048575;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18 += 3) {
            int iM = M(i18);
            int[] iArr = this.f31341a;
            int i19 = iArr[i18];
            int i25 = (iM & 267386880) >>> 20;
            if (i25 <= 17) {
                int i26 = iArr[i18 + 2];
                int i27 = i26 & 1048575;
                if (i27 != i16) {
                    i17 = unsafe.getInt(t15, i27);
                    i16 = i27;
                }
                i15 = 1 << (i26 >>> 20);
            } else {
                i15 = 0;
            }
            while (entry != null && this.f31356p.a(entry) <= i19) {
                this.f31356p.d(z5Var, entry);
                entry = itO.hasNext() ? (Map.Entry) itO.next() : null;
            }
            long j15 = iM & 1048575;
            switch (i25) {
                case 0:
                    if ((i17 & i15) != 0) {
                        z5Var.q(i19, i5.C(t15, j15));
                        continue;
                    }
                    break;
                case 1:
                    if ((i17 & i15) != 0) {
                        z5Var.r(i19, i5.x(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    if ((i17 & i15) != 0) {
                        z5Var.o(i19, unsafe.getLong(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    if ((i17 & i15) != 0) {
                        z5Var.a(i19, unsafe.getLong(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if ((i17 & i15) != 0) {
                        z5Var.l(i19, unsafe.getInt(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    if ((i17 & i15) != 0) {
                        z5Var.w(i19, unsafe.getLong(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    if ((i17 & i15) != 0) {
                        z5Var.v(i19, unsafe.getInt(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    if ((i17 & i15) != 0) {
                        z5Var.z(i19, i5.w(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    if ((i17 & i15) != 0) {
                        u(i19, unsafe.getObject(t15, j15), z5Var);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    if ((i17 & i15) != 0) {
                        z5Var.L(i19, unsafe.getObject(t15, j15), p(i18));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    if ((i17 & i15) != 0) {
                        z5Var.I(i19, (e1) unsafe.getObject(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    if ((i17 & i15) != 0) {
                        z5Var.x(i19, unsafe.getInt(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    if ((i17 & i15) != 0) {
                        z5Var.i(i19, unsafe.getInt(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    if ((i17 & i15) != 0) {
                        z5Var.k(i19, unsafe.getInt(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    if ((i17 & i15) != 0) {
                        z5Var.h(i19, unsafe.getLong(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    if ((i17 & i15) != 0) {
                        z5Var.s(i19, unsafe.getInt(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    if ((i17 & i15) != 0) {
                        z5Var.H(i19, unsafe.getLong(t15, j15));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    if ((i17 & i15) != 0) {
                        z5Var.M(i19, unsafe.getObject(t15, j15), p(i18));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    m4.l(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 19:
                    m4.y(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 20:
                    m4.C(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 21:
                    m4.G(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 22:
                    m4.T(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 23:
                    m4.N(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 24:
                    m4.a0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 25:
                    m4.d0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 26:
                    m4.j(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var);
                    break;
                case 27:
                    m4.k(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, p(i18));
                    break;
                case 28:
                    m4.w(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var);
                    break;
                case 29:
                    m4.W(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 30:
                    m4.c0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case BERTags.DATE /* 31 */:
                    m4.b0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 32:
                    m4.Q(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 33:
                    m4.Z(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 34:
                    m4.K(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, false);
                    continue;
                    break;
                case 35:
                    m4.l(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case 36:
                    m4.y(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    m4.C(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    m4.G(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    m4.T(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case 40:
                    m4.N(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    m4.a0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    m4.d0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    m4.W(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    m4.c0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    m4.b0(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case 46:
                    m4.Q(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case 47:
                    m4.Z(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case 48:
                    m4.K(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, true);
                    break;
                case 49:
                    m4.x(this.f31341a[i18], (List) unsafe.getObject(t15, j15), z5Var, p(i18));
                    break;
                case 50:
                    w(z5Var, i19, unsafe.getObject(t15, j15), i18);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i19, i18)) {
                        z5Var.q(i19, C(t15, j15));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i19, i18)) {
                        z5Var.r(i19, J(t15, j15));
                    }
                    break;
                case 53:
                    if (z(t15, i19, i18)) {
                        z5Var.o(i19, P(t15, j15));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i19, i18)) {
                        z5Var.a(i19, P(t15, j15));
                    }
                    break;
                case 55:
                    if (z(t15, i19, i18)) {
                        z5Var.l(i19, N(t15, j15));
                    }
                    break;
                case 56:
                    if (z(t15, i19, i18)) {
                        z5Var.w(i19, P(t15, j15));
                    }
                    break;
                case 57:
                    if (z(t15, i19, i18)) {
                        z5Var.v(i19, N(t15, j15));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i19, i18)) {
                        z5Var.z(i19, R(t15, j15));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i19, i18)) {
                        u(i19, unsafe.getObject(t15, j15), z5Var);
                    }
                    break;
                case 60:
                    if (z(t15, i19, i18)) {
                        z5Var.L(i19, unsafe.getObject(t15, j15), p(i18));
                    }
                    break;
                case 61:
                    if (z(t15, i19, i18)) {
                        z5Var.I(i19, (e1) unsafe.getObject(t15, j15));
                    }
                    break;
                case 62:
                    if (z(t15, i19, i18)) {
                        z5Var.x(i19, N(t15, j15));
                    }
                    break;
                case 63:
                    if (z(t15, i19, i18)) {
                        z5Var.i(i19, N(t15, j15));
                    }
                    break;
                case 64:
                    if (z(t15, i19, i18)) {
                        z5Var.k(i19, N(t15, j15));
                    }
                    break;
                case 65:
                    if (z(t15, i19, i18)) {
                        z5Var.h(i19, P(t15, j15));
                    }
                    break;
                case 66:
                    if (z(t15, i19, i18)) {
                        z5Var.s(i19, N(t15, j15));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i19, i18)) {
                        z5Var.H(i19, P(t15, j15));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i19, i18)) {
                        z5Var.M(i19, unsafe.getObject(t15, j15), p(i18));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f31356p.d(z5Var, entry);
            entry = itO.hasNext() ? (Map.Entry) itO.next() : null;
        }
        v(this.f31355o, t15, z5Var);
    }

    private final void I(T t15, T t16, int i15) {
        int iM = M(i15);
        int i16 = this.f31341a[i15];
        long j15 = iM & 1048575;
        if (z(t16, i16, i15)) {
            Object objF = z(t15, i16, i15) ? i5.F(t15, j15) : null;
            Object objF2 = i5.F(t16, j15);
            if (objF != null && objF2 != null) {
                i5.j(t15, j15, p2.e(objF, objF2));
                G(t15, i16, i15);
            } else if (objF2 != null) {
                i5.j(t15, j15, objF2);
                G(t15, i16, i15);
            }
        }
    }

    private static <T> float J(T t15, long j15) {
        return ((Float) i5.F(t15, j15)).floatValue();
    }

    private final q2 K(int i15) {
        return (q2) this.f31342b[((i15 / 3) << 1) + 1];
    }

    private final boolean L(T t15, T t16, int i15) {
        return y(t15, i15) == y(t16, i15);
    }

    private final int M(int i15) {
        return this.f31341a[i15 + 1];
    }

    private static <T> int N(T t15, long j15) {
        return ((Integer) i5.F(t15, j15)).intValue();
    }

    private final int O(int i15) {
        return this.f31341a[i15 + 2];
    }

    private static <T> long P(T t15, long j15) {
        return ((Long) i5.F(t15, j15)).longValue();
    }

    private static f5 Q(Object obj) {
        l2 l2Var = (l2) obj;
        f5 f5Var = l2Var.zzb;
        if (f5Var != f5.a()) {
            return f5Var;
        }
        f5 f5VarG = f5.g();
        l2Var.zzb = f5VarG;
        return f5VarG;
    }

    private static <T> boolean R(T t15, long j15) {
        return ((Boolean) i5.F(t15, j15)).booleanValue();
    }

    private final int S(int i15) {
        if (i15 < this.f31343c || i15 > this.f31344d) {
            return -1;
        }
        return D(i15, 0);
    }

    private final int i(int i15, int i16) {
        if (i15 < this.f31343c || i15 > this.f31344d) {
            return -1;
        }
        return D(i15, i16);
    }

    private static <UT, UB> int j(c5<UT, UB> c5Var, T t15) {
        return c5Var.l(c5Var.f(t15));
    }

    private final int k(T t15, byte[] bArr, int i15, int i16, int i17, int i18, int i19, int i25, int i26, long j15, int i27, a1 a1Var) throws u2 {
        int i28;
        int i29;
        int iK;
        Object object;
        Unsafe unsafe = f31340s;
        long j16 = this.f31341a[i27 + 2] & 1048575;
        switch (i26) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                i28 = i15;
                if (i19 != 1) {
                    return i28;
                }
                unsafe.putObject(t15, j15, Double.valueOf(z0.m(bArr, i15)));
                iK = i28 + 8;
                unsafe.putInt(t15, j16, i18);
                return iK;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                i29 = i15;
                if (i19 != 5) {
                    return i29;
                }
                unsafe.putObject(t15, j15, Float.valueOf(z0.o(bArr, i15)));
                iK = i29 + 4;
                unsafe.putInt(t15, j16, i18);
                return iK;
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i19 != 0) {
                    return i15;
                }
                iK = z0.k(bArr, i15, a1Var);
                unsafe.putObject(t15, j15, Long.valueOf(a1Var.f30956b));
                unsafe.putInt(t15, j16, i18);
                return iK;
            case 55:
            case 62:
                if (i19 != 0) {
                    return i15;
                }
                iK = z0.i(bArr, i15, a1Var);
                unsafe.putObject(t15, j15, Integer.valueOf(a1Var.f30955a));
                unsafe.putInt(t15, j16, i18);
                return iK;
            case 56:
            case 65:
                i28 = i15;
                if (i19 != 1) {
                    return i28;
                }
                unsafe.putObject(t15, j15, Long.valueOf(z0.l(bArr, i15)));
                iK = i28 + 8;
                unsafe.putInt(t15, j16, i18);
                return iK;
            case 57:
            case 64:
                i29 = i15;
                if (i19 != 5) {
                    return i29;
                }
                unsafe.putObject(t15, j15, Integer.valueOf(z0.h(bArr, i15)));
                iK = i29 + 4;
                unsafe.putInt(t15, j16, i18);
                return iK;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i19 != 0) {
                    return i15;
                }
                iK = z0.k(bArr, i15, a1Var);
                unsafe.putObject(t15, j15, Boolean.valueOf(a1Var.f30956b != 0));
                unsafe.putInt(t15, j16, i18);
                return iK;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i19 != 2) {
                    return i15;
                }
                int i35 = z0.i(bArr, i15, a1Var);
                int i36 = a1Var.f30955a;
                if (i36 == 0) {
                    unsafe.putObject(t15, j15, "");
                } else {
                    if ((i25 & PKIFailureInfo.duplicateCertReq) != 0 && !l5.g(bArr, i35, i35 + i36)) {
                        throw u2.f();
                    }
                    unsafe.putObject(t15, j15, new String(bArr, i35, i36, p2.f31222a));
                    i35 += i36;
                }
                unsafe.putInt(t15, j16, i18);
                return i35;
            case 60:
                if (i19 != 2) {
                    return i15;
                }
                int iG = z0.g(p(i27), bArr, i15, i16, a1Var);
                object = unsafe.getInt(t15, j16) == i18 ? unsafe.getObject(t15, j15) : null;
                if (object == null) {
                    unsafe.putObject(t15, j15, a1Var.f30957c);
                } else {
                    unsafe.putObject(t15, j15, p2.e(object, a1Var.f30957c));
                }
                unsafe.putInt(t15, j16, i18);
                return iG;
            case 61:
                if (i19 != 2) {
                    return i15;
                }
                iK = z0.q(bArr, i15, a1Var);
                unsafe.putObject(t15, j15, a1Var.f30957c);
                unsafe.putInt(t15, j16, i18);
                return iK;
            case 63:
                if (i19 != 0) {
                    return i15;
                }
                int i37 = z0.i(bArr, i15, a1Var);
                int i38 = a1Var.f30955a;
                q2 q2VarK = K(i27);
                if (q2VarK != null && !q2VarK.b(i38)) {
                    Q(t15).c(i17, Long.valueOf(i38));
                    return i37;
                }
                unsafe.putObject(t15, j15, Integer.valueOf(i38));
                iK = i37;
                unsafe.putInt(t15, j16, i18);
                return iK;
            case 66:
                if (i19 != 0) {
                    return i15;
                }
                iK = z0.i(bArr, i15, a1Var);
                unsafe.putObject(t15, j15, Integer.valueOf(r1.d(a1Var.f30955a)));
                unsafe.putInt(t15, j16, i18);
                return iK;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i19 != 0) {
                    return i15;
                }
                iK = z0.k(bArr, i15, a1Var);
                unsafe.putObject(t15, j15, Long.valueOf(r1.a(a1Var.f30956b)));
                unsafe.putInt(t15, j16, i18);
                return iK;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i19 == 3) {
                    iK = z0.f(p(i27), bArr, i15, i16, (i17 & (-8)) | 4, a1Var);
                    object = unsafe.getInt(t15, j16) == i18 ? unsafe.getObject(t15, j15) : null;
                    if (object == null) {
                        unsafe.putObject(t15, j15, a1Var.f30957c);
                    } else {
                        unsafe.putObject(t15, j15, p2.e(object, a1Var.f30957c));
                    }
                    unsafe.putInt(t15, j16, i18);
                    return iK;
                }
            default:
                return i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int l(T t15, byte[] bArr, int i15, int i16, int i17, int i18, int i19, int i25, long j15, int i26, long j16, a1 a1Var) throws u2 {
        int i27;
        int i28;
        int iB;
        Unsafe unsafe = f31340s;
        v2 v2VarB = (v2) unsafe.getObject(t15, j16);
        if (!v2VarB.zza()) {
            int size = v2VarB.size();
            v2VarB = v2VarB.b(size == 0 ? 10 : size << 1);
            unsafe.putObject(t15, j16, v2VarB);
        }
        v2 v2Var = v2VarB;
        switch (i26) {
            case 18:
            case 35:
                if (i19 == 2) {
                    x1 x1Var = (x1) v2Var;
                    int i29 = z0.i(bArr, i15, a1Var);
                    int i35 = a1Var.f30955a + i29;
                    while (i29 < i35) {
                        x1Var.f(z0.m(bArr, i29));
                        i29 += 8;
                    }
                    if (i29 == i35) {
                        return i29;
                    }
                    throw u2.a();
                }
                if (i19 != 1) {
                    return i15;
                }
                x1 x1Var2 = (x1) v2Var;
                x1Var2.f(z0.m(bArr, i15));
                int i36 = i15 + 8;
                while (i36 < i16) {
                    int i37 = z0.i(bArr, i36, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return i36;
                    }
                    x1Var2.f(z0.m(bArr, i37));
                    i36 = i37 + 8;
                }
                return i36;
            case 19:
            case 36:
                if (i19 == 2) {
                    k2 k2Var = (k2) v2Var;
                    int i38 = z0.i(bArr, i15, a1Var);
                    int i39 = a1Var.f30955a + i38;
                    while (i38 < i39) {
                        k2Var.f(z0.o(bArr, i38));
                        i38 += 4;
                    }
                    if (i38 == i39) {
                        return i38;
                    }
                    throw u2.a();
                }
                if (i19 != 5) {
                    return i15;
                }
                k2 k2Var2 = (k2) v2Var;
                k2Var2.f(z0.o(bArr, i15));
                int i45 = i15 + 4;
                while (i45 < i16) {
                    int i46 = z0.i(bArr, i45, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return i45;
                    }
                    k2Var2.f(z0.o(bArr, i46));
                    i45 = i46 + 4;
                }
                return i45;
            case 20:
            case 21:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                if (i19 == 2) {
                    i3 i3Var = (i3) v2Var;
                    int i47 = z0.i(bArr, i15, a1Var);
                    int i48 = a1Var.f30955a + i47;
                    while (i47 < i48) {
                        i47 = z0.k(bArr, i47, a1Var);
                        i3Var.f(a1Var.f30956b);
                    }
                    if (i47 == i48) {
                        return i47;
                    }
                    throw u2.a();
                }
                if (i19 != 0) {
                    return i15;
                }
                i3 i3Var2 = (i3) v2Var;
                int iK = z0.k(bArr, i15, a1Var);
                i3Var2.f(a1Var.f30956b);
                while (iK < i16) {
                    int i49 = z0.i(bArr, iK, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return iK;
                    }
                    iK = z0.k(bArr, i49, a1Var);
                    i3Var2.f(a1Var.f30956b);
                }
                return iK;
            case 22:
            case 29:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                if (i19 == 2) {
                    return z0.j(bArr, i15, v2Var, a1Var);
                }
                return i19 == 0 ? z0.b(i17, bArr, i15, i16, v2Var, a1Var) : i15;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    i3 i3Var3 = (i3) v2Var;
                    int i55 = z0.i(bArr, i15, a1Var);
                    int i56 = a1Var.f30955a + i55;
                    while (i55 < i56) {
                        i3Var3.f(z0.l(bArr, i55));
                        i55 += 8;
                    }
                    if (i55 == i56) {
                        return i55;
                    }
                    throw u2.a();
                }
                if (i19 != 1) {
                    return i15;
                }
                i3 i3Var4 = (i3) v2Var;
                i3Var4.f(z0.l(bArr, i15));
                int i57 = i15 + 8;
                while (i57 < i16) {
                    int i58 = z0.i(bArr, i57, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return i57;
                    }
                    i3Var4.f(z0.l(bArr, i58));
                    i57 = i58 + 8;
                }
                return i57;
            case 24:
            case BERTags.DATE /* 31 */:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                if (i19 == 2) {
                    n2 n2Var = (n2) v2Var;
                    int i59 = z0.i(bArr, i15, a1Var);
                    int i65 = a1Var.f30955a + i59;
                    while (i59 < i65) {
                        n2Var.g(z0.h(bArr, i59));
                        i59 += 4;
                    }
                    if (i59 == i65) {
                        return i59;
                    }
                    throw u2.a();
                }
                if (i19 != 5) {
                    return i15;
                }
                n2 n2Var2 = (n2) v2Var;
                n2Var2.g(z0.h(bArr, i15));
                int i66 = i15 + 4;
                while (i66 < i16) {
                    int i67 = z0.i(bArr, i66, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return i66;
                    }
                    n2Var2.g(z0.h(bArr, i67));
                    i66 = i67 + 4;
                }
                return i66;
            case 25:
            case EACTags.CURRENCY_CODE /* 42 */:
                if (i19 == 2) {
                    c1 c1Var = (c1) v2Var;
                    int i68 = z0.i(bArr, i15, a1Var);
                    int i69 = a1Var.f30955a + i68;
                    while (i68 < i69) {
                        i68 = z0.k(bArr, i68, a1Var);
                        c1Var.f(a1Var.f30956b != 0);
                    }
                    if (i68 == i69) {
                        return i68;
                    }
                    throw u2.a();
                }
                if (i19 != 0) {
                    return i15;
                }
                c1 c1Var2 = (c1) v2Var;
                int iK2 = z0.k(bArr, i15, a1Var);
                c1Var2.f(a1Var.f30956b != 0);
                while (iK2 < i16) {
                    int i75 = z0.i(bArr, iK2, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return iK2;
                    }
                    iK2 = z0.k(bArr, i75, a1Var);
                    c1Var2.f(a1Var.f30956b != 0);
                }
                return iK2;
            case 26:
                if (i19 != 2) {
                    return i15;
                }
                if ((j15 & 536870912) == 0) {
                    int i76 = z0.i(bArr, i15, a1Var);
                    int i77 = a1Var.f30955a;
                    if (i77 < 0) {
                        throw u2.b();
                    }
                    if (i77 == 0) {
                        v2Var.add("");
                    } else {
                        v2Var.add(new String(bArr, i76, i77, p2.f31222a));
                        i76 += i77;
                    }
                    while (i76 < i16) {
                        int i78 = z0.i(bArr, i76, a1Var);
                        if (i17 != a1Var.f30955a) {
                            return i76;
                        }
                        i76 = z0.i(bArr, i78, a1Var);
                        int i79 = a1Var.f30955a;
                        if (i79 < 0) {
                            throw u2.b();
                        }
                        if (i79 == 0) {
                            v2Var.add("");
                        } else {
                            v2Var.add(new String(bArr, i76, i79, p2.f31222a));
                            i76 += i79;
                        }
                    }
                    return i76;
                }
                int i85 = z0.i(bArr, i15, a1Var);
                int i86 = a1Var.f30955a;
                if (i86 < 0) {
                    throw u2.b();
                }
                if (i86 == 0) {
                    v2Var.add("");
                } else {
                    int i87 = i85 + i86;
                    if (!l5.g(bArr, i85, i87)) {
                        throw u2.f();
                    }
                    v2Var.add(new String(bArr, i85, i86, p2.f31222a));
                    i85 = i87;
                }
                while (i85 < i16) {
                    int i88 = z0.i(bArr, i85, a1Var);
                    if (i17 != a1Var.f30955a) {
                        return i85;
                    }
                    i85 = z0.i(bArr, i88, a1Var);
                    int i89 = a1Var.f30955a;
                    if (i89 < 0) {
                        throw u2.b();
                    }
                    if (i89 == 0) {
                        v2Var.add("");
                    } else {
                        int i95 = i85 + i89;
                        if (!l5.g(bArr, i85, i95)) {
                            throw u2.f();
                        }
                        v2Var.add(new String(bArr, i85, i89, p2.f31222a));
                        i85 = i95;
                    }
                }
                return i85;
            case 27:
                i27 = i15;
                if (i19 == 2) {
                    return z0.e(p(i25), i17, bArr, i27, i16, v2Var, a1Var);
                }
                return i27;
            case 28:
                i27 = i15;
                if (i19 == 2) {
                    int i96 = z0.i(bArr, i27, a1Var);
                    int i97 = a1Var.f30955a;
                    if (i97 < 0) {
                        throw u2.b();
                    }
                    if (i97 > bArr.length - i96) {
                        throw u2.a();
                    }
                    if (i97 == 0) {
                        v2Var.add(e1.f30998b);
                    } else {
                        v2Var.add(e1.k(bArr, i96, i97));
                        i96 += i97;
                    }
                    while (i96 < i16) {
                        int i98 = z0.i(bArr, i96, a1Var);
                        if (i17 != a1Var.f30955a) {
                            return i96;
                        }
                        i96 = z0.i(bArr, i98, a1Var);
                        int i99 = a1Var.f30955a;
                        if (i99 < 0) {
                            throw u2.b();
                        }
                        if (i99 > bArr.length - i96) {
                            throw u2.a();
                        }
                        if (i99 == 0) {
                            v2Var.add(e1.f30998b);
                        } else {
                            v2Var.add(e1.k(bArr, i96, i99));
                            i96 += i99;
                        }
                    }
                    return i96;
                }
                return i27;
            case 30:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                i28 = i15;
                if (i19 != 2) {
                    if (i19 == 0) {
                        iB = z0.b(i17, bArr, i28, i16, v2Var, a1Var);
                    }
                    return i28;
                }
                iB = z0.j(bArr, i28, v2Var, a1Var);
                l2 l2Var = (l2) t15;
                f5 f5Var = l2Var.zzb;
                if (f5Var == f5.a()) {
                    f5Var = null;
                }
                f5 f5Var2 = (f5) m4.i(i18, v2Var, K(i25), f5Var, this.f31355o);
                if (f5Var2 != null) {
                    l2Var.zzb = f5Var2;
                }
                return iB;
            case 33:
            case 47:
                i28 = i15;
                if (i19 == 2) {
                    n2 n2Var3 = (n2) v2Var;
                    int i100 = z0.i(bArr, i28, a1Var);
                    int i101 = a1Var.f30955a + i100;
                    while (i100 < i101) {
                        i100 = z0.i(bArr, i100, a1Var);
                        n2Var3.g(r1.d(a1Var.f30955a));
                    }
                    if (i100 == i101) {
                        return i100;
                    }
                    throw u2.a();
                }
                if (i19 == 0) {
                    n2 n2Var4 = (n2) v2Var;
                    int i102 = z0.i(bArr, i28, a1Var);
                    n2Var4.g(r1.d(a1Var.f30955a));
                    while (i102 < i16) {
                        int i103 = z0.i(bArr, i102, a1Var);
                        if (i17 != a1Var.f30955a) {
                            return i102;
                        }
                        i102 = z0.i(bArr, i103, a1Var);
                        n2Var4.g(r1.d(a1Var.f30955a));
                    }
                    return i102;
                }
                return i28;
            case 34:
            case 48:
                i28 = i15;
                if (i19 == 2) {
                    i3 i3Var5 = (i3) v2Var;
                    int i104 = z0.i(bArr, i28, a1Var);
                    int i105 = a1Var.f30955a + i104;
                    while (i104 < i105) {
                        i104 = z0.k(bArr, i104, a1Var);
                        i3Var5.f(r1.a(a1Var.f30956b));
                    }
                    if (i104 == i105) {
                        return i104;
                    }
                    throw u2.a();
                }
                if (i19 == 0) {
                    i3 i3Var6 = (i3) v2Var;
                    int iK3 = z0.k(bArr, i28, a1Var);
                    i3Var6.f(r1.a(a1Var.f30956b));
                    while (iK3 < i16) {
                        int i106 = z0.i(bArr, iK3, a1Var);
                        if (i17 != a1Var.f30955a) {
                            return iK3;
                        }
                        iK3 = z0.k(bArr, i106, a1Var);
                        i3Var6.f(r1.a(a1Var.f30956b));
                    }
                    return iK3;
                }
                return i28;
            case 49:
                if (i19 == 3) {
                    l4 l4VarP = p(i25);
                    int i107 = (i17 & (-8)) | 4;
                    int iF = z0.f(l4VarP, bArr, i15, i16, i107, a1Var);
                    l4 l4Var = l4VarP;
                    int i108 = i16;
                    a1 a1Var2 = a1Var;
                    v2Var.add(a1Var2.f30957c);
                    while (iF < i108) {
                        int i109 = z0.i(bArr, iF, a1Var2);
                        if (i17 != a1Var2.f30955a) {
                            return iF;
                        }
                        l4 l4Var2 = l4Var;
                        int i110 = i108;
                        a1 a1Var3 = a1Var2;
                        iF = z0.f(l4Var2, bArr, i109, i110, i107, a1Var3);
                        v2Var.add(a1Var3.f30957c);
                        l4Var = l4Var2;
                        i108 = i110;
                        a1Var2 = a1Var3;
                    }
                    return iF;
                }
            default:
                return i15;
        }
    }

    private final <K, V> int m(T t15, byte[] bArr, int i15, int i16, int i17, long j15, a1 a1Var) throws u2 {
        Unsafe unsafe = f31340s;
        Object objE = E(i17);
        Object object = unsafe.getObject(t15, j15);
        if (this.f31357q.f(object)) {
            Object objU = this.f31357q.u(objE);
            this.f31357q.g(objU, object);
            unsafe.putObject(t15, j15, objU);
            object = objU;
        }
        this.f31357q.c(objE);
        this.f31357q.b(object);
        int i18 = z0.i(bArr, i15, a1Var);
        int i19 = a1Var.f30955a;
        if (i19 < 0 || i19 > i16 - i18) {
            throw u2.a();
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0274  */
    /* JADX WARN: Code duplicated, block: B:127:0x0278  */
    /* JADX WARN: Code duplicated, block: B:130:0x0292  */
    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX WARN: Code duplicated, block: B:179:0x0381  */
    static <T> y3<T> o(Class<T> cls, s3 s3Var, b4 b4Var, e3 e3Var, c5<?, ?> c5Var, a2<?> a2Var, r3 r3Var) {
        int i15;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i25;
        char cCharAt3;
        int i26;
        char cCharAt4;
        int i27;
        char cCharAt5;
        int i28;
        char cCharAt6;
        int i29;
        char cCharAt7;
        int i35;
        char cCharAt8;
        int i36;
        int i37;
        int i38;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i39;
        int i45;
        int i46;
        Field fieldS;
        char cCharAt9;
        int i47;
        int i48;
        Object obj;
        Field fieldS2;
        int i49;
        Object obj2;
        Field fieldS3;
        int i55;
        char cCharAt10;
        int i56;
        char cCharAt11;
        int i57;
        int i58;
        char cCharAt12;
        int i59;
        char cCharAt13;
        if (!(s3Var instanceof j4)) {
            ((z4) s3Var).zza();
            int i65 = i4.f31074a;
            throw new NoSuchMethodError();
        }
        j4 j4Var = (j4) s3Var;
        int i66 = 0;
        boolean z15 = j4Var.zza() == i4.f31075b;
        String strB = j4Var.b();
        int length = strB.length();
        if (strB.charAt(0) >= 55296) {
            int i67 = 1;
            while (true) {
                i15 = i67 + 1;
                if (strB.charAt(i67) < 55296) {
                    break;
                }
                i67 = i15;
            }
        } else {
            i15 = 1;
        }
        int i68 = i15 + 1;
        int iCharAt5 = strB.charAt(i15);
        if (iCharAt5 >= 55296) {
            int i69 = iCharAt5 & 8191;
            int i75 = 13;
            while (true) {
                i59 = i68 + 1;
                cCharAt13 = strB.charAt(i68);
                if (cCharAt13 < 55296) {
                    break;
                }
                i69 |= (cCharAt13 & 8191) << i75;
                i75 += 13;
                i68 = i59;
            }
            iCharAt5 = i69 | (cCharAt13 << i75);
            i68 = i59;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i16 = 0;
            iCharAt4 = 0;
            iArr = f31339r;
            i17 = 0;
        } else {
            int i76 = i68 + 1;
            int iCharAt6 = strB.charAt(i68);
            if (iCharAt6 >= 55296) {
                int i77 = iCharAt6 & 8191;
                int i78 = 13;
                while (true) {
                    i35 = i76 + 1;
                    cCharAt8 = strB.charAt(i76);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt8 & 8191) << i78;
                    i78 += 13;
                    i76 = i35;
                }
                iCharAt6 = i77 | (cCharAt8 << i78);
                i76 = i35;
            }
            int i79 = i76 + 1;
            int iCharAt7 = strB.charAt(i76);
            if (iCharAt7 >= 55296) {
                int i85 = iCharAt7 & 8191;
                int i86 = 13;
                while (true) {
                    i29 = i79 + 1;
                    cCharAt7 = strB.charAt(i79);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt7 & 8191) << i86;
                    i86 += 13;
                    i79 = i29;
                }
                iCharAt7 = i85 | (cCharAt7 << i86);
                i79 = i29;
            }
            int i87 = i79 + 1;
            iCharAt = strB.charAt(i79);
            if (iCharAt >= 55296) {
                int i88 = iCharAt & 8191;
                int i89 = 13;
                while (true) {
                    i28 = i87 + 1;
                    cCharAt6 = strB.charAt(i87);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i88 |= (cCharAt6 & 8191) << i89;
                    i89 += 13;
                    i87 = i28;
                }
                iCharAt = i88 | (cCharAt6 << i89);
                i87 = i28;
            }
            int i95 = i87 + 1;
            iCharAt2 = strB.charAt(i87);
            if (iCharAt2 >= 55296) {
                int i96 = iCharAt2 & 8191;
                int i97 = 13;
                while (true) {
                    i27 = i95 + 1;
                    cCharAt5 = strB.charAt(i95);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i96 |= (cCharAt5 & 8191) << i97;
                    i97 += 13;
                    i95 = i27;
                }
                iCharAt2 = i96 | (cCharAt5 << i97);
                i95 = i27;
            }
            int i98 = i95 + 1;
            iCharAt3 = strB.charAt(i95);
            if (iCharAt3 >= 55296) {
                int i99 = iCharAt3 & 8191;
                int i100 = 13;
                while (true) {
                    i26 = i98 + 1;
                    cCharAt4 = strB.charAt(i98);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i99 |= (cCharAt4 & 8191) << i100;
                    i100 += 13;
                    i98 = i26;
                }
                iCharAt3 = i99 | (cCharAt4 << i100);
                i98 = i26;
            }
            int i101 = i98 + 1;
            int iCharAt8 = strB.charAt(i98);
            if (iCharAt8 >= 55296) {
                int i102 = iCharAt8 & 8191;
                int i103 = 13;
                while (true) {
                    i25 = i101 + 1;
                    cCharAt3 = strB.charAt(i101);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i102 |= (cCharAt3 & 8191) << i103;
                    i103 += 13;
                    i101 = i25;
                }
                iCharAt8 = i102 | (cCharAt3 << i103);
                i101 = i25;
            }
            int i104 = i101 + 1;
            int iCharAt9 = strB.charAt(i101);
            if (iCharAt9 >= 55296) {
                int i105 = iCharAt9 & 8191;
                int i106 = 13;
                while (true) {
                    i19 = i104 + 1;
                    cCharAt2 = strB.charAt(i104);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i105 |= (cCharAt2 & 8191) << i106;
                    i106 += 13;
                    i104 = i19;
                }
                iCharAt9 = i105 | (cCharAt2 << i106);
                i104 = i19;
            }
            int i107 = i104 + 1;
            iCharAt4 = strB.charAt(i104);
            if (iCharAt4 >= 55296) {
                int i108 = iCharAt4 & 8191;
                int i109 = i107;
                int i110 = 13;
                while (true) {
                    i18 = i109 + 1;
                    cCharAt = strB.charAt(i109);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i108 |= (cCharAt & 8191) << i110;
                    i110 += 13;
                    i109 = i18;
                }
                iCharAt4 = i108 | (cCharAt << i110);
                i107 = i18;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i16 = (iCharAt6 << 1) + iCharAt7;
            i17 = iCharAt8;
            iArr = iArr2;
            i66 = iCharAt6;
            i68 = i107;
        }
        Unsafe unsafe = f31340s;
        Object[] objArrC = j4Var.c();
        Class<?> cls2 = j4Var.a().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 << 1];
        int i111 = i17 + iCharAt4;
        int i112 = i111;
        int i113 = iCharAt4;
        int i114 = 0;
        int i115 = 0;
        while (i68 < length) {
            int i116 = i68 + 1;
            int iCharAt10 = strB.charAt(i68);
            j4 j4Var2 = j4Var;
            if (iCharAt10 >= 55296) {
                int i117 = iCharAt10 & 8191;
                int i118 = i116;
                int i119 = 13;
                while (true) {
                    i58 = i118 + 1;
                    cCharAt12 = strB.charAt(i118);
                    i36 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i117 |= (cCharAt12 & 8191) << i119;
                    i119 += 13;
                    i118 = i58;
                    length = i36;
                }
                iCharAt10 = i117 | (cCharAt12 << i119);
                i37 = i58;
            } else {
                i36 = length;
                i37 = i116;
            }
            int i120 = i37 + 1;
            int iCharAt11 = strB.charAt(i37);
            if (iCharAt11 >= 55296) {
                int i121 = iCharAt11 & 8191;
                int i122 = i120;
                int i123 = 13;
                while (true) {
                    i56 = i122 + 1;
                    cCharAt11 = strB.charAt(i122);
                    i57 = i121;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i121 = i57 | ((cCharAt11 & 8191) << i123);
                    i123 += 13;
                    i122 = i56;
                }
                iCharAt11 = i57 | (cCharAt11 << i123);
                i38 = i56;
            } else {
                i38 = i120;
            }
            int i124 = i66;
            int i125 = iCharAt11 & GF2Field.MASK;
            int i126 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i114] = i115;
                i114++;
            }
            int[] iArr4 = iArr3;
            if (i125 >= 51) {
                int i127 = i38 + 1;
                int iCharAt12 = strB.charAt(i38);
                char c15 = 55296;
                if (iCharAt12 >= 55296) {
                    int i128 = iCharAt12 & 8191;
                    int i129 = 13;
                    while (true) {
                        i55 = i127 + 1;
                        cCharAt10 = strB.charAt(i127);
                        if (cCharAt10 < c15) {
                            break;
                        }
                        i128 |= (cCharAt10 & 8191) << i129;
                        i129 += 13;
                        i127 = i55;
                        c15 = 55296;
                    }
                    iCharAt12 = i128 | (cCharAt10 << i129);
                    i127 = i55;
                }
                int i130 = i125 - 51;
                int i131 = iCharAt12;
                if (i130 == 9 || i130 == 17) {
                    i47 = i16 + 1;
                    objArr[((i115 / 3) << 1) + 1] = objArrC[i16];
                } else {
                    if (i130 == 12 && !z15) {
                        i47 = i16 + 1;
                        objArr[((i115 / 3) << 1) + 1] = objArrC[i16];
                    }
                    i48 = i131 << 1;
                    obj = objArrC[i48];
                    if (obj instanceof Field) {
                        fieldS2 = (Field) obj;
                    } else {
                        fieldS2 = s(cls2, (String) obj);
                        objArrC[i48] = fieldS2;
                    }
                    int i132 = i127;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldS2);
                    i49 = i48 + 1;
                    obj2 = objArrC[i49];
                    if (obj2 instanceof Field) {
                        fieldS3 = (Field) obj2;
                    } else {
                        fieldS3 = s(cls2, (String) obj2);
                        objArrC[i49] = fieldS3;
                    }
                    strB = strB;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS3);
                    i46 = iObjectFieldOffset3;
                    i45 = 0;
                    i39 = i132;
                }
                i16 = i47;
                i48 = i131 << 1;
                obj = objArrC[i48];
                if (obj instanceof Field) {
                    fieldS2 = (Field) obj;
                } else {
                    fieldS2 = s(cls2, (String) obj);
                    objArrC[i48] = fieldS2;
                }
                int i133 = i127;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldS2);
                i49 = i48 + 1;
                obj2 = objArrC[i49];
                if (obj2 instanceof Field) {
                    fieldS3 = (Field) obj2;
                } else {
                    fieldS3 = s(cls2, (String) obj2);
                    objArrC[i49] = fieldS3;
                }
                strB = strB;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS3);
                i46 = iObjectFieldOffset4;
                i45 = 0;
                i39 = i133;
            } else {
                int i134 = i16 + 1;
                Field fieldS4 = s(cls2, (String) objArrC[i16]);
                if (i125 == 9 || i125 == 17) {
                    objArr[((i115 / 3) << 1) + 1] = fieldS4.getType();
                } else {
                    if (i125 == 27 || i125 == 49) {
                        i16 += 2;
                        objArr[((i115 / 3) << 1) + 1] = objArrC[i134];
                    } else if (i125 == 12 || i125 == 30 || i125 == 44) {
                        if (!z15) {
                            i16 += 2;
                            objArr[((i115 / 3) << 1) + 1] = objArrC[i134];
                        }
                    } else if (i125 == 50) {
                        int i135 = i113 + 1;
                        iArr[i113] = i115;
                        int i136 = (i115 / 3) << 1;
                        int i137 = i16 + 2;
                        objArr[i136] = objArrC[i134];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i136 + 1] = objArrC[i137];
                            i16 += 3;
                        } else {
                            i16 = i137;
                        }
                        i113 = i135;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                    if ((iCharAt11 & PKIFailureInfo.certConfirmed) == 4096 || i125 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i39 = i38;
                        i45 = 0;
                    } else {
                        int i138 = i38 + 1;
                        int iCharAt13 = strB.charAt(i38);
                        if (iCharAt13 >= 55296) {
                            int i139 = iCharAt13 & 8191;
                            int i140 = 13;
                            while (true) {
                                i39 = i138 + 1;
                                cCharAt9 = strB.charAt(i138);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i139 |= (cCharAt9 & 8191) << i140;
                                i140 += 13;
                                i138 = i39;
                            }
                            iCharAt13 = i139 | (cCharAt9 << i140);
                        } else {
                            i39 = i138;
                        }
                        int i141 = (i124 << 1) + (iCharAt13 / 32);
                        Object obj3 = objArrC[i141];
                        if (obj3 instanceof Field) {
                            fieldS = (Field) obj3;
                        } else {
                            fieldS = s(cls2, (String) obj3);
                            objArrC[i141] = fieldS;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS);
                        i45 = iCharAt13 % 32;
                    }
                    if (i125 >= 18 && i125 <= 49) {
                        iArr[i112] = iObjectFieldOffset;
                        i112++;
                    }
                    i46 = iObjectFieldOffset;
                }
                i16 = i134;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                if ((iCharAt11 & PKIFailureInfo.certConfirmed) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i39 = i38;
                    i45 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i39 = i38;
                    i45 = 0;
                }
                if (i125 >= 18) {
                    iArr[i112] = iObjectFieldOffset;
                    i112++;
                }
                i46 = iObjectFieldOffset;
            }
            int i142 = i115 + 1;
            iArr4[i115] = i126;
            int i143 = i115 + 2;
            int i144 = iObjectFieldOffset2;
            iArr4[i142] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | (i125 << 20) | i46;
            i115 += 3;
            iArr4[i143] = (i45 << 20) | i144;
            i66 = i124;
            j4Var = j4Var2;
            length = i36;
            i68 = i39;
            iArr3 = iArr4;
            strB = strB;
        }
        return new y3<>(iArr3, objArr, iCharAt, iCharAt2, j4Var.a(), z15, false, iArr, iCharAt4, i111, b4Var, e3Var, c5Var, a2Var, r3Var);
    }

    private final l4 p(int i15) {
        int i16 = (i15 / 3) << 1;
        l4 l4Var = (l4) this.f31342b[i16];
        if (l4Var != null) {
            return l4Var;
        }
        l4<T> l4VarB = h4.a().b((Class) this.f31342b[i16 + 1]);
        this.f31342b[i16] = l4VarB;
        return l4VarB;
    }

    private final <K, V, UT, UB> UB q(int i15, int i16, Map<K, V> map, q2 q2Var, UB ub5, c5<UT, UB> c5Var) {
        this.f31357q.c(E(i15));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!q2Var.b(((Integer) next.getValue()).intValue())) {
                if (ub5 == null) {
                    ub5 = c5Var.a();
                }
                n1 n1VarW = e1.w(m3.a(null, next.getKey(), next.getValue()));
                try {
                    m3.b(n1VarW.b(), null, next.getKey(), next.getValue());
                    c5Var.c(ub5, i16, n1VarW.a());
                    it.remove();
                } catch (IOException e15) {
                    throw new RuntimeException(e15);
                }
            }
        }
        return ub5;
    }

    private final <UT, UB> UB r(Object obj, int i15, UB ub5, c5<UT, UB> c5Var) {
        q2 q2VarK;
        int i16 = this.f31341a[i15];
        Object objF = i5.F(obj, M(i15) & 1048575);
        return (objF == null || (q2VarK = K(i15)) == null) ? ub5 : (UB) q(i15, i16, this.f31357q.b(objF), q2VarK, ub5, c5Var);
    }

    private static Field s(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb5.append("Field ");
            sb5.append(str);
            sb5.append(" for ");
            sb5.append(name);
            sb5.append(" not found. Known fields are ");
            sb5.append(string);
            throw new RuntimeException(sb5.toString());
        }
    }

    private static List<?> t(Object obj, long j15) {
        return (List) i5.F(obj, j15);
    }

    private static void u(int i15, Object obj, z5 z5Var) {
        if (obj instanceof String) {
            z5Var.C(i15, (String) obj);
        } else {
            z5Var.I(i15, (e1) obj);
        }
    }

    private static <UT, UB> void v(c5<UT, UB> c5Var, T t15, z5 z5Var) {
        c5Var.d(c5Var.f(t15), z5Var);
    }

    private final <K, V> void w(z5 z5Var, int i15, Object obj, int i16) {
        if (obj != null) {
            this.f31357q.c(E(i16));
            z5Var.J(i15, null, this.f31357q.a(obj));
        }
    }

    private final void x(T t15, T t16, int i15) {
        long jM = M(i15) & 1048575;
        if (y(t16, i15)) {
            Object objF = i5.F(t15, jM);
            Object objF2 = i5.F(t16, jM);
            if (objF != null && objF2 != null) {
                i5.j(t15, jM, p2.e(objF, objF2));
                F(t15, i15);
            } else if (objF2 != null) {
                i5.j(t15, jM, objF2);
                F(t15, i15);
            }
        }
    }

    private final boolean y(T t15, int i15) {
        int iO = O(i15);
        long j15 = iO & 1048575;
        if (j15 != 1048575) {
            return (i5.b(t15, j15) & (1 << (iO >>> 20))) != 0;
        }
        int iM = M(i15);
        long j16 = iM & 1048575;
        switch ((iM & 267386880) >>> 20) {
            case 0:
                return i5.C(t15, j16) != 0.0d;
            case 1:
                return i5.x(t15, j16) != 0.0f;
            case 2:
                return i5.o(t15, j16) != 0;
            case 3:
                return i5.o(t15, j16) != 0;
            case 4:
                return i5.b(t15, j16) != 0;
            case 5:
                return i5.o(t15, j16) != 0;
            case 6:
                return i5.b(t15, j16) != 0;
            case 7:
                return i5.w(t15, j16);
            case 8:
                Object objF = i5.F(t15, j16);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof e1) {
                    return !e1.f30998b.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return i5.F(t15, j16) != null;
            case 10:
                return !e1.f30998b.equals(i5.F(t15, j16));
            case 11:
                return i5.b(t15, j16) != 0;
            case 12:
                return i5.b(t15, j16) != 0;
            case 13:
                return i5.b(t15, j16) != 0;
            case 14:
                return i5.o(t15, j16) != 0;
            case 15:
                return i5.b(t15, j16) != 0;
            case 16:
                return i5.o(t15, j16) != 0;
            case 17:
                return i5.F(t15, j16) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean z(T t15, int i15, int i16) {
        return i5.b(t15, (long) (O(i16) & 1048575)) == i15;
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final void a(T t15) {
        int i15;
        int i16 = this.f31351k;
        while (true) {
            i15 = this.f31352l;
            if (i16 >= i15) {
                break;
            }
            long jM = M(this.f31350j[i16]) & 1048575;
            Object objF = i5.F(t15, jM);
            if (objF != null) {
                i5.j(t15, jM, this.f31357q.d(objF));
            }
            i16++;
        }
        int length = this.f31350j.length;
        while (i15 < length) {
            this.f31354n.d(t15, this.f31350j[i15]);
            i15++;
        }
        this.f31355o.j(t15);
        if (this.f31346f) {
            this.f31356p.g(t15);
        }
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final int b(T t15) {
        int i15;
        int iB;
        int length = this.f31341a.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 3) {
            int iM = M(i17);
            int i18 = this.f31341a[i17];
            long j15 = 1048575 & iM;
            int iHashCode = 37;
            switch ((iM & 267386880) >>> 20) {
                case 0:
                    i15 = i16 * 53;
                    iB = p2.b(Double.doubleToLongBits(i5.C(t15, j15)));
                    i16 = i15 + iB;
                    break;
                case 1:
                    i15 = i16 * 53;
                    iB = Float.floatToIntBits(i5.x(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 2:
                    i15 = i16 * 53;
                    iB = p2.b(i5.o(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 3:
                    i15 = i16 * 53;
                    iB = p2.b(i5.o(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 4:
                    i15 = i16 * 53;
                    iB = i5.b(t15, j15);
                    i16 = i15 + iB;
                    break;
                case 5:
                    i15 = i16 * 53;
                    iB = p2.b(i5.o(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 6:
                    i15 = i16 * 53;
                    iB = i5.b(t15, j15);
                    i16 = i15 + iB;
                    break;
                case 7:
                    i15 = i16 * 53;
                    iB = p2.c(i5.w(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 8:
                    i15 = i16 * 53;
                    iB = ((String) i5.F(t15, j15)).hashCode();
                    i16 = i15 + iB;
                    break;
                case 9:
                    Object objF = i5.F(t15, j15);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
                    i15 = i16 * 53;
                    iB = i5.F(t15, j15).hashCode();
                    i16 = i15 + iB;
                    break;
                case 11:
                    i15 = i16 * 53;
                    iB = i5.b(t15, j15);
                    i16 = i15 + iB;
                    break;
                case 12:
                    i15 = i16 * 53;
                    iB = i5.b(t15, j15);
                    i16 = i15 + iB;
                    break;
                case 13:
                    i15 = i16 * 53;
                    iB = i5.b(t15, j15);
                    i16 = i15 + iB;
                    break;
                case 14:
                    i15 = i16 * 53;
                    iB = p2.b(i5.o(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 15:
                    i15 = i16 * 53;
                    iB = i5.b(t15, j15);
                    i16 = i15 + iB;
                    break;
                case 16:
                    i15 = i16 * 53;
                    iB = p2.b(i5.o(t15, j15));
                    i16 = i15 + iB;
                    break;
                case 17:
                    Object objF2 = i5.F(t15, j15);
                    if (objF2 != null) {
                        iHashCode = objF2.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BERTags.DATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                case 40:
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                case EACTags.CURRENCY_CODE /* 42 */:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i15 = i16 * 53;
                    iB = i5.F(t15, j15).hashCode();
                    i16 = i15 + iB;
                    break;
                case 50:
                    i15 = i16 * 53;
                    iB = i5.F(t15, j15).hashCode();
                    i16 = i15 + iB;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.b(Double.doubleToLongBits(C(t15, j15)));
                        i16 = i15 + iB;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = Float.floatToIntBits(J(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case 53:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.b(P(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.b(P(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case 55:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = N(t15, j15);
                        i16 = i15 + iB;
                    }
                    break;
                case 56:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.b(P(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case 57:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = N(t15, j15);
                        i16 = i15 + iB;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.c(R(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = ((String) i5.F(t15, j15)).hashCode();
                        i16 = i15 + iB;
                    }
                    break;
                case 60:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = i5.F(t15, j15).hashCode();
                        i16 = i15 + iB;
                    }
                    break;
                case 61:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = i5.F(t15, j15).hashCode();
                        i16 = i15 + iB;
                    }
                    break;
                case 62:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = N(t15, j15);
                        i16 = i15 + iB;
                    }
                    break;
                case 63:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = N(t15, j15);
                        i16 = i15 + iB;
                    }
                    break;
                case 64:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = N(t15, j15);
                        i16 = i15 + iB;
                    }
                    break;
                case 65:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.b(P(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case 66:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = N(t15, j15);
                        i16 = i15 + iB;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = p2.b(P(t15, j15));
                        i16 = i15 + iB;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iB = i5.F(t15, j15).hashCode();
                        i16 = i15 + iB;
                    }
                    break;
            }
        }
        int iHashCode2 = (i16 * 53) + this.f31355o.f(t15).hashCode();
        return this.f31346f ? (iHashCode2 * 53) + this.f31356p.b(t15).hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:210:0x04d9 A[PHI: r4
      0x04d9: PHI (r4v4 int) = 
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v11 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v12 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v1 int)
      (r4v13 int)
      (r4v1 int)
     binds: [B:204:0x04c0, B:368:0x08ae, B:365:0x08a5, B:359:0x088a, B:356:0x0879, B:353:0x086a, B:350:0x085d, B:347:0x0850, B:344:0x0846, B:341:0x083d, B:338:0x0830, B:335:0x0823, B:332:0x0810, B:311:0x072a, B:308:0x0714, B:305:0x06fe, B:302:0x06e8, B:299:0x06d2, B:296:0x06bc, B:293:0x06a6, B:290:0x0690, B:287:0x067b, B:284:0x0666, B:281:0x0651, B:278:0x063c, B:275:0x0627, B:271:0x060f, B:266:0x05da, B:267:0x05dc, B:263:0x05cd, B:260:0x05bd, B:257:0x05ad, B:254:0x059d, B:251:0x0591, B:248:0x0585, B:245:0x0579, B:239:0x055b, B:236:0x0548, B:233:0x0537, B:230:0x0528, B:227:0x0519, B:225:0x0513, B:223:0x050c, B:220:0x0501, B:217:0x04f2, B:214:0x04e3, B:209:0x04d8, B:207:0x04c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.vision.l4
    public final int c(T t15) {
        int i15;
        int i16;
        boolean z15;
        int iB0;
        int iH;
        int iA0;
        int iV;
        int iG0;
        int iO0;
        int iB;
        int iV2;
        int iG1;
        int iO1;
        int i17 = 267386880;
        int i18 = 1048575;
        int i19 = 0;
        if (this.f31348h) {
            Unsafe unsafe = f31340s;
            int i25 = 0;
            int i26 = 0;
            while (i25 < this.f31341a.length) {
                int iM = M(i25);
                int i27 = (iM & i17) >>> 20;
                int i28 = i17;
                int i29 = this.f31341a[i25];
                long j15 = iM & 1048575;
                if (i27 >= f2.Z.zza() && i27 <= f2.B0.zza()) {
                    int i35 = this.f31341a[i25 + 2];
                }
                switch (i27) {
                    case 0:
                        if (y(t15, i25)) {
                            iB = t1.B(i29, 0.0d);
                            i26 += iB;
                        }
                        break;
                    case 1:
                        if (y(t15, i25)) {
                            iB = t1.C(i29, 0.0f);
                            i26 += iB;
                        }
                        break;
                    case 2:
                        if (y(t15, i25)) {
                            iB = t1.b0(i29, i5.o(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 3:
                        if (y(t15, i25)) {
                            iB = t1.h0(i29, i5.o(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 4:
                        if (y(t15, i25)) {
                            iB = t1.l0(i29, i5.b(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 5:
                        if (y(t15, i25)) {
                            iB = t1.q0(i29, 0L);
                            i26 += iB;
                        }
                        break;
                    case 6:
                        if (y(t15, i25)) {
                            iB = t1.x0(i29, 0);
                            i26 += iB;
                        }
                        break;
                    case 7:
                        if (y(t15, i25)) {
                            iB = t1.H(i29, true);
                            i26 += iB;
                        }
                        break;
                    case 8:
                        if (y(t15, i25)) {
                            Object objF = i5.F(t15, j15);
                            iB = objF instanceof e1 ? t1.T(i29, (e1) objF) : t1.G(i29, (String) objF);
                            i26 += iB;
                        }
                        break;
                    case 9:
                        if (y(t15, i25)) {
                            iB = m4.a(i29, i5.F(t15, j15), p(i25));
                            i26 += iB;
                        }
                        break;
                    case 10:
                        if (y(t15, i25)) {
                            iB = t1.T(i29, (e1) i5.F(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 11:
                        if (y(t15, i25)) {
                            iB = t1.p0(i29, i5.b(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 12:
                        if (y(t15, i25)) {
                            iB = t1.C0(i29, i5.b(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 13:
                        if (y(t15, i25)) {
                            iB = t1.A0(i29, 0);
                            i26 += iB;
                        }
                        break;
                    case 14:
                        if (y(t15, i25)) {
                            iB = t1.u0(i29, 0L);
                            i26 += iB;
                        }
                        break;
                    case 15:
                        if (y(t15, i25)) {
                            iB = t1.t0(i29, i5.b(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 16:
                        if (y(t15, i25)) {
                            iB = t1.m0(i29, i5.o(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 17:
                        if (y(t15, i25)) {
                            iB = t1.U(i29, (u3) i5.F(t15, j15), p(i25));
                            i26 += iB;
                        }
                        break;
                    case 18:
                        iB = m4.U(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 19:
                        iB = m4.R(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 20:
                        iB = m4.d(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 21:
                        iB = m4.t(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 22:
                        iB = m4.H(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 23:
                        iB = m4.U(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 24:
                        iB = m4.R(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 25:
                        iB = m4.X(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 26:
                        iB = m4.b(i29, t(t15, j15));
                        i26 += iB;
                        break;
                    case 27:
                        iB = m4.c(i29, t(t15, j15), p(i25));
                        i26 += iB;
                        break;
                    case 28:
                        iB = m4.r(i29, t(t15, j15));
                        i26 += iB;
                        break;
                    case 29:
                        iB = m4.L(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 30:
                        iB = m4.D(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case BERTags.DATE /* 31 */:
                        iB = m4.R(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 32:
                        iB = m4.U(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 33:
                        iB = m4.O(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 34:
                        iB = m4.z(i29, t(t15, j15), false);
                        i26 += iB;
                        break;
                    case 35:
                        iV2 = m4.V((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case 36:
                        iV2 = m4.S((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        iV2 = m4.e((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        iV2 = m4.u((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        iV2 = m4.I((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case 40:
                        iV2 = m4.V((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        iV2 = m4.S((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.CURRENCY_CODE /* 42 */:
                        iV2 = m4.Y((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.DATE_OF_BIRTH /* 43 */:
                        iV2 = m4.M((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        iV2 = m4.E((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        iV2 = m4.S((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case 46:
                        iV2 = m4.V((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case 47:
                        iV2 = m4.P((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case 48:
                        iV2 = m4.A((List) unsafe.getObject(t15, j15));
                        if (iV2 > 0) {
                            iG1 = t1.g0(i29);
                            iO1 = t1.o0(iV2);
                            iB = iG1 + iO1 + iV2;
                            i26 += iB;
                        }
                        break;
                    case 49:
                        iB = m4.s(i29, t(t15, j15), p(i25));
                        i26 += iB;
                        break;
                    case 50:
                        iB = this.f31357q.h(i29, i5.F(t15, j15), E(i25));
                        i26 += iB;
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (z(t15, i29, i25)) {
                            iB = t1.B(i29, 0.0d);
                            i26 += iB;
                        }
                        break;
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (z(t15, i29, i25)) {
                            iB = t1.C(i29, 0.0f);
                            i26 += iB;
                        }
                        break;
                    case 53:
                        if (z(t15, i29, i25)) {
                            iB = t1.b0(i29, P(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case EACTags.CURRENCY_EXPONENT /* 54 */:
                        if (z(t15, i29, i25)) {
                            iB = t1.h0(i29, P(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 55:
                        if (z(t15, i29, i25)) {
                            iB = t1.l0(i29, N(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 56:
                        if (z(t15, i29, i25)) {
                            iB = t1.q0(i29, 0L);
                            i26 += iB;
                        }
                        break;
                    case 57:
                        if (z(t15, i29, i25)) {
                            iB = t1.x0(i29, 0);
                            i26 += iB;
                        }
                        break;
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (z(t15, i29, i25)) {
                            iB = t1.H(i29, true);
                            i26 += iB;
                        }
                        break;
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (z(t15, i29, i25)) {
                            Object objF2 = i5.F(t15, j15);
                            iB = objF2 instanceof e1 ? t1.T(i29, (e1) objF2) : t1.G(i29, (String) objF2);
                            i26 += iB;
                        }
                        break;
                    case 60:
                        if (z(t15, i29, i25)) {
                            iB = m4.a(i29, i5.F(t15, j15), p(i25));
                            i26 += iB;
                        }
                        break;
                    case 61:
                        if (z(t15, i29, i25)) {
                            iB = t1.T(i29, (e1) i5.F(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 62:
                        if (z(t15, i29, i25)) {
                            iB = t1.p0(i29, N(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 63:
                        if (z(t15, i29, i25)) {
                            iB = t1.C0(i29, N(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case 64:
                        if (z(t15, i29, i25)) {
                            iB = t1.A0(i29, 0);
                            i26 += iB;
                        }
                        break;
                    case 65:
                        if (z(t15, i29, i25)) {
                            iB = t1.u0(i29, 0L);
                            i26 += iB;
                        }
                        break;
                    case 66:
                        if (z(t15, i29, i25)) {
                            iB = t1.t0(i29, N(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (z(t15, i29, i25)) {
                            iB = t1.m0(i29, P(t15, j15));
                            i26 += iB;
                        }
                        break;
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (z(t15, i29, i25)) {
                            iB = t1.U(i29, (u3) i5.F(t15, j15), p(i25));
                            i26 += iB;
                        }
                        break;
                }
                i25 += 3;
                i17 = i28;
            }
            return i26 + j(this.f31355o, t15);
        }
        Unsafe unsafe2 = f31340s;
        int i36 = 1048575;
        int i37 = 0;
        int iB2 = 0;
        int i38 = 0;
        while (i37 < this.f31341a.length) {
            int iM2 = M(i37);
            int[] iArr = this.f31341a;
            int i39 = iArr[i37];
            int i45 = i18;
            int i46 = (iM2 & 267386880) >>> 20;
            if (i46 <= 17) {
                int i47 = iArr[i37 + 2];
                int i48 = i47 & i45;
                i15 = 1 << (i47 >>> 20);
                if (i48 != i36) {
                    i38 = unsafe2.getInt(t15, i48);
                    i36 = i48;
                }
            } else {
                i15 = 0;
            }
            long j16 = iM2 & i45;
            switch (i46) {
                case 0:
                    i16 = 0;
                    z15 = false;
                    if ((i15 & i38) != 0) {
                        iB2 += t1.B(i39, 0.0d);
                    }
                    break;
                case 1:
                    i16 = 0;
                    if ((i15 & i38) != 0) {
                        z15 = false;
                        iB2 += t1.C(i39, 0.0f);
                    } else {
                        z15 = false;
                    }
                    break;
                case 2:
                    i16 = 0;
                    if ((i15 & i38) != 0) {
                        iB0 = t1.b0(i39, unsafe2.getLong(t15, j16));
                        iB2 += iB0;
                    }
                    z15 = false;
                    break;
                case 3:
                    i16 = 0;
                    if ((i15 & i38) != 0) {
                        iB0 = t1.h0(i39, unsafe2.getLong(t15, j16));
                        iB2 += iB0;
                    }
                    z15 = false;
                    break;
                case 4:
                    i16 = 0;
                    if ((i15 & i38) != 0) {
                        iB0 = t1.l0(i39, unsafe2.getInt(t15, j16));
                        iB2 += iB0;
                    }
                    z15 = false;
                    break;
                case 5:
                    i16 = 0;
                    if ((i15 & i38) != 0) {
                        iB0 = t1.q0(i39, 0L);
                        iB2 += iB0;
                    }
                    z15 = false;
                    break;
                case 6:
                    if ((i15 & i38) != 0) {
                        i16 = 0;
                        iB0 = t1.x0(i39, 0);
                        iB2 += iB0;
                    } else {
                        i16 = 0;
                    }
                    z15 = false;
                    break;
                case 7:
                    if ((i15 & i38) != 0) {
                        iH = t1.H(i39, true);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 8:
                    if ((i15 & i38) != 0) {
                        Object object = unsafe2.getObject(t15, j16);
                        iH = object instanceof e1 ? t1.T(i39, (e1) object) : t1.G(i39, (String) object);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 9:
                    if ((i15 & i38) != 0) {
                        iH = m4.a(i39, unsafe2.getObject(t15, j16), p(i37));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 10:
                    if ((i15 & i38) != 0) {
                        iH = t1.T(i39, (e1) unsafe2.getObject(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 11:
                    if ((i15 & i38) != 0) {
                        iH = t1.p0(i39, unsafe2.getInt(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 12:
                    if ((i15 & i38) != 0) {
                        iH = t1.C0(i39, unsafe2.getInt(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 13:
                    if ((i15 & i38) != 0) {
                        iA0 = t1.A0(i39, 0);
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 14:
                    if ((i15 & i38) != 0) {
                        iH = t1.u0(i39, 0L);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 15:
                    if ((i15 & i38) != 0) {
                        iH = t1.t0(i39, unsafe2.getInt(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 16:
                    if ((i15 & i38) != 0) {
                        iH = t1.m0(i39, unsafe2.getLong(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 17:
                    if ((i15 & i38) != 0) {
                        iH = t1.U(i39, (u3) unsafe2.getObject(t15, j16), p(i37));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 18:
                    iH = m4.U(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case 19:
                    i16 = 0;
                    iB0 = m4.R(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 20:
                    i16 = 0;
                    iB0 = m4.d(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 21:
                    i16 = 0;
                    iB0 = m4.t(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 22:
                    i16 = 0;
                    iB0 = m4.H(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 23:
                    i16 = 0;
                    iB0 = m4.U(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 24:
                    i16 = 0;
                    iB0 = m4.R(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 25:
                    i16 = 0;
                    iB0 = m4.X(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 26:
                    iH = m4.b(i39, (List) unsafe2.getObject(t15, j16));
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case 27:
                    iH = m4.c(i39, (List) unsafe2.getObject(t15, j16), p(i37));
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case 28:
                    iH = m4.r(i39, (List) unsafe2.getObject(t15, j16));
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case 29:
                    iH = m4.L(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case 30:
                    i16 = 0;
                    iB0 = m4.D(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case BERTags.DATE /* 31 */:
                    i16 = 0;
                    iB0 = m4.R(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 32:
                    i16 = 0;
                    iB0 = m4.U(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 33:
                    i16 = 0;
                    iB0 = m4.O(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 34:
                    i16 = 0;
                    iB0 = m4.z(i39, (List) unsafe2.getObject(t15, j16), false);
                    iB2 += iB0;
                    z15 = false;
                    break;
                case 35:
                    iV = m4.V((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 36:
                    iV = m4.S((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    iV = m4.e((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    iV = m4.u((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    iV = m4.I((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 40:
                    iV = m4.V((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    iV = m4.S((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    iV = m4.Y((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iV = m4.M((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    iV = m4.E((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    iV = m4.S((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 46:
                    iV = m4.V((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 47:
                    iV = m4.P((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 48:
                    iV = m4.A((List) unsafe2.getObject(t15, j16));
                    if (iV > 0) {
                        iG0 = t1.g0(i39);
                        iO0 = t1.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 49:
                    iH = m4.s(i39, (List) unsafe2.getObject(t15, j16), p(i37));
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case 50:
                    iH = this.f31357q.h(i39, unsafe2.getObject(t15, j16), E(i37));
                    iB2 += iH;
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i39, i37)) {
                        iB2 += t1.B(i39, 0.0d);
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i39, i37)) {
                        iA0 = t1.C(i39, 0.0f);
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 53:
                    if (z(t15, i39, i37)) {
                        iH = t1.b0(i39, P(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i39, i37)) {
                        iH = t1.h0(i39, P(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 55:
                    if (z(t15, i39, i37)) {
                        iH = t1.l0(i39, N(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 56:
                    if (z(t15, i39, i37)) {
                        iH = t1.q0(i39, 0L);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 57:
                    if (z(t15, i39, i37)) {
                        iA0 = t1.x0(i39, 0);
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i39, i37)) {
                        iH = t1.H(i39, true);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i39, i37)) {
                        Object object2 = unsafe2.getObject(t15, j16);
                        iH = object2 instanceof e1 ? t1.T(i39, (e1) object2) : t1.G(i39, (String) object2);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 60:
                    if (z(t15, i39, i37)) {
                        iH = m4.a(i39, unsafe2.getObject(t15, j16), p(i37));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 61:
                    if (z(t15, i39, i37)) {
                        iH = t1.T(i39, (e1) unsafe2.getObject(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 62:
                    if (z(t15, i39, i37)) {
                        iH = t1.p0(i39, N(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 63:
                    if (z(t15, i39, i37)) {
                        iH = t1.C0(i39, N(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 64:
                    if (z(t15, i39, i37)) {
                        iA0 = t1.A0(i39, 0);
                        iB2 += iA0;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 65:
                    if (z(t15, i39, i37)) {
                        iH = t1.u0(i39, 0L);
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case 66:
                    if (z(t15, i39, i37)) {
                        iH = t1.t0(i39, N(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i39, i37)) {
                        iH = t1.m0(i39, P(t15, j16));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i39, i37)) {
                        iH = t1.U(i39, (u3) unsafe2.getObject(t15, j16), p(i37));
                        iB2 += iH;
                    }
                    i16 = 0;
                    z15 = false;
                    break;
                default:
                    i16 = 0;
                    z15 = false;
                    break;
            }
            i37 += 3;
            i19 = i16;
            i18 = i45;
        }
        int iL = i19;
        int iJ = iB2 + j(this.f31355o, t15);
        if (!this.f31346f) {
            return iJ;
        }
        e2<T> e2VarB = this.f31356p.b(t15);
        for (int i49 = iL; i49 < e2VarB.f31003a.k(); i49++) {
            Map.Entry entryH = e2VarB.f31003a.h(i49);
            iL += e2.l((g2) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : e2VarB.f31003a.n()) {
            iL += e2.l((g2) entry.getKey(), entry.getValue());
        }
        return iJ + iL;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.vision.l4
    public final void d(T t15, z5 z5Var) {
        Iterator itO;
        Map.Entry<?, ?> entry;
        Iterator itQ;
        Map.Entry<?, ?> entry2;
        if (z5Var.zza() == y5.f31359b) {
            v(this.f31355o, t15, z5Var);
            if (this.f31346f) {
                e2<T> e2VarB = this.f31356p.b(t15);
                if (e2VarB.f31003a.isEmpty()) {
                    itQ = null;
                    entry2 = null;
                } else {
                    itQ = e2VarB.q();
                    entry2 = (Map.Entry) itQ.next();
                }
            } else {
                itQ = null;
                entry2 = null;
            }
            for (int length = this.f31341a.length - 3; length >= 0; length -= 3) {
                int iM = M(length);
                int i15 = this.f31341a[length];
                while (entry2 != null && this.f31356p.a(entry2) > i15) {
                    this.f31356p.d(z5Var, entry2);
                    entry2 = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
                }
                switch ((iM & 267386880) >>> 20) {
                    case 0:
                        if (y(t15, length)) {
                            z5Var.q(i15, i5.C(t15, iM & 1048575));
                        }
                        break;
                    case 1:
                        if (y(t15, length)) {
                            z5Var.r(i15, i5.x(t15, iM & 1048575));
                        }
                        break;
                    case 2:
                        if (y(t15, length)) {
                            z5Var.o(i15, i5.o(t15, iM & 1048575));
                        }
                        break;
                    case 3:
                        if (y(t15, length)) {
                            z5Var.a(i15, i5.o(t15, iM & 1048575));
                        }
                        break;
                    case 4:
                        if (y(t15, length)) {
                            z5Var.l(i15, i5.b(t15, iM & 1048575));
                        }
                        break;
                    case 5:
                        if (y(t15, length)) {
                            z5Var.w(i15, i5.o(t15, iM & 1048575));
                        }
                        break;
                    case 6:
                        if (y(t15, length)) {
                            z5Var.v(i15, i5.b(t15, iM & 1048575));
                        }
                        break;
                    case 7:
                        if (y(t15, length)) {
                            z5Var.z(i15, i5.w(t15, iM & 1048575));
                        }
                        break;
                    case 8:
                        if (y(t15, length)) {
                            u(i15, i5.F(t15, iM & 1048575), z5Var);
                        }
                        break;
                    case 9:
                        if (y(t15, length)) {
                            z5Var.L(i15, i5.F(t15, iM & 1048575), p(length));
                        }
                        break;
                    case 10:
                        if (y(t15, length)) {
                            z5Var.I(i15, (e1) i5.F(t15, iM & 1048575));
                        }
                        break;
                    case 11:
                        if (y(t15, length)) {
                            z5Var.x(i15, i5.b(t15, iM & 1048575));
                        }
                        break;
                    case 12:
                        if (y(t15, length)) {
                            z5Var.i(i15, i5.b(t15, iM & 1048575));
                        }
                        break;
                    case 13:
                        if (y(t15, length)) {
                            z5Var.k(i15, i5.b(t15, iM & 1048575));
                        }
                        break;
                    case 14:
                        if (y(t15, length)) {
                            z5Var.h(i15, i5.o(t15, iM & 1048575));
                        }
                        break;
                    case 15:
                        if (y(t15, length)) {
                            z5Var.s(i15, i5.b(t15, iM & 1048575));
                        }
                        break;
                    case 16:
                        if (y(t15, length)) {
                            z5Var.H(i15, i5.o(t15, iM & 1048575));
                        }
                        break;
                    case 17:
                        if (y(t15, length)) {
                            z5Var.M(i15, i5.F(t15, iM & 1048575), p(length));
                        }
                        break;
                    case 18:
                        m4.l(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 19:
                        m4.y(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 20:
                        m4.C(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 21:
                        m4.G(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 22:
                        m4.T(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 23:
                        m4.N(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 24:
                        m4.a0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 25:
                        m4.d0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 26:
                        m4.j(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var);
                        break;
                    case 27:
                        m4.k(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, p(length));
                        break;
                    case 28:
                        m4.w(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var);
                        break;
                    case 29:
                        m4.W(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 30:
                        m4.c0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case BERTags.DATE /* 31 */:
                        m4.b0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 32:
                        m4.Q(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 33:
                        m4.Z(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 34:
                        m4.K(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, false);
                        break;
                    case 35:
                        m4.l(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case 36:
                        m4.y(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        m4.C(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        m4.G(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        m4.T(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case 40:
                        m4.N(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        m4.a0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.CURRENCY_CODE /* 42 */:
                        m4.d0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.DATE_OF_BIRTH /* 43 */:
                        m4.W(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        m4.c0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        m4.b0(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case 46:
                        m4.Q(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case 47:
                        m4.Z(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case 48:
                        m4.K(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, true);
                        break;
                    case 49:
                        m4.x(this.f31341a[length], (List) i5.F(t15, iM & 1048575), z5Var, p(length));
                        break;
                    case 50:
                        w(z5Var, i15, i5.F(t15, iM & 1048575), length);
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (z(t15, i15, length)) {
                            z5Var.q(i15, C(t15, iM & 1048575));
                        }
                        break;
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (z(t15, i15, length)) {
                            z5Var.r(i15, J(t15, iM & 1048575));
                        }
                        break;
                    case 53:
                        if (z(t15, i15, length)) {
                            z5Var.o(i15, P(t15, iM & 1048575));
                        }
                        break;
                    case EACTags.CURRENCY_EXPONENT /* 54 */:
                        if (z(t15, i15, length)) {
                            z5Var.a(i15, P(t15, iM & 1048575));
                        }
                        break;
                    case 55:
                        if (z(t15, i15, length)) {
                            z5Var.l(i15, N(t15, iM & 1048575));
                        }
                        break;
                    case 56:
                        if (z(t15, i15, length)) {
                            z5Var.w(i15, P(t15, iM & 1048575));
                        }
                        break;
                    case 57:
                        if (z(t15, i15, length)) {
                            z5Var.v(i15, N(t15, iM & 1048575));
                        }
                        break;
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (z(t15, i15, length)) {
                            z5Var.z(i15, R(t15, iM & 1048575));
                        }
                        break;
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (z(t15, i15, length)) {
                            u(i15, i5.F(t15, iM & 1048575), z5Var);
                        }
                        break;
                    case 60:
                        if (z(t15, i15, length)) {
                            z5Var.L(i15, i5.F(t15, iM & 1048575), p(length));
                        }
                        break;
                    case 61:
                        if (z(t15, i15, length)) {
                            z5Var.I(i15, (e1) i5.F(t15, iM & 1048575));
                        }
                        break;
                    case 62:
                        if (z(t15, i15, length)) {
                            z5Var.x(i15, N(t15, iM & 1048575));
                        }
                        break;
                    case 63:
                        if (z(t15, i15, length)) {
                            z5Var.i(i15, N(t15, iM & 1048575));
                        }
                        break;
                    case 64:
                        if (z(t15, i15, length)) {
                            z5Var.k(i15, N(t15, iM & 1048575));
                        }
                        break;
                    case 65:
                        if (z(t15, i15, length)) {
                            z5Var.h(i15, P(t15, iM & 1048575));
                        }
                        break;
                    case 66:
                        if (z(t15, i15, length)) {
                            z5Var.s(i15, N(t15, iM & 1048575));
                        }
                        break;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (z(t15, i15, length)) {
                            z5Var.H(i15, P(t15, iM & 1048575));
                        }
                        break;
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (z(t15, i15, length)) {
                            z5Var.M(i15, i5.F(t15, iM & 1048575), p(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.f31356p.d(z5Var, entry2);
                entry2 = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
            }
            return;
        }
        if (!this.f31348h) {
            H(t15, z5Var);
            return;
        }
        if (this.f31346f) {
            e2<T> e2VarB2 = this.f31356p.b(t15);
            if (e2VarB2.f31003a.isEmpty()) {
                itO = null;
                entry = null;
            } else {
                itO = e2VarB2.o();
                entry = (Map.Entry) itO.next();
            }
        } else {
            itO = null;
            entry = null;
        }
        int length2 = this.f31341a.length;
        for (int i16 = 0; i16 < length2; i16 += 3) {
            int iM2 = M(i16);
            int i17 = this.f31341a[i16];
            while (entry != null && this.f31356p.a(entry) <= i17) {
                this.f31356p.d(z5Var, entry);
                entry = itO.hasNext() ? (Map.Entry) itO.next() : null;
            }
            switch ((iM2 & 267386880) >>> 20) {
                case 0:
                    if (y(t15, i16)) {
                        z5Var.q(i17, i5.C(t15, iM2 & 1048575));
                    }
                    break;
                case 1:
                    if (y(t15, i16)) {
                        z5Var.r(i17, i5.x(t15, iM2 & 1048575));
                    }
                    break;
                case 2:
                    if (y(t15, i16)) {
                        z5Var.o(i17, i5.o(t15, iM2 & 1048575));
                    }
                    break;
                case 3:
                    if (y(t15, i16)) {
                        z5Var.a(i17, i5.o(t15, iM2 & 1048575));
                    }
                    break;
                case 4:
                    if (y(t15, i16)) {
                        z5Var.l(i17, i5.b(t15, iM2 & 1048575));
                    }
                    break;
                case 5:
                    if (y(t15, i16)) {
                        z5Var.w(i17, i5.o(t15, iM2 & 1048575));
                    }
                    break;
                case 6:
                    if (y(t15, i16)) {
                        z5Var.v(i17, i5.b(t15, iM2 & 1048575));
                    }
                    break;
                case 7:
                    if (y(t15, i16)) {
                        z5Var.z(i17, i5.w(t15, iM2 & 1048575));
                    }
                    break;
                case 8:
                    if (y(t15, i16)) {
                        u(i17, i5.F(t15, iM2 & 1048575), z5Var);
                    }
                    break;
                case 9:
                    if (y(t15, i16)) {
                        z5Var.L(i17, i5.F(t15, iM2 & 1048575), p(i16));
                    }
                    break;
                case 10:
                    if (y(t15, i16)) {
                        z5Var.I(i17, (e1) i5.F(t15, iM2 & 1048575));
                    }
                    break;
                case 11:
                    if (y(t15, i16)) {
                        z5Var.x(i17, i5.b(t15, iM2 & 1048575));
                    }
                    break;
                case 12:
                    if (y(t15, i16)) {
                        z5Var.i(i17, i5.b(t15, iM2 & 1048575));
                    }
                    break;
                case 13:
                    if (y(t15, i16)) {
                        z5Var.k(i17, i5.b(t15, iM2 & 1048575));
                    }
                    break;
                case 14:
                    if (y(t15, i16)) {
                        z5Var.h(i17, i5.o(t15, iM2 & 1048575));
                    }
                    break;
                case 15:
                    if (y(t15, i16)) {
                        z5Var.s(i17, i5.b(t15, iM2 & 1048575));
                    }
                    break;
                case 16:
                    if (y(t15, i16)) {
                        z5Var.H(i17, i5.o(t15, iM2 & 1048575));
                    }
                    break;
                case 17:
                    if (y(t15, i16)) {
                        z5Var.M(i17, i5.F(t15, iM2 & 1048575), p(i16));
                    }
                    break;
                case 18:
                    m4.l(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 19:
                    m4.y(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 20:
                    m4.C(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 21:
                    m4.G(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 22:
                    m4.T(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 23:
                    m4.N(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 24:
                    m4.a0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 25:
                    m4.d0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 26:
                    m4.j(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var);
                    break;
                case 27:
                    m4.k(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, p(i16));
                    break;
                case 28:
                    m4.w(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var);
                    break;
                case 29:
                    m4.W(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 30:
                    m4.c0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    m4.b0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 32:
                    m4.Q(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 33:
                    m4.Z(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 34:
                    m4.K(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, false);
                    break;
                case 35:
                    m4.l(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case 36:
                    m4.y(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    m4.C(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    m4.G(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    m4.T(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case 40:
                    m4.N(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    m4.a0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    m4.d0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    m4.W(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    m4.c0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    m4.b0(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case 46:
                    m4.Q(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case 47:
                    m4.Z(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case 48:
                    m4.K(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, true);
                    break;
                case 49:
                    m4.x(this.f31341a[i16], (List) i5.F(t15, iM2 & 1048575), z5Var, p(i16));
                    break;
                case 50:
                    w(z5Var, i17, i5.F(t15, iM2 & 1048575), i16);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i17, i16)) {
                        z5Var.q(i17, C(t15, iM2 & 1048575));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i17, i16)) {
                        z5Var.r(i17, J(t15, iM2 & 1048575));
                    }
                    break;
                case 53:
                    if (z(t15, i17, i16)) {
                        z5Var.o(i17, P(t15, iM2 & 1048575));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i17, i16)) {
                        z5Var.a(i17, P(t15, iM2 & 1048575));
                    }
                    break;
                case 55:
                    if (z(t15, i17, i16)) {
                        z5Var.l(i17, N(t15, iM2 & 1048575));
                    }
                    break;
                case 56:
                    if (z(t15, i17, i16)) {
                        z5Var.w(i17, P(t15, iM2 & 1048575));
                    }
                    break;
                case 57:
                    if (z(t15, i17, i16)) {
                        z5Var.v(i17, N(t15, iM2 & 1048575));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i17, i16)) {
                        z5Var.z(i17, R(t15, iM2 & 1048575));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i17, i16)) {
                        u(i17, i5.F(t15, iM2 & 1048575), z5Var);
                    }
                    break;
                case 60:
                    if (z(t15, i17, i16)) {
                        z5Var.L(i17, i5.F(t15, iM2 & 1048575), p(i16));
                    }
                    break;
                case 61:
                    if (z(t15, i17, i16)) {
                        z5Var.I(i17, (e1) i5.F(t15, iM2 & 1048575));
                    }
                    break;
                case 62:
                    if (z(t15, i17, i16)) {
                        z5Var.x(i17, N(t15, iM2 & 1048575));
                    }
                    break;
                case 63:
                    if (z(t15, i17, i16)) {
                        z5Var.i(i17, N(t15, iM2 & 1048575));
                    }
                    break;
                case 64:
                    if (z(t15, i17, i16)) {
                        z5Var.k(i17, N(t15, iM2 & 1048575));
                    }
                    break;
                case 65:
                    if (z(t15, i17, i16)) {
                        z5Var.h(i17, P(t15, iM2 & 1048575));
                    }
                    break;
                case 66:
                    if (z(t15, i17, i16)) {
                        z5Var.s(i17, N(t15, iM2 & 1048575));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i17, i16)) {
                        z5Var.H(i17, P(t15, iM2 & 1048575));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i17, i16)) {
                        z5Var.M(i17, i5.F(t15, iM2 & 1048575), p(i16));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f31356p.d(z5Var, entry);
            entry = itO.hasNext() ? (Map.Entry) itO.next() : null;
        }
        v(this.f31355o, t15, z5Var);
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final void e(T t15, T t16) {
        t16.getClass();
        for (int i15 = 0; i15 < this.f31341a.length; i15 += 3) {
            int iM = M(i15);
            long j15 = 1048575 & iM;
            int i16 = this.f31341a[i15];
            switch ((iM & 267386880) >>> 20) {
                case 0:
                    if (y(t16, i15)) {
                        i5.f(t15, j15, i5.C(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 1:
                    if (y(t16, i15)) {
                        i5.g(t15, j15, i5.x(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 2:
                    if (y(t16, i15)) {
                        i5.i(t15, j15, i5.o(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 3:
                    if (y(t16, i15)) {
                        i5.i(t15, j15, i5.o(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 4:
                    if (y(t16, i15)) {
                        i5.h(t15, j15, i5.b(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 5:
                    if (y(t16, i15)) {
                        i5.i(t15, j15, i5.o(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 6:
                    if (y(t16, i15)) {
                        i5.h(t15, j15, i5.b(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 7:
                    if (y(t16, i15)) {
                        i5.k(t15, j15, i5.w(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 8:
                    if (y(t16, i15)) {
                        i5.j(t15, j15, i5.F(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 9:
                    x(t15, t16, i15);
                    break;
                case 10:
                    if (y(t16, i15)) {
                        i5.j(t15, j15, i5.F(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 11:
                    if (y(t16, i15)) {
                        i5.h(t15, j15, i5.b(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 12:
                    if (y(t16, i15)) {
                        i5.h(t15, j15, i5.b(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 13:
                    if (y(t16, i15)) {
                        i5.h(t15, j15, i5.b(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 14:
                    if (y(t16, i15)) {
                        i5.i(t15, j15, i5.o(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 15:
                    if (y(t16, i15)) {
                        i5.h(t15, j15, i5.b(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 16:
                    if (y(t16, i15)) {
                        i5.i(t15, j15, i5.o(t16, j15));
                        F(t15, i15);
                    }
                    break;
                case 17:
                    x(t15, t16, i15);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BERTags.DATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                case 40:
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                case EACTags.CURRENCY_CODE /* 42 */:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f31354n.b(t15, t16, j15);
                    break;
                case 50:
                    m4.n(this.f31357q, t15, t16, j15);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case 53:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t16, i16, i15)) {
                        i5.j(t15, j15, i5.F(t16, j15));
                        G(t15, i16, i15);
                    }
                    break;
                case 60:
                    I(t15, t16, i15);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t16, i16, i15)) {
                        i5.j(t15, j15, i5.F(t16, j15));
                        G(t15, i16, i15);
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    I(t15, t16, i15);
                    break;
            }
        }
        m4.o(this.f31355o, t15, t16);
        if (this.f31346f) {
            m4.m(this.f31356p, t15, t16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[LOOP:1: B:45:0x00aa->B:50:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.l4
    public final boolean f(T t15) {
        int i15;
        int i16;
        y3<T> y3Var;
        T t16;
        List list;
        l4 l4VarP;
        int i17;
        int i18 = 1048575;
        int i19 = 0;
        int i25 = 0;
        while (i19 < this.f31351k) {
            int i26 = this.f31350j[i19];
            int i27 = this.f31341a[i26];
            int iM = M(i26);
            int i28 = this.f31341a[i26 + 2];
            int i29 = i28 & 1048575;
            int i35 = 1 << (i28 >>> 20);
            if (i29 != i18) {
                if (i29 != 1048575) {
                    i25 = f31340s.getInt(t15, i29);
                }
                i16 = i25;
                i15 = i29;
            } else {
                i15 = i18;
                i16 = i25;
            }
            if ((268435456 & iM) != 0) {
                y3Var = this;
                t16 = t15;
                if (!y3Var.A(t16, i26, i15, i16, i35)) {
                    return false;
                }
            } else {
                y3Var = this;
                t16 = t15;
            }
            int i36 = (267386880 & iM) >>> 20;
            if (i36 == 9 || i36 == 17) {
                if (y3Var.A(t16, i26, i15, i16, i35) && !B(t16, iM, p(i26))) {
                    return false;
                }
            } else if (i36 == 27) {
                list = (List) i5.F(t16, iM & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    l4VarP = p(i26);
                    for (i17 = 0; i17 < list.size(); i17++) {
                        if (!l4VarP.f(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (i36 == 60 || i36 == 68) {
                if (z(t16, i27, i26) && !B(t16, iM, p(i26))) {
                    return false;
                }
            } else if (i36 == 49) {
                list = (List) i5.F(t16, iM & 1048575);
                if (list.isEmpty()) {
                    l4VarP = p(i26);
                    while (i17 < list.size()) {
                        if (!l4VarP.f(list.get(i17))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i36 == 50 && !y3Var.f31357q.a(i5.F(t16, iM & 1048575)).isEmpty()) {
                y3Var.f31357q.c(E(i26));
                throw null;
            }
            i19++;
            t15 = t16;
            i18 = i15;
            i25 = i16;
        }
        return !this.f31346f || this.f31356p.b(t15).r();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.vision.l4
    public final boolean g(T t15, T t16) {
        int length = this.f31341a.length;
        int i15 = 0;
        while (true) {
            boolean zQ = true;
            if (i15 >= length) {
                if (!this.f31355o.f(t15).equals(this.f31355o.f(t16))) {
                    return false;
                }
                if (this.f31346f) {
                    return this.f31356p.b(t15).equals(this.f31356p.b(t16));
                }
                return true;
            }
            int iM = M(i15);
            long j15 = iM & 1048575;
            switch ((iM & 267386880) >>> 20) {
                case 0:
                    if (!L(t15, t16, i15) || Double.doubleToLongBits(i5.C(t15, j15)) != Double.doubleToLongBits(i5.C(t16, j15))) {
                        zQ = false;
                    }
                    break;
                case 1:
                    if (!L(t15, t16, i15) || Float.floatToIntBits(i5.x(t15, j15)) != Float.floatToIntBits(i5.x(t16, j15))) {
                        zQ = false;
                    }
                    break;
                case 2:
                    if (!L(t15, t16, i15) || i5.o(t15, j15) != i5.o(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 3:
                    if (!L(t15, t16, i15) || i5.o(t15, j15) != i5.o(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 4:
                    if (!L(t15, t16, i15) || i5.b(t15, j15) != i5.b(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 5:
                    if (!L(t15, t16, i15) || i5.o(t15, j15) != i5.o(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 6:
                    if (!L(t15, t16, i15) || i5.b(t15, j15) != i5.b(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 7:
                    if (!L(t15, t16, i15) || i5.w(t15, j15) != i5.w(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 8:
                    if (!L(t15, t16, i15) || !m4.q(i5.F(t15, j15), i5.F(t16, j15))) {
                        zQ = false;
                    }
                    break;
                case 9:
                    if (!L(t15, t16, i15) || !m4.q(i5.F(t15, j15), i5.F(t16, j15))) {
                        zQ = false;
                    }
                    break;
                case 10:
                    if (!L(t15, t16, i15) || !m4.q(i5.F(t15, j15), i5.F(t16, j15))) {
                        zQ = false;
                    }
                    break;
                case 11:
                    if (!L(t15, t16, i15) || i5.b(t15, j15) != i5.b(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 12:
                    if (!L(t15, t16, i15) || i5.b(t15, j15) != i5.b(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 13:
                    if (!L(t15, t16, i15) || i5.b(t15, j15) != i5.b(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 14:
                    if (!L(t15, t16, i15) || i5.o(t15, j15) != i5.o(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 15:
                    if (!L(t15, t16, i15) || i5.b(t15, j15) != i5.b(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 16:
                    if (!L(t15, t16, i15) || i5.o(t15, j15) != i5.o(t16, j15)) {
                        zQ = false;
                    }
                    break;
                case 17:
                    if (!L(t15, t16, i15) || !m4.q(i5.F(t15, j15), i5.F(t16, j15))) {
                        zQ = false;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BERTags.DATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                case 40:
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                case EACTags.CURRENCY_CODE /* 42 */:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zQ = m4.q(i5.F(t15, j15), i5.F(t16, j15));
                    break;
                case 50:
                    zQ = m4.q(i5.F(t15, j15), i5.F(t16, j15));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case 53:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    long jO = O(i15) & 1048575;
                    if (i5.b(t15, jO) != i5.b(t16, jO) || !m4.q(i5.F(t15, j15), i5.F(t16, j15))) {
                        zQ = false;
                    }
                    break;
            }
            if (!zQ) {
                return false;
            }
            i15 += 3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0087. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.l4
    public final void h(T t15, byte[] bArr, int i15, int i16, a1 a1Var) throws u2 {
        T t16;
        Unsafe unsafe;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        this = this;
        T t17 = t15;
        byte[] bArr2 = bArr;
        int i36 = i16;
        a1Var = a1Var;
        if (!this.f31348h) {
            n(t17, bArr, i15, i36, 0, a1Var);
            return;
        }
        Unsafe unsafe2 = f31340s;
        int i37 = -1;
        int iK = i15;
        int i38 = -1;
        int i39 = 0;
        int i45 = 0;
        int i46 = 1048575;
        while (iK < i36) {
            int iD = iK + 1;
            int i47 = bArr2[iK];
            if (i47 < 0) {
                iD = z0.d(i47, bArr2, iD, a1Var);
                i47 = a1Var.f30955a;
            }
            int i48 = iD;
            i38 = i47 >>> 3;
            int i49 = i47 & 7;
            int i55 = i38 > i38 ? this.i(i38, i39 / 3) : this.S(i38);
            if (i55 == i37) {
                t16 = t17;
                unsafe = unsafe2;
                i17 = i47;
                i18 = i38;
                i19 = 0;
            } else {
                int[] iArr = this.f31341a;
                int i56 = iArr[i55 + 1];
                int i57 = (i56 & 267386880) >>> 20;
                int i58 = i47;
                int i59 = i55;
                long j15 = i56 & 1048575;
                if (i57 <= 17) {
                    int i65 = iArr[i59 + 2];
                    int i66 = 1 << (i65 >>> 20);
                    int i67 = i65 & 1048575;
                    int i68 = 1048575;
                    if (i67 != i46) {
                        if (i46 != 1048575) {
                            unsafe2.putInt(t17, i46, i45);
                            i68 = 1048575;
                        }
                        if (i67 != i68) {
                            i45 = unsafe2.getInt(t17, i67);
                        }
                        i46 = i67;
                    }
                    switch (i57) {
                        case 0:
                            i68 = i68;
                            if (i49 != 1) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                i5.f(t17, j15, z0.m(bArr2, i48));
                                iK = i48 + 8;
                                i45 |= i66;
                                i36 = i16;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 1:
                            i68 = i68;
                            if (i49 != 5) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                i5.g(t17, j15, z0.o(bArr2, i48));
                                iK = i48 + 4;
                                i45 |= i66;
                                i36 = i16;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i68 = i68;
                            if (i49 != 0) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                int iK2 = z0.k(bArr2, i48, a1Var);
                                Unsafe unsafe3 = unsafe2;
                                T t18 = t17;
                                unsafe3.putLong(t18, j15, a1Var.f30956b);
                                unsafe2 = unsafe3;
                                t17 = t18;
                                i45 |= i66;
                                iK = iK2;
                                i38 = i38;
                                i39 = i59;
                                i37 = -1;
                                i36 = i16;
                            }
                            break;
                        case 4:
                        case 11:
                            i68 = i68;
                            if (i49 != 0) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                int i69 = z0.i(bArr2, i48, a1Var);
                                unsafe2.putInt(t17, j15, a1Var.f30955a);
                                i45 |= i66;
                                i36 = i16;
                                iK = i69;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i68 = i68;
                            if (i49 != 1) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                T t19 = t17;
                                unsafe4.putLong(t19, j15, z0.l(bArr2, i48));
                                unsafe2 = unsafe4;
                                t17 = t19;
                                iK = i48 + 8;
                                i45 |= i66;
                                i36 = i16;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i68 = i68;
                            if (i49 != 5) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(t17, j15, z0.h(bArr2, i48));
                                iK = i48 + 4;
                                i45 |= i66;
                                i36 = i16;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 7:
                            i68 = i68;
                            if (i49 != 0) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                iK = z0.k(bArr2, i48, a1Var);
                                i5.k(t17, j15, a1Var.f30956b != 0);
                                i45 |= i66;
                                i36 = i16;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 8:
                            i68 = i68;
                            if (i49 != 2) {
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                iK = (536870912 & i56) == 0 ? z0.n(bArr2, i48, a1Var) : z0.p(bArr2, i48, a1Var);
                                unsafe2.putObject(t17, j15, a1Var.f30957c);
                                i45 |= i66;
                                i39 = i59;
                                i37 = -1;
                            }
                            break;
                        case 9:
                            i35 = i59;
                            if (i49 != 2) {
                                i59 = i35;
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                iK = z0.g(this.p(i35), bArr2, i48, i36, a1Var);
                                Object object = unsafe2.getObject(t17, j15);
                                if (object == null) {
                                    unsafe2.putObject(t17, j15, a1Var.f30957c);
                                } else {
                                    unsafe2.putObject(t17, j15, p2.e(object, a1Var.f30957c));
                                }
                                i45 |= i66;
                                i39 = i35;
                                i37 = -1;
                            }
                            break;
                        case 10:
                            i35 = i59;
                            if (i49 != 2) {
                                i59 = i35;
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                iK = z0.q(bArr2, i48, a1Var);
                                unsafe2.putObject(t17, j15, a1Var.f30957c);
                                i45 |= i66;
                                i39 = i35;
                                i37 = -1;
                            }
                            break;
                        case 12:
                            i35 = i59;
                            if (i49 != 0) {
                                i59 = i35;
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                iK = z0.i(bArr2, i48, a1Var);
                                unsafe2.putInt(t17, j15, a1Var.f30955a);
                                i45 |= i66;
                                i39 = i35;
                                i37 = -1;
                            }
                            break;
                        case 15:
                            i35 = i59;
                            if (i49 != 0) {
                                i59 = i35;
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                iK = z0.i(bArr2, i48, a1Var);
                                unsafe2.putInt(t17, j15, r1.d(a1Var.f30955a));
                                i45 |= i66;
                                i39 = i35;
                                i37 = -1;
                            }
                            break;
                        case 16:
                            if (i49 != 0) {
                                i68 = i68;
                                t16 = t17;
                                unsafe = unsafe2;
                                i18 = i38;
                                i19 = i59;
                                i17 = i58 == true ? 1 : 0;
                            } else {
                                int iK3 = z0.k(bArr2, i48, a1Var);
                                Unsafe unsafe5 = unsafe2;
                                T t25 = t17;
                                i35 = i59;
                                unsafe5.putLong(t25, j15, r1.a(a1Var.f30956b));
                                unsafe2 = unsafe5;
                                t17 = t25;
                                i45 |= i66;
                                iK = iK3;
                                i39 = i35;
                                i37 = -1;
                            }
                            break;
                        default:
                            i68 = i68;
                            t16 = t17;
                            unsafe = unsafe2;
                            i18 = i38;
                            i19 = i59;
                            i17 = i58 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i19 = i59;
                    if (i57 != 27) {
                        i25 = i48;
                        Unsafe unsafe6 = unsafe2;
                        if (i57 <= 49) {
                            int i75 = i46;
                            i26 = i45;
                            unsafe = unsafe6;
                            int iL = this.l(t15, bArr, i25, i16, i58 == true ? 1 : 0, i38, i49, i19, i56, i57, j15, a1Var);
                            if (iL == i25) {
                                i48 = iL;
                                i18 = i38;
                                i17 = i58 == true ? 1 : 0;
                                i45 = i26;
                                t16 = t15;
                                i46 = i75;
                            } else {
                                t17 = t15;
                                i46 = i75;
                                iK = iL;
                                i39 = i19;
                                i38 = i38;
                                i45 = i26;
                                unsafe2 = unsafe;
                                i37 = -1;
                                bArr2 = bArr;
                                i36 = i16;
                            }
                        } else {
                            i26 = i45;
                            unsafe = unsafe6;
                            i27 = i38;
                            i28 = i46;
                            i29 = i58 == true ? 1 : 0;
                            if (i57 == 50) {
                                if (i49 == 2) {
                                    int iM = m(t15, bArr, i25, i16, i19, j15, a1Var);
                                    if (iM == i25) {
                                        i19 = i19;
                                        i48 = iM;
                                    } else {
                                        i19 = i19;
                                        this = this;
                                        t17 = t15;
                                        bArr2 = bArr;
                                        a1Var = a1Var;
                                        iK = iM;
                                        i39 = i19;
                                        i38 = i27;
                                        i46 = i28;
                                        i45 = i26;
                                        unsafe2 = unsafe;
                                        i37 = -1;
                                        i36 = i16;
                                    }
                                } else {
                                    i19 = i19;
                                    i48 = i25;
                                }
                                i18 = i27;
                                i17 = i29;
                                i46 = i28;
                                i45 = i26;
                                t16 = t15;
                            } else {
                                i18 = i27;
                                int iK4 = k(t15, bArr, i25, i16, i29 == true ? 1 : 0, i18, i49, i56, i57, j15, i19, a1Var);
                                t16 = t15;
                                i17 = i29 == true ? 1 : 0;
                                if (iK4 == i25) {
                                    i19 = i19;
                                    i48 = iK4;
                                    i46 = i28;
                                    i45 = i26;
                                } else {
                                    i19 = i19;
                                    i38 = i18;
                                    iK = iK4;
                                    i39 = i19;
                                    t17 = t16;
                                    i46 = i28;
                                    i45 = i26;
                                    unsafe2 = unsafe;
                                    i37 = -1;
                                    bArr2 = bArr;
                                    i36 = i16;
                                }
                            }
                        }
                    } else if (i49 == 2) {
                        v2 v2VarB = (v2) unsafe2.getObject(t17, j15);
                        if (!v2VarB.zza()) {
                            int size = v2VarB.size();
                            v2VarB = v2VarB.b(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t17, j15, v2VarB);
                        }
                        int iE = z0.e(this.p(i19), i58 == true ? 1 : 0, bArr2, i48, i16, v2VarB, a1Var);
                        bArr2 = bArr;
                        a1Var = a1Var;
                        iK = iE;
                        i39 = i19;
                        unsafe2 = unsafe2;
                        i38 = i38;
                        i37 = -1;
                        t17 = t15;
                        i36 = i16;
                    } else {
                        i25 = i48;
                        i26 = i45;
                        unsafe = unsafe2;
                        i27 = i38;
                        i28 = i46;
                        i29 = i58 == true ? 1 : 0;
                        i48 = i25;
                        i18 = i27;
                        i17 = i29;
                        i46 = i28;
                        i45 = i26;
                        t16 = t15;
                    }
                }
            }
            int iC = z0.c(i17 == true ? 1 : 0, bArr, i48, i16, Q(t16), a1Var);
            bArr2 = bArr;
            a1Var = a1Var;
            i38 = i18;
            i39 = i19;
            t17 = t16;
            unsafe2 = unsafe;
            i37 = -1;
            i36 = i16;
            iK = iC;
            this = this;
        }
        T t26 = t17;
        Unsafe unsafe7 = unsafe2;
        int i76 = i36;
        int i77 = i46;
        int i78 = i45;
        if (i77 != 1048575) {
            unsafe7.putInt(t26, i77, i78);
        }
        if (iK != i76) {
            throw u2.e();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int n(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.vision.a1 r35) throws com.google.android.gms.internal.vision.u2 {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.y3.n(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.a1):int");
    }

    @Override // com.google.android.gms.internal.vision.l4
    public final T zza() {
        return (T) this.f31353m.b(this.f31345e);
    }
}
