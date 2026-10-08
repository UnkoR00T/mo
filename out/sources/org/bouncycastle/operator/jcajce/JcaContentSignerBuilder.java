package org.bouncycastle.operator.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.ExtendedContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.TeeOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class JcaContentSignerBuilder {
    private static final DefaultSignatureAlgorithmIdentifierFinder SIGNATURE_ALGORITHM_IDENTIFIER_FINDER;
    private static final Set isAlgIdFromPrivate;
    private OperatorHelper helper;
    private SecureRandom random;
    private AlgorithmIdentifier sigAlgId;
    private AlgorithmParameterSpec sigAlgSpec;
    private final String signatureAlgorithm;
    private final AlgorithmIdentifier signatureDigestAlgorithm;

    static {
        HashSet hashSet = new HashSet();
        isAlgIdFromPrivate = hashSet;
        SIGNATURE_ALGORITHM_IDENTIFIER_FINDER = new DefaultSignatureAlgorithmIdentifierFinder();
        hashSet.add("COMPOSITE");
        hashSet.add("DILITHIUM");
        hashSet.add("SPHINCS+");
        hashSet.add("SPHINCSPlus");
        hashSet.add("ML-DSA");
        hashSet.add("SLH-DSA");
        hashSet.add("HASH-ML-DSA");
        hashSet.add("HASH-SLH-DSA");
    }

    public JcaContentSignerBuilder(String str) {
        this(str, (AlgorithmIdentifier) null);
    }

    private ContentSigner buildComposite(CompositePrivateKey compositePrivateKey) throws OperatorCreationException {
        try {
            List<PrivateKey> privateKeys = compositePrivateKey.getPrivateKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.sigAlgId.getParameters());
            int size = aSN1Sequence.size();
            Signature[] signatureArr = new Signature[size];
            for (int i15 = 0; i15 != aSN1Sequence.size(); i15++) {
                Signature signatureCreateSignature = this.helper.createSignature(AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i15)));
                signatureArr[i15] = signatureCreateSignature;
                if (this.random != null) {
                    signatureCreateSignature.initSign(privateKeys.get(i15), this.random);
                } else {
                    signatureCreateSignature.initSign(privateKeys.get(i15));
                }
            }
            OutputStream outputStreamCreateStream = OutputStreamFactory.createStream(signatureArr[0]);
            int i16 = 1;
            while (i16 != size) {
                TeeOutputStream teeOutputStream = new TeeOutputStream(outputStreamCreateStream, OutputStreamFactory.createStream(signatureArr[i16]));
                i16++;
                outputStreamCreateStream = teeOutputStream;
            }
            return new ContentSigner(outputStreamCreateStream, signatureArr) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.3
                OutputStream stream;
                final /* synthetic */ OutputStream val$sigStream;
                final /* synthetic */ Signature[] val$sigs;

                {
                    this.val$sigStream = outputStreamCreateStream;
                    this.val$sigs = signatureArr;
                    this.stream = outputStreamCreateStream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return JcaContentSignerBuilder.this.sigAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        for (int i17 = 0; i17 != this.val$sigs.length; i17++) {
                            aSN1EncodableVector.add(new DERBitString(this.val$sigs[i17].sign()));
                        }
                        return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                    } catch (IOException e15) {
                        throw new RuntimeOperatorException("exception encoding signature: " + e15.getMessage(), e15);
                    } catch (SignatureException e16) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e16.getMessage(), e16);
                    }
                }
            };
        } catch (GeneralSecurityException e15) {
            throw new OperatorCreationException("cannot create signer: " + e15.getMessage(), e15);
        }
    }

    private static ASN1Sequence createCompParams(CompositeAlgorithmSpec compositeAlgorithmSpec) {
        DefaultSignatureAlgorithmIdentifierFinder defaultSignatureAlgorithmIdentifierFinder = new DefaultSignatureAlgorithmIdentifierFinder();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        List<String> algorithmNames = compositeAlgorithmSpec.getAlgorithmNames();
        List<AlgorithmParameterSpec> parameterSpecs = compositeAlgorithmSpec.getParameterSpecs();
        for (int i15 = 0; i15 != algorithmNames.size(); i15++) {
            AlgorithmParameterSpec algorithmParameterSpec = parameterSpecs.get(i15);
            if (algorithmParameterSpec == null) {
                aSN1EncodableVector.add(defaultSignatureAlgorithmIdentifierFinder.find(algorithmNames.get(i15)));
            } else {
                if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                    throw new IllegalArgumentException("unrecognized parameterSpec");
                }
                aSN1EncodableVector.add(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams((PSSParameterSpec) algorithmParameterSpec)));
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private static RSASSAPSSparams createPSSParams(PSSParameterSpec pSSParameterSpec) {
        DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        AlgorithmIdentifier algorithmIdentifierFind = defaultDigestAlgorithmIdentifierFinder.find(pSSParameterSpec.getDigestAlgorithm());
        if (algorithmIdentifierFind.getParameters() == null) {
            algorithmIdentifierFind = new AlgorithmIdentifier(algorithmIdentifierFind.getAlgorithm(), DERNull.INSTANCE);
        }
        AlgorithmIdentifier algorithmIdentifierFind2 = defaultDigestAlgorithmIdentifierFinder.find(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm());
        if (algorithmIdentifierFind2.getParameters() == null) {
            algorithmIdentifierFind2 = new AlgorithmIdentifier(algorithmIdentifierFind2.getAlgorithm(), DERNull.INSTANCE);
        }
        return new RSASSAPSSparams(algorithmIdentifierFind, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifierFind2), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField()));
    }

    private AlgorithmIdentifier getSigAlgId(PrivateKey privateKey) {
        if (!isAlgIdFromPrivate.contains(Strings.toUpperCase(this.signatureAlgorithm))) {
            return SIGNATURE_ALGORITHM_IDENTIFIER_FINDER.find(this.signatureAlgorithm);
        }
        AlgorithmIdentifier algorithmIdentifierFind = SIGNATURE_ALGORITHM_IDENTIFIER_FINDER.find(privateKey.getAlgorithm());
        return algorithmIdentifierFind == null ? PrivateKeyInfo.getInstance(privateKey.getEncoded()).getPrivateKeyAlgorithm() : algorithmIdentifierFind;
    }

    private static AlgorithmIdentifier getSigDigAlgId(PublicKey publicKey) {
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(publicKey.getEncoded());
        if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_hss_lms_hashsig)) {
            return new AlgorithmIdentifier(LMSigParameters.getParametersForType(Pack.bigEndianToInt(subjectPublicKeyInfo.getPublicKeyData().getOctets(), 4)).getDigestOID());
        }
        return null;
    }

    public ContentSigner build(PrivateKey privateKey) {
        if (privateKey instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) privateKey;
            if (compositePrivateKey.getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key)) {
                return buildComposite(compositePrivateKey);
            }
        }
        try {
            if (this.sigAlgSpec == null) {
                this.sigAlgId = getSigAlgId(privateKey);
            }
            AlgorithmIdentifier algorithmIdentifier = this.sigAlgId;
            Signature signatureCreateSignature = this.helper.createSignature(algorithmIdentifier);
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                signatureCreateSignature.initSign(privateKey, secureRandom);
            } else {
                signatureCreateSignature.initSign(privateKey);
            }
            ContentSigner contentSigner = new ContentSigner(signatureCreateSignature, algorithmIdentifier) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.1
                private OutputStream stream;
                final /* synthetic */ Signature val$sig;
                final /* synthetic */ AlgorithmIdentifier val$signatureAlgId;

                {
                    this.val$sig = signatureCreateSignature;
                    this.val$signatureAlgId = algorithmIdentifier;
                    this.stream = OutputStreamFactory.createStream(signatureCreateSignature);
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.val$signatureAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        return this.val$sig.sign();
                    } catch (SignatureException e15) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e15.getMessage(), e15);
                    }
                }
            };
            return this.signatureDigestAlgorithm != null ? new ExtendedContentSigner(contentSigner) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.2
                private final AlgorithmIdentifier digestAlgorithm;
                private final ContentSigner signer;
                final /* synthetic */ ContentSigner val$contentSigner;

                {
                    this.val$contentSigner = contentSigner;
                    this.digestAlgorithm = JcaContentSignerBuilder.this.signatureDigestAlgorithm;
                    this.signer = contentSigner;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.signer.getAlgorithmIdentifier();
                }

                @Override // org.bouncycastle.operator.ExtendedContentSigner
                public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
                    return this.digestAlgorithm;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.signer.getOutputStream();
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    return this.signer.getSignature();
                }
            } : contentSigner;
        } catch (GeneralSecurityException e15) {
            throw new OperatorCreationException("cannot create signer: " + e15.getMessage(), e15);
        }
    }

    public JcaContentSignerBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JcaContentSignerBuilder(String str, PublicKey publicKey) {
        this(str, getSigDigAlgId(publicKey));
    }

    public JcaContentSignerBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcaContentSignerBuilder(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        this(str, algorithmParameterSpec, null);
    }

    public JcaContentSignerBuilder(String str, AlgorithmParameterSpec algorithmParameterSpec, AlgorithmIdentifier algorithmIdentifier) {
        AlgorithmIdentifier algorithmIdentifier2;
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.signatureAlgorithm = str;
        this.signatureDigestAlgorithm = algorithmIdentifier;
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
            this.sigAlgSpec = pSSParameterSpec;
            algorithmIdentifier2 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams(pSSParameterSpec));
        } else {
            if (!(algorithmParameterSpec instanceof CompositeAlgorithmSpec)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("unknown sigParamSpec: ");
                sb5.append(algorithmParameterSpec == null ? "null" : algorithmParameterSpec.getClass().getName());
                throw new IllegalArgumentException(sb5.toString());
            }
            CompositeAlgorithmSpec compositeAlgorithmSpec = (CompositeAlgorithmSpec) algorithmParameterSpec;
            this.sigAlgSpec = compositeAlgorithmSpec;
            algorithmIdentifier2 = new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite, createCompParams(compositeAlgorithmSpec));
        }
        this.sigAlgId = algorithmIdentifier2;
    }

    public JcaContentSignerBuilder(String str, AlgorithmIdentifier algorithmIdentifier) {
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.signatureAlgorithm = str;
        this.signatureDigestAlgorithm = algorithmIdentifier;
    }
}
