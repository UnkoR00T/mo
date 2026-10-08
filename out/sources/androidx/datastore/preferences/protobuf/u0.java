package androidx.datastore.preferences.protobuf;

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
final class u0<T> implements g1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f12181r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f12182s = q1.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f12183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f12184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f12187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b1 f12190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f12192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f12193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w0 f12195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f0 f12196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n1<?, ?> f12197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p<?> f12198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0 f12199q;

    private u0(int[] iArr, Object[] objArr, int i15, int i16, r0 r0Var, b1 b1Var, boolean z15, int[] iArr2, int i17, int i18, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        this.f12183a = iArr;
        this.f12184b = objArr;
        this.f12185c = i15;
        this.f12186d = i16;
        this.f12189g = r0Var instanceof x;
        this.f12190h = b1Var;
        this.f12188f = pVar != null && pVar.e(r0Var);
        this.f12191i = z15;
        this.f12192j = iArr2;
        this.f12193k = i17;
        this.f12194l = i18;
        this.f12195m = w0Var;
        this.f12196n = f0Var;
        this.f12197o = n1Var;
        this.f12198p = pVar;
        this.f12187e = r0Var;
        this.f12199q = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean A(Object obj, int i15, int i16) {
        List list = (List) q1.z(obj, S(i15));
        if (list.isEmpty()) {
            return true;
        }
        g1 g1VarT = t(i16);
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (!g1VarT.f(list.get(i17))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.g1] */
    private boolean B(T t15, int i15, int i16) {
        Map<?, ?> mapE = this.f12199q.e(q1.z(t15, S(i15)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f12199q.b(s(i16)).f12039c.b() != s1.c.MESSAGE) {
            return true;
        }
        ?? C = 0;
        for (Object obj : mapE.values()) {
            if (C == 0) {
                C = C;
                C = c1.a().c(obj.getClass());
            }
            C = C;
            if (!C.f(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).H();
        }
        return true;
    }

    private boolean D(T t15, T t16, int i15) {
        long jZ = Z(i15) & 1048575;
        return q1.w(t15, jZ) == q1.w(t16, jZ);
    }

    private boolean E(T t15, int i15, int i16) {
        return q1.w(t15, (long) (Z(i16) & 1048575)) == i15;
    }

    private static boolean F(int i15) {
        return (i15 & 268435456) != 0;
    }

    private static <T> long G(T t15, long j15) {
        return q1.x(t15, j15);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.t.b<ET>> void H(androidx.datastore.preferences.protobuf.n1<UT, UB> r18, androidx.datastore.preferences.protobuf.p<ET> r19, T r20, androidx.datastore.preferences.protobuf.f1 r21, androidx.datastore.preferences.protobuf.o r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.H(androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.o):void");
    }

    private final <K, V> void I(Object obj, int i15, Object obj2, o oVar, f1 f1Var) {
        long jS = S(l0(i15));
        Object objZ = q1.z(obj, jS);
        if (objZ == null) {
            objZ = this.f12199q.d(obj2);
            q1.O(obj, jS, objZ);
        } else if (this.f12199q.h(objZ)) {
            Object objD = this.f12199q.d(obj2);
            this.f12199q.a(objD, objZ);
            q1.O(obj, jS, objD);
            objZ = objD;
        }
        f1Var.M(this.f12199q.c(objZ), this.f12199q.b(obj2), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J(T t15, T t16, int i15) {
        if (x(t16, i15)) {
            long jS = S(l0(i15));
            Unsafe unsafe = f12182s;
            Object object = unsafe.getObject(t16, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i15) + " is present but null: " + t16);
            }
            g1 g1VarT = t(i15);
            if (!x(t15, i15)) {
                if (C(object)) {
                    Object objD = g1VarT.d();
                    g1VarT.a(objD, object);
                    unsafe.putObject(t15, jS, objD);
                } else {
                    unsafe.putObject(t15, jS, object);
                }
                f0(t15, i15);
                return;
            }
            Object object2 = unsafe.getObject(t15, jS);
            if (!C(object2)) {
                Object objD2 = g1VarT.d();
                g1VarT.a(objD2, object2);
                unsafe.putObject(t15, jS, objD2);
                object2 = objD2;
            }
            g1VarT.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(T t15, T t16, int i15) {
        int iR = R(i15);
        if (E(t16, iR, i15)) {
            long jS = S(l0(i15));
            Unsafe unsafe = f12182s;
            Object object = unsafe.getObject(t16, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i15) + " is present but null: " + t16);
            }
            g1 g1VarT = t(i15);
            if (!E(t15, iR, i15)) {
                if (C(object)) {
                    Object objD = g1VarT.d();
                    g1VarT.a(objD, object);
                    unsafe.putObject(t15, jS, objD);
                } else {
                    unsafe.putObject(t15, jS, object);
                }
                g0(t15, iR, i15);
                return;
            }
            Object object2 = unsafe.getObject(t15, jS);
            if (!C(object2)) {
                Object objD2 = g1VarT.d();
                g1VarT.a(objD2, object2);
                unsafe.putObject(t15, jS, objD2);
                object2 = objD2;
            }
            g1VarT.a(object2, object);
        }
    }

    private void L(T t15, T t16, int i15) {
        int iL0 = l0(i15);
        long jS = S(iL0);
        int iR = R(i15);
        switch (k0(iL0)) {
            case 0:
                if (x(t16, i15)) {
                    q1.K(t15, jS, q1.u(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 1:
                if (x(t16, i15)) {
                    q1.L(t15, jS, q1.v(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 2:
                if (x(t16, i15)) {
                    q1.N(t15, jS, q1.x(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 3:
                if (x(t16, i15)) {
                    q1.N(t15, jS, q1.x(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 4:
                if (x(t16, i15)) {
                    q1.M(t15, jS, q1.w(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 5:
                if (x(t16, i15)) {
                    q1.N(t15, jS, q1.x(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 6:
                if (x(t16, i15)) {
                    q1.M(t15, jS, q1.w(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 7:
                if (x(t16, i15)) {
                    q1.E(t15, jS, q1.p(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 8:
                if (x(t16, i15)) {
                    q1.O(t15, jS, q1.z(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 9:
                J(t15, t16, i15);
                break;
            case 10:
                if (x(t16, i15)) {
                    q1.O(t15, jS, q1.z(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 11:
                if (x(t16, i15)) {
                    q1.M(t15, jS, q1.w(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 12:
                if (x(t16, i15)) {
                    q1.M(t15, jS, q1.w(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 13:
                if (x(t16, i15)) {
                    q1.M(t15, jS, q1.w(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 14:
                if (x(t16, i15)) {
                    q1.N(t15, jS, q1.x(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 15:
                if (x(t16, i15)) {
                    q1.M(t15, jS, q1.w(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 16:
                if (x(t16, i15)) {
                    q1.N(t15, jS, q1.x(t16, jS));
                    f0(t15, i15);
                }
                break;
            case 17:
                J(t15, t16, i15);
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
                this.f12196n.b(t15, t16, jS);
                break;
            case 50:
                i1.F(this.f12199q, t15, t16, jS);
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
                if (E(t16, iR, i15)) {
                    q1.O(t15, jS, q1.z(t16, jS));
                    g0(t15, iR, i15);
                }
                break;
            case 60:
                K(t15, t16, i15);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (E(t16, iR, i15)) {
                    q1.O(t15, jS, q1.z(t16, jS));
                    g0(t15, iR, i15);
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                K(t15, t16, i15);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object M(T t15, int i15) {
        g1 g1VarT = t(i15);
        long jS = S(l0(i15));
        if (!x(t15, i15)) {
            return g1VarT.d();
        }
        Object object = f12182s.getObject(t15, jS);
        if (C(object)) {
            return object;
        }
        Object objD = g1VarT.d();
        if (object != null) {
            g1VarT.a(objD, object);
        }
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object N(T t15, int i15, int i16) {
        g1 g1VarT = t(i16);
        if (!E(t15, i15, i16)) {
            return g1VarT.d();
        }
        Object object = f12182s.getObject(t15, S(l0(i16)));
        if (C(object)) {
            return object;
        }
        Object objD = g1VarT.d();
        if (object != null) {
            g1VarT.a(objD, object);
        }
        return objD;
    }

    static <T> u0<T> O(Class<T> cls, p0 p0Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        return p0Var instanceof e1 ? Q((e1) p0Var, w0Var, f0Var, n1Var, pVar, m0Var) : P((k1) p0Var, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    static <T> u0<T> P(k1 k1Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        s[] sVarArrE = k1Var.e();
        if (sVarArrE.length != 0) {
            s sVar = sVarArrE[0];
            throw null;
        }
        int length = sVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (sVarArrE.length > 0) {
            s sVar2 = sVarArrE[0];
            throw null;
        }
        int[] iArrD = k1Var.d();
        if (iArrD == null) {
            iArrD = f12181r;
        }
        if (sVarArrE.length > 0) {
            s sVar3 = sVarArrE[0];
            throw null;
        }
        int[] iArr2 = f12181r;
        int[] iArr3 = f12181r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new u0<>(iArr, objArr, 0, 0, k1Var.b(), k1Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static <T> u0<T> Q(e1 e1Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        int i15;
        int iCharAt;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        int i25;
        int i26;
        int i27;
        char cCharAt;
        int i28;
        char cCharAt2;
        int i29;
        char cCharAt3;
        int i35;
        char cCharAt4;
        int i36;
        char cCharAt5;
        int i37;
        char cCharAt6;
        int i38;
        char cCharAt7;
        int i39;
        char cCharAt8;
        int i45;
        int i46;
        int i47;
        int i48;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i49;
        int i55;
        int iObjectFieldOffset3;
        int i56;
        Field fieldE0;
        char cCharAt9;
        int i57;
        int i58;
        int i59;
        Object obj;
        Field fieldE1;
        int i65;
        Object obj2;
        Field fieldE2;
        int i66;
        char cCharAt10;
        int i67;
        char cCharAt11;
        int i68;
        char cCharAt12;
        int i69;
        char cCharAt13;
        String strE = e1Var.e();
        int length = strE.length();
        char c15 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i75 = 1;
            while (true) {
                i15 = i75 + 1;
                if (strE.charAt(i75) < 55296) {
                    break;
                }
                i75 = i15;
            }
        } else {
            i15 = 1;
        }
        int i76 = i15 + 1;
        int iCharAt2 = strE.charAt(i15);
        if (iCharAt2 >= 55296) {
            int i77 = iCharAt2 & 8191;
            int i78 = 13;
            while (true) {
                i69 = i76 + 1;
                cCharAt13 = strE.charAt(i76);
                if (cCharAt13 < 55296) {
                    break;
                }
                i77 |= (cCharAt13 & 8191) << i78;
                i78 += 13;
                i76 = i69;
            }
            iCharAt2 = i77 | (cCharAt13 << i78);
            i76 = i69;
        }
        if (iCharAt2 == 0) {
            i18 = 0;
            iCharAt = 0;
            i17 = 0;
            i26 = 0;
            i16 = 0;
            i25 = 0;
            iArr = f12181r;
            i19 = 0;
        } else {
            int i79 = i76 + 1;
            int iCharAt3 = strE.charAt(i76);
            if (iCharAt3 >= 55296) {
                int i85 = iCharAt3 & 8191;
                int i86 = 13;
                while (true) {
                    i39 = i79 + 1;
                    cCharAt8 = strE.charAt(i79);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt8 & 8191) << i86;
                    i86 += 13;
                    i79 = i39;
                }
                iCharAt3 = i85 | (cCharAt8 << i86);
                i79 = i39;
            }
            int i87 = i79 + 1;
            int iCharAt4 = strE.charAt(i79);
            if (iCharAt4 >= 55296) {
                int i88 = iCharAt4 & 8191;
                int i89 = 13;
                while (true) {
                    i38 = i87 + 1;
                    cCharAt7 = strE.charAt(i87);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i88 |= (cCharAt7 & 8191) << i89;
                    i89 += 13;
                    i87 = i38;
                }
                iCharAt4 = i88 | (cCharAt7 << i89);
                i87 = i38;
            }
            int i95 = i87 + 1;
            int iCharAt5 = strE.charAt(i87);
            if (iCharAt5 >= 55296) {
                int i96 = iCharAt5 & 8191;
                int i97 = 13;
                while (true) {
                    i37 = i95 + 1;
                    cCharAt6 = strE.charAt(i95);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i96 |= (cCharAt6 & 8191) << i97;
                    i97 += 13;
                    i95 = i37;
                }
                iCharAt5 = i96 | (cCharAt6 << i97);
                i95 = i37;
            }
            int i98 = i95 + 1;
            int iCharAt6 = strE.charAt(i95);
            if (iCharAt6 >= 55296) {
                int i99 = iCharAt6 & 8191;
                int i100 = 13;
                while (true) {
                    i36 = i98 + 1;
                    cCharAt5 = strE.charAt(i98);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i99 |= (cCharAt5 & 8191) << i100;
                    i100 += 13;
                    i98 = i36;
                }
                iCharAt6 = i99 | (cCharAt5 << i100);
                i98 = i36;
            }
            int i101 = i98 + 1;
            iCharAt = strE.charAt(i98);
            if (iCharAt >= 55296) {
                int i102 = iCharAt & 8191;
                int i103 = 13;
                while (true) {
                    i35 = i101 + 1;
                    cCharAt4 = strE.charAt(i101);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i102 |= (cCharAt4 & 8191) << i103;
                    i103 += 13;
                    i101 = i35;
                }
                iCharAt = i102 | (cCharAt4 << i103);
                i101 = i35;
            }
            int i104 = i101 + 1;
            int iCharAt7 = strE.charAt(i101);
            if (iCharAt7 >= 55296) {
                int i105 = iCharAt7 & 8191;
                int i106 = 13;
                while (true) {
                    i29 = i104 + 1;
                    cCharAt3 = strE.charAt(i104);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i105 |= (cCharAt3 & 8191) << i106;
                    i106 += 13;
                    i104 = i29;
                }
                iCharAt7 = i105 | (cCharAt3 << i106);
                i104 = i29;
            }
            int i107 = i104 + 1;
            int iCharAt8 = strE.charAt(i104);
            if (iCharAt8 >= 55296) {
                int i108 = iCharAt8 & 8191;
                int i109 = 13;
                while (true) {
                    i28 = i107 + 1;
                    cCharAt2 = strE.charAt(i107);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i108 |= (cCharAt2 & 8191) << i109;
                    i109 += 13;
                    i107 = i28;
                }
                iCharAt8 = i108 | (cCharAt2 << i109);
                i107 = i28;
            }
            int i110 = i107 + 1;
            int iCharAt9 = strE.charAt(i107);
            if (iCharAt9 >= 55296) {
                int i111 = iCharAt9 & 8191;
                int i112 = 13;
                while (true) {
                    i27 = i110 + 1;
                    cCharAt = strE.charAt(i110);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i111 |= (cCharAt & 8191) << i112;
                    i112 += 13;
                    i110 = i27;
                }
                iCharAt9 = i111 | (cCharAt << i112);
                i110 = i27;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i16 = (iCharAt3 * 2) + iCharAt4;
            int i113 = iCharAt7;
            i17 = iCharAt5;
            i18 = i113;
            i19 = iCharAt3;
            iArr = iArr2;
            i25 = iCharAt9;
            i76 = i110;
            i26 = iCharAt6;
        }
        Unsafe unsafe = f12182s;
        Object[] objArrD = e1Var.d();
        Class<?> cls = e1Var.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i114 = i25 + i18;
        int i115 = i114;
        int i116 = i25;
        int i117 = 0;
        int i118 = 0;
        while (i76 < length) {
            int i119 = i76 + 1;
            int iCharAt10 = strE.charAt(i76);
            if (iCharAt10 >= c15) {
                int i120 = iCharAt10 & 8191;
                int i121 = i119;
                int i122 = 13;
                while (true) {
                    i68 = i121 + 1;
                    cCharAt12 = strE.charAt(i121);
                    if (cCharAt12 < c15) {
                        break;
                    }
                    i120 |= (cCharAt12 & 8191) << i122;
                    i122 += 13;
                    i121 = i68;
                }
                iCharAt10 = i120 | (cCharAt12 << i122);
                i45 = i68;
            } else {
                i45 = i119;
            }
            int i123 = i45 + 1;
            int iCharAt11 = strE.charAt(i45);
            if (iCharAt11 >= c15) {
                int i124 = iCharAt11 & 8191;
                int i125 = i123;
                int i126 = 13;
                while (true) {
                    i67 = i125 + 1;
                    cCharAt11 = strE.charAt(i125);
                    if (cCharAt11 < c15) {
                        break;
                    }
                    i124 |= (cCharAt11 & 8191) << i126;
                    i126 += 13;
                    i125 = i67;
                }
                iCharAt11 = i124 | (cCharAt11 << i126);
                i46 = i67;
            } else {
                i46 = i123;
            }
            int i127 = iCharAt11 & GF2Field.MASK;
            int i128 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i117] = i118;
                i117++;
            }
            int[] iArr4 = iArr3;
            if (i127 >= 51) {
                int i129 = i46 + 1;
                int iCharAt12 = strE.charAt(i46);
                char c16 = 55296;
                if (iCharAt12 >= 55296) {
                    int i130 = iCharAt12 & 8191;
                    int i131 = 13;
                    while (true) {
                        i66 = i129 + 1;
                        cCharAt10 = strE.charAt(i129);
                        if (cCharAt10 < c16) {
                            break;
                        }
                        i130 |= (cCharAt10 & 8191) << i131;
                        i131 += 13;
                        i129 = i66;
                        c16 = 55296;
                    }
                    iCharAt12 = i130 | (cCharAt10 << i131);
                    i129 = i66;
                }
                int i132 = i127 - 51;
                int i133 = i129;
                if (i132 == 9 || i132 == 17) {
                    i58 = i16 + 1;
                    objArr[((i118 / 3) * 2) + 1] = objArrD[i16];
                } else {
                    if (i132 == 12 && (e1Var.c().equals(b1.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i58 = i16 + 1;
                        objArr[((i118 / 3) * 2) + 1] = objArrD[i16];
                    }
                    i59 = iCharAt12 * 2;
                    obj = objArrD[i59];
                    if (obj instanceof Field) {
                        fieldE1 = (Field) obj;
                    } else {
                        fieldE1 = e0(cls, (String) obj);
                        objArrD[i59] = fieldE1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE1);
                    i65 = i59 + 1;
                    obj2 = objArrD[i65];
                    if (obj2 instanceof Field) {
                        fieldE2 = (Field) obj2;
                    } else {
                        fieldE2 = e0(cls, (String) obj2);
                        objArrD[i65] = fieldE2;
                    }
                    strE = strE;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i56 = iObjectFieldOffset4;
                    i55 = 0;
                    i47 = iCharAt10;
                    i76 = i133;
                }
                i16 = i58;
                i59 = iCharAt12 * 2;
                obj = objArrD[i59];
                if (obj instanceof Field) {
                    fieldE1 = (Field) obj;
                } else {
                    fieldE1 = e0(cls, (String) obj);
                    objArrD[i59] = fieldE1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldE1);
                i65 = i59 + 1;
                obj2 = objArrD[i65];
                if (obj2 instanceof Field) {
                    fieldE2 = (Field) obj2;
                } else {
                    fieldE2 = e0(cls, (String) obj2);
                    objArrD[i65] = fieldE2;
                }
                strE = strE;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                i56 = iObjectFieldOffset5;
                i55 = 0;
                i47 = iCharAt10;
                i76 = i133;
            } else {
                int i134 = i16 + 1;
                Field fieldE3 = e0(cls, (String) objArrD[i16]);
                if (i127 == 9 || i127 == 17) {
                    i47 = iCharAt10;
                    objArr[((i118 / 3) * 2) + 1] = fieldE3.getType();
                } else {
                    if (i127 == 27 || i127 == 49) {
                        i47 = iCharAt10;
                        i57 = i16 + 2;
                        objArr[((i118 / 3) * 2) + 1] = objArrD[i134];
                    } else if (i127 == 12 || i127 == 30 || i127 == 44) {
                        i47 = iCharAt10;
                        if (e1Var.c() == b1.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i57 = i16 + 2;
                            objArr[((i118 / 3) * 2) + 1] = objArrD[i134];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                        if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0 || i127 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i49 = i46;
                            i55 = 0;
                        } else {
                            int i135 = i46 + 1;
                            int iCharAt13 = strE.charAt(i46);
                            if (iCharAt13 >= 55296) {
                                int i136 = iCharAt13 & 8191;
                                int i137 = 13;
                                while (true) {
                                    i49 = i135 + 1;
                                    cCharAt9 = strE.charAt(i135);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i136 |= (cCharAt9 & 8191) << i137;
                                    i137 += 13;
                                    i135 = i49;
                                }
                                iCharAt13 = i136 | (cCharAt9 << i137);
                            } else {
                                i49 = i135;
                            }
                            int i138 = (i19 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrD[i138];
                            if (obj3 instanceof Field) {
                                fieldE0 = (Field) obj3;
                            } else {
                                fieldE0 = e0(cls, (String) obj3);
                                objArrD[i138] = fieldE0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE0);
                            i55 = iCharAt13 % 32;
                        }
                        int i139 = iObjectFieldOffset2;
                        if (i127 >= 18 && i127 <= 49) {
                            iArr[i115] = iObjectFieldOffset;
                            i115++;
                        }
                        iObjectFieldOffset3 = i139;
                        i56 = iObjectFieldOffset;
                        i16 = i48;
                        i76 = i49;
                    } else {
                        if (i127 == 50) {
                            int i140 = i116 + 1;
                            iArr[i116] = i118;
                            int i141 = (i118 / 3) * 2;
                            int i142 = i16 + 2;
                            objArr[i141] = objArrD[i134];
                            if ((iCharAt11 & 2048) != 0) {
                                i48 = i16 + 3;
                                objArr[i141 + 1] = objArrD[i142];
                                i47 = iCharAt10;
                                i116 = i140;
                            } else {
                                i48 = i142;
                                i116 = i140;
                                i47 = iCharAt10;
                            }
                        } else {
                            i47 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                        if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i49 = i46;
                            i55 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i49 = i46;
                            i55 = 0;
                        }
                        int i1310 = iObjectFieldOffset2;
                        if (i127 >= 18) {
                            iArr[i115] = iObjectFieldOffset;
                            i115++;
                        }
                        iObjectFieldOffset3 = i1310;
                        i56 = iObjectFieldOffset;
                        i16 = i48;
                        i76 = i49;
                    }
                    i48 = i57;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                    if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i49 = i46;
                        i55 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i49 = i46;
                        i55 = 0;
                    }
                    int i1311 = iObjectFieldOffset2;
                    if (i127 >= 18) {
                        iArr[i115] = iObjectFieldOffset;
                        i115++;
                    }
                    iObjectFieldOffset3 = i1311;
                    i56 = iObjectFieldOffset;
                    i16 = i48;
                    i76 = i49;
                }
                i48 = i134;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i49 = i46;
                    i55 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i49 = i46;
                    i55 = 0;
                }
                int i1312 = iObjectFieldOffset2;
                if (i127 >= 18) {
                    iArr[i115] = iObjectFieldOffset;
                    i115++;
                }
                iObjectFieldOffset3 = i1312;
                i56 = iObjectFieldOffset;
                i16 = i48;
                i76 = i49;
            }
            int i143 = i118 + 1;
            iArr4[i118] = i47;
            int i144 = i118 + 2;
            int i145 = iObjectFieldOffset3;
            iArr4[i143] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? PKIFailureInfo.systemUnavail : 0) | (i127 << 20) | i56;
            i118 += 3;
            iArr4[i144] = (i55 << 20) | i145;
            length = i128;
            iArr3 = iArr4;
            strE = strE;
            c15 = 55296;
        }
        return new u0<>(iArr3, objArr, i17, i26, e1Var.b(), e1Var.c(), false, iArr, i25, i114, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    private int R(int i15) {
        return this.f12183a[i15];
    }

    private static long S(int i15) {
        return i15 & 1048575;
    }

    private static <T> boolean T(T t15, long j15) {
        return ((Boolean) q1.z(t15, j15)).booleanValue();
    }

    private static <T> double U(T t15, long j15) {
        return ((Double) q1.z(t15, j15)).doubleValue();
    }

    private static <T> float V(T t15, long j15) {
        return ((Float) q1.z(t15, j15)).floatValue();
    }

    private static <T> int W(T t15, long j15) {
        return ((Integer) q1.z(t15, j15)).intValue();
    }

    private static <T> long X(T t15, long j15) {
        return ((Long) q1.z(t15, j15)).longValue();
    }

    private int Y(int i15) {
        if (i15 < this.f12185c || i15 > this.f12186d) {
            return -1;
        }
        return h0(i15, 0);
    }

    private int Z(int i15) {
        return this.f12183a[i15 + 2];
    }

    private <E> void a0(Object obj, long j15, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.O(this.f12196n.c(obj, j15), g1Var, oVar);
    }

    private <E> void b0(Object obj, int i15, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.J(this.f12196n.c(obj, S(i15)), g1Var, oVar);
    }

    private void c0(Object obj, int i15, f1 f1Var) {
        if (w(i15)) {
            q1.O(obj, S(i15), f1Var.H());
        } else if (this.f12189g) {
            q1.O(obj, S(i15), f1Var.y());
        } else {
            q1.O(obj, S(i15), f1Var.n());
        }
    }

    private void d0(Object obj, int i15, f1 f1Var) {
        if (w(i15)) {
            f1Var.m(this.f12196n.c(obj, S(i15)));
        } else {
            f1Var.A(this.f12196n.c(obj, S(i15)));
        }
    }

    private static Field e0(Class<?> cls, String str) {
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

    private void f0(T t15, int i15) {
        int iZ = Z(i15);
        long j15 = 1048575 & iZ;
        if (j15 == 1048575) {
            return;
        }
        q1.M(t15, j15, (1 << (iZ >>> 20)) | q1.w(t15, j15));
    }

    private void g0(T t15, int i15, int i16) {
        q1.M(t15, Z(i16) & 1048575, i15);
    }

    private int h0(int i15, int i16) {
        int length = (this.f12183a.length / 3) - 1;
        while (i16 <= length) {
            int i17 = (length + i16) >>> 1;
            int i18 = i17 * 3;
            int iR = R(i18);
            if (i15 == iR) {
                return i18;
            }
            if (i15 < iR) {
                length = i17 - 1;
            } else {
                i16 = i17 + 1;
            }
        }
        return -1;
    }

    private void i0(T t15, int i15, Object obj) {
        f12182s.putObject(t15, S(l0(i15)), obj);
        f0(t15, i15);
    }

    private boolean j(T t15, T t16, int i15) {
        return x(t15, i15) == x(t16, i15);
    }

    private void j0(T t15, int i15, int i16, Object obj) {
        f12182s.putObject(t15, S(l0(i16)), obj);
        g0(t15, i15, i16);
    }

    private static <T> boolean k(T t15, long j15) {
        return q1.p(t15, j15);
    }

    private static int k0(int i15) {
        return (i15 & 267386880) >>> 20;
    }

    private static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int l0(int i15) {
        return this.f12183a[i15 + 1];
    }

    private static <T> double m(T t15, long j15) {
        return q1.u(t15, j15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void m0(T t15, t1 t1Var) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z15;
        int i15;
        int i16;
        int i17;
        boolean z16;
        u0<T> u0Var = this;
        if (u0Var.f12188f) {
            t<T> tVarC = u0Var.f12198p.c(t15);
            if (tVarC.n()) {
                entry = null;
                it = null;
            } else {
                Iterator itT = tVarC.t();
                entry = (Map.Entry) itT.next();
                it = itT;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = u0Var.f12183a.length;
        Unsafe unsafe = f12182s;
        int i18 = 1048575;
        int i19 = 0;
        int i25 = 0;
        while (i19 < length) {
            int iL0 = u0Var.l0(i19);
            int iR = u0Var.R(i19);
            int iK0 = k0(iL0);
            if (iK0 <= 17) {
                int i26 = u0Var.f12183a[i19 + 2];
                z15 = true;
                int i27 = i26 & 1048575;
                if (i27 != i18) {
                    i25 = i27 == 1048575 ? 0 : unsafe.getInt(t15, i27);
                    i18 = i27;
                }
                i15 = i18;
                i16 = i25;
                i17 = 1 << (i26 >>> 20);
            } else {
                z15 = true;
                i15 = i18;
                i16 = i25;
                i17 = 0;
            }
            while (entry != null && u0Var.f12198p.a(entry) <= iR) {
                u0Var.f12198p.j(t1Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jS = S(iL0);
            switch (iK0) {
                case 0:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.p(iR, m(t15, jS));
                    }
                    break;
                case 1:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.B(iR, q(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 2:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.u(iR, unsafe.getLong(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 3:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.f(iR, unsafe.getLong(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 4:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.h(iR, unsafe.getInt(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 5:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.s(iR, unsafe.getLong(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 6:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.c(iR, unsafe.getInt(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 7:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.v(iR, k(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 8:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        u0Var.p0(iR, unsafe.getObject(t15, jS), t1Var);
                    }
                    break;
                case 9:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.L(iR, unsafe.getObject(t15, jS), u0Var.t(i19));
                    }
                    break;
                case 10:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.K(iR, (g) unsafe.getObject(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 11:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.o(iR, unsafe.getInt(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 12:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.E(iR, unsafe.getInt(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 13:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.w(iR, unsafe.getInt(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 14:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.i(iR, unsafe.getLong(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 15:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.H(iR, unsafe.getInt(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 16:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.m(iR, unsafe.getLong(t15, jS));
                    }
                    u0Var = this;
                    break;
                case 17:
                    if (u0Var.y(t15, i19, i15, i16, i17)) {
                        t1Var.N(iR, unsafe.getObject(t15, jS), u0Var.t(i19));
                    }
                    break;
                case 18:
                    i1.O(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 19:
                    i1.S(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 20:
                    i1.V(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 21:
                    i1.d0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 22:
                    i1.U(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 23:
                    i1.R(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 24:
                    i1.Q(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 25:
                    i1.M(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 26:
                    i1.b0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var);
                    break;
                case 27:
                    i1.W(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, u0Var.t(i19));
                    break;
                case 28:
                    i1.N(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var);
                    break;
                case 29:
                    z16 = false;
                    i1.c0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 30:
                    z16 = false;
                    i1.P(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    z16 = false;
                    i1.X(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 32:
                    z16 = false;
                    i1.Y(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 33:
                    z16 = false;
                    i1.Z(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 34:
                    z16 = false;
                    i1.a0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, false);
                    break;
                case 35:
                    i1.O(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case 36:
                    i1.S(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i1.V(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i1.d0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i1.U(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case 40:
                    i1.R(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i1.Q(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i1.M(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i1.c0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i1.P(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i1.X(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case 46:
                    i1.Y(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case 47:
                    i1.Z(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case 48:
                    i1.a0(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, z15);
                    break;
                case 49:
                    i1.T(u0Var.R(i19), (List) unsafe.getObject(t15, jS), t1Var, u0Var.t(i19));
                    break;
                case 50:
                    u0Var.o0(t1Var, iR, unsafe.getObject(t15, jS), i19);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.p(iR, U(t15, jS));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.B(iR, V(t15, jS));
                    }
                    break;
                case 53:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.u(iR, X(t15, jS));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.f(iR, X(t15, jS));
                    }
                    break;
                case 55:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.h(iR, W(t15, jS));
                    }
                    break;
                case 56:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.s(iR, X(t15, jS));
                    }
                    break;
                case 57:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.c(iR, W(t15, jS));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.v(iR, T(t15, jS));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (u0Var.E(t15, iR, i19)) {
                        u0Var.p0(iR, unsafe.getObject(t15, jS), t1Var);
                    }
                    break;
                case 60:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.L(iR, unsafe.getObject(t15, jS), u0Var.t(i19));
                    }
                    break;
                case 61:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.K(iR, (g) unsafe.getObject(t15, jS));
                    }
                    break;
                case 62:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.o(iR, W(t15, jS));
                    }
                    break;
                case 63:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.E(iR, W(t15, jS));
                    }
                    break;
                case 64:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.w(iR, W(t15, jS));
                    }
                    break;
                case 65:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.i(iR, X(t15, jS));
                    }
                    break;
                case 66:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.H(iR, W(t15, jS));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.m(iR, X(t15, jS));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (u0Var.E(t15, iR, i19)) {
                        t1Var.N(iR, unsafe.getObject(t15, jS), u0Var.t(i19));
                    }
                    break;
                default:
                    break;
            }
            i19 += 3;
            i25 = i16;
            i18 = i15;
            entry = entry;
        }
        while (entry != null) {
            u0Var.f12198p.j(t1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        u0Var.q0(u0Var.f12197o, t15, t1Var);
    }

    private boolean n(T t15, T t16, int i15) {
        int iL0 = l0(i15);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return j(t15, t16, i15) && Double.doubleToLongBits(q1.u(t15, jS)) == Double.doubleToLongBits(q1.u(t16, jS));
            case 1:
                return j(t15, t16, i15) && Float.floatToIntBits(q1.v(t15, jS)) == Float.floatToIntBits(q1.v(t16, jS));
            case 2:
                return j(t15, t16, i15) && q1.x(t15, jS) == q1.x(t16, jS);
            case 3:
                return j(t15, t16, i15) && q1.x(t15, jS) == q1.x(t16, jS);
            case 4:
                return j(t15, t16, i15) && q1.w(t15, jS) == q1.w(t16, jS);
            case 5:
                return j(t15, t16, i15) && q1.x(t15, jS) == q1.x(t16, jS);
            case 6:
                return j(t15, t16, i15) && q1.w(t15, jS) == q1.w(t16, jS);
            case 7:
                return j(t15, t16, i15) && q1.p(t15, jS) == q1.p(t16, jS);
            case 8:
                return j(t15, t16, i15) && i1.I(q1.z(t15, jS), q1.z(t16, jS));
            case 9:
                return j(t15, t16, i15) && i1.I(q1.z(t15, jS), q1.z(t16, jS));
            case 10:
                return j(t15, t16, i15) && i1.I(q1.z(t15, jS), q1.z(t16, jS));
            case 11:
                return j(t15, t16, i15) && q1.w(t15, jS) == q1.w(t16, jS);
            case 12:
                return j(t15, t16, i15) && q1.w(t15, jS) == q1.w(t16, jS);
            case 13:
                return j(t15, t16, i15) && q1.w(t15, jS) == q1.w(t16, jS);
            case 14:
                return j(t15, t16, i15) && q1.x(t15, jS) == q1.x(t16, jS);
            case 15:
                return j(t15, t16, i15) && q1.w(t15, jS) == q1.w(t16, jS);
            case 16:
                return j(t15, t16, i15) && q1.x(t15, jS) == q1.x(t16, jS);
            case 17:
                return j(t15, t16, i15) && i1.I(q1.z(t15, jS), q1.z(t16, jS));
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
                return i1.I(q1.z(t15, jS), q1.z(t16, jS));
            case 50:
                return i1.I(q1.z(t15, jS), q1.z(t16, jS));
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
                return D(t15, t16, i15) && i1.I(q1.z(t15, jS), q1.z(t16, jS));
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void n0(T t15, t1 t1Var) {
        Iterator itG;
        Map.Entry<?, ?> entry;
        q0(this.f12197o, t15, t1Var);
        if (this.f12188f) {
            t<T> tVarC = this.f12198p.c(t15);
            if (tVarC.n()) {
                itG = null;
                entry = null;
            } else {
                itG = tVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f12183a.length - 3; length >= 0; length -= 3) {
            int iL0 = l0(length);
            int iR = R(length);
            while (entry != null && this.f12198p.a(entry) > iR) {
                this.f12198p.j(t1Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (k0(iL0)) {
                case 0:
                    if (x(t15, length)) {
                        t1Var.p(iR, m(t15, S(iL0)));
                    }
                    break;
                case 1:
                    if (x(t15, length)) {
                        t1Var.B(iR, q(t15, S(iL0)));
                    }
                    break;
                case 2:
                    if (x(t15, length)) {
                        t1Var.u(iR, G(t15, S(iL0)));
                    }
                    break;
                case 3:
                    if (x(t15, length)) {
                        t1Var.f(iR, G(t15, S(iL0)));
                    }
                    break;
                case 4:
                    if (x(t15, length)) {
                        t1Var.h(iR, v(t15, S(iL0)));
                    }
                    break;
                case 5:
                    if (x(t15, length)) {
                        t1Var.s(iR, G(t15, S(iL0)));
                    }
                    break;
                case 6:
                    if (x(t15, length)) {
                        t1Var.c(iR, v(t15, S(iL0)));
                    }
                    break;
                case 7:
                    if (x(t15, length)) {
                        t1Var.v(iR, k(t15, S(iL0)));
                    }
                    break;
                case 8:
                    if (x(t15, length)) {
                        p0(iR, q1.z(t15, S(iL0)), t1Var);
                    }
                    break;
                case 9:
                    if (x(t15, length)) {
                        t1Var.L(iR, q1.z(t15, S(iL0)), t(length));
                    }
                    break;
                case 10:
                    if (x(t15, length)) {
                        t1Var.K(iR, (g) q1.z(t15, S(iL0)));
                    }
                    break;
                case 11:
                    if (x(t15, length)) {
                        t1Var.o(iR, v(t15, S(iL0)));
                    }
                    break;
                case 12:
                    if (x(t15, length)) {
                        t1Var.E(iR, v(t15, S(iL0)));
                    }
                    break;
                case 13:
                    if (x(t15, length)) {
                        t1Var.w(iR, v(t15, S(iL0)));
                    }
                    break;
                case 14:
                    if (x(t15, length)) {
                        t1Var.i(iR, G(t15, S(iL0)));
                    }
                    break;
                case 15:
                    if (x(t15, length)) {
                        t1Var.H(iR, v(t15, S(iL0)));
                    }
                    break;
                case 16:
                    if (x(t15, length)) {
                        t1Var.m(iR, G(t15, S(iL0)));
                    }
                    break;
                case 17:
                    if (x(t15, length)) {
                        t1Var.N(iR, q1.z(t15, S(iL0)), t(length));
                    }
                    break;
                case 18:
                    i1.O(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 19:
                    i1.S(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 20:
                    i1.V(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 21:
                    i1.d0(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 22:
                    i1.U(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 23:
                    i1.R(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 24:
                    i1.Q(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 25:
                    i1.M(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 26:
                    i1.b0(R(length), (List) q1.z(t15, S(iL0)), t1Var);
                    break;
                case 27:
                    i1.W(R(length), (List) q1.z(t15, S(iL0)), t1Var, t(length));
                    break;
                case 28:
                    i1.N(R(length), (List) q1.z(t15, S(iL0)), t1Var);
                    break;
                case 29:
                    i1.c0(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 30:
                    i1.P(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    i1.X(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 32:
                    i1.Y(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 33:
                    i1.Z(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 34:
                    i1.a0(R(length), (List) q1.z(t15, S(iL0)), t1Var, false);
                    break;
                case 35:
                    i1.O(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case 36:
                    i1.S(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i1.V(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i1.d0(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i1.U(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case 40:
                    i1.R(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i1.Q(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i1.M(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i1.c0(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i1.P(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i1.X(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case 46:
                    i1.Y(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case 47:
                    i1.Z(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case 48:
                    i1.a0(R(length), (List) q1.z(t15, S(iL0)), t1Var, true);
                    break;
                case 49:
                    i1.T(R(length), (List) q1.z(t15, S(iL0)), t1Var, t(length));
                    break;
                case 50:
                    o0(t1Var, iR, q1.z(t15, S(iL0)), length);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (E(t15, iR, length)) {
                        t1Var.p(iR, U(t15, S(iL0)));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (E(t15, iR, length)) {
                        t1Var.B(iR, V(t15, S(iL0)));
                    }
                    break;
                case 53:
                    if (E(t15, iR, length)) {
                        t1Var.u(iR, X(t15, S(iL0)));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (E(t15, iR, length)) {
                        t1Var.f(iR, X(t15, S(iL0)));
                    }
                    break;
                case 55:
                    if (E(t15, iR, length)) {
                        t1Var.h(iR, W(t15, S(iL0)));
                    }
                    break;
                case 56:
                    if (E(t15, iR, length)) {
                        t1Var.s(iR, X(t15, S(iL0)));
                    }
                    break;
                case 57:
                    if (E(t15, iR, length)) {
                        t1Var.c(iR, W(t15, S(iL0)));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (E(t15, iR, length)) {
                        t1Var.v(iR, T(t15, S(iL0)));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (E(t15, iR, length)) {
                        p0(iR, q1.z(t15, S(iL0)), t1Var);
                    }
                    break;
                case 60:
                    if (E(t15, iR, length)) {
                        t1Var.L(iR, q1.z(t15, S(iL0)), t(length));
                    }
                    break;
                case 61:
                    if (E(t15, iR, length)) {
                        t1Var.K(iR, (g) q1.z(t15, S(iL0)));
                    }
                    break;
                case 62:
                    if (E(t15, iR, length)) {
                        t1Var.o(iR, W(t15, S(iL0)));
                    }
                    break;
                case 63:
                    if (E(t15, iR, length)) {
                        t1Var.E(iR, W(t15, S(iL0)));
                    }
                    break;
                case 64:
                    if (E(t15, iR, length)) {
                        t1Var.w(iR, W(t15, S(iL0)));
                    }
                    break;
                case 65:
                    if (E(t15, iR, length)) {
                        t1Var.i(iR, X(t15, S(iL0)));
                    }
                    break;
                case 66:
                    if (E(t15, iR, length)) {
                        t1Var.H(iR, W(t15, S(iL0)));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (E(t15, iR, length)) {
                        t1Var.m(iR, X(t15, S(iL0)));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (E(t15, iR, length)) {
                        t1Var.N(iR, q1.z(t15, S(iL0)), t(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f12198p.j(t1Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    private <UT, UB> UB o(Object obj, int i15, UB ub5, n1<UT, UB> n1Var, Object obj2) {
        z.c cVarR;
        int iR = R(i15);
        Object objZ = q1.z(obj, S(l0(i15)));
        return (objZ == null || (cVarR = r(i15)) == null) ? ub5 : (UB) p(i15, iR, this.f12199q.c(objZ), cVarR, ub5, n1Var, obj2);
    }

    private <K, V> void o0(t1 t1Var, int i15, Object obj, int i16) {
        if (obj != null) {
            t1Var.M(i15, this.f12199q.b(s(i16)), this.f12199q.e(obj));
        }
    }

    private <K, V, UT, UB> UB p(int i15, int i16, Map<K, V> map, z.c cVar, UB ub5, n1<UT, UB> n1Var, Object obj) {
        k0.a<?, ?> aVarB = this.f12199q.b(s(i15));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.a(((Integer) next.getValue()).intValue())) {
                if (ub5 == null) {
                    ub5 = n1Var.f(obj);
                }
                g.h hVarT = g.t(k0.b(aVarB, next.getKey(), next.getValue()));
                try {
                    k0.e(hVarT.b(), aVarB, next.getKey(), next.getValue());
                    n1Var.d(ub5, i16, hVarT.a());
                    it.remove();
                } catch (IOException e15) {
                    throw new RuntimeException(e15);
                }
            }
        }
        return ub5;
    }

    private void p0(int i15, Object obj, t1 t1Var) {
        if (obj instanceof String) {
            t1Var.e(i15, (String) obj);
        } else {
            t1Var.K(i15, (g) obj);
        }
    }

    private static <T> float q(T t15, long j15) {
        return q1.v(t15, j15);
    }

    private <UT, UB> void q0(n1<UT, UB> n1Var, T t15, t1 t1Var) {
        n1Var.t(n1Var.g(t15), t1Var);
    }

    private z.c r(int i15) {
        return (z.c) this.f12184b[((i15 / 3) * 2) + 1];
    }

    private Object s(int i15) {
        return this.f12184b[(i15 / 3) * 2];
    }

    private g1 t(int i15) {
        int i16 = (i15 / 3) * 2;
        g1 g1Var = (g1) this.f12184b[i16];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> g1VarC = c1.a().c((Class) this.f12184b[i16 + 1]);
        this.f12184b[i16] = g1VarC;
        return g1VarC;
    }

    private <UT, UB> int u(n1<UT, UB> n1Var, T t15) {
        return n1Var.h(n1Var.g(t15));
    }

    private static <T> int v(T t15, long j15) {
        return q1.w(t15, j15);
    }

    private static boolean w(int i15) {
        return (i15 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private boolean x(T t15, int i15) {
        boolean zEquals;
        int iZ = Z(i15);
        long j15 = 1048575 & iZ;
        if (j15 != 1048575) {
            return (q1.w(t15, j15) & (1 << (iZ >>> 20))) != 0;
        }
        int iL0 = l0(i15);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return Double.doubleToRawLongBits(q1.u(t15, jS)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1.v(t15, jS)) != 0;
            case 2:
                return q1.x(t15, jS) != 0;
            case 3:
                return q1.x(t15, jS) != 0;
            case 4:
                return q1.w(t15, jS) != 0;
            case 5:
                return q1.x(t15, jS) != 0;
            case 6:
                return q1.w(t15, jS) != 0;
            case 7:
                return q1.p(t15, jS);
            case 8:
                Object objZ = q1.z(t15, jS);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof g)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = g.f11949b.equals(objZ);
                }
                break;
            case 9:
                return q1.z(t15, jS) != null;
            case 10:
                zEquals = g.f11949b.equals(q1.z(t15, jS));
                break;
            case 11:
                return q1.w(t15, jS) != 0;
            case 12:
                return q1.w(t15, jS) != 0;
            case 13:
                return q1.w(t15, jS) != 0;
            case 14:
                return q1.x(t15, jS) != 0;
            case 15:
                return q1.w(t15, jS) != 0;
            case 16:
                return q1.x(t15, jS) != 0;
            case 17:
                return q1.z(t15, jS) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean y(T t15, int i15, int i16, int i17, int i18) {
        if (i16 == 1048575) {
            return x(t15, i15);
        }
        return (i17 & i18) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean z(Object obj, int i15, g1 g1Var) {
        return g1Var.f(q1.z(obj, S(i15)));
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void a(T t15, T t16) {
        l(t15);
        t16.getClass();
        for (int i15 = 0; i15 < this.f12183a.length; i15 += 3) {
            L(t15, t16, i15);
        }
        i1.G(this.f12197o, t15, t16);
        if (this.f12188f) {
            i1.E(this.f12198p, t15, t16);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int b(T t15) {
        int i15;
        int iF;
        int length = this.f12183a.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 3) {
            int iL0 = l0(i17);
            int iR = R(i17);
            long jS = S(iL0);
            int iHashCode = 37;
            switch (k0(iL0)) {
                case 0:
                    i15 = i16 * 53;
                    iF = z.f(Double.doubleToLongBits(q1.u(t15, jS)));
                    i16 = i15 + iF;
                    break;
                case 1:
                    i15 = i16 * 53;
                    iF = Float.floatToIntBits(q1.v(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 2:
                    i15 = i16 * 53;
                    iF = z.f(q1.x(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 3:
                    i15 = i16 * 53;
                    iF = z.f(q1.x(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 4:
                    i15 = i16 * 53;
                    iF = q1.w(t15, jS);
                    i16 = i15 + iF;
                    break;
                case 5:
                    i15 = i16 * 53;
                    iF = z.f(q1.x(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 6:
                    i15 = i16 * 53;
                    iF = q1.w(t15, jS);
                    i16 = i15 + iF;
                    break;
                case 7:
                    i15 = i16 * 53;
                    iF = z.c(q1.p(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 8:
                    i15 = i16 * 53;
                    iF = ((String) q1.z(t15, jS)).hashCode();
                    i16 = i15 + iF;
                    break;
                case 9:
                    Object objZ = q1.z(t15, jS);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
                    i15 = i16 * 53;
                    iF = q1.z(t15, jS).hashCode();
                    i16 = i15 + iF;
                    break;
                case 11:
                    i15 = i16 * 53;
                    iF = q1.w(t15, jS);
                    i16 = i15 + iF;
                    break;
                case 12:
                    i15 = i16 * 53;
                    iF = q1.w(t15, jS);
                    i16 = i15 + iF;
                    break;
                case 13:
                    i15 = i16 * 53;
                    iF = q1.w(t15, jS);
                    i16 = i15 + iF;
                    break;
                case 14:
                    i15 = i16 * 53;
                    iF = z.f(q1.x(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 15:
                    i15 = i16 * 53;
                    iF = q1.w(t15, jS);
                    i16 = i15 + iF;
                    break;
                case 16:
                    i15 = i16 * 53;
                    iF = z.f(q1.x(t15, jS));
                    i16 = i15 + iF;
                    break;
                case 17:
                    Object objZ2 = q1.z(t15, jS);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
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
                    iF = q1.z(t15, jS).hashCode();
                    i16 = i15 + iF;
                    break;
                case 50:
                    i15 = i16 * 53;
                    iF = q1.z(t15, jS).hashCode();
                    i16 = i15 + iF;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.f(Double.doubleToLongBits(U(t15, jS)));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = Float.floatToIntBits(V(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case 53:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.f(X(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.f(X(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case 55:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = W(t15, jS);
                        i16 = i15 + iF;
                    }
                    break;
                case 56:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.f(X(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case 57:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = W(t15, jS);
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.c(T(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = ((String) q1.z(t15, jS)).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
                case 60:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = q1.z(t15, jS).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
                case 61:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = q1.z(t15, jS).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
                case 62:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = W(t15, jS);
                        i16 = i15 + iF;
                    }
                    break;
                case 63:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = W(t15, jS);
                        i16 = i15 + iF;
                    }
                    break;
                case 64:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = W(t15, jS);
                        i16 = i15 + iF;
                    }
                    break;
                case 65:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.f(X(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case 66:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = W(t15, jS);
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = z.f(X(t15, jS));
                        i16 = i15 + iF;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (E(t15, iR, i17)) {
                        i15 = i16 * 53;
                        iF = q1.z(t15, jS).hashCode();
                        i16 = i15 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i16 * 53) + this.f12197o.g(t15).hashCode();
        return this.f12188f ? (iHashCode2 * 53) + this.f12198p.c(t15).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public boolean c(T t15, T t16) {
        int length = this.f12183a.length;
        for (int i15 = 0; i15 < length; i15 += 3) {
            if (!n(t15, t16, i15)) {
                return false;
            }
        }
        if (!this.f12197o.g(t15).equals(this.f12197o.g(t16))) {
            return false;
        }
        if (this.f12188f) {
            return this.f12198p.c(t15).equals(this.f12198p.c(t16));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public T d() {
        return (T) this.f12195m.a(this.f12187e);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g1
    public void e(T t15) {
        if (C(t15)) {
            if (t15 instanceof x) {
                x xVar = (x) t15;
                xVar.s();
                xVar.r();
                xVar.J();
            }
            int length = this.f12183a.length;
            for (int i15 = 0; i15 < length; i15 += 3) {
                int iL0 = l0(i15);
                long jS = S(iL0);
                int iK0 = k0(iL0);
                if (iK0 != 9) {
                    if (iK0 != 60 && iK0 != 68) {
                        switch (iK0) {
                            case 17:
                                if (x(t15, i15)) {
                                    t(i15).e(f12182s.getObject(t15, jS));
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
                                this.f12196n.a(t15, jS);
                                break;
                            case 50:
                                Unsafe unsafe = f12182s;
                                Object object = unsafe.getObject(t15, jS);
                                if (object != null) {
                                    unsafe.putObject(t15, jS, this.f12199q.f(object));
                                }
                                break;
                        }
                    } else if (E(t15, R(i15), i15)) {
                        t(i15).e(f12182s.getObject(t15, jS));
                    }
                } else if (x(t15, i15)) {
                    t(i15).e(f12182s.getObject(t15, jS));
                }
            }
            this.f12197o.j(t15);
            if (this.f12188f) {
                this.f12198p.f(t15);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean f(T t15) {
        int i15;
        int i16;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f12193k) {
            int i25 = this.f12192j[i18];
            int iR = R(i25);
            int iL0 = l0(i25);
            int i26 = this.f12183a[i25 + 2];
            int i27 = i26 & 1048575;
            int i28 = 1 << (i26 >>> 20);
            if (i27 != i17) {
                if (i27 != 1048575) {
                    i19 = f12182s.getInt(t15, i27);
                }
                i16 = i19;
                i15 = i27;
            } else {
                i15 = i17;
                i16 = i19;
            }
            T t16 = t15;
            if (F(iL0) && !y(t16, i25, i15, i16, i28)) {
                return false;
            }
            int iK0 = k0(iL0);
            if (iK0 == 9 || iK0 == 17) {
                if (y(t16, i25, i15, i16, i28) && !z(t16, iL0, t(i25))) {
                    return false;
                }
            } else if (iK0 == 27) {
                if (!A(t16, iL0, i25)) {
                    return false;
                }
            } else if (iK0 == 60 || iK0 == 68) {
                if (E(t16, iR, i25) && !z(t16, iL0, t(i25))) {
                    return false;
                }
            } else if (iK0 != 49) {
                if (iK0 == 50 && !B(t16, iL0, i25)) {
                    return false;
                }
            } else if (!A(t16, iL0, i25)) {
                return false;
            }
            i18++;
            t15 = t16;
            i17 = i15;
            i19 = i16;
        }
        return !this.f12188f || this.f12198p.c(t15).p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 androidx.datastore.preferences.protobuf.u0<T>) = 
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v24 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v30 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.g1
    public int g(T t15) {
        int i15;
        int i16;
        int iQ;
        int iX;
        int i17;
        int iU;
        int iW;
        u0<T> u0Var = this;
        T t16 = t15;
        Unsafe unsafe = f12182s;
        int i18 = 1048575;
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (i19 < u0Var.f12183a.length) {
            int iL0 = u0Var.l0(i19);
            int iK0 = k0(iL0);
            int iR = u0Var.R(i19);
            int i28 = u0Var.f12183a[i19 + 2];
            int i29 = i28 & i18;
            if (iK0 <= 17) {
                if (i29 != i27) {
                    i25 = i29 == i18 ? 0 : unsafe.getInt(t16, i29);
                    i27 = i29;
                }
                i15 = 1 << (i28 >>> 20);
            } else {
                i15 = 0;
            }
            int i35 = i26;
            long jS = S(iL0);
            if (iK0 < u.Z.b() || iK0 > u.B0.b()) {
                i29 = 0;
            }
            switch (iK0) {
                case 0:
                    if (!u0Var.y(t16, i19, i27, i25, i15)) {
                        i26 = i35;
                    } else {
                        i16 = j.i(iR, 0.0d);
                        i26 = i35 + i16;
                    }
                    break;
                case 1:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iQ = j.q(iR, 0.0f);
                        i26 = i35 + iQ;
                        u0Var = this;
                        t16 = t15;
                    }
                    u0Var = this;
                    t16 = t15;
                    i26 = i35;
                    break;
                case 2:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.x(iR, unsafe.getLong(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 3:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.X(iR, unsafe.getLong(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 4:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.v(iR, unsafe.getInt(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 5:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iQ = j.o(iR, 0L);
                        i26 = i35 + iQ;
                        u0Var = this;
                        t16 = t15;
                    }
                    u0Var = this;
                    t16 = t15;
                    i26 = i35;
                    break;
                case 6:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iQ = j.m(iR, 0);
                        i26 = i35 + iQ;
                        u0Var = this;
                        t16 = t15;
                    }
                    u0Var = this;
                    t16 = t15;
                    i26 = i35;
                    break;
                case 7:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iQ = j.d(iR, true);
                        i26 = i35 + iQ;
                        u0Var = this;
                        t16 = t15;
                    }
                    u0Var = this;
                    t16 = t15;
                    i26 = i35;
                    break;
                case 8:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        Object object = unsafe.getObject(t16, jS);
                        iX = object instanceof g ? j.g(iR, (g) object) : j.S(iR, (String) object);
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 9:
                    if (!u0Var.y(t16, i19, i27, i25, i15)) {
                        i26 = i35;
                    } else {
                        i16 = i1.o(iR, unsafe.getObject(t16, jS), u0Var.t(i19));
                        i26 = i35 + i16;
                    }
                    break;
                case 10:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.g(iR, (g) unsafe.getObject(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 11:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.V(iR, unsafe.getInt(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 12:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.k(iR, unsafe.getInt(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 13:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iQ = j.K(iR, 0);
                        i26 = i35 + iQ;
                        u0Var = this;
                        t16 = t15;
                    }
                    u0Var = this;
                    t16 = t15;
                    i26 = i35;
                    break;
                case 14:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iQ = j.M(iR, 0L);
                        i26 = i35 + iQ;
                        u0Var = this;
                        t16 = t15;
                    }
                    u0Var = this;
                    t16 = t15;
                    i26 = i35;
                    break;
                case 15:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.O(iR, unsafe.getInt(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 16:
                    if (u0Var.y(t16, i19, i27, i25, i15)) {
                        iX = j.Q(iR, unsafe.getLong(t16, jS));
                        i26 = i35 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i26 = i35;
                    break;
                case 17:
                    if (!u0Var.y(t16, i19, i27, i25, i15)) {
                        i26 = i35;
                    } else {
                        i16 = j.s(iR, (r0) unsafe.getObject(t16, jS), u0Var.t(i19));
                        i26 = i35 + i16;
                    }
                    break;
                case 18:
                    i16 = i1.h(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 19:
                    i16 = i1.f(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 20:
                    i16 = i1.m(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 21:
                    i16 = i1.x(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 22:
                    i16 = i1.k(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 23:
                    i16 = i1.h(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 24:
                    i16 = i1.f(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 25:
                    i16 = i1.a(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 26:
                    i16 = i1.u(iR, (List) unsafe.getObject(t16, jS));
                    i26 = i35 + i16;
                    break;
                case 27:
                    i16 = i1.p(iR, (List) unsafe.getObject(t16, jS), u0Var.t(i19));
                    i26 = i35 + i16;
                    break;
                case 28:
                    i16 = i1.c(iR, (List) unsafe.getObject(t16, jS));
                    i26 = i35 + i16;
                    break;
                case 29:
                    i16 = i1.v(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 30:
                    i16 = i1.d(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case BERTags.DATE /* 31 */:
                    i16 = i1.f(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 32:
                    i16 = i1.h(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 33:
                    i16 = i1.q(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 34:
                    i16 = i1.s(iR, (List) unsafe.getObject(t16, jS), false);
                    i26 = i35 + i16;
                    break;
                case 35:
                    i17 = i1.i((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case 36:
                    i17 = i1.g((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    i17 = i1.n((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    i17 = i1.y((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    i17 = i1.l((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case 40:
                    i17 = i1.i((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    i17 = i1.g((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    i17 = i1.b((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i17 = i1.w((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    i17 = i1.e((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    i17 = i1.g((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case 46:
                    i17 = i1.i((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case 47:
                    i17 = i1.r((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case 48:
                    i17 = i1.t((List) unsafe.getObject(t16, jS));
                    if (i17 <= 0) {
                        i26 = i35;
                    } else {
                        if (u0Var.f12191i) {
                            unsafe.putInt(t16, i29, i17);
                        }
                        iU = j.U(iR);
                        iW = j.W(i17);
                        i26 = i35 + iU + iW + i17;
                    }
                    break;
                case 49:
                    i16 = i1.j(iR, (List) unsafe.getObject(t16, jS), u0Var.t(i19));
                    i26 = i35 + i16;
                    break;
                case 50:
                    i16 = u0Var.f12199q.g(iR, unsafe.getObject(t16, jS), u0Var.s(i19));
                    i26 = i35 + i16;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.i(iR, 0.0d);
                        i26 = i35 + i16;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.q(iR, 0.0f);
                        i26 = i35 + i16;
                    }
                    break;
                case 53:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.x(iR, X(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.X(iR, X(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case 55:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.v(iR, W(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case 56:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.o(iR, 0L);
                        i26 = i35 + i16;
                    }
                    break;
                case 57:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.m(iR, 0);
                        i26 = i35 + i16;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.d(iR, true);
                        i26 = i35 + i16;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        Object object2 = unsafe.getObject(t16, jS);
                        i16 = object2 instanceof g ? j.g(iR, (g) object2) : j.S(iR, (String) object2);
                        i26 = i35 + i16;
                    }
                    break;
                case 60:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = i1.o(iR, unsafe.getObject(t16, jS), u0Var.t(i19));
                        i26 = i35 + i16;
                    }
                    break;
                case 61:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.g(iR, (g) unsafe.getObject(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case 62:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.V(iR, W(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case 63:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.k(iR, W(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case 64:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.K(iR, 0);
                        i26 = i35 + i16;
                    }
                    break;
                case 65:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.M(iR, 0L);
                        i26 = i35 + i16;
                    }
                    break;
                case 66:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.O(iR, W(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.Q(iR, X(t16, jS));
                        i26 = i35 + i16;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (!u0Var.E(t16, iR, i19)) {
                        i26 = i35;
                    } else {
                        i16 = j.s(iR, (r0) unsafe.getObject(t16, jS), u0Var.t(i19));
                        i26 = i35 + i16;
                    }
                    break;
                default:
                    i26 = i35;
                    break;
            }
            i19 += 3;
            i18 = 1048575;
        }
        int iU2 = i26 + u0Var.u(u0Var.f12197o, t16);
        return u0Var.f12188f ? iU2 + u0Var.f12198p.c(t16).l() : iU2;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void h(T t15, f1 f1Var, o oVar) {
        oVar.getClass();
        l(t15);
        H(this.f12197o, this.f12198p, t15, f1Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void i(T t15, t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            n0(t15, t1Var);
        } else {
            m0(t15, t1Var);
        }
    }
}
