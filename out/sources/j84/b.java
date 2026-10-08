package j84;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj84/a;", "", "messageId", "a", "(Lj84/a;Ljava/lang/String;)Lj84/a;", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final NotificationsHistoryData a(NotificationsHistoryData notificationsHistoryData, String str) {
        ArrayList arrayList;
        List<NotificationsHistoryRecord> listB = notificationsHistoryData.b();
        if (listB != null) {
            List<NotificationsHistoryRecord> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            for (NotificationsHistoryRecord notificationsHistoryRecordB : list) {
                if (t.c(notificationsHistoryRecordB.getId(), str)) {
                    notificationsHistoryRecordB = NotificationsHistoryRecord.b(notificationsHistoryRecordB, null, null, null, null, null, true, null, null, 223, null);
                }
                arrayList.add(notificationsHistoryRecordB);
            }
        } else {
            arrayList = null;
        }
        return notificationsHistoryData.a(arrayList);
    }
}
