package pc4;

import kt0.RegisterDeviceRequest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y74.RegisterDeviceResponse;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpc4/h8;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/g1;", "hasDocumentWithActiveCertUseCase", "Lk24/i;", "hasAnyActiveCertificateUC", "Llt0/e;", "registerDeviceUseCase", "Lx74/a;", "a", "(Lc54/b;Lq34/g1;Lk24/i;Llt0/e;)Lx74/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h8 f154682a = new h8();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"pc4/h8$a", "Lx74/a;", "", "pushToken", "", "pushNotificationsEnabled", "Ldx/i;", "Ldx/b;", "Ly74/c;", "e", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lw74/a;", "a", "Lw74/a;", "b", "()Lw74/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements x74.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final w74.a featureConfig = w74.a.MOBYWATEL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lt0.e f154684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c54.b f154685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.i f154686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.g1 f154687e;

        /* JADX INFO: renamed from: pc4.h8$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3837a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154688d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f154689e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f154690f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154692h;

            C3837a(tq.e<? super C3837a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154690f = obj;
                this.f154692h |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, false, this);
            }
        }

        a(lt0.e eVar, c54.b bVar, k24.i iVar, q34.g1 g1Var) {
            this.f154684b = eVar;
            this.f154685c = bVar;
            this.f154686d = iVar;
            this.f154687e = g1Var;
        }

        @Override // x74.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public w74.a getFeatureConfig() {
            return this.featureConfig;
        }

        @Override // x74.a
        public Object d(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            boolean zBooleanValue = this.f154685c.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f154686d.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f154687e.a(gz.b.a.C1792a.f78542a);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x74.a
        public Object e(String str, boolean z15, tq.e<? super dx.i<? extends dx.b, RegisterDeviceResponse>> eVar) throws Throwable {
            C3837a c3837a;
            if (eVar instanceof C3837a) {
                c3837a = (C3837a) eVar;
                int i15 = c3837a.f154692h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3837a.f154692h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3837a = new C3837a(eVar);
                }
            } else {
                c3837a = new C3837a(eVar);
            }
            Object objC = c3837a.f154690f;
            Object objE = uq.b.e();
            int i16 = c3837a.f154692h;
            if (i16 == 0) {
                oq.u.b(objC);
                lt0.e eVar2 = this.f154684b;
                lt0.e.Params params = new lt0.e.Params(new RegisterDeviceRequest(str, z15));
                c3837a.f154688d = vq.j.a(str);
                c3837a.f154689e = z15;
                c3837a.f154692h = 1;
                objC = eVar2.c(params, c3837a);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(j8.f155069a.a((kt0.RegisterDeviceResponse) ((dx.i.Right) iVar).b()));
        }
    }

    private h8() {
    }

    public final x74.a a(c54.b isFeatureEnabledUseCase, q34.g1 hasDocumentWithActiveCertUseCase, k24.i hasAnyActiveCertificateUC, lt0.e registerDeviceUseCase) {
        return new a(registerDeviceUseCase, isFeatureEnabledUseCase, hasAnyActiveCertificateUC, hasDocumentWithActiveCertUseCase);
    }
}
