package hb1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hb1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lhb1/f;", "", "", "postalCode", "city", "postOfficeName", "boxNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PostOfficeBoxData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postOfficeName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String boxNumber;

    public PostOfficeBoxData(String str, String str2, String str3, String str4) {
        this.postalCode = str;
        this.city = str2;
        this.postOfficeName = str3;
        this.boxNumber = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBoxNumber() {
        return this.boxNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
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
        if (!(other instanceof PostOfficeBoxData)) {
            return false;
        }
        PostOfficeBoxData postOfficeBoxData = (PostOfficeBoxData) other;
        return t.c(this.postalCode, postOfficeBoxData.postalCode) && t.c(this.city, postOfficeBoxData.city) && t.c(this.postOfficeName, postOfficeBoxData.postOfficeName) && t.c(this.boxNumber, postOfficeBoxData.boxNumber);
    }

    public int hashCode() {
        return (((((this.postalCode.hashCode() * 31) + this.city.hashCode()) * 31) + this.postOfficeName.hashCode()) * 31) + this.boxNumber.hashCode();
    }

    public String toString() {
        return "PostOfficeBoxData(postalCode=" + this.postalCode + ", city=" + this.city + ", postOfficeName=" + this.postOfficeName + ", boxNumber=" + this.boxNumber + ')';
    }
}
