package z91;

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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B9\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lz91/j;", "Ll00/g;", "Lz91/b;", "Lz91/a;", "Lz91/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Laa1/a;", "mapper", "Ll61/k;", "clearChildPassportApplicationDraftUC", "Ly51/a;", "clearChildPassportApplicationDraftTimestampUC", "Lmx/c;", "labelProvider", "globalSnackBarManager", "<init>", "(Lyy/a;Laa1/a;Ll61/k;Ly51/a;Lmx/c;Li70/e;)V", "state", "Lz91/c$a;", "o9", "(Lz91/b;)Lz91/c$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "c", "Laa1/a;", "d", "Ll61/k;", "e", "Ly51/a;", "f", "Lmx/c;", "g", "Lz91/b;", "initialState", "Lxw/b;", "Lz91/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<z91.b, z91.a> implements z91.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.e f233652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aa1.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l61.k clearChildPassportApplicationDraftUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y51.a clearChildPassportApplicationDraftTimestampUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z91.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<z91.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<z91.b, z91.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<z91.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<z91.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f233661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f233662b;

        /* JADX INFO: renamed from: z91.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6291a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f233663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f233664b;

            /* JADX INFO: renamed from: z91.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6292a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f233665d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f233666e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f233667f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f233669h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f233670j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f233671k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f233672l;

                public C6292a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f233665d = obj;
                    this.f233666e |= PKIFailureInfo.systemUnavail;
                    return C6291a.this.F(null, this);
                }
            }

            public C6291a(mu.h hVar, j jVar) {
                this.f233663a = hVar;
                this.f233664b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6292a c6292a;
                if (eVar instanceof C6292a) {
                    c6292a = (C6292a) eVar;
                    int i15 = c6292a.f233666e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6292a.f233666e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6292a = new C6292a(eVar);
                    }
                } else {
                    c6292a = new C6292a(eVar);
                }
                Object obj2 = c6292a.f233665d;
                Object objE = uq.b.e();
                int i16 = c6292a.f233666e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f233663a;
                    z91.c.Data dataO9 = this.f233664b.o9((z91.b) obj);
                    c6292a.f233667f = vq.j.a(obj);
                    c6292a.f233669h = vq.j.a(c6292a);
                    c6292a.f233670j = vq.j.a(obj);
                    c6292a.f233671k = vq.j.a(hVar);
                    c6292a.f233672l = 0;
                    c6292a.f233666e = 1;
                    if (hVar.F(dataO9, c6292a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f233661a = gVar;
            this.f233662b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super z91.c.Data> hVar, tq.e eVar) {
            Object objA = this.f233661a.a(new C6291a(hVar, this.f233662b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz91/a$b;", "action", "Lz91/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz91/a$b;Lz91/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<z91.a.b, z91.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233674f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z91.a.b bVar = (z91.a.b) this.f233674f;
            Object objE = uq.b.e();
            int i15 = this.f233673e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                this.f233674f = vq.j.a(bVar);
                this.f233673e = 1;
                if (jVar.F(bVar, this) == objE) {
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
        public final Object w(z91.a.b bVar, z91.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = j.this.new b(eVar);
            bVar3.f233674f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz91/a$a;", "<unused var>", "Lz91/b;", "Loq/i0;", "<anonymous>", "(Lz91/a$a;Lz91/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<z91.a.C6288a, z91.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233676e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f233676e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L43
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L32
            L1e:
                oq.u.b(r7)
                z91.j r7 = z91.j.this
                y51.a r7 = z91.j.j9(r7)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r6.f233676e = r3
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L32
                goto L42
            L32:
                z91.j r7 = z91.j.this
                l61.k r7 = z91.j.k9(r7)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r6.f233676e = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L43
            L42:
                return r0
            L43:
                z91.j r7 = z91.j.this
                z91.a$b$a r0 = z91.a.b.C6289a.f233639a
                z91.j.i9(r7, r0)
                z91.j r7 = z91.j.this
                p50.a$a r0 = new p50.a$a
                z91.j r1 = z91.j.this
                mx.c r1 = z91.j.l9(r1)
                int r2 = w51.a.f210319e0
                mx.a r1 = r1.c(r2)
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                r7.y(r0)
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: z91.j.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z91.a.C6288a c6288a, z91.b bVar, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, aa1.a aVar2, l61.k kVar, y51.a aVar3, mx.c cVar, i70.e eVar) {
        this.f233652b = eVar;
        this.mapper = aVar2;
        this.clearChildPassportApplicationDraftUC = kVar;
        this.clearChildPassportApplicationDraftTimestampUC = aVar3;
        this.labelProvider = cVar;
        z91.b bVar = z91.b.f233641a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: z91.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.q9(this.f233650a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z91.c.Data o9(z91.b state) {
        return this.mapper.b(new aa1.a.Params(state, b9(z91.a.b.C6290b.f233640a), b9(z91.a.C6288a.f233638a), b9(z91.a.b.C6289a.f233639a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final j jVar, v vVar) {
        vVar.c(q0.c(z91.b.class), new er.l() { // from class: z91.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.r9(this.f233651a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(z91.a.b.class), oVar, bVar);
        zVar.x(q0.c(z91.a.C6288a.class), oVar, jVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.f233652b.B0();
    }

    @Override // zx.b
    public xw.b<z91.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<z91.b, z91.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<z91.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(z91.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.f233652b.y(snackBarData);
    }
}
