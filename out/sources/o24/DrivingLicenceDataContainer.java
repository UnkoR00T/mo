package o24;

import java.time.LocalDate;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.w, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b#\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b*\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b'\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b,\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b0\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b1\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b+\u0010)R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b2\u0010/R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b%\u0010/¨\u00063"}, d2 = {"Lo24/w;", "", "", "name", "secondName", "surname", "Ljava/time/LocalDate;", "birthday", "birthplace", "dSC", "dS", "", "Lo24/z0;", "tcS", "ldId", "pn", "rD", "eD", "resG", "Lo24/c;", "cat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "l", "c", "m", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "f", "g", "Ljava/util/List;", "n", "()Ljava/util/List;", "i", "j", "k", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceDataContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthday")
    private final LocalDate birthday;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthplace")
    private final String birthplace;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dSC")
    private final String dSC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dS")
    private final String dS;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tcS")
    private final List<StatusChangedReasonContainer> tcS;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("ldId")
    private final String ldId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pn")
    private final String pn;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rD")
    private final LocalDate rD;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("eD")
    private final LocalDate eD;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("resG")
    private final List<String> resG;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cat")
    private final List<CategoryContainer> cat;

    public DrivingLicenceDataContainer() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    public final List<CategoryContainer> c() {
        return this.cat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDS() {
        return this.dS;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDSC() {
        return this.dSC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceDataContainer)) {
            return false;
        }
        DrivingLicenceDataContainer drivingLicenceDataContainer = (DrivingLicenceDataContainer) other;
        return fr.t.c(this.name, drivingLicenceDataContainer.name) && fr.t.c(this.secondName, drivingLicenceDataContainer.secondName) && fr.t.c(this.surname, drivingLicenceDataContainer.surname) && fr.t.c(this.birthday, drivingLicenceDataContainer.birthday) && fr.t.c(this.birthplace, drivingLicenceDataContainer.birthplace) && fr.t.c(this.dSC, drivingLicenceDataContainer.dSC) && fr.t.c(this.dS, drivingLicenceDataContainer.dS) && fr.t.c(this.tcS, drivingLicenceDataContainer.tcS) && fr.t.c(this.ldId, drivingLicenceDataContainer.ldId) && fr.t.c(this.pn, drivingLicenceDataContainer.pn) && fr.t.c(this.rD, drivingLicenceDataContainer.rD) && fr.t.c(this.eD, drivingLicenceDataContainer.eD) && fr.t.c(this.resG, drivingLicenceDataContainer.resG) && fr.t.c(this.cat, drivingLicenceDataContainer.cat);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getED() {
        return this.eD;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLdId() {
        return this.ldId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDate localDate = this.birthday;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str4 = this.birthplace;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dSC;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dS;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<StatusChangedReasonContainer> list = this.tcS;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.ldId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pn;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        LocalDate localDate2 = this.rD;
        int iHashCode11 = (iHashCode10 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.eD;
        int iHashCode12 = (iHashCode11 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        List<String> list2 = this.resG;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CategoryContainer> list3 = this.cat;
        return iHashCode13 + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPn() {
        return this.pn;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final LocalDate getRD() {
        return this.rD;
    }

    public final List<String> k() {
        return this.resG;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public final List<StatusChangedReasonContainer> n() {
        return this.tcS;
    }

    public String toString() {
        return "DrivingLicenceDataContainer(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", birthday=" + this.birthday + ", birthplace=" + this.birthplace + ", dSC=" + this.dSC + ", dS=" + this.dS + ", tcS=" + this.tcS + ", ldId=" + this.ldId + ", pn=" + this.pn + ", rD=" + this.rD + ", eD=" + this.eD + ", resG=" + this.resG + ", cat=" + this.cat + ')';
    }

    public DrivingLicenceDataContainer(String str, String str2, String str3, LocalDate localDate, String str4, String str5, String str6, List<StatusChangedReasonContainer> list, String str7, String str8, LocalDate localDate2, LocalDate localDate3, List<String> list2, List<CategoryContainer> list3) {
        this.name = str;
        this.secondName = str2;
        this.surname = str3;
        this.birthday = localDate;
        this.birthplace = str4;
        this.dSC = str5;
        this.dS = str6;
        this.tcS = list;
        this.ldId = str7;
        this.pn = str8;
        this.rD = localDate2;
        this.eD = localDate3;
        this.resG = list2;
        this.cat = list3;
    }

    public /* synthetic */ DrivingLicenceDataContainer(String str, String str2, String str3, LocalDate localDate, String str4, String str5, String str6, List list, String str7, String str8, LocalDate localDate2, LocalDate localDate3, List list2, List list3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : localDate, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : str5, (i15 & 64) != 0 ? null : str6, (i15 & 128) != 0 ? null : list, (i15 & 256) != 0 ? null : str7, (i15 & 512) != 0 ? null : str8, (i15 & 1024) != 0 ? null : localDate2, (i15 & 2048) != 0 ? null : localDate3, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : list2, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : list3);
    }
}
