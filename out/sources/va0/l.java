package va0;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lva0/l;", "Ll00/g;", "Lva0/b;", "Lva0/a;", "Lva0/c;", "", "Lyy/a;", "stateMachineFactory", "Lwa0/a;", "mapper", "Lqg0/h;", "logoutFromAppUC", "Lka0/a;", "juniorDashboardCache", "<init>", "(Lyy/a;Lwa0/a;Lqg0/h;Lka0/a;)V", "state", "Lva0/c$a;", "l9", "(Lva0/b;)Lva0/c$a;", "b", "Lwa0/a;", "c", "Lqg0/h;", "d", "Lka0/a;", "Lva0/b$a;", "e", "Lva0/b$a;", "initialState", "Lxw/b;", "Lva0/a$b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lva0/a$c;", "g", "nestedNavAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<va0.b, va0.a> implements va0.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wa0.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qg0.h logoutFromAppUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ka0.a juniorDashboardCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final va0.b.DashboardDisplayed initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<va0.a.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<va0.a.c> nestedNavAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<va0.b, va0.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<va0.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<va0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f205679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f205680b;

        /* JADX INFO: renamed from: va0.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5371a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f205681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f205682b;

            /* JADX INFO: renamed from: va0.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5372a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f205683d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f205684e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f205685f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f205687h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f205688j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f205689k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f205690l;

                public C5372a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f205683d = obj;
                    this.f205684e |= PKIFailureInfo.systemUnavail;
                    return C5371a.this.F(null, this);
                }
            }

            public C5371a(mu.h hVar, l lVar) {
                this.f205681a = hVar;
                this.f205682b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5372a c5372a;
                if (eVar instanceof C5372a) {
                    c5372a = (C5372a) eVar;
                    int i15 = c5372a.f205684e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5372a.f205684e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5372a = new C5372a(eVar);
                    }
                } else {
                    c5372a = new C5372a(eVar);
                }
                Object obj2 = c5372a.f205683d;
                Object objE = uq.b.e();
                int i16 = c5372a.f205684e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f205681a;
                    va0.c.a aVarL9 = this.f205682b.l9((va0.b) obj);
                    c5372a.f205685f = vq.j.a(obj);
                    c5372a.f205687h = vq.j.a(c5372a);
                    c5372a.f205688j = vq.j.a(obj);
                    c5372a.f205689k = vq.j.a(hVar);
                    c5372a.f205690l = 0;
                    c5372a.f205684e = 1;
                    if (hVar.F(aVarL9, c5372a) == objE) {
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
            this.f205679a = gVar;
            this.f205680b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super va0.c.a> hVar, tq.e eVar) {
            Object objA = this.f205679a.a(new C5371a(hVar, this.f205680b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "enabled", "Lk10/c0;", "Lva0/b$a;", "state", "Lk10/l;", "Lva0/b;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<Boolean, c0<va0.b.DashboardDisplayed>, tq.e<? super k10.l<? extends va0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f205693g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final va0.b.DashboardDisplayed O(Boolean bool, va0.b.DashboardDisplayed dashboardDisplayed) {
            return va0.b.DashboardDisplayed.b(dashboardDisplayed, null, bool != null ? bool.booleanValue() : false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Boolean bool = (Boolean) this.f205692f;
            c0 c0Var = (c0) this.f205693g;
            uq.b.e();
            if (this.f205691e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: va0.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.b.O(bool, (b.DashboardDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Boolean bool, c0<va0.b.DashboardDisplayed> c0Var, tq.e<? super k10.l<? extends va0.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f205692f = bool;
            bVar.f205693g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lva0/a$a;", "<unused var>", "Lva0/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lva0/a$a;Lva0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<va0.a.C5365a, va0.b.DashboardDisplayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205695f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f205697a;

            static {
                int[] iArr = new int[ma0.a.values().length];
                try {
                    iArr[ma0.a.DESKTOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f205697a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f205695f
                va0.b$a r0 = (va0.b.DashboardDisplayed) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f205694e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L68
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L4a
            L22:
                oq.u.b(r7)
                ma0.a r7 = r0.getCurrentVisibleTab()
                int[] r2 = va0.l.c.a.f205697a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 != r4) goto L61
                va0.l r7 = va0.l.this
                qg0.h r7 = va0.l.j9(r7)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Object r5 = vq.j.a(r0)
                r6.f205695f = r5
                r6.f205694e = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L4a
                goto L60
            L4a:
                va0.l r7 = va0.l.this
                xw.b r7 = r7.Y1()
                va0.a$b$c r2 = va0.a.b.c.f205646a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f205695f = r0
                r6.f205694e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L68
            L60:
                return r1
            L61:
                va0.l r7 = va0.l.this
                va0.a$d r0 = va0.a.d.f205650a
                va0.l.i9(r7, r0)
            L68:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: va0.l.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(va0.a.C5365a c5365a, va0.b.DashboardDisplayed dashboardDisplayed, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f205695f = dashboardDisplayed;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lva0/a$d;", "<unused var>", "Lk10/c0;", "Lva0/b$a;", "state", "Lk10/l;", "Lva0/b;", "<anonymous>", "(Lva0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<va0.a.d, c0<va0.b.DashboardDisplayed>, tq.e<? super k10.l<? extends va0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205699f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final va0.b.DashboardDisplayed O(va0.b.DashboardDisplayed dashboardDisplayed) {
            return va0.b.DashboardDisplayed.b(dashboardDisplayed, ma0.a.DESKTOP, false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f205699f;
            Object objE = uq.b.e();
            int i15 = this.f205698e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<va0.a.c> bVarG = l.this.g();
                va0.a.c.C5368a c5368a = va0.a.c.C5368a.f205647a;
                this.f205699f = c0Var;
                this.f205698e = 1;
                if (bVarG.F(c5368a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: va0.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.d.O((b.DashboardDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(va0.a.d dVar, c0<va0.b.DashboardDisplayed> c0Var, tq.e<? super k10.l<? extends va0.b>> eVar) {
            d dVar2 = l.this.new d(eVar);
            dVar2.f205699f = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lva0/a$e;", "<unused var>", "Lk10/c0;", "Lva0/b$a;", "state", "Lk10/l;", "Lva0/b;", "<anonymous>", "(Lva0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<va0.a.e, c0<va0.b.DashboardDisplayed>, tq.e<? super k10.l<? extends va0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205702f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final va0.b.DashboardDisplayed O(va0.b.DashboardDisplayed dashboardDisplayed) {
            return va0.b.DashboardDisplayed.b(dashboardDisplayed, ma0.a.SCHOOL, false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f205702f;
            Object objE = uq.b.e();
            int i15 = this.f205701e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<va0.a.c> bVarG = l.this.g();
                va0.a.c.b bVar = va0.a.c.b.f205648a;
                this.f205702f = c0Var;
                this.f205701e = 1;
                if (bVarG.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: va0.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.O((b.DashboardDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(va0.a.e eVar, c0<va0.b.DashboardDisplayed> c0Var, tq.e<? super k10.l<? extends va0.b>> eVar2) {
            e eVar3 = l.this.new e(eVar2);
            eVar3.f205702f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lva0/a$f;", "<unused var>", "Lk10/c0;", "Lva0/b$a;", "state", "Lk10/l;", "Lva0/b;", "<anonymous>", "(Lva0/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<va0.a.f, c0<va0.b.DashboardDisplayed>, tq.e<? super k10.l<? extends va0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205705f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final va0.b.DashboardDisplayed O(va0.b.DashboardDisplayed dashboardDisplayed) {
            return va0.b.DashboardDisplayed.b(dashboardDisplayed, ma0.a.SETTINGS, false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f205705f;
            Object objE = uq.b.e();
            int i15 = this.f205704e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<va0.a.c> bVarG = l.this.g();
                va0.a.c.C5369c c5369c = va0.a.c.C5369c.f205649a;
                this.f205705f = c0Var;
                this.f205704e = 1;
                if (bVarG.F(c5369c, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: va0.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.f.O((b.DashboardDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(va0.a.f fVar, c0<va0.b.DashboardDisplayed> c0Var, tq.e<? super k10.l<? extends va0.b>> eVar) {
            f fVar2 = l.this.new f(eVar);
            fVar2.f205705f = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, wa0.a aVar2, qg0.h hVar, ka0.a aVar3) {
        this.mapper = aVar2;
        this.logoutFromAppUC = hVar;
        this.juniorDashboardCache = aVar3;
        va0.b.DashboardDisplayed dashboardDisplayed = new va0.b.DashboardDisplayed(null, false, 3, null);
        this.initialState = dashboardDisplayed;
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.stateMachine = aVar.a(dashboardDisplayed, new er.l() { // from class: va0.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f205669a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(dashboardDisplayed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final va0.c.a l9(va0.b state) {
        return this.mapper.b(new wa0.a.Params(state, b9(va0.a.C5365a.f205643a), b9(va0.a.d.f205650a), b9(va0.a.e.f205651a), b9(va0.a.f.f205652a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final l lVar, v vVar) {
        vVar.c(q0.c(va0.b.DashboardDisplayed.class), new er.l() { // from class: va0.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f205670a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(l lVar, z zVar) {
        k10.k.m(zVar, lVar.juniorDashboardCache.b(), null, new b(null), 2, null);
        c cVar = lVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(va0.a.C5365a.class), oVar, cVar);
        zVar.v(q0.c(va0.a.d.class), oVar, lVar.new d(null));
        zVar.v(q0.c(va0.a.e.class), oVar, lVar.new e(null));
        zVar.v(q0.c(va0.a.f.class), oVar, lVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<va0.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<va0.b, va0.a> e9() {
        return this.stateMachine;
    }

    public xw.b<va0.a.c> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public p0<va0.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
