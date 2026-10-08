package zw1;

import f00.j0;
import fr.q0;
import iy.b0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00017B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lzw1/r;", "Ll00/g;", "Lzw1/b;", "Lzw1/a;", "Lzw1/c;", "", "Lyy/a;", "stateMachineFactory", "Lax1/g;", "mapper", "Lrw1/c;", "checkIfPinIsValidUseCase", "Lrw1/b;", "checkIfNewPinIsValidUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Lzw1/d;", "setupContract", "<init>", "(Lyy/a;Lax1/g;Lrw1/c;Lrw1/b;Lxw1/c;Lzw1/d;)V", "state", "Lzw1/c$a;", "r9", "(Lzw1/b;)Lzw1/c$a;", "b", "Lax1/g;", "c", "Lrw1/c;", "d", "Lrw1/b;", "e", "Lxw1/c;", "f", "Lzw1/d;", "g", "Lzw1/b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzw1/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, zw1.a> implements zw1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ax1.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rw1.c checkIfPinIsValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rw1.b checkIfNewPinIsValidUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zw1.d setupContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, zw1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zw1.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<zw1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lzw1/r$a;", "Lf00/j0;", "Lzw1/d;", "Lzw1/r;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<zw1.d, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<zw1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f238173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f238174b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f238175a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f238176b;

            /* JADX INFO: renamed from: zw1.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6434a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f238177d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f238178e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f238179f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f238181h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f238182j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f238183k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f238184l;

                public C6434a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f238177d = obj;
                    this.f238178e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f238175a = hVar;
                this.f238176b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6434a c6434a;
                if (eVar instanceof C6434a) {
                    c6434a = (C6434a) eVar;
                    int i15 = c6434a.f238178e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6434a.f238178e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6434a = new C6434a(eVar);
                    }
                } else {
                    c6434a = new C6434a(eVar);
                }
                Object obj2 = c6434a.f238177d;
                Object objE = uq.b.e();
                int i16 = c6434a.f238178e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f238175a;
                    zw1.c.Data dataR9 = this.f238176b.r9((State) obj);
                    c6434a.f238179f = vq.j.a(obj);
                    c6434a.f238181h = vq.j.a(c6434a);
                    c6434a.f238182j = vq.j.a(obj);
                    c6434a.f238183k = vq.j.a(hVar);
                    c6434a.f238184l = 0;
                    c6434a.f238178e = 1;
                    if (hVar.F(dataR9, c6434a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f238173a = gVar;
            this.f238174b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super zw1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f238173a.a(new a(hVar, this.f238174b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzw1/a$b;", "<unused var>", "Lzw1/b;", "Loq/i0;", "<anonymous>", "(Lzw1/a$b;Lzw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<zw1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238185e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238185e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zw1.a.c> bVarY1 = r.this.Y1();
                zw1.a.c.b bVar = zw1.a.c.b.f238114a;
                this.f238185e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(zw1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzw1/a$a;", "<unused var>", "Lzw1/b;", "Loq/i0;", "<anonymous>", "(Lzw1/a$a;Lzw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<zw1.a.C6431a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238187e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238187e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zw1.a.c> bVarY1 = r.this.Y1();
                zw1.a.c.C6432a c6432a = zw1.a.c.C6432a.f238113a;
                this.f238187e = 1;
                if (bVarY1.F(c6432a, this) == objE) {
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
        public final Object w(zw1.a.C6431a c6431a, State state, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzw1/a$d;", "action", "Lk10/c0;", "Lzw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lzw1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<zw1.a.NewPinInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238191g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(zw1.a.NewPinInputChange newPinInputChange, State state) {
            return State.b(state, null, newPinInputChange.getNumber(), null, hz.b.C2039b.f86846c, null, 21, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zw1.a.NewPinInputChange newPinInputChange = (zw1.a.NewPinInputChange) this.f238190f;
            c0 c0Var = (c0) this.f238191g;
            uq.b.e();
            if (this.f238189e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zw1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(newPinInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zw1.a.NewPinInputChange newPinInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f238190f = newPinInputChange;
            eVar2.f238191g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzw1/a$g;", "action", "Lk10/c0;", "Lzw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lzw1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<zw1.a.RepeatedNewPinInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238194g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(zw1.a.RepeatedNewPinInputChange repeatedNewPinInputChange, State state) {
            return State.b(state, null, null, repeatedNewPinInputChange.getNumber(), null, hz.b.C2039b.f86846c, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zw1.a.RepeatedNewPinInputChange repeatedNewPinInputChange = (zw1.a.RepeatedNewPinInputChange) this.f238193f;
            c0 c0Var = (c0) this.f238194g;
            uq.b.e();
            if (this.f238192e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zw1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O(repeatedNewPinInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zw1.a.RepeatedNewPinInputChange repeatedNewPinInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f238193f = repeatedNewPinInputChange;
            fVar.f238194g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzw1/a$e;", "<unused var>", "Lk10/c0;", "Lzw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lzw1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<zw1.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f238196f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238197g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, State state) {
            return State.b(state, null, null, null, bVar, null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b.Companion companion;
            c0 c0Var = (c0) this.f238197g;
            Object objE = uq.b.e();
            int i15 = this.f238196f;
            if (i15 == 0) {
                oq.u.b(obj);
                hz.b.Companion companion2 = hz.b.INSTANCE;
                rw1.c cVar = r.this.checkIfPinIsValidUseCase;
                rw1.c.Params params = new rw1.c.Params(((State) c0Var.a()).getNewPin(), ((State) c0Var.a()).getNewPinScreenData().getCertificateType());
                this.f238197g = c0Var;
                this.f238195e = companion2;
                this.f238196f = 1;
                Object objD = cVar.d(params, this);
                if (objD == objE) {
                    return objE;
                }
                companion = companion2;
                obj = objD;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f238195e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            return c0Var.b(new er.l() { // from class: zw1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O(bVarA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zw1.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            g gVar = r.this.new g(eVar2);
            gVar.f238197g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzw1/a$h;", "<unused var>", "Lk10/c0;", "Lzw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lzw1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<zw1.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f238200f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238201g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, State state) {
            return State.b(state, null, null, null, null, bVar, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b.Companion companion;
            c0 c0Var = (c0) this.f238201g;
            Object objE = uq.b.e();
            int i15 = this.f238200f;
            if (i15 == 0) {
                oq.u.b(obj);
                hz.b.Companion companion2 = hz.b.INSTANCE;
                rw1.b bVar = r.this.checkIfNewPinIsValidUseCase;
                rw1.b.Params params = new rw1.b.Params(((State) c0Var.a()).getNewPin(), ((State) c0Var.a()).getRepeatedNewPin(), ((State) c0Var.a()).getNewPinScreenData().getCertificateType());
                this.f238201g = c0Var;
                this.f238199e = companion2;
                this.f238200f = 1;
                Object objD = bVar.d(params, this);
                if (objD == objE) {
                    return objE;
                }
                companion = companion2;
                obj = objD;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f238199e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            return c0Var.b(new er.l() { // from class: zw1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.h.O(bVarA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zw1.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar2 = r.this.new h(eVar);
            hVar2.f238201g = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzw1/a$j;", "<unused var>", "Lk10/c0;", "Lzw1/b;", "state", "Lk10/l;", "<anonymous>", "(Lzw1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<zw1.a.j, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f238204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f238205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f238206h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, hz.b bVar2, State state) {
            return State.b(state, null, null, null, bVar, bVar2, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b.Companion companion;
            final hz.b bVarA;
            hz.b.Companion companion2;
            c0 c0Var = (c0) this.f238206h;
            Object objE = uq.b.e();
            int i15 = this.f238205g;
            if (i15 == 0) {
                oq.u.b(obj);
                companion = hz.b.INSTANCE;
                rw1.c cVar = r.this.checkIfPinIsValidUseCase;
                rw1.c.Params params = new rw1.c.Params(((State) c0Var.a()).getNewPin(), ((State) c0Var.a()).getNewPinScreenData().getCertificateType());
                this.f238206h = c0Var;
                this.f238203e = companion;
                this.f238205g = 1;
                obj = cVar.d(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                companion = (hz.b.Companion) this.f238203e;
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion2 = (hz.b.Companion) this.f238204f;
                bVarA = (hz.b) this.f238203e;
                oq.u.b(obj);
            }
            final hz.b bVarA2 = companion2.a((hz.g) obj);
            k10.l lVarB = c0Var.b(new er.l() { // from class: zw1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.i.O(bVarA, bVarA2, (State) obj2);
                }
            });
            r.this.d9(zw1.a.f.f238121a);
            return lVarB;
            bVarA = companion.a((hz.g) obj);
            hz.b.Companion companion3 = hz.b.INSTANCE;
            rw1.b bVar = r.this.checkIfNewPinIsValidUseCase;
            rw1.b.Params params2 = new rw1.b.Params(((State) c0Var.a()).getNewPin(), ((State) c0Var.a()).getRepeatedNewPin(), ((State) c0Var.a()).getNewPinScreenData().getCertificateType());
            this.f238206h = c0Var;
            this.f238203e = bVarA;
            this.f238204f = companion3;
            this.f238205g = 2;
            Object objD = bVar.d(params2, this);
            if (objD != objE) {
                companion2 = companion3;
                obj = objD;
                final hz.b bVarA3 = companion2.a((hz.g) obj);
                k10.l lVarB2 = c0Var.b(new er.l() { // from class: zw1.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.i.O(bVarA, bVarA3, (State) obj2);
                    }
                });
                r.this.d9(zw1.a.f.f238121a);
                return lVarB2;
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zw1.a.j jVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f238206h = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzw1/a$f;", "<unused var>", "Lzw1/b;", "state", "Loq/i0;", "<anonymous>", "(Lzw1/a$f;Lzw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<zw1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238209f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f238209f;
            Object objE = uq.b.e();
            int i15 = this.f238208e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getRepeatedNewPinValidationState() instanceof hz.b.d) {
                    r.this.setupContract.t2(state.getNewPin());
                    xw.b<zw1.a.c> bVarY1 = r.this.Y1();
                    zw1.a.c.Next next = new zw1.a.c.Next(state.getNewPin());
                    this.f238209f = vq.j.a(state);
                    this.f238208e = 1;
                    if (bVarY1.F(next, this) == objE) {
                        return objE;
                    }
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
        public final Object w(zw1.a.f fVar, State state, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f238209f = state;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzw1/a$i;", "<unused var>", "Lzw1/b;", "state", "Loq/i0;", "<anonymous>", "(Lzw1/a$i;Lzw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<zw1.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238212f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f238212f;
            Object objE = uq.b.e();
            int i15 = this.f238211e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zw1.a.c> bVarY1 = r.this.Y1();
                zw1.a.c.ShowDialog showDialog = new zw1.a.c.ShowDialog(r.this.processInterruptDialogMapper.b(new xw1.c.Params(state.getNewPinScreenData().getProcessInterruptDialogTitle(), new er.a() { // from class: zw1.x
                    @Override // er.a
                    public final Object a() {
                        return r.k.O();
                    }
                }, r.this.b9(zw1.a.b.f238112a))));
                this.f238212f = vq.j.a(state);
                this.f238211e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zw1.a.i iVar, State state, tq.e<? super i0> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f238212f = state;
            return kVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ax1.g gVar, rw1.c cVar, rw1.b bVar, xw1.c cVar2, zw1.d dVar) {
        this.mapper = gVar;
        this.checkIfPinIsValidUseCase = cVar;
        this.checkIfNewPinIsValidUseCase = bVar;
        this.processInterruptDialogMapper = cVar2;
        this.setupContract = dVar;
        State state = new State(dVar.o3(), null, null, null, null, 30, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: zw1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f238163a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), r9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zw1.c.Data r9(State state) {
        ax1.g gVar = this.mapper;
        er.a<i0> aVarB9 = b9(zw1.a.e.f238120a);
        er.a<i0> aVarB10 = b9(zw1.a.h.f238124a);
        er.a<i0> aVarB11 = b9(zw1.a.C6431a.f238111a);
        er.a<i0> aVarB12 = b9(zw1.a.b.f238112a);
        er.a<i0> aVarB13 = b9(zw1.a.j.f238126a);
        return gVar.b(new ax1.g.Params(state, new er.l() { // from class: zw1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f238160a, (b0) obj);
            }
        }, new er.l() { // from class: zw1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f238161a, (b0) obj);
            }
        }, aVarB9, aVarB10, b9(zw1.a.i.f238125a), aVarB11, aVarB12, aVarB13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(r rVar, b0 b0Var) {
        rVar.d9(new zw1.a.NewPinInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(r rVar, b0 b0Var) {
        rVar.d9(new zw1.a.RepeatedNewPinInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: zw1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f238162a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, k10.z zVar) {
        c cVar = rVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zw1.a.b.class), oVar, cVar);
        zVar.x(q0.c(zw1.a.C6431a.class), oVar, rVar.new d(null));
        zVar.v(q0.c(zw1.a.NewPinInputChange.class), oVar, new e(null));
        zVar.v(q0.c(zw1.a.RepeatedNewPinInputChange.class), oVar, new f(null));
        zVar.v(q0.c(zw1.a.e.class), oVar, rVar.new g(null));
        zVar.v(q0.c(zw1.a.h.class), oVar, rVar.new h(null));
        zVar.v(q0.c(zw1.a.j.class), oVar, rVar.new i(null));
        zVar.x(q0.c(zw1.a.f.class), oVar, rVar.new j(null));
        zVar.x(q0.c(zw1.a.i.class), oVar, rVar.new k(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<zw1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, zw1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<zw1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
