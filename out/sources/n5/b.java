package n5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [g5.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g5.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [n5.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [g5.i] */
    static void a(f fVar, g5.d dVar, int i15, int i16, c cVar) {
        boolean z15;
        boolean z16;
        boolean z17;
        float f15;
        ?? r15;
        g5.d dVar2;
        d dVar3;
        g5.i iVar;
        g5.i iVar2;
        int i17;
        d dVar4;
        g5.i iVar3;
        int i18;
        d[] dVarArr;
        int i19;
        d dVar5;
        d dVar6;
        g5.i iVar4;
        d dVar7;
        Object obj;
        int size;
        d dVar8;
        int i25;
        int i26 = i15;
        e eVar = cVar.f131798a;
        e eVar2 = cVar.f131800c;
        e eVar3 = cVar.f131799b;
        e eVar4 = cVar.f131801d;
        e eVar5 = cVar.f131802e;
        float f16 = cVar.f131808k;
        boolean z18 = fVar.Z[i26] == e.b.WRAP_CONTENT;
        if (i26 == 0) {
            int i27 = eVar5.f131890z0;
            z15 = i27 == 0;
            z16 = i27 == 1;
            if (i27 == 2) {
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            int i28 = eVar5.A0;
            z15 = i28 == 0;
            z16 = i28 == 1;
            if (i28 == 2) {
                z17 = true;
            } else {
                z17 = false;
            }
        }
        ?? r16 = eVar;
        boolean z19 = false;
        while (true) {
            f15 = f16;
            Object obj2 = null;
            if (z19) {
                break;
            }
            d dVar9 = r16.W[i16];
            int i29 = z17 ? 1 : 4;
            int iF = dVar9.f();
            e.b bVar = r16.Z[i26];
            boolean z25 = z18;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z26 = bVar == bVar2 && r16.f131887y[i26] == 0;
            boolean z27 = z17;
            d dVar10 = dVar9.f131825f;
            if (dVar10 != null && r16 != eVar) {
                iF += dVar10.f();
            }
            int i35 = iF;
            if (z27 && r16 != eVar && r16 != eVar3) {
                i29 = 8;
            }
            boolean z28 = z26;
            d dVar11 = dVar9.f131825f;
            if (dVar11 != null) {
                if (r16 == eVar3) {
                    dVar.h(dVar9.f131828i, dVar11.f131828i, i35, 6);
                } else {
                    dVar.h(dVar9.f131828i, dVar11.f131828i, i35, 8);
                }
                if (z28 && !z27) {
                    i29 = 5;
                }
                dVar.e(dVar9.f131828i, dVar9.f131825f.f131828i, i35, (r16 == eVar3 && z27 && r16.j0(i26)) ? 5 : i29);
            } else {
                z19 = z19;
                z15 = z15;
            }
            if (z25) {
                if (r16.X() == 8 || r16.Z[i26] != bVar2) {
                    i25 = 0;
                } else {
                    d[] dVarArr2 = r16.W;
                    i25 = 0;
                    dVar.h(dVarArr2[i16 + 1].f131828i, dVarArr2[i16].f131828i, 0, 5);
                }
                dVar.h(r16.W[i16].f131828i, fVar.W[i16].f131828i, i25, 8);
            }
            d dVar12 = r16.W[i16 + 1].f131825f;
            if (dVar12 != null) {
                e eVar6 = dVar12.f131823d;
                d dVar13 = eVar6.W[i16].f131825f;
                if (dVar13 != null && dVar13.f131823d == r16) {
                    obj2 = eVar6;
                }
            }
            if (obj2 != null) {
                r16 = obj2;
                z19 = z19;
            } else {
                z19 = true;
            }
            f16 = f15;
            z18 = z25;
            z17 = z27;
            z15 = z15;
            r16 = r16;
        }
        boolean z29 = z18;
        boolean z35 = z17;
        boolean z36 = z15;
        if (eVar4 != null) {
            int i36 = i16 + 1;
            if (eVar2.W[i36].f131825f != null) {
                d dVar14 = eVar4.W[i36];
                if (eVar4.Z[i26] == e.b.MATCH_CONSTRAINT && eVar4.f131887y[i26] == 0 && !z35) {
                    d dVar15 = dVar14.f131825f;
                    if (dVar15.f131823d == fVar) {
                        dVar.e(dVar14.f131828i, dVar15.f131828i, -dVar14.f(), 5);
                    } else if (z35) {
                        dVar8 = dVar14.f131825f;
                        if (dVar8.f131823d == fVar) {
                            dVar.e(dVar14.f131828i, dVar8.f131828i, -dVar14.f(), 4);
                        }
                    }
                } else if (z35) {
                    dVar8 = dVar14.f131825f;
                    if (dVar8.f131823d == fVar) {
                        dVar.e(dVar14.f131828i, dVar8.f131828i, -dVar14.f(), 4);
                    }
                }
                dVar.j(dVar14.f131828i, eVar2.W[i36].f131825f.f131828i, -dVar14.f(), 6);
            }
        }
        if (z29) {
            int i37 = i16 + 1;
            g5.i iVar5 = fVar.W[i37].f131828i;
            d dVar16 = eVar2.W[i37];
            dVar.h(iVar5, dVar16.f131828i, dVar16.f(), 8);
        }
        ArrayList<e> arrayList = cVar.f131805h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f17 = (!cVar.f131815r || cVar.f131817t) ? f15 : cVar.f131807j;
            float f18 = 0.0f;
            float f19 = 0.0f;
            e eVar7 = null;
            int i38 = 0;
            while (i38 < size) {
                e eVar8 = arrayList.get(i38);
                float f25 = eVar8.D0[i26];
                if (f25 < f18) {
                    if (cVar.f131817t) {
                        d[] dVarArr3 = eVar8.W;
                        f18 = f18;
                        dVar.e(dVarArr3[i16 + 1].f131828i, dVarArr3[i16].f131828i, 0, 4);
                    } else {
                        f25 = 1.0f;
                    }
                    arrayList = arrayList;
                    i38++;
                    f18 = f18;
                    arrayList = arrayList;
                }
                float f26 = f25;
                if (f26 == f18) {
                    d[] dVarArr4 = eVar8.W;
                    dVar.e(dVarArr4[i16 + 1].f131828i, dVarArr4[i16].f131828i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar7 != null) {
                        d[] dVarArr5 = eVar7.W;
                        g5.i iVar6 = dVarArr5[i16].f131828i;
                        int i39 = i16 + 1;
                        g5.i iVar7 = dVarArr5[i39].f131828i;
                        d[] dVarArr6 = eVar8.W;
                        g5.i iVar8 = dVarArr6[i16].f131828i;
                        g5.i iVar9 = dVarArr6[i39].f131828i;
                        g5.b bVarR = dVar.r();
                        bVarR.l(f19, f17, f26, iVar6, iVar7, iVar8, iVar9);
                        dVar.d(bVarR);
                    }
                    eVar7 = eVar8;
                    f19 = f26;
                }
                i38++;
                f18 = f18;
                arrayList = arrayList;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z35)) {
            d dVar17 = eVar.W[i16];
            int i45 = i16 + 1;
            d dVar18 = eVar2.W[i45];
            d dVar19 = dVar17.f131825f;
            g5.i iVar10 = dVar19 != null ? dVar19.f131828i : null;
            d dVar20 = dVar18.f131825f;
            g5.i iVar11 = dVar20 != null ? dVar20.f131828i : null;
            d dVar21 = eVar3.W[i16];
            if (eVar4 != null) {
                dVar18 = eVar4.W[i45];
            }
            if (iVar10 != null && iVar11 != null) {
                dVar.c(dVar21.f131828i, iVar10, dVar21.f(), i26 == 0 ? eVar5.f131868o0 : eVar5.f131870p0, iVar11, dVar18.f131828i, dVar18.f(), 7);
            }
        } else {
            if (!z36 || eVar3 == null) {
                if (z16 && eVar3 != null) {
                    int i46 = cVar.f131807j;
                    boolean z37 = i46 > 0 && cVar.f131806i == i46;
                    e eVar9 = eVar3;
                    e eVar10 = eVar9;
                    while (eVar9 != null) {
                        e eVar11 = eVar9.F0[i15];
                        while (eVar11 != null && eVar11.X() == 8) {
                            eVar11 = eVar11.F0[i15];
                        }
                        if (eVar9 != eVar3 && eVar9 != eVar4 && eVar11 != null) {
                            if (eVar11 == eVar4) {
                                eVar11 = null;
                            }
                            d dVar22 = eVar9.W[i16];
                            g5.i iVar12 = dVar22.f131828i;
                            d dVar23 = dVar22.f131825f;
                            if (dVar23 != null) {
                                g5.i iVar13 = dVar23.f131828i;
                            }
                            int i47 = i16 + 1;
                            g5.i iVar14 = eVar10.W[i47].f131828i;
                            int iF2 = dVar22.f();
                            int iF3 = eVar9.W[i47].f();
                            if (eVar11 != null) {
                                dVar3 = eVar11.W[i16];
                                iVar = dVar3.f131828i;
                                d dVar24 = dVar3.f131825f;
                                iVar2 = dVar24 != null ? dVar24.f131828i : null;
                            } else {
                                dVar3 = eVar4.W[i16];
                                iVar = dVar3 != null ? dVar3.f131828i : null;
                                iVar2 = eVar9.W[i47].f131828i;
                            }
                            if (dVar3 != null) {
                                iF3 += dVar3.f();
                            }
                            int iF4 = iF2 + eVar10.W[i47].f();
                            int i48 = z37 ? 8 : 4;
                            if (iVar12 != null && iVar14 != null && iVar != null && iVar2 != null) {
                                dVar.c(iVar12, iVar14, iF4, 0.5f, iVar, iVar2, iF3, i48);
                            }
                            eVar11 = eVar11;
                        }
                        if (eVar9.X() != 8) {
                            eVar10 = eVar9;
                        }
                        eVar9 = eVar11;
                    }
                    d dVar25 = eVar3.W[i16];
                    d dVar26 = eVar.W[i16].f131825f;
                    int i49 = i16 + 1;
                    d dVar27 = eVar4.W[i49];
                    d dVar28 = eVar2.W[i49].f131825f;
                    if (dVar26 == null) {
                        r15 = dVar;
                    } else {
                        if (eVar3 != eVar4) {
                            dVar.e(dVar25.f131828i, dVar26.f131828i, dVar25.f(), 5);
                        } else if (dVar28 != null) {
                            dVar2 = dVar;
                            dVar2.c(dVar25.f131828i, dVar26.f131828i, dVar25.f(), 0.5f, dVar27.f131828i, dVar28.f131828i, dVar27.f(), 5);
                        }
                        r15 = dVar;
                    }
                    if (dVar28 != null && eVar3 != eVar4) {
                        r15.e(dVar27.f131828i, dVar28.f131828i, -dVar27.f(), 5);
                    }
                }
                if ((z36 && !z16) || eVar3 == null || eVar3 == eVar4) {
                    return;
                }
                dVarArr = eVar3.W;
                d dVar29 = dVarArr[i16];
                if (eVar4 == null) {
                    eVar4 = eVar3;
                }
                i19 = i16 + 1;
                dVar5 = eVar4.W[i19];
                dVar6 = dVar29.f131825f;
                if (dVar6 != null) {
                    iVar4 = dVar6.f131828i;
                } else {
                    iVar4 = null;
                }
                dVar7 = dVar5.f131825f;
                if (dVar7 != null) {
                    obj = dVar7.f131828i;
                } else {
                    obj = null;
                }
                if (eVar2 != eVar4) {
                    d dVar30 = eVar2.W[i19].f131825f;
                    obj = dVar30 != null ? dVar30.f131828i : null;
                }
                if (eVar3 == eVar4) {
                    dVar5 = dVarArr[i19];
                }
                if (iVar4 != null || obj == null) {
                }
                r15.c(dVar29.f131828i, iVar4, dVar29.f(), 0.5f, obj, dVar5.f131828i, eVar4.W[i19].f(), 5);
                return;
            }
            int i55 = cVar.f131807j;
            boolean z38 = i55 > 0 && cVar.f131806i == i55;
            e eVar12 = eVar3;
            e eVar13 = eVar12;
            while (eVar12 != null) {
                e eVar14 = eVar12.F0[i26];
                while (true) {
                    if (eVar14 == null) {
                        i17 = 8;
                        break;
                    }
                    i17 = 8;
                    if (eVar14.X() != 8) {
                        break;
                    } else {
                        eVar14 = eVar14.F0[i26];
                    }
                }
                if (eVar14 != null || eVar12 == eVar4) {
                    d dVar31 = eVar12.W[i16];
                    g5.i iVar15 = dVar31.f131828i;
                    d dVar32 = dVar31.f131825f;
                    g5.i iVar16 = dVar32 != null ? dVar32.f131828i : null;
                    if (eVar13 != eVar12) {
                        iVar16 = eVar13.W[i16 + 1].f131828i;
                    } else if (eVar12 == eVar3) {
                        d dVar33 = eVar.W[i16].f131825f;
                        iVar16 = dVar33 != null ? dVar33.f131828i : null;
                    }
                    int iF5 = dVar31.f();
                    int i56 = i16 + 1;
                    int iF6 = eVar12.W[i56].f();
                    if (eVar14 != null) {
                        dVar4 = eVar14.W[i16];
                        iVar3 = dVar4.f131828i;
                    } else {
                        dVar4 = eVar2.W[i56].f131825f;
                        iVar3 = dVar4 != null ? dVar4.f131828i : null;
                    }
                    g5.i iVar17 = eVar12.W[i56].f131828i;
                    if (dVar4 != null) {
                        iF6 += dVar4.f();
                    }
                    int iF7 = iF5 + eVar13.W[i56].f();
                    if (iVar15 == null || iVar16 == null || iVar3 == null || iVar17 == null) {
                        i18 = 8;
                    } else {
                        if (eVar12 == eVar3) {
                            iF7 = eVar3.W[i16].f();
                        }
                        if (eVar12 == eVar4) {
                            iF6 = eVar4.W[i56].f();
                        }
                        eVar14 = eVar14;
                        i18 = 8;
                        dVar.c(iVar15, iVar16, iF7, 0.5f, iVar3, iVar17, iF6, z38 ? 8 : 5);
                    }
                    if (eVar12.X() != i18) {
                        eVar13 = eVar12;
                    }
                    i26 = i15;
                    eVar12 = eVar14;
                } else {
                    i18 = i17;
                }
                if (eVar12.X() != i18) {
                    eVar13 = eVar12;
                }
                i26 = i15;
                eVar12 = eVar14;
            }
        }
        r15 = dVar;
        if (z36) {
        }
        dVarArr = eVar3.W;
        d dVar210 = dVarArr[i16];
        if (eVar4 == null) {
            eVar4 = eVar3;
        }
        i19 = i16 + 1;
        dVar5 = eVar4.W[i19];
        dVar6 = dVar210.f131825f;
        if (dVar6 != null) {
            iVar4 = dVar6.f131828i;
        } else {
            iVar4 = null;
        }
        dVar7 = dVar5.f131825f;
        if (dVar7 != null) {
            obj = dVar7.f131828i;
        } else {
            obj = null;
        }
        if (eVar2 != eVar4) {
            d dVar34 = eVar2.W[i19].f131825f;
            obj = dVar34 != null ? dVar34.f131828i : null;
        }
        if (eVar3 == eVar4) {
            dVar5 = dVarArr[i19];
        }
        if (iVar4 != null) {
        }
    }

    public static void b(f fVar, g5.d dVar, ArrayList<e> arrayList, int i15) {
        int i16;
        c[] cVarArr;
        int i17;
        if (i15 == 0) {
            i16 = fVar.W0;
            cVarArr = fVar.Z0;
            i17 = 0;
        } else {
            i16 = fVar.X0;
            cVarArr = fVar.Y0;
            i17 = 2;
        }
        for (int i18 = 0; i18 < i16; i18++) {
            c cVar = cVarArr[i18];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f131798a)) {
                a(fVar, dVar, i15, i17, cVar);
            }
        }
    }
}
