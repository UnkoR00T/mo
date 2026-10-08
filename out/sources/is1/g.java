package is1;

import f00.j0;
import k10.t;
import k10.v;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001%B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lis1/g;", "Ll00/g;", "Lis1/a;", "", "Lis1/b;", "Lyy/a;", "stateMachineFactory", "Lis1/l;", "setupContract", "<init>", "(Lyy/a;Lis1/l;)V", "state", "Lis1/b$a;", "i9", "(Lis1/a;)Lis1/b$a;", "b", "Lis1/l;", "c", "Lis1/a;", "initialState", "Lxw/b;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends l00.g<State, Object> implements is1.b, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l setupContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<Object> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<is1.b.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lis1/g$a;", "Lf00/j0;", "Lis1/l;", "Lis1/g;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<l, g> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<is1.b.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f96900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f96901b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f96902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f96903b;

            /* JADX INFO: renamed from: is1.g$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2263a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f96904d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f96905e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f96906f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f96908h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f96909j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f96910k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f96911l;

                public C2263a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f96904d = obj;
                    this.f96905e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, g gVar) {
                this.f96902a = hVar;
                this.f96903b = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2263a c2263a;
                if (eVar instanceof C2263a) {
                    c2263a = (C2263a) eVar;
                    int i15 = c2263a.f96905e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2263a.f96905e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2263a = new C2263a(eVar);
                    }
                } else {
                    c2263a = new C2263a(eVar);
                }
                Object obj2 = c2263a.f96904d;
                Object objE = uq.b.e();
                int i16 = c2263a.f96905e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f96902a;
                    is1.b.Data dataI9 = this.f96903b.i9((State) obj);
                    c2263a.f96906f = vq.j.a(obj);
                    c2263a.f96908h = vq.j.a(c2263a);
                    c2263a.f96909j = vq.j.a(obj);
                    c2263a.f96910k = vq.j.a(hVar);
                    c2263a.f96911l = 0;
                    c2263a.f96905e = 1;
                    if (hVar.F(dataI9, c2263a) == objE) {
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

        public b(mu.g gVar, g gVar2) {
            this.f96900a = gVar;
            this.f96901b = gVar2;
        }

        @Override // mu.g
        public Object a(mu.h<? super is1.b.Data> hVar, tq.e eVar) {
            Object objA = this.f96900a.a(new a(hVar, this.f96901b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public g(yy.a aVar, l lVar) {
        this.setupContract = lVar;
        State state = new State(lVar.c());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: is1.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.k9((v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), i9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final is1.b.Data i9(State state) {
        return new is1.b.Data(mx.b.b(state.getSummaryData().getFirstStepData().getFoo(), ""), mx.b.b(state.getSummaryData().getSecondStepData().getBar(), ""), mx.b.b(state.getSummaryData().getSecondStepData().getBaz(), ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(v vVar) {
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<Object> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<is1.b.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(is1.b.Data data) {
        super.P5(data);
    }
}
