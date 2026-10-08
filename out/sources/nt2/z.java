package nt2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import mt2.PeselRestrictionMoreInfoNavParams;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ts0.Restriction;
import tt2.PeselUnrestrictNavParam;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u008b\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J+\u00101\u001a\b\u0012\u0004\u0012\u00020-002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u00020$H\u0016¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u0002042\u0006\u00108\u001a\u000207H\u0096\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u000204H\u0096\u0001¢\u0006\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030_8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR \u0010k\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020r0q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010s¨\u0006u"}, d2 = {"Lnt2/z;", "Ll00/g;", "Lnt2/c;", "Lnt2/a;", "Lnt2/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lot2/c;", "mapper", "Lws2/f;", "getPeselRestrictionUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lws2/d;", "enablePeselRestrictionUseCase", "Lws2/a;", "cancelPlannedRestrictionUseCase", "Lmx/c;", "labelProvider", "snackBarManagerStateHolder", "Lib4/c;", "genericDomainErrorHandler", "Lcb4/j;", "dialogVMSFactory", "Lh64/r;", "loadServicesUseCase", "Lh64/j;", "getServiceTemporaryInterruptionUseCase", "Lot2/d;", "peselRestrictionTemporaryInterruptionDialogMapper", "Lot2/a;", "peselRestrictionNotAvailableDialogMapper", "Lh64/q;", "loadRemoteSettingsUseCase", "Lnt2/b;", "setupData", "<init>", "(Lyy/a;Lot2/c;Lws2/f;Lac4/a;Lws2/d;Lws2/a;Lmx/c;Li70/n;Lib4/c;Lcb4/j;Lh64/r;Lh64/j;Lot2/d;Lot2/a;Lh64/q;Lnt2/b;)V", "state", "Lnt2/d$a;", "F9", "(Lnt2/c;)Lnt2/d$a;", "Lk10/c0;", "Lnt2/c$b;", "", "isRefreshing", "Lk10/l;", "G9", "(Lk10/c0;Z)Lk10/l;", "data", "Loq/i0;", "J9", "(Lnt2/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lot2/c;", "c", "Lws2/f;", "d", "Lac4/a;", "e", "Lws2/d;", "f", "Lws2/a;", "g", "Lmx/c;", "h", "Li70/n;", "j", "Lib4/c;", "k", "Lcb4/j;", "l", "Lh64/r;", "m", "Lh64/j;", "n", "Lot2/d;", "p", "Lot2/a;", "q", "Lh64/q;", "r", "Lnt2/b;", "Lnt2/c$a;", "s", "Lnt2/c$a;", "initialState", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lnt2/a$j;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<nt2.c, nt2.a> implements nt2.d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ot2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ws2.f getPeselRestrictionUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ws2.d enablePeselRestrictionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ws2.a cancelPlannedRestrictionUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final h64.j getServiceTemporaryInterruptionUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ot2.d peselRestrictionTemporaryInterruptionDialogMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ot2.a peselRestrictionNotAvailableDialogMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final h64.q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private PeselRestrictionStatusSetupData setupData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final nt2.c.Initial initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<nt2.c, nt2.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nt2.a.j> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<nt2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<nt2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f138505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f138506b;

        /* JADX INFO: renamed from: nt2.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3423a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f138507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f138508b;

            /* JADX INFO: renamed from: nt2.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3424a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f138509d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f138510e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f138511f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f138513h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f138514j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f138515k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f138516l;

                public C3424a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f138509d = obj;
                    this.f138510e |= PKIFailureInfo.systemUnavail;
                    return C3423a.this.F(null, this);
                }
            }

            public C3423a(mu.h hVar, z zVar) {
                this.f138507a = hVar;
                this.f138508b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3424a c3424a;
                if (eVar instanceof C3424a) {
                    c3424a = (C3424a) eVar;
                    int i15 = c3424a.f138510e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3424a.f138510e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3424a = new C3424a(eVar);
                    }
                } else {
                    c3424a = new C3424a(eVar);
                }
                Object obj2 = c3424a.f138509d;
                Object objE = uq.b.e();
                int i16 = c3424a.f138510e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f138507a;
                    nt2.d.a aVarF9 = this.f138508b.F9((nt2.c) obj);
                    c3424a.f138511f = vq.j.a(obj);
                    c3424a.f138513h = vq.j.a(c3424a);
                    c3424a.f138514j = vq.j.a(obj);
                    c3424a.f138515k = vq.j.a(hVar);
                    c3424a.f138516l = 0;
                    c3424a.f138510e = 1;
                    if (hVar.F(aVarF9, c3424a) == objE) {
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

        public a(mu.g gVar, z zVar) {
            this.f138505a = gVar;
            this.f138506b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nt2.d.a> hVar, tq.e eVar) {
            Object objA = this.f138505a.a(new C3423a(hVar, this.f138506b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$d;", "<unused var>", "Lnt2/c;", "Loq/i0;", "<anonymous>", "(Lnt2/a$d;Lnt2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<nt2.a.d, nt2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138517e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138517e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                nt2.a.j.C3419a c3419a = nt2.a.j.C3419a.f138408a;
                this.f138517e = 1;
                if (bVarY1.F(c3419a, this) == objE) {
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
        public final Object w(nt2.a.d dVar, nt2.c cVar, tq.e<? super oq.i0> eVar) {
            return z.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt2/a$f;", "action", "Lnt2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnt2/a$f;Lnt2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nt2.a.Error, nt2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138520f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(z zVar, nt2.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    zVar.d9(nt2.a.d.f138401a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    zVar.d9(error.getRetryAction());
                }
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nt2.a.Error error = (nt2.a.Error) this.f138520f;
            Object objE = uq.b.e();
            int i15 = this.f138519e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                ib4.c cVar = z.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final z zVar = z.this;
                nt2.a.j.Error error2 = new nt2.a.j.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: nt2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.c.O(zVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f138520f = vq.j.a(error);
                this.f138519e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.Error error, nt2.c cVar, tq.e<? super oq.i0> eVar) {
            c cVar2 = z.this.new c(eVar);
            cVar2.f138520f = error;
            return cVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$i;", "<unused var>", "Lnt2/c;", "Loq/i0;", "<anonymous>", "(Lnt2/a$i;Lnt2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<nt2.a.i, nt2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138522e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f138522e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.B0();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.i iVar, nt2.c cVar, tq.e<? super oq.i0> eVar) {
            return z.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt2/a$o;", "action", "Lnt2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnt2/a$o;Lnt2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<nt2.a.ShowSnackBar, nt2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138525f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt2.a.ShowSnackBar showSnackBar = (nt2.a.ShowSnackBar) this.f138525f;
            uq.b.e();
            if (this.f138524e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.y(new p50.a.DefaultWithIcon(showSnackBar.getSnackBarMessage(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.ShowSnackBar showSnackBar, nt2.c cVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f138525f = showSnackBar;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt2/a$l;", "action", "Lnt2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnt2/a$l;Lnt2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nt2.a.Setup, nt2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138528f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt2.a.Setup setup = (nt2.a.Setup) this.f138528f;
            uq.b.e();
            if (this.f138527e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (setup.getPeselUnrestrictNavParam().getShouldRefresh()) {
                z.this.d9(nt2.a.g.f138405a);
            }
            if (setup.getPeselUnrestrictNavParam().getShouldShowUnrestrictedSnackbar()) {
                z.this.d9(new nt2.a.ShowSnackBar(z.this.labelProvider.c(rs2.a.f175935y0)));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.Setup setup, nt2.c cVar, tq.e<? super oq.i0> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.f138528f = setup;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnt2/c$a;", "it", "Loq/i0;", "<anonymous>", "(Lnt2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<nt2.c.Initial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138530e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f138532e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f138533f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f138534g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ z f138535h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f138535h = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x009f  */
            /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:45:0x00c9 A[EDGE_INSN: B:45:0x00c9->B:46:0x00ca BREAK  A[LOOP:1: B:40:0x00b4->B:60:?]] */
            /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:58:0x00c9 A[SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
            
                if (r8 == r0) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
            
                if (r8 == r0) goto L50;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: nt2.z.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f138535h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138530e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = z.this.callActionWithLoaderUseCase;
                a aVar2 = new a(z.this, null);
                this.f138530e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(nt2.c.Initial initial, tq.e<? super oq.i0> eVar) {
            return ((g) v(initial, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$g;", "action", "Lk10/c0;", "Lnt2/c$a;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<nt2.a.g, k10.c0<nt2.c.Initial>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f138538g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnt2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nt2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f138540e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f138541f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<nt2.c.Initial> f138542g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ nt2.a.g f138543h;

            /* JADX INFO: renamed from: nt2.z$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C3425a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f138544a;

                static {
                    int[] iArr = new int[ts0.l.values().length];
                    try {
                        iArr[ts0.l.RESTRICTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ts0.l.UNRESTRICTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ts0.l.UNKNOWN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f138544a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<nt2.c.Initial> c0Var, nt2.a.g gVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f138541f = zVar;
                this.f138542g = c0Var;
                this.f138543h = gVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nt2.c.C3421c Y(nt2.c.Initial initial) {
                return nt2.c.C3421c.f138430a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nt2.c.b.Restricted Z(Restriction restriction, nt2.c.Initial initial) {
                return new nt2.c.b.Restricted(restriction, false, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nt2.c.b.Unrestricted a0(Restriction restriction, nt2.c.Initial initial) {
                return new nt2.c.b.Unrestricted(restriction, false, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f138540e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ws2.f fVar = this.f138541f.getPeselRestrictionUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f138540e = 1;
                    obj = fVar.a(c1792a, this);
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
                k10.c0<nt2.c.Initial> c0Var = this.f138542g;
                z zVar = this.f138541f;
                nt2.a.g gVar = this.f138543h;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    if (bVar instanceof dx.b.g.c) {
                        return c0Var.d(new er.l() { // from class: nt2.b0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.h.a.Y((c.Initial) obj2);
                            }
                        });
                    }
                    zVar.d9(new nt2.a.Error(bVar, gVar));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Restriction restriction = (Restriction) ((dx.i.Right) iVar).b();
                int i16 = C3425a.f138544a[restriction.getStatus().ordinal()];
                if (i16 == 1) {
                    return c0Var.d(new er.l() { // from class: nt2.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.h.a.Z(restriction, (c.Initial) obj2);
                        }
                    });
                }
                if (i16 == 2) {
                    return c0Var.d(new er.l() { // from class: nt2.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.h.a.a0(restriction, (c.Initial) obj2);
                        }
                    });
                }
                if (i16 != 3) {
                    throw new oq.p();
                }
                zVar.d9(new nt2.a.Error(new dx.b.Parsing(null, 1, null), gVar));
                return c0Var.c();
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f138541f, this.f138542g, this.f138543h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends nt2.c>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt2.a.g gVar = (nt2.a.g) this.f138537f;
            k10.c0 c0Var = (k10.c0) this.f138538g;
            Object objE = uq.b.e();
            int i15 = this.f138536e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, gVar, null);
            this.f138537f = vq.j.a(gVar);
            this.f138538g = vq.j.a(c0Var);
            this.f138536e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.g gVar, k10.c0<nt2.c.Initial> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f138537f = gVar;
            hVar.f138538g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$m;", "action", "Lk10/c0;", "Lnt2/c$a;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<nt2.a.ShowDialog, k10.c0<nt2.c.Initial>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f138547g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nt2.c.Initial O(z zVar, nt2.a.ShowDialog showDialog, nt2.c.Initial initial) {
            return initial.d(zVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nt2.a.ShowDialog showDialog = (nt2.a.ShowDialog) this.f138546f;
            k10.c0 c0Var = (k10.c0) this.f138547g;
            uq.b.e();
            if (this.f138545e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.b(new er.l() { // from class: nt2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O(zVar, showDialog, (c.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.ShowDialog showDialog, k10.c0<nt2.c.Initial> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f138546f = showDialog;
            iVar.f138547g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$q;", "<unused var>", "Lnt2/c$b;", "Loq/i0;", "<anonymous>", "(Lnt2/a$q;Lnt2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<nt2.a.q, nt2.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138549e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138549e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                nt2.a.j.ToMoreInfo toMoreInfo = new nt2.a.j.ToMoreInfo(new PeselRestrictionMoreInfoNavParams(false));
                this.f138549e = 1;
                if (bVarY1.F(toMoreInfo, this) == objE) {
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
        public final Object w(nt2.a.q qVar, nt2.c.b bVar, tq.e<? super oq.i0> eVar) {
            return z.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$c;", "<unused var>", "Lnt2/c$b;", "Loq/i0;", "<anonymous>", "(Lnt2/a$c;Lnt2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<nt2.a.c, nt2.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138551e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138551e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                nt2.a.j.ToRestrictionHistory toRestrictionHistory = new nt2.a.j.ToRestrictionHistory(new mt2.b.FromRestrictionStatus(it2.a.CHECKS));
                this.f138551e = 1;
                if (bVarY1.F(toRestrictionHistory, this) == objE) {
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
        public final Object w(nt2.a.c cVar, nt2.c.b bVar, tq.e<? super oq.i0> eVar) {
            return z.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$p;", "<unused var>", "Lnt2/c$b;", "Loq/i0;", "<anonymous>", "(Lnt2/a$p;Lnt2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<nt2.a.p, nt2.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138553e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138553e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                nt2.a.j.ToRestrictionHistory toRestrictionHistory = new nt2.a.j.ToRestrictionHistory(new mt2.b.FromRestrictionStatus(it2.a.STATUS_CHANGES));
                this.f138553e = 1;
                if (bVarY1.F(toRestrictionHistory, this) == objE) {
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
        public final Object w(nt2.a.p pVar, nt2.c.b bVar, tq.e<? super oq.i0> eVar) {
            return z.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$k;", "<unused var>", "Lk10/c0;", "Lnt2/c$b;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<nt2.a.k, k10.c0<nt2.c.b>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138556f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f138556f;
            uq.b.e();
            if (this.f138555e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarG9 = z.this.G9(c0Var, true);
            z.this.d9(nt2.a.g.f138405a);
            return lVarG9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.k kVar, k10.c0<nt2.c.b> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f138556f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$g;", "action", "Lk10/c0;", "Lnt2/c$b;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<nt2.a.g, k10.c0<nt2.c.b>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f138560g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnt2/c$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends nt2.c.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f138562e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f138563f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<nt2.c.b> f138564g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ nt2.a.g f138565h;

            /* JADX INFO: renamed from: nt2.z$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C3426a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f138566a;

                static {
                    int[] iArr = new int[ts0.l.values().length];
                    try {
                        iArr[ts0.l.RESTRICTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ts0.l.UNRESTRICTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ts0.l.UNKNOWN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f138566a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<nt2.c.b> c0Var, nt2.a.g gVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f138563f = zVar;
                this.f138564g = c0Var;
                this.f138565h = gVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nt2.c.b.Restricted X(Restriction restriction, nt2.c.b bVar) {
                return new nt2.c.b.Restricted(restriction, false, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final nt2.c.b.Unrestricted Y(Restriction restriction, nt2.c.b bVar) {
                return new nt2.c.b.Unrestricted(restriction, false, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f138562e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ws2.f fVar = this.f138563f.getPeselRestrictionUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f138562e = 1;
                    obj = fVar.a(c1792a, this);
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
                z zVar = this.f138563f;
                k10.c0<nt2.c.b> c0Var = this.f138564g;
                nt2.a.g gVar = this.f138565h;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    k10.l lVarG9 = zVar.G9(c0Var, false);
                    zVar.d9(new nt2.a.Error(bVar, gVar));
                    return lVarG9;
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Restriction restriction = (Restriction) ((dx.i.Right) iVar).b();
                int i16 = C3426a.f138566a[restriction.getStatus().ordinal()];
                if (i16 == 1) {
                    return c0Var.d(new er.l() { // from class: nt2.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.n.a.X(restriction, (c.b) obj2);
                        }
                    });
                }
                if (i16 == 2) {
                    return c0Var.d(new er.l() { // from class: nt2.g0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.n.a.Y(restriction, (c.b) obj2);
                        }
                    });
                }
                if (i16 != 3) {
                    throw new oq.p();
                }
                k10.l lVarG10 = zVar.G9(c0Var, false);
                zVar.d9(new nt2.a.Error(new dx.b.Parsing(null, 1, null), gVar));
                return lVarG10;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f138563f, this.f138564g, this.f138565h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends nt2.c.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt2.a.g gVar = (nt2.a.g) this.f138559f;
            k10.c0 c0Var = (k10.c0) this.f138560g;
            Object objE = uq.b.e();
            int i15 = this.f138558e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, gVar, null);
            this.f138559f = vq.j.a(gVar);
            this.f138560g = vq.j.a(c0Var);
            this.f138558e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.g gVar, k10.c0<nt2.c.b> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            n nVar = z.this.new n(eVar);
            nVar.f138559f = gVar;
            nVar.f138560g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$b;", "<unused var>", "Lnt2/c$b$a;", "Loq/i0;", "<anonymous>", "(Lnt2/a$b;Lnt2/c$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<nt2.a.b, nt2.c.b.Restricted, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138567e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138567e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                nt2.a.j.e eVar = nt2.a.j.e.f138412a;
                this.f138567e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(nt2.a.b bVar, nt2.c.b.Restricted restricted, tq.e<? super oq.i0> eVar) {
            return z.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$h;", "<unused var>", "Lk10/c0;", "Lnt2/c$b$a;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<nt2.a.h, k10.c0<nt2.c.b.Restricted>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138570f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nt2.c.b.Restricted O(nt2.c.b.Restricted restricted) {
            return nt2.c.b.Restricted.e(restricted, null, false, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f138570f;
            uq.b.e();
            if (this.f138569e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nt2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.p.O((c.b.Restricted) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.h hVar, k10.c0<nt2.c.b.Restricted> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f138570f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$n;", "<unused var>", "Lk10/c0;", "Lnt2/c$b$b;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<nt2.a.n, k10.c0<nt2.c.b.Unrestricted>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138572f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nt2.c.b.Unrestricted O(z zVar, nt2.c.b.Unrestricted unrestricted) {
            cb4.j jVar = zVar.dialogVMSFactory;
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC = zVar.labelProvider.c(rs2.a.J);
            DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(zVar.labelProvider.c(rs2.a.f175917p0), null, zVar.b9(nt2.a.e.f138402a), 2, null);
            Label labelC2 = zVar.labelProvider.c(rs2.a.f175888b);
            nt2.a.h hVar = nt2.a.h.f138406a;
            return nt2.c.b.Unrestricted.e(unrestricted, null, false, jVar.a(new DialogData(bVar, labelC, null, dialogButtonTextData, new DialogButtonTextData(labelC2, null, zVar.b9(hVar), 2, null), null, zVar.b9(hVar), 36, null)), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f138572f;
            uq.b.e();
            if (this.f138571e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.b(new er.l() { // from class: nt2.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.q.O(zVar, (c.b.Unrestricted) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.n nVar, k10.c0<nt2.c.b.Unrestricted> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            q qVar = z.this.new q(eVar);
            qVar.f138572f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$b;", "<unused var>", "Lnt2/c$b$b;", "Loq/i0;", "<anonymous>", "(Lnt2/a$b;Lnt2/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<nt2.a.b, nt2.c.b.Unrestricted, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138574e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f138574e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(nt2.a.n.f138416a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.b bVar, nt2.c.b.Unrestricted unrestricted, tq.e<? super oq.i0> eVar) {
            return z.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt2/a$e;", "action", "Lnt2/c$b$b;", "state", "Loq/i0;", "<anonymous>", "(Lnt2/a$e;Lnt2/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<nt2.a.e, nt2.c.b.Unrestricted, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138577f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt2.a.e eVar = (nt2.a.e) this.f138577f;
            Object objE = uq.b.e();
            int i15 = this.f138576e;
            if (i15 == 0) {
                oq.u.b(obj);
                ws2.d dVar = z.this.enablePeselRestrictionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f138577f = eVar;
                this.f138576e = 1;
                obj = dVar.a(c1792a, this);
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
            z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                zVar.d9(new nt2.a.Error((dx.b) ((dx.i.Left) iVar).b(), eVar));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                zVar.d9(new nt2.a.ShowSnackBar(zVar.labelProvider.c(rs2.a.f175911m0)));
                zVar.d9(nt2.a.g.f138405a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.e eVar, nt2.c.b.Unrestricted unrestricted, tq.e<? super oq.i0> eVar2) {
            s sVar = z.this.new s(eVar2);
            sVar.f138577f = eVar;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnt2/a$a;", "action", "Lnt2/c$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnt2/a$a;Lnt2/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<nt2.a.C3418a, nt2.c.b.Unrestricted, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138580f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nt2.a.C3418a c3418a = (nt2.a.C3418a) this.f138580f;
            Object objE = uq.b.e();
            int i15 = this.f138579e;
            if (i15 == 0) {
                oq.u.b(obj);
                ws2.a aVar = z.this.cancelPlannedRestrictionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f138580f = c3418a;
                this.f138579e = 1;
                obj = aVar.a(c1792a, this);
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
            z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                new nt2.a.Error((dx.b) ((dx.i.Left) iVar).b(), c3418a);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                zVar.d9(nt2.a.g.f138405a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.C3418a c3418a, nt2.c.b.Unrestricted unrestricted, tq.e<? super oq.i0> eVar) {
            t tVar = z.this.new t(eVar);
            tVar.f138580f = c3418a;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnt2/a$h;", "<unused var>", "Lk10/c0;", "Lnt2/c$b$b;", "state", "Lk10/l;", "Lnt2/c;", "<anonymous>", "(Lnt2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<nt2.a.h, k10.c0<nt2.c.b.Unrestricted>, tq.e<? super k10.l<? extends nt2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138583f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nt2.c.b.Unrestricted O(nt2.c.b.Unrestricted unrestricted) {
            return nt2.c.b.Unrestricted.e(unrestricted, null, false, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f138583f;
            uq.b.e();
            if (this.f138582e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nt2.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.u.O((c.b.Unrestricted) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nt2.a.h hVar, k10.c0<nt2.c.b.Unrestricted> c0Var, tq.e<? super k10.l<? extends nt2.c>> eVar) {
            u uVar = new u(eVar);
            uVar.f138583f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnt2/a$q;", "<unused var>", "Lnt2/c$c;", "Loq/i0;", "<anonymous>", "(Lnt2/a$q;Lnt2/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<nt2.a.q, nt2.c.C3421c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138584e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138584e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nt2.a.j> bVarY1 = z.this.Y1();
                nt2.a.j.ToMoreInfo toMoreInfo = new nt2.a.j.ToMoreInfo(new PeselRestrictionMoreInfoNavParams(true));
                this.f138584e = 1;
                if (bVarY1.F(toMoreInfo, this) == objE) {
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
        public final Object w(nt2.a.q qVar, nt2.c.C3421c c3421c, tq.e<? super oq.i0> eVar) {
            return z.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, ot2.c cVar, ws2.f fVar, ac4.a aVar2, ws2.d dVar, ws2.a aVar3, mx.c cVar2, i70.n nVar, ib4.c cVar3, cb4.j jVar, h64.r rVar, h64.j jVar2, ot2.d dVar2, ot2.a aVar4, h64.q qVar, PeselRestrictionStatusSetupData peselRestrictionStatusSetupData) {
        this.mapper = cVar;
        this.getPeselRestrictionUseCase = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.enablePeselRestrictionUseCase = dVar;
        this.cancelPlannedRestrictionUseCase = aVar3;
        this.labelProvider = cVar2;
        this.snackBarManagerStateHolder = nVar;
        this.genericDomainErrorHandler = cVar3;
        this.dialogVMSFactory = jVar;
        this.loadServicesUseCase = rVar;
        this.getServiceTemporaryInterruptionUseCase = jVar2;
        this.peselRestrictionTemporaryInterruptionDialogMapper = dVar2;
        this.peselRestrictionNotAvailableDialogMapper = aVar4;
        this.loadRemoteSettingsUseCase = qVar;
        this.setupData = peselRestrictionStatusSetupData;
        nt2.c.Initial initial = new nt2.c.Initial(null);
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: nt2.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.K9(this.f138485a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), F9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nt2.d.a F9(nt2.c state) {
        return this.mapper.b(new ot2.c.Params(state, b9(nt2.a.d.f138401a), b9(nt2.a.C3418a.f138398a), b9(nt2.a.b.f138399a), b9(nt2.a.i.f138407a), b9(nt2.a.q.f138419a), b9(nt2.a.c.f138400a), b9(nt2.a.p.f138418a), b9(nt2.a.k.f138413a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<nt2.c.b> G9(k10.c0<nt2.c.b> state, final boolean isRefreshing) {
        final nt2.c.b bVarA = state.a();
        if (bVarA instanceof nt2.c.b.Restricted) {
            return state.b(new er.l() { // from class: nt2.w
                @Override // er.l
                public final Object b(Object obj) {
                    return z.H9(bVarA, isRefreshing, (c.b) obj);
                }
            });
        }
        if (bVarA instanceof nt2.c.b.Unrestricted) {
            return state.b(new er.l() { // from class: nt2.x
                @Override // er.l
                public final Object b(Object obj) {
                    return z.I9(bVarA, isRefreshing, (c.b) obj);
                }
            });
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nt2.c.b H9(nt2.c.b bVar, boolean z15, nt2.c.b bVar2) {
        return nt2.c.b.Restricted.e((nt2.c.b.Restricted) bVar, null, z15, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nt2.c.b I9(nt2.c.b bVar, boolean z15, nt2.c.b bVar2) {
        return nt2.c.b.Unrestricted.e((nt2.c.b.Unrestricted) bVar, null, z15, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(nt2.c.class), new er.l() { // from class: nt2.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f138475a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt2.c.Initial.class), new er.l() { // from class: nt2.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.M9(this.f138476a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt2.c.b.class), new er.l() { // from class: nt2.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.N9(this.f138477a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt2.c.b.Restricted.class), new er.l() { // from class: nt2.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.O9(this.f138478a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt2.c.b.Unrestricted.class), new er.l() { // from class: nt2.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f138479a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nt2.c.C3421c.class), new er.l() { // from class: nt2.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f138480a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(nt2.a.d.class), oVar, bVar);
        zVar2.x(q0.c(nt2.a.Error.class), oVar, zVar.new c(null));
        zVar2.x(q0.c(nt2.a.i.class), oVar, zVar.new d(null));
        zVar2.x(q0.c(nt2.a.ShowSnackBar.class), oVar, zVar.new e(null));
        zVar2.x(q0.c(nt2.a.Setup.class), oVar, zVar.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new g(null));
        h hVar = zVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(nt2.a.g.class), oVar, hVar);
        zVar2.v(q0.c(nt2.a.ShowDialog.class), oVar, zVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(z zVar, k10.z zVar2) {
        j jVar = zVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(nt2.a.q.class), oVar, jVar);
        zVar2.x(q0.c(nt2.a.c.class), oVar, zVar.new k(null));
        zVar2.x(q0.c(nt2.a.p.class), oVar, zVar.new l(null));
        zVar2.v(q0.c(nt2.a.k.class), oVar, zVar.new m(null));
        zVar2.v(q0.c(nt2.a.g.class), oVar, zVar.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(z zVar, k10.z zVar2) {
        o oVar = zVar.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(nt2.a.b.class), oVar2, oVar);
        zVar2.v(q0.c(nt2.a.h.class), oVar2, new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(z zVar, k10.z zVar2) {
        q qVar = zVar.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(nt2.a.n.class), oVar, qVar);
        zVar2.x(q0.c(nt2.a.b.class), oVar, zVar.new r(null));
        zVar2.x(q0.c(nt2.a.e.class), oVar, zVar.new s(null));
        zVar2.x(q0.c(nt2.a.C3418a.class), oVar, zVar.new t(null));
        zVar2.v(q0.c(nt2.a.h.class), oVar, new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(z zVar, k10.z zVar2) {
        v vVar = zVar.new v(null);
        zVar2.x(q0.c(nt2.a.q.class), k10.o.CANCEL_PREVIOUS, vVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public void P5(PeselRestrictionStatusSetupData data) {
        this.setupData = data;
        PeselUnrestrictNavParam data2 = data.getData();
        if (data2 != null) {
            d9(new nt2.a.Setup(data2));
        }
    }

    @Override // zx.b
    public xw.b<nt2.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<nt2.c, nt2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nt2.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
