package g91;

import cl0.g0;
import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u0019048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lg91/k;", "Ll00/g;", "Lg91/b;", "", "Lg91/c;", "Lyy/a;", "stateMachineFactory", "Lh91/a;", "mapper", "Lib4/c;", "genericErrorMapper", "Lhb4/d;", "errorVMSFactory", "Li91/a;", "contract", "<init>", "(Lyy/a;Lh91/a;Lib4/c;Lhb4/d;Li91/a;)V", "k9", "()Lg91/b;", "Ldx/b;", "domainError", "Lhb4/c;", "l9", "(Ldx/b;)Lhb4/c;", "state", "Lg91/c$a;", "n9", "(Lg91/b;)Lg91/c$a;", "b", "Lh91/a;", "c", "Lib4/c;", "d", "Lhb4/d;", "e", "Li91/a;", "f", "Lg91/b;", "initialState", "Lxw/b;", "Lg91/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<g91.b, Object> implements g91.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h91.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i91.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g91.b initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g91.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<g91.b, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<g91.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71404b;

        static {
            int[] iArr = new int[i61.l.values().length];
            try {
                iArr[i61.l.KDR_OWNERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i61.l.SCHOOL_AGED_CHILDREN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i61.l.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i61.l.CHILD_TREATED_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i61.l.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f71403a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g0.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f71404b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g91.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f71405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f71406b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f71407a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f71408b;

            /* JADX INFO: renamed from: g91.k$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1627a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71409d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71410e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f71411f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f71413h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f71414j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f71415k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f71416l;

                public C1627a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f71409d = obj;
                    this.f71410e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f71407a = hVar;
                this.f71408b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1627a c1627a;
                if (eVar instanceof C1627a) {
                    c1627a = (C1627a) eVar;
                    int i15 = c1627a.f71410e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1627a.f71410e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1627a = new C1627a(eVar);
                    }
                } else {
                    c1627a = new C1627a(eVar);
                }
                Object obj2 = c1627a.f71409d;
                Object objE = uq.b.e();
                int i16 = c1627a.f71410e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f71407a;
                    g91.c.a aVarN9 = this.f71408b.n9((g91.b) obj);
                    c1627a.f71411f = vq.j.a(obj);
                    c1627a.f71413h = vq.j.a(c1627a);
                    c1627a.f71414j = vq.j.a(obj);
                    c1627a.f71415k = vq.j.a(hVar);
                    c1627a.f71416l = 0;
                    c1627a.f71410e = 1;
                    if (hVar.F(aVarN9, c1627a) == objE) {
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
            this.f71405a = gVar;
            this.f71406b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g91.c.a> hVar, tq.e eVar) {
            Object objA = this.f71405a.a(new a(hVar, this.f71406b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg91/a;", "action", "Lg91/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg91/a;Lg91/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<g91.a, g91.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71418f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g91.a aVar = (g91.a) this.f71418f;
            Object objE = uq.b.e();
            int i15 = this.f71417e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g91.a> bVarY1 = k.this.Y1();
                this.f71418f = vq.j.a(aVar);
                this.f71417e = 1;
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
        public final Object w(g91.a aVar, g91.b bVar, tq.e<? super i0> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f71418f = aVar;
            return cVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, h91.a aVar2, ib4.c cVar, hb4.d dVar, i91.a aVar3) {
        this.mapper = aVar2;
        this.genericErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.contract = aVar3;
        g91.b bVarK9 = k9();
        this.initialState = bVarK9;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVarK9, new er.l() { // from class: g91.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f71394a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(bVarK9));
    }

    private final g91.b k9() {
        g0 passportOfficePlace = this.contract.I0().getPassportOfficePlace();
        int i15 = passportOfficePlace == null ? -1 : a.f71404b[passportOfficePlace.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                i61.l lVarZ3 = this.contract.z3();
                int i16 = lVarZ3 == null ? -1 : a.f71403a[lVarZ3.ordinal()];
                if (i16 == -1) {
                    return new g91.b.Error(l9(new dx.b.Generic(null, 1, null)));
                }
                if (i16 == 1) {
                    return new g91.b.Presenting(i91.b.POLAND_KDR_DISCOUNT);
                }
                if (i16 == 2 || i16 == 3 || i16 == 4 || i16 == 5) {
                    return new g91.b.Presenting(i91.b.POLAND);
                }
                throw new p();
            }
            if (i15 == 2) {
                return new g91.b.Presenting(i91.b.ABROAD);
            }
            if (i15 != 3) {
                throw new p();
            }
        }
        return new g91.b.Error(l9(new dx.b.Generic(null, 1, null)));
    }

    private final hb4.c l9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: g91.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f71392a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(k kVar, ib4.c.b bVar) {
        kVar.d9(g91.a.b.f71370a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g91.c.a n9(g91.b state) {
        return this.mapper.b(new h91.a.Params(state, b9(g91.a.c.f71371a), b9(g91.a.C1624a.f71369a), b9(g91.a.b.f71370a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final k kVar, v vVar) {
        vVar.c(q0.c(g91.b.class), new er.l() { // from class: g91.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f71393a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(k kVar, z zVar) {
        c cVar = kVar.new c(null);
        zVar.x(q0.c(g91.a.class), o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g91.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g91.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g91.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i91.a aVar) {
        super.P5(aVar);
    }
}
