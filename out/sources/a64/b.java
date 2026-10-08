package a64;

import android.content.SharedPreferences;
import e64.c;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"La64/b;", "Le64/c;", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Lt10/k;)V", "", "b", "()Z", "isEnabled", "Loq/i0;", "a", "(Z)V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPrefs", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPrefs;

    public b(k kVar) {
        this.sharedPrefs = kVar.c("shared_prefs_notifications_settings");
    }

    @Override // e64.c
    public void a(boolean isEnabled) {
        this.sharedPrefs.edit().putBoolean("DOCUMENTS_NOTIFICATIONS_SETTINGS", isEnabled).apply();
    }

    @Override // e64.c
    public boolean b() {
        return this.sharedPrefs.getBoolean("DOCUMENTS_NOTIFICATIONS_SETTINGS", true);
    }
}
