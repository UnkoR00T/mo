package cl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcl0/l;", "", "Lcl0/m;", "contactType", "Liy/b0;", "email", "phoneNumber", "<init>", "(Lcl0/m;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl0/m;", "()Lcl0/m;", "b", "Liy/b0;", "()Liy/b0;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationContact {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m contactType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 phoneNumber;

    public BEPassportChildApplicationContact(m mVar, iy.b0 b0Var, iy.b0 b0Var2) {
        this.contactType = mVar;
        this.email = b0Var;
        this.phoneNumber = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getContactType() {
        return this.contactType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationContact)) {
            return false;
        }
        BEPassportChildApplicationContact bEPassportChildApplicationContact = (BEPassportChildApplicationContact) other;
        return this.contactType == bEPassportChildApplicationContact.contactType && fr.t.c(this.email, bEPassportChildApplicationContact.email) && fr.t.c(this.phoneNumber, bEPassportChildApplicationContact.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = this.contactType.hashCode() * 31;
        iy.b0 b0Var = this.email;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        iy.b0 b0Var2 = this.phoneNumber;
        return iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0);
    }

    public String toString() {
        return "BEPassportChildApplicationContact(contactType=" + this.contactType + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ")";
    }
}
