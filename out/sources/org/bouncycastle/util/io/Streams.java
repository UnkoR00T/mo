package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class Streams {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) {
        int i15 = BUFFER_SIZE;
        while (inputStream.read(new byte[i15], 0, i15) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        pipeAll(inputStream, outputStream, BUFFER_SIZE);
    }

    public static long pipeAllLimited(InputStream inputStream, long j15, OutputStream outputStream) throws IOException {
        int i15 = BUFFER_SIZE;
        byte[] bArr = new byte[i15];
        long j16 = 0;
        while (true) {
            int i16 = inputStream.read(bArr, 0, i15);
            if (i16 < 0) {
                return j16;
            }
            long j17 = i16;
            if (j15 - j16 < j17) {
                throw new StreamOverflowException("Data Overflow");
            }
            j16 += j17;
            outputStream.write(bArr, 0, i16);
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i15) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i15, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void validateBufferArguments(byte[] bArr, int i15, int i16) {
        Arrays.validateSegment(bArr, i15, i16);
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream, int i15) throws IOException {
        byte[] bArr = new byte[i15];
        while (true) {
            int i16 = inputStream.read(bArr, 0, i15);
            if (i16 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i16);
            }
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i15, int i16) throws IOException {
        int i17 = 0;
        while (i17 < i16) {
            int i18 = inputStream.read(bArr, i15 + i17, i16 - i17);
            if (i18 < 0) {
                break;
            }
            i17 += i18;
        }
        return i17;
    }
}
