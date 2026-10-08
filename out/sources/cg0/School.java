package cg0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cg0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001b\u0010\r¨\u0006\u001f"}, d2 = {"Lcg0/b;", "", "", "rspo", "name", "headmasterFirstName", "headmasterLastName", "Lcg0/a;", "address", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcg0/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRspo", "b", "d", "c", "e", "Lcg0/a;", "()Lcg0/a;", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class School {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rspo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String headmasterFirstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String headmasterLastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Address address;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    public School(String str, String str2, String str3, String str4, Address address, String str5) {
        this.rspo = str;
        this.name = str2;
        this.headmasterFirstName = str3;
        this.headmasterLastName = str4;
        this.address = address;
        this.phoneNumber = str5;
    }

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
        return t.c(this.rspo, school.rspo) && t.c(this.name, school.name) && t.c(this.headmasterFirstName, school.headmasterFirstName) && t.c(this.headmasterLastName, school.headmasterLastName) && t.c(this.address, school.address) && t.c(this.phoneNumber, school.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.rspo.hashCode() * 31) + this.name.hashCode()) * 31) + this.headmasterFirstName.hashCode()) * 31) + this.headmasterLastName.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.phoneNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "School(rspo=" + this.rspo + ", name=" + this.name + ", headmasterFirstName=" + this.headmasterFirstName + ", headmasterLastName=" + this.headmasterLastName + ", address=" + this.address + ", phoneNumber=" + this.phoneNumber + ")";
    }
}
