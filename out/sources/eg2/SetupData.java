package eg2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eg2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Leg2/b;", "", "Ltq0/l;", "documentVerificationCode", "", "isFromScan", "<init>", "(Ljava/lang/String;ZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentVerificationCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromScan;

    public /* synthetic */ SetupData(String str, boolean z15, fr.k kVar) {
        this(str, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentVerificationCode() {
        return this.documentVerificationCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFromScan() {
        return this.isFromScan;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return tq0.l.d(this.documentVerificationCode, setupData.documentVerificationCode) && this.isFromScan == setupData.isFromScan;
    }

    public int hashCode() {
        return (tq0.l.e(this.documentVerificationCode) * 31) + Boolean.hashCode(this.isFromScan);
    }

    public String toString() {
        return "SetupData(documentVerificationCode=" + ((Object) tq0.l.f(this.documentVerificationCode)) + ", isFromScan=" + this.isFromScan + ')';
    }

    private SetupData(String str, boolean z15) {
        this.documentVerificationCode = str;
        this.isFromScan = z15;
    }
}
