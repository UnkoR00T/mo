package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.MLDSAProxyPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSASigner;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    protected MLDSAParameters parameters;
    protected MLDSASigner signer;

    public static class MLDSA extends SignatureSpi {
        public MLDSA() {
            super(new MLDSASigner());
        }
    }

    public static class MLDSA44 extends SignatureSpi {
        public MLDSA44() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_44);
        }
    }

    public static class MLDSA65 extends SignatureSpi {
        public MLDSA65() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_65);
        }
    }

    public static class MLDSA87 extends SignatureSpi {
        public MLDSA87() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_87);
        }
    }

    public static class MLDSACalcMu extends SignatureSpi {
        public MLDSACalcMu() {
            super(new MLDSASigner());
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        protected byte[] engineSign() throws SignatureException {
            try {
                return this.signer.generateMu();
            } catch (Exception e15) {
                throw new SignatureException(e15.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        protected boolean engineVerify(byte[] bArr) {
            return this.signer.verifyMu(bArr);
        }
    }

    public static class MLDSAExtMu extends SignatureSpi {
        private ByteArrayOutputStream bOut;

        public MLDSAExtMu() {
            super(new MLDSASigner());
            this.bOut = new ByteArrayOutputStream(64);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        protected byte[] engineSign() throws SignatureException {
            try {
                byte[] byteArray = this.bOut.toByteArray();
                this.bOut.reset();
                return this.signer.generateMuSignature(byteArray);
            } catch (DataLengthException e15) {
                throw new SignatureException(e15.getMessage());
            } catch (Exception e16) {
                throw new SignatureException(e16.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        protected boolean engineVerify(byte[] bArr) throws SignatureException {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            try {
                return this.signer.verifyMuSignature(byteArray, bArr);
            } catch (DataLengthException e15) {
                throw new SignatureException(e15.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        protected void updateEngine(byte b15) {
            this.bOut.write(b15);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        protected void updateEngine(byte[] bArr, int i15, int i16) {
            this.bOut.write(bArr, i15, i16);
        }
    }

    protected SignatureSpi(MLDSASigner mLDSASigner) {
        super("MLDSA");
        this.signer = mLDSASigner;
        this.parameters = null;
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.signer.generateSignature();
        } catch (Exception e15) {
            throw new SignatureException(e15.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.signer.verifySignature(bArr);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void reInitialize(boolean z15, CipherParameters cipherParameters) {
        this.signer.init(z15, cipherParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        if (privateKey instanceof BCMLDSAPrivateKey) {
            BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) privateKey;
            this.keyParams = bCMLDSAPrivateKey.getKeyParams();
            MLDSAParameters mLDSAParameters = this.parameters;
            if (mLDSAParameters != null) {
                String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
                if (name.equals(bCMLDSAPrivateKey.getAlgorithm())) {
                    return;
                }
                throw new InvalidKeyException("signature configured for " + name);
            }
            return;
        }
        if (!(privateKey instanceof MLDSAProxyPrivateKey) || !(this instanceof MLDSACalcMu)) {
            throw new InvalidKeyException("unknown private key passed to ML-DSA");
        }
        MLDSAPublicKey publicKey = ((MLDSAProxyPrivateKey) privateKey).getPublicKey();
        try {
            this.keyParams = PublicKeyFactory.createKey(publicKey.getEncoded());
            MLDSAParameters mLDSAParameters2 = this.parameters;
            if (mLDSAParameters2 != null) {
                String name2 = MLDSAParameterSpec.fromName(mLDSAParameters2.getName()).getName();
                if (name2.equals(publicKey.getAlgorithm())) {
                    return;
                }
                throw new InvalidKeyException("signature configured for " + name2);
            }
        } catch (IOException e15) {
            throw new InvalidKeyException(e15.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void updateEngine(byte b15) {
        this.signer.update(b15);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCMLDSAPublicKey) {
            this.keyParams = ((BCMLDSAPublicKey) publicKey).getKeyParams();
        } else {
            try {
                AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
                this.keyParams = asymmetricKeyParameterCreateKey;
                publicKey = new BCMLDSAPublicKey((MLDSAPublicKeyParameters) asymmetricKeyParameterCreateKey);
            } catch (Exception unused) {
                throw new InvalidKeyException("unknown public key passed to ML-DSA");
            }
        }
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (name.equals(publicKey.getAlgorithm())) {
                return;
            }
            throw new InvalidKeyException("signature configured for " + name);
        }
    }

    protected SignatureSpi(MLDSASigner mLDSASigner, MLDSAParameters mLDSAParameters) {
        super(MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName());
        this.signer = mLDSASigner;
        this.parameters = mLDSAParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void updateEngine(byte[] bArr, int i15, int i16) {
        this.signer.update(bArr, i15, i16);
    }
}
