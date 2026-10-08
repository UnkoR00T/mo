package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f9267b = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    private boolean c(byte[] bArr) {
        byte b15;
        int i15 = 2;
        while (i15 + 4 <= bArr.length && (b15 = bArr[i15]) == -1) {
            if (b15 == -1 && bArr[i15 + 1] == -38) {
                return true;
            }
            i15 += (((bArr[i15 + 2] & 255) << 8) | (bArr[i15 + 3] & 255)) + 2;
        }
        return false;
    }

    private int d(byte[] bArr) {
        int i15 = 2;
        while (true) {
            int i16 = i15 + 1;
            if (i16 > bArr.length) {
                return -1;
            }
            if (bArr[i15] == -1 && bArr[i16] == -40) {
                return i15;
            }
            i15 = i16;
        }
    }

    private static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f9267b.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean g() {
        return e();
    }

    public byte[] f(o oVar) {
        int iD = 0;
        ByteBuffer byteBufferV = oVar.o2()[0].v();
        byte[] bArr = new byte[byteBufferV.capacity()];
        byteBufferV.rewind();
        byteBufferV.get(bArr);
        return (c(bArr) || (iD = d(bArr)) != -1) ? Arrays.copyOfRange(bArr, iD, byteBufferV.limit()) : bArr;
    }
}
