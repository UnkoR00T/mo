package xp;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f220420a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f220421b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(short s15) {
        char[] cArr = f220421b;
        return new char[]{cArr[(s15 >> 12) & 15], cArr[(s15 >> 8) & 15], cArr[(s15 >> 4) & 15], cArr[s15 & 15]};
    }

    public static char[] b(String str) {
        char[] cArr = new char[str.length() * 4];
        int i15 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char cCharAt = str.charAt(i16);
            char[] cArr2 = f220421b;
            cArr[i15] = cArr2[(cCharAt >> '\f') & 15];
            cArr[i15 + 1] = cArr2[(cCharAt >> '\b') & 15];
            int i17 = i15 + 3;
            cArr[i15 + 2] = cArr2[(cCharAt >> 4) & 15];
            i15 += 4;
            cArr[i17] = cArr2[cCharAt & 15];
        }
        return cArr;
    }

    private static int c(byte b15) {
        return (b15 & 240) >> 4;
    }

    private static int d(byte b15) {
        return b15 & 15;
    }

    public static void e(byte b15, OutputStream outputStream) throws IOException {
        byte[] bArr = f220420a;
        outputStream.write(bArr[c(b15)]);
        outputStream.write(bArr[d(b15)]);
    }

    public static void f(byte[] bArr, OutputStream outputStream) throws IOException {
        for (byte b15 : bArr) {
            e(b15, outputStream);
        }
    }
}
