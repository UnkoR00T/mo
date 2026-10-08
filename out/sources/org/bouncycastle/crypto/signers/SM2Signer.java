package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class SM2Signer implements Signer, ECConstants {
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private final DSAEncoding encoding;
    private final DSAKCalculator kCalculator;
    private ECPoint pubPoint;
    private int state;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f149209z;

    private static final class State {
        static final int DATA = 2;
        static final int INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public SM2Signer() {
        this(StandardDSAEncoding.INSTANCE, new SM3Digest());
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    private void addUserID(Digest digest, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) (length >>> 8));
        digest.update((byte) length);
        digest.update(bArr, 0, bArr.length);
    }

    private void checkData() {
        int i15 = this.state;
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("SM2Signer needs to be initialized");
            }
        } else {
            Digest digest = this.digest;
            byte[] bArr = this.f149209z;
            digest.update(bArr, 0, bArr.length);
            this.state = 2;
        }
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] getZ(byte[] bArr) {
        addUserID(this.digest, bArr);
        addFieldElement(this.digest, this.ecParams.getCurve().getA());
        addFieldElement(this.digest, this.ecParams.getCurve().getB());
        addFieldElement(this.digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(this.digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineXCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineYCoord());
        return digestDoFinal();
    }

    private boolean verifySignature(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n15 = this.ecParams.getN();
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n15) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n15) >= 0) {
            return false;
        }
        BigInteger bigIntegerCalculateE = calculateE(n15, digestDoFinal());
        BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(n15);
        if (bigIntegerMod.equals(ECConstants.ZERO)) {
            return false;
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(this.ecParams.getG(), bigInteger2, ((ECPublicKeyParameters) this.ecKey).getQ(), bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return bigIntegerCalculateE.add(eCPointNormalize.getAffineXCoord().toBigInteger()).mod(n15).equals(bigInteger);
    }

    protected BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        checkData();
        byte[] bArrDigestDoFinal = digestDoFinal();
        BigInteger n15 = this.ecParams.getN();
        BigInteger bigIntegerCalculateE = calculateE(n15, bArrDigestDoFinal);
        BigInteger d15 = ((ECPrivateKeyParameters) this.ecKey).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = bigIntegerCalculateE.add(eCMultiplierCreateBasePointMultiplier.multiply(this.ecParams.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger()).mod(n15);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger) && !bigIntegerMod.add(bigIntegerNextK).equals(n15)) {
                BigInteger bigIntegerMod2 = BigIntegers.modOddInverse(n15, d15.add(ECConstants.ONE)).multiply(bigIntegerNextK.subtract(bigIntegerMod.multiply(d15)).mod(n15)).mod(n15);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    try {
                        try {
                            byte[] bArrEncode = this.encoding.encode(this.ecParams.getN(), bigIntegerMod, bigIntegerMod2);
                            reset();
                            return bArrEncode;
                        } catch (Exception e15) {
                            throw new CryptoException("unable to encode signature: " + e15.getMessage(), e15);
                        }
                    } catch (Throwable th4) {
                        reset();
                        throw th4;
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z15, CipherParameters cipherParameters) {
        byte[] bArrDecodeStrict;
        ECPoint q15;
        SecureRandom random;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            CipherParameters parameters = parametersWithID.getParameters();
            byte[] id5 = parametersWithID.getID();
            if (id5.length >= 8192) {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
            bArrDecodeStrict = id5;
            cipherParameters = parameters;
        } else {
            bArrDecodeStrict = Hex.decodeStrict("31323334353637383132333435363738");
        }
        if (z15) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                CipherParameters parameters2 = parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
                cipherParameters = parameters2;
            } else {
                random = null;
            }
            ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) cipherParameters;
            this.ecKey = eCPrivateKeyParameters;
            this.ecParams = eCPrivateKeyParameters.getParameters();
            BigInteger d15 = eCPrivateKeyParameters.getD();
            BigInteger n15 = this.ecParams.getN();
            BigInteger bigInteger = ECConstants.ONE;
            if (d15.compareTo(bigInteger) < 0 || d15.compareTo(n15.subtract(bigInteger)) >= 0) {
                throw new IllegalArgumentException("SM2 private key out of range");
            }
            this.kCalculator.init(n15, CryptoServicesRegistrar.getSecureRandom(random));
            q15 = createBasePointMultiplier().multiply(this.ecParams.getG(), d15).normalize();
        } else {
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
            this.ecKey = eCPublicKeyParameters;
            this.ecParams = eCPublicKeyParameters.getParameters();
            q15 = eCPublicKeyParameters.getQ();
        }
        this.pubPoint = q15;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECNR", this.ecKey, z15));
        this.digest.reset();
        this.f149209z = getZ(bArrDecodeStrict);
        this.state = 1;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        int i15 = this.state;
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("SM2Signer needs to be initialized");
            }
            this.digest.reset();
            this.state = 1;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b15) {
        checkData();
        this.digest.update(b15);
    }

    public SM2Signer(Digest digest) {
        this(StandardDSAEncoding.INSTANCE, digest);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i15, int i16) {
        checkData();
        this.digest.update(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        checkData();
        try {
            BigInteger[] bigIntegerArrDecode = this.encoding.decode(this.ecParams.getN(), bArr);
            return verifySignature(bigIntegerArrDecode[0], bigIntegerArrDecode[1]);
        } catch (Exception unused) {
            return false;
        } finally {
            reset();
        }
    }

    public SM2Signer(DSAEncoding dSAEncoding) {
        this.kCalculator = new RandomDSAKCalculator();
        this.state = 0;
        this.encoding = dSAEncoding;
        this.digest = new SM3Digest();
    }

    public SM2Signer(DSAEncoding dSAEncoding, Digest digest) {
        this.kCalculator = new RandomDSAKCalculator();
        this.state = 0;
        this.encoding = dSAEncoding;
        this.digest = digest;
    }
}
