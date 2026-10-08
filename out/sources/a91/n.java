package a91;

import al0.s0;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"La91/n;", "Ll00/g;", "La91/e;", "", "La91/f;", "Lyy/a;", "stateMachineFactory", "Lb91/c;", "mapper", "La91/d;", "setupData", "<init>", "(Lyy/a;Lb91/c;La91/d;)V", "state", "La91/f$a;", "l9", "(La91/e;)La91/f$a;", "b", "Lb91/c;", "c", "La91/d;", "d", "La91/e;", "initialState", "Lxw/b;", "La91/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b91.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a91.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f5013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f5014b;

        /* JADX INFO: renamed from: a91.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0086a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f5015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f5016b;

            /* JADX INFO: renamed from: a91.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0087a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f5017d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f5018e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f5019f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f5021h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f5022j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f5023k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f5024l;

                public C0087a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f5017d = obj;
                    this.f5018e |= PKIFailureInfo.systemUnavail;
                    return C0086a.this.F(null, this);
                }
            }

            public C0086a(mu.h hVar, n nVar) {
                this.f5015a = hVar;
                this.f5016b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0087a c0087a;
                if (eVar instanceof C0087a) {
                    c0087a = (C0087a) eVar;
                    int i15 = c0087a.f5018e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0087a.f5018e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0087a = new C0087a(eVar);
                    }
                } else {
                    c0087a = new C0087a(eVar);
                }
                Object obj2 = c0087a.f5017d;
                Object objE = uq.b.e();
                int i16 = c0087a.f5018e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f5015a;
                    f.Data dataL9 = this.f5016b.l9((e) obj);
                    c0087a.f5019f = vq.j.a(obj);
                    c0087a.f5021h = vq.j.a(c0087a);
                    c0087a.f5022j = vq.j.a(obj);
                    c0087a.f5023k = vq.j.a(hVar);
                    c0087a.f5024l = 0;
                    c0087a.f5018e = 1;
                    if (hVar.F(dataL9, c0087a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f5013a = gVar;
            this.f5014b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f5013a.a(new C0086a(hVar, this.f5014b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La91/e;", "it", "Loq/i0;", "<anonymous>", "(La91/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5025e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f5025e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.setupData.getContract().r3();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(e eVar, tq.e<? super i0> eVar2) {
            return ((b) v(eVar, eVar2)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La91/c;", "action", "La91/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(La91/c;La91/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<Next, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5028f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5030a;

            static {
                int[] iArr = new int[s0.values().length];
                try {
                    iArr[s0.TEMPORARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s0.BIOMETRIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s0.BUSINESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s0.DIPLOMATIC.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[s0.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f5030a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r7.F(r2, r6) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r7.F(r2, r6) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f5028f
                a91.c r0 = (a91.Next) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f5027e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L12
                if (r2 != r3) goto L16
            L12:
                oq.u.b(r7)
                goto L85
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                a91.n r7 = a91.n.this
                a91.d r7 = a91.n.j9(r7)
                c91.a r7 = r7.getContract()
                c91.a$a r2 = new c91.a$a
                al0.s0 r5 = r0.getPassportType()
                r2.<init>(r5)
                r7.X2(r2)
                al0.s0 r7 = r0.getPassportType()
                int[] r2 = a91.n.c.a.f5030a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r4) goto L6e
                if (r7 == r3) goto L57
                r2 = 3
                if (r7 == r2) goto L57
                r2 = 4
                if (r7 == r2) goto L57
                r2 = 5
                if (r7 != r2) goto L51
                goto L57
            L51:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L57:
                a91.n r7 = a91.n.this
                xw.b r7 = r7.Y1()
                a91.b$b r2 = a91.b.C0085b.f4989a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f5028f = r0
                r6.f5027e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L85
                goto L84
            L6e:
                a91.n r7 = a91.n.this
                xw.b r7 = r7.Y1()
                a91.b$c r2 = a91.b.c.f4990a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f5028f = r0
                r6.f5027e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L85
            L84:
                return r1
            L85:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a91.n.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Next next, e eVar, tq.e<? super i0> eVar2) {
            c cVar = n.this.new c(eVar2);
            cVar.f5028f = next;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La91/a;", "<unused var>", "La91/e;", "Loq/i0;", "<anonymous>", "(La91/a;La91/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a91.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5031e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f5031e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a91.b> bVarY1 = n.this.Y1();
                a91.b.a aVar = a91.b.a.f4988a;
                this.f5031e = 1;
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
        public final Object w(a91.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, b91.c cVar, SetupData setupData) {
        this.mapper = cVar;
        this.setupData = setupData;
        e eVar = e.f4993a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: a91.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f5006a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(e state) {
        b91.c cVar = this.mapper;
        er.l lVar = new er.l() { // from class: a91.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f5005a, (s0) obj);
            }
        };
        a91.a aVar = a91.a.f4987a;
        return cVar.b(new b91.c.Params(state, lVar, b9(aVar), b9(aVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, s0 s0Var) {
        nVar.d9(new Next(s0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: a91.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f5004a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, z zVar) {
        zVar.C(nVar.new b(null));
        c cVar = nVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(Next.class), oVar, cVar);
        zVar.x(q0.c(a91.a.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a91.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
