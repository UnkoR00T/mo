package qv0;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qv0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b!\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001a\u0010+¨\u0006,"}, d2 = {"Lqv0/g;", "", "", "penaltyPoints", "", "conclusion", "registrationAuthority", "Ljava/time/OffsetDateTime;", "violationDate", "Lqv0/d;", "penaltyPointsVehicle", "Lqv0/h;", "violationPlace", "", "Lqv0/a;", "actList", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Lqv0/d;Lqv0/h;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "e", "d", "Ljava/time/OffsetDateTime;", "f", "()Ljava/time/OffsetDateTime;", "Lqv0/d;", "()Lqv0/d;", "Lqv0/h;", "g", "()Lqv0/h;", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Violation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer penaltyPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String conclusion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registrationAuthority;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime violationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PenaltyPointsVehicle penaltyPointsVehicle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ViolationPlace violationPlace;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Act> actList;

    public Violation(Integer num, String str, String str2, OffsetDateTime offsetDateTime, PenaltyPointsVehicle penaltyPointsVehicle, ViolationPlace violationPlace, List<Act> list) {
        this.penaltyPoints = num;
        this.conclusion = str;
        this.registrationAuthority = str2;
        this.violationDate = offsetDateTime;
        this.penaltyPointsVehicle = penaltyPointsVehicle;
        this.violationPlace = violationPlace;
        this.actList = list;
    }

    public final List<Act> a() {
        return this.actList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConclusion() {
        return this.conclusion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getPenaltyPoints() {
        return this.penaltyPoints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PenaltyPointsVehicle getPenaltyPointsVehicle() {
        return this.penaltyPointsVehicle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Violation)) {
            return false;
        }
        Violation violation = (Violation) other;
        return t.c(this.penaltyPoints, violation.penaltyPoints) && t.c(this.conclusion, violation.conclusion) && t.c(this.registrationAuthority, violation.registrationAuthority) && t.c(this.violationDate, violation.violationDate) && t.c(this.penaltyPointsVehicle, violation.penaltyPointsVehicle) && t.c(this.violationPlace, violation.violationPlace) && t.c(this.actList, violation.actList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getViolationDate() {
        return this.violationDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ViolationPlace getViolationPlace() {
        return this.violationPlace;
    }

    public int hashCode() {
        Integer num = this.penaltyPoints;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.conclusion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registrationAuthority;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.violationDate;
        int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        PenaltyPointsVehicle penaltyPointsVehicle = this.penaltyPointsVehicle;
        int iHashCode5 = (iHashCode4 + (penaltyPointsVehicle == null ? 0 : penaltyPointsVehicle.hashCode())) * 31;
        ViolationPlace violationPlace = this.violationPlace;
        int iHashCode6 = (iHashCode5 + (violationPlace == null ? 0 : violationPlace.hashCode())) * 31;
        List<Act> list = this.actList;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Violation(penaltyPoints=" + this.penaltyPoints + ", conclusion=" + this.conclusion + ", registrationAuthority=" + this.registrationAuthority + ", violationDate=" + this.violationDate + ", penaltyPointsVehicle=" + this.penaltyPointsVehicle + ", violationPlace=" + this.violationPlace + ", actList=" + this.actList + ")";
    }
}
