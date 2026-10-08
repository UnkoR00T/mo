package t00;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import p071kotlin.Metadata;
import s5.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt00/a;", "Ldy/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "()Z", "", "channelId", "Loq/i0;", "b", "(Ljava/lang/String;)V", "id", "name", "groupId", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/String;)Z", "Ls5/o;", "Ls5/o;", "notificationManager", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements dy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o notificationManager;

    public a(Context context) {
        this.notificationManager = o.e(context);
    }

    @Override // dy.a
    public void a(String id5, String name, String groupId) {
        NotificationChannel notificationChannel = new NotificationChannel(id5, name, 4);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        if (groupId != null) {
            notificationChannel.setGroup(groupId);
        }
        this.notificationManager.b(notificationChannel);
    }

    @Override // dy.a
    public void b(String channelId) {
        this.notificationManager.d(channelId);
    }

    @Override // dy.a
    public boolean c(String channelId) {
        NotificationChannel notificationChannelF = this.notificationManager.f(channelId);
        return (notificationChannelF == null || notificationChannelF.getImportance() == 0) ? false : true;
    }

    @Override // dy.a
    public void d(String id5, String name) {
        this.notificationManager.c(new NotificationChannelGroup(id5, name));
    }

    @Override // dy.a
    public boolean e() {
        return this.notificationManager.a();
    }
}
