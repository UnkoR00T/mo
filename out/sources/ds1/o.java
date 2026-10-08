package ds1;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lds1/o;", "Ll00/g;", "Lds1/f;", "", "Lds1/g;", "Lyy/a;", "stateMachineFactory", "Les1/a;", "mapper", "Lb14/b;", "getAppVersionUC", "Lb14/c;", "setAppVersionOverrideUC", "Lb14/a;", "clearAppVersionOverrideUC", "<init>", "(Lyy/a;Les1/a;Lb14/b;Lb14/c;Lb14/a;)V", "Lds1/g$a;", "m9", "(Lds1/f;)Lds1/g$a;", "b", "Les1/a;", "c", "Lb14/c;", "d", "Lb14/a;", "e", "Lds1/f;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lds1/d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final es1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b14.c setAppVersionOverrideUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b14.a clearAppVersionOverrideUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ds1.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f44323b;

        /* JADX INFO: renamed from: ds1.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0999a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44324a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f44325b;

            /* JADX INFO: renamed from: ds1.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1000a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44326d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44327e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44328f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44330h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44331j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44332k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44333l;

                public C1000a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44326d = obj;
                    this.f44327e |= PKIFailureInfo.systemUnavail;
                    return C0999a.this.F(null, this);
                }
            }

            public C0999a(mu.h hVar, o oVar) {
                this.f44324a = hVar;
                this.f44325b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1000a c1000a;
                if (eVar instanceof C1000a) {
                    c1000a = (C1000a) eVar;
                    int i15 = c1000a.f44327e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1000a.f44327e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1000a = new C1000a(eVar);
                    }
                } else {
                    c1000a = new C1000a(eVar);
                }
                Object obj2 = c1000a.f44326d;
                Object objE = uq.b.e();
                int i16 = c1000a.f44327e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f44324a;
                    g.Data dataM9 = this.f44325b.m9((State) obj);
                    c1000a.f44328f = vq.j.a(obj);
                    c1000a.f44330h = vq.j.a(c1000a);
                    c1000a.f44331j = vq.j.a(obj);
                    c1000a.f44332k = vq.j.a(hVar);
                    c1000a.f44333l = 0;
                    c1000a.f44327e = 1;
                    if (hVar.F(dataM9, c1000a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f44322a = gVar;
            this.f44323b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f44322a.a(new C0999a(hVar, this.f44323b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lds1/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b14.b f44336g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b14.b bVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f44336g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(String str, State state) {
            return state.a(str, str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f44335f;
            uq.b.e();
            if (this.f44334e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = this.f44336g.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: ds1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.O(strA, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f44336g, eVar);
            bVar.f44335f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lds1/a;", "<unused var>", "Lds1/f;", "Loq/i0;", "<anonymous>", "(Lds1/a;Lds1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ds1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44337e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44337e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ds1.d> bVarY1 = o.this.Y1();
                ds1.d.a aVar = ds1.d.a.f44295a;
                this.f44337e = 1;
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
        public final Object w(ds1.a aVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lds1/c;", "action", "Lk10/c0;", "Lds1/f;", "state", "Lk10/l;", "<anonymous>", "(Lds1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<InputValueChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44340f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44341g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(InputValueChanged inputValueChanged, State state) {
            return State.b(state, null, inputValueChanged.getValue(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final InputValueChanged inputValueChanged = (InputValueChanged) this.f44340f;
            c0 c0Var = (c0) this.f44341g;
            uq.b.e();
            if (this.f44339e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ds1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O(inputValueChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(InputValueChanged inputValueChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f44340f = inputValueChanged;
            dVar.f44341g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lds1/e;", "<unused var>", "Lk10/c0;", "Lds1/f;", "state", "Lk10/l;", "<anonymous>", "(Lds1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ds1.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44343f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b14.b f44345h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b14.b bVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f44345h = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(String str, State state) {
            return State.b(state, str, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f44343f;
            Object objE = uq.b.e();
            int i15 = this.f44342e;
            if (i15 == 0) {
                oq.u.b(obj);
                b14.c cVar = o.this.setAppVersionOverrideUC;
                b14.c.Params params = new b14.c.Params(((State) c0Var.a()).getInputValue());
                this.f44343f = c0Var;
                this.f44342e = 1;
                if (cVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final String strA = this.f44345h.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: ds1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.e.O(strA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ds1.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            e eVar3 = o.this.new e(this.f44345h, eVar2);
            eVar3.f44343f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lds1/b;", "<unused var>", "Lk10/c0;", "Lds1/f;", "state", "Lk10/l;", "<anonymous>", "(Lds1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ds1.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44347f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b14.b f44349h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b14.b bVar, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f44349h = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(String str, State state) {
            return state.a(str, str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f44347f;
            Object objE = uq.b.e();
            int i15 = this.f44346e;
            if (i15 == 0) {
                oq.u.b(obj);
                b14.a aVar = o.this.clearAppVersionOverrideUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f44347f = c0Var;
                this.f44346e = 1;
                if (aVar.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final String strA = this.f44349h.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: ds1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(strA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ds1.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = o.this.new f(this.f44349h, eVar);
            fVar.f44347f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, es1.a aVar2, final b14.b bVar, b14.c cVar, b14.a aVar3) {
        this.mapper = aVar2;
        this.setAppVersionOverrideUC = cVar;
        this.clearAppVersionOverrideUC = aVar3;
        State state = new State("", "");
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ds1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(bVar, this, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data m9(State state) {
        return this.mapper.b(new es1.a.Params(state, b9(ds1.a.f44292a), new er.l() { // from class: ds1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f44312a, (String) obj);
            }
        }, b9(ds1.e.f44296a), b9(ds1.b.f44293a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, String str) {
        oVar.d9(new InputValueChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final b14.b bVar, final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ds1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(bVar, oVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(b14.b bVar, o oVar, z zVar) {
        zVar.A(new b(bVar, null));
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ds1.a.class), oVar2, cVar);
        zVar.v(q0.c(InputValueChanged.class), oVar2, new d(null));
        zVar.v(q0.c(ds1.e.class), oVar2, oVar.new e(bVar, null));
        zVar.v(q0.c(ds1.b.class), oVar2, oVar.new f(bVar, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ds1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
