package aj0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: aj0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Laj0/d;", "", "Laj0/e;", "status", "", "blockedDescription", "blockedTitle", "<init>", "(Laj0/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laj0/e;", "c", "()Laj0/e;", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDocumentElectronicLayerSettingsInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final e status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockedDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockedTitle;

    public PersonalDocumentElectronicLayerSettingsInfo(e eVar, String str, String str2) {
        this.status = eVar;
        this.blockedDescription = str;
        this.blockedTitle = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBlockedDescription() {
        return this.blockedDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBlockedTitle() {
        return this.blockedTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDocumentElectronicLayerSettingsInfo)) {
            return false;
        }
        PersonalDocumentElectronicLayerSettingsInfo personalDocumentElectronicLayerSettingsInfo = (PersonalDocumentElectronicLayerSettingsInfo) other;
        return this.status == personalDocumentElectronicLayerSettingsInfo.status && t.c(this.blockedDescription, personalDocumentElectronicLayerSettingsInfo.blockedDescription) && t.c(this.blockedTitle, personalDocumentElectronicLayerSettingsInfo.blockedTitle);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.blockedDescription;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockedTitle;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PersonalDocumentElectronicLayerSettingsInfo(status=" + this.status + ", blockedDescription=" + this.blockedDescription + ", blockedTitle=" + this.blockedTitle + ")";
    }
}
