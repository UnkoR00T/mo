package fb4;

import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lfb4/s;", "Ll00/g;", "Lfb4/n;", "Loq/i0;", "", "Lyy/a;", "stateMachineFactory", "Lfb4/l;", "dialogMapper", "Lcb4/i;", "adapter", "<init>", "(Lyy/a;Lfb4/l;Lcb4/i;)V", "state", "Li40/a;", "i9", "(Lfb4/n;)Li40/a;", "b", "Lfb4/l;", "c", "Lcb4/i;", "d", "Lfb4/n;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, i0> implements l00.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l dialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.i adapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, i0> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<i40.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i40.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f61071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f61072b;

        /* JADX INFO: renamed from: fb4.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1377a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f61073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f61074b;

            /* JADX INFO: renamed from: fb4.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1378a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f61075d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f61076e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f61077f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f61079h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f61080j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f61081k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f61082l;

                public C1378a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f61075d = obj;
                    this.f61076e |= PKIFailureInfo.systemUnavail;
                    return C1377a.this.F(null, this);
                }
            }

            public C1377a(mu.h hVar, s sVar) {
                this.f61073a = hVar;
                this.f61074b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1378a c1378a;
                if (eVar instanceof C1378a) {
                    c1378a = (C1378a) eVar;
                    int i15 = c1378a.f61076e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1378a.f61076e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1378a = new C1378a(eVar);
                    }
                } else {
                    c1378a = new C1378a(eVar);
                }
                Object obj2 = c1378a.f61075d;
                Object objE = uq.b.e();
                int i16 = c1378a.f61076e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f61073a;
                    i40.a aVarI9 = this.f61074b.i9((State) obj);
                    c1378a.f61077f = vq.j.a(obj);
                    c1378a.f61079h = vq.j.a(c1378a);
                    c1378a.f61080j = vq.j.a(obj);
                    c1378a.f61081k = vq.j.a(hVar);
                    c1378a.f61082l = 0;
                    c1378a.f61076e = 1;
                    if (hVar.F(aVarI9, c1378a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f61071a = gVar;
            this.f61072b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i40.a> hVar, tq.e eVar) {
            Object objA = this.f61071a.a(new C1377a(hVar, this.f61072b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public s(yy.a aVar, l lVar, cb4.i iVar) {
        this.dialogMapper = lVar;
        this.adapter = iVar;
        State state = new State(iVar.getInitialData());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: fb4.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.j9((k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), i9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i40.a i9(State state) {
        return this.dialogMapper.b(new l.Params(state.getDialogData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(k10.v vVar) {
        return i0.f148189a;
    }

    @Override // l00.g
    protected k10.t<State, i0> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i40.a> getState() {
        return this.state;
    }
}
