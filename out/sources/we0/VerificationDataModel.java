package we0;

import k80.QrCodeData;
import k80.VerificationCertificate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: we0.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwe0/i0;", "", "Lk80/j;", "verificationCertificate", "Lk80/d;", "qrCodeData", "<init>", "(Lk80/j;Lk80/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk80/j;", "b", "()Lk80/j;", "Lk80/d;", "()Lk80/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final VerificationCertificate verificationCertificate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final QrCodeData qrCodeData;

    public VerificationDataModel(VerificationCertificate verificationCertificate, QrCodeData qrCodeData) {
        this.verificationCertificate = verificationCertificate;
        this.qrCodeData = qrCodeData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final QrCodeData getQrCodeData() {
        return this.qrCodeData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VerificationCertificate getVerificationCertificate() {
        return this.verificationCertificate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationDataModel)) {
            return false;
        }
        VerificationDataModel verificationDataModel = (VerificationDataModel) other;
        return fr.t.c(this.verificationCertificate, verificationDataModel.verificationCertificate) && fr.t.c(this.qrCodeData, verificationDataModel.qrCodeData);
    }

    public int hashCode() {
        return (this.verificationCertificate.hashCode() * 31) + this.qrCodeData.hashCode();
    }

    public String toString() {
        return "VerificationDataModel(verificationCertificate=" + this.verificationCertificate + ", qrCodeData=" + this.qrCodeData + ')';
    }
}
