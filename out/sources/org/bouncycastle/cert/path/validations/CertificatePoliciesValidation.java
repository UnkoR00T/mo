package org.bouncycastle.cert.path.validations;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.PolicyConstraints;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidation;
import org.bouncycastle.cert.path.CertPathValidationContext;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes5.dex */
public class CertificatePoliciesValidation implements CertPathValidation {
    private int explicitPolicy;
    private int inhibitAnyPolicy;
    private int policyMapping;

    CertificatePoliciesValidation(int i15) {
        this(i15, false, false, false);
    }

    private int countDown(int i15) {
        if (i15 != 0) {
            return i15 - 1;
        }
        return 0;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        CertificatePoliciesValidation certificatePoliciesValidation = new CertificatePoliciesValidation(0);
        certificatePoliciesValidation.explicitPolicy = this.explicitPolicy;
        certificatePoliciesValidation.policyMapping = this.policyMapping;
        certificatePoliciesValidation.inhibitAnyPolicy = this.inhibitAnyPolicy;
        return certificatePoliciesValidation;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        CertificatePoliciesValidation certificatePoliciesValidation = (CertificatePoliciesValidation) memoable;
        this.explicitPolicy = certificatePoliciesValidation.explicitPolicy;
        this.policyMapping = certificatePoliciesValidation.policyMapping;
        this.inhibitAnyPolicy = certificatePoliciesValidation.inhibitAnyPolicy;
    }

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) {
        int iIntValueExact;
        certPathValidationContext.addHandledExtension(Extension.policyConstraints);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.inhibitAnyPolicy;
        certPathValidationContext.addHandledExtension(aSN1ObjectIdentifier);
        if (certPathValidationContext.isEndEntity() || ValidationUtils.isSelfIssued(x509CertificateHolder)) {
            return;
        }
        this.explicitPolicy = countDown(this.explicitPolicy);
        this.policyMapping = countDown(this.policyMapping);
        this.inhibitAnyPolicy = countDown(this.inhibitAnyPolicy);
        PolicyConstraints policyConstraintsFromExtensions = PolicyConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (policyConstraintsFromExtensions != null) {
            BigInteger requireExplicitPolicyMapping = policyConstraintsFromExtensions.getRequireExplicitPolicyMapping();
            if (requireExplicitPolicyMapping != null && requireExplicitPolicyMapping.intValue() < this.explicitPolicy) {
                this.explicitPolicy = requireExplicitPolicyMapping.intValue();
            }
            BigInteger inhibitPolicyMapping = policyConstraintsFromExtensions.getInhibitPolicyMapping();
            if (inhibitPolicyMapping != null && inhibitPolicyMapping.intValue() < this.policyMapping) {
                this.policyMapping = inhibitPolicyMapping.intValue();
            }
        }
        Extension extension = x509CertificateHolder.getExtension(aSN1ObjectIdentifier);
        if (extension == null || (iIntValueExact = ASN1Integer.getInstance(extension.getParsedValue()).intValueExact()) >= this.inhibitAnyPolicy) {
            return;
        }
        this.inhibitAnyPolicy = iIntValueExact;
    }

    CertificatePoliciesValidation(int i15, boolean z15, boolean z16, boolean z17) {
        if (z15) {
            this.explicitPolicy = 0;
        } else {
            this.explicitPolicy = i15 + 1;
        }
        if (z16) {
            this.inhibitAnyPolicy = 0;
        } else {
            this.inhibitAnyPolicy = i15 + 1;
        }
        if (z17) {
            this.policyMapping = 0;
        } else {
            this.policyMapping = i15 + 1;
        }
    }
}
