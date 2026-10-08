package pc4;

import fr0.DocumentConfig;
import gr0.DocumentSchema;
import hr0.MultiDocumentSchema;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¯\u0001\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b-\u0010.J'\u00104\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lpc4/i1;", "", "<init>", "()V", "Lq34/x1;", "saveAsyncDocumentsDataUseCase", "Lk24/n;", "saveDocumentUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/k1;", "isDocumentAddedUseCase", "Lk24/k;", "isDocumentAddedByIdUC", "Lq34/a2;", "updateDocumentTimerDataSourceUC", "Lq34/l1;", "isDocumentStoredByIdUC", "Ls54/k;", "setLocalNotificationUseCase", "Lq34/u1;", "onDocumentContainerChangedEventUC", "Lq34/y1;", "saveDynamicMultiDocumentSchemaToContainerUC", "Lq34/v1;", "refreshDocumentsStatusesUseCase", "Lq34/w;", "deleteDocumentUseCase", "Lq34/u;", "deleteDocumentByIdLegacyUC", "Lk24/a;", "deleteDocumentByIdUC", "Lw24/p;", "deleteDocumentFromContainerUC", "Lq34/j1;", "isDocumentAddedByIidUC", "Lq34/g;", "clearVehiclesFromContainerUC", "Lr34/d;", "getSavedDocumentsConfigsUC", "Lk24/l;", "refreshDocumentsStatusesUC", "Lw24/a2;", "insertDynamicMultiDocumentSchemaUC", "Lqz3/b;", "b", "(Lq34/x1;Lk24/n;Lc54/b;Lq34/k1;Lk24/k;Lq34/a2;Lq34/l1;Ls54/k;Lq34/u1;Lq34/y1;Lq34/v1;Lq34/w;Lq34/u;Lk24/a;Lw24/p;Lq34/j1;Lq34/g;Lr34/d;Lk24/l;Lw24/a2;)Lqz3/b;", "Lq34/c;", "checkDocumentTimerDataSourceStateUC", "Lr34/b;", "getMaintenanceBreakDialogFromDocumentConfigUC", "Lqz3/a;", "a", "(Lq34/c;Lr34/b;Lq34/l1;)Lqz3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f154693a = new i1();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"pc4/i1$a", "Lqz3/a;", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "Ldx/b$c;", "a", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "", "tag", "", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "e", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements qz3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r34.b f154694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q34.c f154695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.l1 f154696c;

        /* JADX INFO: renamed from: pc4.i1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3838a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154697d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154698e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154699f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154700g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154701h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154702j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154703k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154704l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154705m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154706n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154708q;

            C3838a(tq.e<? super C3838a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154706n = obj;
                this.f154708q |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154709d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154710e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154711f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154712g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154713h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154714j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154715k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154716l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154717m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154718n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154720q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154718n = obj;
                this.f154720q |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154721d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154722e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154723f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154724g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154725h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154726j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154727k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154728l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154729m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154730n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154732q;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154730n = obj;
                this.f154732q |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, this);
            }
        }

        a(r34.b bVar, q34.c cVar, q34.l1 l1Var) {
            this.f154694a = bVar;
            this.f154695b = cVar;
            this.f154696c = l1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // qz3.a
        public Object a(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, dx.b.Business>> eVar) throws Throwable {
            C3838a c3838a;
            Object objB;
            if (eVar instanceof C3838a) {
                c3838a = (C3838a) eVar;
                int i15 = c3838a.f154708q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3838a.f154708q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3838a = new C3838a(eVar);
                }
            } else {
                c3838a = new C3838a(eVar);
            }
            Object objC = c3838a.f154706n;
            Object objE = uq.b.e();
            int i16 = c3838a.f154708q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        r34.b bVar2 = this.f154694a;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            r34.b.Params params = new r34.b.Params(bVar, new er.a() { // from class: pc4.h1
                                @Override // er.a
                                public final Object a() {
                                    return i1.a.d();
                                }
                            });
                            c3838a.f154697d = vq.j.a(bVar);
                            c3838a.f154698e = jVarA;
                            c3838a.f154699f = vq.j.a(aVar);
                            c3838a.f154700g = vq.j.a(aVar);
                            c3838a.f154701h = 0;
                            c3838a.f154702j = 0;
                            c3838a.f154703k = 0;
                            c3838a.f154704l = 0;
                            c3838a.f154705m = 0;
                            c3838a.f154708q = 1;
                            objC = bVar2.c(params, c3838a);
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
                    r34.b.Result result = (r34.b.Result) objC;
                    return new dx.i.Right(result != null ? result.getError() : null);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008e  */
        /* JADX WARN: Code duplicated, block: B:30:0x008f A[Catch: Exception -> 0x003a, c -> 0x003d, CancellationException -> 0x0040, TryCatch #2 {Exception -> 0x003a, blocks: (B:12:0x0036, B:27:0x0088, B:33:0x0094, B:30:0x008f, B:34:0x009e, B:35:0x00a3, B:42:0x00ad, B:45:0x00bb), top: B:60:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0093  */
        /* JADX WARN: Code duplicated, block: B:34:0x009e A[Catch: Exception -> 0x003a, c -> 0x003d, CancellationException -> 0x0040, TryCatch #2 {Exception -> 0x003a, blocks: (B:12:0x0036, B:27:0x0088, B:33:0x0094, B:30:0x008f, B:34:0x009e, B:35:0x00a3, B:42:0x00ad, B:45:0x00bb), top: B:60:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // qz3.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            b bVar;
            Object objB;
            q34.c.b bVar2;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f154720q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f154720q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f154718n;
            Object objE = uq.b.e();
            int i16 = bVar.f154720q;
            boolean z15 = true;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                            bVar2 = (q34.c.b) objC;
                            if (!(bVar2 instanceof q34.c.b.C4083b)) {
                                if (bVar2 instanceof q34.c.b.a) {
                                    throw new oq.p();
                                }
                                z15 = false;
                            }
                            return new dx.i.Right(vq.b.a(z15));
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    q34.c cVar = this.f154695b;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        q34.c.Params params = new q34.c.Params(str);
                        bVar.f154709d = vq.j.a(str);
                        bVar.f154710e = jVarA;
                        bVar.f154711f = vq.j.a(aVar);
                        bVar.f154712g = vq.j.a(aVar);
                        bVar.f154713h = 0;
                        bVar.f154714j = 0;
                        bVar.f154715k = 0;
                        bVar.f154716l = 0;
                        bVar.f154717m = 0;
                        bVar.f154720q = 1;
                        objC = cVar.c(params, bVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar2 = (q34.c.b) objC;
                        if (!(bVar2 instanceof q34.c.b.C4083b)) {
                            if (bVar2 instanceof q34.c.b.a) {
                                throw new oq.p();
                            }
                            z15 = false;
                        }
                        return new dx.i.Right(vq.b.a(z15));
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
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
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // qz3.a
        public Object e(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            c cVar;
            Object objB;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f154732q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f154732q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f154730n;
            Object objE = uq.b.e();
            int i16 = cVar.f154732q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        q34.l1 l1Var = this.f154696c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.l1.Params params = new q34.l1.Params(bVar);
                            cVar.f154721d = vq.j.a(bVar);
                            cVar.f154722e = jVarA;
                            cVar.f154723f = vq.j.a(aVar);
                            cVar.f154724g = vq.j.a(aVar);
                            cVar.f154725h = 0;
                            cVar.f154726j = 0;
                            cVar.f154727k = 0;
                            cVar.f154728l = 0;
                            cVar.f154729m = 0;
                            cVar.f154732q = 1;
                            objC = l1Var.c(params, cVar);
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
                    return new dx.i.Right(vq.b.a(((Boolean) objC).booleanValue()));
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    @Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JZ\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012Jj\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010#\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b$\u0010\"J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b%\u0010&J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b'\u0010&J4\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J\u001c\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096@¢\u0006\u0004\b,\u0010-J,\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b.\u0010 J$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b/\u0010\"J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b0\u0010\"J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u00101\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b2\u0010\"J\"\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u000eH\u0096@¢\u0006\u0004\b5\u0010-¨\u00066"}, d2 = {"pc4/i1$b", "Lqz3/b;", "Lgr0/h;", "documentSchema", "", "documentTypeFirstEvent", "", "documentId", "parentDocumentId", "Lfz/b$c;", "documentExpirationDate", "dataScope", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(Lgr0/h;ZLjava/lang/String;Ljava/lang/String;Lfz/b$c;Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "documentScope", "taskId", "Llz3/d;", "downloadMethod", "Lfr0/i;", "documentStoringMode", "d", "(Lgr0/h;ZLrq0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfz/b$c;Llz3/d;Lfr0/i;Ltq/e;)Ljava/lang/Object;", "expirationDate", "saveNewDocument", "k", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;ZLtq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "m", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "tag", "o", "e", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "f", "Lhr0/a;", "multiDocumentSchema", "i", "(Ljava/lang/String;Lrq0/b;Lhr0/a;Ltq/e;)Ljava/lang/Object;", "c", "(Ltq/e;)Ljava/lang/Object;", "b", "n", "j", "parentId", "h", "", "Lfr0/g;", "l", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements qz3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k24.n f154733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q34.x1 f154734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.u1 f154735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c54.b f154736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k24.k f154737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q34.k1 f154738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.j1 f154739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q34.a2 f154740h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q34.l1 f154741i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ s54.k f154742j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.a2 f154743k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.y1 f154744l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ k24.l f154745m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q34.v1 f154746n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ k24.a f154747o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q34.w f154748p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ w24.p f154749q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q34.u f154750r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ q34.g f154751s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r34.d f154752t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f154753a;

            static {
                int[] iArr = new int[lz3.d.values().length];
                try {
                    iArr[lz3.d.DOCUMENT_UPDATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz3.d.FIRST_DOWNLOAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f154753a = iArr;
            }
        }

        /* JADX INFO: renamed from: pc4.i1$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3839b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154754d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154755e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154756f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154757g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154758h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154759j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154760k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154761l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154762m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154763n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154764p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154766r;

            C3839b(tq.e<? super C3839b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154764p = obj;
                this.f154766r |= PKIFailureInfo.systemUnavail;
                return b.this.h(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154767d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154768e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154769f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154770g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154771h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154772j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154773k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154774l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154775m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154776n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154777p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154778q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154780s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154778q = obj;
                this.f154780s |= PKIFailureInfo.systemUnavail;
                return b.this.b(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154781d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154782e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154783f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154784g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154785h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154786j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154787k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154788l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154789m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154790n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154791p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154793r;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154791p = obj;
                this.f154793r |= PKIFailureInfo.systemUnavail;
                return b.this.j(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154794d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154795e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154796f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154797g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154798h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154799j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154800k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154801l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154802m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154803n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154804p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154806r;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154804p = obj;
                this.f154806r |= PKIFailureInfo.systemUnavail;
                return b.this.n(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154807d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154808e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154809f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154810g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154811h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154812j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154813k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154814l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154815m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154816n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154817p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154818q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154820s;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154818q = obj;
                this.f154820s |= PKIFailureInfo.systemUnavail;
                return b.this.a(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154821d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154822e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154823f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154824g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154825h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154826j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154827k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154828l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154829m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154830n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154831p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154833r;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154831p = obj;
                this.f154833r |= PKIFailureInfo.systemUnavail;
                return b.this.m(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class h extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154834d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154835e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154836f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154837g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154838h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154839j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154840k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154841l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154842m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154843n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154845q;

            h(tq.e<? super h> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154843n = obj;
                this.f154845q |= PKIFailureInfo.systemUnavail;
                return b.this.e(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class i extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154846d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154847e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154848f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154849g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154850h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154851j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean f154852k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154853l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154854m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154855n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154856p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154857q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f154858r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f154860t;

            i(tq.e<? super i> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154858r = obj;
                this.f154860t |= PKIFailureInfo.systemUnavail;
                return b.this.k(null, null, null, false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class j extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f154861d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154862e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154863f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154864g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154865h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154866j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154867k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154868l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f154869m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154870n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154872q;

            j(tq.e<? super j> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154870n = obj;
                this.f154872q |= PKIFailureInfo.systemUnavail;
                return b.this.c(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class k extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154873d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154874e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154875f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154876g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154877h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154878j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154879k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154880l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f154881m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f154882n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            boolean f154883p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154884q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154885r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154886s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f154887t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f154888v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            /* synthetic */ Object f154889w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f154891y;

            k(tq.e<? super k> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154889w = obj;
                this.f154891y |= PKIFailureInfo.systemUnavail;
                return b.this.g(null, false, null, null, null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class l extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154892d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154893e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154894f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154895g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154896h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154897j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154898k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154899l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154900m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154901n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154902p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154903q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f154904r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f154906t;

            l(tq.e<? super l> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154904r = obj;
                this.f154906t |= PKIFailureInfo.systemUnavail;
                return b.this.i(null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class m extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154907d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154908e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154909f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154910g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154911h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154912j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154913k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154914l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154915m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154916n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154918q;

            m(tq.e<? super m> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154916n = obj;
                this.f154918q |= PKIFailureInfo.systemUnavail;
                return b.this.f(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class n extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154919d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154920e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154921f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154922g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154923h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154924j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154925k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154926l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154927m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f154928n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154930q;

            n(tq.e<? super n> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154928n = obj;
                this.f154930q |= PKIFailureInfo.systemUnavail;
                return b.this.o(null, this);
            }
        }

        b(k24.n nVar, q34.x1 x1Var, q34.u1 u1Var, c54.b bVar, k24.k kVar, q34.k1 k1Var, q34.j1 j1Var, q34.a2 a2Var, q34.l1 l1Var, s54.k kVar2, w24.a2 a2Var2, q34.y1 y1Var, k24.l lVar, q34.v1 v1Var, k24.a aVar, q34.w wVar, w24.p pVar, q34.u uVar, q34.g gVar, r34.d dVar) {
            this.f154733a = nVar;
            this.f154734b = x1Var;
            this.f154735c = u1Var;
            this.f154736d = bVar;
            this.f154737e = kVar;
            this.f154738f = k1Var;
            this.f154739g = j1Var;
            this.f154740h = a2Var;
            this.f154741i = l1Var;
            this.f154742j = kVar2;
            this.f154743k = a2Var2;
            this.f154744l = y1Var;
            this.f154745m = lVar;
            this.f154746n = v1Var;
            this.f154747o = aVar;
            this.f154748p = wVar;
            this.f154749q = pVar;
            this.f154750r = uVar;
            this.f154751s = gVar;
            this.f154752t = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0155  */
        /* JADX WARN: Code duplicated, block: B:67:0x0166  */
        /* JADX WARN: Code duplicated, block: B:68:0x0174  */
        /* JADX WARN: Code duplicated, block: B:70:0x0178  */
        /* JADX WARN: Code duplicated, block: B:73:0x0184  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // qz3.b
        public Object a(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            f fVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            dx.j<dx.b> jVar2;
            ex.b bVar2;
            boolean zBooleanValue;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f154820s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f154820s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objC = fVar.f154818q;
            Object objE = uq.b.e();
            int i16 = fVar.f154820s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f154736d;
                        k24.k kVar = this.f154737e;
                        q34.k1 k1Var = this.f154738f;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue2 = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue2) {
                                k24.k.Params params = new k24.k.Params(str);
                                fVar.f154807d = vq.j.a(str);
                                fVar.f154808e = vq.j.a(bVar);
                                fVar.f154809f = jVarA;
                                fVar.f154810g = vq.j.a(aVar);
                                fVar.f154811h = vq.j.a(aVar);
                                fVar.f154812j = aVar;
                                fVar.f154813k = 0;
                                fVar.f154814l = 0;
                                fVar.f154815m = 0;
                                fVar.f154816n = 0;
                                fVar.f154817p = 0;
                                fVar.f154820s = 1;
                                objC = kVar.c(params, fVar);
                                if (objC != objE) {
                                    jVar2 = jVarA;
                                    bVar2 = aVar;
                                    zBooleanValue = ((Boolean) bVar2.a((dx.i) objC)).booleanValue();
                                }
                            } else {
                                if (zBooleanValue2) {
                                    throw new oq.p();
                                }
                                q34.k1.Params params2 = new q34.k1.Params(bVar);
                                fVar.f154807d = vq.j.a(str);
                                fVar.f154808e = vq.j.a(bVar);
                                fVar.f154809f = jVarA;
                                fVar.f154810g = vq.j.a(aVar);
                                fVar.f154811h = vq.j.a(aVar);
                                fVar.f154813k = 0;
                                fVar.f154814l = 0;
                                fVar.f154815m = 0;
                                fVar.f154816n = 0;
                                fVar.f154817p = 0;
                                fVar.f154820s = 2;
                                objC = k1Var.c(params2, fVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    jVar2 = jVar;
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
                            str = jVarA;
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
                    }
                    if (i16 == 1) {
                        bVar2 = (ex.b) fVar.f154812j;
                        jVar2 = (dx.j) fVar.f154809f;
                        try {
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) bVar2.a((dx.i) objC)).booleanValue();
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            dx.j<dx.b> jVar3 = jVar2;
                            e = e25;
                            str = jVar3;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(str));
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
                        jVar = (dx.j) fVar.f154809f;
                        try {
                            oq.u.b(objC);
                            jVar2 = jVar;
                            zBooleanValue = ((Boolean) objC).booleanValue();
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(vq.b.a(zBooleanValue));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
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
        @Override // qz3.b
        public Object b(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            c cVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f154780s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f154780s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f154778q;
            Object objE = uq.b.e();
            int i16 = cVar.f154780s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f154736d;
                        k24.a aVar = this.f154747o;
                        q34.w wVar = this.f154748p;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.a.Params params = new k24.a.Params(str);
                                cVar.f154767d = vq.j.a(str);
                                cVar.f154768e = vq.j.a(bVar);
                                cVar.f154769f = jVarA;
                                cVar.f154770g = vq.j.a(aVar2);
                                cVar.f154771h = vq.j.a(aVar2);
                                cVar.f154772j = aVar2;
                                cVar.f154773k = 0;
                                cVar.f154774l = 0;
                                cVar.f154775m = 0;
                                cVar.f154776n = 0;
                                cVar.f154777p = 0;
                                cVar.f154780s = 1;
                                objC = aVar.c(params, cVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar2 = aVar2;
                                    bVar2.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(bVar);
                                cVar.f154767d = vq.j.a(str);
                                cVar.f154768e = vq.j.a(bVar);
                                cVar.f154769f = jVarA;
                                cVar.f154770g = vq.j.a(aVar2);
                                cVar.f154771h = vq.j.a(aVar2);
                                cVar.f154773k = 0;
                                cVar.f154774l = 0;
                                cVar.f154775m = 0;
                                cVar.f154776n = 0;
                                cVar.f154777p = 0;
                                cVar.f154780s = 2;
                                if (wVar.c(params2, cVar) != objE) {
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
                        bVar2 = (ex.b) cVar.f154772j;
                        jVar = (dx.j) cVar.f154769f;
                        try {
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
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
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.i1$b$j, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // qz3.b
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? jVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            if (eVar instanceof j) {
                j jVar2 = (j) eVar;
                int i15 = jVar2.f154872q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    jVar2.f154872q = i15 - PKIFailureInfo.systemUnavail;
                    jVar = jVar2;
                } else {
                    jVar = new j(eVar);
                }
            } else {
                jVar = new j(eVar);
            }
            Object objC = jVar.f154870n;
            Object objE = uq.b.e();
            int i16 = jVar.f154872q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar2 = this.f154736d;
                            k24.l lVar = this.f154745m;
                            q34.v1 v1Var = this.f154746n;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    jVar.f154866j = jVarA;
                                    jVar.f154867k = vq.j.a(aVar);
                                    jVar.f154868l = vq.j.a(aVar);
                                    jVar.f154869m = aVar;
                                    jVar.f154861d = 0;
                                    jVar.f154862e = 0;
                                    jVar.f154863f = 0;
                                    jVar.f154864g = 0;
                                    jVar.f154865h = 0;
                                    jVar.f154872q = 1;
                                    objC = lVar.c(c1792a, jVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    jVar.f154866j = jVarA;
                                    jVar.f154867k = vq.j.a(aVar);
                                    jVar.f154868l = vq.j.a(aVar);
                                    jVar.f154869m = aVar;
                                    jVar.f154861d = 0;
                                    jVar.f154862e = 0;
                                    jVar.f154863f = 0;
                                    jVar.f154864g = 0;
                                    jVar.f154865h = 0;
                                    jVar.f154872q = 2;
                                    objC = v1Var.c(c1792a2, jVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
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
                                jVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(jVar));
                                dx.i iVarA = jVar.a(e);
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
                            bVar = (ex.b) jVar.f154869m;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) jVar.f154869m;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                        }
                        bVar.a(iVar);
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

        @Override // qz3.b
        public Object d(DocumentSchema documentSchema, boolean z15, rq0.b bVar, String str, String str2, String str3, fz.b.LocalDate localDate, lz3.d dVar, fr0.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            k34.k kVar;
            q34.x1 x1Var = this.f154734b;
            int i15 = a.f154753a[dVar.ordinal()];
            if (i15 == 1) {
                kVar = k34.k.DOCUMENT_UPDATE;
            } else if (i15 == 2) {
                kVar = k34.k.DOCUMENT_REDOWNLOAD;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                kVar = k34.k.FIRST_DOWNLOAD;
            }
            return x1Var.c(new q34.x1.Params(documentSchema, z15, bVar, str, str2, str3, localDate, kVar, iVar), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // qz3.b
        public Object e(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            h hVar;
            Object objB;
            if (eVar instanceof h) {
                hVar = (h) eVar;
                int i15 = hVar.f154845q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar.f154845q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    hVar = new h(eVar);
                }
            } else {
                hVar = new h(eVar);
            }
            Object objC = hVar.f154843n;
            Object objE = uq.b.e();
            int i16 = hVar.f154845q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        q34.l1 l1Var = this.f154741i;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.l1.Params params = new q34.l1.Params(bVar);
                            hVar.f154834d = vq.j.a(bVar);
                            hVar.f154835e = jVarA;
                            hVar.f154836f = vq.j.a(aVar);
                            hVar.f154837g = vq.j.a(aVar);
                            hVar.f154838h = 0;
                            hVar.f154839j = 0;
                            hVar.f154840k = 0;
                            hVar.f154841l = 0;
                            hVar.f154842m = 0;
                            hVar.f154845q = 1;
                            objC = l1Var.c(params, hVar);
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
                    return new dx.i.Right(vq.b.a(((Boolean) objC).booleanValue()));
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // qz3.b
        public Object f(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            m mVar;
            Object objB;
            if (eVar instanceof m) {
                mVar = (m) eVar;
                int i15 = mVar.f154918q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    mVar.f154918q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    mVar = new m(eVar);
                }
            } else {
                mVar = new m(eVar);
            }
            Object obj = mVar.f154916n;
            Object objE = uq.b.e();
            int i16 = mVar.f154918q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        s54.k kVar = this.f154742j;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            s54.k.Params params = new s54.k.Params(bVar);
                            mVar.f154907d = vq.j.a(bVar);
                            mVar.f154908e = jVarA;
                            mVar.f154909f = vq.j.a(aVar);
                            mVar.f154910g = vq.j.a(aVar);
                            mVar.f154911h = 0;
                            mVar.f154912j = 0;
                            mVar.f154913k = 0;
                            mVar.f154914l = 0;
                            mVar.f154915m = 0;
                            mVar.f154918q = 1;
                            if (kVar.c(params, mVar) == objE) {
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
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r4v0, types: [dx.j, int, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
        	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
        	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
        	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
        	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // qz3.b
        public Object g(DocumentSchema documentSchema, boolean z15, String str, String str2, fz.b.LocalDate localDate, String str3, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            k kVar;
            Object objB;
            ex.b bVar2;
            if (eVar instanceof k) {
                kVar = (k) eVar;
                int i15 = kVar.f154891y;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    kVar.f154891y = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    kVar = new k(eVar);
                }
            } else {
                kVar = new k(eVar);
            }
            Object objC = kVar.f154889w;
            Object objE = uq.b.e();
            ?? r15 = kVar.f154891y;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(objC);
                        k24.n nVar = this.f154733a;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        ex.a aVar = new ex.a();
                        k24.n.Params params = new k24.n.Params(z15, str, str2, localDate, str3, (f24.i) aVar.a(j1.l(bVar)), documentSchema != null ? j1.j(documentSchema) : null);
                        kVar.f154873d = vq.j.a(documentSchema);
                        kVar.f154874e = vq.j.a(str);
                        kVar.f154875f = vq.j.a(str2);
                        kVar.f154876g = vq.j.a(localDate);
                        kVar.f154877h = vq.j.a(str3);
                        kVar.f154878j = vq.j.a(bVar);
                        kVar.f154879k = jVarA;
                        kVar.f154880l = vq.j.a(aVar);
                        kVar.f154881m = vq.j.a(aVar);
                        kVar.f154882n = aVar;
                        kVar.f154883p = z15;
                        kVar.f154884q = 0;
                        kVar.f154885r = 0;
                        kVar.f154886s = 0;
                        kVar.f154887t = 0;
                        kVar.f154888v = 0;
                        kVar.f154891y = 1;
                        objC = nVar.c(params, kVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar2 = aVar;
                    } else {
                        if (r15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) kVar.f154882n;
                        try {
                            oq.u.b(objC);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    }
                    bVar2.a((dx.i) objC);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e16) {
                    px.f fVar = px.f.f163100a;
                    String message = e16.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e16, px.c.a(r15));
                    dx.i iVarA = r15.a(e16);
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
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0126  */
        /* JADX WARN: Code duplicated, block: B:65:0x0137  */
        /* JADX WARN: Code duplicated, block: B:66:0x0145  */
        /* JADX WARN: Code duplicated, block: B:68:0x0149  */
        /* JADX WARN: Code duplicated, block: B:71:0x0155  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // qz3.b
        public Object h(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3839b c3839b;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            if (eVar instanceof C3839b) {
                c3839b = (C3839b) eVar;
                int i15 = c3839b.f154766r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3839b.f154766r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3839b = new C3839b(eVar);
                }
            } else {
                c3839b = new C3839b(eVar);
            }
            Object objC = c3839b.f154764p;
            Object objE = uq.b.e();
            int i16 = c3839b.f154766r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f154736d;
                        w24.p pVar = this.f154749q;
                        q34.g gVar = this.f154751s;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                w24.p.Params params = new w24.p.Params(str);
                                c3839b.f154754d = vq.j.a(str);
                                c3839b.f154755e = jVarA;
                                c3839b.f154756f = vq.j.a(aVar);
                                c3839b.f154757g = vq.j.a(aVar);
                                c3839b.f154758h = aVar;
                                c3839b.f154759j = 0;
                                c3839b.f154760k = 0;
                                c3839b.f154761l = 0;
                                c3839b.f154762m = 0;
                                c3839b.f154763n = 0;
                                c3839b.f154766r = 1;
                                objC = pVar.c(params, c3839b);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar = aVar;
                                    bVar.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                c3839b.f154754d = vq.j.a(str);
                                c3839b.f154755e = jVarA;
                                c3839b.f154756f = vq.j.a(aVar);
                                c3839b.f154757g = vq.j.a(aVar);
                                c3839b.f154759j = 0;
                                c3839b.f154760k = 0;
                                c3839b.f154761l = 0;
                                c3839b.f154762m = 0;
                                c3839b.f154763n = 0;
                                c3839b.f154766r = 2;
                                if (gVar.c(c1792a, c3839b) != objE) {
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
                        bVar = (ex.b) c3839b.f154758h;
                        jVar = (dx.j) c3839b.f154755e;
                        try {
                            oq.u.b(objC);
                            bVar.a((dx.i) objC);
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

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        @Override // qz3.b
        public Object i(String str, rq0.b bVar, MultiDocumentSchema multiDocumentSchema, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            l lVar;
            Object objB;
            ex.b bVar2;
            dx.i iVar;
            if (eVar instanceof l) {
                lVar = (l) eVar;
                int i15 = lVar.f154906t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    lVar.f154906t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    lVar = new l(eVar);
                }
            } else {
                lVar = new l(eVar);
            }
            Object objC = lVar.f154904r;
            Object objE = uq.b.e();
            int i16 = lVar.f154906t;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154736d;
                            w24.a2 a2Var = this.f154743k;
                            q34.y1 y1Var = this.f154744l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.a2.Params params = new w24.a2.Params(str, j1.s(multiDocumentSchema));
                                    lVar.f154892d = vq.j.a(str);
                                    lVar.f154893e = vq.j.a(bVar);
                                    lVar.f154894f = vq.j.a(multiDocumentSchema);
                                    lVar.f154895g = jVarA;
                                    lVar.f154896h = vq.j.a(aVar);
                                    lVar.f154897j = vq.j.a(aVar);
                                    lVar.f154898k = aVar;
                                    lVar.f154899l = 0;
                                    lVar.f154900m = 0;
                                    lVar.f154901n = 0;
                                    lVar.f154902p = 0;
                                    lVar.f154903q = 0;
                                    lVar.f154906t = 1;
                                    objC = a2Var.c(params, lVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        iVar = (dx.i) objC;
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.y1.Params params2 = new q34.y1.Params(multiDocumentSchema, bVar);
                                    lVar.f154892d = vq.j.a(str);
                                    lVar.f154893e = vq.j.a(bVar);
                                    lVar.f154894f = vq.j.a(multiDocumentSchema);
                                    lVar.f154895g = jVarA;
                                    lVar.f154896h = vq.j.a(aVar);
                                    lVar.f154897j = vq.j.a(aVar);
                                    lVar.f154898k = aVar;
                                    lVar.f154899l = 0;
                                    lVar.f154900m = 0;
                                    lVar.f154901n = 0;
                                    lVar.f154902p = 0;
                                    lVar.f154903q = 0;
                                    lVar.f154906t = 2;
                                    objC = y1Var.c(params2, lVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        iVar = (dx.i) objC;
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
                            bVar2 = (ex.b) lVar.f154898k;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (ex.b) lVar.f154898k;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                        }
                        bVar2.a(iVar);
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

        /* JADX WARN: Code duplicated, block: B:62:0x012b  */
        /* JADX WARN: Code duplicated, block: B:65:0x013c  */
        /* JADX WARN: Code duplicated, block: B:66:0x014a  */
        /* JADX WARN: Code duplicated, block: B:68:0x014e  */
        /* JADX WARN: Code duplicated, block: B:71:0x015a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // qz3.b
        public Object j(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            d dVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f154793r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f154793r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f154791p;
            Object objE = uq.b.e();
            int i16 = dVar.f154793r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f154736d;
                        k24.a aVar = this.f154747o;
                        q34.u uVar = this.f154750r;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.a.Params params = new k24.a.Params(str);
                                dVar.f154781d = vq.j.a(str);
                                dVar.f154782e = jVarA;
                                dVar.f154783f = vq.j.a(aVar2);
                                dVar.f154784g = vq.j.a(aVar2);
                                dVar.f154785h = aVar2;
                                dVar.f154786j = 0;
                                dVar.f154787k = 0;
                                dVar.f154788l = 0;
                                dVar.f154789m = 0;
                                dVar.f154790n = 0;
                                dVar.f154793r = 1;
                                objC = aVar.c(params, dVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar = aVar2;
                                    bVar.a((dx.i) objC);
                                    oq.i0 i0Var = oq.i0.f148189a;
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.u.Params params2 = new q34.u.Params(str);
                                dVar.f154781d = vq.j.a(str);
                                dVar.f154782e = jVarA;
                                dVar.f154783f = vq.j.a(aVar2);
                                dVar.f154784g = vq.j.a(aVar2);
                                dVar.f154786j = 0;
                                dVar.f154787k = 0;
                                dVar.f154788l = 0;
                                dVar.f154789m = 0;
                                dVar.f154790n = 0;
                                dVar.f154793r = 2;
                                if (uVar.c(params2, dVar) != objE) {
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
                        bVar = (ex.b) dVar.f154785h;
                        jVar = (dx.j) dVar.f154782e;
                        try {
                            oq.u.b(objC);
                            bVar.a((dx.i) objC);
                            oq.i0 i0Var2 = oq.i0.f148189a;
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
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // qz3.b
        public Object k(rq0.b bVar, String str, fz.b.LocalDate localDate, boolean z15, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            i iVar;
            Object objB;
            if (eVar instanceof i) {
                iVar = (i) eVar;
                int i15 = iVar.f154860t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    iVar.f154860t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    iVar = new i(eVar);
                }
            } else {
                iVar = new i(eVar);
            }
            Object obj = iVar.f154858r;
            Object objE = uq.b.e();
            int i16 = iVar.f154860t;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.u1 u1Var = this.f154735c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.u1.Params params = new q34.u1.Params(new k34.i.Added(bVar, str, localDate, z15));
                            iVar.f154846d = vq.j.a(bVar);
                            iVar.f154847e = vq.j.a(str);
                            iVar.f154848f = vq.j.a(localDate);
                            iVar.f154849g = jVarA;
                            iVar.f154850h = vq.j.a(aVar);
                            iVar.f154851j = vq.j.a(aVar);
                            iVar.f154852k = z15;
                            iVar.f154853l = 0;
                            iVar.f154854m = 0;
                            iVar.f154855n = 0;
                            iVar.f154856p = 0;
                            iVar.f154857q = 0;
                            iVar.f154860t = 1;
                            if (u1Var.c(params, iVar) == objE) {
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
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        @Override // qz3.b
        public Object l(tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) {
            return this.f154752t.c(gz.b.a.C1792a.f78542a, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:64:0x013a  */
        /* JADX WARN: Code duplicated, block: B:67:0x014b  */
        /* JADX WARN: Code duplicated, block: B:68:0x0159  */
        /* JADX WARN: Code duplicated, block: B:70:0x015d  */
        /* JADX WARN: Code duplicated, block: B:73:0x016a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v26 */
        @Override // qz3.b
        public Object m(String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            g gVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            dx.j<dx.b> jVar2;
            ex.b bVar;
            boolean zBooleanValue;
            if (eVar instanceof g) {
                gVar = (g) eVar;
                int i15 = gVar.f154833r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    gVar.f154833r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    gVar = new g(eVar);
                }
            } else {
                gVar = new g(eVar);
            }
            Object objC = gVar.f154831p;
            Object objE = uq.b.e();
            int i16 = gVar.f154833r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f154736d;
                        k24.k kVar = this.f154737e;
                        q34.j1 j1Var = this.f154739g;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue2 = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue2) {
                                k24.k.Params params = new k24.k.Params(str);
                                gVar.f154821d = vq.j.a(str);
                                gVar.f154822e = jVarA;
                                gVar.f154823f = vq.j.a(aVar);
                                gVar.f154824g = vq.j.a(aVar);
                                gVar.f154825h = aVar;
                                gVar.f154826j = 0;
                                gVar.f154827k = 0;
                                gVar.f154828l = 0;
                                gVar.f154829m = 0;
                                gVar.f154830n = 0;
                                gVar.f154833r = 1;
                                objC = kVar.c(params, gVar);
                                if (objC != objE) {
                                    jVar2 = jVarA;
                                    bVar = aVar;
                                    zBooleanValue = ((Boolean) bVar.a((dx.i) objC)).booleanValue();
                                }
                            } else {
                                if (zBooleanValue2) {
                                    throw new oq.p();
                                }
                                q34.j1.Params params2 = new q34.j1.Params(str);
                                gVar.f154821d = vq.j.a(str);
                                gVar.f154822e = jVarA;
                                gVar.f154823f = vq.j.a(aVar);
                                gVar.f154824g = vq.j.a(aVar);
                                gVar.f154826j = 0;
                                gVar.f154827k = 0;
                                gVar.f154828l = 0;
                                gVar.f154829m = 0;
                                gVar.f154830n = 0;
                                gVar.f154833r = 2;
                                objC = j1Var.c(params2, gVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    jVar2 = jVar;
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
                        bVar = (ex.b) gVar.f154825h;
                        jVar2 = (dx.j) gVar.f154822e;
                        try {
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) bVar.a((dx.i) objC)).booleanValue();
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
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
                        jVar = (dx.j) gVar.f154822e;
                        try {
                            oq.u.b(objC);
                            jVar2 = jVar;
                            zBooleanValue = ((Boolean) objC).booleanValue();
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(vq.b.a(zBooleanValue));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // qz3.b
        public Object n(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            e eVar2;
            Object objB;
            ex.b bVar;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i15 = eVar2.f154806r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f154806r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f154804p;
            ?? E = uq.b.e();
            int i16 = eVar2.f154806r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f154736d;
                        w24.p pVar = this.f154749q;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (!zBooleanValue) {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                aVar.b(new dx.b.Generic(new UnsupportedOperationException("Deleting document by id is not supported")));
                                throw new oq.g();
                            }
                            w24.p.Params params = new w24.p.Params(str);
                            eVar2.f154794d = vq.j.a(str);
                            eVar2.f154795e = jVarA;
                            eVar2.f154796f = vq.j.a(aVar);
                            eVar2.f154797g = vq.j.a(aVar);
                            eVar2.f154798h = aVar;
                            eVar2.f154799j = 0;
                            eVar2.f154800k = 0;
                            eVar2.f154801l = 0;
                            eVar2.f154802m = 0;
                            eVar2.f154803n = 0;
                            eVar2.f154806r = 1;
                            objC = pVar.c(params, eVar2);
                            if (objC == E) {
                                return E;
                            }
                            bVar = aVar;
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
                        bVar = (ex.b) eVar2.f154798h;
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    bVar.a((dx.i) objC);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // qz3.b
        public Object o(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            n nVar;
            Object objB;
            if (eVar instanceof n) {
                nVar = (n) eVar;
                int i15 = nVar.f154930q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    nVar.f154930q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    nVar = new n(eVar);
                }
            } else {
                nVar = new n(eVar);
            }
            Object obj = nVar.f154928n;
            Object objE = uq.b.e();
            int i16 = nVar.f154930q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.a2 a2Var = this.f154740h;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.a2.Params params = new q34.a2.Params(str);
                            nVar.f154919d = vq.j.a(str);
                            nVar.f154920e = jVarA;
                            nVar.f154921f = vq.j.a(aVar);
                            nVar.f154922g = vq.j.a(aVar);
                            nVar.f154923h = 0;
                            nVar.f154924j = 0;
                            nVar.f154925k = 0;
                            nVar.f154926l = 0;
                            nVar.f154927m = 0;
                            nVar.f154930q = 1;
                            if (a2Var.c(params, nVar) == objE) {
                                return objE;
                            }
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
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }
    }

    private i1() {
    }

    public final qz3.a a(q34.c checkDocumentTimerDataSourceStateUC, r34.b getMaintenanceBreakDialogFromDocumentConfigUC, q34.l1 isDocumentStoredByIdUC) {
        return new a(getMaintenanceBreakDialogFromDocumentConfigUC, checkDocumentTimerDataSourceStateUC, isDocumentStoredByIdUC);
    }

    public final qz3.b b(q34.x1 saveAsyncDocumentsDataUseCase, k24.n saveDocumentUC, c54.b isFeatureEnabledUseCase, q34.k1 isDocumentAddedUseCase, k24.k isDocumentAddedByIdUC, q34.a2 updateDocumentTimerDataSourceUC, q34.l1 isDocumentStoredByIdUC, s54.k setLocalNotificationUseCase, q34.u1 onDocumentContainerChangedEventUC, q34.y1 saveDynamicMultiDocumentSchemaToContainerUC, q34.v1 refreshDocumentsStatusesUseCase, q34.w deleteDocumentUseCase, q34.u deleteDocumentByIdLegacyUC, k24.a deleteDocumentByIdUC, w24.p deleteDocumentFromContainerUC, q34.j1 isDocumentAddedByIidUC, q34.g clearVehiclesFromContainerUC, r34.d getSavedDocumentsConfigsUC, k24.l refreshDocumentsStatusesUC, w24.a2 insertDynamicMultiDocumentSchemaUC) {
        return new b(saveDocumentUC, saveAsyncDocumentsDataUseCase, onDocumentContainerChangedEventUC, isFeatureEnabledUseCase, isDocumentAddedByIdUC, isDocumentAddedUseCase, isDocumentAddedByIidUC, updateDocumentTimerDataSourceUC, isDocumentStoredByIdUC, setLocalNotificationUseCase, insertDynamicMultiDocumentSchemaUC, saveDynamicMultiDocumentSchemaToContainerUC, refreshDocumentsStatusesUC, refreshDocumentsStatusesUseCase, deleteDocumentByIdUC, deleteDocumentUseCase, deleteDocumentFromContainerUC, deleteDocumentByIdLegacyUC, clearVehiclesFromContainerUC, getSavedDocumentsConfigsUC);
    }
}
