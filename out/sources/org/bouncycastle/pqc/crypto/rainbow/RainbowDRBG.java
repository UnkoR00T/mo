package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class RainbowDRBG extends SecureRandom {
    private Digest hashAlgo;
    private byte[] key;
    private byte[] seed;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f149526v;

    public RainbowDRBG(byte[] bArr, Digest digest) {
        this.seed = bArr;
        this.hashAlgo = digest;
        init(256);
    }

    private void AES256_CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i15 = 0; i15 < 3; i15++) {
            for (int i16 = 15; i16 >= 0; i16--) {
                byte b15 = bArr3[i16];
                if ((b15 & 255) != 255) {
                    bArr3[i16] = (byte) (b15 + 1);
                    break;
                }
                bArr3[i16] = 0;
            }
            AES256_ECB(bArr2, bArr3, bArr4, i15 * 16);
        }
        if (bArr != null) {
            for (int i17 = 0; i17 < 48; i17++) {
                bArr4[i17] = (byte) (bArr4[i17] ^ bArr[i17]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    private void AES256_ECB(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        try {
            AESEngine aESEngine = new AESEngine();
            aESEngine.init(true, new KeyParameter(bArr));
            for (int i16 = 0; i16 != bArr2.length; i16 += 16) {
                aESEngine.processBlock(bArr2, i16, bArr3, i15 + i16);
            }
        } catch (Throwable th4) {
            throw new IllegalStateException("drbg failure: " + th4.getMessage(), th4);
        }
    }

    private void init(int i15) {
        byte[] bArr = this.seed;
        if (bArr.length >= 48) {
            randombytes_init(bArr, i15);
        } else {
            randombytes_init(Arrays.concatenate(this.seed, RainbowUtil.hash(this.hashAlgo, bArr, 48 - bArr.length)), i15);
        }
    }

    private void randombytes_init(byte[] bArr, int i15) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.key = bArr3;
        byte[] bArr4 = new byte[16];
        this.f149526v = bArr4;
        AES256_CTR_DRBG_Update(bArr2, bArr3, bArr4);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i15 = 0;
        while (length > 0) {
            for (int i16 = 15; i16 >= 0; i16--) {
                byte[] bArr3 = this.f149526v;
                byte b15 = bArr3[i16];
                if ((b15 & 255) != 255) {
                    bArr3[i16] = (byte) (b15 + 1);
                    break;
                }
                bArr3[i16] = 0;
            }
            AES256_ECB(this.key, this.f149526v, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i15, 16);
                i15 += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i15, length);
                length = 0;
            }
        }
        AES256_CTR_DRBG_Update(null, this.key, this.f149526v);
    }
}
