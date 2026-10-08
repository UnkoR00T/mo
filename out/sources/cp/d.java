package cp;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class d extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f37163a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    d() {
    }

    private boolean g(int i15) {
        return i15 == 62;
    }

    private boolean h(int i15) {
        return i15 == 0 || i15 == 9 || i15 == 10 || i15 == 12 || i15 == 13 || i15 == 32;
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) throws IOException {
        while (true) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                break;
            }
            while (h(i16)) {
                i16 = inputStream.read();
            }
            if (i16 == -1 || g(i16)) {
                break;
            }
            int[] iArr = f37163a;
            if (iArr[i16] == -1) {
                c2.e("PdfBox-Android", "Invalid hex, int: " + i16 + " char: " + ((char) i16));
            }
            int i17 = iArr[i16] * 16;
            int i18 = inputStream.read();
            if (i18 == -1 || g(i18)) {
                outputStream.write(i17);
                break;
            }
            if (iArr[i18] == -1) {
                c2.e("PdfBox-Android", "Invalid hex, int: " + i18 + " char: " + ((char) i18));
            }
            outputStream.write(i17 + iArr[i18]);
        }
        outputStream.flush();
        return new k(dVar);
    }

    @Override // cp.l
    public void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        while (true) {
            int i15 = inputStream.read();
            if (i15 == -1) {
                outputStream.flush();
                return;
            }
            xp.c.e((byte) i15, outputStream);
        }
    }
}
