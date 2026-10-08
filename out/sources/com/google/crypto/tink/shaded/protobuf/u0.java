package com.google.crypto.tink.shaded.protobuf;

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

/* JADX INFO: loaded from: classes4.dex */
final class u0<T> implements g1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f36245r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f36246s = r1.D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f36247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f36248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f36251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f36253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f36254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f36255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f36256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f36257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f36258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w0 f36259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h0 f36260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n1<?, ?> f36261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q<?> f36262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0 f36263q;

    private u0(int[] iArr, Object[] objArr, int i15, int i16, r0 r0Var, boolean z15, boolean z16, int[] iArr2, int i17, int i18, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        this.f36247a = iArr;
        this.f36248b = objArr;
        this.f36249c = i15;
        this.f36250d = i16;
        this.f36253g = r0Var instanceof y;
        this.f36254h = z15;
        this.f36252f = qVar != null && qVar.e(r0Var);
        this.f36255i = z16;
        this.f36256j = iArr2;
        this.f36257k = i17;
        this.f36258l = i18;
        this.f36259m = w0Var;
        this.f36260n = h0Var;
        this.f36261o = n1Var;
        this.f36262p = qVar;
        this.f36251e = r0Var;
        this.f36263q = m0Var;
    }

    private static <T> int A(T t15, long j15) {
        return r1.z(t15, j15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void A0(T t15, u1 u1Var) {
        Iterator itG;
        Map.Entry<?, ?> entry;
        D0(this.f36261o, t15, u1Var);
        if (this.f36252f) {
            u<T> uVarC = this.f36262p.c(t15);
            if (uVarC.m()) {
                itG = null;
                entry = null;
            } else {
                itG = uVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f36247a.length - 3; length >= 0; length -= 3) {
            int iX0 = x0(length);
            int iX = X(length);
            while (entry != null && this.f36262p.a(entry) > iX) {
                this.f36262p.j(u1Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (w0(iX0)) {
                case 0:
                    if (C(t15, length)) {
                        u1Var.p(iX, o(t15, Y(iX0)));
                    }
                    break;
                case 1:
                    if (C(t15, length)) {
                        u1Var.B(iX, s(t15, Y(iX0)));
                    }
                    break;
                case 2:
                    if (C(t15, length)) {
                        u1Var.u(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 3:
                    if (C(t15, length)) {
                        u1Var.f(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 4:
                    if (C(t15, length)) {
                        u1Var.h(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 5:
                    if (C(t15, length)) {
                        u1Var.s(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 6:
                    if (C(t15, length)) {
                        u1Var.c(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 7:
                    if (C(t15, length)) {
                        u1Var.v(iX, l(t15, Y(iX0)));
                    }
                    break;
                case 8:
                    if (C(t15, length)) {
                        C0(iX, r1.C(t15, Y(iX0)), u1Var);
                    }
                    break;
                case 9:
                    if (C(t15, length)) {
                        u1Var.N(iX, r1.C(t15, Y(iX0)), v(length));
                    }
                    break;
                case 10:
                    if (C(t15, length)) {
                        u1Var.M(iX, (h) r1.C(t15, Y(iX0)));
                    }
                    break;
                case 11:
                    if (C(t15, length)) {
                        u1Var.o(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 12:
                    if (C(t15, length)) {
                        u1Var.E(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 13:
                    if (C(t15, length)) {
                        u1Var.w(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 14:
                    if (C(t15, length)) {
                        u1Var.i(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 15:
                    if (C(t15, length)) {
                        u1Var.H(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 16:
                    if (C(t15, length)) {
                        u1Var.m(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 17:
                    if (C(t15, length)) {
                        u1Var.K(iX, r1.C(t15, Y(iX0)), v(length));
                    }
                    break;
                case 18:
                    i1.P(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 19:
                    i1.T(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 20:
                    i1.W(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 21:
                    i1.e0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 22:
                    i1.V(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 23:
                    i1.S(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 24:
                    i1.R(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 25:
                    i1.N(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 26:
                    i1.c0(X(length), (List) r1.C(t15, Y(iX0)), u1Var);
                    break;
                case 27:
                    i1.X(X(length), (List) r1.C(t15, Y(iX0)), u1Var, v(length));
                    break;
                case 28:
                    i1.O(X(length), (List) r1.C(t15, Y(iX0)), u1Var);
                    break;
                case 29:
                    i1.d0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 30:
                    i1.Q(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    i1.Y(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 32:
                    i1.Z(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 33:
                    i1.a0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 34:
                    i1.b0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 35:
                    i1.P(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 36:
                    i1.T(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i1.W(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i1.e0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i1.V(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 40:
                    i1.S(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i1.R(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i1.N(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i1.d0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i1.Q(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i1.Y(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 46:
                    i1.Z(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 47:
                    i1.a0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 48:
                    i1.b0(X(length), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 49:
                    i1.U(X(length), (List) r1.C(t15, Y(iX0)), u1Var, v(length));
                    break;
                case 50:
                    B0(u1Var, iX, r1.C(t15, Y(iX0)), length);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (J(t15, iX, length)) {
                        u1Var.p(iX, a0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (J(t15, iX, length)) {
                        u1Var.B(iX, b0(t15, Y(iX0)));
                    }
                    break;
                case 53:
                    if (J(t15, iX, length)) {
                        u1Var.u(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (J(t15, iX, length)) {
                        u1Var.f(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case 55:
                    if (J(t15, iX, length)) {
                        u1Var.h(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 56:
                    if (J(t15, iX, length)) {
                        u1Var.s(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case 57:
                    if (J(t15, iX, length)) {
                        u1Var.c(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (J(t15, iX, length)) {
                        u1Var.v(iX, Z(t15, Y(iX0)));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (J(t15, iX, length)) {
                        C0(iX, r1.C(t15, Y(iX0)), u1Var);
                    }
                    break;
                case 60:
                    if (J(t15, iX, length)) {
                        u1Var.N(iX, r1.C(t15, Y(iX0)), v(length));
                    }
                    break;
                case 61:
                    if (J(t15, iX, length)) {
                        u1Var.M(iX, (h) r1.C(t15, Y(iX0)));
                    }
                    break;
                case 62:
                    if (J(t15, iX, length)) {
                        u1Var.o(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 63:
                    if (J(t15, iX, length)) {
                        u1Var.E(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 64:
                    if (J(t15, iX, length)) {
                        u1Var.w(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 65:
                    if (J(t15, iX, length)) {
                        u1Var.i(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case 66:
                    if (J(t15, iX, length)) {
                        u1Var.H(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (J(t15, iX, length)) {
                        u1Var.m(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (J(t15, iX, length)) {
                        u1Var.K(iX, r1.C(t15, Y(iX0)), v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f36262p.j(u1Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    private static boolean B(int i15) {
        return (i15 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private <K, V> void B0(u1 u1Var, int i15, Object obj, int i16) {
        if (obj != null) {
            this.f36263q.b(u(i16));
            u1Var.J(i15, null, this.f36263q.e(obj));
        }
    }

    private boolean C(T t15, int i15) {
        boolean zEquals;
        int iL0 = l0(i15);
        long j15 = 1048575 & iL0;
        if (j15 != 1048575) {
            return (r1.z(t15, j15) & (1 << (iL0 >>> 20))) != 0;
        }
        int iX0 = x0(i15);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                return Double.doubleToRawLongBits(r1.x(t15, jY)) != 0;
            case 1:
                return Float.floatToRawIntBits(r1.y(t15, jY)) != 0;
            case 2:
                return r1.A(t15, jY) != 0;
            case 3:
                return r1.A(t15, jY) != 0;
            case 4:
                return r1.z(t15, jY) != 0;
            case 5:
                return r1.A(t15, jY) != 0;
            case 6:
                return r1.z(t15, jY) != 0;
            case 7:
                return r1.r(t15, jY);
            case 8:
                Object objC = r1.C(t15, jY);
                if (objC instanceof String) {
                    zEquals = ((String) objC).isEmpty();
                } else {
                    if (!(objC instanceof h)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = h.f36058b.equals(objC);
                }
                break;
            case 9:
                return r1.C(t15, jY) != null;
            case 10:
                zEquals = h.f36058b.equals(r1.C(t15, jY));
                break;
            case 11:
                return r1.z(t15, jY) != 0;
            case 12:
                return r1.z(t15, jY) != 0;
            case 13:
                return r1.z(t15, jY) != 0;
            case 14:
                return r1.A(t15, jY) != 0;
            case 15:
                return r1.z(t15, jY) != 0;
            case 16:
                return r1.A(t15, jY) != 0;
            case 17:
                return r1.C(t15, jY) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private void C0(int i15, Object obj, u1 u1Var) {
        if (obj instanceof String) {
            u1Var.e(i15, (String) obj);
        } else {
            u1Var.M(i15, (h) obj);
        }
    }

    private boolean D(T t15, int i15, int i16, int i17, int i18) {
        if (i16 == 1048575) {
            return C(t15, i15);
        }
        return (i17 & i18) != 0;
    }

    private <UT, UB> void D0(n1<UT, UB> n1Var, T t15, u1 u1Var) {
        n1Var.t(n1Var.g(t15), u1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean E(Object obj, int i15, g1 g1Var) {
        return g1Var.f(r1.C(obj, Y(i15)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean F(Object obj, int i15, int i16) {
        List list = (List) r1.C(obj, Y(i15));
        if (list.isEmpty()) {
            return true;
        }
        g1 g1VarV = v(i16);
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (!g1VarV.f(list.get(i17))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t15, int i15, int i16) {
        if (this.f36263q.e(r1.C(t15, Y(i15))).isEmpty()) {
            return true;
        }
        this.f36263q.b(u(i16));
        throw null;
    }

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).F();
        }
        return true;
    }

    private boolean I(T t15, T t16, int i15) {
        long jL0 = l0(i15) & 1048575;
        return r1.z(t15, jL0) == r1.z(t16, jL0);
    }

    private boolean J(T t15, int i15, int i16) {
        return r1.z(t15, (long) (l0(i16) & 1048575)) == i15;
    }

    private static boolean K(int i15) {
        return (i15 & 268435456) != 0;
    }

    private static List<?> L(Object obj, long j15) {
        return (List) r1.C(obj, j15);
    }

    private static <T> long M(T t15, long j15) {
        return r1.A(t15, j15);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.u.b<ET>> void N(com.google.crypto.tink.shaded.protobuf.n1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.q<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.f1 r20, com.google.crypto.tink.shaded.protobuf.p r21) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.N(com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final <K, V> void O(Object obj, int i15, Object obj2, p pVar, f1 f1Var) {
        long jY = Y(x0(i15));
        Object objC = r1.C(obj, jY);
        if (objC == null) {
            objC = this.f36263q.d(obj2);
            r1.R(obj, jY, objC);
        } else if (this.f36263q.h(objC)) {
            Object objD = this.f36263q.d(obj2);
            this.f36263q.a(objD, objC);
            r1.R(obj, jY, objD);
            objC = objD;
        }
        Map<?, ?> mapC = this.f36263q.c(objC);
        this.f36263q.b(obj2);
        f1Var.K(mapC, null, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P(T t15, T t16, int i15) {
        if (C(t16, i15)) {
            long jY = Y(x0(i15));
            Unsafe unsafe = f36246s;
            Object object = unsafe.getObject(t16, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i15) + " is present but null: " + t16);
            }
            g1 g1VarV = v(i15);
            if (!C(t15, i15)) {
                if (H(object)) {
                    Object objD = g1VarV.d();
                    g1VarV.a(objD, object);
                    unsafe.putObject(t15, jY, objD);
                } else {
                    unsafe.putObject(t15, jY, object);
                }
                r0(t15, i15);
                return;
            }
            Object object2 = unsafe.getObject(t15, jY);
            if (!H(object2)) {
                Object objD2 = g1VarV.d();
                g1VarV.a(objD2, object2);
                unsafe.putObject(t15, jY, objD2);
                object2 = objD2;
            }
            g1VarV.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(T t15, T t16, int i15) {
        int iX = X(i15);
        if (J(t16, iX, i15)) {
            long jY = Y(x0(i15));
            Unsafe unsafe = f36246s;
            Object object = unsafe.getObject(t16, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i15) + " is present but null: " + t16);
            }
            g1 g1VarV = v(i15);
            if (!J(t15, iX, i15)) {
                if (H(object)) {
                    Object objD = g1VarV.d();
                    g1VarV.a(objD, object);
                    unsafe.putObject(t15, jY, objD);
                } else {
                    unsafe.putObject(t15, jY, object);
                }
                s0(t15, iX, i15);
                return;
            }
            Object object2 = unsafe.getObject(t15, jY);
            if (!H(object2)) {
                Object objD2 = g1VarV.d();
                g1VarV.a(objD2, object2);
                unsafe.putObject(t15, jY, objD2);
                object2 = objD2;
            }
            g1VarV.a(object2, object);
        }
    }

    private void R(T t15, T t16, int i15) {
        int iX0 = x0(i15);
        long jY = Y(iX0);
        int iX = X(i15);
        switch (w0(iX0)) {
            case 0:
                if (C(t16, i15)) {
                    r1.N(t15, jY, r1.x(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 1:
                if (C(t16, i15)) {
                    r1.O(t15, jY, r1.y(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 2:
                if (C(t16, i15)) {
                    r1.Q(t15, jY, r1.A(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 3:
                if (C(t16, i15)) {
                    r1.Q(t15, jY, r1.A(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 4:
                if (C(t16, i15)) {
                    r1.P(t15, jY, r1.z(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 5:
                if (C(t16, i15)) {
                    r1.Q(t15, jY, r1.A(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 6:
                if (C(t16, i15)) {
                    r1.P(t15, jY, r1.z(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 7:
                if (C(t16, i15)) {
                    r1.H(t15, jY, r1.r(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 8:
                if (C(t16, i15)) {
                    r1.R(t15, jY, r1.C(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 9:
                P(t15, t16, i15);
                break;
            case 10:
                if (C(t16, i15)) {
                    r1.R(t15, jY, r1.C(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 11:
                if (C(t16, i15)) {
                    r1.P(t15, jY, r1.z(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 12:
                if (C(t16, i15)) {
                    r1.P(t15, jY, r1.z(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 13:
                if (C(t16, i15)) {
                    r1.P(t15, jY, r1.z(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 14:
                if (C(t16, i15)) {
                    r1.Q(t15, jY, r1.A(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 15:
                if (C(t16, i15)) {
                    r1.P(t15, jY, r1.z(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 16:
                if (C(t16, i15)) {
                    r1.Q(t15, jY, r1.A(t16, jY));
                    r0(t15, i15);
                }
                break;
            case 17:
                P(t15, t16, i15);
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
                this.f36260n.d(t15, t16, jY);
                break;
            case 50:
                i1.F(this.f36263q, t15, t16, jY);
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
                if (J(t16, iX, i15)) {
                    r1.R(t15, jY, r1.C(t16, jY));
                    s0(t15, iX, i15);
                }
                break;
            case 60:
                Q(t15, t16, i15);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (J(t16, iX, i15)) {
                    r1.R(t15, jY, r1.C(t16, jY));
                    s0(t15, iX, i15);
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                Q(t15, t16, i15);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object S(T t15, int i15) {
        g1 g1VarV = v(i15);
        long jY = Y(x0(i15));
        if (!C(t15, i15)) {
            return g1VarV.d();
        }
        Object object = f36246s.getObject(t15, jY);
        if (H(object)) {
            return object;
        }
        Object objD = g1VarV.d();
        if (object != null) {
            g1VarV.a(objD, object);
        }
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object T(T t15, int i15, int i16) {
        g1 g1VarV = v(i16);
        if (!J(t15, i15, i16)) {
            return g1VarV.d();
        }
        Object object = f36246s.getObject(t15, Y(x0(i16)));
        if (H(object)) {
            return object;
        }
        Object objD = g1VarV.d();
        if (object != null) {
            g1VarV.a(objD, object);
        }
        return objD;
    }

    static <T> u0<T> U(Class<T> cls, p0 p0Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        return p0Var instanceof e1 ? W((e1) p0Var, w0Var, h0Var, n1Var, qVar, m0Var) : V((k1) p0Var, w0Var, h0Var, n1Var, qVar, m0Var);
    }

    static <T> u0<T> V(k1 k1Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        boolean z15 = k1Var.c() == b1.PROTO3;
        t[] tVarArrE = k1Var.e();
        if (tVarArrE.length != 0) {
            t tVar = tVarArrE[0];
            throw null;
        }
        int length = tVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (tVarArrE.length > 0) {
            t tVar2 = tVarArrE[0];
            throw null;
        }
        int[] iArrD = k1Var.d();
        if (iArrD == null) {
            iArrD = f36245r;
        }
        if (tVarArrE.length > 0) {
            t tVar3 = tVarArrE[0];
            throw null;
        }
        int[] iArr2 = f36245r;
        int[] iArr3 = f36245r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new u0<>(iArr, objArr, 0, 0, k1Var.b(), z15, true, iArr4, iArrD.length, iArrD.length + iArr2.length, w0Var, h0Var, n1Var, qVar, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0257  */
    /* JADX WARN: Code duplicated, block: B:124:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0275  */
    /* JADX WARN: Code duplicated, block: B:128:0x0278  */
    /* JADX WARN: Code duplicated, block: B:176:0x0365  */
    static <T> u0<T> W(e1 e1Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        int i15;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        char cCharAt;
        int i25;
        char cCharAt2;
        int i26;
        char cCharAt3;
        int i27;
        char cCharAt4;
        int i28;
        char cCharAt5;
        int i29;
        char cCharAt6;
        int i35;
        char cCharAt7;
        int i36;
        char cCharAt8;
        int i37;
        int i38;
        int i39;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i45;
        int i46;
        int i47;
        Field fieldQ0;
        char cCharAt9;
        int i48;
        int i49;
        Object obj;
        Field fieldQ1;
        int i55;
        Object obj2;
        Field fieldQ2;
        int i56;
        char cCharAt10;
        int i57;
        char cCharAt11;
        int i58;
        char cCharAt12;
        int i59;
        char cCharAt13;
        boolean z15 = e1Var.c() == b1.PROTO3;
        String strE = e1Var.e();
        int length = strE.length();
        char c15 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i65 = 1;
            while (true) {
                i15 = i65 + 1;
                if (strE.charAt(i65) < 55296) {
                    break;
                }
                i65 = i15;
            }
        } else {
            i15 = 1;
        }
        int i66 = i15 + 1;
        int iCharAt5 = strE.charAt(i15);
        if (iCharAt5 >= 55296) {
            int i67 = iCharAt5 & 8191;
            int i68 = 13;
            while (true) {
                i59 = i66 + 1;
                cCharAt13 = strE.charAt(i66);
                if (cCharAt13 < 55296) {
                    break;
                }
                i67 |= (cCharAt13 & 8191) << i68;
                i68 += 13;
                i66 = i59;
            }
            iCharAt5 = i67 | (cCharAt13 << i68);
            i66 = i59;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i17 = 0;
            iCharAt4 = 0;
            i16 = 0;
            iArr = f36245r;
            i18 = 0;
        } else {
            int i69 = i66 + 1;
            int iCharAt6 = strE.charAt(i66);
            if (iCharAt6 >= 55296) {
                int i75 = iCharAt6 & 8191;
                int i76 = 13;
                while (true) {
                    i36 = i69 + 1;
                    cCharAt8 = strE.charAt(i69);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt8 & 8191) << i76;
                    i76 += 13;
                    i69 = i36;
                }
                iCharAt6 = i75 | (cCharAt8 << i76);
                i69 = i36;
            }
            int i77 = i69 + 1;
            int iCharAt7 = strE.charAt(i69);
            if (iCharAt7 >= 55296) {
                int i78 = iCharAt7 & 8191;
                int i79 = 13;
                while (true) {
                    i35 = i77 + 1;
                    cCharAt7 = strE.charAt(i77);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i78 |= (cCharAt7 & 8191) << i79;
                    i79 += 13;
                    i77 = i35;
                }
                iCharAt7 = i78 | (cCharAt7 << i79);
                i77 = i35;
            }
            int i85 = i77 + 1;
            iCharAt = strE.charAt(i77);
            if (iCharAt >= 55296) {
                int i86 = iCharAt & 8191;
                int i87 = 13;
                while (true) {
                    i29 = i85 + 1;
                    cCharAt6 = strE.charAt(i85);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i86 |= (cCharAt6 & 8191) << i87;
                    i87 += 13;
                    i85 = i29;
                }
                iCharAt = i86 | (cCharAt6 << i87);
                i85 = i29;
            }
            int i88 = i85 + 1;
            iCharAt2 = strE.charAt(i85);
            if (iCharAt2 >= 55296) {
                int i89 = iCharAt2 & 8191;
                int i95 = 13;
                while (true) {
                    i28 = i88 + 1;
                    cCharAt5 = strE.charAt(i88);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i89 |= (cCharAt5 & 8191) << i95;
                    i95 += 13;
                    i88 = i28;
                }
                iCharAt2 = i89 | (cCharAt5 << i95);
                i88 = i28;
            }
            int i96 = i88 + 1;
            iCharAt3 = strE.charAt(i88);
            if (iCharAt3 >= 55296) {
                int i97 = iCharAt3 & 8191;
                int i98 = 13;
                while (true) {
                    i27 = i96 + 1;
                    cCharAt4 = strE.charAt(i96);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i97 |= (cCharAt4 & 8191) << i98;
                    i98 += 13;
                    i96 = i27;
                }
                iCharAt3 = i97 | (cCharAt4 << i98);
                i96 = i27;
            }
            int i99 = i96 + 1;
            int iCharAt8 = strE.charAt(i96);
            if (iCharAt8 >= 55296) {
                int i100 = iCharAt8 & 8191;
                int i101 = 13;
                while (true) {
                    i26 = i99 + 1;
                    cCharAt3 = strE.charAt(i99);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i100 |= (cCharAt3 & 8191) << i101;
                    i101 += 13;
                    i99 = i26;
                }
                iCharAt8 = i100 | (cCharAt3 << i101);
                i99 = i26;
            }
            int i102 = i99 + 1;
            int iCharAt9 = strE.charAt(i99);
            if (iCharAt9 >= 55296) {
                int i103 = iCharAt9 & 8191;
                int i104 = 13;
                while (true) {
                    i25 = i102 + 1;
                    cCharAt2 = strE.charAt(i102);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i103 |= (cCharAt2 & 8191) << i104;
                    i104 += 13;
                    i102 = i25;
                }
                iCharAt9 = i103 | (cCharAt2 << i104);
                i102 = i25;
            }
            int i105 = i102 + 1;
            iCharAt4 = strE.charAt(i102);
            if (iCharAt4 >= 55296) {
                int i106 = iCharAt4 & 8191;
                int i107 = 13;
                while (true) {
                    i19 = i105 + 1;
                    cCharAt = strE.charAt(i105);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i106 |= (cCharAt & 8191) << i107;
                    i107 += 13;
                    i105 = i19;
                }
                iCharAt4 = i106 | (cCharAt << i107);
                i105 = i19;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i16 = (iCharAt6 * 2) + iCharAt7;
            i17 = iCharAt8;
            iArr = iArr2;
            i18 = iCharAt6;
            i66 = i105;
        }
        Unsafe unsafe = f36246s;
        Object[] objArrD = e1Var.d();
        Class<?> cls = e1Var.b().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i108 = i17 + iCharAt4;
        int i109 = i108;
        int i110 = iCharAt4;
        int i111 = 0;
        int i112 = 0;
        while (i66 < length) {
            int i113 = i66 + 1;
            int iCharAt10 = strE.charAt(i66);
            if (iCharAt10 >= c15) {
                int i114 = iCharAt10 & 8191;
                int i115 = i113;
                int i116 = 13;
                while (true) {
                    i58 = i115 + 1;
                    cCharAt12 = strE.charAt(i115);
                    if (cCharAt12 < c15) {
                        break;
                    }
                    i114 |= (cCharAt12 & 8191) << i116;
                    i116 += 13;
                    i115 = i58;
                }
                iCharAt10 = i114 | (cCharAt12 << i116);
                i37 = i58;
            } else {
                i37 = i113;
            }
            int i117 = i37 + 1;
            int iCharAt11 = strE.charAt(i37);
            if (iCharAt11 >= c15) {
                int i118 = iCharAt11 & 8191;
                int i119 = i117;
                int i120 = 13;
                while (true) {
                    i57 = i119 + 1;
                    cCharAt11 = strE.charAt(i119);
                    i38 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i118 |= (cCharAt11 & 8191) << i120;
                    i120 += 13;
                    i119 = i57;
                    length = i38;
                }
                iCharAt11 = i118 | (cCharAt11 << i120);
                i39 = i57;
            } else {
                i38 = length;
                i39 = i117;
            }
            int i121 = iCharAt11 & GF2Field.MASK;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i111] = i112;
                i111++;
            }
            int i122 = iCharAt10;
            if (i121 >= 51) {
                int i123 = i39 + 1;
                int iCharAt12 = strE.charAt(i39);
                char c16 = 55296;
                if (iCharAt12 >= 55296) {
                    int i124 = iCharAt12 & 8191;
                    int i125 = 13;
                    while (true) {
                        i56 = i123 + 1;
                        cCharAt10 = strE.charAt(i123);
                        if (cCharAt10 < c16) {
                            break;
                        }
                        i124 |= (cCharAt10 & 8191) << i125;
                        i125 += 13;
                        i123 = i56;
                        c16 = 55296;
                    }
                    iCharAt12 = i124 | (cCharAt10 << i125);
                    i123 = i56;
                }
                int i126 = i121 - 51;
                int i127 = iCharAt12;
                if (i126 == 9 || i126 == 17) {
                    i48 = i16 + 1;
                    objArr[((i112 / 3) * 2) + 1] = objArrD[i16];
                } else {
                    if (i126 == 12 && !z15) {
                        i48 = i16 + 1;
                        objArr[((i112 / 3) * 2) + 1] = objArrD[i16];
                    }
                    i49 = i127 * 2;
                    obj = objArrD[i49];
                    if (obj instanceof Field) {
                        fieldQ1 = (Field) obj;
                    } else {
                        fieldQ1 = q0(cls, (String) obj);
                        objArrD[i49] = fieldQ1;
                    }
                    int i128 = i123;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldQ1);
                    i55 = i49 + 1;
                    obj2 = objArrD[i55];
                    if (obj2 instanceof Field) {
                        fieldQ2 = (Field) obj2;
                    } else {
                        fieldQ2 = q0(cls, (String) obj2);
                        objArrD[i55] = fieldQ2;
                    }
                    strE = strE;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldQ2);
                    i66 = i128;
                    i47 = iObjectFieldOffset3;
                    i46 = 0;
                }
                i16 = i48;
                i49 = i127 * 2;
                obj = objArrD[i49];
                if (obj instanceof Field) {
                    fieldQ1 = (Field) obj;
                } else {
                    fieldQ1 = q0(cls, (String) obj);
                    objArrD[i49] = fieldQ1;
                }
                int i129 = i123;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldQ1);
                i55 = i49 + 1;
                obj2 = objArrD[i55];
                if (obj2 instanceof Field) {
                    fieldQ2 = (Field) obj2;
                } else {
                    fieldQ2 = q0(cls, (String) obj2);
                    objArrD[i55] = fieldQ2;
                }
                strE = strE;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldQ2);
                i66 = i129;
                i47 = iObjectFieldOffset4;
                i46 = 0;
            } else {
                int i130 = i16 + 1;
                Field fieldQ3 = q0(cls, (String) objArrD[i16]);
                if (i121 == 9 || i121 == 17) {
                    objArr[((i112 / 3) * 2) + 1] = fieldQ3.getType();
                } else {
                    if (i121 == 27 || i121 == 49) {
                        i16 += 2;
                        objArr[((i112 / 3) * 2) + 1] = objArrD[i130];
                    } else if (i121 == 12 || i121 == 30 || i121 == 44) {
                        if (!z15) {
                            i16 += 2;
                            objArr[((i112 / 3) * 2) + 1] = objArrD[i130];
                        }
                    } else if (i121 == 50) {
                        int i131 = i110 + 1;
                        iArr[i110] = i112;
                        int i132 = (i112 / 3) * 2;
                        int i133 = i16 + 2;
                        objArr[i132] = objArrD[i130];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i132 + 1] = objArrD[i133];
                            i16 += 3;
                        } else {
                            i16 = i133;
                        }
                        i110 = i131;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ3);
                    if ((iCharAt11 & PKIFailureInfo.certConfirmed) == 4096 || i121 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i45 = i39;
                        i46 = 0;
                    } else {
                        int i134 = i39 + 1;
                        int iCharAt13 = strE.charAt(i39);
                        if (iCharAt13 >= 55296) {
                            int i135 = iCharAt13 & 8191;
                            int i136 = 13;
                            while (true) {
                                i45 = i134 + 1;
                                cCharAt9 = strE.charAt(i134);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i135 |= (cCharAt9 & 8191) << i136;
                                i136 += 13;
                                i134 = i45;
                            }
                            iCharAt13 = i135 | (cCharAt9 << i136);
                        } else {
                            i45 = i134;
                        }
                        int i137 = (i18 * 2) + (iCharAt13 / 32);
                        Object obj3 = objArrD[i137];
                        if (obj3 instanceof Field) {
                            fieldQ0 = (Field) obj3;
                        } else {
                            fieldQ0 = q0(cls, (String) obj3);
                            objArrD[i137] = fieldQ0;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldQ0);
                        i46 = iCharAt13 % 32;
                    }
                    if (i121 >= 18 && i121 <= 49) {
                        iArr[i109] = iObjectFieldOffset;
                        i109++;
                    }
                    i47 = iObjectFieldOffset;
                    i66 = i45;
                }
                i16 = i130;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ3);
                if ((iCharAt11 & PKIFailureInfo.certConfirmed) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i45 = i39;
                    i46 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i45 = i39;
                    i46 = 0;
                }
                if (i121 >= 18) {
                    iArr[i109] = iObjectFieldOffset;
                    i109++;
                }
                i47 = iObjectFieldOffset;
                i66 = i45;
            }
            int i138 = i112 + 1;
            iArr4[i112] = i122;
            int i139 = i112 + 2;
            int i140 = iObjectFieldOffset2;
            iArr4[i138] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i121 << 20) | i47;
            i112 += 3;
            iArr4[i139] = (i46 << 20) | i140;
            iArr3 = iArr4;
            length = i38;
            strE = strE;
            c15 = 55296;
        }
        return new u0<>(iArr3, objArr, iCharAt, iCharAt2, e1Var.b(), z15, false, iArr, iCharAt4, i108, w0Var, h0Var, n1Var, qVar, m0Var);
    }

    private int X(int i15) {
        return this.f36247a[i15];
    }

    private static long Y(int i15) {
        return i15 & 1048575;
    }

    private static <T> boolean Z(T t15, long j15) {
        return ((Boolean) r1.C(t15, j15)).booleanValue();
    }

    private static <T> double a0(T t15, long j15) {
        return ((Double) r1.C(t15, j15)).doubleValue();
    }

    private static <T> float b0(T t15, long j15) {
        return ((Float) r1.C(t15, j15)).floatValue();
    }

    private static <T> int c0(T t15, long j15) {
        return ((Integer) r1.C(t15, j15)).intValue();
    }

    private static <T> long d0(T t15, long j15) {
        return ((Long) r1.C(t15, j15)).longValue();
    }

    private <K, V> int e0(T t15, byte[] bArr, int i15, int i16, int i17, long j15, e.b bVar) {
        Unsafe unsafe = f36246s;
        Object objU = u(i17);
        Object object = unsafe.getObject(t15, j15);
        if (this.f36263q.h(object)) {
            Object objD = this.f36263q.d(objU);
            this.f36263q.a(objD, object);
            unsafe.putObject(t15, j15, objD);
            object = objD;
        }
        this.f36263q.b(objU);
        return n(bArr, i15, i16, null, this.f36263q.c(object), bVar);
    }

    private int f0(T t15, byte[] bArr, int i15, int i16, int i17, int i18, int i19, int i25, int i26, long j15, int i27, e.b bVar) throws b0 {
        Unsafe unsafe = f36246s;
        long j16 = this.f36247a[i27 + 2] & 1048575;
        switch (i26) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i19 != 1) {
                    return i15;
                }
                unsafe.putObject(t15, j15, Double.valueOf(e.d(bArr, i15)));
                int i28 = i15 + 8;
                unsafe.putInt(t15, j16, i18);
                return i28;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i19 != 5) {
                    return i15;
                }
                unsafe.putObject(t15, j15, Float.valueOf(e.l(bArr, i15)));
                int i29 = i15 + 4;
                unsafe.putInt(t15, j16, i18);
                return i29;
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i19 != 0) {
                    return i15;
                }
                int iL = e.L(bArr, i15, bVar);
                unsafe.putObject(t15, j15, Long.valueOf(bVar.f36040b));
                unsafe.putInt(t15, j16, i18);
                return iL;
            case 55:
            case 62:
                if (i19 != 0) {
                    return i15;
                }
                int I = e.I(bArr, i15, bVar);
                unsafe.putObject(t15, j15, Integer.valueOf(bVar.f36039a));
                unsafe.putInt(t15, j16, i18);
                return I;
            case 56:
            case 65:
                if (i19 != 1) {
                    return i15;
                }
                unsafe.putObject(t15, j15, Long.valueOf(e.j(bArr, i15)));
                int i35 = i15 + 8;
                unsafe.putInt(t15, j16, i18);
                return i35;
            case 57:
            case 64:
                if (i19 != 5) {
                    return i15;
                }
                unsafe.putObject(t15, j15, Integer.valueOf(e.h(bArr, i15)));
                int i36 = i15 + 4;
                unsafe.putInt(t15, j16, i18);
                return i36;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i19 != 0) {
                    return i15;
                }
                int iL2 = e.L(bArr, i15, bVar);
                unsafe.putObject(t15, j15, Boolean.valueOf(bVar.f36040b != 0));
                unsafe.putInt(t15, j16, i18);
                return iL2;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i19 != 2) {
                    return i15;
                }
                int I2 = e.I(bArr, i15, bVar);
                int i37 = bVar.f36039a;
                if (i37 == 0) {
                    unsafe.putObject(t15, j15, "");
                } else {
                    if ((i25 & PKIFailureInfo.duplicateCertReq) != 0 && !s1.n(bArr, I2, I2 + i37)) {
                        throw b0.d();
                    }
                    unsafe.putObject(t15, j15, new String(bArr, I2, i37, a0.f36000b));
                    I2 += i37;
                }
                unsafe.putInt(t15, j16, i18);
                return I2;
            case 60:
                if (i19 != 2) {
                    return i15;
                }
                Object objT = T(t15, i18, i27);
                int iO = e.O(objT, v(i27), bArr, i15, i16, bVar);
                v0(t15, i18, i27, objT);
                return iO;
            case 61:
                if (i19 != 2) {
                    return i15;
                }
                int iB = e.b(bArr, i15, bVar);
                unsafe.putObject(t15, j15, bVar.f36041c);
                unsafe.putInt(t15, j16, i18);
                return iB;
            case 63:
                if (i19 != 0) {
                    return i15;
                }
                int I3 = e.I(bArr, i15, bVar);
                int i38 = bVar.f36039a;
                a0.e eVarT = t(i27);
                if (eVarT != null && !eVarT.a(i38)) {
                    w(t15).n(i17, Long.valueOf(i38));
                    return I3;
                }
                unsafe.putObject(t15, j15, Integer.valueOf(i38));
                unsafe.putInt(t15, j16, i18);
                return I3;
            case 66:
                if (i19 != 0) {
                    return i15;
                }
                int I4 = e.I(bArr, i15, bVar);
                unsafe.putObject(t15, j15, Integer.valueOf(i.b(bVar.f36039a)));
                unsafe.putInt(t15, j16, i18);
                return I4;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i19 != 0) {
                    return i15;
                }
                int iL3 = e.L(bArr, i15, bVar);
                unsafe.putObject(t15, j15, Long.valueOf(i.c(bVar.f36040b)));
                unsafe.putInt(t15, j16, i18);
                return iL3;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i19 == 3) {
                    Object objT2 = T(t15, i18, i27);
                    int iN = e.N(objT2, v(i27), bArr, i15, i16, (i17 & (-8)) | 4, bVar);
                    v0(t15, i18, i27, objT2);
                    return iN;
                }
                break;
        }
        return i15;
    }

    private int h0(T t15, byte[] bArr, int i15, int i16, e.b bVar) throws b0 {
        Unsafe unsafe;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        byte[] bArr2;
        e.b bVar2;
        int i27;
        int i28;
        int I;
        T t16;
        Unsafe unsafe2;
        int i29;
        e.b bVar3;
        byte[] bArr3;
        int iL;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        u0<T> u0Var = this;
        T t17 = t15;
        byte[] bArr4 = bArr;
        int i46 = i16;
        e.b bVar4 = bVar;
        m(t17);
        Unsafe unsafe3 = f36246s;
        int i47 = -1;
        int i48 = i15;
        int i49 = -1;
        int i55 = 0;
        int i56 = 0;
        int i57 = 1048575;
        while (i48 < i46) {
            int iH = i48 + 1;
            int i58 = bArr4[i48];
            if (i58 < 0) {
                iH = e.H(i58, bArr4, iH, bVar4);
                i58 = bVar4.f36039a;
            }
            i49 = i58 >>> 3;
            int i59 = i58 & 7;
            int iK0 = i49 > i49 ? u0Var.k0(i49, i55 / 3) : u0Var.j0(i49);
            if (iK0 == i47) {
                t15 = t17;
                unsafe = unsafe3;
                i17 = i58;
                i18 = iH;
                i19 = i47;
                i25 = i49;
                i26 = 0;
            } else {
                int i65 = u0Var.f36247a[iK0 + 1];
                int iW0 = w0(i65);
                i17 = i58;
                int i66 = iK0;
                long jY = Y(i65);
                if (iW0 <= 17) {
                    int i67 = u0Var.f36247a[i66 + 2];
                    int i68 = 1 << (i67 >>> 20);
                    int i69 = i67 & 1048575;
                    if (i69 != i57) {
                        if (i57 != 1048575) {
                            unsafe3.putInt(t17, i57, i56);
                            i36 = i69;
                            i35 = 1048575;
                        } else {
                            i35 = 1048575;
                            i36 = i69;
                        }
                        if (i36 != i35) {
                            i56 = unsafe3.getInt(t17, i36);
                        }
                        i57 = i36;
                    }
                    switch (iW0) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i27 = iH;
                            i28 = i66;
                            if (i59 != 1) {
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                r1.N(t17, jY, e.d(bArr5, i27));
                                i48 = i27 + 8;
                                i56 |= i68;
                                i46 = i16;
                                i55 = i28;
                                i49 = i49;
                                bArr4 = bArr5;
                                i47 = -1;
                                bVar4 = bVar;
                            }
                            break;
                        case 1:
                            e.b bVar5 = bVar4;
                            bArr2 = bArr4;
                            bVar2 = bVar5;
                            i27 = iH;
                            i28 = i66;
                            if (i59 != 5) {
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                r1.O(t17, jY, e.l(bArr2, i27));
                                i48 = i27 + 4;
                                i56 |= i68;
                                byte[] bArr6 = bArr2;
                                bVar4 = bVar2;
                                bArr4 = bArr6;
                                i46 = i16;
                                i55 = i28;
                                i47 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            e.b bVar6 = bVar4;
                            byte[] bArr7 = bArr4;
                            i27 = iH;
                            i28 = i66;
                            if (i59 != 0) {
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                int iL2 = e.L(bArr7, i27, bVar6);
                                Unsafe unsafe4 = unsafe3;
                                T t18 = t17;
                                unsafe4.putLong(t18, jY, bVar6.f36040b);
                                unsafe3 = unsafe4;
                                t17 = t18;
                                i56 |= i68;
                                bVar4 = bVar6;
                                bArr4 = bArr7;
                                i48 = iL2;
                                i55 = i28;
                                i49 = i49;
                                i47 = -1;
                                i46 = i16;
                            }
                            break;
                        case 4:
                        case 11:
                            e.b bVar7 = bVar4;
                            byte[] bArr8 = bArr4;
                            i27 = iH;
                            i28 = i66;
                            if (i59 != 0) {
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                I = e.I(bArr8, i27, bVar7);
                                unsafe3.putInt(t17, jY, bVar7.f36039a);
                                i56 |= i68;
                                bVar4 = bVar7;
                                bArr4 = bArr8;
                                i46 = i16;
                                i48 = I;
                                i55 = i28;
                                i47 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            T t19 = t17;
                            e.b bVar8 = bVar4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i75 = iH;
                            i28 = i66;
                            if (i59 != 1) {
                                t17 = t19;
                                i27 = i75;
                                unsafe3 = unsafe5;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                bVar2 = bVar8;
                                unsafe5.putLong(t19, jY, e.j(bArr2, i75));
                                unsafe3 = unsafe5;
                                t17 = t19;
                                i48 = i75 + 8;
                                i56 |= i68;
                                byte[] bArr10 = bArr2;
                                bVar4 = bVar2;
                                bArr4 = bArr10;
                                i46 = i16;
                                i55 = i28;
                                i47 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            byte[] bArr11 = bArr4;
                            t16 = t17;
                            e.b bVar9 = bVar4;
                            unsafe2 = unsafe3;
                            i29 = iH;
                            i28 = i66;
                            if (i59 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i27 = i29;
                                unsafe3 = unsafe6;
                                t17 = t16;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                unsafe2.putInt(t16, jY, e.h(bArr11, i29));
                                i48 = i29 + 4;
                                i56 |= i68;
                                bVar4 = bVar9;
                                t17 = t16;
                                bArr4 = bArr11;
                                unsafe3 = unsafe2;
                                i55 = i28;
                                i49 = i49;
                                i47 = -1;
                                i46 = i16;
                            }
                            break;
                        case 7:
                            byte[] bArr12 = bArr4;
                            t16 = t17;
                            bVar3 = bVar4;
                            bArr3 = bArr12;
                            unsafe2 = unsafe3;
                            i29 = iH;
                            i28 = i66;
                            if (i59 != 0) {
                                Unsafe unsafe7 = unsafe2;
                                i27 = i29;
                                unsafe3 = unsafe7;
                                t17 = t16;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                iL = e.L(bArr3, i29, bVar3);
                                r1.H(t16, jY, bVar3.f36040b != 0);
                                i56 |= i68;
                                byte[] bArr13 = bArr3;
                                bVar4 = bVar3;
                                t17 = t16;
                                bArr4 = bArr13;
                                i48 = iL;
                                unsafe3 = unsafe2;
                                i55 = i28;
                                i49 = i49;
                                i47 = -1;
                                i46 = i16;
                            }
                            break;
                        case 8:
                            byte[] bArr14 = bArr4;
                            t16 = t17;
                            bVar3 = bVar4;
                            bArr3 = bArr14;
                            unsafe2 = unsafe3;
                            i29 = iH;
                            i28 = i66;
                            if (i59 != 2) {
                                Unsafe unsafe8 = unsafe2;
                                i27 = i29;
                                unsafe3 = unsafe8;
                                t17 = t16;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                iL = (i65 & PKIFailureInfo.duplicateCertReq) == 0 ? e.C(bArr3, i29, bVar3) : e.F(bArr3, i29, bVar3);
                                unsafe2.putObject(t16, jY, bVar3.f36041c);
                                i56 |= i68;
                                byte[] bArr15 = bArr3;
                                bVar4 = bVar3;
                                t17 = t16;
                                bArr4 = bArr15;
                                i48 = iL;
                                unsafe3 = unsafe2;
                                i55 = i28;
                                i49 = i49;
                                i47 = -1;
                                i46 = i16;
                            }
                            break;
                        case 9:
                            i28 = i66;
                            if (i59 != 2) {
                                t17 = t17;
                                i27 = iH;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                T t25 = t17;
                                Object objS = u0Var.S(t25, i28);
                                byte[] bArr16 = bArr4;
                                t16 = t25;
                                int i76 = i46;
                                unsafe2 = unsafe3;
                                int i77 = iH;
                                e.b bVar10 = bVar4;
                                iL = e.O(objS, u0Var.v(i28), bArr16, i77, i76, bVar10);
                                bArr3 = bArr16;
                                bVar3 = bVar10;
                                u0Var.u0(t16, i28, objS);
                                i56 |= i68;
                                byte[] bArr17 = bArr3;
                                bVar4 = bVar3;
                                t17 = t16;
                                bArr4 = bArr17;
                                i48 = iL;
                                unsafe3 = unsafe2;
                                i55 = i28;
                                i49 = i49;
                                i47 = -1;
                                i46 = i16;
                            }
                            break;
                        case 10:
                            i28 = i66;
                            if (i59 != 2) {
                                i27 = iH;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                I = e.b(bArr4, iH, bVar4);
                                unsafe3.putObject(t17, jY, bVar4.f36041c);
                                i56 |= i68;
                                i48 = I;
                                i55 = i28;
                                i47 = -1;
                            }
                            break;
                        case 12:
                            i28 = i66;
                            if (i59 != 0) {
                                i27 = iH;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                I = e.I(bArr4, iH, bVar4);
                                unsafe3.putInt(t17, jY, bVar4.f36039a);
                                i56 |= i68;
                                i48 = I;
                                i55 = i28;
                                i47 = -1;
                            }
                            break;
                        case 15:
                            i28 = i66;
                            if (i59 != 0) {
                                i27 = iH;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                I = e.I(bArr4, iH, bVar4);
                                unsafe3.putInt(t17, jY, i.b(bVar4.f36039a));
                                i56 |= i68;
                                i48 = I;
                                i55 = i28;
                                i47 = -1;
                            }
                            break;
                        case 16:
                            if (i59 != 0) {
                                i27 = iH;
                                i28 = i66;
                                unsafe = unsafe3;
                                i18 = i27;
                                i26 = i28;
                                i25 = i49;
                                i19 = -1;
                                t15 = t17;
                            } else {
                                int iL3 = e.L(bArr4, iH, bVar4);
                                Unsafe unsafe9 = unsafe3;
                                T t26 = t17;
                                unsafe9.putLong(t26, jY, i.c(bVar4.f36040b));
                                unsafe3 = unsafe9;
                                t17 = t26;
                                i56 |= i68;
                                i48 = iL3;
                                i55 = i66;
                                i47 = -1;
                            }
                            break;
                        default:
                            i27 = iH;
                            i28 = i66;
                            unsafe = unsafe3;
                            i18 = i27;
                            i26 = i28;
                            i25 = i49;
                            i19 = -1;
                            t15 = t17;
                            break;
                    }
                } else {
                    int i78 = iH;
                    byte[] bArr18 = bArr4;
                    if (iW0 != 27) {
                        Unsafe unsafe10 = unsafe3;
                        if (iW0 <= 49) {
                            i38 = i56;
                            unsafe = unsafe10;
                            i19 = -1;
                            i45 = i57;
                            int iI0 = u0Var.i0(t15, bArr, i78, i16, i17 == true ? 1 : 0, i49, i59, i66, i65, iW0, jY, bVar);
                            i39 = i49;
                            i26 = i66;
                            if (iI0 != i78) {
                                u0Var = this;
                                t17 = t15;
                                i46 = i16;
                                bVar4 = bVar;
                                i48 = iI0;
                                i49 = i39;
                                i57 = i45;
                                i47 = -1;
                                i55 = i26;
                                i56 = i38;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                i18 = iI0;
                                i25 = i39;
                                i57 = i45;
                                i56 = i38;
                            }
                        } else {
                            unsafe = unsafe10;
                            i38 = i56;
                            i26 = i66;
                            i19 = -1;
                            i45 = i57;
                            i39 = i49;
                            i37 = i78;
                            if (iW0 != 50) {
                                i25 = i39;
                                int iF0 = f0(t15, bArr, i37, i16, i17 == true ? 1 : 0, i25, i59, i65, iW0, jY, i26, bVar);
                                t15 = t15;
                                if (iF0 != i37) {
                                    u0Var = this;
                                    bVar4 = bVar;
                                    i49 = i25;
                                    i48 = iF0;
                                    t17 = t15;
                                    i57 = i45;
                                    i47 = -1;
                                    i55 = i26;
                                    i56 = i38;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i46 = i16;
                                } else {
                                    i18 = iF0;
                                    i57 = i45;
                                    i56 = i38;
                                }
                            } else if (i59 == 2) {
                                int iE0 = e0(t15, bArr, i37, i16, i26, jY, bVar);
                                if (iE0 != i37) {
                                    u0Var = this;
                                    t17 = t15;
                                    bArr4 = bArr;
                                    i46 = i16;
                                    bVar4 = bVar;
                                    i48 = iE0;
                                    i49 = i39;
                                    i57 = i45;
                                    i47 = -1;
                                    i55 = i26;
                                    i56 = i38;
                                    unsafe3 = unsafe;
                                } else {
                                    i18 = iE0;
                                    i25 = i39;
                                    i57 = i45;
                                    i56 = i38;
                                }
                            } else {
                                i18 = i37;
                                i25 = i39;
                                i57 = i45;
                                i56 = i38;
                            }
                        }
                    } else if (i59 == 2) {
                        a0.i iVarD0 = (a0.i) unsafe3.getObject(t17, jY);
                        if (!iVarD0.c0()) {
                            int size = iVarD0.size();
                            iVarD0 = iVarD0.d0(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t17, jY, iVarD0);
                        }
                        int iQ = e.q(u0Var.v(i66), i17 == true ? 1 : 0, bArr18, i78, i16, iVarD0, bVar);
                        bArr4 = bArr;
                        bVar4 = bVar;
                        i48 = iQ;
                        unsafe3 = unsafe3;
                        i49 = i49;
                        i55 = i66;
                        i47 = -1;
                        t17 = t15;
                        i46 = i16;
                    } else {
                        i37 = i78;
                        unsafe = unsafe3;
                        i38 = i56;
                        i39 = i49;
                        i26 = i66;
                        i19 = -1;
                        i45 = i57;
                        i18 = i37;
                        i25 = i39;
                        i57 = i45;
                        i56 = i38;
                    }
                }
            }
            int iG = e.G(i17 == true ? 1 : 0, bArr, i18, i16, w(t15), bVar);
            bArr4 = bArr;
            bVar4 = bVar;
            i49 = i25;
            t17 = t15;
            i47 = i19;
            i55 = i26;
            unsafe3 = unsafe;
            i46 = i16;
            i48 = iG;
            u0Var = this;
        }
        Unsafe unsafe11 = unsafe3;
        int i79 = i46;
        int i85 = i57;
        int i86 = i56;
        T t27 = t17;
        if (i85 != 1048575) {
            unsafe11.putInt(t27, i85, i86);
        }
        if (i48 == i79) {
            return i48;
        }
        throw b0.h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int i0(T t15, byte[] bArr, int i15, int i16, int i17, int i18, int i19, int i25, long j15, int i26, long j16, e.b bVar) throws b0 {
        int iJ;
        Unsafe unsafe = f36246s;
        a0.i iVarD0 = (a0.i) unsafe.getObject(t15, j16);
        if (!iVarD0.c0()) {
            int size = iVarD0.size();
            iVarD0 = iVarD0.d0(size == 0 ? 10 : size * 2);
            unsafe.putObject(t15, j16, iVarD0);
        }
        a0.i iVar = iVarD0;
        switch (i26) {
            case 18:
            case 35:
                if (i19 == 2) {
                    return e.s(bArr, i15, iVar, bVar);
                }
                if (i19 == 1) {
                    return e.e(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 19:
            case 36:
                if (i19 == 2) {
                    return e.v(bArr, i15, iVar, bVar);
                }
                if (i19 == 5) {
                    return e.m(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 20:
            case 21:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                if (i19 == 2) {
                    return e.z(bArr, i15, iVar, bVar);
                }
                if (i19 == 0) {
                    return e.M(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 22:
            case 29:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                if (i19 == 2) {
                    return e.y(bArr, i15, iVar, bVar);
                }
                if (i19 == 0) {
                    return e.J(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return e.u(bArr, i15, iVar, bVar);
                }
                if (i19 == 1) {
                    return e.k(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 24:
            case BERTags.DATE /* 31 */:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                if (i19 == 2) {
                    return e.t(bArr, i15, iVar, bVar);
                }
                if (i19 == 5) {
                    return e.i(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 25:
            case EACTags.CURRENCY_CODE /* 42 */:
                if (i19 == 2) {
                    return e.r(bArr, i15, iVar, bVar);
                }
                if (i19 == 0) {
                    return e.a(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 26:
                if (i19 == 2) {
                    return (j15 & 536870912) == 0 ? e.D(i17, bArr, i15, i16, iVar, bVar) : e.E(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 27:
                if (i19 == 2) {
                    return e.q(v(i25), i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 28:
                if (i19 == 2) {
                    return e.c(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 30:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                if (i19 != 2) {
                    if (i19 == 0) {
                        iJ = e.J(i17, bArr, i15, i16, iVar, bVar);
                    }
                    return i15;
                }
                iJ = e.y(bArr, i15, iVar, bVar);
                i1.A(t15, i18, iVar, t(i25), null, this.f36261o);
                return iJ;
            case 33:
            case 47:
                if (i19 == 2) {
                    return e.w(bArr, i15, iVar, bVar);
                }
                if (i19 == 0) {
                    return e.A(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 34:
            case 48:
                if (i19 == 2) {
                    return e.x(bArr, i15, iVar, bVar);
                }
                if (i19 == 0) {
                    return e.B(i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            case 49:
                if (i19 == 3) {
                    return e.o(v(i25), i17, bArr, i15, i16, iVar, bVar);
                }
                return i15;
            default:
                return i15;
        }
    }

    private int j0(int i15) {
        if (i15 < this.f36249c || i15 > this.f36250d) {
            return -1;
        }
        return t0(i15, 0);
    }

    private boolean k(T t15, T t16, int i15) {
        return C(t15, i15) == C(t16, i15);
    }

    private int k0(int i15, int i16) {
        if (i15 < this.f36249c || i15 > this.f36250d) {
            return -1;
        }
        return t0(i15, i16);
    }

    private static <T> boolean l(T t15, long j15) {
        return r1.r(t15, j15);
    }

    private int l0(int i15) {
        return this.f36247a[i15 + 2];
    }

    private static void m(Object obj) {
        if (H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private <E> void m0(Object obj, long j15, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.O(this.f36260n.e(obj, j15), g1Var, pVar);
    }

    private <K, V> int n(byte[] bArr, int i15, int i16, k0.a<K, V> aVar, Map<K, V> map, e.b bVar) throws b0 {
        int I = e.I(bArr, i15, bVar);
        int i17 = bVar.f36039a;
        if (i17 < 0 || i17 > i16 - I) {
            throw b0.n();
        }
        throw null;
    }

    private <E> void n0(Object obj, int i15, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.M(this.f36260n.e(obj, Y(i15)), g1Var, pVar);
    }

    private static <T> double o(T t15, long j15) {
        return r1.x(t15, j15);
    }

    private void o0(Object obj, int i15, f1 f1Var) {
        if (B(i15)) {
            r1.R(obj, Y(i15), f1Var.H());
        } else if (this.f36253g) {
            r1.R(obj, Y(i15), f1Var.y());
        } else {
            r1.R(obj, Y(i15), f1Var.n());
        }
    }

    private boolean p(T t15, T t16, int i15) {
        int iX0 = x0(i15);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                return k(t15, t16, i15) && Double.doubleToLongBits(r1.x(t15, jY)) == Double.doubleToLongBits(r1.x(t16, jY));
            case 1:
                return k(t15, t16, i15) && Float.floatToIntBits(r1.y(t15, jY)) == Float.floatToIntBits(r1.y(t16, jY));
            case 2:
                return k(t15, t16, i15) && r1.A(t15, jY) == r1.A(t16, jY);
            case 3:
                return k(t15, t16, i15) && r1.A(t15, jY) == r1.A(t16, jY);
            case 4:
                return k(t15, t16, i15) && r1.z(t15, jY) == r1.z(t16, jY);
            case 5:
                return k(t15, t16, i15) && r1.A(t15, jY) == r1.A(t16, jY);
            case 6:
                return k(t15, t16, i15) && r1.z(t15, jY) == r1.z(t16, jY);
            case 7:
                return k(t15, t16, i15) && r1.r(t15, jY) == r1.r(t16, jY);
            case 8:
                return k(t15, t16, i15) && i1.K(r1.C(t15, jY), r1.C(t16, jY));
            case 9:
                return k(t15, t16, i15) && i1.K(r1.C(t15, jY), r1.C(t16, jY));
            case 10:
                return k(t15, t16, i15) && i1.K(r1.C(t15, jY), r1.C(t16, jY));
            case 11:
                return k(t15, t16, i15) && r1.z(t15, jY) == r1.z(t16, jY);
            case 12:
                return k(t15, t16, i15) && r1.z(t15, jY) == r1.z(t16, jY);
            case 13:
                return k(t15, t16, i15) && r1.z(t15, jY) == r1.z(t16, jY);
            case 14:
                return k(t15, t16, i15) && r1.A(t15, jY) == r1.A(t16, jY);
            case 15:
                return k(t15, t16, i15) && r1.z(t15, jY) == r1.z(t16, jY);
            case 16:
                return k(t15, t16, i15) && r1.A(t15, jY) == r1.A(t16, jY);
            case 17:
                return k(t15, t16, i15) && i1.K(r1.C(t15, jY), r1.C(t16, jY));
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
                return i1.K(r1.C(t15, jY), r1.C(t16, jY));
            case 50:
                return i1.K(r1.C(t15, jY), r1.C(t16, jY));
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
                return I(t15, t16, i15) && i1.K(r1.C(t15, jY), r1.C(t16, jY));
            default:
                return true;
        }
    }

    private void p0(Object obj, int i15, f1 f1Var) {
        if (B(i15)) {
            f1Var.m(this.f36260n.e(obj, Y(i15)));
        } else {
            f1Var.A(this.f36260n.e(obj, Y(i15)));
        }
    }

    private <UT, UB> UB q(Object obj, int i15, UB ub5, n1<UT, UB> n1Var, Object obj2) {
        a0.e eVarT;
        int iX = X(i15);
        Object objC = r1.C(obj, Y(x0(i15)));
        return (objC == null || (eVarT = t(i15)) == null) ? ub5 : (UB) r(i15, iX, this.f36263q.c(objC), eVarT, ub5, n1Var, obj2);
    }

    private static Field q0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private <K, V, UT, UB> UB r(int i15, int i16, Map<K, V> map, a0.e eVar, UB ub5, n1<UT, UB> n1Var, Object obj) {
        this.f36263q.b(u(i15));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub5 == null) {
                    ub5 = n1Var.f(obj);
                }
                h.C0758h c0758hU = h.u(k0.b(null, next.getKey(), next.getValue()));
                try {
                    k0.d(c0758hU.b(), null, next.getKey(), next.getValue());
                    n1Var.d(ub5, i16, c0758hU.a());
                    it.remove();
                } catch (IOException e15) {
                    throw new RuntimeException(e15);
                }
            }
        }
        return ub5;
    }

    private void r0(T t15, int i15) {
        int iL0 = l0(i15);
        long j15 = 1048575 & iL0;
        if (j15 == 1048575) {
            return;
        }
        r1.P(t15, j15, (1 << (iL0 >>> 20)) | r1.z(t15, j15));
    }

    private static <T> float s(T t15, long j15) {
        return r1.y(t15, j15);
    }

    private void s0(T t15, int i15, int i16) {
        r1.P(t15, l0(i16) & 1048575, i15);
    }

    private a0.e t(int i15) {
        return (a0.e) this.f36248b[((i15 / 3) * 2) + 1];
    }

    private int t0(int i15, int i16) {
        int length = (this.f36247a.length / 3) - 1;
        while (i16 <= length) {
            int i17 = (length + i16) >>> 1;
            int i18 = i17 * 3;
            int iX = X(i18);
            if (i15 == iX) {
                return i18;
            }
            if (i15 < iX) {
                length = i17 - 1;
            } else {
                i16 = i17 + 1;
            }
        }
        return -1;
    }

    private Object u(int i15) {
        return this.f36248b[(i15 / 3) * 2];
    }

    private void u0(T t15, int i15, Object obj) {
        f36246s.putObject(t15, Y(x0(i15)), obj);
        r0(t15, i15);
    }

    private g1 v(int i15) {
        int i16 = (i15 / 3) * 2;
        g1 g1Var = (g1) this.f36248b[i16];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> g1VarC = c1.a().c((Class) this.f36248b[i16 + 1]);
        this.f36248b[i16] = g1VarC;
        return g1VarC;
    }

    private void v0(T t15, int i15, int i16, Object obj) {
        f36246s.putObject(t15, Y(x0(i16)), obj);
        s0(t15, i15, i16);
    }

    static o1 w(Object obj) {
        y yVar = (y) obj;
        o1 o1Var = yVar.unknownFields;
        if (o1Var != o1.c()) {
            return o1Var;
        }
        o1 o1VarK = o1.k();
        yVar.unknownFields = o1VarK;
        return o1VarK;
    }

    private static int w0(int i15) {
        return (i15 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[PHI: r6
      0x0077: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
     binds: [B:20:0x005e, B:223:0x04c9, B:220:0x04be, B:214:0x04a2, B:211:0x0490, B:208:0x0480, B:205:0x0472, B:202:0x0464, B:199:0x0459, B:196:0x044f, B:193:0x0441, B:190:0x0433, B:187:0x041f, B:163:0x032e, B:157:0x0310, B:151:0x02f2, B:145:0x02d4, B:139:0x02b6, B:133:0x0298, B:127:0x027a, B:121:0x025c, B:115:0x023e, B:109:0x0221, B:103:0x0204, B:97:0x01e7, B:91:0x01ca, B:89:0x01bb, B:84:0x01a9, B:79:0x0175, B:76:0x0169, B:73:0x0159, B:70:0x0149, B:67:0x0139, B:64:0x012d, B:61:0x0120, B:58:0x0113, B:52:0x00f5, B:49:0x00e2, B:46:0x00d1, B:43:0x00c2, B:40:0x00b3, B:37:0x00a7, B:34:0x009c, B:31:0x008d, B:28:0x007e, B:25:0x0076, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private int x(T t15) {
        int i15;
        int i16;
        int i17;
        int iD;
        boolean z15;
        int iF;
        int i18;
        int iT;
        int iV;
        Unsafe unsafe = f36246s;
        int i19 = 1048575;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < this.f36247a.length) {
            int iX0 = x0(i26);
            int iX = X(i26);
            int iW0 = w0(iX0);
            if (iW0 <= 17) {
                i15 = this.f36247a[i26 + 2];
                int i29 = i15 & i19;
                i16 = 1 << (i15 >>> 20);
                if (i29 != i25) {
                    i28 = unsafe.getInt(t15, i29);
                    i25 = i29;
                }
            } else {
                i15 = (!this.f36255i || iW0 < v.Z.b() || iW0 > v.B0.b()) ? 0 : this.f36247a[i26 + 2] & i19;
                i16 = 0;
            }
            long jY = Y(iX0);
            switch (iW0) {
                case 0:
                    if ((i28 & i16) != 0) {
                        i17 = k.i(iX, 0.0d);
                        i27 += i17;
                    }
                    break;
                case 1:
                    if ((i28 & i16) != 0) {
                        i17 = k.q(iX, 0.0f);
                        i27 += i17;
                    }
                    break;
                case 2:
                    if ((i28 & i16) != 0) {
                        i17 = k.x(iX, unsafe.getLong(t15, jY));
                        i27 += i17;
                    }
                    break;
                case 3:
                    if ((i28 & i16) != 0) {
                        i17 = k.W(iX, unsafe.getLong(t15, jY));
                        i27 += i17;
                    }
                    break;
                case 4:
                    if ((i28 & i16) != 0) {
                        i17 = k.v(iX, unsafe.getInt(t15, jY));
                        i27 += i17;
                    }
                    break;
                case 5:
                    if ((i28 & i16) != 0) {
                        i17 = k.o(iX, 0L);
                        i27 += i17;
                    }
                    break;
                case 6:
                    if ((i28 & i16) != 0) {
                        i17 = k.m(iX, 0);
                        i27 += i17;
                    }
                    break;
                case 7:
                    if ((i28 & i16) != 0) {
                        iD = k.d(iX, true);
                        i27 += iD;
                    }
                    break;
                case 8:
                    if ((i28 & i16) != 0) {
                        Object object = unsafe.getObject(t15, jY);
                        iD = object instanceof h ? k.g(iX, (h) object) : k.R(iX, (String) object);
                        i27 += iD;
                    }
                    break;
                case 9:
                    if ((i28 & i16) != 0) {
                        iD = i1.o(iX, unsafe.getObject(t15, jY), v(i26));
                        i27 += iD;
                    }
                    break;
                case 10:
                    if ((i28 & i16) != 0) {
                        iD = k.g(iX, (h) unsafe.getObject(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 11:
                    if ((i28 & i16) != 0) {
                        iD = k.U(iX, unsafe.getInt(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 12:
                    if ((i28 & i16) != 0) {
                        iD = k.k(iX, unsafe.getInt(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 13:
                    if ((i28 & i16) != 0) {
                        iD = k.J(iX, 0);
                        i27 += iD;
                    }
                    break;
                case 14:
                    if ((i28 & i16) != 0) {
                        iD = k.L(iX, 0L);
                        i27 += iD;
                    }
                    break;
                case 15:
                    if ((i28 & i16) != 0) {
                        iD = k.N(iX, unsafe.getInt(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 16:
                    if ((i28 & i16) != 0) {
                        iD = k.P(iX, unsafe.getLong(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 17:
                    if ((i28 & i16) != 0) {
                        iD = k.s(iX, (r0) unsafe.getObject(t15, jY), v(i26));
                        i27 += iD;
                    }
                    break;
                case 18:
                    iD = i1.h(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iD;
                    break;
                case 19:
                    z15 = false;
                    iF = i1.f(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 20:
                    z15 = false;
                    iF = i1.m(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 21:
                    z15 = false;
                    iF = i1.x(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 22:
                    z15 = false;
                    iF = i1.k(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 23:
                    z15 = false;
                    iF = i1.h(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 24:
                    z15 = false;
                    iF = i1.f(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 25:
                    z15 = false;
                    iF = i1.a(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 26:
                    iD = i1.u(iX, (List) unsafe.getObject(t15, jY));
                    i27 += iD;
                    break;
                case 27:
                    iD = i1.p(iX, (List) unsafe.getObject(t15, jY), v(i26));
                    i27 += iD;
                    break;
                case 28:
                    iD = i1.c(iX, (List) unsafe.getObject(t15, jY));
                    i27 += iD;
                    break;
                case 29:
                    iD = i1.v(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iD;
                    break;
                case 30:
                    z15 = false;
                    iF = i1.d(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case BERTags.DATE /* 31 */:
                    z15 = false;
                    iF = i1.f(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 32:
                    z15 = false;
                    iF = i1.h(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 33:
                    z15 = false;
                    iF = i1.q(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 34:
                    z15 = false;
                    iF = i1.s(iX, (List) unsafe.getObject(t15, jY), false);
                    i27 += iF;
                    break;
                case 35:
                    i18 = i1.i((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case 36:
                    i18 = i1.g((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i18 = i1.n((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i18 = i1.y((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i18 = i1.l((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case 40:
                    i18 = i1.i((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i18 = i1.g((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i18 = i1.b((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i18 = i1.w((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i18 = i1.e((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i18 = i1.g((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case 46:
                    i18 = i1.i((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case 47:
                    i18 = i1.r((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case 48:
                    i18 = i1.t((List) unsafe.getObject(t15, jY));
                    if (i18 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i15, i18);
                        }
                        iT = k.T(iX);
                        iV = k.V(i18);
                        i27 += iT + iV + i18;
                    }
                    break;
                case 49:
                    iD = i1.j(iX, (List) unsafe.getObject(t15, jY), v(i26));
                    i27 += iD;
                    break;
                case 50:
                    iD = this.f36263q.g(iX, unsafe.getObject(t15, jY), u(i26));
                    i27 += iD;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (J(t15, iX, i26)) {
                        iD = k.i(iX, 0.0d);
                        i27 += iD;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (J(t15, iX, i26)) {
                        iD = k.q(iX, 0.0f);
                        i27 += iD;
                    }
                    break;
                case 53:
                    if (J(t15, iX, i26)) {
                        iD = k.x(iX, d0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (J(t15, iX, i26)) {
                        iD = k.W(iX, d0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 55:
                    if (J(t15, iX, i26)) {
                        iD = k.v(iX, c0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 56:
                    if (J(t15, iX, i26)) {
                        iD = k.o(iX, 0L);
                        i27 += iD;
                    }
                    break;
                case 57:
                    if (J(t15, iX, i26)) {
                        iD = k.m(iX, 0);
                        i27 += iD;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (J(t15, iX, i26)) {
                        iD = k.d(iX, true);
                        i27 += iD;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (J(t15, iX, i26)) {
                        Object object2 = unsafe.getObject(t15, jY);
                        iD = object2 instanceof h ? k.g(iX, (h) object2) : k.R(iX, (String) object2);
                        i27 += iD;
                    }
                    break;
                case 60:
                    if (J(t15, iX, i26)) {
                        iD = i1.o(iX, unsafe.getObject(t15, jY), v(i26));
                        i27 += iD;
                    }
                    break;
                case 61:
                    if (J(t15, iX, i26)) {
                        iD = k.g(iX, (h) unsafe.getObject(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 62:
                    if (J(t15, iX, i26)) {
                        iD = k.U(iX, c0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 63:
                    if (J(t15, iX, i26)) {
                        iD = k.k(iX, c0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case 64:
                    if (J(t15, iX, i26)) {
                        iD = k.J(iX, 0);
                        i27 += iD;
                    }
                    break;
                case 65:
                    if (J(t15, iX, i26)) {
                        iD = k.L(iX, 0L);
                        i27 += iD;
                    }
                    break;
                case 66:
                    if (J(t15, iX, i26)) {
                        iD = k.N(iX, c0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (J(t15, iX, i26)) {
                        iD = k.P(iX, d0(t15, jY));
                        i27 += iD;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (J(t15, iX, i26)) {
                        iD = k.s(iX, (r0) unsafe.getObject(t15, jY), v(i26));
                        i27 += iD;
                    }
                    break;
                default:
                    break;
            }
            i26 += 3;
            i19 = 1048575;
        }
        int iZ = i27 + z(this.f36261o, t15);
        return this.f36252f ? iZ + this.f36262p.c(t15).l() : iZ;
    }

    private int x0(int i15) {
        return this.f36247a[i15 + 1];
    }

    private int y(T t15) {
        int i15;
        int i16;
        int iT;
        int iV;
        Unsafe unsafe = f36246s;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f36247a.length; i18 += 3) {
            int iX0 = x0(i18);
            int iW0 = w0(iX0);
            int iX = X(i18);
            long jY = Y(iX0);
            int i19 = (iW0 < v.Z.b() || iW0 > v.B0.b()) ? 0 : this.f36247a[i18 + 2] & 1048575;
            switch (iW0) {
                case 0:
                    if (C(t15, i18)) {
                        i15 = k.i(iX, 0.0d);
                        i17 += i15;
                    }
                    break;
                case 1:
                    if (C(t15, i18)) {
                        i15 = k.q(iX, 0.0f);
                        i17 += i15;
                    }
                    break;
                case 2:
                    if (C(t15, i18)) {
                        i15 = k.x(iX, r1.A(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 3:
                    if (C(t15, i18)) {
                        i15 = k.W(iX, r1.A(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 4:
                    if (C(t15, i18)) {
                        i15 = k.v(iX, r1.z(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 5:
                    if (C(t15, i18)) {
                        i15 = k.o(iX, 0L);
                        i17 += i15;
                    }
                    break;
                case 6:
                    if (C(t15, i18)) {
                        i15 = k.m(iX, 0);
                        i17 += i15;
                    }
                    break;
                case 7:
                    if (C(t15, i18)) {
                        i15 = k.d(iX, true);
                        i17 += i15;
                    }
                    break;
                case 8:
                    if (C(t15, i18)) {
                        Object objC = r1.C(t15, jY);
                        i15 = objC instanceof h ? k.g(iX, (h) objC) : k.R(iX, (String) objC);
                        i17 += i15;
                    }
                    break;
                case 9:
                    if (C(t15, i18)) {
                        i15 = i1.o(iX, r1.C(t15, jY), v(i18));
                        i17 += i15;
                    }
                    break;
                case 10:
                    if (C(t15, i18)) {
                        i15 = k.g(iX, (h) r1.C(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 11:
                    if (C(t15, i18)) {
                        i15 = k.U(iX, r1.z(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 12:
                    if (C(t15, i18)) {
                        i15 = k.k(iX, r1.z(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 13:
                    if (C(t15, i18)) {
                        i15 = k.J(iX, 0);
                        i17 += i15;
                    }
                    break;
                case 14:
                    if (C(t15, i18)) {
                        i15 = k.L(iX, 0L);
                        i17 += i15;
                    }
                    break;
                case 15:
                    if (C(t15, i18)) {
                        i15 = k.N(iX, r1.z(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 16:
                    if (C(t15, i18)) {
                        i15 = k.P(iX, r1.A(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 17:
                    if (C(t15, i18)) {
                        i15 = k.s(iX, (r0) r1.C(t15, jY), v(i18));
                        i17 += i15;
                    }
                    break;
                case 18:
                    i15 = i1.h(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 19:
                    i15 = i1.f(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 20:
                    i15 = i1.m(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 21:
                    i15 = i1.x(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 22:
                    i15 = i1.k(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 23:
                    i15 = i1.h(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 24:
                    i15 = i1.f(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 25:
                    i15 = i1.a(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 26:
                    i15 = i1.u(iX, L(t15, jY));
                    i17 += i15;
                    break;
                case 27:
                    i15 = i1.p(iX, L(t15, jY), v(i18));
                    i17 += i15;
                    break;
                case 28:
                    i15 = i1.c(iX, L(t15, jY));
                    i17 += i15;
                    break;
                case 29:
                    i15 = i1.v(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 30:
                    i15 = i1.d(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case BERTags.DATE /* 31 */:
                    i15 = i1.f(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 32:
                    i15 = i1.h(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 33:
                    i15 = i1.q(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 34:
                    i15 = i1.s(iX, L(t15, jY), false);
                    i17 += i15;
                    break;
                case 35:
                    i16 = i1.i((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case 36:
                    i16 = i1.g((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i16 = i1.n((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i16 = i1.y((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i16 = i1.l((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case 40:
                    i16 = i1.i((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i16 = i1.g((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i16 = i1.b((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i16 = i1.w((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i16 = i1.e((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i16 = i1.g((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case 46:
                    i16 = i1.i((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case 47:
                    i16 = i1.r((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case 48:
                    i16 = i1.t((List) unsafe.getObject(t15, jY));
                    if (i16 > 0) {
                        if (this.f36255i) {
                            unsafe.putInt(t15, i19, i16);
                        }
                        iT = k.T(iX);
                        iV = k.V(i16);
                        i15 = iT + iV + i16;
                        i17 += i15;
                    }
                    break;
                case 49:
                    i15 = i1.j(iX, L(t15, jY), v(i18));
                    i17 += i15;
                    break;
                case 50:
                    i15 = this.f36263q.g(iX, r1.C(t15, jY), u(i18));
                    i17 += i15;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (J(t15, iX, i18)) {
                        i15 = k.i(iX, 0.0d);
                        i17 += i15;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (J(t15, iX, i18)) {
                        i15 = k.q(iX, 0.0f);
                        i17 += i15;
                    }
                    break;
                case 53:
                    if (J(t15, iX, i18)) {
                        i15 = k.x(iX, d0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (J(t15, iX, i18)) {
                        i15 = k.W(iX, d0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 55:
                    if (J(t15, iX, i18)) {
                        i15 = k.v(iX, c0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 56:
                    if (J(t15, iX, i18)) {
                        i15 = k.o(iX, 0L);
                        i17 += i15;
                    }
                    break;
                case 57:
                    if (J(t15, iX, i18)) {
                        i15 = k.m(iX, 0);
                        i17 += i15;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (J(t15, iX, i18)) {
                        i15 = k.d(iX, true);
                        i17 += i15;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (J(t15, iX, i18)) {
                        Object objC2 = r1.C(t15, jY);
                        i15 = objC2 instanceof h ? k.g(iX, (h) objC2) : k.R(iX, (String) objC2);
                        i17 += i15;
                    }
                    break;
                case 60:
                    if (J(t15, iX, i18)) {
                        i15 = i1.o(iX, r1.C(t15, jY), v(i18));
                        i17 += i15;
                    }
                    break;
                case 61:
                    if (J(t15, iX, i18)) {
                        i15 = k.g(iX, (h) r1.C(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 62:
                    if (J(t15, iX, i18)) {
                        i15 = k.U(iX, c0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 63:
                    if (J(t15, iX, i18)) {
                        i15 = k.k(iX, c0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case 64:
                    if (J(t15, iX, i18)) {
                        i15 = k.J(iX, 0);
                        i17 += i15;
                    }
                    break;
                case 65:
                    if (J(t15, iX, i18)) {
                        i15 = k.L(iX, 0L);
                        i17 += i15;
                    }
                    break;
                case 66:
                    if (J(t15, iX, i18)) {
                        i15 = k.N(iX, c0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (J(t15, iX, i18)) {
                        i15 = k.P(iX, d0(t15, jY));
                        i17 += i15;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (J(t15, iX, i18)) {
                        i15 = k.s(iX, (r0) r1.C(t15, jY), v(i18));
                        i17 += i15;
                    }
                    break;
            }
        }
        return i17 + z(this.f36261o, t15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void y0(T t15, u1 u1Var) {
        Iterator itS;
        Map.Entry<?, ?> entry;
        int i15;
        if (this.f36252f) {
            u<T> uVarC = this.f36262p.c(t15);
            if (uVarC.m()) {
                itS = null;
                entry = null;
            } else {
                itS = uVarC.s();
                entry = (Map.Entry) itS.next();
            }
        } else {
            itS = null;
            entry = null;
        }
        int length = this.f36247a.length;
        Unsafe unsafe = f36246s;
        int i16 = 1048575;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18 += 3) {
            int iX0 = x0(i18);
            int iX = X(i18);
            int iW0 = w0(iX0);
            if (iW0 <= 17) {
                int i19 = this.f36247a[i18 + 2];
                int i25 = i19 & 1048575;
                if (i25 != i16) {
                    i17 = unsafe.getInt(t15, i25);
                    i16 = i25;
                }
                i15 = 1 << (i19 >>> 20);
            } else {
                i15 = 0;
            }
            while (entry != null && this.f36262p.a(entry) <= iX) {
                this.f36262p.j(u1Var, entry);
                entry = itS.hasNext() ? (Map.Entry) itS.next() : null;
            }
            long jY = Y(iX0);
            switch (iW0) {
                case 0:
                    if ((i15 & i17) != 0) {
                        u1Var.p(iX, o(t15, jY));
                        continue;
                    }
                    break;
                case 1:
                    if ((i15 & i17) != 0) {
                        u1Var.B(iX, s(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    if ((i15 & i17) != 0) {
                        u1Var.u(iX, unsafe.getLong(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    if ((i15 & i17) != 0) {
                        u1Var.f(iX, unsafe.getLong(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if ((i15 & i17) != 0) {
                        u1Var.h(iX, unsafe.getInt(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    if ((i15 & i17) != 0) {
                        u1Var.s(iX, unsafe.getLong(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    if ((i15 & i17) != 0) {
                        u1Var.c(iX, unsafe.getInt(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    if ((i15 & i17) != 0) {
                        u1Var.v(iX, l(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    if ((i15 & i17) != 0) {
                        C0(iX, unsafe.getObject(t15, jY), u1Var);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    if ((i15 & i17) != 0) {
                        u1Var.N(iX, unsafe.getObject(t15, jY), v(i18));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    if ((i15 & i17) != 0) {
                        u1Var.M(iX, (h) unsafe.getObject(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    if ((i15 & i17) != 0) {
                        u1Var.o(iX, unsafe.getInt(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    if ((i15 & i17) != 0) {
                        u1Var.E(iX, unsafe.getInt(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    if ((i15 & i17) != 0) {
                        u1Var.w(iX, unsafe.getInt(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    if ((i15 & i17) != 0) {
                        u1Var.i(iX, unsafe.getLong(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    if ((i15 & i17) != 0) {
                        u1Var.H(iX, unsafe.getInt(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    if ((i15 & i17) != 0) {
                        u1Var.m(iX, unsafe.getLong(t15, jY));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    if ((i15 & i17) != 0) {
                        u1Var.K(iX, unsafe.getObject(t15, jY), v(i18));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    i1.P(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 19:
                    i1.T(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 20:
                    i1.W(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 21:
                    i1.e0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 22:
                    i1.V(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 23:
                    i1.S(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 24:
                    i1.R(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 25:
                    i1.N(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 26:
                    i1.c0(X(i18), (List) unsafe.getObject(t15, jY), u1Var);
                    break;
                case 27:
                    i1.X(X(i18), (List) unsafe.getObject(t15, jY), u1Var, v(i18));
                    break;
                case 28:
                    i1.O(X(i18), (List) unsafe.getObject(t15, jY), u1Var);
                    break;
                case 29:
                    i1.d0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 30:
                    i1.Q(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case BERTags.DATE /* 31 */:
                    i1.Y(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 32:
                    i1.Z(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 33:
                    i1.a0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 34:
                    i1.b0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, false);
                    continue;
                    break;
                case 35:
                    i1.P(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case 36:
                    i1.T(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i1.W(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i1.e0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i1.V(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case 40:
                    i1.S(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i1.R(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i1.N(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i1.d0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i1.Q(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i1.Y(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case 46:
                    i1.Z(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case 47:
                    i1.a0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case 48:
                    i1.b0(X(i18), (List) unsafe.getObject(t15, jY), u1Var, true);
                    break;
                case 49:
                    i1.U(X(i18), (List) unsafe.getObject(t15, jY), u1Var, v(i18));
                    break;
                case 50:
                    B0(u1Var, iX, unsafe.getObject(t15, jY), i18);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (J(t15, iX, i18)) {
                        u1Var.p(iX, a0(t15, jY));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (J(t15, iX, i18)) {
                        u1Var.B(iX, b0(t15, jY));
                    }
                    break;
                case 53:
                    if (J(t15, iX, i18)) {
                        u1Var.u(iX, d0(t15, jY));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (J(t15, iX, i18)) {
                        u1Var.f(iX, d0(t15, jY));
                    }
                    break;
                case 55:
                    if (J(t15, iX, i18)) {
                        u1Var.h(iX, c0(t15, jY));
                    }
                    break;
                case 56:
                    if (J(t15, iX, i18)) {
                        u1Var.s(iX, d0(t15, jY));
                    }
                    break;
                case 57:
                    if (J(t15, iX, i18)) {
                        u1Var.c(iX, c0(t15, jY));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (J(t15, iX, i18)) {
                        u1Var.v(iX, Z(t15, jY));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (J(t15, iX, i18)) {
                        C0(iX, unsafe.getObject(t15, jY), u1Var);
                    }
                    break;
                case 60:
                    if (J(t15, iX, i18)) {
                        u1Var.N(iX, unsafe.getObject(t15, jY), v(i18));
                    }
                    break;
                case 61:
                    if (J(t15, iX, i18)) {
                        u1Var.M(iX, (h) unsafe.getObject(t15, jY));
                    }
                    break;
                case 62:
                    if (J(t15, iX, i18)) {
                        u1Var.o(iX, c0(t15, jY));
                    }
                    break;
                case 63:
                    if (J(t15, iX, i18)) {
                        u1Var.E(iX, c0(t15, jY));
                    }
                    break;
                case 64:
                    if (J(t15, iX, i18)) {
                        u1Var.w(iX, c0(t15, jY));
                    }
                    break;
                case 65:
                    if (J(t15, iX, i18)) {
                        u1Var.i(iX, d0(t15, jY));
                    }
                    break;
                case 66:
                    if (J(t15, iX, i18)) {
                        u1Var.H(iX, c0(t15, jY));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (J(t15, iX, i18)) {
                        u1Var.m(iX, d0(t15, jY));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (J(t15, iX, i18)) {
                        u1Var.K(iX, unsafe.getObject(t15, jY), v(i18));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f36262p.j(u1Var, entry);
            entry = itS.hasNext() ? (Map.Entry) itS.next() : null;
        }
        D0(this.f36261o, t15, u1Var);
    }

    private <UT, UB> int z(n1<UT, UB> n1Var, T t15) {
        return n1Var.h(n1Var.g(t15));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void z0(T t15, u1 u1Var) {
        Iterator itS;
        Map.Entry<?, ?> entry;
        if (this.f36252f) {
            u<T> uVarC = this.f36262p.c(t15);
            if (uVarC.m()) {
                itS = null;
                entry = null;
            } else {
                itS = uVarC.s();
                entry = (Map.Entry) itS.next();
            }
        } else {
            itS = null;
            entry = null;
        }
        int length = this.f36247a.length;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iX0 = x0(i15);
            int iX = X(i15);
            while (entry != null && this.f36262p.a(entry) <= iX) {
                this.f36262p.j(u1Var, entry);
                entry = itS.hasNext() ? (Map.Entry) itS.next() : null;
            }
            switch (w0(iX0)) {
                case 0:
                    if (C(t15, i15)) {
                        u1Var.p(iX, o(t15, Y(iX0)));
                    }
                    break;
                case 1:
                    if (C(t15, i15)) {
                        u1Var.B(iX, s(t15, Y(iX0)));
                    }
                    break;
                case 2:
                    if (C(t15, i15)) {
                        u1Var.u(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 3:
                    if (C(t15, i15)) {
                        u1Var.f(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 4:
                    if (C(t15, i15)) {
                        u1Var.h(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 5:
                    if (C(t15, i15)) {
                        u1Var.s(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 6:
                    if (C(t15, i15)) {
                        u1Var.c(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 7:
                    if (C(t15, i15)) {
                        u1Var.v(iX, l(t15, Y(iX0)));
                    }
                    break;
                case 8:
                    if (C(t15, i15)) {
                        C0(iX, r1.C(t15, Y(iX0)), u1Var);
                    }
                    break;
                case 9:
                    if (C(t15, i15)) {
                        u1Var.N(iX, r1.C(t15, Y(iX0)), v(i15));
                    }
                    break;
                case 10:
                    if (C(t15, i15)) {
                        u1Var.M(iX, (h) r1.C(t15, Y(iX0)));
                    }
                    break;
                case 11:
                    if (C(t15, i15)) {
                        u1Var.o(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 12:
                    if (C(t15, i15)) {
                        u1Var.E(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 13:
                    if (C(t15, i15)) {
                        u1Var.w(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 14:
                    if (C(t15, i15)) {
                        u1Var.i(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 15:
                    if (C(t15, i15)) {
                        u1Var.H(iX, A(t15, Y(iX0)));
                    }
                    break;
                case 16:
                    if (C(t15, i15)) {
                        u1Var.m(iX, M(t15, Y(iX0)));
                    }
                    break;
                case 17:
                    if (C(t15, i15)) {
                        u1Var.K(iX, r1.C(t15, Y(iX0)), v(i15));
                    }
                    break;
                case 18:
                    i1.P(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 19:
                    i1.T(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 20:
                    i1.W(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 21:
                    i1.e0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 22:
                    i1.V(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 23:
                    i1.S(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 24:
                    i1.R(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 25:
                    i1.N(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 26:
                    i1.c0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var);
                    break;
                case 27:
                    i1.X(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, v(i15));
                    break;
                case 28:
                    i1.O(X(i15), (List) r1.C(t15, Y(iX0)), u1Var);
                    break;
                case 29:
                    i1.d0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 30:
                    i1.Q(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    i1.Y(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 32:
                    i1.Z(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 33:
                    i1.a0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 34:
                    i1.b0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, false);
                    break;
                case 35:
                    i1.P(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 36:
                    i1.T(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i1.W(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i1.e0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i1.V(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 40:
                    i1.S(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i1.R(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i1.N(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i1.d0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i1.Q(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i1.Y(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 46:
                    i1.Z(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 47:
                    i1.a0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 48:
                    i1.b0(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, true);
                    break;
                case 49:
                    i1.U(X(i15), (List) r1.C(t15, Y(iX0)), u1Var, v(i15));
                    break;
                case 50:
                    B0(u1Var, iX, r1.C(t15, Y(iX0)), i15);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (J(t15, iX, i15)) {
                        u1Var.p(iX, a0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (J(t15, iX, i15)) {
                        u1Var.B(iX, b0(t15, Y(iX0)));
                    }
                    break;
                case 53:
                    if (J(t15, iX, i15)) {
                        u1Var.u(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (J(t15, iX, i15)) {
                        u1Var.f(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case 55:
                    if (J(t15, iX, i15)) {
                        u1Var.h(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 56:
                    if (J(t15, iX, i15)) {
                        u1Var.s(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case 57:
                    if (J(t15, iX, i15)) {
                        u1Var.c(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (J(t15, iX, i15)) {
                        u1Var.v(iX, Z(t15, Y(iX0)));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (J(t15, iX, i15)) {
                        C0(iX, r1.C(t15, Y(iX0)), u1Var);
                    }
                    break;
                case 60:
                    if (J(t15, iX, i15)) {
                        u1Var.N(iX, r1.C(t15, Y(iX0)), v(i15));
                    }
                    break;
                case 61:
                    if (J(t15, iX, i15)) {
                        u1Var.M(iX, (h) r1.C(t15, Y(iX0)));
                    }
                    break;
                case 62:
                    if (J(t15, iX, i15)) {
                        u1Var.o(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 63:
                    if (J(t15, iX, i15)) {
                        u1Var.E(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 64:
                    if (J(t15, iX, i15)) {
                        u1Var.w(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case 65:
                    if (J(t15, iX, i15)) {
                        u1Var.i(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case 66:
                    if (J(t15, iX, i15)) {
                        u1Var.H(iX, c0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (J(t15, iX, i15)) {
                        u1Var.m(iX, d0(t15, Y(iX0)));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (J(t15, iX, i15)) {
                        u1Var.K(iX, r1.C(t15, Y(iX0)), v(i15));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f36262p.j(u1Var, entry);
            entry = itS.hasNext() ? (Map.Entry) itS.next() : null;
        }
        D0(this.f36261o, t15, u1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t15, T t16) {
        m(t15);
        t16.getClass();
        for (int i15 = 0; i15 < this.f36247a.length; i15 += 3) {
            R(t15, t16, i15);
        }
        i1.G(this.f36261o, t15, t16);
        if (this.f36252f) {
            i1.E(this.f36262p, t15, t16);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int b(T t15) {
        int i15;
        int iF;
        int length = this.f36247a.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 3) {
            int iX0 = x0(i17);
            int iX = X(i17);
            long jY = Y(iX0);
            int iHashCode = 37;
            switch (w0(iX0)) {
                case 0:
                    i15 = i16 * 53;
                    iF = a0.f(Double.doubleToLongBits(r1.x(t15, jY)));
                    i16 = i15 + iF;
                    break;
                case 1:
                    i15 = i16 * 53;
                    iF = Float.floatToIntBits(r1.y(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 2:
                    i15 = i16 * 53;
                    iF = a0.f(r1.A(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 3:
                    i15 = i16 * 53;
                    iF = a0.f(r1.A(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 4:
                    i15 = i16 * 53;
                    iF = r1.z(t15, jY);
                    i16 = i15 + iF;
                    break;
                case 5:
                    i15 = i16 * 53;
                    iF = a0.f(r1.A(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 6:
                    i15 = i16 * 53;
                    iF = r1.z(t15, jY);
                    i16 = i15 + iF;
                    break;
                case 7:
                    i15 = i16 * 53;
                    iF = a0.c(r1.r(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 8:
                    i15 = i16 * 53;
                    iF = ((String) r1.C(t15, jY)).hashCode();
                    i16 = i15 + iF;
                    break;
                case 9:
                    Object objC = r1.C(t15, jY);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
                    i15 = i16 * 53;
                    iF = r1.C(t15, jY).hashCode();
                    i16 = i15 + iF;
                    break;
                case 11:
                    i15 = i16 * 53;
                    iF = r1.z(t15, jY);
                    i16 = i15 + iF;
                    break;
                case 12:
                    i15 = i16 * 53;
                    iF = r1.z(t15, jY);
                    i16 = i15 + iF;
                    break;
                case 13:
                    i15 = i16 * 53;
                    iF = r1.z(t15, jY);
                    i16 = i15 + iF;
                    break;
                case 14:
                    i15 = i16 * 53;
                    iF = a0.f(r1.A(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 15:
                    i15 = i16 * 53;
                    iF = r1.z(t15, jY);
                    i16 = i15 + iF;
                    break;
                case 16:
                    i15 = i16 * 53;
                    iF = a0.f(r1.A(t15, jY));
                    i16 = i15 + iF;
                    break;
                case 17:
                    Object objC2 = r1.C(t15, jY);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
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
                    iF = r1.C(t15, jY).hashCode();
                    i16 = i15 + iF;
                    break;
                case 50:
                    i15 = i16 * 53;
                    iF = r1.C(t15, jY).hashCode();
                    i16 = i15 + iF;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.f(Double.doubleToLongBits(a0(t15, jY)));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = Float.floatToIntBits(b0(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case 53:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.f(d0(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.f(d0(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case 55:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = c0(t15, jY);
                        i16 = i15 + iF;
                    }
                    break;
                case 56:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.f(d0(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case 57:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = c0(t15, jY);
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.c(Z(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = ((String) r1.C(t15, jY)).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
                case 60:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = r1.C(t15, jY).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
                case 61:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = r1.C(t15, jY).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
                case 62:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = c0(t15, jY);
                        i16 = i15 + iF;
                    }
                    break;
                case 63:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = c0(t15, jY);
                        i16 = i15 + iF;
                    }
                    break;
                case 64:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = c0(t15, jY);
                        i16 = i15 + iF;
                    }
                    break;
                case 65:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.f(d0(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case 66:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = c0(t15, jY);
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = a0.f(d0(t15, jY));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (J(t15, iX, i17)) {
                        i15 = i16 * 53;
                        iF = r1.C(t15, jY).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i16 * 53) + this.f36261o.g(t15).hashCode();
        return this.f36252f ? (iHashCode2 * 53) + this.f36262p.c(t15).hashCode() : iHashCode2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean c(T t15, T t16) {
        int length = this.f36247a.length;
        for (int i15 = 0; i15 < length; i15 += 3) {
            if (!p(t15, t16, i15)) {
                return false;
            }
        }
        if (!this.f36261o.g(t15).equals(this.f36261o.g(t16))) {
            return false;
        }
        if (this.f36252f) {
            return this.f36262p.c(t15).equals(this.f36262p.c(t16));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T d() {
        return (T) this.f36259m.a(this.f36251e);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void e(T t15) {
        if (H(t15)) {
            if (t15 instanceof y) {
                y yVar = (y) t15;
                yVar.q();
                yVar.p();
                yVar.H();
            }
            int length = this.f36247a.length;
            for (int i15 = 0; i15 < length; i15 += 3) {
                int iX0 = x0(i15);
                long jY = Y(iX0);
                int iW0 = w0(iX0);
                if (iW0 != 9) {
                    switch (iW0) {
                        case 17:
                            if (C(t15, i15)) {
                                v(i15).e(f36246s.getObject(t15, jY));
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
                            this.f36260n.c(t15, jY);
                            break;
                        case 50:
                            Unsafe unsafe = f36246s;
                            Object object = unsafe.getObject(t15, jY);
                            if (object != null) {
                                unsafe.putObject(t15, jY, this.f36263q.f(object));
                            }
                            break;
                    }
                } else if (C(t15, i15)) {
                    v(i15).e(f36246s.getObject(t15, jY));
                }
            }
            this.f36261o.j(t15);
            if (this.f36252f) {
                this.f36262p.f(t15);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean f(T t15) {
        int i15;
        int i16;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f36257k) {
            int i25 = this.f36256j[i18];
            int iX = X(i25);
            int iX0 = x0(i25);
            int i26 = this.f36247a[i25 + 2];
            int i27 = i26 & 1048575;
            int i28 = 1 << (i26 >>> 20);
            if (i27 != i17) {
                if (i27 != 1048575) {
                    i19 = f36246s.getInt(t15, i27);
                }
                i16 = i19;
                i15 = i27;
            } else {
                i15 = i17;
                i16 = i19;
            }
            T t16 = t15;
            if (K(iX0) && !D(t16, i25, i15, i16, i28)) {
                return false;
            }
            int iW0 = w0(iX0);
            if (iW0 == 9 || iW0 == 17) {
                if (D(t16, i25, i15, i16, i28) && !E(t16, iX0, v(i25))) {
                    return false;
                }
            } else if (iW0 == 27) {
                if (!F(t16, iX0, i25)) {
                    return false;
                }
            } else if (iW0 == 60 || iW0 == 68) {
                if (J(t16, iX, i25) && !E(t16, iX0, v(i25))) {
                    return false;
                }
            } else if (iW0 != 49) {
                if (iW0 == 50 && !G(t16, iX0, i25)) {
                    return false;
                }
            } else if (!F(t16, iX0, i25)) {
                return false;
            }
            i18++;
            t15 = t16;
            i17 = i15;
            i19 = i16;
        }
        return !this.f36252f || this.f36262p.c(t15).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int g(T t15) {
        return this.f36254h ? y(t15) : x(t15);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12021. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    int g0(T r26, byte[] r27, int r28, int r29, int r30, com.google.crypto.tink.shaded.protobuf.e.b r31) {
        /*
            Method dump skipped, instruction units count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.g0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void h(T t15, byte[] bArr, int i15, int i16, e.b bVar) throws b0 {
        if (this.f36254h) {
            h0(t15, bArr, i15, i16, bVar);
        } else {
            g0(t15, bArr, i15, i16, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t15, f1 f1Var, p pVar) {
        pVar.getClass();
        m(t15);
        N(this.f36261o, this.f36262p, t15, f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t15, u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            A0(t15, u1Var);
        } else if (this.f36254h) {
            z0(t15, u1Var);
        } else {
            y0(t15, u1Var);
        }
    }
}
