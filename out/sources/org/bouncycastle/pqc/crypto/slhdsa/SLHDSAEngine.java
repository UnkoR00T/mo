package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.MGFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
abstract class SLHDSAEngine {
    final int A;
    final int D;
    final int H;
    final int H_PRIME;
    final int K;
    final int N;
    final int WOTS_LEN;
    final int WOTS_LEN1;
    final int WOTS_LEN2;
    final int WOTS_LOGW;
    final int WOTS_W;

    static class Sha2Engine extends SLHDSAEngine {

        /* JADX INFO: renamed from: bl, reason: collision with root package name */
        private final int f149556bl;
        private final byte[] hmacBuf;
        private final MGF1BytesGenerator mgf1;
        private final Digest msgDigest;
        private final byte[] msgDigestBuf;
        private Memoable msgMemo;
        private final Digest sha256;
        private final byte[] sha256Buf;
        private Memoable sha256Memo;
        private final HMac treeHMac;

        public Sha2Engine(int i15, int i16, int i17, int i18, int i19, int i25) {
            int i26;
            super(i15, i16, i17, i18, i19, i25);
            SHA256Digest sHA256Digest = new SHA256Digest();
            this.sha256 = sHA256Digest;
            this.sha256Buf = new byte[sHA256Digest.getDigestSize()];
            if (i15 == 16) {
                this.msgDigest = new SHA256Digest();
                this.treeHMac = new HMac(new SHA256Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA256Digest());
                i26 = 64;
            } else {
                this.msgDigest = new SHA512Digest();
                this.treeHMac = new HMac(new SHA512Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA512Digest());
                i26 = 128;
            }
            this.f149556bl = i26;
            this.hmacBuf = new byte[this.treeHMac.getMacSize()];
            this.msgDigestBuf = new byte[this.msgDigest.getDigestSize()];
        }

