package kt1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kt1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lkt1/b;", "", "", "documentId", "documentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceRestrictionConfirmationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    public DrivingLicenceRestrictionConfirmationData(String str, String str2) {
        this.documentId = str;
        this.documentNumber = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceRestrictionConfirmationData)) {
            return false;
        }
        DrivingLicenceRestrictionConfirmationData drivingLicenceRestrictionConfirmationData = (DrivingLicenceRestrictionConfirmationData) other;
        return t.c(this.documentId, drivingLicenceRestrictionConfirmationData.documentId) && t.c(this.documentNumber, drivingLicenceRestrictionConfirmationData.documentNumber);
    }

    public int hashCode() {
        return (this.documentId.hashCode() * 31) + this.documentNumber.hashCode();
    }

    public String toString() {
        return "DrivingLicenceRestrictionConfirmationData(documentId=" + this.documentId + ", documentNumber=" + this.documentNumber + ')';
    }
}
