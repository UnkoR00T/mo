package i24;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\r¨\u0006\u001f"}, d2 = {"Li24/i;", "", "", "categoryName", "Ljava/time/LocalDate;", "formReleaseDate", "", "categoryRestrictions", "expiredDate", "categoryStatus", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/util/List;Ljava/time/LocalDate;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/LocalDate;", "e", "()Ljava/time/LocalDate;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceCategory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate formReleaseDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> categoryRestrictions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expiredDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryStatus;

    public DrivingLicenceCategory(String str, LocalDate localDate, List<String> list, LocalDate localDate2, String str2) {
        this.categoryName = str;
        this.formReleaseDate = localDate;
        this.categoryRestrictions = list;
        this.expiredDate = localDate2;
        this.categoryStatus = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<String> b() {
        return this.categoryRestrictions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCategoryStatus() {
        return this.categoryStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getFormReleaseDate() {
        return this.formReleaseDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceCategory)) {
            return false;
        }
        DrivingLicenceCategory drivingLicenceCategory = (DrivingLicenceCategory) other;
        return fr.t.c(this.categoryName, drivingLicenceCategory.categoryName) && fr.t.c(this.formReleaseDate, drivingLicenceCategory.formReleaseDate) && fr.t.c(this.categoryRestrictions, drivingLicenceCategory.categoryRestrictions) && fr.t.c(this.expiredDate, drivingLicenceCategory.expiredDate) && fr.t.c(this.categoryStatus, drivingLicenceCategory.categoryStatus);
    }

    public int hashCode() {
        String str = this.categoryName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.formReleaseDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List<String> list = this.categoryRestrictions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LocalDate localDate2 = this.expiredDate;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str2 = this.categoryStatus;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DrivingLicenceCategory(categoryName=" + this.categoryName + ", formReleaseDate=" + this.formReleaseDate + ", categoryRestrictions=" + this.categoryRestrictions + ", expiredDate=" + this.expiredDate + ", categoryStatus=" + this.categoryStatus + ")";
    }
}
