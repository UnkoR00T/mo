package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes5.dex */
public class MayoKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MayoParameters f149494p;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int i15;
        int mVecLimbs = this.f149494p.getMVecLimbs();
        int m15 = this.f149494p.getM();
        int v15 = this.f149494p.getV();
        int o15 = this.f149494p.getO();
        int oBytes = this.f149494p.getOBytes();
        int p1Limbs = this.f149494p.getP1Limbs();
        int p3Limbs = this.f149494p.getP3Limbs();
        int pkSeedBytes = this.f149494p.getPkSeedBytes();
        int skSeedBytes = this.f149494p.getSkSeedBytes();
        byte[] bArr = new byte[this.f149494p.getCpkBytes()];
        byte[] bArr2 = new byte[this.f149494p.getCskBytes()];
        int i16 = oBytes + pkSeedBytes;
        byte[] bArr3 = new byte[i16];
        long[] jArr = new long[this.f149494p.getP2Limbs() + p1Limbs];
        long[] jArr2 = new long[o15 * o15 * mVecLimbs];
        int i17 = v15 * o15;
        byte[] bArr4 = new byte[i17];
        this.random.nextBytes(bArr2);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, skSeedBytes);
        sHAKEDigest.doFinal(bArr3, 0, i16);
        GF16.decode(bArr3, pkSeedBytes, bArr4, 0, i17);
        Utils.expandP1P2(this.f149494p, jArr, bArr3);
        int i18 = 0;
        GF16Utils.mulAddMUpperTriangularMatXMat(mVecLimbs, jArr, bArr4, jArr, p1Limbs, v15, o15);
        byte[] bArr5 = bArr4;
        GF16Utils.mulAddMatTransXMMat(mVecLimbs, bArr5, jArr, p1Limbs, jArr2, v15, o15);
        System.arraycopy(bArr3, 0, bArr, 0, pkSeedBytes);
        long[] jArr3 = new long[p3Limbs];
        int i19 = o15 * mVecLimbs;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            byte[] bArr6 = bArr5;
            if (i25 >= o15) {
                Utils.packMVecs(jArr3, bArr, pkSeedBytes, p3Limbs / mVecLimbs, m15);
                Arrays.clear(bArr6);
                Arrays.clear(jArr2);
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new MayoPublicKeyParameters(this.f149494p, bArr), (AsymmetricKeyParameter) new MayoPrivateKeyParameters(this.f149494p, bArr2));
            }
            int i28 = i25;
            int i29 = i26;
            int i35 = i18;
            while (true) {
                i15 = i19;
                if (i28 < o15) {
                    System.arraycopy(jArr2, i26 + i35, jArr3, i27, mVecLimbs);
                    if (i25 != i28) {
                        Longs.xorTo(mVecLimbs, jArr2, i29 + i18, jArr3, i27);
                    }
                    i27 += mVecLimbs;
                    i28++;
                    i35 += mVecLimbs;
                    i29 += i15;
                    i19 = i15;
                }
            }
            i25++;
            i26 += i15;
            i18 += mVecLimbs;
            bArr5 = bArr6;
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f149494p = ((MayoKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }
}
