package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.k0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lfk0/k0;", "", "", "actionBlocked", "Lfk0/j0;", "availableAction", "", "minSuspensionDays", "Lfk0/l0;", "endRange", "startRange", "<init>", "(ZLfk0/j0;ILfk0/l0;Lfk0/l0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lfk0/j0;", "()Lfk0/j0;", "c", "I", "d", "Lfk0/l0;", "getEndRange", "()Lfk0/l0;", "e", "getStartRange", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECompanySuspensionOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean actionBlocked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final j0 availableAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minSuspensionDays;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECompanySuspensionRange endRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BECompanySuspensionRange startRange;

    public BECompanySuspensionOptions(boolean z15, j0 j0Var, int i15, BECompanySuspensionRange bECompanySuspensionRange, BECompanySuspensionRange bECompanySuspensionRange2) {
        this.actionBlocked = z15;
        this.availableAction = j0Var;
        this.minSuspensionDays = i15;
        this.endRange = bECompanySuspensionRange;
        this.startRange = bECompanySuspensionRange2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActionBlocked() {
        return this.actionBlocked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j0 getAvailableAction() {
        return this.availableAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinSuspensionDays() {
        return this.minSuspensionDays;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECompanySuspensionOptions)) {
            return false;
        }
        BECompanySuspensionOptions bECompanySuspensionOptions = (BECompanySuspensionOptions) other;
        return this.actionBlocked == bECompanySuspensionOptions.actionBlocked && this.availableAction == bECompanySuspensionOptions.availableAction && this.minSuspensionDays == bECompanySuspensionOptions.minSuspensionDays && fr.t.c(this.endRange, bECompanySuspensionOptions.endRange) && fr.t.c(this.startRange, bECompanySuspensionOptions.startRange);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.actionBlocked) * 31) + this.availableAction.hashCode()) * 31) + Integer.hashCode(this.minSuspensionDays)) * 31;
        BECompanySuspensionRange bECompanySuspensionRange = this.endRange;
        int iHashCode2 = (iHashCode + (bECompanySuspensionRange == null ? 0 : bECompanySuspensionRange.hashCode())) * 31;
        BECompanySuspensionRange bECompanySuspensionRange2 = this.startRange;
        return iHashCode2 + (bECompanySuspensionRange2 != null ? bECompanySuspensionRange2.hashCode() : 0);
    }

    public String toString() {
        return "BECompanySuspensionOptions(actionBlocked=" + this.actionBlocked + ", availableAction=" + this.availableAction + ", minSuspensionDays=" + this.minSuspensionDays + ", endRange=" + this.endRange + ", startRange=" + this.startRange + ')';
    }
}
