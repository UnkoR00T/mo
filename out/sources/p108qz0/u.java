package p108qz0;

import androidx.appcompat.app.f;
import er.p;
import er.q;
import fr.q0;
import k10.c0;
import k10.l;
import k10.o;
import k10.t;
import k10.z;
import l00.g;
import lz0.a;
import mu.h;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lqz0/u;", "Ll00/g;", "Lqz0/e;", "", "Lqz0/f;", "Lyy/a;", "stateMachineFactory", "Lrz0/b;", "mapper", "Lmz0/a;", "getChosenThemeUC", "Lpz0/d;", "setChosenThemeUCImpl", "<init>", "(Lyy/a;Lrz0/b;Lmz0/a;Lpz0/d;)V", "state", "Lqz0/f$a;", "m9", "(Lqz0/e;)Lqz0/f$a;", "b", "Lrz0/b;", "c", "Lmz0/a;", "d", "Lpz0/d;", "e", "Lqz0/e;", "initialState", "Lxw/b;", "Lqz0/c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz0.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz0.a getChosenThemeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pz0.d setChosenThemeUCImpl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p108qz0.c> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f169646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f169647b;

        /* JADX INFO: renamed from: qz0.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4288a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f169648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f169649b;

            /* JADX INFO: renamed from: qz0.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4289a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f169650d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f169651e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f169652f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f169654h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f169655j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f169656k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f169657l;

                public C4289a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f169650d = obj;
                    this.f169651e |= PKIFailureInfo.systemUnavail;
                    return C4288a.this.F(null, this);
                }
            }

            public C4288a(h hVar, u uVar) {
                this.f169648a = hVar;
                this.f169649b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4289a c4289a;
                if (eVar instanceof C4289a) {
                    c4289a = (C4289a) eVar;
                    int i15 = c4289a.f169651e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4289a.f169651e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4289a = new C4289a(eVar);
                    }
                } else {
                    c4289a = new C4289a(eVar);
                }
                Object obj2 = c4289a.f169650d;
                Object objE = uq.b.e();
                int i16 = c4289a.f169651e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    h hVar = this.f169648a;
                    f.Data dataM9 = this.f169649b.m9((State) obj);
                    c4289a.f169652f = j.a(obj);
                    c4289a.f169654h = j.a(c4289a);
                    c4289a.f169655j = j.a(obj);
                    c4289a.f169656k = j.a(hVar);
                    c4289a.f169657l = 0;
                    c4289a.f169651e = 1;
                    if (hVar.F(dataM9, c4289a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f169646a = gVar;
            this.f169647b = uVar;
        }

        @Override // mu.g
        public Object a(h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f169646a.a(new C4288a(hVar, this.f169647b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lqz0/e;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<c0<State>, tq.e<? super l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169659f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(lz0.a aVar, State state) {
            return State.b(state, null, aVar, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f169659f;
            Object objE = uq.b.e();
            int i15 = this.f169658e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz0.a aVar = u.this.getChosenThemeUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f169659f = c0Var;
                this.f169658e = 1;
                obj = aVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final lz0.a aVar2 = (lz0.a) obj;
            return c0Var.b(new er.l() { // from class: qz0.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.b.O(aVar2, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f169659f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqz0/a;", "<unused var>", "Lqz0/e;", "Loq/i0;", "<anonymous>", "(Lqz0/a;Lqz0/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<p108qz0.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169661e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f169661e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p108qz0.c> bVarY1 = u.this.Y1();
                qz0.c.a aVar = qz0.c.a.f169605a;
                this.f169661e = 1;
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
        public final Object w(p108qz0.a aVar, State state, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqz0/b;", "<unused var>", "Lk10/c0;", "Lqz0/e;", "state", "Lk10/l;", "<anonymous>", "(Lqz0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements q<p108qz0.b, c0<State>, tq.e<? super l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f169663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169664f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f169664f;
            uq.b.e();
            if (this.f169663e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return ((State) c0Var.a()).getFocusRestorationIndex() != null ? c0Var.b(new er.l() { // from class: qz0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O((State) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p108qz0.b bVar, c0<State> c0Var, tq.e<? super l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f169664f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqz0/d;", "action", "Lk10/c0;", "Lqz0/e;", "state", "Lk10/l;", "<anonymous>", "(Lqz0/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements q<SetChosenTheme, c0<State>, tq.e<? super l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f169665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f169666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f169667g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f169668h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f169670a;

            static {
                int[] iArr = new int[lz0.a.values().length];
                try {
                    iArr[lz0.a.SYSTEM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz0.a.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz0.a.DARK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f169670a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetChosenTheme setChosenTheme, Integer num, State state) {
            return State.b(state, null, setChosenTheme.getChosenTheme(), num, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            final Integer num;
            final SetChosenTheme setChosenTheme = (SetChosenTheme) this.f169667g;
            c0 c0Var = (c0) this.f169668h;
            Object objE = uq.b.e();
            int i16 = this.f169666f;
            if (i16 == 0) {
                oq.u.b(obj);
                if (setChosenTheme.getChosenTheme() == ((State) c0Var.a()).getChosenTheme()) {
                    return c0Var.c();
                }
                Integer numE = vq.b.e(((State) c0Var.a()).e().indexOf(setChosenTheme.getChosenTheme()));
                if (numE.intValue() < 0) {
                    numE = null;
                }
                int i17 = a.f169670a[setChosenTheme.getChosenTheme().ordinal()];
                if (i17 != 1) {
                    i15 = 2;
                    if (i17 == 2) {
                        i15 = 1;
                    } else if (i17 != 3) {
                        throw new oq.p();
                    }
                } else {
                    i15 = -1;
                }
                f.L(i15);
                pz0.d dVar = u.this.setChosenThemeUCImpl;
                pz0.d.Params params = new pz0.d.Params(setChosenTheme.getChosenTheme());
                this.f169667g = setChosenTheme;
                this.f169668h = c0Var;
                this.f169665e = numE;
                this.f169666f = 1;
                if (dVar.d(params, this) == objE) {
                    return objE;
                }
                num = numE;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) this.f169665e;
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: qz0.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(setChosenTheme, num, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetChosenTheme setChosenTheme, c0<State> c0Var, tq.e<? super l<State>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f169667g = setChosenTheme;
            eVar2.f169668h = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, rz0.b bVar, mz0.a aVar2, pz0.d dVar) {
        this.mapper = bVar;
        this.getChosenThemeUC = aVar2;
        this.setChosenThemeUCImpl = dVar;
        lz0.a aVar3 = lz0.a.LIGHT;
        State state = new State(v.q(aVar3, lz0.a.DARK, lz0.a.SYSTEM), aVar3, null, 4, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: qz0.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.p9(this.f169636a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(State state) {
        return this.mapper.b(new rz0.b.Params(state, b9(p108qz0.a.f169602a), new er.l() { // from class: qz0.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.n9(this.f169638a, (a) obj);
            }
        }, b9(p108qz0.b.f169604a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(u uVar, lz0.a aVar) {
        uVar.d9(new SetChosenTheme(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qz0.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.q9(this.f169637a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(u uVar, z zVar) {
        zVar.A(uVar.new b(null));
        c cVar = uVar.new c(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p108qz0.a.class), oVar, cVar);
        zVar.v(q0.c(p108qz0.b.class), oVar, new d(null));
        zVar.v(q0.c(SetChosenTheme.class), oVar, uVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p108qz0.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
