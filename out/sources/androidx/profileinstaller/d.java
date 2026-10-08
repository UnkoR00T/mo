package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
class d {
    static int a(int i15) {
        return ((i15 + 7) & (-8)) / 8;
    }

    static byte[] b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th4) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            deflater.end();
            throw th6;
        }
    }

    static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    static byte[] d(InputStream inputStream, int i15) throws IOException {
        byte[] bArr = new byte[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = inputStream.read(bArr, i16, i15 - i16);
            if (i17 < 0) {
                throw c("Not enough bytes to read: " + i15);
            }
            i16 += i17;
        }
        return bArr;
    }

    static byte[] e(InputStream inputStream, int i15, int i16) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i16];
            byte[] bArr2 = new byte[2048];
            int i17 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i17 < i15) {
                int i18 = inputStream.read(bArr2);
                if (i18 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i15 + " bytes");
                }
                inflater.setInput(bArr2, 0, i18);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i16 - iInflate);
                    i17 += i18;
                } catch (DataFormatException e15) {
                    throw c(e15.getMessage());
                }
            }
            if (i17 == i15) {
                if (!inflater.finished()) {
                    throw c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i15 + " actual=" + i17);
        } catch (Throwable th4) {
            inflater.end();
            throw th4;
        }
    }

    static String f(InputStream inputStream, int i15) {
        return new String(d(inputStream, i15), StandardCharsets.UTF_8);
    }

    static long g(InputStream inputStream, int i15) throws IOException {
        byte[] bArrD = d(inputStream, i15);
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            j15 += ((long) (bArrD[i16] & 255)) << (i16 * 8);
        }
        return j15;
    }

    static int h(InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    static long i(InputStream inputStream) {
        return g(inputStream, 4);
    }

    static int j(InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i15 = inputStream.read(bArr);
            if (i15 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i15);
            }
        }
    }

    static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream, long j15, int i15) throws IOException {
        byte[] bArr = new byte[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            bArr[i16] = (byte) ((j15 >> (i16 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void p(OutputStream outputStream, int i15) throws IOException {
        o(outputStream, i15, 2);
    }

    static void q(OutputStream outputStream, long j15) throws IOException {
        o(outputStream, j15, 4);
    }

    static void r(OutputStream outputStream, int i15) throws IOException {
        o(outputStream, i15, 1);
    }
}
