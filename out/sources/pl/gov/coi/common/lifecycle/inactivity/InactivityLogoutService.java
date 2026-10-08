package pl.gov.coi.common.lifecycle.inactivity;

import android.app.job.JobParameters;
import android.app.job.JobService;
import er.p;
import gx.d;
import ju.a0;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import oq.i0;
import oq.u;
import oz.h;
import p071kotlin.Metadata;
import px.c;
import px.f;
import tq.e;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/common/lifecycle/inactivity/InactivityLogoutService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "params", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Loq/i0;", "onDestroy", "Lju/a0;", "a", "Lju/a0;", "job", "Lju/p0;", "b", "Lju/p0;", "scope", "lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InactivityLogoutService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 job;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f158082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InactivityLogoutService f158083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ JobParameters f158084h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, InactivityLogoutService inactivityLogoutService, JobParameters jobParameters, e<? super a> eVar) {
            super(2, eVar);
            this.f158082f = dVar;
            this.f158083g = inactivityLogoutService;
            this.f158084h = jobParameters;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b.e();
            if (this.f158081e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f158082f.c(hx.a.f86814a);
            f.f163100a.b("Logged out due to inactivity", c.a(this.f158083g));
            this.f158083g.jobFinished(this.f158084h, false);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f158082f, this.f158083g, this.f158084h, eVar);
        }
    }

    public InactivityLogoutService() {
        a0 a0VarB = z2.b(null, 1, null);
        this.job = a0VarB;
        this.scope = q0.a(g1.b().n0(a0VarB));
    }

    @Override // android.app.Service
    public void onDestroy() {
        q0.d(this.scope, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        d dVarA = h.f150718a.a();
        if (dVarA != null) {
            ju.k.d(this.scope, null, null, new a(dVarA, this, params, null), 3, null);
            return true;
        }
        f.e(f.f163100a, "Unable to log out due to inactivity. Missing InactivityLogoutDependencies initialization.", null, c.a(this), 2, null);
        jobFinished(params, false);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        q0.d(this.scope, null, 1, null);
        return false;
    }
}
