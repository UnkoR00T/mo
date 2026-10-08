package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f149061x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i15 = this.cW0 + 1;
        this.cW0 = i15;
        if (i15 == 0) {
            int i16 = this.cW1 + 1;
            this.cW1 = i16;
            if (i16 == 0) {
                int i17 = this.cW2 + 1;
                this.cW2 = i17;
                if ((i17 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static void salsaCore(int i15, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i15 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i16 = iArr[0];
        int i17 = iArr[1];
        int i18 = iArr[2];
        char c15 = 3;
        int i19 = iArr[3];
        char c16 = 4;
        int i25 = iArr[4];
        char c17 = 5;
        int i26 = iArr[5];
        char c18 = 6;
        int i27 = iArr[6];
        int i28 = 7;
        int i29 = iArr[7];
        int i35 = iArr[8];
        int i36 = 9;
        int i37 = iArr[9];
        int i38 = iArr[10];
        int i39 = iArr[11];
        int i45 = iArr[12];
        int i46 = 13;
        int i47 = iArr[13];
        int i48 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i48;
        int iRotateLeft3 = i47;
        int iRotateLeft4 = i45;
        int iRotateLeft5 = i39;
        int iRotateLeft6 = i38;
        int i49 = i37;
        int i55 = i35;
        int i56 = i29;
        int i57 = i27;
        int iRotateLeft7 = i26;
        int i58 = i25;
        int i59 = i19;
        int i65 = i18;
        int i66 = i17;
        int iRotateLeft8 = i16;
        int i67 = i15;
        while (true) {
            char c19 = c15;
            if (i67 <= 0) {
                char c25 = c16;
                char c26 = c17;
                char c27 = c18;
                iArr2[0] = iRotateLeft8 + iArr[0];
                iArr2[1] = i66 + iArr[1];
                iArr2[2] = i65 + iArr[2];
                iArr2[c19] = i59 + iArr[c19];
                iArr2[c25] = i58 + iArr[c25];
                iArr2[c26] = iRotateLeft7 + iArr[c26];
                iArr2[c27] = i57 + iArr[c27];
                iArr2[7] = i56 + iArr[7];
                iArr2[8] = i55 + iArr[8];
                iArr2[9] = i49 + iArr[9];
                iArr2[10] = iRotateLeft6 + iArr[10];
                iArr2[11] = iRotateLeft5 + iArr[11];
                iArr2[12] = iRotateLeft4 + iArr[12];
                iArr2[13] = iRotateLeft3 + iArr[13];
                iArr2[14] = iRotateLeft2 + iArr[14];
                iArr2[15] = iRotateLeft + iArr[15];
                return;
            }
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft8 + iRotateLeft4, i28) ^ i58;
            int iRotateLeft10 = i55 ^ Integers.rotateLeft(iRotateLeft9 + iRotateLeft8, i36);
            char c28 = c16;
            int iRotateLeft11 = iRotateLeft4 ^ Integers.rotateLeft(iRotateLeft10 + iRotateLeft9, i46);
            char c29 = c17;
            char c35 = c18;
            int iRotateLeft12 = iRotateLeft8 ^ Integers.rotateLeft(iRotateLeft11 + iRotateLeft10, 18);
            int iRotateLeft13 = i49 ^ Integers.rotateLeft(iRotateLeft7 + i66, i28);
            int iRotateLeft14 = iRotateLeft3 ^ Integers.rotateLeft(iRotateLeft13 + iRotateLeft7, i36);
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft14 + iRotateLeft13, i46) ^ i66;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft15 + iRotateLeft14, 18) ^ iRotateLeft7;
            int iRotateLeft17 = iRotateLeft2 ^ Integers.rotateLeft(iRotateLeft6 + i57, 7);
            int iRotateLeft18 = i65 ^ Integers.rotateLeft(iRotateLeft17 + iRotateLeft6, 9);
            int iRotateLeft19 = i57 ^ Integers.rotateLeft(iRotateLeft18 + iRotateLeft17, 13);
            int iRotateLeft20 = iRotateLeft6 ^ Integers.rotateLeft(iRotateLeft19 + iRotateLeft18, 18);
            int iRotateLeft21 = i59 ^ Integers.rotateLeft(iRotateLeft + iRotateLeft5, 7);
            int iRotateLeft22 = i56 ^ Integers.rotateLeft(iRotateLeft21 + iRotateLeft, 9);
            int iRotateLeft23 = iRotateLeft5 ^ Integers.rotateLeft(iRotateLeft22 + iRotateLeft21, 13);
            int iRotateLeft24 = iRotateLeft ^ Integers.rotateLeft(iRotateLeft23 + iRotateLeft22, 18);
            int iRotateLeft25 = iRotateLeft15 ^ Integers.rotateLeft(iRotateLeft12 + iRotateLeft21, 7);
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft25 + iRotateLeft12, 9) ^ iRotateLeft18;
            int iRotateLeft27 = iRotateLeft21 ^ Integers.rotateLeft(iRotateLeft26 + iRotateLeft25, 13);
            iRotateLeft8 = iRotateLeft12 ^ Integers.rotateLeft(iRotateLeft27 + iRotateLeft26, 18);
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft16 + iRotateLeft9, 7) ^ iRotateLeft19;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft28 + iRotateLeft16, 9) ^ iRotateLeft22;
            int iRotateLeft30 = iRotateLeft9 ^ Integers.rotateLeft(iRotateLeft29 + iRotateLeft28, 13);
            iRotateLeft7 = iRotateLeft16 ^ Integers.rotateLeft(iRotateLeft30 + iRotateLeft29, 18);
            iRotateLeft5 = iRotateLeft23 ^ Integers.rotateLeft(iRotateLeft20 + iRotateLeft13, 7);
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft5 + iRotateLeft20, 9) ^ iRotateLeft10;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft31 + iRotateLeft5, 13) ^ iRotateLeft13;
            iRotateLeft6 = iRotateLeft20 ^ Integers.rotateLeft(iRotateLeft32 + iRotateLeft31, 18);
            iRotateLeft4 = iRotateLeft11 ^ Integers.rotateLeft(iRotateLeft24 + iRotateLeft17, 7);
            iRotateLeft3 = iRotateLeft14 ^ Integers.rotateLeft(iRotateLeft4 + iRotateLeft24, 9);
            iRotateLeft2 = iRotateLeft17 ^ Integers.rotateLeft(iRotateLeft3 + iRotateLeft4, 13);
            iRotateLeft = iRotateLeft24 ^ Integers.rotateLeft(iRotateLeft2 + iRotateLeft3, 18);
            i67 -= 2;
            i55 = iRotateLeft31;
            i66 = iRotateLeft25;
            i57 = iRotateLeft28;
            i58 = iRotateLeft30;
            i56 = iRotateLeft29;
            i49 = iRotateLeft32;
            c15 = c19;
            c16 = c28;
            c17 = c29;
            c18 = c35;
            i28 = 7;
            i65 = iRotateLeft26;
            i59 = iRotateLeft27;
            i36 = 9;
            i46 = 13;
        }
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i15 = iArr[8] + 1;
        iArr[8] = i15;
        if (i15 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f149061x);
        Pack.intToLittleEndian(this.f149061x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    protected long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[9]) << 32) | (((long) iArr[8]) & BodyPartID.bodyIdMax);
    }

    protected int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.index);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv4 = parametersWithIV.getIV();
        if (iv4 == null || iv4.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv4);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            byte[] key = ((KeyParameter) parameters).getKey();
            setKey(key, iv4);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z15)));
        }
        reset();
        this.initialised = true;
    }

    protected void packTauOrSigma(int i15, int[] iArr, int i16) {
        int i17 = (i15 - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i16] = iArr2[i17];
        iArr[i16 + 1] = iArr2[i17 + 1];
        iArr[i16 + 2] = iArr2[i17 + 2];
        iArr[i16 + 3] = iArr2[i17 + 3];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (limitExceeded(i16)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i18 = 0; i18 < i16; i18++) {
            byte[] bArr3 = this.keyStream;
            int i19 = this.index;
            bArr2[i18 + i17] = (byte) (bArr3[i19] ^ bArr[i18 + i15]);
            int i25 = (i19 + 1) & 63;
            this.index = i25;
            if (i25 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    protected void retreatCounter() {
        int[] iArr = this.engineState;
        int i15 = iArr[8];
        if (i15 == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i16 = i15 - 1;
        iArr[8] = i16;
        if (i16 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b15) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i15 = this.index;
        byte b16 = (byte) (b15 ^ bArr[i15]);
        int i16 = (i15 + 1) & 63;
        this.index = i16;
        if (i16 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b16;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j15) {
        reset();
        return skip(j15);
    }

    protected void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j15) {
        long j16;
        if (j15 >= 0) {
            if (j15 >= 64) {
                long j17 = j15 / 64;
                advanceCounter(j17);
                j16 = j15 - (j17 * 64);
            } else {
                j16 = j15;
            }
            int i15 = this.index;
            int i16 = (((int) j16) + i15) & 63;
            this.index = i16;
            if (i16 < i15) {
                advanceCounter();
            }
        } else {
            long j18 = -j15;
            if (j18 >= 64) {
                long j19 = j18 / 64;
                retreatCounter(j19);
                j18 -= j19 * 64;
            }
            for (long j25 = 0; j25 < j18; j25++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j15;
    }

    public Salsa20Engine(int i15) {
        this.index = 0;
        this.engineState = new int[16];
        this.f149061x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i15 <= 0 || (i15 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i15;
    }

    private boolean limitExceeded(int i15) {
        int i16 = this.cW0 + i15;
        this.cW0 = i16;
        if (i16 < i15 && i16 >= 0) {
            int i17 = this.cW1 + 1;
            this.cW1 = i17;
            if (i17 == 0) {
                int i18 = this.cW2 + 1;
                this.cW2 = i18;
                if ((i18 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void advanceCounter(long j15) {
        int i15 = (int) (j15 >>> 32);
        int i16 = (int) j15;
        if (i15 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i15;
        }
        int[] iArr2 = this.engineState;
        int i17 = iArr2[8];
        int i18 = i16 + i17;
        iArr2[8] = i18;
        if (i17 == 0 || i18 >= i17) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    protected void retreatCounter(long j15) {
        int i15 = (int) (j15 >>> 32);
        int i16 = (int) j15;
        if (i15 != 0) {
            int[] iArr = this.engineState;
            int i17 = iArr[9];
            if ((((long) i17) & BodyPartID.bodyIdMax) < (((long) i15) & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i17 - i15;
        }
        int[] iArr2 = this.engineState;
        int i18 = iArr2[8];
        if ((((long) i18) & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & ((long) i16))) {
            iArr2[8] = i18 - i16;
            return;
        }
        int i19 = iArr2[9];
        if (i19 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i19 - 1;
        iArr2[8] = i18 - i16;
    }
}
