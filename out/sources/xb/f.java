package xb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import cc.SystemIdInfo;
import cc.WorkGenerationalId;
import cc.i0;
import cc.j0;
import cc.r1;
import cc.v;
import dc.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ub.f0;
import ub.o0;
import ub.w;
import vb.u;

/* JADX INFO: loaded from: classes3.dex */
public class f implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f217866f = w.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f217867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f217868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f217869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkDatabase f217870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.work.a f217871e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.c(context), new d(context, aVar.getClock(), aVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, it.next().getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i15) {
        try {
            jobScheduler.cancel(i15);
        } catch (Throwable th4) {
            w.e().d(f217866f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i15)), th4);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            WorkGenerationalId workGenerationalIdH = h(jobInfo);
            if (workGenerationalIdH != null && str.equals(workGenerationalIdH.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = c.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static WorkGenerationalId h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerC = c.c(context);
        List<JobInfo> listG = g(context, jobSchedulerC);
        List<String> listB = workDatabase.b0().b();
        boolean z15 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                WorkGenerationalId workGenerationalIdH = h(jobInfo);
                if (workGenerationalIdH != null) {
                    hashSet.add(workGenerationalIdH.getWorkSpecId());
                } else {
                    d(jobSchedulerC, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                w.e().a(f217866f, "Reconciling jobs");
                z15 = true;
                break;
            }
        }
        if (!z15) {
            return z15;
        }
        workDatabase.i();
        try {
            j0 j0VarE0 = workDatabase.e0();
            Iterator<String> it4 = listB.iterator();
            while (it4.hasNext()) {
                j0VarE0.o(it4.next(), -1L);
            }
            workDatabase.X();
            return z15;
        } finally {
            workDatabase.q();
        }
    }

    @Override // vb.u
    public void b(String str) {
        List<Integer> listF = f(this.f217867a, this.f217868b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            d(this.f217868b, it.next().intValue());
        }
        this.f217870d.b0().e(str);
    }

    @Override // vb.u
    public void c(i0... i0VarArr) {
        j jVar = new j(this.f217870d);
        for (i0 i0Var : i0VarArr) {
            this.f217870d.i();
            try {
                i0 i0VarI = this.f217870d.e0().i(i0Var.id);
                if (i0VarI == null) {
                    w.e().k(f217866f, "Skipping scheduling " + i0Var.id + " because it's no longer in the DB");
                    this.f217870d.X();
                } else if (i0VarI.state != o0.c.ENQUEUED) {
                    w.e().k(f217866f, "Skipping scheduling " + i0Var.id + " because it is no longer enqueued");
                    this.f217870d.X();
                } else {
                    WorkGenerationalId workGenerationalIdA = r1.a(i0Var);
                    SystemIdInfo systemIdInfoC = this.f217870d.b0().c(workGenerationalIdA);
                    int iB = systemIdInfoC != null ? systemIdInfoC.systemId : jVar.b(this.f217871e.getMinJobSchedulerId(), this.f217871e.getMaxJobSchedulerId());
                    if (systemIdInfoC == null) {
                        this.f217870d.b0().d(v.a(workGenerationalIdA, iB));
                    }
                    j(i0Var, iB);
                    this.f217870d.X();
                }
                this.f217870d.q();
            } catch (Throwable th4) {
                this.f217870d.q();
                throw th4;
            }
        }
    }

    @Override // vb.u
    public boolean e() {
        return true;
    }

    public void j(i0 i0Var, int i15) {
        JobInfo jobInfoA = this.f217869c.a(i0Var, i15);
        w wVarE = w.e();
        String str = f217866f;
        wVarE.a(str, "Scheduling work ID " + i0Var.id + "Job ID " + i15);
        try {
            if (this.f217868b.schedule(jobInfoA) == 0) {
                w.e().k(str, "Unable to schedule work ID " + i0Var.id);
                if (i0Var.expedited && i0Var.outOfQuotaPolicy == f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    i0Var.expedited = false;
                    w.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", i0Var.id));
                    j(i0Var, i15);
                }
            }
        } catch (IllegalStateException e15) {
            String strA = c.a(this.f217867a, this.f217870d, this.f217871e);
            w.e().c(f217866f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e15);
            i6.a<Throwable> aVarL = this.f217871e.l();
            if (aVarL == null) {
                throw illegalStateException;
            }
            aVarL.accept(illegalStateException);
        } catch (Throwable th4) {
            w.e().d(f217866f, "Unable to schedule " + i0Var, th4);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f217867a = context;
        this.f217868b = jobScheduler;
        this.f217869c = dVar;
        this.f217870d = workDatabase;
        this.f217871e = aVar;
    }
}
