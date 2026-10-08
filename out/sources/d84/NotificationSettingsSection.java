package d84;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d84.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld84/c;", "", "", "title", "", "Ld84/a;", "notificationSettingsEntries", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Ld84/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationSettingsSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<NotificationSettingsEntry> notificationSettingsEntries;

    public NotificationSettingsSection(String str, List<NotificationSettingsEntry> list) {
        this.title = str;
        this.notificationSettingsEntries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSettingsSection b(NotificationSettingsSection notificationSettingsSection, String str, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationSettingsSection.title;
        }
        if ((i15 & 2) != 0) {
            list = notificationSettingsSection.notificationSettingsEntries;
        }
        return notificationSettingsSection.a(str, list);
    }

    public final NotificationSettingsSection a(String title, List<NotificationSettingsEntry> notificationSettingsEntries) {
        return new NotificationSettingsSection(title, notificationSettingsEntries);
    }

    public final List<NotificationSettingsEntry> c() {
        return this.notificationSettingsEntries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettingsSection)) {
            return false;
        }
        NotificationSettingsSection notificationSettingsSection = (NotificationSettingsSection) other;
        return t.c(this.title, notificationSettingsSection.title) && t.c(this.notificationSettingsEntries, notificationSettingsSection.notificationSettingsEntries);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NotificationSettingsEntry> list = this.notificationSettingsEntries;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "NotificationSettingsSection(title=" + this.title + ", notificationSettingsEntries=" + this.notificationSettingsEntries + ')';
    }
}
