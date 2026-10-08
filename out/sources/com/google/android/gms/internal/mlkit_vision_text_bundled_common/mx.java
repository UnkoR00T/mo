package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

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
final class mx<T> implements ux<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f30509l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Unsafe f30510m = ry.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f30511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f30512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jx f30515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f30516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f30517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f30519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ky f30520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final mv f30521k;

    private mx(int[] iArr, Object[] objArr, int i15, int i16, jx jxVar, boolean z15, int[] iArr2, int i17, int i18, px pxVar, uw uwVar, ky kyVar, mv mvVar, ex exVar) {
        this.f30511a = iArr;
        this.f30512b = objArr;
        this.f30513c = i15;
        this.f30514d = i16;
        boolean z16 = false;
        if (mvVar != null && (jxVar instanceof yv)) {
            z16 = true;
        }
        this.f30516f = z16;
        this.f30517g = iArr2;
        this.f30518h = i17;
        this.f30519i = i18;
        this.f30520j = kyVar;
        this.f30521k = mvVar;
        this.f30515e = jxVar;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static mx A(Class cls, gx gxVar, px pxVar, uw uwVar, ky kyVar, mv mvVar, ex exVar) {
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
        Field fieldO;
        char cCharAt9;
        int i56;
        int i57;
        int i58;
        int i59;
        int i65;
        Object obj;
        Field fieldO2;
        int i66;
        Object obj2;
        Field fieldO3;
        int i67;
        char cCharAt10;
        int i68;
        char cCharAt11;
        int i69;
        char cCharAt12;
        int i75;
        char cCharAt13;
        if (!(gxVar instanceof tx)) {
            throw null;
        }
        tx txVar = (tx) gxVar;
        String strA = txVar.a();
        int length = strA.length();
        char c16 = 55296;
        if (strA.charAt(0) >= 55296) {
            int i76 = 1;
            while (true) {
                i15 = i76 + 1;
                if (strA.charAt(i76) < 55296) {
                    break;
                }
                i76 = i15;
            }
        } else {
            i15 = 1;
        }
        int i77 = i15 + 1;
        int iCharAt2 = strA.charAt(i15);
        if (iCharAt2 >= 55296) {
            int i78 = iCharAt2 & 8191;
            int i79 = 13;
            while (true) {
                i75 = i77 + 1;
                cCharAt13 = strA.charAt(i77);
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
            iArr = f30509l;
            i26 = 0;
        } else {
            int i85 = i77 + 1;
            int iCharAt3 = strA.charAt(i77);
            if (iCharAt3 >= 55296) {
                int i86 = iCharAt3 & 8191;
                int i87 = 13;
                while (true) {
                    i39 = i85 + 1;
                    cCharAt8 = strA.charAt(i85);
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
            int iCharAt4 = strA.charAt(i85);
            if (iCharAt4 >= 55296) {
                int i89 = iCharAt4 & 8191;
                int i95 = 13;
                while (true) {
                    i38 = i88 + 1;
                    cCharAt7 = strA.charAt(i88);
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
            int iCharAt5 = strA.charAt(i88);
            if (iCharAt5 >= 55296) {
                int i97 = iCharAt5 & 8191;
                int i98 = 13;
                while (true) {
                    i37 = i96 + 1;
                    cCharAt6 = strA.charAt(i96);
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
            int iCharAt6 = strA.charAt(i96);
            if (iCharAt6 >= 55296) {
                int i100 = iCharAt6 & 8191;
                int i101 = 13;
                while (true) {
                    i36 = i99 + 1;
                    cCharAt5 = strA.charAt(i99);
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
            iCharAt = strA.charAt(i99);
            if (iCharAt >= 55296) {
                int i103 = iCharAt & 8191;
                int i104 = 13;
                while (true) {
                    i35 = i102 + 1;
                    cCharAt4 = strA.charAt(i102);
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
            int iCharAt7 = strA.charAt(i102);
            if (iCharAt7 >= 55296) {
                int i106 = iCharAt7 & 8191;
                int i107 = 13;
                while (true) {
                    i29 = i105 + 1;
                    cCharAt3 = strA.charAt(i105);
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
            int iCharAt8 = strA.charAt(i105);
            if (iCharAt8 >= 55296) {
                int i109 = iCharAt8 & 8191;
                int i110 = 13;
                while (true) {
                    i28 = i108 + 1;
                    cCharAt2 = strA.charAt(i108);
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
            int iCharAt9 = strA.charAt(i108);
            if (iCharAt9 >= 55296) {
                int i112 = iCharAt9 & 8191;
                int i113 = 13;
                while (true) {
                    i27 = i111 + 1;
                    cCharAt = strA.charAt(i111);
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
        Unsafe unsafe = f30510m;
        Object[] objArrB = txVar.b();
        Class<?> cls2 = txVar.m().getClass();
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
            int iCharAt10 = strA.charAt(i77);
            if (iCharAt10 >= c16) {
                int i123 = iCharAt10 & 8191;
                int i124 = i122;
                int i125 = 13;
                while (true) {
                    i69 = i124 + 1;
                    cCharAt12 = strA.charAt(i124);
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
            int iCharAt11 = strA.charAt(i45);
            if (iCharAt11 >= c16) {
                int i127 = iCharAt11 & 8191;
                int i128 = i126;
                int i129 = 13;
                while (true) {
                    i68 = i128 + 1;
                    cCharAt11 = strA.charAt(i128);
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
            tx txVar2 = txVar;
            int i131 = iCharAt11 & 2048;
            if (i130 >= 51) {
                int i132 = i46 + 1;
                int iCharAt12 = strA.charAt(i46);
                char c17 = 55296;
                if (iCharAt12 >= 55296) {
                    int i133 = iCharAt12 & 8191;
                    int i134 = i132;
                    int i135 = 13;
                    while (true) {
                        i67 = i134 + 1;
                        cCharAt10 = strA.charAt(i134);
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
                    objArr[i138 + i138 + 1] = objArrB[i25];
                } else {
                    if (i137 != 12) {
                        i59 = i131;
                    } else if (txVar2.r() == 1 || i131 != 0) {
                        i58 = i25 + 1;
                        int i139 = i120 / 3;
                        objArr[i139 + i139 + 1] = objArrB[i25];
                    } else {
                        i59 = 0;
                    }
                    i65 = iCharAt12 + iCharAt12;
                    obj = objArrB[i65];
                    int i140 = i59;
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = O(cls2, (String) obj);
                        objArrB[i65] = fieldO2;
                    }
                    int i141 = i26;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO2);
                    i66 = i65 + 1;
                    obj2 = objArrB[i66];
                    i47 = i141;
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = O(cls2, (String) obj2);
                        objArrB[i66] = fieldO3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    strA = strA;
                    i49 = i140;
                    i46 = i136;
                    i48 = 0;
                    c15 = 55296;
                }
                i25 = i58;
                i59 = i131;
                i65 = iCharAt12 + iCharAt12;
                obj = objArrB[i65];
                int i142 = i59;
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = O(cls2, (String) obj);
                    objArrB[i65] = fieldO2;
                }
                int i143 = i26;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO2);
                i66 = i65 + 1;
                obj2 = objArrB[i66];
                i47 = i143;
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = O(cls2, (String) obj2);
                    objArrB[i66] = fieldO3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                strA = strA;
                i49 = i142;
                i46 = i136;
                i48 = 0;
                c15 = 55296;
            } else {
                i47 = i26;
                int i144 = i25 + 1;
                Field fieldO4 = O(cls2, (String) objArrB[i25]);
                if (i130 == 9 || i130 == 17) {
                    int i145 = i120 / 3;
                    objArr[i145 + i145 + 1] = fieldO4.getType();
                } else {
                    if (i130 != 27) {
                        if (i130 == 49) {
                            i25 += 2;
                            i56 = 1;
                        } else if (i130 == 12 || i130 == 30 || i130 == 44) {
                            if (txVar2.r() == 1 || i131 != 0) {
                                i25 += 2;
                                int i146 = i120 / 3;
                                objArr[i146 + i146 + 1] = objArrB[i144];
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
                            objArr[i150] = objArrB[i144];
                            if (i131 != 0) {
                                objArr[i150 + 1] = objArrB[i147];
                                i25 += 3;
                                i118 = i148;
                            } else {
                                i25 = i147;
                                i118 = i148;
                                i131 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        if ((iCharAt11 & PKIFailureInfo.certConfirmed) != 0 || i130 > 17) {
                            c15 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i48 = 0;
                        } else {
                            int i151 = i46 + 1;
                            int iCharAt13 = strA.charAt(i46);
                            if (iCharAt13 >= 55296) {
                                int i152 = iCharAt13 & 8191;
                                int i153 = 13;
                                while (true) {
                                    i55 = i151 + 1;
                                    cCharAt9 = strA.charAt(i151);
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
                            Object obj3 = objArrB[i154];
                            if (obj3 instanceof Field) {
                                fieldO = (Field) obj3;
                            } else {
                                fieldO = O(cls2, (String) obj3);
                                objArrB[i154] = fieldO;
                            }
                            int i155 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO);
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
                    objArr[i156 + i156 + i56] = objArrB[i144];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
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
            strA = strA;
            c16 = c15;
            txVar = txVar2;
            length = length;
            i26 = i47;
        }
        return new mx(iArr3, objArr, i16, i18, txVar.m(), false, iArr, i19, i116, pxVar, uwVar, kyVar, mvVar, exVar);
    }

    private static double B(Object obj, long j15) {
        return ((Double) ry.k(obj, j15)).doubleValue();
    }

    private static float C(Object obj, long j15) {
        return ((Float) ry.k(obj, j15)).floatValue();
    }

    private static int D(Object obj, long j15) {
        return ((Integer) ry.k(obj, j15)).intValue();
    }

    private final int E(int i15) {
        return this.f30511a[i15 + 2];
    }

    private final int F(int i15, int i16) {
        int length = (this.f30511a.length / 3) - 1;
        while (i16 <= length) {
            int i17 = (length + i16) >>> 1;
            int i18 = i17 * 3;
            int i19 = this.f30511a[i18];
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

    private static int G(int i15) {
        return (i15 >>> 20) & GF2Field.MASK;
    }

    private final int H(int i15) {
        return this.f30511a[i15 + 1];
    }

    private static long I(Object obj, long j15) {
        return ((Long) ry.k(obj, j15)).longValue();
    }

    private final fw J(int i15) {
        int i16 = i15 / 3;
        return (fw) this.f30512b[i16 + i16 + 1];
    }

    private final ux K(int i15) {
        Object[] objArr = this.f30512b;
        int i16 = i15 / 3;
        int i17 = i16 + i16;
        ux uxVar = (ux) objArr[i17];
        if (uxVar != null) {
            return uxVar;
        }
        ux uxVarB = rx.a().b((Class) objArr[i17 + 1]);
        this.f30512b[i17] = uxVarB;
        return uxVarB;
    }

    private final Object L(int i15) {
        int i16 = i15 / 3;
        return this.f30512b[i16 + i16];
    }

    private final Object M(Object obj, int i15) {
        ux uxVarK = K(i15);
        int iH = H(i15) & 1048575;
        if (!q(obj, i15)) {
            return uxVarK.b0();
        }
        Object object = f30510m.getObject(obj, iH);
        if (t(object)) {
            return object;
        }
        Object objB0 = uxVarK.b0();
        if (object != null) {
            uxVarK.b(objB0, object);
        }
        return objB0;
    }

    private final Object N(Object obj, int i15, int i16) {
        ux uxVarK = K(i16);
        if (!u(obj, i15, i16)) {
            return uxVarK.b0();
        }
        Object object = f30510m.getObject(obj, H(i16) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objB0 = uxVarK.b0();
        if (object != null) {
            uxVarK.b(objB0, object);
        }
        return objB0;
    }

    private static Field O(Class cls, String str) {
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

    private static void i(Object obj) {
        if (!t(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void j(Object obj, Object obj2, int i15) {
        if (q(obj2, i15)) {
            int iH = H(i15) & 1048575;
            Unsafe unsafe = f30510m;
            long j15 = iH;
            Object object = unsafe.getObject(obj2, j15);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f30511a[i15] + " is present but null: " + obj2.toString());
            }
            ux uxVarK = K(i15);
            if (!q(obj, i15)) {
                if (t(object)) {
                    Object objB0 = uxVarK.b0();
                    uxVarK.b(objB0, object);
                    unsafe.putObject(obj, j15, objB0);
                } else {
                    unsafe.putObject(obj, j15, object);
                }
                l(obj, i15);
                return;
            }
            Object object2 = unsafe.getObject(obj, j15);
            if (!t(object2)) {
                Object objB1 = uxVarK.b0();
                uxVarK.b(objB1, object2);
                unsafe.putObject(obj, j15, objB1);
                object2 = objB1;
            }
            uxVarK.b(object2, object);
        }
    }

    private final void k(Object obj, Object obj2, int i15) {
        int i16 = this.f30511a[i15];
        if (u(obj2, i16, i15)) {
            int iH = H(i15) & 1048575;
            Unsafe unsafe = f30510m;
            long j15 = iH;
            Object object = unsafe.getObject(obj2, j15);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f30511a[i15] + " is present but null: " + obj2.toString());
            }
            ux uxVarK = K(i15);
            if (!u(obj, i16, i15)) {
                if (t(object)) {
                    Object objB0 = uxVarK.b0();
                    uxVarK.b(objB0, object);
                    unsafe.putObject(obj, j15, objB0);
                } else {
                    unsafe.putObject(obj, j15, object);
                }
                m(obj, i16, i15);
                return;
            }
            Object object2 = unsafe.getObject(obj, j15);
            if (!t(object2)) {
                Object objB1 = uxVarK.b0();
                uxVarK.b(objB1, object2);
                unsafe.putObject(obj, j15, objB1);
                object2 = objB1;
            }
            uxVarK.b(object2, object);
        }
    }

    private final void l(Object obj, int i15) {
        int iE = E(i15);
        long j15 = 1048575 & iE;
        if (j15 == 1048575) {
            return;
        }
        ry.v(obj, j15, (1 << (iE >>> 20)) | ry.h(obj, j15));
    }

    private final void m(Object obj, int i15, int i16) {
        ry.v(obj, E(i16) & 1048575, i15);
    }

    private final void n(Object obj, int i15, Object obj2) {
        f30510m.putObject(obj, H(i15) & 1048575, obj2);
        l(obj, i15);
    }

    private final void o(Object obj, int i15, int i16, Object obj2) {
        f30510m.putObject(obj, H(i16) & 1048575, obj2);
        m(obj, i15, i16);
    }

    private final boolean p(Object obj, Object obj2, int i15) {
        return q(obj, i15) == q(obj2, i15);
    }

    private final boolean q(Object obj, int i15) {
        int iE = E(i15);
        long j15 = iE & 1048575;
        if (j15 != 1048575) {
            return (ry.h(obj, j15) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i15);
        long j16 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(ry.f(obj, j16)) != 0;
            case 1:
                return Float.floatToRawIntBits(ry.g(obj, j16)) != 0;
            case 2:
                return ry.i(obj, j16) != 0;
            case 3:
                return ry.i(obj, j16) != 0;
            case 4:
                return ry.h(obj, j16) != 0;
            case 5:
                return ry.i(obj, j16) != 0;
            case 6:
                return ry.h(obj, j16) != 0;
            case 7:
                return ry.B(obj, j16);
            case 8:
                Object objK = ry.k(obj, j16);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof yu) {
                    return !yu.f30716b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return ry.k(obj, j16) != null;
            case 10:
                return !yu.f30716b.equals(ry.k(obj, j16));
            case 11:
                return ry.h(obj, j16) != 0;
            case 12:
                return ry.h(obj, j16) != 0;
            case 13:
                return ry.h(obj, j16) != 0;
            case 14:
                return ry.i(obj, j16) != 0;
            case 15:
                return ry.h(obj, j16) != 0;
            case 16:
                return ry.i(obj, j16) != 0;
            case 17:
                return ry.k(obj, j16) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean r(Object obj, int i15, int i16, int i17, int i18) {
        if (i16 == 1048575) {
            return q(obj, i15);
        }
        return (i17 & i18) != 0;
    }

    private static boolean s(Object obj, int i15, ux uxVar) {
        return uxVar.d(ry.k(obj, i15 & 1048575));
    }

    private static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof bw) {
            return ((bw) obj).o();
        }
        return true;
    }

    private final boolean u(Object obj, int i15, int i16) {
        return ry.h(obj, (long) (E(i16) & 1048575)) == i15;
    }

    private static boolean v(Object obj, long j15) {
        return ((Boolean) ry.k(obj, j15)).booleanValue();
    }

    private static final int w(byte[] bArr, int i15, int i16, vy vyVar, Class cls, lu luVar) {
        vy vyVar2 = vy.f30657c;
        switch (vyVar.ordinal()) {
            case 0:
                int i17 = i15 + 8;
                luVar.f30482c = Double.valueOf(Double.longBitsToDouble(mu.r(bArr, i15)));
                return i17;
            case 1:
                int i18 = i15 + 4;
                luVar.f30482c = Float.valueOf(Float.intBitsToFloat(mu.c(bArr, i15)));
                return i18;
            case 2:
            case 3:
                int iN = mu.n(bArr, i15, luVar);
                luVar.f30482c = Long.valueOf(luVar.f30481b);
                return iN;
            case 4:
            case 12:
            case 13:
                int iK = mu.k(bArr, i15, luVar);
                luVar.f30482c = Integer.valueOf(luVar.f30480a);
                return iK;
            case 5:
            case 15:
                int i19 = i15 + 8;
                luVar.f30482c = Long.valueOf(mu.r(bArr, i15));
                return i19;
            case 6:
            case 14:
                int i25 = i15 + 4;
                luVar.f30482c = Integer.valueOf(mu.c(bArr, i15));
                return i25;
            case 7:
                int iN2 = mu.n(bArr, i15, luVar);
                luVar.f30482c = Boolean.valueOf(luVar.f30481b != 0);
                return iN2;
            case 8:
                return mu.i(bArr, i15, luVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return mu.e(rx.a().b(cls), bArr, i15, i16, luVar);
            case 11:
                return mu.a(bArr, i15, luVar);
            case 16:
                int iK2 = mu.k(bArr, i15, luVar);
                luVar.f30482c = Integer.valueOf(cv.a(luVar.f30480a));
                return iK2;
            case 17:
                int iN3 = mu.n(bArr, i15, luVar);
                luVar.f30482c = Long.valueOf(cv.b(luVar.f30481b));
                return iN3;
        }
    }

    private static final void x(int i15, Object obj, xy xyVar) {
        if (obj instanceof String) {
            xyVar.t(i15, (String) obj);
        } else {
            xyVar.G(i15, (yu) obj);
        }
    }

    static ly z(Object obj) {
        bw bwVar = (bw) obj;
        ly lyVar = bwVar.zbc;
        if (lyVar != ly.c()) {
            return lyVar;
        }
        ly lyVarF = ly.f();
        bwVar.zbc = lyVarF;
        return lyVarF;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x0394  */
    /* JADX WARN: Code duplicated, block: B:280:0x071b A[PHI: r0
      0x071b: PHI (r0v2 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>) = 
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v39 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx<T>)
     binds: [B:18:0x004f, B:278:0x070e, B:248:0x064a, B:225:0x05ba, B:218:0x0587, B:139:0x0378, B:136:0x0360, B:133:0x0348, B:130:0x0330, B:127:0x0318, B:124:0x0300, B:121:0x02e8, B:118:0x02d0, B:115:0x02b7, B:112:0x02a0, B:109:0x0289, B:106:0x0272, B:103:0x025b, B:98:0x023f, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final int a(Object obj) {
        int i15;
        int iD;
        int iD2;
        int iE;
        int iD3;
        int iD4;
        int iD5;
        int iG;
        int iD6;
        int iM;
        int iL;
        int size;
        int iQ;
        int iD7;
        int iD8;
        int iD9;
        int iE2;
        int iJ;
        int iD10;
        int iD11;
        int iG2;
        int iD12;
        int iD13;
        int iD14;
        int iG3;
        int iD15;
        mx<T> mxVar = this;
        Unsafe unsafe = f30510m;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int iD16 = 0;
        int i19 = 1048575;
        while (i17 < mxVar.f30511a.length) {
            int iH = mxVar.H(i17);
            int iG4 = G(iH);
            int[] iArr = mxVar.f30511a;
            int i25 = iArr[i17];
            int i26 = iArr[i17 + 2];
            int i27 = i26 & i16;
            if (iG4 <= 17) {
                if (i27 != i19) {
                    i18 = i27 == i16 ? 0 : unsafe.getInt(obj, i27);
                    i19 = i27;
                }
                i15 = 1 << (i26 >>> 20);
            } else {
                i15 = 0;
            }
            int i28 = iH & i16;
            if (iG4 >= rv.R.m()) {
                rv.f30606x0.m();
            }
            int i29 = iD16;
            long j15 = i28;
            switch (iG4) {
                case 0:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD16 = i29 + gv.d(i25 << 3) + 8;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 1:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD = gv.d(i25 << 3);
                        iD4 = iD + 4;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 2:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        long j16 = unsafe.getLong(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.e(j16);
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 3:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        long j17 = unsafe.getLong(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.e(j17);
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 4:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        long j18 = unsafe.getInt(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.e(j18);
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 5:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD3 = gv.d(i25 << 3);
                        iD4 = iD3 + 8;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 6:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD = gv.d(i25 << 3);
                        iD4 = iD + 4;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 7:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD4 = gv.d(i25 << 3) + 1;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 8:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        int i35 = i25 << 3;
                        Object object = unsafe.getObject(obj, j15);
                        if (object instanceof yu) {
                            iD5 = gv.d(i35);
                            iG = ((yu) object).g();
                            iD6 = gv.d(iG);
                            iD4 = iD5 + iD6 + iG;
                            iD16 = i29 + iD4;
                            mxVar = this;
                        } else {
                            iD2 = gv.d(i35);
                            iE = gv.c((String) object);
                            iD4 = iD2 + iE;
                            iD16 = i29 + iD4;
                            mxVar = this;
                        }
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 9:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iM = wx.m(i25, unsafe.getObject(obj, j15), mxVar.K(i17));
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 10:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        yu yuVar = (yu) unsafe.getObject(obj, j15);
                        iD5 = gv.d(i25 << 3);
                        iG = yuVar.g();
                        iD6 = gv.d(iG);
                        iD4 = iD5 + iD6 + iG;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 11:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        int i36 = unsafe.getInt(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.d(i36);
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 12:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        long j19 = unsafe.getInt(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.e(j19);
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 13:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD = gv.d(i25 << 3);
                        iD4 = iD + 4;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 14:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iD3 = gv.d(i25 << 3);
                        iD4 = iD3 + 8;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 15:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        int i37 = unsafe.getInt(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.d((i37 >> 31) ^ (i37 + i37));
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 16:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        long j25 = unsafe.getLong(obj, j15);
                        iD2 = gv.d(i25 << 3);
                        iE = gv.e((j25 >> 63) ^ (j25 + j25));
                        iD4 = iD2 + iE;
                        iD16 = i29 + iD4;
                        mxVar = this;
                    }
                    mxVar = this;
                    iD16 = i29;
                    break;
                case 17:
                    if (mxVar.r(obj, i17, i19, i18, i15)) {
                        iM = gv.G(i25, (jx) unsafe.getObject(obj, j15), mxVar.K(i17));
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 18:
                    iM = wx.i(i25, (List) unsafe.getObject(obj, j15), false);
                    iD16 = i29 + iM;
                    break;
                case 19:
                    iM = wx.g(i25, (List) unsafe.getObject(obj, j15), false);
                    iD16 = i29 + iM;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j15);
                    int i38 = wx.f30689b;
                    if (list.size() == 0) {
                        iL = 0;
                    } else {
                        iL = wx.l(list) + (list.size() * gv.d(i25 << 3));
                    }
                    iD16 = iL + i29;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j15);
                    int i39 = wx.f30689b;
                    size = list2.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = wx.q(list2);
                        iD7 = gv.d(i25 << 3);
                        iE2 = size * iD7;
                        iM = iQ + iE2;
                    }
                    iD16 = i29 + iM;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j15);
                    int i45 = wx.f30689b;
                    size = list3.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = wx.k(list3);
                        iD7 = gv.d(i25 << 3);
                        iE2 = size * iD7;
                        iM = iQ + iE2;
                    }
                    iD16 = i29 + iM;
                    break;
                case 23:
                    iM = wx.i(i25, (List) unsafe.getObject(obj, j15), false);
                    iD16 = i29 + iM;
                    break;
                case 24:
                    iM = wx.g(i25, (List) unsafe.getObject(obj, j15), false);
                    iD16 = i29 + iM;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j15);
                    int i46 = wx.f30689b;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM = 0;
                    } else {
                        iM = size2 * (gv.d(i25 << 3) + 1);
                    }
                    iD16 = i29 + iM;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j15);
                    int i47 = wx.f30689b;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iL = 0;
                    } else {
                        iL = gv.d(i25 << 3) * size3;
                        if (list5 instanceof tw) {
                            tw twVar = (tw) list5;
                            for (int i48 = 0; i48 < size3; i48++) {
                                Object objM = twVar.m();
                                if (objM instanceof yu) {
                                    int iG5 = ((yu) objM).g();
                                    iL += gv.d(iG5) + iG5;
                                } else {
                                    iL += gv.c((String) objM);
                                }
                            }
                        } else {
                            for (int i49 = 0; i49 < size3; i49++) {
                                Object obj2 = list5.get(i49);
                                if (obj2 instanceof yu) {
                                    int iG6 = ((yu) obj2).g();
                                    iL += gv.d(iG6) + iG6;
                                } else {
                                    iL += gv.c((String) obj2);
                                }
                            }
                        }
                    }
                    iD16 = iL + i29;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j15);
                    ux uxVarK = mxVar.K(i17);
                    int i55 = wx.f30689b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iD8 = 0;
                    } else {
                        iD8 = gv.d(i25 << 3) * size4;
                        for (int i56 = 0; i56 < size4; i56++) {
                            Object obj3 = list6.get(i56);
                            if (obj3 instanceof sw) {
                                int iA = ((sw) obj3).a();
                                iD8 += gv.d(iA) + iA;
                            } else {
                                iD8 += gv.b((jx) obj3, uxVarK);
                            }
                        }
                    }
                    iD16 = i29 + iD8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j15);
                    int i57 = wx.f30689b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iD9 = 0;
                    } else {
                        iD9 = size5 * gv.d(i25 << 3);
                        for (int i58 = 0; i58 < list7.size(); i58++) {
                            int iG7 = ((yu) list7.get(i58)).g();
                            iD9 += gv.d(iG7) + iG7;
                        }
                    }
                    iD16 = i29 + iD9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j15);
                    int i59 = wx.f30689b;
                    size = list8.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = wx.p(list8);
                        iD7 = gv.d(i25 << 3);
                        iE2 = size * iD7;
                        iM = iQ + iE2;
                    }
                    iD16 = i29 + iM;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j15);
                    int i65 = wx.f30689b;
                    size = list9.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = wx.f(list9);
                        iD7 = gv.d(i25 << 3);
                        iE2 = size * iD7;
                        iM = iQ + iE2;
                    }
                    iD16 = i29 + iM;
                    break;
                case BERTags.DATE /* 31 */:
                    iM = wx.g(i25, (List) unsafe.getObject(obj, j15), false);
                    iD16 = i29 + iM;
                    break;
                case 32:
                    iM = wx.i(i25, (List) unsafe.getObject(obj, j15), false);
                    iD16 = i29 + iM;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j15);
                    int i66 = wx.f30689b;
                    size = list10.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = wx.n(list10);
                        iD7 = gv.d(i25 << 3);
                        iE2 = size * iD7;
                        iM = iQ + iE2;
                    }
                    iD16 = i29 + iM;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j15);
                    int i67 = wx.f30689b;
                    size = list11.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = wx.o(list11);
                        iD7 = gv.d(i25 << 3);
                        iE2 = size * iD7;
                        iM = iQ + iE2;
                    }
                    iD16 = i29 + iM;
                    break;
                case 35:
                    iJ = wx.j((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 36:
                    iJ = wx.h((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    iJ = wx.l((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    iJ = wx.q((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    iJ = wx.k((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 40:
                    iJ = wx.j((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    iJ = wx.h((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j15);
                    int i68 = wx.f30689b;
                    iJ = list12.size();
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iJ = wx.p((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    iJ = wx.f((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    iJ = wx.h((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 46:
                    iJ = wx.j((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 47:
                    iJ = wx.n((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 48:
                    iJ = wx.o((List) unsafe.getObject(obj, j15));
                    if (iJ > 0) {
                        iD10 = gv.d(i25 << 3);
                        iD11 = gv.d(iJ);
                        iD9 = iD10 + iD11 + iJ;
                        iD16 = i29 + iD9;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j15);
                    ux uxVarK2 = mxVar.K(i17);
                    int i69 = wx.f30689b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iG2 = 0;
                    } else {
                        iG2 = 0;
                        for (int i75 = 0; i75 < size6; i75++) {
                            iG2 += gv.G(i25, (jx) list13.get(i75), uxVarK2);
                        }
                    }
                    iD16 = i29 + iG2;
                    break;
                case 50:
                    dx dxVar = (dx) unsafe.getObject(obj, j15);
                    cx cxVar = (cx) mxVar.L(i17);
                    if (dxVar.isEmpty()) {
                        iL = 0;
                    } else {
                        iL = 0;
                        for (Map.Entry entry : dxVar.entrySet()) {
                            iL += cxVar.a(i25, entry.getKey(), entry.getValue());
                        }
                    }
                    iD16 = iL + i29;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (mxVar.u(obj, i25, i17)) {
                        iD12 = gv.d(i25 << 3);
                        iM = iD12 + 8;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (mxVar.u(obj, i25, i17)) {
                        iD13 = gv.d(i25 << 3);
                        iM = iD13 + 4;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 53:
                    if (mxVar.u(obj, i25, i17)) {
                        long jI = I(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.e(jI);
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (mxVar.u(obj, i25, i17)) {
                        long jI2 = I(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.e(jI2);
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 55:
                    if (mxVar.u(obj, i25, i17)) {
                        long jD = D(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.e(jD);
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 56:
                    if (mxVar.u(obj, i25, i17)) {
                        iD12 = gv.d(i25 << 3);
                        iM = iD12 + 8;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 57:
                    if (mxVar.u(obj, i25, i17)) {
                        iD13 = gv.d(i25 << 3);
                        iM = iD13 + 4;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (mxVar.u(obj, i25, i17)) {
                        iM = gv.d(i25 << 3) + 1;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (mxVar.u(obj, i25, i17)) {
                        int i76 = i25 << 3;
                        Object object2 = unsafe.getObject(obj, j15);
                        if (object2 instanceof yu) {
                            iD14 = gv.d(i76);
                            iG3 = ((yu) object2).g();
                            iD15 = gv.d(iG3);
                            iM = iD14 + iD15 + iG3;
                            iD16 = i29 + iM;
                        } else {
                            iQ = gv.d(i76);
                            iE2 = gv.c((String) object2);
                            iM = iQ + iE2;
                            iD16 = i29 + iM;
                        }
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 60:
                    if (mxVar.u(obj, i25, i17)) {
                        iM = wx.m(i25, unsafe.getObject(obj, j15), mxVar.K(i17));
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 61:
                    if (mxVar.u(obj, i25, i17)) {
                        yu yuVar2 = (yu) unsafe.getObject(obj, j15);
                        iD14 = gv.d(i25 << 3);
                        iG3 = yuVar2.g();
                        iD15 = gv.d(iG3);
                        iM = iD14 + iD15 + iG3;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 62:
                    if (mxVar.u(obj, i25, i17)) {
                        int iD17 = D(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.d(iD17);
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 63:
                    if (mxVar.u(obj, i25, i17)) {
                        long jD2 = D(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.e(jD2);
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 64:
                    if (mxVar.u(obj, i25, i17)) {
                        iD13 = gv.d(i25 << 3);
                        iM = iD13 + 4;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 65:
                    if (mxVar.u(obj, i25, i17)) {
                        iD12 = gv.d(i25 << 3);
                        iM = iD12 + 8;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case 66:
                    if (mxVar.u(obj, i25, i17)) {
                        int iD18 = D(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.d((iD18 >> 31) ^ (iD18 + iD18));
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (mxVar.u(obj, i25, i17)) {
                        long jI3 = I(obj, j15);
                        iQ = gv.d(i25 << 3);
                        iE2 = gv.e((jI3 >> 63) ^ (jI3 + jI3));
                        iM = iQ + iE2;
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (mxVar.u(obj, i25, i17)) {
                        iM = gv.G(i25, (jx) unsafe.getObject(obj, j15), mxVar.K(i17));
                        iD16 = i29 + iM;
                    } else {
                        iD16 = i29;
                    }
                    break;
                default:
                    iD16 = i29;
                    break;
            }
            i17 += 3;
            i16 = 1048575;
        }
        int iA2 = iD16 + ((bw) obj).zbc.a();
        if (!mxVar.f30516f) {
            return iA2;
        }
        qv qvVar = ((yv) obj).zbb;
        int iC = qvVar.f30564a.c();
        int iB = 0;
        for (int i77 = 0; i77 < iC; i77++) {
            Map.Entry entryG = qvVar.f30564a.g(i77);
            iB += qv.b((pv) ((zx) entryG).b(), entryG.getValue());
        }
        for (Map.Entry entry2 : qvVar.f30564a.d()) {
            iB += qv.b((pv) entry2.getKey(), entry2.getValue());
        }
        return iA2 + iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void b(Object obj, Object obj2) {
        i(obj);
        obj2.getClass();
        for (int i15 = 0; i15 < this.f30511a.length; i15 += 3) {
            int iH = H(i15);
            int i16 = 1048575 & iH;
            int[] iArr = this.f30511a;
            int iG = G(iH);
            int i17 = iArr[i15];
            long j15 = i16;
            switch (iG) {
                case 0:
                    if (q(obj2, i15)) {
                        ry.t(obj, j15, ry.f(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 1:
                    if (q(obj2, i15)) {
                        ry.u(obj, j15, ry.g(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 2:
                    if (q(obj2, i15)) {
                        ry.w(obj, j15, ry.i(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 3:
                    if (q(obj2, i15)) {
                        ry.w(obj, j15, ry.i(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 4:
                    if (q(obj2, i15)) {
                        ry.v(obj, j15, ry.h(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 5:
                    if (q(obj2, i15)) {
                        ry.w(obj, j15, ry.i(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 6:
                    if (q(obj2, i15)) {
                        ry.v(obj, j15, ry.h(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 7:
                    if (q(obj2, i15)) {
                        ry.r(obj, j15, ry.B(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 8:
                    if (q(obj2, i15)) {
                        ry.x(obj, j15, ry.k(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 9:
                    j(obj, obj2, i15);
                    break;
                case 10:
                    if (q(obj2, i15)) {
                        ry.x(obj, j15, ry.k(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 11:
                    if (q(obj2, i15)) {
                        ry.v(obj, j15, ry.h(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 12:
                    if (q(obj2, i15)) {
                        ry.v(obj, j15, ry.h(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 13:
                    if (q(obj2, i15)) {
                        ry.v(obj, j15, ry.h(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 14:
                    if (q(obj2, i15)) {
                        ry.w(obj, j15, ry.i(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 15:
                    if (q(obj2, i15)) {
                        ry.v(obj, j15, ry.h(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 16:
                    if (q(obj2, i15)) {
                        ry.w(obj, j15, ry.i(obj2, j15));
                        l(obj, i15);
                    }
                    break;
                case 17:
                    j(obj, obj2, i15);
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
                    jw jwVarT1 = (jw) ry.k(obj, j15);
                    jw jwVar = (jw) ry.k(obj2, j15);
                    int size = jwVarT1.size();
                    int size2 = jwVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!jwVarT1.r()) {
                            jwVarT1 = jwVarT1.T1(size2 + size);
                        }
                        jwVarT1.addAll(jwVar);
                    }
                    if (size > 0) {
                        jwVar = jwVarT1;
                    }
                    ry.x(obj, j15, jwVar);
                    break;
                case 50:
                    int i18 = wx.f30689b;
                    ry.x(obj, j15, ex.a(ry.k(obj, j15), ry.k(obj2, j15)));
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
                    if (u(obj2, i17, i15)) {
                        ry.x(obj, j15, ry.k(obj2, j15));
                        m(obj, i17, i15);
                    }
                    break;
                case 60:
                    k(obj, obj2, i15);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (u(obj2, i17, i15)) {
                        ry.x(obj, j15, ry.k(obj2, j15));
                        m(obj, i17, i15);
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    k(obj, obj2, i15);
                    break;
            }
        }
        wx.u(this.f30520j, obj, obj2);
        if (this.f30516f) {
            wx.t(this.f30521k, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final Object b0() {
        return ((bw) this.f30515e).x();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0212  */
    /* JADX WARN: Code duplicated, block: B:101:0x0223  */
    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:103:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x0267  */
    /* JADX WARN: Code duplicated, block: B:106:0x0278  */
    /* JADX WARN: Code duplicated, block: B:107:0x0289  */
    /* JADX WARN: Code duplicated, block: B:108:0x029a  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02de  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:115:0x030e  */
    /* JADX WARN: Code duplicated, block: B:116:0x031e  */
    /* JADX WARN: Code duplicated, block: B:117:0x032e  */
    /* JADX WARN: Code duplicated, block: B:118:0x033e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0357  */
    /* JADX WARN: Code duplicated, block: B:130:0x0376 A[LOOP:3: B:128:0x0370->B:130:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0383  */
    /* JADX WARN: Code duplicated, block: B:136:0x039c  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:141:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:142:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:143:0x040c  */
    /* JADX WARN: Code duplicated, block: B:144:0x041c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0423  */
    /* JADX WARN: Code duplicated, block: B:147:0x0430  */
    /* JADX WARN: Code duplicated, block: B:149:0x0437  */
    /* JADX WARN: Code duplicated, block: B:151:0x0442  */
    /* JADX WARN: Code duplicated, block: B:153:0x0449  */
    /* JADX WARN: Code duplicated, block: B:154:0x0451  */
    /* JADX WARN: Code duplicated, block: B:156:0x0458  */
    /* JADX WARN: Code duplicated, block: B:157:0x0460  */
    /* JADX WARN: Code duplicated, block: B:159:0x0467  */
    /* JADX WARN: Code duplicated, block: B:160:0x046f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0476  */
    /* JADX WARN: Code duplicated, block: B:163:0x047e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0485  */
    /* JADX WARN: Code duplicated, block: B:166:0x048d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0494  */
    /* JADX WARN: Code duplicated, block: B:169:0x049e  */
    /* JADX WARN: Code duplicated, block: B:171:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:172:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:177:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:178:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:180:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:181:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:183:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:184:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:186:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:187:0x0502  */
    /* JADX WARN: Code duplicated, block: B:189:0x0509  */
    /* JADX WARN: Code duplicated, block: B:190:0x0512  */
    /* JADX WARN: Code duplicated, block: B:192:0x0519  */
    /* JADX WARN: Code duplicated, block: B:193:0x0522  */
    /* JADX WARN: Code duplicated, block: B:195:0x0529  */
    /* JADX WARN: Code duplicated, block: B:196:0x0532  */
    /* JADX WARN: Code duplicated, block: B:198:0x0539  */
    /* JADX WARN: Code duplicated, block: B:224:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:84:0x019e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3 A[LOOP:2: B:95:0x01dd->B:97:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void c(Object obj, xy xyVar) {
        Map.Entry entry;
        Iterator it;
        int i15;
        int i16;
        int i17;
        int i18;
        long j15;
        int i19;
        List list;
        int i25;
        List list2;
        ux uxVarK;
        int i26;
        int i27;
        List list3;
        int i28;
        List list4;
        ux uxVarK2;
        int i29;
        Object object;
        mx<T> mxVar = this;
        if (mxVar.f30516f) {
            qv qvVar = ((yv) obj).zbb;
            if (qvVar.f30564a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itG = qvVar.g();
                entry = (Map.Entry) itG.next();
                it = itG;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = mxVar.f30511a;
        Unsafe unsafe = f30510m;
        int i35 = 0;
        int i36 = 1048575;
        int i37 = 0;
        while (i35 < iArr.length) {
            int iH = mxVar.H(i35);
            int[] iArr2 = mxVar.f30511a;
            int iG = G(iH);
            int i38 = iArr2[i35];
            if (iG <= 17) {
                int i39 = iArr2[i35 + 2];
                int i45 = i39 & 1048575;
                if (i45 != i36) {
                    i15 = 1;
                    i37 = i45 == 1048575 ? 0 : unsafe.getInt(obj, i45);
                    i36 = i45;
                } else {
                    i15 = 1;
                }
                i16 = i36;
                i17 = i37;
                i18 = i15 << (i39 >>> 20);
            } else {
                i15 = 1;
                i16 = i36;
                i17 = i37;
                i18 = 0;
            }
            while (entry != null) {
                if (i38 >= 32149011) {
                    mxVar.f30521k.b(xyVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    j15 = iH & 1048575;
                    switch (iG) {
                        case 0:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.I(i38, ry.f(obj, j15));
                            }
                            break;
                        case 1:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.n(i38, ry.g(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 2:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.C(i38, unsafe.getLong(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 3:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.m(i38, unsafe.getLong(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 4:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.l(i38, unsafe.getInt(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 5:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.c(i38, unsafe.getLong(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 6:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.f(i38, unsafe.getInt(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 7:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.y(i38, ry.B(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 8:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                x(i38, unsafe.getObject(obj, j15), xyVar);
                            }
                            mxVar = this;
                            break;
                        case 9:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.r(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                            }
                            break;
                        case 10:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.G(i38, (yu) unsafe.getObject(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 11:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.a(i38, unsafe.getInt(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 12:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.F(i38, unsafe.getInt(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 13:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.D(i38, unsafe.getInt(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 14:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.B(i38, unsafe.getLong(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 15:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.x(i38, unsafe.getInt(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 16:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.L(i38, unsafe.getLong(obj, j15));
                            }
                            mxVar = this;
                            break;
                        case 17:
                            if (mxVar.r(obj, i35, i16, i17, i18)) {
                                xyVar.d(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                            }
                            break;
                        case 18:
                            wx.w(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 19:
                            wx.A(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 20:
                            wx.C(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 21:
                            wx.d(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 22:
                            wx.B(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 23:
                            wx.z(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 24:
                            wx.y(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 25:
                            wx.v(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 26:
                            i19 = mxVar.f30511a[i35];
                            list = (List) unsafe.getObject(obj, j15);
                            int i46 = wx.f30689b;
                            if (list != null && !list.isEmpty()) {
                                xyVar.i(i19, list);
                            }
                            break;
                        case 27:
                            i25 = mxVar.f30511a[i35];
                            list2 = (List) unsafe.getObject(obj, j15);
                            uxVarK = mxVar.K(i35);
                            int i47 = wx.f30689b;
                            if (list2 != null && !list2.isEmpty()) {
                                for (i26 = 0; i26 < list2.size(); i26++) {
                                    ((hv) xyVar).r(i25, list2.get(i26), uxVarK);
                                }
                            }
                            break;
                        case 28:
                            i27 = mxVar.f30511a[i35];
                            list3 = (List) unsafe.getObject(obj, j15);
                            int i48 = wx.f30689b;
                            if (list3 != null && !list3.isEmpty()) {
                                xyVar.J(i27, list3);
                            }
                            break;
                        case 29:
                            wx.c(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 30:
                            wx.x(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case BERTags.DATE /* 31 */:
                            wx.D(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 32:
                            wx.E(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 33:
                            wx.a(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 34:
                            wx.b(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                            break;
                        case 35:
                            wx.w(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case 36:
                            wx.A(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            wx.C(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                            wx.d(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                            wx.B(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case 40:
                            wx.z(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                            wx.y(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.CURRENCY_CODE /* 42 */:
                            wx.v(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                            wx.c(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                            wx.x(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                            wx.D(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case 46:
                            wx.E(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case 47:
                            wx.a(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case 48:
                            wx.b(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                            break;
                        case 49:
                            i28 = mxVar.f30511a[i35];
                            list4 = (List) unsafe.getObject(obj, j15);
                            uxVarK2 = mxVar.K(i35);
                            int i49 = wx.f30689b;
                            if (list4 != null && !list4.isEmpty()) {
                                for (i29 = 0; i29 < list4.size(); i29++) {
                                    ((hv) xyVar).d(i28, list4.get(i29), uxVarK2);
                                }
                            }
                            break;
                        case 50:
                            object = unsafe.getObject(obj, j15);
                            if (object != null) {
                                xyVar.v(i38, ((cx) mxVar.L(i35)).c(), (dx) object);
                            }
                            break;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.I(i38, B(obj, j15));
                            }
                            break;
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.n(i38, C(obj, j15));
                            }
                            break;
                        case 53:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.C(i38, I(obj, j15));
                            }
                            break;
                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.m(i38, I(obj, j15));
                            }
                            break;
                        case 55:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.l(i38, D(obj, j15));
                            }
                            break;
                        case 56:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.c(i38, I(obj, j15));
                            }
                            break;
                        case 57:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.f(i38, D(obj, j15));
                            }
                            break;
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.y(i38, v(obj, j15));
                            }
                            break;
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            if (mxVar.u(obj, i38, i35)) {
                                x(i38, unsafe.getObject(obj, j15), xyVar);
                            }
                            break;
                        case 60:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.r(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                            }
                            break;
                        case 61:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.G(i38, (yu) unsafe.getObject(obj, j15));
                            }
                            break;
                        case 62:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.a(i38, D(obj, j15));
                            }
                            break;
                        case 63:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.F(i38, D(obj, j15));
                            }
                            break;
                        case 64:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.D(i38, D(obj, j15));
                            }
                            break;
                        case 65:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.B(i38, I(obj, j15));
                            }
                            break;
                        case 66:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.x(i38, D(obj, j15));
                            }
                            break;
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.L(i38, I(obj, j15));
                            }
                            break;
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            if (mxVar.u(obj, i38, i35)) {
                                xyVar.d(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                            }
                            break;
                        default:
                            break;
                    }
                    i35 += 3;
                    i37 = i17;
                    i36 = i16;
                    entry = entry;
                }
            }
            j15 = iH & 1048575;
            switch (iG) {
                case 0:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.I(i38, ry.f(obj, j15));
                    }
                    break;
                case 1:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.n(i38, ry.g(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 2:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.C(i38, unsafe.getLong(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 3:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.m(i38, unsafe.getLong(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 4:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.l(i38, unsafe.getInt(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 5:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.c(i38, unsafe.getLong(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 6:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.f(i38, unsafe.getInt(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 7:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.y(i38, ry.B(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 8:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        x(i38, unsafe.getObject(obj, j15), xyVar);
                    }
                    mxVar = this;
                    break;
                case 9:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.r(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                    }
                    break;
                case 10:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.G(i38, (yu) unsafe.getObject(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 11:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.a(i38, unsafe.getInt(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 12:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.F(i38, unsafe.getInt(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 13:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.D(i38, unsafe.getInt(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 14:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.B(i38, unsafe.getLong(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 15:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.x(i38, unsafe.getInt(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 16:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.L(i38, unsafe.getLong(obj, j15));
                    }
                    mxVar = this;
                    break;
                case 17:
                    if (mxVar.r(obj, i35, i16, i17, i18)) {
                        xyVar.d(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                    }
                    break;
                case 18:
                    wx.w(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 19:
                    wx.A(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 20:
                    wx.C(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 21:
                    wx.d(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 22:
                    wx.B(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 23:
                    wx.z(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 24:
                    wx.y(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 25:
                    wx.v(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 26:
                    i19 = mxVar.f30511a[i35];
                    list = (List) unsafe.getObject(obj, j15);
                    int i410 = wx.f30689b;
                    if (list != null) {
                        xyVar.i(i19, list);
                    }
                    break;
                case 27:
                    i25 = mxVar.f30511a[i35];
                    list2 = (List) unsafe.getObject(obj, j15);
                    uxVarK = mxVar.K(i35);
                    int i411 = wx.f30689b;
                    if (list2 != null) {
                        while (i26 < list2.size()) {
                            ((hv) xyVar).r(i25, list2.get(i26), uxVarK);
                        }
                    }
                    break;
                case 28:
                    i27 = mxVar.f30511a[i35];
                    list3 = (List) unsafe.getObject(obj, j15);
                    int i412 = wx.f30689b;
                    if (list3 != null) {
                        xyVar.J(i27, list3);
                    }
                    break;
                case 29:
                    wx.c(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 30:
                    wx.x(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case BERTags.DATE /* 31 */:
                    wx.D(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 32:
                    wx.E(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 33:
                    wx.a(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 34:
                    wx.b(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, false);
                    break;
                case 35:
                    wx.w(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case 36:
                    wx.A(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    wx.C(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    wx.d(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    wx.B(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case 40:
                    wx.z(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    wx.y(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    wx.v(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    wx.c(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    wx.x(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    wx.D(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case 46:
                    wx.E(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case 47:
                    wx.a(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case 48:
                    wx.b(mxVar.f30511a[i35], (List) unsafe.getObject(obj, j15), xyVar, i15);
                    break;
                case 49:
                    i28 = mxVar.f30511a[i35];
                    list4 = (List) unsafe.getObject(obj, j15);
                    uxVarK2 = mxVar.K(i35);
                    int i413 = wx.f30689b;
                    if (list4 != null) {
                        while (i29 < list4.size()) {
                            ((hv) xyVar).d(i28, list4.get(i29), uxVarK2);
                        }
                    }
                    break;
                case 50:
                    object = unsafe.getObject(obj, j15);
                    if (object != null) {
                        xyVar.v(i38, ((cx) mxVar.L(i35)).c(), (dx) object);
                    }
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.I(i38, B(obj, j15));
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.n(i38, C(obj, j15));
                    }
                    break;
                case 53:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.C(i38, I(obj, j15));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.m(i38, I(obj, j15));
                    }
                    break;
                case 55:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.l(i38, D(obj, j15));
                    }
                    break;
                case 56:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.c(i38, I(obj, j15));
                    }
                    break;
                case 57:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.f(i38, D(obj, j15));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.y(i38, v(obj, j15));
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (mxVar.u(obj, i38, i35)) {
                        x(i38, unsafe.getObject(obj, j15), xyVar);
                    }
                    break;
                case 60:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.r(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                    }
                    break;
                case 61:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.G(i38, (yu) unsafe.getObject(obj, j15));
                    }
                    break;
                case 62:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.a(i38, D(obj, j15));
                    }
                    break;
                case 63:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.F(i38, D(obj, j15));
                    }
                    break;
                case 64:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.D(i38, D(obj, j15));
                    }
                    break;
                case 65:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.B(i38, I(obj, j15));
                    }
                    break;
                case 66:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.x(i38, D(obj, j15));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.L(i38, I(obj, j15));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (mxVar.u(obj, i38, i35)) {
                        xyVar.d(i38, unsafe.getObject(obj, j15), mxVar.K(i35));
                    }
                    break;
                default:
                    break;
            }
            i35 += 3;
            i37 = i17;
            i36 = i16;
            entry = entry;
        }
        while (entry != null) {
            mxVar.f30521k.b(xyVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((bw) obj).zbc.l(xyVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final boolean d(Object obj) {
        int i15;
        int i16;
        List list;
        ux uxVarK;
        int i17;
        int i18 = 0;
        int i19 = 0;
        int i25 = 1048575;
        while (i18 < this.f30518h) {
            int[] iArr = this.f30517g;
            int[] iArr2 = this.f30511a;
            int i26 = iArr[i18];
            int i27 = iArr2[i26];
            int iH = H(i26);
            int i28 = this.f30511a[i26 + 2];
            int i29 = i28 & 1048575;
            int i35 = 1 << (i28 >>> 20);
            if (i29 != i25) {
                if (i29 != 1048575) {
                    i19 = f30510m.getInt(obj, i29);
                }
                i16 = i19;
                i15 = i29;
            } else {
                i15 = i25;
                i16 = i19;
            }
            Object obj2 = obj;
            if ((268435456 & iH) != 0 && !r(obj2, i26, i15, i16, i35)) {
                return false;
            }
            int iG = G(iH);
            if (iG == 9 || iG == 17) {
                if (r(obj2, i26, i15, i16, i35) && !s(obj2, iH, K(i26))) {
                    return false;
                }
            } else if (iG == 27) {
                list = (List) ry.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    uxVarK = K(i26);
                    for (i17 = 0; i17 < list.size(); i17++) {
                        if (!uxVarK.d(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (iG == 60 || iG == 68) {
                if (u(obj2, i27, i26) && !s(obj2, iH, K(i26))) {
                    return false;
                }
            } else if (iG == 49) {
                list = (List) ry.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    uxVarK = K(i26);
                    while (i17 < list.size()) {
                        if (!uxVarK.d(list.get(i17))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iG != 50) {
                continue;
            } else {
                dx dxVar = (dx) ry.k(obj2, iH & 1048575);
                if (!dxVar.isEmpty() && ((cx) L(i26)).c().f30368c.b() == wy.MESSAGE) {
                    ux uxVarB = null;
                    for (Object obj3 : dxVar.values()) {
                        if (uxVarB == null) {
                            uxVarB = rx.a().b(obj3.getClass());
                        }
                        if (!uxVarB.d(obj3)) {
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
        return !this.f30516f || ((yv) obj).zbb.m();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void e(Object obj, byte[] bArr, int i15, int i16, lu luVar) {
        y(obj, bArr, i15, i16, 0, luVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final void f(Object obj) {
        if (t(obj)) {
            if (obj instanceof bw) {
                bw bwVar = (bw) obj;
                bwVar.m(Integer.MAX_VALUE);
                bwVar.zba = 0;
                bwVar.k();
            }
            int[] iArr = this.f30511a;
            for (int i15 = 0; i15 < iArr.length; i15 += 3) {
                int iH = H(i15);
                int i16 = 1048575 & iH;
                int iG = G(iH);
                long j15 = i16;
                if (iG != 9) {
                    if (iG != 60 && iG != 68) {
                        switch (iG) {
                            case 17:
                                if (q(obj, i15)) {
                                    K(i15).f(f30510m.getObject(obj, j15));
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
                                ((jw) ry.k(obj, j15)).N();
                                break;
                            case 50:
                                Unsafe unsafe = f30510m;
                                Object object = unsafe.getObject(obj, j15);
                                if (object != null) {
                                    ((dx) object).e();
                                    unsafe.putObject(obj, j15, object);
                                }
                                break;
                        }
                    } else if (u(obj, this.f30511a[i15], i15)) {
                        K(i15).f(f30510m.getObject(obj, j15));
                    }
                } else if (q(obj, i15)) {
                    K(i15).f(f30510m.getObject(obj, j15));
                }
            }
            this.f30520j.b(obj);
            if (this.f30516f) {
                this.f30521k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final boolean g(Object obj, Object obj2) {
        boolean zE;
        for (int i15 = 0; i15 < this.f30511a.length; i15 += 3) {
            int iH = H(i15);
            long j15 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!p(obj, obj2, i15) || Double.doubleToLongBits(ry.f(obj, j15)) != Double.doubleToLongBits(ry.f(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!p(obj, obj2, i15) || Float.floatToIntBits(ry.g(obj, j15)) != Float.floatToIntBits(ry.g(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!p(obj, obj2, i15) || ry.i(obj, j15) != ry.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!p(obj, obj2, i15) || ry.i(obj, j15) != ry.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!p(obj, obj2, i15) || ry.h(obj, j15) != ry.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!p(obj, obj2, i15) || ry.i(obj, j15) != ry.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!p(obj, obj2, i15) || ry.h(obj, j15) != ry.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!p(obj, obj2, i15) || ry.B(obj, j15) != ry.B(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!p(obj, obj2, i15) || !wx.e(ry.k(obj, j15), ry.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!p(obj, obj2, i15) || !wx.e(ry.k(obj, j15), ry.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!p(obj, obj2, i15) || !wx.e(ry.k(obj, j15), ry.k(obj2, j15))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!p(obj, obj2, i15) || ry.h(obj, j15) != ry.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!p(obj, obj2, i15) || ry.h(obj, j15) != ry.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!p(obj, obj2, i15) || ry.h(obj, j15) != ry.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!p(obj, obj2, i15) || ry.i(obj, j15) != ry.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!p(obj, obj2, i15) || ry.h(obj, j15) != ry.h(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!p(obj, obj2, i15) || ry.i(obj, j15) != ry.i(obj2, j15)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!p(obj, obj2, i15) || !wx.e(ry.k(obj, j15), ry.k(obj2, j15))) {
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
                    zE = wx.e(ry.k(obj, j15), ry.k(obj2, j15));
                    break;
                case 50:
                    zE = wx.e(ry.k(obj, j15), ry.k(obj2, j15));
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
                    long jE = E(i15) & 1048575;
                    if (ry.h(obj, jE) != ry.h(obj2, jE) || !wx.e(ry.k(obj, j15), ry.k(obj2, j15))) {
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
        if (!((bw) obj).zbc.equals(((bw) obj2).zbc)) {
            return false;
        }
        if (this.f30516f) {
            return ((yv) obj).zbb.equals(((yv) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ux
    public final int h(Object obj) {
        int i15;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i16;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f30511a.length; i18 += 3) {
            int iH = H(i18);
            int[] iArr = this.f30511a;
            int i19 = 1048575 & iH;
            int iG = G(iH);
            int i25 = iArr[i18];
            long j15 = i19;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i15 = i17 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(ry.f(obj, j15));
                    byte[] bArr = kw.f30477b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 1:
                    i15 = i17 * 53;
                    iFloatToIntBits = Float.floatToIntBits(ry.g(obj, j15));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 2:
                    i15 = i17 * 53;
                    jDoubleToLongBits = ry.i(obj, j15);
                    byte[] bArr2 = kw.f30477b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 3:
                    i15 = i17 * 53;
                    jDoubleToLongBits = ry.i(obj, j15);
                    byte[] bArr3 = kw.f30477b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 4:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 5:
                    i15 = i17 * 53;
                    jDoubleToLongBits = ry.i(obj, j15);
                    byte[] bArr4 = kw.f30477b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 6:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 7:
                    i15 = i17 * 53;
                    iFloatToIntBits = kw.a(ry.B(obj, j15));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 8:
                    i15 = i17 * 53;
                    iFloatToIntBits = ((String) ry.k(obj, j15)).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 9:
                    i16 = i17 * 53;
                    Object objK = ry.k(obj, j15);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i17 = i16 + iHashCode;
                    break;
                case 10:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.k(obj, j15).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 11:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 12:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 13:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 14:
                    i15 = i17 * 53;
                    jDoubleToLongBits = ry.i(obj, j15);
                    byte[] bArr5 = kw.f30477b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 15:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.h(obj, j15);
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 16:
                    i15 = i17 * 53;
                    jDoubleToLongBits = ry.i(obj, j15);
                    byte[] bArr6 = kw.f30477b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 17:
                    i16 = i17 * 53;
                    Object objK2 = ry.k(obj, j15);
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
                    iFloatToIntBits = ry.k(obj, j15).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case 50:
                    i15 = i17 * 53;
                    iFloatToIntBits = ry.k(obj, j15).hashCode();
                    i17 = i15 + iFloatToIntBits;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(B(obj, j15));
                        byte[] bArr7 = kw.f30477b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = Float.floatToIntBits(C(obj, j15));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = I(obj, j15);
                        byte[] bArr8 = kw.f30477b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = I(obj, j15);
                        byte[] bArr9 = kw.f30477b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = D(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = I(obj, j15);
                        byte[] bArr10 = kw.f30477b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = D(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = kw.a(v(obj, j15));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = ((String) ry.k(obj, j15)).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = ry.k(obj, j15).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = ry.k(obj, j15).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = D(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = D(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = D(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = I(obj, j15);
                        byte[] bArr11 = kw.f30477b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = D(obj, j15);
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        jDoubleToLongBits = I(obj, j15);
                        byte[] bArr12 = kw.f30477b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (u(obj, i25, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = ry.k(obj, j15).hashCode();
                        i17 = i15 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i17 * 53) + ((bw) obj).zbc.hashCode();
        return this.f30516f ? (iHashCode2 * 53) + ((yv) obj).zbb.f30564a.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int y(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.mlkit_vision_text_bundled_common.lu r41) {
        /*
            Method dump skipped, instruction units count: 4088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.mx.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.lu):int");
    }
}
