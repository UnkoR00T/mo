package org.conscrypt.ct;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import org.conscrypt.Platform;
import org.conscrypt.metrics.CertificateTransparencyVerificationReason;
import org.conscrypt.metrics.StatsLog;

/* JADX INFO: loaded from: classes5.dex */
public class CertificateTransparency {
    private LogStore logStore;
    private Policy policy;
    private StatsLog statsLog;
    private Verifier verifier;

    public CertificateTransparency(LogStore logStore, Policy policy, Verifier verifier, StatsLog statsLog) {
        Objects.requireNonNull(logStore);
        Objects.requireNonNull(policy);
        Objects.requireNonNull(verifier);
        Objects.requireNonNull(statsLog);
        this.logStore = logStore;
        this.policy = policy;
        this.verifier = verifier;
        this.statsLog = statsLog;
    }

    public void checkCT(List<X509Certificate> list, byte[] bArr, byte[] bArr2, String str) {
        if (this.logStore.getState() != LogStore.State.COMPLIANT) {
            this.statsLog.reportCTVerificationResult(this.logStore, null, null, reasonCTVerificationRequired(str));
            return;
        }
        VerificationResult verificationResultVerifySignedCertificateTimestamps = this.verifier.verifySignedCertificateTimestamps(list, bArr2, bArr);
        PolicyCompliance policyComplianceDoesResultConformToPolicy = this.policy.doesResultConformToPolicy(verificationResultVerifySignedCertificateTimestamps, list.get(0));
        this.statsLog.reportCTVerificationResult(this.logStore, verificationResultVerifySignedCertificateTimestamps, policyComplianceDoesResultConformToPolicy, reasonCTVerificationRequired(str));
        if (policyComplianceDoesResultConformToPolicy == PolicyCompliance.COMPLY) {
            return;
        }
        throw new CertificateException("Certificate chain does not conform to required transparency policy: " + policyComplianceDoesResultConformToPolicy.name());
    }

    public boolean isCTVerificationRequired(String str) {
        return Platform.isCTVerificationRequired(str);
    }

    public CertificateTransparencyVerificationReason reasonCTVerificationRequired(String str) {
        return Platform.reasonCTVerificationRequired(str);
    }
}
