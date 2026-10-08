package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.digests.ISAPDigest;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes5.dex */
public class AsconPermutationFriend {

    public static class AsconPermutation {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f149016x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public long f149017x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public long f149018x2;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        public long f149019x3;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public long f149020x4;

        AsconPermutation() {
        }

        public void p(int i15) {
            if (i15 == 12) {
                round(240L);
                round(225L);
                round(210L);
                round(195L);
            }
            if (i15 >= 8) {
                round(180L);
                round(165L);
            }
            round(150L);
            round(135L);
            round(120L);
            round(105L);
            round(90L);
            round(75L);
        }

        public void round(long j15) {
            long j16 = this.f149018x2 ^ j15;
            this.f149018x2 = j16;
            long j17 = this.f149016x0;
            long j18 = this.f149020x4;
            long j19 = j17 ^ j18;
            long j25 = this.f149017x1;
            long j26 = j25 ^ j16;
            long j27 = j25 | j16;
            long j28 = this.f149019x3;
            long j29 = ((j28 ^ j27) ^ j17) ^ (j25 & j19);
            long j35 = (j19 ^ (j27 | j28)) ^ ((j25 & j16) & j28);
            long j36 = ((~j28) & j18) ^ j26;
            long j37 = j26 ^ (j17 | (j28 ^ j18));
            long j38 = (j28 ^ (j18 | j25)) ^ (j17 & j25);
            this.f149016x0 = Longs.rotateRight(j29, 28) ^ (Longs.rotateRight(j29, 19) ^ j29);
            this.f149017x1 = (Longs.rotateRight(j35, 39) ^ j35) ^ Longs.rotateRight(j35, 61);
            this.f149018x2 = ~((Longs.rotateRight(j36, 1) ^ j36) ^ Longs.rotateRight(j36, 6));
            this.f149019x3 = (Longs.rotateRight(j37, 10) ^ j37) ^ Longs.rotateRight(j37, 17);
            this.f149020x4 = Longs.rotateRight(j38, 41) ^ (Longs.rotateRight(j38, 7) ^ j38);
        }

        public void set(long j15, long j16, long j17, long j18, long j19) {
            this.f149016x0 = j15;
            this.f149017x1 = j16;
            this.f149018x2 = j17;
            this.f149019x3 = j18;
            this.f149020x4 = j19;
        }
    }

    public static AsconPermutation getAsconPermutation(ISAPDigest.Friend friend) {
        if (friend != null) {
            return new AsconPermutation();
        }
        throw new NullPointerException("This method is only for use by ISAPDigest or Ascon Digest");
    }
}
