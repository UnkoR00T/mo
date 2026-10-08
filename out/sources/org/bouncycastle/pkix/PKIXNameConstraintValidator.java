package org.bouncycastle.pkix;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;

/* JADX INFO: loaded from: classes5.dex */
public class PKIXNameConstraintValidator {
    ASN1PKIXNameConstraintValidator validator = new ASN1PKIXNameConstraintValidator();

    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        this.validator.addExcludedSubtree(generalSubtree);
    }

    public void checkExcluded(GeneralName generalName) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.checkExcluded(generalName);
        } catch (NameConstraintValidatorException e15) {
            throw new PKIXNameConstraintValidatorException(e15.getMessage(), e15);
        }
    }

    public void checkExcludedDN(ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.checkExcludedDN(X500Name.getInstance(aSN1Sequence));
        } catch (NameConstraintValidatorException e15) {
            throw new PKIXNameConstraintValidatorException(e15.getMessage(), e15);
        }
    }

    public void checkPermitted(GeneralName generalName) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.checkPermitted(generalName);
        } catch (NameConstraintValidatorException e15) {
            throw new PKIXNameConstraintValidatorException(e15.getMessage(), e15);
        }
    }

    public void checkPermittedDN(ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.checkPermittedDN(X500Name.getInstance(aSN1Sequence));
        } catch (NameConstraintValidatorException e15) {
            throw new PKIXNameConstraintValidatorException(e15.getMessage(), e15);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PKIXNameConstraintValidator) {
            return this.validator.equals(((PKIXNameConstraintValidator) obj).validator);
        }
        return false;
    }

    public int hashCode() {
        return this.validator.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i15) {
        this.validator.intersectEmptyPermittedSubtree(i15);
    }

    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        this.validator.intersectPermittedSubtree(generalSubtree);
    }

    public String toString() {
        return this.validator.toString();
    }

    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        this.validator.intersectPermittedSubtree(generalSubtreeArr);
    }
}
