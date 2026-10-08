package fu1;

import fr.q0;
import hu1.FormFieldData;
import iy.b0;
import java.util.Iterator;
import java.util.Map;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b!\u0010\"J&\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0%H\u0082@¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lfu1/q;", "Ll00/g;", "Lfu1/b;", "Lfu1/a;", "Lfu1/c;", "", "Lyy/a;", "stateMachineFactory", "Lgu1/b;", "mapper", "Lyt1/b;", "formValidationUC", "Lxv0/a;", "getDriverQualificationsUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "domainErrorMapper", "<init>", "(Lyy/a;Lgu1/b;Lyt1/b;Lxv0/a;Lac4/a;Lib4/c;)V", "state", "Lfu1/c$a;", "x9", "(Lfu1/b;)Lfu1/c$a;", "Lk10/c0;", "Lk10/l;", "E9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "firstName", "surname", "seriesAndNumber", "Loq/i0;", "u9", "(Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "onRetry", "v9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "b", "Lgu1/b;", "c", "Lyt1/b;", "d", "Lxv0/a;", "e", "Lac4/a;", "f", "Lib4/c;", "g", "Lfu1/b;", "initialState", "Lxw/b;", "Lfu1/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, fu1.a> implements fu1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gu1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yt1.b formValidationUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xv0.a getDriverQualificationsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fu1.a.InterfaceC1506a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, fu1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<fu1.c.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f67173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f67174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f67175g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f67176h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f67177j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ b0 f67179l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ b0 f67180m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0 f67181n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f67179l = b0Var;
            this.f67180m = b0Var2;
            this.f67181n = b0Var3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            if (r1.v9(r3, r4, r7) == r0) goto L17;
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
                int r1 = r7.f67177j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r7.f67174f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r7.f67173e
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
                fu1.q r8 = fu1.q.this
                xv0.a r8 = fu1.q.q9(r8)
                xv0.a$a r1 = new xv0.a$a
                iy.b0 r4 = r7.f67179l
                iy.b0 r5 = r7.f67180m
                iy.b0 r6 = r7.f67181n
                r1.<init>(r4, r5, r6)
                r7.f67177j = r3
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L43
                goto L73
            L43:
                dx.i r8 = (dx.i) r8
                fu1.q r1 = fu1.q.this
                boolean r3 = r8 instanceof dx.i.Left
                if (r3 == 0) goto L74
                r3 = r8
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                fu1.a$f r4 = fu1.a.f.f67116a
                er.a r4 = fu1.q.n9(r1, r4)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f67173e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f67174f = r8
                r8 = 0
                r7.f67175g = r8
                r7.f67176h = r8
                r7.f67177j = r2
                java.lang.Object r8 = fu1.q.r9(r1, r3, r4, r7)
                if (r8 != r0) goto L88
            L73:
                return r0
            L74:
                boolean r0 = r8 instanceof dx.i.Right
                if (r0 == 0) goto L8b
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                pv0.a r8 = (pv0.DriverQualifications) r8
                fu1.a$h r0 = new fu1.a$h
                r0.<init>(r8)
                fu1.q.o9(r1, r0)
            L88:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L8b:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fu1.q.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new a(this.f67179l, this.f67180m, this.f67181n, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fu1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f67182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f67183b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f67184a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f67185b;

            /* JADX INFO: renamed from: fu1.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1508a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f67186d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f67187e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f67188f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f67190h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f67191j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f67192k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f67193l;

                public C1508a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f67186d = obj;
                    this.f67187e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f67184a = hVar;
                this.f67185b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1508a c1508a;
                if (eVar instanceof C1508a) {
                    c1508a = (C1508a) eVar;
                    int i15 = c1508a.f67187e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1508a.f67187e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1508a = new C1508a(eVar);
                    }
                } else {
                    c1508a = new C1508a(eVar);
                }
                Object obj2 = c1508a.f67186d;
                Object objE = uq.b.e();
                int i16 = c1508a.f67187e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f67184a;
                    fu1.c.Data dataX9 = this.f67185b.x9((State) obj);
                    c1508a.f67188f = vq.j.a(obj);
                    c1508a.f67190h = vq.j.a(c1508a);
                    c1508a.f67191j = vq.j.a(obj);
                    c1508a.f67192k = vq.j.a(hVar);
                    c1508a.f67193l = 0;
                    c1508a.f67187e = 1;
                    if (hVar.F(dataX9, c1508a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f67182a = gVar;
            this.f67183b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fu1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f67182a.a(new a(hVar, this.f67183b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$d;", "action", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fu1.a.OnFieldTypeToScroll, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f67196g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fu1.a.OnFieldTypeToScroll onFieldTypeToScroll, State state) {
            return State.b(state, null, null, null, null, null, null, onFieldTypeToScroll.getTypeToScroll(), 63, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fu1.a.OnFieldTypeToScroll onFieldTypeToScroll = (fu1.a.OnFieldTypeToScroll) this.f67195f;
            c0 c0Var = (c0) this.f67196g;
            uq.b.e();
            if (this.f67194e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fu1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(onFieldTypeToScroll, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.OnFieldTypeToScroll onFieldTypeToScroll, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f67195f = onFieldTypeToScroll;
            cVar.f67196g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$l;", "<unused var>", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<fu1.a.l, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67198f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return new State(null, null, null, null, null, null, null, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f67198f;
            uq.b.e();
            if (this.f67197e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fu1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.l lVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f67198f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfu1/a$h;", "action", "Lfu1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfu1/a$h;Lfu1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fu1.a.OnNext, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67200f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fu1.a.OnNext onNext = (fu1.a.OnNext) this.f67200f;
            Object objE = uq.b.e();
            int i15 = this.f67199e;
            if (i15 == 0) {
                oq.u.b(obj);
                q.this.d9(fu1.a.l.f67124a);
                xw.b<fu1.a.InterfaceC1506a> bVarY1 = q.this.Y1();
                fu1.a.InterfaceC1506a.Next next = new fu1.a.InterfaceC1506a.Next(onNext.getDriverQualifications());
                this.f67200f = vq.j.a(onNext);
                this.f67199e = 1;
                if (bVarY1.F(next, this) == objE) {
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
        public final Object w(fu1.a.OnNext onNext, State state, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f67200f = onNext;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfu1/a$e;", "<unused var>", "Lfu1/b;", "Loq/i0;", "<anonymous>", "(Lfu1/a$e;Lfu1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fu1.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67202e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f67202e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fu1.a.InterfaceC1506a> bVarY1 = q.this.Y1();
                fu1.a.InterfaceC1506a.c cVar = fu1.a.InterfaceC1506a.c.f67109a;
                this.f67202e = 1;
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
        public final Object w(fu1.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return q.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfu1/a$b;", "<unused var>", "Lfu1/b;", "Loq/i0;", "<anonymous>", "(Lfu1/a$b;Lfu1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fu1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67204e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f67204e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fu1.a.InterfaceC1506a> bVarY1 = q.this.Y1();
                fu1.a.InterfaceC1506a.C1507a c1507a = fu1.a.InterfaceC1506a.C1507a.f67107a;
                this.f67204e = 1;
                if (bVarY1.F(c1507a, this) == objE) {
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
        public final Object w(fu1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return q.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfu1/a$f;", "<unused var>", "Lfu1/b;", "state", "Loq/i0;", "<anonymous>", "(Lfu1/a$f;Lfu1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fu1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67207f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f67207f;
            Object objE = uq.b.e();
            int i15 = this.f67206e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                b0 name = state.getName();
                b0 surname = state.getSurname();
                b0 seriesAndNumber = state.getSeriesAndNumber();
                this.f67207f = vq.j.a(state);
                this.f67206e = 1;
                if (qVar.u9(name, surname, seriesAndNumber, this) == objE) {
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
        public final Object w(fu1.a.f fVar, State state, tq.e<? super i0> eVar) {
            h hVar = q.this.new h(eVar);
            hVar.f67207f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$i;", "<unused var>", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fu1.a.i, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67210f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, 63, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f67210f;
            uq.b.e();
            if (this.f67209e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fu1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.i iVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar2 = new i(eVar);
            iVar2.f67210f = c0Var;
            return iVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$g;", "action", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<fu1.a.OnNameChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f67213g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fu1.a.OnNameChange onNameChange, State state) {
            return State.b(state, onNameChange.getValue(), null, null, null, null, null, null, 126, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fu1.a.OnNameChange onNameChange = (fu1.a.OnNameChange) this.f67212f;
            c0 c0Var = (c0) this.f67213g;
            uq.b.e();
            if (this.f67211e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fu1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O(onNameChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.OnNameChange onNameChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f67212f = onNameChange;
            jVar.f67213g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$j;", "action", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fu1.a.OnSurnameChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67215f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f67216g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fu1.a.OnSurnameChange onSurnameChange, State state) {
            return State.b(state, null, onSurnameChange.getValue(), null, null, null, null, null, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fu1.a.OnSurnameChange onSurnameChange = (fu1.a.OnSurnameChange) this.f67215f;
            c0 c0Var = (c0) this.f67216g;
            uq.b.e();
            if (this.f67214e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fu1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.k.O(onSurnameChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.OnSurnameChange onSurnameChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f67215f = onSurnameChange;
            kVar.f67216g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$c;", "action", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<fu1.a.OnDocumentNumberChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f67219g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(fu1.a.OnDocumentNumberChange onDocumentNumberChange, State state) {
            return State.b(state, null, null, onDocumentNumberChange.getValue(), null, null, null, null, 123, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fu1.a.OnDocumentNumberChange onDocumentNumberChange = (fu1.a.OnDocumentNumberChange) this.f67218f;
            c0 c0Var = (c0) this.f67219g;
            uq.b.e();
            if (this.f67217e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fu1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.l.O(onDocumentNumberChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.OnDocumentNumberChange onDocumentNumberChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f67218f = onDocumentNumberChange;
            lVar.f67219g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfu1/a$k;", "<unused var>", "Lk10/c0;", "Lfu1/b;", "state", "Lk10/l;", "<anonymous>", "(Lfu1/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fu1.a.k, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f67221f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f67221f;
            Object objE = uq.b.e();
            int i15 = this.f67220e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            q qVar = q.this;
            this.f67221f = vq.j.a(c0Var);
            this.f67220e = 1;
            Object objE9 = qVar.E9(c0Var, this);
            return objE9 == objE ? objE : objE9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fu1.a.k kVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = q.this.new m(eVar);
            mVar.f67221f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f67223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f67224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f67225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f67226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f67227h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f67229k;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f67227h = obj;
            this.f67229k |= PKIFailureInfo.systemUnavail;
            return q.this.E9(null, this);
        }
    }

    public q(yy.a aVar, gu1.b bVar, yt1.b bVar2, xv0.a aVar2, ac4.a aVar3, ib4.c cVar) {
        this.mapper = bVar;
        this.formValidationUC = bVar2;
        this.getDriverQualificationsUC = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.domainErrorMapper = cVar;
        State state = new State(null, null, null, null, null, null, null, CertificateBody.profileType, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: fu1.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(this.f67155a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), x9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, b0 b0Var) {
        qVar.d9(new fu1.a.OnDocumentNumberChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fu1.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f67156a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, k10.z zVar) {
        e eVar = qVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fu1.a.OnNext.class), oVar, eVar);
        zVar.x(q0.c(fu1.a.e.class), oVar, qVar.new f(null));
        zVar.x(q0.c(fu1.a.b.class), oVar, qVar.new g(null));
        zVar.x(q0.c(fu1.a.f.class), oVar, qVar.new h(null));
        zVar.v(q0.c(fu1.a.i.class), oVar, new i(null));
        zVar.v(q0.c(fu1.a.OnNameChange.class), oVar, new j(null));
        zVar.v(q0.c(fu1.a.OnSurnameChange.class), oVar, new k(null));
        zVar.v(q0.c(fu1.a.OnDocumentNumberChange.class), oVar, new l(null));
        zVar.v(q0.c(fu1.a.k.class), oVar, qVar.new m(null));
        zVar.v(q0.c(fu1.a.OnFieldTypeToScroll.class), oVar, new c(null));
        zVar.v(q0.c(fu1.a.l.class), oVar, new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:39:0x013b  */
    /* JADX WARN: Code duplicated, block: B:40:0x014a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E9(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        n nVar;
        c0<State> c0Var2;
        hz.b.Companion companion;
        hz.b bVar;
        hz.b.Companion companion2;
        hz.b bVarA;
        hz.b.Companion companion3;
        Object objH;
        final hz.b bVar2;
        hz.b.Companion companion4;
        c0<State> c0Var3;
        final hz.b bVar3;
        Iterator it;
        Object next;
        Map.Entry entry;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i15 = nVar.f67229k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f67229k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object obj = nVar.f67227h;
        Object objE = uq.b.e();
        int i16 = nVar.f67229k;
        if (i16 == 0) {
            oq.u.b(obj);
            hz.b.Companion companion5 = hz.b.INSTANCE;
            yt1.b bVar4 = this.formValidationUC;
            yt1.b.c.a aVar = new yt1.b.c.a(iy.c0.e(c0Var.a().getName()));
            nVar.f67223d = c0Var;
            nVar.f67224e = companion5;
            nVar.f67229k = 1;
            Object objH2 = bVar4.h(aVar, nVar);
            if (objH2 != objE) {
                c0Var2 = c0Var;
                companion = companion5;
                obj = objH2;
            }
            return objE;
        }
        if (i16 == 1) {
            companion = (hz.b.Companion) nVar.f67224e;
            c0Var2 = (c0) nVar.f67223d;
            oq.u.b(obj);
        } else {
            if (i16 == 2) {
                companion2 = (hz.b.Companion) nVar.f67225f;
                hz.b bVar5 = (hz.b) nVar.f67224e;
                c0<State> c0Var4 = (c0) nVar.f67223d;
                oq.u.b(obj);
                bVar = bVar5;
                c0Var2 = c0Var4;
                bVarA = companion2.a((hz.g) obj);
                companion3 = hz.b.INSTANCE;
                yt1.b bVar6 = this.formValidationUC;
                yt1.b.c.C6158b c6158b = new yt1.b.c.C6158b(iy.c0.e(c0Var2.a().getSeriesAndNumber()));
                nVar.f67223d = c0Var2;
                nVar.f67224e = bVar;
                nVar.f67225f = bVarA;
                nVar.f67226g = companion3;
                nVar.f67229k = 3;
                objH = bVar6.h(c6158b, nVar);
                if (objH != objE) {
                    bVar2 = bVarA;
                    companion4 = companion3;
                    obj = objH;
                    c0Var3 = c0Var2;
                    bVar3 = bVar;
                }
                return objE;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion4 = (hz.b.Companion) nVar.f67226g;
            bVar2 = (hz.b) nVar.f67225f;
            bVar3 = (hz.b) nVar.f67224e;
            c0Var3 = (c0) nVar.f67223d;
            oq.u.b(obj);
        }
        final hz.b bVarA2 = companion4.a((hz.g) obj);
        it = v0.l(oq.y.a(FormFieldData.EnumC2027a.NAME, bVar3), oq.y.a(FormFieldData.EnumC2027a.SURNAME, bVar2), oq.y.a(FormFieldData.EnumC2027a.SERIES_AND_NUMBER, bVarA2)).entrySet().iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Map.Entry) next).getValue() instanceof hz.b.Invalid));
        entry = (Map.Entry) next;
        if (entry != null) {
            d9(new fu1.a.OnFieldTypeToScroll((FormFieldData.EnumC2027a) entry.getKey()));
        } else {
            d9(fu1.a.f.f67116a);
        }
        return c0Var3.b(new er.l() { // from class: fu1.p
            @Override // er.l
            public final Object b(Object obj2) {
                return q.F9(bVar3, bVar2, bVarA2, (State) obj2);
            }
        });
        hz.b bVarA3 = companion.a((hz.g) obj);
        hz.b.Companion companion6 = hz.b.INSTANCE;
        yt1.b bVar7 = this.formValidationUC;
        yt1.b.c.C6159c c6159c = new yt1.b.c.C6159c(iy.c0.e(c0Var2.a().getSurname()));
        nVar.f67223d = c0Var2;
        nVar.f67224e = bVarA3;
        nVar.f67225f = companion6;
        nVar.f67229k = 2;
        Object objH3 = bVar7.h(c6159c, nVar);
        if (objH3 != objE) {
            bVar = bVarA3;
            companion2 = companion6;
            obj = objH3;
            bVarA = companion2.a((hz.g) obj);
            companion3 = hz.b.INSTANCE;
            yt1.b bVar8 = this.formValidationUC;
            yt1.b.c.C6158b c6158b2 = new yt1.b.c.C6158b(iy.c0.e(c0Var2.a().getSeriesAndNumber()));
            nVar.f67223d = c0Var2;
            nVar.f67224e = bVar;
            nVar.f67225f = bVarA;
            nVar.f67226g = companion3;
            nVar.f67229k = 3;
            objH = bVar8.h(c6158b2, nVar);
            if (objH != objE) {
                bVar2 = bVarA;
                companion4 = companion3;
                obj = objH;
                c0Var3 = c0Var2;
                bVar3 = bVar;
                final hz.b bVarA4 = companion4.a((hz.g) obj);
                it = v0.l(oq.y.a(FormFieldData.EnumC2027a.NAME, bVar3), oq.y.a(FormFieldData.EnumC2027a.SURNAME, bVar2), oq.y.a(FormFieldData.EnumC2027a.SERIES_AND_NUMBER, bVarA4)).entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Map.Entry) next).getValue() instanceof hz.b.Invalid));
                entry = (Map.Entry) next;
                if (entry != null) {
                    d9(new fu1.a.OnFieldTypeToScroll((FormFieldData.EnumC2027a) entry.getKey()));
                } else {
                    d9(fu1.a.f.f67116a);
                }
                return c0Var3.b(new er.l() { // from class: fu1.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.F9(bVar3, bVar2, bVarA4, (State) obj2);
                    }
                });
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State F9(hz.b bVar, hz.b bVar2, hz.b bVar3, State state) {
        return State.b(state, null, null, null, bVar, bVar2, bVar3, null, 71, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(b0Var, b0Var2, b0Var3, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v9(dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new fu1.a.InterfaceC1506a.Error(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: fu1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(er.a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fu1.c.Data x9(State state) {
        return this.mapper.b(new gu1.b.Params(state, b9(fu1.a.b.f67111a), b9(fu1.a.e.f67115a), b9(fu1.a.k.f67123a), b9(fu1.a.i.f67120a), new er.l() { // from class: fu1.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f67157a, (b0) obj);
            }
        }, new er.l() { // from class: fu1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f67158a, (b0) obj);
            }
        }, new er.l() { // from class: fu1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f67159a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, b0 b0Var) {
        qVar.d9(new fu1.a.OnNameChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, b0 b0Var) {
        qVar.d9(new fu1.a.OnSurnameChange(b0Var));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<fu1.a.InterfaceC1506a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, fu1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fu1.c.Data> getState() {
        return this.state;
    }
}
