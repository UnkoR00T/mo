package mz;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lmz/u;", "Lmz/d;", "", "packageName", "e", "(Ljava/lang/String;)Ljava/lang/String;", "g", "Landroid/os/Bundle;", "h", "(Ljava/lang/String;)Landroid/os/Bundle;", "j", "", "i", "(Ljava/lang/String;)I", "", "other", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    private /* synthetic */ u(String str) {
        this.packageName = str;
    }

    public static final /* synthetic */ u d(String str) {
        return new u(str);
    }

    public static String e(String str) {
        return str;
    }

    public static boolean f(String str, Object obj) {
        return (obj instanceof u) && fr.t.c(str, ((u) obj).getPackageName());
    }

    public static String g(String str) {
        return "android.settings.APP_NOTIFICATION_SETTINGS";
    }

    public static Bundle h(String str) {
        return e6.c.a(oq.y.a("android.provider.extra.APP_PACKAGE", str));
    }

    public static int i(String str) {
        return str.hashCode();
    }

    public static String j(String str) {
        return "OpenNotificationSettingsIntentType(packageName=" + str + ')';
    }

    @Override // kx.g
    public String a() {
        return g(this.packageName);
    }

    public boolean equals(Object obj) {
        return f(this.packageName, obj);
    }

    @Override // mz.d
    public Bundle getExtras() {
        return h(this.packageName);
    }

    public int hashCode() {
        return i(this.packageName);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ String getPackageName() {
        return this.packageName;
    }

    public String toString() {
        return j(this.packageName);
    }
}
