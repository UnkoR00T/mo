package v44;

import android.content.SharedPreferences;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lv44/a;", "Lx44/a;", "Lt10/k;", "sharedPreferencesFactory", "<init>", "(Lt10/k;)V", "", "shouldShow", "Loq/i0;", "k", "(Z)V", "u", "()Z", "hasAnyPayment", "Q", "K", "clear", "()V", "Landroid/content/SharedPreferences;", "a", "Landroid/content/SharedPreferences;", "sharedPreferences", "b", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements x44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public a(k kVar) {
        this.sharedPreferences = kVar.c("shared_prefs_epayments");
    }

    @Override // x44.a
    public boolean K() {
        return this.sharedPreferences.getBoolean("SHARED_PREFERENCES_HAS_ANY_PAYMENT", false);
    }

    @Override // x44.a
    public void Q(boolean hasAnyPayment) {
        this.sharedPreferences.edit().putBoolean("SHARED_PREFERENCES_HAS_ANY_PAYMENT", hasAnyPayment).apply();
    }

    @Override // wy.c
    public void clear() {
        Q(false);
    }

    @Override // x44.a
    public void k(boolean shouldShow) {
        this.sharedPreferences.edit().putBoolean("SHARED_PREFERENCES_SHOW_ONE_CLICK_PAYMENT_INFO_ALERT", shouldShow).apply();
    }

    @Override // x44.a
    public boolean u() {
        return this.sharedPreferences.getBoolean("SHARED_PREFERENCES_SHOW_ONE_CLICK_PAYMENT_INFO_ALERT", true);
    }
}
