package cj0;

import fr.t;
import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cj0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006 "}, d2 = {"Lcj0/h;", "", "", "id", "", "name", "postcode", "city", "street", "buildingNumber", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "Ljava/lang/String;", "e", "c", "f", "g", "bottomSheetAddress", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusEVisitDepartment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postcode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    public ZusEVisitDepartment(long j15, String str, String str2, String str3, String str4, String str5) {
        this.id = j15;
        this.name = str;
        this.postcode = str2;
        this.city = str3;
        this.street = str4;
        this.buildingNumber = str5;
    }

    public final String a() {
        StringBuilder sb5 = new StringBuilder();
        String str = this.postcode;
        if (r.t0(str)) {
            str = "-";
        }
        sb5.append(((Object) str) + " ");
        String str2 = this.city;
        if (r.t0(str2)) {
            str2 = "-";
        }
        sb5.append(((Object) str2) + ", ");
        String str3 = this.street;
        if (r.t0(str3)) {
            str3 = "-";
        }
        sb5.append(((Object) str3) + " ");
        String str4 = this.buildingNumber;
        sb5.append(r.t0(str4) ? "-" : str4);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusEVisitDepartment)) {
            return false;
        }
        ZusEVisitDepartment zusEVisitDepartment = (ZusEVisitDepartment) other;
        return this.id == zusEVisitDepartment.id && t.c(this.name, zusEVisitDepartment.name) && t.c(this.postcode, zusEVisitDepartment.postcode) && t.c(this.city, zusEVisitDepartment.city) && t.c(this.street, zusEVisitDepartment.street) && t.c(this.buildingNumber, zusEVisitDepartment.buildingNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.postcode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.street.hashCode()) * 31) + this.buildingNumber.hashCode();
    }

    public String toString() {
        return "ZusEVisitDepartment(id=" + this.id + ", name=" + this.name + ", postcode=" + this.postcode + ", city=" + this.city + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ")";
    }
}
