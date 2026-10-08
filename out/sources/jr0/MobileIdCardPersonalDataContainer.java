package jr0;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jr0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b#\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b\"\u0010\u0010¨\u0006%"}, d2 = {"Ljr0/h;", "", "", "name", "surname", "fatherName", "motherName", "pesel", "Ljava/time/LocalDate;", "birthDate", "citizenship", "picture", "secondName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "h", "c", "d", "f", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "g", "getPicture", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileIdCardPersonalDataContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fatherName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String motherName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate birthDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String citizenship;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picture;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    public MobileIdCardPersonalDataContainer(String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, String str7, String str8) {
        this.name = str;
        this.surname = str2;
        this.fatherName = str3;
        this.motherName = str4;
        this.pesel = str5;
        this.birthDate = localDate;
        this.citizenship = str6;
        this.picture = str7;
        this.secondName = str8;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCitizenship() {
        return this.citizenship;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMotherName() {
        return this.motherName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileIdCardPersonalDataContainer)) {
            return false;
        }
        MobileIdCardPersonalDataContainer mobileIdCardPersonalDataContainer = (MobileIdCardPersonalDataContainer) other;
        return t.c(this.name, mobileIdCardPersonalDataContainer.name) && t.c(this.surname, mobileIdCardPersonalDataContainer.surname) && t.c(this.fatherName, mobileIdCardPersonalDataContainer.fatherName) && t.c(this.motherName, mobileIdCardPersonalDataContainer.motherName) && t.c(this.pesel, mobileIdCardPersonalDataContainer.pesel) && t.c(this.birthDate, mobileIdCardPersonalDataContainer.birthDate) && t.c(this.citizenship, mobileIdCardPersonalDataContainer.citizenship) && t.c(this.picture, mobileIdCardPersonalDataContainer.picture) && t.c(this.secondName, mobileIdCardPersonalDataContainer.secondName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.motherName.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.citizenship.hashCode()) * 31) + this.picture.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MobileIdCardPersonalDataContainer(name=" + this.name + ", surname=" + this.surname + ", fatherName=" + this.fatherName + ", motherName=" + this.motherName + ", pesel=" + this.pesel + ", birthDate=" + this.birthDate + ", citizenship=" + this.citizenship + ", picture=" + this.picture + ", secondName=" + this.secondName + ")";
    }
}
