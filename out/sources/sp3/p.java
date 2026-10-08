package sp3;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oo0.EndedIdeaVoteRound;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR,\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lsp3/p;", "Ll00/g;", "Lsp3/i;", "Lsp3/g;", "Lsp3/j;", "", "Lyy/a;", "stateMachineFactory", "Lpo0/g;", "getEndedIdeaVoteRoundsUC", "Ltp3/b;", "mapper", "Lib4/c;", "errorMapper", "<init>", "(Lyy/a;Lpo0/g;Ltp3/b;Lib4/c;)V", "Ldx/b;", "error", "Loq/i0;", "q9", "(Ldx/b;)V", "b", "Lpo0/g;", "c", "Ltp3/b;", "d", "Lib4/c;", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "Lsp3/j$a;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lsp3/g$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<i, sp3.g> implements j, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final po0.g getEndedIdeaVoteRoundsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tp3.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<i, sp3.g> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<j.a> state = a9(new a(e9().getState(), this), j.a.b.f183459a);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sp3.g.d> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f183472b;

        /* JADX INFO: renamed from: sp3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4723a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f183474b;

            /* JADX INFO: renamed from: sp3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4724a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183475d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183476e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183477f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183479h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183480j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183481k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183482l;

                public C4724a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183475d = obj;
                    this.f183476e |= PKIFailureInfo.systemUnavail;
                    return C4723a.this.F(null, this);
                }
            }

            public C4723a(mu.h hVar, p pVar) {
                this.f183473a = hVar;
                this.f183474b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4724a c4724a;
                if (eVar instanceof C4724a) {
                    c4724a = (C4724a) eVar;
                    int i15 = c4724a.f183476e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4724a.f183476e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4724a = new C4724a(eVar);
                    }
                } else {
                    c4724a = new C4724a(eVar);
                }
                Object obj2 = c4724a.f183475d;
                Object objE = uq.b.e();
                int i16 = c4724a.f183476e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f183473a;
                    j.a aVarB = this.f183474b.mapper.b(new tp3.b.Params((i) obj, this.f183474b.b9(sp3.g.a.f183446a), this.f183474b.new b()));
                    c4724a.f183477f = vq.j.a(obj);
                    c4724a.f183479h = vq.j.a(c4724a);
                    c4724a.f183480j = vq.j.a(obj);
                    c4724a.f183481k = vq.j.a(hVar);
                    c4724a.f183482l = 0;
                    c4724a.f183476e = 1;
                    if (hVar.F(aVarB, c4724a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, p pVar) {
            this.f183471a = gVar;
            this.f183472b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.a> hVar, tq.e eVar) {
            Object objA = this.f183471a.a(new C4723a(hVar, this.f183472b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<EndedIdeaVoteRound, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(EndedIdeaVoteRound endedIdeaVoteRound) {
            c(endedIdeaVoteRound);
            return i0.f148189a;
        }

        public final void c(EndedIdeaVoteRound endedIdeaVoteRound) {
            p.this.d9(new sp3.g.ShowRoundResults(endedIdeaVoteRound));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsp3/g$a;", "<unused var>", "Lsp3/i;", "Loq/i0;", "<anonymous>", "(Lsp3/g$a;Lsp3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sp3.g.a, i, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183484e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f183484e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<sp3.g.d> bVarY1 = p.this.Y1();
                sp3.g.d.a aVar = sp3.g.d.a.f183449a;
                this.f183484e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sp3.g.a aVar, i iVar, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsp3/g$b;", "action", "Lsp3/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsp3/g$b;Lsp3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sp3.g.Error, i, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183487f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sp3.g.Error error = (sp3.g.Error) this.f183487f;
            Object objE = uq.b.e();
            int i15 = this.f183486e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<sp3.g.d> bVarY1 = p.this.Y1();
                sp3.g.d.Error error2 = new sp3.g.d.Error(error.getErrorData());
                this.f183487f = vq.j.a(error);
                this.f183486e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sp3.g.Error error, i iVar, tq.e<? super i0> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f183487f = error;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsp3/i$b;", "it", "Loq/i0;", "<anonymous>", "(Lsp3/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<i.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183489e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f183489e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p.this.d9(sp3.g.c.f183448a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i.b bVar, tq.e<? super i0> eVar) {
            return ((e) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsp3/g$c;", "<unused var>", "Lk10/c0;", "Lsp3/i$b;", "state", "Lk10/l;", "Lsp3/i;", "<anonymous>", "(Lsp3/g$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sp3.g.c, c0<i.b>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183492f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.Initialized O(List list, i.b bVar) {
            return new i.Initialized(list);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f183492f;
            Object objE = uq.b.e();
            int i15 = this.f183491e;
            if (i15 == 0) {
                u.b(obj);
                po0.g gVar = p.this.getEndedIdeaVoteRoundsUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f183492f = c0Var;
                this.f183491e = 1;
                obj = gVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.q9((dx.b) ((dx.i.Left) iVar).b());
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final List list = (List) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: sp3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(list, (i.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sp3.g.c cVar, c0<i.b> c0Var, tq.e<? super k10.l<? extends i>> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f183492f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsp3/g$e;", "action", "Lsp3/i$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsp3/g$e;Lsp3/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sp3.g.ShowRoundResults, i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183495f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sp3.g.ShowRoundResults showRoundResults = (sp3.g.ShowRoundResults) this.f183495f;
            Object objE = uq.b.e();
            int i15 = this.f183494e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<sp3.g.d> bVarY1 = p.this.Y1();
                sp3.g.d.ShowRoundResults showRoundResults2 = new sp3.g.d.ShowRoundResults(showRoundResults.getRound());
                this.f183495f = vq.j.a(showRoundResults);
                this.f183494e = 1;
                if (bVarY1.F(showRoundResults2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sp3.g.ShowRoundResults showRoundResults, i.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f183495f = showRoundResults;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, po0.g gVar, tp3.b bVar, ib4.c cVar) {
        this.getEndedIdeaVoteRoundsUC = gVar;
        this.mapper = bVar;
        this.errorMapper = cVar;
        this.stateMachine = aVar.a(i.b.f183456a, new er.l() { // from class: sp3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f183460a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q9(dx.b error) {
        d9(new sp3.g.Error(this.errorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: sp3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f183464a, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            pVar.d9(sp3.g.c.f183448a);
        } else {
            pVar.d9(sp3.g.a.f183446a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final p pVar, v vVar) {
        vVar.c(q0.c(i.class), new er.l() { // from class: sp3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f183461a, (z) obj);
            }
        });
        vVar.c(q0.c(i.b.class), new er.l() { // from class: sp3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f183462a, (z) obj);
            }
        });
        vVar.c(q0.c(i.Initialized.class), new er.l() { // from class: sp3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f183463a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sp3.g.a.class), oVar, cVar);
        zVar.x(q0.c(sp3.g.Error.class), oVar, pVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(p pVar, z zVar) {
        zVar.C(pVar.new e(null));
        f fVar = pVar.new f(null);
        zVar.v(q0.c(sp3.g.c.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, z zVar) {
        g gVar = pVar.new g(null);
        zVar.x(q0.c(sp3.g.ShowRoundResults.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sp3.g.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<i, sp3.g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
