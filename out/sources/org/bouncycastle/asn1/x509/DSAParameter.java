package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes5.dex */
public class DSAParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f148890g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f148891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f148892q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f148891p = new ASN1Integer(bigInteger);
        this.f148892q = new ASN1Integer(bigInteger2);
        this.f148890g = new ASN1Integer(bigInteger3);
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f148890g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f148891p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f148892q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f148891p);
        aSN1EncodableVector.add(this.f148892q);
        aSN1EncodableVector.add(this.f148890g);
        return new DERSequence(aSN1EncodableVector);
    }

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f148891p = ASN1Integer.getInstance(objects.nextElement());
        this.f148892q = ASN1Integer.getInstance(objects.nextElement());
        this.f148890g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z15));
    }
}
