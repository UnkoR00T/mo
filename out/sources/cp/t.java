package cp;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class t extends l {
    t() {
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        byte[] bArr = new byte[128];
        while (true) {
            int i16 = inputStream.read();
            if (i16 == -1 || i16 == 128) {
                break;
            }
            if (i16 <= 127) {
                int i17 = i16 + 1;
                while (i17 > 0) {
                    int i18 = inputStream.read(bArr, 0, i17);
                    if (i18 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i18);
                    i17 -= i18;
                }
            } else {
                int i19 = inputStream.read();
                if (i19 == -1) {
                    break;
                }
                for (int i25 = 0; i25 < 257 - i16; i25++) {
                    outputStream.write(i19);
                }
            }
        }
        return new k(dVar);
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) {
        c2.g("PdfBox-Android", "RunLengthDecodeFilter.encode is not implemented yet, skipping this stream.");
    }
}
