package org.bouncycastle.operator.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.operator.DefaultSignatureNameFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
class OperatorHelper {
    private static final Map asymmetricWrapperAlgNames;
    private static final Map oaepParamsMap;
    private static final Map oids;
    private static DefaultSignatureNameFinder sigFinder;
    private static final Map symmetricKeyAlgNames;
    private static final Map symmetricWrapperAlgNames;
    private static final Map symmetricWrapperKeySizes;
    private JcaJceHelper helper;

    private static class OAEPParamsValue {
        private String cipherName;
        private byte[] derEncoding;

        private OAEPParamsValue(String str, byte[] bArr) {
            this.cipherName = str;
            this.derEncoding = bArr;
        }

        static void add(Map map, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            try {
                map.put(aSN1ObjectIdentifier, new OAEPParamsValue(str, getDEREncoding(createOAEPParams(aSN1ObjectIdentifier))));
            } catch (Exception e15) {
                throw new RuntimeException(e15);
            }
        }

        private static RSAESOAEPparams createOAEPParams(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
            return new RSAESOAEPparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), RSAESOAEPparams.DEFAULT_P_SOURCE_ALGORITHM);
        }

        private static byte[] getDEREncoding(RSAESOAEPparams rSAESOAEPparams) {
            return rSAESOAEPparams.getEncoded(ASN1Encoding.DER);
        }

        String getCipherName() {
            return this.cipherName;
        }

        boolean matches(RSAESOAEPparams rSAESOAEPparams) {
            return Arrays.areEqual(this.derEncoding, getDEREncoding(rSAESOAEPparams));
        }
    }

    private static class OpCertificateException extends CertificateException {
        private Throwable cause;

        public OpCertificateException(String str, Throwable th4) {
            super(str);
            this.cause = th4;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    static {
        HashMap map = new HashMap();
        oids = map;
        HashMap map2 = new HashMap();
        asymmetricWrapperAlgNames = map2;
        HashMap map3 = new HashMap();
        symmetricWrapperAlgNames = map3;
        HashMap map4 = new HashMap();
        symmetricKeyAlgNames = map4;
        HashMap map5 = new HashMap();
        symmetricWrapperKeySizes = map5;
        HashMap map6 = new HashMap();
        oaepParamsMap = map6;
        sigFinder = new DefaultSignatureNameFinder();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
        map.put(aSN1ObjectIdentifier, "SHA1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha224;
        map.put(aSN1ObjectIdentifier2, "SHA224");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha256;
        map.put(aSN1ObjectIdentifier3, "SHA256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha384;
        map.put(aSN1ObjectIdentifier4, "SHA384");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha512;
        map.put(aSN1ObjectIdentifier5, "SHA512");
        map.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        map2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        map2.put(OIWObjectIdentifiers.elGamalAlgorithm, "Elgamal/ECB/PKCS1Padding");
        map2.put(PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA/ECB/OAEPPadding");
        map2.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        map3.put(aSN1ObjectIdentifier6, "DESEDEWrap");
        map3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2Wrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_wrap;
        map3.put(aSN1ObjectIdentifier7, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_wrap;
        map3.put(aSN1ObjectIdentifier8, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_wrap;
        map3.put(aSN1ObjectIdentifier9, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NTTObjectIdentifiers.id_camellia128_wrap;
        map3.put(aSN1ObjectIdentifier10, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NTTObjectIdentifiers.id_camellia192_wrap;
        map3.put(aSN1ObjectIdentifier11, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NTTObjectIdentifiers.id_camellia256_wrap;
        map3.put(aSN1ObjectIdentifier12, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        map3.put(aSN1ObjectIdentifier13, "SEEDWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = PKCSObjectIdentifiers.des_EDE3_CBC;
        map3.put(aSN1ObjectIdentifier14, "DESede");
        map5.put(aSN1ObjectIdentifier6, Integers.valueOf(192));
        map5.put(aSN1ObjectIdentifier7, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier8, Integers.valueOf(192));
        map5.put(aSN1ObjectIdentifier9, Integers.valueOf(256));
        map5.put(aSN1ObjectIdentifier10, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier11, Integers.valueOf(192));
        map5.put(aSN1ObjectIdentifier12, Integers.valueOf(256));
        map5.put(aSN1ObjectIdentifier13, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier14, Integers.valueOf(192));
        map4.put(NISTObjectIdentifiers.aes, "AES");
        map4.put(NISTObjectIdentifiers.id_aes128_CBC, "AES");
        map4.put(NISTObjectIdentifiers.id_aes192_CBC, "AES");
        map4.put(NISTObjectIdentifiers.id_aes256_CBC, "AES");
        map4.put(aSN1ObjectIdentifier14, "DESede");
        map4.put(PKCSObjectIdentifiers.RC2_CBC, "RC2");
        OAEPParamsValue.add(map6, "RSA/ECB/OAEPWithSHA-1AndMGF1Padding", aSN1ObjectIdentifier);
        OAEPParamsValue.add(map6, "RSA/ECB/OAEPWithSHA-224AndMGF1Padding", aSN1ObjectIdentifier2);
        OAEPParamsValue.add(map6, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding", aSN1ObjectIdentifier3);
        OAEPParamsValue.add(map6, "RSA/ECB/OAEPWithSHA-384AndMGF1Padding", aSN1ObjectIdentifier4);
        OAEPParamsValue.add(map6, "RSA/ECB/OAEPWithSHA-512AndMGF1Padding", aSN1ObjectIdentifier5);
    }

    OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int iIndexOf = digestName.indexOf(45);
        if (iIndexOf <= 0 || digestName.startsWith("SHA3")) {
            return digestName;
        }
        return digestName.substring(0, iIndexOf) + digestName.substring(iIndexOf + 1);
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        return sigFinder.getAlgorithmName(algorithmIdentifier);
    }

    private boolean notDefaultPSSParams(ASN1Sequence aSN1Sequence) throws NoSuchAlgorithmException {
        if (aSN1Sequence != null && aSN1Sequence.size() != 0) {
            RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(aSN1Sequence);
            if (!rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1) || !rSASSAPSSparams.getHashAlgorithm().equals(AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()))) {
                return true;
            }
            if (rSASSAPSSparams.getSaltLength().intValue() != createDigest(rSASSAPSSparams.getHashAlgorithm()).getDigestLength()) {
                return true;
            }
        }
        return false;
    }

    public X509Certificate convertCertificate(X509CertificateHolder x509CertificateHolder) throws OpCertificateException {
        try {
            return (X509Certificate) this.helper.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e15) {
            throw new OpCertificateException("cannot get encoded form of certificate: " + e15.getMessage(), e15);
        } catch (NoSuchProviderException e16) {
            throw new OpCertificateException("cannot find factory provider: " + e16.getMessage(), e16);
        }
    }

    public PublicKey convertPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws OperatorCreationException {
        try {
            return this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (IOException e15) {
            throw new OperatorCreationException("cannot get encoded form of key: " + e15.getMessage(), e15);
        } catch (NoSuchAlgorithmException e16) {
            throw new OperatorCreationException("cannot create key factory: " + e16.getMessage(), e16);
        } catch (NoSuchProviderException e17) {
            throw new OperatorCreationException("cannot find factory provider: " + e17.getMessage(), e17);
        } catch (InvalidKeySpecException e18) {
            throw new OperatorCreationException("cannot create key factory: " + e18.getMessage(), e18);
        }
    }

    AlgorithmParameters createAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
        AlgorithmParameters algorithmParametersCreateAlgorithmParameters;
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.rsaEncryption)) {
            return null;
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSAES_OAEP)) {
            try {
                algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("OAEP");
            } catch (NoSuchAlgorithmException unused) {
                algorithmParametersCreateAlgorithmParameters = null;
            } catch (NoSuchProviderException e15) {
                throw new OperatorCreationException("cannot create algorithm parameters: " + e15.getMessage(), e15);
            }
        } else {
            algorithmParametersCreateAlgorithmParameters = null;
        }
        if (algorithmParametersCreateAlgorithmParameters == null) {
            try {
                algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm().getId());
            } catch (NoSuchAlgorithmException unused2) {
                return null;
            } catch (NoSuchProviderException e16) {
                throw new OperatorCreationException("cannot create algorithm parameters: " + e16.getMessage(), e16);
            }
        }
        try {
            algorithmParametersCreateAlgorithmParameters.init(algorithmIdentifier.getParameters().toASN1Primitive().getEncoded());
            return algorithmParametersCreateAlgorithmParameters;
        } catch (IOException e17) {
            throw new OperatorCreationException("cannot initialise algorithm parameters: " + e17.getMessage(), e17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    Cipher createAsymmetricWrapper(AlgorithmIdentifier algorithmIdentifier, Map map) throws OperatorCreationException {
        String cipherName;
        if (algorithmIdentifier == null) {
            throw new NullPointerException("'algorithmID' cannot be null");
        }
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    cipherName = null;
                } else {
                    cipherName = (String) map.get(algorithm);
                }
            } catch (GeneralSecurityException e15) {
                throw new OperatorCreationException("cannot create cipher: " + e15.getMessage(), e15);
            }
        } else {
            cipherName = null;
        }
        if (cipherName == null) {
            cipherName = (String) asymmetricWrapperAlgNames.get(algorithm);
        }
        if (cipherName != null) {
            if (cipherName.indexOf("OAEPPadding") > 0) {
                try {
                    RSAESOAEPparams rSAESOAEPparams = RSAESOAEPparams.getInstance(algorithmIdentifier.getParameters());
                    if (rSAESOAEPparams != null) {
                        OAEPParamsValue oAEPParamsValue = (OAEPParamsValue) oaepParamsMap.get(rSAESOAEPparams.getHashAlgorithm().getAlgorithm());
                        if (oAEPParamsValue != null && oAEPParamsValue.matches(rSAESOAEPparams.withDefaultPSource())) {
                            cipherName = oAEPParamsValue.getCipherName();
                        }
                    }
                } catch (Exception unused) {
                }
            }
            try {
                return this.helper.createCipher(cipherName);
            } catch (NoSuchAlgorithmException unused2) {
                try {
                    if (cipherName.equals("RSA/ECB/PKCS1Padding")) {
                        return this.helper.createCipher("RSA/NONE/PKCS1Padding");
                    }
                    if (cipherName.indexOf("ECB/OAEPWith") > 0) {
                        int iIndexOf = cipherName.indexOf("ECB");
                        return this.helper.createCipher(cipherName.substring(0, iIndexOf) + "NONE" + cipherName.substring(iIndexOf + 3));
                    }
                } catch (NoSuchAlgorithmException unused3) {
                }
            }
        }
        return this.helper.createCipher(algorithm.getId());
    }

    Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e15) {
            throw new OperatorCreationException("cannot create cipher: " + e15.getMessage(), e15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.security.MessageDigest] */
    MessageDigest createDigest(AlgorithmIdentifier algorithmIdentifier) throws NoSuchAlgorithmException {
        JcaJceHelper jcaJceHelper;
        String digestName;
        StringBuilder sb5;
        try {
            if (!algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len)) {
                if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128_len)) {
                    jcaJceHelper = this.helper;
                    sb5 = new StringBuilder();
                    sb5.append("SHAKE128-");
                    sb5.append(ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue());
                } else {
                    jcaJceHelper = this.helper;
                    digestName = MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm());
                }
                algorithmIdentifier = jcaJceHelper.createMessageDigest(digestName);
                return algorithmIdentifier;
            }
            jcaJceHelper = this.helper;
            sb5 = new StringBuilder();
            sb5.append("SHAKE256-");
            sb5.append(ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue());
            digestName = sb5.toString();
            algorithmIdentifier = jcaJceHelper.createMessageDigest(digestName);
            return algorithmIdentifier;
        } catch (NoSuchAlgorithmException e15) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e15;
            }
            return this.helper.createMessageDigest((String) map.get(algorithmIdentifier.getAlgorithm()));
        }
    }

    KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            return this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e15) {
            throw new OperatorCreationException("cannot create key agreement: " + e15.getMessage(), e15);
        }
    }

    KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            return this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e15) {
            throw new CMSException("cannot create key agreement: " + e15.getMessage(), e15);
        }
    }

    Signature createRawSignature(AlgorithmIdentifier algorithmIdentifier) {
        try {
            String signatureName = getSignatureName(algorithmIdentifier);
            String str = "NONE" + signatureName.substring(signatureName.indexOf("WITH"));
            Signature signatureCreateSignature = this.helper.createSignature(str);
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                AlgorithmParametersUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, algorithmIdentifier.getParameters());
                signatureCreateSignature.setParameter((PSSParameterSpec) algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
            }
            return signatureCreateSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    Signature createSignature(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        Signature signatureCreateSignature;
        String signatureName = getSignatureName(algorithmIdentifier);
        try {
            signatureCreateSignature = this.helper.createSignature(signatureName);
        } catch (NoSuchAlgorithmException e15) {
            if (!signatureName.endsWith("WITHRSAANDMGF1")) {
                throw e15;
            }
            signatureCreateSignature = this.helper.createSignature(signatureName.substring(0, signatureName.indexOf(87)) + "WITHRSASSA-PSS");
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
            if (notDefaultPSSParams(aSN1Sequence)) {
                try {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("PSS");
                    algorithmParametersCreateAlgorithmParameters.init(aSN1Sequence.getEncoded());
                    signatureCreateSignature.setParameter(algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (IOException e16) {
                    throw new GeneralSecurityException("unable to process PSS parameters: " + e16.getMessage());
                }
            }
        }
        return signatureCreateSignature;
    }

    Cipher createSymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e15) {
            throw new OperatorCreationException("cannot create cipher: " + e15.getMessage(), e15);
        }
    }

    String getKeyAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    int getKeySizeInBits(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ((Integer) symmetricWrapperKeySizes.get(aSN1ObjectIdentifier)).intValue();
    }

    String getWrappingAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
    }
}
