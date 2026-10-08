package cp;

import io.sentry.android.core.c2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class q extends l {
    private int g(int i15, int i16) {
        if (i15 >= 2048 - i16) {
            return 12;
        }
        if (i15 >= 1024 - i16) {
            return 11;
        }
        return i15 >= 512 - i16 ? 10 : 9;
    }

    private void h(List<byte[]> list, long j15, xo.c cVar) throws IOException {
        if (j15 < 0) {
            throw new IOException("negative array index: " + j15 + " near offset " + cVar.f());
        }
        if (j15 < list.size()) {
            return;
        }
        throw new IOException("array index overflow: " + j15 + " >= " + list.size() + " near offset " + cVar.f());
    }

    private List<byte[]> i() {
        ArrayList arrayList = new ArrayList(PKIFailureInfo.certConfirmed);
        for (int i15 = 0; i15 < 256; i15++) {
            arrayList.add(new byte[]{(byte) (i15 & GF2Field.MASK)});
        }
        arrayList.add(null);
        arrayList.add(null);
        return arrayList;
    }

    private void j(InputStream inputStream, OutputStream outputStream, int i15) throws IOException {
        List<byte[]> arrayList = new ArrayList<>();
        xo.c cVar = new xo.c(inputStream);
        loop0: while (true) {
            int iG = 9;
            long j15 = -1;
            while (true) {
                try {
                    long jH = cVar.h(iG);
                    if (jH == 257) {
                        break loop0;
                    }
                    if (jH == 256) {
                        break;
                    }
                    if (jH < arrayList.size()) {
                        byte[] bArr = arrayList.get((int) jH);
                        byte b15 = bArr[0];
                        outputStream.write(bArr);
                        if (j15 != -1) {
                            h(arrayList, j15, cVar);
                            byte[] bArr2 = arrayList.get((int) j15);
                            byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + 1);
                            bArrCopyOf[bArr2.length] = b15;
                            arrayList.add(bArrCopyOf);
                        }
                    } else {
                        h(arrayList, j15, cVar);
                        byte[] bArr3 = arrayList.get((int) j15);
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArr3, bArr3.length + 1);
                        bArrCopyOf2[bArr3.length] = bArr3[0];
                        outputStream.write(bArrCopyOf2);
                        arrayList.add(bArrCopyOf2);
                    }
                    iG = g(arrayList.size(), i15);
                    j15 = jH;
                } catch (EOFException unused) {
                    c2.g("PdfBox-Android", "Premature EOF in LZW stream, EOD code missing");
                }
            }
            arrayList = i();
        }
        outputStream.flush();
    }

    private int k(List<byte[]> list, byte[] bArr) {
        int length = 0;
        int i15 = -1;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (size <= 257) {
                if (i15 != -1) {
                    break;
                }
                if (bArr.length > 1) {
                    return -1;
                }
            }
            byte[] bArr2 = list.get(size);
            if ((i15 != -1 || bArr2.length > length) && Arrays.equals(bArr2, bArr)) {
                length = bArr2.length;
                i15 = size;
            }
        }
        return i15;
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        bp.d dVarF = f(dVar, i15);
        int iY4 = dVarF.y4(bp.i.W2, 1);
        j(inputStream, s.e(outputStream, dVarF), (iY4 == 0 || iY4 == 1) ? iY4 : 1);
        return new k(dVar);
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        List<byte[]> listI = i();
        xo.d dVar2 = new xo.d(outputStream);
        dVar2.m(256L, 9);
        byte[] bArrCopyOf = null;
        int i15 = -1;
        while (true) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                break;
            }
            byte b15 = (byte) i16;
            if (bArrCopyOf == null) {
                bArrCopyOf = new byte[]{b15};
            } else {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + 1);
                bArrCopyOf[bArrCopyOf.length - 1] = b15;
                int iK = k(listI, bArrCopyOf);
                if (iK == -1) {
                    int iG = g(listI.size() - 1, 1);
                    dVar2.m(i15, iG);
                    listI.add(bArrCopyOf);
                    if (listI.size() == 4096) {
                        dVar2.m(256L, iG);
                        listI = i();
                    }
                    bArrCopyOf = new byte[]{b15};
                } else {
                    i15 = iK;
                }
            }
            i15 = b15 & 255;
        }
        if (i15 != -1) {
            dVar2.m(i15, g(listI.size() - 1, 1));
        }
        dVar2.m(257L, g(listI.size(), 1));
        dVar2.m(0L, 7);
        dVar2.flush();
        dVar2.close();
    }
}
