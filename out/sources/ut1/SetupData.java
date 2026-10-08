package ut1;

import al0.BankRestrictionPassport;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ut1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lut1/e;", "", "Lmx/a;", "title", "description", "Lkt1/c;", "restrictedDocumentType", "Lal0/o;", "passport", "<init>", "(Lmx/a;Lmx/a;Lkt1/c;Lal0/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Lkt1/c;", "()Lkt1/c;", "Lal0/o;", "()Lal0/o;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final kt1.c restrictedDocumentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BankRestrictionPassport passport;

    public SetupData(Label label, Label label2, kt1.c cVar, BankRestrictionPassport bankRestrictionPassport) {
        this.title = label;
        this.description = label2;
        this.restrictedDocumentType = cVar;
        this.passport = bankRestrictionPassport;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BankRestrictionPassport getPassport() {
        return this.passport;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final kt1.c getRestrictedDocumentType() {
        return this.restrictedDocumentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return t.c(this.title, setupData.title) && t.c(this.description, setupData.description) && this.restrictedDocumentType == setupData.restrictedDocumentType && t.c(this.passport, setupData.passport);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Label label = this.description;
        int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.restrictedDocumentType.hashCode()) * 31;
        BankRestrictionPassport bankRestrictionPassport = this.passport;
        return iHashCode2 + (bankRestrictionPassport != null ? bankRestrictionPassport.hashCode() : 0);
    }

    public String toString() {
        return "SetupData(title=" + this.title + ", description=" + this.description + ", restrictedDocumentType=" + this.restrictedDocumentType + ", passport=" + this.passport + ')';
    }
}
