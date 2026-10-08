package lt1;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lt1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Llt1/g;", "", "Lal0/p;", "passportRestriction", "Lal0/o;", "passport", "", "documentId", "<init>", "(Lal0/p;Lal0/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/p;", "d", "()Lal0/p;", "b", "Lal0/o;", "()Lal0/o;", "c", "Ljava/lang/String;", "e", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Cancelling implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BankRestrictionPassportDocumentRestriction passportRestriction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BankRestrictionPassport passport;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    public Cancelling(BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction, BankRestrictionPassport bankRestrictionPassport, String str) {
        this.passportRestriction = bankRestrictionPassportDocumentRestriction;
        this.passport = bankRestrictionPassport;
        this.documentId = str;
    }

    @Override // lt1.b.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public BankRestrictionPassport getPassport() {
        return this.passport;
    }

    @Override // lt1.b.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public BankRestrictionPassportDocumentRestriction getPassportRestriction() {
        return this.passportRestriction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cancelling)) {
            return false;
        }
        Cancelling cancelling = (Cancelling) other;
        return fr.t.c(this.passportRestriction, cancelling.passportRestriction) && fr.t.c(this.passport, cancelling.passport) && fr.t.c(this.documentId, cancelling.documentId);
    }

    public int hashCode() {
        return (((this.passportRestriction.hashCode() * 31) + this.passport.hashCode()) * 31) + this.documentId.hashCode();
    }

    public String toString() {
        return "Cancelling(passportRestriction=" + this.passportRestriction + ", passport=" + this.passport + ", documentId=" + this.documentId + ')';
    }
}
