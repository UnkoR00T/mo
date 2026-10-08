package i9;

import o8.p0;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f90483a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i15, boolean z15) {
        if ((i15 >>> 8) == 3368816) {
            return true;
        }
        if (i15 == 1751476579 && z15) {
            return true;
        }
        for (int i16 : f90483a) {
            if (i16 == i15) {
                return true;
            }
        }
        return false;
    }

    public static p0 b(o8.q qVar) {
        return c(qVar, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x0177  */
    /* JADX WARN: Code duplicated, block: B:110:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Multi-variable type inference failed */
    private static p0 c(o8.q qVar, boolean z15, boolean z16) {
        p0 p0Var;
        int i15;
        int i16;
        int i17;
        long j15;
        int i18;
        int[] iArr;
        long jA = qVar.a();
        long j16 = -1;
        int i19 = (jA > (-1L) ? 1 : (jA == (-1L) ? 0 : -1));
        long j17 = 4096;
        if (i19 != 0 && jA <= 4096) {
            j17 = jA;
        }
        int i25 = (int) j17;
        c0 c0Var = new c0(64);
        int i26 = 0;
        int i27 = 0;
        boolean z17 = false;
        while (true) {
            if (i27 < i25) {
                c0Var.b0(8);
                if (qVar.e(c0Var.f(), i26, 8, true)) {
                    long jS = c0Var.S();
                    int iZ = c0Var.z();
                    if (jS == 1) {
                        j16 = j16;
                        qVar.p(c0Var.f(), 8, 8);
                        i16 = 16;
                        c0Var.e0(16);
                        jS = c0Var.J();
                        i27 = i27;
                    } else {
                        j16 = j16;
                        if (jS == 0) {
                            long jA2 = qVar.a();
                            if (jA2 != j16) {
                                jS = (jA2 - qVar.j()) + ((long) 8);
                            }
                        }
                        i16 = 8;
                    }
                    long j18 = jS;
                    p0Var = null;
                    long j19 = i16;
                    if (j18 < j19) {
                        if (iZ != 1718773093 || i16 != 8) {
                            return new a(iZ, j18, i16);
                        }
                        j18 = j19;
                    }
                    int i28 = i27 + i16;
                    if (iZ == 1836019574 || iZ == 1970628964) {
                        i25 += (int) j18;
                        i17 = i19;
                        if (i19 != 0 && i25 > jA) {
                            i25 = (int) jA;
                        }
                        if (iZ == 1836019574) {
                            i27 = i28;
                            i19 = i17;
                            i26 = 0;
                        }
                    } else {
                        i17 = i19;
                    }
                    if (iZ == 1953653099 || iZ == 1835297121 || iZ == 1835626086) {
                        j15 = jA;
                        i18 = 0;
                        i27 = i28;
                    } else if (iZ == 1836019558 || iZ == 1836475768) {
                        i15 = 1;
                    } else {
                        if (iZ == 1835295092) {
                            z17 = true;
                        }
                        if (iZ != 1937007212 || j18 <= 1000000) {
                            j15 = jA;
                            if ((((long) i28) + j18) - j19 < i25) {
                                int i29 = (int) (j18 - j19);
                                i27 = i28 + i29;
                                if (iZ != 1718909296) {
                                    i18 = 0;
                                    if (i29 != 0) {
                                        qVar.k(i29);
                                    }
                                } else {
                                    if (i29 < 8) {
                                        return new a(iZ, i29, 8);
                                    }
                                    c0Var.b0(i29);
                                    i18 = 0;
                                    qVar.p(c0Var.f(), 0, i29);
                                    int iZ2 = c0Var.z();
                                    if (a(iZ2, z16)) {
                                        z17 = true;
                                    }
                                    c0Var.g0(4);
                                    int iA = c0Var.a() / 4;
                                    if (z17 || iA <= 0) {
                                        iArr = p0Var;
                                    } else {
                                        iArr = new int[iA];
                                        for (int i35 = 0; i35 < iA; i35++) {
                                            int iZ3 = c0Var.z();
                                            iArr[i35] = iZ3;
                                            if (a(iZ3, z16)) {
                                                z17 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z17) {
                                        return new a0(iZ2, iArr);
                                    }
                                }
                            }
                        }
                        i15 = 0;
                    }
                    i26 = i18;
                    i19 = i17;
                    jA = j15;
                }
                if (!z17) {
                    return r.f90470a;
                }
                if (z15 != i15) {
                    return i15 != 0 ? i.f90432b : i.f90433c;
                }
                return p0Var;
            }
            p0Var = null;
            i15 = i26;
            if (!z17) {
                return r.f90470a;
            }
            if (z15 != i15) {
                if (i15 != 0) {
                }
            }
            return p0Var;
        }
    }

    public static p0 d(o8.q qVar, boolean z15) {
        return c(qVar, false, z15);
    }
}
