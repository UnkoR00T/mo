package yi0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yi0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lyi0/c;", "", "Lyi0/a;", "citizen", "Lyi0/j;", "voteRight", "", "Lyi0/d;", "districts", "Lyi0/f;", "registeredArea", "Lyi0/e;", "electionsAreas", "<init>", "(Lyi0/a;Lyi0/j;Ljava/util/List;Lyi0/f;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyi0/a;", "()Lyi0/a;", "b", "Lyi0/j;", "e", "()Lyi0/j;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lyi0/f;", "()Lyi0/f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CitizenElectoralData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Citizen citizen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VoteRight voteRight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<District> districts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RegisteredArea registeredArea;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ElectionsArea> electionsAreas;

    public CitizenElectoralData(Citizen citizen, VoteRight voteRight, List<District> list, RegisteredArea registeredArea, List<ElectionsArea> list2) {
        this.citizen = citizen;
        this.voteRight = voteRight;
        this.districts = list;
        this.registeredArea = registeredArea;
        this.electionsAreas = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Citizen getCitizen() {
        return this.citizen;
    }

    public final List<District> b() {
        return this.districts;
    }

    public final List<ElectionsArea> c() {
        return this.electionsAreas;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RegisteredArea getRegisteredArea() {
        return this.registeredArea;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VoteRight getVoteRight() {
        return this.voteRight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenElectoralData)) {
            return false;
        }
        CitizenElectoralData citizenElectoralData = (CitizenElectoralData) other;
        return t.c(this.citizen, citizenElectoralData.citizen) && t.c(this.voteRight, citizenElectoralData.voteRight) && t.c(this.districts, citizenElectoralData.districts) && t.c(this.registeredArea, citizenElectoralData.registeredArea) && t.c(this.electionsAreas, citizenElectoralData.electionsAreas);
    }

    public int hashCode() {
        int iHashCode = ((this.citizen.hashCode() * 31) + this.voteRight.hashCode()) * 31;
        List<District> list = this.districts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        RegisteredArea registeredArea = this.registeredArea;
        int iHashCode3 = (iHashCode2 + (registeredArea == null ? 0 : registeredArea.hashCode())) * 31;
        List<ElectionsArea> list2 = this.electionsAreas;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "CitizenElectoralData(citizen=" + this.citizen + ", voteRight=" + this.voteRight + ", districts=" + this.districts + ", registeredArea=" + this.registeredArea + ", electionsAreas=" + this.electionsAreas + ")";
    }
}
