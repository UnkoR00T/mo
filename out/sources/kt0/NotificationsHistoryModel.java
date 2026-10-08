package kt0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kt0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkt0/e;", "", "", "Lkt0/b;", "notifications", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationsHistoryModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<NotificationRecord> notifications;

    public NotificationsHistoryModel(List<NotificationRecord> list) {
        this.notifications = list;
    }

    public final List<NotificationRecord> a() {
        return this.notifications;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationsHistoryModel) && t.c(this.notifications, ((NotificationsHistoryModel) other).notifications);
    }

    public int hashCode() {
        List<NotificationRecord> list = this.notifications;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "NotificationsHistoryModel(notifications=" + this.notifications + ")";
    }
}
