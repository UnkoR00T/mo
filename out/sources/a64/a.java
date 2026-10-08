package a64;

import android.content.SharedPreferences;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"La64/a;", "Le64/a;", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Lt10/k;)V", "", "a", "()Z", "Loq/i0;", "b", "()V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPrefs", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e64.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPrefs;

    public a(k kVar) {
        this.sharedPrefs = kVar.c("shared_prefs_local_notifications_migration");
    }

    @Override // e64.a
    public boolean a() {
        return this.sharedPrefs.getBoolean("LOCAL_NOTIFICATIONS_MIGRATION_COMPLETED", false);
    }

    @Override // e64.a
    public void b() {
        this.sharedPrefs.edit().putBoolean("LOCAL_NOTIFICATIONS_MIGRATION_COMPLETED", true).apply();
    }
}
