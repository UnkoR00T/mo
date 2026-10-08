package yn0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yn0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lyn0/o;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "committeeId", "b", "committeeName", "c", "committeeNameAddress", "d", "committeeSubjectElectionDistrictId", "e", "committeeSubjectId", "f", "committeeSubjectName", "g", "committeeSubjectType", "electoralsupportservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PossibleElectionSupportDtoElectionCommitteeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeId")
    private final String committeeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeName")
    private final String committeeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeNameAddress")
    private final String committeeNameAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeSubjectElectionDistrictId")
    private final String committeeSubjectElectionDistrictId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeSubjectId")
    private final String committeeSubjectId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeSubjectName")
    private final String committeeSubjectName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("committeeSubjectType")
    private final String committeeSubjectType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommitteeId() {
        return this.committeeId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommitteeName() {
        return this.committeeName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCommitteeNameAddress() {
        return this.committeeNameAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCommitteeSubjectElectionDistrictId() {
        return this.committeeSubjectElectionDistrictId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCommitteeSubjectId() {
        return this.committeeSubjectId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PossibleElectionSupportDtoElectionCommitteeDto)) {
            return false;
        }
        PossibleElectionSupportDtoElectionCommitteeDto possibleElectionSupportDtoElectionCommitteeDto = (PossibleElectionSupportDtoElectionCommitteeDto) other;
        return t.c(this.committeeId, possibleElectionSupportDtoElectionCommitteeDto.committeeId) && t.c(this.committeeName, possibleElectionSupportDtoElectionCommitteeDto.committeeName) && t.c(this.committeeNameAddress, possibleElectionSupportDtoElectionCommitteeDto.committeeNameAddress) && t.c(this.committeeSubjectElectionDistrictId, possibleElectionSupportDtoElectionCommitteeDto.committeeSubjectElectionDistrictId) && t.c(this.committeeSubjectId, possibleElectionSupportDtoElectionCommitteeDto.committeeSubjectId) && t.c(this.committeeSubjectName, possibleElectionSupportDtoElectionCommitteeDto.committeeSubjectName) && t.c(this.committeeSubjectType, possibleElectionSupportDtoElectionCommitteeDto.committeeSubjectType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCommitteeSubjectName() {
        return this.committeeSubjectName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCommitteeSubjectType() {
        return this.committeeSubjectType;
    }

    public int hashCode() {
        return (((((((((((this.committeeId.hashCode() * 31) + this.committeeName.hashCode()) * 31) + this.committeeNameAddress.hashCode()) * 31) + this.committeeSubjectElectionDistrictId.hashCode()) * 31) + this.committeeSubjectId.hashCode()) * 31) + this.committeeSubjectName.hashCode()) * 31) + this.committeeSubjectType.hashCode();
    }

    public String toString() {
        return "PossibleElectionSupportDtoElectionCommitteeDto(committeeId=" + this.committeeId + ", committeeName=" + this.committeeName + ", committeeNameAddress=" + this.committeeNameAddress + ", committeeSubjectElectionDistrictId=" + this.committeeSubjectElectionDistrictId + ", committeeSubjectId=" + this.committeeSubjectId + ", committeeSubjectName=" + this.committeeSubjectName + ", committeeSubjectType=" + this.committeeSubjectType + ')';
    }
}
