package e0;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LargeJpegImageQuirk f46487a = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.a.b(LargeJpegImageQuirk.class);

    public static int a(byte[] bArr) {
        byte b15;
        int i15 = 2;
        while (i15 + 4 <= bArr.length && (b15 = bArr[i15]) == -1) {
            int i16 = i15 + 2;
            int i17 = ((bArr[i16] & 255) << 8) | (bArr[i15 + 3] & 255);
            if (b15 == -1 && bArr[i15 + 1] == -38) {
                while (true) {
                    int i18 = i16 + 2;
                    if (i18 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i16] == -1 && bArr[i16 + 1] == -39) {
                        return i18;
                    }
                    i16++;
                }
            } else {
                i15 += i17 + 2;
            }
        }
        return -1;
    }

    public int b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f46487a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.g(bArr)) {
            return bArr.length;
        }
        int iA = a(bArr);
        return iA != -1 ? iA : bArr.length;
    }
}
