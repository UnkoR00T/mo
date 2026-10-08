package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lpc4/a1;", "", "<init>", "()V", "Lcz/c;", "persistentStorageFactory", "Liy/t;", "keyStoreProvider", "Lez/a;", "currentTimeProvider", "Lpy/i;", "keyGenerator", "Lxw/d;", "dispatcherProvider", "Lpx/d;", "logger", "Lxa4/a;", "c", "(Lcz/c;Liy/t;Lez/a;Lpy/i;Lxw/d;Lpx/d;)Lxa4/a;", "Lab4/b;", "getLockTimeLeftUseCase", "Lab4/d;", "resetLockUseCase", "Lk74/a;", "b", "(Lab4/b;Lab4/d;)Lk74/a;", "platform", "f", "(Lxa4/a;)Lab4/d;", "e", "(Lxa4/a;)Lab4/b;", "Lab4/a;", "d", "(Lxa4/a;)Lab4/a;", "Lab4/c;", "a", "(Lxa4/a;)Lab4/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a1 {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"pc4/a1$a", "Lk74/a;", "Lgu/b;", "b", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements k74.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ab4.b f154294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ab4.d f154295b;

        /* JADX INFO: renamed from: pc4.a1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3825a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154296d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154298f;

            C3825a(tq.e<? super C3825a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154296d = obj;
                this.f154298f |= PKIFailureInfo.systemUnavail;
                return a.this.b(this);
            }
        }

        a(ab4.b bVar, ab4.d dVar) {
            this.f154294a = bVar;
            this.f154295b = dVar;
        }

        @Override // k74.a
        public Object a(tq.e<? super oq.i0> eVar) {
            Object objA = this.f154295b.a(eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // k74.a
        public Object b(tq.e<? super gu.b> eVar) throws Throwable {
            C3825a c3825a;
            if (eVar instanceof C3825a) {
                c3825a = (C3825a) eVar;
                int i15 = c3825a.f154298f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3825a.f154298f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3825a = new C3825a(eVar);
                }
            } else {
                c3825a = new C3825a(eVar);
            }
            Object objA = c3825a.f154296d;
            Object objE = uq.b.e();
            int i16 = c3825a.f154298f;
            if (i16 == 0) {
                oq.u.b(objA);
                ab4.b bVar = this.f154294a;
                c3825a.f154298f = 1;
                objA = bVar.a(c3825a);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            return gu.b.o(gu.d.r(((Number) objA).longValue(), gu.e.SECONDS));
        }
    }

    public final ab4.c a(xa4.a platform) {
        return new ab4.c(platform);
    }

    public final k74.a b(ab4.b getLockTimeLeftUseCase, ab4.d resetLockUseCase) {
        return new a(getLockTimeLeftUseCase, resetLockUseCase);
    }

    public final xa4.a c(cz.c persistentStorageFactory, iy.t keyStoreProvider, ez.a currentTimeProvider, py.i keyGenerator, xw.d dispatcherProvider, px.d logger) {
        return new ya4.a(persistentStorageFactory, keyStoreProvider, currentTimeProvider, keyGenerator, dispatcherProvider, logger);
    }

    public final ab4.a d(xa4.a platform) {
        return new ab4.a(platform);
    }

    public final ab4.b e(xa4.a platform) {
        return new ab4.b(platform);
    }

    public final ab4.d f(xa4.a platform) {
        return new ab4.d(platform);
    }
}
