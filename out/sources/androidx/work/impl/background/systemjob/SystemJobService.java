package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import cc.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ub.w;
import vb.a1;
import vb.c1;
import vb.e;
import vb.e1;
import vb.s;
import vb.x;
import vb.y;

/* JADX INFO: loaded from: classes3.dex */
public class SystemJobService extends JobService implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f13845e = w.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f13846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, JobParameters> f13847b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f13848c = y.b(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a1 f13849d;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    private static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    static int b(int i15) {
        switch (i15) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i15;
            default:
                return -512;
        }
    }

    private static WorkGenerationalId c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // vb.e
    public void d(WorkGenerationalId workGenerationalId, boolean z15) {
        a("onExecuted");
        w.e().a(f13845e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.f13847b.remove(workGenerationalId);
        this.f13848c.c(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z15);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            e1 e1VarP = e1.p(getApplicationContext());
            this.f13846a = e1VarP;
            s sVarR = e1VarP.r();
            this.f13849d = new c1(sVarR, this.f13846a.v());
            sVarR.e(this);
        } catch (IllegalStateException e15) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e15);
            }
            w.e().k(f13845e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.f13846a;
        if (e1Var != null) {
            e1Var.r().m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f13846a == null) {
            w.e().a(f13845e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            w.e().c(f13845e, "WorkSpec id not found!");
            return false;
        }
        if (this.f13847b.containsKey(workGenerationalIdC)) {
            w.e().a(f13845e, "Job is already being executed by SystemJobService: " + workGenerationalIdC);
            return false;
        }
        w.e().a(f13845e, "onStartJob for " + workGenerationalIdC);
        this.f13847b.put(workGenerationalIdC, jobParameters);
        int i15 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f13778b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f13777a = Arrays.asList(a.a(jobParameters));
        }
        if (i15 >= 28) {
            aVar.f13779c = b.a(jobParameters);
        }
        this.f13849d.c(this.f13848c.f(workGenerationalIdC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f13846a == null) {
            w.e().a(f13845e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            w.e().c(f13845e, "WorkSpec id not found!");
            return false;
        }
        w.e().a(f13845e, "onStopJob for " + workGenerationalIdC);
        this.f13847b.remove(workGenerationalIdC);
        x xVarC = this.f13848c.c(workGenerationalIdC);
        if (xVarC != null) {
            this.f13849d.e(xVarC, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f13846a.r().j(workGenerationalIdC.getWorkSpecId());
    }
}
