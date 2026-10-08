package li3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.s0;
import yd3.StatementListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Ba\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010 \u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0004\b%\u0010&J'\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\u000201*\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020804H\u0096\u0001¢\u0006\u0004\b9\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010S\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030X8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010d\u001a\b\u0012\u0004\u0012\u00020_0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR \u0010#\u001a\b\u0012\u0004\u0012\u0002010e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lli3/v;", "Ll00/g;", "Lli3/b;", "Lli3/a;", "Lli3/c;", "Lnx/b;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lmi3/c;", "mapper", "Lae3/w;", "statementPagingMonitorUC", "Lae3/v;", "statementPagingLoadUC", "Lac4/a;", "loaderUseCase", "Lib4/c;", "domainErrorMapper", "Lae3/m;", "recoverNewCollisionUC", "Lde3/d;", "isWrongStateErrorUC", "Loz/q;", "ownerViewLifecycleManager", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Lmx/c;Lmi3/c;Lae3/w;Lae3/v;Lac4/a;Lib4/c;Lae3/m;Lde3/d;Loz/q;Lhb4/d;)V", "Lli3/a$c;", "action", "Lk10/c0;", "Lli3/b$b$b;", "state", "Lk10/l;", "B9", "(Lli3/a$c;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "retryAction", "closeAction", "Lhb4/c;", "y9", "(Ldx/b;Lli3/a;Lli3/a;)Lhb4/c;", "Lcb4/d;", "w9", "()Lcb4/d;", "Lli3/c$a;", "C9", "(Lli3/b;)Lli3/c$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lmx/c;", "c", "Lmi3/c;", "d", "Lae3/w;", "e", "Lae3/v;", "f", "Lac4/a;", "g", "Lib4/c;", "h", "Lae3/m;", "j", "Lde3/d;", "k", "Loz/q;", "l", "Lhb4/d;", "Loz/j;", "m", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lli3/b$a;", "n", "Lli3/b$a;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lli3/a$a;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<li3.b, li3.a> implements li3.c, nx.b, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mi3.c mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ae3.w statementPagingMonitorUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ae3.v statementPagingLoadUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ae3.m recoverNewCollisionUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final li3.b.a initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<li3.b, li3.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<li3.a.InterfaceC2876a> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<li3.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118420a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.StatementCreated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.StatementCreatedNotReported.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.ReportedToUfg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.ReportedToUfgFormFilled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.ReportedToUfgToFillForm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s0.StatementCreatingError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f118420a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lli3/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super k10.l<? extends li3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118421e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ li3.a.OnStatementClicked f118423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k10.c0<li3.b.InterfaceC2878b.List> f118424h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(li3.a.OnStatementClicked onStatementClicked, k10.c0<li3.b.InterfaceC2878b.List> c0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f118423g = onStatementClicked;
            this.f118424h = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final li3.b.ListError V(v vVar, dx.b bVar, li3.b.InterfaceC2878b.List list) {
            return new li3.b.ListError(vVar.y9(bVar, li3.a.d.f118358a, li3.a.e.f118359a), list.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118421e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae3.m mVar = v.this.recoverNewCollisionUC;
                ae3.m.Params params = new ae3.m.Params(this.f118423g.getCollision());
                this.f118421e = 1;
                obj = mVar.e(params, this);
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
            k10.c0<li3.b.InterfaceC2878b.List> c0Var = this.f118424h;
            final v vVar = v.this;
            li3.a.OnStatementClicked onStatementClicked = this.f118423g;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: li3.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.b.V(vVar, bVar, (b.InterfaceC2878b.List) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            vVar.d9(new li3.a.InterfaceC2876a.GoToDraftStatement((yd3.f) ((dx.i.Right) iVar).b(), onStatementClicked.getCollision().getWorkingCopyValidityDaysLeft()));
            return c0Var.c();
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return v.this.new b(this.f118423g, this.f118424h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends li3.b>> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<li3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f118425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f118426b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f118427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f118428b;

            /* JADX INFO: renamed from: li3.v$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2882a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f118429d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f118430e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f118431f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f118433h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f118434j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f118435k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f118436l;

                public C2882a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f118429d = obj;
                    this.f118430e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f118427a = hVar;
                this.f118428b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2882a c2882a;
                if (eVar instanceof C2882a) {
                    c2882a = (C2882a) eVar;
                    int i15 = c2882a.f118430e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2882a.f118430e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2882a = new C2882a(eVar);
                    }
                } else {
                    c2882a = new C2882a(eVar);
                }
                Object obj2 = c2882a.f118429d;
                Object objE = uq.b.e();
                int i16 = c2882a.f118430e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f118427a;
                    li3.c.a aVarC9 = this.f118428b.C9((li3.b) obj);
                    c2882a.f118431f = vq.j.a(obj);
                    c2882a.f118433h = vq.j.a(c2882a);
                    c2882a.f118434j = vq.j.a(obj);
                    c2882a.f118435k = vq.j.a(hVar);
                    c2882a.f118436l = 0;
                    c2882a.f118430e = 1;
                    if (hVar.F(aVarC9, c2882a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar, v vVar) {
            this.f118425a = gVar;
            this.f118426b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super li3.c.a> hVar, tq.e eVar) {
            Object objA = this.f118425a.a(new a(hVar, this.f118426b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lli3/a$a;", "action", "Lli3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lli3/a$a;Lli3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<li3.a.InterfaceC2876a, li3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118438f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            li3.a.InterfaceC2876a interfaceC2876a = (li3.a.InterfaceC2876a) this.f118438f;
            Object objE = uq.b.e();
            int i15 = this.f118437e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                this.f118438f = vq.j.a(interfaceC2876a);
                this.f118437e = 1;
                if (vVar.F(interfaceC2876a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(li3.a.InterfaceC2876a interfaceC2876a, li3.b bVar, tq.e<? super i0> eVar) {
            d dVar = v.this.new d(eVar);
            dVar.f118438f = interfaceC2876a;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lli3/a$d;", "<unused var>", "Lli3/b;", "Loq/i0;", "<anonymous>", "(Lli3/a$d;Lli3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<li3.a.d, li3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118440e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118440e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae3.v vVar = v.this.statementPagingLoadUC;
                ae3.v.a aVar = ae3.v.a.REFRESH;
                this.f118440e = 1;
                if (vVar.d(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(li3.a.d dVar, li3.b bVar, tq.e<? super i0> eVar) {
            return v.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lli3/a$b;", "<unused var>", "Lli3/b;", "Loq/i0;", "<anonymous>", "(Lli3/a$b;Lli3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<li3.a.b, li3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118442e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118442e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae3.v vVar = v.this.statementPagingLoadUC;
                ae3.v.a aVar = ae3.v.a.NEXT_PAGE;
                this.f118442e = 1;
                if (vVar.d(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(li3.a.b bVar, li3.b bVar2, tq.e<? super i0> eVar) {
            return v.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lyd3/g;", "data", "Lk10/c0;", "Lli3/b;", "state", "Lk10/l;", "<anonymous>", "(Lyd3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<StatementListData, k10.c0<li3.b>, tq.e<? super k10.l<? extends li3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118446g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final li3.b.LoadingFirstPageError X(v vVar, fy.c cVar, li3.b bVar) {
            return new li3.b.LoadingFirstPageError(vVar.y9(((fy.c.Error) cVar).getError(), li3.a.d.f118358a, li3.a.InterfaceC2876a.C2877a.f118349a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final li3.b.ListError Y(v vVar, fy.c cVar, StatementListData statementListData, li3.b bVar) {
            return new li3.b.ListError(vVar.y9(((fy.c.Error) cVar).getError(), li3.a.d.f118358a, li3.a.e.f118359a), statementListData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final li3.b Z(fy.c cVar, StatementListData statementListData, li3.b bVar) {
            if (cVar instanceof fy.c.Initial) {
                return li3.b.d.f118366a;
            }
            if ((cVar instanceof fy.c.Loading) && (((fy.c.Loading) cVar).getPage().getNextPage() instanceof fy.b.a)) {
                return li3.b.d.f118366a;
            }
            return cVar.getPage().a().isEmpty() ? new li3.b.InterfaceC2878b.Empty(statementListData) : new li3.b.InterfaceC2878b.List(statementListData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final StatementListData statementListData = (StatementListData) this.f118445f;
            k10.c0 c0Var = (k10.c0) this.f118446g;
            uq.b.e();
            if (this.f118444e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final fy.c<yd3.c> cVarD = statementListData.d();
            if (!(cVarD instanceof fy.c.Error)) {
                return c0Var.d(new er.l() { // from class: li3.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.g.Z(cVarD, statementListData, (b) obj2);
                    }
                });
            }
            if (fr.t.c(((fy.c.Error) cVarD).getPage().getNextPage(), fy.b.a.f68798a)) {
                final v vVar = v.this;
                return c0Var.d(new er.l() { // from class: li3.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.g.X(vVar, cVarD, (b) obj2);
                    }
                });
            }
            final v vVar2 = v.this;
            return c0Var.d(new er.l() { // from class: li3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.g.Y(vVar2, cVarD, statementListData, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(StatementListData statementListData, k10.c0<li3.b> c0Var, tq.e<? super k10.l<? extends li3.b>> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f118445f = statementListData;
            gVar.f118446g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli3/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lli3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<li3.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118448e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f118448e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(li3.a.d.f118358a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(li3.b.a aVar, tq.e<? super i0> eVar) {
            return ((h) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lli3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lli3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<nx.a, li3.b.InterfaceC2878b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118451f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f118451f;
            uq.b.e();
            if (this.f118450e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.STARTED) {
                v.this.d9(li3.a.d.f118358a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, li3.b.InterfaceC2878b interfaceC2878b, tq.e<? super i0> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f118451f = aVar;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lli3/a$f;", "<unused var>", "Lli3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lli3/a$f;Lli3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<li3.a.f, li3.b.InterfaceC2878b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118454f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            li3.b.InterfaceC2878b interfaceC2878b = (li3.b.InterfaceC2878b) this.f118454f;
            uq.b.e();
            if (this.f118453e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (interfaceC2878b.getData().getCanCreateNewCollision()) {
                v.this.d9(new li3.a.InterfaceC2876a.ToNewStatement(interfaceC2878b.getData().getWorkingCopyValidityDays()));
            } else {
                v.this.d9(new li3.a.InterfaceC2876a.ShowNavigationDialog(v.this.w9()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(li3.a.f fVar, li3.b.InterfaceC2878b interfaceC2878b, tq.e<? super i0> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f118454f = interfaceC2878b;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lli3/a$c;", "action", "Lk10/c0;", "Lli3/b$b$b;", "state", "Lk10/l;", "Lli3/b;", "<anonymous>", "(Lli3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<li3.a.OnStatementClicked, k10.c0<li3.b.InterfaceC2878b.List>, tq.e<? super k10.l<? extends li3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118458g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            li3.a.OnStatementClicked onStatementClicked = (li3.a.OnStatementClicked) this.f118457f;
            k10.c0 c0Var = (k10.c0) this.f118458g;
            Object objE = uq.b.e();
            int i15 = this.f118456e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f118457f = vq.j.a(onStatementClicked);
            this.f118458g = vq.j.a(c0Var);
            this.f118456e = 1;
            Object objB9 = vVar.B9(onStatementClicked, c0Var, this);
            return objB9 == objE ? objE : objB9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(li3.a.OnStatementClicked onStatementClicked, k10.c0<li3.b.InterfaceC2878b.List> c0Var, tq.e<? super k10.l<? extends li3.b>> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f118457f = onStatementClicked;
            kVar.f118458g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lli3/a$e;", "<unused var>", "Lk10/c0;", "Lli3/b$c;", "state", "Lk10/l;", "Lli3/b;", "<anonymous>", "(Lli3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<li3.a.e, k10.c0<li3.b.ListError>, tq.e<? super k10.l<? extends li3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118461f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final li3.b.InterfaceC2878b.List O(li3.b.ListError listError) {
            return new li3.b.InterfaceC2878b.List(listError.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f118461f;
            uq.b.e();
            if (this.f118460e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: li3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O((b.ListError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(li3.a.e eVar, k10.c0<li3.b.ListError> c0Var, tq.e<? super k10.l<? extends li3.b>> eVar2) {
            l lVar = new l(eVar2);
            lVar.f118461f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, mx.c cVar, mi3.c cVar2, ae3.w wVar, ae3.v vVar, ac4.a aVar2, ib4.c cVar3, ae3.m mVar, de3.d dVar, oz.q qVar, hb4.d dVar2) {
        this.labelProvider = cVar;
        this.mapper = cVar2;
        this.statementPagingMonitorUC = wVar;
        this.statementPagingLoadUC = vVar;
        this.loaderUseCase = aVar2;
        this.domainErrorMapper = cVar3;
        this.recoverNewCollisionUC = mVar;
        this.isWrongStateErrorUC = dVar;
        this.ownerViewLifecycleManager = qVar;
        this.errorVMSFactory = dVar2;
        this.lifecycleConnector = qVar;
        li3.b.a aVar3 = li3.b.a.f118361a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: li3.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.F9(this.f118395a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), C9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B9(li3.a.OnStatementClicked onStatementClicked, k10.c0<li3.b.InterfaceC2878b.List> c0Var, tq.e<? super k10.l<? extends li3.b>> eVar) {
        switch (a.f118420a[onStatementClicked.getCollision().getCollisionStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                d9(new li3.a.InterfaceC2876a.GoToCreatedStatement(onStatementClicked.getCollision().getProcessId(), onStatementClicked.getCollision().getCollisionStatus()));
                return c0Var.c();
            default:
                Object objA = ac4.a.a(this.loaderUseCase, null, new b(onStatementClicked, c0Var, null), eVar, 1, null);
                return objA == uq.b.e() ? objA : (k10.l) objA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final li3.c.a C9(li3.b bVar) {
        return this.mapper.b(new mi3.c.Params(bVar, b9(li3.a.InterfaceC2876a.C2877a.f118349a), b9(li3.a.f.f118360a), new er.l() { // from class: li3.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(this.f118396a, (sv0.g) obj);
            }
        }, b9(li3.a.b.f118356a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(v vVar, sv0.g gVar) {
        vVar.d9(new li3.a.OnStatementClicked(gVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(li3.b.class), new er.l() { // from class: li3.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.G9(this.f118397a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(li3.b.a.class), new er.l() { // from class: li3.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.H9(this.f118398a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(li3.b.InterfaceC2878b.class), new er.l() { // from class: li3.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.I9(this.f118399a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(li3.b.InterfaceC2878b.List.class), new er.l() { // from class: li3.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.J9(this.f118400a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(li3.b.ListError.class), new er.l() { // from class: li3.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.K9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(v vVar, k10.z zVar) {
        d dVar = vVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(li3.a.InterfaceC2876a.class), oVar, dVar);
        zVar.x(q0.c(li3.a.d.class), oVar, vVar.new e(null));
        zVar.x(q0.c(li3.a.b.class), oVar, vVar.new f(null));
        k10.k.m(zVar, vVar.statementPagingMonitorUC.b(gz.b.a.C1792a.f78542a), null, vVar.new g(null), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(v vVar, k10.z zVar) {
        zVar.C(vVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(v vVar, k10.z zVar) {
        k10.k.s(zVar, mu.i.r(vVar.x8(), 1), null, vVar.new i(null), 2, null);
        j jVar = vVar.new j(null);
        zVar.x(q0.c(li3.a.f.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(v vVar, k10.z zVar) {
        k kVar = vVar.new k(null);
        zVar.v(q0.c(li3.a.OnStatementClicked.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(q0.c(li3.a.e.class), k10.o.CANCEL_PREVIOUS, lVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData w9() {
        mx.c cVar = this.labelProvider;
        return new DialogData(cb4.h.b.f24985a, cVar.c(md3.b.f125719f3), cVar.c(md3.b.f125711e3), new DialogButtonTextData(cVar.c(md3.b.f125731h), null, new er.a() { // from class: li3.t
            @Override // er.a
            public final Object a() {
                return v.x9();
            }
        }, 2, null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c y9(final dx.b domainError, final li3.a retryAction, final li3.a closeAction) {
        return this.errorVMSFactory.a(this.domainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: li3.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.z9(this.f118401a, domainError, retryAction, closeAction, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(v vVar, dx.b bVar, li3.a aVar, li3.a aVar2, ib4.c.b bVar2) {
        if (vVar.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            vVar.d9(li3.a.d.f118358a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            vVar.d9(aVar);
        } else {
            if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
                throw new oq.p();
            }
            vVar.d9(aVar2);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(li3.a.InterfaceC2876a interfaceC2876a, tq.e<? super i0> eVar) {
        return super.F(interfaceC2876a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<li3.a.InterfaceC2876a> Y1() {
        return this.navAction;
    }

    @Override // li3.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<li3.b, li3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<li3.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
