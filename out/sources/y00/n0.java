package y00;

import android.content.Context;
import android.content.Intent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ly00/n0;", "Liy/z;", "Landroid/content/Context;", "context", "Lpx/d;", "remoteLogger", "<init>", "(Landroid/content/Context;Lpx/d;)V", "Loq/i0;", "a", "()V", "Landroid/content/Context;", "b", "Lpx/d;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 implements iy.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f222823f;

        /* JADX INFO: renamed from: y00.n0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"y00/n0$a$a", "Lrh/a$a;", "", "errorCode", "Landroid/content/Intent;", "intent", "Loq/i0;", "b", "(ILandroid/content/Intent;)V", "a", "()V", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C5955a implements rh.a.InterfaceC4440a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f222825a;

            C5955a(n0 n0Var) {
                this.f222825a = n0Var;
            }

            @Override // rh.a.InterfaceC4440a
            public void a() {
                this.f222825a.remoteLogger.F8("Security provider up to date.", px.d.a.GENERAL);
            }

            @Override // rh.a.InterfaceC4440a
            public void b(int errorCode, Intent intent) {
                px.b.y5(this.f222825a.remoteLogger, "Update google play services fails. errorCode: " + errorCode + " intent: " + intent, null, px.c.a(this), 2, null);
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju.p0 p0Var = (ju.p0) this.f222823f;
            uq.b.e();
            if (this.f222822e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            try {
                rh.a.b(n0.this.context, new C5955a(n0.this));
            } catch (Exception e15) {
                n0.this.remoteLogger.T6("Update google play services fails", e15, px.c.a(p0Var));
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = n0.this.new a(eVar);
            aVar.f222823f = obj;
            return aVar;
        }
    }

    public n0(Context context, px.d dVar) {
        this.context = context;
        this.remoteLogger = dVar;
    }

    @Override // iy.z
    public void a() {
        ju.k.d(ju.q0.b(), null, null, new a(null), 3, null);
    }
}
