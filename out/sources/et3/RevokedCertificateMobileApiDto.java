package et3;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: et3.n, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001c"}, d2 = {"Let3/n;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Let3/d;", "a", "Let3/d;", "getReason", "()Let3/d;", "reason", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "getRevokeDate", "()Ljava/time/OffsetDateTime;", "revokeDate", "c", "Ljava/lang/String;", "getSerialNumber", "serialNumber", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevokedCertificateMobileApiDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reason")
    private final d reason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("revokeDate")
    private final OffsetDateTime revokeDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serialNumber")
    private final String serialNumber;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevokedCertificateMobileApiDto)) {
            return false;
        }
        RevokedCertificateMobileApiDto revokedCertificateMobileApiDto = (RevokedCertificateMobileApiDto) other;
        return this.reason == revokedCertificateMobileApiDto.reason && t.c(this.revokeDate, revokedCertificateMobileApiDto.revokeDate) && t.c(this.serialNumber, revokedCertificateMobileApiDto.serialNumber);
    }

    public int hashCode() {
        return (((this.reason.hashCode() * 31) + this.revokeDate.hashCode()) * 31) + this.serialNumber.hashCode();
    }

    public String toString() {
        return "RevokedCertificateMobileApiDto(reason=" + this.reason + ", revokeDate=" + this.revokeDate + ", serialNumber=" + this.serialNumber + ')';
    }
}
