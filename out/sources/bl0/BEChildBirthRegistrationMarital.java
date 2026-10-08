package bl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lbl0/o;", "", "Liy/b0;", "certificateNumber", "Lbl0/j;", "registrationAuthority", "Lbl0/c;", "status", "<init>", "(Liy/b0;Lbl0/j;Lbl0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lbl0/j;", "()Lbl0/j;", "c", "Lbl0/c;", "getStatus", "()Lbl0/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthRegistrationMarital {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 certificateNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEChildBirthRegistrationAuthority registrationAuthority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c status;

    public BEChildBirthRegistrationMarital(b0 b0Var, BEChildBirthRegistrationAuthority bEChildBirthRegistrationAuthority, c cVar) {
        this.certificateNumber = b0Var;
        this.registrationAuthority = bEChildBirthRegistrationAuthority;
        this.status = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCertificateNumber() {
        return this.certificateNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEChildBirthRegistrationAuthority getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthRegistrationMarital)) {
            return false;
        }
        BEChildBirthRegistrationMarital bEChildBirthRegistrationMarital = (BEChildBirthRegistrationMarital) other;
        return fr.t.c(this.certificateNumber, bEChildBirthRegistrationMarital.certificateNumber) && fr.t.c(this.registrationAuthority, bEChildBirthRegistrationMarital.registrationAuthority) && this.status == bEChildBirthRegistrationMarital.status;
    }

    public int hashCode() {
        b0 b0Var = this.certificateNumber;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        BEChildBirthRegistrationAuthority bEChildBirthRegistrationAuthority = this.registrationAuthority;
        int iHashCode2 = (iHashCode + (bEChildBirthRegistrationAuthority == null ? 0 : bEChildBirthRegistrationAuthority.hashCode())) * 31;
        c cVar = this.status;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "BEChildBirthRegistrationMarital(certificateNumber=" + this.certificateNumber + ", registrationAuthority=" + this.registrationAuthority + ", status=" + this.status + ")";
    }
}
