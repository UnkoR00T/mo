package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
final class u4<T> implements k5<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f30252l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Unsafe f30253m = f6.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f30254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f30255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r4 f30258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f30259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f30260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f30262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final y5 f30263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x2 f30264k;

    private u4(int[] iArr, Object[] objArr, int i15, int i16, r4 r4Var, boolean z15, int[] iArr2, int i17, int i18, x4 x4Var, d4 d4Var, y5 y5Var, x2 x2Var, m4 m4Var) {
        this.f30254a = iArr;
        this.f30255b = objArr;
        this.f30256c = i15;
        this.f30257d = i16;
        boolean z16 = false;
        if (x2Var != null && (r4Var instanceof i3)) {
            z16 = true;
        }
        this.f30259f = z16;
        this.f30260g = iArr2;
        this.f30261h = i17;
        this.f30262i = i18;
        this.f30263j = y5Var;
        this.f30264k = x2Var;
        this.f30258e = r4Var;
    }

    private final int A(int i15) {
        return this.f30254a[i15 + 2];
    }

    private final int B(int i15, int i16) {
        int length = (this.f30254a.length / 3) - 1;
        while (i16 <= length) {
            int i17 = (length + i16) >>> 1;
            int i18 = i17 * 3;
            int i19 = this.f30254a[i18];
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

    private static int C(int i15) {
        return (i15 >>> 20) & GF2Field.MASK;
    }

    private final int D(int i15) {
        return this.f30254a[i15 + 1];
    }

    private static long E(Object obj, long j15) {
        return ((Long) f6.k(obj, j15)).longValue();
    }

    private final p3 F(int i15) {
        int i16 = i15 / 3;
        return (p3) this.f30255b[i16 + i16 + 1];
    }

    private final k5 G(int i15) {
        Object[] objArr = this.f30255b;
        int i16 = i15 / 3;
        int i17 = i16 + i16;
        k5 k5Var = (k5) objArr[i17];
        if (k5Var != null) {
            return k5Var;
        }
        k5 k5VarB = z4.a().b((Class) objArr[i17 + 1]);
        this.f30255b[i17] = k5VarB;
        return k5VarB;
    }

    private final Object H(int i15) {
        int i16 = i15 / 3;
        return this.f30255b[i16 + i16];
    }

    private final Object I(Object obj, int i15) {
        k5 k5VarG = G(i15);
        int iD = D(i15) & 1048575;
        if (!m(obj, i15)) {
            return k5VarG.d();
        }
        Object object = f30253m.getObject(obj, iD);
        if (p(object)) {
            return object;
        }
        Object objD = k5VarG.d();
        if (object != null) {
            k5VarG.V(objD, object);
        }
        return objD;
    }

    private final Object J(Object obj, int i15, int i16) {
        k5 k5VarG = G(i16);
        if (!q(obj, i15, i16)) {
            return k5VarG.d();
        }
        Object object = f30253m.getObject(obj, D(i16) & 1048575);
        if (p(object)) {
            return object;
        }
        Object objD = k5VarG.d();
        if (object != null) {
            k5VarG.V(objD, object);
        }
        return objD;
    }

    private static Field K(Class cls, String str) {
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

    private static void a(Object obj) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void e(Object obj, Object obj2, int i15) {
        if (m(obj2, i15)) {
            int iD = D(i15) & 1048575;
            Unsafe unsafe = f30253m;
            long j15 = iD;
            Object object = unsafe.getObject(obj2, j15);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f30254a[i15] + " is present but null: " + obj2.toString());
            }
            k5 k5VarG = G(i15);
            if (!m(obj, i15)) {
                if (p(object)) {
                    Object objD = k5VarG.d();
                    k5VarG.V(objD, object);
                    unsafe.putObject(obj, j15, objD);
                } else {
                    unsafe.putObject(obj, j15, object);
                }
                h(obj, i15);
                return;
            }
            Object object2 = unsafe.getObject(obj, j15);
            if (!p(object2)) {
                Object objD2 = k5VarG.d();
                k5VarG.V(objD2, object2);
                unsafe.putObject(obj, j15, objD2);
                object2 = objD2;
            }
            k5VarG.V(object2, object);
        }
    }

    private final void g(Object obj, Object obj2, int i15) {
        int i16 = this.f30254a[i15];
        if (q(obj2, i16, i15)) {
            int iD = D(i15) & 1048575;
            Unsafe unsafe = f30253m;
            long j15 = iD;
            Object object = unsafe.getObject(obj2, j15);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f30254a[i15] + " is present but null: " + obj2.toString());
            }
            k5 k5VarG = G(i15);
            if (!q(obj, i16, i15)) {
                if (p(object)) {
                    Object objD = k5VarG.d();
                    k5VarG.V(objD, object);
                    unsafe.putObject(obj, j15, objD);
                } else {
                    unsafe.putObject(obj, j15, object);
                }
                i(obj, i16, i15);
                return;
            }
            Object object2 = unsafe.getObject(obj, j15);
            if (!p(object2)) {
                Object objD2 = k5VarG.d();
                k5VarG.V(objD2, object2);
                unsafe.putObject(obj, j15, objD2);
                object2 = objD2;
            }
            k5VarG.V(object2, object);
        }
    }

    private final void h(Object obj, int i15) {
        int iA = A(i15);
        long j15 = 1048575 & iA;
        if (j15 == 1048575) {
            return;
        }
        f6.v(obj, j15, (1 << (iA >>> 20)) | f6.h(obj, j15));
    }

    private final void i(Object obj, int i15, int i16) {
        f6.v(obj, A(i16) & 1048575, i15);
    }

    private final void j(Object obj, int i15, Object obj2) {
        f30253m.putObject(obj, D(i15) & 1048575, obj2);
        h(obj, i15);
    }

    private final void k(Object obj, int i15, int i16, Object obj2) {
        f30253m.putObject(obj, D(i16) & 1048575, obj2);
        i(obj, i15, i16);
    }

    private final boolean l(Object obj, Object obj2, int i15) {
        return m(obj, i15) == m(obj2, i15);
    }

    private final boolean m(Object obj, int i15) {
        int iA = A(i15);
        long j15 = iA & 1048575;
        if (j15 != 1048575) {
            return (f6.h(obj, j15) & (1 << (iA >>> 20))) != 0;
        }
        int iD = D(i15);
        long j16 = iD & 1048575;
        switch (C(iD)) {
            case 0:
                return Double.doubleToRawLongBits(f6.f(obj, j16)) != 0;
            case 1:
                return Float.floatToRawIntBits(f6.g(obj, j16)) != 0;
            case 2:
                return f6.i(obj, j16) != 0;
            case 3:
                return f6.i(obj, j16) != 0;
            case 4:
                return f6.h(obj, j16) != 0;
            case 5:
                return f6.i(obj, j16) != 0;
            case 6:
                return f6.h(obj, j16) != 0;
            case 7:
                return f6.B(obj, j16);
            case 8:
                Object objK = f6.k(obj, j16);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof j2) {
                    return !j2.f29738b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return f6.k(obj, j16) != null;
            case 10:
                return !j2.f29738b.equals(f6.k(obj, j16));
            case 11:
                return f6.h(obj, j16) != 0;
            case 12:
                return f6.h(obj, j16) != 0;
            case 13:
                return f6.h(obj, j16) != 0;
            case 14:
                return f6.i(obj, j16) != 0;
            case 15:
                return f6.h(obj, j16) != 0;
            case 16:
                return f6.i(obj, j16) != 0;
            case 17:
                return f6.k(obj, j16) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean n(Object obj, int i15, int i16, int i17, int i18) {
        if (i16 == 1048575) {
            return m(obj, i15);
        }
        return (i17 & i18) != 0;
    }

    private static boolean o(Object obj, int i15, k5 k5Var) {
        return k5Var.f(f6.k(obj, i15 & 1048575));
    }

    private static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof l3) {
            return ((l3) obj).F();
        }
        return true;
    }

    private final boolean q(Object obj, int i15, int i16) {
        return f6.h(obj, (long) (A(i16) & 1048575)) == i15;
    }

    private static boolean r(Object obj, long j15) {
        return ((Boolean) f6.k(obj, j15)).booleanValue();
    }

    private static final void s(int i15, Object obj, o6 o6Var) {
        if (obj instanceof String) {
            o6Var.O(i15, (String) obj);
        } else {
            o6Var.T(i15, (j2) obj);
        }
    }

    static z5 v(Object obj) {
        l3 l3Var = (l3) obj;
        z5 z5Var = l3Var.zzc;
        if (z5Var != z5.c()) {
            return z5Var;
        }
        z5 z5VarF = z5.f();
        l3Var.zzc = z5VarF;
        return z5VarF;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static u4 w(Class cls, o4 o4Var, x4 x4Var, d4 d4Var, y5 y5Var, x2 x2Var, m4 m4Var) {
        int i15;
        int iCharAt;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        int[] iArr;
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
        int iObjectFieldOffset;
        char c15;
        int iObjectFieldOffset2;
        int i48;
        int i49;
        int i55;
        Field fieldK;
        char cCharAt9;
        int i56;
        int i57;
        int i58;
        int i59;
        int i65;
        Object obj;
        Field fieldK2;
        int i66;
        Object obj2;
        Field fieldK3;
        int i67;
        char cCharAt10;
        int i68;
        char cCharAt11;
        int i69;
        char cCharAt12;
        int i75;
        char cCharAt13;
        if (!(o4Var instanceof b5)) {
            throw null;
        }
        b5 b5Var = (b5) o4Var;
        String strB = b5Var.b();
        int length = strB.length();
        char c16 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i76 = 1;
            while (true) {
                i15 = i76 + 1;
                if (strB.charAt(i76) < 55296) {
                    break;
                }
                i76 = i15;
            }
        } else {
            i15 = 1;
        }
        int i77 = i15 + 1;
        int iCharAt2 = strB.charAt(i15);
        if (iCharAt2 >= 55296) {
            int i78 = iCharAt2 & 8191;
            int i79 = 13;
            while (true) {
                i75 = i77 + 1;
                cCharAt13 = strB.charAt(i77);
                if (cCharAt13 < 55296) {
                    break;
                }
                i78 |= (cCharAt13 & 8191) << i79;
                i79 += 13;
                i77 = i75;
            }
            iCharAt2 = i78 | (cCharAt13 << i79);
            i77 = i75;
        }
        if (iCharAt2 == 0) {
            i17 = 0;
            i25 = 0;
            iCharAt = 0;
            i16 = 0;
            i18 = 0;
            i19 = 0;
            iArr = f30252l;
            i26 = 0;
        } else {
            int i85 = i77 + 1;
            int iCharAt3 = strB.charAt(i77);
            if (iCharAt3 >= 55296) {
                int i86 = iCharAt3 & 8191;
                int i87 = 13;
                while (true) {
                    i39 = i85 + 1;
                    cCharAt8 = strB.charAt(i85);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i86 |= (cCharAt8 & 8191) << i87;
                    i87 += 13;
                    i85 = i39;
                }
                iCharAt3 = i86 | (cCharAt8 << i87);
                i85 = i39;
            }
            int i88 = i85 + 1;
            int iCharAt4 = strB.charAt(i85);
            if (iCharAt4 >= 55296) {
                int i89 = iCharAt4 & 8191;
                int i95 = 13;
                while (true) {
                    i38 = i88 + 1;
                    cCharAt7 = strB.charAt(i88);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i89 |= (cCharAt7 & 8191) << i95;
                    i95 += 13;
                    i88 = i38;
                }
                iCharAt4 = i89 | (cCharAt7 << i95);
                i88 = i38;
            }
            int i96 = i88 + 1;
            int iCharAt5 = strB.charAt(i88);
            if (iCharAt5 >= 55296) {
                int i97 = iCharAt5 & 8191;
                int i98 = 13;
                while (true) {
                    i37 = i96 + 1;
                    cCharAt6 = strB.charAt(i96);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i97 |= (cCharAt6 & 8191) << i98;
                    i98 += 13;
                    i96 = i37;
                }
                iCharAt5 = i97 | (cCharAt6 << i98);
                i96 = i37;
            }
            int i99 = i96 + 1;
            int iCharAt6 = strB.charAt(i96);
            if (iCharAt6 >= 55296) {
                int i100 = iCharAt6 & 8191;
                int i101 = 13;
                while (true) {
                    i36 = i99 + 1;
                    cCharAt5 = strB.charAt(i99);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i100 |= (cCharAt5 & 8191) << i101;
                    i101 += 13;
                    i99 = i36;
                }
                iCharAt6 = i100 | (cCharAt5 << i101);
                i99 = i36;
            }
            int i102 = i99 + 1;
            iCharAt = strB.charAt(i99);
            if (iCharAt >= 55296) {
                int i103 = iCharAt & 8191;
                int i104 = 13;
                while (true) {
                    i35 = i102 + 1;
                    cCharAt4 = strB.charAt(i102);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i103 |= (cCharAt4 & 8191) << i104;
                    i104 += 13;
                    i102 = i35;
                }
                iCharAt = i103 | (cCharAt4 << i104);
                i102 = i35;
            }
            int i105 = i102 + 1;
            int iCharAt7 = strB.charAt(i102);
            if (iCharAt7 >= 55296) {
                int i106 = iCharAt7 & 8191;
                int i107 = 13;
                while (true) {
                    i29 = i105 + 1;
                    cCharAt3 = strB.charAt(i105);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i106 |= (cCharAt3 & 8191) << i107;
                    i107 += 13;
                    i105 = i29;
                }
                iCharAt7 = i106 | (cCharAt3 << i107);
                i105 = i29;
            }
            int i108 = i105 + 1;
            int iCharAt8 = strB.charAt(i105);
            if (iCharAt8 >= 55296) {
                int i109 = iCharAt8 & 8191;
                int i110 = 13;
                while (true) {
                    i28 = i108 + 1;
                    cCharAt2 = strB.charAt(i108);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i109 |= (cCharAt2 & 8191) << i110;
                    i110 += 13;
                    i108 = i28;
                }
                iCharAt8 = i109 | (cCharAt2 << i110);
                i108 = i28;
            }
            int i111 = i108 + 1;
            int iCharAt9 = strB.charAt(i108);
            if (iCharAt9 >= 55296) {
                int i112 = iCharAt9 & 8191;
                int i113 = 13;
                while (true) {
                    i27 = i111 + 1;
                    cCharAt = strB.charAt(i111);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i112 |= (cCharAt & 8191) << i113;
                    i113 += 13;
                    i111 = i27;
                }
                iCharAt9 = i112 | (cCharAt << i113);
                i111 = i27;
            }
            int i114 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i115 = iCharAt7;
            i16 = iCharAt5;
            i17 = i115;
            i18 = iCharAt6;
            i19 = iCharAt9;
            i25 = i114;
            iArr = iArr2;
            i26 = iCharAt3;
            i77 = i111;
        }
        Unsafe unsafe = f30253m;
        Object[] objArrC = b5Var.c();
        Class<?> cls2 = b5Var.zza().getClass();
        int i116 = i19 + i17;
        int i117 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i117];
        int i118 = i19;
        int i119 = i116;
        int i120 = 0;
        int i121 = 0;
        while (i77 < length) {
            int i122 = i77 + 1;
            int iCharAt10 = strB.charAt(i77);
            if (iCharAt10 >= c16) {
                int i123 = iCharAt10 & 8191;
                int i124 = i122;
                int i125 = 13;
                while (true) {
                    i69 = i124 + 1;
                    cCharAt12 = strB.charAt(i124);
                    if (cCharAt12 < c16) {
                        break;
                    }
                    i123 |= (cCharAt12 & 8191) << i125;
                    i125 += 13;
                    i124 = i69;
                }
                iCharAt10 = i123 | (cCharAt12 << i125);
                i45 = i69;
            } else {
                i45 = i122;
            }
            int i126 = i45 + 1;
            int iCharAt11 = strB.charAt(i45);
            if (iCharAt11 >= c16) {
                int i127 = iCharAt11 & 8191;
                int i128 = i126;
                int i129 = 13;
                while (true) {
                    i68 = i128 + 1;
                    cCharAt11 = strB.charAt(i128);
                    if (cCharAt11 < c16) {
                        break;
                    }
                    i127 |= (cCharAt11 & 8191) << i129;
                    i129 += 13;
                    i128 = i68;
                }
                iCharAt11 = i127 | (cCharAt11 << i129);
                i46 = i68;
            } else {
                i46 = i126;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i121] = i120;
                i121++;
            }
            int i130 = iCharAt11 & GF2Field.MASK;
            b5 b5Var2 = b5Var;
            int i131 = iCharAt11 & 2048;
            if (i130 >= 51) {
                int i132 = i46 + 1;
                int iCharAt12 = strB.charAt(i46);
                char c17 = 55296;
                if (iCharAt12 >= 55296) {
                    int i133 = iCharAt12 & 8191;
                    int i134 = i132;
                    int i135 = 13;
                    while (true) {
                        i67 = i134 + 1;
                        cCharAt10 = strB.charAt(i134);
                        if (cCharAt10 < c17) {
                            break;
                        }
                        i133 |= (cCharAt10 & 8191) << i135;
                        i135 += 13;
                        i134 = i67;
                        c17 = 55296;
                    }
                    iCharAt12 = i133 | (cCharAt10 << i135);
                    i57 = i67;
                } else {
                    i57 = i132;
                }
                int i136 = i57;
                int i137 = i130 - 51;
                if (i137 == 9 || i137 == 17) {
                    i58 = i25 + 1;
                    int i138 = i120 / 3;
                    objArr[i138 + i138 + 1] = objArrC[i25];
                } else {
                    if (i137 != 12) {
                        i59 = i131;
                    } else if (b5Var2.a() == 1 || i131 != 0) {
                        i58 = i25 + 1;
                        int i139 = i120 / 3;
                        objArr[i139 + i139 + 1] = objArrC[i25];
                    } else {
                        i59 = 0;
                    }
                    i65 = iCharAt12 + iCharAt12;
                    obj = objArrC[i65];
                    int i140 = i59;
                    if (obj instanceof Field) {
                        fieldK2 = (Field) obj;
                    } else {
                        fieldK2 = K(cls2, (String) obj);
                        objArrC[i65] = fieldK2;
                    }
                    int i141 = i26;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK2);
                    i66 = i65 + 1;
                    obj2 = objArrC[i66];
                    i47 = i141;
                    if (obj2 instanceof Field) {
                        fieldK3 = (Field) obj2;
                    } else {
                        fieldK3 = K(cls2, (String) obj2);
                        objArrC[i66] = fieldK3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                    strB = strB;
                    i49 = i140;
                    i46 = i136;
                    i48 = 0;
                    c15 = 55296;
                }
                i25 = i58;
                i59 = i131;
                i65 = iCharAt12 + iCharAt12;
                obj = objArrC[i65];
                int i142 = i59;
                if (obj instanceof Field) {
                    fieldK2 = (Field) obj;
                } else {
                    fieldK2 = K(cls2, (String) obj);
                    objArrC[i65] = fieldK2;
                }
                int i143 = i26;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK2);
                i66 = i65 + 1;
                obj2 = objArrC[i66];
                i47 = i143;
                if (obj2 instanceof Field) {
                    fieldK3 = (Field) obj2;
                } else {
                    fieldK3 = K(cls2, (String) obj2);
                    objArrC[i66] = fieldK3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                strB = strB;
                i49 = i142;
                i46 = i136;
                i48 = 0;
                c15 = 55296;
            } else {
                i47 = i26;
                int i144 = i25 + 1;
                Field fieldK4 = K(cls2, (String) objArrC[i25]);
                if (i130 == 9 || i130 == 17) {
                    int i145 = i120 / 3;
                    objArr[i145 + i145 + 1] = fieldK4.getType();
                } else {
                    if (i130 != 27) {
                        if (i130 == 49) {
                            i25 += 2;
                            i56 = 1;
                        } else if (i130 == 12 || i130 == 30 || i130 == 44) {
                            if (b5Var2.a() == 1 || i131 != 0) {
                                i25 += 2;
                                int i146 = i120 / 3;
                                objArr[i146 + i146 + 1] = objArrC[i144];
                            } else {
                                i25 = i144;
                                i131 = 0;
                            }
                        } else if (i130 == 50) {
                            int i147 = i25 + 2;
                            int i148 = i118 + 1;
                            iArr[i118] = i120;
                            int i149 = i120 / 3;
                            int i150 = i149 + i149;
                            objArr[i150] = objArrC[i144];
                            if (i131 != 0) {
                                objArr[i150 + 1] = objArrC[i147];
                                i25 += 3;
                                i118 = i148;
                            } else {
                                i25 = i147;
                                i118 = i148;
                                i131 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                        if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0 || i130 > 17) {
                            c15 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i48 = 0;
                        } else {
                            int i151 = i46 + 1;
                            int iCharAt13 = strB.charAt(i46);
                            if (iCharAt13 >= 55296) {
                                int i152 = iCharAt13 & 8191;
                                int i153 = 13;
                                while (true) {
                                    i55 = i151 + 1;
                                    cCharAt9 = strB.charAt(i151);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i152 |= (cCharAt9 & 8191) << i153;
                                    i153 += 13;
                                    i151 = i55;
                                }
                                iCharAt13 = i152 | (cCharAt9 << i153);
                            } else {
                                i55 = i151;
                            }
                            int i154 = i47 + i47 + (iCharAt13 / 32);
                            Object obj3 = objArrC[i154];
                            if (obj3 instanceof Field) {
                                fieldK = (Field) obj3;
                            } else {
                                fieldK = K(cls2, (String) obj3);
                                objArrC[i154] = fieldK;
                            }
                            int i155 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK);
                            i48 = i155 % 32;
                            i46 = i55;
                            c15 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i130 >= 18 && i130 <= 49) {
                            iArr[i119] = iObjectFieldOffset;
                            i119++;
                        }
                        i49 = i131;
                    } else {
                        i56 = 1;
                        i25 += 2;
                    }
                    int i156 = i120 / 3;
                    objArr[i156 + i156 + i56] = objArrC[i144];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                    if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0) {
                        c15 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i48 = 0;
                    } else {
                        c15 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i48 = 0;
                    }
                    if (i130 >= 18) {
                        iArr[i119] = iObjectFieldOffset;
                        i119++;
                    }
                    i49 = i131;
                }
                i25 = i144;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0) {
                    c15 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i48 = 0;
                } else {
                    c15 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i48 = 0;
                }
                if (i130 >= 18) {
                    iArr[i119] = iObjectFieldOffset;
                    i119++;
                }
                i49 = i131;
            }
            int i157 = i120 + 1;
            iArr3[i120] = iCharAt10;
            int i158 = i120 + 2;
            iArr3[i157] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i49 != 0 ? PKIFailureInfo.systemUnavail : 0) | (i130 << 20) | iObjectFieldOffset;
            i120 += 3;
            iArr3[i158] = (i48 << 20) | iObjectFieldOffset2;
            i77 = i46;
            strB = strB;
            c16 = c15;
            b5Var = b5Var2;
            length = length;
            i26 = i47;
        }
        return new u4(iArr3, objArr, i16, i18, b5Var.zza(), false, iArr, i19, i116, x4Var, d4Var, y5Var, x2Var, m4Var);
    }

    private static double x(Object obj, long j15) {
        return ((Double) f6.k(obj, j15)).doubleValue();
    }

    private static float y(Object obj, long j15) {
        return ((Float) f6.k(obj, j15)).floatValue();
    }

    private static int z(Object obj, long j15) {
        return ((Integer) f6.k(obj, j15)).intValue();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void V(Object obj, Object obj2) {
        a(obj);
        obj2.getClass();
        for (int i15 = 0; i15 < this.f30254a.length; i15 += 3) {
            int iD = D(i15);
            int i16 = 1048575 & iD;
            int[] iArr = this.f30254a;
            int iC = C(iD);
            int i17 = iArr[i15];
            long j15 = i16;
            switch (iC) {
                case 0:
                    if (m(obj2, i15)) {
                        f6.t(obj, j15, f6.f(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 1:
                    if (m(obj2, i15)) {
                        f6.u(obj, j15, f6.g(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 2:
                    if (m(obj2, i15)) {
                        f6.w(obj, j15, f6.i(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 3:
                    if (m(obj2, i15)) {
                        f6.w(obj, j15, f6.i(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 4:
                    if (m(obj2, i15)) {
                        f6.v(obj, j15, f6.h(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 5:
                    if (m(obj2, i15)) {
                        f6.w(obj, j15, f6.i(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 6:
                    if (m(obj2, i15)) {
                        f6.v(obj, j15, f6.h(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 7:
                    if (m(obj2, i15)) {
                        f6.r(obj, j15, f6.B(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 8:
                    if (m(obj2, i15)) {
                        f6.x(obj, j15, f6.k(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 9:
                    e(obj, obj2, i15);
                    break;
                case 10:
                    if (m(obj2, i15)) {
                        f6.x(obj, j15, f6.k(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 11:
                    if (m(obj2, i15)) {
                        f6.v(obj, j15, f6.h(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 12:
                    if (m(obj2, i15)) {
                        f6.v(obj, j15, f6.h(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 13:
                    if (m(obj2, i15)) {
                        f6.v(obj, j15, f6.h(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 14:
                    if (m(obj2, i15)) {
                        f6.w(obj, j15, f6.i(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 15:
                    if (m(obj2, i15)) {
                        f6.v(obj, j15, f6.h(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 16:
                    if (m(obj2, i15)) {
                        f6.w(obj, j15, f6.i(obj2, j15));
                        h(obj, i15);
                    }
                    break;
                case 17:
                    e(obj, obj2, i15);
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
                    s3 s3VarU0 = (s3) f6.k(obj, j15);
                    s3 s3Var = (s3) f6.k(obj2, j15);
                    int size = s3VarU0.size();
                    int size2 = s3Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!s3VarU0.a()) {
                            s3VarU0 = s3VarU0.u0(size2 + size);
                        }
                        s3VarU0.addAll(s3Var);
                    }
                    if (size > 0) {
                        s3Var = s3VarU0;
                    }
                    f6.x(obj, j15, s3Var);
                    break;
                case 50:
                    int i18 = m5.f29765b;
                    f6.x(obj, j15, m4.a(f6.k(obj, j15), f6.k(obj2, j15)));
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
                    if (q(obj2, i17, i15)) {
                        f6.x(obj, j15, f6.k(obj2, j15));
                        i(obj, i17, i15);
                    }
                    break;
                case 60:
                    g(obj, obj2, i15);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (q(obj2, i17, i15)) {
                        f6.x(obj, j15, f6.k(obj2, j15));
                        i(obj, i17, i15);
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    g(obj, obj2, i15);
                    break;
            }
        }
        m5.u(this.f30263j, obj, obj2);
        if (this.f30259f) {
            m5.t(this.f30264k, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void W(Object obj, o6 o6Var) {
        Map.Entry entry;
        Iterator it;
        int i15;
        int i16;
        int i17;
        int i18;
        u4<T> u4Var = this;
        if (u4Var.f30259f) {
            b3 b3Var = ((i3) obj).zzb;
            if (b3Var.f29647a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itF = b3Var.f();
                entry = (Map.Entry) itF.next();
                it = itF;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = u4Var.f30254a;
        Unsafe unsafe = f30253m;
        int i19 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (i19 < iArr.length) {
            int iD = u4Var.D(i19);
            int[] iArr2 = u4Var.f30254a;
            int iC = C(iD);
            int i27 = iArr2[i19];
            if (iC <= 17) {
                int i28 = iArr2[i19 + 2];
                int i29 = i28 & 1048575;
                if (i29 != i25) {
                    i15 = 1;
                    i26 = i29 == 1048575 ? 0 : unsafe.getInt(obj, i29);
                    i25 = i29;
                } else {
                    i15 = 1;
                }
                i16 = i25;
                i17 = i26;
                i18 = i15 << (i28 >>> 20);
            } else {
                i15 = 1;
                i16 = i25;
                i17 = i26;
                i18 = 0;
            }
            while (entry != null && ((j3) entry.getKey()).f29740a <= i27) {
                u4Var.f30264k.b(o6Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j15 = iD & 1048575;
            switch (iC) {
                case 0:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.F(i27, f6.f(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 1:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.c0(i27, f6.g(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 2:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.Q(i27, unsafe.getLong(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 3:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.h0(i27, unsafe.getLong(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 4:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.S(i27, unsafe.getInt(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 5:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.f0(i27, unsafe.getLong(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 6:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.I(i27, unsafe.getInt(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 7:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.k(i27, f6.B(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 8:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        s(i27, unsafe.getObject(obj, j15), o6Var);
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 9:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.P(i27, unsafe.getObject(obj, j15), u4Var.G(i19));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 10:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.T(i27, (j2) unsafe.getObject(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 11:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.Z(i27, unsafe.getInt(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 12:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.K(i27, unsafe.getInt(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 13:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.V(i27, unsafe.getInt(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 14:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.a0(i27, unsafe.getLong(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 15:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.X(i27, unsafe.getInt(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 16:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.U(i27, unsafe.getLong(obj, j15));
                    }
                    u4Var = this;
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 17:
                    if (u4Var.n(obj, i19, i16, i17, i18)) {
                        o6Var.b0(i27, unsafe.getObject(obj, j15), u4Var.G(i19));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 18:
                    m5.w(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 19:
                    m5.A(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 20:
                    m5.C(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 21:
                    m5.d(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 22:
                    m5.B(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 23:
                    m5.z(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 24:
                    m5.y(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 25:
                    m5.v(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 26:
                    int i35 = u4Var.f30254a[i19];
                    List list = (List) unsafe.getObject(obj, j15);
                    int i36 = m5.f29765b;
                    if (list != null && !list.isEmpty()) {
                        o6Var.g0(i35, list);
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 27:
                    int i37 = u4Var.f30254a[i19];
                    List list2 = (List) unsafe.getObject(obj, j15);
                    k5 k5VarG = u4Var.G(i19);
                    int i38 = m5.f29765b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i39 = 0; i39 < list2.size(); i39++) {
                            ((s2) o6Var).P(i37, list2.get(i39), k5VarG);
                        }
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 28:
                    int i45 = u4Var.f30254a[i19];
                    List list3 = (List) unsafe.getObject(obj, j15);
                    int i46 = m5.f29765b;
                    if (list3 != null && !list3.isEmpty()) {
                        o6Var.N(i45, list3);
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 29:
                    m5.c(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 30:
                    m5.x(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case BERTags.DATE /* 31 */:
                    m5.D(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 32:
                    m5.E(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 33:
                    m5.a(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 34:
                    m5.b(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, false);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 35:
                    m5.w(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 36:
                    m5.A(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    m5.C(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    m5.d(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    m5.B(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 40:
                    m5.z(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    m5.y(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    m5.v(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    m5.c(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    m5.x(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    m5.D(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 46:
                    m5.E(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 47:
                    m5.a(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 48:
                    m5.b(u4Var.f30254a[i19], (List) unsafe.getObject(obj, j15), o6Var, i15);
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 49:
                    int i47 = u4Var.f30254a[i19];
                    List list4 = (List) unsafe.getObject(obj, j15);
                    k5 k5VarG2 = u4Var.G(i19);
                    int i48 = m5.f29765b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i49 = 0; i49 < list4.size(); i49++) {
                            ((s2) o6Var).b0(i47, list4.get(i49), k5VarG2);
                        }
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j15) != null) {
                        throw null;
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.F(i27, x(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.c0(i27, y(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 53:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.Q(i27, E(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.h0(i27, E(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 55:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.S(i27, z(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 56:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.f0(i27, E(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 57:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.I(i27, z(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.k(i27, r(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (u4Var.q(obj, i27, i19)) {
                        s(i27, unsafe.getObject(obj, j15), o6Var);
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 60:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.P(i27, unsafe.getObject(obj, j15), u4Var.G(i19));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 61:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.T(i27, (j2) unsafe.getObject(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 62:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.Z(i27, z(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 63:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.K(i27, z(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 64:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.V(i27, z(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 65:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.a0(i27, E(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case 66:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.X(i27, z(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.U(i27, E(obj, j15));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (u4Var.q(obj, i27, i19)) {
                        o6Var.b0(i27, unsafe.getObject(obj, j15), u4Var.G(i19));
                    }
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
                default:
                    i19 += 3;
                    i26 = i17;
                    i25 = i16;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            u4Var.f30264k.b(o6Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((l3) obj).zzc.l(o6Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final boolean X(Object obj, Object obj2) {
        boolean zE;
        for (int i15 = 0; i15 < this.f30254a.length; i15 += 3) {
            int iD = D(i15);
            long j15 = iD & 1048575;
            switch (C(iD)) {
                case 0:
                    if (!l(obj, obj2, i15) || Double.doubleToLongBits(f6.f(obj, j15)) != Double.doubleToLongBits(f6.f(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!l(obj, obj2, i15) || Float.floatToIntBits(f6.g(obj, j15)) != Float.floatToIntBits(f6.g(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!l(obj, obj2, i15) || f6.i(obj, j15) != f6.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!l(obj, obj2, i15) || f6.i(obj, j15) != f6.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!l(obj, obj2, i15) || f6.h(obj, j15) != f6.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!l(obj, obj2, i15) || f6.i(obj, j15) != f6.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!l(obj, obj2, i15) || f6.h(obj, j15) != f6.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!l(obj, obj2, i15) || f6.B(obj, j15) != f6.B(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!l(obj, obj2, i15) || !m5.e(f6.k(obj, j15), f6.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!l(obj, obj2, i15) || !m5.e(f6.k(obj, j15), f6.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!l(obj, obj2, i15) || !m5.e(f6.k(obj, j15), f6.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!l(obj, obj2, i15) || f6.h(obj, j15) != f6.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!l(obj, obj2, i15) || f6.h(obj, j15) != f6.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!l(obj, obj2, i15) || f6.h(obj, j15) != f6.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!l(obj, obj2, i15) || f6.i(obj, j15) != f6.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!l(obj, obj2, i15) || f6.h(obj, j15) != f6.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!l(obj, obj2, i15) || f6.i(obj, j15) != f6.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!l(obj, obj2, i15) || !m5.e(f6.k(obj, j15), f6.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zE = m5.e(f6.k(obj, j15), f6.k(obj2, j15));
                    break;
                case 50:
                    zE = m5.e(f6.k(obj, j15), f6.k(obj2, j15));
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
                    long jA = A(i15) & 1048575;
                    if (f6.h(obj, jA) != f6.h(obj2, jA) || !m5.e(f6.k(obj, j15), f6.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zE) {
                return false;
            }
        }
        if (!((l3) obj).zzc.equals(((l3) obj2).zzc)) {
            return false;
        }
        if (this.f30259f) {
            return ((i3) obj).zzb.equals(((i3) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void Y(Object obj, byte[] bArr, int i15, int i16, x1 x1Var) {
        t(obj, bArr, i15, i16, 0, x1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0481  */
    /* JADX WARN: Code duplicated, block: B:280:0x0714 A[PHI: r0
      0x0714: PHI (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>) = 
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v39 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4<T>)
     binds: [B:18:0x004f, B:278:0x0707, B:248:0x0643, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final int b(Object obj) {
        int i15;
        int iA;
        int iA2;
        int iB;
        int iA3;
        int iA4;
        int iA5;
        int iH;
        int iA6;
        int iM;
        int iL;
        int size;
        int iQ;
        int iA7;
        int iA8;
        int iA9;
        int iB2;
        int iJ;
        int iA10;
        int iA11;
        int iZ;
        int iA12;
        int iA13;
        int iA14;
        int iH2;
        int iA15;
        u4<T> u4Var = this;
        Unsafe unsafe = f30253m;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int iA16 = 0;
        int i19 = 1048575;
        while (i17 < u4Var.f30254a.length) {
            int iD = u4Var.D(i17);
            int iC = C(iD);
            int[] iArr = u4Var.f30254a;
            int i25 = iArr[i17];
            int i26 = iArr[i17 + 2];
            int i27 = i26 & i16;
            if (iC <= 17) {
                if (i27 != i19) {
                    i18 = i27 == i16 ? 0 : unsafe.getInt(obj, i27);
                    i19 = i27;
                }
                i15 = 1 << (i26 >>> 20);
            } else {
                i15 = 0;
            }
            int i28 = iD & i16;
            if (iC >= c3.R.zza()) {
                c3.f29687x0.zza();
            }
            int i29 = iA16;
            long j15 = i28;
            switch (iC) {
                case 0:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA16 = i29 + r2.a(i25 << 3) + 8;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 1:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA = r2.a(i25 << 3);
                        iA4 = iA + 4;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 2:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        long j16 = unsafe.getLong(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.b(j16);
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 3:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        long j17 = unsafe.getLong(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.b(j17);
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 4:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        long j18 = unsafe.getInt(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.b(j18);
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 5:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA3 = r2.a(i25 << 3);
                        iA4 = iA3 + 8;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 6:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA = r2.a(i25 << 3);
                        iA4 = iA + 4;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 7:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA4 = r2.a(i25 << 3) + 1;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 8:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        int i35 = i25 << 3;
                        Object object = unsafe.getObject(obj, j15);
                        if (object instanceof j2) {
                            iA5 = r2.a(i35);
                            iH = ((j2) object).h();
                            iA6 = r2.a(iH);
                            iA4 = iA5 + iA6 + iH;
                            iA16 = i29 + iA4;
                            u4Var = this;
                            i17 += 3;
                            i16 = 1048575;
                        } else {
                            iA2 = r2.a(i35);
                            iB = r2.C((String) object);
                            iA4 = iA2 + iB;
                            iA16 = i29 + iA4;
                            u4Var = this;
                            i17 += 3;
                            i16 = 1048575;
                        }
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 9:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iM = m5.m(i25, unsafe.getObject(obj, j15), u4Var.G(i17));
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 10:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        j2 j2Var = (j2) unsafe.getObject(obj, j15);
                        iA5 = r2.a(i25 << 3);
                        iH = j2Var.h();
                        iA6 = r2.a(iH);
                        iA4 = iA5 + iA6 + iH;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 11:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        int i36 = unsafe.getInt(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.a(i36);
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 12:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        long j19 = unsafe.getInt(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.b(j19);
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 13:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA = r2.a(i25 << 3);
                        iA4 = iA + 4;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 14:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iA3 = r2.a(i25 << 3);
                        iA4 = iA3 + 8;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 15:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        int i37 = unsafe.getInt(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.a((i37 >> 31) ^ (i37 + i37));
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 16:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        long j25 = unsafe.getLong(obj, j15);
                        iA2 = r2.a(i25 << 3);
                        iB = r2.b((j25 >> 63) ^ (j25 + j25));
                        iA4 = iA2 + iB;
                        iA16 = i29 + iA4;
                        u4Var = this;
                        i17 += 3;
                        i16 = 1048575;
                    }
                    u4Var = this;
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 17:
                    if (u4Var.n(obj, i17, i19, i18, i15)) {
                        iM = r2.z(i25, (r4) unsafe.getObject(obj, j15), u4Var.G(i17));
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 18:
                    iM = m5.i(i25, (List) unsafe.getObject(obj, j15), false);
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 19:
                    iM = m5.g(i25, (List) unsafe.getObject(obj, j15), false);
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j15);
                    int i38 = m5.f29765b;
                    if (list.size() == 0) {
                        iL = 0;
                    } else {
                        iL = m5.l(list) + (list.size() * r2.a(i25 << 3));
                    }
                    iA16 = iL + i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j15);
                    int i39 = m5.f29765b;
                    size = list2.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = m5.q(list2);
                        iA7 = r2.a(i25 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j15);
                    int i45 = m5.f29765b;
                    size = list3.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = m5.k(list3);
                        iA7 = r2.a(i25 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 23:
                    iM = m5.i(i25, (List) unsafe.getObject(obj, j15), false);
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 24:
                    iM = m5.g(i25, (List) unsafe.getObject(obj, j15), false);
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j15);
                    int i46 = m5.f29765b;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM = 0;
                    } else {
                        iM = size2 * (r2.a(i25 << 3) + 1);
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j15);
                    int i47 = m5.f29765b;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iL = 0;
                    } else {
                        iL = r2.a(i25 << 3) * size3;
                        if (list5 instanceof c4) {
                            c4 c4Var = (c4) list5;
                            for (int i48 = 0; i48 < size3; i48++) {
                                Object objZza = c4Var.zza();
                                if (objZza instanceof j2) {
                                    int iH3 = ((j2) objZza).h();
                                    iL += r2.a(iH3) + iH3;
                                } else {
                                    iL += r2.C((String) objZza);
                                }
                            }
                        } else {
                            for (int i49 = 0; i49 < size3; i49++) {
                                Object obj2 = list5.get(i49);
                                if (obj2 instanceof j2) {
                                    int iH4 = ((j2) obj2).h();
                                    iL += r2.a(iH4) + iH4;
                                } else {
                                    iL += r2.C((String) obj2);
                                }
                            }
                        }
                    }
                    iA16 = iL + i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j15);
                    k5 k5VarG = u4Var.G(i17);
                    int i55 = m5.f29765b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iA8 = 0;
                    } else {
                        iA8 = r2.a(i25 << 3) * size4;
                        for (int i56 = 0; i56 < size4; i56++) {
                            Object obj3 = list6.get(i56);
                            if (obj3 instanceof b4) {
                                int iA17 = ((b4) obj3).a();
                                iA8 += r2.a(iA17) + iA17;
                            } else {
                                iA8 += r2.B((r4) obj3, k5VarG);
                            }
                        }
                    }
                    iA16 = i29 + iA8;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j15);
                    int i57 = m5.f29765b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iA9 = 0;
                    } else {
                        iA9 = size5 * r2.a(i25 << 3);
                        for (int i58 = 0; i58 < list7.size(); i58++) {
                            int iH5 = ((j2) list7.get(i58)).h();
                            iA9 += r2.a(iH5) + iH5;
                        }
                    }
                    iA16 = i29 + iA9;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j15);
                    int i59 = m5.f29765b;
                    size = list8.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = m5.p(list8);
                        iA7 = r2.a(i25 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j15);
                    int i65 = m5.f29765b;
                    size = list9.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = m5.f(list9);
                        iA7 = r2.a(i25 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case BERTags.DATE /* 31 */:
                    iM = m5.g(i25, (List) unsafe.getObject(obj, j15), false);
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 32:
                    iM = m5.i(i25, (List) unsafe.getObject(obj, j15), false);
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j15);
                    int i66 = m5.f29765b;
                    size = list10.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = m5.n(list10);
                        iA7 = r2.a(i25 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j15);
                    int i67 = m5.f29765b;
                    size = list11.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = m5.o(list11);
                        iA7 = r2.a(i25 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i29 + iM;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 35:
                    iJ = m5.j((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 36:
                    iJ = m5.h((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    iJ = m5.l((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    iJ = m5.q((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    iJ = m5.k((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 40:
                    iJ = m5.j((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    iJ = m5.h((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j15);
                    int i68 = m5.f29765b;
                    iJ = list12.size();
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iJ = m5.p((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    iJ = m5.f((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    iJ = m5.h((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 46:
                    iJ = m5.j((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 47:
                    iJ = m5.n((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 48:
                    iJ = m5.o((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iA10 = r2.a(i25 << 3);
                        iA11 = r2.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i29 + iA9;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j15);
                    k5 k5VarG2 = u4Var.G(i17);
                    int i69 = m5.f29765b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZ = 0;
                    } else {
                        iZ = 0;
                        for (int i75 = 0; i75 < size6; i75++) {
                            iZ += r2.z(i25, (r4) list13.get(i75), k5VarG2);
                        }
                    }
                    iA16 = i29 + iZ;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 50:
                    l4 l4Var = (l4) unsafe.getObject(obj, j15);
                    if (!l4Var.isEmpty()) {
                        Iterator it = l4Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (u4Var.q(obj, i25, i17)) {
                        iA12 = r2.a(i25 << 3);
                        iM = iA12 + 8;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (u4Var.q(obj, i25, i17)) {
                        iA13 = r2.a(i25 << 3);
                        iM = iA13 + 4;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 53:
                    if (u4Var.q(obj, i25, i17)) {
                        long jE = E(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.b(jE);
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (u4Var.q(obj, i25, i17)) {
                        long jE2 = E(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.b(jE2);
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 55:
                    if (u4Var.q(obj, i25, i17)) {
                        long jZ = z(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.b(jZ);
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 56:
                    if (u4Var.q(obj, i25, i17)) {
                        iA12 = r2.a(i25 << 3);
                        iM = iA12 + 8;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 57:
                    if (u4Var.q(obj, i25, i17)) {
                        iA13 = r2.a(i25 << 3);
                        iM = iA13 + 4;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (u4Var.q(obj, i25, i17)) {
                        iM = r2.a(i25 << 3) + 1;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (u4Var.q(obj, i25, i17)) {
                        int i76 = i25 << 3;
                        Object object2 = unsafe.getObject(obj, j15);
                        if (object2 instanceof j2) {
                            iA14 = r2.a(i76);
                            iH2 = ((j2) object2).h();
                            iA15 = r2.a(iH2);
                            iM = iA14 + iA15 + iH2;
                            iA16 = i29 + iM;
                        } else {
                            iQ = r2.a(i76);
                            iB2 = r2.C((String) object2);
                            iM = iQ + iB2;
                            iA16 = i29 + iM;
                        }
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 60:
                    if (u4Var.q(obj, i25, i17)) {
                        iM = m5.m(i25, unsafe.getObject(obj, j15), u4Var.G(i17));
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 61:
                    if (u4Var.q(obj, i25, i17)) {
                        j2 j2Var2 = (j2) unsafe.getObject(obj, j15);
                        iA14 = r2.a(i25 << 3);
                        iH2 = j2Var2.h();
                        iA15 = r2.a(iH2);
                        iM = iA14 + iA15 + iH2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 62:
                    if (u4Var.q(obj, i25, i17)) {
                        int iZ2 = z(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.a(iZ2);
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 63:
                    if (u4Var.q(obj, i25, i17)) {
                        long jZ2 = z(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.b(jZ2);
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 64:
                    if (u4Var.q(obj, i25, i17)) {
                        iA13 = r2.a(i25 << 3);
                        iM = iA13 + 4;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 65:
                    if (u4Var.q(obj, i25, i17)) {
                        iA12 = r2.a(i25 << 3);
                        iM = iA12 + 8;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case 66:
                    if (u4Var.q(obj, i25, i17)) {
                        int iZ3 = z(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.a((iZ3 >> 31) ^ (iZ3 + iZ3));
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (u4Var.q(obj, i25, i17)) {
                        long jE3 = E(obj, j15);
                        iQ = r2.a(i25 << 3);
                        iB2 = r2.b((jE3 >> 63) ^ (jE3 + jE3));
                        iM = iQ + iB2;
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (u4Var.q(obj, i25, i17)) {
                        iM = r2.z(i25, (r4) unsafe.getObject(obj, j15), u4Var.G(i17));
                        iA16 = i29 + iM;
                    } else {
                        iA16 = i29;
                    }
                    i17 += 3;
                    i16 = 1048575;
                    break;
                default:
                    iA16 = i29;
                    i17 += 3;
                    i16 = 1048575;
                    break;
            }
        }
        int iA18 = iA16 + ((l3) obj).zzc.a();
        if (!u4Var.f30259f) {
            return iA18;
        }
        b3 b3Var = ((i3) obj).zzb;
        int iC2 = b3Var.f29647a.c();
        int iA19 = 0;
        for (int i77 = 0; i77 < iC2; i77++) {
            Map.Entry entryG = b3Var.f29647a.g(i77);
            iA19 += b3.a((a3) ((o5) entryG).b(), entryG.getValue());
        }
        for (Map.Entry entry2 : b3Var.f29647a.d()) {
            iA19 += b3.a((a3) entry2.getKey(), entry2.getValue());
        }
        return iA18 + iA19;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final int c(Object obj) {
        int i15;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i16;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f30254a.length; i18 += 3) {
            int iD = D(i18);
            int[] iArr = this.f30254a;
            int i19 = 1048575 & iD;
            int iC = C(iD);
            int i25 = iArr[i18];
            long j15 = i19;
            int iHashCode = 37;
            switch (iC) {
                case 0:
                    i15 = i17 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(f6.f(obj, j15));
                    byte[] bArr = t3.f30242b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 1:
                    i15 = i17 * 53;
                    iFloatToIntBits = Float.floatToIntBits(f6.g(obj, j15));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 2:
                    i15 = i17 * 53;
                    jDoubleToLongBits = f6.i(obj, j15);
                    byte[] bArr2 = t3.f30242b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 3:
                    i15 = i17 * 53;
                    jDoubleToLongBits = f6.i(obj, j15);
                    byte[] bArr3 = t3.f30242b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 4:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 5:
                    i15 = i17 * 53;
                    jDoubleToLongBits = f6.i(obj, j15);
                    byte[] bArr4 = t3.f30242b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 6:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 7:
                    i15 = i17 * 53;
                    iFloatToIntBits = t3.a(f6.B(obj, j15));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 8:
                    i15 = i17 * 53;
                    iFloatToIntBits = ((String) f6.k(obj, j15)).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 9:
                    i16 = i17 * 53;
                    Object objK = f6.k(obj, j15);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i17 = i16 + iHashCode;
                    break;
                case 10:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.k(obj, j15).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 11:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 12:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 13:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 14:
                    i15 = i17 * 53;
                    jDoubleToLongBits = f6.i(obj, j15);
                    byte[] bArr5 = t3.f30242b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 15:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 16:
                    i15 = i17 * 53;
                    jDoubleToLongBits = f6.i(obj, j15);
                    byte[] bArr6 = t3.f30242b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 17:
                    i16 = i17 * 53;
                    Object objK2 = f6.k(obj, j15);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i17 = i16 + iHashCode;
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
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.k(obj, j15).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 50:
                    i15 = i17 * 53;
                    iFloatToIntBits = f6.k(obj, j15).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(x(obj, j15));
                        byte[] bArr7 = t3.f30242b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = Float.floatToIntBits(y(obj, j15));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = E(obj, j15);
                        byte[] bArr8 = t3.f30242b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = E(obj, j15);
                        byte[] bArr9 = t3.f30242b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = z(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = E(obj, j15);
                        byte[] bArr10 = t3.f30242b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = z(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = t3.a(r(obj, j15));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = ((String) f6.k(obj, j15)).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = f6.k(obj, j15).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = f6.k(obj, j15).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = z(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = z(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = z(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = E(obj, j15);
                        byte[] bArr11 = t3.f30242b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = z(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = E(obj, j15);
                        byte[] bArr12 = t3.f30242b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (q(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = f6.k(obj, j15).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i17 * 53) + ((l3) obj).zzc.hashCode();
        return this.f30259f ? (iHashCode2 * 53) + ((i3) obj).zzb.f29647a.hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final Object d() {
        return ((l3) this.f30258e).m();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final boolean f(Object obj) {
        int i15;
        int i16;
        List list;
        k5 k5VarG;
        int i17;
        int i18 = 0;
        int i19 = 0;
        int i25 = 1048575;
        while (i18 < this.f30261h) {
            int[] iArr = this.f30260g;
            int[] iArr2 = this.f30254a;
            int i26 = iArr[i18];
            int i27 = iArr2[i26];
            int iD = D(i26);
            int i28 = this.f30254a[i26 + 2];
            int i29 = i28 & 1048575;
            int i35 = 1 << (i28 >>> 20);
            if (i29 != i25) {
                if (i29 != 1048575) {
                    i19 = f30253m.getInt(obj, i29);
                }
                i16 = i19;
                i15 = i29;
            } else {
                i15 = i25;
                i16 = i19;
            }
            Object obj2 = obj;
            if ((268435456 & iD) != 0 && !n(obj2, i26, i15, i16, i35)) {
                return false;
            }
            int iC = C(iD);
            if (iC == 9 || iC == 17) {
                if (n(obj2, i26, i15, i16, i35) && !o(obj2, iD, G(i26))) {
                    return false;
                }
            } else if (iC == 27) {
                list = (List) f6.k(obj2, iD & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    k5VarG = G(i26);
                    for (i17 = 0; i17 < list.size(); i17++) {
                        if (!k5VarG.f(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (iC == 60 || iC == 68) {
                if (q(obj2, i27, i26) && !o(obj2, iD, G(i26))) {
                    return false;
                }
            } else if (iC == 49) {
                list = (List) f6.k(obj2, iD & 1048575);
                if (list.isEmpty()) {
                    k5VarG = G(i26);
                    while (i17 < list.size()) {
                        if (!k5VarG.f(list.get(i17))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iC == 50 && !((l4) f6.k(obj2, iD & 1048575)).isEmpty()) {
                throw null;
            }
            i18++;
            obj = obj2;
            i25 = i15;
            i19 = i16;
        }
        return !this.f30259f || ((i3) obj).zzb.k();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 39481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int t(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.mlkit_vision_barcode_bundled.x1 r39) {
        /*
            Method dump skipped, instruction units count: 3948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u4.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.x1):int");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5
    public final void u(Object obj) {
        if (p(obj)) {
            if (obj instanceof l3) {
                l3 l3Var = (l3) obj;
                l3Var.D(Integer.MAX_VALUE);
                l3Var.zza = 0;
                l3Var.B();
            }
            int[] iArr = this.f30254a;
            for (int i15 = 0; i15 < iArr.length; i15 += 3) {
                int iD = D(i15);
                int i16 = 1048575 & iD;
                int iC = C(iD);
                long j15 = i16;
                if (iC != 9) {
                    if (iC != 60 && iC != 68) {
                        switch (iC) {
                            case 17:
                                if (m(obj, i15)) {
                                    G(i15).u(f30253m.getObject(obj, j15));
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
                                ((s3) f6.k(obj, j15)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f30253m;
                                Object object = unsafe.getObject(obj, j15);
                                if (object != null) {
                                    ((l4) object).e();
                                    unsafe.putObject(obj, j15, object);
                                }
                                break;
                        }
                    } else if (q(obj, this.f30254a[i15], i15)) {
                        G(i15).u(f30253m.getObject(obj, j15));
                    }
                } else if (m(obj, i15)) {
                    G(i15).u(f30253m.getObject(obj, j15));
                }
            }
            this.f30263j.a(obj);
            if (this.f30259f) {
                this.f30264k.a(obj);
            }
        }
    }
}
