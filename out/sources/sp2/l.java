package sp2;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lsp2/l;", "Ll00/g;", "Lsp2/c;", "", "Lsp2/d;", "Lyy/a;", "stateMachineFactory", "Ltp2/b;", "mapper", "Lsp2/b;", "setupData", "<init>", "(Lyy/a;Ltp2/b;Lsp2/b;)V", "state", "Lsp2/d$a;", "l9", "(Lsp2/c;)Lsp2/d$a;", "b", "Ltp2/b;", "c", "Lsp2/b;", "d", "Lsp2/c;", "initialState", "Lxw/b;", "Lsp2/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tp2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DocumentPickerNavigationParams setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sp2.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f183423b;

        /* JADX INFO: renamed from: sp2.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4720a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f183425b;

            /* JADX INFO: renamed from: sp2.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4721a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183426d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183427e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183428f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183430h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183431j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183432k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183433l;

                public C4721a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183426d = obj;
                    this.f183427e |= PKIFailureInfo.systemUnavail;
                    return C4720a.this.F(null, this);
                }
            }

            public C4720a(mu.h hVar, l lVar) {
                this.f183424a = hVar;
                this.f183425b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4721a c4721a;
                if (eVar instanceof C4721a) {
                    c4721a = (C4721a) eVar;
                    int i15 = c4721a.f183427e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4721a.f183427e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4721a = new C4721a(eVar);
                    }
                } else {
                    c4721a = new C4721a(eVar);
                }
                Object obj2 = c4721a.f183426d;
                Object objE = uq.b.e();
                int i16 = c4721a.f183427e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f183424a;
                    d.Data dataL9 = this.f183425b.l9((State) obj);
                    c4721a.f183428f = vq.j.a(obj);
                    c4721a.f183430h = vq.j.a(c4721a);
                    c4721a.f183431j = vq.j.a(obj);
                    c4721a.f183432k = vq.j.a(hVar);
                    c4721a.f183433l = 0;
                    c4721a.f183427e = 1;
                    if (hVar.F(dataL9, c4721a) == objE) {
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
            this.f183422a = gVar;
            this.f183423b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f183422a.a(new C4720a(hVar, this.f183423b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsp2/a;", "action", "Lsp2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsp2/a;Lsp2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<sp2.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183435f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sp2.a aVar = (sp2.a) this.f183435f;
            Object objE = uq.b.e();
            int i15 = this.f183434e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f183435f = vq.j.a(aVar);
                this.f183434e = 1;
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
        public final Object w(sp2.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f183435f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, tp2.b bVar, DocumentPickerNavigationParams documentPickerNavigationParams) {
        this.mapper = bVar;
        this.setupData = documentPickerNavigationParams;
        State state = new State(documentPickerNavigationParams.getSelectedDocumentType());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: sp2.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f183415a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new tp2.b.Params(state, b9(sp2.a.C4719a.f183400a), new er.l() { // from class: sp2.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f183413a, (nq2.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, nq2.c cVar) {
        lVar.d9(new sp2.a.GoBackWithResult(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: sp2.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f183414a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(sp2.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sp2.a> Y1() {
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
    public /* bridge */ Object F(sp2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DocumentPickerNavigationParams documentPickerNavigationParams) {
        super.P5(documentPickerNavigationParams);
    }
}
