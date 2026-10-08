package dc;

import android.content.Context;
import android.os.Build;
import cc.i0;
import ju.p0;
import ju.v1;
import p071kotlin.Metadata;
import vb.r1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lcc/i0;", "spec", "Landroidx/work/c;", "worker", "Lub/l;", "foregroundUpdater", "Lec/b;", "taskExecutor", "Loq/i0;", "b", "(Landroid/content/Context;Lcc/i0;Landroidx/work/c;Lub/l;Lec/b;Ltq/e;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40737a = ub.w.i("WorkForegroundRunnable");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super Void>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f40739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i0 f40740g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ub.l f40741h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f40742j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.c cVar, i0 i0Var, ub.l lVar, Context context, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f40739f = cVar;
            this.f40740g = i0Var;
            this.f40741h = lVar;
            this.f40742j = context;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40738e;
            if (i15 == 0) {
                oq.u.b(obj);
                com.google.common.util.concurrent.q<ub.k> qVarD = this.f40739f.d();
                androidx.work.c cVar = this.f40739f;
                this.f40738e = 1;
                obj = r1.d(qVarD, cVar, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ub.k kVar = (ub.k) obj;
            if (kVar == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f40740g.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = b0.f40737a;
            i0 i0Var = this.f40740g;
            ub.w.e().a(str, "Updating notification for " + i0Var.workerClassName);
            com.google.common.util.concurrent.q<Void> qVarA = this.f40741h.a(this.f40742j, this.f40739f.e(), kVar);
            this.f40738e = 2;
            Object objB = androidx.concurrent.futures.e.b(qVarA, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Void> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f40739f, this.f40740g, this.f40741h, this.f40742j, eVar);
        }
    }

    public static final Object b(Context context, i0 i0Var, androidx.work.c cVar, ub.l lVar, ec.b bVar, tq.e<? super oq.i0> eVar) {
        if (!i0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return oq.i0.f148189a;
        }
        Object objG = ju.i.g(v1.b(bVar.a()), new a(cVar, i0Var, lVar, context, null), eVar);
        return objG == uq.b.e() ? objG : oq.i0.f148189a;
    }
}
