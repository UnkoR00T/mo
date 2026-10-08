package g81;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lg81/l;", "Ll00/g;", "Lg81/c;", "", "Lg81/d;", "Lyy/a;", "stateMachineFactory", "Lh81/b;", "mapper", "Lg81/b;", "setupData", "<init>", "(Lyy/a;Lh81/b;Lg81/b;)V", "state", "Lg81/d$a;", "l9", "(Lg81/c;)Lg81/d$a;", "b", "Lh81/b;", "c", "Lg81/b;", "d", "Lg81/c;", "initialState", "Lxw/b;", "Lg81/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h81.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DocumentPickerNavigationParams setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g81.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f71201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f71202b;

        /* JADX INFO: renamed from: g81.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1619a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f71203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f71204b;

            /* JADX INFO: renamed from: g81.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1620a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71205d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71206e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f71207f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f71209h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f71210j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f71211k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f71212l;

                public C1620a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f71205d = obj;
                    this.f71206e |= PKIFailureInfo.systemUnavail;
                    return C1619a.this.F(null, this);
                }
            }

            public C1619a(mu.h hVar, l lVar) {
                this.f71203a = hVar;
                this.f71204b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1620a c1620a;
                if (eVar instanceof C1620a) {
                    c1620a = (C1620a) eVar;
                    int i15 = c1620a.f71206e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1620a.f71206e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1620a = new C1620a(eVar);
                    }
                } else {
                    c1620a = new C1620a(eVar);
                }
                Object obj2 = c1620a.f71205d;
                Object objE = uq.b.e();
                int i16 = c1620a.f71206e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f71203a;
                    d.Data dataL9 = this.f71204b.l9((State) obj);
                    c1620a.f71207f = vq.j.a(obj);
                    c1620a.f71209h = vq.j.a(c1620a);
                    c1620a.f71210j = vq.j.a(obj);
                    c1620a.f71211k = vq.j.a(hVar);
                    c1620a.f71212l = 0;
                    c1620a.f71206e = 1;
                    if (hVar.F(dataL9, c1620a) == objE) {
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
            this.f71201a = gVar;
            this.f71202b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f71201a.a(new C1619a(hVar, this.f71202b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg81/a;", "action", "Lg81/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg81/a;Lg81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<g81.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71214f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g81.a aVar = (g81.a) this.f71214f;
            Object objE = uq.b.e();
            int i15 = this.f71213e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f71214f = vq.j.a(aVar);
                this.f71213e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(g81.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f71214f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, h81.b bVar, DocumentPickerNavigationParams documentPickerNavigationParams) {
        this.mapper = bVar;
        this.setupData = documentPickerNavigationParams;
        State state = new State(documentPickerNavigationParams.getSelectedDocumentType());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: g81.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f71194a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new h81.b.Params(state, b9(g81.a.C1618a.f71179a), new er.l() { // from class: g81.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f71193a, (cl0.d) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, cl0.d dVar) {
        lVar.d9(new g81.a.GoBackWithResult(dVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: g81.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f71192a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(g81.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g81.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(g81.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DocumentPickerNavigationParams documentPickerNavigationParams) {
        super.P5(documentPickerNavigationParams);
    }
}
