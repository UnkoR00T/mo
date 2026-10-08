package xs0;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xs0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lxs0/q;", "", "", "pesel", "seriesAndId", "verificationReason", "Ljava/time/LocalDate;", "date", "Lxs0/s;", "verifyingInstitution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Lxs0/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPesel", "b", "getSeriesAndId", "c", "getVerificationReason", "d", "Ljava/time/LocalDate;", "getDate", "()Ljava/time/LocalDate;", "e", "Lxs0/s;", "getVerifyingInstitution", "()Lxs0/s;", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyPeselRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("seriesAndId")
    private final String seriesAndId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationReason")
    private final String verificationReason;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("date")
    private final LocalDate date;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verifyingInstitution")
    private final VerifyingInstitutionDto verifyingInstitution;

    public VerifyPeselRequest(String str, String str2, String str3, LocalDate localDate, VerifyingInstitutionDto verifyingInstitutionDto) {
        this.pesel = str;
        this.seriesAndId = str2;
        this.verificationReason = str3;
        this.date = localDate;
        this.verifyingInstitution = verifyingInstitutionDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPeselRequest)) {
            return false;
        }
        VerifyPeselRequest verifyPeselRequest = (VerifyPeselRequest) other;
        return t.c(this.pesel, verifyPeselRequest.pesel) && t.c(this.seriesAndId, verifyPeselRequest.seriesAndId) && t.c(this.verificationReason, verifyPeselRequest.verificationReason) && t.c(this.date, verifyPeselRequest.date) && t.c(this.verifyingInstitution, verifyPeselRequest.verifyingInstitution);
    }

    public int hashCode() {
        int iHashCode = ((((this.pesel.hashCode() * 31) + this.seriesAndId.hashCode()) * 31) + this.verificationReason.hashCode()) * 31;
        LocalDate localDate = this.date;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        VerifyingInstitutionDto verifyingInstitutionDto = this.verifyingInstitution;
        return iHashCode2 + (verifyingInstitutionDto != null ? verifyingInstitutionDto.hashCode() : 0);
    }

    public String toString() {
        return "VerifyPeselRequest(pesel=" + this.pesel + ", seriesAndId=" + this.seriesAndId + ", verificationReason=" + this.verificationReason + ", date=" + this.date + ", verifyingInstitution=" + this.verifyingInstitution + ')';
    }
}
