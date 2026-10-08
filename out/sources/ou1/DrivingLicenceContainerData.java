package ou1;

import er.l;
import fr.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: ou1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001$B¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b)\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b-\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b0\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010+R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b,\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b7\u0010\u001bR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b.\u0010+¨\u00069"}, d2 = {"Lou1/e;", "", "", "name", "surname", "Ljava/time/LocalDate;", "birthday", "birthplace", "documentState", "documentStateCode", "longDocumentId", "formNumber", "releaseDate", "", "restrictions", "Lou1/c;", "categories", "secondName", "Lou1/i;", "statusChangedReasons", "expiredDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/time/LocalDate;)V", "", "q", "()Z", "h", "()Ljava/lang/String;", "p", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", "o", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "d", "e", "f", "getDocumentStateCode", "g", "j", "i", "l", "Ljava/util/List;", "m", "()Ljava/util/List;", "n", "getStatusChangedReasons", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceContainerData {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f150129p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate birthday;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthplace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentStateCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String longDocumentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate releaseDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> restrictions;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicenceCategory> categories;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicenceStatusChangedReason> statusChangedReasons;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expiredDate;

    public DrivingLicenceContainerData(String str, String str2, LocalDate localDate, String str3, String str4, String str5, String str6, String str7, LocalDate localDate2, List<String> list, List<DrivingLicenceCategory> list2, String str8, List<DrivingLicenceStatusChangedReason> list3, LocalDate localDate3) {
        this.name = str;
        this.surname = str2;
        this.birthday = localDate;
        this.birthplace = str3;
        this.documentState = str4;
        this.documentStateCode = str5;
        this.longDocumentId = str6;
        this.formNumber = str7;
        this.releaseDate = localDate2;
        this.restrictions = list;
        this.categories = list2;
        this.secondName = str8;
        this.statusChangedReasons = list3;
        this.expiredDate = localDate3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    public final List<DrivingLicenceCategory> d() {
        return this.categories;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentState() {
        return this.documentState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceContainerData)) {
            return false;
        }
        DrivingLicenceContainerData drivingLicenceContainerData = (DrivingLicenceContainerData) other;
        return t.c(this.name, drivingLicenceContainerData.name) && t.c(this.surname, drivingLicenceContainerData.surname) && t.c(this.birthday, drivingLicenceContainerData.birthday) && t.c(this.birthplace, drivingLicenceContainerData.birthplace) && t.c(this.documentState, drivingLicenceContainerData.documentState) && t.c(this.documentStateCode, drivingLicenceContainerData.documentStateCode) && t.c(this.longDocumentId, drivingLicenceContainerData.longDocumentId) && t.c(this.formNumber, drivingLicenceContainerData.formNumber) && t.c(this.releaseDate, drivingLicenceContainerData.releaseDate) && t.c(this.restrictions, drivingLicenceContainerData.restrictions) && t.c(this.categories, drivingLicenceContainerData.categories) && t.c(this.secondName, drivingLicenceContainerData.secondName) && t.c(this.statusChangedReasons, drivingLicenceContainerData.statusChangedReasons) && t.c(this.expiredDate, drivingLicenceContainerData.expiredDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFormNumber() {
        return this.formNumber;
    }

    public final String h() {
        List<DrivingLicenceStatusChangedReason> list = this.statusChangedReasons;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String changeStatusDescription = ((DrivingLicenceStatusChangedReason) it.next()).getChangeStatusDescription();
            if (changeStatusDescription != null) {
                arrayList.add(changeStatusDescription);
            }
        }
        return v.v0(arrayList, "\n\n", null, null, 0, null, new l() { // from class: ou1.d
            @Override // er.l
            public final Object b(Object obj) {
                return DrivingLicenceContainerData.i((String) obj);
            }
        }, 30, null);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.surname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.birthday;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str3 = this.birthplace;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentState;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.documentStateCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.longDocumentId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.formNumber;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        LocalDate localDate2 = this.releaseDate;
        int iHashCode9 = (iHashCode8 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List<String> list = this.restrictions;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<DrivingLicenceCategory> list2 = this.categories;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.secondName;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<DrivingLicenceStatusChangedReason> list3 = this.statusChangedReasons;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        LocalDate localDate3 = this.expiredDate;
        return iHashCode13 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLongDocumentId() {
        return this.longDocumentId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    public final List<String> m() {
        return this.restrictions;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public final boolean p() {
        DrivingLicenceStatusChangedReason drivingLicenceStatusChangedReason;
        List<DrivingLicenceStatusChangedReason> list = this.statusChangedReasons;
        return ((list == null || (drivingLicenceStatusChangedReason = (DrivingLicenceStatusChangedReason) v.n0(list)) == null) ? null : drivingLicenceStatusChangedReason.getChangeStatusDescription()) != null;
    }

    public final boolean q() {
        return t.c(this.documentStateCode, "DICT003_WYD");
    }

    public String toString() {
        return "DrivingLicenceContainerData(name=" + this.name + ", surname=" + this.surname + ", birthday=" + this.birthday + ", birthplace=" + this.birthplace + ", documentState=" + this.documentState + ", documentStateCode=" + this.documentStateCode + ", longDocumentId=" + this.longDocumentId + ", formNumber=" + this.formNumber + ", releaseDate=" + this.releaseDate + ", restrictions=" + this.restrictions + ", categories=" + this.categories + ", secondName=" + this.secondName + ", statusChangedReasons=" + this.statusChangedReasons + ", expiredDate=" + this.expiredDate + ')';
    }
}
