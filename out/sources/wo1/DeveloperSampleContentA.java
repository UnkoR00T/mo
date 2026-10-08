package wo1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wo1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lwo1/b;", "", "", "internalId", "secretData1", "secretData2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getSecretData1", "c", "getSecretData2", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeveloperSampleContentA {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String internalId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretData1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretData2;

    public DeveloperSampleContentA(String str, String str2, String str3) {
        this.internalId = str;
        this.secretData1 = str2;
        this.secretData2 = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInternalId() {
        return this.internalId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeveloperSampleContentA)) {
            return false;
        }
        DeveloperSampleContentA developerSampleContentA = (DeveloperSampleContentA) other;
        return t.c(this.internalId, developerSampleContentA.internalId) && t.c(this.secretData1, developerSampleContentA.secretData1) && t.c(this.secretData2, developerSampleContentA.secretData2);
    }

    public int hashCode() {
        return (((this.internalId.hashCode() * 31) + this.secretData1.hashCode()) * 31) + this.secretData2.hashCode();
    }

    public String toString() {
        return "DeveloperSampleContentA(internalId=" + this.internalId + ", secretData1=" + this.secretData1 + ", secretData2=" + this.secretData2 + ')';
    }
}
