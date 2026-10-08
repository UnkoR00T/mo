package org.conscrypt.ct;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes5.dex */
public interface Policy {
    PolicyCompliance doesResultConformToPolicy(VerificationResult verificationResult, X509Certificate x509Certificate);

    boolean isLogStoreCompliant(LogStore logStore);
}
