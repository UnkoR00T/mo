package c9;

import ak.n0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import t7.v;
import t7.w;
import w7.b0;
import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends x8.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24596b = new a() { // from class: c9.g
        @Override // c9.h.a
        public final boolean a(int i15, int i16, int i17, int i18, int i19) {
            return h.c(i15, i16, i17, i18, i19);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24597a;

    public interface a {
        boolean a(int i15, int i16, int i17, int i18, int i19);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f24600c;

        public b(int i15, boolean z15, int i16) {
            this.f24598a = i15;
            this.f24599b = z15;
            this.f24600c = i16;
        }
    }

    public h() {
        this(null);
    }

    private static int A(c0 c0Var, int i15) {
        byte[] bArrF = c0Var.f();
        int iG = c0Var.g();
        int i16 = iG;
        while (true) {
            int i17 = i16 + 1;
            if (i17 >= iG + i15) {
                return i15;
            }
            if ((bArrF[i16] & 255) == 255 && bArrF[i17] == 0) {
                System.arraycopy(bArrF, i16 + 2, bArrF, i17, (i15 - (i16 - iG)) - 2);
                i15--;
            }
            i16 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(c0 c0Var, int i15, int i16, boolean z15) {
        int iT;
        long jT;
        int iY;
        int i17;
        int iG = c0Var.g();
        while (true) {
            try {
                boolean z16 = true;
                if (c0Var.a() < i16) {
                    c0Var.f0(iG);
                    return true;
                }
                if (i15 >= 3) {
                    iT = c0Var.z();
                    jT = c0Var.S();
                    iY = c0Var.Y();
                } else {
                    iT = c0Var.T();
                    jT = c0Var.T();
                    iY = 0;
                }
                if (iT == 0 && jT == 0 && iY == 0) {
                    c0Var.f0(iG);
                    return true;
                }
                if (i15 == 4 && !z15) {
                    if ((8421504 & jT) != 0) {
                        c0Var.f0(iG);
                        return false;
                    }
                    jT = (((jT >> 24) & 255) << 21) | (jT & 255) | (((jT >> 8) & 255) << 7) | (((jT >> 16) & 255) << 14);
                }
                if (i15 == 4) {
                    i17 = (iY & 64) != 0 ? 1 : 0;
                    if ((iY & 1) == 0) {
                        z16 = false;
                    }
                } else if (i15 == 3) {
                    i17 = (iY & 32) != 0 ? 1 : 0;
                    if ((iY & 128) == 0) {
                        z16 = false;
                    }
                } else {
                    i17 = 0;
                    z16 = false;
                }
                if (z16) {
                    i17 += 4;
                }
                if (jT < i17) {
                    c0Var.f0(iG);
                    return false;
                }
                if (c0Var.a() < jT) {
                    c0Var.f0(iG);
                    return false;
                }
                c0Var.g0((int) jT);
            } catch (Throwable th4) {
                c0Var.f0(iG);
                throw th4;
            }
        }
    }

    public static /* synthetic */ boolean c(int i15, int i16, int i17, int i18, int i19) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i15, int i16) {
        return i16 <= i15 ? o0.f210729f : Arrays.copyOfRange(bArr, i15, i16);
    }

    private static c9.a f(c0 c0Var, int i15, int i16) {
        int iZ;
        String str;
        int iQ = c0Var.Q();
        Charset charsetW = w(iQ);
        int i17 = i15 - 1;
        byte[] bArr = new byte[i17];
        c0Var.u(bArr, 0, i17);
        if (i16 == 2) {
            str = "image/" + zj.c.f(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strF = zj.c.f(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strF.indexOf(47) == -1) {
                str = "image/" + strF;
            } else {
                str = strF;
            }
        }
        int i18 = bArr[iZ + 1] & 255;
        int i19 = iZ + 2;
        int iY = y(bArr, i19, iQ);
        return new c9.a(str, new String(bArr, i19, iY - i19, charsetW), i18, d(bArr, iY + v(iQ), i17));
    }

    private static c9.b g(c0 c0Var, int i15, String str) {
        byte[] bArr = new byte[i15];
        c0Var.u(bArr, 0, i15);
        return new c9.b(str, bArr);
    }

    private static c h(c0 c0Var, int i15, int i16, boolean z15, int i17, a aVar) throws Throwable {
        int iG = c0Var.g();
        int iZ = z(c0Var.f(), iG);
        String str = new String(c0Var.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c0Var.f0(iZ + 1);
        int iZ2 = c0Var.z();
        int iZ3 = c0Var.z();
        long jS = c0Var.S();
        if (jS == BodyPartID.bodyIdMax) {
            jS = -1;
        }
        long jS2 = c0Var.S();
        long j15 = jS2 == BodyPartID.bodyIdMax ? -1L : jS2;
        ArrayList arrayList = new ArrayList();
        int i18 = iG + i15;
        while (c0Var.g() < i18) {
            i iVarK = k(i16, c0Var, z15, i17, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iZ2, iZ3, jS, j15, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(c0 c0Var, int i15, int i16, boolean z15, int i17, a aVar) throws Throwable {
        int iG = c0Var.g();
        int iZ = z(c0Var.f(), iG);
        String str = new String(c0Var.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c0Var.f0(iZ + 1);
        int iQ = c0Var.Q();
        boolean z16 = (iQ & 2) != 0;
        boolean z17 = (iQ & 1) != 0;
        int iQ2 = c0Var.Q();
        String[] strArr = new String[iQ2];
        for (int i18 = 0; i18 < iQ2; i18++) {
            int iG2 = c0Var.g();
            int iZ2 = z(c0Var.f(), iG2);
            strArr[i18] = new String(c0Var.f(), iG2, iZ2 - iG2, StandardCharsets.ISO_8859_1);
            c0Var.f0(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i19 = iG + i15;
        while (c0Var.g() < i19) {
            i iVarK = k(i16, c0Var, z15, i17, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z16, z17, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(c0 c0Var, int i15) {
        if (i15 < 4) {
            return null;
        }
        int iQ = c0Var.Q();
        Charset charsetW = w(iQ);
        byte[] bArr = new byte[3];
        c0Var.u(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i16 = i15 - 4;
        byte[] bArr2 = new byte[i16];
        c0Var.u(bArr2, 0, i16);
        int iY = y(bArr2, 0, iQ);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iQ);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iQ), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [c9.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [w7.c0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [w7.c0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [w7.c0] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static i k(int i15, c0 c0Var, boolean z15, int i16, a aVar) throws Throwable {
        int iU;
        ?? r15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ?? r16;
        Throwable th4;
        ?? r17;
        int i17;
        ?? r18;
        ?? r19;
        ?? r110;
        ?? r25;
        v.a aVarG;
        int i18 = i15;
        c0 c0Var2 = c0Var;
        int iQ = c0Var2.Q();
        int iQ2 = c0Var2.Q();
        int iQ3 = c0Var2.Q();
        boolean z25 = false;
        int iQ4 = i18 >= 3 ? c0Var2.Q() : 0;
        if (i18 == 4) {
            iU = c0Var2.U();
            if (!z15) {
                iU = (((iU >> 24) & GF2Field.MASK) << 21) | (iU & GF2Field.MASK) | (((iU >> 8) & GF2Field.MASK) << 7) | (((iU >> 16) & GF2Field.MASK) << 14);
            }
        } else {
            iU = i18 == 3 ? c0Var2.U() : c0Var2.T();
        }
        int iA = iU;
        int iY = i18 >= 3 ? c0Var2.Y() : 0;
        if (iQ == 0 && iQ2 == 0 && iQ3 == 0 && iQ4 == 0 && iA == 0 && iY == 0) {
            c0Var2.f0(c0Var2.j());
            return null;
        }
        int iG = c0Var2.g() + iA;
        if (iG > c0Var2.j()) {
            t.h("Id3Decoder", "Frame size exceeds remaining tag data");
            c0Var2.f0(c0Var2.j());
            return null;
        }
        if (aVar != null) {
            boolean zA = aVar.a(i18, iQ, iQ2, iQ3, iQ4);
            r15 = iQ;
            iA = iQ2;
            if (!zA) {
                i18 = i18;
                c0Var2.f0(iG);
                return null;
            }
        } else {
            iA = iQ2;
            r15 = iQ;
        }
        i18 = i18;
        if (i18 == 3) {
            z16 = (iY & 128) != 0;
            z18 = (iY & 64) != 0;
            z17 = (iY & 32) != 0;
            z19 = false;
            z25 = z16;
        } else if (i18 == 4) {
            boolean z26 = (iY & 64) != 0;
            boolean z27 = (iY & 8) != 0;
            boolean z28 = (iY & 4) != 0;
            z19 = (iY & 2) != 0;
            z25 = (iY & 1) != 0;
            z17 = z26;
            z16 = z25;
            z25 = z27;
            z18 = z28;
        } else {
            z16 = false;
            z17 = false;
            z18 = false;
            z19 = false;
        }
        if (z25 || z18) {
            t.h("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c0Var2.f0(iG);
            return null;
        }
        if (z17) {
            iA--;
            c0Var2.g0(1);
        }
        if (z16) {
            iA -= 4;
            c0Var2.g0(4);
        }
        if (z19) {
            iA = A(c0Var2, iA);
        }
        try {
            try {
                if (r15 == 84 && iA == 88 && iQ3 == 88 && (i18 == 2 || iQ4 == 88)) {
                    aVarG = s(c0Var2, iA);
                } else if (r15 == 84) {
                    aVarG = q(c0Var2, iA, x(i18, r15, iA, iQ3, iQ4));
                } else if (r15 == 87 && iA == 88 && iQ3 == 88 && (i18 == 2 || iQ4 == 88)) {
                    aVarG = u(c0Var2, iA);
                } else if (r15 == 87) {
                    aVarG = t(c0Var2, iA, x(i18, r15, iA, iQ3, iQ4));
                } else {
                    if (r15 != 80 || iA != 82 || iQ3 != 73 || iQ4 != 86) {
                        if (r15 == 71 && iA == 69 && iQ3 == 79 && (iQ4 == 66 || i18 == 2)) {
                            aVarG = l(c0Var2, iA);
                        } else {
                            th4 = null;
                            try {
                                if (i18 != 2 ? r15 == 65 && iA == 80 && iQ3 == 73 && iQ4 == 67 : r15 == 80 && iA == 73 && iQ3 == 67) {
                                    aVarG = f(c0Var2, iA, i18);
                                } else {
                                    if (r15 != 67 || iA != 79 || iQ3 != 77 || (iQ4 != 77 && i18 != 2)) {
                                        if (r15 == 67 && iA == 72 && iQ3 == 65 && iQ4 == 80) {
                                            r15 = r15;
                                            iA = iA;
                                            iQ4 = iQ4;
                                            iA = iA;
                                            i17 = iQ3;
                                            try {
                                                aVarG = h(c0Var2, iA, i18, z15, i16, aVar);
                                                i18 = i15;
                                                r15 = c0Var;
                                            } catch (Exception e15) {
                                                e = e15;
                                                i18 = i15;
                                                r19 = c0Var;
                                                r18 = r15;
                                                r19.f0(iG);
                                                r110 = th4;
                                                r25 = r18;
                                            } catch (OutOfMemoryError e16) {
                                                e = e16;
                                                i18 = i15;
                                                r19 = c0Var;
                                                r18 = r15;
                                                r19.f0(iG);
                                                r110 = th4;
                                                r25 = r18;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                r17 = c0Var;
                                                r17.f0(iG);
                                                throw th;
                                            }
                                        } else {
                                            r15 = r15;
                                            iA = iA;
                                            iQ4 = iQ4;
                                            iA = iA;
                                            i17 = iQ3;
                                            try {
                                                if (r15 == 67 && iA == 84 && i17 == 79 && iQ4 == 67) {
                                                    i18 = i15;
                                                    c0 c0Var3 = c0Var;
                                                    aVarG = i(c0Var3, iA, i18, z15, i16, aVar);
                                                    r15 = c0Var3;
                                                } else {
                                                    i18 = i15;
                                                    c0 c0Var4 = c0Var;
                                                    if (r15 == 77 && iA == 76 && i17 == 76 && iQ4 == 84) {
                                                        aVarG = n(c0Var4, iA);
                                                        r15 = c0Var4;
                                                    } else {
                                                        aVarG = g(c0Var4, iA, x(i18, r15, iA, i17, iQ4));
                                                        r15 = c0Var4;
                                                    }
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                r19 = r15;
                                                r18 = r15;
                                                r19.f0(iG);
                                                r110 = th4;
                                                r25 = r18;
                                            } catch (OutOfMemoryError e18) {
                                                e = e18;
                                                r19 = r15;
                                                r18 = r15;
                                                r19.f0(iG);
                                                r110 = th4;
                                                r25 = r18;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                r17 = r15;
                                                r17.f0(iG);
                                                throw th;
                                            }
                                        }
                                        if (r110 == 0) {
                                            t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
                                        }
                                        return r110;
                                    }
                                    aVarG = j(c0Var2, iA);
                                }
                                r15 = c0Var2;
                                iA = iA;
                                r15 = r15;
                                i17 = iQ3;
                            } catch (Exception e19) {
                                e = e19;
                                r16 = r15;
                                iA = iA;
                                i17 = iQ3;
                                r19 = c0Var2;
                                r18 = r16;
                                r19.f0(iG);
                                r110 = th4;
                                r25 = r18;
                                if (r110 == 0) {
                                    t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
                                }
                                return r110;
                            } catch (OutOfMemoryError e25) {
                                e = e25;
                                r16 = r15;
                                iA = iA;
                                i17 = iQ3;
                                r19 = c0Var2;
                                r18 = r16;
                                r19.f0(iG);
                                r110 = th4;
                                r25 = r18;
                                if (r110 == 0) {
                                    t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
                                }
                                return r110;
                            }
                        }
                        r15.f0(iG);
                        r110 = aVarG;
                        e = th4;
                        r25 = r15;
                        if (r110 == 0) {
                            t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
                        }
                        return r110;
                    }
                    aVarG = o(c0Var2, iA);
                }
                r15 = c0Var2;
                iA = iA;
                th4 = null;
                r15 = r15;
                i17 = iQ3;
                r15.f0(iG);
                r110 = aVarG;
                e = th4;
                r25 = r15;
            } catch (Throwable th7) {
                th = th7;
                r17 = c0Var2;
            }
        } catch (Exception e26) {
            e = e26;
            r16 = r15;
            iA = iA;
            th4 = null;
            i17 = iQ3;
            r19 = c0Var2;
            r18 = r16;
            r19.f0(iG);
            r110 = th4;
            r25 = r18;
            if (r110 == 0) {
                t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
            }
            return r110;
        } catch (OutOfMemoryError e27) {
            e = e27;
            r16 = r15;
            iA = iA;
            th4 = null;
            i17 = iQ3;
            r19 = c0Var2;
            r18 = r16;
            r19.f0(iG);
            r110 = th4;
            r25 = r18;
            if (r110 == 0) {
                t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
            }
            return r110;
        }
        if (r110 == 0) {
            t.i("Id3Decoder", "Failed to decode frame: id=" + x(i18, r25, iA, i17, iQ4) + ", frameSize=" + iA, e);
        }
        return r110;
    }

    private static f l(c0 c0Var, int i15) {
        int iQ = c0Var.Q();
        Charset charsetW = w(iQ);
        int i16 = i15 - 1;
        byte[] bArr = new byte[i16];
        c0Var.u(bArr, 0, i16);
        int iZ = z(bArr, 0);
        String strL = w.l(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i17 = iZ + 1;
        int iY = y(bArr, i17, iQ);
        String strP = p(bArr, i17, iY, charsetW);
        int iV = iY + v(iQ);
        int iY2 = y(bArr, iV, iQ);
        return new f(strL, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iQ), i16));
    }

    private static b m(c0 c0Var) {
        if (c0Var.a() < 10) {
            t.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iT = c0Var.T();
        if (iT != 4801587) {
            t.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iT)));
            return null;
        }
        int iQ = c0Var.Q();
        c0Var.g0(1);
        int iQ2 = c0Var.Q();
        int iP = c0Var.P();
        if (iQ == 2) {
            if ((iQ2 & 64) != 0) {
                t.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iQ == 3) {
            if ((iQ2 & 64) != 0) {
                int iZ = c0Var.z();
                c0Var.g0(iZ);
                iP -= iZ + 4;
            }
        } else {
            if (iQ != 4) {
                t.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iQ);
                return null;
            }
            if ((iQ2 & 64) != 0) {
                int iP2 = c0Var.P();
                c0Var.g0(iP2 - 4);
                iP -= iP2;
            }
            if ((iQ2 & 16) != 0) {
                iP -= 10;
            }
        }
        return new b(iQ, iQ < 4 && (iQ2 & 128) != 0, iP);
    }

    private static l n(c0 c0Var, int i15) {
        int iY = c0Var.Y();
        int iT = c0Var.T();
        int iT2 = c0Var.T();
        int iQ = c0Var.Q();
        int iQ2 = c0Var.Q();
        b0 b0Var = new b0();
        b0Var.m(c0Var);
        int i16 = ((i15 - 10) * 8) / (iQ + iQ2);
        int[] iArr = new int[i16];
        int[] iArr2 = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            int iH = b0Var.h(iQ);
            int iH2 = b0Var.h(iQ2);
            iArr[i17] = iH;
            iArr2[i17] = iH2;
        }
        return new l(iY, iT, iT2, iArr, iArr2);
    }

    private static m o(c0 c0Var, int i15) {
        byte[] bArr = new byte[i15];
        c0Var.u(bArr, 0, i15);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i15));
    }

    private static String p(byte[] bArr, int i15, int i16, Charset charset) {
        return (i16 <= i15 || i16 > bArr.length) ? "" : new String(bArr, i15, i16 - i15, charset);
    }

    private static n q(c0 c0Var, int i15, String str) {
        if (i15 < 1) {
            return null;
        }
        int iQ = c0Var.Q();
        int i16 = i15 - 1;
        byte[] bArr = new byte[i16];
        c0Var.u(bArr, 0, i16);
        return new n(str, null, r(bArr, iQ, 0));
    }

    private static n0<String> r(byte[] bArr, int i15, int i16) {
        if (i16 >= bArr.length) {
            return n0.E("");
        }
        n0.a aVarS = n0.s();
        int iY = y(bArr, i16, i15);
        while (i16 < iY) {
            aVarS.a(new String(bArr, i16, iY - i16, w(i15)));
            i16 = v(i15) + iY;
            iY = y(bArr, i16, i15);
        }
        n0<String> n0VarK = aVarS.k();
        return n0VarK.isEmpty() ? n0.E("") : n0VarK;
    }

    private static n s(c0 c0Var, int i15) {
        if (i15 < 1) {
            return null;
        }
        int iQ = c0Var.Q();
        int i16 = i15 - 1;
        byte[] bArr = new byte[i16];
        c0Var.u(bArr, 0, i16);
        int iY = y(bArr, 0, iQ);
        return new n("TXXX", new String(bArr, 0, iY, w(iQ)), r(bArr, iQ, iY + v(iQ)));
    }

    private static o t(c0 c0Var, int i15, String str) {
        byte[] bArr = new byte[i15];
        c0Var.u(bArr, 0, i15);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(c0 c0Var, int i15) {
        if (i15 < 1) {
            return null;
        }
        int iQ = c0Var.Q();
        int i16 = i15 - 1;
        byte[] bArr = new byte[i16];
        c0Var.u(bArr, 0, i16);
        int iY = y(bArr, 0, iQ);
        String str = new String(bArr, 0, iY, w(iQ));
        int iV = iY + v(iQ);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i15) {
        return (i15 == 0 || i15 == 3) ? 1 : 2;
    }

    private static Charset w(int i15) {
        if (i15 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i15 != 2) {
            return i15 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String x(int i15, int i16, int i17, int i18, int i19) {
        return i15 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19));
    }

    private static int y(byte[] bArr, int i15, int i16) {
        int iZ = z(bArr, i15);
        if (i16 == 0 || i16 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i15) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i15) {
        while (i15 < bArr.length) {
            if (bArr[i15] == 0) {
                return i15;
            }
            i15++;
        }
        return bArr.length;
    }

    @Override // x8.d
    protected v b(x8.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public v e(byte[] bArr, int i15) throws Throwable {
        ArrayList arrayList = new ArrayList();
        c0 c0Var = new c0(bArr, i15);
        b bVarM = m(c0Var);
        if (bVarM == null) {
            return null;
        }
        int iG = c0Var.g();
        int i16 = bVarM.f24598a == 2 ? 6 : 10;
        int iA = bVarM.f24600c;
        if (bVarM.f24599b) {
            iA = A(c0Var, bVarM.f24600c);
        }
        c0Var.e0(iG + iA);
        boolean z15 = false;
        if (!B(c0Var, bVarM.f24598a, i16, false)) {
            if (bVarM.f24598a != 4 || !B(c0Var, 4, i16, true)) {
                t.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f24598a);
                return null;
            }
            z15 = true;
        }
        while (c0Var.a() >= i16) {
            i iVarK = k(bVarM.f24598a, c0Var, z15, i16, this.f24597a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new v(arrayList);
    }

    public h(a aVar) {
        this.f24597a = aVar;
    }
}
