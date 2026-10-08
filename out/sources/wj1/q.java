package wj1;

import fr.q0;
import iy.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vi1.ChildParticipant;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u0019088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lwj1/q;", "Ll00/g;", "Lwj1/c;", "Lwj1/a;", "Lwj1/d;", "", "Lyy/a;", "stateMachineFactory", "Lxj1/a;", "mapper", "Lj14/m;", "checkPeselNumberCorrectUC", "Lwi1/i;", "validateParticipantNameUC", "Lwi1/d;", "isAgeFromPeselValidForTrainingUC", "Lmx/c;", "labelProvider", "Lwj1/b;", "setupData", "<init>", "(Lyy/a;Lxj1/a;Lj14/m;Lwi1/i;Lwi1/d;Lmx/c;Lwj1/b;)V", "Lwj1/e;", "o9", "(Lwj1/e;Ltq/e;)Ljava/lang/Object;", "Lwj1/d$a;", "p9", "(Lwj1/c;)Lwj1/d$a;", "b", "Lxj1/a;", "c", "Lj14/m;", "d", "Lwi1/i;", "e", "Lwi1/d;", "f", "Lmx/c;", "g", "Lwj1/b;", "h", "Lwj1/c;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwj1/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, wj1.a> implements wj1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xj1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wi1.i validateParticipantNameUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wi1.d isAgeFromPeselValidForTrainingUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, wj1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wj1.a.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<wj1.d.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f213820a;

        static {
            int[] iArr = new int[wi1.d.b.values().length];
            try {
                iArr[wi1.d.b.Valid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wi1.d.b.Invalid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wi1.d.b.IncorrectPesel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f213820a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f213824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f213825h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f213826j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f213827k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f213828l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f213829m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f213830n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f213831p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f213832q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f213834s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213832q = obj;
            this.f213834s |= PKIFailureInfo.systemUnavail;
            return q.this.o9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<wj1.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f213835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f213836b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f213837a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f213838b;

            /* JADX INFO: renamed from: wj1.q$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5653a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f213839d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f213840e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213841f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213843h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213844j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213845k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f213846l;

                public C5653a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f213839d = obj;
                    this.f213840e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f213837a = hVar;
                this.f213838b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5653a c5653a;
                if (eVar instanceof C5653a) {
                    c5653a = (C5653a) eVar;
                    int i15 = c5653a.f213840e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5653a.f213840e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5653a = new C5653a(eVar);
                    }
                } else {
                    c5653a = new C5653a(eVar);
                }
                Object obj2 = c5653a.f213839d;
                Object objE = uq.b.e();
                int i16 = c5653a.f213840e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f213837a;
                    wj1.d.Data dataP9 = this.f213838b.p9((State) obj);
                    c5653a.f213841f = vq.j.a(obj);
                    c5653a.f213843h = vq.j.a(c5653a);
                    c5653a.f213844j = vq.j.a(obj);
                    c5653a.f213845k = vq.j.a(hVar);
                    c5653a.f213846l = 0;
                    c5653a.f213840e = 1;
                    if (hVar.F(dataP9, c5653a) == objE) {
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

        public c(mu.g gVar, q qVar) {
            this.f213835a = gVar;
            this.f213836b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wj1.d.Data> hVar, tq.e eVar) {
            Object objA = this.f213835a.a(new a(hVar, this.f213836b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwj1/a$d;", "action", "Lwj1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwj1/a$d;Lwj1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wj1.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213848f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wj1.a.d dVar = (wj1.a.d) this.f213848f;
            Object objE = uq.b.e();
            int i15 = this.f213847e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wj1.a.d> bVarY1 = q.this.Y1();
                this.f213848f = vq.j.a(dVar);
                this.f213847e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(wj1.a.d dVar, State state, tq.e<? super i0> eVar) {
            d dVar2 = q.this.new d(eVar);
            dVar2.f213848f = dVar;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwj1/a$a;", "action", "Lk10/c0;", "Lwj1/c;", "state", "Lk10/l;", "<anonymous>", "(Lwj1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wj1.a.ChangeFirstName, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213852g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(wj1.a.ChangeFirstName changeFirstName, State state) {
            return state.a(state.getFields().h(changeFirstName.getFirstName(), hz.b.C2039b.f86846c), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wj1.a.ChangeFirstName changeFirstName = (wj1.a.ChangeFirstName) this.f213851f;
            c0 c0Var = (c0) this.f213852g;
            uq.b.e();
            if (this.f213850e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wj1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(changeFirstName, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wj1.a.ChangeFirstName changeFirstName, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f213851f = changeFirstName;
            eVar2.f213852g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwj1/a$b;", "action", "Lk10/c0;", "Lwj1/c;", "state", "Lk10/l;", "<anonymous>", "(Lwj1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<wj1.a.ChangeLastName, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213855g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(wj1.a.ChangeLastName changeLastName, State state) {
            return state.a(state.getFields().i(changeLastName.getLastName(), hz.b.C2039b.f86846c), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wj1.a.ChangeLastName changeLastName = (wj1.a.ChangeLastName) this.f213854f;
            c0 c0Var = (c0) this.f213855g;
            uq.b.e();
            if (this.f213853e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wj1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(changeLastName, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wj1.a.ChangeLastName changeLastName, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f213854f = changeLastName;
            fVar.f213855g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwj1/a$c;", "action", "Lk10/c0;", "Lwj1/c;", "state", "Lk10/l;", "<anonymous>", "(Lwj1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<wj1.a.ChangePesel, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213857f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213858g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(wj1.a.ChangePesel changePesel, State state) {
            return state.a(state.getFields().j(changePesel.getPesel(), hz.b.C2039b.f86846c), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wj1.a.ChangePesel changePesel = (wj1.a.ChangePesel) this.f213857f;
            c0 c0Var = (c0) this.f213858g;
            uq.b.e();
            if (this.f213856e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wj1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O(changePesel, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wj1.a.ChangePesel changePesel, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f213857f = changePesel;
            gVar.f213858g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwj1/a$e;", "<unused var>", "Lk10/c0;", "Lwj1/c;", "state", "Lk10/l;", "<anonymous>", "(Lwj1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wj1.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f213860f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(WriteChildFields.b bVar, WriteChildFields writeChildFields, State state) {
            return state.a(writeChildFields, new d60.j<>(bVar));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f213860f;
            Object objE = uq.b.e();
            int i15 = this.f213859e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                WriteChildFields fields = ((State) c0Var.a()).getFields();
                this.f213860f = c0Var;
                this.f213859e = 1;
                obj = qVar.o9(fields, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final WriteChildFields writeChildFields = (WriteChildFields) obj;
            final WriteChildFields.b bVarD = writeChildFields.d();
            if (bVarD != null) {
                return c0Var.b(new er.l() { // from class: wj1.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.h.O(bVarD, writeChildFields, (State) obj2);
                    }
                });
            }
            q.this.d9(new wj1.a.d.BackWithData(new ChildParticipant(writeChildFields.getFirstName().getFirstName(), writeChildFields.getLastName().getLastName(), writeChildFields.getPesel().getPesel(), true, true, true, null)));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wj1.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            h hVar = q.this.new h(eVar2);
            hVar.f213860f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, xj1.a aVar2, j14.m mVar, wi1.i iVar, wi1.d dVar, mx.c cVar, SetupData setupData) {
        this.mapper = aVar2;
        this.checkPeselNumberCorrectUC = mVar;
        this.validateParticipantNameUC = iVar;
        this.isAgeFromPeselValidForTrainingUC = dVar;
        this.labelProvider = cVar;
        this.setupData = setupData;
        State state = new State(null, null, 3, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: wj1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f213809a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0198 A[LOOP:0: B:39:0x0192->B:41:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x021b  */
    /* JADX WARN: Code duplicated, block: B:62:0x026f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0284  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:1: B:46:0x01b2->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object o9(WriteChildFields writeChildFields, tq.e<? super WriteChildFields> eVar) throws Throwable {
        b bVar;
        b0 b0VarG;
        WriteChildFields writeChildFields2;
        int i15;
        Object obj;
        b0 b0Var;
        WriteChildFields writeChildFields3;
        b0 b0Var2;
        hz.g gVar;
        int i16;
        hz.b bVarA;
        hz.g gVar2;
        ArrayList arrayList;
        Iterator<T> it;
        Iterator it4;
        hz.b invalid;
        Object objD;
        b0 b0Var3;
        b0 b0Var4;
        b0 b0Var5;
        WriteChildFields writeChildFields4;
        hz.g gVar3;
        WriteChildFields writeChildFields5;
        hz.b bVar2;
        int i17;
        int i18;
        WriteChildFields writeChildFields6;
        WriteChildFields writeChildFieldsH;
        Object objD2;
        WriteChildFields writeChildFields7;
        hz.b bVar3;
        b0 b0Var6;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i19 = bVar.f213834s;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f213834s = i19 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj2 = bVar.f213832q;
        Object objE = uq.b.e();
        int i25 = bVar.f213834s;
        int i26 = 0;
        if (i25 != 0) {
            if (i25 == 1) {
                int i27 = bVar.f213830n;
                hz.g gVar4 = (hz.g) bVar.f213825h;
                b0 b0Var7 = (b0) bVar.f213824g;
                b0 b0Var8 = (b0) bVar.f213823f;
                writeChildFields2 = (WriteChildFields) bVar.f213822e;
                WriteChildFields writeChildFields8 = (WriteChildFields) bVar.f213821d;
                oq.u.b(obj2);
                b0Var = b0Var8;
                b0Var2 = b0Var7;
                gVar = gVar4;
                i16 = i27;
                obj = obj2;
                writeChildFields3 = writeChildFields8;
                i15 = 1;
            } else {
                if (i25 == 2) {
                    i17 = bVar.f213831p;
                    i18 = bVar.f213830n;
                    b0Var4 = (b0) bVar.f213829m;
                    writeChildFields5 = (WriteChildFields) bVar.f213828l;
                    bVar2 = (hz.b) bVar.f213827k;
                    invalid = (hz.b) bVar.f213826j;
                    gVar3 = (hz.g) bVar.f213825h;
                    b0Var3 = (b0) bVar.f213824g;
                    b0Var5 = (b0) bVar.f213823f;
                    writeChildFields6 = (WriteChildFields) bVar.f213822e;
                    writeChildFields4 = (WriteChildFields) bVar.f213821d;
                    oq.u.b(obj2);
                    writeChildFieldsH = writeChildFields5.h(b0Var4, ((hz.g) obj2).a());
                    wi1.i iVar = this.validateParticipantNameUC;
                    wi1.i.a.b bVar4 = new wi1.i.a.b(b0Var3);
                    bVar.f213821d = vq.j.a(writeChildFields4);
                    bVar.f213822e = vq.j.a(writeChildFields6);
                    bVar.f213823f = vq.j.a(b0Var5);
                    bVar.f213824g = vq.j.a(b0Var3);
                    bVar.f213825h = vq.j.a(gVar3);
                    bVar.f213826j = invalid;
                    bVar.f213827k = vq.j.a(bVar2);
                    bVar.f213828l = writeChildFieldsH;
                    bVar.f213829m = b0Var3;
                    bVar.f213830n = i18;
                    bVar.f213831p = i17;
                    bVar.f213834s = 3;
                    objD2 = iVar.d(bVar4, bVar);
                    if (objD2 != objE) {
                        writeChildFields7 = writeChildFieldsH;
                        obj2 = objD2;
                        bVar3 = invalid;
                        b0Var6 = b0Var3;
                    }
                    return objE;
                }
                if (i25 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var6 = (b0) bVar.f213829m;
                writeChildFields7 = (WriteChildFields) bVar.f213828l;
                bVar3 = (hz.b) bVar.f213826j;
                oq.u.b(obj2);
            }
            return WriteChildFields.k(writeChildFields7.i(b0Var6, ((hz.g) obj2).a()), null, bVar3, 1, null);
        }
        oq.u.b(obj2);
        b0 b0VarG2 = iy.c0.g(dz.e.e(iy.c0.e(writeChildFields.getFirstName().getFirstName())));
        b0VarG = iy.c0.g(dz.e.e(iy.c0.e(writeChildFields.getLastName().getLastName())));
        hz.g gVarA = this.checkPeselNumberCorrectUC.a(new j14.m.Params(iy.c0.e(writeChildFields.getPesel().getPesel()), false, 2, null));
        if (gVarA instanceof hz.g.Invalid) {
            writeChildFields2 = writeChildFields;
            bVarA = gVarA.a();
            b0Var = b0VarG2;
            writeChildFields3 = writeChildFields2;
            gVar2 = gVarA;
            i16 = 0;
            List<ChildParticipant> listA = this.setupData.a();
            arrayList = new ArrayList(pq.v.y(listA, 10));
            it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChildParticipant) it.next()).getPesel());
            }
            if (!arrayList.isEmpty()) {
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (((b0) it4.next()).c(writeChildFields2.getPesel().getPesel())) {
                        i26 = 1;
                        break;
                    }
                }
            }
            if (i26 == 1) {
                invalid = new hz.b.Invalid(this.labelProvider.c(ri1.b.X1));
            } else {
                if (i26 == 0) {
                    throw new oq.p();
                }
                invalid = bVarA;
            }
            wi1.i iVar2 = this.validateParticipantNameUC;
            wi1.i.a.C5648a c5648a = new wi1.i.a.C5648a(b0Var);
            bVar.f213821d = vq.j.a(writeChildFields3);
            bVar.f213822e = vq.j.a(writeChildFields2);
            bVar.f213823f = vq.j.a(b0Var);
            bVar.f213824g = b0VarG;
            bVar.f213825h = vq.j.a(gVar2);
            bVar.f213826j = invalid;
            bVar.f213827k = vq.j.a(bVarA);
            bVar.f213828l = writeChildFields2;
            bVar.f213829m = b0Var;
            bVar.f213830n = i16;
            bVar.f213831p = i26;
            bVar.f213834s = 2;
            objD = iVar2.d(c5648a, bVar);
            if (objD != objE) {
                b0Var3 = b0VarG;
                b0Var4 = b0Var;
                b0Var5 = b0Var4;
                writeChildFields4 = writeChildFields3;
                obj2 = objD;
                gVar3 = gVar2;
                writeChildFields5 = writeChildFields2;
                bVar2 = bVarA;
                i17 = i26;
                i18 = i16;
                writeChildFields6 = writeChildFields5;
                writeChildFieldsH = writeChildFields5.h(b0Var4, ((hz.g) obj2).a());
                wi1.i iVar3 = this.validateParticipantNameUC;
                wi1.i.a.b bVar5 = new wi1.i.a.b(b0Var3);
                bVar.f213821d = vq.j.a(writeChildFields4);
                bVar.f213822e = vq.j.a(writeChildFields6);
                bVar.f213823f = vq.j.a(b0Var5);
                bVar.f213824g = vq.j.a(b0Var3);
                bVar.f213825h = vq.j.a(gVar3);
                bVar.f213826j = invalid;
                bVar.f213827k = vq.j.a(bVar2);
                bVar.f213828l = writeChildFieldsH;
                bVar.f213829m = b0Var3;
                bVar.f213830n = i18;
                bVar.f213831p = i17;
                bVar.f213834s = 3;
                objD2 = iVar3.d(bVar5, bVar);
                if (objD2 != objE) {
                    writeChildFields7 = writeChildFieldsH;
                    obj2 = objD2;
                    bVar3 = invalid;
                    b0Var6 = b0Var3;
                    return WriteChildFields.k(writeChildFields7.i(b0Var6, ((hz.g) obj2).a()), null, bVar3, 1, null);
                }
            }
        } else {
            if (!fr.t.c(gVarA, hz.g.b.f86853b)) {
                throw new oq.p();
            }
            wi1.d dVar = this.isAgeFromPeselValidForTrainingUC;
            b0 pesel = writeChildFields.getPesel().getPesel();
            bVar.f213821d = vq.j.a(writeChildFields);
            writeChildFields2 = writeChildFields;
            bVar.f213822e = writeChildFields2;
            bVar.f213823f = b0VarG2;
            bVar.f213824g = b0VarG;
            bVar.f213825h = vq.j.a(gVarA);
            bVar.f213830n = 0;
            i15 = 1;
            bVar.f213834s = 1;
            Object objD3 = dVar.d(pesel, bVar);
            if (objD3 != objE) {
                obj = objD3;
                b0Var = b0VarG2;
                writeChildFields3 = writeChildFields2;
                b0Var2 = b0VarG;
                gVar = gVarA;
                i16 = 0;
            }
        }
        return objE;
        int i28 = a.f213820a[((wi1.d.b) obj).ordinal()];
        if (i28 == i15) {
            bVarA = hz.b.d.f86848c;
        } else if (i28 == 2) {
            bVarA = new hz.b.Invalid(this.labelProvider.c(ri1.b.Y1));
        } else {
            if (i28 != 3) {
                throw new oq.p();
            }
            bVarA = new hz.b.Invalid(this.labelProvider.c(ri1.b.E));
        }
        b0 b0Var9 = b0Var2;
        gVar2 = gVar;
        b0VarG = b0Var9;
        List<ChildParticipant> listA2 = this.setupData.a();
        arrayList = new ArrayList(pq.v.y(listA2, 10));
        it = listA2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildParticipant) it.next()).getPesel());
        }
        if (!arrayList.isEmpty()) {
            it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (((b0) it4.next()).c(writeChildFields2.getPesel().getPesel())) {
                    i26 = 1;
                    break;
                }
            }
        }
        if (i26 == 1) {
            invalid = new hz.b.Invalid(this.labelProvider.c(ri1.b.X1));
        } else {
            if (i26 == 0) {
                throw new oq.p();
            }
            invalid = bVarA;
        }
        wi1.i iVar4 = this.validateParticipantNameUC;
        wi1.i.a.C5648a c5648a2 = new wi1.i.a.C5648a(b0Var);
        bVar.f213821d = vq.j.a(writeChildFields3);
        bVar.f213822e = vq.j.a(writeChildFields2);
        bVar.f213823f = vq.j.a(b0Var);
        bVar.f213824g = b0VarG;
        bVar.f213825h = vq.j.a(gVar2);
        bVar.f213826j = invalid;
        bVar.f213827k = vq.j.a(bVarA);
        bVar.f213828l = writeChildFields2;
        bVar.f213829m = b0Var;
        bVar.f213830n = i16;
        bVar.f213831p = i26;
        bVar.f213834s = 2;
        objD = iVar4.d(c5648a2, bVar);
        if (objD != objE) {
            b0Var3 = b0VarG;
            b0Var4 = b0Var;
            b0Var5 = b0Var4;
            writeChildFields4 = writeChildFields3;
            obj2 = objD;
            gVar3 = gVar2;
            writeChildFields5 = writeChildFields2;
            bVar2 = bVarA;
            i17 = i26;
            i18 = i16;
            writeChildFields6 = writeChildFields5;
            writeChildFieldsH = writeChildFields5.h(b0Var4, ((hz.g) obj2).a());
            wi1.i iVar5 = this.validateParticipantNameUC;
            wi1.i.a.b bVar6 = new wi1.i.a.b(b0Var3);
            bVar.f213821d = vq.j.a(writeChildFields4);
            bVar.f213822e = vq.j.a(writeChildFields6);
            bVar.f213823f = vq.j.a(b0Var5);
            bVar.f213824g = vq.j.a(b0Var3);
            bVar.f213825h = vq.j.a(gVar3);
            bVar.f213826j = invalid;
            bVar.f213827k = vq.j.a(bVar2);
            bVar.f213828l = writeChildFieldsH;
            bVar.f213829m = b0Var3;
            bVar.f213830n = i18;
            bVar.f213831p = i17;
            bVar.f213834s = 3;
            objD2 = iVar5.d(bVar6, bVar);
            if (objD2 != objE) {
                writeChildFields7 = writeChildFieldsH;
                obj2 = objD2;
                bVar3 = invalid;
                b0Var6 = b0Var3;
                return WriteChildFields.k(writeChildFields7.i(b0Var6, ((hz.g) obj2).a()), null, bVar3, 1, null);
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wj1.d.Data p9(State state) {
        return this.mapper.b(new xj1.a.Params(state, b9(wj1.a.d.C5651a.f213761a), b9(wj1.a.e.f213764a), new er.l() { // from class: wj1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f213806a, (String) obj);
            }
        }, new er.l() { // from class: wj1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f213807a, (String) obj);
            }
        }, new er.l() { // from class: wj1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f213808a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, String str) {
        qVar.d9(new wj1.a.ChangeFirstName(iy.c0.g(str)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, String str) {
        qVar.d9(new wj1.a.ChangeLastName(iy.c0.g(str)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, String str) {
        qVar.d9(new wj1.a.ChangePesel(xw.g.c(iy.c0.g(str)), null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: wj1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f213805a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(q qVar, z zVar) {
        d dVar = qVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wj1.a.d.class), oVar, dVar);
        zVar.v(q0.c(wj1.a.ChangeFirstName.class), oVar, new e(null));
        zVar.v(q0.c(wj1.a.ChangeLastName.class), oVar, new f(null));
        zVar.v(q0.c(wj1.a.ChangePesel.class), oVar, new g(null));
        zVar.v(q0.c(wj1.a.e.class), oVar, qVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<wj1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, wj1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wj1.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
