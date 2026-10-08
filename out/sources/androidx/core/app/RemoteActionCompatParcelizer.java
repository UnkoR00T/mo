package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f11817a = (IconCompat) aVar.v(remoteActionCompat.f11817a, 1);
        remoteActionCompat.f11818b = aVar.l(remoteActionCompat.f11818b, 2);
        remoteActionCompat.f11819c = aVar.l(remoteActionCompat.f11819c, 3);
        remoteActionCompat.f11820d = (PendingIntent) aVar.r(remoteActionCompat.f11820d, 4);
        remoteActionCompat.f11821e = aVar.h(remoteActionCompat.f11821e, 5);
        remoteActionCompat.f11822f = aVar.h(remoteActionCompat.f11822f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f11817a, 1);
        aVar.D(remoteActionCompat.f11818b, 2);
        aVar.D(remoteActionCompat.f11819c, 3);
        aVar.H(remoteActionCompat.f11820d, 4);
        aVar.z(remoteActionCompat.f11821e, 5);
        aVar.z(remoteActionCompat.f11822f, 6);
    }
}
