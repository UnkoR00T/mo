package d84;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d84.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Ld84/a;", "", "", "type", "title", "description", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ld84/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "e", "c", "d", "Z", "()Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationSettingsEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    public NotificationSettingsEntry(String str, String str2, String str3, boolean z15) {
        this.type = str;
        this.title = str2;
        this.description = str3;
        this.enabled = z15;
    }

    public static /* synthetic */ NotificationSettingsEntry b(NotificationSettingsEntry notificationSettingsEntry, String str, String str2, String str3, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationSettingsEntry.type;
        }
        if ((i15 & 2) != 0) {
            str2 = notificationSettingsEntry.title;
        }
        if ((i15 & 4) != 0) {
            str3 = notificationSettingsEntry.description;
        }
        if ((i15 & 8) != 0) {
            z15 = notificationSettingsEntry.enabled;
        }
        return notificationSettingsEntry.a(str, str2, str3, z15);
    }

    public final NotificationSettingsEntry a(String type, String title, String description, boolean enabled) {
        return new NotificationSettingsEntry(type, title, description, enabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettingsEntry)) {
            return false;
        }
        NotificationSettingsEntry notificationSettingsEntry = (NotificationSettingsEntry) other;
        return t.c(this.type, notificationSettingsEntry.type) && t.c(this.title, notificationSettingsEntry.title) && t.c(this.description, notificationSettingsEntry.description) && this.enabled == notificationSettingsEntry.enabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "NotificationSettingsEntry(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", enabled=" + this.enabled + ')';
    }
}
