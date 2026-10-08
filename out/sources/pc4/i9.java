package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpc4/i9;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/d1;", "getUutCardDataUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lw24/k0;", "getDocumentValidityStatusUC", "Lez/c;", "dateConverter", "Lr34/e;", "getValueFromDocumentConfigUC", "Lw24/n;", "deleteDocumentByTypeUC", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/j1;", "getRailwayCardDataUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lgd3/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;Lq34/d1;Lq34/j0;Lw24/k0;Lez/c;Lr34/e;Lw24/n;Lk24/a;Lq34/w;Lw24/j1;Lj34/d;)Lgd3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i9 f154950a = new i9();

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0006J\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0006J*\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"pc4/i9$a", "Lgd3/a;", "Ldx/i;", "Ldx/b;", "Lhd3/h;", "g", "(Ltq/e;)Ljava/lang/Object;", "Ljava/util/Date;", "expirationDate", "", "documentId", "Lhd3/c;", "f", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lhd3/f;", "e", "d", "Lkotlin/Function0;", "Loq/i0;", "onDelete", "Lcb4/d;", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements gd3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.x0 f154952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.x0 f154953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.k0 f154954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.j0 f154955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.j1 f154956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.d1 f154957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ez.c f154958h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r34.e f154959i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j34.d f154960j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.n f154961k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k24.a f154962l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q34.w f154963m;

        /* JADX INFO: renamed from: pc4.i9$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3842a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154964d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154965e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154966f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154967g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154968h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154969j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154970k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154971l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154972m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154973n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154974p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154975q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154977s;

            C3842a(tq.e<? super C3842a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154975q = obj;
                this.f154977s |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f154978d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154979e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154980f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154981g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154982h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154983j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154984k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154985l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f154986m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154988p;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154986m = obj;
                this.f154988p |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154989d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154990e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154991f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154992g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154993h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154994j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154995k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154996l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154997m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154998n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154999p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155000q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155002s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155000q = obj;
                this.f155002s |= PKIFailureInfo.systemUnavail;
                return a.this.f(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155003d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155005f;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155003d = obj;
                this.f155005f |= PKIFailureInfo.systemUnavail;
                return a.this.g(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {
            Object A;
            Object B;
            Object C;
            Object D;
            Object E;
            Object F;
            Object G;
            Object H;
            Object I;
            Object K;
            /* synthetic */ Object L;
            int P;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155006d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155007e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155008f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155009g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155010h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155011j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155012k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155013l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155014m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155015n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155016p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f155017q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f155018r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f155019s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f155020t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f155021v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f155022w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f155023x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            Object f155024y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            Object f155025z;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.L = obj;
                this.P |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        a(c54.b bVar, w24.x0 x0Var, q34.x0 x0Var2, w24.k0 k0Var, q34.j0 j0Var, w24.j1 j1Var, q34.d1 d1Var, ez.c cVar, r34.e eVar, j34.d dVar, w24.n nVar, k24.a aVar, q34.w wVar) {
            this.f154951a = bVar;
            this.f154952b = x0Var;
            this.f154953c = x0Var2;
            this.f154954d = k0Var;
            this.f154955e = j0Var;
            this.f154956f = j1Var;
            this.f154957g = d1Var;
            this.f154958h = cVar;
            this.f154959i = eVar;
            this.f154960j = dVar;
            this.f154961k = nVar;
            this.f154962l = aVar;
            this.f154963m = wVar;
        }

        @Override // gd3.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v5, types: [dx.j, java.lang.Object] */
        @Override // gd3.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3842a c3842a;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            ex.b bVar2;
            if (eVar instanceof C3842a) {
                c3842a = (C3842a) eVar;
                int i15 = c3842a.f154977s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3842a.f154977s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3842a = new C3842a(eVar);
                }
            } else {
                c3842a = new C3842a(eVar);
            }
            Object objC = c3842a.f154975q;
            Object objE = uq.b.e();
            int i16 = c3842a.f154977s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154951a;
                            w24.n nVar = this.f154961k;
                            k24.a aVar = this.f154962l;
                            q34.w wVar = this.f154963m;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                rq0.b.d dVar = rq0.b.d.RAILWAY_CARD;
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        w24.n.Params params = new w24.n.Params((f24.i) aVar2.a(j1.l(dVar)));
                                        c3842a.f154964d = vq.j.a(str);
                                        c3842a.f154965e = jVarA;
                                        c3842a.f154966f = vq.j.a(aVar2);
                                        c3842a.f154967g = vq.j.a(aVar2);
                                        c3842a.f154968h = vq.j.a(dVar);
                                        c3842a.f154969j = aVar2;
                                        c3842a.f154970k = 0;
                                        c3842a.f154971l = 0;
                                        c3842a.f154972m = 0;
                                        c3842a.f154973n = 0;
                                        c3842a.f154974p = 0;
                                        c3842a.f154977s = 1;
                                        objC = nVar.c(params, c3842a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar2 = aVar2;
                                            bVar2.a((dx.i) objC);
                                        }
                                    } else {
                                        k24.a.Params params2 = new k24.a.Params(str);
                                        c3842a.f154964d = vq.j.a(str);
                                        c3842a.f154965e = jVarA;
                                        c3842a.f154966f = vq.j.a(aVar2);
                                        c3842a.f154967g = vq.j.a(aVar2);
                                        c3842a.f154968h = vq.j.a(dVar);
                                        c3842a.f154969j = aVar2;
                                        c3842a.f154970k = 0;
                                        c3842a.f154971l = 0;
                                        c3842a.f154972m = 0;
                                        c3842a.f154973n = 0;
                                        c3842a.f154974p = 0;
                                        c3842a.f154977s = 2;
                                        objC = aVar.c(params2, c3842a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar = aVar2;
                                            bVar.a((dx.i) objC);
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.w.Params params3 = new q34.w.Params(dVar);
                                    c3842a.f154964d = vq.j.a(str);
                                    c3842a.f154965e = jVarA;
                                    c3842a.f154966f = vq.j.a(aVar2);
                                    c3842a.f154967g = vq.j.a(aVar2);
                                    c3842a.f154968h = vq.j.a(dVar);
                                    c3842a.f154970k = 0;
                                    c3842a.f154971l = 0;
                                    c3842a.f154972m = 0;
                                    c3842a.f154973n = 0;
                                    c3842a.f154974p = 0;
                                    c3842a.f154977s = 3;
                                    if (wVar.c(params3, c3842a) != objE) {
                                        return new dx.i.Right(oq.i0.f148189a);
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
                        if (i16 == 1) {
                            bVar2 = (ex.b) c3842a.f154969j;
                            jVar = (dx.j) c3842a.f154965e;
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } else {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                try {
                                    oq.u.b(objC);
                                    return new dx.i.Right(oq.i0.f148189a);
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            }
                            bVar = (ex.b) c3842a.f154969j;
                            jVar = (dx.j) c3842a.f154965e;
                            oq.u.b(objC);
                            bVar.a((dx.i) objC);
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (ex.c e27) {
                e = e27;
            } catch (CancellationException e28) {
                throw e28;
            } catch (Exception e29) {
                e = e29;
                str = objE;
            }
        }

        @Override // gd3.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f154960j.c(new j34.d.Params(rq0.b.d.RAILWAY_CARD, aVar, null, 4, null), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.i9$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // gd3.a
        public Object d(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? bVar;
            Object objB;
            if (eVar instanceof b) {
                b bVar2 = (b) eVar;
                int i15 = bVar2.f154988p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f154988p = i15 - PKIFailureInfo.systemUnavail;
                    bVar = bVar2;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f154986m;
            Object objE = uq.b.e();
            int i16 = bVar.f154988p;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        r34.e eVar2 = this.f154959i;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.RAILWAY_CARD);
                            bVar.f154983j = jVarA;
                            bVar.f154984k = vq.j.a(aVar);
                            bVar.f154985l = vq.j.a(aVar);
                            bVar.f154978d = 0;
                            bVar.f154979e = 0;
                            bVar.f154980f = 0;
                            bVar.f154981g = 0;
                            bVar.f154982h = 0;
                            bVar.f154988p = 1;
                            objC = eVar2.c(params, bVar);
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
                    return new dx.i.Right((String) objC);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:76:0x0353 A[Catch: Exception -> 0x046e, c -> 0x0474, CancellationException -> 0x047a, TRY_LEAVE, TryCatch #20 {c -> 0x0474, CancellationException -> 0x047a, Exception -> 0x046e, blocks: (B:74:0x034d, B:76:0x0353), top: B:202:0x034d }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:82:0x03fc  */
        /* JADX WARN: Code duplicated, block: B:83:0x03fe  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x015f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:34:0x015f */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x0163: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:36:0x0163 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x0167: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:38:0x0167 */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARN: Type inference failed for: r25v0 */
        /* JADX WARN: Type inference failed for: r25v1 */
        /* JADX WARN: Type inference failed for: r25v16 */
        /* JADX WARN: Type inference failed for: r25v17 */
        /* JADX WARN: Type inference failed for: r25v19 */
        /* JADX WARN: Type inference failed for: r25v2 */
        /* JADX WARN: Type inference failed for: r25v26 */
        /* JADX WARN: Type inference failed for: r25v3 */
        /* JADX WARN: Type inference failed for: r25v4 */
        /* JADX WARN: Type inference failed for: r25v5 */
        /* JADX WARN: Type inference failed for: r25v6 */
        /* JADX WARN: Type inference failed for: r25v7 */
        /* JADX WARN: Type inference failed for: r25v8 */
        /* JADX WARN: Type inference failed for: r25v9 */
        /* JADX WARN: Type inference failed for: r35v0, types: [pc4.i9$a] */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v127 */
        /* JADX WARN: Type inference failed for: r4v128 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v28 */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v30 */
        /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v72 */
        /* JADX WARN: Type inference failed for: r4v84 */
        /* JADX WARN: Type inference failed for: r4v89 */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v28 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0654 -> B:150:0x0670). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x03fe -> B:204:0x0424). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gd3.a
        public java.lang.Object e(tq.e<? super dx.i<? extends dx.b, hd3.RailwayCardFullData>> r36) {
            /*
                Method dump skipped, instruction units count: 1848
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.i9.a.e(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x015a  */
        /* JADX WARN: Code duplicated, block: B:59:0x015b A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x015f A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x017d A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        public Object f(Date date, String str, tq.e<? super dx.i<? extends dx.b, ? extends hd3.c>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            hd3.c cVar2;
            dx.i right2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f155002s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155002s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155000q;
            Object objE = uq.b.e();
            int i16 = cVar.f155002s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154951a;
                            w24.k0 k0Var = this.f154954d;
                            q34.j0 j0Var = this.f154955e;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    cVar.f154989d = vq.j.a(date);
                                    cVar.f154990e = vq.j.a(str);
                                    cVar.f154991f = jVarA;
                                    cVar.f154992g = vq.j.a(aVar);
                                    cVar.f154993h = vq.j.a(aVar);
                                    cVar.f154994j = aVar;
                                    cVar.f154995k = 0;
                                    cVar.f154996l = 0;
                                    cVar.f154997m = 0;
                                    cVar.f154998n = 0;
                                    cVar.f154999p = 0;
                                    cVar.f155002s = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(j9.j((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        cVar2 = (hd3.c) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.SingleMultidocumentStatus singleMultidocumentStatus = new q34.j0.a.SingleMultidocumentStatus(rq0.b.d.RAILWAY_CARD, date, str);
                                    cVar.f154989d = vq.j.a(date);
                                    cVar.f154990e = vq.j.a(str);
                                    cVar.f154991f = jVarA;
                                    cVar.f154992g = vq.j.a(aVar);
                                    cVar.f154993h = vq.j.a(aVar);
                                    cVar.f154994j = aVar;
                                    cVar.f154995k = 0;
                                    cVar.f154996l = 0;
                                    cVar.f154997m = 0;
                                    cVar.f154998n = 0;
                                    cVar.f154999p = 0;
                                    cVar.f155002s = 2;
                                    objC = j0Var.c(singleMultidocumentStatus, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(j9.i((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        cVar2 = (hd3.c) bVar.a(right2);
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
                        if (i16 == 1) {
                            bVar2 = (ex.b) cVar.f154994j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(j9.j((f24.h) ((dx.i.Right) right).b()));
                            }
                            cVar2 = (hd3.c) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f154994j;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(j9.i((er0.h) ((dx.i.Right) right2).b()));
                            }
                            cVar2 = (hd3.c) bVar.a(right2);
                        }
                        return new dx.i.Right(cVar2);
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

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        
            if (r6 == r1) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(tq.e<? super dx.i<? extends dx.b, hd3.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.i9.a.g(tq.e):java.lang.Object");
        }
    }

    private i9() {
    }

    public final gd3.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, q34.d1 getUutCardDataUC, q34.j0 getDocumentValidityStatusUseCase, w24.k0 getDocumentValidityStatusUC, ez.c dateConverter, r34.e getValueFromDocumentConfigUC, w24.n deleteDocumentByTypeUC, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, w24.j1 getRailwayCardDataUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, getRailwayCardDataUC, getUutCardDataUC, dateConverter, getValueFromDocumentConfigUC, getDocumentDeletionDialogUC, deleteDocumentByTypeUC, deleteDocumentByIdUC, deleteDocumentUseCase);
    }
}
