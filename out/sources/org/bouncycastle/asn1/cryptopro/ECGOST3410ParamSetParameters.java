package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f148848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f148849b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f148850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f148851q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f148852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f148853y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i15, BigInteger bigInteger5) {
        this.f148848a = new ASN1Integer(bigInteger);
        this.f148849b = new ASN1Integer(bigInteger2);
        this.f148850p = new ASN1Integer(bigInteger3);
        this.f148851q = new ASN1Integer(bigInteger4);
        this.f148852x = new ASN1Integer(i15);
        this.f148853y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public BigInteger getA() {
        return this.f148848a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f148850p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f148851q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f148848a);
        aSN1EncodableVector.add(this.f148849b);
        aSN1EncodableVector.add(this.f148850p);
        aSN1EncodableVector.add(this.f148851q);
        aSN1EncodableVector.add(this.f148852x);
        aSN1EncodableVector.add(this.f148853y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f148848a = (ASN1Integer) objects.nextElement();
        this.f148849b = (ASN1Integer) objects.nextElement();
        this.f148850p = (ASN1Integer) objects.nextElement();
        this.f148851q = (ASN1Integer) objects.nextElement();
        this.f148852x = (ASN1Integer) objects.nextElement();
        this.f148853y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z15));
    }
}
