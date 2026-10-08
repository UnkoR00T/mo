package fi0;

import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: renamed from: fi0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfi0/a;", "", "", "appVersionName", "", "appVersionCode", "deviceName", "Lfi0/a$a;", "os", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lfi0/a$a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAppVersionName", "b", "I", "getAppVersionCode", "c", "getDeviceName", "d", "Lfi0/a$a;", "getOs", "()Lfi0/a$a;", "backsystemservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppInfoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("appVersionName")
    private final String appVersionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("appVersionCode")
    private final int appVersionCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("deviceName")
    private final String deviceName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @c("os")
    private final EnumC1427a os;

    /* JADX INFO: renamed from: fi0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lfi0/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "backsystemservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC1427a {
        ANDROID("ANDROID"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f64115e = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        EnumC1427a(String str) {
            this.value = str;
        }
    }

    public AppInfoDto(String str, int i15, String str2, EnumC1427a enumC1427a) {
        this.appVersionName = str;
        this.appVersionCode = i15;
        this.deviceName = str2;
        this.os = enumC1427a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfoDto)) {
            return false;
        }
        AppInfoDto appInfoDto = (AppInfoDto) other;
        return t.c(this.appVersionName, appInfoDto.appVersionName) && this.appVersionCode == appInfoDto.appVersionCode && t.c(this.deviceName, appInfoDto.deviceName) && this.os == appInfoDto.os;
    }

    public int hashCode() {
        return (((((this.appVersionName.hashCode() * 31) + Integer.hashCode(this.appVersionCode)) * 31) + this.deviceName.hashCode()) * 31) + this.os.hashCode();
    }

    public String toString() {
        return "AppInfoDto(appVersionName=" + this.appVersionName + ", appVersionCode=" + this.appVersionCode + ", deviceName=" + this.deviceName + ", os=" + this.os + ')';
    }
}
