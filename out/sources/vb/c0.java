package vb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lju/p0;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "Loq/i0;", "c", "(Lju/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f205742a = ub.w.i("UnfinishedWorkListener");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f205743b = TimeUnit.HOURS.toMillis(1);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmu/h;", "", "", "throwable", "", "attempt", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.r<mu.h<? super Boolean>, Throwable, Long, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ long f205746g;

        a(tq.e<? super a> eVar) {
            super(4, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f205744e;
            if (i15 == 0) {
                oq.u.b(obj);
                Throwable th4 = (Throwable) this.f205745f;
                long j15 = this.f205746g;
                ub.w.e().d(c0.f205742a, "Cannot check for unfinished work", th4);
                long jMin = Math.min(j15 * ((long) 30000), c0.f205743b);
                this.f205744e = 1;
                if (ju.z0.b(jMin, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return vq.b.a(true);
        }

        public final Object M(mu.h<? super Boolean> hVar, Throwable th4, long j15, tq.e<? super Boolean> eVar) {
            a aVar = new a(eVar);
            aVar.f205745f = th4;
            aVar.f205746g = j15;
            return aVar.J(oq.i0.f148189a);
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ Object g(mu.h<? super Boolean> hVar, Throwable th4, Long l15, tq.e<? super Boolean> eVar) {
            return M(hVar, th4, l15.longValue(), eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasUnfinishedWork", "Loq/i0;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<Boolean, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f205748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f205749g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f205749g = context;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Boolean bool, tq.e<? super oq.i0> eVar) {
            return M(bool.booleanValue(), eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f205747e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dc.r.c(this.f205749g, RescheduleReceiver.class, this.f205748f);
            return oq.i0.f148189a;
        }

        public final Object M(boolean z15, tq.e<? super oq.i0> eVar) {
            return ((b) v(Boolean.valueOf(z15), eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f205749g, eVar);
            bVar.f205748f = ((Boolean) obj).booleanValue();
            return bVar;
        }
    }

    public static final void c(ju.p0 p0Var, Context context, androidx.work.a aVar, WorkDatabase workDatabase) {
        if (dc.t.b(context, aVar)) {
            mu.i.N(mu.i.S(mu.i.p(mu.i.m(mu.i.X(workDatabase.e0().q(), new a(null)))), new b(context, null)), p0Var);
        }
    }
}
