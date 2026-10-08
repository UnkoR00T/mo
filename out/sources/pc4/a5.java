package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpc4/a5;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/s0;", "getFamilyCardDataUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lw24/k0;", "getDocumentValidityStatusUC", "Lez/c;", "dateConverter", "Lr34/e;", "getValueFromDocumentConfigUC", "Lw24/n;", "deleteDocumentByTypeUC", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/s0;", "containersGetFamilyCardDataUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Li62/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;Lq34/s0;Lq34/j0;Lw24/k0;Lez/c;Lr34/e;Lw24/n;Lk24/a;Lq34/w;Lw24/s0;Lj34/d;)Li62/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5 f154299a = new a5();

    @Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0006J\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"pc4/a5$a", "Li62/a;", "Ldx/i;", "Ldx/b;", "Lj62/h;", "h", "(Ltq/e;)Ljava/lang/Object;", "Ljava/util/Date;", "expirationDate", "", "documentId", "Lj62/c;", "g", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lj62/f;", "e", "d", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i62.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.x0 f154301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.x0 f154302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.k0 f154303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.j0 f154304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.s0 f154305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.s0 f154306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ez.c f154307h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r34.e f154308i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w24.n f154309j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ k24.a f154310k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.w f154311l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ j34.d f154312m;

        /* JADX INFO: renamed from: pc4.a5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3826a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154313d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154314e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154315f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154316g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154317h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154318j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154319k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154320l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154321m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154322n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154323p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154324q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154326s;

            C3826a(tq.e<? super C3826a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154324q = obj;
                this.f154326s |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f154327d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154328e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154329f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154330g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154331h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154332j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154333k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154334l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f154335m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154337p;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154335m = obj;
                this.f154337p |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154338d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154339e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154340f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154341g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154342h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154343j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154344k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154345l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154346m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154347n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154348p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154349q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154351s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154349q = obj;
                this.f154351s |= PKIFailureInfo.systemUnavail;
                return a.this.g(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {
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
            int f154352d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154354f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154355g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154356h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154357j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154358k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154359l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154360m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154361n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154362p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f154363q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f154364r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f154365s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f154366t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f154367v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f154368w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            Object f154369x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            Object f154370y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            Object f154371z;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.L = obj;
                this.P |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154372d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154374f;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154372d = obj;
                this.f154374f |= PKIFailureInfo.systemUnavail;
                return a.this.h(this);
            }
        }

        a(c54.b bVar, w24.x0 x0Var, q34.x0 x0Var2, w24.k0 k0Var, q34.j0 j0Var, w24.s0 s0Var, q34.s0 s0Var2, ez.c cVar, r34.e eVar, w24.n nVar, k24.a aVar, q34.w wVar, j34.d dVar) {
            this.f154300a = bVar;
            this.f154301b = x0Var;
            this.f154302c = x0Var2;
            this.f154303d = k0Var;
            this.f154304e = j0Var;
            this.f154305f = s0Var;
            this.f154306g = s0Var2;
            this.f154307h = cVar;
            this.f154308i = eVar;
            this.f154309j = nVar;
            this.f154310k = aVar;
            this.f154311l = wVar;
            this.f154312m = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
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
        public final java.lang.Object h(tq.e<? super dx.i<? extends dx.b, j62.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.a5.a.h(tq.e):java.lang.Object");
        }

        @Override // i62.a
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
        @Override // i62.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3826a c3826a;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            ex.b bVar2;
            if (eVar instanceof C3826a) {
                c3826a = (C3826a) eVar;
                int i15 = c3826a.f154326s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3826a.f154326s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3826a = new C3826a(eVar);
                }
            } else {
                c3826a = new C3826a(eVar);
            }
            Object objC = c3826a.f154324q;
            Object objE = uq.b.e();
            int i16 = c3826a.f154326s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154300a;
                            w24.n nVar = this.f154309j;
                            k24.a aVar = this.f154310k;
                            q34.w wVar = this.f154311l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                rq0.b.d dVar = rq0.b.d.FAMILY_CARD;
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        w24.n.Params params = new w24.n.Params((f24.i) aVar2.a(j1.l(dVar)));
                                        c3826a.f154313d = vq.j.a(str);
                                        c3826a.f154314e = jVarA;
                                        c3826a.f154315f = vq.j.a(aVar2);
                                        c3826a.f154316g = vq.j.a(aVar2);
                                        c3826a.f154317h = vq.j.a(dVar);
                                        c3826a.f154318j = aVar2;
                                        c3826a.f154319k = 0;
                                        c3826a.f154320l = 0;
                                        c3826a.f154321m = 0;
                                        c3826a.f154322n = 0;
                                        c3826a.f154323p = 0;
                                        c3826a.f154326s = 1;
                                        objC = nVar.c(params, c3826a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar2 = aVar2;
                                            bVar2.a((dx.i) objC);
                                        }
                                    } else {
                                        k24.a.Params params2 = new k24.a.Params(str);
                                        c3826a.f154313d = vq.j.a(str);
                                        c3826a.f154314e = jVarA;
                                        c3826a.f154315f = vq.j.a(aVar2);
                                        c3826a.f154316g = vq.j.a(aVar2);
                                        c3826a.f154317h = vq.j.a(dVar);
                                        c3826a.f154318j = aVar2;
                                        c3826a.f154319k = 0;
                                        c3826a.f154320l = 0;
                                        c3826a.f154321m = 0;
                                        c3826a.f154322n = 0;
                                        c3826a.f154323p = 0;
                                        c3826a.f154326s = 2;
                                        objC = aVar.c(params2, c3826a);
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
                                    c3826a.f154313d = vq.j.a(str);
                                    c3826a.f154314e = jVarA;
                                    c3826a.f154315f = vq.j.a(aVar2);
                                    c3826a.f154316g = vq.j.a(aVar2);
                                    c3826a.f154317h = vq.j.a(dVar);
                                    c3826a.f154319k = 0;
                                    c3826a.f154320l = 0;
                                    c3826a.f154321m = 0;
                                    c3826a.f154322n = 0;
                                    c3826a.f154323p = 0;
                                    c3826a.f154326s = 3;
                                    if (wVar.c(params3, c3826a) != objE) {
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
                            bVar2 = (ex.b) c3826a.f154318j;
                            jVar = (dx.j) c3826a.f154314e;
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
                            bVar = (ex.b) c3826a.f154318j;
                            jVar = (dx.j) c3826a.f154314e;
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

        @Override // i62.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f154312m.c(new j34.d.Params(rq0.b.d.FAMILY_CARD, aVar, null, 4, null), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.a5$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // i62.a
        public Object d(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? bVar;
            Object objB;
            if (eVar instanceof b) {
                b bVar2 = (b) eVar;
                int i15 = bVar2.f154337p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f154337p = i15 - PKIFailureInfo.systemUnavail;
                    bVar = bVar2;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f154335m;
            Object objE = uq.b.e();
            int i16 = bVar.f154337p;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        r34.e eVar2 = this.f154308i;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.FAMILY_CARD);
                            bVar.f154332j = jVarA;
                            bVar.f154333k = vq.j.a(aVar);
                            bVar.f154334l = vq.j.a(aVar);
                            bVar.f154327d = 0;
                            bVar.f154328e = 0;
                            bVar.f154329f = 0;
                            bVar.f154330g = 0;
                            bVar.f154331h = 0;
                            bVar.f154337p = 1;
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

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:82:0x03a2 A[Catch: Exception -> 0x04b6, c -> 0x04bc, CancellationException -> 0x04c2, TRY_LEAVE, TryCatch #30 {c -> 0x04bc, CancellationException -> 0x04c2, Exception -> 0x04b6, blocks: (B:80:0x039c, B:82:0x03a2), top: B:234:0x039c }] */
        /* JADX WARN: Code duplicated, block: B:88:0x044b  */
        /* JADX WARN: Code duplicated, block: B:89:0x044d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x0186: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:40:0x0184 */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x018c: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:42:0x018a */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x0192: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:44:0x0190 */
        /* JADX WARN: Type inference failed for: r36v0, types: [pc4.a5$a] */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v32 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v7, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v80 */
        /* JADX WARN: Type inference failed for: r4v95 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x06ac -> B:228:0x06c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x044d -> B:244:0x046f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // i62.a
        public java.lang.Object e(tq.e<? super dx.i<? extends dx.b, j62.FamilyCardFullData>> r37) {
            /*
                Method dump skipped, instruction units count: 1952
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.a5.a.e(tq.e):java.lang.Object");
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
        public Object g(Date date, String str, tq.e<? super dx.i<? extends dx.b, ? extends j62.c>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            j62.c cVar2;
            dx.i right2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f154351s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f154351s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f154349q;
            Object objE = uq.b.e();
            int i16 = cVar.f154351s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154300a;
                            w24.k0 k0Var = this.f154303d;
                            q34.j0 j0Var = this.f154304e;
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
                                    cVar.f154338d = vq.j.a(date);
                                    cVar.f154339e = vq.j.a(str);
                                    cVar.f154340f = jVarA;
                                    cVar.f154341g = vq.j.a(aVar);
                                    cVar.f154342h = vq.j.a(aVar);
                                    cVar.f154343j = aVar;
                                    cVar.f154344k = 0;
                                    cVar.f154345l = 0;
                                    cVar.f154346m = 0;
                                    cVar.f154347n = 0;
                                    cVar.f154348p = 0;
                                    cVar.f154351s = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(b5.h((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        cVar2 = (j62.c) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.SingleMultidocumentStatus singleMultidocumentStatus = new q34.j0.a.SingleMultidocumentStatus(rq0.b.d.FAMILY_CARD, date, str);
                                    cVar.f154338d = vq.j.a(date);
                                    cVar.f154339e = vq.j.a(str);
                                    cVar.f154340f = jVarA;
                                    cVar.f154341g = vq.j.a(aVar);
                                    cVar.f154342h = vq.j.a(aVar);
                                    cVar.f154343j = aVar;
                                    cVar.f154344k = 0;
                                    cVar.f154345l = 0;
                                    cVar.f154346m = 0;
                                    cVar.f154347n = 0;
                                    cVar.f154348p = 0;
                                    cVar.f154351s = 2;
                                    objC = j0Var.c(singleMultidocumentStatus, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(b5.g((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        cVar2 = (j62.c) bVar.a(right2);
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
                            bVar2 = (ex.b) cVar.f154343j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(b5.h((f24.h) ((dx.i.Right) right).b()));
                            }
                            cVar2 = (j62.c) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f154343j;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(b5.g((er0.h) ((dx.i.Right) right2).b()));
                            }
                            cVar2 = (j62.c) bVar.a(right2);
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
    }

    private a5() {
    }

    public final i62.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, q34.s0 getFamilyCardDataUC, q34.j0 getDocumentValidityStatusUseCase, w24.k0 getDocumentValidityStatusUC, ez.c dateConverter, r34.e getValueFromDocumentConfigUC, w24.n deleteDocumentByTypeUC, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, w24.s0 containersGetFamilyCardDataUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, containersGetFamilyCardDataUC, getFamilyCardDataUC, dateConverter, getValueFromDocumentConfigUC, deleteDocumentByTypeUC, deleteDocumentByIdUC, deleteDocumentUseCase, getDocumentDeletionDialogUC);
    }
}
