package qt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.n0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001c"}, d2 = {"Lqt3/n0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "rspo", "b", "d", "name", "c", "headmasterFirstName", "headmasterLastName", "Lqt3/a;", "e", "Lqt3/a;", "()Lqt3/a;", "address", "phoneNumber", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class School {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rspo")
    private final String rspo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("headmasterFirstName")
    private final String headmasterFirstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("headmasterLastName")
    private final String headmasterLastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final Address address;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHeadmasterFirstName() {
        return this.headmasterFirstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeadmasterLastName() {
        return this.headmasterLastName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof School)) {
            return false;
        }
        School school = (School) other;
        return fr.t.c(this.rspo, school.rspo) && fr.t.c(this.name, school.name) && fr.t.c(this.headmasterFirstName, school.headmasterFirstName) && fr.t.c(this.headmasterLastName, school.headmasterLastName) && fr.t.c(this.address, school.address) && fr.t.c(this.phoneNumber, school.phoneNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRspo() {
        return this.rspo;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.rspo.hashCode() * 31) + this.name.hashCode()) * 31) + this.headmasterFirstName.hashCode()) * 31) + this.headmasterLastName.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.phoneNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "School(rspo=" + this.rspo + ", name=" + this.name + ", headmasterFirstName=" + this.headmasterFirstName + ", headmasterLastName=" + this.headmasterLastName + ", address=" + this.address + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
