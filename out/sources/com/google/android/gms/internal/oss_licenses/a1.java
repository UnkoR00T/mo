package com.google.android.gms.internal.oss_licenses;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a1 extends s0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final s0 f30731g = new a1(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object f30732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f30733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f30734f;

    private a1(Object obj, Object[] objArr, int i15) {
        this.f30732d = obj;
        this.f30733e = objArr;
        this.f30734f = i15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    static a1 f(int i15, Object[] objArr, r0 r0Var) {
        boolean z15;
        int i16;
        int i17;
        short[] sArr;
        boolean z16;
        Object obj;
        boolean z17;
        ?? r16;
        int i18 = i15;
        Object[] objArrCopyOf = objArr;
        if (i18 == 0) {
            return (a1) f30731g;
        }
        q0 q0Var = null;
        ?? r15 = 0;
        q0 q0Var2 = null;
        q0 q0Var3 = null;
        boolean z18 = false;
        int i19 = 1;
        if (i18 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            k0.a(obj2, obj3);
            return new a1(null, objArrCopyOf, 1);
        }
        g0.d(i18, objArrCopyOf.length >> 1, "index");
        int iN = t0.n(i18);
        if (i18 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            k0.a(obj4, obj5);
            r16 = 0;
            i18 = 1;
            i16 = 1;
        } else {
            int i25 = iN - 1;
            if (iN <= 128) {
                byte[] bArr = new byte[iN];
                Arrays.fill(bArr, (byte) -1);
                int i26 = 0;
                int i27 = 0;
                while (i26 < i18) {
                    int i28 = i27 + i27;
                    int i29 = i26 + i26;
                    Object obj6 = objArrCopyOf[i29];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i29 ^ 1];
                    Objects.requireNonNull(obj7);
                    k0.a(obj6, obj7);
                    int iA = l0.a(obj6.hashCode());
                    while (true) {
                        int i35 = iA & i25;
                        z17 = z18;
                        int i36 = bArr[i35] & 255;
                        if (i36 == 255) {
                            bArr[i35] = (byte) i28;
                            if (i27 < i26) {
                                objArrCopyOf[i28] = obj6;
                                objArrCopyOf[i28 ^ 1] = obj7;
                            }
                            i27++;
                            break;
                        }
                        if (obj6.equals(objArrCopyOf[i36 == true ? 1 : 0])) {
                            int i37 = ~i36;
                            Object obj8 = objArrCopyOf[i37 == true ? 1 : 0];
                            Objects.requireNonNull(obj8);
                            q0 q0Var4 = new q0(obj6, obj7, obj8);
                            objArrCopyOf[i37 == true ? 1 : 0] = obj7;
                            q0Var2 = q0Var4;
                            break;
                        }
                        iA = i35 + 1;
                        z18 = z17;
                    }
                    i26++;
                    z18 = z17;
                }
                z15 = z18;
                obj = bArr;
                z16 = z15;
                if (i27 == i18) {
                    i16 = 1;
                    r15 = obj;
                    r16 = z16;
                } else {
                    sArr = new Object[3];
                    sArr[z15 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i27);
                    sArr[2] = q0Var2;
                    r15 = sArr;
                    i16 = 1;
                    r16 = z15;
                }
            } else {
                z15 = false;
                if (iN <= 32768) {
                    sArr = new short[iN];
                    Arrays.fill(sArr, (short) -1);
                    int i38 = 0;
                    for (int i39 = 0; i39 < i18; i39++) {
                        int i45 = i38 + i38;
                        int i46 = i39 + i39;
                        Object obj9 = objArrCopyOf[i46];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i46 ^ 1];
                        Objects.requireNonNull(obj10);
                        k0.a(obj9, obj10);
                        int iA2 = l0.a(obj9.hashCode());
                        while (true) {
                            int i47 = iA2 & i25;
                            char c15 = (char) sArr[i47];
                            if (c15 == 65535) {
                                sArr[i47] = (short) i45;
                                if (i38 < i39) {
                                    objArrCopyOf[i45] = obj9;
                                    objArrCopyOf[i45 ^ 1] = obj10;
                                }
                                i38++;
                                break;
                            }
                            if (obj9.equals(objArrCopyOf[c15])) {
                                int i48 = c15 ^ 1;
                                Object obj11 = objArrCopyOf[i48 == true ? 1 : 0];
                                Objects.requireNonNull(obj11);
                                q0 q0Var5 = new q0(obj9, obj10, obj11);
                                objArrCopyOf[i48 == true ? 1 : 0] = obj10;
                                q0Var3 = q0Var5;
                                break;
                            }
                            iA2 = i47 + 1;
                        }
                    }
                    if (i38 == i18) {
                        r15 = sArr;
                        i16 = 1;
                        r16 = z15;
                    } else {
                        obj = new Object[]{sArr, Integer.valueOf(i38), q0Var3};
                        z16 = z15;
                        i16 = 1;
                        r15 = obj;
                        r16 = z16;
                    }
                } else {
                    int[] iArr = new int[iN];
                    Arrays.fill(iArr, -1);
                    int i49 = 0;
                    int i55 = 0;
                    while (i49 < i18) {
                        int i56 = i55 + i55;
                        int i57 = i49 + i49;
                        Object obj12 = objArrCopyOf[i57];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i57 ^ i19];
                        Objects.requireNonNull(obj13);
                        k0.a(obj12, obj13);
                        int iA3 = l0.a(obj12.hashCode());
                        while (true) {
                            int i58 = iA3 & i25;
                            int i59 = iArr[i58];
                            if (i59 == -1) {
                                iArr[i58] = i56;
                                if (i55 < i49) {
                                    objArrCopyOf[i56] = obj12;
                                    objArrCopyOf[i56 ^ 1] = obj13;
                                }
                                i55++;
                                i17 = i19;
                                break;
                            }
                            i17 = i19;
                            if (obj12.equals(objArrCopyOf[i59])) {
                                int i65 = i59 ^ 1;
                                Object obj14 = objArrCopyOf[i65];
                                Objects.requireNonNull(obj14);
                                q0 q0Var6 = new q0(obj12, obj13, obj14);
                                objArrCopyOf[i65] = obj13;
                                q0Var = q0Var6;
                                break;
                            }
                            iA3 = i58 + 1;
                            i19 = i17;
                        }
                        i49++;
                        i19 = i17;
                    }
                    i16 = i19;
                    if (i55 == i18) {
                        r15 = iArr;
                        r16 = z15;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i16] = Integer.valueOf(i55);
                        objArr2[2] = q0Var;
                        r15 = objArr2;
                        r16 = z15;
                    }
                }
            }
        }
        boolean z19 = r15 instanceof Object[];
        ?? r17 = r15;
        if (z19) {
            Object[] objArr3 = (Object[]) r15;
            r0Var.f30881c = (q0) objArr3[2];
            Object obj15 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i16]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r17 = obj15;
            i18 = iIntValue;
        }
        return new a1(r17, objArrCopyOf, i18);
    }

    @Override // com.google.android.gms.internal.oss_licenses.s0
    final t0 b() {
        return new x0(this, this.f30733e, 0, this.f30734f);
    }

    @Override // com.google.android.gms.internal.oss_licenses.s0
    final t0 c() {
        return new y0(this, new z0(this.f30733e, 0, this.f30734f));
    }

    @Override // com.google.android.gms.internal.oss_licenses.s0
    final m0 e() {
        return new z0(this.f30733e, 1, this.f30734f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.oss_licenses.s0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i15 = this.f30734f;
            Object[] objArr = this.f30733e;
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
                Object obj4 = this.f30732d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = l0.a(obj.hashCode());
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
                    int iA2 = l0.a(obj.hashCode());
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
                    int iA3 = l0.a(obj.hashCode());
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
        return this.f30734f;
    }
}
