package ri3;

import a14.w;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020!0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lri3/p;", "Ll00/g;", "Lri3/c;", "Lri3/a;", "Lri3/d;", "", "Lyy/a;", "stateMachineFactory", "Lsi3/c;", "mapper", "Law0/g;", "beGetUfgFormReportDetailsUC", "La14/w;", "openUrlIntentUseCase", "La14/g;", "dialIntentUseCase", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lri3/b;", "setupData", "<init>", "(Lyy/a;Lsi3/c;Law0/g;La14/w;La14/g;Lhb4/d;Lib4/c;Lri3/b;)V", "Ldx/b;", "domainError", "Lk10/c0;", "Lri3/c$a;", "state", "retryAction", "Lk10/l;", "t9", "(Ldx/b;Lk10/c0;Lri3/a;)Lk10/l;", "Lri3/d$a;", "w9", "(Lri3/c;)Lri3/d$a;", "b", "Lsi3/c;", "c", "Law0/g;", "d", "La14/w;", "e", "La14/g;", "f", "Lhb4/d;", "g", "Lib4/c;", "h", "Lri3/b;", "j", "Lri3/c$a;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lri3/a$c;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<ri3.c, ri3.a> implements ri3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final si3.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aw0.g beGetUfgFormReportDetailsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.g dialIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ri3.c.Display initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ri3.c, ri3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ri3.a.c> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<ri3.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ri3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f174530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f174531b;

        /* JADX INFO: renamed from: ri3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4449a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f174532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f174533b;

            /* JADX INFO: renamed from: ri3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4450a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f174534d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f174535e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f174536f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f174538h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f174539j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f174540k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f174541l;

                public C4450a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f174534d = obj;
                    this.f174535e |= PKIFailureInfo.systemUnavail;
                    return C4449a.this.F(null, this);
                }
            }

            public C4449a(mu.h hVar, p pVar) {
                this.f174532a = hVar;
                this.f174533b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4450a c4450a;
                if (eVar instanceof C4450a) {
                    c4450a = (C4450a) eVar;
                    int i15 = c4450a.f174535e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4450a.f174535e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4450a = new C4450a(eVar);
                    }
                } else {
                    c4450a = new C4450a(eVar);
                }
                Object obj2 = c4450a.f174534d;
                Object objE = uq.b.e();
                int i16 = c4450a.f174535e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f174532a;
                    ri3.d.a aVarW9 = this.f174533b.w9((ri3.c) obj);
                    c4450a.f174536f = vq.j.a(obj);
                    c4450a.f174538h = vq.j.a(c4450a);
                    c4450a.f174539j = vq.j.a(obj);
                    c4450a.f174540k = vq.j.a(hVar);
                    c4450a.f174541l = 0;
                    c4450a.f174535e = 1;
                    if (hVar.F(aVarW9, c4450a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, p pVar) {
            this.f174530a = gVar;
            this.f174531b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ri3.d.a> hVar, tq.e eVar) {
            Object objA = this.f174530a.a(new C4449a(hVar, this.f174531b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lri3/a$c;", "action", "Lri3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lri3/a$c;Lri3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ri3.a.c, ri3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174543f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ri3.a.c cVar = (ri3.a.c) this.f174543f;
            Object objE = uq.b.e();
            int i15 = this.f174542e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ri3.a.c> bVarY1 = p.this.Y1();
                this.f174543f = vq.j.a(cVar);
                this.f174542e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ri3.a.c cVar, ri3.c cVar2, tq.e<? super i0> eVar) {
            b bVar = p.this.new b(eVar);
            bVar.f174543f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lri3/a$b;", "<unused var>", "Lri3/c;", "Loq/i0;", "<anonymous>", "(Lri3/a$b;Lri3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ri3.a.b, ri3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174545e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f174545e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(ri3.a.c.C4447a.f174490a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ri3.a.b bVar, ri3.c cVar, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lri3/a$d;", "action", "Lk10/c0;", "Lri3/c$a;", "state", "Lk10/l;", "Lri3/c;", "<anonymous>", "(Lri3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ri3.a.d, c0<ri3.c.Display>, tq.e<? super k10.l<? extends ri3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f174547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f174548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f174549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f174550h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f174551j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f174552k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f174553l;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        
            if (r3.c(r6, r10) == r2) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f174552k
                ri3.a$d r0 = (ri3.a.d) r0
                java.lang.Object r1 = r10.f174553l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r10.f174551j
                r4 = 1
                r5 = 2
                if (r3 == 0) goto L2f
                if (r3 == r4) goto L2b
                if (r3 != r5) goto L23
                java.lang.Object r0 = r10.f174548f
                sv0.l0 r0 = (sv0.UfgFormReportDetails) r0
                java.lang.Object r0 = r10.f174547e
                dx.i r0 = (dx.i) r0
                oq.u.b(r11)
                goto La6
            L23:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2b:
                oq.u.b(r11)
                goto L54
            L2f:
                oq.u.b(r11)
                ri3.p r11 = ri3.p.this
                aw0.g r11 = ri3.p.n9(r11)
                aw0.g$a r3 = new aw0.g$a
                ri3.p r6 = ri3.p.this
                ri3.b r6 = ri3.p.q9(r6)
                sv0.y r6 = r6.getProcessId()
                r3.<init>(r6)
                r10.f174552k = r0
                r10.f174553l = r1
                r10.f174551j = r4
                java.lang.Object r11 = r11.c(r3, r10)
                if (r11 != r2) goto L54
                goto La5
            L54:
                dx.i r11 = (dx.i) r11
                ri3.p r3 = ri3.p.this
                boolean r4 = r11 instanceof dx.i.Left
                if (r4 == 0) goto L69
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                k10.l r11 = ri3.p.r9(r3, r11, r1, r0)
                return r11
            L69:
                boolean r4 = r11 instanceof dx.i.Right
                if (r4 == 0) goto Lab
                r4 = r11
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                sv0.l0 r4 = (sv0.UfgFormReportDetails) r4
                a14.w r3 = ri3.p.p9(r3)
                a14.w$b r6 = new a14.w$b
                java.lang.String r7 = r4.getFillFormClaimUrl()
                r8 = 0
                r9 = 0
                r6.<init>(r7, r9, r5, r8)
                java.lang.Object r0 = vq.j.a(r0)
                r10.f174552k = r0
                r10.f174553l = r1
                java.lang.Object r11 = vq.j.a(r11)
                r10.f174547e = r11
                java.lang.Object r11 = vq.j.a(r4)
                r10.f174548f = r11
                r10.f174549g = r9
                r10.f174550h = r9
                r10.f174551j = r5
                java.lang.Object r11 = r3.c(r6, r10)
                if (r11 != r2) goto La6
            La5:
                return r2
            La6:
                k10.l r11 = r1.c()
                return r11
            Lab:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ri3.p.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ri3.a.d dVar, c0<ri3.c.Display> c0Var, tq.e<? super k10.l<? extends ri3.c>> eVar) {
            d dVar2 = p.this.new d(eVar);
            dVar2.f174552k = dVar;
            dVar2.f174553l = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lri3/a$a;", "action", "Lri3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lri3/a$a;Lri3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ri3.a.CallPhoneNumber, ri3.c.Display, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174556f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ri3.a.CallPhoneNumber callPhoneNumber = (ri3.a.CallPhoneNumber) this.f174556f;
            Object objE = uq.b.e();
            int i15 = this.f174555e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.g gVar = p.this.dialIntentUseCase;
                a14.g.Params params = new a14.g.Params(callPhoneNumber.getPhoneNumber());
                this.f174556f = vq.j.a(callPhoneNumber);
                this.f174555e = 1;
                if (gVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ri3.a.CallPhoneNumber callPhoneNumber, ri3.c.Display display, tq.e<? super i0> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f174556f = callPhoneNumber;
            return eVar2.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, si3.c cVar, aw0.g gVar, w wVar, a14.g gVar2, hb4.d dVar, ib4.c cVar2, SetupData setupData) {
        this.mapper = cVar;
        this.beGetUfgFormReportDetailsUC = gVar;
        this.openUrlIntentUseCase = wVar;
        this.dialIntentUseCase = gVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar2;
        this.setupData = setupData;
        ri3.c.Display display = new ri3.c.Display(setupData.getProviderName(), setupData.getAutomaticReportSuccessResponse());
        this.initialState = display;
        this.stateMachine = aVar.a(display, new er.l() { // from class: ri3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f174518a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), w9(display));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ri3.a.c.class), oVar, bVar);
        zVar.x(q0.c(ri3.a.b.class), oVar, pVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ri3.a.d.class), oVar, dVar);
        zVar.x(q0.c(ri3.a.CallPhoneNumber.class), oVar, pVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<ri3.c> t9(final dx.b domainError, c0<ri3.c.Display> state, final ri3.a retryAction) {
        return state.d(new er.l() { // from class: ri3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f174513a, domainError, retryAction, (c.Display) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ri3.c.Error u9(final p pVar, dx.b bVar, final ri3.a aVar, ri3.c.Display display) {
        return new ri3.c.Error(pVar.errorVMSFactory.a(pVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ri3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f174516a, aVar, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(p pVar, ri3.a aVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            pVar.d9(aVar);
        } else if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ri3.d.a w9(ri3.c cVar) {
        return this.mapper.b(new si3.c.Params(cVar, b9(ri3.a.d.f174491a), new er.l() { // from class: ri3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f174510a, (String) obj);
            }
        }, b9(ri3.a.b.f174489a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, String str) {
        pVar.d9(new ri3.a.CallPhoneNumber(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, v vVar) {
        vVar.c(q0.c(ri3.c.class), new er.l() { // from class: ri3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f174511a, (z) obj);
            }
        });
        vVar.c(q0.c(ri3.c.Display.class), new er.l() { // from class: ri3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f174512a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ri3.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ri3.c, ri3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ri3.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
