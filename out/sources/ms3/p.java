package ms3;

import cj0.ZusEVisitTopic;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R,\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u001a\u001a\u0004\b1\u00102R \u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R&\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010\u001a\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lms3/p;", "Ll00/g;", "Lms3/d;", "", "Lms3/e;", "Lyy/a;", "stateMachineFactory", "Lnr3/k;", "getZusVisitTopicsUseCase", "Lns3/d;", "screenMapper", "Lns3/b;", "dialogMapper", "Lib4/c;", "errorMapper", "<init>", "(Lyy/a;Lnr3/k;Lns3/d;Lns3/b;Lib4/c;)V", "Ldx/b;", "Ljb4/b;", "u9", "(Ldx/b;)Ljb4/b;", "Lms3/e$a;", "v9", "(Lms3/d;)Lms3/e$a;", "Loq/i0;", "t9", "()V", "Lcj0/n;", "topic", "x9", "(Lcj0/n;)V", "zusEVisitTopic", "y9", "(Lcj0/n;Ltq/e;)Ljava/lang/Object;", "d", "b", "Lnr3/k;", "c", "Lns3/d;", "Lns3/b;", "e", "Lib4/c;", "Lms3/d$a;", "f", "Lms3/d$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lms3/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<ms3.d, Object> implements ms3.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.k getZusVisitTopicsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ns3.d screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ns3.b dialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ms3.d.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ms3.d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ms3.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<ms3.e.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<ZusEVisitTopic, i0> {
        a(Object obj) {
            super(1, obj, p.class, "onTopicClick", "onTopicClick(Lpl/gov/coi/mobywatel/be/citizenservice/contract/model/zus/ZusEVisitTopic;)V", 0);
        }

        public final void E(ZusEVisitTopic zusEVisitTopic) {
            ((p) this.f66391b).x9(zusEVisitTopic);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ZusEVisitTopic zusEVisitTopic) {
            E(zusEVisitTopic);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128102e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128102e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                ms3.b.a aVar = ms3.b.a.f128068a;
                this.f128102e = 1;
                if (pVar.F(aVar, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128104e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZusEVisitTopic f128106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ZusEVisitTopic zusEVisitTopic, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f128106g = zusEVisitTopic;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128104e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                ms3.b.ToChooseDate toChooseDate = new ms3.b.ToChooseDate(this.f128106g);
                this.f128104e = 1;
                if (pVar.F(toChooseDate, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new c(this.f128106g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<ms3.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f128107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f128108b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f128109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f128110b;

            /* JADX INFO: renamed from: ms3.p$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3162a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128111d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128112e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f128113f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f128115h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f128116j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f128117k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f128118l;

                public C3162a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128111d = obj;
                    this.f128112e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f128109a = hVar;
                this.f128110b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3162a c3162a;
                if (eVar instanceof C3162a) {
                    c3162a = (C3162a) eVar;
                    int i15 = c3162a.f128112e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3162a.f128112e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3162a = new C3162a(eVar);
                    }
                } else {
                    c3162a = new C3162a(eVar);
                }
                Object obj2 = c3162a.f128111d;
                Object objE = uq.b.e();
                int i16 = c3162a.f128112e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f128109a;
                    ms3.e.a aVarV9 = this.f128110b.v9((ms3.d) obj);
                    c3162a.f128113f = vq.j.a(obj);
                    c3162a.f128115h = vq.j.a(c3162a);
                    c3162a.f128116j = vq.j.a(obj);
                    c3162a.f128117k = vq.j.a(hVar);
                    c3162a.f128118l = 0;
                    c3162a.f128112e = 1;
                    if (hVar.F(aVarV9, c3162a) == objE) {
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

        public d(mu.g gVar, p pVar) {
            this.f128107a = gVar;
            this.f128108b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ms3.e.a> hVar, tq.e eVar) {
            Object objA = this.f128107a.a(new a(hVar, this.f128108b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lms3/d$a;", "it", "Loq/i0;", "<anonymous>", "(Lms3/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<ms3.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128119e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f128119e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p.this.t9();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ms3.d.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lms3/a;", "<unused var>", "Lk10/c0;", "Lms3/d;", "state", "Lk10/l;", "<anonymous>", "(Lms3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ms3.a, c0<ms3.d>, tq.e<? super k10.l<? extends ms3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f128124h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f128125j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f128126k;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ms3.d.Initialized O(List list, ms3.d dVar) {
            return new ms3.d.Initialized(list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        
            if (r2.F(r5, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f128126k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f128125j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r1 = r7.f128122f
                dx.b r1 = (dx.b) r1
                java.lang.Object r1 = r7.f128121e
                dx.i r1 = (dx.i) r1
                oq.u.b(r8)
                goto L76
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                oq.u.b(r8)
                goto L40
            L2a:
                oq.u.b(r8)
                ms3.p r8 = ms3.p.this
                nr3.k r8 = ms3.p.m9(r8)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r7.f128126k = r0
                r7.f128125j = r4
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r1) goto L40
                goto L75
            L40:
                dx.i r8 = (dx.i) r8
                ms3.p r2 = ms3.p.this
                boolean r4 = r8 instanceof dx.i.Left
                if (r4 == 0) goto L7b
                r4 = r8
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                ms3.b$b r5 = new ms3.b$b
                jb4.b r6 = ms3.p.o9(r2, r4)
                r5.<init>(r6)
                r7.f128126k = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f128121e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f128122f = r8
                r8 = 0
                r7.f128123g = r8
                r7.f128124h = r8
                r7.f128125j = r3
                java.lang.Object r8 = r2.F(r5, r7)
                if (r8 != r1) goto L76
            L75:
                return r1
            L76:
                k10.l r8 = r0.c()
                return r8
            L7b:
                boolean r1 = r8 instanceof dx.i.Right
                if (r1 == 0) goto L91
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                java.util.List r8 = (java.util.List) r8
                ms3.q r1 = new ms3.q
                r1.<init>()
                k10.l r8 = r0.d(r1)
                return r8
            L91:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ms3.p.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ms3.a aVar, c0<ms3.d> c0Var, tq.e<? super k10.l<? extends ms3.d>> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f128126k = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lms3/c;", "event", "Lms3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lms3/c;Lms3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnTopicClick, ms3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128130g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f128132a;

            static {
                int[] iArr = new int[ZusEVisitTopic.a.values().length];
                try {
                    iArr[ZusEVisitTopic.a.EIR_MN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ZusEVisitTopic.a.PJM_EIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ZusEVisitTopic.a.PJM_ZAS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f128132a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (r11.F(r3, r10) == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            if (r11.y9(r3, r10) == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
        
            if (r11.F(r4, r10) == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f128129f
                ms3.c r0 = (ms3.OnTopicClick) r0
                java.lang.Object r1 = r10.f128130g
                ms3.d$b r1 = (ms3.d.Initialized) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r10.f128128e
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L26
                if (r3 == r6) goto L19
                if (r3 == r5) goto L19
                if (r3 != r4) goto L1e
            L19:
                oq.u.b(r11)
                goto Lc4
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                oq.u.b(r11)
                cj0.n r11 = r0.getTopic()
                cj0.n$a r11 = r11.getCode()
                int[] r3 = ms3.p.g.a.f128132a
                int r11 = r11.ordinal()
                r11 = r3[r11]
                if (r11 == r6) goto L7a
                if (r11 == r5) goto L5f
                if (r11 == r4) goto L5f
                ms3.p r11 = ms3.p.this
                ms3.b$e r3 = new ms3.b$e
                cj0.n r5 = r0.getTopic()
                r3.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r10.f128129f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r10.f128130g = r0
                r10.f128128e = r4
                java.lang.Object r11 = r11.F(r3, r10)
                if (r11 != r2) goto Lc4
                goto Lc3
            L5f:
                ms3.p r11 = ms3.p.this
                cj0.n r3 = r0.getTopic()
                java.lang.Object r0 = vq.j.a(r0)
                r10.f128129f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r10.f128130g = r0
                r10.f128128e = r5
                java.lang.Object r11 = ms3.p.r9(r11, r3, r10)
                if (r11 != r2) goto Lc4
                goto Lc3
            L7a:
                ms3.p r11 = ms3.p.this
                cj0.n r3 = r0.getTopic()
                java.util.List r4 = r1.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L8a:
                boolean r5 = r4.hasNext()
                r7 = 0
                if (r5 == 0) goto La1
                java.lang.Object r5 = r4.next()
                r8 = r5
                cj0.n r8 = (cj0.ZusEVisitTopic) r8
                cj0.n$a r8 = r8.getCode()
                cj0.n$a r9 = cj0.ZusEVisitTopic.a.EIR
                if (r8 != r9) goto L8a
                goto La2
            La1:
                r5 = r7
            La2:
                cj0.n r5 = (cj0.ZusEVisitTopic) r5
                if (r5 == 0) goto Laa
                java.lang.String r7 = r5.getId()
            Laa:
                ms3.b$f r4 = new ms3.b$f
                r4.<init>(r3, r7)
                java.lang.Object r0 = vq.j.a(r0)
                r10.f128129f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r10.f128130g = r0
                r10.f128128e = r6
                java.lang.Object r11 = r11.F(r4, r10)
                if (r11 != r2) goto Lc4
            Lc3:
                return r2
            Lc4:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ms3.p.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnTopicClick onTopicClick, ms3.d.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f128129f = onTopicClick;
            gVar.f128130g = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, nr3.k kVar, ns3.d dVar, ns3.b bVar, ib4.c cVar) {
        this.getZusVisitTopicsUseCase = kVar;
        this.screenMapper = dVar;
        this.dialogMapper = bVar;
        this.errorMapper = cVar;
        ms3.d.a aVar2 = ms3.d.a.f128076a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: ms3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f128087a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), v9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final p pVar, v vVar) {
        vVar.c(q0.c(ms3.d.a.class), new er.l() { // from class: ms3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f128088a, (z) obj);
            }
        });
        vVar.c(q0.c(ms3.d.class), new er.l() { // from class: ms3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.D9(this.f128089a, (z) obj);
            }
        });
        vVar.c(q0.c(ms3.d.Initialized.class), new er.l() { // from class: ms3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f128090a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, z zVar) {
        zVar.C(pVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(p pVar, z zVar) {
        f fVar = pVar.new f(null);
        zVar.v(q0.c(ms3.a.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, z zVar) {
        g gVar = pVar.new g(null);
        zVar.x(q0.c(OnTopicClick.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t9() {
        d9(ms3.a.f128067a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b u9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ms3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f128093a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ms3.e.a v9(ms3.d dVar) {
        return this.screenMapper.b(new ns3.d.Params(dVar, new a(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            pVar.t9();
        } else if (bVar instanceof ib4.c.b.AbstractC2161b.a) {
            pVar.d();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x9(ZusEVisitTopic topic) {
        d9(new OnTopicClick(topic));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y9(final ZusEVisitTopic zusEVisitTopic, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new ms3.b.ShowDialog(this.dialogMapper.b(new ns3.b.Params(new er.a() { // from class: ms3.n
            @Override // er.a
            public final Object a() {
                return p.z9(this.f128091a, zusEVisitTopic);
            }
        }))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(p pVar, ZusEVisitTopic zusEVisitTopic) {
        i00.a.a(pVar, pVar.new c(zusEVisitTopic, null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<ms3.b> Y1() {
        return this.navAction;
    }

    public final void d() {
        i00.a.a(this, new b(null));
    }

    @Override // l00.g
    protected k10.t<ms3.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ms3.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ms3.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
