package na1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: na1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, d2 = {"Lna1/b;", "", "Lna1/a;", "availableAction", "", "actionBlocked", "", "minSuspensionDays", "<init>", "(Lna1/a;ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lna1/a;", "getAvailableAction", "()Lna1/a;", "b", "Z", "()Z", "c", "I", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanySuspensionOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a availableAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean actionBlocked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minSuspensionDays;

    public CompanySuspensionOptions(a aVar, boolean z15, int i15) {
        this.availableAction = aVar;
        this.actionBlocked = z15;
        this.minSuspensionDays = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActionBlocked() {
        return this.actionBlocked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMinSuspensionDays() {
        return this.minSuspensionDays;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanySuspensionOptions)) {
            return false;
        }
        CompanySuspensionOptions companySuspensionOptions = (CompanySuspensionOptions) other;
        return this.availableAction == companySuspensionOptions.availableAction && this.actionBlocked == companySuspensionOptions.actionBlocked && this.minSuspensionDays == companySuspensionOptions.minSuspensionDays;
    }

    public int hashCode() {
        return (((this.availableAction.hashCode() * 31) + Boolean.hashCode(this.actionBlocked)) * 31) + Integer.hashCode(this.minSuspensionDays);
    }

    public String toString() {
        return "CompanySuspensionOptions(availableAction=" + this.availableAction + ", actionBlocked=" + this.actionBlocked + ", minSuspensionDays=" + this.minSuspensionDays + ')';
    }
}
