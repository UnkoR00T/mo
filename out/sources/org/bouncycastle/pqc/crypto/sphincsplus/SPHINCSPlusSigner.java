package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SPHINCSPlusSigner implements MessageSigner {
    private SPHINCSPlusPrivateKeyParameters privKey;
    private SPHINCSPlusPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        SPHINCSPlusEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.f149609pk.seed);
        int i15 = engine.N;
        byte[] bArr2 = new byte[i15];
        SecureRandom secureRandom = this.random;
        int i16 = 0;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy(this.privKey.f149609pk.seed, 0, bArr2, 0, i15);
        }
        Fors fors = new Fors(engine);
        byte[] bArrPRF_msg = engine.PRF_msg(this.privKey.f149610sk.prf, bArr2, bArr);
        PK pk4 = this.privKey.f149609pk;
        IndexedDigest indexedDigestH_msg = engine.H_msg(bArrPRF_msg, pk4.seed, pk4.root, bArr);
        byte[] bArr3 = indexedDigestH_msg.digest;
        long j15 = indexedDigestH_msg.idx_tree;
        int i17 = indexedDigestH_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setTypeAndClear(3);
        adrs.setTreeAddress(j15);
        adrs.setKeyPairAddress(i17);
        SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = this.privKey;
        SIG_FORS[] sig_forsArrSign = fors.sign(bArr3, sPHINCSPlusPrivateKeyParameters.f149610sk.seed, sPHINCSPlusPrivateKeyParameters.f149609pk.seed, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setTypeAndClear(3);
        adrs2.setTreeAddress(j15);
        adrs2.setKeyPairAddress(i17);
        byte[] bArrPkFromSig = fors.pkFromSig(sig_forsArrSign, bArr3, this.privKey.f149609pk.seed, adrs2);
        new ADRS().setTypeAndClear(2);
        byte[] bArrSign = new HT(engine, this.privKey.getSeed(), this.privKey.getPublicSeed()).sign(bArrPkFromSig, j15, i17);
        int length = sig_forsArrSign.length;
        byte[][] bArr4 = new byte[length + 2][];
        bArr4[0] = bArrPRF_msg;
        while (i16 != sig_forsArrSign.length) {
            int i18 = i16 + 1;
            SIG_FORS sig_fors = sig_forsArrSign[i16];
            bArr4[i18] = Arrays.concatenate(sig_fors.f149588sk, Arrays.concatenate(sig_fors.authPath));
            i16 = i18;
        }
        bArr4[length + 1] = bArrSign;
        return Arrays.concatenate(bArr4);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!z15) {
            this.pubKey = (SPHINCSPlusPublicKeyParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.privKey = (SPHINCSPlusPrivateKeyParameters) cipherParameters;
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (SPHINCSPlusPrivateKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        SPHINCSPlusEngine engine = this.pubKey.getParameters().getEngine();
        engine.init(this.pubKey.getSeed());
        ADRS adrs = new ADRS();
        SIG sig = new SIG(engine.N, engine.K, engine.A, engine.D, engine.H_PRIME, engine.WOTS_LEN, bArr2);
        byte[] r15 = sig.getR();
        SIG_FORS[] sig_fors = sig.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig.getSIG_HT();
        IndexedDigest indexedDigestH_msg = engine.H_msg(r15, this.pubKey.getSeed(), this.pubKey.getRoot(), bArr);
        byte[] bArr3 = indexedDigestH_msg.digest;
        long j15 = indexedDigestH_msg.idx_tree;
        int i15 = indexedDigestH_msg.idx_leaf;
        adrs.setTypeAndClear(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j15);
        adrs.setKeyPairAddress(i15);
        byte[] bArrPkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr3, this.pubKey.getSeed(), adrs);
        adrs.setTypeAndClear(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j15);
        adrs.setKeyPairAddress(i15);
        return new HT(engine, null, this.pubKey.getSeed()).verify(bArrPkFromSig, sig_ht, this.pubKey.getSeed(), j15, i15, this.pubKey.getRoot());
    }
}
