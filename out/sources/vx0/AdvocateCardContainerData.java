package vx0;

import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vx0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u001e"}, d2 = {"Lvx0/a;", "", "", "number", "memberInstitution", "Ljava/util/Date;", "releaseDate", "expiredDate", "permissionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/Date;", "getReleaseDate", "()Ljava/util/Date;", "d", "getExpiredDate", "e", "advocatecard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvocateCardContainerData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String memberInstitution;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date releaseDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expiredDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String permissionType;

    public AdvocateCardContainerData(String str, String str2, Date date, Date date2, String str3) {
        this.number = str;
        this.memberInstitution = str2;
        this.releaseDate = date;
        this.expiredDate = date2;
        this.permissionType = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMemberInstitution() {
        return this.memberInstitution;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPermissionType() {
        return this.permissionType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvocateCardContainerData)) {
            return false;
        }
        AdvocateCardContainerData advocateCardContainerData = (AdvocateCardContainerData) other;
        return t.c(this.number, advocateCardContainerData.number) && t.c(this.memberInstitution, advocateCardContainerData.memberInstitution) && t.c(this.releaseDate, advocateCardContainerData.releaseDate) && t.c(this.expiredDate, advocateCardContainerData.expiredDate) && t.c(this.permissionType, advocateCardContainerData.permissionType);
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberInstitution;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.releaseDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expiredDate;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str3 = this.permissionType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AdvocateCardContainerData(number=" + this.number + ", memberInstitution=" + this.memberInstitution + ", releaseDate=" + this.releaseDate + ", expiredDate=" + this.expiredDate + ", permissionType=" + this.permissionType + ')';
    }
}
