package z1;

import a4.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p079n1.l4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0012\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0016\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a,\u0010\u001b\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u0010*\u00020\u000eH\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lf3/m;", "Lkotlin/Function1;", "", "Loq/i0;", "updateTouchMode", "r", "(Lf3/m;Ler/l;)Lf3/m;", "La4/k0;", "Lz1/u;", "mouseSelectionObserver", "Ln1/l4;", "textDragObserver", "i", "(La4/k0;Lz1/u;Ln1/l4;Ltq/e;)Ljava/lang/Object;", "La4/c;", "observer", "La4/o;", "downEvent", "n", "(La4/c;Ln1/l4;La4/o;Ltq/e;)Ljava/lang/Object;", "", "clicks", "p", "(La4/c;Ln1/l4;La4/o;ILtq/e;)Ljava/lang/Object;", "Lz1/o;", "clicksCounter", "down", "k", "(La4/c;Lz1/u;Lz1/o;La4/o;Ltq/e;)Ljava/lang/Object;", "h", "(La4/c;Ltq/e;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/f3;", "viewConfiguration", "La4/b0;", "change1", "change2", "j", "(Landroidx/compose/ui/platform/f3;La4/b0;La4/b0;)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f232232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232233f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232232e = obj;
            this.f232233f |= PKIFailureInfo.systemUnavail;
            return x0.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.i implements er.p<a4.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f232234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f232235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f232236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f232237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l4 f232238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, u uVar, l4 l4Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f232236e = oVar;
            this.f232237f = uVar;
            this.f232238g = l4Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        
            if (z1.x0.k(r1, r2, r3, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        
            if (z1.x0.n(r1, r2, r13, r12) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
        
            if (z1.x0.p(r1, r3, r13, r4, r12) == r0) goto L37;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f232234c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                oq.u.b(r13)
                goto Lad
            L22:
                java.lang.Object r1 = r12.f232235d
                a4.c r1 = (a4.c) r1
                oq.u.b(r13)
                goto L3e
            L2a:
                oq.u.b(r13)
                java.lang.Object r13 = r12.f232235d
                r1 = r13
                a4.c r1 = (a4.c) r1
                r12.f232235d = r1
                r12.f232234c = r5
                java.lang.Object r13 = z1.x0.e(r1, r12)
                if (r13 != r0) goto L3e
                goto Lac
            L3e:
                a4.o r13 = (a4.o) r13
                z1.o r6 = r12.f232236e
                r6.d(r13)
                boolean r6 = z1.z0.b(r13)
                r7 = 0
                if (r6 == 0) goto L83
                int r8 = r13.getButtons()
                boolean r8 = a4.t.b(r8)
                if (r8 == 0) goto L83
                java.util.List r8 = r13.c()
                r9 = r8
                java.util.Collection r9 = (java.util.Collection) r9
                int r9 = r9.size()
                r10 = 0
            L62:
                if (r10 >= r9) goto L74
                java.lang.Object r11 = r8.get(r10)
                a4.b0 r11 = (a4.PointerInputChange) r11
                boolean r11 = r11.q()
                if (r11 == 0) goto L71
                goto L83
            L71:
                int r10 = r10 + 1
                goto L62
            L74:
                z1.u r2 = r12.f232237f
                z1.o r3 = r12.f232236e
                r12.f232235d = r7
                r12.f232234c = r4
                java.lang.Object r13 = z1.x0.k(r1, r2, r3, r13, r12)
                if (r13 != r0) goto Lad
                goto Lac
            L83:
                if (r6 != 0) goto Lad
                z1.o r4 = r12.f232236e
                int r4 = r4.a()
                if (r4 != r5) goto L9a
                n1.l4 r2 = r12.f232238g
                r12.f232235d = r7
                r12.f232234c = r3
                java.lang.Object r13 = z1.x0.n(r1, r2, r13, r12)
                if (r13 != r0) goto Lad
                goto Lac
            L9a:
                n1.l4 r3 = r12.f232238g
                z1.o r4 = r12.f232236e
                int r4 = r4.a()
                r12.f232235d = r7
                r12.f232234c = r2
                java.lang.Object r13 = z1.x0.g(r1, r3, r13, r4, r12)
                if (r13 != r0) goto Lad
            Lac:
                return r0
            Lad:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.x0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super oq.i0> eVar) {
            return ((b) v(cVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f232236e, this.f232237f, this.f232238g, eVar);
            bVar.f232235d = obj;
            return bVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f232243h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232242g = obj;
            this.f232243h |= PKIFailureInfo.systemUnavail;
            return x0.k(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f232248h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232247g = obj;
            this.f232248h |= PKIFailureInfo.systemUnavail;
            return x0.n(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f232251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f232252g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f232253h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f232254j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232253h = obj;
            this.f232254j |= PKIFailureInfo.systemUnavail;
            return x0.p(null, null, null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Lz1/r;", "<anonymous>", "(La4/c;)Lz1/r;"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.i implements er.p<a4.c, tq.e<? super r>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f232255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f232256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f232257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ fr.o0 f232258f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j15, fr.o0 o0Var, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f232257e = j15;
            this.f232258f = o0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 N(fr.o0 o0Var, PointerInputChange pointerInputChange, m3.e eVar) {
            pointerInputChange.a();
            o0Var.f66408a = eVar.getPackedValue();
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a4.c cVar;
            Object objE = uq.b.e();
            int i15 = this.f232255c;
            if (i15 == 0) {
                oq.u.b(obj);
                a4.c cVar2 = (a4.c) this.f232256d;
                long j15 = this.f232257e;
                final fr.o0 o0Var = this.f232258f;
                er.p pVar = new er.p() { // from class: z1.y0
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return x0.f.N(o0Var, (PointerInputChange) obj2, (m3.e) obj3);
                    }
                };
                this.f232256d = cVar2;
                this.f232255c = 1;
                Object objG = p143z0.q0.g(cVar2, j15, pVar, this);
                if (objG == objE) {
                    return objE;
                }
                cVar = cVar2;
                obj = objG;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (a4.c) this.f232256d;
                oq.u.b(obj);
            }
            if (((PointerInputChange) obj) != null && (this.f232258f.f66408a & 9223372034707292159L) != 9205357640488583168L) {
                return r.Drag;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) pq.v.l0(cVar.A1().c());
            if (!a4.p.d(pointerInputChange)) {
                return r.Cancel;
            }
            pointerInputChange.a();
            return r.Up;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a4.c cVar, tq.e<? super r> eVar) {
            return ((f) v(cVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(this.f232257e, this.f232258f, eVar);
            fVar.f232256d = obj;
            return fVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<Boolean, oq.i0> f232259a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.i implements er.p<a4.c, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f232260c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f232261d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ er.l<Boolean, oq.i0> f232262e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(er.l<? super Boolean, oq.i0> lVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f232262e = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002f
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r4.f232260c
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f232261d
                    a4.c r1 = (a4.c) r1
                    oq.u.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    oq.u.b(r5)
                    java.lang.Object r5 = r4.f232261d
                    a4.c r5 = (a4.c) r5
                    r1 = r5
                L23:
                    a4.q r5 = a4.q.Initial
                    r4.f232261d = r1
                    r4.f232260c = r2
                    java.lang.Object r5 = r1.k2(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    a4.o r5 = (a4.o) r5
                    er.l<java.lang.Boolean, oq.i0> r3 = r4.f232262e
                    boolean r5 = z1.z0.b(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = vq.b.a(r5)
                    r3.b(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: z1.x0.g.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(a4.c cVar, tq.e<? super oq.i0> eVar) {
                return ((a) v(cVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f232262e, eVar);
                aVar.f232261d = obj;
                return aVar;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(er.l<? super Boolean, oq.i0> lVar) {
            this.f232259a = lVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(a4.k0 k0Var, tq.e<? super oq.i0> eVar) {
            Object objD1 = k0Var.D1(new a(this.f232259a, null), eVar);
            return objD1 == uq.b.e() ? objD1 : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062 A[LOOP:0: B:19:0x0053->B:23:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(a4.c r7, tq.e<? super a4.o> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof z1.x0.a
            if (r0 == 0) goto L13
            r0 = r8
            z1.x0$a r0 = (z1.x0.a) r0
            int r1 = r0.f232233f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f232233f = r1
            goto L18
        L13:
            z1.x0$a r0 = new z1.x0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f232232e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f232233f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f232231d
            a4.c r7 = (a4.c) r7
            oq.u.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            oq.u.b(r8)
        L38:
            a4.q r8 = a4.q.Main
            r0.f232231d = r7
            r0.f232233f = r3
            java.lang.Object r8 = r7.k2(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            a4.o r8 = (a4.o) r8
            java.util.List r2 = r8.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L53:
            if (r5 >= r4) goto L65
            java.lang.Object r6 = r2.get(r5)
            a4.b0 r6 = (a4.PointerInputChange) r6
            boolean r6 = a4.p.a(r6)
            if (r6 != 0) goto L62
            goto L38
        L62:
            int r5 = r5 + 1
            goto L53
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.x0.h(a4.c, tq.e):java.lang.Object");
    }

    public static final Object i(a4.k0 k0Var, u uVar, l4 l4Var, tq.e<? super oq.i0> eVar) {
        Object objD = p143z0.g1.d(k0Var, new b(new o(k0Var.getViewConfiguration()), uVar, l4Var, null), eVar);
        return objD == uq.b.e() ? objD : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(androidx.compose.ui.platform.f3 f3Var, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return m3.e.k(m3.e.p(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < p143z0.q0.p(f3Var, pointerInputChange.getType());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008f, B:33:0x0097, B:35:0x00a8, B:37:0x00b4, B:28:0x0075), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008f, B:33:0x0097, B:35:0x00a8, B:37:0x00b4, B:28:0x0075), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:20:0x004e, B:31:0x008f, B:33:0x0097, B:35:0x00a8, B:37:0x00b4, B:28:0x0075), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0137 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x011a, B:56:0x0122, B:58:0x0126, B:60:0x0137, B:62:0x0143, B:50:0x00ed), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0143 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:54:0x011a, B:56:0x0122, B:58:0x0126, B:60:0x0137, B:62:0x0143, B:50:0x00ed), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(a4.c cVar, final u uVar, o oVar, a4.o oVar2, tq.e<? super oq.i0> eVar) throws Throwable {
        c cVar2;
        final p0 p0VarL;
        a4.c cVar3;
        fr.l0 l0Var;
        List<PointerInputChange> listC;
        int size;
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC2;
        int size2;
        PointerInputChange pointerInputChange2;
        if (eVar instanceof c) {
            cVar2 = (c) eVar;
            int i15 = cVar2.f232243h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f232243h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(eVar);
            }
        } else {
            cVar2 = new c(eVar);
        }
        Object objN = cVar2.f232242g;
        Object objE = uq.b.e();
        int i16 = cVar2.f232243h;
        int i17 = 0;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(objN);
                    PointerInputChange pointerInputChange3 = oVar2.c().get(0);
                    if (!a4.t.d(oVar2.getKeyboardModifiers())) {
                        int iA = oVar.a();
                        if (iA != 1) {
                            p0VarL = iA != 2 ? p0.INSTANCE.m() : p0.INSTANCE.n();
                        } else {
                            p0VarL = p0.INSTANCE.l();
                        }
                        if (uVar.d(pointerInputChange3.getPosition(), p0VarL, oVar.a())) {
                            final fr.l0 l0Var2 = new fr.l0();
                            l0Var2.f66404a = !fr.t.c(p0VarL, p0.INSTANCE.l());
                            long id5 = pointerInputChange3.getId();
                            er.l lVar = new er.l() { // from class: z1.u0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return x0.m(uVar, p0VarL, l0Var2, (PointerInputChange) obj);
                                }
                            };
                            cVar2.f232239d = cVar;
                            cVar2.f232240e = uVar;
                            cVar2.f232241f = l0Var2;
                            cVar2.f232243h = 2;
                            objN = p143z0.q0.n(cVar, id5, lVar, cVar2);
                            if (objN != objE) {
                                cVar3 = cVar;
                                l0Var = l0Var2;
                                if (((Boolean) objN).booleanValue()) {
                                    listC2 = cVar3.A1().c();
                                    size2 = listC2.size();
                                    while (i17 < size2) {
                                        pointerInputChange2 = listC2.get(i17);
                                        if (a4.p.c(pointerInputChange2)) {
                                            pointerInputChange2.a();
                                        }
                                        i17++;
                                    }
                                }
                                uVar.a();
                            }
                            return objE;
                        }
                    } else if (uVar.e(pointerInputChange3.getPosition())) {
                        pointerInputChange3.a();
                        long id6 = pointerInputChange3.getId();
                        er.l lVar2 = new er.l() { // from class: z1.t0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return x0.l(uVar, (PointerInputChange) obj);
                            }
                        };
                        cVar2.f232239d = cVar;
                        cVar2.f232240e = uVar;
                        cVar2.f232243h = 1;
                        objN = p143z0.q0.n(cVar, id6, lVar2, cVar2);
                        if (objN == objE) {
                            return objE;
                        }
                        if (((Boolean) objN).booleanValue()) {
                            listC = cVar.A1().c();
                            size = listC.size();
                            while (i17 < size) {
                                pointerInputChange = listC.get(i17);
                                if (a4.p.c(pointerInputChange)) {
                                    pointerInputChange.a();
                                }
                                i17++;
                            }
                        }
                        uVar.a();
                    }
                } else if (i16 == 1) {
                    uVar = (u) cVar2.f232240e;
                    cVar = (a4.c) cVar2.f232239d;
                    oq.u.b(objN);
                    if (((Boolean) objN).booleanValue()) {
                        listC = cVar.A1().c();
                        size = listC.size();
                        while (i17 < size) {
                            pointerInputChange = listC.get(i17);
                            if (a4.p.c(pointerInputChange)) {
                                pointerInputChange.a();
                            }
                            i17++;
                        }
                    }
                    uVar.a();
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l0Var = (fr.l0) cVar2.f232241f;
                    uVar = (u) cVar2.f232240e;
                    cVar3 = (a4.c) cVar2.f232239d;
                    oq.u.b(objN);
                    if (((Boolean) objN).booleanValue() && l0Var.f66404a) {
                        listC2 = cVar3.A1().c();
                        size2 = listC2.size();
                        while (i17 < size2) {
                            pointerInputChange2 = listC2.get(i17);
                            if (a4.p.c(pointerInputChange2)) {
                                pointerInputChange2.a();
                            }
                            i17++;
                        }
                    }
                    uVar.a();
                }
                return oq.i0.f148189a;
            } catch (Throwable th4) {
                uVar.a();
                throw th4;
            }
        } catch (Throwable th5) {
            uVar.a();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(u uVar, PointerInputChange pointerInputChange) {
        if (uVar.c(pointerInputChange.getPosition())) {
            pointerInputChange.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(u uVar, p0 p0Var, fr.l0 l0Var, PointerInputChange pointerInputChange) {
        if (uVar.b(pointerInputChange.getPosition(), p0Var)) {
            pointerInputChange.a();
            l0Var.f66404a = true;
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r11 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(a4.c r8, final p079n1.l4 r9, a4.o r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.x0.n(a4.c, n1.l4, a4.o, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(l4 l4Var, PointerInputChange pointerInputChange) {
        l4Var.d(a4.p.g(pointerInputChange));
        pointerInputChange.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
    
        if (r14 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(a4.c r10, final p079n1.l4 r11, a4.o r12, int r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.x0.p(a4.c, n1.l4, a4.o, int, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(l4 l4Var, PointerInputChange pointerInputChange) {
        l4Var.d(a4.p.g(pointerInputChange));
        pointerInputChange.a();
        return oq.i0.f148189a;
    }

    public static final f3.m r(f3.m mVar, er.l<? super Boolean, oq.i0> lVar) {
        return a4.w0.c(mVar, 8675309, new g(lVar));
    }
}
