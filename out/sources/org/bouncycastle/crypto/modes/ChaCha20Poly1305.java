package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ChaCha20Poly1305 implements AEADCipher {
    private static final long AAD_LIMIT = -1;
    private static final int BUF_SIZE = 64;
    private static final long DATA_LIMIT = 274877906880L;
    private static final int KEY_SIZE = 32;
    private static final int MAC_SIZE = 16;
    private static final int NONCE_SIZE = 12;
    private static final byte[] ZEROES = new byte[15];
    private long aadCount;
    private final byte[] buf;
    private int bufPos;
    private final ChaCha7539Engine chacha20;
    private long dataCount;
    private byte[] initialAAD;
    private final byte[] key;
    private final byte[] mac;
    private final byte[] nonce;
    private final Mac poly1305;
    private int state;

    private static final class State {
        static final int DEC_AAD = 6;
        static final int DEC_DATA = 7;
        static final int DEC_FINAL = 8;
        static final int DEC_INIT = 5;
        static final int ENC_AAD = 2;
        static final int ENC_DATA = 3;
        static final int ENC_FINAL = 4;
        static final int ENC_INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public ChaCha20Poly1305() {
        this(new Poly1305());
    }

    private void checkAAD() {
        int i15 = this.state;
        if (i15 == 1) {
            this.state = 2;
            return;
        }
        if (i15 != 2) {
            if (i15 == 4) {
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
            if (i15 == 5) {
                this.state = 6;
            } else if (i15 != 6) {
                throw new IllegalStateException();
            }
        }
    }

    private void checkData() {
        int i15;
        switch (this.state) {
            case 1:
            case 2:
                i15 = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i15 = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        finishAAD(i15);
    }

    private void finishAAD(int i15) {
        padMAC(this.aadCount);
        this.state = i15;
    }

    private void finishData(int i15) {
        padMAC(this.dataCount);
        byte[] bArr = new byte[16];
        Pack.longToLittleEndian(this.aadCount, bArr, 0);
        Pack.longToLittleEndian(this.dataCount, bArr, 8);
        this.poly1305.update(bArr, 0, 16);
        this.poly1305.doFinal(this.mac, 0);
        this.state = i15;
    }

    private long incrementCount(long j15, int i15, long j16) {
        long j17 = i15;
        if (j15 - Long.MIN_VALUE <= (j16 - j17) - Long.MIN_VALUE) {
            return j15 + j17;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    private void initMAC() {
        byte[] bArr = new byte[64];
        try {
            this.chacha20.processBytes(bArr, 0, 64, bArr, 0);
            this.poly1305.init(new KeyParameter(bArr, 0, 32));
        } finally {
            Arrays.clear(bArr);
        }
    }

    private void padMAC(long j15) {
        int i15 = ((int) j15) & 15;
        if (i15 != 0) {
            this.poly1305.update(ZEROES, 0, 16 - i15);
        }
    }

    private void processData(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (i17 > bArr2.length - i16) {
            throw new OutputLengthException("Output buffer too short");
        }
        this.chacha20.processBytes(bArr, i15, i16, bArr2, i17);
        this.dataCount = incrementCount(this.dataCount, i16, DATA_LIMIT);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException {
        int i16;
        int i17;
        if (bArr == null) {
            throw new NullPointerException("'out' cannot be null");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        checkData();
        Arrays.clear(this.mac);
        int i18 = this.state;
        if (i18 == 3) {
            int i19 = this.bufPos;
            int i25 = i19 + 16;
            if (i15 > bArr.length - i25) {
                throw new OutputLengthException("Output buffer too short");
            }
            if (i19 > 0) {
                processData(this.buf, 0, i19, bArr, i15);
                this.poly1305.update(bArr, i15, this.bufPos);
            }
            finishData(4);
            System.arraycopy(this.mac, 0, bArr, this.bufPos + i15, 16);
            i16 = i25;
        } else {
            if (i18 != 7) {
                throw new IllegalStateException();
            }
            int i26 = this.bufPos;
            if (i26 < 16) {
                throw new InvalidCipherTextException("data too short");
            }
            int i27 = i26 - 16;
            if (i15 > bArr.length - i27) {
                throw new OutputLengthException("Output buffer too short");
            }
            if (i27 > 0) {
                this.poly1305.update(this.buf, 0, i27);
                i17 = i27;
                processData(this.buf, 0, i17, bArr, i15);
            } else {
                i17 = i27;
            }
            finishData(8);
            if (!Arrays.constantTimeAreEqual(16, this.mac, 0, this.buf, i17)) {
                throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
            }
            i16 = i17;
        }
        reset(false, true);
        return i16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i15) {
        int iMax = Math.max(0, i15) + this.bufPos;
        int i16 = this.state;
        if (i16 == 1 || i16 == 2 || i16 == 3) {
            return iMax + 16;
        }
        if (i16 == 5 || i16 == 6 || i16 == 7) {
            return Math.max(0, iMax - 16);
        }
        throw new IllegalStateException();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        int iMax = Math.max(0, i15) + this.bufPos;
        int i16 = this.state;
        if (i16 != 1 && i16 != 2 && i16 != 3) {
            if (i16 != 5 && i16 != 6 && i16 != 7) {
                throw new IllegalStateException();
            }
            iMax = Math.max(0, iMax - 16);
        }
        return iMax - (iMax % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        ParametersWithIV parametersWithIV;
        KeyParameter key;
        byte[] iv4;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            key = aEADParameters.getKey();
            iv4 = aEADParameters.getNonce();
            parametersWithIV = new ParametersWithIV(key, iv4);
            this.initialAAD = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
            }
            parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv4 = parametersWithIV.getIV();
            this.initialAAD = null;
        }
        if (key == null) {
            if (this.state == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != key.getKeyLength()) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (iv4 == null || 12 != iv4.length) {
            throw new IllegalArgumentException("Nonce must be 96 bits");
        }
        if (this.state != 0 && z15 && Arrays.areEqual(this.nonce, iv4) && (key == null || Arrays.areEqual(this.key, key.getKey()))) {
            throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (key != null) {
            key.copyTo(this.key, 0, 32);
        }
        System.arraycopy(iv4, 0, this.nonce, 0, 12);
        this.chacha20.init(true, parametersWithIV);
        this.state = z15 ? 1 : 5;
        reset(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b15) {
        checkAAD();
        this.aadCount = incrementCount(this.aadCount, 1, AAD_LIMIT);
        this.poly1305.update(b15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i15, int i16) {
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i15 > bArr.length - i16) {
            throw new DataLengthException("Input buffer too short");
        }
        checkAAD();
        if (i16 > 0) {
            this.aadCount = incrementCount(this.aadCount, i16, AAD_LIMIT);
            this.poly1305.update(bArr, i15, i16);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        checkData();
        int i16 = this.state;
        if (i16 == 3) {
            byte[] bArr2 = this.buf;
            int i17 = this.bufPos;
            bArr2[i17] = b15;
            int i18 = i17 + 1;
            this.bufPos = i18;
            if (i18 != 64) {
                return 0;
            }
            processData(bArr2, 0, 64, bArr, i15);
            this.poly1305.update(bArr, i15, 64);
            this.bufPos = 0;
            return 64;
        }
        if (i16 != 7) {
            throw new IllegalStateException();
        }
        byte[] bArr3 = this.buf;
        int i19 = this.bufPos;
        bArr3[i19] = b15;
        int i25 = i19 + 1;
        this.bufPos = i25;
        if (i25 != bArr3.length) {
            return 0;
        }
        this.poly1305.update(bArr3, 0, 64);
        processData(this.buf, 0, 64, bArr, i15);
        byte[] bArr4 = this.buf;
        System.arraycopy(bArr4, 64, bArr4, 0, 16);
        this.bufPos = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        byte[] bArr3;
        int i18;
        int i19;
        int i25 = i15;
        int i26 = i16;
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i25 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i26 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i25 > bArr.length - i26) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i17 < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i26, i17, getUpdateOutputSize(i26))) {
            bArr = new byte[i26];
            System.arraycopy(bArr2, i15, bArr, 0, i26);
            i25 = 0;
        }
        checkData();
        int i27 = this.state;
        if (i27 != 3) {
            if (i27 != 7) {
                throw new IllegalStateException();
            }
            int i28 = 0;
            for (int i29 = 0; i29 < i26; i29++) {
                byte[] bArr4 = this.buf;
                int i35 = this.bufPos;
                bArr4[i35] = bArr[i25 + i29];
                int i36 = i35 + 1;
                this.bufPos = i36;
                if (i36 == bArr4.length) {
                    this.poly1305.update(bArr4, 0, 64);
                    processData(this.buf, 0, 64, bArr2, i17 + i28);
                    byte[] bArr5 = this.buf;
                    System.arraycopy(bArr5, 64, bArr5, 0, 16);
                    this.bufPos = 16;
                    i28 += 64;
                }
            }
            return i28;
        }
        if (this.bufPos == 0) {
            bArr3 = bArr2;
            i18 = i26;
            i19 = 0;
            break;
        }
        while (true) {
            if (i26 <= 0) {
                bArr3 = bArr2;
                i18 = i26;
                i19 = 0;
                break;
            }
            i18 = i26 - 1;
            byte[] bArr6 = this.buf;
            int i37 = this.bufPos;
            int i38 = i25 + 1;
            bArr6[i37] = bArr[i25];
            int i39 = i37 + 1;
            this.bufPos = i39;
            if (i39 == 64) {
                bArr3 = bArr2;
                processData(bArr6, 0, 64, bArr3, i17);
                this.poly1305.update(bArr3, i17, 64);
                this.bufPos = 0;
                i25 = i38;
                i19 = 64;
                break;
            }
            i26 = i18;
            i25 = i38;
        }
        while (i18 >= 64) {
            int i45 = i17 + i19;
            byte[] bArr7 = bArr;
            int i46 = i25;
            processData(bArr7, i46, 64, bArr3, i45);
            this.poly1305.update(bArr3, i45, 64);
            i25 = i46 + 64;
            i18 -= 64;
            i19 += 64;
            bArr = bArr7;
        }
        byte[] bArr8 = bArr;
        if (i18 > 0) {
            System.arraycopy(bArr8, i25, this.buf, 0, i18);
            this.bufPos = i18;
        }
        return i19;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true, true);
    }

    public ChaCha20Poly1305(Mac mac) {
        this.key = new byte[32];
        this.nonce = new byte[12];
        this.buf = new byte[80];
        this.mac = new byte[16];
        this.state = 0;
        if (mac == null) {
            throw new NullPointerException("'poly1305' cannot be null");
        }
        if (16 != mac.getMacSize()) {
            throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
        this.chacha20 = new ChaCha7539Engine();
        this.poly1305 = mac;
    }

    private void reset(boolean z15, boolean z16) {
        Arrays.clear(this.buf);
        if (z15) {
            Arrays.clear(this.mac);
        }
        this.aadCount = 0L;
        this.dataCount = 0L;
        this.bufPos = 0;
        switch (this.state) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.state = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.state = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z16) {
            this.chacha20.reset();
        }
        initMAC();
        byte[] bArr = this.initialAAD;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
