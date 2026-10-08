package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class LM_OTS {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    LM_OTS() {
    }

    public static int cksm(byte[] bArr, int i15, LMOtsParameters lMOtsParameters) {
        int w15 = (1 << lMOtsParameters.getW()) - 1;
        int iCoef = 0;
        for (int i16 = 0; i16 < (i15 * 8) / lMOtsParameters.getW(); i16++) {
            iCoef = (iCoef + w15) - coef(bArr, i16, lMOtsParameters.getW());
        }
        return iCoef << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i15, int i16) {
        int i17 = (i15 * i16) / 8;
        return (bArr[i17] >>> (((~i15) & ((8 / i16) - 1)) * i16)) & ((1 << i16) - 1);
    }

    public static LMOtsSignature lm_ots_generate_signature(LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = lMOtsPrivateKey.getParameter();
        int n15 = parameter.getN();
        int p15 = parameter.getP();
        int w15 = parameter.getW();
        byte[] bArr3 = new byte[p15 * n15];
        Digest digest = DigestUtil.getDigest(parameter);
        SeedDerive derivationFunction = lMOtsPrivateKey.getDerivationFunction();
        int iCksm = cksm(bArr, n15, parameter);
        bArr[n15] = (byte) ((iCksm >>> 8) & GF2Field.MASK);
        bArr[n15 + 1] = (byte) iCksm;
        int i15 = n15 + 23;
        byte[] bArrBuild = Composer.compose().bytes(lMOtsPrivateKey.getI()).u32str(lMOtsPrivateKey.getQ()).padUntil(0, i15).build();
        derivationFunction.setJ(0);
        int i16 = 0;
        while (i16 < p15) {
            Pack.shortToBigEndian((short) i16, bArrBuild, 20);
            derivationFunction.deriveSeed(bArrBuild, i16 < p15 + (-1), 23);
            int iCoef = coef(bArr, i16, w15);
            for (int i17 = 0; i17 < iCoef; i17++) {
                bArrBuild[22] = (byte) i17;
                digest.update(bArrBuild, 0, i15);
                digest.doFinal(bArrBuild, 23);
            }
            System.arraycopy(bArrBuild, 23, bArr3, n15 * i16, n15);
            i16++;
        }
        return new LMOtsSignature(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr, boolean z15) throws LMSException {
        if (lMOtsSignature.getType().equals(lMOtsPublicKey.getParameter())) {
            return Arrays.areEqual(lm_ots_validate_signature_calculate(lMOtsPublicKey, lMOtsSignature, bArr), lMOtsPublicKey.getK());
        }
        throw new LMSException("public key and signature ots types do not match");
    }

    public static byte[] lm_ots_validate_signature_calculate(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr) {
        LMSContext lMSContextCreateOtsContext = lMOtsPublicKey.createOtsContext(lMOtsSignature);
        LmsUtils.byteArray(bArr, lMSContextCreateOtsContext);
        return lm_ots_validate_signature_calculate(lMSContextCreateOtsContext);
    }

    public static LMOtsPublicKey lms_ots_generatePublicKey(LMOtsPrivateKey lMOtsPrivateKey) {
        return new LMOtsPublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lms_ots_generatePublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lMOtsPrivateKey.getMasterSecret()));
    }

    public static LMOtsSignature lm_ots_generate_signature(LMSigParameters lMSigParameters, LMOtsPrivateKey lMOtsPrivateKey, byte[][] bArr, byte[] bArr2, boolean z15) {
        byte[] c15;
        byte[] q15 = new byte[34];
        if (z15) {
            int n15 = lMOtsPrivateKey.getParameter().getN();
            c15 = new byte[n15];
            System.arraycopy(bArr2, 0, q15, 0, n15);
        } else {
            LMSContext signatureContext = lMOtsPrivateKey.getSignatureContext(lMSigParameters, bArr);
            LmsUtils.byteArray(bArr2, 0, bArr2.length, signatureContext);
            c15 = signatureContext.getC();
            q15 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(lMOtsPrivateKey, q15, c15);
    }

    public static byte[] lm_ots_validate_signature_calculate(LMSContext lMSContext) {
        LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lMSContext.getSignature();
        LMOtsSignature otsSignature = signature instanceof LMSSignature ? ((LMSSignature) signature).getOtsSignature() : (LMOtsSignature) signature;
        int n15 = parameter.getN();
        int w15 = parameter.getW();
        int p15 = parameter.getP();
        byte[] q15 = lMSContext.getQ();
        int iCksm = cksm(q15, n15, parameter);
        q15[n15] = (byte) ((iCksm >>> 8) & GF2Field.MASK);
        q15[n15 + 1] = (byte) iCksm;
        byte[] i15 = publicKey.getI();
        int q16 = publicKey.getQ();
        Digest digest = DigestUtil.getDigest(parameter);
        LmsUtils.byteArray(i15, digest);
        LmsUtils.u32str(q16, digest);
        LmsUtils.u16str(D_PBLC, digest);
        Composer composerU32str = Composer.compose().bytes(i15).u32str(q16);
        int i16 = n15 + 23;
        byte[] bArrBuild = composerU32str.padUntil(0, i16).build();
        int i17 = (1 << w15) - 1;
        byte[] y15 = otsSignature.getY();
        Digest digest2 = DigestUtil.getDigest(parameter);
        for (int i18 = 0; i18 < p15; i18++) {
            Pack.shortToBigEndian((short) i18, bArrBuild, 20);
            System.arraycopy(y15, i18 * n15, bArrBuild, 23, n15);
            for (int iCoef = coef(q15, i18, w15); iCoef < i17; iCoef++) {
                bArrBuild[22] = (byte) iCoef;
                digest2.update(bArrBuild, 0, i16);
                digest2.doFinal(bArrBuild, 23);
            }
            digest.update(bArrBuild, 23, n15);
        }
        byte[] bArr = new byte[n15];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i15, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild = Composer.compose().bytes(bArr).u32str(i15).u16str(-32640).padUntil(0, 22).build();
        digest.update(bArrBuild, 0, bArrBuild.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild2 = Composer.compose().bytes(bArr).u32str(i15).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters));
        seedDerive.setQ(i15);
        seedDerive.setJ(0);
        int p15 = lMOtsParameters.getP();
        int n15 = lMOtsParameters.getN();
        int w15 = (1 << lMOtsParameters.getW()) - 1;
        int i16 = 0;
        while (i16 < p15) {
            seedDerive.deriveSeed(bArrBuild2, i16 < p15 + (-1), 23);
            Pack.shortToBigEndian((short) i16, bArrBuild2, 20);
            for (int i17 = 0; i17 < w15; i17++) {
                bArrBuild2[22] = (byte) i17;
                digest2.update(bArrBuild2, 0, bArrBuild2.length);
                digest2.doFinal(bArrBuild2, 23);
            }
            digest.update(bArrBuild2, 23, n15);
            i16++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
