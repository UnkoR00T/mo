package org.bouncycastle.operator.bc;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSSigner;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSSigner;

/* JADX INFO: loaded from: classes5.dex */
public class BcHssLmsContentSignerBuilder extends BcContentSignerBuilder {
    private static final AlgorithmIdentifier sigAlgId = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);

    static class HssSigner implements Signer {
        private MessageSigner signer;
        private final ByteArrayOutputStream stream = new ByteArrayOutputStream();

        @Override // org.bouncycastle.crypto.Signer
        public byte[] generateSignature() {
            byte[] byteArray = this.stream.toByteArray();
            this.stream.reset();
            return this.signer.generateSignature(byteArray);
        }

        @Override // org.bouncycastle.crypto.Signer
        public void init(boolean z15, CipherParameters cipherParameters) {
            MessageSigner hSSSigner;
            if ((cipherParameters instanceof HSSPublicKeyParameters) || (cipherParameters instanceof HSSPrivateKeyParameters)) {
                hSSSigner = new HSSSigner();
            } else {
                if (!(cipherParameters instanceof LMSPublicKeyParameters) && !(cipherParameters instanceof LMSPrivateKeyParameters)) {
                    throw new IllegalArgumentException("Incorrect Key Parameters");
                }
                hSSSigner = new LMSSigner();
            }
            this.signer = hSSSigner;
            this.signer.init(z15, cipherParameters);
        }

        @Override // org.bouncycastle.crypto.Signer
        public void reset() {
            this.stream.reset();
        }

        @Override // org.bouncycastle.crypto.Signer
        public void update(byte b15) {
            this.stream.write(b15);
        }

        @Override // org.bouncycastle.crypto.Signer
        public boolean verifySignature(byte[] bArr) {
            byte[] byteArray = this.stream.toByteArray();
            this.stream.reset();
            return this.signer.verifySignature(byteArray, bArr);
        }

        @Override // org.bouncycastle.crypto.Signer
        public void update(byte[] bArr, int i15, int i16) {
            this.stream.write(bArr, i15, i16);
        }
    }

    public BcHssLmsContentSignerBuilder() {
        super(sigAlgId, null);
    }

    @Override // org.bouncycastle.operator.bc.BcContentSignerBuilder
    protected Signer createSigner(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        return new HssSigner();
    }
}
