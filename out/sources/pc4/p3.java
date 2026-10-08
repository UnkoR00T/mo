package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0087\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lpc4/p3;", "", "<init>", "()V", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lw24/m0;", "getDrivingLicenceDataUC", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/m0;", "getDrivingLicenceDocumentsFromContainerUseCase", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lw24/n;", "deleteDocumentByTypeUC", "Lq34/w;", "deleteDocumentUseCase", "Lq34/k1;", "isDocumentAddedUseCase", "Lw24/f2;", "isDocumentAddedByTypeUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lnu1/a;", "a", "(Lg34/c;Lc54/b;Lk24/g;Lw24/m0;Lw24/x0;Lq34/m0;Lq34/d;Lr34/e;Lw24/k0;Lq34/j0;Lw24/n;Lq34/w;Lq34/k1;Lw24/f2;Lj34/d;)Lnu1/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3 f155375a = new p3();

    @Metadata(d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0006J0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002H\u0096@¢\u0006\u0004\b\u0017\u0010\u0006J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0002H\u0096@¢\u0006\u0004\b\u0019\u0010\u0006J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"pc4/p3$a", "Lnu1/a;", "Ldx/i;", "Ldx/b;", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lou1/g;", "b", "Lrq0/c;", "service", "Loq/i0;", "Lcb4/d;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "", "g", "Ljava/util/Date;", "expirationDate", "documentId", "Lou1/b;", "f", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "h", "", "i", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements nu1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.g f155377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f155378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.m0 f155379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.m0 f155380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.x0 f155381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.d f155382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ r34.e f155383h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w24.k0 f155384i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.j0 f155385j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.n f155386k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.w f155387l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ w24.f2 f155388m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q34.k1 f155389n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j34.d f155390o;

        /* JADX INFO: renamed from: pc4.p3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3854a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155392b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f155393c;

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
                f155391a = iArr;
                int[] iArr2 = new int[f24.h.values().length];
                try {
                    iArr2[f24.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[f24.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f24.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[f24.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                f155392b = iArr2;
                int[] iArr3 = new int[er0.h.values().length];
                try {
                    iArr3[er0.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[er0.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[er0.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[er0.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[er0.h.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused12) {
                }
                f155393c = iArr3;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155394d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155395e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155396f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155397g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155398h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155399j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155400k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155401l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155402m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155403n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155405q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155403n = obj;
                this.f155405q |= PKIFailureInfo.systemUnavail;
                return a.this.h(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155406d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155407e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155408f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155409g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155410h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155411j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155412k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155413l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155414m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155415n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155416p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155417q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155419s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155417q = obj;
                this.f155419s |= PKIFailureInfo.systemUnavail;
                return a.this.f(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155420d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155421e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155422f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155423g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            /* synthetic */ Object f155424h;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155426k;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155424h = obj;
                this.f155426k |= PKIFailureInfo.systemUnavail;
                return a.this.b(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155427d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155428e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155429f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155430g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155431h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155432j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155433k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155434l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f155435m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155437p;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155435m = obj;
                this.f155437p |= PKIFailureInfo.systemUnavail;
                return a.this.g(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155438d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155439e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155440f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155441g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155442h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155443j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155444k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155445l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155446m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155447n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155449q;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155447n = obj;
                this.f155449q |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155450d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155451e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155452f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155453g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155454h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155455j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155456k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155457l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155458m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155459n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155461q;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155459n = obj;
                this.f155461q |= PKIFailureInfo.systemUnavail;
                return a.this.i(this);
            }
        }

        a(c54.b bVar, k24.g gVar, g34.c cVar, w24.m0 m0Var, q34.m0 m0Var2, w24.x0 x0Var, q34.d dVar, r34.e eVar, w24.k0 k0Var, q34.j0 j0Var, w24.n nVar, q34.w wVar, w24.f2 f2Var, q34.k1 k1Var, j34.d dVar2) {
            this.f155376a = bVar;
            this.f155377b = gVar;
            this.f155378c = cVar;
            this.f155379d = m0Var;
            this.f155380e = m0Var2;
            this.f155381f = x0Var;
            this.f155382g = dVar;
            this.f155383h = eVar;
            this.f155384i = k0Var;
            this.f155385j = j0Var;
            this.f155386k = nVar;
            this.f155387l = wVar;
            this.f155388m = f2Var;
            this.f155389n = k1Var;
            this.f155390o = dVar2;
        }

        @Override // nu1.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0070 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0071  */
        /* JADX WARN: Code duplicated, block: B:28:0x0075  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        
            if (r7 == r1) goto L43;
         */
        @Override // nu1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(tq.e<? super dx.i<? extends dx.b, ou1.DrivingLicenceFullData>> r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.p3.a.b(tq.e):java.lang.Object");
        }

        @Override // nu1.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f155390o.c(new j34.d.Params(rq0.b.d.DRIVING_LICENCE, aVar, null, 4, null), eVar);
        }

        @Override // nu1.a
        public Object d(rq0.c cVar, tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.f155382g.c(new q34.d.Params(cVar), eVar);
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
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.p3$a$f, tq.e] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // nu1.a
        public Object e(tq.e<? super dx.i<? extends dx.b, ? extends rq0.b>> eVar) throws Throwable {
            ?? fVar;
            Object objB;
            rq0.b bVarO;
            ex.b bVar;
            dx.i right;
            int i15;
            rq0.b.d dVar;
            if (eVar instanceof f) {
                f fVar2 = (f) eVar;
                int i16 = fVar2.f155449q;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar2.f155449q = i16 - PKIFailureInfo.systemUnavail;
                    fVar = fVar2;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f155447n;
            Object objE = uq.b.e();
            int i17 = fVar.f155449q;
            try {
                try {
                    if (i17 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f155376a;
                        k24.g gVar = this.f155377b;
                        g34.c cVar = this.f155378c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.g.Params params = new k24.g.Params(false, 1, null);
                                fVar.f155443j = jVarA;
                                fVar.f155444k = vq.j.a(aVar);
                                fVar.f155445l = vq.j.a(aVar);
                                fVar.f155446m = aVar;
                                fVar.f155438d = 0;
                                fVar.f155439e = 0;
                                fVar.f155440f = 0;
                                fVar.f155441g = 0;
                                fVar.f155442h = 0;
                                fVar.f155449q = 1;
                                objC = gVar.c(params, fVar);
                                if (objC == objE) {
                                    return objE;
                                }
                                bVar = aVar;
                                right = (dx.i) objC;
                                if (!(right instanceof dx.i.Left)) {
                                    if (right instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    i15 = C3854a.f155391a[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                    if (i15 != 1) {
                                        dVar = rq0.b.d.ID_CARD;
                                    } else if (i15 != 2) {
                                        dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                    } else {
                                        if (i15 == 3) {
                                            throw new oq.p();
                                        }
                                        dVar = rq0.b.d.STUDENT_CARD;
                                    }
                                    right = new dx.i.Right(dVar);
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
                            fVar = jVarA;
                            px.f fVar3 = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(fVar));
                            dx.i iVarA = fVar.a(e);
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
                        bVar = (ex.b) fVar.f155446m;
                        try {
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3854a.f155391a[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                if (i15 != 1) {
                                    dVar = rq0.b.d.ID_CARD;
                                } else if (i15 != 2) {
                                    dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                } else {
                                    if (i15 == 3) {
                                        throw new oq.p();
                                    }
                                    dVar = rq0.b.d.STUDENT_CARD;
                                }
                                right = new dx.i.Right(dVar);
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

        /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d8 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00dc A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00ee A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00f0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x00f4 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00fd A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0100 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0103 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x010d A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0174  */
        /* JADX WARN: Code duplicated, block: B:70:0x0175 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0179 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x018b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:75:0x018d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:76:0x018f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:77:0x0191  */
        /* JADX WARN: Code duplicated, block: B:79:0x0194 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x0197 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x019d A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x01a0 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x01a3 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x01a6 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01bb A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v7 */
        @Override // nu1.a
        public Object f(Date date, String str, tq.e<? super dx.i<? extends dx.b, ? extends ou1.b>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            int i15;
            ou1.b bVar2;
            dx.i.Right right;
            int i16;
            ou1.b bVar3;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i17 = cVar.f155419s;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155419s = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155417q;
            Object objE = uq.b.e();
            int i18 = cVar.f155419s;
            try {
                try {
                    try {
                        if (i18 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f155376a;
                            w24.k0 k0Var = this.f155384i;
                            q34.j0 j0Var = this.f155385j;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    cVar.f155406d = vq.j.a(date);
                                    cVar.f155407e = vq.j.a(str);
                                    cVar.f155408f = jVarA;
                                    cVar.f155409g = vq.j.a(aVar);
                                    cVar.f155410h = vq.j.a(aVar);
                                    cVar.f155411j = aVar;
                                    cVar.f155412k = 0;
                                    cVar.f155413l = 0;
                                    cVar.f155414m = 0;
                                    cVar.f155415n = 0;
                                    cVar.f155416p = 0;
                                    cVar.f155419s = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i15 = C3854a.f155392b[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i15 != 1) {
                                                bVar2 = ou1.b.ACTIVE;
                                            } else if (i15 != 2) {
                                                bVar2 = ou1.b.REVOKED;
                                            } else if (i15 != 3) {
                                                bVar2 = ou1.b.EXPIRED;
                                            } else {
                                                if (i15 == 4) {
                                                    throw new oq.p();
                                                }
                                                bVar2 = ou1.b.INACTIVE;
                                            }
                                            right = new dx.i.Right(bVar2);
                                            iVar = right;
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.SingleMultidocumentStatus singleMultidocumentStatus = new q34.j0.a.SingleMultidocumentStatus(rq0.b.d.DRIVING_LICENCE, date, str);
                                    cVar.f155406d = vq.j.a(date);
                                    cVar.f155407e = vq.j.a(str);
                                    cVar.f155408f = jVarA;
                                    cVar.f155409g = vq.j.a(aVar);
                                    cVar.f155410h = vq.j.a(aVar);
                                    cVar.f155411j = aVar;
                                    cVar.f155412k = 0;
                                    cVar.f155413l = 0;
                                    cVar.f155414m = 0;
                                    cVar.f155415n = 0;
                                    cVar.f155416p = 0;
                                    cVar.f155419s = 2;
                                    objC = j0Var.c(singleMultidocumentStatus, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i16 = C3854a.f155393c[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i16 != 1) {
                                                bVar3 = ou1.b.ACTIVE;
                                            } else if (i16 != 2) {
                                                bVar3 = ou1.b.REVOKED;
                                            } else if (i16 != 3) {
                                                bVar3 = ou1.b.EXPIRED;
                                            } else if (i16 != 4) {
                                                bVar3 = ou1.b.INACTIVE;
                                            } else {
                                                if (i16 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar3 = ou1.b.ACTIVE;
                                            }
                                            right = new dx.i.Right(bVar3);
                                            iVar = right;
                                        }
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
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(str));
                                dx.i iVarA = str.a(e);
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
                        if (i18 == 1) {
                            bVar = (ex.b) cVar.f155411j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3854a.f155392b[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i15 != 1) {
                                    bVar2 = ou1.b.ACTIVE;
                                } else if (i15 != 2) {
                                    bVar2 = ou1.b.REVOKED;
                                } else if (i15 != 3) {
                                    bVar2 = ou1.b.EXPIRED;
                                } else {
                                    if (i15 == 4) {
                                        throw new oq.p();
                                    }
                                    bVar2 = ou1.b.INACTIVE;
                                }
                                right = new dx.i.Right(bVar2);
                                iVar = right;
                            }
                        } else {
                            if (i18 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f155411j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i16 = C3854a.f155393c[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i16 != 1) {
                                    bVar3 = ou1.b.ACTIVE;
                                } else if (i16 != 2) {
                                    bVar3 = ou1.b.REVOKED;
                                } else if (i16 != 3) {
                                    bVar3 = ou1.b.EXPIRED;
                                } else if (i16 != 4) {
                                    bVar3 = ou1.b.INACTIVE;
                                } else {
                                    if (i16 == 5) {
                                        throw new oq.p();
                                    }
                                    bVar3 = ou1.b.ACTIVE;
                                }
                                right = new dx.i.Right(bVar3);
                                iVar = right;
                            }
                        }
                        return new dx.i.Right((ou1.b) bVar.a(iVar));
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

        /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.p3$a$e, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // nu1.a
        public Object g(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? eVar2;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof e) {
                e eVar3 = (e) eVar;
                int i15 = eVar3.f155437p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar3.f155437p = i15 - PKIFailureInfo.systemUnavail;
                    eVar2 = eVar3;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f155435m;
            Object objE = uq.b.e();
            int i16 = eVar2.f155437p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) eVar2.f155434l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for driving licence type is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar4 = this.f155383h;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.DRIVING_LICENCE);
                        eVar2.f155432j = jVarA;
                        eVar2.f155433k = vq.j.a(aVar);
                        eVar2.f155434l = aVar;
                        eVar2.f155427d = 0;
                        eVar2.f155428e = 0;
                        eVar2.f155429f = 0;
                        eVar2.f155430g = 0;
                        eVar2.f155431h = 0;
                        eVar2.f155437p = 1;
                        objC = eVar4.c(params, eVar2);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for driving licence type is null")));
                        throw new oq.g();
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
                        eVar2 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(eVar2));
                        dx.i iVarA = eVar2.a(e);
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
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.p3$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // nu1.a
        public Object h(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? bVar;
            Object objB;
            ex.b bVar2;
            if (eVar instanceof b) {
                b bVar3 = (b) eVar;
                int i15 = bVar3.f155405q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar3.f155405q = i15 - PKIFailureInfo.systemUnavail;
                    bVar = bVar3;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f155403n;
            Object objE = uq.b.e();
            int i16 = bVar.f155405q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f155376a;
                            w24.n nVar = this.f155386k;
                            q34.w wVar = this.f155387l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.n.Params params = new w24.n.Params(f24.i.DRIVING_LICENCE);
                                    bVar.f155399j = jVarA;
                                    bVar.f155400k = vq.j.a(aVar);
                                    bVar.f155401l = vq.j.a(aVar);
                                    bVar.f155402m = aVar;
                                    bVar.f155394d = 0;
                                    bVar.f155395e = 0;
                                    bVar.f155396f = 0;
                                    bVar.f155397g = 0;
                                    bVar.f155398h = 0;
                                    bVar.f155405q = 1;
                                    objC = nVar.c(params, bVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        bVar2.a((dx.i) objC);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.w.Params params2 = new q34.w.Params(rq0.b.d.DRIVING_LICENCE);
                                    bVar.f155399j = jVarA;
                                    bVar.f155400k = vq.j.a(aVar);
                                    bVar.f155401l = vq.j.a(aVar);
                                    bVar.f155394d = 0;
                                    bVar.f155395e = 0;
                                    bVar.f155396f = 0;
                                    bVar.f155397g = 0;
                                    bVar.f155398h = 0;
                                    bVar.f155405q = 2;
                                    if (wVar.c(params2, bVar) != objE) {
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
                            bVar2 = (ex.b) bVar.f155402m;
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
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

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.p3$a$g, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // nu1.a
        public Object i(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            ?? gVar;
            Object objB;
            ex.b bVar;
            boolean zBooleanValue;
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                int i15 = gVar2.f155461q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    gVar2.f155461q = i15 - PKIFailureInfo.systemUnavail;
                    gVar = gVar2;
                } else {
                    gVar = new g(eVar);
                }
            } else {
                gVar = new g(eVar);
            }
            Object objC = gVar.f155459n;
            Object objE = uq.b.e();
            int i16 = gVar.f155461q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar2 = this.f155376a;
                            w24.f2 f2Var = this.f155388m;
                            q34.k1 k1Var = this.f155389n;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue2 = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue2) {
                                    w24.f2.Params params = new w24.f2.Params(f24.i.ID_CARD);
                                    gVar.f155455j = jVarA;
                                    gVar.f155456k = vq.j.a(aVar);
                                    gVar.f155457l = vq.j.a(aVar);
                                    gVar.f155458m = aVar;
                                    gVar.f155450d = 0;
                                    gVar.f155451e = 0;
                                    gVar.f155452f = 0;
                                    gVar.f155453g = 0;
                                    gVar.f155454h = 0;
                                    gVar.f155461q = 1;
                                    objC = f2Var.c(params, gVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        zBooleanValue = ((Boolean) bVar.a((dx.i) objC)).booleanValue();
                                    }
                                } else {
                                    if (zBooleanValue2) {
                                        throw new oq.p();
                                    }
                                    q34.k1.Params params2 = new q34.k1.Params(rq0.b.d.ID_CARD);
                                    gVar.f155455j = jVarA;
                                    gVar.f155456k = vq.j.a(aVar);
                                    gVar.f155457l = vq.j.a(aVar);
                                    gVar.f155450d = 0;
                                    gVar.f155451e = 0;
                                    gVar.f155452f = 0;
                                    gVar.f155453g = 0;
                                    gVar.f155454h = 0;
                                    gVar.f155461q = 2;
                                    objC = k1Var.c(params2, gVar);
                                    if (objC != objE) {
                                        zBooleanValue = ((Boolean) objC).booleanValue();
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
                                gVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(gVar));
                                dx.i iVarA = gVar.a(e);
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
                            bVar = (ex.b) gVar.f155458m;
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) bVar.a((dx.i) objC)).booleanValue();
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) objC).booleanValue();
                        }
                        return new dx.i.Right(vq.b.a(zBooleanValue));
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

    private p3() {
    }

    public final nu1.a a(g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.g getMainCertificateTypeUC, w24.m0 getDrivingLicenceDataUC, w24.x0 getMainDocumentUserDataUC, q34.m0 getDrivingLicenceDocumentsFromContainerUseCase, q34.d checkServiceTemporaryInterruptionUC, r34.e getValueFromDocumentConfigUC, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, w24.n deleteDocumentByTypeUC, q34.w deleteDocumentUseCase, q34.k1 isDocumentAddedUseCase, w24.f2 isDocumentAddedByTypeUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getMainCertificateTypeUC, identityManager, getDrivingLicenceDataUC, getDrivingLicenceDocumentsFromContainerUseCase, getMainDocumentUserDataUC, checkServiceTemporaryInterruptionUC, getValueFromDocumentConfigUC, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, deleteDocumentByTypeUC, deleteDocumentUseCase, isDocumentAddedByTypeUC, isDocumentAddedUseCase, getDocumentDeletionDialogUC);
    }
}
