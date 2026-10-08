package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;
    static final long[] K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long[] W;
    private long byteCount1;
    private long byteCount2;
    protected final CryptoServicePurpose purpose;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    protected LongDigest() {
        this(CryptoServicePurpose.ANY);
    }

    private long Ch(long j15, long j16, long j17) {
        return ((~j15) & j17) ^ (j16 & j15);
    }

    private long Maj(long j15, long j16, long j17) {
        return ((j15 & j17) ^ (j15 & j16)) ^ (j16 & j17);
    }

    private long Sigma0(long j15) {
        return (j15 >>> 7) ^ (((j15 << 63) | (j15 >>> 1)) ^ ((j15 << 56) | (j15 >>> 8)));
    }

    private long Sigma1(long j15) {
        return (j15 >>> 6) ^ (((j15 << 45) | (j15 >>> 19)) ^ ((j15 << 3) | (j15 >>> 61)));
    }

    private long Sum0(long j15) {
        return ((j15 >>> 39) | (j15 << 25)) ^ (((j15 << 36) | (j15 >>> 28)) ^ ((j15 << 30) | (j15 >>> 34)));
    }

    private long Sum1(long j15) {
        return ((j15 >>> 41) | (j15 << 23)) ^ (((j15 << 50) | (j15 >>> 14)) ^ ((j15 << 46) | (j15 >>> 18)));
    }

    private void adjustByteCounts() {
        long j15 = this.byteCount1;
        if (j15 > 2305843009213693951L) {
            this.byteCount2 += j15 >>> 61;
            this.byteCount1 = j15 & 2305843009213693951L;
        }
    }

    protected void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = longDigest.W;
        System.arraycopy(jArr, 0, this.W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    protected abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        adjustByteCounts();
        long j15 = this.byteCount1 << 3;
        long j16 = this.byteCount2;
        byte b15 = -128;
        while (true) {
            update(b15);
            if (this.xBufOff == 0) {
                processLength(j15, j16);
                processBlock();
                return;
            }
            b15 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    protected int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.H3, bArr, 44);
        Pack.longToBigEndian(this.H4, bArr, 52);
        Pack.longToBigEndian(this.H5, bArr, 60);
        Pack.longToBigEndian(this.H6, bArr, 68);
        Pack.longToBigEndian(this.H7, bArr, 76);
        Pack.longToBigEndian(this.H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i15 = 0; i15 < this.wOff; i15++) {
            Pack.longToBigEndian(this.W[i15], bArr, (i15 * 8) + 96);
        }
    }

    protected void processBlock() {
        adjustByteCounts();
        for (int i15 = 16; i15 <= 79; i15++) {
            long[] jArr = this.W;
            long jSigma1 = Sigma1(jArr[i15 - 2]);
            long[] jArr2 = this.W;
            jArr[i15] = jSigma1 + jArr2[i15 - 7] + Sigma0(jArr2[i15 - 15]) + this.W[i15 - 16];
        }
        long j15 = this.H1;
        long j16 = this.H2;
        long j17 = this.H3;
        long j18 = this.H4;
        long j19 = this.H5;
        long j25 = j18;
        long j26 = this.H6;
        int i16 = 0;
        int i17 = 0;
        long j27 = j17;
        long j28 = this.H7;
        long j29 = this.H8;
        long jSum0 = j15;
        long j35 = j19;
        long j36 = j16;
        while (i16 < 10) {
            long j37 = j26;
            long j38 = j35;
            long j39 = j28;
            long jSum1 = Sum1(j35) + Ch(j35, j37, j28);
            long[] jArr3 = K;
            int i18 = i17 + 1;
            long j45 = j29 + jSum1 + jArr3[i17] + this.W[i17];
            long j46 = j25 + j45;
            long j47 = jSum0;
            long j48 = j36;
            long j49 = j27;
            long jSum2 = j45 + Sum0(jSum0) + Maj(j47, j48, j49);
            int i19 = i17 + 2;
            long jSum3 = j39 + Sum1(j46) + Ch(j46, j38, j37) + jArr3[i18] + this.W[i18];
            long j55 = j49 + jSum3;
            long jSum4 = jSum3 + Sum0(jSum2) + Maj(jSum2, j47, j48);
            int i25 = i17 + 3;
            long jSum5 = j37 + Sum1(j55) + Ch(j55, j46, j38) + jArr3[i19] + this.W[i19];
            long j56 = j48 + jSum5;
            long jSum6 = jSum5 + Sum0(jSum4) + Maj(jSum4, jSum2, j47);
            int i26 = i17 + 4;
            long jSum7 = j38 + Sum1(j56) + Ch(j56, j55, j46) + jArr3[i25] + this.W[i25];
            long j57 = j47 + jSum7;
            long jSum8 = jSum7 + Sum0(jSum6) + Maj(jSum6, jSum4, jSum2);
            int i27 = i17 + 5;
            long jSum9 = j46 + Sum1(j57) + Ch(j57, j56, j55) + jArr3[i26] + this.W[i26];
            long j58 = jSum2 + jSum9;
            long jSum10 = jSum9 + Sum0(jSum8) + Maj(jSum8, jSum6, jSum4);
            int i28 = i17 + 6;
            long jSum11 = j55 + Sum1(j58) + Ch(j58, j57, j56) + jArr3[i27] + this.W[i27];
            long j59 = jSum4 + jSum11;
            long jSum12 = jSum11 + Sum0(jSum10) + Maj(jSum10, jSum8, jSum6);
            int i29 = i17 + 7;
            long jSum13 = j56 + Sum1(j59) + Ch(j59, j58, j57) + jArr3[i28] + this.W[i28];
            long j65 = jSum6 + jSum13;
            long jSum14 = jSum13 + Sum0(jSum12) + Maj(jSum12, jSum10, jSum8);
            i17 += 8;
            long jSum15 = j57 + Sum1(j65) + Ch(j65, j59, j58) + jArr3[i29] + this.W[i29];
            long j66 = jSum8 + jSum15;
            jSum0 = jSum15 + Sum0(jSum14) + Maj(jSum14, jSum12, jSum10);
            i16++;
            j36 = jSum14;
            j35 = j66;
            j27 = jSum12;
            j29 = j58;
            j26 = j65;
            j28 = j59;
            j25 = jSum10;
        }
        this.H1 += jSum0;
        this.H2 += j36;
        this.H3 += j27;
        this.H4 += j25;
        this.H5 += j35;
        this.H6 += j26;
        this.H7 += j28;
        this.H8 += j29;
        this.wOff = 0;
        for (int i35 = 0; i35 < 16; i35++) {
            this.W[i35] = 0;
        }
    }

    protected void processLength(long j15, long j16) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.W;
        jArr[14] = j16;
        jArr[15] = j15;
    }

    protected void processWord(byte[] bArr, int i15) {
        this.W[this.wOff] = Pack.bigEndianToLong(bArr, i15);
        int i16 = this.wOff + 1;
        this.wOff = i16;
        if (i16 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i15 = 0;
        this.xBufOff = 0;
        int i16 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i16 >= bArr.length) {
                break;
            }
            bArr[i16] = 0;
            i16++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.W;
            if (i15 == jArr.length) {
                return;
            }
            jArr[i15] = 0;
            i15++;
        }
    }

    protected void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, iBigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.H3 = Pack.bigEndianToLong(bArr, 44);
        this.H4 = Pack.bigEndianToLong(bArr, 52);
        this.H5 = Pack.bigEndianToLong(bArr, 60);
        this.H6 = Pack.bigEndianToLong(bArr, 68);
        this.H7 = Pack.bigEndianToLong(bArr, 76);
        this.H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i15 = 0; i15 < this.wOff; i15++) {
            this.W[i15] = Pack.bigEndianToLong(bArr, (i15 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        byte[] bArr = this.xBuf;
        int i15 = this.xBufOff;
        int i16 = i15 + 1;
        this.xBufOff = i16;
        bArr[i15] = b15;
        if (i16 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    protected LongDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
        reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        while (this.xBufOff != 0 && i16 > 0) {
            update(bArr[i15]);
            i15++;
            i16--;
        }
        while (i16 >= this.xBuf.length) {
            processWord(bArr, i15);
            byte[] bArr2 = this.xBuf;
            i15 += bArr2.length;
            i16 -= bArr2.length;
            this.byteCount1 += (long) bArr2.length;
        }
        while (i16 > 0) {
            update(bArr[i15]);
            i15++;
            i16--;
        }
    }

    protected LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.purpose = longDigest.purpose;
        copyIn(longDigest);
    }
}
