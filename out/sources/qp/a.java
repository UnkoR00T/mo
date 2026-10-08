package qp;

import bp.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static d a(gp.c cVar, byte[] bArr) {
        return b(cVar, bArr, 0);
    }

    public static d b(gp.c cVar, byte[] bArr, int i15) throws IOException {
        dp.d dVar = new dp.d(bArr);
        try {
            return c(cVar, dVar, i15);
        } finally {
            dVar.close();
        }
    }

    private static d c(gp.c cVar, dp.c cVar2, int i15) throws Throwable {
        bp.d dVar = new bp.d();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(cVar2, byteArrayOutputStream, dVar, i15);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        d dVar2 = new d(cVar, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), i.f20686a1, dVar.x4(i.J1), dVar.x4(i.F7), 1, op.d.f148060c);
        dVar2.D1().Y4(i.f20715d2, dVar);
        return dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [char] */
    private static void d(dp.c cVar, OutputStream outputStream, bp.d dVar, int i15) throws Throwable {
        ?? r15;
        int iF;
        try {
            cVar.seek(0L);
            r15 = (char) cVar.read();
            try {
                if (((char) cVar.read()) != r15) {
                    throw new IOException("Not a valid tiff file");
                }
                if (r15 != 77 && r15 != 73) {
                    throw new IOException("Not a valid tiff file");
                }
                if (f(r15, cVar) != 42) {
                    throw new IOException("Not a valid tiff file");
                }
                long jE = e(r15, cVar);
                cVar.seek(jE);
                for (int i16 = 0; i16 < i15; i16++) {
                    int iF2 = f(r15, cVar);
                    if (iF2 > 50) {
                        throw new IOException("Not a valid tiff file");
                    }
                    cVar.seek(jE + 2 + (((long) iF2) * 12));
                    jE = e(r15, cVar);
                    if (jE == 0) {
                        outputStream.close();
                        return;
                    }
                    cVar.seek(jE);
                }
                int iF3 = f(r15, cVar);
                if (iF3 > 50) {
                    throw new IOException("Not a valid tiff file");
                }
                int i17 = -1000;
                int i18 = 0;
                int i19 = 0;
                for (int i25 = 0; i25 < iF3; i25++) {
                    int iF4 = f(r15, cVar);
                    int iF5 = f(r15, cVar);
                    int iE = e(r15, cVar);
                    if (iF5 == 1) {
                        iF = cVar.read();
                        cVar.read();
                        cVar.read();
                        cVar.read();
                    } else if (iF5 != 3) {
                        iF = e(r15, cVar);
                    } else {
                        iF = f(r15, cVar);
                        cVar.read();
                        cVar.read();
                    }
                    if (iF4 == 256) {
                        dVar.W4(i.J1, iF);
                    } else if (iF4 == 257) {
                        dVar.W4(i.F7, iF);
                    } else if (iF4 == 259) {
                        if (iF == 4) {
                            i17 = -1;
                        }
                        if (iF == 3) {
                            i17 = 0;
                        }
                    } else if (iF4 != 262) {
                        if (iF4 == 266) {
                            if (iF != 1) {
                                throw new IOException("FillOrder " + iF + " is not supported");
                            }
                        } else if (iF4 != 279) {
                            if (iF4 == 292) {
                                if ((iF & 1) != 0) {
                                    i17 = 50;
                                }
                                if ((iF & 4) != 0) {
                                    throw new IOException("CCITT Group 3 'uncompressed mode' is not supported");
                                }
                                if ((iF & 2) != 0) {
                                    throw new IOException("CCITT Group 3 'fill bits before EOL' is not supported");
                                }
                            } else if (iF4 != 273) {
                                if (iF4 == 274) {
                                    if (iF != 1) {
                                        throw new IOException("Orientation " + iF + " is not supported");
                                    }
                                } else if (iF4 != 324) {
                                    if (iF4 == 325 && iE == 1) {
                                        i19 = iF;
                                    }
                                } else if (iE == 1) {
                                    i18 = iF;
                                }
                            } else if (iE == 1) {
                                i18 = iF;
                            }
                        } else if (iE == 1) {
                            i19 = iF;
                        }
                    } else if (iF == 1) {
                        dVar.Q4(i.G0, true);
                    }
                }
                if (i17 == -1000) {
                    throw new IOException("First image in tiff is not CCITT T4 or T6 compressed");
                }
                if (i18 == 0) {
                    throw new IOException("First image in tiff is not a single tile/strip");
                }
                dVar.W4(i.N4, i17);
                cVar.seek(i18);
                byte[] bArr = new byte[PKIFailureInfo.certRevoked];
                while (true) {
                    int i26 = cVar.read(bArr, 0, Math.min(PKIFailureInfo.certRevoked, i19));
                    if (i26 <= 0) {
                        outputStream.close();
                        return;
                    } else {
                        i19 -= i26;
                        outputStream.write(bArr, 0, i26);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r15.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            r15 = outputStream;
        }
    }

    private static int e(char c15, dp.c cVar) {
        int i15;
        int i16;
        if (c15 == 'I') {
            i15 = cVar.read() | (cVar.read() << 8) | (cVar.read() << 16);
            i16 = cVar.read() << 24;
        } else {
            i15 = (cVar.read() << 24) | (cVar.read() << 16) | (cVar.read() << 8);
            i16 = cVar.read();
        }
        return i15 | i16;
    }

    private static int f(char c15, dp.c cVar) {
        int i15;
        int i16;
        if (c15 == 'I') {
            i15 = cVar.read();
            i16 = cVar.read() << 8;
        } else {
            i15 = cVar.read() << 8;
            i16 = cVar.read();
        }
        return i15 | i16;
    }
}
