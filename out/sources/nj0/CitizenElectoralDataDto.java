package nj0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006$"}, d2 = {"Lnj0/h;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnj0/g;", "a", "Lnj0/g;", "()Lnj0/g;", "citizen", "Lnj0/n0;", "b", "Lnj0/n0;", "e", "()Lnj0/n0;", "voteRight", "", "Lnj0/n;", "c", "Ljava/util/List;", "()Ljava/util/List;", "districts", "Lnj0/p;", "d", "electionsAreas", "Lnj0/j0;", "Lnj0/j0;", "()Lnj0/j0;", "registeredArea", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CitizenElectoralDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("citizen")
    private final CitizenDto citizen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("voteRight")
    private final VoteRightDto voteRight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("districts")
    private final List<DistrictDto> districts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electionsAreas")
    private final List<ElectionsAreaDto> electionsAreas;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registeredArea")
    private final RegisteredAreaDto registeredArea;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CitizenDto getCitizen() {
        return this.citizen;
    }

    public final List<DistrictDto> b() {
        return this.districts;
    }

    public final List<ElectionsAreaDto> c() {
        return this.electionsAreas;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RegisteredAreaDto getRegisteredArea() {
        return this.registeredArea;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VoteRightDto getVoteRight() {
        return this.voteRight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenElectoralDataDto)) {
            return false;
        }
        CitizenElectoralDataDto citizenElectoralDataDto = (CitizenElectoralDataDto) other;
        return fr.t.c(this.citizen, citizenElectoralDataDto.citizen) && fr.t.c(this.voteRight, citizenElectoralDataDto.voteRight) && fr.t.c(this.districts, citizenElectoralDataDto.districts) && fr.t.c(this.electionsAreas, citizenElectoralDataDto.electionsAreas) && fr.t.c(this.registeredArea, citizenElectoralDataDto.registeredArea);
    }

    public int hashCode() {
        int iHashCode = ((this.citizen.hashCode() * 31) + this.voteRight.hashCode()) * 31;
        List<DistrictDto> list = this.districts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ElectionsAreaDto> list2 = this.electionsAreas;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        RegisteredAreaDto registeredAreaDto = this.registeredArea;
        return iHashCode3 + (registeredAreaDto != null ? registeredAreaDto.hashCode() : 0);
    }

    public String toString() {
        return "CitizenElectoralDataDto(citizen=" + this.citizen + ", voteRight=" + this.voteRight + ", districts=" + this.districts + ", electionsAreas=" + this.electionsAreas + ", registeredArea=" + this.registeredArea + ')';
    }
}
