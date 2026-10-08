package al0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Lal0/f;", "", "", "personalId", "Lal0/f$a;", "basicInfo", "Lal0/f$b;", "parentInfo", "<init>", "(Ljava/lang/String;Lal0/f$a;Lal0/f$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lal0/f$a;", "()Lal0/f$a;", "Lal0/f$b;", "()Lal0/f$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicantDataResultData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String personalId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BasicInfo basicInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentInfo parentInfo;

    /* JADX INFO: renamed from: al0.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\"\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b\u001e\u0010,R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b&\u0010\u0014¨\u0006-"}, d2 = {"Lal0/f$a;", "", "", "firstName", "secondName", "surname", "familyName", "Lxw/g;", "pesel", "placeOfBirth", "", "age", "Lal0/e$a;", "gender", "Ljava/time/LocalDate;", "dateOfBirth", "nationality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Liy/b0;Ljava/lang/String;ILal0/e$a;Ljava/time/LocalDate;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "i", "c", "j", "e", "Liy/b0;", "g", "()Liy/b0;", "f", "h", "I", "Lal0/e$a;", "()Lal0/e$a;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BasicInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String surname;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String familyName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 pesel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeOfBirth;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int age;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicantDataModel.a gender;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate dateOfBirth;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nationality;

        public /* synthetic */ BasicInfo(String str, String str2, String str3, String str4, iy.b0 b0Var, String str5, int i15, ApplicantDataModel.a aVar, LocalDate localDate, String str6, fr.k kVar) {
            this(str, str2, str3, str4, b0Var, str5, i15, aVar, localDate, str6);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAge() {
            return this.age;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDateOfBirth() {
            return this.dateOfBirth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFamilyName() {
            return this.familyName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ApplicantDataModel.a getGender() {
            return this.gender;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicInfo)) {
                return false;
            }
            BasicInfo basicInfo = (BasicInfo) other;
            return fr.t.c(this.firstName, basicInfo.firstName) && fr.t.c(this.secondName, basicInfo.secondName) && fr.t.c(this.surname, basicInfo.surname) && fr.t.c(this.familyName, basicInfo.familyName) && xw.g.f(this.pesel, basicInfo.pesel) && fr.t.c(this.placeOfBirth, basicInfo.placeOfBirth) && this.age == basicInfo.age && this.gender == basicInfo.gender && fr.t.c(this.dateOfBirth, basicInfo.dateOfBirth) && fr.t.c(this.nationality, basicInfo.nationality);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getNationality() {
            return this.nationality;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final iy.b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPlaceOfBirth() {
            return this.placeOfBirth;
        }

        public int hashCode() {
            int iHashCode = this.firstName.hashCode() * 31;
            String str = this.secondName;
            return ((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.surname.hashCode()) * 31) + this.familyName.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + this.placeOfBirth.hashCode()) * 31) + Integer.hashCode(this.age)) * 31) + this.gender.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.nationality.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSecondName() {
            return this.secondName;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSurname() {
            return this.surname;
        }

        public String toString() {
            return "BasicInfo(firstName=" + this.firstName + ", secondName=" + this.secondName + ", surname=" + this.surname + ", familyName=" + this.familyName + ", pesel=" + xw.g.i(this.pesel) + ", placeOfBirth=" + this.placeOfBirth + ", age=" + this.age + ", gender=" + this.gender + ", dateOfBirth=" + this.dateOfBirth + ", nationality=" + this.nationality + ")";
        }

        private BasicInfo(String str, String str2, String str3, String str4, iy.b0 b0Var, String str5, int i15, ApplicantDataModel.a aVar, LocalDate localDate, String str6) {
            this.firstName = str;
            this.secondName = str2;
            this.surname = str3;
            this.familyName = str4;
            this.pesel = b0Var;
            this.placeOfBirth = str5;
            this.age = i15;
            this.gender = aVar;
            this.dateOfBirth = localDate;
            this.nationality = str6;
        }
    }

    /* JADX INFO: renamed from: al0.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lal0/f$b;", "", "", "fathersName", "mothersName", "mothersMaidenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ParentInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fathersName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mothersName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mothersMaidenName;

        public ParentInfo(String str, String str2, String str3) {
            this.fathersName = str;
            this.mothersName = str2;
            this.mothersMaidenName = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFathersName() {
            return this.fathersName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMothersMaidenName() {
            return this.mothersMaidenName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMothersName() {
            return this.mothersName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParentInfo)) {
                return false;
            }
            ParentInfo parentInfo = (ParentInfo) other;
            return fr.t.c(this.fathersName, parentInfo.fathersName) && fr.t.c(this.mothersName, parentInfo.mothersName) && fr.t.c(this.mothersMaidenName, parentInfo.mothersMaidenName);
        }

        public int hashCode() {
            return (((this.fathersName.hashCode() * 31) + this.mothersName.hashCode()) * 31) + this.mothersMaidenName.hashCode();
        }

        public String toString() {
            return "ParentInfo(fathersName=" + this.fathersName + ", mothersName=" + this.mothersName + ", mothersMaidenName=" + this.mothersMaidenName + ")";
        }
    }

    public ApplicantDataResultData(String str, BasicInfo basicInfo, ParentInfo parentInfo) {
        this.personalId = str;
        this.basicInfo = basicInfo;
        this.parentInfo = parentInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ParentInfo getParentInfo() {
        return this.parentInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPersonalId() {
        return this.personalId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicantDataResultData)) {
            return false;
        }
        ApplicantDataResultData applicantDataResultData = (ApplicantDataResultData) other;
        return fr.t.c(this.personalId, applicantDataResultData.personalId) && fr.t.c(this.basicInfo, applicantDataResultData.basicInfo) && fr.t.c(this.parentInfo, applicantDataResultData.parentInfo);
    }

    public int hashCode() {
        return (((this.personalId.hashCode() * 31) + this.basicInfo.hashCode()) * 31) + this.parentInfo.hashCode();
    }

    public String toString() {
        return "ApplicantDataResultData(personalId=" + this.personalId + ", basicInfo=" + this.basicInfo + ", parentInfo=" + this.parentInfo + ")";
    }
}
