package gm0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lgm0/a0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lgm0/z;", "a", "Ljava/util/List;", "()Ljava/util/List;", "allOffices", "b", "preferredOffices", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationCivilRegistryOfficesResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("allOffices")
    private final List<ChildBirthRegistrationCivilRegistryOfficesOfficeDto> allOffices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("preferredOffices")
    private final List<ChildBirthRegistrationCivilRegistryOfficesOfficeDto> preferredOffices;

    public final List<ChildBirthRegistrationCivilRegistryOfficesOfficeDto> a() {
        return this.allOffices;
    }

    public final List<ChildBirthRegistrationCivilRegistryOfficesOfficeDto> b() {
        return this.preferredOffices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationCivilRegistryOfficesResponse)) {
            return false;
        }
        ChildBirthRegistrationCivilRegistryOfficesResponse childBirthRegistrationCivilRegistryOfficesResponse = (ChildBirthRegistrationCivilRegistryOfficesResponse) other;
        return fr.t.c(this.allOffices, childBirthRegistrationCivilRegistryOfficesResponse.allOffices) && fr.t.c(this.preferredOffices, childBirthRegistrationCivilRegistryOfficesResponse.preferredOffices);
    }

    public int hashCode() {
        return (this.allOffices.hashCode() * 31) + this.preferredOffices.hashCode();
    }

    public String toString() {
        return "ChildBirthRegistrationCivilRegistryOfficesResponse(allOffices=" + this.allOffices + ", preferredOffices=" + this.preferredOffices + ')';
    }
}
