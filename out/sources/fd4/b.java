package fd4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import p071kotlin.Metadata;
import pl.gov.mc.fringers.mobywatel.manager.job.InactivityLogoutService;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lfd4/b;", "Lxj2/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Loq/i0;", "a", "()V", "b", "Landroid/content/Context;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xj2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public b(Context context) {
        this.context = context;
    }

    @Override // xj2.a
    public void a() {
        ((JobScheduler) this.context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(9751, new ComponentName(this.context.getPackageName(), InactivityLogoutService.class.getName())).setMinimumLatency(240000L).setOverrideDeadline(300000L).setRequiresDeviceIdle(false).setPersisted(false).build());
    }

    @Override // xj2.a
    public void b() {
        ((JobScheduler) this.context.getSystemService("jobscheduler")).cancel(9751);
    }
}
