package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, d2 = {"Lfk0/l;", "", "", "city", "number", "postalCode", "postOfficeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicationPostOfficeBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postOfficeName;

    public BEApplicationPostOfficeBox(String str, String str2, String str3, String str4) {
        this.city = str;
        this.number = str2;
        this.postalCode = str3;
        this.postOfficeName = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPostOfficeName() {
        return this.postOfficeName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicationPostOfficeBox)) {
            return false;
        }
        BEApplicationPostOfficeBox bEApplicationPostOfficeBox = (BEApplicationPostOfficeBox) other;
        return fr.t.c(this.city, bEApplicationPostOfficeBox.city) && fr.t.c(this.number, bEApplicationPostOfficeBox.number) && fr.t.c(this.postalCode, bEApplicationPostOfficeBox.postalCode) && fr.t.c(this.postOfficeName, bEApplicationPostOfficeBox.postOfficeName);
    }

    public int hashCode() {
        int iHashCode = ((((this.city.hashCode() * 31) + this.number.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        String str = this.postOfficeName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BEApplicationPostOfficeBox(city=" + this.city + ", number=" + this.number + ", postalCode=" + this.postalCode + ", postOfficeName=" + this.postOfficeName + ')';
    }
}
