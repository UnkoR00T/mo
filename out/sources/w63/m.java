package w63;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lw63/m;", "Ll00/g;", "Lw63/d;", "", "Lw63/e;", "Lx63/a;", "codeLockedMapper", "Lyy/a;", "stateMachineFactory", "Lw63/c;", "setupData", "<init>", "(Lx63/a;Lyy/a;Lw63/c;)V", "state", "Lw63/e$a;", "j9", "(Lw63/d;)Lw63/e$a;", "b", "Lx63/a;", "c", "Lw63/d;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lw63/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x63.a codeLockedMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w63.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f210583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f210584b;

        /* JADX INFO: renamed from: w63.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5534a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f210585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f210586b;

            /* JADX INFO: renamed from: w63.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5535a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f210587d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f210588e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f210589f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f210591h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f210592j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f210593k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f210594l;

                public C5535a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f210587d = obj;
                    this.f210588e |= PKIFailureInfo.systemUnavail;
                    return C5534a.this.F(null, this);
                }
            }

            public C5534a(mu.h hVar, m mVar) {
                this.f210585a = hVar;
                this.f210586b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5535a c5535a;
                if (eVar instanceof C5535a) {
                    c5535a = (C5535a) eVar;
                    int i15 = c5535a.f210588e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5535a.f210588e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5535a = new C5535a(eVar);
                    }
                } else {
                    c5535a = new C5535a(eVar);
                }
                Object obj2 = c5535a.f210587d;
                Object objE = uq.b.e();
                int i16 = c5535a.f210588e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f210585a;
                    e.Data dataJ9 = this.f210586b.j9((State) obj);
                    c5535a.f210589f = vq.j.a(obj);
                    c5535a.f210591h = vq.j.a(c5535a);
                    c5535a.f210592j = vq.j.a(obj);
                    c5535a.f210593k = vq.j.a(hVar);
                    c5535a.f210594l = 0;
                    c5535a.f210588e = 1;
                    if (hVar.F(dataJ9, c5535a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f210583a = gVar;
            this.f210584b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f210583a.a(new C5534a(hVar, this.f210584b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw63/b;", "<unused var>", "Lw63/d;", "Loq/i0;", "<anonymous>", "(Lw63/b;Lw63/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<w63.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210595e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f210595e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<w63.a> bVarY1 = m.this.Y1();
                w63.a.C5533a c5533a = w63.a.C5533a.f210562a;
                this.f210595e = 1;
                if (bVarY1.F(c5533a, this) == objE) {
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
        public final Object w(w63.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    public m(x63.a aVar, yy.a aVar2, SetupData setupData) {
        this.codeLockedMapper = aVar;
        State state = new State(setupData.getTitle(), setupData.getMessage());
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: w63.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.l9(this.f210577a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(State state) {
        return this.codeLockedMapper.b(new x63.a.Params(state, b9(w63.b.f210563a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: w63.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f210576a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        zVar.x(q0.c(w63.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<w63.a> Y1() {
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
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
