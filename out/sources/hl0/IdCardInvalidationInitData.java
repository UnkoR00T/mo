package hl0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hl0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0016\u0019\u001c B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Lhl0/b;", "", "Lhl0/b$a;", "applicantData", "Lhl0/b$b;", "officeData", "Lhl0/b$c;", "officeLink", "Lhl0/b$d;", "parentsData", "<init>", "(Lhl0/b$a;Lhl0/b$b;Lhl0/b$c;Lhl0/b$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/b$a;", "()Lhl0/b$a;", "b", "Lhl0/b$b;", "()Lhl0/b$b;", "c", "Lhl0/b$c;", "getOfficeLink", "()Lhl0/b$c;", "d", "Lhl0/b$d;", "()Lhl0/b$d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdCardInvalidationInitData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApplicantData applicantData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfficeData officeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfficeLink officeLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentsData parentsData;

    /* JADX INFO: renamed from: hl0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010%R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006'"}, d2 = {"Lhl0/b$a;", "", "", "firstName", "secondName", "surname", "Lfz/b$c;", "birthDate", "maidenName", "Liy/b0;", "number", "birthPlace", "series", "issueDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfz/b$c;Ljava/lang/String;Liy/b0;Ljava/lang/String;Liy/b0;Lfz/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "g", "i", "d", "Lfz/b$c;", "()Lfz/b$c;", "e", "f", "Liy/b0;", "()Liy/b0;", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplicantData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String surname;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate birthDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String maidenName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 number;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String birthPlace;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 series;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate issueDate;

        public ApplicantData(String str, String str2, String str3, fz.b.LocalDate localDate, String str4, b0 b0Var, String str5, b0 b0Var2, fz.b.LocalDate localDate2) {
            this.firstName = str;
            this.secondName = str2;
            this.surname = str3;
            this.birthDate = localDate;
            this.maidenName = str4;
            this.number = b0Var;
            this.birthPlace = str5;
            this.series = b0Var2;
            this.issueDate = localDate2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fz.b.LocalDate getBirthDate() {
            return this.birthDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBirthPlace() {
            return this.birthPlace;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final fz.b.LocalDate getIssueDate() {
            return this.issueDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMaidenName() {
            return this.maidenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicantData)) {
                return false;
            }
            ApplicantData applicantData = (ApplicantData) other;
            return t.c(this.firstName, applicantData.firstName) && t.c(this.secondName, applicantData.secondName) && t.c(this.surname, applicantData.surname) && t.c(this.birthDate, applicantData.birthDate) && t.c(this.maidenName, applicantData.maidenName) && t.c(this.number, applicantData.number) && t.c(this.birthPlace, applicantData.birthPlace) && t.c(this.series, applicantData.series) && t.c(this.issueDate, applicantData.issueDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b0 getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSecondName() {
            return this.secondName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getSeries() {
            return this.series;
        }

        public int hashCode() {
            int iHashCode = this.firstName.hashCode() * 31;
            String str = this.secondName;
            return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.surname.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.maidenName.hashCode()) * 31) + this.number.hashCode()) * 31) + this.birthPlace.hashCode()) * 31) + this.series.hashCode()) * 31) + this.issueDate.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSurname() {
            return this.surname;
        }

        public String toString() {
            return "ApplicantData(firstName=" + this.firstName + ", secondName=" + this.secondName + ", surname=" + this.surname + ", birthDate=" + this.birthDate + ", maidenName=" + this.maidenName + ", number=" + this.number + ", birthPlace=" + this.birthPlace + ", series=" + this.series + ", issueDate=" + this.issueDate + ")";
        }
    }

    /* JADX INFO: renamed from: hl0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhl0/b$b;", "", "", "descriptiveOrganizationName", "Liy/b0;", "terytCode", "<init>", "(Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfficeData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String descriptiveOrganizationName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 terytCode;

        public OfficeData(String str, b0 b0Var) {
            this.descriptiveOrganizationName = str;
            this.terytCode = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescriptiveOrganizationName() {
            return this.descriptiveOrganizationName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getTerytCode() {
            return this.terytCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfficeData)) {
                return false;
            }
            OfficeData officeData = (OfficeData) other;
            return t.c(this.descriptiveOrganizationName, officeData.descriptiveOrganizationName) && t.c(this.terytCode, officeData.terytCode);
        }

        public int hashCode() {
            return (this.descriptiveOrganizationName.hashCode() * 31) + this.terytCode.hashCode();
        }

        public String toString() {
            return "OfficeData(descriptiveOrganizationName=" + this.descriptiveOrganizationName + ", terytCode=" + this.terytCode + ")";
        }
    }

    /* JADX INFO: renamed from: hl0.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lhl0/b$c;", "", "", "infoTip", "infoTipDescription", "link", "linkLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInfoTip", "b", "getInfoTipDescription", "c", "getLink", "d", "getLinkLabel", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfficeLink {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String infoTip;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String infoTipDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String link;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String linkLabel;

        public OfficeLink(String str, String str2, String str3, String str4) {
            this.infoTip = str;
            this.infoTipDescription = str2;
            this.link = str3;
            this.linkLabel = str4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfficeLink)) {
                return false;
            }
            OfficeLink officeLink = (OfficeLink) other;
            return t.c(this.infoTip, officeLink.infoTip) && t.c(this.infoTipDescription, officeLink.infoTipDescription) && t.c(this.link, officeLink.link) && t.c(this.linkLabel, officeLink.linkLabel);
        }

        public int hashCode() {
            return (((((this.infoTip.hashCode() * 31) + this.infoTipDescription.hashCode()) * 31) + this.link.hashCode()) * 31) + this.linkLabel.hashCode();
        }

        public String toString() {
            return "OfficeLink(infoTip=" + this.infoTip + ", infoTipDescription=" + this.infoTipDescription + ", link=" + this.link + ", linkLabel=" + this.linkLabel + ")";
        }
    }

    /* JADX INFO: renamed from: hl0.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lhl0/b$d;", "", "", "fathersName", "mothersMaidenName", "mothersName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ParentsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fathersName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mothersMaidenName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mothersName;

        public ParentsData(String str, String str2, String str3) {
            this.fathersName = str;
            this.mothersMaidenName = str2;
            this.mothersName = str3;
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
            if (!(other instanceof ParentsData)) {
                return false;
            }
            ParentsData parentsData = (ParentsData) other;
            return t.c(this.fathersName, parentsData.fathersName) && t.c(this.mothersMaidenName, parentsData.mothersMaidenName) && t.c(this.mothersName, parentsData.mothersName);
        }

        public int hashCode() {
            return (((this.fathersName.hashCode() * 31) + this.mothersMaidenName.hashCode()) * 31) + this.mothersName.hashCode();
        }

        public String toString() {
            return "ParentsData(fathersName=" + this.fathersName + ", mothersMaidenName=" + this.mothersMaidenName + ", mothersName=" + this.mothersName + ")";
        }
    }

    public IdCardInvalidationInitData(ApplicantData applicantData, OfficeData officeData, OfficeLink officeLink, ParentsData parentsData) {
        this.applicantData = applicantData;
        this.officeData = officeData;
        this.officeLink = officeLink;
        this.parentsData = parentsData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ApplicantData getApplicantData() {
        return this.applicantData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OfficeData getOfficeData() {
        return this.officeData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ParentsData getParentsData() {
        return this.parentsData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdCardInvalidationInitData)) {
            return false;
        }
        IdCardInvalidationInitData idCardInvalidationInitData = (IdCardInvalidationInitData) other;
        return t.c(this.applicantData, idCardInvalidationInitData.applicantData) && t.c(this.officeData, idCardInvalidationInitData.officeData) && t.c(this.officeLink, idCardInvalidationInitData.officeLink) && t.c(this.parentsData, idCardInvalidationInitData.parentsData);
    }

    public int hashCode() {
        return (((((this.applicantData.hashCode() * 31) + this.officeData.hashCode()) * 31) + this.officeLink.hashCode()) * 31) + this.parentsData.hashCode();
    }

    public String toString() {
        return "IdCardInvalidationInitData(applicantData=" + this.applicantData + ", officeData=" + this.officeData + ", officeLink=" + this.officeLink + ", parentsData=" + this.parentsData + ")";
    }
}
