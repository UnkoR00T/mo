package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f149106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f149107d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f149108k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected long f149109k1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f149110m;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected long f149111v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected long f149112v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    protected long f149113v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    protected long f149114v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f149110m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f149106c = 2;
        this.f149107d = 4;
    }

    protected static long rotateLeft(long j15, int i15) {
        return (j15 >>> (-i15)) | (j15 << i15);
    }

    protected void applySipRounds(int i15) {
        long jRotateLeft = this.f149111v0;
        long jRotateLeft2 = this.f149112v1;
        long jRotateLeft3 = this.f149113v2;
        long jRotateLeft4 = this.f149114v3;
        for (int i16 = 0; i16 < i15; i16++) {
            long j15 = jRotateLeft + jRotateLeft2;
            long j16 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j15;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j16;
            long j17 = j16 + jRotateLeft5;
            jRotateLeft = rotateLeft(j15, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j17;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j17, 32);
        }
        this.f149111v0 = jRotateLeft;
        this.f149112v1 = jRotateLeft2;
        this.f149113v2 = jRotateLeft3;
        this.f149114v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        Pack.longToLittleEndian(doFinal(), bArr, i15);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f149106c + "-" + this.f149107d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f149108k0 = Pack.littleEndianToLong(key, 0);
        this.f149109k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    protected void processMessageWord() {
        this.wordCount++;
        this.f149114v3 ^= this.f149110m;
        applySipRounds(this.f149106c);
        this.f149111v0 ^= this.f149110m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j15 = this.f149108k0;
        this.f149111v0 = 8317987319222330741L ^ j15;
        long j16 = this.f149109k1;
        this.f149112v1 = 7237128888997146477L ^ j16;
        this.f149113v2 = j15 ^ 7816392313619706465L;
        this.f149114v3 = 8387220255154660723L ^ j16;
        this.f149110m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        this.f149110m = (this.f149110m >>> 8) | ((((long) b15) & 255) << 56);
        int i15 = this.wordPos + 1;
        this.wordPos = i15;
        if (i15 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i15, int i16) {
        this.f149110m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f149106c = i15;
        this.f149107d = i16;
    }

    public long doFinal() {
        long j15 = this.f149110m;
        int i15 = this.wordPos;
        this.f149110m = ((j15 >>> ((7 - i15) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i15)) & 255) << 56);
        processMessageWord();
        this.f149113v2 ^= 255;
        applySipRounds(this.f149107d);
        long j16 = ((this.f149111v0 ^ this.f149112v1) ^ this.f149113v2) ^ this.f149114v3;
        reset();
        return j16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        int i17 = i16 & (-8);
        int i18 = this.wordPos;
        char c15 = '8';
        long j15 = 255;
        int i19 = 0;
        if (i18 == 0) {
            while (i19 < i17) {
                this.f149110m = Pack.littleEndianToLong(bArr, i15 + i19);
                processMessageWord();
                i19 += 8;
            }
            while (i19 < i16) {
                long j16 = this.f149110m >>> 8;
                this.f149110m = j16;
                this.f149110m = j16 | ((((long) bArr[i15 + i19]) & 255) << 56);
                i19++;
            }
            this.wordPos = i16 - i17;
            return;
        }
        int i25 = i18 << 3;
        int i26 = 0;
        while (i26 < i17) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i15 + i26);
            this.f149110m = (this.f149110m >>> (-i25)) | (jLittleEndianToLong << i25);
            processMessageWord();
            this.f149110m = jLittleEndianToLong;
            i26 += 8;
            c15 = c15;
            j15 = j15;
        }
        char c16 = c15;
        long j17 = j15;
        while (i26 < i16) {
            long j18 = this.f149110m >>> 8;
            this.f149110m = j18;
            this.f149110m = j18 | ((((long) bArr[i15 + i26]) & j17) << c16);
            int i27 = this.wordPos + 1;
            this.wordPos = i27;
            if (i27 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i26++;
        }
    }
}
