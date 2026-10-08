package wo1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wo1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lwo1/c;", "", "", "internalId", "secretData1", "secretData2", "secretData3", "secretData4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getSecretData1", "c", "getSecretData2", "d", "getSecretData3", "e", "getSecretData4", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeveloperSampleContentB {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String internalId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretData1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretData2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretData3;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secretData4;

    public DeveloperSampleContentB(String str, String str2, String str3, String str4, String str5) {
        this.internalId = str;
        this.secretData1 = str2;
        this.secretData2 = str3;
        this.secretData3 = str4;
        this.secretData4 = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInternalId() {
        return this.internalId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeveloperSampleContentB)) {
            return false;
        }
        DeveloperSampleContentB developerSampleContentB = (DeveloperSampleContentB) other;
        return t.c(this.internalId, developerSampleContentB.internalId) && t.c(this.secretData1, developerSampleContentB.secretData1) && t.c(this.secretData2, developerSampleContentB.secretData2) && t.c(this.secretData3, developerSampleContentB.secretData3) && t.c(this.secretData4, developerSampleContentB.secretData4);
    }

    public int hashCode() {
        return (((((((this.internalId.hashCode() * 31) + this.secretData1.hashCode()) * 31) + this.secretData2.hashCode()) * 31) + this.secretData3.hashCode()) * 31) + this.secretData4.hashCode();
    }

    public String toString() {
        return "DeveloperSampleContentB(internalId=" + this.internalId + ", secretData1=" + this.secretData1 + ", secretData2=" + this.secretData2 + ", secretData3=" + this.secretData3 + ", secretData4=" + this.secretData4 + ')';
    }
}
