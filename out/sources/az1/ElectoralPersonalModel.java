package az1;

import java.util.List;
import p071kotlin.Metadata;
import yi0.Citizen;
import yi0.District;
import yi0.RegisteredArea;

/* JADX INFO: renamed from: az1.t, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$¨\u0006%"}, d2 = {"Laz1/t;", "", "Lyi0/a;", "citizen", "", "Lyi0/d;", "districts", "Lyi0/f;", "registeredArea", "", "electionsAreaNumber", "", "hasInactiveVoteRights", "<init>", "(Lyi0/a;Ljava/util/List;Lyi0/f;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyi0/a;", "()Lyi0/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lyi0/f;", "e", "()Lyi0/f;", "d", "Ljava/lang/String;", "Z", "()Z", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectoralPersonalModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Citizen citizen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<District> districts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final RegisteredArea registeredArea;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electionsAreaNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasInactiveVoteRights;

    public ElectoralPersonalModel(Citizen citizen, List<District> list, RegisteredArea registeredArea, String str, boolean z15) {
        this.citizen = citizen;
        this.districts = list;
        this.registeredArea = registeredArea;
        this.electionsAreaNumber = str;
        this.hasInactiveVoteRights = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Citizen getCitizen() {
        return this.citizen;
    }

    public final List<District> b() {
        return this.districts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getElectionsAreaNumber() {
        return this.electionsAreaNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasInactiveVoteRights() {
        return this.hasInactiveVoteRights;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RegisteredArea getRegisteredArea() {
        return this.registeredArea;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectoralPersonalModel)) {
            return false;
        }
        ElectoralPersonalModel electoralPersonalModel = (ElectoralPersonalModel) other;
        return fr.t.c(this.citizen, electoralPersonalModel.citizen) && fr.t.c(this.districts, electoralPersonalModel.districts) && fr.t.c(this.registeredArea, electoralPersonalModel.registeredArea) && fr.t.c(this.electionsAreaNumber, electoralPersonalModel.electionsAreaNumber) && this.hasInactiveVoteRights == electoralPersonalModel.hasInactiveVoteRights;
    }

    public int hashCode() {
        int iHashCode = this.citizen.hashCode() * 31;
        List<District> list = this.districts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        RegisteredArea registeredArea = this.registeredArea;
        int iHashCode3 = (iHashCode2 + (registeredArea == null ? 0 : registeredArea.hashCode())) * 31;
        String str = this.electionsAreaNumber;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasInactiveVoteRights);
    }

    public String toString() {
        return "ElectoralPersonalModel(citizen=" + this.citizen + ", districts=" + this.districts + ", registeredArea=" + this.registeredArea + ", electionsAreaNumber=" + this.electionsAreaNumber + ", hasInactiveVoteRights=" + this.hasInactiveVoteRights + ')';
    }
}
