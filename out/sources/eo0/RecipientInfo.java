package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.m0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, d2 = {"Leo0/m0;", "", "", "recipientEda", "Lfz/b$c;", "dateOfEnteringToBAE", "dateOfRemovalFromBAE", "serviceCategoryDescription", "Leo0/b1;", "warningType", "Leo0/a;", "additionalServiceActivationDates", "<init>", "(Ljava/lang/String;Lfz/b$c;Lfz/b$c;Ljava/lang/String;Leo0/b1;Leo0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lfz/b$c;", "()Lfz/b$c;", "c", "e", "Leo0/b1;", "f", "()Leo0/b1;", "Leo0/a;", "()Leo0/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String recipientEda;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate dateOfEnteringToBAE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate dateOfRemovalFromBAE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceCategoryDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b1 warningType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdditionalServiceActivationDates additionalServiceActivationDates;

    public RecipientInfo(String str, fz.b.LocalDate localDate, fz.b.LocalDate localDate2, String str2, b1 b1Var, AdditionalServiceActivationDates additionalServiceActivationDates) {
        this.recipientEda = str;
        this.dateOfEnteringToBAE = localDate;
        this.dateOfRemovalFromBAE = localDate2;
        this.serviceCategoryDescription = str2;
        this.warningType = b1Var;
        this.additionalServiceActivationDates = additionalServiceActivationDates;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdditionalServiceActivationDates getAdditionalServiceActivationDates() {
        return this.additionalServiceActivationDates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getDateOfEnteringToBAE() {
        return this.dateOfEnteringToBAE;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.LocalDate getDateOfRemovalFromBAE() {
        return this.dateOfRemovalFromBAE;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRecipientEda() {
        return this.recipientEda;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getServiceCategoryDescription() {
        return this.serviceCategoryDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipientInfo)) {
            return false;
        }
        RecipientInfo recipientInfo = (RecipientInfo) other;
        return fr.t.c(this.recipientEda, recipientInfo.recipientEda) && fr.t.c(this.dateOfEnteringToBAE, recipientInfo.dateOfEnteringToBAE) && fr.t.c(this.dateOfRemovalFromBAE, recipientInfo.dateOfRemovalFromBAE) && fr.t.c(this.serviceCategoryDescription, recipientInfo.serviceCategoryDescription) && fr.t.c(this.warningType, recipientInfo.warningType) && fr.t.c(this.additionalServiceActivationDates, recipientInfo.additionalServiceActivationDates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b1 getWarningType() {
        return this.warningType;
    }

    public int hashCode() {
        int iHashCode = this.recipientEda.hashCode() * 31;
        fz.b.LocalDate localDate = this.dateOfEnteringToBAE;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        fz.b.LocalDate localDate2 = this.dateOfRemovalFromBAE;
        int iHashCode3 = (((iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31) + this.serviceCategoryDescription.hashCode()) * 31;
        b1 b1Var = this.warningType;
        int iHashCode4 = (iHashCode3 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        AdditionalServiceActivationDates additionalServiceActivationDates = this.additionalServiceActivationDates;
        return iHashCode4 + (additionalServiceActivationDates != null ? additionalServiceActivationDates.hashCode() : 0);
    }

    public String toString() {
        return "RecipientInfo(recipientEda=" + this.recipientEda + ", dateOfEnteringToBAE=" + this.dateOfEnteringToBAE + ", dateOfRemovalFromBAE=" + this.dateOfRemovalFromBAE + ", serviceCategoryDescription=" + this.serviceCategoryDescription + ", warningType=" + this.warningType + ", additionalServiceActivationDates=" + this.additionalServiceActivationDates + ")";
    }
}
