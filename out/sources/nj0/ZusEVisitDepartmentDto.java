package nj0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.q0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001c"}, d2 = {"Lnj0/q0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "buildingNumber", "b", "city", "", "c", "J", "()J", "id", "d", "name", "e", "postcode", "f", "street", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusEVisitDepartmentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("buildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final long id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusEVisitDepartmentDto)) {
            return false;
        }
        ZusEVisitDepartmentDto zusEVisitDepartmentDto = (ZusEVisitDepartmentDto) other;
        return fr.t.c(this.buildingNumber, zusEVisitDepartmentDto.buildingNumber) && fr.t.c(this.city, zusEVisitDepartmentDto.city) && this.id == zusEVisitDepartmentDto.id && fr.t.c(this.name, zusEVisitDepartmentDto.name) && fr.t.c(this.postcode, zusEVisitDepartmentDto.postcode) && fr.t.c(this.street, zusEVisitDepartmentDto.street);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        return (((((((((this.buildingNumber.hashCode() * 31) + this.city.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.postcode.hashCode()) * 31) + this.street.hashCode();
    }

    public String toString() {
        return "ZusEVisitDepartmentDto(buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", id=" + this.id + ", name=" + this.name + ", postcode=" + this.postcode + ", street=" + this.street + ')';
    }
}
