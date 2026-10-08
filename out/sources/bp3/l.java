package bp3;

import co3.SummaryData;
import er.q;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lbp3/l;", "Ll00/g;", "Lbp3/c;", "", "Lbp3/d;", "Lyy/a;", "stateMachineFactory", "Lcp3/a;", "summaryScreenMapper", "Lf01/b;", "launchNativeRatingUC", "Lco3/o;", "summaryData", "<init>", "(Lyy/a;Lcp3/a;Lf01/b;Lco3/o;)V", "state", "Lbp3/d$a;", "l9", "(Lbp3/c;)Lbp3/d$a;", "b", "Lcp3/a;", "c", "Lf01/b;", "Lbp3/c$a;", "d", "Lbp3/c$a;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbp3/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<bp3.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cp3.a summaryScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bp3.c.a initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<bp3.c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bp3.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f21135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f21136b;

        /* JADX INFO: renamed from: bp3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0547a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f21137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f21138b;

            /* JADX INFO: renamed from: bp3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0548a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f21139d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f21140e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f21141f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f21143h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f21144j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f21145k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f21146l;

                public C0548a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f21139d = obj;
                    this.f21140e |= PKIFailureInfo.systemUnavail;
                    return C0547a.this.F(null, this);
                }
            }

            public C0547a(mu.h hVar, l lVar) {
                this.f21137a = hVar;
                this.f21138b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0548a c0548a;
                if (eVar instanceof C0548a) {
                    c0548a = (C0548a) eVar;
                    int i15 = c0548a.f21140e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0548a.f21140e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0548a = new C0548a(eVar);
                    }
                } else {
                    c0548a = new C0548a(eVar);
                }
                Object obj2 = c0548a.f21139d;
                Object objE = uq.b.e();
                int i16 = c0548a.f21140e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f21137a;
                    d.a aVarL9 = this.f21138b.l9((bp3.c) obj);
                    c0548a.f21141f = vq.j.a(obj);
                    c0548a.f21143h = vq.j.a(c0548a);
                    c0548a.f21144j = vq.j.a(obj);
                    c0548a.f21145k = vq.j.a(hVar);
                    c0548a.f21146l = 0;
                    c0548a.f21140e = 1;
                    if (hVar.F(aVarL9, c0548a) == objE) {
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
            this.f21135a = gVar;
            this.f21136b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.a> hVar, tq.e eVar) {
            Object objA = this.f21135a.a(new C0547a(hVar, this.f21136b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbp3/a;", "<unused var>", "Lbp3/c;", "Loq/i0;", "<anonymous>", "(Lbp3/a;Lbp3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<bp3.a, bp3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21147e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f21147e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                bp3.l r5 = bp3.l.this
                xw.b r5 = r5.Y1()
                bp3.b$a r1 = bp3.b.a.f21109a
                r4.f21147e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                bp3.l r5 = bp3.l.this
                f01.b r5 = bp3.l.j9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f21147e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: bp3.l.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bp3.a aVar, bp3.c cVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbp3/c$a;", "state", "Lk10/l;", "Lbp3/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<bp3.c.a>, tq.e<? super k10.l<? extends bp3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SummaryData f21151g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SummaryData summaryData, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f21151g = summaryData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bp3.c.Initialized O(SummaryData summaryData, bp3.c.a aVar) {
            return new bp3.c.Initialized(summaryData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f21150f;
            uq.b.e();
            if (this.f21149e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final SummaryData summaryData = this.f21151g;
            return c0Var.d(new er.l() { // from class: bp3.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.c.O(summaryData, (c.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<bp3.c.a> c0Var, tq.e<? super k10.l<? extends bp3.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f21151g, eVar);
            cVar.f21150f = obj;
            return cVar;
        }
    }

    public l(yy.a aVar, cp3.a aVar2, f01.b bVar, final SummaryData summaryData) {
        this.summaryScreenMapper = aVar2;
        this.launchNativeRatingUC = bVar;
        bp3.c.a aVar3 = bp3.c.a.f21110a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: bp3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f21127a, summaryData, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.a l9(bp3.c state) {
        return this.summaryScreenMapper.b(new cp3.a.Params(state, b9(bp3.a.f21108a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final l lVar, final SummaryData summaryData, v vVar) {
        vVar.c(q0.c(bp3.c.class), new er.l() { // from class: bp3.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f21125a, (z) obj);
            }
        });
        vVar.c(q0.c(bp3.c.a.class), new er.l() { // from class: bp3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(summaryData, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(bp3.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(SummaryData summaryData, z zVar) {
        zVar.A(new c(summaryData, null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bp3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<bp3.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SummaryData summaryData) {
        super.P5(summaryData);
    }
}
