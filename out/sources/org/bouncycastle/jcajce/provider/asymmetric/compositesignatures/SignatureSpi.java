package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.interfaces.BCKey;
import org.bouncycastle.jcajce.spec.CompositeSignatureSpec;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final String ML_DSA_44 = "ML-DSA-44";
    private static final String ML_DSA_65 = "ML-DSA-65";
    private static final String ML_DSA_87 = "ML-DSA-87";
    private static final HashMap<ASN1ObjectIdentifier, AlgorithmParameterSpec> algorithmsParameterSpecs;
    private static final Map<String, String> canonicalNames;
    private static final HashMap<ASN1ObjectIdentifier, byte[]> domainSeparators;
    private static final byte[] prefix = Hex.decode("436f6d706f73697465416c676f726974686d5369676e61747572657332303235");
    private ASN1ObjectIdentifier algorithm;
    private String[] algs;
    private Digest baseDigest;
    private Signature[] componentSignatures;
    private Key compositeKey;
    private ContextParameterSpec contextSpec;
    private byte[] domain;
    private AlgorithmParameters engineParams;
    private JcaJceHelper helper;
    private final boolean isPrehash;
    private Digest preHashDigest;
    private final SecureRandom random;
    private boolean unprimed;

    public static final class COMPOSITE extends SignatureSpi {
        public COMPOSITE() {
            super(null, null, false);
        }
    }

    private static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256 extends SignatureSpi {
        public MLDSA44_ECDSA_P256_SHA256() {
            super(IANAObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256, new SHA256Digest());
        }
    }

    public static final class MLDSA44_ECDSA_P256_SHA256_PREHASH extends SignatureSpi {
        public MLDSA44_ECDSA_P256_SHA256_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256, new SHA256Digest(), true);
        }
    }

    public static final class MLDSA44_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA44_Ed25519_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA44_Ed25519_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA44_Ed25519_SHA512_PREHASH extends SignatureSpi {
        public MLDSA44_Ed25519_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA44_Ed25519_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256() {
            super(IANAObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256, new SHA256Digest());
        }
    }

    public static final class MLDSA44_RSA2048_PKCS15_SHA256_PREHASH extends SignatureSpi {
        public MLDSA44_RSA2048_PKCS15_SHA256_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256, new SHA256Digest(), true);
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256 extends SignatureSpi {
        public MLDSA44_RSA2048_PSS_SHA256() {
            super(IANAObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256, new SHA256Digest());
        }
    }

    public static final class MLDSA44_RSA2048_PSS_SHA256_PREHASH extends SignatureSpi {
        public MLDSA44_RSA2048_PSS_SHA256_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256, new SHA256Digest(), true);
        }
    }

    public static final class MLDSA65_ECDSA_P256_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_P256_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_ECDSA_P256_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_ECDSA_P256_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_P384_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_ECDSA_P384_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_ECDSA_P384_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512 extends SignatureSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_ECDSA_brainpoolP256r1_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_ECDSA_brainpoolP256r1_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_Ed25519_SHA512 extends SignatureSpi {
        public MLDSA65_Ed25519_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_Ed25519_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_Ed25519_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_Ed25519_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_Ed25519_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA512 extends SignatureSpi {
        public MLDSA65_RSA3072_PKCS15_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_RSA3072_PKCS15_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA3072_PKCS15_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA512 extends SignatureSpi {
        public MLDSA65_RSA3072_PSS_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_RSA3072_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA3072_PSS_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA512 extends SignatureSpi {
        public MLDSA65_RSA4096_PKCS15_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_RSA4096_PKCS15_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA4096_PKCS15_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA512 extends SignatureSpi {
        public MLDSA65_RSA4096_PSS_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA65_RSA4096_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA65_RSA4096_PSS_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_P384_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA87_ECDSA_P384_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_ECDSA_P384_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA87_ECDSA_P521_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_P521_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA87_ECDSA_P521_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA87_ECDSA_P521_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_ECDSA_P521_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA87_ECDSA_P521_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512 extends SignatureSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA87_ECDSA_brainpoolP384r1_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_ECDSA_brainpoolP384r1_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA87_Ed448_SHAKE256 extends SignatureSpi {
        public MLDSA87_Ed448_SHAKE256() {
            super(IANAObjectIdentifiers.id_MLDSA87_Ed448_SHAKE256, new SHAKEDigest(256));
        }
    }

    public static final class MLDSA87_Ed448_SHAKE256_PREHASH extends SignatureSpi {
        public MLDSA87_Ed448_SHAKE256_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA87_Ed448_SHAKE256, new SHAKEDigest(256), true);
        }
    }

    public static final class MLDSA87_RSA3072_PSS_SHA512 extends SignatureSpi {
        public MLDSA87_RSA3072_PSS_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA87_RSA3072_PSS_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA87_RSA3072_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_RSA3072_PSS_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA87_RSA3072_PSS_SHA512, new SHA512Digest(), true);
        }
    }

    public static final class MLDSA87_RSA4096_PSS_SHA512 extends SignatureSpi {
        public MLDSA87_RSA4096_PSS_SHA512() {
            super(IANAObjectIdentifiers.id_MLDSA87_RSA4096_PSS_SHA512, new SHA512Digest());
        }
    }

    public static final class MLDSA87_RSA4096_PSS_SHA512_PREHASH extends SignatureSpi {
        public MLDSA87_RSA4096_PSS_SHA512_PREHASH() {
            super(IANAObjectIdentifiers.id_MLDSA87_RSA4096_PSS_SHA512, new SHA512Digest(), true);
        }
    }

    private static class NullDigest implements Digest {
        private final OpenByteArrayOutputStream bOut = new OpenByteArrayOutputStream();
        private final int expectedSize;

        private static class OpenByteArrayOutputStream extends ByteArrayOutputStream {
            private OpenByteArrayOutputStream() {
            }

            void copy(byte[] bArr, int i15) {
                System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i15, size());
            }

            @Override // java.io.ByteArrayOutputStream
            public void reset() {
                super.reset();
                Arrays.clear(((ByteArrayOutputStream) this).buf);
            }
        }

        NullDigest(int i15) {
            this.expectedSize = i15;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i15) {
            int size = this.bOut.size();
            if (size != this.expectedSize) {
                throw new IllegalStateException("provided pre-hash digest is the wrong length");
            }
            this.bOut.copy(bArr, i15);
            reset();
            return size;
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "NULL";
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.bOut.size();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.bOut.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b15) throws IOException {
            this.bOut.write(b15);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i15, int i16) throws IOException {
            this.bOut.write(bArr, i15, i16);
        }
    }

    static {
        HashMap map = new HashMap();
        canonicalNames = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        domainSeparators = linkedHashMap;
        HashMap<ASN1ObjectIdentifier, AlgorithmParameterSpec> map2 = new HashMap<>();
        algorithmsParameterSpecs = map2;
        map.put("MLDSA44", ML_DSA_44);
        map.put("MLDSA65", ML_DSA_65);
        map.put("MLDSA87", ML_DSA_87);
        map.put(NISTObjectIdentifiers.id_ml_dsa_44.getId(), ML_DSA_44);
        map.put(NISTObjectIdentifiers.id_ml_dsa_65.getId(), ML_DSA_65);
        map.put(NISTObjectIdentifiers.id_ml_dsa_87.getId(), ML_DSA_87);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = IANAObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256;
        linkedHashMap.put(aSN1ObjectIdentifier, Hex.decode("434f4d505349472d4d4c44534134342d525341323034382d5053532d534841323536"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256, Hex.decode("434f4d505349472d4d4c44534134342d525341323034382d504b435331352d534841323536"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA44_Ed25519_SHA512, Hex.decode("434f4d505349472d4d4c44534134342d456432353531392d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256, Hex.decode("434f4d505349472d4d4c44534134342d45434453412d503235362d534841323536"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = IANAObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512;
        linkedHashMap.put(aSN1ObjectIdentifier2, Hex.decode("434f4d505349472d4d4c44534136352d525341333037322d5053532d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512, Hex.decode("434f4d505349472d4d4c44534136352d525341333037322d504b435331352d534841353132"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = IANAObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA512;
        linkedHashMap.put(aSN1ObjectIdentifier3, Hex.decode("434f4d505349472d4d4c44534136352d525341343039362d5053532d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA512, Hex.decode("434f4d505349472d4d4c44534136352d525341343039362d504b435331352d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512, Hex.decode("434f4d505349472d4d4c44534136352d45434453412d503235362d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA512, Hex.decode("434f4d505349472d4d4c44534136352d45434453412d503338342d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512, Hex.decode("434f4d505349472d4d4c44534136352d45434453412d42503235362d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA65_Ed25519_SHA512, Hex.decode("434f4d505349472d4d4c44534136352d456432353531392d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512, Hex.decode("434f4d505349472d4d4c44534138372d45434453412d42503338342d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA87_Ed448_SHAKE256, Hex.decode("434f4d505349472d4d4c44534138372d45643434382d5348414b45323536"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = IANAObjectIdentifiers.id_MLDSA87_RSA3072_PSS_SHA512;
        linkedHashMap.put(aSN1ObjectIdentifier4, Hex.decode("434f4d505349472d4d4c44534138372d525341333037322d5053532d534841353132"));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = IANAObjectIdentifiers.id_MLDSA87_RSA4096_PSS_SHA512;
        linkedHashMap.put(aSN1ObjectIdentifier5, Hex.decode("434f4d505349472d4d4c44534138372d525341343039362d5053532d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512, Hex.decode("434f4d505349472d4d4c44534138372d45434453412d503338342d534841353132"));
        linkedHashMap.put(IANAObjectIdentifiers.id_MLDSA87_ECDSA_P521_SHA512, Hex.decode("434f4d505349472d4d4c44534138372d45434453412d503532312d534841353132"));
        map2.put(aSN1ObjectIdentifier, new PSSParameterSpec(XMSSKeyParameters.SHA_256, "MGF1", new MGF1ParameterSpec(XMSSKeyParameters.SHA_256), 32, 1));
        map2.put(aSN1ObjectIdentifier2, new PSSParameterSpec(XMSSKeyParameters.SHA_256, "MGF1", new MGF1ParameterSpec(XMSSKeyParameters.SHA_256), 32, 1));
        map2.put(aSN1ObjectIdentifier3, new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        map2.put(aSN1ObjectIdentifier5, new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        map2.put(aSN1ObjectIdentifier4, new PSSParameterSpec(XMSSKeyParameters.SHA_256, "MGF1", new MGF1ParameterSpec(XMSSKeyParameters.SHA_256), 32, 1));
    }

    SignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier, Digest digest) {
        this(aSN1ObjectIdentifier, digest, false);
    }

    private void baseSigInit() {
        try {
            this.componentSignatures[0].setParameter(new ContextParameterSpec(this.domain));
            AlgorithmParameterSpec algorithmParameterSpec = algorithmsParameterSpecs.get(this.algorithm);
            if (algorithmParameterSpec != null) {
                this.componentSignatures[1].setParameter(algorithmParameterSpec);
            }
            this.unprimed = false;
        } catch (InvalidAlgorithmParameterException unused) {
            throw new IllegalStateException("unable to set context on ML-DSA");
        }
    }

    private void createComponentSignatures(List list, List<Provider> list2) {
        int i15 = 0;
        try {
            if (list2 != null) {
                while (i15 != this.componentSignatures.length) {
                    if (list2.get(i15) == null) {
                        this.componentSignatures[i15] = getDefaultSignature(this.algs[i15], list.get(i15));
                    } else {
                        this.componentSignatures[i15] = Signature.getInstance(this.algs[i15], list2.get(i15));
                    }
                    i15++;
                }
                return;
            }
            while (true) {
                Signature[] signatureArr = this.componentSignatures;
                if (i15 == signatureArr.length) {
                    return;
                }
                signatureArr[i15] = getDefaultSignature(this.algs[i15], list.get(i15));
                i15++;
            }
        } catch (GeneralSecurityException e15) {
            throw Exceptions.illegalStateException(e15.getMessage(), e15);
        }
    }

    private String getCanonicalName(String str) {
        String str2 = canonicalNames.get(str);
        return str2 != null ? str2 : str;
    }

    private Signature getDefaultSignature(String str, Object obj) {
        return obj instanceof BCKey ? this.helper.createSignature(str) : Signature.getInstance(str);
    }

    private void processPreHashedMessage(byte[] bArr) throws SignatureException {
        int digestSize = this.baseDigest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        try {
            this.preHashDigest.doFinal(bArr2, 0);
            int i15 = 0;
            while (true) {
                Signature[] signatureArr = this.componentSignatures;
                if (i15 >= signatureArr.length) {
                    return;
                }
                Signature signature = signatureArr[i15];
                signature.update(prefix);
                signature.update(this.domain);
                ContextParameterSpec contextParameterSpec = this.contextSpec;
                if (contextParameterSpec == null) {
                    signature.update((byte) 0);
                } else {
                    byte[] context = contextParameterSpec.getContext();
                    signature.update((byte) context.length);
                    signature.update(context);
                }
                if (bArr != null) {
                    signature.update(bArr, 0, bArr.length);
                }
                signature.update(bArr2, 0, digestSize);
                i15++;
            }
        } catch (IllegalStateException e15) {
            throw new SignatureException(e15.getMessage());
        }
    }

    private void sigInitSign() throws InvalidKeyException {
        CompositePrivateKey compositePrivateKey = (CompositePrivateKey) this.compositeKey;
        int i15 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i15 >= signatureArr.length) {
                this.unprimed = true;
                return;
            } else {
                signatureArr[i15].initSign(compositePrivateKey.getPrivateKeys().get(i15));
                i15++;
            }
        }
    }

    private void sigInitVerify() throws InvalidKeyException {
        CompositePublicKey compositePublicKey = (CompositePublicKey) this.compositeKey;
        int i15 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i15 >= signatureArr.length) {
                this.unprimed = true;
                return;
            } else {
                signatureArr[i15].initVerify(compositePublicKey.getPublicKeys().get(i15));
                i15++;
            }
        }
    }

    public static byte[][] splitCompositeSignature(byte[] bArr, int i15) {
        byte[] bArr2 = new byte[i15];
        int length = bArr.length - i15;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        System.arraycopy(bArr, i15, bArr3, 0, length);
        return new byte[][]{bArr2, bArr3};
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected final AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.contextSpec != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("CONTEXT");
                this.engineParams = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.contextSpec);
            } catch (Exception e15) {
                throw Exceptions.illegalStateException(e15.toString(), e15);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof CompositePrivateKey)) {
            throw new InvalidKeyException("Private key is not composite.");
        }
        this.compositeKey = privateKey;
        CompositePrivateKey compositePrivateKey = (CompositePrivateKey) privateKey;
        if (this.algorithm == null) {
            ASN1ObjectIdentifier algorithm = compositePrivateKey.getAlgorithmIdentifier().getAlgorithm();
            this.algorithm = algorithm;
            Digest digest = CompositeIndex.getDigest(algorithm);
            this.baseDigest = digest;
            if (this.isPrehash) {
                digest = new NullDigest(digest.getDigestSize());
            }
            this.preHashDigest = digest;
            this.domain = domainSeparators.get(algorithm);
            String[] pairing = CompositeIndex.getPairing(algorithm);
            this.algs = pairing;
            this.componentSignatures = new Signature[pairing.length];
        } else if (!compositePrivateKey.getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) this.algorithm)) {
            throw new InvalidKeyException("provided composite public key cannot be used with the composite signature algorithm");
        }
        createComponentSignatures(compositePrivateKey.getPrivateKeys(), compositePrivateKey.getProviders());
        sigInitSign();
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof CompositePublicKey)) {
            throw new InvalidKeyException("public key is not composite");
        }
        this.compositeKey = publicKey;
        CompositePublicKey compositePublicKey = (CompositePublicKey) publicKey;
        if (this.algorithm == null) {
            ASN1ObjectIdentifier algorithm = SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm().getAlgorithm();
            this.algorithm = algorithm;
            Digest digest = CompositeIndex.getDigest(algorithm);
            this.baseDigest = digest;
            if (this.isPrehash) {
                digest = new NullDigest(digest.getDigestSize());
            }
            this.preHashDigest = digest;
            this.domain = domainSeparators.get(algorithm);
            String[] pairing = CompositeIndex.getPairing(algorithm);
            this.algs = pairing;
            this.componentSignatures = new Signature[pairing.length];
        } else if (!compositePublicKey.getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) this.algorithm)) {
            throw new InvalidKeyException("provided composite public key cannot be used with the composite signature algorithm");
        }
        createComponentSignatures(compositePublicKey.getPublicKeys(), compositePublicKey.getProviders());
        sigInitVerify();
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        this.random.nextBytes(new byte[32]);
        if (this.preHashDigest != null) {
            processPreHashedMessage(null);
        }
        byte[] bArrSign = this.componentSignatures[0].sign();
        byte[] bArrSign2 = this.componentSignatures[1].sign();
        byte[] bArr = new byte[bArrSign.length + bArrSign2.length];
        System.arraycopy(bArrSign, 0, bArr, 0, bArrSign.length);
        System.arraycopy(bArrSign2, 0, bArr, bArrSign.length, bArrSign2.length);
        return bArr;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b15) throws SignatureException {
        if (this.unprimed) {
            baseSigInit();
        }
        Digest digest = this.preHashDigest;
        if (digest != null) {
            digest.update(b15);
            return;
        }
        int i15 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i15 >= signatureArr.length) {
                return;
            }
            signatureArr[i15].update(b15);
            i15++;
        }
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        int i15;
        int i16 = 0;
        if (this.algs[0].indexOf("44") > 0) {
            i15 = 2420;
        } else if (this.algs[0].indexOf("65") > 0) {
            i15 = 3309;
        } else {
            i15 = this.algs[0].indexOf("87") > 0 ? 4627 : 0;
        }
        byte[][] bArrSplitCompositeSignature = splitCompositeSignature(bArr, i15);
        if (this.preHashDigest != null) {
            processPreHashedMessage(null);
        }
        boolean z15 = false;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i16 >= signatureArr.length) {
                return !z15;
            }
            if (!signatureArr[i16].verify(bArrSplitCompositeSignature[i16])) {
                z15 = true;
            }
            i16++;
        }
    }

    SignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier, Digest digest, boolean z15) {
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.helper = new BCJcaJceHelper();
        this.engineParams = null;
        this.unprimed = true;
        this.algorithm = aSN1ObjectIdentifier;
        this.isPrehash = z15;
        if (aSN1ObjectIdentifier != null) {
            this.baseDigest = digest;
            this.preHashDigest = z15 ? new NullDigest(digest.getDigestSize()) : digest;
            this.domain = domainSeparators.get(aSN1ObjectIdentifier);
            String[] pairing = CompositeIndex.getPairing(aSN1ObjectIdentifier);
            this.algs = pairing;
            this.componentSignatures = new Signature[pairing.length];
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (!this.unprimed) {
            throw new InvalidAlgorithmParameterException("attempt to set parameter after update");
        }
        if (algorithmParameterSpec instanceof ContextParameterSpec) {
            this.contextSpec = (ContextParameterSpec) algorithmParameterSpec;
            try {
                if (this.compositeKey instanceof PublicKey) {
                    sigInitVerify();
                    return;
                } else {
                    sigInitSign();
                    return;
                }
            } catch (InvalidKeyException e15) {
                throw new InvalidAlgorithmParameterException("keys invalid on reset: " + e15.getMessage(), e15);
            }
        }
        if (algorithmParameterSpec instanceof CompositeSignatureSpec) {
            CompositeSignatureSpec compositeSignatureSpec = (CompositeSignatureSpec) algorithmParameterSpec;
            this.preHashDigest = compositeSignatureSpec.isPrehashMode() ? new NullDigest(this.baseDigest.getDigestSize()) : this.baseDigest;
            AlgorithmParameterSpec secondarySpec = compositeSignatureSpec.getSecondarySpec();
            if (secondarySpec == null || (secondarySpec instanceof ContextParameterSpec)) {
                this.contextSpec = (ContextParameterSpec) compositeSignatureSpec.getSecondarySpec();
                return;
            }
            byte[] contextFrom = SpecUtil.getContextFrom(secondarySpec);
            if (contextFrom == null) {
                throw new InvalidAlgorithmParameterException("unknown parameterSpec passed to composite signature");
            }
            this.contextSpec = new ContextParameterSpec(contextFrom);
            return;
        }
        byte[] contextFrom2 = SpecUtil.getContextFrom(algorithmParameterSpec);
        if (contextFrom2 != null) {
            this.contextSpec = new ContextParameterSpec(contextFrom2);
            try {
                if (this.compositeKey instanceof PublicKey) {
                    sigInitVerify();
                } else {
                    sigInitSign();
                }
            } catch (InvalidKeyException e16) {
                throw new InvalidAlgorithmParameterException("keys invalid on reset: " + e16.getMessage(), e16);
            }
        }
        throw new InvalidAlgorithmParameterException("unknown parameterSpec passed to composite signature");
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i15, int i16) throws SignatureException {
        if (this.unprimed) {
            baseSigInit();
        }
        Digest digest = this.preHashDigest;
        if (digest != null) {
            digest.update(bArr, i15, i16);
            return;
        }
        int i17 = 0;
        while (true) {
            Signature[] signatureArr = this.componentSignatures;
            if (i17 >= signatureArr.length) {
                return;
            }
            signatureArr[i17].update(bArr, i15, i16);
            i17++;
        }
    }
}
