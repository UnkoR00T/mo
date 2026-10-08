package dp;

import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static IOException a(Closeable closeable, String str, IOException iOException) {
        try {
            closeable.close();
            return iOException;
        } catch (IOException e15) {
            c2.h("PdfBox-Android", "Error closing " + str, e15);
            return iOException == null ? e15 : iOException;
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certConfirmed];
        long j15 = 0;
        while (true) {
            int i15 = inputStream.read(bArr);
            if (-1 == i15) {
                return j15;
            }
            outputStream.write(bArr, 0, i15);
            j15 += (long) i15;
        }
    }

    public static long d(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        while (length > 0) {
            int i15 = inputStream.read(bArr, bArr.length - length, length);
            if (i15 < 0) {
                break;
            }
            length -= i15;
        }
        return bArr.length - length;
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
