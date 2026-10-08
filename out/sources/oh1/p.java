package oh1;

import ch1.u0;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Loh1/p;", "Ll00/g;", "Loh1/k;", "Loh1/i;", "Loh1/l;", "", "Lyy/a;", "stateMachineFactory", "Lph1/e;", "mapper", "Lch1/t;", "getDocumentsLayoutTypeDataStoreUseCase", "Lch1/u0;", "updateDocumentsLayoutTypeUseCase", "<init>", "(Lyy/a;Lph1/e;Lch1/t;Lch1/u0;)V", "state", "Loh1/l$a;", "o9", "(Loh1/k;)Loh1/l$a;", "b", "Lph1/e;", "c", "Lch1/t;", "d", "Lch1/u0;", "e", "Loh1/k;", "initialState", "Lxw/b;", "Loh1/i$f;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, i> implements l, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ph1.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ch1.t getDocumentsLayoutTypeDataStoreUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0 updateDocumentsLayoutTypeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i.f> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, i> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<l.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f145854b;

        /* JADX INFO: renamed from: oh1.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3620a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145855a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f145856b;

            /* JADX INFO: renamed from: oh1.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3621a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145857d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145858e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145859f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145861h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145862j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145863k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145864l;

                public C3621a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145857d = obj;
                    this.f145858e |= PKIFailureInfo.systemUnavail;
                    return C3620a.this.F(null, this);
                }
            }

            public C3620a(mu.h hVar, p pVar) {
                this.f145855a = hVar;
                this.f145856b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3621a c3621a;
                if (eVar instanceof C3621a) {
                    c3621a = (C3621a) eVar;
                    int i15 = c3621a.f145858e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3621a.f145858e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3621a = new C3621a(eVar);
                    }
                } else {
                    c3621a = new C3621a(eVar);
                }
                Object obj2 = c3621a.f145857d;
                Object objE = uq.b.e();
                int i16 = c3621a.f145858e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145855a;
                    l.Data dataO9 = this.f145856b.o9((State) obj);
                    c3621a.f145859f = vq.j.a(obj);
                    c3621a.f145861h = vq.j.a(c3621a);
                    c3621a.f145862j = vq.j.a(obj);
                    c3621a.f145863k = vq.j.a(hVar);
                    c3621a.f145864l = 0;
                    c3621a.f145858e = 1;
                    if (hVar.F(dataO9, c3621a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f145853a = gVar;
            this.f145854b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l.Data> hVar, tq.e eVar) {
            Object objA = this.f145853a.a(new C3620a(hVar, this.f145854b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loh1/i$a;", "<unused var>", "Loh1/k;", "Loq/i0;", "<anonymous>", "(Loh1/i$a;Loh1/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145865e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145865e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<i.f> bVarY1 = p.this.Y1();
                i.f.a aVar = i.f.a.f145827a;
                this.f145865e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(i.a aVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loh1/k;", "it", "Loq/i0;", "<anonymous>", "(Loh1/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145867e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lah1/b;", "layoutType", "Loq/i0;", "<anonymous>", "(Lah1/b;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ah1.b, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f145869e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f145870f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f145871g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f145871g = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                ah1.b bVar = (ah1.b) this.f145870f;
                uq.b.e();
                if (this.f145869e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f145871g.d9(new i.LoadDocumentsLayoutType(bVar));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ah1.b bVar, tq.e<? super i0> eVar) {
                return ((a) v(bVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f145871g, eVar);
                aVar.f145870f = obj;
                return aVar;
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145867e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVar = (mu.g) p.this.getDocumentsLayoutTypeDataStoreUseCase.a(gz.b.a.C1792a.f78542a);
                a aVar = new a(p.this, null);
                this.f145867e = 1;
                if (mu.i.j(gVar, aVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((c) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loh1/i$b;", "action", "Lk10/c0;", "Loh1/k;", "state", "Lk10/l;", "<anonymous>", "(Loh1/i$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i.ChangeSelectedDocumentLayout, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145874g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i.ChangeSelectedDocumentLayout changeSelectedDocumentLayout, State state) {
            return state.a(changeSelectedDocumentLayout.getDocumentLayoutType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i.ChangeSelectedDocumentLayout changeSelectedDocumentLayout = (i.ChangeSelectedDocumentLayout) this.f145873f;
            c0 c0Var = (c0) this.f145874g;
            Object objE = uq.b.e();
            int i15 = this.f145872e;
            if (i15 == 0) {
                oq.u.b(obj);
                u0 u0Var = p.this.updateDocumentsLayoutTypeUseCase;
                u0.Params params = new u0.Params(changeSelectedDocumentLayout.getDocumentLayoutType());
                this.f145873f = changeSelectedDocumentLayout;
                this.f145874g = c0Var;
                this.f145872e = 1;
                if (u0Var.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: oh1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(changeSelectedDocumentLayout, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.ChangeSelectedDocumentLayout changeSelectedDocumentLayout, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f145873f = changeSelectedDocumentLayout;
            dVar.f145874g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loh1/i$e;", "action", "Lk10/c0;", "Loh1/k;", "state", "Lk10/l;", "<anonymous>", "(Loh1/i$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i.LoadDocumentsLayoutType, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145878g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(i.LoadDocumentsLayoutType loadDocumentsLayoutType, State state) {
            return state.a(loadDocumentsLayoutType.getLayoutType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i.LoadDocumentsLayoutType loadDocumentsLayoutType = (i.LoadDocumentsLayoutType) this.f145877f;
            c0 c0Var = (c0) this.f145878g;
            uq.b.e();
            if (this.f145876e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: oh1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(loadDocumentsLayoutType, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.LoadDocumentsLayoutType loadDocumentsLayoutType, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f145877f = loadDocumentsLayoutType;
            eVar2.f145878g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loh1/i$c;", "<unused var>", "Loh1/k;", "Loq/i0;", "<anonymous>", "(Loh1/i$c;Loh1/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145879e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145879e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                i.f.b bVar = i.f.b.f145828a;
                this.f145879e = 1;
                if (pVar.F(bVar, this) == objE) {
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
        public final Object w(i.c cVar, State state, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loh1/i$d;", "<unused var>", "Loh1/k;", "Loq/i0;", "<anonymous>", "(Loh1/i$d;Loh1/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145881e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145881e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                i.f.c cVar = i.f.c.f145829a;
                this.f145881e = 1;
                if (pVar.F(cVar, this) == objE) {
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
        public final Object w(i.d dVar, State state, tq.e<? super i0> eVar) {
            return p.this.new g(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ph1.e eVar, ch1.t tVar, u0 u0Var) {
        this.mapper = eVar;
        this.getDocumentsLayoutTypeDataStoreUseCase = tVar;
        this.updateDocumentsLayoutTypeUseCase = u0Var;
        State state = new State(ah1.b.BigCards);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: oh1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f145843a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.Data o9(State state) {
        return this.mapper.b(new ph1.e.Params(state, b9(i.c.f145824a), b9(i.d.f145825a), new er.l() { // from class: oh1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f145845a, (ah1.b) obj);
            }
        }, b9(i.a.f145822a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, ah1.b bVar) {
        pVar.d9(new i.ChangeSelectedDocumentLayout(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: oh1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f145844a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i.a.class), oVar, bVar);
        zVar.C(pVar.new c(null));
        zVar.v(q0.c(i.ChangeSelectedDocumentLayout.class), oVar, pVar.new d(null));
        zVar.v(q0.c(i.LoadDocumentsLayoutType.class), oVar, new e(null));
        zVar.x(q0.c(i.c.class), oVar, pVar.new f(null));
        zVar.x(q0.c(i.d.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(i.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(l.Data data) {
        super.P5(data);
    }
}
