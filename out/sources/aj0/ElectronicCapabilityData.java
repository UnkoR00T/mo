package aj0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: aj0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Laj0/a;", "", "Laj0/b;", "signatureInfo", "Laj0/d;", "electronicLayerSettings", "<init>", "(Laj0/b;Laj0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laj0/b;", "b", "()Laj0/b;", "Laj0/d;", "()Laj0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectronicCapabilityData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ElectronicCapabilityInfo signatureInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalDocumentElectronicLayerSettingsInfo electronicLayerSettings;

    public ElectronicCapabilityData(ElectronicCapabilityInfo electronicCapabilityInfo, PersonalDocumentElectronicLayerSettingsInfo personalDocumentElectronicLayerSettingsInfo) {
        this.signatureInfo = electronicCapabilityInfo;
        this.electronicLayerSettings = personalDocumentElectronicLayerSettingsInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PersonalDocumentElectronicLayerSettingsInfo getElectronicLayerSettings() {
        return this.electronicLayerSettings;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ElectronicCapabilityInfo getSignatureInfo() {
        return this.signatureInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectronicCapabilityData)) {
            return false;
        }
        ElectronicCapabilityData electronicCapabilityData = (ElectronicCapabilityData) other;
        return t.c(this.signatureInfo, electronicCapabilityData.signatureInfo) && t.c(this.electronicLayerSettings, electronicCapabilityData.electronicLayerSettings);
    }

    public int hashCode() {
        return (this.signatureInfo.hashCode() * 31) + this.electronicLayerSettings.hashCode();
    }

    public String toString() {
        return "ElectronicCapabilityData(signatureInfo=" + this.signatureInfo + ", electronicLayerSettings=" + this.electronicLayerSettings + ")";
    }
}
