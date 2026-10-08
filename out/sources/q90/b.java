package q90;

import d84.NotificationSettingsEntry;
import d84.NotificationSettingsSection;
import h90.BENotificationSettingsEntry;
import h90.BENotificationSettingsSection;
import h90.BENotificationsSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh90/d;", "", "Ld84/c;", "d", "(Lh90/d;)Ljava/util/List;", "Lh90/b;", "c", "(Lh90/b;)Ld84/c;", "Lh90/a;", "Ld84/a;", "b", "(Lh90/a;)Ld84/a;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final NotificationSettingsEntry b(BENotificationSettingsEntry bENotificationSettingsEntry) {
        return new NotificationSettingsEntry(bENotificationSettingsEntry.getType(), bENotificationSettingsEntry.getTitle(), bENotificationSettingsEntry.getDescription(), bENotificationSettingsEntry.getEnabled());
    }

    private static final NotificationSettingsSection c(BENotificationSettingsSection bENotificationSettingsSection) {
        ArrayList arrayList;
        String title = bENotificationSettingsSection.getTitle();
        List<BENotificationSettingsEntry> listA = bENotificationSettingsSection.a();
        if (listA != null) {
            List<BENotificationSettingsEntry> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((BENotificationSettingsEntry) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new NotificationSettingsSection(title, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NotificationSettingsSection> d(BENotificationsSettings bENotificationsSettings) {
        List<BENotificationSettingsSection> listA = bENotificationsSettings.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((BENotificationSettingsSection) it.next()));
        }
        return arrayList;
    }
}
