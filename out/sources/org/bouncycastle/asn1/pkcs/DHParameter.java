package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f148864g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ASN1Integer f148865l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f148866p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i15) {
        this.f148866p = new ASN1Integer(bigInteger);
        this.f148864g = new ASN1Integer(bigInteger2);
        this.f148865l = i15 != 0 ? new ASN1Integer(i15) : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f148864g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f148865l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f148866p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f148866p);
        aSN1EncodableVector.add(this.f148864g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f148865l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f148866p = ASN1Integer.getInstance(objects.nextElement());
        this.f148864g = ASN1Integer.getInstance(objects.nextElement());
        this.f148865l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }
}
