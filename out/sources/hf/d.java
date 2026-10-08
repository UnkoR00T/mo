package hf;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes3.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f84077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jf.d f84078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f84079c;

    public d(Context context, jf.d dVar, f fVar) {
        this.f84077a = context;
        this.f84078b = dVar;
        this.f84079c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i15, int i16) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i17 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i15) {
                if (i17 >= i16) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // hf.x
    public void a(af.o oVar, int i15) {
        b(oVar, i15, false);
    }

    @Override // hf.x
    public void b(af.o oVar, int i15, boolean z15) {
        ComponentName componentName = new ComponentName(this.f84077a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f84077a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z15 && d(jobScheduler, iC, i15)) {
            ef.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jV0 = this.f84078b.V0(oVar);
        JobInfo.Builder builderC = this.f84079c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jV0, i15);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i15);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", mf.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        ef.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f84079c.g(oVar.d(), jV0, i15)), Long.valueOf(jV0), Integer.valueOf(i15));
        jobScheduler.schedule(builderC.build());
    }

    int c(af.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f84077a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(mf.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
