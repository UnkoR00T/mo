package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import af.o;
import af.t;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import mf.a;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i15 = jobParameters.getExtras().getInt("priority");
        int i16 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        o.a aVarD = o.a().b(string).d(a.b(i15));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        t.c().e().m(aVarD.a(), i16, new Runnable() { // from class: hf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f84080a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
