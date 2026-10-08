package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class IssuingDistributionPoint extends ASN1Object {
    private DistributionPointName distributionPoint;
    private boolean indirectCRL;
    private boolean onlyContainsAttributeCerts;
    private boolean onlyContainsCACerts;
    private boolean onlyContainsUserCerts;
    private ReasonFlags onlySomeReasons;
    private ASN1Sequence seq;

    private IssuingDistributionPoint(ASN1Sequence aSN1Sequence) {
        this.seq = aSN1Sequence;
        for (int i15 = 0; i15 != aSN1Sequence.size(); i15++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i15));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.distributionPoint = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.onlyContainsUserCerts = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 2) {
                this.onlyContainsCACerts = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 3) {
                this.onlySomeReasons = new ReasonFlags(ASN1BitString.getInstance(aSN1TaggedObject, false));
            } else if (tagNo == 4) {
                this.indirectCRL = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else {
                if (tagNo != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.onlyContainsAttributeCerts = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            }
        }
    }

    private void appendObject(StringBuilder sb5, String str, String str2, String str3) {
        sb5.append("    ");
        sb5.append(str2);
        sb5.append(":");
        sb5.append(str);
        sb5.append("    ");
        sb5.append("    ");
        sb5.append(str3);
        sb5.append(str);
    }

    private String booleanToString(boolean z15) {
        return z15 ? "true" : "false";
    }

    public static IssuingDistributionPoint getInstance(Object obj) {
        if (obj instanceof IssuingDistributionPoint) {
            return (IssuingDistributionPoint) obj;
        }
        if (obj != null) {
            return new IssuingDistributionPoint(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DistributionPointName getDistributionPoint() {
        return this.distributionPoint;
    }

    public ReasonFlags getOnlySomeReasons() {
        return this.onlySomeReasons;
    }

    public boolean isIndirectCRL() {
        return this.indirectCRL;
    }

    public boolean onlyContainsAttributeCerts() {
        return this.onlyContainsAttributeCerts;
    }

    public boolean onlyContainsCACerts() {
        return this.onlyContainsCACerts;
    }

    public boolean onlyContainsUserCerts() {
        return this.onlyContainsUserCerts;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.seq;
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("IssuingDistributionPoint: [");
        sb5.append(strLineSeparator);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            appendObject(sb5, strLineSeparator, "distributionPoint", distributionPointName.toString());
        }
        boolean z15 = this.onlyContainsUserCerts;
        if (z15) {
            appendObject(sb5, strLineSeparator, "onlyContainsUserCerts", booleanToString(z15));
        }
        boolean z16 = this.onlyContainsCACerts;
        if (z16) {
            appendObject(sb5, strLineSeparator, "onlyContainsCACerts", booleanToString(z16));
        }
        ReasonFlags reasonFlags = this.onlySomeReasons;
        if (reasonFlags != null) {
            appendObject(sb5, strLineSeparator, "onlySomeReasons", reasonFlags.toString());
        }
        boolean z17 = this.onlyContainsAttributeCerts;
        if (z17) {
            appendObject(sb5, strLineSeparator, "onlyContainsAttributeCerts", booleanToString(z17));
        }
        boolean z18 = this.indirectCRL;
        if (z18) {
            appendObject(sb5, strLineSeparator, "indirectCRL", booleanToString(z18));
        }
        sb5.append("]");
        sb5.append(strLineSeparator);
        return sb5.toString();
    }

    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z15, boolean z16) {
        this(distributionPointName, false, false, null, z15, z16);
    }

    public static IssuingDistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z15));
    }

    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z15, boolean z16, ReasonFlags reasonFlags, boolean z17, boolean z18) {
        if ((z16 && (z15 || z18)) || (z15 && z18)) {
            throw new IllegalArgumentException("only one of onlyContainsCACerts, onlyContainsUserCerts, or onlyContainsAttributeCerts can be true");
        }
        this.distributionPoint = distributionPointName;
        this.indirectCRL = z17;
        this.onlyContainsAttributeCerts = z18;
        this.onlyContainsCACerts = z16;
        this.onlyContainsUserCerts = z15;
        this.onlySomeReasons = reasonFlags;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) distributionPointName));
        }
        if (z15) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        if (z16) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, (ASN1Encodable) reasonFlags));
        }
        if (z17) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 4, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        if (z18) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 5, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        this.seq = new DERSequence(aSN1EncodableVector);
    }
}
