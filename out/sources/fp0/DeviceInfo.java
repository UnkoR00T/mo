package fp0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fp0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lfp0/b;", "", "", "appVersionName", "", "appVersionCode", "deviceName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeviceInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int appVersionCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceName;

    public DeviceInfo(String str, int i15, String str2) {
        this.appVersionName = str;
        this.appVersionCode = i15;
        this.deviceName = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAppVersionCode() {
        return this.appVersionCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return t.c(this.appVersionName, deviceInfo.appVersionName) && this.appVersionCode == deviceInfo.appVersionCode && t.c(this.deviceName, deviceInfo.deviceName);
    }

    public int hashCode() {
        return (((this.appVersionName.hashCode() * 31) + Integer.hashCode(this.appVersionCode)) * 31) + this.deviceName.hashCode();
    }

    public String toString() {
        return "DeviceInfo(appVersionName=" + this.appVersionName + ", appVersionCode=" + this.appVersionCode + ", deviceName=" + this.deviceName + ")";
    }
}
