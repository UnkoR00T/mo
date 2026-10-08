package aq3;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b%\u0010$J(\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b)\u0010*J&\u0010/\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020(0-H\u0082@¢\u0006\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Laq3/o;", "Ll00/g;", "Laq3/b;", "Laq3/a;", "Laq3/c;", "", "Lyy/a;", "stateMachineFactory", "Lbq3/a;", "screenMapper", "Llp3/c;", "validateTitleUC", "Llp3/b;", "validateDescriptionUC", "Lpo0/j;", "sendUC", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUC", "Loo0/k;", "category", "<init>", "(Lyy/a;Lbq3/a;Llp3/c;Llp3/b;Lpo0/j;Lib4/c;Lac4/a;Loo0/k;)V", "state", "Laq3/c$a;", "w9", "(Laq3/b;)Laq3/c$a;", "Lk10/c0;", "Lk10/l;", "E9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "", "value", "Lhz/b;", "G9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "D9", "title", "description", "Loq/i0;", "z9", "(Ljava/lang/String;Ljava/lang/String;Loo0/k;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "retryAction", "u9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "b", "Lbq3/a;", "c", "Llp3/c;", "d", "Llp3/b;", "e", "Lpo0/j;", "f", "Lib4/c;", "g", "Lac4/a;", "h", "Loo0/k;", "j", "Laq3/b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Laq3/a$c;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, aq3.a> implements aq3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bq3.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lp3.c validateTitleUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lp3.b validateDescriptionUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final po0.j sendUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oo0.k category;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, aq3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<aq3.c.Data> state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<aq3.a.c> navAction;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f14172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f14173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14175h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f14176j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f14178l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f14179m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ oo0.k f14180n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, oo0.k kVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f14178l = str;
            this.f14179m = str2;
            this.f14180n = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(o oVar, String str, String str2) {
            oVar.d9(new aq3.a.Send(str, str2));
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
        
            if (r1.u9(r5, r6, r7) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f14176j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r7.f14173f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r7.f14172e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto L88
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                oq.u.b(r8)
                goto L43
            L26:
                oq.u.b(r8)
                aq3.o r8 = aq3.o.this
                po0.j r8 = aq3.o.n9(r8)
                po0.j$a r1 = new po0.j$a
                java.lang.String r4 = r7.f14178l
                java.lang.String r5 = r7.f14179m
                oo0.k r6 = r7.f14180n
                r1.<init>(r4, r5, r6)
                r7.f14176j = r3
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L43
                goto L76
            L43:
                dx.i r8 = (dx.i) r8
                aq3.o r1 = aq3.o.this
                java.lang.String r3 = r7.f14178l
                java.lang.String r4 = r7.f14179m
                boolean r5 = r8 instanceof dx.i.Left
                if (r5 == 0) goto L77
                r5 = r8
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                aq3.n r6 = new aq3.n
                r6.<init>()
                java.lang.Object r8 = vq.j.a(r8)
                r7.f14172e = r8
                java.lang.Object r8 = vq.j.a(r5)
                r7.f14173f = r8
                r8 = 0
                r7.f14174g = r8
                r7.f14175h = r8
                r7.f14176j = r2
                java.lang.Object r8 = aq3.o.o9(r1, r5, r6, r7)
                if (r8 != r0) goto L88
            L76:
                return r0
            L77:
                boolean r0 = r8 instanceof dx.i.Right
                if (r0 == 0) goto L8b
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                oq.i0 r8 = (oq.i0) r8
                aq3.a$b r8 = aq3.a.b.f14124a
                aq3.o.m9(r1, r8)
            L88:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L8b:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: aq3.o.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return o.this.new a(this.f14178l, this.f14179m, this.f14180n, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<aq3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f14181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f14182b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f14183a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f14184b;

            /* JADX INFO: renamed from: aq3.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0308a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f14185d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f14186e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f14187f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f14189h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f14190j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f14191k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f14192l;

                public C0308a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f14185d = obj;
                    this.f14186e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f14183a = hVar;
                this.f14184b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0308a c0308a;
                if (eVar instanceof C0308a) {
                    c0308a = (C0308a) eVar;
                    int i15 = c0308a.f14186e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0308a.f14186e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0308a = new C0308a(eVar);
                    }
                } else {
                    c0308a = new C0308a(eVar);
                }
                Object obj2 = c0308a.f14185d;
                Object objE = uq.b.e();
                int i16 = c0308a.f14186e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f14183a;
                    aq3.c.Data dataW9 = this.f14184b.w9((State) obj);
                    c0308a.f14187f = vq.j.a(obj);
                    c0308a.f14189h = vq.j.a(c0308a);
                    c0308a.f14190j = vq.j.a(obj);
                    c0308a.f14191k = vq.j.a(hVar);
                    c0308a.f14192l = 0;
                    c0308a.f14186e = 1;
                    if (hVar.F(dataW9, c0308a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f14181a = gVar;
            this.f14182b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super aq3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f14181a.a(new a(hVar, this.f14182b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laq3/a$a;", "<unused var>", "Laq3/b;", "Loq/i0;", "<anonymous>", "(Laq3/a$a;Laq3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<aq3.a.C0305a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14193e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14193e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<aq3.a.c> bVarY1 = o.this.Y1();
                aq3.a.c.C0306a c0306a = aq3.a.c.C0306a.f14125a;
                this.f14193e = 1;
                if (bVarY1.F(c0306a, this) == objE) {
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
        public final Object w(aq3.a.C0305a c0305a, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laq3/a$b;", "<unused var>", "Laq3/b;", "Loq/i0;", "<anonymous>", "(Laq3/a$b;Laq3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<aq3.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14195e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14195e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<aq3.a.c> bVarY1 = o.this.Y1();
                aq3.a.c.C0307c c0307c = aq3.a.c.C0307c.f14127a;
                this.f14195e = 1;
                if (bVarY1.F(c0307c, this) == objE) {
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
        public final Object w(aq3.a.b bVar, State state, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laq3/a$d;", "action", "Laq3/b;", "snapshot", "Loq/i0;", "<anonymous>", "(Laq3/a$d;Laq3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<aq3.a.Send, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f14199g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            aq3.a.Send send = (aq3.a.Send) this.f14198f;
            State state = (State) this.f14199g;
            Object objE = uq.b.e();
            int i15 = this.f14197e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                String title = send.getTitle();
                String description = send.getDescription();
                oo0.k category = state.getCategory();
                this.f14198f = vq.j.a(send);
                this.f14199g = vq.j.a(state);
                this.f14197e = 1;
                if (oVar.z9(title, description, category, this) == objE) {
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
        public final Object w(aq3.a.Send send, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f14198f = send;
            eVar2.f14199g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Laq3/a$f;", "action", "Lk10/c0;", "Laq3/b;", "state", "Lk10/l;", "<anonymous>", "(Laq3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<aq3.a.UpdateTitleValue, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f14203g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(aq3.a.UpdateTitleValue updateTitleValue, hz.b bVar, State state) {
            return State.b(state, null, updateTitleValue.getValue(), bVar, null, null, 25, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final aq3.a.UpdateTitleValue updateTitleValue = (aq3.a.UpdateTitleValue) this.f14202f;
            c0 c0Var = (c0) this.f14203g;
            Object objE = uq.b.e();
            int i15 = this.f14201e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                String value = updateTitleValue.getValue();
                this.f14202f = updateTitleValue;
                this.f14203g = c0Var;
                this.f14201e = 1;
                obj = oVar.G9(value, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final hz.b bVar = (hz.b) obj;
            return c0Var.b(new er.l() { // from class: aq3.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(updateTitleValue, bVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(aq3.a.UpdateTitleValue updateTitleValue, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f14202f = updateTitleValue;
            fVar.f14203g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Laq3/a$e;", "action", "Lk10/c0;", "Laq3/b;", "state", "Lk10/l;", "<anonymous>", "(Laq3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<aq3.a.UpdateDescriptionValue, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f14207g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(aq3.a.UpdateDescriptionValue updateDescriptionValue, hz.b bVar, State state) {
            return State.b(state, null, null, null, updateDescriptionValue.getValue(), bVar, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final aq3.a.UpdateDescriptionValue updateDescriptionValue = (aq3.a.UpdateDescriptionValue) this.f14206f;
            c0 c0Var = (c0) this.f14207g;
            Object objE = uq.b.e();
            int i15 = this.f14205e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                String value = updateDescriptionValue.getValue();
                this.f14206f = updateDescriptionValue;
                this.f14207g = c0Var;
                this.f14205e = 1;
                obj = oVar.D9(value, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final hz.b bVar = (hz.b) obj;
            return c0Var.b(new er.l() { // from class: aq3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.g.O(updateDescriptionValue, bVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(aq3.a.UpdateDescriptionValue updateDescriptionValue, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = o.this.new g(eVar);
            gVar.f14206f = updateDescriptionValue;
            gVar.f14207g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Laq3/a$g;", "<unused var>", "Lk10/c0;", "Laq3/b;", "state", "Lk10/l;", "<anonymous>", "(Laq3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<aq3.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14210f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f14210f;
            Object objE = uq.b.e();
            int i15 = this.f14209e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            o oVar = o.this;
            this.f14210f = vq.j.a(c0Var);
            this.f14209e = 1;
            Object objE9 = oVar.E9(c0Var, this);
            return objE9 == objE ? objE : objE9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(aq3.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = o.this.new h(eVar);
            hVar.f14210f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f14212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f14213e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14215g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f14213e = obj;
            this.f14215g |= PKIFailureInfo.systemUnavail;
            return o.this.D9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f14216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f14217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14218f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14220h;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f14218f = obj;
            this.f14220h |= PKIFailureInfo.systemUnavail;
            return o.this.E9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f14221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f14222e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14224g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f14222e = obj;
            this.f14224g |= PKIFailureInfo.systemUnavail;
            return o.this.G9(null, this);
        }
    }

    public o(yy.a aVar, bq3.a aVar2, lp3.c cVar, lp3.b bVar, po0.j jVar, ib4.c cVar2, ac4.a aVar3, oo0.k kVar) {
        this.screenMapper = aVar2;
        this.validateTitleUC = cVar;
        this.validateDescriptionUC = bVar;
        this.sendUC = jVar;
        this.genericDomainErrorMapper = cVar2;
        this.callActionWithLoaderUC = aVar3;
        this.category = kVar;
        State state = new State(kVar, null, null, null, null, 30, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: aq3.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.B9(this.f14157a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), w9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: aq3.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.C9(this.f14153a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(aq3.a.C0305a.class), oVar2, cVar);
        zVar.x(q0.c(aq3.a.b.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(aq3.a.Send.class), oVar2, oVar.new e(null));
        zVar.v(q0.c(aq3.a.UpdateTitleValue.class), oVar2, oVar.new f(null));
        zVar.v(q0.c(aq3.a.UpdateDescriptionValue.class), oVar2, oVar.new g(null));
        zVar.v(q0.c(aq3.a.g.class), oVar2, oVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(String str, tq.e<? super hz.b> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f14215g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f14215g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objD = iVar.f14213e;
        Object objE = uq.b.e();
        int i16 = iVar.f14215g;
        if (i16 == 0) {
            u.b(objD);
            lp3.b bVar = this.validateDescriptionUC;
            lp3.b.Params params = new lp3.b.Params(str);
            iVar.f14212d = vq.j.a(str);
            iVar.f14215g = 1;
            objD = bVar.d(params, iVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        return ((hz.g) objD).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E9(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        j jVar;
        c0<State> c0Var2;
        final hz.b bVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f14220h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f14220h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objG9 = jVar.f14218f;
        Object objE = uq.b.e();
        int i16 = jVar.f14220h;
        if (i16 == 0) {
            u.b(objG9);
            String titleValue = c0Var.a().getTitleValue();
            jVar.f14216d = c0Var;
            jVar.f14220h = 1;
            objG9 = G9(titleValue, jVar);
            if (objG9 != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c0Var = (c0) jVar.f14216d;
            u.b(objG9);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (hz.b) jVar.f14217e;
            c0Var2 = (c0) jVar.f14216d;
            u.b(objG9);
        }
        final hz.b bVar2 = (hz.b) objG9;
        if (bVar.a() && bVar2.a()) {
            d9(new aq3.a.Send(c0Var2.a().getTitleValue(), c0Var2.a().getDescriptionValue()));
        }
        return c0Var2.b(new er.l() { // from class: aq3.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.F9(bVar, bVar2, (State) obj);
            }
        });
        hz.b bVar3 = (hz.b) objG9;
        String descriptionValue = c0Var.a().getDescriptionValue();
        jVar.f14216d = c0Var;
        jVar.f14217e = bVar3;
        jVar.f14220h = 2;
        Object objD9 = D9(descriptionValue, jVar);
        if (objD9 != objE) {
            c0Var2 = c0Var;
            bVar = bVar3;
            objG9 = objD9;
            final hz.b bVar4 = (hz.b) objG9;
            if (bVar.a()) {
                d9(new aq3.a.Send(c0Var2.a().getTitleValue(), c0Var2.a().getDescriptionValue()));
            }
            return c0Var2.b(new er.l() { // from class: aq3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return o.F9(bVar, bVar4, (State) obj);
                }
            });
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State F9(hz.b bVar, hz.b bVar2, State state) {
        return State.b(state, null, null, bVar, null, bVar2, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G9(String str, tq.e<? super hz.b> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f14224g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f14224g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objD = kVar.f14222e;
        Object objE = uq.b.e();
        int i16 = kVar.f14224g;
        if (i16 == 0) {
            u.b(objD);
            lp3.c cVar = this.validateTitleUC;
            lp3.c.Params params = new lp3.c.Params(str);
            kVar.f14221d = vq.j.a(str);
            kVar.f14224g = 1;
            objD = cVar.d(params, kVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        return ((hz.g) objD).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new aq3.a.c.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: aq3.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(er.a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aq3.c.Data w9(State state) {
        return this.screenMapper.b(new bq3.a.Params(state, b9(aq3.a.C0305a.f14123a), b9(aq3.a.g.f14132a), new er.l() { // from class: aq3.h
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9(this.f14151a, (String) obj);
            }
        }, new er.l() { // from class: aq3.i
            @Override // er.l
            public final Object b(Object obj) {
                return o.y9(this.f14152a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(o oVar, String str) {
        oVar.d9(new aq3.a.UpdateTitleValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(o oVar, String str) {
        oVar.d9(new aq3.a.UpdateDescriptionValue(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z9(String str, String str2, oo0.k kVar, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUC, null, new a(str, str2, kVar, null), eVar, 1, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oo0.k kVar) {
        super.P5(kVar);
    }

    @Override // zx.b
    public xw.b<aq3.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, aq3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<aq3.c.Data> getState() {
        return this.state;
    }
}
