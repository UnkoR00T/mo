package v61;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lv61/k;", "Ll00/g;", "Lv61/c;", "", "Lv61/d;", "Lyy/a;", "stateMachineFactory", "Lw61/a;", "mapper", "Lx61/a;", "dataContract", "<init>", "(Lyy/a;Lw61/a;Lx61/a;)V", "state", "Lv61/d$a;", "k9", "(Lv61/c;)Lv61/d$a;", "b", "Lw61/a;", "c", "Lx61/a;", "d", "Lv61/c;", "initialState", "Lxw/b;", "Lv61/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<v61.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w61.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x61.a dataContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v61.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v61.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<v61.c, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f204128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f204129b;

        /* JADX INFO: renamed from: v61.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5322a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f204130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f204131b;

            /* JADX INFO: renamed from: v61.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5323a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f204132d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f204133e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f204134f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f204136h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f204137j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f204138k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f204139l;

                public C5323a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f204132d = obj;
                    this.f204133e |= PKIFailureInfo.systemUnavail;
                    return C5322a.this.F(null, this);
                }
            }

            public C5322a(mu.h hVar, k kVar) {
                this.f204130a = hVar;
                this.f204131b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5323a c5323a;
                if (eVar instanceof C5323a) {
                    c5323a = (C5323a) eVar;
                    int i15 = c5323a.f204133e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5323a.f204133e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5323a = new C5323a(eVar);
                    }
                } else {
                    c5323a = new C5323a(eVar);
                }
                Object obj2 = c5323a.f204132d;
                Object objE = uq.b.e();
                int i16 = c5323a.f204133e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f204130a;
                    d.Data dataK9 = this.f204131b.k9((v61.c) obj);
                    c5323a.f204134f = vq.j.a(obj);
                    c5323a.f204136h = vq.j.a(c5323a);
                    c5323a.f204137j = vq.j.a(obj);
                    c5323a.f204138k = vq.j.a(hVar);
                    c5323a.f204139l = 0;
                    c5323a.f204133e = 1;
                    if (hVar.F(dataK9, c5323a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f204128a = gVar;
            this.f204129b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f204128a.a(new C5322a(hVar, this.f204129b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv61/a;", "action", "Lv61/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv61/a;Lv61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<v61.a, v61.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204141f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v61.a aVar = (v61.a) this.f204141f;
            Object objE = uq.b.e();
            int i15 = this.f204140e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<v61.a> bVarY1 = k.this.Y1();
                this.f204141f = vq.j.a(aVar);
                this.f204140e = 1;
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
        public final Object w(v61.a aVar, v61.c cVar, tq.e<? super i0> eVar) {
            b bVar = k.this.new b(eVar);
            bVar.f204141f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv61/b;", "<unused var>", "Lv61/c;", "Loq/i0;", "<anonymous>", "(Lv61/b;Lv61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<v61.b, v61.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204143e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            return r0;
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
                int r1 = r4.f204143e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L4c
            L1b:
                oq.u.b(r5)
                v61.k r5 = v61.k.this
                x61.a r5 = v61.k.i9(r5)
                boolean r5 = r5.r1()
                if (r5 == 0) goto L3b
                v61.k r5 = v61.k.this
                xw.b r5 = r5.Y1()
                v61.a$d r1 = v61.a.d.f204106a
                r4.f204143e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L4c
                goto L4b
            L3b:
                v61.k r5 = v61.k.this
                xw.b r5 = r5.Y1()
                v61.a$e r1 = v61.a.e.f204107a
                r4.f204143e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: v61.k.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v61.b bVar, v61.c cVar, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, w61.a aVar2, x61.a aVar3) {
        this.mapper = aVar2;
        this.dataContract = aVar3;
        v61.c cVar = v61.c.f204109a;
        this.initialState = cVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: v61.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f204121a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(v61.c state) {
        return this.mapper.b(new w61.a.Params(state, b9(v61.a.C5321a.f204103a), b9(v61.a.b.f204104a), b9(v61.b.f204108a), b9(v61.a.c.f204105a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final k kVar, v vVar) {
        vVar.c(q0.c(v61.c.class), new er.l() { // from class: v61.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f204120a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v61.a.class), oVar, bVar);
        zVar.x(q0.c(v61.b.class), oVar, kVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v61.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<v61.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(x61.a aVar) {
        super.P5(aVar);
    }
}
