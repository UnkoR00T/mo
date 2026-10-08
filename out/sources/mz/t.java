package mz;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lmz/t;", "Lmz/d;", "", "packageName", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Ljava/lang/String;", "b", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String channelId;

    public t(String str, String str2) {
        this.packageName = str;
        this.channelId = str2;
    }

    @Override // kx.g
    public String a() {
        return "android.settings.CHANNEL_NOTIFICATION_SETTINGS";
    }

    @Override // mz.d
    public Bundle getExtras() {
        return e6.c.a(oq.y.a("android.provider.extra.APP_PACKAGE", this.packageName), oq.y.a("android.provider.extra.CHANNEL_ID", this.channelId));
    }
}
