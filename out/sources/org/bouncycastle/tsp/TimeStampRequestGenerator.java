package org.bouncycastle.tsp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TimeStampReq;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* JADX INFO: loaded from: classes5.dex */
public class TimeStampRequestGenerator {
    private static final DefaultDigestAlgorithmIdentifierFinder DEFAULT_DIGEST_ALG_FINDER = new DefaultDigestAlgorithmIdentifierFinder();
    private ASN1Boolean certReq;
    private final DigestAlgorithmIdentifierFinder digestAlgFinder;
    private final ExtensionsGenerator extGenerator;
    private ASN1ObjectIdentifier reqPolicy;

    public TimeStampRequestGenerator() {
        this(DEFAULT_DIGEST_ALG_FINDER);
    }

    public void addExtension(String str, boolean z15, ASN1Encodable aSN1Encodable) {
        addExtension(new ASN1ObjectIdentifier(str), z15, aSN1Encodable);
    }

    public TimeStampRequest generate(String str, byte[] bArr) {
        return generate(str, bArr, (BigInteger) null);
    }

    public void setCertReq(ASN1Boolean aSN1Boolean) {
        this.certReq = aSN1Boolean;
    }

    public void setReqPolicy(String str) {
        setReqPolicy(new ASN1ObjectIdentifier(str));
    }

    public TimeStampRequestGenerator(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.extGenerator = new ExtensionsGenerator();
        if (digestAlgorithmIdentifierFinder == null) {
            throw new NullPointerException("'digestAlgFinder' cannot be null");
        }
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
    }

    public void addExtension(String str, boolean z15, byte[] bArr) {
        addExtension(new ASN1ObjectIdentifier(str), z15, bArr);
    }

    public TimeStampRequest generate(String str, byte[] bArr, BigInteger bigInteger) {
        if (str != null) {
            return generate(new ASN1ObjectIdentifier(str), bArr, bigInteger);
        }
        throw new NullPointerException("'digestAlgorithmOID' cannot be null");
    }

    public void setCertReq(boolean z15) {
        setCertReq(ASN1Boolean.getInstance(z15));
    }

    public void setReqPolicy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.reqPolicy = aSN1ObjectIdentifier;
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z15, ASN1Encodable aSN1Encodable) {
        TSPUtil.addExtension(this.extGenerator, aSN1ObjectIdentifier, z15, aSN1Encodable);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        return generate(aSN1ObjectIdentifier, bArr, (BigInteger) null);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z15, byte[] bArr) {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z15, bArr);
    }

    public TimeStampRequest generate(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, BigInteger bigInteger) {
        return generate(this.digestAlgFinder.find(aSN1ObjectIdentifier), bArr, bigInteger);
    }

    public TimeStampRequest generate(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        return generate(algorithmIdentifier, bArr, (BigInteger) null);
    }

    public TimeStampRequest generate(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, BigInteger bigInteger) {
        if (algorithmIdentifier != null) {
            return new TimeStampRequest(new TimeStampReq(new MessageImprint(algorithmIdentifier, bArr), this.reqPolicy, bigInteger == null ? null : new ASN1Integer(bigInteger), this.certReq, this.extGenerator.isEmpty() ? null : this.extGenerator.generate()));
        }
        throw new NullPointerException("'digestAlgorithmID' cannot be null");
    }
}
