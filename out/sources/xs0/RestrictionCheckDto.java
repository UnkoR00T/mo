package xs0;

import fr.t;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xs0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\f\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006*"}, d2 = {"Lxs0/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "pesel", "Z", "c", "()Z", "privatePersonVerification", "", "Lxs0/g;", "Ljava/util/List;", "e", "()Ljava/util/List;", "statuses", "Ljava/time/OffsetDateTime;", "d", "Ljava/time/OffsetDateTime;", "f", "()Ljava/time/OffsetDateTime;", "verifiedAt", "Lxs0/d;", "Lxs0/d;", "()Lxs0/d;", "institution", "reason", "Ljava/time/LocalDate;", "g", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "verifiedForDate", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionCheckDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("privatePersonVerification")
    private final boolean privatePersonVerification;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statuses")
    private final List<RestrictionCheckStatusDto> statuses;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verifiedAt")
    private final OffsetDateTime verifiedAt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institution")
    private final InstitutionDto institution;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reason")
    private final String reason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verifiedForDate")
    private final LocalDate verifiedForDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InstitutionDto getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPrivatePersonVerification() {
        return this.privatePersonVerification;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final List<RestrictionCheckStatusDto> e() {
        return this.statuses;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionCheckDto)) {
            return false;
        }
        RestrictionCheckDto restrictionCheckDto = (RestrictionCheckDto) other;
        return t.c(this.pesel, restrictionCheckDto.pesel) && this.privatePersonVerification == restrictionCheckDto.privatePersonVerification && t.c(this.statuses, restrictionCheckDto.statuses) && t.c(this.verifiedAt, restrictionCheckDto.verifiedAt) && t.c(this.institution, restrictionCheckDto.institution) && t.c(this.reason, restrictionCheckDto.reason) && t.c(this.verifiedForDate, restrictionCheckDto.verifiedForDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getVerifiedAt() {
        return this.verifiedAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getVerifiedForDate() {
        return this.verifiedForDate;
    }

    public int hashCode() {
        int iHashCode = ((((((this.pesel.hashCode() * 31) + Boolean.hashCode(this.privatePersonVerification)) * 31) + this.statuses.hashCode()) * 31) + this.verifiedAt.hashCode()) * 31;
        InstitutionDto institutionDto = this.institution;
        int iHashCode2 = (iHashCode + (institutionDto == null ? 0 : institutionDto.hashCode())) * 31;
        String str = this.reason;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.verifiedForDate;
        return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionCheckDto(pesel=" + this.pesel + ", privatePersonVerification=" + this.privatePersonVerification + ", statuses=" + this.statuses + ", verifiedAt=" + this.verifiedAt + ", institution=" + this.institution + ", reason=" + this.reason + ", verifiedForDate=" + this.verifiedForDate + ')';
    }
}
