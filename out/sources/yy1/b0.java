package yy1;

import az1.ElectoralPersonalModel;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wy1.ElectoralEventDetailsModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R,\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00107\u001a\u0004\b<\u0010=R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lyy1/b0;", "Ll00/g;", "Lyy1/b;", "Lyy1/a;", "Lyy1/c;", "", "Lyy/a;", "stateMachineFactory", "Lyy1/j;", "mapper", "Lu04/a;", "commonEndpoints", "Lib4/c;", "genericDomainErrorMapper", "Lty1/a;", "getElectoralRegisterUseCase", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "<init>", "(Lyy/a;Lyy1/j;Lu04/a;Lib4/c;Lty1/a;La14/w;Li70/e;)V", "", "url", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "x9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "state", "Lyy1/c$a;", "t9", "(Lyy1/b;)Lyy1/c$a;", "b", "Lyy1/j;", "c", "Lu04/a;", "d", "Lib4/c;", "e", "Lty1/a;", "f", "La14/w;", "g", "Li70/e;", "Lyy1/b$a;", "h", "Lyy1/b$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lxw/b;", "Lyy1/a$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<yy1.b, yy1.a> implements yy1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yy1.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ty1.a getElectoralRegisterUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yy1.b.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yy1.b, yy1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<yy1.c.a> state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yy1.a.e> navAction;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f230685e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230687g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f230685e = obj;
            this.f230687g |= PKIFailureInfo.systemUnavail;
            return b0.this.x9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<yy1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f230689b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f230691b;

            /* JADX INFO: renamed from: yy1.b0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6201a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230692d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230693e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230694f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230696h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230697j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230698k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230699l;

                public C6201a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230692d = obj;
                    this.f230693e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f230690a = hVar;
                this.f230691b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6201a c6201a;
                if (eVar instanceof C6201a) {
                    c6201a = (C6201a) eVar;
                    int i15 = c6201a.f230693e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6201a.f230693e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6201a = new C6201a(eVar);
                    }
                } else {
                    c6201a = new C6201a(eVar);
                }
                Object obj2 = c6201a.f230692d;
                Object objE = uq.b.e();
                int i16 = c6201a.f230693e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f230690a;
                    yy1.c.a aVarT9 = this.f230691b.t9((yy1.b) obj);
                    c6201a.f230694f = vq.j.a(obj);
                    c6201a.f230696h = vq.j.a(c6201a);
                    c6201a.f230697j = vq.j.a(obj);
                    c6201a.f230698k = vq.j.a(hVar);
                    c6201a.f230699l = 0;
                    c6201a.f230693e = 1;
                    if (hVar.F(aVarT9, c6201a) == objE) {
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

        public b(mu.g gVar, b0 b0Var) {
            this.f230688a = gVar;
            this.f230689b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super yy1.c.a> hVar, tq.e eVar) {
            Object objA = this.f230688a.a(new a(hVar, this.f230689b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyy1/a$b;", "action", "Lyy1/b;", "state", "Loq/i0;", "<anonymous>", "(Lyy1/a$b;Lyy1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yy1.a.b, yy1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230701f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yy1.b bVar = (yy1.b) this.f230701f;
            Object objE = uq.b.e();
            int i15 = this.f230700e;
            if (i15 == 0) {
                oq.u.b(obj);
                if ((bVar instanceof yy1.b.InterfaceC6199b.Displayed) && ((yy1.b.InterfaceC6199b.Displayed) bVar).getIsBottomSheetVisible()) {
                    b0.this.d9(new yy1.a.ChangeBottomSheetVisibility(false));
                } else {
                    xw.b<yy1.a.e> bVarY1 = b0.this.Y1();
                    yy1.a.e.C6198a c6198a = yy1.a.e.C6198a.f230660a;
                    this.f230701f = vq.j.a(bVar);
                    this.f230700e = 1;
                    if (bVarY1.F(c6198a, this) == objE) {
                        return objE;
                    }
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
        public final Object w(yy1.a.b bVar, yy1.b bVar2, tq.e<? super i0> eVar) {
            c cVar = b0.this.new c(eVar);
            cVar.f230701f = bVar2;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyy1/a$c;", "action", "Lyy1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyy1/a$c;Lyy1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yy1.a.Error, yy1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230704f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(b0 b0Var, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    b0Var.d9(yy1.a.b.f230657a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    b0Var.d9(yy1.a.d.f230659a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yy1.a.Error error = (yy1.a.Error) this.f230704f;
            Object objE = uq.b.e();
            int i15 = this.f230703e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yy1.a.e> bVarY1 = b0.this.Y1();
                ib4.c cVar = b0.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final b0 b0Var = b0.this;
                yy1.a.e.ToErrorScreen toErrorScreen = new yy1.a.e.ToErrorScreen(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: yy1.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.d.O(b0Var, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f230704f = vq.j.a(error);
                this.f230703e = 1;
                if (bVarY1.F(toErrorScreen, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yy1.a.Error error, yy1.b bVar, tq.e<? super i0> eVar) {
            d dVar = b0.this.new d(eVar);
            dVar.f230704f = error;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyy1/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lyy1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<yy1.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230706e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f230706e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(yy1.a.d.f230659a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(yy1.b.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyy1/a$d;", "<unused var>", "Lk10/c0;", "Lyy1/b$a;", "state", "Lk10/l;", "Lyy1/b;", "<anonymous>", "(Lyy1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yy1.a.d, k10.c0<yy1.b.a>, tq.e<? super k10.l<? extends yy1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230709f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yy1.b.InterfaceC6199b O(sy1.a aVar, yy1.b.a aVar2) {
            if (fr.t.c(aVar, sy1.a.b.f185669a)) {
                return yy1.b.InterfaceC6199b.C6200b.f230673a;
            }
            if (aVar instanceof sy1.a.DataWrapped) {
                return new yy1.b.InterfaceC6199b.Displayed(((sy1.a.DataWrapped) aVar).getData(), false);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230709f;
            Object objE = uq.b.e();
            int i15 = this.f230708e;
            if (i15 == 0) {
                oq.u.b(obj);
                ty1.a aVar = b0.this.getElectoralRegisterUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f230709f = c0Var;
                this.f230708e = 1;
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
            b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                b0Var.d9(new yy1.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final sy1.a aVar2 = (sy1.a) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: yy1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.f.O(aVar2, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yy1.a.d dVar, k10.c0<yy1.b.a> c0Var, tq.e<? super k10.l<? extends yy1.b>> eVar) {
            f fVar = b0.this.new f(eVar);
            fVar.f230709f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyy1/a$a;", "action", "Lk10/c0;", "Lyy1/b$b$a;", "state", "Lk10/l;", "Lyy1/b;", "<anonymous>", "(Lyy1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yy1.a.ChangeBottomSheetVisibility, k10.c0<yy1.b.InterfaceC6199b.Displayed>, tq.e<? super k10.l<? extends yy1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230713g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yy1.b.InterfaceC6199b.Displayed O(yy1.a.ChangeBottomSheetVisibility changeBottomSheetVisibility, yy1.b.InterfaceC6199b.Displayed displayed) {
            return yy1.b.InterfaceC6199b.Displayed.b(displayed, null, changeBottomSheetVisibility.getIsBottomSheetVisible(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yy1.a.ChangeBottomSheetVisibility changeBottomSheetVisibility = (yy1.a.ChangeBottomSheetVisibility) this.f230712f;
            k10.c0 c0Var = (k10.c0) this.f230713g;
            uq.b.e();
            if (this.f230711e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yy1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.g.O(changeBottomSheetVisibility, (b.InterfaceC6199b.Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yy1.a.ChangeBottomSheetVisibility changeBottomSheetVisibility, k10.c0<yy1.b.InterfaceC6199b.Displayed> c0Var, tq.e<? super k10.l<? extends yy1.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f230712f = changeBottomSheetVisibility;
            gVar.f230713g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyy1/a$j;", "action", "Lyy1/b$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyy1/a$j;Lyy1/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<yy1.a.ToElectionEventDetailsScreen, yy1.b.InterfaceC6199b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230715f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yy1.a.ToElectionEventDetailsScreen toElectionEventDetailsScreen = (yy1.a.ToElectionEventDetailsScreen) this.f230715f;
            Object objE = uq.b.e();
            int i15 = this.f230714e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yy1.a.e> bVarY1 = b0.this.Y1();
                yy1.a.e.ToElectionEventDetailsScreen toElectionEventDetailsScreen2 = new yy1.a.e.ToElectionEventDetailsScreen(toElectionEventDetailsScreen.getEventDetails());
                this.f230715f = vq.j.a(toElectionEventDetailsScreen);
                this.f230714e = 1;
                if (bVarY1.F(toElectionEventDetailsScreen2, this) == objE) {
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
        public final Object w(yy1.a.ToElectionEventDetailsScreen toElectionEventDetailsScreen, yy1.b.InterfaceC6199b.Displayed displayed, tq.e<? super i0> eVar) {
            h hVar = b0.this.new h(eVar);
            hVar.f230715f = toElectionEventDetailsScreen;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyy1/a$i;", "action", "Lyy1/b$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyy1/a$i;Lyy1/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yy1.a.ToCitizenDataDetailsScreen, yy1.b.InterfaceC6199b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230718f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yy1.a.ToCitizenDataDetailsScreen toCitizenDataDetailsScreen = (yy1.a.ToCitizenDataDetailsScreen) this.f230718f;
            Object objE = uq.b.e();
            int i15 = this.f230717e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yy1.a.e> bVarY1 = b0.this.Y1();
                yy1.a.e.ToCitizenDataDetailsScreen toCitizenDataDetailsScreen2 = new yy1.a.e.ToCitizenDataDetailsScreen(toCitizenDataDetailsScreen.getDataDetails());
                this.f230718f = vq.j.a(toCitizenDataDetailsScreen);
                this.f230717e = 1;
                if (bVarY1.F(toCitizenDataDetailsScreen2, this) == objE) {
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
        public final Object w(yy1.a.ToCitizenDataDetailsScreen toCitizenDataDetailsScreen, yy1.b.InterfaceC6199b.Displayed displayed, tq.e<? super i0> eVar) {
            i iVar = b0.this.new i(eVar);
            iVar.f230718f = toCitizenDataDetailsScreen;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyy1/a$g;", "<unused var>", "Lyy1/b$b$a;", "Loq/i0;", "<anonymous>", "(Lyy1/a$g;Lyy1/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<yy1.a.g, yy1.b.InterfaceC6199b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230720e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230720e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                String strO = b0Var.commonEndpoints.o();
                this.f230720e = 1;
                if (b0Var.x9(strO, this) == objE) {
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
        public final Object w(yy1.a.g gVar, yy1.b.InterfaceC6199b.Displayed displayed, tq.e<? super i0> eVar) {
            return b0.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyy1/a$h;", "<unused var>", "Lyy1/b$b$a;", "Loq/i0;", "<anonymous>", "(Lyy1/a$h;Lyy1/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<yy1.a.h, yy1.b.InterfaceC6199b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230722e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230722e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                String strA = b0Var.commonEndpoints.a();
                this.f230722e = 1;
                if (b0Var.x9(strA, this) == objE) {
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
        public final Object w(yy1.a.h hVar, yy1.b.InterfaceC6199b.Displayed displayed, tq.e<? super i0> eVar) {
            return b0.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyy1/a$f;", "<unused var>", "Lyy1/b$b$a;", "Loq/i0;", "<anonymous>", "(Lyy1/a$f;Lyy1/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<yy1.a.f, yy1.b.InterfaceC6199b.Displayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230724e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230724e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                String strA0 = b0Var.commonEndpoints.a0();
                this.f230724e = 1;
                if (b0Var.x9(strA0, this) == objE) {
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
        public final Object w(yy1.a.f fVar, yy1.b.InterfaceC6199b.Displayed displayed, tq.e<? super i0> eVar) {
            return b0.this.new l(eVar).J(i0.f148189a);
        }
    }

    public b0(yy.a aVar, yy1.j jVar, u04.a aVar2, ib4.c cVar, ty1.a aVar3, a14.w wVar, i70.e eVar) {
        this.mapper = jVar;
        this.commonEndpoints = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.getElectoralRegisterUseCase = aVar3;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        yy1.b.a aVar4 = yy1.b.a.f230670a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: yy1.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.z9(this.f230780a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), t9(aVar4));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(b0 b0Var, k10.z zVar) {
        c cVar = b0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yy1.a.b.class), oVar, cVar);
        zVar.x(q0.c(yy1.a.Error.class), oVar, b0Var.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new e(null));
        f fVar = b0Var.new f(null);
        zVar.v(q0.c(yy1.a.d.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(b0 b0Var, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yy1.a.ChangeBottomSheetVisibility.class), oVar, gVar);
        zVar.x(q0.c(yy1.a.ToElectionEventDetailsScreen.class), oVar, b0Var.new h(null));
        zVar.x(q0.c(yy1.a.ToCitizenDataDetailsScreen.class), oVar, b0Var.new i(null));
        zVar.x(q0.c(yy1.a.g.class), oVar, b0Var.new j(null));
        zVar.x(q0.c(yy1.a.h.class), oVar, b0Var.new k(null));
        zVar.x(q0.c(yy1.a.f.class), oVar, b0Var.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yy1.c.a t9(yy1.b state) {
        yy1.j jVar = this.mapper;
        er.a<i0> aVarB9 = b9(yy1.a.b.f230657a);
        er.a<i0> aVarB10 = b9(yy1.a.g.f230665a);
        er.a<i0> aVarB11 = b9(yy1.a.h.f230666a);
        er.a<i0> aVarB12 = b9(yy1.a.f.f230664a);
        return jVar.b(new yy1.j.Params(state, aVarB9, new er.l() { // from class: yy1.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.u9(this.f230784a, (ElectoralEventDetailsModel) obj);
            }
        }, new er.l() { // from class: yy1.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.v9(this.f230785a, (ElectoralPersonalModel) obj);
            }
        }, b9(new yy1.a.ChangeBottomSheetVisibility(true)), aVarB10, aVarB11, aVarB12, new er.l() { // from class: yy1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.w9(this.f230669a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(b0 b0Var, ElectoralEventDetailsModel electoralEventDetailsModel) {
        b0Var.d9(new yy1.a.ToElectionEventDetailsScreen(electoralEventDetailsModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(b0 b0Var, ElectoralPersonalModel electoralPersonalModel) {
        b0Var.d9(new yy1.a.ToCitizenDataDetailsScreen(electoralPersonalModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(b0 b0Var, boolean z15) {
        b0Var.d9(new yy1.a.ChangeBottomSheetVisibility(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x9(String str, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f230687g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f230687g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f230685e;
        Object objE = uq.b.e();
        int i16 = aVar.f230687g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(str, false, 2, null);
            aVar.f230684d = vq.j.a(str);
            aVar.f230687g = 1;
            objC = wVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            this.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final b0 b0Var, k10.v vVar) {
        vVar.c(q0.c(yy1.b.class), new er.l() { // from class: yy1.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.A9(this.f230781a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(yy1.b.a.class), new er.l() { // from class: yy1.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.B9(this.f230782a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(yy1.b.InterfaceC6199b.Displayed.class), new er.l() { // from class: yy1.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.C9(this.f230783a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yy1.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yy1.b, yy1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yy1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
