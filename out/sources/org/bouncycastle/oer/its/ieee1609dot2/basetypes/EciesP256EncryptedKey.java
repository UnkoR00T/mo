package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class EciesP256EncryptedKey extends ASN1Object {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ASN1OctetString f149393c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ASN1OctetString f149394t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final EccP256CurvePoint f149395v;

    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ASN1OctetString f149396c;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ASN1OctetString f149397t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private EccP256CurvePoint f149398v;

        public EciesP256EncryptedKey createEciesP256EncryptedKey() {
            return new EciesP256EncryptedKey(this.f149398v, this.f149396c, this.f149397t);
        }

        public Builder setC(ASN1OctetString aSN1OctetString) {
            this.f149396c = aSN1OctetString;
            return this;
        }

        public Builder setT(ASN1OctetString aSN1OctetString) {
            this.f149397t = aSN1OctetString;
            return this;
        }

        public Builder setV(EccP256CurvePoint eccP256CurvePoint) {
            this.f149398v = eccP256CurvePoint;
            return this;
        }

        public Builder setC(byte[] bArr) {
            this.f149396c = new DEROctetString(Arrays.clone(bArr));
            return this;
        }

        public Builder setT(byte[] bArr) {
            this.f149397t = new DEROctetString(Arrays.clone(bArr));
            return this;
        }
    }

    private EciesP256EncryptedKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("expected sequence size of 3");
        }
        this.f149395v = EccP256CurvePoint.getInstance(aSN1Sequence.getObjectAt(0));
        this.f149393c = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f149394t = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EciesP256EncryptedKey getInstance(Object obj) {
        if (obj instanceof EciesP256EncryptedKey) {
            return (EciesP256EncryptedKey) obj;
        }
        if (obj != null) {
            return new EciesP256EncryptedKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getC() {
        return this.f149393c;
    }

    public ASN1OctetString getT() {
        return this.f149394t;
    }

    public EccP256CurvePoint getV() {
        return this.f149395v;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f149395v, this.f149393c, this.f149394t});
    }

    public EciesP256EncryptedKey(EccP256CurvePoint eccP256CurvePoint, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.f149395v = eccP256CurvePoint;
        this.f149393c = aSN1OctetString;
        this.f149394t = aSN1OctetString2;
    }
}
