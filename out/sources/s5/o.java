package s5;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f177960c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set<String> f177961d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f177962e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f177963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f177964b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static NotificationChannel d(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }
    }

    private o(Context context) {
        this.f177963a = context;
        this.f177964b = (NotificationManager) context.getSystemService("notification");
    }

    public static o e(Context context) {
        return new o(context);
    }

    public boolean a() {
        return a.a(this.f177964b);
    }

    public void b(NotificationChannel notificationChannel) {
        b.a(this.f177964b, notificationChannel);
    }

    public void c(NotificationChannelGroup notificationChannelGroup) {
        b.b(this.f177964b, notificationChannelGroup);
    }

    public void d(String str) {
        b.c(this.f177964b, str);
    }

    public NotificationChannel f(String str) {
        return b.d(this.f177964b, str);
    }
}
