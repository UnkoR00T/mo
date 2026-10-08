package vh2;

import fr.t;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vh2.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0004¨\u0006,"}, d2 = {"Lvh2/d;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "birthDate", "c", "birthPlace", "birthCountry", "d", "n", "sex", "e", "h", "nationality", "f", "expiryDate", "g", "k", "refugeeStatus", "j", "picture", "firstName", "m", "secondName", "l", "o", "surname", "id", "familyName", "p", "i", "pesel", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("bD")
    private final String birthDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("bP")
    private final String birthPlace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("bC")
    private final String birthCountry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sex")
    private final String sex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("ntl")
    private final String nationality;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pIdCED")
    private final String expiryDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("frS")
    private final String refugeeStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pic")
    private final String picture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("n")
    private final String firstName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("s")
    private final String secondName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("su")
    private final String surname;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pIdCN")
    private final String id;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fN")
    private final String familyName;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("p")
    private final String pesel;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBirthCountry() {
        return this.birthCountry;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeData)) {
            return false;
        }
        RefugeeData refugeeData = (RefugeeData) other;
        return t.c(this.birthDate, refugeeData.birthDate) && t.c(this.birthPlace, refugeeData.birthPlace) && t.c(this.birthCountry, refugeeData.birthCountry) && t.c(this.sex, refugeeData.sex) && t.c(this.nationality, refugeeData.nationality) && t.c(this.expiryDate, refugeeData.expiryDate) && t.c(this.refugeeStatus, refugeeData.refugeeStatus) && t.c(this.picture, refugeeData.picture) && t.c(this.firstName, refugeeData.firstName) && t.c(this.secondName, refugeeData.secondName) && t.c(this.surname, refugeeData.surname) && t.c(this.id, refugeeData.id) && t.c(this.familyName, refugeeData.familyName) && t.c(this.pesel, refugeeData.pesel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    public int hashCode() {
        String str = this.birthDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.birthPlace;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthCountry;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sex;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.expiryDate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.refugeeStatus;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.picture;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.secondName;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.surname;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.id;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.familyName;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.pesel;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRefugeeStatus() {
        return this.refugeeStatus;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "RefugeeData(birthDate=" + this.birthDate + ", birthPlace=" + this.birthPlace + ", birthCountry=" + this.birthCountry + ", sex=" + this.sex + ", nationality=" + this.nationality + ", expiryDate=" + this.expiryDate + ", refugeeStatus=" + this.refugeeStatus + ", picture=" + this.picture + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", surname=" + this.surname + ", id=" + this.id + ", familyName=" + this.familyName + ", pesel=" + this.pesel + ')';
    }
}
