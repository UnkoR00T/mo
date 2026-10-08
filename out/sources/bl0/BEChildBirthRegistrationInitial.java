package bl0;

import iy.b0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u009e\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b/\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b5\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00104R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lbl0/n;", "", "Lbl0/k;", "birth", "Liy/b0;", "familyName", "firstName", "nationality", "Lxw/g;", "pesel", "surname", "nextNames", "Lbl0/o;", "maritalData", "Lbl0/i;", "permanentAddress", "secondName", "temporaryAddress", "", "requiredPeselDataChecksum", "Lfz/b$c;", "temporaryAddressEndDate", "<init>", "(Lbl0/k;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lbl0/o;Lbl0/i;Liy/b0;Lbl0/i;Ljava/lang/String;Lfz/b$c;Lfr/k;)V", "a", "(Lbl0/k;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lbl0/o;Lbl0/i;Liy/b0;Lbl0/i;Ljava/lang/String;Lfz/b$c;)Lbl0/n;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbl0/k;", "c", "()Lbl0/k;", "b", "Liy/b0;", "d", "()Liy/b0;", "e", "g", "j", "f", "m", "h", "Lbl0/o;", "()Lbl0/o;", "i", "Lbl0/i;", "()Lbl0/i;", "l", "k", "n", "Ljava/lang/String;", "Lfz/b$c;", "o", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthRegistrationInitial {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationBirth birth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 familyName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 nationality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 surname;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 nextNames;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationMarital maritalData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationApplicantAddress permanentAddress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 secondName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationApplicantAddress temporaryAddress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requiredPeselDataChecksum;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate temporaryAddressEndDate;

    public /* synthetic */ BEChildBirthRegistrationInitial(BEChildBirthRegistrationBirth bEChildBirthRegistrationBirth, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, b0 b0Var6, BEChildBirthRegistrationMarital bEChildBirthRegistrationMarital, BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress, b0 b0Var7, BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress2, String str, fz.b.LocalDate localDate, fr.k kVar) {
        this(bEChildBirthRegistrationBirth, b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, bEChildBirthRegistrationMarital, bEChildBirthRegistrationApplicantAddress, b0Var7, bEChildBirthRegistrationApplicantAddress2, str, localDate);
    }

    public static /* synthetic */ BEChildBirthRegistrationInitial b(BEChildBirthRegistrationInitial bEChildBirthRegistrationInitial, BEChildBirthRegistrationBirth bEChildBirthRegistrationBirth, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, b0 b0Var6, BEChildBirthRegistrationMarital bEChildBirthRegistrationMarital, BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress, b0 b0Var7, BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress2, String str, fz.b.LocalDate localDate, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEChildBirthRegistrationBirth = bEChildBirthRegistrationInitial.birth;
        }
        return bEChildBirthRegistrationInitial.a(bEChildBirthRegistrationBirth, (i15 & 2) != 0 ? bEChildBirthRegistrationInitial.familyName : b0Var, (i15 & 4) != 0 ? bEChildBirthRegistrationInitial.firstName : b0Var2, (i15 & 8) != 0 ? bEChildBirthRegistrationInitial.nationality : b0Var3, (i15 & 16) != 0 ? bEChildBirthRegistrationInitial.pesel : b0Var4, (i15 & 32) != 0 ? bEChildBirthRegistrationInitial.surname : b0Var5, (i15 & 64) != 0 ? bEChildBirthRegistrationInitial.nextNames : b0Var6, (i15 & 128) != 0 ? bEChildBirthRegistrationInitial.maritalData : bEChildBirthRegistrationMarital, (i15 & 256) != 0 ? bEChildBirthRegistrationInitial.permanentAddress : bEChildBirthRegistrationApplicantAddress, (i15 & 512) != 0 ? bEChildBirthRegistrationInitial.secondName : b0Var7, (i15 & 1024) != 0 ? bEChildBirthRegistrationInitial.temporaryAddress : bEChildBirthRegistrationApplicantAddress2, (i15 & 2048) != 0 ? bEChildBirthRegistrationInitial.requiredPeselDataChecksum : str, (i15 & PKIFailureInfo.certConfirmed) != 0 ? bEChildBirthRegistrationInitial.temporaryAddressEndDate : localDate);
    }

    public final BEChildBirthRegistrationInitial a(BEChildBirthRegistrationBirth birth, b0 familyName, b0 firstName, b0 nationality, b0 pesel, b0 surname, b0 nextNames, BEChildBirthRegistrationMarital maritalData, BEChildBirthRegistrationApplicantAddress permanentAddress, b0 secondName, BEChildBirthRegistrationApplicantAddress temporaryAddress, String requiredPeselDataChecksum, fz.b.LocalDate temporaryAddressEndDate) {
        return new BEChildBirthRegistrationInitial(birth, familyName, firstName, nationality, pesel, surname, nextNames, maritalData, permanentAddress, secondName, temporaryAddress, requiredPeselDataChecksum, temporaryAddressEndDate, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEChildBirthRegistrationBirth getBirth() {
        return this.birth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getFamilyName() {
        return this.familyName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthRegistrationInitial)) {
            return false;
        }
        BEChildBirthRegistrationInitial bEChildBirthRegistrationInitial = (BEChildBirthRegistrationInitial) other;
        return fr.t.c(this.birth, bEChildBirthRegistrationInitial.birth) && fr.t.c(this.familyName, bEChildBirthRegistrationInitial.familyName) && fr.t.c(this.firstName, bEChildBirthRegistrationInitial.firstName) && fr.t.c(this.nationality, bEChildBirthRegistrationInitial.nationality) && xw.g.f(this.pesel, bEChildBirthRegistrationInitial.pesel) && fr.t.c(this.surname, bEChildBirthRegistrationInitial.surname) && fr.t.c(this.nextNames, bEChildBirthRegistrationInitial.nextNames) && fr.t.c(this.maritalData, bEChildBirthRegistrationInitial.maritalData) && fr.t.c(this.permanentAddress, bEChildBirthRegistrationInitial.permanentAddress) && fr.t.c(this.secondName, bEChildBirthRegistrationInitial.secondName) && fr.t.c(this.temporaryAddress, bEChildBirthRegistrationInitial.temporaryAddress) && fr.t.c(this.requiredPeselDataChecksum, bEChildBirthRegistrationInitial.requiredPeselDataChecksum) && fr.t.c(this.temporaryAddressEndDate, bEChildBirthRegistrationInitial.temporaryAddressEndDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEChildBirthRegistrationMarital getMaritalData() {
        return this.maritalData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getNextNames() {
        return this.nextNames;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.birth.hashCode() * 31) + this.familyName.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.nationality.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + this.surname.hashCode()) * 31;
        b0 b0Var = this.nextNames;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        BEChildBirthRegistrationMarital bEChildBirthRegistrationMarital = this.maritalData;
        int iHashCode3 = (iHashCode2 + (bEChildBirthRegistrationMarital == null ? 0 : bEChildBirthRegistrationMarital.hashCode())) * 31;
        BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress = this.permanentAddress;
        int iHashCode4 = (iHashCode3 + (bEChildBirthRegistrationApplicantAddress == null ? 0 : bEChildBirthRegistrationApplicantAddress.hashCode())) * 31;
        b0 b0Var2 = this.secondName;
        int iHashCode5 = (iHashCode4 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress2 = this.temporaryAddress;
        int iHashCode6 = (((iHashCode5 + (bEChildBirthRegistrationApplicantAddress2 == null ? 0 : bEChildBirthRegistrationApplicantAddress2.hashCode())) * 31) + this.requiredPeselDataChecksum.hashCode()) * 31;
        fz.b.LocalDate localDate = this.temporaryAddressEndDate;
        return iHashCode6 + (localDate != null ? localDate.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final BEChildBirthRegistrationApplicantAddress getPermanentAddress() {
        return this.permanentAddress;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRequiredPeselDataChecksum() {
        return this.requiredPeselDataChecksum;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final BEChildBirthRegistrationApplicantAddress getTemporaryAddress() {
        return this.temporaryAddress;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final fz.b.LocalDate getTemporaryAddressEndDate() {
        return this.temporaryAddressEndDate;
    }

    public String toString() {
        return "BEChildBirthRegistrationInitial(birth=" + this.birth + ", familyName=" + this.familyName + ", firstName=" + this.firstName + ", nationality=" + this.nationality + ", pesel=" + xw.g.i(this.pesel) + ", surname=" + this.surname + ", nextNames=" + this.nextNames + ", maritalData=" + this.maritalData + ", permanentAddress=" + this.permanentAddress + ", secondName=" + this.secondName + ", temporaryAddress=" + this.temporaryAddress + ", requiredPeselDataChecksum=" + this.requiredPeselDataChecksum + ", temporaryAddressEndDate=" + this.temporaryAddressEndDate + ")";
    }

    private BEChildBirthRegistrationInitial(BEChildBirthRegistrationBirth bEChildBirthRegistrationBirth, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, b0 b0Var6, BEChildBirthRegistrationMarital bEChildBirthRegistrationMarital, BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress, b0 b0Var7, BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress2, String str, fz.b.LocalDate localDate) {
        this.birth = bEChildBirthRegistrationBirth;
        this.familyName = b0Var;
        this.firstName = b0Var2;
        this.nationality = b0Var3;
        this.pesel = b0Var4;
        this.surname = b0Var5;
        this.nextNames = b0Var6;
        this.maritalData = bEChildBirthRegistrationMarital;
        this.permanentAddress = bEChildBirthRegistrationApplicantAddress;
        this.secondName = b0Var7;
        this.temporaryAddress = bEChildBirthRegistrationApplicantAddress2;
        this.requiredPeselDataChecksum = str;
        this.temporaryAddressEndDate = localDate;
    }
}
