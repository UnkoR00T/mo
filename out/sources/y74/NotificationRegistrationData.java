package y74;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y74.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ly74/a;", "", "", "language", "appVersion", "token", "encryptingKey", "", "settingsPermission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "Z", "()Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationRegistrationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptingKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean settingsPermission;

    public NotificationRegistrationData(String str, String str2, String str3, String str4, boolean z15) {
        this.language = str;
        this.appVersion = str2;
        this.token = str3;
        this.encryptingKey = str4;
        this.settingsPermission = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncryptingKey() {
        return this.encryptingKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSettingsPermission() {
        return this.settingsPermission;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationRegistrationData)) {
            return false;
        }
        NotificationRegistrationData notificationRegistrationData = (NotificationRegistrationData) other;
        return t.c(this.language, notificationRegistrationData.language) && t.c(this.appVersion, notificationRegistrationData.appVersion) && t.c(this.token, notificationRegistrationData.token) && t.c(this.encryptingKey, notificationRegistrationData.encryptingKey) && this.settingsPermission == notificationRegistrationData.settingsPermission;
    }

    public int hashCode() {
        String str = this.language;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptingKey;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.settingsPermission);
    }

    public String toString() {
        return "NotificationRegistrationData(language=" + this.language + ", appVersion=" + this.appVersion + ", token=" + this.token + ", encryptingKey=" + this.encryptingKey + ", settingsPermission=" + this.settingsPermission + ')';
    }
}
