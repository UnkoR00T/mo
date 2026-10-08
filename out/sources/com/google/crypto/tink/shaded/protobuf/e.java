package com.google.crypto.tink.shaded.protobuf;

import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
final class e {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36038a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f36038a = iArr;
            try {
                iArr[t1.b.f36207c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36038a[t1.b.f36208d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36038a[t1.b.f36209e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36038a[t1.b.f36210f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36038a[t1.b.f36211g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36038a[t1.b.f36219q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36038a[t1.b.f36212h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36038a[t1.b.f36222t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36038a[t1.b.f36213j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36038a[t1.b.f36221s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36038a[t1.b.f36214k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36038a[t1.b.f36223v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36038a[t1.b.f36224w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36038a[t1.b.f36220r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36038a[t1.b.f36218p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f36038a[t1.b.f36215l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f36038a[t1.b.f36216m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f36038a[t1.b.f36217n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f36041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f36042d;

        b(p pVar) {
            pVar.getClass();
            this.f36042d = pVar;
        }
    }

    static int A(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i16, bVar);
        zVar.h(i.b(bVar.f36039a));
        while (I < i17) {
            int I2 = I(bArr, I, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            I = I(bArr, I2, bVar);
            zVar.h(i.b(bVar.f36039a));
        }
        return I;
    }

    static int B(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        i0 i0Var = (i0) iVar;
        int iL = L(bArr, i16, bVar);
        i0Var.i(i.c(bVar.f36040b));
        while (iL < i17) {
            int I = I(bArr, iL, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            iL = L(bArr, I, bVar);
            i0Var.i(i.c(bVar.f36040b));
        }
        return iL;
    }

    static int C(byte[] bArr, int i15, b bVar) throws b0 {
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a;
        if (i16 < 0) {
            throw b0.g();
        }
        if (i16 == 0) {
            bVar.f36041c = "";
            return I;
        }
        bVar.f36041c = new String(bArr, I, i16, a0.f36000b);
        return I + i16;
    }

    static int D(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) throws b0 {
        int I = I(bArr, i16, bVar);
        int i18 = bVar.f36039a;
        if (i18 < 0) {
            throw b0.g();
        }
        if (i18 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, I, i18, a0.f36000b));
            I += i18;
        }
        while (I < i17) {
            int I2 = I(bArr, I, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i19 = bVar.f36039a;
            if (i19 < 0) {
                throw b0.g();
            }
            if (i19 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, I, i19, a0.f36000b));
                I += i19;
            }
        }
        return I;
    }

    static int E(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) throws b0 {
        int I = I(bArr, i16, bVar);
        int i18 = bVar.f36039a;
        if (i18 < 0) {
            throw b0.g();
        }
        if (i18 == 0) {
            iVar.add("");
        } else {
            int i19 = I + i18;
            if (!s1.n(bArr, I, i19)) {
                throw b0.d();
            }
            iVar.add(new String(bArr, I, i18, a0.f36000b));
            I = i19;
        }
        while (I < i17) {
            int I2 = I(bArr, I, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i25 = bVar.f36039a;
            if (i25 < 0) {
                throw b0.g();
            }
            if (i25 == 0) {
                iVar.add("");
            } else {
                int i26 = I + i25;
                if (!s1.n(bArr, I, i26)) {
                    throw b0.d();
                }
                iVar.add(new String(bArr, I, i25, a0.f36000b));
                I = i26;
            }
        }
        return I;
    }

    static int F(byte[] bArr, int i15, b bVar) throws b0 {
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a;
        if (i16 < 0) {
            throw b0.g();
        }
        if (i16 == 0) {
            bVar.f36041c = "";
            return I;
        }
        bVar.f36041c = s1.e(bArr, I, i16);
        return I + i16;
    }

    static int G(int i15, byte[] bArr, int i16, int i17, o1 o1Var, b bVar) throws b0 {
        if (t1.a(i15) == 0) {
            throw b0.c();
        }
        int iB = t1.b(i15);
        if (iB == 0) {
            int iL = L(bArr, i16, bVar);
            o1Var.n(i15, Long.valueOf(bVar.f36040b));
            return iL;
        }
        if (iB == 1) {
            o1Var.n(i15, Long.valueOf(j(bArr, i16)));
            return i16 + 8;
        }
        if (iB == 2) {
            int I = I(bArr, i16, bVar);
            int i18 = bVar.f36039a;
            if (i18 < 0) {
                throw b0.g();
            }
            if (i18 > bArr.length - I) {
                throw b0.n();
            }
            if (i18 == 0) {
                o1Var.n(i15, h.f36058b);
            } else {
                o1Var.n(i15, h.j(bArr, I, i18));
            }
            return I + i18;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw b0.c();
            }
            o1Var.n(i15, Integer.valueOf(h(bArr, i16)));
            return i16 + 4;
        }
        o1 o1VarK = o1.k();
        int i19 = (i15 & (-8)) | 4;
        int i25 = 0;
        while (i16 < i17) {
            int I2 = I(bArr, i16, bVar);
            i25 = bVar.f36039a;
            if (i25 == i19) {
                i16 = I2;
                break;
            }
            i16 = G(i25, bArr, I2, i17, o1VarK, bVar);
        }
        if (i16 > i17 || i25 != i19) {
            throw b0.h();
        }
        o1Var.n(i15, o1VarK);
        return i16;
    }

    static int H(int i15, byte[] bArr, int i16, b bVar) {
        int i17 = i15 & CertificateBody.profileType;
        int i18 = i16 + 1;
        byte b15 = bArr[i16];
        if (b15 >= 0) {
            bVar.f36039a = i17 | (b15 << 7);
            return i18;
        }
        int i19 = i17 | ((b15 & 127) << 7);
        int i25 = i16 + 2;
        byte b16 = bArr[i18];
        if (b16 >= 0) {
            bVar.f36039a = i19 | (b16 << 14);
            return i25;
        }
        int i26 = i19 | ((b16 & 127) << 14);
        int i27 = i16 + 3;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            bVar.f36039a = i26 | (b17 << 21);
            return i27;
        }
        int i28 = i26 | ((b17 & 127) << 21);
        int i29 = i16 + 4;
        byte b18 = bArr[i27];
        if (b18 >= 0) {
            bVar.f36039a = i28 | (b18 << 28);
            return i29;
        }
        int i35 = i28 | ((b18 & 127) << 28);
        while (true) {
            int i36 = i29 + 1;
            if (bArr[i29] >= 0) {
                bVar.f36039a = i35;
                return i36;
            }
            i29 = i36;
        }
    }

    static int I(byte[] bArr, int i15, b bVar) {
        int i16 = i15 + 1;
        byte b15 = bArr[i15];
        if (b15 < 0) {
            return H(b15, bArr, i16, bVar);
        }
        bVar.f36039a = b15;
        return i16;
    }

    static int J(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int I = I(bArr, i16, bVar);
        zVar.h(bVar.f36039a);
        while (I < i17) {
            int I2 = I(bArr, I, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            I = I(bArr, I2, bVar);
            zVar.h(bVar.f36039a);
        }
        return I;
    }

    static int K(long j15, byte[] bArr, int i15, b bVar) {
        int i16 = i15 + 1;
        byte b15 = bArr[i15];
        long j16 = (j15 & 127) | (((long) (b15 & 127)) << 7);
        int i17 = 7;
        while (b15 < 0) {
            int i18 = i16 + 1;
            byte b16 = bArr[i16];
            i17 += 7;
            j16 |= ((long) (b16 & 127)) << i17;
            i16 = i18;
            b15 = b16;
        }
        bVar.f36040b = j16;
        return i16;
    }

    static int L(byte[] bArr, int i15, b bVar) {
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        if (j15 < 0) {
            return K(j15, bArr, i16, bVar);
        }
        bVar.f36040b = j15;
        return i16;
    }

    static int M(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        i0 i0Var = (i0) iVar;
        int iL = L(bArr, i16, bVar);
        i0Var.i(bVar.f36040b);
        while (iL < i17) {
            int I = I(bArr, iL, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            iL = L(bArr, I, bVar);
            i0Var.i(bVar.f36040b);
        }
        return iL;
    }

    static int N(Object obj, g1 g1Var, byte[] bArr, int i15, int i16, int i17, b bVar) {
        int iG0 = ((u0) g1Var).g0(obj, bArr, i15, i16, i17, bVar);
        bVar.f36041c = obj;
        return iG0;
    }

    static int O(Object obj, g1 g1Var, byte[] bArr, int i15, int i16, b bVar) throws b0 {
        int iH = i15 + 1;
        int i17 = bArr[i15];
        if (i17 < 0) {
            iH = H(i17, bArr, iH, bVar);
            i17 = bVar.f36039a;
        }
        int i18 = iH;
        if (i17 < 0 || i17 > i16 - i18) {
            throw b0.n();
        }
        int i19 = i18 + i17;
        g1Var.h(obj, bArr, i18, i19, bVar);
        bVar.f36041c = obj;
        return i19;
    }

    static int P(int i15, byte[] bArr, int i16, int i17, b bVar) throws b0 {
        if (t1.a(i15) == 0) {
            throw b0.c();
        }
        int iB = t1.b(i15);
        if (iB == 0) {
            return L(bArr, i16, bVar);
        }
        if (iB == 1) {
            return i16 + 8;
        }
        if (iB == 2) {
            return I(bArr, i16, bVar) + bVar.f36039a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i16 + 4;
            }
            throw b0.c();
        }
        int i18 = (i15 & (-8)) | 4;
        int i19 = 0;
        while (i16 < i17) {
            i16 = I(bArr, i16, bVar);
            i19 = bVar.f36039a;
            if (i19 == i18) {
                break;
            }
            i16 = P(i19, bArr, i16, i17, bVar);
        }
        if (i16 > i17 || i19 != i18) {
            throw b0.h();
        }
        return i16;
    }

    static int a(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        f fVar = (f) iVar;
        int iL = L(bArr, i16, bVar);
        fVar.i(bVar.f36040b != 0);
        while (iL < i17) {
            int I = I(bArr, iL, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            iL = L(bArr, I, bVar);
            fVar.i(bVar.f36040b != 0);
        }
        return iL;
    }

    static int b(byte[] bArr, int i15, b bVar) throws b0 {
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a;
        if (i16 < 0) {
            throw b0.g();
        }
        if (i16 > bArr.length - I) {
            throw b0.n();
        }
        if (i16 == 0) {
            bVar.f36041c = h.f36058b;
            return I;
        }
        bVar.f36041c = h.j(bArr, I, i16);
        return I + i16;
    }

    static int c(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) throws b0 {
        int I = I(bArr, i16, bVar);
        int i18 = bVar.f36039a;
        if (i18 < 0) {
            throw b0.g();
        }
        if (i18 > bArr.length - I) {
            throw b0.n();
        }
        if (i18 == 0) {
            iVar.add(h.f36058b);
        } else {
            iVar.add(h.j(bArr, I, i18));
            I += i18;
        }
        while (I < i17) {
            int I2 = I(bArr, I, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i19 = bVar.f36039a;
            if (i19 < 0) {
                throw b0.g();
            }
            if (i19 > bArr.length - I) {
                throw b0.n();
            }
            if (i19 == 0) {
                iVar.add(h.f36058b);
            } else {
                iVar.add(h.j(bArr, I, i19));
                I += i19;
            }
        }
        return I;
    }

    static double d(byte[] bArr, int i15) {
        return Double.longBitsToDouble(j(bArr, i15));
    }

    static int e(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        m mVar = (m) iVar;
        mVar.h(d(bArr, i16));
        int i18 = i16 + 8;
        while (i18 < i17) {
            int I = I(bArr, i18, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            mVar.h(d(bArr, I));
            i18 = I + 8;
        }
        return i18;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i15, byte[] bArr, int i16, int i17, y.c<?, ?> cVar, y.e<?, ?> eVar, n1<o1, o1> n1Var, b bVar) throws b0 {
        int i18;
        int i19;
        u<y.d> uVar = cVar.extensions;
        int i25 = i15 >>> 3;
        if (eVar.f36326b.C() && eVar.f36326b.M()) {
            switch (a.f36038a[eVar.a().ordinal()]) {
                case 1:
                    m mVar = new m();
                    int iS = s(bArr, i16, mVar, bVar);
                    uVar.x(eVar.f36326b, mVar);
                    return iS;
                case 2:
                    w wVar = new w();
                    int iV = v(bArr, i16, wVar, bVar);
                    uVar.x(eVar.f36326b, wVar);
                    return iV;
                case 3:
                case 4:
                    i0 i0Var = new i0();
                    int iZ = z(bArr, i16, i0Var, bVar);
                    uVar.x(eVar.f36326b, i0Var);
                    return iZ;
                case 5:
                case 6:
                    z zVar = new z();
                    int iY = y(bArr, i16, zVar, bVar);
                    uVar.x(eVar.f36326b, zVar);
                    return iY;
                case 7:
                case 8:
                    i0 i0Var2 = new i0();
                    int iU = u(bArr, i16, i0Var2, bVar);
                    uVar.x(eVar.f36326b, i0Var2);
                    return iU;
                case 9:
                case 10:
                    z zVar2 = new z();
                    int iT = t(bArr, i16, zVar2, bVar);
                    uVar.x(eVar.f36326b, zVar2);
                    return iT;
                case 11:
                    f fVar = new f();
                    int iR = r(bArr, i16, fVar, bVar);
                    uVar.x(eVar.f36326b, fVar);
                    return iR;
                case 12:
                    z zVar3 = new z();
                    int iW = w(bArr, i16, zVar3, bVar);
                    uVar.x(eVar.f36326b, zVar3);
                    return iW;
                case 13:
                    i0 i0Var3 = new i0();
                    int iX = x(bArr, i16, i0Var3, bVar);
                    uVar.x(eVar.f36326b, i0Var3);
                    return iX;
                case 14:
                    z zVar4 = new z();
                    int iY2 = y(bArr, i16, zVar4, bVar);
                    i1.z(cVar, i25, zVar4, eVar.f36326b.e(), null, n1Var);
                    uVar.x(eVar.f36326b, zVar4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f36326b.E());
            }
        }
        Object objValueOf = null;
        if (eVar.a() == t1.b.f36220r) {
            i16 = I(bArr, i16, bVar);
            if (eVar.f36326b.e().a(bVar.f36039a) == null) {
                i1.L(cVar, i25, bVar.f36039a, null, n1Var);
                return i16;
            }
            objValueOf = Integer.valueOf(bVar.f36039a);
        } else {
            switch (a.f36038a[eVar.a().ordinal()]) {
                case 1:
                    i18 = i16;
                    objValueOf = Double.valueOf(d(bArr, i18));
                    i16 = i18 + 8;
                    break;
                case 2:
                    i19 = i16;
                    objValueOf = Float.valueOf(l(bArr, i19));
                    i16 = i19 + 4;
                    break;
                case 3:
                case 4:
                    i16 = L(bArr, i16, bVar);
                    objValueOf = Long.valueOf(bVar.f36040b);
                    break;
                case 5:
                case 6:
                    i16 = I(bArr, i16, bVar);
                    objValueOf = Integer.valueOf(bVar.f36039a);
                    break;
                case 7:
                case 8:
                    i18 = i16;
                    objValueOf = Long.valueOf(j(bArr, i18));
                    i16 = i18 + 8;
                    break;
                case 9:
                case 10:
                    i19 = i16;
                    objValueOf = Integer.valueOf(h(bArr, i19));
                    i16 = i19 + 4;
                    break;
                case 11:
                    i16 = L(bArr, i16, bVar);
                    objValueOf = Boolean.valueOf(bVar.f36040b != 0);
                    break;
                case 12:
                    i16 = I(bArr, i16, bVar);
                    objValueOf = Integer.valueOf(i.b(bVar.f36039a));
                    break;
                case 13:
                    i16 = L(bArr, i16, bVar);
                    objValueOf = Long.valueOf(i.c(bVar.f36040b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i16 = b(bArr, i16, bVar);
                    objValueOf = bVar.f36041c;
                    break;
                case 16:
                    i16 = C(bArr, i16, bVar);
                    objValueOf = bVar.f36041c;
                    break;
                case 17:
                    int i26 = (i25 << 3) | 4;
                    g1 g1VarC = c1.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iN = n(g1VarC, bArr, i16, i17, i26, bVar);
                        uVar.a(eVar.f36326b, bVar.f36041c);
                        return iN;
                    }
                    Object objI = uVar.i(eVar.f36326b);
                    if (objI == null) {
                        objI = g1VarC.d();
                        uVar.x(eVar.f36326b, objI);
                    }
                    return N(objI, g1VarC, bArr, i16, i17, i26, bVar);
                case 18:
                    g1 g1VarC2 = c1.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iP = p(g1VarC2, bArr, i16, i17, bVar);
                        uVar.a(eVar.f36326b, bVar.f36041c);
                        return iP;
                    }
                    Object objI2 = uVar.i(eVar.f36326b);
                    if (objI2 == null) {
                        objI2 = g1VarC2.d();
                        uVar.x(eVar.f36326b, objI2);
                    }
                    return O(objI2, g1VarC2, bArr, i16, i17, bVar);
            }
        }
        if (eVar.d()) {
            uVar.a(eVar.f36326b, objValueOf);
            return i16;
        }
        uVar.x(eVar.f36326b, objValueOf);
        return i16;
    }

    static int g(int i15, byte[] bArr, int i16, int i17, Object obj, r0 r0Var, n1<o1, o1> n1Var, b bVar) {
        y.e eVarA = bVar.f36042d.a(r0Var, i15 >>> 3);
        if (eVarA == null) {
            return G(i15, bArr, i16, i17, u0.w(obj), bVar);
        }
        y.c cVar = (y.c) obj;
        cVar.V();
        return f(i15, bArr, i16, i17, cVar, eVarA, n1Var, bVar);
    }

    static int h(byte[] bArr, int i15) {
        return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    static int i(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        zVar.h(h(bArr, i16));
        int i18 = i16 + 4;
        while (i18 < i17) {
            int I = I(bArr, i18, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            zVar.h(h(bArr, I));
            i18 = I + 4;
        }
        return i18;
    }

    static long j(byte[] bArr, int i15) {
        return ((((long) bArr[i15 + 7]) & 255) << 56) | (((long) bArr[i15]) & 255) | ((((long) bArr[i15 + 1]) & 255) << 8) | ((((long) bArr[i15 + 2]) & 255) << 16) | ((((long) bArr[i15 + 3]) & 255) << 24) | ((((long) bArr[i15 + 4]) & 255) << 32) | ((((long) bArr[i15 + 5]) & 255) << 40) | ((((long) bArr[i15 + 6]) & 255) << 48);
    }

    static int k(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        i0 i0Var = (i0) iVar;
        i0Var.i(j(bArr, i16));
        int i18 = i16 + 8;
        while (i18 < i17) {
            int I = I(bArr, i18, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            i0Var.i(j(bArr, I));
            i18 = I + 8;
        }
        return i18;
    }

    static float l(byte[] bArr, int i15) {
        return Float.intBitsToFloat(h(bArr, i15));
    }

    static int m(int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        w wVar = (w) iVar;
        wVar.h(l(bArr, i16));
        int i18 = i16 + 4;
        while (i18 < i17) {
            int I = I(bArr, i18, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            wVar.h(l(bArr, I));
            i18 = I + 4;
        }
        return i18;
    }

    static int n(g1 g1Var, byte[] bArr, int i15, int i16, int i17, b bVar) {
        Object objD = g1Var.d();
        int iN = N(objD, g1Var, bArr, i15, i16, i17, bVar);
        g1Var.e(objD);
        bVar.f36041c = objD;
        return iN;
    }

    static int o(g1 g1Var, int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) {
        int i18 = (i15 & (-8)) | 4;
        int iN = n(g1Var, bArr, i16, i17, i18, bVar);
        iVar.add(bVar.f36041c);
        while (iN < i17) {
            int I = I(bArr, iN, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            iN = n(g1Var, bArr, I, i17, i18, bVar);
            iVar.add(bVar.f36041c);
        }
        return iN;
    }

    static int p(g1 g1Var, byte[] bArr, int i15, int i16, b bVar) throws b0 {
        Object objD = g1Var.d();
        int iO = O(objD, g1Var, bArr, i15, i16, bVar);
        g1Var.e(objD);
        bVar.f36041c = objD;
        return iO;
    }

    static int q(g1<?> g1Var, int i15, byte[] bArr, int i16, int i17, a0.i<?> iVar, b bVar) throws b0 {
        int iP = p(g1Var, bArr, i16, i17, bVar);
        iVar.add(bVar.f36041c);
        while (iP < i17) {
            int I = I(bArr, iP, bVar);
            if (i15 != bVar.f36039a) {
                break;
            }
            iP = p(g1Var, bArr, I, i17, bVar);
            iVar.add(bVar.f36041c);
        }
        return iP;
    }

    static int r(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        f fVar = (f) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            I = L(bArr, I, bVar);
            fVar.i(bVar.f36040b != 0);
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int s(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        m mVar = (m) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            mVar.h(d(bArr, I));
            I += 8;
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int t(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        z zVar = (z) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            zVar.h(h(bArr, I));
            I += 4;
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int u(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        i0 i0Var = (i0) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            i0Var.i(j(bArr, I));
            I += 8;
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int v(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        w wVar = (w) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            wVar.h(l(bArr, I));
            I += 4;
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int w(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        z zVar = (z) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            I = I(bArr, I, bVar);
            zVar.h(i.b(bVar.f36039a));
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int x(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        i0 i0Var = (i0) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            I = L(bArr, I, bVar);
            i0Var.i(i.c(bVar.f36040b));
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int y(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        z zVar = (z) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            I = I(bArr, I, bVar);
            zVar.h(bVar.f36039a);
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }

    static int z(byte[] bArr, int i15, a0.i<?> iVar, b bVar) throws b0 {
        i0 i0Var = (i0) iVar;
        int I = I(bArr, i15, bVar);
        int i16 = bVar.f36039a + I;
        while (I < i16) {
            I = L(bArr, I, bVar);
            i0Var.i(bVar.f36040b);
        }
        if (I == i16) {
            return I;
        }
        throw b0.n();
    }
}
