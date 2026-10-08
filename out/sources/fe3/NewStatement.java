package fe3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fe3.u0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfe3/u0;", "", "", "workingCopyValidityDays", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "()Ljava/lang/Integer;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewStatement implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int workingCopyValidityDays;

    public NewStatement(int i15) {
        this.workingCopyValidityDays = i15;
    }

    public Integer a() {
        return Integer.valueOf(this.workingCopyValidityDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewStatement) && this.workingCopyValidityDays == ((NewStatement) other).workingCopyValidityDays;
    }

    public int hashCode() {
        return Integer.hashCode(this.workingCopyValidityDays);
    }

    public String toString() {
        return "NewStatement(workingCopyValidityDays=" + this.workingCopyValidityDays + ')';
    }
}
