package dc;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import cc.Preference;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f40772a;

    public s(WorkDatabase workDatabase) {
        this.f40772a = workDatabase;
    }

    public static void c(Context context, za.c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j15 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j16 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.q0();
            try {
                cVar.a1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j15)});
                cVar.a1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j16)});
                sharedPreferences.edit().clear().apply();
                cVar.X0();
            } finally {
                cVar.r1();
            }
        }
    }

    public long a() {
        Long lB = this.f40772a.a0().b("last_force_stop_ms");
        if (lB != null) {
            return lB.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lB = this.f40772a.a0().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void d(long j15) {
        this.f40772a.a0().a(new Preference("last_force_stop_ms", Long.valueOf(j15)));
    }

    public void e(boolean z15) {
        this.f40772a.a0().a(new Preference("reschedule_needed", z15));
    }
}
