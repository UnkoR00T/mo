package ts0;

import iy.b0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001b\u0010/¨\u00060"}, d2 = {"Lts0/g;", "", "Liy/b0;", "pesel", "Ljava/time/OffsetDateTime;", "verifiedAt", "", "Lts0/h;", "statuses", "", "privatePersonVerification", "", "reason", "Ljava/time/LocalDate;", "verifiedForDate", "Lts0/c;", "institution", "<init>", "(Liy/b0;Ljava/time/OffsetDateTime;Ljava/util/List;ZLjava/lang/String;Ljava/time/LocalDate;Lts0/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Ljava/time/OffsetDateTime;", "e", "()Ljava/time/OffsetDateTime;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Z", "getPrivatePersonVerification", "()Z", "Ljava/lang/String;", "f", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "g", "Lts0/c;", "()Lts0/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime verifiedAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RestrictionCheckStatus> statuses;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean privatePersonVerification;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate verifiedForDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Institution institution;

    public RestrictionCheck(b0 b0Var, OffsetDateTime offsetDateTime, List<RestrictionCheckStatus> list, boolean z15, String str, LocalDate localDate, Institution institution) {
        this.pesel = b0Var;
        this.verifiedAt = offsetDateTime;
        this.statuses = list;
        this.privatePersonVerification = z15;
        this.reason = str;
        this.verifiedForDate = localDate;
        this.institution = institution;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Institution getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final List<RestrictionCheckStatus> d() {
        return this.statuses;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getVerifiedAt() {
        return this.verifiedAt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionCheck)) {
            return false;
        }
        RestrictionCheck restrictionCheck = (RestrictionCheck) other;
        return fr.t.c(this.pesel, restrictionCheck.pesel) && fr.t.c(this.verifiedAt, restrictionCheck.verifiedAt) && fr.t.c(this.statuses, restrictionCheck.statuses) && this.privatePersonVerification == restrictionCheck.privatePersonVerification && fr.t.c(this.reason, restrictionCheck.reason) && fr.t.c(this.verifiedForDate, restrictionCheck.verifiedForDate) && fr.t.c(this.institution, restrictionCheck.institution);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getVerifiedForDate() {
        return this.verifiedForDate;
    }

    public int hashCode() {
        int iHashCode = ((((((this.pesel.hashCode() * 31) + this.verifiedAt.hashCode()) * 31) + this.statuses.hashCode()) * 31) + Boolean.hashCode(this.privatePersonVerification)) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.verifiedForDate;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Institution institution = this.institution;
        return iHashCode3 + (institution != null ? institution.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionCheck(pesel=" + this.pesel + ", verifiedAt=" + this.verifiedAt + ", statuses=" + this.statuses + ", privatePersonVerification=" + this.privatePersonVerification + ", reason=" + this.reason + ", verifiedForDate=" + this.verifiedForDate + ", institution=" + this.institution + ")";
    }
}
