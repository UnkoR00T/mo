package yn0;

import fr.t;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yn0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u000e\u0010\u0004¨\u0006("}, d2 = {"Lyn0/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lyn0/o;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "committees", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "electionActionDate", "Ljava/lang/String;", "d", "electionActionId", "e", "electionActionName", "Lyn0/f;", "Lyn0/f;", "f", "()Lyn0/f;", "electionActionType", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "g", "()Ljava/time/OffsetDateTime;", "supportDeadline", "committeeSubjectDistrictName", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvailableElectionSupportsResponsePossibleElectionSupportDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committees")
    private final List<PossibleElectionSupportDtoElectionCommitteeDto> committees;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionActionDate")
    private final LocalDate electionActionDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionActionId")
    private final String electionActionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionActionName")
    private final String electionActionName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionActionType")
    private final f electionActionType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("supportDeadline")
    private final OffsetDateTime supportDeadline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeSubjectDistrictName")
    private final String committeeSubjectDistrictName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommitteeSubjectDistrictName() {
        return this.committeeSubjectDistrictName;
    }

    public final List<PossibleElectionSupportDtoElectionCommitteeDto> b() {
        return this.committees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getElectionActionDate() {
        return this.electionActionDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getElectionActionId() {
        return this.electionActionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getElectionActionName() {
        return this.electionActionName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableElectionSupportsResponsePossibleElectionSupportDto)) {
            return false;
        }
        AvailableElectionSupportsResponsePossibleElectionSupportDto availableElectionSupportsResponsePossibleElectionSupportDto = (AvailableElectionSupportsResponsePossibleElectionSupportDto) other;
        return t.c(this.committees, availableElectionSupportsResponsePossibleElectionSupportDto.committees) && t.c(this.electionActionDate, availableElectionSupportsResponsePossibleElectionSupportDto.electionActionDate) && t.c(this.electionActionId, availableElectionSupportsResponsePossibleElectionSupportDto.electionActionId) && t.c(this.electionActionName, availableElectionSupportsResponsePossibleElectionSupportDto.electionActionName) && this.electionActionType == availableElectionSupportsResponsePossibleElectionSupportDto.electionActionType && t.c(this.supportDeadline, availableElectionSupportsResponsePossibleElectionSupportDto.supportDeadline) && t.c(this.committeeSubjectDistrictName, availableElectionSupportsResponsePossibleElectionSupportDto.committeeSubjectDistrictName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getElectionActionType() {
        return this.electionActionType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final OffsetDateTime getSupportDeadline() {
        return this.supportDeadline;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.committees.hashCode() * 31) + this.electionActionDate.hashCode()) * 31) + this.electionActionId.hashCode()) * 31) + this.electionActionName.hashCode()) * 31) + this.electionActionType.hashCode()) * 31) + this.supportDeadline.hashCode()) * 31;
        String str = this.committeeSubjectDistrictName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AvailableElectionSupportsResponsePossibleElectionSupportDto(committees=" + this.committees + ", electionActionDate=" + this.electionActionDate + ", electionActionId=" + this.electionActionId + ", electionActionName=" + this.electionActionName + ", electionActionType=" + this.electionActionType + ", supportDeadline=" + this.supportDeadline + ", committeeSubjectDistrictName=" + this.committeeSubjectDistrictName + ')';
    }
}
