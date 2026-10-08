package org.bouncycastle.crypto.macs;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f149088h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f149089h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private int f149090h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f149091h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private int f149092h4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f149093k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f149094k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private int f149095k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f149096k3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f149097r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f149098r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private int f149099r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f149100r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private int f149101r4;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f149102s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private int f149103s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f149104s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private int f149105s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i15, int i16) {
        return (((long) i15) & BodyPartID.bodyIdMax) * ((long) i16);
    }

    private void processBlock() {
        int i15 = this.currentBlockOffset;
        if (i15 < 16) {
            this.currentBlock[i15] = 1;
            for (int i16 = i15 + 1; i16 < 16; i16++) {
                this.currentBlock[i16] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j15 = jLittleEndianToInt & BodyPartID.bodyIdMax;
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt3 = ((long) Pack.littleEndianToInt(this.currentBlock, 8)) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt4 = BodyPartID.bodyIdMax & ((long) Pack.littleEndianToInt(this.currentBlock, 12));
        int i17 = (int) (((long) this.f149088h0) + (jLittleEndianToInt & 67108863));
        this.f149088h0 = i17;
        this.f149089h1 = (int) (((long) this.f149089h1) + ((((jLittleEndianToInt2 << 32) | j15) >>> 26) & 67108863));
        this.f149090h2 = (int) (((long) this.f149090h2) + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f149091h3 = (int) (((long) this.f149091h3) + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i18 = (int) (((long) this.f149092h4) + (jLittleEndianToInt4 >>> 8));
        this.f149092h4 = i18;
        if (this.currentBlockOffset == 16) {
            this.f149092h4 = i18 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i17, this.f149097r0) + mul32x32_64(this.f149089h1, this.f149105s4) + mul32x32_64(this.f149090h2, this.f149104s3) + mul32x32_64(this.f149091h3, this.f149103s2) + mul32x32_64(this.f149092h4, this.f149102s1);
        long jMul32x32_65 = mul32x32_64(this.f149088h0, this.f149098r1) + mul32x32_64(this.f149089h1, this.f149097r0) + mul32x32_64(this.f149090h2, this.f149105s4) + mul32x32_64(this.f149091h3, this.f149104s3) + mul32x32_64(this.f149092h4, this.f149103s2);
        long jMul32x32_66 = mul32x32_64(this.f149088h0, this.f149099r2) + mul32x32_64(this.f149089h1, this.f149098r1) + mul32x32_64(this.f149090h2, this.f149097r0) + mul32x32_64(this.f149091h3, this.f149105s4) + mul32x32_64(this.f149092h4, this.f149104s3);
        long jMul32x32_67 = mul32x32_64(this.f149088h0, this.f149100r3) + mul32x32_64(this.f149089h1, this.f149099r2) + mul32x32_64(this.f149090h2, this.f149098r1) + mul32x32_64(this.f149091h3, this.f149097r0) + mul32x32_64(this.f149092h4, this.f149105s4);
        long jMul32x32_68 = mul32x32_64(this.f149088h0, this.f149101r4) + mul32x32_64(this.f149089h1, this.f149100r3) + mul32x32_64(this.f149090h2, this.f149099r2) + mul32x32_64(this.f149091h3, this.f149098r1) + mul32x32_64(this.f149092h4, this.f149097r0);
        long j16 = jMul32x32_65 + (jMul32x32_64 >>> 26);
        long j17 = jMul32x32_66 + (j16 >>> 26);
        this.f149090h2 = ((int) j17) & 67108863;
        long j18 = jMul32x32_67 + (j17 >>> 26);
        this.f149091h3 = ((int) j18) & 67108863;
        long j19 = jMul32x32_68 + (j18 >>> 26);
        this.f149092h4 = ((int) j19) & 67108863;
        int i19 = (((int) jMul32x32_64) & 67108863) + (((int) (j19 >>> 26)) * 5);
        this.f149089h1 = (((int) j16) & 67108863) + (i19 >>> 26);
        this.f149088h0 = i19 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i15 = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f149097r0 = 67108863 & iLittleEndianToInt;
        int i16 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f149098r1 = i16;
        int i17 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.f149099r2 = i17;
        int i18 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.f149100r3 = i18;
        int i19 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.f149101r4 = i19;
        this.f149102s1 = i16 * 5;
        this.f149103s2 = i17 * 5;
        this.f149104s3 = i18 * 5;
        this.f149105s4 = i19 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i15 = 0;
            bArr = bArr3;
        }
        this.f149093k0 = Pack.littleEndianToInt(bArr, i15);
        this.f149094k1 = Pack.littleEndianToInt(bArr, i15 + 4);
        this.f149095k2 = Pack.littleEndianToInt(bArr, i15 + 8);
        this.f149096k3 = Pack.littleEndianToInt(bArr, i15 + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        if (i15 + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i16 = this.f149089h1;
        int i17 = this.f149088h0;
        int i18 = i16 + (i17 >>> 26);
        int i19 = this.f149090h2 + (i18 >>> 26);
        int i25 = this.f149091h3 + (i19 >>> 26);
        int i26 = i19 & 67108863;
        int i27 = this.f149092h4 + (i25 >>> 26);
        int i28 = i25 & 67108863;
        int i29 = (i17 & 67108863) + ((i27 >>> 26) * 5);
        int i35 = i27 & 67108863;
        int i36 = (i18 & 67108863) + (i29 >>> 26);
        int i37 = i29 & 67108863;
        int i38 = i37 + 5;
        int i39 = (i38 >>> 26) + i36;
        int i45 = (i39 >>> 26) + i26;
        int i46 = (i45 >>> 26) + i28;
        int i47 = 67108863 & i46;
        int i48 = ((i46 >>> 26) + i35) - 67108864;
        int i49 = (i48 >>> 31) - 1;
        int i55 = ~i49;
        int i56 = (i37 & i55) | (i38 & 67108863 & i49);
        this.f149088h0 = i56;
        int i57 = (i36 & i55) | (i39 & 67108863 & i49);
        this.f149089h1 = i57;
        int i58 = (i26 & i55) | (i45 & 67108863 & i49);
        this.f149090h2 = i58;
        int i59 = (i47 & i49) | (i28 & i55);
        this.f149091h3 = i59;
        int i65 = (i35 & i55) | (i48 & i49);
        this.f149092h4 = i65;
        long j15 = (((long) (i56 | (i57 << 26))) & BodyPartID.bodyIdMax) + (((long) this.f149093k0) & BodyPartID.bodyIdMax);
        long j16 = (((long) ((i57 >>> 6) | (i58 << 20))) & BodyPartID.bodyIdMax) + (((long) this.f149094k1) & BodyPartID.bodyIdMax);
        long j17 = (((long) ((i58 >>> 12) | (i59 << 14))) & BodyPartID.bodyIdMax) + (((long) this.f149095k2) & BodyPartID.bodyIdMax);
        long j18 = (((long) ((i59 >>> 18) | (i65 << 8))) & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & ((long) this.f149096k3));
        Pack.intToLittleEndian((int) j15, bArr, i15);
        long j19 = j16 + (j15 >>> 32);
        Pack.intToLittleEndian((int) j19, bArr, i15 + 4);
        long j25 = j17 + (j19 >>> 32);
        Pack.intToLittleEndian((int) j25, bArr, i15 + 8);
        Pack.intToLittleEndian((int) (j18 + (j25 >>> 32)), bArr, i15 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] iv4;
        if (this.cipher == null) {
            iv4 = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv4 = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv4);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f149092h4 = 0;
        this.f149091h3 = 0;
        this.f149090h2 = 0;
        this.f149089h1 = 0;
        this.f149088h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        byte[] bArr = this.singleByte;
        bArr[0] = b15;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        int i17 = 0;
        while (i16 > i17) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i16 - i17, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i17 + i15, this.currentBlock, this.currentBlockOffset, iMin);
            i17 += iMin;
            this.currentBlockOffset += iMin;
        }
    }
}
