package o90;

import h90.BERegisterDeviceRequest;
import h90.BERegisterDeviceResponse;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y74.RegisterDeviceResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo90/j0;", "", "<init>", "()V", "Leg0/p;", "isUserCertActiveUC", "Lj90/e;", "beRegisterDeviceUC", "Lx74/a;", "a", "(Leg0/p;Lj90/e;)Lx74/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f143428a = new j0();

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"o90/j0$a", "Lx74/a;", "Ldx/i;", "Ldx/b;", "", "d", "(Ltq/e;)Ljava/lang/Object;", "", "pushToken", "pushNotificationsEnabled", "Ly74/c;", "e", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "Lw74/a;", "a", "Lw74/a;", "b", "()Lw74/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements x74.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final w74.a featureConfig = w74.a.MJUNIOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ eg0.p f143430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j90.e f143431c;

        /* JADX INFO: renamed from: o90.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3556a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143432d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f143433e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f143434f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143436h;

            C3556a(tq.e<? super C3556a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143434f = obj;
                this.f143436h |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, false, this);
            }
        }

        a(eg0.p pVar, j90.e eVar) {
            this.f143430b = pVar;
            this.f143431c = eVar;
        }

        @Override // x74.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public w74.a getFeatureConfig() {
            return this.featureConfig;
        }

        @Override // x74.a
        public Object d(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            return this.f143430b.c(gz.b.a.C1792a.f78542a, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // x74.a
        public Object e(String str, boolean z15, tq.e<? super dx.i<? extends dx.b, RegisterDeviceResponse>> eVar) throws Throwable {
            C3556a c3556a;
            if (eVar instanceof C3556a) {
                c3556a = (C3556a) eVar;
                int i15 = c3556a.f143436h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3556a.f143436h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3556a = new C3556a(eVar);
                }
            } else {
                c3556a = new C3556a(eVar);
            }
            Object objD = c3556a.f143434f;
            Object objE = uq.b.e();
            int i16 = c3556a.f143436h;
            if (i16 == 0) {
                oq.u.b(objD);
                j90.e eVar2 = this.f143431c;
                j90.e.Params params = new j90.e.Params(new BERegisterDeviceRequest(str, z15));
                c3556a.f143432d = vq.j.a(str);
                c3556a.f143433e = z15;
                c3556a.f143436h = 1;
                objD = eVar2.d(params, c3556a);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objD);
            }
            dx.i iVar = (dx.i) objD;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(g0.f143414a.a((BERegisterDeviceResponse) ((dx.i.Right) iVar).b()));
        }
    }

    private j0() {
    }

    public final x74.a a(eg0.p isUserCertActiveUC, j90.e beRegisterDeviceUC) {
        return new a(isUserCertActiveUC, beRegisterDeviceUC);
    }
}
