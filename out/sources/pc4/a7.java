package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpc4/a7;", "", "<init>", "()V", "Lk24/e;", "getMIdCardDataUC", "Lq34/w0;", "getMIdCardDataUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "Lmx/c;", "labelProvider", "Lvy2/a;", "a", "(Lk24/e;Lq34/w0;Lc54/b;Lmx/c;)Lvy2/a;", "La84/a;", "checkAndRegisterDeviceToNotificationsUseCase", "Lxy2/a;", "b", "(La84/a;)Lxy2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a7 f154375a = new a7();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/a7$a", "Lvy2/a;", "Ldx/i;", "Ldx/b;", "Lwy2/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements vy2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.e f154377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.w0 f154378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ mx.c f154379d;

        /* JADX INFO: renamed from: pc4.a7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3827a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154380d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154382f;

            C3827a(tq.e<? super C3827a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154380d = obj;
                this.f154382f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        a(c54.b bVar, k24.e eVar, q34.w0 w0Var, mx.c cVar) {
            this.f154376a = bVar;
            this.f154377b = eVar;
            this.f154378c = w0Var;
            this.f154379d = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r12 == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
        
            if (r12 == r1) goto L32;
         */
        @Override // vy2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(tq.e<? super dx.i<? extends dx.b, wy2.MidCardData>> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.a7.a.a(tq.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/a7$b", "Lxy2/a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements xy2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.a f154383a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154384d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154386f;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154384d = obj;
                this.f154386f |= PKIFailureInfo.systemUnavail;
                return b.this.a(this);
            }
        }

        b(a84.a aVar) {
            this.f154383a = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // xy2.a
        public Object a(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f154386f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f154386f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objG = aVar.f154384d;
            Object objE = uq.b.e();
            int i16 = aVar.f154386f;
            if (i16 == 0) {
                oq.u.b(objG);
                a84.a aVar2 = this.f154383a;
                a84.a.Params params = new a84.a.Params(w74.a.MOBYWATEL);
                aVar.f154386f = 1;
                objG = aVar2.g(params, aVar);
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
    }

    private a7() {
    }

    public final vy2.a a(k24.e getMIdCardDataUC, q34.w0 getMIdCardDataUseCase, c54.b isFeatureEnabledUseCase, mx.c labelProvider) {
        return new a(isFeatureEnabledUseCase, getMIdCardDataUC, getMIdCardDataUseCase, labelProvider);
    }

    public final xy2.a b(a84.a checkAndRegisterDeviceToNotificationsUseCase) {
        return new b(checkAndRegisterDeviceToNotificationsUseCase);
    }
}
