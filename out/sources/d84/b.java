package d84;

import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Ld84/c;", "Ld84/d;", "b", "(Ljava/util/List;)Ljava/util/List;", "", "notificationType", "", "isChecked", "c", "(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;", "Ld84/a;", "a", "(Ljava/util/List;)Ld84/a;", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final NotificationSettingsEntry a(List<NotificationSettingsSection> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<NotificationSettingsEntry> listC = ((NotificationSettingsSection) it.next()).c();
            if (listC == null) {
                listC = v.n();
            }
            v.D(arrayList, listC);
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            next = it4.next();
            if (t.c(((NotificationSettingsEntry) next).getType(), "DOCUMENTS")) {
                return (NotificationSettingsEntry) next;
            }
        }
        next = null;
        return (NotificationSettingsEntry) next;
    }

    public static final List<NotificationSettingsUpdateEntry> b(List<NotificationSettingsSection> list) {
        Collection collectionN;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<NotificationSettingsEntry> listC = ((NotificationSettingsSection) it.next()).c();
            if (listC != null) {
                List<NotificationSettingsEntry> list2 = listC;
                collectionN = new ArrayList(v.y(list2, 10));
                for (NotificationSettingsEntry notificationSettingsEntry : list2) {
                    collectionN.add(new NotificationSettingsUpdateEntry(notificationSettingsEntry.getType(), notificationSettingsEntry.getEnabled()));
                }
            } else {
                collectionN = v.n();
            }
            v.D(arrayList, collectionN);
        }
        return arrayList;
    }

    public static final List<NotificationSettingsSection> c(List<NotificationSettingsSection> list, String str, boolean z15) {
        ArrayList arrayList;
        NotificationSettingsEntry notificationSettingsEntryB;
        List<NotificationSettingsSection> list2 = list;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        for (NotificationSettingsSection notificationSettingsSection : list2) {
            List<NotificationSettingsEntry> listC = notificationSettingsSection.c();
            if (listC != null) {
                List<NotificationSettingsEntry> list3 = listC;
                arrayList = new ArrayList(v.y(list3, 10));
                for (NotificationSettingsEntry notificationSettingsEntry : list3) {
                    NotificationSettingsEntry notificationSettingsEntry2 = t.c(notificationSettingsEntry.getType(), str) ? notificationSettingsEntry : null;
                    if (notificationSettingsEntry2 != null && (notificationSettingsEntryB = NotificationSettingsEntry.b(notificationSettingsEntry2, null, null, null, z15, 7, null)) != null) {
                        notificationSettingsEntry = notificationSettingsEntryB;
                    }
                    arrayList.add(notificationSettingsEntry);
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(NotificationSettingsSection.b(notificationSettingsSection, null, arrayList, 1, null));
        }
        return arrayList2;
    }
}
