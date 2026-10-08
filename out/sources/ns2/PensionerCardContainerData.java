package ns2;

import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ns2.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b \u0010\u0010R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010¨\u0006)"}, d2 = {"Lns2/d;", "", "", "number", "firstName", "secondName", "lastName", "pesel", "type", "Ljava/util/Date;", "expiredDate", "department", "photo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "getFirstName", "c", "getSecondName", "e", "f", "g", "Ljava/util/Date;", "()Ljava/util/Date;", "h", "getDepartment", "i", "j", "names", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PensionerCardContainerData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expiredDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String department;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String names;

    public PensionerCardContainerData(String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7, String str8) {
        this.number = str;
        this.firstName = str2;
        this.secondName = str3;
        this.lastName = str4;
        this.pesel = str5;
        this.type = str6;
        this.expiredDate = date;
        this.department = str7;
        this.photo = str8;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        if (str3 != null) {
            sb5.append(" ");
            sb5.append(str3);
        }
        this.names = sb5.toString();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNames() {
        return this.names;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PensionerCardContainerData)) {
            return false;
        }
        PensionerCardContainerData pensionerCardContainerData = (PensionerCardContainerData) other;
        return t.c(this.number, pensionerCardContainerData.number) && t.c(this.firstName, pensionerCardContainerData.firstName) && t.c(this.secondName, pensionerCardContainerData.secondName) && t.c(this.lastName, pensionerCardContainerData.lastName) && t.c(this.pesel, pensionerCardContainerData.pesel) && t.c(this.type, pensionerCardContainerData.type) && t.c(this.expiredDate, pensionerCardContainerData.expiredDate) && t.c(this.department, pensionerCardContainerData.department) && t.c(this.photo, pensionerCardContainerData.photo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pesel;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.expiredDate;
        int iHashCode7 = (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        String str7 = this.department;
        return ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.photo.hashCode();
    }

    public String toString() {
        return "PensionerCardContainerData(number=" + this.number + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", type=" + this.type + ", expiredDate=" + this.expiredDate + ", department=" + this.department + ", photo=" + this.photo + ')';
    }
}
