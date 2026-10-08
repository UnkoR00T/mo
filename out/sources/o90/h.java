package o90;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo90/h;", "", "<init>", "()V", "Lfc4/b;", "serverTimeLocalRepository", "Lla0/b;", "b", "(Lfc4/b;)Lla0/b;", "La84/a;", "checkAndRegisterDeviceToNotificationsUseCase", "Lj90/a;", "beGetNotDisplayedPushCountUC", "Lz74/b;", "pushNotificationDataSource", "Lla0/a;", "a", "(La84/a;Lj90/a;Lz74/b;)Lla0/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f143415a = new h();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"o90/h$a", "Lla0/a;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "a", "Lmu/g;", "", "Lmu/g;", "b", "()Lmu/g;", "hasUnreadNotifications", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements la0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mu.g<Boolean> hasUnreadNotifications;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z74.b f143417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j90.a f143418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a84.a f143419d;

        /* JADX INFO: renamed from: o90.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3555a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f143420d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f143422f;

            C3555a(tq.e<? super C3555a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143420d = obj;
                this.f143422f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f143423d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f143425f;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143423d = obj;
                this.f143425f |= PKIFailureInfo.systemUnavail;
                return a.this.c(this);
            }
        }

        a(z74.b bVar, j90.a aVar, a84.a aVar2) {
            this.f143417b = bVar;
            this.f143418c = aVar;
            this.f143419d = aVar2;
            this.hasUnreadNotifications = bVar.b();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // la0.a
        public Object a(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3555a c3555a;
            if (eVar instanceof C3555a) {
                c3555a = (C3555a) eVar;
                int i15 = c3555a.f143422f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3555a.f143422f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3555a = new C3555a(eVar);
                }
            } else {
                c3555a = new C3555a(eVar);
            }
            Object objG = c3555a.f143420d;
            Object objE = uq.b.e();
            int i16 = c3555a.f143422f;
            if (i16 == 0) {
                oq.u.b(objG);
                a84.a aVar = this.f143419d;
                a84.a.Params params = new a84.a.Params(w74.a.MJUNIOR);
                c3555a.f143422f = 1;
                objG = aVar.g(params, c3555a);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objG);
            }
            dx.i iVar = (dx.i) objG;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(oq.i0.f148189a);
        }

        @Override // la0.a
        public mu.g<Boolean> b() {
            return this.hasUnreadNotifications;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // la0.a
        public Object c(tq.e<? super oq.i0> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f143425f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f143425f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f143423d;
            Object objE = uq.b.e();
            int i16 = bVar.f143425f;
            if (i16 == 0) {
                oq.u.b(objA);
                j90.a aVar = this.f143418c;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                bVar.f143425f = 1;
                objA = aVar.a(c1792a, bVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objA);
            }
            dx.i iVar = (dx.i) objA;
            z74.b bVar2 = this.f143417b;
            if (iVar instanceof dx.i.Left) {
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                bVar2.a((int) ((Number) ((dx.i.Right) iVar).b()).longValue());
            }
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"o90/h$b", "Lla0/b;", "Lfz/b$f;", "serverCurrentTime", "Loq/i0;", "a", "(Lfz/b$f;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements la0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fc4.b f143426a;

        b(fc4.b bVar) {
            this.f143426a = bVar;
        }

        @Override // la0.b
        public void a(fz.b.OffsetDateTime serverCurrentTime) {
            this.f143426a.o(serverCurrentTime);
        }
    }

    private h() {
    }

    public final la0.a a(a84.a checkAndRegisterDeviceToNotificationsUseCase, j90.a beGetNotDisplayedPushCountUC, z74.b pushNotificationDataSource) {
        return new a(pushNotificationDataSource, beGetNotDisplayedPushCountUC, checkAndRegisterDeviceToNotificationsUseCase);
    }

    public final la0.b b(fc4.b serverTimeLocalRepository) {
        return new b(serverTimeLocalRepository);
    }
}
