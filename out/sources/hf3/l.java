package hf3;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lhf3/l;", "Ll00/g;", "Lhf3/c;", "", "Lhf3/d;", "Lyy/a;", "stateMachineFactory", "Ljf3/c;", "mapper", "Lif3/a;", "setupContract", "<init>", "(Lyy/a;Ljf3/c;Lif3/a;)V", "Lhf3/d$a;", "m9", "(Lhf3/c;)Lhf3/d$a;", "b", "Ljf3/c;", "c", "Lif3/a;", "d", "Lhf3/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhf3/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<hf3.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jf3.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final if3.a setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hf3.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<hf3.c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hf3.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f84275b;

        /* JADX INFO: renamed from: hf3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1946a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84276a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f84277b;

            /* JADX INFO: renamed from: hf3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1947a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84278d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84279e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84280f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84282h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84283j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84284k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84285l;

                public C1947a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84278d = obj;
                    this.f84279e |= PKIFailureInfo.systemUnavail;
                    return C1946a.this.F(null, this);
                }
            }

            public C1946a(mu.h hVar, l lVar) {
                this.f84276a = hVar;
                this.f84277b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1947a c1947a;
                if (eVar instanceof C1947a) {
                    c1947a = (C1947a) eVar;
                    int i15 = c1947a.f84279e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1947a.f84279e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1947a = new C1947a(eVar);
                    }
                } else {
                    c1947a = new C1947a(eVar);
                }
                Object obj2 = c1947a.f84278d;
                Object objE = uq.b.e();
                int i16 = c1947a.f84279e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f84276a;
                    d.Data dataM9 = this.f84277b.m9((hf3.c) obj);
                    c1947a.f84280f = vq.j.a(obj);
                    c1947a.f84282h = vq.j.a(c1947a);
                    c1947a.f84283j = vq.j.a(obj);
                    c1947a.f84284k = vq.j.a(hVar);
                    c1947a.f84285l = 0;
                    c1947a.f84279e = 1;
                    if (hVar.F(dataM9, c1947a) == objE) {
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
            this.f84274a = gVar;
            this.f84275b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f84274a.a(new C1946a(hVar, this.f84275b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhf3/b;", "action", "Lhf3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhf3/b;Lhf3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<PickRole, hf3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84287f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f84289a;

            static {
                int[] iArr = new int[sv0.l.values().length];
                try {
                    iArr[sv0.l.VICTIM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sv0.l.PERPETRATOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f84289a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            if (r7.F(r2, r6) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r7.F(r2, r6) == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f84287f
                hf3.b r0 = (hf3.PickRole) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f84286e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L25
                if (r2 == r5) goto L21
                if (r2 == r4) goto L15
                if (r2 != r3) goto L19
            L15:
                oq.u.b(r7)
                goto L79
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                oq.u.b(r7)
                goto L3d
            L25:
                oq.u.b(r7)
                hf3.l r7 = hf3.l.this
                if3.a r7 = hf3.l.j9(r7)
                sv0.l r2 = r0.getCollisionRole()
                r6.f84287f = r0
                r6.f84286e = r5
                java.lang.Object r7 = r7.U3(r2, r6)
                if (r7 != r1) goto L3d
                goto L78
            L3d:
                sv0.l r7 = r0.getCollisionRole()
                int[] r2 = hf3.l.b.a.f84289a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r5) goto L66
                if (r7 != r4) goto L60
                hf3.l r7 = hf3.l.this
                hf3.a$d r2 = hf3.a.d.f84253a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f84287f = r0
                r6.f84286e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L79
                goto L78
            L60:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L66:
                hf3.l r7 = hf3.l.this
                hf3.a$c r2 = hf3.a.c.f84252a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f84287f = r0
                r6.f84286e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L79
            L78:
                return r1
            L79:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hf3.l.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(PickRole pickRole, hf3.c cVar, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f84287f = pickRole;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhf3/a;", "action", "Lhf3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhf3/a;Lhf3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<hf3.a, hf3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84291f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hf3.a aVar = (hf3.a) this.f84291f;
            Object objE = uq.b.e();
            int i15 = this.f84290e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f84291f = vq.j.a(aVar);
                this.f84290e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(hf3.a aVar, hf3.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = l.this.new c(eVar);
            cVar2.f84291f = aVar;
            return cVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, jf3.c cVar, if3.a aVar2) {
        this.mapper = cVar;
        this.setupContract = aVar2;
        hf3.c cVar2 = hf3.c.f84255a;
        this.initialState = cVar2;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: hf3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f84267a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data m9(hf3.c cVar) {
        return this.mapper.b(new jf3.c.Params(cVar, new er.l() { // from class: hf3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f84266a, (sv0.l) obj);
            }
        }, b9(hf3.a.C1945a.f84250a), b9(hf3.a.b.f84251a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, sv0.l lVar2) {
        lVar.d9(new PickRole(lVar2));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final l lVar, v vVar) {
        vVar.c(q0.c(hf3.c.class), new er.l() { // from class: hf3.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f84265a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(PickRole.class), oVar, bVar);
        zVar.x(q0.c(hf3.a.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hf3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<hf3.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hf3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(if3.a aVar) {
        super.P5(aVar);
    }
}
