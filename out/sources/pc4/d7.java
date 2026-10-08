package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpc4/d7;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lw24/l1;", "getRefugeeCardDataUC", "Lq34/h0;", "getDiiaDocumentUseCase", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lw24/n1;", "getRefugeeChildrenCardDataUC", "Lq34/g0;", "getDiiaChildrenDocumentsUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lr34/e;", "getValueFromDocumentConfigUC", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lvs1/a;", "a", "(Lc54/b;Lw24/l1;Lq34/h0;Lw24/k0;Lq34/j0;Lw24/n1;Lq34/g0;Lk24/a;Lq34/w;Lr34/e;Lq34/d;Lj34/d;)Lvs1/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7 f154422a = new d7();

    @Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00070\u0002H\u0096@¢\u0006\u0004\b\t\u0010\u0006J&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00022\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0006J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"pc4/d7$a", "Lvs1/a;", "Ldx/i;", "Ldx/b;", "Lws1/d;", "j", "(Ltq/e;)Ljava/lang/Object;", "", "", "h", "documentId", "Lws1/b;", "k", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "i", "Loq/i0;", "b", "g", "Lrq0/c;", "service", "Lcb4/d;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Lkotlin/Function0;", "onDelete", "onClose", "f", "(Lrq0/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements vs1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.l1 f154424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.h0 f154425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.n1 f154426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.g0 f154427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.k0 f154428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.j0 f154429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k24.a f154430h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q34.w f154431i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r34.e f154432j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q34.d f154433k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ j34.d f154434l;

        /* JADX INFO: renamed from: pc4.d7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3831a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f154435a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f154436b;

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
                f154435a = iArr;
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
                f154436b = iArr2;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154437d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154438e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154439f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154440g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154441h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154442j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154443k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154444l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154445m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154446n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154447p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154449r;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154447p = obj;
                this.f154449r |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154450d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154451e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154452f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154453g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154454h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154455j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154456k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154457l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154458m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154459n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154460p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154462r;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154460p = obj;
                this.f154462r |= PKIFailureInfo.systemUnavail;
                return a.this.i(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154463d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154464e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154465f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154466g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154467h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154468j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154469k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154470l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154471m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154472n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154473p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154475r;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154473p = obj;
                this.f154475r |= PKIFailureInfo.systemUnavail;
                return a.this.k(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154476d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154478f;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154476d = obj;
                this.f154478f |= PKIFailureInfo.systemUnavail;
                return a.this.j(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f154479d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154480e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154481f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154482g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154483h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154484j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154485k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154486l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f154487m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154489p;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154487m = obj;
                this.f154489p |= PKIFailureInfo.systemUnavail;
                return a.this.g(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154490d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154492f;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154490d = obj;
                this.f154492f |= PKIFailureInfo.systemUnavail;
                return a.this.h(this);
            }
        }

        a(c54.b bVar, w24.l1 l1Var, q34.h0 h0Var, w24.n1 n1Var, q34.g0 g0Var, w24.k0 k0Var, q34.j0 j0Var, k24.a aVar, q34.w wVar, r34.e eVar, q34.d dVar, j34.d dVar2) {
            this.f154423a = bVar;
            this.f154424b = l1Var;
            this.f154425c = h0Var;
            this.f154426d = n1Var;
            this.f154427e = g0Var;
            this.f154428f = k0Var;
            this.f154429g = j0Var;
            this.f154430h = aVar;
            this.f154431i = wVar;
            this.f154432j = eVar;
            this.f154433k = dVar;
            this.f154434l = dVar2;
        }

        @Override // vs1.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:65:0x0142  */
        /* JADX WARN: Code duplicated, block: B:68:0x0153  */
        /* JADX WARN: Code duplicated, block: B:69:0x0161  */
        /* JADX WARN: Code duplicated, block: B:71:0x0165  */
        /* JADX WARN: Code duplicated, block: B:74:0x0171  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v24 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // vs1.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            b bVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f154449r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f154449r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f154447p;
            Object objE = uq.b.e();
            int i16 = bVar.f154449r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f154423a;
                        k24.a aVar = this.f154430h;
                        q34.w wVar = this.f154431i;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                if (str == 0) {
                                    aVar2.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                    throw new oq.g();
                                }
                                k24.a.Params params = new k24.a.Params(str);
                                bVar.f154437d = vq.j.a(str);
                                bVar.f154438e = jVarA;
                                bVar.f154439f = vq.j.a(aVar2);
                                bVar.f154440g = vq.j.a(aVar2);
                                bVar.f154441h = aVar2;
                                bVar.f154442j = 0;
                                bVar.f154443k = 0;
                                bVar.f154444l = 0;
                                bVar.f154445m = 0;
                                bVar.f154446n = 0;
                                bVar.f154449r = 1;
                                objC = aVar.c(params, bVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar2 = aVar2;
                                    bVar2.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(rq0.b.d.DIIA_REFUGEE_CARD);
                                bVar.f154437d = vq.j.a(str);
                                bVar.f154438e = jVarA;
                                bVar.f154439f = vq.j.a(aVar2);
                                bVar.f154440g = vq.j.a(aVar2);
                                bVar.f154442j = 0;
                                bVar.f154443k = 0;
                                bVar.f154444l = 0;
                                bVar.f154445m = 0;
                                bVar.f154446n = 0;
                                bVar.f154449r = 2;
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
                        bVar2 = (ex.b) bVar.f154441h;
                        jVar = (dx.j) bVar.f154438e;
                        try {
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            str = jVar;
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
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        @Override // vs1.a
        public Object d(rq0.c cVar, tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.f154433k.c(new q34.d.Params(cVar), eVar);
        }

        @Override // vs1.a
        public Object f(rq0.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f154434l.c(new j34.d.Params(bVar, aVar, aVar2), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.d7$a$f, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // vs1.a
        public Object g(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? fVar;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof f) {
                f fVar2 = (f) eVar;
                int i15 = fVar2.f154489p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar2.f154489p = i15 - PKIFailureInfo.systemUnavail;
                    fVar = fVar2;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f154487m;
            Object objE = uq.b.e();
            int i16 = fVar.f154489p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) fVar.f154486l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for Refugee Card document type is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar2 = this.f154432j;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.DIIA_REFUGEE_CARD);
                        fVar.f154484j = jVarA;
                        fVar.f154485k = vq.j.a(aVar);
                        fVar.f154486l = aVar;
                        fVar.f154479d = 0;
                        fVar.f154480e = 0;
                        fVar.f154481f = 0;
                        fVar.f154482g = 0;
                        fVar.f154483h = 0;
                        fVar.f154489p = 1;
                        objC = eVar2.c(params, fVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for Refugee Card document type is null")));
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
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r6 == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
        
            if (r6 == r1) goto L37;
         */
        @Override // vs1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object h(tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<java.lang.String, ws1.RefugeeCardData>>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.d7.a.h(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ca A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00e9 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00ef A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00f5 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00ff A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0161  */
        /* JADX WARN: Code duplicated, block: B:70:0x0162 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0166 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0178 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:75:0x017a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:76:0x017c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:77:0x017e  */
        /* JADX WARN: Code duplicated, block: B:79:0x0181 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x018a A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x018d A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0190 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0193 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01a8 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // vs1.a
        public Object i(String str, tq.e<? super dx.i<? extends dx.b, ? extends ws1.b>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            int i15;
            ws1.b bVar2;
            dx.i.Right right;
            int i16;
            ws1.b bVar3;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i17 = cVar.f154462r;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f154462r = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f154460p;
            ?? E = uq.b.e();
            int i18 = cVar.f154462r;
            try {
                try {
                    try {
                        if (i18 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f154423a;
                            w24.k0 k0Var = this.f154428f;
                            q34.j0 j0Var = this.f154429g;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == null) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    cVar.f154450d = vq.j.a(str);
                                    cVar.f154451e = jVarA;
                                    cVar.f154452f = vq.j.a(aVar);
                                    cVar.f154453g = vq.j.a(aVar);
                                    cVar.f154454h = aVar;
                                    cVar.f154455j = 0;
                                    cVar.f154456k = 0;
                                    cVar.f154457l = 0;
                                    cVar.f154458m = 0;
                                    cVar.f154459n = 0;
                                    cVar.f154462r = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != E) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i15 = C3831a.f154435a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i15 != 1) {
                                                bVar2 = ws1.b.ACTIVE;
                                            } else if (i15 != 2) {
                                                bVar2 = ws1.b.REVOKED;
                                            } else if (i15 != 3) {
                                                bVar2 = ws1.b.EXPIRED;
                                            } else {
                                                if (i15 == 4) {
                                                    throw new oq.p();
                                                }
                                                bVar2 = ws1.b.INACTIVE;
                                            }
                                            right = new dx.i.Right(bVar2);
                                            iVar = right;
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.DIIA_REFUGEE_CHILD_CARD, null);
                                    cVar.f154450d = vq.j.a(str);
                                    cVar.f154451e = jVarA;
                                    cVar.f154452f = vq.j.a(aVar);
                                    cVar.f154453g = vq.j.a(aVar);
                                    cVar.f154454h = aVar;
                                    cVar.f154455j = 0;
                                    cVar.f154456k = 0;
                                    cVar.f154457l = 0;
                                    cVar.f154458m = 0;
                                    cVar.f154459n = 0;
                                    cVar.f154462r = 2;
                                    objC = j0Var.c(allDocumentStatus, cVar);
                                    if (objC != E) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i16 = C3831a.f154436b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i16 != 1) {
                                                bVar3 = ws1.b.ACTIVE;
                                            } else if (i16 != 2) {
                                                bVar3 = ws1.b.REVOKED;
                                            } else if (i16 != 3) {
                                                bVar3 = ws1.b.EXPIRED;
                                            } else if (i16 != 4) {
                                                bVar3 = ws1.b.INACTIVE;
                                            } else {
                                                if (i16 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar3 = ws1.b.ACTIVE;
                                            }
                                            right = new dx.i.Right(bVar3);
                                            iVar = right;
                                        }
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
                        if (i18 == 1) {
                            bVar = (ex.b) cVar.f154454h;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3831a.f154435a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i15 != 1) {
                                    bVar2 = ws1.b.ACTIVE;
                                } else if (i15 != 2) {
                                    bVar2 = ws1.b.REVOKED;
                                } else if (i15 != 3) {
                                    bVar2 = ws1.b.EXPIRED;
                                } else {
                                    if (i15 == 4) {
                                        throw new oq.p();
                                    }
                                    bVar2 = ws1.b.INACTIVE;
                                }
                                right = new dx.i.Right(bVar2);
                                iVar = right;
                            }
                        } else {
                            if (i18 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f154454h;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i16 = C3831a.f154436b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i16 != 1) {
                                    bVar3 = ws1.b.ACTIVE;
                                } else if (i16 != 2) {
                                    bVar3 = ws1.b.REVOKED;
                                } else if (i16 != 3) {
                                    bVar3 = ws1.b.EXPIRED;
                                } else if (i16 != 4) {
                                    bVar3 = ws1.b.INACTIVE;
                                } else {
                                    if (i16 == 5) {
                                        throw new oq.p();
                                    }
                                    bVar3 = ws1.b.ACTIVE;
                                }
                                right = new dx.i.Right(bVar3);
                                iVar = right;
                            }
                        }
                        return new dx.i.Right((ws1.b) bVar.a(iVar));
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
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // vs1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object j(tq.e<? super dx.i<? extends dx.b, ws1.RefugeeCardData>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.d7.a.e
                if (r0 == 0) goto L13
                r0 = r6
                pc4.d7$a$e r0 = (pc4.d7.a.e) r0
                int r1 = r0.f154478f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f154478f = r1
                goto L18
            L13:
                pc4.d7$a$e r0 = new pc4.d7$a$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f154476d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f154478f
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
                c54.b r6 = r5.f154423a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7b
                w24.l1 r6 = r5.f154424b
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f154478f = r4
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
                i24.o0 r6 = (i24.RefugeeCardData) r6
                ws1.d r6 = pc4.e7.a(r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            L75:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L7b:
                if (r6 != 0) goto Lad
                q34.h0 r6 = r5.f154425c
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f154478f = r3
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
                o34.c r6 = (o34.c) r6
                ws1.d r6 = pc4.e7.b(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: pc4.d7.a.j(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ca A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00e9 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00ef A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00f5 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00ff A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0161  */
        /* JADX WARN: Code duplicated, block: B:70:0x0162 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0166 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0178 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:75:0x017a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:76:0x017c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:77:0x017e  */
        /* JADX WARN: Code duplicated, block: B:79:0x0181 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x018a A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x018d A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0190 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0193 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01a8 A[Catch: Exception -> 0x0043, c -> 0x0046, CancellationException -> 0x0049, TryCatch #6 {Exception -> 0x0043, blocks: (B:13:0x003e, B:67:0x015b, B:87:0x019c, B:70:0x0162, B:72:0x0166, B:79:0x0181, B:86:0x0195, B:80:0x0184, B:81:0x0189, B:82:0x018a, B:83:0x018d, B:84:0x0190, B:85:0x0193, B:88:0x01a8, B:89:0x01ad, B:92:0x01b4, B:95:0x01c2, B:24:0x0068, B:34:0x00c2, B:37:0x00ca, B:39:0x00ce, B:44:0x00e6, B:50:0x00f7, B:45:0x00e9, B:46:0x00ee, B:47:0x00ef, B:48:0x00f2, B:49:0x00f5, B:52:0x00ff, B:53:0x0104), top: B:110:0x0024 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // vs1.a
        public Object k(String str, tq.e<? super dx.i<? extends dx.b, ? extends ws1.b>> eVar) throws Throwable {
            d dVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            int i15;
            ws1.b bVar2;
            dx.i.Right right;
            int i16;
            ws1.b bVar3;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i17 = dVar.f154475r;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f154475r = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f154473p;
            ?? E = uq.b.e();
            int i18 = dVar.f154475r;
            try {
                try {
                    try {
                        if (i18 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f154423a;
                            w24.k0 k0Var = this.f154428f;
                            q34.j0 j0Var = this.f154429g;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == null) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    dVar.f154463d = vq.j.a(str);
                                    dVar.f154464e = jVarA;
                                    dVar.f154465f = vq.j.a(aVar);
                                    dVar.f154466g = vq.j.a(aVar);
                                    dVar.f154467h = aVar;
                                    dVar.f154468j = 0;
                                    dVar.f154469k = 0;
                                    dVar.f154470l = 0;
                                    dVar.f154471m = 0;
                                    dVar.f154472n = 0;
                                    dVar.f154475r = 1;
                                    objC = k0Var.c(params, dVar);
                                    if (objC != E) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i15 = C3831a.f154435a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i15 != 1) {
                                                bVar2 = ws1.b.ACTIVE;
                                            } else if (i15 != 2) {
                                                bVar2 = ws1.b.REVOKED;
                                            } else if (i15 != 3) {
                                                bVar2 = ws1.b.EXPIRED;
                                            } else {
                                                if (i15 == 4) {
                                                    throw new oq.p();
                                                }
                                                bVar2 = ws1.b.INACTIVE;
                                            }
                                            right = new dx.i.Right(bVar2);
                                            iVar = right;
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.DIIA_REFUGEE_CARD, null);
                                    dVar.f154463d = vq.j.a(str);
                                    dVar.f154464e = jVarA;
                                    dVar.f154465f = vq.j.a(aVar);
                                    dVar.f154466g = vq.j.a(aVar);
                                    dVar.f154467h = aVar;
                                    dVar.f154468j = 0;
                                    dVar.f154469k = 0;
                                    dVar.f154470l = 0;
                                    dVar.f154471m = 0;
                                    dVar.f154472n = 0;
                                    dVar.f154475r = 2;
                                    objC = j0Var.c(allDocumentStatus, dVar);
                                    if (objC != E) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i16 = C3831a.f154436b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i16 != 1) {
                                                bVar3 = ws1.b.ACTIVE;
                                            } else if (i16 != 2) {
                                                bVar3 = ws1.b.REVOKED;
                                            } else if (i16 != 3) {
                                                bVar3 = ws1.b.EXPIRED;
                                            } else if (i16 != 4) {
                                                bVar3 = ws1.b.INACTIVE;
                                            } else {
                                                if (i16 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar3 = ws1.b.ACTIVE;
                                            }
                                            right = new dx.i.Right(bVar3);
                                            iVar = right;
                                        }
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
                        if (i18 == 1) {
                            bVar = (ex.b) dVar.f154467h;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3831a.f154435a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i15 != 1) {
                                    bVar2 = ws1.b.ACTIVE;
                                } else if (i15 != 2) {
                                    bVar2 = ws1.b.REVOKED;
                                } else if (i15 != 3) {
                                    bVar2 = ws1.b.EXPIRED;
                                } else {
                                    if (i15 == 4) {
                                        throw new oq.p();
                                    }
                                    bVar2 = ws1.b.INACTIVE;
                                }
                                right = new dx.i.Right(bVar2);
                                iVar = right;
                            }
                        } else {
                            if (i18 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) dVar.f154467h;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i16 = C3831a.f154436b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i16 != 1) {
                                    bVar3 = ws1.b.ACTIVE;
                                } else if (i16 != 2) {
                                    bVar3 = ws1.b.REVOKED;
                                } else if (i16 != 3) {
                                    bVar3 = ws1.b.EXPIRED;
                                } else if (i16 != 4) {
                                    bVar3 = ws1.b.INACTIVE;
                                } else {
                                    if (i16 == 5) {
                                        throw new oq.p();
                                    }
                                    bVar3 = ws1.b.ACTIVE;
                                }
                                right = new dx.i.Right(bVar3);
                                iVar = right;
                            }
                        }
                        return new dx.i.Right((ws1.b) bVar.a(iVar));
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

    private d7() {
    }

    public final vs1.a a(c54.b isFeatureEnabledUseCase, w24.l1 getRefugeeCardDataUC, q34.h0 getDiiaDocumentUseCase, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, w24.n1 getRefugeeChildrenCardDataUC, q34.g0 getDiiaChildrenDocumentsUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, r34.e getValueFromDocumentConfigUC, q34.d checkServiceTemporaryInterruptionUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getRefugeeCardDataUC, getDiiaDocumentUseCase, getRefugeeChildrenCardDataUC, getDiiaChildrenDocumentsUseCase, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, deleteDocumentByIdUC, deleteDocumentUseCase, getValueFromDocumentConfigUC, checkServiceTemporaryInterruptionUC, getDocumentDeletionDialogUC);
    }
}
