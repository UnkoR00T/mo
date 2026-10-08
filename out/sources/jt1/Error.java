package jt1;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Ljt1/g;", "", "Lal0/p;", "passportRestriction", "Lal0/o;", "passport", "", "documentId", "Lhb4/c;", "errorVMS", "<init>", "(Lal0/p;Lal0/o;Ljava/lang/String;Lhb4/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/p;", "f", "()Lal0/p;", "b", "Lal0/o;", "()Lal0/o;", "c", "Ljava/lang/String;", "d", "Lhb4/c;", "e", "()Lhb4/c;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BankRestrictionPassportDocumentRestriction passportRestriction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BankRestrictionPassport passport;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    public Error(BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction, BankRestrictionPassport bankRestrictionPassport, String str, hb4.c cVar) {
        this.passportRestriction = bankRestrictionPassportDocumentRestriction;
        this.passport = bankRestrictionPassport;
        this.documentId = str;
        this.errorVMS = cVar;
    }

    @Override // jt1.b.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public BankRestrictionPassport getPassport() {
        return this.passport;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.passportRestriction, error.passportRestriction) && fr.t.c(this.passport, error.passport) && fr.t.c(this.documentId, error.documentId) && fr.t.c(this.errorVMS, error.errorVMS);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public BankRestrictionPassportDocumentRestriction getPassportRestriction() {
        return this.passportRestriction;
    }

    public int hashCode() {
        return (((((this.passportRestriction.hashCode() * 31) + this.passport.hashCode()) * 31) + this.documentId.hashCode()) * 31) + this.errorVMS.hashCode();
    }

    public String toString() {
        return "Error(passportRestriction=" + this.passportRestriction + ", passport=" + this.passport + ", documentId=" + this.documentId + ", errorVMS=" + this.errorVMS + ')';
    }
}
