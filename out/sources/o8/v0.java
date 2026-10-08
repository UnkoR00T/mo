package o8;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f143208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f143209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143210c;

        public a(String str, String[] strArr, int i15) {
            this.f143208a = str;
            this.f143209b = strArr;
            this.f143210c = i15;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f143211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f143212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f143214d;

        public b(boolean z15, int i15, int i16, int i17) {
            this.f143211a = z15;
            this.f143212b = i15;
            this.f143213c = i16;
            this.f143214d = i17;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f143215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f143216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f143218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f143219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f143220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f143221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f143222h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f143223i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f143224j;

        public c(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, boolean z15, byte[] bArr) {
            this.f143215a = i15;
            this.f143216b = i16;
            this.f143217c = i17;
            this.f143218d = i18;
            this.f143219e = i19;
            this.f143220f = i25;
            this.f143221g = i26;
            this.f143222h = i27;
            this.f143223i = z15;
            this.f143224j = bArr;
        }
    }

    public static int[] a(int i15) {
        if (i15 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i15 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i15 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i15 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i15 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i15) {
        int i16 = 0;
        while (i15 > 0) {
            i16++;
            i15 >>>= 1;
        }
        return i16;
    }

    private static long c(long j15, long j16) {
        return (long) Math.floor(Math.pow(j15, 1.0d / j16));
    }

    public static t7.v d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            String str = list.get(i15);
            String[] strArrA1 = w7.o0.a1(str, "=");
            if (strArrA1.length != 2) {
                w7.t.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrA1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(a9.a.d(new w7.c0(Base64.decode(strArrA1[1], 0))));
                } catch (RuntimeException e15) {
                    w7.t.i("VorbisUtil", "Failed to parse vorbis picture", e15);
                }
            } else {
                arrayList.add(new f9.a(strArrA1[0], strArrA1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new t7.v(arrayList);
    }

    public static ak.n0<byte[]> e(byte[] bArr) {
        w7.c0 c0Var = new w7.c0(bArr);
        c0Var.g0(1);
        int i15 = 0;
        while (c0Var.a() > 0 && c0Var.q() == 255) {
            i15 += GF2Field.MASK;
            c0Var.g0(1);
        }
        int iQ = i15 + c0Var.Q();
        int i16 = 0;
        while (c0Var.a() > 0 && c0Var.q() == 255) {
            i16 += GF2Field.MASK;
            c0Var.g0(1);
        }
        int iQ2 = i16 + c0Var.Q();
        byte[] bArr2 = new byte[iQ];
        int iG = c0Var.g();
        System.arraycopy(bArr, iG, bArr2, 0, iQ);
        int i17 = iG + iQ + iQ2;
        int length = bArr.length - i17;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i17, bArr3, 0, length);
        return ak.n0.F(bArr2, bArr3);
    }

    private static void f(u0 u0Var) throws t7.x {
        int iD = u0Var.d(6) + 1;
        for (int i15 = 0; i15 < iD; i15++) {
            int iD2 = u0Var.d(16);
            if (iD2 == 0) {
                u0Var.e(8);
                u0Var.e(16);
                u0Var.e(16);
                u0Var.e(6);
                u0Var.e(8);
                int iD3 = u0Var.d(4) + 1;
                for (int i16 = 0; i16 < iD3; i16++) {
                    u0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw t7.x.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = u0Var.d(5);
                int[] iArr = new int[iD4];
                int i17 = -1;
                for (int i18 = 0; i18 < iD4; i18++) {
                    int iD5 = u0Var.d(4);
                    iArr[i18] = iD5;
                    if (iD5 > i17) {
                        i17 = iD5;
                    }
                }
                int i19 = i17 + 1;
                int[] iArr2 = new int[i19];
                for (int i25 = 0; i25 < i19; i25++) {
                    iArr2[i25] = u0Var.d(3) + 1;
                    int iD6 = u0Var.d(2);
                    if (iD6 > 0) {
                        u0Var.e(8);
                    }
                    for (int i26 = 0; i26 < (1 << iD6); i26++) {
                        u0Var.e(8);
                    }
                }
                u0Var.e(2);
                int iD7 = u0Var.d(4);
                int i27 = 0;
                int i28 = 0;
                for (int i29 = 0; i29 < iD4; i29++) {
                    i27 += iArr2[iArr[i29]];
                    while (i28 < i27) {
                        u0Var.e(iD7);
                        i28++;
                    }
                }
            }
        }
    }

    private static void g(int i15, u0 u0Var) throws t7.x {
        int iD = u0Var.d(6) + 1;
        for (int i16 = 0; i16 < iD; i16++) {
            int iD2 = u0Var.d(16);
            if (iD2 != 0) {
                w7.t.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = u0Var.c() ? u0Var.d(4) + 1 : 1;
                if (u0Var.c()) {
                    int iD4 = u0Var.d(8) + 1;
                    for (int i17 = 0; i17 < iD4; i17++) {
                        int i18 = i15 - 1;
                        u0Var.e(b(i18));
                        u0Var.e(b(i18));
                    }
                }
                if (u0Var.d(2) != 0) {
                    throw t7.x.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i19 = 0; i19 < i15; i19++) {
                        u0Var.e(4);
                    }
                }
                for (int i25 = 0; i25 < iD3; i25++) {
                    u0Var.e(8);
                    u0Var.e(8);
                    u0Var.e(8);
                }
            }
        }
    }

    private static b[] h(u0 u0Var) {
        int iD = u0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i15 = 0; i15 < iD; i15++) {
            bVarArr[i15] = new b(u0Var.c(), u0Var.d(16), u0Var.d(16), u0Var.d(8));
        }
        return bVarArr;
    }

    private static void i(u0 u0Var) throws t7.x {
        int iD = u0Var.d(6) + 1;
        for (int i15 = 0; i15 < iD; i15++) {
            if (u0Var.d(16) > 2) {
                throw t7.x.a("residueType greater than 2 is not decodable", null);
            }
            u0Var.e(24);
            u0Var.e(24);
            u0Var.e(24);
            int iD2 = u0Var.d(6) + 1;
            u0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i16 = 0; i16 < iD2; i16++) {
                iArr[i16] = ((u0Var.c() ? u0Var.d(5) : 0) * 8) + u0Var.d(3);
            }
            for (int i17 = 0; i17 < iD2; i17++) {
                for (int i18 = 0; i18 < 8; i18++) {
                    if ((iArr[i17] & (1 << i18)) != 0) {
                        u0Var.e(8);
                    }
                }
            }
        }
    }

    public static a j(w7.c0 c0Var) {
        return k(c0Var, true, true);
    }

    public static a k(w7.c0 c0Var, boolean z15, boolean z16) throws t7.x {
        if (z15) {
            o(3, c0Var, false);
        }
        String strN = c0Var.N((int) c0Var.G());
        int length = strN.length();
        long jG = c0Var.G();
        String[] strArr = new String[(int) jG];
        int length2 = length + 15;
        for (int i15 = 0; i15 < jG; i15++) {
            String strN2 = c0Var.N((int) c0Var.G());
            strArr[i15] = strN2;
            length2 = length2 + 4 + strN2.length();
        }
        if (z16 && (c0Var.Q() & 1) == 0) {
            throw t7.x.a("framing bit expected to be set", null);
        }
        return new a(strN, strArr, length2 + 1);
    }

    public static c l(w7.c0 c0Var) throws t7.x {
        o(1, c0Var, false);
        int iH = c0Var.H();
        int iQ = c0Var.Q();
        int iH2 = c0Var.H();
        int iD = c0Var.D();
        if (iD <= 0) {
            iD = -1;
        }
        int iD2 = c0Var.D();
        if (iD2 <= 0) {
            iD2 = -1;
        }
        int iD3 = c0Var.D();
        if (iD3 <= 0) {
            iD3 = -1;
        }
        int iQ2 = c0Var.Q();
        return new c(iH, iQ, iH2, iD, iD2, iD3, (int) Math.pow(2.0d, iQ2 & 15), (int) Math.pow(2.0d, (iQ2 & 240) >> 4), (c0Var.Q() & 1) > 0, Arrays.copyOf(c0Var.f(), c0Var.j()));
    }

    public static b[] m(w7.c0 c0Var, int i15) throws t7.x {
        o(5, c0Var, false);
        int iQ = c0Var.Q() + 1;
        u0 u0Var = new u0(c0Var.f());
        u0Var.e(c0Var.g() * 8);
        for (int i16 = 0; i16 < iQ; i16++) {
            n(u0Var);
        }
        int iD = u0Var.d(6) + 1;
        for (int i17 = 0; i17 < iD; i17++) {
            if (u0Var.d(16) != 0) {
                throw t7.x.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(u0Var);
        i(u0Var);
        g(i15, u0Var);
        b[] bVarArrH = h(u0Var);
        if (u0Var.c()) {
            return bVarArrH;
        }
        throw t7.x.a("framing bit after modes not set as expected", null);
    }

    private static void n(u0 u0Var) throws t7.x {
        long jC;
        if (u0Var.d(24) != 5653314) {
            throw t7.x.a("expected code book to start with [0x56, 0x43, 0x42] at " + u0Var.b(), null);
        }
        int iD = u0Var.d(16);
        int iD2 = u0Var.d(24);
        int iD3 = 0;
        if (u0Var.c()) {
            u0Var.e(5);
            while (iD3 < iD2) {
                iD3 += u0Var.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = u0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    u0Var.e(5);
                } else if (u0Var.c()) {
                    u0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = u0Var.d(4);
        if (iD4 > 2) {
            throw t7.x.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            u0Var.e(32);
            u0Var.e(32);
            int iD5 = u0Var.d(4) + 1;
            u0Var.e(1);
            if (iD4 == 1) {
                jC = iD != 0 ? c(iD2, iD) : 0L;
            } else {
                jC = ((long) iD) * ((long) iD2);
            }
            u0Var.e((int) (jC * ((long) iD5)));
        }
    }

    public static boolean o(int i15, w7.c0 c0Var, boolean z15) throws t7.x {
        if (c0Var.a() < 7) {
            if (z15) {
                return false;
            }
            throw t7.x.a("too short header: " + c0Var.a(), null);
        }
        if (c0Var.Q() != i15) {
            if (z15) {
                return false;
            }
            throw t7.x.a("expected header type " + Integer.toHexString(i15), null);
        }
        if (c0Var.Q() == 118 && c0Var.Q() == 111 && c0Var.Q() == 114 && c0Var.Q() == 98 && c0Var.Q() == 105 && c0Var.Q() == 115) {
            return true;
        }
        if (z15) {
            return false;
        }
        throw t7.x.a("expected characters 'vorbis'", null);
    }
}
