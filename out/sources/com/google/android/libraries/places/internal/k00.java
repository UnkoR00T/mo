package com.google.android.libraries.places.internal;

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
final class k00<T> implements v00<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f32681m = new int[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Unsafe f32682n = p10.t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f32683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f32684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g00 f32687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f32690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f32691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f32692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h10 f32693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final my f32694l;

    private k00(int[] iArr, Object[] objArr, int i15, int i16, g00 g00Var, boolean z15, int[] iArr2, int i17, int i18, n00 n00Var, sz szVar, h10 h10Var, my myVar, b00 b00Var) {
        this.f32683a = iArr;
        this.f32684b = objArr;
        this.f32685c = i15;
        this.f32686d = i16;
        this.f32689g = g00Var instanceof az;
        boolean z16 = false;
        if (myVar != null && (g00Var instanceof xy)) {
            z16 = true;
        }
        this.f32688f = z16;
        this.f32690h = iArr2;
        this.f32691i = i17;
        this.f32692j = i18;
        this.f32693k = h10Var;
        this.f32694l = myVar;
        this.f32687e = g00Var;
    }

    private final v00 A(int i15) {
        Object[] objArr = this.f32684b;
        int i16 = i15 / 3;
        int i17 = i16 + i16;
        v00 v00Var = (v00) objArr[i17];
        if (v00Var != null) {
            return v00Var;
        }
        v00 v00VarB = r00.a().b((Class) objArr[i17 + 1]);
        objArr[i17] = v00VarB;
        return v00VarB;
    }

    private final Object B(int i15) {
        int i16 = i15 / 3;
        return this.f32684b[i16 + i16];
    }

    private final ez C(int i15) {
        int i16 = i15 / 3;
        return (ez) this.f32684b[i16 + i16 + 1];
    }

    private final Object D(Object obj, int i15) {
        v00 v00VarA = A(i15);
        int iK = K(i15) & 1048575;
        if (!p(obj, i15)) {
            return v00VarA.zza();
        }
        Object object = f32682n.getObject(obj, iK);
        if (j(object)) {
            return object;
        }
        Object objZza = v00VarA.zza();
        if (object != null) {
            v00VarA.b(objZza, object);
        }
        return objZza;
    }

    private final void E(Object obj, int i15, Object obj2) {
        f32682n.putObject(obj, K(i15) & 1048575, obj2);
        q(obj, i15);
    }

    private final Object F(Object obj, int i15, int i16) {
        v00 v00VarA = A(i16);
        if (!r(obj, i15, i16)) {
            return v00VarA.zza();
        }
        Object object = f32682n.getObject(obj, K(i16) & 1048575);
        if (j(object)) {
            return object;
        }
        Object objZza = v00VarA.zza();
        if (object != null) {
            v00VarA.b(objZza, object);
        }
        return objZza;
    }

    private final void G(Object obj, int i15, int i16, Object obj2) {
        f32682n.putObject(obj, K(i16) & 1048575, obj2);
        t(obj, i15, i16);
    }

    private final Object H(Object obj, int i15, Object obj2, h10 h10Var, Object obj3) {
        ez ezVarC;
        int i16 = this.f32683a[i15];
        Object objQ = p10.q(obj, K(i15) & 1048575);
        if (objQ == null || (ezVarC = C(i15)) == null) {
            return obj2;
        }
        yz yzVarE = ((zz) B(i15)).e();
        Iterator it = ((a00) objQ).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!ezVarC.b(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = h10Var.h(obj3);
                }
                int iC = zz.c(yzVarE, entry.getKey(), entry.getValue());
                tx txVar = tx.f33820b;
                byte[] bArr = new byte[iC];
                int i17 = dy.f32108c;
                zx zxVar = new zx(bArr, 0, iC);
                try {
                    zz.b(zxVar, yzVarE, entry.getKey(), entry.getValue());
                    zxVar.g();
                    h10Var.d(obj2, i16, new sx(bArr));
                    it.remove();
                } catch (IOException e15) {
                    throw new RuntimeException(e15);
                }
            }
        }
        return obj2;
    }

    private static boolean I(Object obj, int i15, v00 v00Var) {
        return v00Var.g(p10.q(obj, i15 & 1048575));
    }

    private final void J(Object obj, int i15, u00 u00Var) {
        long j15 = i15 & 1048575;
        if (i(i15)) {
            p10.r(obj, j15, u00Var.b());
        } else if (this.f32689g) {
            p10.r(obj, j15, u00Var.q());
        } else {
            p10.r(obj, j15, u00Var.M());
        }
    }

    private final int K(int i15) {
        return this.f32683a[i15 + 1];
    }

    private final int L(int i15) {
        return this.f32683a[i15 + 2];
    }

    private static int M(int i15) {
        return (i15 >>> 20) & GF2Field.MASK;
    }

    private static boolean i(int i15) {
        return (i15 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof az) {
            return ((az) obj).C();
        }
        return true;
    }

    private static void k(Object obj) {
        if (!j(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int l(Object obj, long j15) {
        return ((Integer) p10.q(obj, j15)).intValue();
    }

    private static long m(Object obj, long j15) {
        return ((Long) p10.q(obj, j15)).longValue();
    }

    private final boolean n(Object obj, Object obj2, int i15) {
        return p(obj, i15) == p(obj2, i15);
    }

    private final boolean o(Object obj, int i15, int i16, int i17, int i18) {
        if (i16 == 1048575) {
            return p(obj, i15);
        }
        return (i17 & i18) != 0;
    }

    private final boolean p(Object obj, int i15) {
        int iL = L(i15);
        long j15 = iL & 1048575;
        if (j15 != 1048575) {
            return (p10.g(obj, j15) & (1 << (iL >>> 20))) != 0;
        }
        int iK = K(i15);
        long j16 = iK & 1048575;
        switch (M(iK)) {
            case 0:
                return Double.doubleToRawLongBits(p10.o(obj, j16)) != 0;
            case 1:
                return Float.floatToRawIntBits(p10.m(obj, j16)) != 0;
            case 2:
                return p10.i(obj, j16) != 0;
            case 3:
                return p10.i(obj, j16) != 0;
            case 4:
                return p10.g(obj, j16) != 0;
            case 5:
                return p10.i(obj, j16) != 0;
            case 6:
                return p10.g(obj, j16) != 0;
            case 7:
                return p10.k(obj, j16);
            case 8:
                Object objQ = p10.q(obj, j16);
                if (objQ instanceof String) {
                    return !((String) objQ).isEmpty();
                }
                if (objQ instanceof tx) {
                    return !tx.f33820b.equals(objQ);
                }
                return u();
            case 9:
                return p10.q(obj, j16) != null;
            case 10:
                return !tx.f33820b.equals(p10.q(obj, j16));
            case 11:
                return p10.g(obj, j16) != 0;
            case 12:
                return p10.g(obj, j16) != 0;
            case 13:
                return p10.g(obj, j16) != 0;
            case 14:
                return p10.i(obj, j16) != 0;
            case 15:
                return p10.g(obj, j16) != 0;
            case 16:
                return p10.i(obj, j16) != 0;
            case 17:
                return p10.q(obj, j16) != null;
            default:
                return u();
        }
    }

    private final void q(Object obj, int i15) {
        int iL = L(i15);
        long j15 = 1048575 & iL;
        if (j15 == 1048575) {
            return;
        }
        p10.h(obj, j15, (1 << (iL >>> 20)) | p10.g(obj, j15));
    }

    private final boolean r(Object obj, int i15, int i16) {
        return p10.g(obj, (long) (L(i16) & 1048575)) == i15;
    }

    private final boolean s(Object obj, Object obj2, int i15) {
        long jL = L(i15) & 1048575;
        return p10.g(obj, jL) == p10.g(obj2, jL);
    }

    private final void t(Object obj, int i15, int i16) {
        p10.h(obj, L(i16) & 1048575, i15);
    }

    private boolean u() {
        throw new IllegalArgumentException();
    }

    private static final void v(int i15, Object obj, w10 w10Var) {
        if (obj instanceof String) {
            w10Var.e(i15, (String) obj);
        } else {
            w10Var.d(i15, (tx) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:130:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:171:0x0347  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    static k00 w(Class cls, d00 d00Var, n00 n00Var, sz szVar, h10 h10Var, my myVar, b00 b00Var) {
        int i15;
        int iCharAt;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i25;
        int i26;
        int i27;
        char cCharAt;
        int i28;
        int i29;
        char cCharAt2;
        int i35;
        char cCharAt3;
        int i36;
        char cCharAt4;
        int i37;
        char cCharAt5;
        int i38;
        char cCharAt6;
        int i39;
        char cCharAt7;
        int i45;
        int i46;
        int i47;
        int i48;
        int iObjectFieldOffset;
        int i49;
        char c15;
        int i55;
        int i56;
        int i57;
        int i58;
        Field fieldX;
        int iObjectFieldOffset2;
        int i59;
        char cCharAt8;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i75;
        int i76;
        int i77;
        int i78;
        Object obj;
        Field fieldX2;
        int i79;
        Object obj2;
        Field fieldX3;
        int i85;
        char cCharAt9;
        int i86;
        char cCharAt10;
        int i87;
        char cCharAt11;
        int i88;
        char cCharAt12;
        if (!(d00Var instanceof t00)) {
            throw null;
        }
        t00 t00Var = (t00) d00Var;
        String strB = t00Var.b();
        int length = strB.length();
        char c16 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i89 = 1;
            while (true) {
                i15 = i89 + 1;
                if (strB.charAt(i89) < 55296) {
                    break;
                }
                i89 = i15;
            }
        } else {
            i15 = 1;
        }
        int i95 = i15 + 1;
        int iCharAt2 = strB.charAt(i15);
        if (iCharAt2 >= 55296) {
            int i96 = iCharAt2 & 8191;
            int i97 = 13;
            while (true) {
                i88 = i95 + 1;
                cCharAt12 = strB.charAt(i95);
                if (cCharAt12 < 55296) {
                    break;
                }
                i96 |= (cCharAt12 & 8191) << i97;
                i97 += 13;
                i95 = i88;
            }
            iCharAt2 = i96 | (cCharAt12 << i97);
            i95 = i88;
        }
        if (iCharAt2 == 0) {
            i25 = 0;
            i18 = 0;
            iCharAt = 0;
            i19 = 0;
            i17 = 0;
            i26 = 0;
            iArr = f32681m;
            i16 = 0;
        } else {
            int i98 = i95 + 1;
            int iCharAt3 = strB.charAt(i95);
            if (iCharAt3 >= 55296) {
                int i99 = iCharAt3 & 8191;
                int i100 = 13;
                while (true) {
                    i39 = i98 + 1;
                    cCharAt7 = strB.charAt(i98);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i99 |= (cCharAt7 & 8191) << i100;
                    i100 += 13;
                    i98 = i39;
                }
                iCharAt3 = i99 | (cCharAt7 << i100);
                i98 = i39;
            }
            int i101 = i98 + 1;
            int iCharAt4 = strB.charAt(i98);
            if (iCharAt4 >= 55296) {
                int i102 = iCharAt4 & 8191;
                int i103 = 13;
                while (true) {
                    i38 = i101 + 1;
                    cCharAt6 = strB.charAt(i101);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i102 |= (cCharAt6 & 8191) << i103;
                    i103 += 13;
                    i101 = i38;
                }
                iCharAt4 = i102 | (cCharAt6 << i103);
                i101 = i38;
            }
            int i104 = i101 + 1;
            int iCharAt5 = strB.charAt(i101);
            if (iCharAt5 >= 55296) {
                int i105 = iCharAt5 & 8191;
                int i106 = 13;
                while (true) {
                    i37 = i104 + 1;
                    cCharAt5 = strB.charAt(i104);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i105 |= (cCharAt5 & 8191) << i106;
                    i106 += 13;
                    i104 = i37;
                }
                iCharAt5 = i105 | (cCharAt5 << i106);
                i104 = i37;
            }
            int i107 = i104 + 1;
            int iCharAt6 = strB.charAt(i104);
            if (iCharAt6 >= 55296) {
                int i108 = iCharAt6 & 8191;
                int i109 = 13;
                while (true) {
                    i36 = i107 + 1;
                    cCharAt4 = strB.charAt(i107);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i108 |= (cCharAt4 & 8191) << i109;
                    i109 += 13;
                    i107 = i36;
                }
                iCharAt6 = i108 | (cCharAt4 << i109);
                i107 = i36;
            }
            int i110 = i107 + 1;
            iCharAt = strB.charAt(i107);
            if (iCharAt >= 55296) {
                int i111 = iCharAt & 8191;
                int i112 = 13;
                while (true) {
                    i35 = i110 + 1;
                    cCharAt3 = strB.charAt(i110);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i111 |= (cCharAt3 & 8191) << i112;
                    i112 += 13;
                    i110 = i35;
                }
                iCharAt = i111 | (cCharAt3 << i112);
                i110 = i35;
            }
            int i113 = i110 + 1;
            int iCharAt7 = strB.charAt(i110);
            if (iCharAt7 >= 55296) {
                int i114 = iCharAt7 & 8191;
                int i115 = 13;
                while (true) {
                    i29 = i113 + 1;
                    cCharAt2 = strB.charAt(i113);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i114 |= (cCharAt2 & 8191) << i115;
                    i115 += 13;
                    i113 = i29;
                }
                iCharAt7 = i114 | (cCharAt2 << i115);
                i113 = i29;
            }
            int i116 = i113 + 1;
            if (strB.charAt(i113) >= 55296) {
                while (true) {
                    i28 = i116 + 1;
                    if (strB.charAt(i116) < 55296) {
                        break;
                    }
                    i116 = i28;
                }
                i116 = i28;
            }
            int i117 = i116 + 1;
            int iCharAt8 = strB.charAt(i116);
            if (iCharAt8 >= 55296) {
                int i118 = iCharAt8 & 8191;
                int i119 = 13;
                while (true) {
                    i27 = i117 + 1;
                    cCharAt = strB.charAt(i117);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i118 |= (cCharAt & 8191) << i119;
                    i119 += 13;
                    i117 = i27;
                }
                iCharAt8 = i118 | (cCharAt << i119);
                i117 = i27;
            }
            int i120 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            i16 = iCharAt3;
            i95 = i117;
            i17 = iCharAt6;
            i18 = i120;
            iArr = iArr2;
            int i121 = iCharAt7;
            i19 = iCharAt5;
            i25 = i121;
            i26 = iCharAt8;
        }
        Unsafe unsafe = f32682n;
        Object[] objArrC = t00Var.c();
        Class<?> cls2 = t00Var.zzb().getClass();
        int i122 = i26 + i25;
        int i123 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i123];
        int i124 = i26;
        int i125 = i122;
        int i126 = 0;
        int i127 = 0;
        while (i95 < length) {
            int i128 = i95 + 1;
            int iCharAt9 = strB.charAt(i95);
            if (iCharAt9 >= c16) {
                int i129 = iCharAt9 & 8191;
                int i130 = i128;
                int i131 = 13;
                while (true) {
                    i87 = i130 + 1;
                    cCharAt11 = strB.charAt(i130);
                    if (cCharAt11 < c16) {
                        break;
                    }
                    i129 |= (cCharAt11 & 8191) << i131;
                    i131 += 13;
                    i130 = i87;
                }
                iCharAt9 = i129 | (cCharAt11 << i131);
                i45 = i87;
            } else {
                i45 = i128;
            }
            int i132 = i45 + 1;
            int iCharAt10 = strB.charAt(i45);
            if (iCharAt10 >= c16) {
                int i133 = iCharAt10 & 8191;
                int i134 = i132;
                int i135 = 13;
                while (true) {
                    i86 = i134 + 1;
                    cCharAt10 = strB.charAt(i134);
                    if (cCharAt10 < c16) {
                        break;
                    }
                    i133 |= (cCharAt10 & 8191) << i135;
                    i135 += 13;
                    i134 = i86;
                }
                iCharAt10 = i133 | (cCharAt10 << i135);
                i46 = i86;
            } else {
                i46 = i132;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i127] = i126;
                i127++;
            }
            int i136 = iCharAt10 & GF2Field.MASK;
            t00 t00Var2 = t00Var;
            int i137 = iCharAt10 & 2048;
            if (i136 >= 51) {
                int i138 = i46 + 1;
                int iCharAt11 = strB.charAt(i46);
                char c17 = 55296;
                if (iCharAt11 >= 55296) {
                    int i139 = iCharAt11 & 8191;
                    int i140 = i138;
                    int i141 = 13;
                    while (true) {
                        i85 = i140 + 1;
                        cCharAt9 = strB.charAt(i140);
                        if (cCharAt9 < c17) {
                            break;
                        }
                        i139 |= (cCharAt9 & 8191) << i141;
                        i141 += 13;
                        i140 = i85;
                        c17 = 55296;
                    }
                    iCharAt11 = i139 | (cCharAt9 << i141);
                    i75 = i85;
                } else {
                    i75 = i138;
                }
                i55 = i75;
                int i142 = i136 - 51;
                i47 = length;
                if (i142 == 9 || i142 == 17) {
                    i76 = i18 + 1;
                    int i143 = i126 / 3;
                    objArr[i143 + i143 + 1] = objArrC[i18];
                } else {
                    if (i142 != 12) {
                        i77 = i137;
                    } else if (t00Var2.a() == 1 || i137 != 0) {
                        i76 = i18 + 1;
                        int i144 = i126 / 3;
                        objArr[i144 + i144 + 1] = objArrC[i18];
                    } else {
                        i77 = 0;
                    }
                    i78 = iCharAt11 + iCharAt11;
                    obj = objArrC[i78];
                    i137 = i77;
                    if (obj instanceof Field) {
                        fieldX2 = (Field) obj;
                    } else {
                        fieldX2 = x(cls2, (String) obj);
                        objArrC[i78] = fieldX2;
                        iArr[i125] = i126;
                        i125++;
                    }
                    int i145 = i16;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldX2);
                    i79 = i78 + 1;
                    obj2 = objArrC[i79];
                    i48 = i145;
                    if (obj2 instanceof Field) {
                        fieldX3 = (Field) obj2;
                    } else {
                        fieldX3 = x(cls2, (String) obj2);
                        objArrC[i79] = fieldX3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldX3);
                    strB = strB;
                    i57 = iObjectFieldOffset3;
                    i58 = 0;
                    c15 = 55296;
                }
                i18 = i76;
                i77 = i137;
                i78 = iCharAt11 + iCharAt11;
                obj = objArrC[i78];
                i137 = i77;
                if (obj instanceof Field) {
                    fieldX2 = (Field) obj;
                } else {
                    fieldX2 = x(cls2, (String) obj);
                    objArrC[i78] = fieldX2;
                    iArr[i125] = i126;
                    i125++;
                }
                int i146 = i16;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldX2);
                i79 = i78 + 1;
                obj2 = objArrC[i79];
                i48 = i146;
                if (obj2 instanceof Field) {
                    fieldX3 = (Field) obj2;
                } else {
                    fieldX3 = x(cls2, (String) obj2);
                    objArrC[i79] = fieldX3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldX3);
                strB = strB;
                i57 = iObjectFieldOffset4;
                i58 = 0;
                c15 = 55296;
            } else {
                i47 = length;
                i48 = i16;
                int i147 = i18 + 1;
                Field fieldX4 = x(cls2, (String) objArrC[i18]);
                if (i136 == 9 || i136 == 17) {
                    int i148 = i126 / 3;
                    objArr[i148 + i148 + 1] = fieldX4.getType();
                } else {
                    if (i136 != 27) {
                        if (i136 == 49) {
                            i18 += 2;
                            i65 = 1;
                        } else if (i136 == 12 || i136 == 30 || i136 == 44) {
                            if (t00Var2.a() == 1 || i137 != 0) {
                                i18 += 2;
                                int i149 = i126 / 3;
                                objArr[i149 + i149 + 1] = objArrC[i147];
                            } else {
                                i18 = i147;
                                i137 = 0;
                            }
                        } else if (i136 == 50) {
                            int i150 = i18 + 2;
                            int i151 = i124 + 1;
                            iArr[i124] = i126;
                            int i152 = i126 / 3;
                            int i153 = i152 + i152;
                            objArr[i153] = objArrC[i147];
                            if (i137 != 0) {
                                objArr[i153 + 1] = objArrC[i150];
                                i18 += 3;
                                i124 = i151;
                            } else {
                                i18 = i150;
                                i124 = i151;
                                i137 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                        i49 = 1048575;
                        if ((iCharAt10 & PKIFailureInfo.certConfirmed) != 0 || i136 > 17) {
                            c15 = 55296;
                            i55 = i46;
                            i56 = i137;
                            i57 = iObjectFieldOffset;
                            i58 = 0;
                        } else {
                            int i154 = i46 + 1;
                            int iCharAt12 = strB.charAt(i46);
                            if (iCharAt12 >= 55296) {
                                int i155 = iCharAt12 & 8191;
                                int i156 = 13;
                                while (true) {
                                    i59 = i154 + 1;
                                    cCharAt8 = strB.charAt(i154);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i155 |= (cCharAt8 & 8191) << i156;
                                    i156 += 13;
                                    i154 = i59;
                                }
                                iCharAt12 = i155 | (cCharAt8 << i156);
                                i154 = i59;
                            }
                            int i157 = i48 + i48 + (iCharAt12 / 32);
                            Object obj3 = objArrC[i157];
                            int i158 = i154;
                            if (obj3 instanceof Field) {
                                fieldX = (Field) obj3;
                            } else {
                                fieldX = x(cls2, (String) obj3);
                                objArrC[i157] = fieldX;
                            }
                            int i159 = iCharAt12;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldX);
                            int i160 = i159 % 32;
                            i57 = iObjectFieldOffset;
                            i55 = i158;
                            c15 = 55296;
                            i58 = i160;
                        }
                        int i161 = i126 + 1;
                        iArr3[i126] = iCharAt9;
                        int i162 = i126 + 2;
                        i66 = i56;
                        if ((iCharAt10 & 512) != 0) {
                            i67 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i67 = 0;
                        }
                        if ((iCharAt10 & 256) != 0) {
                            i68 = 268435456;
                        } else {
                            i68 = 0;
                        }
                        if (i66 != 0) {
                            i69 = PKIFailureInfo.systemUnavail;
                        } else {
                            i69 = 0;
                        }
                        iArr3[i161] = i67 | i68 | i69 | (i136 << 20) | i57;
                        i126 += 3;
                        iArr3[i162] = (i58 << 20) | i49;
                        strB = strB;
                        c16 = c15;
                        t00Var = t00Var2;
                        i95 = i55;
                        length = i47;
                        i16 = i48;
                    } else {
                        i65 = 1;
                        i18 += 2;
                    }
                    int i163 = i126 / 3;
                    objArr[i163 + i163 + i65] = objArrC[i147];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                    i49 = 1048575;
                    if ((iCharAt10 & PKIFailureInfo.certConfirmed) != 0) {
                    }
                    c15 = 55296;
                    i55 = i46;
                    i56 = i137;
                    i57 = iObjectFieldOffset;
                    i58 = 0;
                    int i164 = i126 + 1;
                    iArr3[i126] = iCharAt9;
                    int i165 = i126 + 2;
                    i66 = i56;
                    if ((iCharAt10 & 512) != 0) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 0;
                    }
                    if ((iCharAt10 & 256) != 0) {
                        i68 = 268435456;
                    } else {
                        i68 = 0;
                    }
                    if (i66 != 0) {
                        i69 = PKIFailureInfo.systemUnavail;
                    } else {
                        i69 = 0;
                    }
                    iArr3[i164] = i67 | i68 | i69 | (i136 << 20) | i57;
                    i126 += 3;
                    iArr3[i165] = (i58 << 20) | i49;
                    strB = strB;
                    c16 = c15;
                    t00Var = t00Var2;
                    i95 = i55;
                    length = i47;
                    i16 = i48;
                }
                i18 = i147;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX4);
                i49 = 1048575;
                if ((iCharAt10 & PKIFailureInfo.certConfirmed) != 0) {
                }
                c15 = 55296;
                i55 = i46;
                i56 = i137;
                i57 = iObjectFieldOffset;
                i58 = 0;
                int i166 = i126 + 1;
                iArr3[i126] = iCharAt9;
                int i167 = i126 + 2;
                i66 = i56;
                if ((iCharAt10 & 512) != 0) {
                    i67 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i67 = 0;
                }
                if ((iCharAt10 & 256) != 0) {
                    i68 = 268435456;
                } else {
                    i68 = 0;
                }
                if (i66 != 0) {
                    i69 = PKIFailureInfo.systemUnavail;
                } else {
                    i69 = 0;
                }
                iArr3[i166] = i67 | i68 | i69 | (i136 << 20) | i57;
                i126 += 3;
                iArr3[i167] = (i58 << 20) | i49;
                strB = strB;
                c16 = c15;
                t00Var = t00Var2;
                i95 = i55;
                length = i47;
                i16 = i48;
            }
            i49 = iObjectFieldOffset2;
            i56 = i137;
            int i168 = i126 + 1;
            iArr3[i126] = iCharAt9;
            int i169 = i126 + 2;
            i66 = i56;
            if ((iCharAt10 & 512) != 0) {
                i67 = PKIFailureInfo.duplicateCertReq;
            } else {
                i67 = 0;
            }
            if ((iCharAt10 & 256) != 0) {
                i68 = 268435456;
            } else {
                i68 = 0;
            }
            if (i66 != 0) {
                i69 = PKIFailureInfo.systemUnavail;
            } else {
                i69 = 0;
            }
            iArr3[i168] = i67 | i68 | i69 | (i136 << 20) | i57;
            i126 += 3;
            iArr3[i169] = (i58 << 20) | i49;
            strB = strB;
            c16 = c15;
            t00Var = t00Var2;
            i95 = i55;
            length = i47;
            i16 = i48;
        }
        return new k00(iArr3, objArr, i19, i17, t00Var.zzb(), false, iArr, i26, i122, n00Var, szVar, h10Var, myVar, b00Var);
    }

    private static Field x(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e15) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb5.append("Field ");
            sb5.append(str);
            sb5.append(" for ");
            sb5.append(name);
            sb5.append(" not found. Known fields are ");
            sb5.append(string);
            throw new RuntimeException(sb5.toString(), e15);
        }
    }

    private final void y(Object obj, Object obj2, int i15) {
        if (p(obj2, i15)) {
            int iK = K(i15) & 1048575;
            Unsafe unsafe = f32682n;
            long j15 = iK;
            Object object = unsafe.getObject(obj2, j15);
            if (object == null) {
                int i16 = this.f32683a[i15];
                String string = obj2.toString();
                StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 38 + string.length());
                sb5.append("Source subfield ");
                sb5.append(i16);
                sb5.append(" is present but null: ");
                sb5.append(string);
                throw new IllegalStateException(sb5.toString());
            }
            v00 v00VarA = A(i15);
            if (!p(obj, i15)) {
                if (j(object)) {
                    Object objZza = v00VarA.zza();
                    v00VarA.b(objZza, object);
                    unsafe.putObject(obj, j15, objZza);
                } else {
                    unsafe.putObject(obj, j15, object);
                }
                q(obj, i15);
                return;
            }
            Object object2 = unsafe.getObject(obj, j15);
            if (!j(object2)) {
                Object objZza2 = v00VarA.zza();
                v00VarA.b(objZza2, object2);
                unsafe.putObject(obj, j15, objZza2);
                object2 = objZza2;
            }
            v00VarA.b(object2, object);
        }
    }

    private final void z(Object obj, Object obj2, int i15) {
        int[] iArr = this.f32683a;
        int i16 = iArr[i15];
        if (r(obj2, i16, i15)) {
            int iK = K(i15) & 1048575;
            Unsafe unsafe = f32682n;
            long j15 = iK;
            Object object = unsafe.getObject(obj2, j15);
            if (object == null) {
                int i17 = iArr[i15];
                String string = obj2.toString();
                StringBuilder sb5 = new StringBuilder(String.valueOf(i17).length() + 38 + string.length());
                sb5.append("Source subfield ");
                sb5.append(i17);
                sb5.append(" is present but null: ");
                sb5.append(string);
                throw new IllegalStateException(sb5.toString());
            }
            v00 v00VarA = A(i15);
            if (!r(obj, i16, i15)) {
                if (j(object)) {
                    Object objZza = v00VarA.zza();
                    v00VarA.b(objZza, object);
                    unsafe.putObject(obj, j15, objZza);
                } else {
                    unsafe.putObject(obj, j15, object);
                }
                t(obj, i16, i15);
                return;
            }
            Object object2 = unsafe.getObject(obj, j15);
            if (!j(object2)) {
                Object objZza2 = v00VarA.zza();
                v00VarA.b(objZza2, object2);
                unsafe.putObject(obj, j15, objZza2);
                object2 = objZza2;
            }
            v00VarA.b(object2, object);
        }
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final int a(Object obj) {
        int i15;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i16;
        int iHashCode = 0;
        for (int i17 = 0; i17 < this.f32683a.length; i17 += 3) {
            int iK = K(i17);
            int iM = M(iK);
            if (iM <= 50 || iM >= 69) {
                long j15 = iK & 1048575;
                int iHashCode2 = 37;
                switch (iM) {
                    case 0:
                        i15 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(p10.o(obj, j15));
                        byte[] bArr = jz.f32680a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 1:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(p10.m(obj, j15));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 2:
                        i15 = iHashCode * 53;
                        jDoubleToLongBits = p10.i(obj, j15);
                        byte[] bArr2 = jz.f32680a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 3:
                        i15 = iHashCode * 53;
                        jDoubleToLongBits = p10.i(obj, j15);
                        byte[] bArr3 = jz.f32680a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 4:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.g(obj, j15);
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 5:
                        i15 = iHashCode * 53;
                        jDoubleToLongBits = p10.i(obj, j15);
                        byte[] bArr4 = jz.f32680a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 6:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.g(obj, j15);
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 7:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = jz.b(p10.k(obj, j15));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 8:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = ((String) p10.q(obj, j15)).hashCode();
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 9:
                        i16 = iHashCode * 53;
                        Object objQ = p10.q(obj, j15);
                        if (objQ != null) {
                            iHashCode2 = objQ.hashCode();
                        }
                        iHashCode = i16 + iHashCode2;
                        break;
                    case 10:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.q(obj, j15).hashCode();
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 11:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.g(obj, j15);
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 12:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.g(obj, j15);
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 13:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.g(obj, j15);
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 14:
                        i15 = iHashCode * 53;
                        jDoubleToLongBits = p10.i(obj, j15);
                        byte[] bArr5 = jz.f32680a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 15:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.g(obj, j15);
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 16:
                        i15 = iHashCode * 53;
                        jDoubleToLongBits = p10.i(obj, j15);
                        byte[] bArr6 = jz.f32680a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 17:
                        i16 = iHashCode * 53;
                        Object objQ2 = p10.q(obj, j15);
                        if (objQ2 != null) {
                            iHashCode2 = objQ2.hashCode();
                        }
                        iHashCode = i16 + iHashCode2;
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
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.q(obj, j15).hashCode();
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                    case 50:
                        i15 = iHashCode * 53;
                        iFloatToIntBits = p10.q(obj, j15).hashCode();
                        iHashCode = i15 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i18 = this.f32692j;
        while (true) {
            int[] iArr = this.f32690h;
            if (i18 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((az) obj).zzc.hashCode();
                return this.f32688f ? (iHashCode3 * 53) + ((xy) obj).zzb.f33463a.hashCode() : iHashCode3;
            }
            int i19 = iArr[i18];
            if (!r(obj, 0, i19)) {
                iHashCode = (iHashCode * 53) + p10.q(obj, K(i19) & 1048575).hashCode();
            }
            i18++;
        }
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final void b(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        int i15 = 0;
        while (true) {
            int[] iArr = this.f32683a;
            if (i15 >= iArr.length) {
                w00.d(this.f32693k, obj, obj2);
                if (this.f32688f) {
                    w00.c(this.f32694l, obj, obj2);
                    return;
                }
                return;
            }
            int iK = K(i15);
            int i16 = 1048575 & iK;
            int iM = M(iK);
            int i17 = iArr[i15];
            long j15 = i16;
            switch (iM) {
                case 0:
                    if (p(obj2, i15)) {
                        p10.p(obj, j15, p10.o(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 1:
                    if (p(obj2, i15)) {
                        p10.n(obj, j15, p10.m(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 2:
                    if (p(obj2, i15)) {
                        p10.j(obj, j15, p10.i(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 3:
                    if (p(obj2, i15)) {
                        p10.j(obj, j15, p10.i(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 4:
                    if (p(obj2, i15)) {
                        p10.h(obj, j15, p10.g(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 5:
                    if (p(obj2, i15)) {
                        p10.j(obj, j15, p10.i(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 6:
                    if (p(obj2, i15)) {
                        p10.h(obj, j15, p10.g(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 7:
                    if (p(obj2, i15)) {
                        p10.l(obj, j15, p10.k(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 8:
                    if (p(obj2, i15)) {
                        p10.r(obj, j15, p10.q(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 9:
                    y(obj, obj2, i15);
                    break;
                case 10:
                    if (p(obj2, i15)) {
                        p10.r(obj, j15, p10.q(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 11:
                    if (p(obj2, i15)) {
                        p10.h(obj, j15, p10.g(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 12:
                    if (p(obj2, i15)) {
                        p10.h(obj, j15, p10.g(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 13:
                    if (p(obj2, i15)) {
                        p10.h(obj, j15, p10.g(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 14:
                    if (p(obj2, i15)) {
                        p10.j(obj, j15, p10.i(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 15:
                    if (p(obj2, i15)) {
                        p10.h(obj, j15, p10.g(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 16:
                    if (p(obj2, i15)) {
                        p10.j(obj, j15, p10.i(obj2, j15));
                        q(obj, i15);
                    }
                    break;
                case 17:
                    y(obj, obj2, i15);
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
                    iz izVarA0 = (iz) p10.q(obj, j15);
                    iz izVar = (iz) p10.q(obj2, j15);
                    int size = izVarA0.size();
                    int size2 = izVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!izVarA0.zza()) {
                            izVarA0 = izVarA0.a0(size2 + size);
                        }
                        izVarA0.addAll(izVar);
                    }
                    if (size > 0) {
                        izVar = izVarA0;
                    }
                    p10.r(obj, j15, izVar);
                    break;
                case 50:
                    int i18 = w00.f34098b;
                    p10.r(obj, j15, b00.a(p10.q(obj, j15), p10.q(obj2, j15)));
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
                    if (r(obj2, i17, i15)) {
                        p10.r(obj, j15, p10.q(obj2, j15));
                        t(obj, i17, i15);
                    }
                    break;
                case 60:
                    z(obj, obj2, i15);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(obj2, i17, i15)) {
                        p10.r(obj, j15, p10.q(obj2, j15));
                        t(obj, i17, i15);
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    z(obj, obj2, i15);
                    break;
            }
            i15 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.libraries.places.internal.v00
    public final void c(Object obj, w10 w10Var) {
        Map.Entry entry;
        Iterator it;
        boolean z15;
        int i15;
        int i16;
        int i17;
        k00<T> k00Var = this;
        if (k00Var.f32688f) {
            qy qyVar = ((xy) obj).zzb;
            if (qyVar.f33463a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itD = qyVar.d();
                entry = (Map.Entry) itD.next();
                it = itD;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = k00Var.f32683a;
        Unsafe unsafe = f32682n;
        int i18 = 1048575;
        int i19 = 1048575;
        int i25 = 0;
        int i26 = 0;
        while (i25 < iArr.length) {
            int iK = k00Var.K(i25);
            int iM = M(iK);
            int i27 = iArr[i25];
            if (iM <= 17) {
                int i28 = iArr[i25 + 2];
                z15 = true;
                int i29 = i28 & i18;
                if (i29 != i19) {
                    i26 = i29 == i18 ? 0 : unsafe.getInt(obj, i29);
                    i19 = i29;
                }
                i15 = i19;
                i16 = i26;
                i17 = 1 << (i28 >>> 20);
            } else {
                z15 = true;
                i15 = i19;
                i16 = i26;
                i17 = 0;
            }
            while (true) {
                if (entry != null) {
                    my myVar = k00Var.f32694l;
                    i18 = i18;
                    if (i27 >= 525004180) {
                        myVar.c(w10Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i18 = i18;
                }
            }
            long j15 = iK & i18;
            switch (iM) {
                case 0:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.F(i27, p10.o(obj, j15));
                    }
                    break;
                case 1:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.h(i27, p10.m(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 2:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.a(i27, unsafe.getLong(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 3:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.n(i27, unsafe.getLong(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 4:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.K(i27, unsafe.getInt(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 5:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.z(i27, unsafe.getLong(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 6:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.I(i27, unsafe.getInt(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 7:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.A(i27, p10.k(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 8:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        v(i27, unsafe.getObject(obj, j15), w10Var);
                    }
                    k00Var = this;
                    break;
                case 9:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.j(i27, unsafe.getObject(obj, j15), k00Var.A(i25));
                    }
                    break;
                case 10:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.d(i27, (tx) unsafe.getObject(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 11:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.r(i27, unsafe.getInt(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 12:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.g(i27, unsafe.getInt(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 13:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.i(i27, unsafe.getInt(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 14:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.w(i27, unsafe.getLong(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 15:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.u(i27, unsafe.getInt(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 16:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.c(i27, unsafe.getLong(obj, j15));
                    }
                    k00Var = this;
                    break;
                case 17:
                    if (k00Var.o(obj, i25, i15, i16, i17)) {
                        w10Var.l(i27, unsafe.getObject(obj, j15), k00Var.A(i25));
                    }
                    break;
                case 18:
                    w00.g(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 19:
                    w00.h(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 20:
                    w00.i(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 21:
                    w00.j(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 22:
                    w00.n(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 23:
                    w00.l(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 24:
                    w00.q(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 25:
                    w00.t(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 26:
                    int i35 = iArr[i25];
                    List list = (List) unsafe.getObject(obj, j15);
                    int i36 = w00.f34098b;
                    if (list != null && !list.isEmpty()) {
                        w10Var.s(i35, list);
                    }
                    break;
                case 27:
                    int i37 = iArr[i25];
                    List list2 = (List) unsafe.getObject(obj, j15);
                    v00 v00VarA = k00Var.A(i25);
                    int i38 = w00.f34098b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i39 = 0; i39 < list2.size(); i39++) {
                            ((ey) w10Var).j(i37, list2.get(i39), v00VarA);
                        }
                    }
                    break;
                case 28:
                    int i45 = iArr[i25];
                    List list3 = (List) unsafe.getObject(obj, j15);
                    int i46 = w00.f34098b;
                    if (list3 != null && !list3.isEmpty()) {
                        w10Var.p(i45, list3);
                    }
                    break;
                case 29:
                    w00.o(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 30:
                    w00.s(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case BERTags.DATE /* 31 */:
                    w00.r(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 32:
                    w00.m(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 33:
                    w00.p(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 34:
                    w00.k(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, false);
                    break;
                case 35:
                    w00.g(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case 36:
                    w00.h(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    w00.i(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    w00.j(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    w00.n(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case 40:
                    w00.l(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    w00.q(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    w00.t(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    w00.o(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    w00.s(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    w00.r(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case 46:
                    w00.m(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case 47:
                    w00.p(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case 48:
                    w00.k(iArr[i25], (List) unsafe.getObject(obj, j15), w10Var, z15);
                    break;
                case 49:
                    int i47 = iArr[i25];
                    List list4 = (List) unsafe.getObject(obj, j15);
                    v00 v00VarA2 = k00Var.A(i25);
                    int i48 = w00.f34098b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i49 = 0; i49 < list4.size(); i49++) {
                            ((ey) w10Var).l(i47, list4.get(i49), v00VarA2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j15);
                    if (object != null) {
                        w10Var.y(i27, ((zz) k00Var.B(i25)).e(), (a00) object);
                    }
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.F(i27, ((Double) p10.q(obj, j15)).doubleValue());
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.h(i27, ((Float) p10.q(obj, j15)).floatValue());
                    }
                    break;
                case 53:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.a(i27, m(obj, j15));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.n(i27, m(obj, j15));
                    }
                    break;
                case 55:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.K(i27, l(obj, j15));
                    }
                    break;
                case 56:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.z(i27, m(obj, j15));
                    }
                    break;
                case 57:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.I(i27, l(obj, j15));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.A(i27, ((Boolean) p10.q(obj, j15)).booleanValue());
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (k00Var.r(obj, i27, i25)) {
                        v(i27, unsafe.getObject(obj, j15), w10Var);
                    }
                    break;
                case 60:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.j(i27, unsafe.getObject(obj, j15), k00Var.A(i25));
                    }
                    break;
                case 61:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.d(i27, (tx) unsafe.getObject(obj, j15));
                    }
                    break;
                case 62:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.r(i27, l(obj, j15));
                    }
                    break;
                case 63:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.g(i27, l(obj, j15));
                    }
                    break;
                case 64:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.i(i27, l(obj, j15));
                    }
                    break;
                case 65:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.w(i27, m(obj, j15));
                    }
                    break;
                case 66:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.u(i27, l(obj, j15));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.c(i27, m(obj, j15));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (k00Var.r(obj, i27, i25)) {
                        w10Var.l(i27, unsafe.getObject(obj, j15), k00Var.A(i25));
                    }
                    break;
                default:
                    break;
            }
            i25 += 3;
            i26 = i16;
            i18 = i18;
            i19 = i15;
            entry = entry;
        }
        while (entry != null) {
            k00Var.f32694l.c(w10Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((az) obj).zzc.g(w10Var);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x039e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    @Override // com.google.android.libraries.places.internal.v00
    public final int d(Object obj) {
        int i15;
        int iD;
        int iD2;
        int iE;
        int iD3;
        int iD4;
        int iD5;
        int iA;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iF;
        int iU;
        int size;
        int iV;
        int iD10;
        int iA2;
        int iD11;
        int iA3;
        int iD12;
        int iD13;
        int iD14;
        int iE2;
        int iD15;
        int iD16;
        int iD17;
        int iF2;
        int iD18;
        int iD19;
        k00<T> k00Var = this;
        Unsafe unsafe = f32682n;
        int i16 = 0;
        int i17 = 0;
        int iD20 = 0;
        int i18 = 1048575;
        while (true) {
            int[] iArr = k00Var.f32683a;
            if (i16 >= iArr.length) {
                int i19 = iD20 + ((az) obj).zzc.i();
                if (!k00Var.f32688f) {
                    return i19;
                }
                b10 b10Var = ((xy) obj).zzb.f33463a;
                int iC = b10Var.c();
                int iL = 0;
                for (int i25 = 0; i25 < iC; i25++) {
                    Map.Entry entryD = b10Var.d(i25);
                    iL += qy.l((py) ((y00) entryD).b(), entryD.getValue());
                }
                for (Map.Entry entry : b10Var.e()) {
                    iL += qy.l((py) entry.getKey(), entry.getValue());
                }
                return i19 + iL;
            }
            int iK = k00Var.K(i16);
            int iM = M(iK);
            int i26 = iArr[i16];
            int i27 = iArr[i16 + 2];
            int i28 = i27 & 1048575;
            if (iM <= 17) {
                if (i28 != i18) {
                    i17 = i28 == 1048575 ? 0 : unsafe.getInt(obj, i28);
                    i18 = i28;
                }
                i15 = 1 << (i27 >>> 20);
            } else {
                i15 = 0;
            }
            int i29 = iK & 1048575;
            if (iM >= ry.R.zza()) {
                ry.f33631x0.zza();
            }
            long j15 = i29;
            switch (iM) {
                case 0:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD20 += dy.d(i26 << 3) + 8;
                    }
                    break;
                case 1:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD = dy.d(i26 << 3);
                        iD4 = iD + 4;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 2:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        long j16 = unsafe.getLong(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.e(j16);
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 3:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        long j17 = unsafe.getLong(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.e(j17);
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 4:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        long j18 = unsafe.getInt(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.e(j18);
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 5:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD3 = dy.d(i26 << 3);
                        iD4 = iD3 + 8;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 6:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD = dy.d(i26 << 3);
                        iD4 = iD + 4;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 7:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD4 = dy.d(i26 << 3) + 1;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 8:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        int i35 = i26 << 3;
                        Object object = unsafe.getObject(obj, j15);
                        if (object instanceof tx) {
                            iD5 = dy.d(i35);
                            iA = ((tx) object).f();
                            iD6 = dy.d(iA);
                        } else {
                            iD5 = dy.d(i35);
                            iA = t10.a((String) object);
                            iD6 = dy.d(iA);
                        }
                        iD4 = iD5 + iD6 + iA;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 9:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        int i36 = i26 << 3;
                        Object object2 = unsafe.getObject(obj, j15);
                        v00 v00VarA = k00Var.A(i16);
                        int i37 = w00.f34098b;
                        iD7 = dy.d(i36);
                        iD8 = ((fx) object2).d(v00VarA);
                        iD9 = dy.d(iD8);
                        iF = iD7 + iD9 + iD8;
                        iD20 += iF;
                    }
                    break;
                case 10:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        tx txVar = (tx) unsafe.getObject(obj, j15);
                        iD5 = dy.d(i26 << 3);
                        iA = txVar.f();
                        iD6 = dy.d(iA);
                        iD4 = iD5 + iD6 + iA;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 11:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        int i38 = unsafe.getInt(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.d(i38);
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 12:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        long j19 = unsafe.getInt(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.e(j19);
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 13:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD = dy.d(i26 << 3);
                        iD4 = iD + 4;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 14:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iD3 = dy.d(i26 << 3);
                        iD4 = iD3 + 8;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 15:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        int i39 = unsafe.getInt(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.d((i39 >> 31) ^ (i39 + i39));
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 16:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        long j25 = unsafe.getLong(obj, j15);
                        iD2 = dy.d(i26 << 3);
                        iE = dy.e((j25 >> 63) ^ (j25 + j25));
                        iD4 = iD2 + iE;
                        iD20 += iD4;
                    }
                    k00Var = this;
                    break;
                case 17:
                    if (k00Var.o(obj, i16, i18, i17, i15)) {
                        iF = w00.F(i26, (g00) unsafe.getObject(obj, j15), k00Var.A(i16));
                        iD20 += iF;
                    }
                    break;
                case 18:
                    iF = w00.E(i26, (List) unsafe.getObject(obj, j15), false);
                    iD20 += iF;
                    break;
                case 19:
                    iF = w00.C(i26, (List) unsafe.getObject(obj, j15), false);
                    iD20 += iF;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j15);
                    int i45 = w00.f34098b;
                    if (list.size() == 0) {
                        iU = 0;
                    } else {
                        iU = w00.u(list) + (list.size() * dy.d(i26 << 3));
                    }
                    iD20 += iU;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j15);
                    int i46 = w00.f34098b;
                    size = list2.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iV = w00.v(list2);
                        iD10 = dy.d(i26 << 3);
                        iE2 = size * iD10;
                        iF = iV + iE2;
                    }
                    iD20 += iF;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j15);
                    int i47 = w00.f34098b;
                    size = list3.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iV = w00.y(list3);
                        iD10 = dy.d(i26 << 3);
                        iE2 = size * iD10;
                        iF = iV + iE2;
                    }
                    iD20 += iF;
                    break;
                case 23:
                    iF = w00.E(i26, (List) unsafe.getObject(obj, j15), false);
                    iD20 += iF;
                    break;
                case 24:
                    iF = w00.C(i26, (List) unsafe.getObject(obj, j15), false);
                    iD20 += iF;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j15);
                    int i48 = w00.f34098b;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iF = 0;
                    } else {
                        iF = size2 * (dy.d(i26 << 3) + 1);
                    }
                    iD20 += iF;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j15);
                    int i49 = w00.f34098b;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iU = 0;
                    } else {
                        iU = dy.d(i26 << 3) * size3;
                        if (list5 instanceof rz) {
                            rz rzVar = (rz) list5;
                            for (int i55 = 0; i55 < size3; i55++) {
                                Object objA = rzVar.a();
                                if (objA instanceof tx) {
                                    iA3 = ((tx) objA).f();
                                    iD12 = dy.d(iA3);
                                } else {
                                    iA3 = t10.a((String) objA);
                                    iD12 = dy.d(iA3);
                                }
                                iU += iD12 + iA3;
                            }
                        } else {
                            for (int i56 = 0; i56 < size3; i56++) {
                                Object obj2 = list5.get(i56);
                                if (obj2 instanceof tx) {
                                    iA2 = ((tx) obj2).f();
                                    iD11 = dy.d(iA2);
                                } else {
                                    iA2 = t10.a((String) obj2);
                                    iD11 = dy.d(iA2);
                                }
                                iU += iD11 + iA2;
                            }
                        }
                    }
                    iD20 += iU;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j15);
                    v00 v00VarA2 = k00Var.A(i16);
                    int i57 = w00.f34098b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iD13 = 0;
                    } else {
                        iD13 = dy.d(i26 << 3) * size4;
                        for (int i58 = 0; i58 < size4; i58++) {
                            int iD21 = ((fx) list6.get(i58)).d(v00VarA2);
                            iD13 += dy.d(iD21) + iD21;
                        }
                    }
                    iD20 += iD13;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j15);
                    int i59 = w00.f34098b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iD14 = 0;
                    } else {
                        iD14 = size5 * dy.d(i26 << 3);
                        for (int i65 = 0; i65 < list7.size(); i65++) {
                            int iF3 = ((tx) list7.get(i65)).f();
                            iD14 += dy.d(iF3) + iF3;
                        }
                    }
                    iD20 += iD14;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j15);
                    int i66 = w00.f34098b;
                    size = list8.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iV = w00.z(list8);
                        iD10 = dy.d(i26 << 3);
                        iE2 = size * iD10;
                        iF = iV + iE2;
                    }
                    iD20 += iF;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j15);
                    int i67 = w00.f34098b;
                    size = list9.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iV = w00.x(list9);
                        iD10 = dy.d(i26 << 3);
                        iE2 = size * iD10;
                        iF = iV + iE2;
                    }
                    iD20 += iF;
                    break;
                case BERTags.DATE /* 31 */:
                    iF = w00.C(i26, (List) unsafe.getObject(obj, j15), false);
                    iD20 += iF;
                    break;
                case 32:
                    iF = w00.E(i26, (List) unsafe.getObject(obj, j15), false);
                    iD20 += iF;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j15);
                    int i68 = w00.f34098b;
                    size = list10.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iV = w00.A(list10);
                        iD10 = dy.d(i26 << 3);
                        iE2 = size * iD10;
                        iF = iV + iE2;
                    }
                    iD20 += iF;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j15);
                    int i69 = w00.f34098b;
                    size = list11.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iV = w00.w(list11);
                        iD10 = dy.d(i26 << 3);
                        iE2 = size * iD10;
                        iF = iV + iE2;
                    }
                    iD20 += iF;
                    break;
                case 35:
                    iD15 = w00.D((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case 36:
                    iD15 = w00.B((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    iD15 = w00.u((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    iD15 = w00.v((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    iD15 = w00.y((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case 40:
                    iD15 = w00.D((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    iD15 = w00.B((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j15);
                    int i75 = w00.f34098b;
                    iD15 = list12.size();
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iD15 = w00.z((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    iD15 = w00.x((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    iD15 = w00.B((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case 46:
                    iD15 = w00.D((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case 47:
                    iD15 = w00.A((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case 48:
                    iD15 = w00.w((List) unsafe.getObject(obj, j15));
                    if (iD15 > 0) {
                        iD16 = dy.d(i26 << 3);
                        iD17 = dy.d(iD15);
                        iD14 = iD16 + iD17 + iD15;
                        iD20 += iD14;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j15);
                    v00 v00VarA3 = k00Var.A(i16);
                    int i76 = w00.f34098b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iF2 = 0;
                    } else {
                        iF2 = 0;
                        for (int i77 = 0; i77 < size6; i77++) {
                            iF2 += w00.F(i26, (g00) list13.get(i77), v00VarA3);
                        }
                    }
                    iD20 += iF2;
                    break;
                case 50:
                    a00 a00Var = (a00) unsafe.getObject(obj, j15);
                    zz zzVar = (zz) k00Var.B(i16);
                    if (a00Var.isEmpty()) {
                        iU = 0;
                    } else {
                        iU = 0;
                        for (Map.Entry entry2 : a00Var.entrySet()) {
                            iU += zzVar.d(i26, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iD20 += iU;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (k00Var.r(obj, i26, i16)) {
                        iD18 = dy.d(i26 << 3);
                        iF = iD18 + 8;
                        iD20 += iF;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (k00Var.r(obj, i26, i16)) {
                        iD19 = dy.d(i26 << 3);
                        iF = iD19 + 4;
                        iD20 += iF;
                    }
                    break;
                case 53:
                    if (k00Var.r(obj, i26, i16)) {
                        long jM = m(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.e(jM);
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (k00Var.r(obj, i26, i16)) {
                        long jM2 = m(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.e(jM2);
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case 55:
                    if (k00Var.r(obj, i26, i16)) {
                        long jL = l(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.e(jL);
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case 56:
                    if (k00Var.r(obj, i26, i16)) {
                        iD18 = dy.d(i26 << 3);
                        iF = iD18 + 8;
                        iD20 += iF;
                    }
                    break;
                case 57:
                    if (k00Var.r(obj, i26, i16)) {
                        iD19 = dy.d(i26 << 3);
                        iF = iD19 + 4;
                        iD20 += iF;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (k00Var.r(obj, i26, i16)) {
                        iF = dy.d(i26 << 3) + 1;
                        iD20 += iF;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (k00Var.r(obj, i26, i16)) {
                        int i78 = i26 << 3;
                        Object object3 = unsafe.getObject(obj, j15);
                        if (object3 instanceof tx) {
                            iD7 = dy.d(i78);
                            iD8 = ((tx) object3).f();
                            iD9 = dy.d(iD8);
                        } else {
                            iD7 = dy.d(i78);
                            iD8 = t10.a((String) object3);
                            iD9 = dy.d(iD8);
                        }
                        iF = iD7 + iD9 + iD8;
                        iD20 += iF;
                    }
                    break;
                case 60:
                    if (k00Var.r(obj, i26, i16)) {
                        int i79 = i26 << 3;
                        Object object4 = unsafe.getObject(obj, j15);
                        v00 v00VarA4 = k00Var.A(i16);
                        int i85 = w00.f34098b;
                        iD7 = dy.d(i79);
                        iD8 = ((fx) object4).d(v00VarA4);
                        iD9 = dy.d(iD8);
                        iF = iD7 + iD9 + iD8;
                        iD20 += iF;
                    }
                    break;
                case 61:
                    if (k00Var.r(obj, i26, i16)) {
                        tx txVar2 = (tx) unsafe.getObject(obj, j15);
                        iD7 = dy.d(i26 << 3);
                        iD8 = txVar2.f();
                        iD9 = dy.d(iD8);
                        iF = iD7 + iD9 + iD8;
                        iD20 += iF;
                    }
                    break;
                case 62:
                    if (k00Var.r(obj, i26, i16)) {
                        int iL2 = l(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.d(iL2);
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case 63:
                    if (k00Var.r(obj, i26, i16)) {
                        long jL2 = l(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.e(jL2);
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case 64:
                    if (k00Var.r(obj, i26, i16)) {
                        iD19 = dy.d(i26 << 3);
                        iF = iD19 + 4;
                        iD20 += iF;
                    }
                    break;
                case 65:
                    if (k00Var.r(obj, i26, i16)) {
                        iD18 = dy.d(i26 << 3);
                        iF = iD18 + 8;
                        iD20 += iF;
                    }
                    break;
                case 66:
                    if (k00Var.r(obj, i26, i16)) {
                        int iL3 = l(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.d((iL3 >> 31) ^ (iL3 + iL3));
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (k00Var.r(obj, i26, i16)) {
                        long jM3 = m(obj, j15);
                        iV = dy.d(i26 << 3);
                        iE2 = dy.e((jM3 >> 63) ^ (jM3 + jM3));
                        iF = iV + iE2;
                        iD20 += iF;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (k00Var.r(obj, i26, i16)) {
                        iF = w00.F(i26, (g00) unsafe.getObject(obj, j15), k00Var.A(i16));
                        iD20 += iF;
                    }
                    break;
            }
            i16 += 3;
        }
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final boolean e(Object obj, Object obj2) {
        boolean zB;
        for (int i15 = 0; i15 < this.f32683a.length; i15 += 3) {
            int iK = K(i15);
            int iM = M(iK);
            if (iM <= 50 || iM >= 69) {
                long j15 = iK & 1048575;
                switch (iM) {
                    case 0:
                        if (!n(obj, obj2, i15) || Double.doubleToLongBits(p10.o(obj, j15)) != Double.doubleToLongBits(p10.o(obj2, j15))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!n(obj, obj2, i15) || Float.floatToIntBits(p10.m(obj, j15)) != Float.floatToIntBits(p10.m(obj2, j15))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!n(obj, obj2, i15) || p10.i(obj, j15) != p10.i(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!n(obj, obj2, i15) || p10.i(obj, j15) != p10.i(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!n(obj, obj2, i15) || p10.g(obj, j15) != p10.g(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!n(obj, obj2, i15) || p10.i(obj, j15) != p10.i(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!n(obj, obj2, i15) || p10.g(obj, j15) != p10.g(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!n(obj, obj2, i15) || p10.k(obj, j15) != p10.k(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!n(obj, obj2, i15) || !w00.b(p10.q(obj, j15), p10.q(obj2, j15))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!n(obj, obj2, i15) || !w00.b(p10.q(obj, j15), p10.q(obj2, j15))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!n(obj, obj2, i15) || !w00.b(p10.q(obj, j15), p10.q(obj2, j15))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!n(obj, obj2, i15) || p10.g(obj, j15) != p10.g(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!n(obj, obj2, i15) || p10.g(obj, j15) != p10.g(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!n(obj, obj2, i15) || p10.g(obj, j15) != p10.g(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!n(obj, obj2, i15) || p10.i(obj, j15) != p10.i(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!n(obj, obj2, i15) || p10.g(obj, j15) != p10.g(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!n(obj, obj2, i15) || p10.i(obj, j15) != p10.i(obj2, j15)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!n(obj, obj2, i15) || !w00.b(p10.q(obj, j15), p10.q(obj2, j15))) {
                            return false;
                        }
                        continue;
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
                        zB = w00.b(p10.q(obj, j15), p10.q(obj2, j15));
                        break;
                    case 50:
                        zB = w00.b(p10.q(obj, j15), p10.q(obj2, j15));
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
                        if (!s(obj, obj2, i15) || !w00.b(p10.q(obj, j15), p10.q(obj2, j15))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zB) {
                    return false;
                }
            }
        }
        int i16 = this.f32692j;
        while (true) {
            int[] iArr = this.f32690h;
            if (i16 >= iArr.length) {
                if (!((az) obj).zzc.equals(((az) obj2).zzc)) {
                    return false;
                }
                if (this.f32688f) {
                    return ((xy) obj).zzb.equals(((xy) obj2).zzb);
                }
                return true;
            }
            int i17 = iArr[i16];
            if (!s(obj, obj2, i17)) {
                return false;
            }
            if (!r(obj, 0, i17)) {
                long jK = K(i17) & 1048575;
                if (!w00.b(p10.q(obj, jK), p10.q(obj2, jK))) {
                    return false;
                }
            }
            i16++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0752 A[LOOP:4: B:226:0x074e->B:228:0x0752, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0765  */
    /* JADX WARN: Code duplicated, block: B:236:0x0771 A[LOOP:3: B:234:0x076d->B:236:0x0771, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0785  */
    /* JADX WARN: Code duplicated, block: B:242:0x073c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x074b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d A[Catch: all -> 0x01ea, TryCatch #4 {all -> 0x01ea, blocks: (B:28:0x006a, B:35:0x007c, B:36:0x0081, B:38:0x0089, B:39:0x008d, B:72:0x0190, B:80:0x01b5, B:77:0x019d, B:79:0x01a3, B:41:0x0093, B:42:0x009d, B:43:0x00a7, B:44:0x00b1, B:45:0x00bb, B:46:0x00c2, B:47:0x00c3, B:48:0x00cd, B:49:0x00d3, B:51:0x00db, B:53:0x00f0, B:54:0x00fb, B:55:0x0100, B:56:0x010c, B:58:0x0114, B:60:0x0129, B:61:0x0134, B:62:0x0139, B:63:0x0144, B:64:0x0149, B:65:0x0152, B:66:0x015b, B:67:0x0164, B:68:0x016d, B:69:0x0176, B:70:0x017f, B:71:0x0188, B:81:0x01ba, B:82:0x01bd, B:84:0x01c0, B:85:0x01c5, B:32:0x0072, B:95:0x01f0, B:100:0x0200), top: B:246:0x006a }] */
    @Override // com.google.android.libraries.places.internal.v00
    public final void f(Object obj, u00 u00Var, ly lyVar) throws Throwable {
        Object obj2;
        int i15;
        Object objH;
        h10 h10Var;
        int i16;
        Object objH2;
        Object obj3;
        Object objG;
        int iOrdinal;
        Object objE;
        k00<T> k00Var;
        int i17;
        Object obj4;
        k00<T> k00Var2 = this;
        lyVar.getClass();
        k(obj);
        h10 h10Var2 = k00Var2.f32693k;
        Object objH3 = null;
        qy qyVarA = null;
        while (true) {
            try {
                int iZzb = u00Var.zzb();
                if (iZzb < k00Var2.f32685c || iZzb > k00Var2.f32686d) {
                    i16 = -1;
                } else {
                    int[] iArr = k00Var2.f32683a;
                    int length = (iArr.length / 3) - 1;
                    int i18 = 0;
                    while (true) {
                        if (i18 > length) {
                            i16 = -1;
                        } else {
                            int i19 = (length + i18) >>> 1;
                            int i25 = i19 * 3;
                            int i26 = iArr[i25];
                            if (iZzb == i26) {
                                i16 = i25;
                            } else if (iZzb < i26) {
                                length = i19 - 1;
                            } else {
                                i18 = i19 + 1;
                            }
                        }
                    }
                }
                if (i16 >= 0) {
                    obj3 = obj;
                    int iK = k00Var2.K(i16);
                    try {
                        try {
                            switch (M(iK)) {
                                case 0:
                                    k00Var = k00Var2;
                                    p10.p(obj3, iK & 1048575, u00Var.d());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 1:
                                    k00Var = k00Var2;
                                    p10.n(obj3, iK & 1048575, u00Var.f());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 2:
                                    k00Var = k00Var2;
                                    p10.j(obj3, iK & 1048575, u00Var.j());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 3:
                                    k00Var = k00Var2;
                                    p10.j(obj3, iK & 1048575, u00Var.i());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 4:
                                    k00Var = k00Var2;
                                    p10.h(obj3, iK & 1048575, u00Var.o());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 5:
                                    k00Var = k00Var2;
                                    p10.j(obj3, iK & 1048575, u00Var.k());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 6:
                                    k00Var = k00Var2;
                                    p10.h(obj3, iK & 1048575, u00Var.h());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 7:
                                    k00Var = k00Var2;
                                    p10.l(obj3, iK & 1048575, u00Var.A());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 8:
                                    k00Var = k00Var2;
                                    k00Var.J(obj3, iK, u00Var);
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 9:
                                    k00Var = k00Var2;
                                    g00 g00Var = (g00) k00Var.D(obj3, i16);
                                    u00Var.y(g00Var, k00Var.A(i16), lyVar);
                                    k00Var.E(obj3, i16, g00Var);
                                    k00Var2 = k00Var;
                                    break;
                                case 10:
                                    k00Var = k00Var2;
                                    p10.r(obj3, iK & 1048575, u00Var.M());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 11:
                                    k00Var = k00Var2;
                                    p10.h(obj3, iK & 1048575, u00Var.O());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 12:
                                    k00Var = k00Var2;
                                    int I = u00Var.I();
                                    ez ezVarC = k00Var.C(i16);
                                    if (ezVarC == null || ezVarC.b(I)) {
                                        p10.h(obj3, iK & 1048575, I);
                                        k00Var.q(obj3, i16);
                                    } else {
                                        objH3 = w00.f(obj3, iZzb, I, objH3, h10Var2);
                                    }
                                    k00Var2 = k00Var;
                                    break;
                                case 13:
                                    k00Var = k00Var2;
                                    p10.h(obj3, iK & 1048575, u00Var.J());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 14:
                                    k00Var = k00Var2;
                                    p10.j(obj3, iK & 1048575, u00Var.K());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 15:
                                    k00Var = k00Var2;
                                    p10.h(obj3, iK & 1048575, u00Var.v());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 16:
                                    k00Var = k00Var2;
                                    p10.j(obj3, iK & 1048575, u00Var.l());
                                    k00Var.q(obj3, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 17:
                                    k00Var = k00Var2;
                                    g00 g00Var2 = (g00) k00Var.D(obj3, i16);
                                    u00Var.C(g00Var2, k00Var.A(i16), lyVar);
                                    k00Var.E(obj3, i16, g00Var2);
                                    k00Var2 = k00Var;
                                    break;
                                case 18:
                                    k00Var = k00Var2;
                                    u00Var.t(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 19:
                                    k00Var = k00Var2;
                                    u00Var.w(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 20:
                                    k00Var = k00Var2;
                                    u00Var.z(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 21:
                                    k00Var = k00Var2;
                                    u00Var.D(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 22:
                                    k00Var = k00Var2;
                                    u00Var.p(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 23:
                                    k00Var = k00Var2;
                                    u00Var.m(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 24:
                                    k00Var = k00Var2;
                                    u00Var.u(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 25:
                                    k00Var = k00Var2;
                                    u00Var.r(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 26:
                                    k00Var = k00Var2;
                                    if (i(iK)) {
                                        ((yx) u00Var).P(sz.a(obj3, iK & 1048575), true);
                                    } else {
                                        ((yx) u00Var).P(sz.a(obj3, iK & 1048575), false);
                                    }
                                    k00Var2 = k00Var;
                                    break;
                                case 27:
                                    k00Var = k00Var2;
                                    u00Var.e(sz.a(obj3, iK & 1048575), k00Var.A(i16), lyVar);
                                    k00Var2 = k00Var;
                                    break;
                                case 28:
                                    k00Var = k00Var2;
                                    u00Var.N(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 29:
                                    k00Var = k00Var2;
                                    u00Var.L(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 30:
                                    k00Var = k00Var2;
                                    List listA = sz.a(obj3, iK & 1048575);
                                    u00Var.F(listA);
                                    objH3 = w00.e(obj3, iZzb, listA, k00Var.C(i16), objH3, h10Var2);
                                    k00Var2 = k00Var;
                                    break;
                                case BERTags.DATE /* 31 */:
                                    k00Var = k00Var2;
                                    u00Var.E(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 32:
                                    k00Var = k00Var2;
                                    u00Var.H(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 33:
                                    k00Var = k00Var2;
                                    u00Var.G(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 34:
                                    k00Var = k00Var2;
                                    u00Var.x(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 35:
                                    k00Var = k00Var2;
                                    u00Var.t(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 36:
                                    k00Var = k00Var2;
                                    u00Var.w(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                                    k00Var = k00Var2;
                                    u00Var.z(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                                    k00Var = k00Var2;
                                    u00Var.D(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                                    k00Var = k00Var2;
                                    u00Var.p(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 40:
                                    k00Var = k00Var2;
                                    u00Var.m(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                    k00Var = k00Var2;
                                    u00Var.u(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.CURRENCY_CODE /* 42 */:
                                    k00Var = k00Var2;
                                    u00Var.r(sz.a(obj3, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.DATE_OF_BIRTH /* 43 */:
                                    k00Var = k00Var2;
                                    obj2 = obj3;
                                    try {
                                        u00Var.L(sz.a(obj2, iK & 1048575));
                                    } catch (kz unused) {
                                        if (objH3 == null) {
                                            try {
                                                objH3 = h10Var2.h(obj2);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                k00Var2 = k00Var;
                                                i15 = k00Var2.f32691i;
                                                objH = objH3;
                                                while (i15 < k00Var2.f32692j) {
                                                    h10 h10Var3 = h10Var2;
                                                    objH = k00Var2.H(obj2, k00Var2.f32690h[i15], objH, h10Var3, obj);
                                                    i15++;
                                                    k00Var2 = this;
                                                    h10Var2 = h10Var3;
                                                }
                                                h10Var = h10Var2;
                                                if (objH != null) {
                                                    h10Var.i(obj2, objH);
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!h10Var2.k(objH3, u00Var, 0)) {
                                            objH2 = objH3;
                                            for (i17 = k00Var.f32691i; i17 < k00Var.f32692j; i17++) {
                                                h10 h10Var4 = h10Var2;
                                                objH2 = k00Var.H(obj2, k00Var.f32690h[i17], objH2, h10Var4, obj);
                                                h10Var2 = h10Var4;
                                            }
                                            if (objH2 != null) {
                                                h10Var2.i(obj2, objH2);
                                            }
                                        }
                                    }
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                    k00Var = k00Var2;
                                    List listA2 = sz.a(obj3, iK & 1048575);
                                    u00Var.F(listA2);
                                    objH3 = w00.e(obj3, iZzb, listA2, k00Var.C(i16), objH3, h10Var2);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    u00Var.E(sz.a(obj4, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 46:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    u00Var.H(sz.a(obj4, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 47:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    u00Var.G(sz.a(obj4, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 48:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    u00Var.x(sz.a(obj4, iK & 1048575));
                                    k00Var2 = k00Var;
                                    break;
                                case 49:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    u00Var.n(sz.a(obj4, iK & 1048575), k00Var.A(i16), lyVar);
                                    k00Var2 = k00Var;
                                    break;
                                case 50:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    Object objB = k00Var.B(i16);
                                    long jK = k00Var.K(i16) & 1048575;
                                    Object objQ = p10.q(obj4, jK);
                                    if (objQ == null) {
                                        objQ = a00.b().e();
                                        p10.r(obj4, jK, objQ);
                                    } else if (!((a00) objQ).i()) {
                                        Object objE2 = a00.b().e();
                                        b00.a(objE2, objQ);
                                        p10.r(obj4, jK, objE2);
                                        objQ = objE2;
                                    }
                                    u00Var.B((a00) objQ, ((zz) objB).e(), lyVar);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.TRANSACTION_DATE /* 51 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Double.valueOf(u00Var.d()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Float.valueOf(u00Var.f()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 53:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Long.valueOf(u00Var.j()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.CURRENCY_EXPONENT /* 54 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Long.valueOf(u00Var.i()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 55:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Integer.valueOf(u00Var.o()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 56:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Long.valueOf(u00Var.k()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 57:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Integer.valueOf(u00Var.h()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Boolean.valueOf(u00Var.A()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    k00Var.J(obj4, iK, u00Var);
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 60:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    g00 g00Var3 = (g00) k00Var.F(obj4, iZzb, i16);
                                    u00Var.y(g00Var3, k00Var.A(i16), lyVar);
                                    k00Var.G(obj4, iZzb, i16, g00Var3);
                                    k00Var2 = k00Var;
                                    break;
                                case 61:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, u00Var.M());
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 62:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Integer.valueOf(u00Var.O()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 63:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    int I2 = u00Var.I();
                                    ez ezVarC2 = k00Var.C(i16);
                                    if (ezVarC2 == null || ezVarC2.b(I2)) {
                                        p10.r(obj4, iK & 1048575, Integer.valueOf(I2));
                                        k00Var.t(obj4, iZzb, i16);
                                    } else {
                                        objH3 = w00.f(obj4, iZzb, I2, objH3, h10Var2);
                                    }
                                    k00Var2 = k00Var;
                                    break;
                                case 64:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Integer.valueOf(u00Var.J()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 65:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Long.valueOf(u00Var.K()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case 66:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Integer.valueOf(u00Var.v()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    p10.r(obj4, iK & 1048575, Long.valueOf(u00Var.l()));
                                    k00Var.t(obj4, iZzb, i16);
                                    k00Var2 = k00Var;
                                    break;
                                case EACTags.APPLICATION_IMAGE /* 68 */:
                                    k00Var = k00Var2;
                                    obj4 = obj3;
                                    try {
                                        g00 g00Var4 = (g00) k00Var.F(obj4, iZzb, i16);
                                        u00Var.C(g00Var4, k00Var.A(i16), lyVar);
                                        k00Var.G(obj4, iZzb, i16, g00Var4);
                                    } catch (kz unused2) {
                                        obj2 = obj4;
                                        if (objH3 == null) {
                                            objH3 = h10Var2.h(obj2);
                                        }
                                        if (!h10Var2.k(objH3, u00Var, 0)) {
                                            objH2 = objH3;
                                            while (i17 < k00Var.f32692j) {
                                                h10 h10Var5 = h10Var2;
                                                objH2 = k00Var.H(obj2, k00Var.f32690h[i17], objH2, h10Var5, obj);
                                                h10Var2 = h10Var5;
                                            }
                                            if (objH2 != null) {
                                                h10Var2.i(obj2, objH2);
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj4;
                                        k00Var2 = k00Var;
                                        i15 = k00Var2.f32691i;
                                        objH = objH3;
                                        while (i15 < k00Var2.f32692j) {
                                            h10 h10Var6 = h10Var2;
                                            objH = k00Var2.H(obj2, k00Var2.f32690h[i15], objH, h10Var6, obj);
                                            i15++;
                                            k00Var2 = this;
                                            h10Var2 = h10Var6;
                                        }
                                        h10Var = h10Var2;
                                        if (objH != null) {
                                            h10Var.i(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    k00Var2 = k00Var;
                                    break;
                                default:
                                    if (objH3 == null) {
                                        objH3 = h10Var2.h(obj3);
                                    }
                                    try {
                                        if (h10Var2.k(objH3, u00Var, 0)) {
                                            k00Var = k00Var2;
                                            k00Var2 = k00Var;
                                        } else {
                                            int i27 = k00Var2.f32691i;
                                            objH2 = objH3;
                                            while (i27 < k00Var2.f32692j) {
                                                h10 h10Var7 = h10Var2;
                                                Object obj5 = obj3;
                                                objH2 = k00Var2.H(obj5, k00Var2.f32690h[i27], objH2, h10Var7, obj);
                                                h10Var2 = h10Var7;
                                                i27++;
                                                obj3 = obj5;
                                                k00Var2 = k00Var2;
                                            }
                                            obj2 = obj3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        k00Var = k00Var2;
                                        obj4 = obj3;
                                        obj2 = obj4;
                                        k00Var2 = k00Var;
                                        i15 = k00Var2.f32691i;
                                        objH = objH3;
                                        while (i15 < k00Var2.f32692j) {
                                            h10 h10Var8 = h10Var2;
                                            objH = k00Var2.H(obj2, k00Var2.f32690h[i15], objH, h10Var8, obj);
                                            i15++;
                                            k00Var2 = this;
                                            h10Var2 = h10Var8;
                                        }
                                        h10Var = h10Var2;
                                        if (objH != null) {
                                            h10Var.i(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (kz unused3) {
                            k00Var = k00Var2;
                            obj2 = obj3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = obj3;
                        i15 = k00Var2.f32691i;
                        objH = objH3;
                        while (i15 < k00Var2.f32692j) {
                            h10 h10Var9 = h10Var2;
                            objH = k00Var2.H(obj2, k00Var2.f32690h[i15], objH, h10Var9, obj);
                            i15++;
                            k00Var2 = this;
                            h10Var2 = h10Var9;
                        }
                        h10Var = h10Var2;
                        if (objH != null) {
                            h10Var.i(obj2, objH);
                        }
                        throw th;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objH2 = objH3;
                    for (int i28 = k00Var2.f32691i; i28 < k00Var2.f32692j; i28++) {
                        h10 h10Var10 = h10Var2;
                        objH2 = k00Var2.H(obj, k00Var2.f32690h[i28], objH2, h10Var10, obj);
                        h10Var2 = h10Var10;
                    }
                    obj2 = obj;
                } else {
                    obj3 = obj;
                    try {
                        boolean z15 = k00Var2.f32688f;
                        my myVar = k00Var2.f32694l;
                        zy zyVarB = !z15 ? null : lyVar.b(k00Var2.f32687e, iZzb);
                        if (zyVarB != null) {
                            if (qyVarA == null) {
                                qyVarA = myVar.a(obj3);
                            }
                            yy yyVar = zyVarB.f34576b;
                            u10 u10Var = u10.f33840r;
                            u10 u10Var2 = yyVar.f34446b;
                            if (u10Var2 == u10Var) {
                                u00Var.o();
                                throw null;
                            }
                            switch (u10Var2.ordinal()) {
                                case 0:
                                    objG = Double.valueOf(u00Var.d());
                                    iOrdinal = u10Var2.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objE = qyVarA.e(yyVar)) != null) {
                                        byte[] bArr = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 1:
                                    objG = Float.valueOf(u00Var.f());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr3 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 2:
                                    objG = Long.valueOf(u00Var.j());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr4 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr5 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 3:
                                    objG = Long.valueOf(u00Var.i());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr6 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr7 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 4:
                                    objG = Integer.valueOf(u00Var.o());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr8 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr9 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 5:
                                    objG = Long.valueOf(u00Var.k());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr10 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr11 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 6:
                                    objG = Integer.valueOf(u00Var.h());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr12 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr13 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 7:
                                    objG = Boolean.valueOf(u00Var.A());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr14 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr15 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 8:
                                    objG = u00Var.q();
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr16 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr17 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 9:
                                    Object objE3 = qyVarA.e(yyVar);
                                    if (objE3 instanceof az) {
                                        v00 v00VarB = r00.a().b(objE3.getClass());
                                        if (!((az) objE3).C()) {
                                            Object objZza = v00VarB.zza();
                                            v00VarB.b(objZza, objE3);
                                            qyVarA.f(yyVar, objZza);
                                            objE3 = objZza;
                                        }
                                        u00Var.C(objE3, v00VarB, lyVar);
                                    } else {
                                        objG = u00Var.s(zyVarB.f34575a.getClass(), lyVar);
                                        iOrdinal = u10Var2.ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr18 = jz.f32680a;
                                            objG = ((g00) objE).g().d1((g00) objG).u();
                                        } else {
                                            byte[] bArr19 = jz.f32680a;
                                            objG = ((g00) objE).g().d1((g00) objG).u();
                                        }
                                        qyVarA.f(yyVar, objG);
                                    }
                                    break;
                                case 10:
                                    Object objE4 = qyVarA.e(yyVar);
                                    if (objE4 instanceof az) {
                                        v00 v00VarB2 = r00.a().b(objE4.getClass());
                                        if (!((az) objE4).C()) {
                                            Object objZza2 = v00VarB2.zza();
                                            v00VarB2.b(objZza2, objE4);
                                            qyVarA.f(yyVar, objZza2);
                                            objE4 = objZza2;
                                        }
                                        u00Var.y(objE4, v00VarB2, lyVar);
                                    } else {
                                        objG = u00Var.g(zyVarB.f34575a.getClass(), lyVar);
                                        iOrdinal = u10Var2.ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr110 = jz.f32680a;
                                            objG = ((g00) objE).g().d1((g00) objG).u();
                                        } else {
                                            byte[] bArr111 = jz.f32680a;
                                            objG = ((g00) objE).g().d1((g00) objG).u();
                                        }
                                        qyVarA.f(yyVar, objG);
                                    }
                                    break;
                                case 11:
                                    objG = u00Var.M();
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr112 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr113 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 12:
                                    objG = Integer.valueOf(u00Var.O());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr114 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr115 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objG = Integer.valueOf(u00Var.J());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr116 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr117 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 15:
                                    objG = Long.valueOf(u00Var.K());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr118 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr119 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 16:
                                    objG = Integer.valueOf(u00Var.v());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1110 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr1111 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                case 17:
                                    objG = Long.valueOf(u00Var.l());
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1112 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr1113 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                                default:
                                    objG = null;
                                    iOrdinal = u10Var2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1114 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    } else {
                                        byte[] bArr1115 = jz.f32680a;
                                        objG = ((g00) objE).g().d1((g00) objG).u();
                                    }
                                    qyVarA.f(yyVar, objG);
                                    break;
                            }
                        } else {
                            if (objH3 == null) {
                                objH3 = h10Var2.h(obj3);
                            }
                            if (!h10Var2.k(objH3, u00Var, 0)) {
                                objH2 = objH3;
                                for (int i29 = k00Var2.f32691i; i29 < k00Var2.f32692j; i29++) {
                                    h10 h10Var11 = h10Var2;
                                    Object obj6 = obj3;
                                    objH2 = k00Var2.H(obj6, k00Var2.f32690h[i29], objH2, h10Var11, obj);
                                    obj3 = obj6;
                                    h10Var2 = h10Var11;
                                }
                                obj2 = obj3;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = obj3;
                        i15 = k00Var2.f32691i;
                        objH = objH3;
                        while (i15 < k00Var2.f32692j) {
                            h10 h10Var12 = h10Var2;
                            objH = k00Var2.H(obj2, k00Var2.f32690h[i15], objH, h10Var12, obj);
                            i15++;
                            k00Var2 = this;
                            h10Var2 = h10Var12;
                        }
                        h10Var = h10Var2;
                        if (objH != null) {
                            h10Var.i(obj2, objH);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                obj2 = obj;
            }
        }
        if (objH2 != null) {
            h10Var2.i(obj2, objH2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[LOOP:2: B:52:0x00d2->B:57:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.v00
    public final boolean g(Object obj) {
        int i15;
        int i16;
        List list;
        v00 v00VarA;
        int i17;
        int i18 = 0;
        int i19 = 0;
        int i25 = 1048575;
        while (i18 < this.f32691i) {
            int i26 = this.f32690h[i18];
            int iK = K(i26);
            int[] iArr = this.f32683a;
            int i27 = iArr[i26 + 2];
            int i28 = i27 & 1048575;
            int i29 = 1 << (i27 >>> 20);
            if (i28 != i25) {
                if (i28 != 1048575) {
                    i19 = f32682n.getInt(obj, i28);
                }
                i16 = i19;
                i15 = i28;
            } else {
                i15 = i25;
                i16 = i19;
            }
            Object obj2 = obj;
            if ((268435456 & iK) != 0 && !o(obj2, i26, i15, i16, i29)) {
                return false;
            }
            int iM = M(iK);
            if (iM == 9 || iM == 17) {
                if (o(obj2, i26, i15, i16, i29) && !I(obj2, iK, A(i26))) {
                    return false;
                }
            } else if (iM == 27) {
                list = (List) p10.q(obj2, iK & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    v00VarA = A(i26);
                    for (i17 = 0; i17 < list.size(); i17++) {
                        if (!v00VarA.g(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (iM == 60 || iM == 68) {
                if (r(obj2, iArr[i26], i26) && !I(obj2, iK, A(i26))) {
                    return false;
                }
            } else if (iM == 49) {
                list = (List) p10.q(obj2, iK & 1048575);
                if (list.isEmpty()) {
                    v00VarA = A(i26);
                    while (i17 < list.size()) {
                        if (!v00VarA.g(list.get(i17))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM != 50) {
                continue;
            } else {
                a00 a00Var = (a00) p10.q(obj2, iK & 1048575);
                if (!a00Var.isEmpty() && ((zz) B(i26)).e().f34453c.b() == v10.MESSAGE) {
                    v00 v00VarB = null;
                    for (Object obj3 : a00Var.values()) {
                        if (v00VarB == null) {
                            v00VarB = r00.a().b(obj3.getClass());
                        }
                        if (!v00VarB.g(obj3)) {
                            return false;
                        }
                    }
                }
            }
            i18++;
            obj = obj2;
            i25 = i15;
            i19 = i16;
        }
        return !this.f32688f || ((xy) obj).zzb.g();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.v00
    public final void h(Object obj) {
        if (j(obj)) {
            if (obj instanceof az) {
                az azVar = (az) obj;
                azVar.p(Integer.MAX_VALUE);
                azVar.zza = 0;
                azVar.D();
            }
            int[] iArr = this.f32683a;
            for (int i15 = 0; i15 < iArr.length; i15 += 3) {
                int iK = K(i15);
                int i16 = 1048575 & iK;
                int iM = M(iK);
                long j15 = i16;
                if (iM != 9) {
                    if (iM != 60 && iM != 68) {
                        switch (iM) {
                            case 17:
                                if (p(obj, i15)) {
                                    A(i15).h(f32682n.getObject(obj, j15));
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
                                ((iz) p10.q(obj, j15)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f32682n;
                                Object object = unsafe.getObject(obj, j15);
                                if (object != null) {
                                    ((a00) object).g();
                                    unsafe.putObject(obj, j15, object);
                                }
                                break;
                        }
                    } else if (r(obj, iArr[i15], i15)) {
                        A(i15).h(f32682n.getObject(obj, j15));
                    }
                } else if (p(obj, i15)) {
                    A(i15).h(f32682n.getObject(obj, j15));
                }
            }
            this.f32693k.j(obj);
            if (this.f32688f) {
                this.f32694l.b(obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.v00
    public final Object zza() {
        return ((az) this.f32687e).E();
    }
}
