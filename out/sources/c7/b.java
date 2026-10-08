package c7;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
class b {

    static class a {
        static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    static void a(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e15) {
            c2.f("ExifInterfaceUtils", "Error closing fd.", e15);
        }
    }

    static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e15) {
                throw e15;
            } catch (Exception unused) {
            }
        }
    }

    static long[] c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            jArr[i15] = iArr[i15];
        }
        return jArr;
    }

    static int d(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        int i15 = 0;
        while (true) {
            int i16 = inputStream.read(bArr);
            if (i16 == -1) {
                return i15;
            }
            i15 += i16;
            outputStream.write(bArr, 0, i16);
        }
    }

    static void e(InputStream inputStream, OutputStream outputStream, int i15) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (i15 > 0) {
            int iMin = Math.min(i15, PKIFailureInfo.certRevoked);
            int i16 = inputStream.read(bArr, 0, iMin);
            if (i16 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i15 -= i16;
            outputStream.write(bArr, 0, i16);
        }
    }

    static boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i15 = 0; i15 < bArr2.length; i15++) {
            if (bArr[i15] != bArr2[i15]) {
                return false;
            }
        }
        return true;
    }
}
