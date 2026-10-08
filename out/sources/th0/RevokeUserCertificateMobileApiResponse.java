package th0;

import iy.b0;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lth0/s;", "", "Liy/b0;", "serialNumber", "Lth0/q;", "reason", "Ljava/time/OffsetDateTime;", "revokeDate", "<init>", "(Liy/b0;Lth0/q;Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "getSerialNumber", "()Liy/b0;", "b", "Lth0/q;", "()Lth0/q;", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevokeUserCertificateMobileApiResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 serialNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q reason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime revokeDate;

    public RevokeUserCertificateMobileApiResponse(b0 b0Var, q qVar, OffsetDateTime offsetDateTime) {
        this.serialNumber = b0Var;
        this.reason = qVar;
        this.revokeDate = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getRevokeDate() {
        return this.revokeDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevokeUserCertificateMobileApiResponse)) {
            return false;
        }
        RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse = (RevokeUserCertificateMobileApiResponse) other;
        return fr.t.c(this.serialNumber, revokeUserCertificateMobileApiResponse.serialNumber) && this.reason == revokeUserCertificateMobileApiResponse.reason && fr.t.c(this.revokeDate, revokeUserCertificateMobileApiResponse.revokeDate);
    }

    public int hashCode() {
        return (((this.serialNumber.hashCode() * 31) + this.reason.hashCode()) * 31) + this.revokeDate.hashCode();
    }

    public String toString() {
        return "RevokeUserCertificateMobileApiResponse(serialNumber=" + this.serialNumber + ", reason=" + this.reason + ", revokeDate=" + this.revokeDate + ")";
    }
}