        private byte[] compressedADRS(ADRS adrs) {
            byte[] bArr = new byte[22];
            System.arraycopy(adrs.value, 3, bArr, 0, 1);
            System.arraycopy(adrs.value, 8, bArr, 1, 8);
            System.arraycopy(adrs.value, 19, bArr, 9, 1);
            System.arraycopy(adrs.value, 20, bArr, 10, 12);
            return bArr;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.sha256).reset(this.sha256Memo);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            int i15 = ((this.A * this.K) + 7) / 8;
            int i16 = this.H;
            int i17 = i16 / this.D;
            int i18 = i16 - i17;
            int i19 = (i17 + 7) / 8;
            int i25 = (i18 + 7) / 8;
            byte[] bArr6 = new byte[i15 + i19 + i25];
            byte[] bArr7 = new byte[this.msgDigest.getDigestSize()];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            if (bArr4 != null) {
                this.msgDigest.update(bArr4, 0, bArr4.length);
            }
            this.msgDigest.update(bArr5, 0, bArr5.length);
            this.msgDigest.doFinal(bArr7, 0);
            byte[] bArrBitmask = bitmask(Arrays.concatenate(bArr, bArr2, bArr7), bArr6);
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArrBitmask, i15, bArr8, 8 - i25, i25);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr8, 0) & ((-1) >>> (64 - i18));
            byte[] bArr9 = new byte[4];
            System.arraycopy(bArrBitmask, i25 + i15, bArr9, 4 - i19, i19);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr9, 0) & ((-1) >>> (32 - i17)), Arrays.copyOfRange(bArrBitmask, 0, i15));
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            int length = bArr2.length;
            ((Memoable) this.sha256).reset(this.sha256Memo);
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            this.sha256.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, length);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.treeHMac.init(new KeyParameter(bArr));
            this.treeHMac.update(bArr2, 0, bArr2.length);
            if (bArr3 != null) {
                this.treeHMac.update(bArr3, 0, bArr3.length);
            }
            this.treeHMac.update(bArr4, 0, bArr4.length);
            this.treeHMac.doFinal(this.hmacBuf, 0);
            return Arrays.copyOfRange(this.hmacBuf, 0, this.N);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArrCompressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(bArrCompressedADRS, 0, bArrCompressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.N);
        }

        protected byte[] bitmask(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        protected byte[] bitmask256(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(new SHA256Digest());
            mGF1BytesGenerator.init(new MGFParameters(bArr));
            mGF1BytesGenerator.generateBytes(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        void init(byte[] bArr) {
            byte[] bArr2 = new byte[this.f149556bl];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, this.f149556bl - this.N);
            this.msgMemo = ((Memoable) this.msgDigest).copy();
            this.msgDigest.reset();
            this.sha256.update(bArr, 0, bArr.length);
            this.sha256.update(bArr2, 0, 64 - bArr.length);
            this.sha256Memo = ((Memoable) this.sha256).copy();
            this.sha256.reset();
        }

        protected byte[] bitmask(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }
    }

    static class Shake256Engine extends SLHDSAEngine {
        private final Xof maskDigest;
        private final Xof treeDigest;

        public Shake256Engine(int i15, int i16, int i17, int i18, int i19, int i25) {
            super(i15, i16, i17, i18, i19, i25);
            this.treeDigest = new SHAKEDigest(256);
            this.maskDigest = new SHAKEDigest(256);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i15 = this.N;
            byte[] bArr3 = new byte[i15];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i15);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i15 = this.N;
            byte[] bArr4 = new byte[i15];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            this.treeDigest.doFinal(bArr4, 0, i15);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            int i15 = ((this.A * this.K) + 7) / 8;
            int i16 = this.H;
            int i17 = i16 / this.D;
            int i18 = i16 - i17;
            int i19 = (i17 + 7) / 8;
            int i25 = (i18 + 7) / 8;
            int i26 = i15 + i19 + i25;
            byte[] bArr6 = new byte[i26];
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            if (bArr4 != null) {
                this.treeDigest.update(bArr4, 0, bArr4.length);
            }
            this.treeDigest.update(bArr5, 0, bArr5.length);
            this.treeDigest.doFinal(bArr6, 0, i26);
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr6, i15, bArr7, 8 - i25, i25);
            long jBigEndianToLong = Pack.bigEndianToLong(bArr7, 0) & ((-1) >>> (64 - i18));
            byte[] bArr8 = new byte[4];
            System.arraycopy(bArr6, i25 + i15, bArr8, 4 - i19, i19);
            return new IndexedDigest(jBigEndianToLong, Pack.bigEndianToInt(bArr8, 0) & ((-1) >>> (32 - i17)), Arrays.copyOfRange(bArr6, 0, i15));
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr3 = adrs.value;
            xof.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            int i15 = this.N;
            byte[] bArr4 = new byte[i15];
            this.treeDigest.doFinal(bArr4, 0, i15);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            if (bArr3 != null) {
                this.treeDigest.update(bArr3, 0, bArr3.length);
            }
            this.treeDigest.update(bArr4, 0, bArr4.length);
            int i15 = this.N;
            byte[] bArr5 = new byte[i15];
            this.treeDigest.doFinal(bArr5, 0, i15);
            return bArr5;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i15 = this.N;
            byte[] bArr3 = new byte[i15];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i15);
            return bArr3;
        }

        protected byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.maskDigest.doFinal(bArr3, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr3);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine
        void init(byte[] bArr) {
        }

        protected byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            this.maskDigest.doFinal(bArr4, 0, length);
            Bytes.xorTo(bArr2.length, bArr2, bArr4);
            Bytes.xorTo(bArr3.length, bArr3, 0, bArr4, bArr2.length);
            return bArr4;
        }
    }

    public SLHDSAEngine(int i15, int i16, int i17, int i18, int i19, int i25) {
        int i26;
        this.N = i15;
        if (i16 == 16) {
            i26 = 4;
            this.WOTS_LOGW = 4;
            this.WOTS_LEN1 = (i15 * 8) / 4;
            if (i15 <= 8) {
                this.WOTS_LEN2 = 2;
            } else if (i15 <= 136) {
                this.WOTS_LEN2 = 3;
            } else {
                if (i15 > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.WOTS_LEN2 = i26;
            }
        } else {
            if (i16 != 256) {
                throw new IllegalArgumentException("wots_w assumed 16 or 256");
            }
            this.WOTS_LOGW = 8;
            this.WOTS_LEN1 = (i15 * 8) / 8;
            i26 = 1;
            if (i15 <= 1) {
                this.WOTS_LEN2 = i26;
            } else {
                if (i15 > 256) {
                    throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.WOTS_LEN2 = 2;
            }
        }
        this.WOTS_W = i16;
        this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
        this.D = i17;
        this.A = i18;
        this.K = i19;
        this.H = i25;
        this.H_PRIME = i25 / i17;
    }

    abstract byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2);

    abstract byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3);

    abstract IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    abstract byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs);

    abstract byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    abstract byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2);

    abstract void init(byte[] bArr);
}
