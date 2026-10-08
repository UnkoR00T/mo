package pc4;

import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJg\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lpc4/a;", "", "<init>", "()V", "Lab4/d;", "resetLockUseCase", "Lcx0/a;", "a", "(Lab4/d;)Lcx0/a;", "Lk24/o;", "saveUserCertificateUC", "Lq34/b;", "addUserCertToContainerUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lq34/c2;", "validPreviousDocumentsUseCase", "Lw24/c2;", "isCurrentUserPeselUC", "Lq34/h1;", "hasDocumentWithInactiveCertUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lw24/i0;", "getDocumentIdsByTypeUC", "Lw24/i;", "deleteCertificateUC", "Lcx0/c;", "c", "(Lk24/o;Lq34/b;Lc54/b;Lk24/a;Lq34/w;Lq34/c2;Lw24/c2;Lq34/h1;Lk24/g;Lw24/i0;Lw24/i;)Lcx0/c;", "La84/a;", "checkAndRegisterDeviceToNotificationsUseCase", "Lcx0/b;", "b", "(La84/a;)Lcx0/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f154206a = new a();

    /* JADX INFO: renamed from: pc4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/a$a", "Lcx0/a;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3821a implements cx0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ab4.d f154207a;

        C3821a(ab4.d dVar) {
            this.f154207a = dVar;
        }

        @Override // cx0.a
        public Object a(tq.e<? super oq.i0> eVar) {
            Object objA = this.f154207a.a(eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/a$b", "Lcx0/b;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements cx0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.a f154208a;

        /* JADX INFO: renamed from: pc4.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3822a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154209d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154211f;

            C3822a(tq.e<? super C3822a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154209d = obj;
                this.f154211f |= PKIFailureInfo.systemUnavail;
                return b.this.a(this);
            }
        }

        b(a84.a aVar) {
            this.f154208a = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // cx0.b
        public Object a(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3822a c3822a;
            if (eVar instanceof C3822a) {
                c3822a = (C3822a) eVar;
                int i15 = c3822a.f154211f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3822a.f154211f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3822a = new C3822a(eVar);
                }
            } else {
                c3822a = new C3822a(eVar);
            }
            Object objG = c3822a.f154209d;
            Object objE = uq.b.e();
            int i16 = c3822a.f154211f;
            if (i16 == 0) {
                oq.u.b(objG);
                a84.a aVar = this.f154208a;
                a84.a.Params params = new a84.a.Params(w74.a.MOBYWATEL);
                c3822a.f154211f = 1;
                objG = aVar.g(params, c3822a);
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

    @Metadata(d1 = {"\u0000K\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"pc4/a$c", "Lcx0/c;", "", "documentId", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "f", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "peselTicket", "Liy/a0;", "decryptedCert", "password", "c", "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Ljava/security/cert/X509Certificate;", "newCert", "d", "(Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "", "g", "(Ltq/e;)Ljava/lang/Object;", "", "e", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements cx0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.a f154213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.w f154214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.i f154215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k24.o f154216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q34.b f154217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w24.c2 f154218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q34.c2 f154219h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k24.g f154220i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.h1 f154221j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.i0 f154222k;

        /* JADX INFO: renamed from: pc4.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3823a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154223d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154224e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154225f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154226g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154227h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154228j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154229k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154230l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154231m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154232n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154233p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154235r;

            C3823a(tq.e<? super C3823a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154233p = obj;
                this.f154235r |= PKIFailureInfo.systemUnavail;
                return c.this.f(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154236d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154237e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154238f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154239g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154240h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154241j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154242k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154243l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154244m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154245n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154246p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154247q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154249s;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154247q = obj;
                this.f154249s |= PKIFailureInfo.systemUnavail;
                return c.this.b(null, null, this);
            }
        }

        /* JADX INFO: renamed from: pc4.a$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3824c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154250d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154251e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154252f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154253g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154254h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154255j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154256k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154257l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154258m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154259n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154260p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154262r;

            C3824c(tq.e<? super C3824c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154260p = obj;
                this.f154262r |= PKIFailureInfo.systemUnavail;
                return c.this.e(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154263d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154265f;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154263d = obj;
                this.f154265f |= PKIFailureInfo.systemUnavail;
                return c.this.g(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154266d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154267e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154268f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154269g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154270h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154271j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154272k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154273l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154274m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154275n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154276p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154277q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f154278r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f154280t;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154278r = obj;
                this.f154280t |= PKIFailureInfo.systemUnavail;
                return c.this.c(null, null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154281d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154282e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154283f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154284g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154285h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154286j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154287k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154288l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154289m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154290n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154291p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154293r;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154291p = obj;
                this.f154293r |= PKIFailureInfo.systemUnavail;
                return c.this.d(null, this);
            }
        }

        c(c54.b bVar, k24.a aVar, q34.w wVar, w24.i iVar, k24.o oVar, q34.b bVar2, w24.c2 c2Var, q34.c2 c2Var2, k24.g gVar, q34.h1 h1Var, w24.i0 i0Var) {
            this.f154212a = bVar;
            this.f154213b = aVar;
            this.f154214c = wVar;
            this.f154215d = iVar;
            this.f154216e = oVar;
            this.f154217f = bVar2;
            this.f154218g = c2Var;
            this.f154219h = c2Var2;
            this.f154220i = gVar;
            this.f154221j = h1Var;
            this.f154222k = i0Var;
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0144  */
        /* JADX WARN: Code duplicated, block: B:65:0x0155  */
        /* JADX WARN: Code duplicated, block: B:66:0x0163  */
        /* JADX WARN: Code duplicated, block: B:68:0x0167  */
        /* JADX WARN: Code duplicated, block: B:71:0x0173  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v25 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // cx0.c
        public Object b(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            b bVar2;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar3;
            if (eVar instanceof b) {
                bVar2 = (b) eVar;
                int i15 = bVar2.f154249s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f154249s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar2 = new b(eVar);
                }
            } else {
                bVar2 = new b(eVar);
            }
            Object objC = bVar2.f154247q;
            Object objE = uq.b.e();
            int i16 = bVar2.f154249s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar4 = this.f154212a;
                        k24.a aVar = this.f154213b;
                        q34.w wVar = this.f154214c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.a.Params params = new k24.a.Params(str);
                                bVar2.f154236d = vq.j.a(str);
                                bVar2.f154237e = vq.j.a(bVar);
                                bVar2.f154238f = jVarA;
                                bVar2.f154239g = vq.j.a(aVar2);
                                bVar2.f154240h = vq.j.a(aVar2);
                                bVar2.f154241j = aVar2;
                                bVar2.f154242k = 0;
                                bVar2.f154243l = 0;
                                bVar2.f154244m = 0;
                                bVar2.f154245n = 0;
                                bVar2.f154246p = 0;
                                bVar2.f154249s = 1;
                                objC = aVar.c(params, bVar2);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar3 = aVar2;
                                    bVar3.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(bVar);
                                bVar2.f154236d = vq.j.a(str);
                                bVar2.f154237e = vq.j.a(bVar);
                                bVar2.f154238f = jVarA;
                                bVar2.f154239g = vq.j.a(aVar2);
                                bVar2.f154240h = vq.j.a(aVar2);
                                bVar2.f154242k = 0;
                                bVar2.f154243l = 0;
                                bVar2.f154244m = 0;
                                bVar2.f154245n = 0;
                                bVar2.f154246p = 0;
                                bVar2.f154249s = 2;
                                if (wVar.c(params2, bVar2) != objE) {
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            str = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar3 = (ex.b) bVar2.f154241j;
                        jVar = (dx.j) bVar2.f154238f;
                        try {
                            oq.u.b(objC);
                            bVar3.a((dx.i) objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            dx.j<dx.b> jVar2 = jVar;
                            e = e25;
                            str = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // cx0.c
        public Object c(rq0.b bVar, iy.b0 b0Var, iy.a0 a0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            e eVar2;
            Object objB;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i15 = eVar2.f154280t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f154280t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f154278r;
            Object objE = uq.b.e();
            int i16 = eVar2.f154280t;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar2 = this.f154212a;
                            k24.o oVar = this.f154216e;
                            q34.b bVar3 = this.f154217f;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    k24.o.Params params = new k24.o.Params((f24.c) aVar.a(t24.a.a((f24.i) aVar.a(j1.l(bVar)))), b0Var, a0Var, b0Var2);
                                    eVar2.f154266d = vq.j.a(bVar);
                                    eVar2.f154267e = vq.j.a(b0Var);
                                    eVar2.f154268f = vq.j.a(a0Var);
                                    eVar2.f154269g = vq.j.a(b0Var2);
                                    eVar2.f154270h = jVarA;
                                    eVar2.f154271j = vq.j.a(aVar);
                                    eVar2.f154272k = vq.j.a(aVar);
                                    eVar2.f154273l = 0;
                                    eVar2.f154274m = 0;
                                    eVar2.f154275n = 0;
                                    eVar2.f154276p = 0;
                                    eVar2.f154277q = 0;
                                    eVar2.f154280t = 1;
                                    objC = oVar.c(params, eVar2);
                                    if (objC != objE) {
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.b.a aVar2 = new q34.b.a(bVar, b0Var, a0Var, b0Var2);
                                    eVar2.f154266d = vq.j.a(bVar);
                                    eVar2.f154267e = vq.j.a(b0Var);
                                    eVar2.f154268f = vq.j.a(a0Var);
                                    eVar2.f154269g = vq.j.a(b0Var2);
                                    eVar2.f154270h = jVarA;
                                    eVar2.f154271j = vq.j.a(aVar);
                                    eVar2.f154272k = vq.j.a(aVar);
                                    eVar2.f154273l = 0;
                                    eVar2.f154274m = 0;
                                    eVar2.f154275n = 0;
                                    eVar2.f154276p = 0;
                                    eVar2.f154277q = 0;
                                    eVar2.f154280t = 2;
                                    objC = bVar3.c(aVar2, eVar2);
                                    if (objC != objE) {
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                bVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(bVar));
                                dx.i iVarA = bVar.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            oq.u.b(objC);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(objC);
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (Exception e18) {
                        e = e18;
                    }
                } catch (CancellationException e19) {
                    throw e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[Catch: Exception -> 0x0041, c -> 0x0045, CancellationException -> 0x0049, TRY_LEAVE, TryCatch #6 {Exception -> 0x0041, blocks: (B:13:0x003c, B:48:0x0119, B:49:0x011e, B:53:0x012c, B:56:0x013b, B:24:0x0066, B:33:0x00ba, B:35:0x00c2), top: B:71:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // cx0.c
        public Object d(X509Certificate x509Certificate, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            f fVar;
            ex.c cVar;
            Exception exc;
            ?? r15;
            Object objB;
            ex.b bVar;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f154293r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f154293r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f154291p;
            Object objE = uq.b.e();
            int i16 = fVar.f154293r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar2 = this.f154212a;
                            w24.c2 c2Var = this.f154218g;
                            q34.c2 c2Var2 = this.f154219h;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.c2.Params params = new w24.c2.Params(x509Certificate);
                                    fVar.f154281d = vq.j.a(x509Certificate);
                                    fVar.f154282e = jVarA;
                                    fVar.f154283f = vq.j.a(aVar);
                                    fVar.f154284g = vq.j.a(aVar);
                                    fVar.f154286j = 0;
                                    fVar.f154287k = 0;
                                    fVar.f154288l = 0;
                                    fVar.f154289m = 0;
                                    fVar.f154290n = 0;
                                    fVar.f154293r = 1;
                                    objC = c2Var.c(params, fVar);
                                    if (objC != objE) {
                                        if (!((Boolean) objC).booleanValue()) {
                                            n34.a aVar2 = n34.a.PESEL_NOT_VALID;
                                            Label.Companion companion = Label.INSTANCE;
                                            new dx.b.Business(aVar2, null, companion.c(), null, null, companion.c(), null, 90, null);
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.c2.Params params2 = new q34.c2.Params(x509Certificate);
                                    fVar.f154281d = vq.j.a(x509Certificate);
                                    fVar.f154282e = jVarA;
                                    fVar.f154283f = vq.j.a(aVar);
                                    fVar.f154284g = vq.j.a(aVar);
                                    fVar.f154285h = aVar;
                                    fVar.f154286j = 0;
                                    fVar.f154287k = 0;
                                    fVar.f154288l = 0;
                                    fVar.f154289m = 0;
                                    fVar.f154290n = 0;
                                    fVar.f154293r = 2;
                                    objC = c2Var2.c(params2, fVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        bVar.a((dx.i) objC);
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                cVar = e15;
                                return new dx.i.Left((dx.b) ex.d.a(cVar));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                exc = e17;
                                r15 = jVarA;
                                px.f fVar2 = px.f.f163100a;
                                String message = exc.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, exc, px.c.a(r15));
                                dx.i iVarA = r15.a(exc);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            oq.u.b(objC);
                            if (!((Boolean) objC).booleanValue()) {
                                n34.a aVar3 = n34.a.PESEL_NOT_VALID;
                                Label.Companion companion2 = Label.INSTANCE;
                                new dx.b.Business(aVar3, null, companion2.c(), null, null, companion2.c(), null, 90, null);
                            }
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) fVar.f154285h;
                            oq.u.b(objC);
                            bVar.a((dx.i) objC);
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    exc = e19;
                    r15 = objE;
                }
            } catch (ex.c e25) {
                cVar = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // cx0.c
        public Object e(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, ? extends List<String>>> eVar) throws Throwable {
            C3824c c3824c;
            Object objB;
            ex.b bVar2;
            if (eVar instanceof C3824c) {
                c3824c = (C3824c) eVar;
                int i15 = c3824c.f154262r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3824c.f154262r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3824c = new C3824c(eVar);
                }
            } else {
                c3824c = new C3824c(eVar);
            }
            Object objC = c3824c.f154260p;
            ?? E = uq.b.e();
            int i16 = c3824c.f154262r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f154212a;
                        w24.i0 i0Var = this.f154222k;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (!zBooleanValue) {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                aVar.b(new dx.b.Generic(new UnsupportedOperationException("Deleting document by id is not supported")));
                                throw new oq.g();
                            }
                            w24.i0.Params params = new w24.i0.Params((f24.i) aVar.a(j1.l(bVar)), false, 2, null);
                            c3824c.f154250d = vq.j.a(bVar);
                            c3824c.f154251e = jVarA;
                            c3824c.f154252f = vq.j.a(aVar);
                            c3824c.f154253g = vq.j.a(aVar);
                            c3824c.f154254h = aVar;
                            c3824c.f154255j = 0;
                            c3824c.f154256k = 0;
                            c3824c.f154257l = 0;
                            c3824c.f154258m = 0;
                            c3824c.f154259n = 0;
                            c3824c.f154262r = 1;
                            objC = i0Var.c(params, c3824c);
                            if (objC == E) {
                                return E;
                            }
                            bVar2 = aVar;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) c3824c.f154254h;
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right((List) bVar2.a((dx.i) objC));
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // cx0.c
        public Object f(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3823a c3823a;
            Object objB;
            ex.b bVar2;
            if (eVar instanceof C3823a) {
                c3823a = (C3823a) eVar;
                int i15 = c3823a.f154235r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3823a.f154235r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3823a = new C3823a(eVar);
                }
            } else {
                c3823a = new C3823a(eVar);
            }
            Object objC = c3823a.f154233p;
            ?? E = uq.b.e();
            int i16 = c3823a.f154235r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f154212a;
                        w24.i iVar = this.f154215d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                w24.i.Params params = new w24.i.Params((f24.c) aVar.a(t24.a.a((f24.i) aVar.a(j1.l(bVar)))));
                                c3823a.f154223d = vq.j.a(bVar);
                                c3823a.f154224e = jVarA;
                                c3823a.f154225f = vq.j.a(aVar);
                                c3823a.f154226g = vq.j.a(aVar);
                                c3823a.f154227h = aVar;
                                c3823a.f154228j = 0;
                                c3823a.f154229k = 0;
                                c3823a.f154230l = 0;
                                c3823a.f154231m = 0;
                                c3823a.f154232n = 0;
                                c3823a.f154235r = 1;
                                objC = iVar.c(params, c3823a);
                                if (objC == E) {
                                    return E;
                                }
                                bVar2 = aVar;
                            } else if (zBooleanValue) {
                                throw new oq.p();
                            }
                            return new dx.i.Right(oq.i0.f148189a);
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) c3823a.f154227h;
                    try {
                        oq.u.b(objC);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                    bVar2.a((dx.i) objC);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            if (r7 == r1) goto L30;
         */
        @Override // cx0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(tq.e<? super java.lang.Boolean> r7) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r7 instanceof pc4.a.c.d
                if (r0 == 0) goto L13
                r0 = r7
                pc4.a$c$d r0 = (pc4.a.c.d) r0
                int r1 = r0.f154265f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f154265f = r1
                goto L18
            L13:
                pc4.a$c$d r0 = new pc4.a$c$d
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f154263d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f154265f
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L35
                if (r2 != r4) goto L2d
                oq.u.b(r7)
                return r7
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L35:
                oq.u.b(r7)
                goto L5c
            L39:
                oq.u.b(r7)
                c54.b r7 = r6.f154212a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r7 = r7.a(r2)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != r5) goto L6a
                k24.g r7 = r6.f154220i
                k24.g$a r2 = new k24.g$a
                r2.<init>(r3)
                r0.f154265f = r5
                java.lang.Object r7 = r7.c(r2, r0)
                if (r7 != r1) goto L5c
                goto L78
            L5c:
                dx.i r7 = (dx.i) r7
                java.lang.Object r7 = r7.a()
                if (r7 == 0) goto L65
                r3 = r5
            L65:
                java.lang.Boolean r7 = vq.b.a(r3)
                return r7
            L6a:
                if (r7 != 0) goto L7a
                q34.h1 r7 = r6.f154221j
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f154265f = r4
                java.lang.Object r7 = r7.c(r2, r0)
                if (r7 != r1) goto L79
            L78:
                return r1
            L79:
                return r7
            L7a:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.a.c.g(tq.e):java.lang.Object");
        }
    }

    private a() {
    }

    public final cx0.a a(ab4.d resetLockUseCase) {
        return new C3821a(resetLockUseCase);
    }

    public final cx0.b b(a84.a checkAndRegisterDeviceToNotificationsUseCase) {
        return new b(checkAndRegisterDeviceToNotificationsUseCase);
    }

    public final cx0.c c(k24.o saveUserCertificateUC, q34.b addUserCertToContainerUseCase, c54.b isFeatureEnabledUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, q34.c2 validPreviousDocumentsUseCase, w24.c2 isCurrentUserPeselUC, q34.h1 hasDocumentWithInactiveCertUseCase, k24.g getMainCertificateTypeUC, w24.i0 getDocumentIdsByTypeUC, w24.i deleteCertificateUC) {
        return new c(isFeatureEnabledUseCase, deleteDocumentByIdUC, deleteDocumentUseCase, deleteCertificateUC, saveUserCertificateUC, addUserCertToContainerUseCase, isCurrentUserPeselUC, validPreviousDocumentsUseCase, getMainCertificateTypeUC, hasDocumentWithInactiveCertUseCase, getDocumentIdsByTypeUC);
    }
}
