package bh;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    static int a(int i15, int i16) {
        if (i16 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i17 = i15 + (i15 >> 1) + 1;
        if (i17 < i16) {
            int iHighestOneBit = Integer.highestOneBit(i16 - 1);
            i17 = iHighestOneBit + iHighestOneBit;
        }
        if (i17 < 0) {
            return Integer.MAX_VALUE;
        }
        return i17;
    }
}
