package vz3;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vz3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvz3/a;", "", "", "certificateRenewalRequired", "firstSessionRequest", "Ljava/time/OffsetDateTime;", "certificateExpiryDate", "<init>", "(ZZLjava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "Ljava/time/OffsetDateTime;", "getCertificateExpiryDate", "()Ljava/time/OffsetDateTime;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoCertificateRenewalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean certificateRenewalRequired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstSessionRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime certificateExpiryDate;

    public AutoCertificateRenewalData(boolean z15, boolean z16, OffsetDateTime offsetDateTime) {
        this.certificateRenewalRequired = z15;
        this.firstSessionRequest = z16;
        this.certificateExpiryDate = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCertificateRenewalRequired() {
        return this.certificateRenewalRequired;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFirstSessionRequest() {
        return this.firstSessionRequest;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoCertificateRenewalData)) {
            return false;
        }
        AutoCertificateRenewalData autoCertificateRenewalData = (AutoCertificateRenewalData) other;
        return this.certificateRenewalRequired == autoCertificateRenewalData.certificateRenewalRequired && this.firstSessionRequest == autoCertificateRenewalData.firstSessionRequest && t.c(this.certificateExpiryDate, autoCertificateRenewalData.certificateExpiryDate);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.certificateRenewalRequired) * 31) + Boolean.hashCode(this.firstSessionRequest)) * 31;
        OffsetDateTime offsetDateTime = this.certificateExpiryDate;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "AutoCertificateRenewalData(certificateRenewalRequired=" + this.certificateRenewalRequired + ", firstSessionRequest=" + this.firstSessionRequest + ", certificateExpiryDate=" + this.certificateExpiryDate + ")";
    }
}
