package org.conscrypt.metrics;

/* JADX INFO: loaded from: classes5.dex */
public enum CertificateTransparencyVerificationReason {
    UNKNOWN(0),
    APP_OPT_IN(3),
    DOMAIN_OPT_IN(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    final int f149636id;

    CertificateTransparencyVerificationReason(int i15) {
        this.f149636id = i15;
    }

    public int getId() {
        return this.f149636id;
    }
}
