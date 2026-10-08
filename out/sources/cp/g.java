package cp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class g extends l {
    g() {
    }

    private void g(byte[] bArr) {
        int length = bArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            bArr[i15] = (byte) ((~bArr[i15]) & GF2Field.MASK);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088 A[LOOP:0: B:17:0x0071->B:22:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[SYNTHETIC] */
    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        InputStream inputStream2;
        long j15;
        int i16;
        short s15;
        int i17;
        int i18;
        bp.d dVarF = f(dVar, i15);
        int iY4 = dVarF.y4(bp.i.J1, 1728);
        int iY5 = dVarF.y4(bp.i.F7, 0);
        int iA4 = dVar.A4(bp.i.f20737f4, bp.i.f20717d4, 0);
        if (iY5 <= 0 || iA4 <= 0) {
            iA4 = Math.max(iY5, iA4);
        }
        int iY6 = dVarF.y4(bp.i.N4, 0);
        boolean zH4 = dVarF.h4(bp.i.f20706c3, false);
        byte[] bArr = new byte[((iY4 + 7) / 8) * iA4];
        if (iY6 == 0) {
            byte[] bArr2 = new byte[20];
            int i19 = inputStream.read(bArr2);
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 20);
            pushbackInputStream.unread(bArr2, 0, i19);
            byte b15 = bArr2[0];
            if (b15 != 0) {
                s15 = (short) (((b15 << 8) + (bArr2[1] & 255)) >> 4);
                i17 = 12;
                while (true) {
                    if (i17 < i19 * 8) {
                        i18 = 2;
                        break;
                    }
                    s15 = (short) ((s15 << 1) + ((bArr2[i17 / 8] >> (7 - (i17 % 8))) & 1));
                    if ((s15 & 4095) == 1) {
                        i18 = 3;
                        break;
                    }
                    i17++;
                }
            } else {
                byte b16 = bArr2[1];
                if ((b16 >> 4) != 1 && b16 != 1) {
                    s15 = (short) (((b15 << 8) + (bArr2[1] & 255)) >> 4);
                    i17 = 12;
                    while (true) {
                        if (i17 < i19 * 8) {
                            i18 = 2;
                            break;
                        }
                        s15 = (short) ((s15 << 1) + ((bArr2[i17 / 8] >> (7 - (i17 % 8))) & 1));
                        if ((s15 & 4095) == 1) {
                            i18 = 3;
                            break;
                        }
                        i17++;
                    }
                } else {
                    i18 = 3;
                    break;
                }
            }
            j15 = 0;
            inputStream2 = pushbackInputStream;
            i16 = i18;
        } else if (iY6 > 0) {
            inputStream2 = inputStream;
            j15 = 1;
            i16 = 3;
        } else {
            inputStream2 = inputStream;
            j15 = 0;
            i16 = 4;
        }
        h(new e(inputStream2, iY4, i16, j15, zH4), bArr);
        if (!dVarF.h4(bp.i.G0, false)) {
            g(bArr);
        }
        outputStream.write(bArr);
        return new k(dVar);
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        dp.a.c(inputStream, new f(outputStream, dVar.x4(bp.i.J1), dVar.x4(bp.i.F7), 1));
    }

    void h(e eVar, byte[] bArr) throws IOException {
        int i15 = 0;
        do {
            int i16 = eVar.read(bArr, i15, bArr.length - i15);
            if (i16 <= -1) {
                return;
            } else {
                i15 += i16;
            }
        } while (i15 < bArr.length);
    }
}
