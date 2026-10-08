package bl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0017\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lbl0/k;", "", "Lfz/b$c;", "date", "Lxw/e;", "gender", "Liy/b0;", "place", "certificateNumber", "Lbl0/j;", "registrationAuthority", "<init>", "(Lfz/b$c;Lxw/e;Liy/b0;Liy/b0;Lbl0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$c;", "b", "()Lfz/b$c;", "Lxw/e;", "c", "()Lxw/e;", "Liy/b0;", "d", "()Liy/b0;", "e", "Lbl0/j;", "()Lbl0/j;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthRegistrationBirth {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final xw.e gender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 certificateNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationAuthority registrationAuthority;

    public BEChildBirthRegistrationBirth(fz.b.LocalDate localDate, xw.e eVar, b0 b0Var, b0 b0Var2, BEChildBirthRegistrationAuthority bEChildBirthRegistrationAuthority) {
        this.date = localDate;
        this.gender = eVar;
        this.place = b0Var;
        this.certificateNumber = b0Var2;
        this.registrationAuthority = bEChildBirthRegistrationAuthority;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCertificateNumber() {
        return this.certificateNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final xw.e getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEChildBirthRegistrationAuthority getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthRegistrationBirth)) {
            return false;
        }
        BEChildBirthRegistrationBirth bEChildBirthRegistrationBirth = (BEChildBirthRegistrationBirth) other;
        return fr.t.c(this.date, bEChildBirthRegistrationBirth.date) && this.gender == bEChildBirthRegistrationBirth.gender && fr.t.c(this.place, bEChildBirthRegistrationBirth.place) && fr.t.c(this.certificateNumber, bEChildBirthRegistrationBirth.certificateNumber) && fr.t.c(this.registrationAuthority, bEChildBirthRegistrationBirth.registrationAuthority);
    }

    public int hashCode() {
        int iHashCode = ((((this.date.hashCode() * 31) + this.gender.hashCode()) * 31) + this.place.hashCode()) * 31;
        b0 b0Var = this.certificateNumber;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        BEChildBirthRegistrationAuthority bEChildBirthRegistrationAuthority = this.registrationAuthority;
        return iHashCode2 + (bEChildBirthRegistrationAuthority != null ? bEChildBirthRegistrationAuthority.hashCode() : 0);
    }

    public String toString() {
        return "BEChildBirthRegistrationBirth(date=" + this.date + ", gender=" + this.gender + ", place=" + this.place + ", certificateNumber=" + this.certificateNumber + ", registrationAuthority=" + this.registrationAuthority + ")";
    }
}
