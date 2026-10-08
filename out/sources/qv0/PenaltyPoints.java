package qv0;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qv0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\"\u0010(R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(¨\u0006,"}, d2 = {"Lqv0/c;", "", "Lqv0/e;", "personalDetails", "", "activePenaltyPoints", "temporaryPenaltyPoints", "Ljava/time/OffsetDateTime;", "dataCheckTime", "", "Lqv0/g;", "activeViolations", "temporaryViolations", "Lqv0/b;", "messages", "<init>", "(Lqv0/e;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqv0/e;", "getPersonalDetails", "()Lqv0/e;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "d", "Ljava/time/OffsetDateTime;", "getDataCheckTime", "()Ljava/time/OffsetDateTime;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", "getMessages", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PenaltyPoints {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalDetails personalDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer activePenaltyPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer temporaryPenaltyPoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dataCheckTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Violation> activeViolations;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Violation> temporaryViolations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Message> messages;

    public PenaltyPoints(PersonalDetails personalDetails, Integer num, Integer num2, OffsetDateTime offsetDateTime, List<Violation> list, List<Violation> list2, List<Message> list3) {
        this.personalDetails = personalDetails;
        this.activePenaltyPoints = num;
        this.temporaryPenaltyPoints = num2;
        this.dataCheckTime = offsetDateTime;
        this.activeViolations = list;
        this.temporaryViolations = list2;
        this.messages = list3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getActivePenaltyPoints() {
        return this.activePenaltyPoints;
    }

    public final List<Violation> b() {
        return this.activeViolations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getTemporaryPenaltyPoints() {
        return this.temporaryPenaltyPoints;
    }

    public final List<Violation> d() {
        return this.temporaryViolations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenaltyPoints)) {
            return false;
        }
        PenaltyPoints penaltyPoints = (PenaltyPoints) other;
        return t.c(this.personalDetails, penaltyPoints.personalDetails) && t.c(this.activePenaltyPoints, penaltyPoints.activePenaltyPoints) && t.c(this.temporaryPenaltyPoints, penaltyPoints.temporaryPenaltyPoints) && t.c(this.dataCheckTime, penaltyPoints.dataCheckTime) && t.c(this.activeViolations, penaltyPoints.activeViolations) && t.c(this.temporaryViolations, penaltyPoints.temporaryViolations) && t.c(this.messages, penaltyPoints.messages);
    }

    public int hashCode() {
        PersonalDetails personalDetails = this.personalDetails;
        int iHashCode = (personalDetails == null ? 0 : personalDetails.hashCode()) * 31;
        Integer num = this.activePenaltyPoints;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.temporaryPenaltyPoints;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.dataCheckTime.hashCode()) * 31;
        List<Violation> list = this.activeViolations;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Violation> list2 = this.temporaryViolations;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Message> list3 = this.messages;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "PenaltyPoints(personalDetails=" + this.personalDetails + ", activePenaltyPoints=" + this.activePenaltyPoints + ", temporaryPenaltyPoints=" + this.temporaryPenaltyPoints + ", dataCheckTime=" + this.dataCheckTime + ", activeViolations=" + this.activeViolations + ", temporaryViolations=" + this.temporaryViolations + ", messages=" + this.messages + ")";
    }
}
