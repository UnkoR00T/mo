package jr0;

import fr.t;
import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jr0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u0019\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b$\u0010'¨\u0006("}, d2 = {"Ljr0/q;", "", "Liy/b0;", "picture", "", "number", "issuer", "Ljava/time/LocalDate;", "validTo", "creationDate", "suspensionDate", "revocationDate", "Ljr0/r;", "status", "<init>", "(Liy/b0;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljr0/r;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "d", "()Liy/b0;", "b", "Ljava/lang/String;", "c", "Ljava/time/LocalDate;", "h", "()Ljava/time/LocalDate;", "e", "f", "g", "Ljr0/r;", "()Ljr0/r;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalIdCardContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 picture;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate validTo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate creationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate suspensionDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate revocationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final r status;

    public PersonalIdCardContainer(b0 b0Var, String str, String str2, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, r rVar) {
        this.picture = b0Var;
        this.number = str;
        this.issuer = str2;
        this.validTo = localDate;
        this.creationDate = localDate2;
        this.suspensionDate = localDate3;
        this.revocationDate = localDate4;
        this.status = rVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getRevocationDate() {
        return this.revocationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalIdCardContainer)) {
            return false;
        }
        PersonalIdCardContainer personalIdCardContainer = (PersonalIdCardContainer) other;
        return t.c(this.picture, personalIdCardContainer.picture) && t.c(this.number, personalIdCardContainer.number) && t.c(this.issuer, personalIdCardContainer.issuer) && t.c(this.validTo, personalIdCardContainer.validTo) && t.c(this.creationDate, personalIdCardContainer.creationDate) && t.c(this.suspensionDate, personalIdCardContainer.suspensionDate) && t.c(this.revocationDate, personalIdCardContainer.revocationDate) && this.status == personalIdCardContainer.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getSuspensionDate() {
        return this.suspensionDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalDate getValidTo() {
        return this.validTo;
    }

    public int hashCode() {
        int iHashCode = this.picture.hashCode() * 31;
        String str = this.number;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.issuer;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.validTo;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.creationDate;
        int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.suspensionDate;
        int iHashCode6 = (iHashCode5 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.revocationDate;
        int iHashCode7 = (iHashCode6 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31;
        r rVar = this.status;
        return iHashCode7 + (rVar != null ? rVar.hashCode() : 0);
    }

    public String toString() {
        return "PersonalIdCardContainer(picture=" + this.picture + ", number=" + this.number + ", issuer=" + this.issuer + ", validTo=" + this.validTo + ", creationDate=" + this.creationDate + ", suspensionDate=" + this.suspensionDate + ", revocationDate=" + this.revocationDate + ", status=" + this.status + ")";
    }
}
