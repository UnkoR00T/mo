package org.bouncycastle.cert.path.validations;

import org.bouncycastle.cert.path.CertPath;

/* JADX INFO: loaded from: classes5.dex */
public class CertificatePoliciesValidationBuilder {
    private boolean isAnyPolicyInhibited;
    private boolean isExplicitPolicyRequired;
    private boolean isPolicyMappingInhibited;

    public CertificatePoliciesValidation build(int i15) {
        return new CertificatePoliciesValidation(i15, this.isExplicitPolicyRequired, this.isAnyPolicyInhibited, this.isPolicyMappingInhibited);
    }

    public void setAnyPolicyInhibited(boolean z15) {
        this.isAnyPolicyInhibited = z15;
    }

    public void setExplicitPolicyRequired(boolean z15) {
        this.isExplicitPolicyRequired = z15;
    }

    public void setPolicyMappingInhibited(boolean z15) {
        this.isPolicyMappingInhibited = z15;
    }

    public CertificatePoliciesValidation build(CertPath certPath) {
        return build(certPath.length());
    }
}
