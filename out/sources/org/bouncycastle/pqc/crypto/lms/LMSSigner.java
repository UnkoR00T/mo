package org.bouncycastle.pqc.crypto.lms;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* JADX INFO: loaded from: classes5.dex */
public class LMSSigner implements MessageSigner {
    private LMSPrivateKeyParameters privKey;
    private LMSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return LMS.generateSign(this.privKey, bArr).getEncoded();
        } catch (IOException e15) {
            throw new IllegalStateException("unable to encode signature: " + e15.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (z15) {
            if (!(cipherParameters instanceof HSSPrivateKeyParameters)) {
                this.privKey = (LMSPrivateKeyParameters) cipherParameters;
                return;
            }
            HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) cipherParameters;
            if (hSSPrivateKeyParameters.getL() != 1) {
                throw new IllegalArgumentException("only a single level HSS key can be used with LMS");
            }
            this.privKey = hSSPrivateKeyParameters.getRootKey();
            return;
        }
        if (!(cipherParameters instanceof HSSPublicKeyParameters)) {
            this.pubKey = (LMSPublicKeyParameters) cipherParameters;
            return;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) cipherParameters;
        if (hSSPublicKeyParameters.getL() != 1) {
            throw new IllegalArgumentException("only a single level HSS key can be used with LMS");
        }
        this.pubKey = hSSPublicKeyParameters.getLMSPublicKey();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            return LMS.verifySignature(this.pubKey, LMSSignature.getInstance(bArr2), bArr);
        } catch (IOException e15) {
            throw new IllegalStateException("unable to decode signature: " + e15.getMessage());
        }
    }
}
