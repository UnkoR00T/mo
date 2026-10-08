package ol1;

import fr.q0;
import il0.BeChildAndParentsData;
import java.util.Iterator;
import java.util.Map;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import pu3.ConfirmationDocumentResult;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lol1/w;", "Ll00/g;", "Lol1/i;", "", "Lol1/j;", "Lyy/a;", "stateMachineFactory", "Lql1/d;", "mapper", "Lvk1/a;", "validateParentsDataUC", "Lsk1/a;", "createConfirmationDocumentDataUC", "Lpl1/a;", "contract", "<init>", "(Lyy/a;Lql1/d;Lvk1/a;Lsk1/a;Lpl1/a;)V", "state", "Lol1/j$a;", "p9", "(Lol1/i;)Lol1/j$a;", "b", "Lql1/d;", "c", "Lvk1/a;", "d", "Lsk1/a;", "e", "Lol1/i;", "initialState", "Lxw/b;", "Lol1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<State, Object> implements j, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ql1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vk1.a validateParentsDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sk1.a createConfirmationDocumentDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ol1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<j.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f146653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f146654b;

        /* JADX INFO: renamed from: ol1.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3647a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f146655a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f146656b;

            /* JADX INFO: renamed from: ol1.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3648a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f146657d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f146658e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f146659f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f146661h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f146662j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f146663k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f146664l;

                public C3648a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f146657d = obj;
                    this.f146658e |= PKIFailureInfo.systemUnavail;
                    return C3647a.this.F(null, this);
                }
            }

            public C3647a(mu.h hVar, w wVar) {
                this.f146655a = hVar;
                this.f146656b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3648a c3648a;
                if (eVar instanceof C3648a) {
                    c3648a = (C3648a) eVar;
                    int i15 = c3648a.f146658e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3648a.f146658e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3648a = new C3648a(eVar);
                    }
                } else {
                    c3648a = new C3648a(eVar);
                }
                Object obj2 = c3648a.f146657d;
                Object objE = uq.b.e();
                int i16 = c3648a.f146658e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f146655a;
                    j.Data dataP9 = this.f146656b.p9((State) obj);
                    c3648a.f146659f = vq.j.a(obj);
                    c3648a.f146661h = vq.j.a(c3648a);
                    c3648a.f146662j = vq.j.a(obj);
                    c3648a.f146663k = vq.j.a(hVar);
                    c3648a.f146664l = 0;
                    c3648a.f146658e = 1;
                    if (hVar.F(dataP9, c3648a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f146653a = gVar;
            this.f146654b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.Data> hVar, tq.e eVar) {
            Object objA = this.f146653a.a(new C3647a(hVar, this.f146654b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lol1/b;", "action", "Lol1/i;", "state", "Loq/i0;", "<anonymous>", "(Lol1/b;Lol1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ol1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146665e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146665e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                ol1.a.C3645a c3645a = ol1.a.C3645a.f146588a;
                this.f146665e = 1;
                if (wVar.F(c3645a, this) == objE) {
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
        public final Object w(ol1.b bVar, State state, tq.e<? super i0> eVar) {
            return w.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lol1/c;", "action", "Lol1/i;", "state", "Loq/i0;", "<anonymous>", "(Lol1/c;Lol1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ol1.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146667e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146667e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                ol1.a.b bVar = ol1.a.b.f146589a;
                this.f146667e = 1;
                if (wVar.F(bVar, this) == objE) {
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
        public final Object w(ol1.c cVar, State state, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lol1/d;", "action", "Lk10/c0;", "Lol1/i;", "state", "Lk10/l;", "<anonymous>", "(Lol1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnFathersNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146671g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnFathersNameChanged onFathersNameChanged, State state) {
            return State.b(state, null, new State.Field(onFathersNameChanged.getValue(), null, 2, null), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnFathersNameChanged onFathersNameChanged = (OnFathersNameChanged) this.f146670f;
            k10.c0 c0Var = (k10.c0) this.f146671g;
            uq.b.e();
            if (this.f146669e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ol1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.d.O(onFathersNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnFathersNameChanged onFathersNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f146670f = onFathersNameChanged;
            dVar.f146671g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lol1/f;", "action", "Lk10/c0;", "Lol1/i;", "state", "Lk10/l;", "<anonymous>", "(Lol1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnMothersNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146674g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnMothersNameChanged onMothersNameChanged, State state) {
            return State.b(state, null, null, new State.Field(onMothersNameChanged.getValue(), null, 2, null), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnMothersNameChanged onMothersNameChanged = (OnMothersNameChanged) this.f146673f;
            k10.c0 c0Var = (k10.c0) this.f146674g;
            uq.b.e();
            if (this.f146672e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ol1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.e.O(onMothersNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnMothersNameChanged onMothersNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f146673f = onMothersNameChanged;
            eVar2.f146674g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lol1/e;", "action", "Lk10/c0;", "Lol1/i;", "state", "Lk10/l;", "<anonymous>", "(Lol1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnMothersFamilyNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146677g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnMothersFamilyNameChanged onMothersFamilyNameChanged, State state) {
            return State.b(state, null, null, null, new State.Field(onMothersFamilyNameChanged.getValue(), null, 2, null), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnMothersFamilyNameChanged onMothersFamilyNameChanged = (OnMothersFamilyNameChanged) this.f146676f;
            k10.c0 c0Var = (k10.c0) this.f146677g;
            uq.b.e();
            if (this.f146675e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ol1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O(onMothersFamilyNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnMothersFamilyNameChanged onMothersFamilyNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f146676f = onMothersFamilyNameChanged;
            fVar.f146677g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lol1/h;", "<unused var>", "Lk10/c0;", "Lol1/i;", "state", "Lk10/l;", "<anonymous>", "(Lol1/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ol1.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146679f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f146679f;
            uq.b.e();
            if (this.f146678e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ol1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ol1.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f146679f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lol1/g;", "action", "Lk10/c0;", "Lol1/i;", "state", "Lk10/l;", "<anonymous>", "(Lol1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ol1.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f146681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f146682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146683h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f146684j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f146685k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f146686l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ pl1.a f146688n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(pl1.a aVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f146688n = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.Field fieldB = State.Field.b(state.getFathersName(), null, ((hz.g) v0.j(map, mk1.a.FATHERS_NAME)).a(), 1, null);
            State.Field fieldB2 = State.Field.b(state.getMothersName(), null, ((hz.g) v0.j(map, mk1.a.MOTHERS_NAME)).a(), 1, null);
            State.Field fieldB3 = State.Field.b(state.getMothersFamilyName(), null, ((hz.g) v0.j(map, mk1.a.MOTHERS_FAMILY_NAME)).a(), 1, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, null, fieldB, fieldB2, fieldB3, entry != null ? (mk1.a) entry.getKey() : null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f146686l;
            Object objE = uq.b.e();
            int i15 = this.f146685k;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f146681f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            vk1.a aVar = w.this.validateParentsDataUC;
            State state = (State) c0Var.a();
            final Map<mk1.a, hz.g> mapB = aVar.b(new vk1.a.Params(state.getFathersName().getValue(), state.getMothersName().getValue(), state.getMothersFamilyName().getValue()));
            pl1.a aVar2 = this.f146688n;
            w wVar = w.this;
            if (!mapB.isEmpty()) {
                Iterator<Map.Entry<mk1.a, hz.g>> it = mapB.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: ol1.b0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return w.h.O(mapB, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            State state2 = (State) c0Var.a();
            aVar2.h(new BeChildAndParentsData.ParentsData(state2.getFathersName().getValue(), state2.getMothersName().getValue(), state2.getMothersFamilyName().getValue()));
            sk1.a aVar3 = wVar.createConfirmationDocumentDataUC;
            kk1.a type = aVar2.getType();
            ConfirmationDocumentResult confirmationDocumentResultD = aVar2.d();
            ol1.a.Next next = new ol1.a.Next(aVar3.b(new sk1.a.Params(type, confirmationDocumentResultD != null ? confirmationDocumentResultD.getDocument() : null)));
            this.f146686l = vq.j.a(c0Var);
            this.f146680e = vq.j.a(mapB);
            this.f146681f = lVarC;
            this.f146682g = vq.j.a(lVarC);
            this.f146683h = 0;
            this.f146684j = 0;
            this.f146685k = 1;
            return wVar.F(next, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ol1.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = w.this.new h(this.f146688n, eVar);
            hVar.f146686l = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, ql1.d dVar, vk1.a aVar2, sk1.a aVar3, final pl1.a aVar4) {
        this.mapper = dVar;
        this.validateParentsDataUC = aVar2;
        this.createConfirmationDocumentDataUC = aVar3;
        BeChildAndParentsData.ParentsData parentsDataE = aVar4.e();
        State state = new State(aVar4.getType(), new State.Field(iy.c0.d(parentsDataE != null ? parentsDataE.getFathersName() : null), null, 2, null), new State.Field(iy.c0.d(parentsDataE != null ? parentsDataE.getMothersName() : null), null, 2, null), new State.Field(iy.c0.d(parentsDataE != null ? parentsDataE.getMothersMaidenName() : null), null, 2, null), null, 16, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ol1.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9(this.f146644a, aVar4, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.Data p9(State state) {
        return this.mapper.b(new ql1.d.Params(state, new er.l() { // from class: ol1.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.q9(this.f146639a, (iy.b0) obj);
            }
        }, new er.l() { // from class: ol1.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.r9(this.f146640a, (iy.b0) obj);
            }
        }, new er.l() { // from class: ol1.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.s9(this.f146641a, (iy.b0) obj);
            }
        }, b9(ol1.h.f146603a), b9(ol1.b.f146591a), b9(ol1.c.f146593a), b9(ol1.g.f146602a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(w wVar, iy.b0 b0Var) {
        wVar.d9(new OnFathersNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(w wVar, iy.b0 b0Var) {
        wVar.d9(new OnMothersNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(w wVar, iy.b0 b0Var) {
        wVar.d9(new OnMothersFamilyNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final w wVar, final pl1.a aVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ol1.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f146642a, aVar, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(w wVar, pl1.a aVar, k10.z zVar) {
        b bVar = wVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ol1.b.class), oVar, bVar);
        zVar.x(q0.c(ol1.c.class), oVar, wVar.new c(null));
        zVar.v(q0.c(OnFathersNameChanged.class), oVar, new d(null));
        zVar.v(q0.c(OnMothersNameChanged.class), oVar, new e(null));
        zVar.v(q0.c(OnMothersFamilyNameChanged.class), oVar, new f(null));
        zVar.v(q0.c(ol1.h.class), oVar, new g(null));
        zVar.v(q0.c(ol1.g.class), oVar, wVar.new h(aVar, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ol1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ol1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(pl1.a aVar) {
        super.P5(aVar);
    }
}
