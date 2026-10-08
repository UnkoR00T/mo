package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SparkleEngine extends AEADBaseEngine {
    private static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    private final int CAP_MASK;
    private final int KEY_WORDS;
    private final int RATE_WORDS;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int TAG_WORDS;
    private final int _A0;
    private final int _A1;
    private final int _M2;
    private final int _M3;
    private boolean encrypted;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f149062k;
    private final int[] npub;
    private final int[] state;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.SparkleEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters;

        static {
            int[] iArr = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters = iArr;
            try {
                iArr[SparkleParameters.SCHWAEMM128_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM192_192.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    public SparkleEngine(SparkleParameters sparkleParameters) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[sparkleParameters.ordinal()];
        int i27 = 256;
        int i28 = 128;
        if (i26 != 1) {
            i15 = MLKEMEngine.KyberPolyBytes;
            if (i26 != 2) {
                if (i26 == 3) {
                    this.SPARKLE_STEPS_SLIM = 7;
                    this.SPARKLE_STEPS_BIG = 11;
                    this.algorithmName = "SCHWAEMM192-192";
                    i27 = 192;
                } else {
                    if (i26 != 4) {
                        throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
                    }
                    this.SPARKLE_STEPS_SLIM = 8;
                    this.SPARKLE_STEPS_BIG = 12;
                    this.algorithmName = "SCHWAEMM256-256";
                    i15 = 512;
                }
                i16 = i27;
                i17 = i16;
                i28 = i17;
            } else {
                this.SPARKLE_STEPS_SLIM = 7;
                this.SPARKLE_STEPS_BIG = 11;
                this.algorithmName = "SCHWAEMM256-128";
                i16 = 256;
                i17 = 128;
            }
            int i29 = i27 >>> 5;
            this.KEY_WORDS = i29;
            this.KEY_SIZE = i27 >>> 3;
            this.TAG_WORDS = i28 >>> 5;
            this.MAC_SIZE = i28 >>> 3;
            int i35 = i15 >>> 5;
            this.STATE_WORDS = i35;
            i18 = i16 >>> 5;
            this.RATE_WORDS = i18;
            int i36 = i16 >>> 3;
            this.IV_SIZE = i36;
            int i37 = i17 >>> 6;
            i19 = i17 >>> 5;
            if (i18 > i19) {
                i25 = i19 - 1;
            } else {
                i25 = -1;
            }
            this.CAP_MASK = i25;
            int i38 = 1 << i37;
            this._A0 = i38 << 24;
            this._A1 = (i38 ^ 1) << 24;
            this._M2 = (i38 ^ 2) << 24;
            this._M3 = (i38 ^ 3) << 24;
            this.state = new int[i35];
            this.f149062k = new int[i29];
            this.npub = new int[i18];
            this.BlockSize = i36;
            this.AADBufferSize = i36;
            setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
        }
        this.SPARKLE_STEPS_SLIM = 7;
        this.SPARKLE_STEPS_BIG = 10;
        this.algorithmName = "SCHWAEMM128-128";
        i15 = 256;
        i16 = 128;
        i17 = 128;
        i27 = i17;
        int i210 = i27 >>> 5;
        this.KEY_WORDS = i210;
        this.KEY_SIZE = i27 >>> 3;
        this.TAG_WORDS = i28 >>> 5;
        this.MAC_SIZE = i28 >>> 3;
        int i39 = i15 >>> 5;
        this.STATE_WORDS = i39;
        i18 = i16 >>> 5;
        this.RATE_WORDS = i18;
        int i310 = i16 >>> 3;
        this.IV_SIZE = i310;
        int i311 = i17 >>> 6;
        i19 = i17 >>> 5;
        if (i18 > i19) {
            i25 = i19 - 1;
        } else {
            i25 = -1;
        }
        this.CAP_MASK = i25;
        int i312 = 1 << i311;
        this._A0 = i312 << 24;
        this._A1 = (i312 ^ 1) << 24;
        this._M2 = (i312 ^ 2) << 24;
        this._M3 = (i312 ^ 3) << 24;
        this.state = new int[i39];
        this.f149062k = new int[i210];
        this.npub = new int[i18];
        this.BlockSize = i310;
        this.AADBufferSize = i310;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    private static int ELL(int i15) {
        return (i15 & 65535) ^ Integers.rotateRight(i15, 16);
    }

    private static void sparkle_opt(int[] iArr, int i15) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i15);
        } else if (length == 12) {
            sparkle_opt12(iArr, i15);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i15);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i15) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i15);
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i15) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i15);
    }

    static void sparkle_opt8(int[] iArr, int i15) {
        int i16 = iArr[0];
        int i17 = iArr[1];
        char c15 = 2;
        int i18 = iArr[2];
        char c16 = 3;
        int i19 = iArr[3];
        char c17 = 4;
        int i25 = iArr[4];
        char c18 = 5;
        int i26 = iArr[5];
        int i27 = iArr[6];
        int i28 = iArr[7];
        int i29 = 0;
        while (i29 < i15) {
            int[] iArr2 = RCON;
            int i35 = i17 ^ iArr2[i29 & 7];
            int i36 = i19 ^ i29;
            int i37 = iArr2[0];
            char c19 = c15;
            int iRotateRight = i16 + Integers.rotateRight(i35, 31);
            char c25 = c16;
            int iRotateRight2 = i35 ^ Integers.rotateRight(iRotateRight, 24);
            char c26 = c17;
            int iRotateRight3 = (iRotateRight ^ i37) + Integers.rotateRight(iRotateRight2, 17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i38 = (iRotateRight3 ^ i37) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i38, 31);
            int iRotateRight6 = (i38 ^ i37) + Integers.rotateRight(iRotateRight5, 24);
            char c27 = c18;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i39 = iRotateRight6 ^ i37;
            int i45 = iArr2[1];
            int iRotateRight8 = i18 + Integers.rotateRight(i36, 31);
            int iRotateRight9 = i36 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = (iRotateRight8 ^ i45) + Integers.rotateRight(iRotateRight9, 17);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i46 = (iRotateRight10 ^ i45) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i46, 31);
            int iRotateRight13 = (i46 ^ i45) + Integers.rotateRight(iRotateRight12, 24);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i47 = iRotateRight13 ^ i45;
            int i48 = iArr2[c19];
            int iRotateRight15 = i25 + Integers.rotateRight(i26, 31);
            int iRotateRight16 = i26 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = (iRotateRight15 ^ i48) + Integers.rotateRight(iRotateRight16, 17);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i49 = (iRotateRight17 ^ i48) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i49, 31);
            int iRotateRight20 = (i49 ^ i48) + Integers.rotateRight(iRotateRight19, 24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i55 = iArr2[c25];
            int iRotateRight22 = i27 + Integers.rotateRight(i28, 31);
            int iRotateRight23 = i28 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = (iRotateRight22 ^ i55) + Integers.rotateRight(iRotateRight23, 17);
            int iRotateRight25 = Integers.rotateRight(iRotateRight24, 17) ^ iRotateRight23;
            int i56 = (iRotateRight24 ^ i55) + iRotateRight25;
            int iRotateRight26 = Integers.rotateRight(i56, 31) ^ iRotateRight25;
            int iRotateRight27 = (i56 ^ i55) + Integers.rotateRight(iRotateRight26, 24);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i57 = iRotateRight27 ^ i55;
            int iELL = ELL(i39 ^ i47);
            int iELL2 = ELL(iRotateRight7 ^ iRotateRight14);
            int i58 = (i57 ^ i47) ^ iELL2;
            int i59 = (iRotateRight28 ^ iRotateRight14) ^ iELL;
            int i65 = iELL ^ (iRotateRight21 ^ iRotateRight7);
            i29++;
            i26 = iRotateRight7;
            i17 = i59;
            i27 = i47;
            i28 = iRotateRight14;
            i19 = i65;
            i18 = ((iRotateRight20 ^ i48) ^ i39) ^ iELL2;
            c15 = c19;
            c17 = c26;
            c18 = c27;
            i25 = i39;
            i16 = i58;
            c16 = c25;
        }
        iArr[0] = i16;
        iArr[1] = i17;
        iArr[c15] = i18;
        iArr[c16] = i19;
        iArr[c17] = i25;
        iArr[c18] = i26;
        iArr[6] = i27;
        iArr[7] = i28;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void finishAAD(AEADBaseEngine.State state, boolean z15) {
        finishAAD2(state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i15) {
        return super.getOutputSize(i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i15) {
        return super.getUpdateOutputSize(i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z15, CipherParameters cipherParameters) {
        super.init(z15, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b15) {
        super.processAADByte(b15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i15, int i16) {
        super.processAADBytes(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferAAD(byte[] bArr, int i15) {
        int i16 = 0;
        while (true) {
            int i17 = this.RATE_WORDS;
            if (i16 >= i17 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i18 = (i17 / 2) + i16;
            int[] iArr = this.state;
            int i19 = iArr[i16];
            int i25 = iArr[i18];
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i16 * 4) + i15);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, (i18 * 4) + i15);
            int[] iArr2 = this.state;
            int i26 = this.RATE_WORDS;
            iArr2[i16] = (iLittleEndianToInt ^ i25) ^ iArr2[i26 + i16];
            iArr2[i18] = ((i25 ^ i19) ^ iLittleEndianToInt2) ^ iArr2[i26 + (this.CAP_MASK & i18)];
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = 0;
        while (true) {
            int i18 = this.RATE_WORDS;
            if (i17 >= i18 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i19 = (i18 / 2) + i17;
            int[] iArr = this.state;
            int i25 = iArr[i17];
            int i26 = iArr[i19];
            int i27 = i17 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i15 + i27);
            int i28 = i19 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i15 + i28);
            int[] iArr2 = this.state;
            int i29 = this.RATE_WORDS;
            iArr2[i17] = ((i25 ^ i26) ^ iLittleEndianToInt) ^ iArr2[i29 + i17];
            iArr2[i19] = (i25 ^ iLittleEndianToInt2) ^ iArr2[i29 + (this.CAP_MASK & i19)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i25, bArr2, i16 + i27);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i26, bArr2, i16 + i28);
            i17++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = 0;
        while (true) {
            int i18 = this.RATE_WORDS;
            if (i17 >= i18 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i19 = (i18 / 2) + i17;
            int[] iArr = this.state;
            int i25 = iArr[i17];
            int i26 = iArr[i19];
            int i27 = i17 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i15 + i27);
            int i28 = i19 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i15 + i28);
            int[] iArr2 = this.state;
            int i29 = this.RATE_WORDS;
            iArr2[i17] = (i26 ^ iLittleEndianToInt) ^ iArr2[i29 + i17];
            iArr2[i19] = ((i25 ^ i26) ^ iLittleEndianToInt2) ^ iArr2[i29 + (this.CAP_MASK & i19)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i25, bArr2, i16 + i27);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i26, bArr2, i16 + i28);
            i17++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b15, byte[] bArr, int i15) {
        return super.processByte(b15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        return super.processBytes(bArr, i15, i16, bArr2, i17);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalAAD() {
        int i15 = this.m_aadPos;
        int i16 = this.BlockSize;
        int i17 = 0;
        if (i15 < i16) {
            int[] iArr = this.state;
            int i18 = this.STATE_WORDS - 1;
            iArr[i18] = iArr[i18] ^ this._A0;
            byte[] bArr = this.m_aad;
            int i19 = i15 + 1;
            this.m_aadPos = i19;
            bArr[i15] = -128;
            Arrays.fill(bArr, i19, i16, (byte) 0);
        } else {
            int[] iArr2 = this.state;
            int i25 = this.STATE_WORDS - 1;
            iArr2[i25] = iArr2[i25] ^ this._A1;
        }
        while (true) {
            int i26 = this.RATE_WORDS;
            if (i17 >= i26 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i27 = (i26 / 2) + i17;
            int[] iArr3 = this.state;
            int i28 = iArr3[i17];
            int i29 = iArr3[i27];
            int iLittleEndianToInt = Pack.littleEndianToInt(this.m_aad, i17 * 4);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(this.m_aad, i27 * 4);
            int[] iArr4 = this.state;
            int i35 = this.RATE_WORDS;
            iArr4[i17] = (iLittleEndianToInt ^ i29) ^ iArr4[i35 + i17];
            iArr4[i27] = ((i29 ^ i28) ^ iLittleEndianToInt2) ^ iArr4[i35 + (this.CAP_MASK & i27)];
            i17++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        int i16;
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i17 = this.STATE_WORDS - 1;
            iArr[i17] = iArr[i17] ^ (this.m_bufPos < this.IV_SIZE ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i18 = 0;
            while (true) {
                i16 = this.m_bufPos;
                if (i18 >= i16) {
                    break;
                }
                int i19 = i18 >>> 2;
                iArr2[i19] = iArr2[i19] | ((this.m_buf[i18] & 255) << ((i18 & 3) << 3));
                i18++;
            }
            if (i16 < this.IV_SIZE) {
                if (!this.forEncryption) {
                    int i25 = (i16 & 3) << 3;
                    int i26 = i16 >>> 2;
                    int i27 = iArr2[i26];
                    int[] iArr3 = this.state;
                    iArr2[i26] = ((iArr3[i16 >>> 2] >>> i25) << i25) | i27;
                    int i28 = (i16 >>> 2) + 1;
                    System.arraycopy(iArr3, i28, iArr2, i28, this.RATE_WORDS - i28);
                }
                int i29 = this.m_bufPos;
                int i35 = i29 >>> 2;
                iArr2[i35] = (128 << ((i29 & 3) << 3)) ^ iArr2[i35];
            }
            int i36 = 0;
            while (true) {
                int i37 = this.RATE_WORDS;
                if (i36 >= i37 / 2) {
                    break;
                }
                int i38 = (i37 / 2) + i36;
                int[] iArr4 = this.state;
                int i39 = iArr4[i36];
                int i45 = iArr4[i38];
                if (this.forEncryption) {
                    iArr4[i36] = (iArr2[i36] ^ i45) ^ iArr4[i37 + i36];
                    iArr4[i38] = iArr4[i37 + (this.CAP_MASK & i38)] ^ ((i39 ^ i45) ^ iArr2[i38]);
                } else {
                    iArr4[i36] = ((i39 ^ i45) ^ iArr2[i36]) ^ iArr4[i37 + i36];
                    iArr4[i38] = iArr4[i37 + (this.CAP_MASK & i38)] ^ (iArr2[i38] ^ i39);
                }
                iArr2[i36] = iArr2[i36] ^ i39;
                iArr2[i38] = iArr2[i38] ^ i45;
                i36++;
            }
            int i46 = 0;
            while (i46 < this.m_bufPos) {
                bArr[i15] = (byte) (iArr2[i46 >>> 2] >>> ((i46 & 3) << 3));
                i46++;
                i15++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i47 = 0; i47 < this.KEY_WORDS; i47++) {
            int[] iArr5 = this.state;
            int i48 = this.RATE_WORDS + i47;
            iArr5[i48] = iArr5[i48] ^ this.f149062k[i47];
        }
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    static void sparkle_opt12(int[] iArr, int i15) {
        int i16 = iArr[0];
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = iArr[3];
        char c15 = 4;
        int i25 = iArr[4];
        char c16 = 5;
        int i26 = iArr[5];
        char c17 = 6;
        int i27 = iArr[6];
        char c18 = 7;
        int i28 = iArr[7];
        int i29 = iArr[8];
        int i35 = iArr[9];
        int i36 = iArr[10];
        int i37 = iArr[11];
        int i38 = 0;
        int i39 = i35;
        while (i38 < i15) {
            int[] iArr2 = RCON;
            int i45 = i17 ^ iArr2[i38 & 7];
            int i46 = i19 ^ i38;
            int i47 = iArr2[0];
            char c19 = c15;
            int iRotateRight = i16 + Integers.rotateRight(i45, 31);
            char c25 = c16;
            int iRotateRight2 = i45 ^ Integers.rotateRight(iRotateRight, 24);
            char c26 = c17;
            int iRotateRight3 = (iRotateRight ^ i47) + Integers.rotateRight(iRotateRight2, 17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i48 = (iRotateRight3 ^ i47) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i48, 31);
            int iRotateRight6 = (i48 ^ i47) + Integers.rotateRight(iRotateRight5, 24);
            char c27 = c18;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i49 = iRotateRight6 ^ i47;
            int i55 = iArr2[1];
            int iRotateRight8 = i18 + Integers.rotateRight(i46, 31);
            int iRotateRight9 = i46 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = (iRotateRight8 ^ i55) + Integers.rotateRight(iRotateRight9, 17);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i56 = (iRotateRight10 ^ i55) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i56, 31);
            int iRotateRight13 = (i56 ^ i55) + Integers.rotateRight(iRotateRight12, 24);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i57 = iRotateRight13 ^ i55;
            int i58 = iArr2[2];
            int iRotateRight15 = i25 + Integers.rotateRight(i26, 31);
            int iRotateRight16 = i26 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = (iRotateRight15 ^ i58) + Integers.rotateRight(iRotateRight16, 17);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i59 = (iRotateRight17 ^ i58) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i59, 31);
            int iRotateRight20 = (i59 ^ i58) + Integers.rotateRight(iRotateRight19, 24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i65 = iRotateRight20 ^ i58;
            int i66 = iArr2[3];
            int iRotateRight22 = i27 + Integers.rotateRight(i28, 31);
            int iRotateRight23 = i28 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = (iRotateRight22 ^ i66) + Integers.rotateRight(iRotateRight23, 17);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i67 = (iRotateRight24 ^ i66) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i67, 31);
            int iRotateRight27 = (i67 ^ i66) + Integers.rotateRight(iRotateRight26, 24);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i68 = iRotateRight27 ^ i66;
            int i69 = iArr2[c19];
            int iRotateRight29 = i29 + Integers.rotateRight(i39, 31);
            int iRotateRight30 = i39 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = (iRotateRight29 ^ i69) + Integers.rotateRight(iRotateRight30, 17);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i75 = (iRotateRight31 ^ i69) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i75, 31);
            int iRotateRight34 = (i75 ^ i69) + Integers.rotateRight(iRotateRight33, 24);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i76 = iRotateRight34 ^ i69;
            int i77 = iArr2[c25];
            int iRotateRight36 = i36 + Integers.rotateRight(i37, 31);
            int iRotateRight37 = i37 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = (iRotateRight36 ^ i77) + Integers.rotateRight(iRotateRight37, 17);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i78 = (iRotateRight38 ^ i77) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i78, 31);
            int iRotateRight41 = (i78 ^ i77) + Integers.rotateRight(iRotateRight40, 24);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i79 = iRotateRight41 ^ i77;
            int iELL = ELL((i49 ^ i57) ^ i65);
            int iELL2 = ELL((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21);
            int i85 = (i76 ^ i57) ^ iELL2;
            int i86 = (iRotateRight35 ^ iRotateRight14) ^ iELL;
            int i87 = (iRotateRight42 ^ iRotateRight21) ^ iELL;
            int i88 = iELL ^ (iRotateRight28 ^ iRotateRight7);
            i38++;
            i28 = iRotateRight7;
            i29 = i57;
            i18 = (i79 ^ i65) ^ iELL2;
            i36 = i65;
            i25 = (i68 ^ i49) ^ iELL2;
            c15 = c19;
            c18 = c27;
            i17 = i86;
            i27 = i49;
            i39 = iRotateRight14;
            i16 = i85;
            c17 = c26;
            i19 = i87;
            i37 = iRotateRight21;
            i26 = i88;
            c16 = c25;
        }
        iArr[0] = i16;
        iArr[1] = i17;
        iArr[2] = i18;
        iArr[3] = i19;
        iArr[c15] = i25;
        iArr[c16] = i26;
        iArr[c17] = i27;
        iArr[c18] = i28;
        iArr[8] = i29;
        iArr[9] = i39;
        iArr[10] = i36;
        iArr[11] = i37;
    }

    static void sparkle_opt16(int[] iArr, int i15) {
        int i16 = iArr[0];
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = iArr[3];
        int i25 = iArr[4];
        int i26 = iArr[5];
        char c15 = 6;
        int i27 = iArr[6];
        char c16 = 7;
        int i28 = iArr[7];
        int i29 = iArr[8];
        int i35 = iArr[9];
        int i36 = iArr[10];
        int i37 = iArr[11];
        int i38 = iArr[12];
        int i39 = iArr[13];
        int i45 = iArr[14];
        int i46 = i37;
        int i47 = i39;
        int i48 = iArr[15];
        int i49 = 0;
        int i55 = i35;
        while (i49 < i15) {
            int[] iArr2 = RCON;
            int i56 = i17 ^ iArr2[i49 & 7];
            int i57 = i19 ^ i49;
            int i58 = iArr2[0];
            char c17 = c15;
            int iRotateRight = i16 + Integers.rotateRight(i56, 31);
            char c18 = c16;
            int iRotateRight2 = i56 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = (iRotateRight ^ i58) + Integers.rotateRight(iRotateRight2, 17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i59 = (iRotateRight3 ^ i58) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i59, 31);
            int iRotateRight6 = (i59 ^ i58) + Integers.rotateRight(iRotateRight5, 24);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i65 = iRotateRight6 ^ i58;
            int i66 = iArr2[1];
            int iRotateRight8 = i18 + Integers.rotateRight(i57, 31);
            int iRotateRight9 = i57 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = (iRotateRight8 ^ i66) + Integers.rotateRight(iRotateRight9, 17);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i67 = (iRotateRight10 ^ i66) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i67, 31);
            int iRotateRight13 = (i67 ^ i66) + Integers.rotateRight(iRotateRight12, 24);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i68 = iRotateRight13 ^ i66;
            int i69 = iArr2[2];
            int iRotateRight15 = i25 + Integers.rotateRight(i26, 31);
            int iRotateRight16 = i26 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = (iRotateRight15 ^ i69) + Integers.rotateRight(iRotateRight16, 17);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i75 = (iRotateRight17 ^ i69) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i75, 31);
            int iRotateRight20 = (i75 ^ i69) + Integers.rotateRight(iRotateRight19, 24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i76 = iRotateRight20 ^ i69;
            int i77 = iArr2[3];
            int iRotateRight22 = i27 + Integers.rotateRight(i28, 31);
            int iRotateRight23 = i28 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = (iRotateRight22 ^ i77) + Integers.rotateRight(iRotateRight23, 17);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i78 = (iRotateRight24 ^ i77) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i78, 31);
            int iRotateRight27 = (i78 ^ i77) + Integers.rotateRight(iRotateRight26, 24);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i79 = i77 ^ iRotateRight27;
            int i85 = iArr2[4];
            int iRotateRight29 = i29 + Integers.rotateRight(i55, 31);
            int iRotateRight30 = i55 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = (iRotateRight29 ^ i85) + Integers.rotateRight(iRotateRight30, 17);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i86 = (iRotateRight31 ^ i85) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i86, 31);
            int iRotateRight34 = (i86 ^ i85) + Integers.rotateRight(iRotateRight33, 24);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i87 = iRotateRight34 ^ i85;
            int i88 = iArr2[5];
            int iRotateRight36 = i36 + Integers.rotateRight(i46, 31);
            int iRotateRight37 = i46 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = (iRotateRight36 ^ i88) + Integers.rotateRight(iRotateRight37, 17);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i89 = (iRotateRight38 ^ i88) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i89, 31);
            int iRotateRight41 = (i89 ^ i88) + Integers.rotateRight(iRotateRight40, 24);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i95 = iRotateRight41 ^ i88;
            int i96 = iArr2[c17];
            int iRotateRight43 = i38 + Integers.rotateRight(i47, 31);
            int iRotateRight44 = i47 ^ Integers.rotateRight(iRotateRight43, 24);
            int iRotateRight45 = (iRotateRight43 ^ i96) + Integers.rotateRight(iRotateRight44, 17);
            int iRotateRight46 = iRotateRight44 ^ Integers.rotateRight(iRotateRight45, 17);
            int i97 = (iRotateRight45 ^ i96) + iRotateRight46;
            int iRotateRight47 = iRotateRight46 ^ Integers.rotateRight(i97, 31);
            int iRotateRight48 = (i97 ^ i96) + Integers.rotateRight(iRotateRight47, 24);
            int iRotateRight49 = iRotateRight47 ^ Integers.rotateRight(iRotateRight48, 16);
            int i98 = iRotateRight48 ^ i96;
            int i99 = iArr2[c18];
            int iRotateRight50 = i45 + Integers.rotateRight(i48, 31);
            int iRotateRight51 = i48 ^ Integers.rotateRight(iRotateRight50, 24);
            int iRotateRight52 = (iRotateRight50 ^ i99) + Integers.rotateRight(iRotateRight51, 17);
            int iRotateRight53 = iRotateRight51 ^ Integers.rotateRight(iRotateRight52, 17);
            int i100 = (iRotateRight52 ^ i99) + iRotateRight53;
            int iRotateRight54 = iRotateRight53 ^ Integers.rotateRight(i100, 31);
            int iRotateRight55 = (i100 ^ i99) + Integers.rotateRight(iRotateRight54, 24);
            int iRotateRight56 = iRotateRight54 ^ Integers.rotateRight(iRotateRight55, 16);
            int i101 = iRotateRight55 ^ i99;
            int iELL = ELL(((i65 ^ i68) ^ i76) ^ i79);
            int iELL2 = ELL(((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21) ^ iRotateRight28);
            int i102 = iRotateRight14 ^ iRotateRight42;
            int i103 = (i95 ^ i68) ^ iELL2;
            int i104 = (i98 ^ i76) ^ iELL2;
            int i105 = (iRotateRight21 ^ iRotateRight49) ^ iELL;
            int i106 = (i101 ^ i79) ^ iELL2;
            int i107 = (i65 ^ i87) ^ iELL2;
            i28 = (iRotateRight7 ^ iRotateRight35) ^ iELL;
            i49++;
            i26 = (iRotateRight56 ^ iRotateRight28) ^ iELL;
            i55 = iRotateRight7;
            i17 = i102 ^ iELL;
            i36 = i68;
            i18 = i104;
            i47 = iRotateRight21;
            i27 = i107;
            i16 = i103;
            i46 = iRotateRight14;
            i45 = i79;
            i19 = i105;
            c15 = c17;
            i29 = i65;
            i38 = i76;
            i25 = i106;
            i48 = iRotateRight28;
            c16 = c18;
        }
        iArr[0] = i16;
        iArr[1] = i17;
        iArr[2] = i18;
        iArr[3] = i19;
        iArr[4] = i25;
        iArr[5] = i26;
        iArr[c15] = i27;
        iArr[c16] = i28;
        iArr[8] = i29;
        iArr[9] = i55;
        iArr[10] = i36;
        iArr[11] = i46;
        iArr[12] = i38;
        iArr[13] = i47;
        iArr[14] = i45;
        iArr[15] = i48;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void init(byte[] bArr, byte[] bArr2) {
        Pack.littleEndianToInt(bArr, 0, this.f149062k);
        Pack.littleEndianToInt(bArr2, 0, this.npub);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        this.encrypted = false;
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.f149062k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        super.reset(z15);
    }
}
