package do1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: do1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006!"}, d2 = {"Ldo1/b;", "", "", "firstName", "secondName", "lastName", "number", "numberOfParliamentCadence", "releaseDate", "photo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getSecondName", "c", "d", "e", "f", "g", "h", "names", "deputycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeputyCardContainerData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String numberOfParliamentCadence;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String releaseDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String names;

    public DeputyCardContainerData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.firstName = str;
        this.secondName = str2;
        this.lastName = str3;
        this.number = str4;
        this.numberOfParliamentCadence = str5;
        this.releaseDate = str6;
        this.photo = str7;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        if (str2 != null) {
            sb5.append(" ");
            sb5.append(str2);
        }
        this.names = sb5.toString();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNames() {
        return this.names;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNumberOfParliamentCadence() {
        return this.numberOfParliamentCadence;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeputyCardContainerData)) {
            return false;
        }
        DeputyCardContainerData deputyCardContainerData = (DeputyCardContainerData) other;
        return t.c(this.firstName, deputyCardContainerData.firstName) && t.c(this.secondName, deputyCardContainerData.secondName) && t.c(this.lastName, deputyCardContainerData.lastName) && t.c(this.number, deputyCardContainerData.number) && t.c(this.numberOfParliamentCadence, deputyCardContainerData.numberOfParliamentCadence) && t.c(this.releaseDate, deputyCardContainerData.releaseDate) && t.c(this.photo, deputyCardContainerData.photo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReleaseDate() {
        return this.releaseDate;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.number;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.numberOfParliamentCadence;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.releaseDate;
        return ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.photo.hashCode();
    }

    public String toString() {
        return "DeputyCardContainerData(firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", number=" + this.number + ", numberOfParliamentCadence=" + this.numberOfParliamentCadence + ", releaseDate=" + this.releaseDate + ", photo=" + this.photo + ')';
    }
}
