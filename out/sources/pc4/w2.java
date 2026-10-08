package pc4;

import cb4.DialogData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0001\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J/\u00100\u001a\u00020/2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00107\u001a\u0002062\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lpc4/w2;", "", "<init>", "()V", "Lg34/c;", "identityManager", "Lk24/j;", "hasDocumentActiveParentCertificateUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/g1;", "hasDocumentWithActiveCertUseCase", "Lk24/i;", "hasAnyActiveCertificateUC", "Lq34/u0;", "getIdentityTypeByDocumentTypeUseCase", "Lk24/d;", "getCertificateTypeForParentDocumentUC", "Lk24/g;", "getMainCertificateTypeUC", "Lq34/t1;", "monitorMainIdentityCertificateChangedUC", "Lw24/h2;", "observeCertificateChangeUC", "Lk24/l;", "refreshDocumentsStatusesUC", "Lq34/v1;", "refreshDocumentsStatusesUseCase", "Lk24/b;", "getCertKeyPairUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lw24/n;", "deleteDocumentByTypeUC", "Lq34/w;", "deleteDocumentUseCase", "Lyg1/a;", "a", "(Lg34/c;Lk24/j;Lc54/b;Lq34/g1;Lk24/i;Lq34/u0;Lk24/d;Lk24/g;Lq34/t1;Lw24/h2;Lk24/l;Lq34/v1;Lk24/b;Lj34/d;Lw24/n;Lq34/w;)Lyg1/a;", "La84/a;", "checkAndRegisterDeviceToNotificationsUseCase", "La84/e;", "hasUnreadNotificationsUC", "Llt0/a;", "getNotDisplayedPushCountUC", "Lz74/b;", "pushNotificationDataSource", "Lyg1/c;", "c", "(La84/a;La84/e;Llt0/a;Lz74/b;)Lyg1/c;", "Ls64/p;", "isRegisteredAddressFeatureFlagActiveUC", "Ls64/n;", "isPassportDataFeatureFlagActiveUseCase", "Lyg1/b;", "b", "(Ls64/p;Ls64/n;)Lyg1/b;", "Lwc3/f;", "isPassportDataSavedUseCase", "Lyg1/d;", "d", "(Lwc3/f;)Lyg1/d;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2 f156507a = new w2();

    @Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\f\u0010\bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0096@¢\u0006\u0004\b\r\u0010\nJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0096@¢\u0006\u0004\b\u0015\u0010\nJ\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\nJ@\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"pc4/w2$a", "Lyg1/a;", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "", "k", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lk34/u;", "g", "e", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "Lmu/g;", "Loq/i0;", "i", "()Lmu/g;", "c", "Lry/c;", "j", "Lkotlin/Function0;", "onDelete", "onClose", "Lcb4/d;", "f", "(Lrq0/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "b", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements yg1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.j f156509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f156510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.i f156511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.g1 f156512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k24.d f156513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.u0 f156514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k24.g f156515h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w24.h2 f156516i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.t1 f156517j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ k24.l f156518k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.v1 f156519l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ k24.b f156520m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ j34.d f156521n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ w24.n f156522o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q34.w f156523p;

        /* JADX INFO: renamed from: pc4.w2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3877a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156524a;

            static {
                int[] iArr = new int[f24.c.values().length];
                try {
                    iArr[f24.c.CITIZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.c.REFUGEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.c.UNIVERSITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f156524a = iArr;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156525d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156526e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156527f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156528g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156529h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156530j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156531k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156532l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156533m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156534n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156535p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156537r;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156535p = obj;
                this.f156537r |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156538d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156539e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f156540f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156542h;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156540f = obj;
                this.f156542h |= PKIFailureInfo.systemUnavail;
                return a.this.g(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156543d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156544e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156545f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156546g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156547h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156548j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156549k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156550l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156551m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f156552n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156554q;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156552n = obj;
                this.f156554q |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f156555d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f156556e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156558g;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156556e = obj;
                this.f156558g |= PKIFailureInfo.systemUnavail;
                return a.this.a(false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156559d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156560e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156561f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156562g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156563h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156564j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156565k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156566l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156567m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156568n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156569p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156571r;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156569p = obj;
                this.f156571r |= PKIFailureInfo.systemUnavail;
                return a.this.k(null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class g implements mu.g<oq.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f156572a;

            /* JADX INFO: renamed from: pc4.w2$a$g$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3878a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ mu.h f156573a;

                /* JADX INFO: renamed from: pc4.w2$a$g$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C3879a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f156574d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f156575e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f156576f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f156578h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f156579j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f156580k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    int f156581l;

                    public C3879a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f156574d = obj;
                        this.f156575e |= PKIFailureInfo.systemUnavail;
                        return C3878a.this.F(null, this);
                    }
                }

                public C3878a(mu.h hVar) {
                    this.f156573a = hVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C3879a c3879a;
                    if (eVar instanceof C3879a) {
                        c3879a = (C3879a) eVar;
                        int i15 = c3879a.f156575e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c3879a.f156575e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c3879a = new C3879a(eVar);
                        }
                    } else {
                        c3879a = new C3879a(eVar);
                    }
                    Object obj2 = c3879a.f156574d;
                    Object objE = uq.b.e();
                    int i16 = c3879a.f156575e;
                    if (i16 == 0) {
                        oq.u.b(obj2);
                        mu.h hVar = this.f156573a;
                        oq.i0 i0Var = oq.i0.f148189a;
                        c3879a.f156576f = vq.j.a(obj);
                        c3879a.f156578h = vq.j.a(c3879a);
                        c3879a.f156579j = vq.j.a(obj);
                        c3879a.f156580k = vq.j.a(hVar);
                        c3879a.f156581l = 0;
                        c3879a.f156575e = 1;
                        if (hVar.F(i0Var, c3879a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj2);
                    }
                    return oq.i0.f148189a;
                }
            }

            public g(mu.g gVar) {
                this.f156572a = gVar;
            }

            @Override // mu.g
            public Object a(mu.h<? super oq.i0> hVar, tq.e eVar) {
                Object objA = this.f156572a.a(new C3878a(hVar), eVar);
                return objA == uq.b.e() ? objA : oq.i0.f148189a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class h extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156582d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156583e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156584f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156585g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156586h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156587j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156588k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156589l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f156590m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156592p;

            h(tq.e<? super h> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156590m = obj;
                this.f156592p |= PKIFailureInfo.systemUnavail;
                return a.this.c(this);
            }
        }

        a(c54.b bVar, k24.j jVar, g34.c cVar, k24.i iVar, q34.g1 g1Var, k24.d dVar, q34.u0 u0Var, k24.g gVar, w24.h2 h2Var, q34.t1 t1Var, k24.l lVar, q34.v1 v1Var, k24.b bVar2, j34.d dVar2, w24.n nVar, q34.w wVar) {
            this.f156508a = bVar;
            this.f156509b = jVar;
            this.f156510c = cVar;
            this.f156511d = iVar;
            this.f156512e = g1Var;
            this.f156513f = dVar;
            this.f156514g = u0Var;
            this.f156515h = gVar;
            this.f156516i = h2Var;
            this.f156517j = t1Var;
            this.f156518k = lVar;
            this.f156519l = v1Var;
            this.f156520m = bVar2;
            this.f156521n = dVar2;
            this.f156522o = nVar;
            this.f156523p = wVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // yg1.a
        public Object a(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            e eVar2;
            k34.u uVar;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i15 = eVar2.f156558g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f156558g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f156556e;
            Object objE = uq.b.e();
            int i16 = eVar2.f156558g;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f156508a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return this.f156510c.g(z15);
                }
                k24.g gVar = this.f156515h;
                k24.g.Params params = new k24.g.Params(z15);
                eVar2.f156555d = z15;
                eVar2.f156558g = 1;
                objC = gVar.c(params, eVar2);
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
            int i17 = C3877a.f156524a[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
            if (i17 == 1) {
                uVar = k34.u.MOBYWATEL;
            } else if (i17 == 2) {
                uVar = k34.u.DIIA;
            } else {
                if (i17 != 3) {
                    throw new oq.p();
                }
                uVar = k34.u.STUDENT;
            }
            return new dx.i.Right(uVar);
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0133  */
        /* JADX WARN: Code duplicated, block: B:65:0x0144  */
        /* JADX WARN: Code duplicated, block: B:66:0x0152  */
        /* JADX WARN: Code duplicated, block: B:68:0x0156  */
        /* JADX WARN: Code duplicated, block: B:71:0x0162  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // yg1.a
        public Object b(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            b bVar2;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar3;
            if (eVar instanceof b) {
                bVar2 = (b) eVar;
                int i15 = bVar2.f156537r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f156537r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar2 = new b(eVar);
                }
            } else {
                bVar2 = new b(eVar);
            }
            Object objC = bVar2.f156535p;
            Object objE = uq.b.e();
            int i16 = bVar2.f156537r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar4 = this.f156508a;
                        w24.n nVar = this.f156522o;
                        q34.w wVar = this.f156523p;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                w24.n.Params params = new w24.n.Params((f24.i) aVar.a(j1.l(bVar)));
                                bVar2.f156525d = vq.j.a(bVar);
                                bVar2.f156526e = jVarA;
                                bVar2.f156527f = vq.j.a(aVar);
                                bVar2.f156528g = vq.j.a(aVar);
                                bVar2.f156529h = aVar;
                                bVar2.f156530j = 0;
                                bVar2.f156531k = 0;
                                bVar2.f156532l = 0;
                                bVar2.f156533m = 0;
                                bVar2.f156534n = 0;
                                bVar2.f156537r = 1;
                                objC = nVar.c(params, bVar2);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar3 = aVar;
                                    bVar3.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(bVar);
                                bVar2.f156525d = vq.j.a(bVar);
                                bVar2.f156526e = jVarA;
                                bVar2.f156527f = vq.j.a(aVar);
                                bVar2.f156528g = vq.j.a(aVar);
                                bVar2.f156530j = 0;
                                bVar2.f156531k = 0;
                                bVar2.f156532l = 0;
                                bVar2.f156533m = 0;
                                bVar2.f156534n = 0;
                                bVar2.f156537r = 2;
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
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
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
                        bVar3 = (ex.b) bVar2.f156529h;
                        jVar = (dx.j) bVar2.f156526e;
                        try {
                            oq.u.b(objC);
                            bVar3.a((dx.i) objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            bVar = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
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
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.w2$a$h, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // yg1.a
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? hVar;
            Object objB;
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                int i15 = hVar2.f156592p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar2.f156592p = i15 - PKIFailureInfo.systemUnavail;
                    hVar = hVar2;
                } else {
                    hVar = new h(eVar);
                }
            } else {
                hVar = new h(eVar);
            }
            Object objC = hVar.f156590m;
            Object objE = uq.b.e();
            int i16 = hVar.f156592p;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar = this.f156508a;
                            k24.l lVar = this.f156518k;
                            q34.v1 v1Var = this.f156519l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    hVar.f156587j = jVarA;
                                    hVar.f156588k = vq.j.a(aVar);
                                    hVar.f156589l = vq.j.a(aVar);
                                    hVar.f156582d = 0;
                                    hVar.f156583e = 0;
                                    hVar.f156584f = 0;
                                    hVar.f156585g = 0;
                                    hVar.f156586h = 0;
                                    hVar.f156592p = 1;
                                    objC = lVar.c(c1792a, hVar);
                                    if (objC != objE) {
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    hVar.f156587j = jVarA;
                                    hVar.f156588k = vq.j.a(aVar);
                                    hVar.f156589l = vq.j.a(aVar);
                                    hVar.f156582d = 0;
                                    hVar.f156583e = 0;
                                    hVar.f156584f = 0;
                                    hVar.f156585g = 0;
                                    hVar.f156586h = 0;
                                    hVar.f156592p = 2;
                                    objC = v1Var.c(c1792a2, hVar);
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
                                hVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(hVar));
                                dx.i iVarA = hVar.a(e);
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
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // yg1.a
        public Object d(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            boolean zBooleanValue = this.f156508a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f156511d.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f156512e.a(gz.b.a.C1792a.f78542a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x009f A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.w2$a$d, tq.e] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // yg1.a
        public Object e(tq.e<? super dx.i<? extends dx.b, ? extends rq0.b>> eVar) throws Throwable {
            ?? dVar;
            Object objB;
            rq0.b bVarO;
            ex.b bVar;
            dx.i right;
            int i15;
            rq0.b.d dVar2;
            if (eVar instanceof d) {
                d dVar3 = (d) eVar;
                int i16 = dVar3.f156554q;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar3.f156554q = i16 - PKIFailureInfo.systemUnavail;
                    dVar = dVar3;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f156552n;
            Object objE = uq.b.e();
            int i17 = dVar.f156554q;
            try {
                try {
                    if (i17 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f156508a;
                        k24.g gVar = this.f156515h;
                        g34.c cVar = this.f156510c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.g.Params params = new k24.g.Params(false, 1, null);
                                dVar.f156548j = jVarA;
                                dVar.f156549k = vq.j.a(aVar);
                                dVar.f156550l = vq.j.a(aVar);
                                dVar.f156551m = aVar;
                                dVar.f156543d = 0;
                                dVar.f156544e = 0;
                                dVar.f156545f = 0;
                                dVar.f156546g = 0;
                                dVar.f156547h = 0;
                                dVar.f156554q = 1;
                                objC = gVar.c(params, dVar);
                                if (objC == objE) {
                                    return objE;
                                }
                                bVar = aVar;
                                right = (dx.i) objC;
                                if (!(right instanceof dx.i.Left)) {
                                    if (right instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    i15 = C3877a.f156524a[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                    if (i15 != 1) {
                                        dVar2 = rq0.b.d.ID_CARD;
                                    } else if (i15 != 2) {
                                        dVar2 = rq0.b.d.DIIA_REFUGEE_CARD;
                                    } else {
                                        if (i15 == 3) {
                                            throw new oq.p();
                                        }
                                        dVar2 = rq0.b.d.STUDENT_CARD;
                                    }
                                    right = new dx.i.Right(dVar2);
                                }
                                bVarO = (rq0.b) bVar.a(right);
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                bVarO = g34.c.o(cVar, false, 1, null);
                                if (bVarO == null) {
                                    aVar.b(new dx.b.Generic(new NullPointerException("Main identity document type not found")));
                                    throw new oq.g();
                                }
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            dVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(dVar));
                            dx.i iVarA = dVar.a(e);
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
                        if (i17 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) dVar.f156551m;
                        try {
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3877a.f156524a[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                if (i15 != 1) {
                                    dVar2 = rq0.b.d.ID_CARD;
                                } else if (i15 != 2) {
                                    dVar2 = rq0.b.d.DIIA_REFUGEE_CARD;
                                } else {
                                    if (i15 == 3) {
                                        throw new oq.p();
                                    }
                                    dVar2 = rq0.b.d.STUDENT_CARD;
                                }
                                right = new dx.i.Right(dVar2);
                            }
                            bVarO = (rq0.b) bVar.a(right);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(bVarO);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        @Override // yg1.a
        public Object f(rq0.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f156521n.c(new j34.d.Params(bVar, aVar, aVar2), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        
            if (r9 == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        
            if (r9 == r1) goto L57;
         */
        @Override // yg1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(rq0.b r8, tq.e<? super k34.u> r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.w2.a.g(rq0.b, tq.e):java.lang.Object");
        }

        @Override // yg1.a
        public mu.g<oq.i0> i() {
            boolean zBooleanValue = this.f156508a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return new g((mu.g) this.f156516i.a(gz.b.a.C1792a.f78542a));
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return (mu.g) this.f156517j.a(gz.b.a.C1792a.f78542a);
        }

        @Override // yg1.a
        public Object j(tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            boolean zBooleanValue = this.f156508a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f156520m.c(new k24.b.Params(f24.c.UNIVERSITY), eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f156510c.m(k34.u.STUDENT);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // yg1.a
        public Object k(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            f fVar;
            Object objB;
            ex.b bVar2;
            dx.i iVar;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f156571r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f156571r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objJ = fVar.f156569p;
            ?? E = uq.b.e();
            int i16 = fVar.f156571r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objJ);
                            c54.b bVar3 = this.f156508a;
                            k24.j jVar = this.f156509b;
                            g34.c cVar = this.f156510c;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    k24.j.Params params = new k24.j.Params((f24.i) aVar.a(j1.l(bVar)));
                                    fVar.f156559d = vq.j.a(bVar);
                                    fVar.f156560e = jVarA;
                                    fVar.f156561f = vq.j.a(aVar);
                                    fVar.f156562g = vq.j.a(aVar);
                                    fVar.f156563h = aVar;
                                    fVar.f156564j = 0;
                                    fVar.f156565k = 0;
                                    fVar.f156566l = 0;
                                    fVar.f156567m = 0;
                                    fVar.f156568n = 0;
                                    fVar.f156571r = 1;
                                    objJ = jVar.c(params, fVar);
                                    if (objJ != E) {
                                        bVar2 = aVar;
                                        iVar = (dx.i) objJ;
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    fVar.f156559d = vq.j.a(bVar);
                                    fVar.f156560e = jVarA;
                                    fVar.f156561f = vq.j.a(aVar);
                                    fVar.f156562g = vq.j.a(aVar);
                                    fVar.f156563h = aVar;
                                    fVar.f156564j = 0;
                                    fVar.f156565k = 0;
                                    fVar.f156566l = 0;
                                    fVar.f156567m = 0;
                                    fVar.f156568n = 0;
                                    fVar.f156571r = 2;
                                    objJ = cVar.j(bVar, fVar);
                                    if (objJ != E) {
                                        bVar2 = aVar;
                                        iVar = (dx.i) objJ;
                                    }
                                }
                                return E;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVarA;
                                px.f fVar2 = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(E));
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
                        if (i16 == 1) {
                            bVar2 = (ex.b) fVar.f156563h;
                            oq.u.b(objJ);
                            iVar = (dx.i) objJ;
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (ex.b) fVar.f156563h;
                            oq.u.b(objJ);
                            iVar = (dx.i) objJ;
                        }
                        return new dx.i.Right(vq.b.a(((Boolean) bVar2.a(iVar)).booleanValue()));
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"pc4/w2$b", "Lyg1/b;", "", "a", "()Z", "b", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements yg1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s64.n f156593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s64.p f156594b;

        b(s64.n nVar, s64.p pVar) {
            this.f156593a = nVar;
            this.f156594b = pVar;
        }

        @Override // yg1.b
        public boolean a() {
            return this.f156593a.a(gz.b.a.C1792a.f78542a).booleanValue();
        }

        @Override // yg1.b
        public boolean b() {
            return this.f156594b.a(gz.b.a.C1792a.f78542a).booleanValue();
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"pc4/w2$c", "Lyg1/c;", "Ldx/i;", "Ldx/b;", "", "c", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "Lmu/g;", "Lmu/g;", "b", "()Lmu/g;", "hasUnreadNotifications", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements yg1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mu.g<Boolean> hasUnreadNotifications;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lt0.a f156596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z74.b f156597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a84.a f156598d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156599d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156601f;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156599d = obj;
                this.f156601f |= PKIFailureInfo.systemUnavail;
                return c.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156602d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156604f;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156602d = obj;
                this.f156604f |= PKIFailureInfo.systemUnavail;
                return c.this.c(this);
            }
        }

        c(a84.e eVar, lt0.a aVar, z74.b bVar, a84.a aVar2) {
            this.f156596b = aVar;
            this.f156597c = bVar;
            this.f156598d = aVar2;
            this.hasUnreadNotifications = eVar.b(gz.b.a.C1792a.f78542a);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // yg1.c
        public Object a(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f156601f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f156601f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objG = aVar.f156599d;
            Object objE = uq.b.e();
            int i16 = aVar.f156601f;
            if (i16 == 0) {
                oq.u.b(objG);
                a84.a aVar2 = this.f156598d;
                a84.a.Params params = new a84.a.Params(w74.a.MOBYWATEL);
                aVar.f156601f = 1;
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

        @Override // yg1.c
        public mu.g<Boolean> b() {
            return this.hasUnreadNotifications;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // yg1.c
        public Object c(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156604f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156604f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f156602d;
            Object objE = uq.b.e();
            int i16 = bVar.f156604f;
            if (i16 == 0) {
                oq.u.b(objC);
                lt0.a aVar = this.f156596b;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                bVar.f156604f = 1;
                objC = aVar.c(c1792a, bVar);
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
            z74.b bVar2 = this.f156597c;
            boolean z15 = false;
            if (iVar instanceof dx.i.Left) {
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                long jLongValue = ((Number) ((dx.i.Right) iVar).b()).longValue();
                bVar2.a((int) jLongValue);
                z15 = jLongValue > 0;
            }
            return new dx.i.Right(vq.b.a(z15));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/w2$d", "Lyg1/d;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements yg1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wc3.f f156605a;

        d(wc3.f fVar) {
            this.f156605a = fVar;
        }

        @Override // yg1.d
        public Object a(tq.e<? super Boolean> eVar) {
            return this.f156605a.c(gz.b.a.C1792a.f78542a, eVar);
        }
    }

    private w2() {
    }

    public final yg1.a a(g34.c identityManager, k24.j hasDocumentActiveParentCertificateUC, c54.b isFeatureEnabledUseCase, q34.g1 hasDocumentWithActiveCertUseCase, k24.i hasAnyActiveCertificateUC, q34.u0 getIdentityTypeByDocumentTypeUseCase, k24.d getCertificateTypeForParentDocumentUC, k24.g getMainCertificateTypeUC, q34.t1 monitorMainIdentityCertificateChangedUC, w24.h2 observeCertificateChangeUC, k24.l refreshDocumentsStatusesUC, q34.v1 refreshDocumentsStatusesUseCase, k24.b getCertKeyPairUC, j34.d getDocumentDeletionDialogUC, w24.n deleteDocumentByTypeUC, q34.w deleteDocumentUseCase) {
        return new a(isFeatureEnabledUseCase, hasDocumentActiveParentCertificateUC, identityManager, hasAnyActiveCertificateUC, hasDocumentWithActiveCertUseCase, getCertificateTypeForParentDocumentUC, getIdentityTypeByDocumentTypeUseCase, getMainCertificateTypeUC, observeCertificateChangeUC, monitorMainIdentityCertificateChangedUC, refreshDocumentsStatusesUC, refreshDocumentsStatusesUseCase, getCertKeyPairUC, getDocumentDeletionDialogUC, deleteDocumentByTypeUC, deleteDocumentUseCase);
    }

    public final yg1.b b(s64.p isRegisteredAddressFeatureFlagActiveUC, s64.n isPassportDataFeatureFlagActiveUseCase) {
        return new b(isPassportDataFeatureFlagActiveUseCase, isRegisteredAddressFeatureFlagActiveUC);
    }

    public final yg1.c c(a84.a checkAndRegisterDeviceToNotificationsUseCase, a84.e hasUnreadNotificationsUC, lt0.a getNotDisplayedPushCountUC, z74.b pushNotificationDataSource) {
        return new c(hasUnreadNotificationsUC, getNotDisplayedPushCountUC, pushNotificationDataSource, checkAndRegisterDeviceToNotificationsUseCase);
    }

    public final yg1.d d(wc3.f isPassportDataSavedUseCase) {
        return new d(isPassportDataSavedUseCase);
    }
}
