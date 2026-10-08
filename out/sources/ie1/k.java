package ie1;

import de1.KrusData;
import er.q;
import f00.j0;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001+B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lie1/k;", "Ll00/g;", "Lie1/f;", "Lie1/e;", "Lie1/g;", "", "Lyy/a;", "stateMachineFactory", "Lje1/d;", "mapper", "Lce1/a;", "contract", "<init>", "(Lyy/a;Lje1/d;Lce1/a;)V", "state", "Lie1/g$a;", "m9", "(Lie1/f;)Lie1/g$a;", "b", "Lje1/d;", "c", "Lce1/a;", "d", "Lie1/f;", "initialState", "Lxw/b;", "Lie1/e$c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, ie1.e> implements ie1.g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final je1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ce1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ie1.e.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, ie1.e> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<ie1.g.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lie1/k$a;", "Lf00/j0;", "Lce1/a;", "Lie1/k;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ce1.a, k> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ie1.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f92040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f92041b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f92042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f92043b;

            /* JADX INFO: renamed from: ie1.k$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2178a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f92044d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f92045e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f92046f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f92048h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f92049j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f92050k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f92051l;

                public C2178a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f92044d = obj;
                    this.f92045e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f92042a = hVar;
                this.f92043b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2178a c2178a;
                if (eVar instanceof C2178a) {
                    c2178a = (C2178a) eVar;
                    int i15 = c2178a.f92045e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2178a.f92045e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2178a = new C2178a(eVar);
                    }
                } else {
                    c2178a = new C2178a(eVar);
                }
                Object obj2 = c2178a.f92044d;
                Object objE = uq.b.e();
                int i16 = c2178a.f92045e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f92042a;
                    ie1.g.Data dataM9 = this.f92043b.m9((State) obj);
                    c2178a.f92046f = vq.j.a(obj);
                    c2178a.f92048h = vq.j.a(c2178a);
                    c2178a.f92049j = vq.j.a(obj);
                    c2178a.f92050k = vq.j.a(hVar);
                    c2178a.f92051l = 0;
                    c2178a.f92045e = 1;
                    if (hVar.F(dataM9, c2178a) == objE) {
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

        public b(mu.g gVar, k kVar) {
            this.f92040a = gVar;
            this.f92041b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ie1.g.Data> hVar, tq.e eVar) {
            Object objA = this.f92040a.a(new a(hVar, this.f92041b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lie1/e$a;", "<unused var>", "Lie1/f;", "Loq/i0;", "<anonymous>", "(Lie1/e$a;Lie1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ie1.e.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92052e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f92052e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ie1.e.c> bVarY1 = k.this.Y1();
                ie1.e.c.a aVar = ie1.e.c.a.f92017a;
                this.f92052e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ie1.e.a aVar, State state, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lie1/e$b;", "<unused var>", "Lie1/f;", "Loq/i0;", "<anonymous>", "(Lie1/e$b;Lie1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ie1.e.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92054e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f92054e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ie1.e.c> bVarY1 = k.this.Y1();
                ie1.e.c.b bVar = ie1.e.c.b.f92018a;
                this.f92054e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ie1.e.b bVar, State state, tq.e<? super i0> eVar) {
            return k.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lie1/e$f;", "action", "Lk10/c0;", "Lie1/f;", "state", "Lk10/l;", "<anonymous>", "(Lie1/e$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<ie1.e.SelectAnswer, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f92058g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ie1.e.SelectAnswer selectAnswer, State state) {
            return state.a(selectAnswer.getAnswer());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ie1.e.SelectAnswer selectAnswer = (ie1.e.SelectAnswer) this.f92057f;
            c0 c0Var = (c0) this.f92058g;
            uq.b.e();
            if (this.f92056e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: ie1.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.e.O(selectAnswer, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ie1.e.SelectAnswer selectAnswer, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f92057f = selectAnswer;
            eVar2.f92058g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lie1/e$e;", "<unused var>", "Lie1/f;", "state", "Loq/i0;", "<anonymous>", "(Lie1/e$e;Lie1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<ie1.e.C2177e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92060f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f92060f;
            uq.b.e();
            if (this.f92059e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.contract.M8(state.getIncomeTaxExceededCertificateInfo());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ie1.e.C2177e c2177e, State state, tq.e<? super i0> eVar) {
            f fVar = k.this.new f(eVar);
            fVar.f92060f = state;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lie1/e$d;", "<unused var>", "Lk10/c0;", "Lie1/f;", "state", "Lk10/l;", "<anonymous>", "(Lie1/e$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<ie1.e.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f92062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f92063f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f92065a;

            static {
                int[] iArr = new int[de1.c.values().length];
                try {
                    iArr[de1.c.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[de1.c.ATTACH_AS_ATTACHMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[de1.c.SUBMITTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[de1.c.SUBMIT_LATER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f92065a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(de1.c.NONE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        
            if (r7.F(r2, r6) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        
            if (r7.F(r2, r6) == r1) goto L31;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f92063f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f92062e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L69
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L88
            L22:
                oq.u.b(r7)
                java.lang.Object r7 = r0.a()
                ie1.f r7 = (ie1.State) r7
                de1.c r7 = r7.getIncomeTaxExceededCertificateInfo()
                r2 = -1
                if (r7 != 0) goto L34
                r7 = r2
                goto L3c
            L34:
                int[] r5 = ie1.k.g.a.f92065a
                int r7 = r7.ordinal()
                r7 = r5[r7]
            L3c:
                if (r7 == r2) goto L92
                if (r7 == r4) goto L8d
                if (r7 == r3) goto L6e
                r2 = 3
                if (r7 == r2) goto L4f
                r2 = 4
                if (r7 != r2) goto L49
                goto L4f
            L49:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L4f:
                ie1.k r7 = ie1.k.this
                ie1.e$e r2 = ie1.e.C2177e.f92022a
                ie1.k.j9(r7, r2)
                ie1.k r7 = ie1.k.this
                xw.b r7 = r7.Y1()
                ie1.e$c$d r2 = ie1.e.c.d.f92020a
                r6.f92063f = r0
                r6.f92062e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L69
                goto L87
            L69:
                k10.l r7 = r0.c()
                return r7
            L6e:
                ie1.k r7 = ie1.k.this
                ie1.e$e r2 = ie1.e.C2177e.f92022a
                ie1.k.j9(r7, r2)
                ie1.k r7 = ie1.k.this
                xw.b r7 = r7.Y1()
                ie1.e$c$c r2 = ie1.e.c.C2176c.f92019a
                r6.f92063f = r0
                r6.f92062e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                k10.l r7 = r0.c()
                return r7
            L8d:
                k10.l r7 = r0.c()
                return r7
            L92:
                ie1.m r7 = new ie1.m
                r7.<init>()
                k10.l r7 = r0.b(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ie1.k.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ie1.e.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = k.this.new g(eVar);
            gVar.f92063f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, je1.d dVar, ce1.a aVar2) {
        this.mapper = dVar;
        this.contract = aVar2;
        KrusData krusDataM3 = aVar2.m3();
        State state = new State(krusDataM3 != null ? krusDataM3.getIncomeTaxExceededCertificateInfoAnswer() : null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ie1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f92033a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ie1.g.Data m9(State state) {
        return this.mapper.b(new je1.d.Params(state, new er.l() { // from class: ie1.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f92031a, (de1.c) obj);
            }
        }, b9(ie1.e.d.f92021a), b9(ie1.e.a.f92015a), b9(ie1.e.b.f92016a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(k kVar, de1.c cVar) {
        kVar.d9(new ie1.e.SelectAnswer(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ie1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f92032a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(k kVar, z zVar) {
        c cVar = kVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ie1.e.a.class), oVar, cVar);
        zVar.x(q0.c(ie1.e.b.class), oVar, kVar.new d(null));
        zVar.v(q0.c(ie1.e.SelectAnswer.class), oVar, new e(null));
        zVar.x(q0.c(ie1.e.C2177e.class), oVar, kVar.new f(null));
        zVar.v(q0.c(ie1.e.d.class), oVar, kVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ie1.e.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, ie1.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ie1.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
