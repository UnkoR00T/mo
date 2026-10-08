package hu;

import fu.f;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "Loq/i0;", "b", "(J[BIII)V", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class c extends b {
    public static final void b(long j15, byte[] bArr, int i15, int i16, int i17) {
        int i18 = 7 - i16;
        int i19 = 8 - i17;
        if (i19 > i18) {
            return;
        }
        while (true) {
            int i25 = f.f()[(int) ((j15 >> (i18 << 3)) & 255)];
            int i26 = i15 + 1;
            bArr[i15] = (byte) (i25 >> 8);
            i15 += 2;
            bArr[i26] = (byte) i25;
            if (i18 == i19) {
                return;
            } else {
                i18--;
            }
        }
    }
}
