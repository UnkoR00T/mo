package qd2;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import ll0.IdVerificationData;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lqd2/l;", "Ll00/g;", "Lqd2/d;", "", "Lqd2/e;", "Lyy/a;", "stateMachineFactory", "Lrd2/a;", "mapper", "Lll0/a;", "data", "<init>", "(Lyy/a;Lrd2/a;Lll0/a;)V", "state", "Lqd2/e$a;", "j9", "(Lqd2/d;)Lqd2/e$a;", "b", "Lrd2/a;", "c", "Lqd2/d;", "initialState", "Lxw/b;", "Lqd2/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "idverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rd2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qd2.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f166120b;

        /* JADX INFO: renamed from: qd2.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4157a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166121a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f166122b;

            /* JADX INFO: renamed from: qd2.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4158a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166123d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166124e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166125f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166127h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166128j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166129k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166130l;

                public C4158a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166123d = obj;
                    this.f166124e |= PKIFailureInfo.systemUnavail;
                    return C4157a.this.F(null, this);
                }
            }

            public C4157a(mu.h hVar, l lVar) {
                this.f166121a = hVar;
                this.f166122b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4158a c4158a;
                if (eVar instanceof C4158a) {
                    c4158a = (C4158a) eVar;
                    int i15 = c4158a.f166124e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4158a.f166124e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4158a = new C4158a(eVar);
                    }
                } else {
                    c4158a = new C4158a(eVar);
                }
                Object obj2 = c4158a.f166123d;
                Object objE = uq.b.e();
                int i16 = c4158a.f166124e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f166121a;
                    e.Data dataJ9 = this.f166122b.j9((State) obj);
                    c4158a.f166125f = vq.j.a(obj);
                    c4158a.f166127h = vq.j.a(c4158a);
                    c4158a.f166128j = vq.j.a(obj);
                    c4158a.f166129k = vq.j.a(hVar);
                    c4158a.f166130l = 0;
                    c4158a.f166124e = 1;
                    if (hVar.F(dataJ9, c4158a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f166119a = gVar;
            this.f166120b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f166119a.a(new C4157a(hVar, this.f166120b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqd2/c;", "<unused var>", "Lqd2/d;", "Loq/i0;", "<anonymous>", "(Lqd2/c;Lqd2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<qd2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166131e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166131e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qd2.a> bVarY1 = l.this.Y1();
                qd2.a.b bVar = qd2.a.b.f166100a;
                this.f166131e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(qd2.c cVar, State state, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqd2/b;", "<unused var>", "Lqd2/d;", "Loq/i0;", "<anonymous>", "(Lqd2/b;Lqd2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<qd2.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166133e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166133e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qd2.a> bVarY1 = l.this.Y1();
                qd2.a.C4156a c4156a = qd2.a.C4156a.f166099a;
                this.f166133e = 1;
                if (bVarY1.F(c4156a, this) == objE) {
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
        public final Object w(qd2.b bVar, State state, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, rd2.a aVar2, IdVerificationData idVerificationData) {
        this.mapper = aVar2;
        State state = new State(idVerificationData);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: qd2.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f166113a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(State state) {
        return this.mapper.b(new rd2.a.Params(state, b9(qd2.b.f166101a), b9(qd2.c.f166102a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qd2.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f166112a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qd2.c.class), oVar, bVar);
        zVar.x(q0.c(qd2.b.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qd2.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(IdVerificationData idVerificationData) {
        super.P5(idVerificationData);
    }
}
