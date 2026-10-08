package dd2;

import er.q;
import fr.q0;
import iy.b0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Ldd2/j;", "Ll00/g;", "Ldd2/b;", "Ldd2/a;", "Ldd2/c;", "", "Lyy/a;", "stateMachineFactory", "Lfd2/a;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lxc2/a;", "idCardSuspensionWithAuthTokenUC", "Lib4/c;", "errorMapper", "Led2/a;", "contract", "<init>", "(Lyy/a;Lfd2/a;Lac4/a;Lxc2/a;Lib4/c;Led2/a;)V", "state", "Ldd2/c$a;", "o9", "(Ldd2/b;)Ldd2/c$a;", "b", "Lfd2/a;", "c", "Lac4/a;", "d", "Lxc2/a;", "e", "Lib4/c;", "f", "Led2/a;", "g", "Ldd2/b;", "initialState", "Lxw/b;", "Ldd2/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, dd2.a> implements dd2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fd2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xc2.a idCardSuspensionWithAuthTokenUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ed2.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dd2.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<State, dd2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<dd2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<dd2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f41013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f41014b;

        /* JADX INFO: renamed from: dd2.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0912a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f41015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f41016b;

            /* JADX INFO: renamed from: dd2.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0913a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f41017d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f41018e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f41019f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f41021h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f41022j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f41023k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f41024l;

                public C0913a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f41017d = obj;
                    this.f41018e |= PKIFailureInfo.systemUnavail;
                    return C0912a.this.F(null, this);
                }
            }

            public C0912a(mu.h hVar, j jVar) {
                this.f41015a = hVar;
                this.f41016b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0913a c0913a;
                if (eVar instanceof C0913a) {
                    c0913a = (C0913a) eVar;
                    int i15 = c0913a.f41018e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0913a.f41018e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0913a = new C0913a(eVar);
                    }
                } else {
                    c0913a = new C0913a(eVar);
                }
                Object obj2 = c0913a.f41017d;
                Object objE = uq.b.e();
                int i16 = c0913a.f41018e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f41015a;
                    dd2.c.Data dataO9 = this.f41016b.o9((State) obj);
                    c0913a.f41019f = vq.j.a(obj);
                    c0913a.f41021h = vq.j.a(c0913a);
                    c0913a.f41022j = vq.j.a(obj);
                    c0913a.f41023k = vq.j.a(hVar);
                    c0913a.f41024l = 0;
                    c0913a.f41018e = 1;
                    if (hVar.F(dataO9, c0913a) == objE) {
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
            this.f41013a = gVar;
            this.f41014b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dd2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f41013a.a(new C0912a(hVar, this.f41014b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldd2/a$c;", "<unused var>", "Ldd2/b;", "Loq/i0;", "<anonymous>", "(Ldd2/a$c;Ldd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<dd2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41025e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f41025e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<dd2.a.b> bVarY1 = j.this.Y1();
                dd2.a.b.C0910a c0910a = dd2.a.b.C0910a.f40977a;
                this.f41025e = 1;
                if (bVarY1.F(c0910a, this) == objE) {
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
        public final Object w(dd2.a.c cVar, State state, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldd2/a$d;", "<unused var>", "Ldd2/b;", "Loq/i0;", "<anonymous>", "(Ldd2/a$d;Ldd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<dd2.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41027e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f41027e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<dd2.a.b> bVarY1 = j.this.Y1();
                dd2.a.b.C0911b c0911b = dd2.a.b.C0911b.f40978a;
                this.f41027e = 1;
                if (bVarY1.F(c0911b, this) == objE) {
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
        public final Object w(dd2.a.d dVar, State state, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldd2/a$g;", "action", "Ldd2/b;", "state", "Loq/i0;", "<anonymous>", "(Ldd2/a$g;Ldd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<dd2.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41031g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f41033e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f41034f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f41035g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f41036h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f41037j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ j f41038k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f41039l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ dd2.a.g f41040m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, State state, dd2.a.g gVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f41038k = jVar;
                this.f41039l = state;
                this.f41040m = gVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
            
                if (r1.F(r4, r6) == r0) goto L27;
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
                    int r1 = r6.f41037j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r6.f41034f
                    al0.e0 r0 = (al0.e0) r0
                    java.lang.Object r0 = r6.f41033e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r7)
                    goto Lbb
                L1b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L23:
                    oq.u.b(r7)
                    goto L52
                L27:
                    oq.u.b(r7)
                    dd2.j r7 = r6.f41038k
                    xc2.a r7 = dd2.j.l9(r7)
                    xc2.a$a r1 = new xc2.a$a
                    dd2.b r4 = r6.f41039l
                    gd2.a r4 = r4.getModel()
                    al0.c0 r4 = r4.getAction()
                    dd2.b r5 = r6.f41039l
                    gd2.a r5 = r5.getModel()
                    iy.b0 r5 = r5.getIdCardSeriesAndNumber()
                    r1.<init>(r4, r5)
                    r6.f41037j = r3
                    java.lang.Object r7 = r7.e(r1, r6)
                    if (r7 != r0) goto L52
                    goto Lba
                L52:
                    dx.i r7 = (dx.i) r7
                    dd2.j r1 = r6.f41038k
                    dd2.a$g r3 = r6.f41040m
                    boolean r4 = r7 instanceof dx.i.Left
                    if (r4 == 0) goto L8b
                    dx.i$b r7 = (dx.i.Left) r7
                    java.lang.Object r7 = r7.b()
                    k44.a r7 = (k44.a) r7
                    boolean r0 = r7 instanceof k44.a.Domain
                    if (r0 == 0) goto L77
                    dd2.a$f r0 = new dd2.a$f
                    k44.a$a r7 = (k44.a.Domain) r7
                    dx.b r7 = r7.getDomain()
                    r0.<init>(r7, r3)
                    dd2.j.i9(r1, r0)
                    goto Lbb
                L77:
                    k44.a$b r0 = k44.a.b.f108417a
                    boolean r7 = fr.t.c(r7, r0)
                    if (r7 == 0) goto L85
                    dd2.a$a r7 = dd2.a.C0909a.f40976a
                    dd2.j.i9(r1, r7)
                    goto Lbb
                L85:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                L8b:
                    boolean r3 = r7 instanceof dx.i.Right
                    if (r3 == 0) goto Lbe
                    r3 = r7
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    al0.e0 r3 = (al0.e0) r3
                    xw.b r1 = r1.Y1()
                    dd2.a$b$e r4 = new dd2.a$b$e
                    r4.<init>(r3)
                    java.lang.Object r7 = vq.j.a(r7)
                    r6.f41033e = r7
                    java.lang.Object r7 = vq.j.a(r3)
                    r6.f41034f = r7
                    r7 = 0
                    r6.f41035g = r7
                    r6.f41036h = r7
                    r6.f41037j = r2
                    java.lang.Object r7 = r1.F(r4, r6)
                    if (r7 != r0) goto Lbb
                Lba:
                    return r0
                Lbb:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                Lbe:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: dd2.j.d.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f41038k, this.f41039l, this.f41040m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dd2.a.g gVar = (dd2.a.g) this.f41030f;
            State state = (State) this.f41031g;
            Object objE = uq.b.e();
            int i15 = this.f41029e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = j.this.callActionWithLoaderUseCase;
                a aVar2 = new a(j.this, state, gVar, null);
                this.f41030f = vq.j.a(gVar);
                this.f41031g = vq.j.a(state);
                this.f41029e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(dd2.a.g gVar, State state, tq.e<? super i0> eVar) {
            d dVar = j.this.new d(eVar);
            dVar.f41030f = gVar;
            dVar.f41031g = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldd2/a$f;", "action", "Ldd2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldd2/a$f;Ldd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<dd2.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f41041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f41043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f41044h;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(j jVar, dd2.a.OnError onError, ib4.c.b bVar) {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                bVar = null;
            }
            if (bVar != null) {
                jVar.d9(onError.getRetryAction());
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dd2.a.OnError onError = (dd2.a.OnError) this.f41044h;
            Object objE = uq.b.e();
            int i15 = this.f41043g;
            if (i15 == 0) {
                u.b(obj);
                ib4.c cVar = j.this.errorMapper;
                dx.b error = onError.getError();
                final j jVar = j.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(error, false, new er.l() { // from class: dd2.k
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j.e.O(jVar, onError, (ib4.c.b) obj2);
                    }
                }, 2, null));
                xw.b<dd2.a.b> bVarY1 = j.this.Y1();
                dd2.a.b.Error error2 = new dd2.a.b.Error(bVarB);
                this.f41044h = vq.j.a(onError);
                this.f41041e = vq.j.a(bVarB);
                this.f41042f = 0;
                this.f41043g = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dd2.a.OnError onError, State state, tq.e<? super i0> eVar) {
            e eVar2 = j.this.new e(eVar);
            eVar2.f41044h = onError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldd2/a$a;", "<unused var>", "Ldd2/b;", "Loq/i0;", "<anonymous>", "(Ldd2/a$a;Ldd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<dd2.a.C0909a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41046e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(j jVar, b0 b0Var) {
            jVar.d9(dd2.a.e.f40984a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f41046e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                final j jVar2 = j.this;
                dd2.a.b.EdorAuth edorAuth = new dd2.a.b.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: dd2.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j.f.O(jVar2, (b0) obj2);
                    }
                }, null, 2, null));
                this.f41046e = 1;
                if (jVar.F(edorAuth, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dd2.a.C0909a c0909a, State state, tq.e<? super i0> eVar) {
            return j.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldd2/a$e;", "<unused var>", "Ldd2/b;", "Loq/i0;", "<anonymous>", "(Ldd2/a$e;Ldd2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<dd2.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41048e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f41048e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            j.this.d9(dd2.a.g.f40987a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dd2.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return j.this.new g(eVar2).J(i0.f148189a);
        }
    }

    public j(yy.a aVar, fd2.a aVar2, ac4.a aVar3, xc2.a aVar4, ib4.c cVar, ed2.a aVar5) {
        this.mapper = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.idCardSuspensionWithAuthTokenUC = aVar4;
        this.errorMapper = cVar;
        this.contract = aVar5;
        State state = new State(aVar5.b());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: dd2.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.q9(this.f41003a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dd2.c.Data o9(State state) {
        return this.mapper.b(new fd2.a.Params(state, b9(dd2.a.c.f40982a), b9(dd2.a.d.f40983a), b9(dd2.a.g.f40987a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dd2.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.r9(this.f41002a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dd2.a.c.class), oVar, bVar);
        zVar.x(q0.c(dd2.a.d.class), oVar, jVar.new c(null));
        zVar.x(q0.c(dd2.a.g.class), oVar, jVar.new d(null));
        zVar.x(q0.c(dd2.a.OnError.class), oVar, jVar.new e(null));
        zVar.x(q0.c(dd2.a.C0909a.class), oVar, jVar.new f(null));
        zVar.x(q0.c(dd2.a.e.class), oVar, jVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<dd2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, dd2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dd2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dd2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ed2.a aVar) {
        super.P5(aVar);
    }
}
