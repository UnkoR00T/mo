package bl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, d2 = {"Lbl0/j;", "", "", "civilStatusOfficeNumber", "officeType", "territorialCode", "Liy/b0;", "place", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCivilStatusOfficeNumber", "b", "getOfficeType", "c", "getTerritorialCode", "d", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthRegistrationAuthority {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String civilStatusOfficeNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String officeType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String territorialCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 place;

    public BEChildBirthRegistrationAuthority(String str, String str2, String str3, b0 b0Var) {
        this.civilStatusOfficeNumber = str;
        this.officeType = str2;
        this.territorialCode = str3;
        this.place = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getPlace() {
        return this.place;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthRegistrationAuthority)) {
            return false;
        }
        BEChildBirthRegistrationAuthority bEChildBirthRegistrationAuthority = (BEChildBirthRegistrationAuthority) other;
        return fr.t.c(this.civilStatusOfficeNumber, bEChildBirthRegistrationAuthority.civilStatusOfficeNumber) && fr.t.c(this.officeType, bEChildBirthRegistrationAuthority.officeType) && fr.t.c(this.territorialCode, bEChildBirthRegistrationAuthority.territorialCode) && fr.t.c(this.place, bEChildBirthRegistrationAuthority.place);
    }

    public int hashCode() {
        String str = this.civilStatusOfficeNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.officeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.territorialCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b0 b0Var = this.place;
        return iHashCode3 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public String toString() {
        return "BEChildBirthRegistrationAuthority(civilStatusOfficeNumber=" + this.civilStatusOfficeNumber + ", officeType=" + this.officeType + ", territorialCode=" + this.territorialCode + ", place=" + this.place + ")";
    }
}
