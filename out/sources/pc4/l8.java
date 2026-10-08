package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpc4/l8;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/c1;", "getStudentCardDocumentsUseCase", "Lk24/h;", "getStudentCardDataUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lr34/b;", "getMaintenanceBreakDialogFromDocumentConfigUC", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lj34/d;", "getDocumentDeletionDialogUC", "Lj73/a;", "a", "(Lc54/b;Lq34/c1;Lk24/h;Lr34/e;Lw24/k0;Lq34/j0;Lq34/d;Lr34/b;Lk24/a;Lq34/w;Lj34/d;)Lj73/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l8 f155104a = new l8();

    @Metadata(d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006J.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0002H\u0096@¢\u0006\u0004\b\u0019\u0010\u0006J.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eH\u0096@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"pc4/l8$a", "Lj73/a;", "Ldx/i;", "Ldx/b;", "Lk73/d;", "h", "(Ltq/e;)Ljava/lang/Object;", "", "g", "Ljava/util/Date;", "expirationDate", "documentId", "Lk73/b;", "f", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lrq0/c;", "service", "Loq/i0;", "Lcb4/d;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "i", "Lrq0/b;", "documentType", "b", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j73.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.h f155106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.c1 f155107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r34.e f155108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w24.k0 f155109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q34.j0 f155110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.d f155111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ r34.b f155112h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k24.a f155113i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.w f155114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ j34.d f155115k;

        /* JADX INFO: renamed from: pc4.l8$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3846a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155116a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155117b;

            static {
                int[] iArr = new int[f24.h.values().length];
                try {
                    iArr[f24.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f24.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f155116a = iArr;
                int[] iArr2 = new int[er0.h.values().length];
                try {
                    iArr2[er0.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[er0.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[er0.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[er0.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[er0.h.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                f155117b = iArr2;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155118d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155119e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155120f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155121g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155122h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155123j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155124k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155125l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155126m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155127n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155128p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155129q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155131s;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155129q = obj;
                this.f155131s |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155132d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155133e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155134f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155135g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155136h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155137j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155138k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155139l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155140m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155141n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155142p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155143q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155145s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155143q = obj;
                this.f155145s |= PKIFailureInfo.systemUnavail;
                return a.this.f(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155146d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155147e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155148f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155149g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155150h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155151j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155152k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155153l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f155154m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155156p;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155154m = obj;
                this.f155156p |= PKIFailureInfo.systemUnavail;
                return a.this.i(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155157d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155159f;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155157d = obj;
                this.f155159f |= PKIFailureInfo.systemUnavail;
                return a.this.h(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155160d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155161e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155162f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155163g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155164h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155165j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155166k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155167l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f155168m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155170p;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155168m = obj;
                this.f155170p |= PKIFailureInfo.systemUnavail;
                return a.this.g(this);
            }
        }

        a(c54.b bVar, k24.h hVar, q34.c1 c1Var, r34.e eVar, w24.k0 k0Var, q34.j0 j0Var, q34.d dVar, r34.b bVar2, k24.a aVar, q34.w wVar, j34.d dVar2) {
            this.f155105a = bVar;
            this.f155106b = hVar;
            this.f155107c = c1Var;
            this.f155108d = eVar;
            this.f155109e = k0Var;
            this.f155110f = j0Var;
            this.f155111g = dVar;
            this.f155112h = bVar2;
            this.f155113i = aVar;
            this.f155114j = wVar;
            this.f155115k = dVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 j() {
            return oq.i0.f148189a;
        }

        @Override // j73.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:65:0x015c  */
        /* JADX WARN: Code duplicated, block: B:68:0x016d  */
        /* JADX WARN: Code duplicated, block: B:69:0x017b  */
        /* JADX WARN: Code duplicated, block: B:71:0x017f  */
        /* JADX WARN: Code duplicated, block: B:74:0x018b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // j73.a
        public Object b(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            b bVar2;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar3;
            if (eVar instanceof b) {
                bVar2 = (b) eVar;
                int i15 = bVar2.f155131s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f155131s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar2 = new b(eVar);
                }
            } else {
                bVar2 = new b(eVar);
            }
            Object objC = bVar2.f155129q;
            Object objE = uq.b.e();
            int i16 = bVar2.f155131s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar4 = this.f155105a;
                        k24.a aVar = this.f155113i;
                        q34.w wVar = this.f155114j;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                if (str == 0) {
                                    aVar2.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                    throw new oq.g();
                                }
                                k24.a.Params params = new k24.a.Params(str);
                                bVar2.f155118d = vq.j.a(str);
                                bVar2.f155119e = vq.j.a(bVar);
                                bVar2.f155120f = jVarA;
                                bVar2.f155121g = vq.j.a(aVar2);
                                bVar2.f155122h = vq.j.a(aVar2);
                                bVar2.f155123j = aVar2;
                                bVar2.f155124k = 0;
                                bVar2.f155125l = 0;
                                bVar2.f155126m = 0;
                                bVar2.f155127n = 0;
                                bVar2.f155128p = 0;
                                bVar2.f155131s = 1;
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
                                bVar2.f155118d = vq.j.a(str);
                                bVar2.f155119e = vq.j.a(bVar);
                                bVar2.f155120f = jVarA;
                                bVar2.f155121g = vq.j.a(aVar2);
                                bVar2.f155122h = vq.j.a(aVar2);
                                bVar2.f155124k = 0;
                                bVar2.f155125l = 0;
                                bVar2.f155126m = 0;
                                bVar2.f155127n = 0;
                                bVar2.f155128p = 0;
                                bVar2.f155131s = 2;
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
                        bVar3 = (ex.b) bVar2.f155123j;
                        jVar = (dx.j) bVar2.f155120f;
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

        @Override // j73.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f155115k.c(new j34.d.Params(rq0.b.d.STUDENT_CARD, aVar, null, 4, null), eVar);
        }

        @Override // j73.a
        public Object d(rq0.c cVar, tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.f155111g.c(new q34.d.Params(cVar), eVar);
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
        @Override // j73.a
        public Object f(Date date, String str, tq.e<? super dx.i<? extends dx.b, ? extends k73.b>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            int i15;
            k73.b bVar2;
            dx.i.Right right;
            int i16;
            k73.b bVar3;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i17 = cVar.f155145s;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155145s = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155143q;
            Object objE = uq.b.e();
            int i18 = cVar.f155145s;
            try {
                try {
                    try {
                        if (i18 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f155105a;
                            w24.k0 k0Var = this.f155109e;
                            q34.j0 j0Var = this.f155110f;
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
                                    cVar.f155132d = vq.j.a(date);
                                    cVar.f155133e = vq.j.a(str);
                                    cVar.f155134f = jVarA;
                                    cVar.f155135g = vq.j.a(aVar);
                                    cVar.f155136h = vq.j.a(aVar);
                                    cVar.f155137j = aVar;
                                    cVar.f155138k = 0;
                                    cVar.f155139l = 0;
                                    cVar.f155140m = 0;
                                    cVar.f155141n = 0;
                                    cVar.f155142p = 0;
                                    cVar.f155145s = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i15 = C3846a.f155116a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i15 != 1) {
                                                bVar2 = k73.b.ACTIVE;
                                            } else if (i15 != 2) {
                                                bVar2 = k73.b.REVOKED;
                                            } else if (i15 != 3) {
                                                bVar2 = k73.b.EXPIRED;
                                            } else {
                                                if (i15 == 4) {
                                                    throw new oq.p();
                                                }
                                                bVar2 = k73.b.INACTIVE;
                                            }
                                            right = new dx.i.Right(bVar2);
                                            iVar = right;
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.STUDENT_CARD, date);
                                    cVar.f155132d = vq.j.a(date);
                                    cVar.f155133e = vq.j.a(str);
                                    cVar.f155134f = jVarA;
                                    cVar.f155135g = vq.j.a(aVar);
                                    cVar.f155136h = vq.j.a(aVar);
                                    cVar.f155137j = aVar;
                                    cVar.f155138k = 0;
                                    cVar.f155139l = 0;
                                    cVar.f155140m = 0;
                                    cVar.f155141n = 0;
                                    cVar.f155142p = 0;
                                    cVar.f155145s = 2;
                                    objC = j0Var.c(allDocumentStatus, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i16 = C3846a.f155117b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i16 != 1) {
                                                bVar3 = k73.b.ACTIVE;
                                            } else if (i16 != 2) {
                                                bVar3 = k73.b.REVOKED;
                                            } else if (i16 != 3) {
                                                bVar3 = k73.b.EXPIRED;
                                            } else if (i16 != 4) {
                                                bVar3 = k73.b.INACTIVE;
                                            } else {
                                                if (i16 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar3 = k73.b.ACTIVE;
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
                            bVar = (ex.b) cVar.f155137j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3846a.f155116a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i15 != 1) {
                                    bVar2 = k73.b.ACTIVE;
                                } else if (i15 != 2) {
                                    bVar2 = k73.b.REVOKED;
                                } else if (i15 != 3) {
                                    bVar2 = k73.b.EXPIRED;
                                } else {
                                    if (i15 == 4) {
                                        throw new oq.p();
                                    }
                                    bVar2 = k73.b.INACTIVE;
                                }
                                right = new dx.i.Right(bVar2);
                                iVar = right;
                            }
                        } else {
                            if (i18 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f155137j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i16 = C3846a.f155117b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i16 != 1) {
                                    bVar3 = k73.b.ACTIVE;
                                } else if (i16 != 2) {
                                    bVar3 = k73.b.REVOKED;
                                } else if (i16 != 3) {
                                    bVar3 = k73.b.EXPIRED;
                                } else if (i16 != 4) {
                                    bVar3 = k73.b.INACTIVE;
                                } else {
                                    if (i16 == 5) {
                                        throw new oq.p();
                                    }
                                    bVar3 = k73.b.ACTIVE;
                                }
                                right = new dx.i.Right(bVar3);
                                iVar = right;
                            }
                        }
                        return new dx.i.Right((k73.b) bVar.a(iVar));
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
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.l8$a$f, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // j73.a
        public Object g(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? fVar;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof f) {
                f fVar2 = (f) eVar;
                int i15 = fVar2.f155170p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar2.f155170p = i15 - PKIFailureInfo.systemUnavail;
                    fVar = fVar2;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f155168m;
            Object objE = uq.b.e();
            int i16 = fVar.f155170p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) fVar.f155167l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for student card document type is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar2 = this.f155108d;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.STUDENT_CARD);
                        fVar.f155165j = jVarA;
                        fVar.f155166k = vq.j.a(aVar);
                        fVar.f155167l = aVar;
                        fVar.f155160d = 0;
                        fVar.f155161e = 0;
                        fVar.f155162f = 0;
                        fVar.f155163g = 0;
                        fVar.f155164h = 0;
                        fVar.f155170p = 1;
                        objC = eVar2.c(params, fVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for student card document type is null")));
                        throw new oq.g();
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
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
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // j73.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object h(tq.e<? super dx.i<? extends dx.b, k73.StudentCardData>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.l8.a.e
                if (r0 == 0) goto L13
                r0 = r6
                pc4.l8$a$e r0 = (pc4.l8.a.e) r0
                int r1 = r0.f155159f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f155159f = r1
                goto L18
            L13:
                pc4.l8$a$e r0 = new pc4.l8$a$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f155157d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f155159f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r6)
                goto L8a
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L34:
                oq.u.b(r6)
                goto L58
            L38:
                oq.u.b(r6)
                c54.b r6 = r5.f155105a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7b
                k24.h r6 = r5.f155106b
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f155159f = r4
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L58
                goto L89
            L58:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L5f
                return r6
            L5f:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L75
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                i24.s0 r6 = (i24.StudentCardData) r6
                k73.d r6 = pc4.m8.a(r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            L75:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L7b:
                if (r6 != 0) goto Lad
                q34.c1 r6 = r5.f155107c
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f155159f = r3
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L8a
            L89:
                return r1
            L8a:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L91
                return r6
            L91:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto La7
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                k34.c0 r6 = (k34.StudentCardDocumentData) r6
                k73.d r6 = pc4.m8.b(r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            La7:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            Lad:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.l8.a.h(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.l8$a$d, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // j73.a
        public Object i(tq.e<? super dx.i<? extends dx.b, dx.b.Business>> eVar) throws Throwable {
            ?? dVar;
            Object objB;
            if (eVar instanceof d) {
                d dVar2 = (d) eVar;
                int i15 = dVar2.f155156p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar2.f155156p = i15 - PKIFailureInfo.systemUnavail;
                    dVar = dVar2;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f155154m;
            Object objE = uq.b.e();
            int i16 = dVar.f155156p;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        r34.b bVar = this.f155112h;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            r34.b.Params params = new r34.b.Params(rq0.b.d.STUDENT_CARD, new er.a() { // from class: pc4.k8
                                @Override // er.a
                                public final Object a() {
                                    return l8.a.j();
                                }
                            });
                            dVar.f155151j = jVarA;
                            dVar.f155152k = vq.j.a(aVar);
                            dVar.f155153l = vq.j.a(aVar);
                            dVar.f155146d = 0;
                            dVar.f155147e = 0;
                            dVar.f155148f = 0;
                            dVar.f155149g = 0;
                            dVar.f155150h = 0;
                            dVar.f155156p = 1;
                            objC = bVar.c(params, dVar);
                            if (objC == objE) {
                                return objE;
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
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    r34.b.Result result = (r34.b.Result) objC;
                    return new dx.i.Right(result != null ? result.getError() : null);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    private l8() {
    }

    public final j73.a a(c54.b isFeatureEnabledUseCase, q34.c1 getStudentCardDocumentsUseCase, k24.h getStudentCardDataUC, r34.e getValueFromDocumentConfigUC, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, q34.d checkServiceTemporaryInterruptionUC, r34.b getMaintenanceBreakDialogFromDocumentConfigUC, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getStudentCardDataUC, getStudentCardDocumentsUseCase, getValueFromDocumentConfigUC, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, checkServiceTemporaryInterruptionUC, getMaintenanceBreakDialogFromDocumentConfigUC, deleteDocumentByIdUC, deleteDocumentUseCase, getDocumentDeletionDialogUC);
    }
}
