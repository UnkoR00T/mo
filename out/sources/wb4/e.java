package wb4;

import er.l;
import er.p;
import iy.f0;
import iy.t;
import java.security.KeyStore;
import java.security.KeyStoreException;
import ju.g1;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwb4/e;", "Lqb4/e;", "Lac4/a;", "callActionWithLoaderUseCase", "Lqb4/d;", "clearBiometricUseCase", "Liy/t;", "keyStoreProvider", "Lpx/d;", "remoteLogger", "<init>", "(Lac4/a;Lqb4/d;Liy/t;Lpx/d;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lac4/a;", "b", "Lqb4/d;", "c", "Liy/t;", "d", "Lpx/d;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements qb4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qb4.d clearBiometricUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211992e;

        /* JADX INFO: renamed from: wb4.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C5587a extends k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f211994e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f211995f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f211996g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5587a(e eVar, tq.e<? super C5587a> eVar2) {
                super(2, eVar2);
                this.f211996g = eVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                p0 p0Var = (p0) this.f211995f;
                Object objE = uq.b.e();
                int i15 = this.f211994e;
                if (i15 == 0) {
                    u.b(obj);
                    this.f211996g.remoteLogger.F8("Deactivate biometric", px.d.a.GENERAL);
                    try {
                        KeyStore keyStore = (KeyStore) t.a(this.f211996g.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null).a();
                        if (keyStore != null) {
                            keyStore.deleteEntry("BiometricKey");
                        }
                    } catch (KeyStoreException e15) {
                        this.f211996g.remoteLogger.T6("Biometric key couldn't be cleared (deleted)", e15, px.c.a(p0Var));
                    }
                    qb4.d dVar = this.f211996g.clearBiometricUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f211995f = j.a(p0Var);
                    this.f211994e = 1;
                    if (dVar.c(c1792a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C5587a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C5587a c5587a = new C5587a(this.f211996g, eVar);
                c5587a.f211995f = obj;
                return c5587a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f211992e;
            if (i15 == 0) {
                u.b(obj);
                l0 l0VarB = g1.b();
                C5587a c5587a = new C5587a(e.this, null);
                this.f211992e = 1;
                if (ju.i.g(l0VarB, c5587a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return e.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public e(ac4.a aVar, qb4.d dVar, t tVar, px.d dVar2) {
        this.callActionWithLoaderUseCase = aVar;
        this.clearBiometricUseCase = dVar;
        this.keyStoreProvider = tVar;
        this.remoteLogger = dVar2;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }
}
