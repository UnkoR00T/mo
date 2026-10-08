package mh3;

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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lmh3/m;", "Ll00/g;", "Lmh3/d;", "", "Lmh3/e;", "Lyy/a;", "stateMachineFactory", "Loh3/a;", "mapper", "Lnh3/a;", "contract", "<init>", "(Lyy/a;Loh3/a;Lnh3/a;)V", "Loq/i0;", "m9", "(Ltq/e;)Ljava/lang/Object;", "Lmh3/e$a$a;", "l9", "(Lmh3/d;)Lmh3/e$a$a;", "b", "Loh3/a;", "c", "Lnh3/a;", "getContract", "()Lnh3/a;", "d", "Lmh3/d;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lmh3/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<mh3.d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oh3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nh3.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mh3.d initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<mh3.d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mh3.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a.Initialized> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f126649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f126650b;

        /* JADX INFO: renamed from: mh3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3116a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f126651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f126652b;

            /* JADX INFO: renamed from: mh3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3117a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f126653d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f126654e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f126655f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f126657h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f126658j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f126659k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f126660l;

                public C3117a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f126653d = obj;
                    this.f126654e |= PKIFailureInfo.systemUnavail;
                    return C3116a.this.F(null, this);
                }
            }

            public C3116a(mu.h hVar, m mVar) {
                this.f126651a = hVar;
                this.f126652b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3117a c3117a;
                if (eVar instanceof C3117a) {
                    c3117a = (C3117a) eVar;
                    int i15 = c3117a.f126654e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3117a.f126654e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3117a = new C3117a(eVar);
                    }
                } else {
                    c3117a = new C3117a(eVar);
                }
                Object obj2 = c3117a.f126653d;
                Object objE = uq.b.e();
                int i16 = c3117a.f126654e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f126651a;
                    e.a.Initialized initializedL9 = this.f126652b.l9((mh3.d) obj);
                    c3117a.f126655f = vq.j.a(obj);
                    c3117a.f126657h = vq.j.a(c3117a);
                    c3117a.f126658j = vq.j.a(obj);
                    c3117a.f126659k = vq.j.a(hVar);
                    c3117a.f126660l = 0;
                    c3117a.f126654e = 1;
                    if (hVar.F(initializedL9, c3117a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f126649a = gVar;
            this.f126650b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f126649a.a(new C3116a(hVar, this.f126650b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmh3/a;", "action", "Lmh3/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmh3/a;Lmh3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<mh3.a, mh3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126662f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mh3.a aVar = (mh3.a) this.f126662f;
            Object objE = uq.b.e();
            int i15 = this.f126661e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f126662f = vq.j.a(aVar);
                this.f126661e = 1;
                if (mVar.F(aVar, this) == objE) {
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
        public final Object w(mh3.a aVar, mh3.d dVar, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f126662f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmh3/c;", "<unused var>", "Lmh3/d;", "Loq/i0;", "<anonymous>", "(Lmh3/c;Lmh3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<mh3.c, mh3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126664e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
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
                int r1 = r4.f126664e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L39
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L2c
            L1e:
                oq.u.b(r5)
                mh3.m r5 = mh3.m.this
                r4.f126664e = r3
                java.lang.Object r5 = mh3.m.j9(r5, r4)
                if (r5 != r0) goto L2c
                goto L38
            L2c:
                mh3.m r5 = mh3.m.this
                mh3.a$d r1 = mh3.a.d.f126626a
                r4.f126664e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: mh3.m.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mh3.c cVar, mh3.d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmh3/b;", "<unused var>", "Lmh3/d;", "Loq/i0;", "<anonymous>", "(Lmh3/b;Lmh3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<mh3.b, mh3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126666e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126666e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                mh3.a.c cVar = mh3.a.c.f126625a;
                this.f126666e = 1;
                if (mVar.F(cVar, this) == objE) {
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
        public final Object w(mh3.b bVar, mh3.d dVar, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, oh3.a aVar2, nh3.a aVar3) {
        this.mapper = aVar2;
        this.contract = aVar3;
        mh3.d dVar = mh3.d.f126629a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: mh3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f126642a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a.Initialized l9(mh3.d dVar) {
        return this.mapper.b(new oh3.a.Params(dVar, b9(mh3.b.f126627a), b9(mh3.c.f126628a), b9(mh3.a.C3114a.f126623a), b9(mh3.a.b.f126624a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m9(tq.e<? super i0> eVar) {
        Object objT0 = this.contract.T0(tv0.h.b.f192400a, eVar);
        return objT0 == uq.b.e() ? objT0 : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(mh3.d.class), new er.l() { // from class: mh3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f126641a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mh3.a.class), oVar, bVar);
        zVar.x(q0.c(mh3.c.class), oVar, mVar.new c(null));
        zVar.x(q0.c(mh3.b.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<mh3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<mh3.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(mh3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(nh3.a aVar) {
        super.P5(aVar);
    }
}
