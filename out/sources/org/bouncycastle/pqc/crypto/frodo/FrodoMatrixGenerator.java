package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
abstract class FrodoMatrixGenerator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f149462n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f149463q;

    static class Aes128MatrixGenerator extends FrodoMatrixGenerator {
        public Aes128MatrixGenerator(int i15, int i16) {
            super(i15, i16);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        short[] genMatrix(byte[] bArr) {
            int i15 = this.f149462n;
            short[] sArr = new short[i15 * i15];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            AESEngine aESEngine = new AESEngine();
            aESEngine.init(true, new KeyParameter(bArr));
            for (int i16 = 0; i16 < this.f149462n; i16++) {
                Pack.shortToLittleEndian((short) i16, bArr2, 0);
                for (int i17 = 0; i17 < this.f149462n; i17 += 8) {
                    Pack.shortToLittleEndian((short) i17, bArr2, 2);
                    aESEngine.processBlock(bArr2, 0, bArr3, 0);
                    for (int i18 = 0; i18 < 8; i18++) {
                        sArr[(this.f149462n * i16) + i17 + i18] = (short) (Pack.littleEndianToShort(bArr3, i18 * 2) & (this.f149463q - 1));
                    }
                }
            }
            return sArr;
        }
    }

    static class Shake128MatrixGenerator extends FrodoMatrixGenerator {
        public Shake128MatrixGenerator(int i15, int i16) {
            super(i15, i16);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        short[] genMatrix(byte[] bArr) {
            int i15 = this.f149462n;
            short[] sArr = new short[i15 * i15];
            int i16 = (i15 * 16) / 8;
            byte[] bArr2 = new byte[i16];
            int length = bArr.length + 2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            for (short s15 = 0; s15 < this.f149462n; s15 = (short) (s15 + 1)) {
                Pack.shortToLittleEndian(s15, bArr3, 0);
                sHAKEDigest.update(bArr3, 0, length);
                sHAKEDigest.doFinal(bArr2, 0, i16);
                short s16 = 0;
                while (true) {
                    int i17 = this.f149462n;
                    if (s16 < i17) {
                        sArr[(i17 * s15) + s16] = (short) (Pack.littleEndianToShort(bArr2, s16 * 2) & (this.f149463q - 1));
                        s16 = (short) (s16 + 1);
                    }
                }
            }
            return sArr;
        }
    }

    public FrodoMatrixGenerator(int i15, int i16) {
        this.f149462n = i15;
        this.f149463q = i16;
    }

    abstract short[] genMatrix(byte[] bArr);
}
