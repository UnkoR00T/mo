package ka3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z93.TravelRequestModel;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001eB\u008b\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030T8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0018\u0010c\u001a\u00020`*\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006f"}, d2 = {"Lka3/o0;", "Ll00/g;", "Lka3/k;", "Lka3/g;", "Lka3/p;", "", "Lyy/a;", "stateMachineFactory", "Lpa3/n;", "mapper", "Lx93/d;", "interactor", "Lac4/a;", "callActionWithLoaderUC", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lcb4/j;", "dialogVMSFactory", "Lpa3/c;", "deleteDialogMapper", "Lpa3/d;", "fileAccessPermissionDialogMapper", "Lpa3/l;", "tooManyTripStagesDialogMapper", "Lmx/c;", "labelProvider", "La14/y;", "requestPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lka3/h;", "setupData", "<init>", "(Lyy/a;Lpa3/n;Lx93/d;Lac4/a;La14/w;Li70/e;Lhb4/d;Lib4/c;Lcb4/j;Lpa3/c;Lpa3/d;Lpa3/l;Lmx/c;La14/y;La14/m;Lka3/h;)V", "state", "Lka3/p$a;", "O9", "(Lka3/k;)Lka3/p$a;", "b", "Lpa3/n;", "c", "Lx93/d;", "d", "Lac4/a;", "e", "La14/w;", "f", "Li70/e;", "g", "Lhb4/d;", "h", "Lib4/c;", "j", "Lcb4/j;", "k", "Lpa3/c;", "l", "Lpa3/d;", "m", "Lpa3/l;", "n", "Lmx/c;", "p", "La14/y;", "q", "La14/m;", "r", "Lka3/h;", "s", "Lka3/k;", "initialState", "Lxw/b;", "Lka3/g$a;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Ljb4/b;", "N9", "(Ldx/b;)Ljb4/b;", "errorData", "x", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends l00.g<ka3.k, ka3.g> implements ka3.p, zx.d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final a f109471x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f109472y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pa3.n mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x93.d interactor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final pa3.c deleteDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final pa3.d fileAccessPermissionDialogMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final pa3.l tooManyTripStagesDialogMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ka3.h setupData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ka3.k initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ka3.g.a> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ka3.k, ka3.g> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ka3.p.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lka3/o0$a;", "", "<init>", "()V", "", "MAX_STAGES_FOR_EDITING", "I", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<z93.s, oq.i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(z93.s sVar) {
            c(sVar.getUuid());
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            o0.this.d9(new ka3.g.OnDownloadConfirmationClicked(str, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ka3.p.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f109493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f109494b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f109495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f109496b;

            /* JADX INFO: renamed from: ka3.o0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2618a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f109497d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f109498e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f109499f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f109501h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f109502j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f109503k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f109504l;

                public C2618a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f109497d = obj;
                    this.f109498e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o0 o0Var) {
                this.f109495a = hVar;
                this.f109496b = o0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2618a c2618a;
                if (eVar instanceof C2618a) {
                    c2618a = (C2618a) eVar;
                    int i15 = c2618a.f109498e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2618a.f109498e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2618a = new C2618a(eVar);
                    }
                } else {
                    c2618a = new C2618a(eVar);
                }
                Object obj2 = c2618a.f109497d;
                Object objE = uq.b.e();
                int i16 = c2618a.f109498e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f109495a;
                    ka3.p.a aVarO9 = this.f109496b.O9((ka3.k) obj);
                    c2618a.f109499f = vq.j.a(obj);
                    c2618a.f109501h = vq.j.a(c2618a);
                    c2618a.f109502j = vq.j.a(obj);
                    c2618a.f109503k = vq.j.a(hVar);
                    c2618a.f109504l = 0;
                    c2618a.f109498e = 1;
                    if (hVar.F(aVarO9, c2618a) == objE) {
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

        public c(mu.g gVar, o0 o0Var) {
            this.f109493a = gVar;
            this.f109494b = o0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ka3.p.a> hVar, tq.e eVar) {
            Object objA = this.f109493a.a(new a(hVar, this.f109494b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lka3/g$b;", "<unused var>", "Lka3/k;", "Loq/i0;", "<anonymous>", "(Lka3/g$b;Lka3/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ka3.g.b, ka3.k, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109505e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            if (r6.F(r1, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        
            if (r6.F(r1, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f109505e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                goto L5b
            L1b:
                oq.u.b(r6)
                ka3.o0 r6 = ka3.o0.this
                ka3.h r6 = ka3.o0.J9(r6)
                boolean r1 = r6 instanceof ka3.h.Details
                r4 = 0
                if (r1 == 0) goto L2c
                ka3.h$a r6 = (ka3.h.Details) r6
                goto L2d
            L2c:
                r6 = r4
            L2d:
                if (r6 == 0) goto L37
                boolean r6 = r6.getIsAfterUpdate()
                java.lang.Boolean r4 = vq.b.a(r6)
            L37:
                java.lang.Boolean r6 = vq.b.a(r3)
                boolean r6 = fr.t.c(r4, r6)
                if (r6 == 0) goto L4e
                ka3.o0 r6 = ka3.o0.this
                ka3.g$a$b r1 = ka3.g.a.b.f109412a
                r5.f109505e = r3
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L5b
                goto L5a
            L4e:
                ka3.o0 r6 = ka3.o0.this
                ka3.g$a$a r1 = ka3.g.a.C2611a.f109411a
                r5.f109505e = r2
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L5b
            L5a:
                return r0
            L5b:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ka3.o0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.b bVar, ka3.k kVar, tq.e<? super oq.i0> eVar) {
            return o0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/f;", "<unused var>", "Lk10/c0;", "Lka3/l;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ka3.f, k10.c0<Error>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109508f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sending O(Error error) {
            return new Sending(error.getSummaryData(), error.getStatementData(), error.getTripContext());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109508f;
            uq.b.e();
            if (this.f109507e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.f fVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f109508f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/e;", "<unused var>", "Lk10/c0;", "Lka3/l;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ka3.e, k10.c0<Error>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109510f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.c.InitializedSummary O(Error error) {
            return new ka3.k.c.InitializedSummary(error.getSummaryData(), error.getStatementData(), error.getTripContext());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109510f;
            uq.b.e();
            if (this.f109509e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar2) {
            f fVar = new f(eVar2);
            fVar.f109510f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/g$i;", "action", "Lk10/c0;", "Lka3/k$c$a;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/g$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ka3.g.OnStatementChecked, k10.c0<ka3.k.c.InitializedSummary>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f109513g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.c.InitializedSummary O(ka3.g.OnStatementChecked onStatementChecked, ka3.k.c.InitializedSummary initializedSummary) {
            ka3.k.StatementData.a aVar;
            ka3.k.StatementData statementData = initializedSummary.getStatementData();
            boolean checked = onStatementChecked.getChecked();
            if (checked) {
                aVar = ka3.k.StatementData.a.C2616a.f109448a;
            } else {
                if (checked) {
                    throw new oq.p();
                }
                aVar = ka3.k.StatementData.a.c.f109450a;
            }
            return ka3.k.c.InitializedSummary.g(initializedSummary, null, ka3.k.StatementData.b(statementData, aVar, false, 2, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ka3.g.OnStatementChecked onStatementChecked = (ka3.g.OnStatementChecked) this.f109512f;
            k10.c0 c0Var = (k10.c0) this.f109513g;
            uq.b.e();
            if (this.f109511e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ka3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.g.O(onStatementChecked, (k.c.InitializedSummary) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.OnStatementChecked onStatementChecked, k10.c0<ka3.k.c.InitializedSummary> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            g gVar = new g(eVar);
            gVar.f109512f = onStatementChecked;
            gVar.f109513g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/g$h;", "<unused var>", "Lk10/c0;", "Lka3/k$c$a;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/g$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ka3.g.h, k10.c0<ka3.k.c.InitializedSummary>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109515f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.c.InitializedSummary O(ka3.k.c.InitializedSummary initializedSummary) {
            return ka3.k.c.InitializedSummary.g(initializedSummary, null, ka3.k.StatementData.b(initializedSummary.getStatementData(), null, false, 1, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109515f;
            uq.b.e();
            if (this.f109514e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ka3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.h.O((k.c.InitializedSummary) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.h hVar, k10.c0<ka3.k.c.InitializedSummary> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            h hVar2 = new h(eVar);
            hVar2.f109515f = c0Var;
            return hVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lka3/g$j;", "action", "Lka3/k$c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lka3/g$j;Lka3/k$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ka3.g.OnStatementLinkClicked, ka3.k.c.InitializedSummary, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109517f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ka3.g.OnStatementLinkClicked onStatementLinkClicked = (ka3.g.OnStatementLinkClicked) this.f109517f;
            Object objE = uq.b.e();
            int i15 = this.f109516e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = o0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(onStatementLinkClicked.getUrl(), false, 2, null);
                this.f109517f = vq.j.a(onStatementLinkClicked);
                this.f109516e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            o0 o0Var = o0.this;
            if (iVar instanceof dx.i.Left) {
                o0Var.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.OnStatementLinkClicked onStatementLinkClicked, ka3.k.c.InitializedSummary initializedSummary, tq.e<? super oq.i0> eVar) {
            i iVar = o0.this.new i(eVar);
            iVar.f109517f = onStatementLinkClicked;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lka3/g$c;", "<unused var>", "Lka3/k$c$a;", "Loq/i0;", "<anonymous>", "(Lka3/g$c;Lka3/k$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ka3.g.c, ka3.k.c.InitializedSummary, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109519e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109519e;
            if (i15 == 0) {
                oq.u.b(obj);
                o0 o0Var = o0.this;
                ka3.g.a.b bVar = ka3.g.a.b.f109412a;
                this.f109519e = 1;
                if (o0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.c cVar, ka3.k.c.InitializedSummary initializedSummary, tq.e<? super oq.i0> eVar) {
            return o0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/g$g;", "<unused var>", "Lk10/c0;", "Lka3/k$c$a;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/g$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ka3.g.C2613g, k10.c0<ka3.k.c.InitializedSummary>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109522f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.c V(k10.c0 c0Var, ka3.k.c.InitializedSummary initializedSummary) {
            ka3.k.c.InitializedSummary initializedSummary2 = (ka3.k.c.InitializedSummary) c0Var.a();
            mb3.a tripContext = initializedSummary2.getTripContext();
            if (fr.t.c(tripContext, mb3.a.C3081a.f125261a)) {
                return new Sending(initializedSummary2.getSummaryData(), initializedSummary2.getStatementData(), initializedSummary2.getTripContext());
            }
            if (tripContext instanceof mb3.a.Edit) {
                return new Updating(initializedSummary2.getSummaryData(), initializedSummary2.getStatementData(), initializedSummary2.getTripContext());
            }
            throw new oq.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.c.InitializedSummary X(ka3.k.c.InitializedSummary initializedSummary) {
            return ka3.k.c.InitializedSummary.g(initializedSummary, null, initializedSummary.getStatementData().a(ka3.k.StatementData.a.C2617b.f109449a, true), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109522f;
            uq.b.e();
            if (this.f109521e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(((ka3.k.c.InitializedSummary) c0Var.a()).getStatementData().getStatementState(), ka3.k.StatementData.a.C2616a.f109448a) ? c0Var.d(new er.l() { // from class: ka3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.k.V(c0Var, (k.c.InitializedSummary) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: ka3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.k.X((k.c.InitializedSummary) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.C2613g c2613g, k10.c0<ka3.k.c.InitializedSummary> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            k kVar = new k(eVar);
            kVar.f109522f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/g$f;", "<unused var>", "Lk10/c0;", "Lka3/k$a$b;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/g$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ka3.g.f, k10.c0<ka3.k.a.InitializedDetails>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f109523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f109524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f109525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f109526h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f109527j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f109528k;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.a.InterfaceC2614a.TooManyTripStages O(o0 o0Var, ka3.k.a.InitializedDetails initializedDetails) {
            return new ka3.k.a.InterfaceC2614a.TooManyTripStages(initializedDetails.getDetailsData(), o0Var.dialogVMSFactory.a(o0Var.tooManyTripStagesDialogMapper.b(new pa3.l.Params(o0Var.b9(ka3.b.f109394a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109528k;
            Object objE = uq.b.e();
            int i15 = this.f109527j;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f109524f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            ka3.k.a.InitializedDetails initializedDetails = (ka3.k.a.InitializedDetails) c0Var.a();
            if (initializedDetails.getDetailsData().d().size() > 10) {
                final o0 o0Var = o0.this;
                return c0Var.d(new er.l() { // from class: ka3.v0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.l.O(o0Var, (k.a.InitializedDetails) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            o0 o0Var2 = o0.this;
            ka3.g.a.OpenTrip openTrip = new ka3.g.a.OpenTrip(initializedDetails.getDetailsData());
            this.f109528k = vq.j.a(c0Var);
            this.f109523e = vq.j.a(initializedDetails);
            this.f109524f = lVarC;
            this.f109525g = vq.j.a(lVarC);
            this.f109526h = 0;
            this.f109527j = 1;
            return o0Var2.F(openTrip, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.f fVar, k10.c0<ka3.k.a.InitializedDetails> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            l lVar = o0.this.new l(eVar);
            lVar.f109528k = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/g$d;", "<unused var>", "Lk10/c0;", "Lka3/k$a$b;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/g$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ka3.g.d, k10.c0<ka3.k.a.InitializedDetails>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109531f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.a.InterfaceC2614a.Delete O(k10.c0 c0Var, o0 o0Var, ka3.k.a.InitializedDetails initializedDetails) {
            return new ka3.k.a.InterfaceC2614a.Delete(((ka3.k.a.InitializedDetails) c0Var.a()).getDetailsData(), o0Var.dialogVMSFactory.a(o0Var.deleteDialogMapper.b(new pa3.c.Params(o0Var.b9(ka3.c.f109398a), o0Var.b9(ka3.b.f109394a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109531f;
            uq.b.e();
            if (this.f109530e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o0 o0Var = o0.this;
            return c0Var.d(new er.l() { // from class: ka3.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.m.O(c0Var, o0Var, (k.a.InitializedDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.d dVar, k10.c0<ka3.k.a.InitializedDetails> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            m mVar = o0.this.new m(eVar);
            mVar.f109531f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/g$e;", "<unused var>", "Lk10/c0;", "Lka3/k$a$b;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/g$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ka3.g.OnDownloadConfirmationClicked, k10.c0<ka3.k.a.InitializedDetails>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f109533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f109534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f109535g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.a.InterfaceC2614a.DeviceStoragePermission O(k10.c0 c0Var, o0 o0Var, ka3.k.a.InitializedDetails initializedDetails) {
            return new ka3.k.a.InterfaceC2614a.DeviceStoragePermission(((ka3.k.a.InitializedDetails) c0Var.a()).getDetailsData(), o0Var.dialogVMSFactory.a(o0Var.fileAccessPermissionDialogMapper.b(new pa3.d.Params(o0Var.b9(ka3.d.f109400a), o0Var.b9(ka3.b.f109394a)))));
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (r2.F(r4, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f109535g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f109534f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r7.f109533e
                u04.c r1 = (u04.c) r1
                oq.u.b(r8)
                goto L72
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                oq.u.b(r8)
                goto L41
            L26:
                oq.u.b(r8)
                ka3.o0 r8 = ka3.o0.this
                a14.y r8 = ka3.o0.I9(r8)
                a14.y$a r2 = new a14.y$a
                gy.d r5 = gy.d.EXTERNAL_STORAGE
                r2.<init>(r5)
                r7.f109535g = r0
                r7.f109534f = r4
                java.lang.Object r8 = r8.c(r2, r7)
                if (r8 != r1) goto L41
                goto L71
            L41:
                u04.c r8 = (u04.c) r8
                u04.c$a r2 = u04.c.a.f194071a
                boolean r2 = fr.t.c(r8, r2)
                if (r2 == 0) goto L77
                ka3.o0 r2 = ka3.o0.this
                ka3.g$a$d r4 = new ka3.g$a$d
                java.lang.Object r5 = r0.a()
                ka3.k$a$b r5 = (ka3.k.a.InitializedDetails) r5
                y93.a r5 = r5.getDetailsData()
                java.lang.String r5 = r5.getTripUuid()
                r6 = 0
                r4.<init>(r5, r6)
                r7.f109535g = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f109533e = r8
                r7.f109534f = r3
                java.lang.Object r8 = r2.F(r4, r7)
                if (r8 != r1) goto L72
            L71:
                return r1
            L72:
                k10.l r8 = r0.c()
                return r8
            L77:
                boolean r8 = r8 instanceof u04.c.b
                if (r8 == 0) goto L87
                ka3.o0 r8 = ka3.o0.this
                ka3.x0 r1 = new ka3.x0
                r1.<init>()
                k10.l r8 = r0.d(r1)
                return r8
            L87:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ka3.o0.n.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.g.OnDownloadConfirmationClicked onDownloadConfirmationClicked, k10.c0<ka3.k.a.InitializedDetails> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            n nVar = o0.this.new n(eVar);
            nVar.f109535g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/b;", "<unused var>", "Lk10/c0;", "Lka3/k$a$a;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ka3.b, k10.c0<ka3.k.a.InterfaceC2614a>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109538f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.a.InitializedDetails O(k10.c0 c0Var, ka3.k.a.InterfaceC2614a interfaceC2614a) {
            return new ka3.k.a.InitializedDetails(((ka3.k.a.InterfaceC2614a) c0Var.a()).getDetailsData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109538f;
            uq.b.e();
            if (this.f109537e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.o.O(c0Var, (k.a.InterfaceC2614a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.b bVar, k10.c0<ka3.k.a.InterfaceC2614a> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            o oVar = new o(eVar);
            oVar.f109538f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/c;", "<unused var>", "Lk10/c0;", "Lka3/k$a$a;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ka3.c, k10.c0<ka3.k.a.InterfaceC2614a>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109540f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Deleting O(k10.c0 c0Var, ka3.k.a.InterfaceC2614a interfaceC2614a) {
            return new Deleting(((ka3.k.a.InterfaceC2614a) c0Var.a()).getDetailsData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109540f;
            uq.b.e();
            if (this.f109539e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.p.O(c0Var, (k.a.InterfaceC2614a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.c cVar, k10.c0<ka3.k.a.InterfaceC2614a> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            p pVar = new p(eVar);
            pVar.f109540f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/d;", "<unused var>", "Lk10/c0;", "Lka3/k$a$a;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ka3.d, k10.c0<ka3.k.a.InterfaceC2614a>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109542f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.a.InitializedDetails O(k10.c0 c0Var, ka3.k.a.InterfaceC2614a interfaceC2614a) {
            return new ka3.k.a.InitializedDetails(((ka3.k.a.InterfaceC2614a) c0Var.a()).getDetailsData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109542f;
            uq.b.e();
            if (this.f109541e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = o0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            o0 o0Var = o0.this;
            if (iVarA instanceof dx.i.Left) {
                o0Var.globalSnackBarManager.y(new p50.a.Default(o0Var.labelProvider.c(r93.a.U), false, null, 6, null));
            }
            return c0Var.d(new er.l() { // from class: ka3.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.q.O(c0Var, (k.a.InterfaceC2614a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.d dVar, k10.c0<ka3.k.a.InterfaceC2614a> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            q qVar = o0.this.new q(eVar);
            qVar.f109542f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lka3/i;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<k10.c0<Deleting>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109545f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<Object>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f109547e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f109548f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f109549g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f109550h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f109551j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f109552k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f109553l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f109554m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ o0 f109555n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<Deleting> f109556p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, k10.c0<Deleting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f109555n = o0Var;
                this.f109556p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(o0 o0Var, dx.b bVar, Deleting deleting) {
                return new Error(deleting.getDetailsData(), o0Var.errorVMSFactory.a(o0Var.N9(bVar)));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f109554m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.d dVar = this.f109555n.interactor;
                    String tripUuid = this.f109556p.a().getDetailsData().getTripUuid();
                    this.f109554m = 1;
                    obj = dVar.i(tripUuid, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f109549g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                k10.c0<Deleting> c0Var = this.f109556p;
                final o0 o0Var = this.f109555n;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ka3.b1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.r.a.V(o0Var, bVar, (Deleting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                o0Var.globalSnackBarManager.y(new p50.a.Default(o0Var.labelProvider.c(r93.a.S0), false, null, 6, null));
                Object objC = c0Var.c();
                ka3.g.a.b bVar2 = ka3.g.a.b.f109412a;
                this.f109547e = vq.j.a(iVar);
                this.f109548f = vq.j.a(i0Var);
                this.f109549g = objC;
                this.f109550h = vq.j.a(objC);
                this.f109551j = 0;
                this.f109552k = 0;
                this.f109553l = 0;
                this.f109554m = 2;
                return o0Var.F(bVar2, this) == objE ? objE : objC;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f109555n, this.f109556p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<Object>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        r(tq.e<? super r> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109545f;
            Object objE = uq.b.e();
            int i15 = this.f109544e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o0.this.callActionWithLoaderUC;
            a aVar2 = new a(o0.this, c0Var, null);
            this.f109545f = vq.j.a(c0Var);
            this.f109544e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Deleting> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            return ((r) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            r rVar = o0.this.new r(eVar);
            rVar.f109545f = obj;
            return rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/f;", "<unused var>", "Lk10/c0;", "Lka3/j;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ka3.f, k10.c0<Error>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109558f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Deleting O(k10.c0 c0Var, Error error) {
            return new Deleting(((Error) c0Var.a()).getDetailsData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109558f;
            uq.b.e();
            if (this.f109557e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.s.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.f fVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            s sVar = new s(eVar);
            sVar.f109558f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/e;", "<unused var>", "Lk10/c0;", "Lka3/j;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ka3.e, k10.c0<Error>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109560f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.a.InitializedDetails O(k10.c0 c0Var, Error error) {
            return new ka3.k.a.InitializedDetails(((Error) c0Var.a()).getDetailsData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109560f;
            uq.b.e();
            if (this.f109559e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.t.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar2) {
            t tVar = new t(eVar2);
            tVar.f109560f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lka3/o;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<k10.c0<Updating>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f109561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f109562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f109563g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<Object>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f109565e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f109566f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f109567g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f109568h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f109569j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f109570k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f109571l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f109572m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ o0 f109573n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ mb3.a.Edit f109574p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<Updating> f109575q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, mb3.a.Edit edit, k10.c0<Updating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f109573n = o0Var;
                this.f109574p = edit;
                this.f109575q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(o0 o0Var, dx.b bVar, k10.c0 c0Var, Updating updating) {
                return new Error(updating.getSummaryData(), updating.getStatementData(), ((Updating) c0Var.a()).getTripContext(), o0Var.errorVMSFactory.a(o0Var.N9(bVar)));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f109572m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.d dVar = this.f109573n.interactor;
                    String tripUuid = this.f109574p.getTripUuid();
                    TravelRequestModel travelRequestModelB = pa3.f.b(this.f109575q.a().getSummaryData());
                    this.f109572m = 1;
                    obj = dVar.h(tripUuid, travelRequestModelB, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f109567g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                final k10.c0<Updating> c0Var = this.f109575q;
                final o0 o0Var = this.f109573n;
                mb3.a.Edit edit = this.f109574p;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ka3.e1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.u.a.V(o0Var, bVar, c0Var, (Updating) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                o0Var.globalSnackBarManager.y(new p50.a.Default(o0Var.labelProvider.c(r93.a.f172476g), false, null, 6, null));
                Object objC = c0Var.c();
                ka3.g.a.OpenTrip openTrip = new ka3.g.a.OpenTrip(pa3.f.a(c0Var.a().getSummaryData(), edit.getTripUuid(), edit.getType()));
                this.f109565e = vq.j.a(iVar);
                this.f109566f = vq.j.a(i0Var);
                this.f109567g = objC;
                this.f109568h = vq.j.a(objC);
                this.f109569j = 0;
                this.f109570k = 0;
                this.f109571l = 0;
                this.f109572m = 2;
                return o0Var.F(openTrip, this) == objE ? objE : objC;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f109573n, this.f109574p, this.f109575q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<Object>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        u(tq.e<? super u> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109563g;
            Object objE = uq.b.e();
            int i15 = this.f109562f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            mb3.a.Edit edit = (mb3.a.Edit) ((Updating) c0Var.a()).getTripContext();
            ac4.a aVar = o0.this.callActionWithLoaderUC;
            a aVar2 = new a(o0.this, edit, c0Var, null);
            this.f109563g = vq.j.a(c0Var);
            this.f109561e = vq.j.a(edit);
            this.f109562f = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Updating> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            return ((u) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = o0.this.new u(eVar);
            uVar.f109563g = obj;
            return uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/f;", "<unused var>", "Lk10/c0;", "Lka3/n;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ka3.f, k10.c0<Error>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109577f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Updating O(k10.c0 c0Var, Error error) {
            return new Updating(((Error) c0Var.a()).getSummaryData(), ((Error) c0Var.a()).getStatementData(), ((Error) c0Var.a()).getTripContext());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109577f;
            uq.b.e();
            if (this.f109576e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.f1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.v.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.f fVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            v vVar = new v(eVar);
            vVar.f109577f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lka3/e;", "<unused var>", "Lk10/c0;", "Lka3/n;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lka3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<ka3.e, k10.c0<Error>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109579f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ka3.k.c.InitializedSummary O(k10.c0 c0Var, Error error) {
            return new ka3.k.c.InitializedSummary(error.getSummaryData(), error.getStatementData(), ((Error) c0Var.a()).getTripContext());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f109579f;
            uq.b.e();
            if (this.f109578e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ka3.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.w.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ka3.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar2) {
            w wVar = new w(eVar2);
            wVar.f109579f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lka3/m;", "state", "Lk10/l;", "Lka3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.p<k10.c0<Sending>, tq.e<? super k10.l<? extends ka3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109581f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<Object>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f109583e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f109584f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f109585g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f109586h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f109587j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f109588k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f109589l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f109590m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ o0 f109591n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<Sending> f109592p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, k10.c0<Sending> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f109591n = o0Var;
                this.f109592p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(o0 o0Var, dx.b bVar, Sending sending) {
                return new Error(sending.getSummaryData(), sending.getStatementData(), sending.getTripContext(), o0Var.errorVMSFactory.a(o0Var.N9(bVar)));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f109590m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.d dVar = this.f109591n.interactor;
                    TravelRequestModel travelRequestModelB = pa3.f.b(this.f109592p.a().getSummaryData());
                    this.f109590m = 1;
                    obj = dVar.j(travelRequestModelB, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f109585g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                k10.c0<Sending> c0Var = this.f109592p;
                final o0 o0Var = this.f109591n;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ka3.h1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.x.a.V(o0Var, bVar, (Sending) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                Object objC = c0Var.c();
                ka3.g.a.e eVar = ka3.g.a.e.f109414a;
                this.f109583e = vq.j.a(iVar);
                this.f109584f = vq.j.a(i0Var);
                this.f109585g = objC;
                this.f109586h = vq.j.a(objC);
                this.f109587j = 0;
                this.f109588k = 0;
                this.f109589l = 0;
                this.f109590m = 2;
                return o0Var.F(eVar, this) == objE ? objE : objC;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f109591n, this.f109592p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<Object>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        x(tq.e<? super x> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f109581f;
            Object objE = uq.b.e();
            int i15 = this.f109580e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o0.this.callActionWithLoaderUC;
            a aVar2 = new a(o0.this, c0Var, null);
            this.f109581f = vq.j.a(c0Var);
            this.f109580e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Sending> c0Var, tq.e<? super k10.l<? extends ka3.k>> eVar) {
            return ((x) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            x xVar = o0.this.new x(eVar);
            xVar.f109581f = obj;
            return xVar;
        }
    }

    public o0(yy.a aVar, pa3.n nVar, x93.d dVar, ac4.a aVar2, a14.w wVar, i70.e eVar, hb4.d dVar2, ib4.c cVar, cb4.j jVar, pa3.c cVar2, pa3.d dVar3, pa3.l lVar, mx.c cVar3, a14.y yVar, a14.m mVar, ka3.h hVar) {
        ka3.k initializedDetails;
        this.mapper = nVar;
        this.interactor = dVar;
        this.callActionWithLoaderUC = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.errorVMSFactory = dVar2;
        this.errorMapper = cVar;
        this.dialogVMSFactory = jVar;
        this.deleteDialogMapper = cVar2;
        this.fileAccessPermissionDialogMapper = dVar3;
        this.tooManyTripStagesDialogMapper = lVar;
        this.labelProvider = cVar3;
        this.requestPermissionUseCase = yVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.setupData = hVar;
        if (hVar instanceof ka3.h.Summary) {
            ka3.h.Summary summary = (ka3.h.Summary) hVar;
            initializedDetails = new ka3.k.c.InitializedSummary(summary.getContract().c(), new ka3.k.StatementData(null, false, 3, null), summary.getContract().getTripContext());
        } else {
            if (!(hVar instanceof ka3.h.Details)) {
                throw new oq.p();
            }
            initializedDetails = new ka3.k.a.InitializedDetails(((ka3.h.Details) hVar).getDetailsData());
        }
        this.initialState = initializedDetails;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initializedDetails, new er.l() { // from class: ka3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.S9(this.f109404a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), O9(initializedDetails));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b N9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ka3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.u9(this.f109401a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ka3.p.a O9(ka3.k state) {
        pa3.n nVar = this.mapper;
        boolean zE = this.interactor.e();
        er.a<oq.i0> aVarB9 = b9(ka3.g.b.f109416a);
        er.a<oq.i0> aVarB10 = b9(ka3.g.C2613g.f109421a);
        return nVar.b(new pa3.n.Params(state, zE, aVarB9, b9(ka3.g.c.f109417a), aVarB10, b9(ka3.g.f.f109420a), new b(), b9(ka3.g.d.f109418a), new er.l() { // from class: ka3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.P9(this.f109392a, (String) obj);
            }
        }, new er.l() { // from class: ka3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Q9(this.f109409a, ((Boolean) obj).booleanValue());
            }
        }, b9(ka3.g.h.f109422a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(o0 o0Var, String str) {
        o0Var.d9(new ka3.g.OnStatementLinkClicked(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(o0 o0Var, boolean z15) {
        o0Var.d9(new ka3.g.OnStatementChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(final o0 o0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ka3.k.class), new er.l() { // from class: ka3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.T9(this.f109425a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ka3.k.c.InitializedSummary.class), new er.l() { // from class: ka3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.U9(this.f109430a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ka3.k.a.InitializedDetails.class), new er.l() { // from class: ka3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.V9(this.f109434a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ka3.k.a.InterfaceC2614a.class), new er.l() { // from class: ka3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.W9(this.f109437a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Deleting.class), new er.l() { // from class: ka3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.X9(this.f109454a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ka3.l0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Y9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Updating.class), new er.l() { // from class: ka3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Z9(this.f109463a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ka3.n0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.aa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Sending.class), new er.l() { // from class: ka3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ba(this.f109395a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ka3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ca((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(o0 o0Var, k10.z zVar) {
        d dVar = o0Var.new d(null);
        zVar.x(fr.q0.c(ka3.g.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(o0 o0Var, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ka3.g.OnStatementChecked.class), oVar, gVar);
        zVar.v(fr.q0.c(ka3.g.h.class), oVar, new h(null));
        zVar.x(fr.q0.c(ka3.g.OnStatementLinkClicked.class), oVar, o0Var.new i(null));
        zVar.x(fr.q0.c(ka3.g.c.class), oVar, o0Var.new j(null));
        zVar.v(fr.q0.c(ka3.g.C2613g.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(o0 o0Var, k10.z zVar) {
        l lVar = o0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ka3.g.f.class), oVar, lVar);
        zVar.v(fr.q0.c(ka3.g.d.class), oVar, o0Var.new m(null));
        zVar.v(fr.q0.c(ka3.g.OnDownloadConfirmationClicked.class), oVar, o0Var.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(o0 o0Var, k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ka3.b.class), oVar2, oVar);
        zVar.v(fr.q0.c(ka3.c.class), oVar2, new p(null));
        zVar.v(fr.q0.c(ka3.d.class), oVar2, o0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(k10.z zVar) {
        s sVar = new s(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ka3.f.class), oVar, sVar);
        zVar.v(fr.q0.c(ka3.e.class), oVar, new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(k10.z zVar) {
        v vVar = new v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ka3.f.class), oVar, vVar);
        zVar.v(fr.q0.c(ka3.e.class), oVar, new w(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ka3.f.class), oVar, eVar);
        zVar.v(fr.q0.c(ka3.e.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(o0 o0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            o0Var.d9(ka3.e.f109403a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            o0Var.d9(ka3.f.f109408a);
        }
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ka3.g.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: R9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ka3.h hVar) {
        super.P5(hVar);
    }

    @Override // zx.b
    public xw.b<ka3.g.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ka3.k, ka3.g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ka3.p.a> getState() {
        return this.state;
    }
}
