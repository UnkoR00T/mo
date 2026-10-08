package fw0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.e1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b%\u0010\u0019¨\u0006'"}, d2 = {"Lfw0/e1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "dataCheckTime", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "activePenaltyPoints", "", "Lfw0/e4;", "Ljava/util/List;", "()Ljava/util/List;", "activeViolations", "Lfw0/b1;", "d", "messages", "Lfw0/g1;", "e", "Lfw0/g1;", "()Lfw0/g1;", "personalDetails", "f", "temporaryPenaltyPoints", "g", "temporaryViolations", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PenaltyPointsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataCheckTime")
    private final OffsetDateTime dataCheckTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activePenaltyPoints")
    private final Integer activePenaltyPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activeViolations")
    private final List<ViolationDto> activeViolations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("messages")
    private final List<MessageDto> messages;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("personalDetails")
    private final PersonalDetailsDto personalDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryPenaltyPoints")
    private final Integer temporaryPenaltyPoints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryViolations")
    private final List<ViolationDto> temporaryViolations;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getActivePenaltyPoints() {
        return this.activePenaltyPoints;
    }

    public final List<ViolationDto> b() {
        return this.activeViolations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getDataCheckTime() {
        return this.dataCheckTime;
    }

    public final List<MessageDto> d() {
        return this.messages;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PersonalDetailsDto getPersonalDetails() {
        return this.personalDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenaltyPointsDto)) {
            return false;
        }
        PenaltyPointsDto penaltyPointsDto = (PenaltyPointsDto) other;
        return fr.t.c(this.dataCheckTime, penaltyPointsDto.dataCheckTime) && fr.t.c(this.activePenaltyPoints, penaltyPointsDto.activePenaltyPoints) && fr.t.c(this.activeViolations, penaltyPointsDto.activeViolations) && fr.t.c(this.messages, penaltyPointsDto.messages) && fr.t.c(this.personalDetails, penaltyPointsDto.personalDetails) && fr.t.c(this.temporaryPenaltyPoints, penaltyPointsDto.temporaryPenaltyPoints) && fr.t.c(this.temporaryViolations, penaltyPointsDto.temporaryViolations);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTemporaryPenaltyPoints() {
        return this.temporaryPenaltyPoints;
    }

    public final List<ViolationDto> g() {
        return this.temporaryViolations;
    }

    public int hashCode() {
        int iHashCode = this.dataCheckTime.hashCode() * 31;
        Integer num = this.activePenaltyPoints;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<ViolationDto> list = this.activeViolations;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessageDto> list2 = this.messages;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PersonalDetailsDto personalDetailsDto = this.personalDetails;
        int iHashCode5 = (iHashCode4 + (personalDetailsDto == null ? 0 : personalDetailsDto.hashCode())) * 31;
        Integer num2 = this.temporaryPenaltyPoints;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ViolationDto> list3 = this.temporaryViolations;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "PenaltyPointsDto(dataCheckTime=" + this.dataCheckTime + ", activePenaltyPoints=" + this.activePenaltyPoints + ", activeViolations=" + this.activeViolations + ", messages=" + this.messages + ", personalDetails=" + this.personalDetails + ", temporaryPenaltyPoints=" + this.temporaryPenaltyPoints + ", temporaryViolations=" + this.temporaryViolations + ')';
    }
}
