package cf1;

import df1.SocialInsuranceSelectionContractData;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001+B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcf1/j;", "Ll00/g;", "Lcf1/e;", "Lcf1/d;", "Lcf1/f;", "", "Lyy/a;", "stateMachineFactory", "Lef1/c;", "mapper", "Ldf1/a;", "contract", "<init>", "(Lyy/a;Lef1/c;Ldf1/a;)V", "state", "Lcf1/f$a;", "m9", "(Lcf1/e;)Lcf1/f$a;", "b", "Lef1/c;", "c", "Ldf1/a;", "d", "Lcf1/e;", "initialState", "Lxw/b;", "Lcf1/d$b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, cf1.d> implements cf1.f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ef1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final df1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cf1.d.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, cf1.d> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<cf1.f.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcf1/j$a;", "Lf00/j0;", "Ldf1/a;", "Lcf1/j;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<df1.a, j> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<cf1.f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f25656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f25657b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f25658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f25659b;

            /* JADX INFO: renamed from: cf1.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0687a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f25660d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f25661e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f25662f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f25664h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f25665j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f25666k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f25667l;

                public C0687a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f25660d = obj;
                    this.f25661e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, j jVar) {
                this.f25658a = hVar;
                this.f25659b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0687a c0687a;
                if (eVar instanceof C0687a) {
                    c0687a = (C0687a) eVar;
                    int i15 = c0687a.f25661e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0687a.f25661e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0687a = new C0687a(eVar);
                    }
                } else {
                    c0687a = new C0687a(eVar);
                }
                Object obj2 = c0687a.f25660d;
                Object objE = uq.b.e();
                int i16 = c0687a.f25661e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f25658a;
                    cf1.f.Data dataM9 = this.f25659b.m9((State) obj);
                    c0687a.f25662f = vq.j.a(obj);
                    c0687a.f25664h = vq.j.a(c0687a);
                    c0687a.f25665j = vq.j.a(obj);
                    c0687a.f25666k = vq.j.a(hVar);
                    c0687a.f25667l = 0;
                    c0687a.f25661e = 1;
                    if (hVar.F(dataM9, c0687a) == objE) {
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

        public b(mu.g gVar, j jVar) {
            this.f25656a = gVar;
            this.f25657b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super cf1.f.Data> hVar, tq.e eVar) {
            Object objA = this.f25656a.a(new a(hVar, this.f25657b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcf1/d$a;", "<unused var>", "Lcf1/e;", "Loq/i0;", "<anonymous>", "(Lcf1/d$a;Lcf1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<cf1.d.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25668e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f25668e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<cf1.d.b> bVarY1 = j.this.Y1();
                cf1.d.b.a aVar = cf1.d.b.a.f25632a;
                this.f25668e = 1;
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
        public final Object w(cf1.d.a aVar, State state, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcf1/d$e;", "action", "Lk10/c0;", "Lcf1/e;", "state", "Lk10/l;", "<anonymous>", "(Lcf1/d$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<cf1.d.SelectInsurance, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f25672g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(cf1.d.SelectInsurance selectInsurance, State state) {
            return State.b(state, selectInsurance.getSelectedItem(), hz.b.d.f86848c, null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cf1.d.SelectInsurance selectInsurance = (cf1.d.SelectInsurance) this.f25671f;
            c0 c0Var = (c0) this.f25672g;
            uq.b.e();
            if (this.f25670e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: cf1.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.d.O(selectInsurance, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cf1.d.SelectInsurance selectInsurance, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f25671f = selectInsurance;
            dVar.f25672g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcf1/d$d;", "<unused var>", "Lk10/c0;", "Lcf1/e;", "state", "Lk10/l;", "<anonymous>", "(Lcf1/d$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<cf1.d.C0686d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25674f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, hz.b.d.f86848c, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f25674f;
            uq.b.e();
            if (this.f25673e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            j.this.contract.p6(new SocialInsuranceSelectionContractData(((State) c0Var.a()).getSelectedItem()));
            return c0Var.b(new er.l() { // from class: cf1.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cf1.d.C0686d c0686d, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = j.this.new e(eVar);
            eVar2.f25674f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcf1/d$c;", "<unused var>", "Lk10/c0;", "Lcf1/e;", "state", "Lk10/l;", "<anonymous>", "(Lcf1/d$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<cf1.d.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25677f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25679a;

            static {
                int[] iArr = new int[lb1.a.values().length];
                try {
                    iArr[lb1.a.ZUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lb1.a.KRUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lb1.a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f25679a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, new hz.b.Invalid(null, 1, null), null, 5, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            if (r6.F(r2, r5) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        
            if (r6.F(r2, r5) == r1) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f25677f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f25676e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L68
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L87
            L22:
                oq.u.b(r6)
                java.lang.Object r6 = r0.a()
                cf1.e r6 = (cf1.State) r6
                lb1.a r6 = r6.getSelectedItem()
                int[] r2 = cf1.j.f.a.f25679a
                int r6 = r6.ordinal()
                r6 = r2[r6]
                if (r6 == r4) goto L6d
                if (r6 == r3) goto L4e
                r1 = 3
                if (r6 != r1) goto L48
                cf1.m r6 = new cf1.m
                r6.<init>()
                k10.l r6 = r0.b(r6)
                return r6
            L48:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L4e:
                cf1.j r6 = cf1.j.this
                cf1.d$d r2 = cf1.d.C0686d.f25636a
                cf1.j.j9(r6, r2)
                cf1.j r6 = cf1.j.this
                xw.b r6 = r6.Y1()
                cf1.d$b$b r2 = cf1.d.b.C0685b.f25633a
                r5.f25677f = r0
                r5.f25676e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L68
                goto L86
            L68:
                k10.l r6 = r0.c()
                return r6
            L6d:
                cf1.j r6 = cf1.j.this
                cf1.d$d r2 = cf1.d.C0686d.f25636a
                cf1.j.j9(r6, r2)
                cf1.j r6 = cf1.j.this
                xw.b r6 = r6.Y1()
                cf1.d$b$c r2 = cf1.d.b.c.f25634a
                r5.f25677f = r0
                r5.f25676e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L87
            L86:
                return r1
            L87:
                k10.l r6 = r0.c()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cf1.j.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cf1.d.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = j.this.new f(eVar);
            fVar.f25677f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, ef1.c cVar, df1.a aVar2) {
        lb1.a selectedInsurance;
        this.mapper = cVar;
        this.contract = aVar2;
        SocialInsuranceSelectionContractData socialInsuranceSelectionContractDataC4 = aVar2.C4();
        State state = new State((socialInsuranceSelectionContractDataC4 == null || (selectedInsurance = socialInsuranceSelectionContractDataC4.getSelectedInsurance()) == null) ? lb1.a.NONE : selectedInsurance, hz.b.C2039b.f86846c, aVar2.H());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: cf1.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.p9(this.f25649a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cf1.f.Data m9(State state) {
        return this.mapper.b(new ef1.c.Params(state, new er.l() { // from class: cf1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.n9(this.f25648a, (lb1.a) obj);
            }
        }, b9(cf1.d.c.f25635a), b9(cf1.d.a.f25631a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(j jVar, lb1.a aVar) {
        jVar.d9(new cf1.d.SelectInsurance(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: cf1.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.q9(this.f25647a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(j jVar, z zVar) {
        c cVar = jVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cf1.d.a.class), oVar, cVar);
        zVar.v(q0.c(cf1.d.SelectInsurance.class), oVar, new d(null));
        zVar.v(q0.c(cf1.d.C0686d.class), oVar, jVar.new e(null));
        zVar.v(q0.c(cf1.d.c.class), oVar, jVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cf1.d.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, cf1.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<cf1.f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(cf1.f.Data data) {
        super.P5(data);
    }
}
