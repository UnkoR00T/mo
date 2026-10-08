package u24;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u24.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lu24/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "pkcs12Pass", "pkcs12Data", "c", "signedDataList", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentPackageData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pkcs12Pass")
    private final String pkcs12Pass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pkcs12Data")
    private final String pkcs12Data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("signedDataList")
    private final String signedDataList;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPkcs12Data() {
        return this.pkcs12Data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPkcs12Pass() {
        return this.pkcs12Pass;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSignedDataList() {
        return this.signedDataList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudentPackageData)) {
            return false;
        }
        StudentPackageData studentPackageData = (StudentPackageData) other;
        return t.c(this.pkcs12Pass, studentPackageData.pkcs12Pass) && t.c(this.pkcs12Data, studentPackageData.pkcs12Data) && t.c(this.signedDataList, studentPackageData.signedDataList);
    }

    public int hashCode() {
        return (((this.pkcs12Pass.hashCode() * 31) + this.pkcs12Data.hashCode()) * 31) + this.signedDataList.hashCode();
    }

    public String toString() {
        return "StudentPackageData(pkcs12Pass=" + this.pkcs12Pass + ", pkcs12Data=" + this.pkcs12Data + ", signedDataList=" + this.signedDataList + ')';
    }
}
