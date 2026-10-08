package eg2;

import cb4.DialogData;
import fr.q0;
import jb4.ErrorActionData;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u008b\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u000200*\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102J\u0018\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u000205H\u0096\u0001¢\u0006\u0004\b8\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010h\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR \u0010n\u001a\b\u0012\u0004\u0012\u0002000i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Leg2/v;", "Ll00/g;", "Leg2/c;", "Leg2/a;", "Leg2/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lfg2/e;", "mapper", "Lvq0/i;", "beVerifyDocumentStatusUC", "Lac4/a;", "callActionWithLoaderUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/n;", "openUriIntentUseCase", "Lbg2/c;", "downloadReportUC", "Lbg2/a;", "downloadCopyDocumentUC", "Lmx/c;", "labelProvider", "La14/y;", "requestPermissionUseCase", "Lag2/c;", "storagePermissionNotGrantedDialogMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "globalSnackBarManager", "Leg2/b;", "setupData", "<init>", "(Lyy/a;Lfg2/e;Lvq0/i;Lac4/a;Lhb4/d;Lib4/c;Lac4/n;Lbg2/c;Lbg2/a;Lmx/c;La14/y;Lag2/c;La14/m;Lcb4/j;Li70/e;Leg2/b;)V", "Ldx/b;", "domainError", "Lhb4/c;", "I9", "(Ldx/b;)Lhb4/c;", "Lcb4/d;", "H9", "(Ltq/e;)Ljava/lang/Object;", "Leg2/d$a;", "K9", "(Leg2/c;)Leg2/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lfg2/e;", "c", "Lvq0/i;", "d", "Lac4/a;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Lac4/n;", "h", "Lbg2/c;", "j", "Lbg2/a;", "k", "Lmx/c;", "l", "La14/y;", "m", "Lag2/c;", "n", "La14/m;", "p", "Lcb4/j;", "q", "Li70/e;", "r", "Leg2/b;", "Leg2/c$a;", "s", "Leg2/c$a;", "initialState", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Leg2/a$g;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<eg2.c, eg2.a> implements eg2.d, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fg2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vq0.i beVerifyDocumentStatusUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bg2.c downloadReportUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final bg2.a downloadCopyDocumentUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ag2.c storagePermissionNotGrantedDialogMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final eg2.c.FetchingStatus initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<eg2.c, eg2.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<eg2.a.g> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<eg2.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f50095d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f50097f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f50095d = obj;
            this.f50097f |= PKIFailureInfo.systemUnavail;
            return v.this.H9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<eg2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f50098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f50099b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f50100a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f50101b;

            /* JADX INFO: renamed from: eg2.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1205a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f50102d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f50103e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f50104f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f50106h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f50107j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f50108k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f50109l;

                public C1205a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f50102d = obj;
                    this.f50103e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f50100a = hVar;
                this.f50101b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1205a c1205a;
                if (eVar instanceof C1205a) {
                    c1205a = (C1205a) eVar;
                    int i15 = c1205a.f50103e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1205a.f50103e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1205a = new C1205a(eVar);
                    }
                } else {
                    c1205a = new C1205a(eVar);
                }
                Object obj2 = c1205a.f50102d;
                Object objE = uq.b.e();
                int i16 = c1205a.f50103e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f50100a;
                    eg2.d.a aVarK9 = this.f50101b.K9((eg2.c) obj);
                    c1205a.f50104f = vq.j.a(obj);
                    c1205a.f50106h = vq.j.a(c1205a);
                    c1205a.f50107j = vq.j.a(obj);
                    c1205a.f50108k = vq.j.a(hVar);
                    c1205a.f50109l = 0;
                    c1205a.f50103e = 1;
                    if (hVar.F(aVarK9, c1205a) == objE) {
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

        public b(mu.g gVar, v vVar) {
            this.f50098a = gVar;
            this.f50099b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super eg2.d.a> hVar, tq.e eVar) {
            Object objA = this.f50098a.a(new a(hVar, this.f50099b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leg2/a$a;", "<unused var>", "Leg2/c;", "Loq/i0;", "<anonymous>", "(Leg2/a$a;Leg2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<eg2.a.C1198a, eg2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50110e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r5.F(r1, r4) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r5.F(r1, r4) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f50110e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L46
            L1b:
                oq.u.b(r5)
                eg2.v r5 = eg2.v.this
                eg2.b r5 = eg2.v.D9(r5)
                boolean r5 = r5.getIsFromScan()
                if (r5 != r3) goto L37
                eg2.v r5 = eg2.v.this
                eg2.a$g$b r1 = eg2.a.g.b.f50003a
                r4.f50110e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L46
                goto L45
            L37:
                if (r5 != 0) goto L49
                eg2.v r5 = eg2.v.this
                eg2.a$g$a r1 = eg2.a.g.C1199a.f50002a
                r4.f50110e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            L49:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: eg2.v.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.C1198a c1198a, eg2.c cVar, tq.e<? super oq.i0> eVar) {
            return v.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Leg2/c$a;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<eg2.c.FetchingStatus>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50113f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Leg2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends eg2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f50115e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f50116f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<eg2.c.FetchingStatus> f50117g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<eg2.c.FetchingStatus> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f50116f = vVar;
                this.f50117g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final eg2.c.FetchingStatusError X(v vVar, dx.b bVar, k10.c0 c0Var, eg2.c.FetchingStatus fetchingStatus) {
                return new eg2.c.FetchingStatusError(vVar.I9(bVar), ((eg2.c.FetchingStatus) c0Var.a()).getVerificationCode(), null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final eg2.c.InterfaceC1200c.Content Y(tq0.n nVar, v vVar, eg2.c.FetchingStatus fetchingStatus) {
                return new eg2.c.InterfaceC1200c.Content(nVar, vVar.setupData.getIsFromScan());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f50115e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vq0.i iVar = this.f50116f.beVerifyDocumentStatusUC;
                    vq0.i.Params params = new vq0.i.Params(this.f50117g.a().getVerificationCode());
                    this.f50115e = 1;
                    obj = iVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar2 = (dx.i) obj;
                final k10.c0<eg2.c.FetchingStatus> c0Var = this.f50117g;
                final v vVar = this.f50116f;
                if (iVar2 instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                    return c0Var.d(new er.l() { // from class: eg2.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.d.a.X(vVar, bVar, c0Var, (c.FetchingStatus) obj2);
                        }
                    });
                }
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final tq0.n nVar = (tq0.n) ((dx.i.Right) iVar2).b();
                return c0Var.d(new er.l() { // from class: eg2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.d.a.Y(nVar, vVar, (c.FetchingStatus) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f50116f, this.f50117g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends eg2.c>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f50113f;
            Object objE = uq.b.e();
            int i15 = this.f50112e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUC;
            a aVar2 = new a(v.this, c0Var, null);
            this.f50113f = vq.j.a(c0Var);
            this.f50112e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<eg2.c.FetchingStatus> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = v.this.new d(eVar);
            dVar.f50113f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$e;", "<unused var>", "Lk10/c0;", "Leg2/c$b;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<eg2.a.e, k10.c0<eg2.c.FetchingStatusError>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50119f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.FetchingStatus O(k10.c0 c0Var, eg2.c.FetchingStatusError fetchingStatusError) {
            return new eg2.c.FetchingStatus(((eg2.c.FetchingStatusError) c0Var.a()).getVerificationCode(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f50119f;
            uq.b.e();
            if (this.f50118e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: eg2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.e.O(c0Var, (c.FetchingStatusError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.e eVar, k10.c0<eg2.c.FetchingStatusError> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f50119f = c0Var;
            return eVar3.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leg2/a$d;", "<unused var>", "Leg2/c$b;", "Loq/i0;", "<anonymous>", "(Leg2/a$d;Leg2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<eg2.a.d, eg2.c.FetchingStatusError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50120e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f50120e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(eg2.a.C1198a.f49996a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.d dVar, eg2.c.FetchingStatusError fetchingStatusError, tq.e<? super oq.i0> eVar) {
            return v.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leg2/c$c$c;", "state", "Loq/i0;", "<anonymous>", "(Leg2/c$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<eg2.c.InterfaceC1200c.InterfaceC1202c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f50122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f50123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f50124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f50125h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f50126j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f50127k;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00da  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        
            if (r8 == r1) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: eg2.v.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(eg2.c.InterfaceC1200c.InterfaceC1202c interfaceC1202c, tq.e<? super oq.i0> eVar) {
            return ((g) v(interfaceC1202c, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f50127k = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$j;", "action", "Lk10/c0;", "Leg2/c$c$c;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<eg2.a.ShowDialog, k10.c0<eg2.c.InterfaceC1200c.InterfaceC1202c>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f50131g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog O(k10.c0 c0Var, v vVar, eg2.a.ShowDialog showDialog, eg2.c.InterfaceC1200c.InterfaceC1202c interfaceC1202c) {
            return new eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog(((eg2.c.InterfaceC1200c.InterfaceC1202c) c0Var.a()).getVerifyDocumentResponse(), ((eg2.c.InterfaceC1200c.InterfaceC1202c) c0Var.a()).getIsFromScan(), vVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final eg2.a.ShowDialog showDialog = (eg2.a.ShowDialog) this.f50130f;
            final k10.c0 c0Var = (k10.c0) this.f50131g;
            uq.b.e();
            if (this.f50129e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: eg2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.h.O(c0Var, vVar, showDialog, (c.InterfaceC1200c.InterfaceC1202c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.ShowDialog showDialog, k10.c0<eg2.c.InterfaceC1200c.InterfaceC1202c> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            h hVar = v.this.new h(eVar);
            hVar.f50130f = showDialog;
            hVar.f50131g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leg2/a$f;", "<unused var>", "Leg2/c$c$c$b;", "Loq/i0;", "<anonymous>", "(Leg2/a$f;Leg2/c$c$c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<eg2.a.f, eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50133e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f50133e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = v.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            v vVar = v.this;
            if (iVarA instanceof dx.i.Left) {
                vVar.d9(new eg2.a.ShowSnackBar(vVar.labelProvider.c(xf2.a.R1)));
            }
            v.this.d9(eg2.a.h.f50004a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.f fVar, eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog permissionDialog, tq.e<? super oq.i0> eVar) {
            return v.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leg2/c$c$b;", "state", "Loq/i0;", "<anonymous>", "(Leg2/c$c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<eg2.c.InterfaceC1200c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f50135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f50136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f50137g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f50139e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f50140f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f50141g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f50142h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f50143j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ v f50144k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ String f50145l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, String str, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f50144k = vVar;
                this.f50145l = str;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0081  */
            /* JADX WARN: Code duplicated, block: B:27:0x009e  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
            
                if (r7 == r0) goto L20;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f50143j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r6.f50140f
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r0 = r6.f50139e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r7)
                    goto L79
                L1a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L22:
                    oq.u.b(r7)
                    goto L40
                L26:
                    oq.u.b(r7)
                    eg2.v r7 = r6.f50144k
                    bg2.a r7 = eg2.v.w9(r7)
                    bg2.a$a r1 = new bg2.a$a
                    java.lang.String r4 = r6.f50145l
                    r5 = 0
                    r1.<init>(r4, r5)
                    r6.f50143j = r3
                    java.lang.Object r7 = r7.d(r1, r6)
                    if (r7 != r0) goto L40
                    goto L78
                L40:
                    dx.i r7 = (dx.i) r7
                    eg2.v r1 = r6.f50144k
                    boolean r3 = r7 instanceof dx.i.Left
                    if (r3 == 0) goto L49
                    goto L7b
                L49:
                    boolean r3 = r7 instanceof dx.i.Right
                    if (r3 == 0) goto Lae
                    r3 = r7
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    java.lang.String r3 = (java.lang.String) r3
                    ac4.n r1 = eg2.v.C9(r1)
                    ac4.n$a r4 = new ac4.n$a
                    r4.<init>(r3)
                    java.lang.Object r7 = vq.j.a(r7)
                    r6.f50139e = r7
                    java.lang.Object r7 = vq.j.a(r3)
                    r6.f50140f = r7
                    r7 = 0
                    r6.f50141g = r7
                    r6.f50142h = r7
                    r6.f50143j = r2
                    java.lang.Object r7 = r1.c(r4, r6)
                    if (r7 != r0) goto L79
                L78:
                    return r0
                L79:
                    dx.i r7 = (dx.i) r7
                L7b:
                    eg2.v r0 = r6.f50144k
                    boolean r1 = r7 instanceof dx.i.Left
                    if (r1 == 0) goto L98
                    r1 = r7
                    dx.i$b r1 = (dx.i.Left) r1
                    java.lang.Object r1 = r1.b()
                    dx.b r1 = (dx.b) r1
                    eg2.a$b r2 = eg2.a.b.f49997a
                    er.a r2 = eg2.v.q9(r0, r2)
                    eg2.a$i r3 = new eg2.a$i
                    r3.<init>(r2, r1)
                    eg2.v.r9(r0, r3)
                L98:
                    eg2.v r0 = r6.f50144k
                    boolean r1 = r7 instanceof dx.i.Right
                    if (r1 == 0) goto Lab
                    dx.i$c r7 = (dx.i.Right) r7
                    java.lang.Object r7 = r7.b()
                    oq.i0 r7 = (oq.i0) r7
                    eg2.a$h r7 = eg2.a.h.f50004a
                    eg2.v.r9(r0, r7)
                Lab:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                Lae:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: eg2.v.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f50144k, this.f50145l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
        
            if (ac4.a.a(r4, null, r6, r10, 1, null) == r1) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f50137g
                eg2.c$c$b r0 = (eg2.c.InterfaceC1200c.b) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f50136f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r10.f50135e
                java.lang.String r0 = (java.lang.String) r0
                oq.u.b(r11)
                goto La3
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                java.lang.Object r2 = r10.f50135e
                java.lang.String r2 = (java.lang.String) r2
                oq.u.b(r11)
                goto L6c
            L2b:
                oq.u.b(r11)
                tq0.n r11 = r0.getVerifyDocumentResponse()
                java.lang.String r2 = r11.getDocumentCopyId()
                if (r2 != 0) goto L59
                eg2.v r11 = eg2.v.this
                dx.b$e r0 = new dx.b$e
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Document copy id is null"
                r1.<init>(r2)
                r0.<init>(r1)
                eg2.v r1 = eg2.v.this
                eg2.a$b r2 = eg2.a.b.f49997a
                er.a r1 = eg2.v.q9(r1, r2)
                eg2.a$i r2 = new eg2.a$i
                r2.<init>(r1, r0)
                eg2.v.r9(r11, r2)
                oq.i0 r11 = oq.i0.f148189a
                return r11
            L59:
                eg2.v r11 = eg2.v.this
                java.lang.Object r5 = vq.j.a(r0)
                r10.f50137g = r5
                r10.f50135e = r2
                r10.f50136f = r4
                java.lang.Object r11 = eg2.v.s9(r11, r10)
                if (r11 != r1) goto L6c
                goto La2
            L6c:
                cb4.d r11 = (cb4.DialogData) r11
                if (r11 == 0) goto L7d
                eg2.v r0 = eg2.v.this
                eg2.a$j r1 = new eg2.a$j
                r1.<init>(r11)
                eg2.v.r9(r0, r1)
                oq.i0 r11 = oq.i0.f148189a
                return r11
            L7d:
                eg2.v r11 = eg2.v.this
                ac4.a r4 = eg2.v.u9(r11)
                eg2.v$j$a r6 = new eg2.v$j$a
                eg2.v r11 = eg2.v.this
                r5 = 0
                r6.<init>(r11, r2, r5)
                java.lang.Object r11 = vq.j.a(r0)
                r10.f50137g = r11
                java.lang.Object r11 = vq.j.a(r2)
                r10.f50135e = r11
                r10.f50136f = r3
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r1) goto La3
            La2:
                return r1
            La3:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: eg2.v.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(eg2.c.InterfaceC1200c.b bVar, tq.e<? super oq.i0> eVar) {
            return ((j) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f50137g = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$j;", "action", "Lk10/c0;", "Leg2/c$c$b;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<eg2.a.ShowDialog, k10.c0<eg2.c.InterfaceC1200c.b>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f50148g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.InterfaceC1200c.b.PermissionDialog O(k10.c0 c0Var, v vVar, eg2.a.ShowDialog showDialog, eg2.c.InterfaceC1200c.b bVar) {
            return new eg2.c.InterfaceC1200c.b.PermissionDialog(((eg2.c.InterfaceC1200c.b) c0Var.a()).getVerifyDocumentResponse(), ((eg2.c.InterfaceC1200c.b) c0Var.a()).getIsFromScan(), vVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final eg2.a.ShowDialog showDialog = (eg2.a.ShowDialog) this.f50147f;
            final k10.c0 c0Var = (k10.c0) this.f50148g;
            uq.b.e();
            if (this.f50146e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: eg2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.k.O(c0Var, vVar, showDialog, (c.InterfaceC1200c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.ShowDialog showDialog, k10.c0<eg2.c.InterfaceC1200c.b> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f50147f = showDialog;
            kVar.f50148g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leg2/a$f;", "<unused var>", "Leg2/c$c$b$b;", "Loq/i0;", "<anonymous>", "(Leg2/a$f;Leg2/c$c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<eg2.a.f, eg2.c.InterfaceC1200c.b.PermissionDialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50150e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f50150e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = v.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            v vVar = v.this;
            if (iVarA instanceof dx.i.Left) {
                vVar.d9(new eg2.a.ShowSnackBar(vVar.labelProvider.c(xf2.a.R1)));
            }
            v.this.d9(eg2.a.h.f50004a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.f fVar, eg2.c.InterfaceC1200c.b.PermissionDialog permissionDialog, tq.e<? super oq.i0> eVar) {
            return v.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leg2/a$k;", "action", "Leg2/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leg2/a$k;Leg2/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<eg2.a.ShowSnackBar, eg2.c.InterfaceC1200c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50153f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eg2.a.ShowSnackBar showSnackBar = (eg2.a.ShowSnackBar) this.f50153f;
            uq.b.e();
            if (this.f50152e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.ShowSnackBar showSnackBar, eg2.c.InterfaceC1200c interfaceC1200c, tq.e<? super oq.i0> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f50153f = showSnackBar;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$c;", "<unused var>", "Lk10/c0;", "Leg2/c$c;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<eg2.a.c, k10.c0<eg2.c.InterfaceC1200c>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50156f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.InterfaceC1200c.InterfaceC1202c.Content O(k10.c0 c0Var, eg2.c.InterfaceC1200c interfaceC1200c) {
            return new eg2.c.InterfaceC1200c.InterfaceC1202c.Content(((eg2.c.InterfaceC1200c) c0Var.a()).getVerifyDocumentResponse(), ((eg2.c.InterfaceC1200c) c0Var.a()).getIsFromScan());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f50156f;
            uq.b.e();
            if (this.f50155e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: eg2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.n.O(c0Var, (c.InterfaceC1200c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.c cVar, k10.c0<eg2.c.InterfaceC1200c> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f50156f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$b;", "<unused var>", "Lk10/c0;", "Leg2/c$c;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<eg2.a.b, k10.c0<eg2.c.InterfaceC1200c>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50158f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.InterfaceC1200c.b.Content O(k10.c0 c0Var, eg2.c.InterfaceC1200c interfaceC1200c) {
            return new eg2.c.InterfaceC1200c.b.Content(((eg2.c.InterfaceC1200c) c0Var.a()).getVerifyDocumentResponse(), ((eg2.c.InterfaceC1200c) c0Var.a()).getIsFromScan());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f50158f;
            uq.b.e();
            if (this.f50157e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: eg2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.o.O(c0Var, (c.InterfaceC1200c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.b bVar, k10.c0<eg2.c.InterfaceC1200c> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f50158f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$h;", "<unused var>", "Lk10/c0;", "Leg2/c$c;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<eg2.a.h, k10.c0<eg2.c.InterfaceC1200c>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50160f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.InterfaceC1200c.Content O(k10.c0 c0Var, eg2.c.InterfaceC1200c interfaceC1200c) {
            return new eg2.c.InterfaceC1200c.Content(((eg2.c.InterfaceC1200c) c0Var.a()).getVerifyDocumentResponse(), ((eg2.c.InterfaceC1200c) c0Var.a()).getIsFromScan());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f50160f;
            uq.b.e();
            if (this.f50159e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: eg2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.p.O(c0Var, (c.InterfaceC1200c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.h hVar, k10.c0<eg2.c.InterfaceC1200c> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f50160f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leg2/a$i;", "action", "Lk10/c0;", "Leg2/c$c;", "state", "Lk10/l;", "Leg2/c;", "<anonymous>", "(Leg2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<eg2.a.SetDownloadError, k10.c0<eg2.c.InterfaceC1200c>, tq.e<? super k10.l<? extends eg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f50163g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg2.c.InterfaceC1200c.Error V(k10.c0 c0Var, final v vVar, final eg2.a.SetDownloadError setDownloadError, eg2.c.InterfaceC1200c interfaceC1200c) {
            return new eg2.c.InterfaceC1200c.Error(((eg2.c.InterfaceC1200c) c0Var.a()).getVerifyDocumentResponse(), ((eg2.c.InterfaceC1200c) c0Var.a()).getIsFromScan(), vVar.errorVMSFactory.a(setDownloadError.getError() instanceof dx.b.g.Http ? new jb4.b.Failure(vVar.labelProvider.c(xf2.a.f218365h0), vVar.labelProvider.c(xf2.a.f218362g0), null, new ErrorActionData(vVar.labelProvider.c(xf2.a.f218361g), vVar.b9(eg2.a.h.f50004a)), null, null, null, 116, null) : vVar.genericDomainErrorMapper.b(new ib4.c.Params(setDownloadError.getError(), false, new er.l() { // from class: eg2.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return v.q.X(setDownloadError, vVar, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(eg2.a.SetDownloadError setDownloadError, v vVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                setDownloadError.b().a();
            } else {
                vVar.d9(eg2.a.h.f50004a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final eg2.a.SetDownloadError setDownloadError = (eg2.a.SetDownloadError) this.f50162f;
            final k10.c0 c0Var = (k10.c0) this.f50163g;
            uq.b.e();
            if (this.f50161e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: eg2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.q.V(c0Var, vVar, setDownloadError, (c.InterfaceC1200c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(eg2.a.SetDownloadError setDownloadError, k10.c0<eg2.c.InterfaceC1200c> c0Var, tq.e<? super k10.l<? extends eg2.c>> eVar) {
            q qVar = v.this.new q(eVar);
            qVar.f50162f = setDownloadError;
            qVar.f50163g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public v(yy.a aVar, fg2.e eVar, vq0.i iVar, ac4.a aVar2, hb4.d dVar, ib4.c cVar, ac4.n nVar, bg2.c cVar2, bg2.a aVar3, mx.c cVar3, a14.y yVar, ag2.c cVar4, a14.m mVar, cb4.j jVar, i70.e eVar2, SetupData setupData) {
        this.mapper = eVar;
        this.beVerifyDocumentStatusUC = iVar;
        this.callActionWithLoaderUC = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.openUriIntentUseCase = nVar;
        this.downloadReportUC = cVar2;
        this.downloadCopyDocumentUC = aVar3;
        this.labelProvider = cVar3;
        this.requestPermissionUseCase = yVar;
        this.storagePermissionNotGrantedDialogMapper = cVar4;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.globalSnackBarManager = eVar2;
        this.setupData = setupData;
        eg2.c.FetchingStatus fetchingStatus = new eg2.c.FetchingStatus(setupData.getDocumentVerificationCode(), null);
        this.initialState = fetchingStatus;
        this.stateMachine = aVar.a(fetchingStatus, new er.l() { // from class: eg2.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.M9(this.f50075a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), K9(fetchingStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H9(tq.e<? super DialogData> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f50097f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f50097f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f50095d;
        Object objE = uq.b.e();
        int i16 = aVar.f50097f;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.y yVar = this.requestPermissionUseCase;
            a14.y.Params params = new a14.y.Params(gy.d.EXTERNAL_STORAGE);
            aVar.f50097f = 1;
            objC = yVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        u04.c cVar = (u04.c) objC;
        if (cVar instanceof u04.c.b) {
            return this.storagePermissionNotGrantedDialogMapper.b(new ag2.c.Params(b9(eg2.a.h.f50004a), b9(eg2.a.f.f50001a)));
        }
        if (cVar instanceof u04.c.a) {
            return null;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c I9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: eg2.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.J9(this.f50074a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(v vVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            vVar.d9(eg2.a.e.f50000a);
        } else {
            vVar.d9(eg2.a.d.f49999a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eg2.d.a K9(eg2.c cVar) {
        return this.mapper.b(new fg2.e.Params(cVar, b9(eg2.a.C1198a.f49996a), b9(eg2.a.b.f49997a), b9(eg2.a.c.f49998a), b9(eg2.a.h.f50004a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(eg2.c.class), new er.l() { // from class: eg2.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.N9(this.f50066a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.FetchingStatus.class), new er.l() { // from class: eg2.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.O9(this.f50067a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.FetchingStatusError.class), new er.l() { // from class: eg2.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.P9(this.f50068a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.InterfaceC1200c.InterfaceC1202c.class), new er.l() { // from class: eg2.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.Q9(this.f50069a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog.class), new er.l() { // from class: eg2.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.R9(this.f50070a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.InterfaceC1200c.b.class), new er.l() { // from class: eg2.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.S9(this.f50071a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.InterfaceC1200c.b.PermissionDialog.class), new er.l() { // from class: eg2.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.T9(this.f50072a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(eg2.c.InterfaceC1200c.class), new er.l() { // from class: eg2.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.U9(this.f50073a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(v vVar, k10.z zVar) {
        c cVar = vVar.new c(null);
        zVar.x(q0.c(eg2.a.C1198a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(v vVar, k10.z zVar) {
        zVar.A(vVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(v vVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(eg2.a.e.class), oVar, eVar);
        zVar.x(q0.c(eg2.a.d.class), oVar, vVar.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(v vVar, k10.z zVar) {
        zVar.C(vVar.new g(null));
        h hVar = vVar.new h(null);
        zVar.v(q0.c(eg2.a.ShowDialog.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(v vVar, k10.z zVar) {
        i iVar = vVar.new i(null);
        zVar.x(q0.c(eg2.a.f.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(v vVar, k10.z zVar) {
        zVar.C(vVar.new j(null));
        k kVar = vVar.new k(null);
        zVar.v(q0.c(eg2.a.ShowDialog.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(v vVar, k10.z zVar) {
        l lVar = vVar.new l(null);
        zVar.x(q0.c(eg2.a.f.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(v vVar, k10.z zVar) {
        m mVar = vVar.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(eg2.a.ShowSnackBar.class), oVar, mVar);
        zVar.v(q0.c(eg2.a.c.class), oVar, new n(null));
        zVar.v(q0.c(eg2.a.b.class), oVar, new o(null));
        zVar.v(q0.c(eg2.a.h.class), oVar, new p(null));
        zVar.v(q0.c(eg2.a.SetDownloadError.class), oVar, vVar.new q(null));
        return oq.i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(eg2.a.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<eg2.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<eg2.c, eg2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<eg2.d.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
