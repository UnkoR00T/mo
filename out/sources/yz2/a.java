package yz2;

import android.content.SharedPreferences;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lyz2/a;", "Lc03/a;", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Lt10/k;)V", "Landroid/content/SharedPreferences;", "a", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "value", "()Z", "b", "(Z)V", "shouldDisplayOutdatedAlert", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c03.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230969c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public a(k kVar) {
        this.sharedPreferences = kVar.c("shared_prefs_registered_address");
    }

    @Override // c03.a
    public boolean a() {
        return this.sharedPreferences.getBoolean("SHARED_PREFERENCES_DISPLAY_ALERT", true);
    }

    @Override // c03.a
    public void b(boolean z15) {
        this.sharedPreferences.edit().putBoolean("SHARED_PREFERENCES_DISPLAY_ALERT", z15).apply();
    }
}
