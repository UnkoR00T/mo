package org.bouncycastle.asn1.ua;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145ECBinary extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f148876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1OctetString f148877b;

    /* JADX INFO: renamed from: bp, reason: collision with root package name */
    ASN1OctetString f148878bp;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    DSTU4145BinaryField f148879f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ASN1Integer f148880n;
    BigInteger version;

    private DSTU4145ECBinary(ASN1Sequence aSN1Sequence) {
        this.version = BigInteger.valueOf(0L);
        int i15 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.version = ASN1Integer.getInstance(aSN1TaggedObject.getLoadedObject()).getValue();
            i15 = 1;
        }
        this.f148879f = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i15));
        this.f148876a = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i15 + 1));
        this.f148877b = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i15 + 2));
        this.f148880n = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i15 + 3));
        this.f148878bp = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i15 + 4));
    }

    public static DSTU4145ECBinary getInstance(Object obj) {
        if (obj instanceof DSTU4145ECBinary) {
            return (DSTU4145ECBinary) obj;
        }
        if (obj != null) {
            return new DSTU4145ECBinary(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getA() {
        return this.f148876a.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f148877b.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f148879f;
    }

    public byte[] getG() {
        return Arrays.clone(this.f148878bp.getOctets());
    }

    public BigInteger getN() {
        return this.f148880n.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        if (this.version.compareTo(BigInteger.valueOf(0L)) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new ASN1Integer(this.version)));
        }
        aSN1EncodableVector.add(this.f148879f);
        aSN1EncodableVector.add(this.f148876a);
        aSN1EncodableVector.add(this.f148877b);
        aSN1EncodableVector.add(this.f148880n);
        aSN1EncodableVector.add(this.f148878bp);
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        DSTU4145BinaryField dSTU4145BinaryField;
        this.version = BigInteger.valueOf(0L);
        ECCurve curve = eCDomainParameters.getCurve();
        if (!ECAlgorithms.isF2mCurve(curve)) {
            throw new IllegalArgumentException("only binary domain is possible");
        }
        int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            dSTU4145BinaryField = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                throw new IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            dSTU4145BinaryField = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.f148879f = dSTU4145BinaryField;
        this.f148876a = new ASN1Integer(curve.getA().toBigInteger());
        this.f148877b = new DEROctetString(curve.getB().getEncoded());
        this.f148880n = new ASN1Integer(eCDomainParameters.getN());
        this.f148878bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
    }
}
