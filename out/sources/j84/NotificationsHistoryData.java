package j84;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: j84.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lj84/a;", "", "", "Lj84/c;", "notifications", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lj84/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationsHistoryData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<NotificationsHistoryRecord> notifications;

    public NotificationsHistoryData(List<NotificationsHistoryRecord> list) {
        this.notifications = list;
    }

    public final NotificationsHistoryData a(List<NotificationsHistoryRecord> notifications) {
        return new NotificationsHistoryData(notifications);
    }

    public final List<NotificationsHistoryRecord> b() {
        return this.notifications;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationsHistoryData) && t.c(this.notifications, ((NotificationsHistoryData) other).notifications);
    }

    public int hashCode() {
        List<NotificationsHistoryRecord> list = this.notifications;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "NotificationsHistoryData(notifications=" + this.notifications + ')';
    }
}
