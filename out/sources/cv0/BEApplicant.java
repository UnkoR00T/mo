package cv0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cv0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lcv0/a;", "", "", "firstName", "surname", "Lxw/g;", "pesel", "", "isParticipant", "email", "Lcv0/g;", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liy/b0;ZLjava/lang/String;Lcv0/g;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "Liy/b0;", "()Liy/b0;", "d", "Z", "f", "()Z", "Lcv0/g;", "()Lcv0/g;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicant {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isParticipant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPhoneContactDetails phone;

    public /* synthetic */ BEApplicant(String str, String str2, b0 b0Var, boolean z15, String str3, BEPhoneContactDetails bEPhoneContactDetails, fr.k kVar) {
        this(str, str2, b0Var, z15, str3, bEPhoneContactDetails);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEPhoneContactDetails getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicant)) {
            return false;
        }
        BEApplicant bEApplicant = (BEApplicant) other;
        return fr.t.c(this.firstName, bEApplicant.firstName) && fr.t.c(this.surname, bEApplicant.surname) && xw.g.f(this.pesel, bEApplicant.pesel) && this.isParticipant == bEApplicant.isParticipant && fr.t.c(this.email, bEApplicant.email) && fr.t.c(this.phone, bEApplicant.phone);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsParticipant() {
        return this.isParticipant;
    }

    public int hashCode() {
        int iHashCode = ((((((this.firstName.hashCode() * 31) + this.surname.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + Boolean.hashCode(this.isParticipant)) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BEPhoneContactDetails bEPhoneContactDetails = this.phone;
        return iHashCode2 + (bEPhoneContactDetails != null ? bEPhoneContactDetails.hashCode() : 0);
    }

    public String toString() {
        return "BEApplicant(firstName=" + this.firstName + ", surname=" + this.surname + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ", isParticipant=" + this.isParticipant + ", email=" + this.email + ", phone=" + this.phone + ')';
    }

    private BEApplicant(String str, String str2, b0 b0Var, boolean z15, String str3, BEPhoneContactDetails bEPhoneContactDetails) {
        this.firstName = str;
        this.surname = str2;
        this.pesel = b0Var;
        this.isParticipant = z15;
        this.email = str3;
        this.phone = bEPhoneContactDetails;
    }
}
