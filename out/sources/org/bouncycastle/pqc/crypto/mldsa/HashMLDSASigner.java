package org.bouncycastle.pqc.crypto.mldsa;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;

/* JADX INFO: loaded from: classes5.dex */
public class HashMLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private Digest digest;
    private byte[] digestOIDEncoding;
    private MLDSAEngine engine;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    private static Digest createDigest(MLDSAParameters mLDSAParameters) {
        int type = mLDSAParameters.getType();
        if (type == 0 || type == 1) {
            return new SHA512Digest();
        }
        throw new IllegalArgumentException("unknown parameters type");
    }

    private SHAKEDigest finishPreHash() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        SHAKEDigest shake256Digest = this.engine.getShake256Digest();
        byte[] bArr2 = this.digestOIDEncoding;
        shake256Digest.update(bArr2, 0, bArr2.length);
        shake256Digest.update(bArr, 0, digestSize);
        return shake256Digest;
    }

    private void initDigest(MLDSAParameters mLDSAParameters) {
        Digest digestCreateDigest = createDigest(mLDSAParameters);
        this.digest = digestCreateDigest;
        try {
            this.digestOIDEncoding = DigestUtils.getDigestOid(digestCreateDigest.getAlgorithmName()).getEncoded(ASN1Encoding.DER);
        } catch (IOException e15) {
            throw new IllegalStateException("oid encoding failed: " + e15.getMessage());
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        SHAKEDigest sHAKEDigestFinishPreHash = finishPreHash();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        byte[] bArrGenerateMu = this.engine.generateMu(sHAKEDigestFinishPreHash);
        MLDSAEngine mLDSAEngine = this.engine;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return mLDSAEngine.generateSignature(bArrGenerateMu, sHAKEDigestFinishPreHash, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.f149502k, mLDSAPrivateKeyParameters.f149505t0, mLDSAPrivateKeyParameters.f149503s1, mLDSAPrivateKeyParameters.f149504s2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z15, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        byte[] context = EMPTY_CONTEXT;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            context = parametersWithContext.getContext();
            cipherParameters = parametersWithContext.getParameters();
            if (context.length > 255) {
                throw new IllegalArgumentException("context too long");
            }
        }
        if (z15) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (MLDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (MLDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
            MLDSAEngine engine = parameters.getEngine(this.random);
            this.engine = engine;
            engine.initSign(this.privKey.f149507tr, true, context);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            MLDSAEngine engine2 = parameters.getEngine(null);
            this.engine = engine2;
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
            engine2.initVerify(mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.f149508t1, true, context);
        }
        initDigest(parameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b15) {
        this.digest.update(b15);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        SHAKEDigest sHAKEDigestFinishPreHash = finishPreHash();
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr.length;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        return mLDSAEngine.verifyInternal(bArr, length, sHAKEDigestFinishPreHash, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f149508t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i15, int i16) {
        this.digest.update(bArr, i15, i16);
    }
}
