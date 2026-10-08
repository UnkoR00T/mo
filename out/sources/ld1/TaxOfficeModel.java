package ld1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ld1.r, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, d2 = {"Lld1/r;", "", "", "buildingNumber", "city", "name", "postalCode", "streetName", "headName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxOfficeModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String headName;

    public TaxOfficeModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.buildingNumber = str;
        this.city = str2;
        this.name = str3;
        this.postalCode = str4;
        this.streetName = str5;
        this.headName = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeadName() {
        return this.headName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxOfficeModel)) {
            return false;
        }
        TaxOfficeModel taxOfficeModel = (TaxOfficeModel) other;
        return t.c(this.buildingNumber, taxOfficeModel.buildingNumber) && t.c(this.city, taxOfficeModel.city) && t.c(this.name, taxOfficeModel.name) && t.c(this.postalCode, taxOfficeModel.postalCode) && t.c(this.streetName, taxOfficeModel.streetName) && t.c(this.headName, taxOfficeModel.headName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    public int hashCode() {
        return (((((((((this.buildingNumber.hashCode() * 31) + this.city.hashCode()) * 31) + this.name.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.streetName.hashCode()) * 31) + this.headName.hashCode();
    }

    public String toString() {
        return "TaxOfficeModel(buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", name=" + this.name + ", postalCode=" + this.postalCode + ", streetName=" + this.streetName + ", headName=" + this.headName + ')';
    }
}
