package bh;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class q extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final i f19464g = new q(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object f19465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f19466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f19467f;

    private q(Object obj, Object[] objArr, int i15) {
        this.f19465d = obj;
        this.f19466e = objArr;
        this.f19467f = i15;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static q g(int i15, Object[] objArr, h hVar) {
        int iHighestOneBit;
        boolean z15;
        int i16;
        char c15;
        ?? r15;
        char c16;
        short[] sArr;
        boolean z16;
        int i17;
        ?? r16;
        boolean z17;
        ?? r17;
        Object[] objArr2;
        g gVar;
        boolean z18;
        int i18 = i15;
        Object[] objArrCopyOf = objArr;
        if (i18 == 0) {
            return (q) f19464g;
        }
        g gVar2 = null;
        ?? r18 = 0;
        g gVar3 = null;
        g gVar4 = null;
        boolean z19 = false;
        int i19 = 1;
        if (i18 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            a1.a(obj, obj2);
            return new q(null, objArrCopyOf, 1);
        }
        x0.b(i18, objArrCopyOf.length >> 1, "index");
        char c17 = 2;
        int iMax = Math.max(i18, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i18 != 1) {
            int i25 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i26 = 0;
                int i27 = 0;
                while (i26 < i18) {
                    int i28 = i27 + i27;
                    int i29 = i26 + i26;
                    Object obj3 = objArrCopyOf[i29];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i29 ^ i19];
                    Objects.requireNonNull(obj4);
                    a1.a(obj3, obj4);
                    int iA = c1.a(obj3.hashCode());
                    while (true) {
                        int i35 = iA & i25;
                        z16 = z19;
                        i17 = i19;
                        int i36 = bArr[i35] & 255;
                        if (i36 == 255) {
                            bArr[i35] = (byte) i28;
                            if (i27 < i26) {
                                objArrCopyOf[i28] = obj3;
                                objArrCopyOf[i28 ^ 1] = obj4;
                            }
                            i27++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i36 == true ? 1 : 0])) {
                            int i37 = ~i36;
                            Object obj5 = objArrCopyOf[i37 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            g gVar5 = new g(obj3, obj4, obj5);
                            objArrCopyOf[i37 == true ? 1 : 0] = obj4;
                            gVar3 = gVar5;
                            break;
                        }
                        iA = i35 + 1;
                        z19 = z16;
                        i19 = i17;
                    }
                    i26++;
                    z19 = z16;
                    i19 = i17;
                }
                z15 = z19;
                i16 = i19;
                if (i27 == i18) {
                    c15 = 2;
                    r15 = bArr;
                    r16 = z15;
                } else {
                    sArr = new Object[3];
                    sArr[z15 ? 1 : 0] = bArr;
                    sArr[i16] = Integer.valueOf(i27);
                    sArr[2] = gVar3;
                    r18 = sArr;
                    z18 = z15;
                }
            } else {
                z15 = false;
                i16 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i38 = 0;
                    for (int i39 = 0; i39 < i18; i39++) {
                        int i45 = i38 + i38;
                        int i46 = i39 + i39;
                        Object obj6 = objArrCopyOf[i46];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i46 ^ 1];
                        Objects.requireNonNull(obj7);
                        a1.a(obj6, obj7);
                        int iA2 = c1.a(obj6.hashCode());
                        while (true) {
                            int i47 = iA2 & i25;
                            char c18 = (char) sArr[i47];
                            if (c18 == 65535) {
                                sArr[i47] = (short) i45;
                                if (i38 < i39) {
                                    objArrCopyOf[i45] = obj6;
                                    objArrCopyOf[i45 ^ 1] = obj7;
                                }
                                i38++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c18])) {
                                int i48 = c18 ^ 1;
                                Object obj8 = objArrCopyOf[i48 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                g gVar6 = new g(obj6, obj7, obj8);
                                objArrCopyOf[i48 == true ? 1 : 0] = obj7;
                                gVar4 = gVar6;
                                break;
                            }
                            iA2 = i47 + 1;
                        }
                    }
                    if (i38 == i18) {
                        r18 = sArr;
                        z18 = z15;
                    } else {
                        r18 = new Object[]{sArr, Integer.valueOf(i38), gVar4};
                        z18 = z15;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i49 = 0;
                    int i55 = 0;
                    while (i49 < i18) {
                        int i56 = i55 + i55;
                        int i57 = i49 + i49;
                        Object obj9 = objArrCopyOf[i57];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i57 ^ 1];
                        Objects.requireNonNull(obj10);
                        a1.a(obj9, obj10);
                        int iA3 = c1.a(obj9.hashCode());
                        while (true) {
                            int i58 = iA3 & i25;
                            int i59 = iArr[i58];
                            if (i59 == -1) {
                                iArr[i58] = i56;
                                if (i55 < i49) {
                                    objArrCopyOf[i56] = obj9;
                                    objArrCopyOf[i56 ^ 1] = obj10;
                                }
                                i55++;
                                c16 = c17;
                                break;
                            }
                            c16 = c17;
                            if (obj9.equals(objArrCopyOf[i59])) {
                                int i65 = i59 ^ 1;
                                Object obj11 = objArrCopyOf[i65];
                                Objects.requireNonNull(obj11);
                                g gVar7 = new g(obj9, obj10, obj11);
                                objArrCopyOf[i65] = obj10;
                                gVar2 = gVar7;
                                break;
                            }
                            iA3 = i58 + 1;
                            c17 = c16;
                        }
                        i49++;
                        c17 = c16;
                    }
                    c15 = c17;
                    if (i55 == i18) {
                        r15 = iArr;
                        r16 = z15;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i55);
                        objArr3[c15] = gVar2;
                        r15 = objArr3;
                        r16 = z15;
                    }
                }
            }
            z17 = r15 instanceof Object[];
            r17 = r15;
            if (z17) {
                objArr2 = (Object[]) r15;
                gVar = (g) objArr2[c15];
                if (hVar != null) {
                    throw gVar.a();
                }
                hVar.f19433c = gVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i16]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r17 = obj12;
                i18 = iIntValue;
            }
            return new q(r17, objArrCopyOf, i18);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        a1.a(obj13, obj14);
        z18 = false;
        i18 = 1;
        i16 = 1;
        c15 = 2;
        r15 = r18;
        r16 = z18;
        z17 = r15 instanceof Object[];
        r17 = r15;
        if (z17) {
            objArr2 = (Object[]) r15;
            gVar = (g) objArr2[c15];
            if (hVar != null) {
                throw gVar.a();
            }
            hVar.f19433c = gVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i16]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r17 = obj15;
            i18 = iIntValue2;
        }
        return new q(r17, objArrCopyOf, i18);
    }

    @Override // bh.i
    final c a() {
        return new p(this.f19466e, 1, this.f19467f);
    }

    @Override // bh.i
    final j d() {
        return new n(this, this.f19466e, 0, this.f19467f);
    }

    @Override // bh.i
    final j e() {
        return new o(this, new p(this.f19466e, 0, this.f19467f));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // bh.i, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i15 = this.f19467f;
            Object[] objArr = this.f19466e;
            if (i15 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f19465d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = c1.a(obj.hashCode());
                    while (true) {
                        int i16 = iA & length;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i17])) {
                            obj2 = objArr[i17 ^ 1];
                        } else {
                            iA = i16 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = c1.a(obj.hashCode());
                    while (true) {
                        int i18 = iA2 & length2;
                        char c15 = (char) sArr[i18];
                        if (c15 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c15])) {
                            obj2 = objArr[c15 ^ 1];
                        } else {
                            iA2 = i18 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = c1.a(obj.hashCode());
                    while (true) {
                        int i19 = iA3 & length3;
                        int i25 = iArr[i19];
                        if (i25 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i25])) {
                            obj2 = objArr[i25 ^ 1];
                        } else {
                            iA3 = i19 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19467f;
    }
}
