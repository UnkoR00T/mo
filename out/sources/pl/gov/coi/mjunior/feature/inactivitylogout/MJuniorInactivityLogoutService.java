package pl.gov.coi.mjunior.feature.inactivitylogout;

import android.app.job.JobParameters;
import er.p;
import ju.a0;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import qg0.h;
import tq.e;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpl/gov/coi/mjunior/feature/inactivitylogout/MJuniorInactivityLogoutService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "params", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Lqg0/h;", "d", "Lqg0/h;", "()Lqg0/h;", "setLogoutFromAppUC", "(Lqg0/h;)V", "logoutFromAppUC", "Lju/a0;", "e", "Lju/a0;", "job", "Lju/p0;", "f", "Lju/p0;", "scope", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MJuniorInactivityLogoutService extends dc0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public h logoutFromAppUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a0 job;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158236e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ JobParameters f158238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JobParameters jobParameters, e<? super a> eVar) {
            super(2, eVar);
            this.f158238g = jobParameters;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f158236e;
            if (i15 == 0) {
                u.b(obj);
                h hVarD = MJuniorInactivityLogoutService.this.d();
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f158236e = 1;
                if (hVarD.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            MJuniorInactivityLogoutService.this.jobFinished(this.f158238g, false);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return MJuniorInactivityLogoutService.this.new a(this.f158238g, eVar);
        }
    }

    public MJuniorInactivityLogoutService() {
        a0 a0VarB = z2.b(null, 1, null);
        this.job = a0VarB;
        this.scope = q0.a(g1.b().n0(a0VarB));
    }

    public final h d() {
        h hVar = this.logoutFromAppUC;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        ju.k.d(this.scope, null, null, new a(params, null), 3, null);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        d2.a.a(this.job, null, 1, null);
        return false;
    }
}
