package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class p2<T> implements c3<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f29499s = b4.z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f29500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f29501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l2 f29505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f29507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f29508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f29509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f29510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f29511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f29512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s2 f29513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final v1 f29514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u3<?, ?> f29515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s0<?> f29516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g2 f29517r;

    private p2(int[] iArr, Object[] objArr, int i15, int i16, int i17, l2 l2Var, boolean z15, boolean z16, int[] iArr2, int[] iArr3, int[] iArr4, s2 s2Var, v1 v1Var, u3<?, ?> u3Var, s0<?> s0Var, g2 g2Var) {
        this.f29500a = iArr;
        this.f29501b = objArr;
        this.f29502c = i15;
        this.f29503d = i16;
        this.f29504e = i17;
        this.f29507h = l2Var instanceof f1;
        this.f29508i = z15;
        this.f29506g = s0Var != null && s0Var.g(l2Var);
        this.f29509j = false;
        this.f29510k = iArr2;
        this.f29511l = iArr3;
        this.f29512m = iArr4;
        this.f29513n = s2Var;
        this.f29514o = v1Var;
        this.f29515p = u3Var;
        this.f29516q = s0Var;
        this.f29505f = l2Var;
        this.f29517r = g2Var;
    }

    private final boolean A(T t15, int i15, int i16, int i17) {
        if (this.f29508i) {
            return y(t15, i15);
        }
        return (i16 & i17) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean B(Object obj, int i15, c3 c3Var) {
        return c3Var.f(b4.M(obj, i15 & 1048575));
    }

    private final c3 C(int i15) {
        int i16 = (i15 / 4) << 1;
        c3 c3Var = (c3) this.f29501b[i16];
        if (c3Var != null) {
            return c3Var;
        }
        c3<T> c3VarB = x2.a().b((Class) this.f29501b[i16 + 1]);
        this.f29501b[i16] = c3VarB;
        return c3VarB;
    }

    private final Object D(int i15) {
        return this.f29501b[(i15 / 4) << 1];
    }

    private final j1<?> E(int i15) {
        return (j1) this.f29501b[((i15 / 4) << 1) + 1];
    }

    private final int F(int i15) {
        return this.f29500a[i15 + 1];
    }

    private final int G(int i15) {
        return this.f29500a[i15 + 2];
    }

    private final int H(int i15) {
        int i16 = this.f29502c;
        if (i15 >= i16) {
            int i17 = this.f29504e;
            if (i15 < i17) {
                int i18 = (i15 - i16) << 2;
                if (this.f29500a[i18] == i15) {
                    return i18;
                }
                return -1;
            }
            if (i15 <= this.f29503d) {
                int i19 = i17 - i16;
                int length = (this.f29500a.length / 4) - 1;
                while (i19 <= length) {
                    int i25 = (length + i19) >>> 1;
                    int i26 = i25 << 2;
                    int i27 = this.f29500a[i26];
                    if (i15 == i27) {
                        return i26;
                    }
                    if (i15 < i27) {
                        length = i25 - 1;
                    } else {
                        i19 = i25 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void I(T t15, int i15) {
        if (this.f29508i) {
            return;
        }
        int iG = G(i15);
        long j15 = iG & 1048575;
        b4.g(t15, j15, b4.H(t15, j15) | (1 << (iG >>> 20)));
    }

    private final void J(T t15, int i15, int i16) {
        b4.g(t15, G(i16) & 1048575, i15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private final void K(T t15, p4 p4Var) {
        Iterator itE;
        Map.Entry<?, ?> entry;
        boolean z15;
        int i15;
        boolean z16;
        if (this.f29506g) {
            w0<T> w0VarB = this.f29516q.b(t15);
            if (w0VarB.b()) {
                itE = null;
                entry = null;
            } else {
                itE = w0VarB.e();
                entry = (Map.Entry) itE.next();
            }
        } else {
            itE = null;
            entry = null;
        }
        int length = this.f29500a.length;
        Unsafe unsafe = f29499s;
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18 += 4) {
            int iF = F(i18);
            int[] iArr = this.f29500a;
            int i19 = iArr[i18];
            int i25 = (267386880 & iF) >>> 20;
            if (this.f29508i || i25 > 17) {
                z15 = true;
                i15 = 0;
            } else {
                int i26 = iArr[i18 + 2];
                int i27 = i26 & 1048575;
                z15 = true;
                if (i27 != i16) {
                    i17 = unsafe.getInt(t15, i27);
                    i16 = i27;
                }
                i15 = 1 << (i26 >>> 20);
            }
            while (entry != null && this.f29516q.a(entry) <= i19) {
                this.f29516q.c(p4Var, entry);
                entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
            }
            long j15 = iF & 1048575;
            switch (i25) {
                case 0:
                    if ((i15 & i17) != 0) {
                        p4Var.q(i19, b4.L(t15, j15));
                    }
                    break;
                case 1:
                    if ((i15 & i17) != 0) {
                        p4Var.r(i19, b4.K(t15, j15));
                    }
                    break;
                case 2:
                    if ((i15 & i17) != 0) {
                        p4Var.O(i19, unsafe.getLong(t15, j15));
                    }
                    break;
                case 3:
                    if ((i15 & i17) != 0) {
                        p4Var.o(i19, unsafe.getLong(t15, j15));
                    }
                    break;
                case 4:
                    if ((i15 & i17) != 0) {
                        p4Var.l(i19, unsafe.getInt(t15, j15));
                    }
                    break;
                case 5:
                    if ((i15 & i17) != 0) {
                        p4Var.a(i19, unsafe.getLong(t15, j15));
                    }
                    break;
                case 6:
                    if ((i15 & i17) != 0) {
                        p4Var.s(i19, unsafe.getInt(t15, j15));
                    }
                    break;
                case 7:
                    if ((i15 & i17) != 0) {
                        p4Var.k(i19, b4.J(t15, j15));
                    }
                    break;
                case 8:
                    if ((i15 & i17) != 0) {
                        u(i19, unsafe.getObject(t15, j15), p4Var);
                    }
                    break;
                case 9:
                    if ((i15 & i17) != 0) {
                        p4Var.L(i19, unsafe.getObject(t15, j15), C(i18));
                    }
                    break;
                case 10:
                    if ((i15 & i17) != 0) {
                        p4Var.K(i19, (a0) unsafe.getObject(t15, j15));
                    }
                    break;
                case 11:
                    if ((i15 & i17) != 0) {
                        p4Var.v(i19, unsafe.getInt(t15, j15));
                    }
                    break;
                case 12:
                    if ((i15 & i17) != 0) {
                        p4Var.P(i19, unsafe.getInt(t15, j15));
                    }
                    break;
                case 13:
                    if ((i15 & i17) != 0) {
                        p4Var.S(i19, unsafe.getInt(t15, j15));
                    }
                    break;
                case 14:
                    if ((i15 & i17) != 0) {
                        p4Var.z(i19, unsafe.getLong(t15, j15));
                    }
                    break;
                case 15:
                    if ((i15 & i17) != 0) {
                        p4Var.x(i19, unsafe.getInt(t15, j15));
                    }
                    break;
                case 16:
                    if ((i15 & i17) != 0) {
                        p4Var.h(i19, unsafe.getLong(t15, j15));
                    }
                    break;
                case 17:
                    if ((i15 & i17) != 0) {
                        p4Var.M(i19, unsafe.getObject(t15, j15), C(i18));
                    }
                    break;
                case 18:
                    e3.f(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 19:
                    e3.m(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 20:
                    e3.r(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 21:
                    e3.x(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 22:
                    e3.M(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 23:
                    e3.H(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 24:
                    e3.R(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 25:
                    e3.U(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 26:
                    e3.d(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var);
                    break;
                case 27:
                    e3.e(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, C(i18));
                    break;
                case 28:
                    e3.k(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var);
                    break;
                case 29:
                    z16 = false;
                    e3.O(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 30:
                    z16 = false;
                    e3.T(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    z16 = false;
                    e3.S(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 32:
                    z16 = false;
                    e3.K(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 33:
                    z16 = false;
                    e3.Q(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 34:
                    z16 = false;
                    e3.F(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, false);
                    break;
                case 35:
                    e3.f(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case 36:
                    e3.m(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    e3.r(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    e3.x(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    e3.M(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case 40:
                    e3.H(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    e3.R(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    e3.U(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    e3.O(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    e3.T(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    e3.S(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case 46:
                    e3.K(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case 47:
                    e3.Q(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case 48:
                    e3.F(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, z15);
                    break;
                case 49:
                    e3.l(this.f29500a[i18], (List) unsafe.getObject(t15, j15), p4Var, C(i18));
                    break;
                case 50:
                    w(p4Var, i19, unsafe.getObject(t15, j15), i18);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i19, i18)) {
                        p4Var.q(i19, O(t15, j15));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i19, i18)) {
                        p4Var.r(i19, P(t15, j15));
                    }
                    break;
                case 53:
                    if (z(t15, i19, i18)) {
                        p4Var.O(i19, R(t15, j15));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i19, i18)) {
                        p4Var.o(i19, R(t15, j15));
                    }
                    break;
                case 55:
                    if (z(t15, i19, i18)) {
                        p4Var.l(i19, Q(t15, j15));
                    }
                    break;
                case 56:
                    if (z(t15, i19, i18)) {
                        p4Var.a(i19, R(t15, j15));
                    }
                    break;
                case 57:
                    if (z(t15, i19, i18)) {
                        p4Var.s(i19, Q(t15, j15));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i19, i18)) {
                        p4Var.k(i19, S(t15, j15));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i19, i18)) {
                        u(i19, unsafe.getObject(t15, j15), p4Var);
                    }
                    break;
                case 60:
                    if (z(t15, i19, i18)) {
                        p4Var.L(i19, unsafe.getObject(t15, j15), C(i18));
                    }
                    break;
                case 61:
                    if (z(t15, i19, i18)) {
                        p4Var.K(i19, (a0) unsafe.getObject(t15, j15));
                    }
                    break;
                case 62:
                    if (z(t15, i19, i18)) {
                        p4Var.v(i19, Q(t15, j15));
                    }
                    break;
                case 63:
                    if (z(t15, i19, i18)) {
                        p4Var.P(i19, Q(t15, j15));
                    }
                    break;
                case 64:
                    if (z(t15, i19, i18)) {
                        p4Var.S(i19, Q(t15, j15));
                    }
                    break;
                case 65:
                    if (z(t15, i19, i18)) {
                        p4Var.z(i19, R(t15, j15));
                    }
                    break;
                case 66:
                    if (z(t15, i19, i18)) {
                        p4Var.x(i19, Q(t15, j15));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i19, i18)) {
                        p4Var.h(i19, R(t15, j15));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i19, i18)) {
                        p4Var.M(i19, unsafe.getObject(t15, j15), C(i18));
                    }
                    break;
                default:
                    break;
            }
        }
        while (entry != null) {
            this.f29516q.c(p4Var, entry);
            entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
        }
        v(this.f29515p, t15, p4Var);
    }

    private final void L(T t15, T t16, int i15) {
        int iF = F(i15);
        int i16 = this.f29500a[i15];
        long j15 = iF & 1048575;
        if (z(t16, i16, i15)) {
            Object objM = b4.M(t15, j15);
            Object objM2 = b4.M(t16, j15);
            if (objM != null && objM2 != null) {
                objM2 = h1.d(objM, objM2);
            } else if (objM2 == null) {
                return;
            }
            b4.i(t15, j15, objM2);
            J(t15, i16, i15);
        }
    }

    private final boolean M(T t15, T t16, int i15) {
        return y(t15, i15) == y(t16, i15);
    }

    private static <E> List<E> N(Object obj, long j15) {
        return (List) b4.M(obj, j15);
    }

    private static <T> double O(T t15, long j15) {
        return ((Double) b4.M(t15, j15)).doubleValue();
    }

    private static <T> float P(T t15, long j15) {
        return ((Float) b4.M(t15, j15)).floatValue();
    }

    private static <T> int Q(T t15, long j15) {
        return ((Integer) b4.M(t15, j15)).intValue();
    }

    private static <T> long R(T t15, long j15) {
        return ((Long) b4.M(t15, j15)).longValue();
    }

    private static <T> boolean S(T t15, long j15) {
        return ((Boolean) b4.M(t15, j15)).booleanValue();
    }

    private static v3 T(Object obj) {
        f1 f1Var = (f1) obj;
        v3 v3Var = f1Var.zzjp;
        if (v3Var != v3.h()) {
            return v3Var;
        }
        v3 v3VarI = v3.i();
        f1Var.zzjp = v3VarI;
        return v3VarI;
    }

    private static int j(int i15, byte[] bArr, int i16, int i17, Object obj, w wVar) {
        return v.c(i15, bArr, i16, i17, T(obj), wVar);
    }

    private static int k(c3<?> c3Var, int i15, byte[] bArr, int i16, int i17, k1<?> k1Var, w wVar) throws l1 {
        int iM = m(c3Var, bArr, i16, i17, wVar);
        while (true) {
            k1Var.add(wVar.f29579c);
            if (iM >= i17) {
                break;
            }
            int iE = v.e(bArr, iM, wVar);
            if (i15 != wVar.f29577a) {
                break;
            }
            iM = m(c3Var, bArr, iE, i17, wVar);
        }
        return iM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int l(c3 c3Var, byte[] bArr, int i15, int i16, int i17, w wVar) throws l1 {
        p2 p2Var = (p2) c3Var;
        Object objD = p2Var.d();
        int iR = p2Var.r(objD, bArr, i15, i16, i17, wVar);
        p2Var.a(objD);
        wVar.f29579c = objD;
        return iR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int m(c3 c3Var, byte[] bArr, int i15, int i16, w wVar) throws l1 {
        int iD = i15 + 1;
        int i17 = bArr[i15];
        if (i17 < 0) {
            iD = v.d(i17, bArr, iD, wVar);
            i17 = wVar.f29577a;
        }
        int i18 = iD;
        if (i17 < 0 || i17 > i16 - i18) {
            throw l1.a();
        }
        Object objD = c3Var.d();
        int i19 = i18 + i17;
        c3Var.i(objD, bArr, i18, i19, wVar);
        c3Var.a(objD);
        wVar.f29579c = objD;
        return i19;
    }

    private static <UT, UB> int n(u3<UT, UB> u3Var, T t15) {
        return u3Var.j(u3Var.k(t15));
    }

    private final int o(T t15, byte[] bArr, int i15, int i16, int i17, int i18, int i19, int i25, int i26, long j15, int i27, w wVar) throws l1 {
        int i28;
        Object objValueOf;
        int i29;
        Object objValueOf2;
        int iG;
        long jA;
        int iE;
        Object objValueOf3;
        Object object;
        Unsafe unsafe = f29499s;
        long j16 = this.f29500a[i27 + 2] & 1048575;
        switch (i26) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                i28 = i15;
                if (i19 != 1) {
                    return i28;
                }
                objValueOf = Double.valueOf(v.l(bArr, i15));
                unsafe.putObject(t15, j15, objValueOf);
                iG = i28 + 8;
                unsafe.putInt(t15, j16, i18);
                return iG;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                i29 = i15;
                if (i19 != 5) {
                    return i29;
                }
                objValueOf2 = Float.valueOf(v.n(bArr, i15));
                unsafe.putObject(t15, j15, objValueOf2);
                iG = i29 + 4;
                unsafe.putInt(t15, j16, i18);
                return iG;
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i19 != 0) {
                    return i15;
                }
                iG = v.g(bArr, i15, wVar);
                jA = wVar.f29578b;
                objValueOf3 = Long.valueOf(jA);
                unsafe.putObject(t15, j15, objValueOf3);
                unsafe.putInt(t15, j16, i18);
                return iG;
            case 55:
            case 62:
                if (i19 != 0) {
                    return i15;
                }
                iG = v.e(bArr, i15, wVar);
                iE = wVar.f29577a;
                objValueOf3 = Integer.valueOf(iE);
                unsafe.putObject(t15, j15, objValueOf3);
                unsafe.putInt(t15, j16, i18);
                return iG;
            case 56:
            case 65:
                i28 = i15;
                if (i19 != 1) {
                    return i28;
                }
                objValueOf = Long.valueOf(v.k(bArr, i15));
                unsafe.putObject(t15, j15, objValueOf);
                iG = i28 + 8;
                unsafe.putInt(t15, j16, i18);
                return iG;
            case 57:
            case 64:
                i29 = i15;
                if (i19 != 5) {
                    return i29;
                }
                objValueOf2 = Integer.valueOf(v.h(bArr, i15));
                unsafe.putObject(t15, j15, objValueOf2);
                iG = i29 + 4;
                unsafe.putInt(t15, j16, i18);
                return iG;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i19 != 0) {
                    return i15;
                }
                iG = v.g(bArr, i15, wVar);
                objValueOf3 = Boolean.valueOf(wVar.f29578b != 0);
                unsafe.putObject(t15, j15, objValueOf3);
                unsafe.putInt(t15, j16, i18);
                return iG;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i19 != 2) {
                    return i15;
                }
                int iE2 = v.e(bArr, i15, wVar);
                int i35 = wVar.f29577a;
                if (i35 == 0) {
                    unsafe.putObject(t15, j15, "");
                } else {
                    if ((i25 & PKIFailureInfo.duplicateCertReq) != 0 && !d4.i(bArr, iE2, iE2 + i35)) {
                        throw l1.e();
                    }
                    unsafe.putObject(t15, j15, new String(bArr, iE2, i35, h1.f29350a));
                    iE2 += i35;
                }
                unsafe.putInt(t15, j16, i18);
                return iE2;
            case 60:
                if (i19 != 2) {
                    return i15;
                }
                int iM = m(C(i27), bArr, i15, i16, wVar);
                object = unsafe.getInt(t15, j16) == i18 ? unsafe.getObject(t15, j15) : null;
                Object objD = wVar.f29579c;
                if (object != null) {
                    objD = h1.d(object, objD);
                }
                unsafe.putObject(t15, j15, objD);
                unsafe.putInt(t15, j16, i18);
                return iM;
            case 61:
                if (i19 != 2) {
                    return i15;
                }
                int iE3 = v.e(bArr, i15, wVar);
                int i36 = wVar.f29577a;
                if (i36 == 0) {
                    unsafe.putObject(t15, j15, a0.f29117b);
                } else {
                    unsafe.putObject(t15, j15, a0.n(bArr, iE3, i36));
                    iE3 += i36;
                }
                unsafe.putInt(t15, j16, i18);
                return iE3;
            case 63:
                if (i19 != 0) {
                    return i15;
                }
                int iE4 = v.e(bArr, i15, wVar);
                int i37 = wVar.f29577a;
                j1<?> j1VarE = E(i27);
                if (j1VarE != null && j1VarE.p(i37) == null) {
                    T(t15).e(i17, Long.valueOf(i37));
                    return iE4;
                }
                unsafe.putObject(t15, j15, Integer.valueOf(i37));
                iG = iE4;
                unsafe.putInt(t15, j16, i18);
                return iG;
            case 66:
                if (i19 != 0) {
                    return i15;
                }
                iG = v.e(bArr, i15, wVar);
                iE = j0.e(wVar.f29577a);
                objValueOf3 = Integer.valueOf(iE);
                unsafe.putObject(t15, j15, objValueOf3);
                unsafe.putInt(t15, j16, i18);
                return iG;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i19 != 0) {
                    return i15;
                }
                iG = v.g(bArr, i15, wVar);
                jA = j0.a(wVar.f29578b);
                objValueOf3 = Long.valueOf(jA);
                unsafe.putObject(t15, j15, objValueOf3);
                unsafe.putInt(t15, j16, i18);
                return iG;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i19 == 3) {
                    iG = l(C(i27), bArr, i15, i16, (i17 & (-8)) | 4, wVar);
                    object = unsafe.getInt(t15, j16) == i18 ? unsafe.getObject(t15, j15) : null;
                    objValueOf3 = wVar.f29579c;
                    if (object != null) {
                        objValueOf3 = h1.d(object, objValueOf3);
                    }
                    unsafe.putObject(t15, j15, objValueOf3);
                    unsafe.putInt(t15, j16, i18);
                    return iG;
                }
            default:
                return i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0278 A[LOOP:9: B:141:0x0279->B:140:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x027e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0286  */
    /* JADX WARN: Code duplicated, block: B:266:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0219 -> B:104:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x028e -> B:139:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0180 -> B:71:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01e2 -> B:91:0x01c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int p(T r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, com.google.android.gms.internal.clearcut.w r27) throws com.google.android.gms.internal.clearcut.l1 {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.p2.p(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.w):int");
    }

    private final <K, V> int q(T t15, byte[] bArr, int i15, int i16, int i17, int i18, long j15, w wVar) throws l1 {
        Unsafe unsafe = f29499s;
        Object objD = D(i17);
        Object object = unsafe.getObject(t15, j15);
        if (this.f29517r.g(object)) {
            Object objF = this.f29517r.f(objD);
            this.f29517r.e(objF, object);
            unsafe.putObject(t15, j15, objF);
            object = objF;
        }
        this.f29517r.j(objD);
        this.f29517r.l(object);
        int iE = v.e(bArr, i15, wVar);
        int i19 = wVar.f29577a;
        if (i19 < 0 || i19 > i16 - iE) {
            throw l1.a();
        }
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11581. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private final int r(T r23, byte[] r24, int r25, int r26, int r8, com.google.android.gms.internal.clearcut.w r28) throws com.google.android.gms.internal.clearcut.l1 {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.p2.r(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.w):int");
    }

    static <T> p2<T> s(Class<T> cls, j2 j2Var, s2 s2Var, v1 v1Var, u3<?, ?> u3Var, s0<?> s0Var, g2 g2Var) {
        int iK;
        int i15;
        int i16;
        int iB;
        int iB2;
        int iQ;
        if (!(j2Var instanceof z2)) {
            ((p3) j2Var).a();
            throw new NoSuchMethodError();
        }
        z2 z2Var = (z2) j2Var;
        boolean z15 = z2Var.a() == f1.e.f29329j;
        if (z2Var.d() == 0) {
            iK = 0;
            i15 = 0;
            i16 = 0;
        } else {
            int iF = z2Var.f();
            int iG = z2Var.g();
            iK = z2Var.k();
            i15 = iF;
            i16 = iG;
        }
        int[] iArr = new int[iK << 2];
        Object[] objArr = new Object[iK << 1];
        int[] iArr2 = z2Var.h() > 0 ? new int[z2Var.h()] : null;
        int[] iArr3 = z2Var.i() > 0 ? new int[z2Var.i()] : null;
        a3 a3VarE = z2Var.e();
        if (a3VarE.a()) {
            int iG2 = a3VarE.g();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (iG2 >= z2Var.l() || i17 >= ((iG2 - i15) << 2)) {
                    if (a3VarE.k()) {
                        iB = (int) b4.b(a3VarE.l());
                        iB2 = (int) b4.b(a3VarE.m());
                        iQ = 0;
                    } else {
                        iB = (int) b4.b(a3VarE.n());
                        if (a3VarE.o()) {
                            iB2 = (int) b4.b(a3VarE.p());
                            iQ = a3VarE.q();
                        } else {
                            iB2 = 0;
                            iQ = 0;
                        }
                    }
                    iArr[i17] = a3VarE.g();
                    int i25 = i17 + 1;
                    iArr[i25] = (a3VarE.s() ? PKIFailureInfo.duplicateCertReq : 0) | (a3VarE.r() ? 268435456 : 0) | (a3VarE.h() << 20) | iB;
                    iArr[i17 + 2] = iB2 | (iQ << 20);
                    if (a3VarE.v() != null) {
                        int i26 = (i17 / 4) << 1;
                        objArr[i26] = a3VarE.v();
                        if (a3VarE.t() != null) {
                            objArr[i26 + 1] = a3VarE.t();
                        } else if (a3VarE.u() != null) {
                            objArr[i26 + 1] = a3VarE.u();
                        }
                    } else if (a3VarE.t() != null) {
                        objArr[((i17 / 4) << 1) + 1] = a3VarE.t();
                    } else if (a3VarE.u() != null) {
                        objArr[((i17 / 4) << 1) + 1] = a3VarE.u();
                    }
                    int iH = a3VarE.h();
                    if (iH == a1.D0.ordinal()) {
                        iArr2[i18] = i17;
                        i18++;
                    } else if (iH >= 18 && iH <= 49) {
                        iArr3[i19] = iArr[i25] & 1048575;
                        i19++;
                    }
                    if (!a3VarE.a()) {
                        break;
                    }
                    iG2 = a3VarE.g();
                } else {
                    for (int i27 = 0; i27 < 4; i27++) {
                        iArr[i17 + i27] = -1;
                    }
                }
                i17 += 4;
            }
        }
        return new p2<>(iArr, objArr, i15, i16, z2Var.l(), z2Var.c(), z15, false, z2Var.j(), iArr2, iArr3, s2Var, v1Var, u3Var, s0Var, g2Var);
    }

    private final <K, V, UT, UB> UB t(int i15, int i16, Map<K, V> map, j1<?> j1Var, UB ub5, u3<UT, UB> u3Var) {
        this.f29517r.j(D(i15));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (j1Var.p(((Integer) next.getValue()).intValue()) == null) {
                if (ub5 == null) {
                    ub5 = u3Var.f();
                }
                f0 f0VarT = a0.t(d2.a(null, next.getKey(), next.getValue()));
                try {
                    d2.b(f0VarT.b(), null, next.getKey(), next.getValue());
                    u3Var.b(ub5, i16, f0VarT.a());
                    it.remove();
                } catch (IOException e15) {
                    throw new RuntimeException(e15);
                }
            }
        }
        return ub5;
    }

    private static void u(int i15, Object obj, p4 p4Var) {
        if (obj instanceof String) {
            p4Var.C(i15, (String) obj);
        } else {
            p4Var.K(i15, (a0) obj);
        }
    }

    private static <UT, UB> void v(u3<UT, UB> u3Var, T t15, p4 p4Var) {
        u3Var.c(u3Var.k(t15), p4Var);
    }

    private final <K, V> void w(p4 p4Var, int i15, Object obj, int i16) {
        if (obj != null) {
            this.f29517r.j(D(i16));
            p4Var.R(i15, null, this.f29517r.h(obj));
        }
    }

    private final void x(T t15, T t16, int i15) {
        long jF = F(i15) & 1048575;
        if (y(t16, i15)) {
            Object objM = b4.M(t15, jF);
            Object objM2 = b4.M(t16, jF);
            if (objM != null && objM2 != null) {
                objM2 = h1.d(objM, objM2);
            } else if (objM2 == null) {
                return;
            }
            b4.i(t15, jF, objM2);
            I(t15, i15);
        }
    }

    private final boolean y(T t15, int i15) {
        if (!this.f29508i) {
            int iG = G(i15);
            return (b4.H(t15, (long) (iG & 1048575)) & (1 << (iG >>> 20))) != 0;
        }
        int iF = F(i15);
        long j15 = iF & 1048575;
        switch ((iF & 267386880) >>> 20) {
            case 0:
                return b4.L(t15, j15) != 0.0d;
            case 1:
                return b4.K(t15, j15) != 0.0f;
            case 2:
                return b4.I(t15, j15) != 0;
            case 3:
                return b4.I(t15, j15) != 0;
            case 4:
                return b4.H(t15, j15) != 0;
            case 5:
                return b4.I(t15, j15) != 0;
            case 6:
                return b4.H(t15, j15) != 0;
            case 7:
                return b4.J(t15, j15);
            case 8:
                Object objM = b4.M(t15, j15);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof a0) {
                    return !a0.f29117b.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return b4.M(t15, j15) != null;
            case 10:
                return !a0.f29117b.equals(b4.M(t15, j15));
            case 11:
                return b4.H(t15, j15) != 0;
            case 12:
                return b4.H(t15, j15) != 0;
            case 13:
                return b4.H(t15, j15) != 0;
            case 14:
                return b4.I(t15, j15) != 0;
            case 15:
                return b4.H(t15, j15) != 0;
            case 16:
                return b4.I(t15, j15) != 0;
            case 17:
                return b4.M(t15, j15) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean z(T t15, int i15, int i16) {
        return b4.H(t15, (long) (G(i16) & 1048575)) == i15;
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final void a(T t15) {
        int[] iArr = this.f29511l;
        if (iArr != null) {
            for (int i15 : iArr) {
                long jF = F(i15) & 1048575;
                Object objM = b4.M(t15, jF);
                if (objM != null) {
                    b4.i(t15, jF, this.f29517r.k(objM));
                }
            }
        }
        int[] iArr2 = this.f29512m;
        if (iArr2 != null) {
            for (int i16 : iArr2) {
                this.f29514o.a(t15, i16);
            }
        }
        this.f29515p.d(t15);
        if (this.f29506g) {
            this.f29516q.f(t15);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4 A[PHI: r3
      0x00f4: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:74:0x0110, B:68:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final int b(T t15) {
        int i15;
        double dL;
        float fK;
        boolean zJ;
        Object objM;
        int iH;
        long jI;
        Object objM2;
        int length = this.f29500a.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 4) {
            int iF = F(i17);
            int i18 = this.f29500a[i17];
            long j15 = 1048575 & iF;
            int iHashCode = 37;
            switch ((iF & 267386880) >>> 20) {
                case 0:
                    i15 = i16 * 53;
                    dL = b4.L(t15, j15);
                    jI = Double.doubleToLongBits(dL);
                    iH = h1.j(jI);
                    i16 = i15 + iH;
                    break;
                case 1:
                    i15 = i16 * 53;
                    fK = b4.K(t15, j15);
                    iH = Float.floatToIntBits(fK);
                    i16 = i15 + iH;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i15 = i16 * 53;
                    jI = b4.I(t15, j15);
                    iH = h1.j(jI);
                    i16 = i15 + iH;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i15 = i16 * 53;
                    iH = b4.H(t15, j15);
                    i16 = i15 + iH;
                    break;
                case 7:
                    i15 = i16 * 53;
                    zJ = b4.J(t15, j15);
                    iH = h1.f(zJ);
                    i16 = i15 + iH;
                    break;
                case 8:
                    i15 = i16 * 53;
                    iH = ((String) b4.M(t15, j15)).hashCode();
                    i16 = i15 + iH;
                    break;
                case 9:
                    objM = b4.M(t15, j15);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
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
                case 50:
                    i15 = i16 * 53;
                    objM2 = b4.M(t15, j15);
                    iH = objM2.hashCode();
                    i16 = i15 + iH;
                    break;
                case 17:
                    objM = b4.M(t15, j15);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        dL = O(t15, j15);
                        jI = Double.doubleToLongBits(dL);
                        iH = h1.j(jI);
                        i16 = i15 + iH;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        fK = P(t15, j15);
                        iH = Float.floatToIntBits(fK);
                        i16 = i15 + iH;
                    }
                    break;
                case 53:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        jI = R(t15, j15);
                        iH = h1.j(jI);
                        i16 = i15 + iH;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        jI = R(t15, j15);
                        iH = h1.j(jI);
                        i16 = i15 + iH;
                    }
                    break;
                case 55:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = Q(t15, j15);
                        i16 = i15 + iH;
                    }
                    break;
                case 56:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        jI = R(t15, j15);
                        iH = h1.j(jI);
                        i16 = i15 + iH;
                    }
                    break;
                case 57:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = Q(t15, j15);
                        i16 = i15 + iH;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        zJ = S(t15, j15);
                        iH = h1.f(zJ);
                        i16 = i15 + iH;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = ((String) b4.M(t15, j15)).hashCode();
                        i16 = i15 + iH;
                    }
                    break;
                case 60:
                    if (z(t15, i18, i17)) {
                        objM2 = b4.M(t15, j15);
                        i15 = i16 * 53;
                        iH = objM2.hashCode();
                        i16 = i15 + iH;
                    }
                    break;
                case 61:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        objM2 = b4.M(t15, j15);
                        iH = objM2.hashCode();
                        i16 = i15 + iH;
                    }
                    break;
                case 62:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = Q(t15, j15);
                        i16 = i15 + iH;
                    }
                    break;
                case 63:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = Q(t15, j15);
                        i16 = i15 + iH;
                    }
                    break;
                case 64:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = Q(t15, j15);
                        i16 = i15 + iH;
                    }
                    break;
                case 65:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        jI = R(t15, j15);
                        iH = h1.j(jI);
                        i16 = i15 + iH;
                    }
                    break;
                case 66:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        iH = Q(t15, j15);
                        i16 = i15 + iH;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i18, i17)) {
                        i15 = i16 * 53;
                        jI = R(t15, j15);
                        iH = h1.j(jI);
                        i16 = i15 + iH;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i18, i17)) {
                        objM2 = b4.M(t15, j15);
                        i15 = i16 * 53;
                        iH = objM2.hashCode();
                        i16 = i15 + iH;
                    }
                    break;
            }
        }
        int iHashCode2 = (i16 * 53) + this.f29515p.k(t15).hashCode();
        return this.f29506g ? (iHashCode2 * 53) + this.f29516q.b(t15).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final boolean c(T t15, T t16) {
        int length = this.f29500a.length;
        int i15 = 0;
        while (true) {
            boolean zY = true;
            if (i15 >= length) {
                if (!this.f29515p.k(t15).equals(this.f29515p.k(t16))) {
                    return false;
                }
                if (this.f29506g) {
                    return this.f29516q.b(t15).equals(this.f29516q.b(t16));
                }
                return true;
            }
            int iF = F(i15);
            long j15 = iF & 1048575;
            switch ((iF & 267386880) >>> 20) {
                case 0:
                    if (!M(t15, t16, i15) || b4.I(t15, j15) != b4.I(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 1:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 2:
                    if (!M(t15, t16, i15) || b4.I(t15, j15) != b4.I(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 3:
                    if (!M(t15, t16, i15) || b4.I(t15, j15) != b4.I(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 4:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 5:
                    if (!M(t15, t16, i15) || b4.I(t15, j15) != b4.I(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 6:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 7:
                    if (!M(t15, t16, i15) || b4.J(t15, j15) != b4.J(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 8:
                    if (!M(t15, t16, i15) || !e3.y(b4.M(t15, j15), b4.M(t16, j15))) {
                        zY = false;
                    }
                    break;
                case 9:
                    if (!M(t15, t16, i15) || !e3.y(b4.M(t15, j15), b4.M(t16, j15))) {
                        zY = false;
                    }
                    break;
                case 10:
                    if (!M(t15, t16, i15) || !e3.y(b4.M(t15, j15), b4.M(t16, j15))) {
                        zY = false;
                    }
                    break;
                case 11:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 12:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 13:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 14:
                    if (!M(t15, t16, i15) || b4.I(t15, j15) != b4.I(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 15:
                    if (!M(t15, t16, i15) || b4.H(t15, j15) != b4.H(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 16:
                    if (!M(t15, t16, i15) || b4.I(t15, j15) != b4.I(t16, j15)) {
                        zY = false;
                    }
                    break;
                case 17:
                    if (!M(t15, t16, i15) || !e3.y(b4.M(t15, j15), b4.M(t16, j15))) {
                        zY = false;
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
                case 50:
                    zY = e3.y(b4.M(t15, j15), b4.M(t16, j15));
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
                    long jG = G(i15) & 1048575;
                    if (b4.H(t15, jG) != b4.H(t16, jG) || !e3.y(b4.M(t15, j15), b4.M(t16, j15))) {
                        zY = false;
                    }
                    break;
            }
            if (!zY) {
                return false;
            }
            i15 += 4;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.c3
    public final T d() {
        return (T) this.f29513n.a(this.f29505f);
    }

    /* JADX WARN: Code duplicated, block: B:192:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:208:0x0533  */
    /* JADX WARN: Code duplicated, block: B:235:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:238:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:241:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final void e(T t15, p4 p4Var) {
        Iterator itE;
        Map.Entry<?, ?> entry;
        double dL;
        float fK;
        long jI;
        long jI2;
        int iH;
        long jI3;
        int iH2;
        boolean zJ;
        int iH3;
        int iH4;
        int iH5;
        long jI4;
        int iH6;
        long jI5;
        Iterator itA;
        Map.Entry<?, ?> entry2;
        double dL2;
        float fK2;
        long jI6;
        long jI7;
        int iH7;
        long jI8;
        int iH8;
        boolean zJ2;
        int iH9;
        int iH10;
        int iH11;
        long jI9;
        int iH12;
        long jI10;
        if (p4Var.N() == f1.e.f29332m) {
            v(this.f29515p, t15, p4Var);
            if (this.f29506g) {
                w0<T> w0VarB = this.f29516q.b(t15);
                if (w0VarB.b()) {
                    itA = null;
                    entry2 = null;
                } else {
                    itA = w0VarB.a();
                    entry2 = (Map.Entry) itA.next();
                }
            } else {
                itA = null;
                entry2 = null;
            }
            for (int length = this.f29500a.length - 4; length >= 0; length -= 4) {
                int iF = F(length);
                int i15 = this.f29500a[length];
                while (entry2 != null && this.f29516q.a(entry2) > i15) {
                    this.f29516q.c(p4Var, entry2);
                    entry2 = itA.hasNext() ? (Map.Entry) itA.next() : null;
                }
                switch ((iF & 267386880) >>> 20) {
                    case 0:
                        if (y(t15, length)) {
                            dL2 = b4.L(t15, iF & 1048575);
                            p4Var.q(i15, dL2);
                        }
                        break;
                    case 1:
                        if (y(t15, length)) {
                            fK2 = b4.K(t15, iF & 1048575);
                            p4Var.r(i15, fK2);
                        }
                        break;
                    case 2:
                        if (y(t15, length)) {
                            jI6 = b4.I(t15, iF & 1048575);
                            p4Var.O(i15, jI6);
                        }
                        break;
                    case 3:
                        if (y(t15, length)) {
                            jI7 = b4.I(t15, iF & 1048575);
                            p4Var.o(i15, jI7);
                        }
                        break;
                    case 4:
                        if (y(t15, length)) {
                            iH7 = b4.H(t15, iF & 1048575);
                            p4Var.l(i15, iH7);
                        }
                        break;
                    case 5:
                        if (y(t15, length)) {
                            jI8 = b4.I(t15, iF & 1048575);
                            p4Var.a(i15, jI8);
                        }
                        break;
                    case 6:
                        if (y(t15, length)) {
                            iH8 = b4.H(t15, iF & 1048575);
                            p4Var.s(i15, iH8);
                        }
                        break;
                    case 7:
                        if (y(t15, length)) {
                            zJ2 = b4.J(t15, iF & 1048575);
                            p4Var.k(i15, zJ2);
                        }
                        break;
                    case 8:
                        if (y(t15, length)) {
                            u(i15, b4.M(t15, iF & 1048575), p4Var);
                        }
                        break;
                    case 9:
                        if (y(t15, length)) {
                            p4Var.L(i15, b4.M(t15, iF & 1048575), C(length));
                        }
                        break;
                    case 10:
                        if (y(t15, length)) {
                            p4Var.K(i15, (a0) b4.M(t15, iF & 1048575));
                        }
                        break;
                    case 11:
                        if (y(t15, length)) {
                            iH9 = b4.H(t15, iF & 1048575);
                            p4Var.v(i15, iH9);
                        }
                        break;
                    case 12:
                        if (y(t15, length)) {
                            iH10 = b4.H(t15, iF & 1048575);
                            p4Var.P(i15, iH10);
                        }
                        break;
                    case 13:
                        if (y(t15, length)) {
                            iH11 = b4.H(t15, iF & 1048575);
                            p4Var.S(i15, iH11);
                        }
                        break;
                    case 14:
                        if (y(t15, length)) {
                            jI9 = b4.I(t15, iF & 1048575);
                            p4Var.z(i15, jI9);
                        }
                        break;
                    case 15:
                        if (y(t15, length)) {
                            iH12 = b4.H(t15, iF & 1048575);
                            p4Var.x(i15, iH12);
                        }
                        break;
                    case 16:
                        if (y(t15, length)) {
                            jI10 = b4.I(t15, iF & 1048575);
                            p4Var.h(i15, jI10);
                        }
                        break;
                    case 17:
                        if (y(t15, length)) {
                            p4Var.M(i15, b4.M(t15, iF & 1048575), C(length));
                        }
                        break;
                    case 18:
                        e3.f(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 19:
                        e3.m(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 20:
                        e3.r(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 21:
                        e3.x(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 22:
                        e3.M(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 23:
                        e3.H(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 24:
                        e3.R(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 25:
                        e3.U(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 26:
                        e3.d(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var);
                        break;
                    case 27:
                        e3.e(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, C(length));
                        break;
                    case 28:
                        e3.k(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var);
                        break;
                    case 29:
                        e3.O(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 30:
                        e3.T(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case BERTags.DATE /* 31 */:
                        e3.S(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 32:
                        e3.K(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 33:
                        e3.Q(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 34:
                        e3.F(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, false);
                        break;
                    case 35:
                        e3.f(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case 36:
                        e3.m(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        e3.r(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        e3.x(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        e3.M(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case 40:
                        e3.H(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        e3.R(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.CURRENCY_CODE /* 42 */:
                        e3.U(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.DATE_OF_BIRTH /* 43 */:
                        e3.O(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        e3.T(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        e3.S(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case 46:
                        e3.K(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case 47:
                        e3.Q(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case 48:
                        e3.F(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, true);
                        break;
                    case 49:
                        e3.l(this.f29500a[length], (List) b4.M(t15, iF & 1048575), p4Var, C(length));
                        break;
                    case 50:
                        w(p4Var, i15, b4.M(t15, iF & 1048575), length);
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (z(t15, i15, length)) {
                            dL2 = O(t15, iF & 1048575);
                            p4Var.q(i15, dL2);
                        }
                        break;
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (z(t15, i15, length)) {
                            fK2 = P(t15, iF & 1048575);
                            p4Var.r(i15, fK2);
                        }
                        break;
                    case 53:
                        if (z(t15, i15, length)) {
                            jI6 = R(t15, iF & 1048575);
                            p4Var.O(i15, jI6);
                        }
                        break;
                    case EACTags.CURRENCY_EXPONENT /* 54 */:
                        if (z(t15, i15, length)) {
                            jI7 = R(t15, iF & 1048575);
                            p4Var.o(i15, jI7);
                        }
                        break;
                    case 55:
                        if (z(t15, i15, length)) {
                            iH7 = Q(t15, iF & 1048575);
                            p4Var.l(i15, iH7);
                        }
                        break;
                    case 56:
                        if (z(t15, i15, length)) {
                            jI8 = R(t15, iF & 1048575);
                            p4Var.a(i15, jI8);
                        }
                        break;
                    case 57:
                        if (z(t15, i15, length)) {
                            iH8 = Q(t15, iF & 1048575);
                            p4Var.s(i15, iH8);
                        }
                        break;
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (z(t15, i15, length)) {
                            zJ2 = S(t15, iF & 1048575);
                            p4Var.k(i15, zJ2);
                        }
                        break;
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (z(t15, i15, length)) {
                            u(i15, b4.M(t15, iF & 1048575), p4Var);
                        }
                        break;
                    case 60:
                        if (z(t15, i15, length)) {
                            p4Var.L(i15, b4.M(t15, iF & 1048575), C(length));
                        }
                        break;
                    case 61:
                        if (z(t15, i15, length)) {
                            p4Var.K(i15, (a0) b4.M(t15, iF & 1048575));
                        }
                        break;
                    case 62:
                        if (z(t15, i15, length)) {
                            iH9 = Q(t15, iF & 1048575);
                            p4Var.v(i15, iH9);
                        }
                        break;
                    case 63:
                        if (z(t15, i15, length)) {
                            iH10 = Q(t15, iF & 1048575);
                            p4Var.P(i15, iH10);
                        }
                        break;
                    case 64:
                        if (z(t15, i15, length)) {
                            iH11 = Q(t15, iF & 1048575);
                            p4Var.S(i15, iH11);
                        }
                        break;
                    case 65:
                        if (z(t15, i15, length)) {
                            jI9 = R(t15, iF & 1048575);
                            p4Var.z(i15, jI9);
                        }
                        break;
                    case 66:
                        if (z(t15, i15, length)) {
                            iH12 = Q(t15, iF & 1048575);
                            p4Var.x(i15, iH12);
                        }
                        break;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (z(t15, i15, length)) {
                            jI10 = R(t15, iF & 1048575);
                            p4Var.h(i15, jI10);
                        }
                        break;
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (z(t15, i15, length)) {
                            p4Var.M(i15, b4.M(t15, iF & 1048575), C(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.f29516q.c(p4Var, entry2);
                entry2 = itA.hasNext() ? (Map.Entry) itA.next() : null;
            }
            return;
        }
        if (!this.f29508i) {
            K(t15, p4Var);
            return;
        }
        if (this.f29506g) {
            w0<T> w0VarB2 = this.f29516q.b(t15);
            if (w0VarB2.b()) {
                itE = null;
                entry = null;
            } else {
                itE = w0VarB2.e();
                entry = (Map.Entry) itE.next();
            }
        } else {
            itE = null;
            entry = null;
        }
        int length2 = this.f29500a.length;
        for (int i16 = 0; i16 < length2; i16 += 4) {
            int iF2 = F(i16);
            int i17 = this.f29500a[i16];
            while (entry != null && this.f29516q.a(entry) <= i17) {
                this.f29516q.c(p4Var, entry);
                entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
            }
            switch ((iF2 & 267386880) >>> 20) {
                case 0:
                    if (y(t15, i16)) {
                        dL = b4.L(t15, iF2 & 1048575);
                        p4Var.q(i17, dL);
                    }
                    break;
                case 1:
                    if (y(t15, i16)) {
                        fK = b4.K(t15, iF2 & 1048575);
                        p4Var.r(i17, fK);
                    }
                    break;
                case 2:
                    if (y(t15, i16)) {
                        jI = b4.I(t15, iF2 & 1048575);
                        p4Var.O(i17, jI);
                    }
                    break;
                case 3:
                    if (y(t15, i16)) {
                        jI2 = b4.I(t15, iF2 & 1048575);
                        p4Var.o(i17, jI2);
                    }
                    break;
                case 4:
                    if (y(t15, i16)) {
                        iH = b4.H(t15, iF2 & 1048575);
                        p4Var.l(i17, iH);
                    }
                    break;
                case 5:
                    if (y(t15, i16)) {
                        jI3 = b4.I(t15, iF2 & 1048575);
                        p4Var.a(i17, jI3);
                    }
                    break;
                case 6:
                    if (y(t15, i16)) {
                        iH2 = b4.H(t15, iF2 & 1048575);
                        p4Var.s(i17, iH2);
                    }
                    break;
                case 7:
                    if (y(t15, i16)) {
                        zJ = b4.J(t15, iF2 & 1048575);
                        p4Var.k(i17, zJ);
                    }
                    break;
                case 8:
                    if (y(t15, i16)) {
                        u(i17, b4.M(t15, iF2 & 1048575), p4Var);
                    }
                    break;
                case 9:
                    if (y(t15, i16)) {
                        p4Var.L(i17, b4.M(t15, iF2 & 1048575), C(i16));
                    }
                    break;
                case 10:
                    if (y(t15, i16)) {
                        p4Var.K(i17, (a0) b4.M(t15, iF2 & 1048575));
                    }
                    break;
                case 11:
                    if (y(t15, i16)) {
                        iH3 = b4.H(t15, iF2 & 1048575);
                        p4Var.v(i17, iH3);
                    }
                    break;
                case 12:
                    if (y(t15, i16)) {
                        iH4 = b4.H(t15, iF2 & 1048575);
                        p4Var.P(i17, iH4);
                    }
                    break;
                case 13:
                    if (y(t15, i16)) {
                        iH5 = b4.H(t15, iF2 & 1048575);
                        p4Var.S(i17, iH5);
                    }
                    break;
                case 14:
                    if (y(t15, i16)) {
                        jI4 = b4.I(t15, iF2 & 1048575);
                        p4Var.z(i17, jI4);
                    }
                    break;
                case 15:
                    if (y(t15, i16)) {
                        iH6 = b4.H(t15, iF2 & 1048575);
                        p4Var.x(i17, iH6);
                    }
                    break;
                case 16:
                    if (y(t15, i16)) {
                        jI5 = b4.I(t15, iF2 & 1048575);
                        p4Var.h(i17, jI5);
                    }
                    break;
                case 17:
                    if (y(t15, i16)) {
                        p4Var.M(i17, b4.M(t15, iF2 & 1048575), C(i16));
                    }
                    break;
                case 18:
                    e3.f(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 19:
                    e3.m(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 20:
                    e3.r(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 21:
                    e3.x(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 22:
                    e3.M(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 23:
                    e3.H(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 24:
                    e3.R(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 25:
                    e3.U(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 26:
                    e3.d(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var);
                    break;
                case 27:
                    e3.e(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, C(i16));
                    break;
                case 28:
                    e3.k(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var);
                    break;
                case 29:
                    e3.O(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 30:
                    e3.T(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    e3.S(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 32:
                    e3.K(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 33:
                    e3.Q(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 34:
                    e3.F(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, false);
                    break;
                case 35:
                    e3.f(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case 36:
                    e3.m(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    e3.r(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    e3.x(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    e3.M(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case 40:
                    e3.H(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    e3.R(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    e3.U(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    e3.O(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    e3.T(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    e3.S(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case 46:
                    e3.K(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case 47:
                    e3.Q(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case 48:
                    e3.F(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, true);
                    break;
                case 49:
                    e3.l(this.f29500a[i16], (List) b4.M(t15, iF2 & 1048575), p4Var, C(i16));
                    break;
                case 50:
                    w(p4Var, i17, b4.M(t15, iF2 & 1048575), i16);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (z(t15, i17, i16)) {
                        dL = O(t15, iF2 & 1048575);
                        p4Var.q(i17, dL);
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (z(t15, i17, i16)) {
                        fK = P(t15, iF2 & 1048575);
                        p4Var.r(i17, fK);
                    }
                    break;
                case 53:
                    if (z(t15, i17, i16)) {
                        jI = R(t15, iF2 & 1048575);
                        p4Var.O(i17, jI);
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (z(t15, i17, i16)) {
                        jI2 = R(t15, iF2 & 1048575);
                        p4Var.o(i17, jI2);
                    }
                    break;
                case 55:
                    if (z(t15, i17, i16)) {
                        iH = Q(t15, iF2 & 1048575);
                        p4Var.l(i17, iH);
                    }
                    break;
                case 56:
                    if (z(t15, i17, i16)) {
                        jI3 = R(t15, iF2 & 1048575);
                        p4Var.a(i17, jI3);
                    }
                    break;
                case 57:
                    if (z(t15, i17, i16)) {
                        iH2 = Q(t15, iF2 & 1048575);
                        p4Var.s(i17, iH2);
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (z(t15, i17, i16)) {
                        zJ = S(t15, iF2 & 1048575);
                        p4Var.k(i17, zJ);
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (z(t15, i17, i16)) {
                        u(i17, b4.M(t15, iF2 & 1048575), p4Var);
                    }
                    break;
                case 60:
                    if (z(t15, i17, i16)) {
                        p4Var.L(i17, b4.M(t15, iF2 & 1048575), C(i16));
                    }
                    break;
                case 61:
                    if (z(t15, i17, i16)) {
                        p4Var.K(i17, (a0) b4.M(t15, iF2 & 1048575));
                    }
                    break;
                case 62:
                    if (z(t15, i17, i16)) {
                        iH3 = Q(t15, iF2 & 1048575);
                        p4Var.v(i17, iH3);
                    }
                    break;
                case 63:
                    if (z(t15, i17, i16)) {
                        iH4 = Q(t15, iF2 & 1048575);
                        p4Var.P(i17, iH4);
                    }
                    break;
                case 64:
                    if (z(t15, i17, i16)) {
                        iH5 = Q(t15, iF2 & 1048575);
                        p4Var.S(i17, iH5);
                    }
                    break;
                case 65:
                    if (z(t15, i17, i16)) {
                        jI4 = R(t15, iF2 & 1048575);
                        p4Var.z(i17, jI4);
                    }
                    break;
                case 66:
                    if (z(t15, i17, i16)) {
                        iH6 = Q(t15, iF2 & 1048575);
                        p4Var.x(i17, iH6);
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t15, i17, i16)) {
                        jI5 = R(t15, iF2 & 1048575);
                        p4Var.h(i17, jI5);
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (z(t15, i17, i16)) {
                        p4Var.M(i17, b4.M(t15, iF2 & 1048575), C(i16));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f29516q.c(p4Var, entry);
            entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
        }
        v(this.f29515p, t15, p4Var);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc A[LOOP:1: B:49:0x00bb->B:54:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final boolean f(T t15) {
        int i15;
        List list;
        c3 c3VarC;
        int i16;
        int[] iArr = this.f29510k;
        int i17 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int i18 = -1;
        int i19 = 0;
        int i25 = 0;
        for (int length = iArr.length; i19 < length; length = length) {
            int i26 = iArr[i19];
            int iH = H(i26);
            int iF = F(iH);
            if (this.f29508i) {
                i15 = 0;
            } else {
                int i27 = this.f29500a[iH + 2];
                int i28 = i27 & 1048575;
                i15 = i17 << (i27 >>> 20);
                if (i28 != i18) {
                    i25 = f29499s.getInt(t15, i28);
                    i18 = i28;
                }
            }
            if ((268435456 & iF) != 0 && !A(t15, iH, i25, i15)) {
                return false;
            }
            int i29 = (267386880 & iF) >>> 20;
            if (i29 == 9 || i29 == 17) {
                if (A(t15, iH, i25, i15) && !B(t15, iF, C(iH))) {
                    return false;
                }
            } else if (i29 == 27) {
                list = (List) b4.M(t15, iF & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c3VarC = C(iH);
                    for (i16 = 0; i16 < list.size(); i16++) {
                        if (!c3VarC.f(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (i29 == 60 || i29 == 68) {
                if (z(t15, i26, iH) && !B(t15, iF, C(iH))) {
                    return false;
                }
            } else if (i29 == 49) {
                list = (List) b4.M(t15, iF & 1048575);
                if (list.isEmpty()) {
                    c3VarC = C(iH);
                    while (i16 < list.size()) {
                        if (!c3VarC.f(list.get(i16))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i29 == 50 && !this.f29517r.h(b4.M(t15, iF & 1048575)).isEmpty()) {
                this.f29517r.j(D(iH));
                throw null;
            }
            i19++;
            i17 = i17;
        }
        boolean z15 = i17;
        if (!this.f29506g || this.f29516q.b(t15).d()) {
            return z15;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final void g(T t15, T t16) {
        t16.getClass();
        for (int i15 = 0; i15 < this.f29500a.length; i15 += 4) {
            int iF = F(i15);
            long j15 = 1048575 & iF;
            int i16 = this.f29500a[i15];
            switch ((iF & 267386880) >>> 20) {
                case 0:
                    if (y(t16, i15)) {
                        b4.e(t15, j15, b4.L(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 1:
                    if (y(t16, i15)) {
                        b4.f(t15, j15, b4.K(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 2:
                    if (y(t16, i15)) {
                        b4.h(t15, j15, b4.I(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 3:
                    if (y(t16, i15)) {
                        b4.h(t15, j15, b4.I(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 4:
                    if (y(t16, i15)) {
                        b4.g(t15, j15, b4.H(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 5:
                    if (y(t16, i15)) {
                        b4.h(t15, j15, b4.I(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 6:
                    if (y(t16, i15)) {
                        b4.g(t15, j15, b4.H(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 7:
                    if (y(t16, i15)) {
                        b4.j(t15, j15, b4.J(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 8:
                    if (y(t16, i15)) {
                        b4.i(t15, j15, b4.M(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 9:
                case 17:
                    x(t15, t16, i15);
                    break;
                case 10:
                    if (y(t16, i15)) {
                        b4.i(t15, j15, b4.M(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 11:
                    if (y(t16, i15)) {
                        b4.g(t15, j15, b4.H(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 12:
                    if (y(t16, i15)) {
                        b4.g(t15, j15, b4.H(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 13:
                    if (y(t16, i15)) {
                        b4.g(t15, j15, b4.H(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 14:
                    if (y(t16, i15)) {
                        b4.h(t15, j15, b4.I(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 15:
                    if (y(t16, i15)) {
                        b4.g(t15, j15, b4.H(t16, j15));
                        I(t15, i15);
                    }
                    break;
                case 16:
                    if (y(t16, i15)) {
                        b4.h(t15, j15, b4.I(t16, j15));
                        I(t15, i15);
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
                    this.f29514o.b(t15, t16, j15);
                    break;
                case 50:
                    e3.h(this.f29517r, t15, t16, j15);
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
                        b4.i(t15, j15, b4.M(t16, j15));
                        J(t15, i16, i15);
                    }
                    break;
                case 60:
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    L(t15, t16, i15);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (z(t16, i16, i15)) {
                        b4.i(t15, j15, b4.M(t16, j15));
                        J(t15, i16, i15);
                    }
                    break;
            }
        }
        if (this.f29508i) {
            return;
        }
        e3.i(this.f29515p, t15, t16);
        if (this.f29506g) {
            e3.g(this.f29516q, t15, t16);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0436 A[PHI: r5
      0x0436: PHI (r5v4 int) = 
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v12 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v13 int)
      (r5v1 int)
     binds: [B:244:0x041d, B:437:0x0770, B:434:0x076a, B:429:0x075c, B:426:0x0756, B:423:0x0750, B:420:0x0746, B:417:0x073c, B:414:0x0736, B:411:0x0730, B:408:0x0726, B:405:0x071c, B:402:0x0716, B:382:0x0658, B:377:0x0646, B:372:0x0634, B:367:0x0622, B:362:0x0610, B:357:0x05fe, B:352:0x05ec, B:347:0x05db, B:342:0x05ca, B:337:0x05b9, B:332:0x05a8, B:327:0x0597, B:322:0x0586, B:316:0x0566, B:311:0x0532, B:308:0x0525, B:305:0x0515, B:302:0x0505, B:299:0x04f5, B:296:0x04e9, B:293:0x04dd, B:290:0x04d1, B:284:0x04b8, B:281:0x04a5, B:277:0x0494, B:273:0x0485, B:269:0x0476, B:267:0x0470, B:265:0x0469, B:262:0x045e, B:258:0x044f, B:254:0x0440, B:249:0x0435, B:247:0x0425] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:287:0x04c2 A[PHI: r6
      0x04c2: PHI (r6v114 java.lang.Object) = (r6v25 java.lang.Object), (r6v117 java.lang.Object) binds: [B:431:0x0764, B:286:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:288:0x04c5 A[PHI: r6
      0x04c5: PHI (r6v111 java.lang.Object) = (r6v25 java.lang.Object), (r6v117 java.lang.Object) binds: [B:431:0x0764, B:286:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:319:0x056c A[PHI: r8
      0x056c: PHI (r8v75 int) = 
      (r8v37 int)
      (r8v40 int)
      (r8v43 int)
      (r8v46 int)
      (r8v49 int)
      (r8v52 int)
      (r8v55 int)
      (r8v58 int)
      (r8v61 int)
      (r8v64 int)
      (r8v67 int)
      (r8v70 int)
      (r8v73 int)
      (r8v78 int)
     binds: [B:384:0x065c, B:379:0x064a, B:374:0x0638, B:369:0x0626, B:364:0x0614, B:359:0x0602, B:354:0x05f0, B:349:0x05df, B:344:0x05ce, B:339:0x05bd, B:334:0x05ac, B:329:0x059b, B:324:0x058a, B:318:0x056a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4 A[PHI: r4
      0x00e4: PHI (r4v92 java.lang.Object) = (r4v12 java.lang.Object), (r4v94 java.lang.Object) binds: [B:197:0x0369, B:51:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[PHI: r4
      0x00e7: PHI (r4v90 java.lang.Object) = (r4v12 java.lang.Object), (r4v94 java.lang.Object) binds: [B:197:0x0369, B:51:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b A[PHI: r4
      0x018b: PHI (r4v72 int) = 
      (r4v34 int)
      (r4v37 int)
      (r4v40 int)
      (r4v43 int)
      (r4v46 int)
      (r4v49 int)
      (r4v52 int)
      (r4v55 int)
      (r4v58 int)
      (r4v61 int)
      (r4v64 int)
      (r4v67 int)
      (r4v70 int)
      (r4v75 int)
     binds: [B:152:0x027b, B:147:0x0269, B:142:0x0257, B:137:0x0245, B:132:0x0233, B:127:0x0221, B:122:0x020f, B:117:0x01fe, B:112:0x01ed, B:107:0x01dc, B:102:0x01cb, B:97:0x01ba, B:92:0x01a9, B:86:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0425, code lost:
    
        if (z(r21, r15, r4) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0427, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.m0.P(r15, (com.google.android.gms.internal.clearcut.l2) r2.getObject(r21, r13), C(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x045e, code lost:
    
        if (z(r21, r15, r4) != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0460, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.m0.o0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0469, code lost:
    
        if (z(r21, r15, r4) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x046b, code lost:
    
        r8 = com.google.android.gms.internal.clearcut.m0.v0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0494, code lost:
    
        if (z(r21, r15, r4) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0496, code lost:
    
        r6 = (com.google.android.gms.internal.clearcut.a0) r2.getObject(r21, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04a5, code lost:
    
        if (z(r21, r15, r4) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04a7, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.e3.n(r15, r2.getObject(r21, r13), C(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04d1, code lost:
    
        if (z(r21, r15, r4) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04d3, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.m0.Q(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0716, code lost:
    
        if ((r12 & r19) != 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0730, code lost:
    
        if ((r12 & r19) != 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0736, code lost:
    
        if ((r12 & r19) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0750, code lost:
    
        if ((r12 & r19) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0756, code lost:
    
        if ((r12 & r19) != 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x076a, code lost:
    
        if ((r12 & r19) != 0) goto L291;
     */
    @Override // com.google.android.gms.internal.clearcut.c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(T r21) {
        /*
            Method dump skipped, instruction units count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.p2.h(java.lang.Object):int");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[PHI: r5 r15
      0x0045: PHI (r5v5 int) = (r5v1 int), (r5v12 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:15:0x0044, B:84:0x018c, B:71:0x0140, B:67:0x012e, B:65:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r15v4 sun.misc.Unsafe) = 
      (r15v5 sun.misc.Unsafe)
      (r15v6 sun.misc.Unsafe)
      (r15v8 sun.misc.Unsafe)
      (r15v9 sun.misc.Unsafe)
      (r15v10 sun.misc.Unsafe)
     binds: [B:15:0x0044, B:84:0x018c, B:71:0x0140, B:67:0x012e, B:65:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.c3
    public final void i(T t15, byte[] bArr, int i15, int i16, w wVar) throws l1 {
        Unsafe unsafe;
        int i17;
        int i18;
        int i19;
        int iO;
        Unsafe unsafe2;
        T t16;
        Object objD;
        int iE;
        p2<T> p2Var = this;
        byte[] bArr2 = bArr;
        int i25 = i16;
        w wVar2 = wVar;
        if (!p2Var.f29508i) {
            r(t15, bArr, i15, i25, 0, wVar);
            return;
        }
        Unsafe unsafe3 = f29499s;
        int iJ = i15;
        while (iJ < i25) {
            int iD = iJ + 1;
            int i26 = bArr2[iJ];
            if (i26 < 0) {
                iD = v.d(i26, bArr2, iD, wVar2);
                i26 = wVar2.f29577a;
            }
            int i27 = i26;
            int i28 = iD;
            int i29 = (i27 == true ? 1 : 0) >>> 3;
            int i35 = (i27 == true ? 1 : 0) & 7;
            int iH = p2Var.H(i29);
            if (iH >= 0) {
                int i36 = p2Var.f29500a[iH + 1];
                int i37 = (267386880 & i36) >>> 20;
                long j15 = 1048575 & i36;
                if (i37 <= 17) {
                    switch (i37) {
                        case 0:
                            unsafe = unsafe3;
                            if (i35 == 1) {
                                b4.e(t15, j15, v.l(bArr2, i28));
                                iJ = i28 + 8;
                            } else {
                                i19 = i28;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                            }
                            unsafe3 = unsafe;
                            break;
                        case 1:
                            unsafe = unsafe3;
                            if (i35 == 5) {
                                b4.f(t15, j15, v.n(bArr2, i28));
                                iJ = i28 + 4;
                            } else {
                                i19 = i28;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                            }
                            unsafe3 = unsafe;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i35 != 0) {
                                unsafe = unsafe4;
                                i19 = i28;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                int iG = v.g(bArr2, i28, wVar2);
                                unsafe3 = unsafe4;
                                unsafe3.putLong(t15, j15, wVar2.f29578b);
                                iJ = iG;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i35 != 0) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = v.e(bArr2, i28, wVar2);
                                unsafe2.putInt(t15, j15, wVar2.f29577a);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i35 != 1) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                unsafe2.putLong(t15, j15, v.k(bArr2, i28));
                                iJ = i28 + 8;
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i35 != 5) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                unsafe2.putInt(t15, j15, v.h(bArr2, i28));
                                iJ = i28 + 4;
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i35 != 0) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = v.g(bArr2, i28, wVar2);
                                b4.j(t15, j15, wVar2.f29578b != 0);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            t16 = t15;
                            if (i35 != 2) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = (536870912 & i36) == 0 ? v.i(bArr2, i28, wVar2) : v.j(bArr2, i28, wVar2);
                                objD = wVar2.f29579c;
                                unsafe2.putObject(t16, j15, objD);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            t16 = t15;
                            if (i35 != 2) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = m(p2Var.C(iH), bArr2, i28, i25, wVar2);
                                Object object = unsafe2.getObject(t16, j15);
                                objD = object == null ? wVar2.f29579c : h1.d(object, wVar2.f29579c);
                                unsafe2.putObject(t16, j15, objD);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            t16 = t15;
                            if (i35 != 2) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = v.m(bArr2, i28, wVar2);
                                objD = wVar2.f29579c;
                                unsafe2.putObject(t16, j15, objD);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            if (i35 != 0) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = v.e(bArr2, i28, wVar2);
                                iE = wVar2.f29577a;
                                unsafe2.putInt(t15, j15, iE);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            if (i35 != 0) {
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                iJ = v.e(bArr2, i28, wVar2);
                                iE = j0.e(wVar2.f29577a);
                                unsafe2.putInt(t15, j15, iE);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 16:
                            if (i35 != 0) {
                                unsafe2 = unsafe3;
                                i19 = i28;
                                unsafe = unsafe2;
                                i17 = i19;
                                i18 = i27;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                                unsafe3 = unsafe;
                            } else {
                                int iG2 = v.g(bArr2, i28, wVar2);
                                unsafe3.putLong(t15, j15, j0.a(wVar2.f29578b));
                                unsafe2 = unsafe3;
                                iJ = iG2;
                                unsafe3 = unsafe2;
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    unsafe = unsafe3;
                    if (i37 != 27) {
                        if (i37 <= 49) {
                            iO = p2Var.p(t15, bArr, i28, i16, i27 == true ? 1 : 0, i29, i35, iH, i36, i37, j15, wVar);
                            if (iO == i28) {
                                t15 = t15;
                                bArr = bArr;
                                i16 = i16;
                                i17 = iO;
                                i18 = i27 == true ? 1 : 0;
                                iJ = j(i18, bArr, i17, i16, t15, wVar);
                                p2Var = this;
                                bArr2 = bArr;
                                wVar2 = wVar;
                                i25 = i16;
                            }
                        } else {
                            if (i37 != 50) {
                                iO = o(t15, bArr, i28, i16, i27 == true ? 1 : 0, i29, i35, i36, i37, j15, iH, wVar);
                                if (iO == i28) {
                                    i18 = i27 == true ? 1 : 0;
                                    i17 = iO;
                                }
                            } else if (i35 == 2) {
                                int iQ = q(t15, bArr, i28, i16, iH, i29, j15, wVar);
                                if (iQ == i28) {
                                    i17 = iQ;
                                    i18 = i27 == true ? 1 : 0;
                                } else {
                                    p2Var = this;
                                    bArr2 = bArr;
                                    i25 = i16;
                                    wVar2 = wVar;
                                    iJ = iQ;
                                }
                            } else {
                                i19 = i28;
                                i27 = i27 == true ? 1 : 0;
                                i17 = i19;
                                i18 = i27;
                            }
                            iJ = j(i18, bArr, i17, i16, t15, wVar);
                            p2Var = this;
                            bArr2 = bArr;
                            wVar2 = wVar;
                            i25 = i16;
                        }
                        p2Var = this;
                        bArr2 = bArr;
                        i25 = i16;
                        wVar2 = wVar;
                        iJ = iO;
                    } else if (i35 == 2) {
                        k1 k1VarC1 = (k1) unsafe.getObject(t15, j15);
                        if (!k1VarC1.I()) {
                            int size = k1VarC1.size();
                            k1VarC1 = k1VarC1.C1(size == 0 ? 10 : size << 1);
                            unsafe.putObject(t15, j15, k1VarC1);
                        }
                        iJ = k(p2Var.C(iH), i27 == true ? 1 : 0, bArr2, i28, i25, k1VarC1, wVar2);
                        bArr2 = bArr;
                        i25 = i16;
                        wVar2 = wVar;
                    } else {
                        i27 = i27 == true ? 1 : 0;
                        i19 = i28;
                        i17 = i19;
                        i18 = i27;
                        iJ = j(i18, bArr, i17, i16, t15, wVar);
                        p2Var = this;
                        bArr2 = bArr;
                        wVar2 = wVar;
                        i25 = i16;
                    }
                    unsafe3 = unsafe;
                }
            }
            unsafe = unsafe3;
            i19 = i28;
            i17 = i19;
            i18 = i27;
            iJ = j(i18, bArr, i17, i16, t15, wVar);
            p2Var = this;
            bArr2 = bArr;
            wVar2 = wVar;
            i25 = i16;
            unsafe3 = unsafe;
        }
        if (iJ != i25) {
            throw l1.d();
        }
    }
}
