package up3;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oo0.EndedIdeaVoteRound;
import oo0.EndedRoundVotingResult;
import oo0.Idea;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010!\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lup3/t;", "Ll00/g;", "Lup3/b;", "Lup3/a;", "Lup3/c;", "", "Lyy/a;", "stateMachineFactory", "Lvp3/c;", "screenMapper", "Lpo0/f;", "getEndedIdeaVoteRoundVotingResultsUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Loo0/e;", "roundData", "<init>", "(Lyy/a;Lvp3/c;Lpo0/f;Lac4/a;Lib4/c;Loo0/e;)V", "Lk10/c0;", "Lup3/b$b;", "state", "Lk10/l;", "Lup3/b$c;", "t9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "u9", "(Ldx/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lup3/c$a;", "w9", "(Lup3/b;)Lup3/c$a;", "b", "Lvp3/c;", "c", "Lpo0/f;", "d", "Lac4/a;", "e", "Lib4/c;", "f", "Loo0/e;", "g", "Lup3/b$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lup3/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<up3.b, up3.a> implements up3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vp3.c screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po0.f getEndedIdeaVoteRoundVotingResultsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final EndedIdeaVoteRound roundData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final up3.b.Initial initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<up3.b, up3.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<up3.c.a> state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<up3.a.d> navAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lup3/b$c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends up3.b.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f199884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f199885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f199886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f199887h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f199888j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f199889k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c0<up3.b.Initial> f199891m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<up3.b.Initial> c0Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f199891m = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up3.b.Initialized V(EndedRoundVotingResult endedRoundVotingResult, c0 c0Var, up3.b.Initial initial) {
            return new up3.b.Initialized(endedRoundVotingResult, null, ((up3.b.Initial) c0Var.a()).getRoundData(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<up3.b.Initial> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f199889k;
            if (i15 == 0) {
                oq.u.b(obj);
                po0.f fVar = t.this.getEndedIdeaVoteRoundVotingResultsUC;
                po0.f.Params params = new po0.f.Params(this.f199891m.a().getRoundData().getId());
                this.f199889k = 1;
                obj = fVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (c0) this.f199885f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            t tVar = t.this;
            final c0<up3.b.Initial> c0Var2 = this.f199891m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final EndedRoundVotingResult endedRoundVotingResult = (EndedRoundVotingResult) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: up3.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.a.V(endedRoundVotingResult, c0Var2, (b.Initial) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            er.a aVarB9 = tVar.b9(up3.a.b.f199828a);
            er.a aVarB10 = tVar.b9(up3.a.C5194a.f199827a);
            this.f199884e = vq.j.a(iVar);
            this.f199885f = c0Var2;
            this.f199886g = vq.j.a(bVar);
            this.f199887h = 0;
            this.f199888j = 0;
            this.f199889k = 2;
            if (tVar.u9(bVar, aVarB9, aVarB10, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return t.this.new a(this.f199891m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<up3.b.Initialized>> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f199892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f199893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f199894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f199895g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f199896h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f199897j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f199898k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f199900m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f199898k = obj;
            this.f199900m |= PKIFailureInfo.systemUnavail;
            return t.this.u9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<up3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f199901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f199902b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f199903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f199904b;

            /* JADX INFO: renamed from: up3.t$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5201a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f199905d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f199906e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f199907f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f199909h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f199910j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f199911k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f199912l;

                public C5201a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f199905d = obj;
                    this.f199906e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f199903a = hVar;
                this.f199904b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5201a c5201a;
                if (eVar instanceof C5201a) {
                    c5201a = (C5201a) eVar;
                    int i15 = c5201a.f199906e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5201a.f199906e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5201a = new C5201a(eVar);
                    }
                } else {
                    c5201a = new C5201a(eVar);
                }
                Object obj2 = c5201a.f199905d;
                Object objE = uq.b.e();
                int i16 = c5201a.f199906e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f199903a;
                    up3.c.a aVarW9 = this.f199904b.w9((up3.b) obj);
                    c5201a.f199907f = vq.j.a(obj);
                    c5201a.f199909h = vq.j.a(c5201a);
                    c5201a.f199910j = vq.j.a(obj);
                    c5201a.f199911k = vq.j.a(hVar);
                    c5201a.f199912l = 0;
                    c5201a.f199906e = 1;
                    if (hVar.F(aVarW9, c5201a) == objE) {
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

        public c(mu.g gVar, t tVar) {
            this.f199901a = gVar;
            this.f199902b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super up3.c.a> hVar, tq.e eVar) {
            Object objA = this.f199901a.a(new a(hVar, this.f199902b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lup3/a$a;", "<unused var>", "Lup3/b;", "Loq/i0;", "<anonymous>", "(Lup3/a$a;Lup3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<up3.a.C5194a, up3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199913e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199913e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<up3.a.d> bVarY1 = t.this.Y1();
                up3.a.d.C5195a c5195a = up3.a.d.C5195a.f199830a;
                this.f199913e = 1;
                if (bVarY1.F(c5195a, this) == objE) {
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
        public final Object w(up3.a.C5194a c5194a, up3.b bVar, tq.e<? super i0> eVar) {
            return t.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lup3/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lup3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<up3.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199915e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f199915e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(up3.a.b.f199828a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(up3.b.Initial initial, tq.e<? super i0> eVar) {
            return ((e) v(initial, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup3/a$b;", "<unused var>", "Lk10/c0;", "Lup3/b$b;", "state", "Lk10/l;", "Lup3/b;", "<anonymous>", "(Lup3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<up3.a.b, c0<up3.b.Initial>, tq.e<? super k10.l<? extends up3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199918f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f199918f;
            Object objE = uq.b.e();
            int i15 = this.f199917e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f199918f = vq.j.a(c0Var);
            this.f199917e = 1;
            Object objT9 = tVar.t9(c0Var, this);
            return objT9 == objE ? objE : objT9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(up3.a.b bVar, c0<up3.b.Initial> c0Var, tq.e<? super k10.l<? extends up3.b>> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f199918f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lup3/a$c;", "action", "Lup3/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lup3/a$c;Lup3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<up3.a.GoToIdea, up3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f199920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f199921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f199922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f199923h;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            up3.a.GoToIdea goToIdea = (up3.a.GoToIdea) this.f199923h;
            Object objE = uq.b.e();
            int i15 = this.f199922g;
            if (i15 == 0) {
                oq.u.b(obj);
                oo0.h promotedIdea = goToIdea.getPromotedIdea();
                kp3.a.EndedRoundIdea endedRoundIdea = new kp3.a.EndedRoundIdea(new Idea(promotedIdea.getId(), promotedIdea.getDescription(), promotedIdea.getCategory(), promotedIdea.getVotes(), promotedIdea.getTopic(), null, false, false), promotedIdea.getStatus());
                xw.b<up3.a.d> bVarY1 = t.this.Y1();
                up3.a.d.GoToIdea goToIdea2 = new up3.a.d.GoToIdea(endedRoundIdea);
                this.f199923h = vq.j.a(goToIdea);
                this.f199920e = vq.j.a(endedRoundIdea);
                this.f199921f = 0;
                this.f199922g = 1;
                if (bVarY1.F(goToIdea2, this) == objE) {
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
        public final Object w(up3.a.GoToIdea goToIdea, up3.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f199923h = goToIdea;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup3/a$e;", "action", "Lk10/c0;", "Lup3/b$c;", "state", "Lk10/l;", "Lup3/b;", "<anonymous>", "(Lup3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<up3.a.SetFilterTab, c0<up3.b.Initialized>, tq.e<? super k10.l<? extends up3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199927g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f199928a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f199928a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up3.b.Initialized O(up3.a.SetFilterTab setFilterTab, up3.b.Initialized initialized) {
            up3.b.a aVar;
            int i15 = a.f199928a[setFilterTab.getType().ordinal()];
            if (i15 == 1) {
                aVar = up3.b.a.PROMOTED;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = up3.b.a.OTHER;
            }
            return up3.b.Initialized.b(initialized, null, aVar, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up3.a.SetFilterTab setFilterTab = (up3.a.SetFilterTab) this.f199926f;
            c0 c0Var = (c0) this.f199927g;
            uq.b.e();
            if (this.f199925e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O(setFilterTab, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up3.a.SetFilterTab setFilterTab, c0<up3.b.Initialized> c0Var, tq.e<? super k10.l<? extends up3.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f199926f = setFilterTab;
            hVar.f199927g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, vp3.c cVar, po0.f fVar, ac4.a aVar2, ib4.c cVar2, EndedIdeaVoteRound endedIdeaVoteRound) {
        this.screenMapper = cVar;
        this.getEndedIdeaVoteRoundVotingResultsUC = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar2;
        this.roundData = endedIdeaVoteRound;
        up3.b.Initial initial = new up3.b.Initial(endedIdeaVoteRound);
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: up3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f199872a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), w9(initial));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(up3.b.class), new er.l() { // from class: up3.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f199865a, (z) obj);
            }
        });
        vVar.c(q0.c(up3.b.Initial.class), new er.l() { // from class: up3.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f199866a, (z) obj);
            }
        });
        vVar.c(q0.c(up3.b.Initialized.class), new er.l() { // from class: up3.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.D9(this.f199867a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, z zVar) {
        d dVar = tVar.new d(null);
        zVar.x(q0.c(up3.a.C5194a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, z zVar) {
        zVar.C(tVar.new e(null));
        f fVar = tVar.new f(null);
        zVar.v(q0.c(up3.a.b.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(t tVar, z zVar) {
        g gVar = tVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(up3.a.GoToIdea.class), oVar, gVar);
        zVar.v(q0.c(up3.a.SetFilterTab.class), oVar, new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t9(c0<up3.b.Initial> c0Var, tq.e<? super k10.l<up3.b.Initialized>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2, tq.e<? super i0> eVar) throws Throwable {
        b bVar2;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f199900m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f199900m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object obj = bVar2.f199898k;
        Object objE = uq.b.e();
        int i16 = bVar2.f199900m;
        if (i16 == 0) {
            oq.u.b(obj);
            jb4.b bVarB = this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: up3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.v9(aVar, aVar2, (ib4.c.b) obj2);
                }
            }, 2, null));
            jb4.b bVar3 = bVarB;
            xw.b<up3.a.d> bVarY1 = Y1();
            up3.a.d.Error error = new up3.a.d.Error(bVar3);
            bVar2.f199892d = vq.j.a(bVar);
            bVar2.f199893e = vq.j.a(aVar);
            bVar2.f199894f = vq.j.a(aVar2);
            bVar2.f199895g = bVarB;
            bVar2.f199896h = vq.j.a(bVar3);
            bVar2.f199897j = 0;
            bVar2.f199900m = 1;
            if (bVarY1.F(error, bVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        } else if (aVar2 != null) {
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final up3.c.a w9(up3.b state) {
        return this.screenMapper.b(new vp3.c.Params(state, b9(up3.a.C5194a.f199827a), new er.l() { // from class: up3.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f199868a, (oo0.h) obj);
            }
        }, new er.l() { // from class: up3.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f199869a, (y30.n.Switch.EnumC5973b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, oo0.h hVar) {
        tVar.d9(new up3.a.GoToIdea(hVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, y30.n.Switch.EnumC5973b enumC5973b) {
        tVar.d9(new up3.a.SetFilterTab(enumC5973b));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<up3.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<up3.b, up3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<up3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(EndedIdeaVoteRound endedIdeaVoteRound) {
        super.P5(endedIdeaVoteRound);
    }
}
