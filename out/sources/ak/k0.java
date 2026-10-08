package ak;

/* JADX INFO: loaded from: classes4.dex */
final class k0 {
    static int a(int i15, double d15) {
        int iMax = Math.max(i15, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d15 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i16 = iHighestOneBit << 1;
        if (i16 > 0) {
            return i16;
        }
        return 1073741824;
    }

    static int b(int i15) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i15) * (-862048943)), 15)) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
