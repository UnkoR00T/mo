package ec0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.feature.inactivitylogout.MJuniorInactivityLogoutService;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lec0/c;", "Lec0/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Loq/i0;", "a", "()V", "b", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public c(Context context) {
        this.context = context;
    }

    @Override // ec0.b
    public void a() {
        ((JobScheduler) this.context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(101203, new ComponentName(this.context.getPackageName(), MJuniorInactivityLogoutService.class.getName())).setMinimumLatency(240000L).setOverrideDeadline(300000L).setRequiresDeviceIdle(false).setPersisted(false).build());
    }

    @Override // ec0.b
    public void b() {
        ((JobScheduler) this.context.getSystemService("jobscheduler")).cancel(101203);
    }
}
