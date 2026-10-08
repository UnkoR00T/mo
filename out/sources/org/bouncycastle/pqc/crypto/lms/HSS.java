package org.bouncycastle.pqc.crypto.lms;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;

/* JADX INFO: loaded from: classes5.dex */
class HSS {

    static class PlaceholderLMSPrivateKey extends LMSPrivateKeyParameters {
        public PlaceholderLMSPrivateKey(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i15, byte[] bArr, int i16, byte[] bArr2) {
            super(lMSigParameters, lMOtsParameters, i15, bArr, i16, bArr2);
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        LMOtsPrivateKey getNextOtsPrivateKey() {
            throw new RuntimeException("placeholder only");
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMSPublicKeyParameters getPublicKey() {
            throw new RuntimeException("placeholder only");
        }
    }

    HSS() {
    }

    public static HSSPrivateKeyParameters generateHSSKeyPair(HSSKeyGenerationParameters hSSKeyGenerationParameters) {
        byte[] bArr;
        int depth = hSSKeyGenerationParameters.getDepth();
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = new LMSPrivateKeyParameters[depth];
        LMSSignature[] lMSSignatureArr = new LMSSignature[hSSKeyGenerationParameters.getDepth() - 1];
        int i15 = 0;
        byte[] bArr2 = new byte[hSSKeyGenerationParameters.getLmsParameters()[0].getLMSigParam().getM()];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr3);
        byte[] bArr4 = new byte[0];
        long h15 = 1;
        while (i15 < depth) {
            if (i15 == 0) {
                lMSPrivateKeyParametersArr[i15] = new LMSPrivateKeyParameters(hSSKeyGenerationParameters.getLmsParameters()[i15].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i15].getLMOTSParam(), 0, bArr3, 1 << hSSKeyGenerationParameters.getLmsParameters()[i15].getLMSigParam().getH(), bArr2);
                bArr = bArr4;
            } else {
                bArr = bArr4;
                lMSPrivateKeyParametersArr[i15] = new PlaceholderLMSPrivateKey(hSSKeyGenerationParameters.getLmsParameters()[i15].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i15].getLMOTSParam(), -1, bArr, 1 << hSSKeyGenerationParameters.getLmsParameters()[i15].getLMSigParam().getH(), bArr4);
            }
            h15 *= (long) (1 << hSSKeyGenerationParameters.getLmsParameters()[i15].getLMSigParam().getH());
            i15++;
            bArr4 = bArr;
        }
        if (h15 == 0) {
            h15 = Long.MAX_VALUE;
        }
        return new HSSPrivateKeyParameters(hSSKeyGenerationParameters.getDepth(), Arrays.asList(lMSPrivateKeyParametersArr), Arrays.asList(lMSSignatureArr), 0L, h15);
    }

    public static HSSSignature generateSignature(int i15, LMSContext lMSContext) {
        return new HSSSignature(i15 - 1, lMSContext.getSignedPubKeys(), LMS.generateSign(lMSContext));
    }

    public static void incrementIndex(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            rangeTestKeys(hSSPrivateKeyParameters);
            hSSPrivateKeyParameters.incIndex();
            hSSPrivateKeyParameters.getKeys().get(hSSPrivateKeyParameters.getL() - 1).incIndex();
        }
    }

    static void rangeTestKeys(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            try {
                if (hSSPrivateKeyParameters.getIndex() >= hSSPrivateKeyParameters.getIndexLimit()) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("hss private key");
                    sb5.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                    sb5.append(" is exhausted");
                    throw new ExhaustedPrivateKeyException(sb5.toString());
                }
                int l15 = hSSPrivateKeyParameters.getL();
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                int i15 = l15;
                while (true) {
                    int i16 = i15 - 1;
                    if (keys.get(i16).getIndex() != (1 << keys.get(i16).getSigParameters().getH())) {
                        while (i15 < l15) {
                            hSSPrivateKeyParameters.replaceConsumedKey(i15);
                            i15++;
                        }
                    } else {
                        if (i16 == 0) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("hss private key");
                            sb6.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                            sb6.append(" is exhausted the maximum limit for this HSS private key");
                            throw new ExhaustedPrivateKeyException(sb6.toString());
                        }
                        i15 = i16;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static boolean verifySignature(HSSPublicKeyParameters hSSPublicKeyParameters, HSSSignature hSSSignature, byte[] bArr) {
        int i15 = hSSSignature.getlMinus1();
        int i16 = i15 + 1;
        if (i16 != hSSPublicKeyParameters.getL()) {
            return false;
        }
        LMSSignature[] lMSSignatureArr = new LMSSignature[i16];
        LMSPublicKeyParameters[] lMSPublicKeyParametersArr = new LMSPublicKeyParameters[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            lMSSignatureArr[i17] = hSSSignature.getSignedPubKey()[i17].getSignature();
            lMSPublicKeyParametersArr[i17] = hSSSignature.getSignedPubKey()[i17].getPublicKey();
        }
        lMSSignatureArr[i15] = hSSSignature.getSignature();
        LMSPublicKeyParameters lMSPublicKey = hSSPublicKeyParameters.getLMSPublicKey();
        for (int i18 = 0; i18 < i15; i18++) {
            if (!LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i18], lMSPublicKeyParametersArr[i18].toByteArray())) {
                return false;
            }
            try {
                lMSPublicKey = lMSPublicKeyParametersArr[i18];
            } catch (Exception e15) {
                throw new IllegalStateException(e15.getMessage(), e15);
            }
        }
        return LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i15], bArr);
    }

    public static HSSSignature generateSignature(HSSPrivateKeyParameters hSSPrivateKeyParameters, byte[] bArr) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l15 = hSSPrivateKeyParameters.getL();
        synchronized (hSSPrivateKeyParameters) {
            try {
                rangeTestKeys(hSSPrivateKeyParameters);
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                List<LMSSignature> sig = hSSPrivateKeyParameters.getSig();
                int i15 = l15 - 1;
                lMSPrivateKeyParameters = hSSPrivateKeyParameters.getKeys().get(i15);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i15];
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i16 + 1;
                    lMSSignedPubKeyArr[i16] = new LMSSignedPubKey(sig.get(i16), keys.get(i17).getPublicKey());
                    i16 = i17;
                }
                hSSPrivateKeyParameters.incIndex();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        LMSContext lMSContextWithSignedPublicKeys = lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
        lMSContextWithSignedPublicKeys.update(bArr, 0, bArr.length);
        return generateSignature(l15, lMSContextWithSignedPublicKeys);
    }
}
