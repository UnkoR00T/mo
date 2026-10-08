package gb2;

import el0.PhysicalIdCardApplicationStatusResponse;
import fb2.IdCardCollectingResultModel;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import ml0.Params;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lgb2/l;", "Ll00/g;", "Lgb2/b;", "Lgb2/a;", "Lgb2/c;", "", "Lyy/a;", "stateMachineFactory", "Lml0/l;", "getIdCardCollectingStatusUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lgb2/d;", "mapper", "Lib4/c;", "genericErrorMapper", "Lfb2/a;", "setupData", "<init>", "(Lyy/a;Lml0/l;Lac4/a;Lgb2/d;Lib4/c;Lfb2/a;)V", "state", "Lgb2/c$a;", "p9", "(Lgb2/b;)Lgb2/c$a;", "b", "Lml0/l;", "c", "Lac4/a;", "d", "Lgb2/d;", "e", "Lib4/c;", "f", "Lfb2/a;", "Lgb2/b$a;", "g", "Lgb2/b$a;", "initialState", "Lxw/b;", "Lgb2/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<gb2.b, gb2.a> implements gb2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ml0.l getIdCardCollectingStatusUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final gb2.d mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final IdCardCollectingResultModel setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final gb2.b.Initial initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gb2.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<gb2.b, gb2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<gb2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<gb2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f71614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f71615b;

        /* JADX INFO: renamed from: gb2.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1635a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f71616a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f71617b;

            /* JADX INFO: renamed from: gb2.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1636a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71618d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71619e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f71620f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f71622h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f71623j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f71624k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f71625l;

                public C1636a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f71618d = obj;
                    this.f71619e |= PKIFailureInfo.systemUnavail;
                    return C1635a.this.F(null, this);
                }
            }

            public C1635a(mu.h hVar, l lVar) {
                this.f71616a = hVar;
                this.f71617b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1636a c1636a;
                if (eVar instanceof C1636a) {
                    c1636a = (C1636a) eVar;
                    int i15 = c1636a.f71619e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1636a.f71619e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1636a = new C1636a(eVar);
                    }
                } else {
                    c1636a = new C1636a(eVar);
                }
                Object obj2 = c1636a.f71618d;
                Object objE = uq.b.e();
                int i16 = c1636a.f71619e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f71616a;
                    gb2.c.a aVarP9 = this.f71617b.p9((gb2.b) obj);
                    c1636a.f71620f = vq.j.a(obj);
                    c1636a.f71622h = vq.j.a(c1636a);
                    c1636a.f71623j = vq.j.a(obj);
                    c1636a.f71624k = vq.j.a(hVar);
                    c1636a.f71625l = 0;
                    c1636a.f71619e = 1;
                    if (hVar.F(aVarP9, c1636a) == objE) {
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
            this.f71614a = gVar;
            this.f71615b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gb2.c.a> hVar, tq.e eVar) {
            Object objA = this.f71614a.a(new C1635a(hVar, this.f71615b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgb2/a$c;", "<unused var>", "Lgb2/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lgb2/a$c;Lgb2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<gb2.a.c, gb2.b.Result, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71627f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f71627f
                gb2.b$b r0 = (gb2.b.Result) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f71626e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L50
            L1f:
                oq.u.b(r6)
                el0.a r6 = r0.getStatus()
                el0.a r2 = el0.a.APPLICATION_NOT_FOUND
                if (r6 != r2) goto L3d
                gb2.l r6 = gb2.l.this
                gb2.a$b$a r2 = gb2.a.b.C1631a.f71581a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f71627f = r0
                r5.f71626e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L50
                goto L4f
            L3d:
                gb2.l r6 = gb2.l.this
                gb2.a$b$b r2 = gb2.a.b.C1632b.f71582a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f71627f = r0
                r5.f71626e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L50
            L4f:
                return r1
            L50:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: gb2.l.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gb2.a.c cVar, gb2.b.Result result, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f71627f = result;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgb2/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lgb2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<gb2.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71629e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f71629e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.d9(gb2.a.C1630a.f71580a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(gb2.b.Initial initial, tq.e<? super i0> eVar) {
            return ((c) v(initial, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return l.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgb2/a$c;", "<unused var>", "Lgb2/b$a;", "Loq/i0;", "<anonymous>", "(Lgb2/a$c;Lgb2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<gb2.a.c, gb2.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71631e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71631e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                gb2.a.b.C1631a c1631a = gb2.a.b.C1631a.f71581a;
                this.f71631e = 1;
                if (lVar.F(c1631a, this) == objE) {
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
        public final Object w(gb2.a.c cVar, gb2.b.Initial initial, tq.e<? super i0> eVar) {
            return l.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgb2/a$a;", "<unused var>", "Lk10/c0;", "Lgb2/b$a;", "state", "Lk10/l;", "Lgb2/b;", "<anonymous>", "(Lgb2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<gb2.a.C1630a, c0<gb2.b.Initial>, tq.e<? super k10.l<? extends gb2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71634f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgb2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends gb2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f71636e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f71637f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<gb2.b.Initial> f71638g;

            /* JADX INFO: renamed from: gb2.l$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1637a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f71639a;

                static {
                    int[] iArr = new int[el0.a.values().length];
                    try {
                        iArr[el0.a.UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f71639a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, c0<gb2.b.Initial> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f71637f = lVar;
                this.f71638g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gb2.b.Result V(el0.a aVar, gb2.b.Initial initial) {
                return new gb2.b.Result(aVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f71636e;
                if (i15 == 0) {
                    u.b(obj);
                    ml0.l lVar = this.f71637f.getIdCardCollectingStatusUC;
                    Params params = new Params(iy.c0.e(this.f71638g.a().getApplicationNumber()));
                    this.f71636e = 1;
                    obj = lVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                l lVar2 = this.f71637f;
                c0<gb2.b.Initial> c0Var = this.f71638g;
                if (iVar instanceof dx.i.Left) {
                    lVar2.d9(new gb2.a.OnError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final el0.a status = ((PhysicalIdCardApplicationStatusResponse) ((dx.i.Right) iVar).b()).getStatus();
                int i16 = status == null ? -1 : C1637a.f71639a[status.ordinal()];
                if (i16 != -1 && i16 != 1) {
                    return c0Var.d(new er.l() { // from class: gb2.m
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l.e.a.V(status, (b.Initial) obj2);
                        }
                    });
                }
                lVar2.d9(new gb2.a.OnError(new dx.b.Generic(null, 1, null)));
                return c0Var.c();
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f71637f, this.f71638g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends gb2.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f71634f;
            Object objE = uq.b.e();
            int i15 = this.f71633e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ac4.a aVar = l.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l.this, c0Var, null);
            this.f71634f = vq.j.a(c0Var);
            this.f71633e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gb2.a.C1630a c1630a, c0<gb2.b.Initial> c0Var, tq.e<? super k10.l<? extends gb2.b>> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f71634f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgb2/a$d;", "action", "Lgb2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgb2/a$d;Lgb2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<gb2.a.OnError, gb2.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71641f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    lVar.d9(gb2.a.C1630a.f71580a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    lVar.d9(gb2.a.c.f71584a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gb2.a.OnError onError = (gb2.a.OnError) this.f71641f;
            Object objE = uq.b.e();
            int i15 = this.f71640e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                ib4.c cVar = l.this.genericErrorMapper;
                dx.b domainError = onError.getDomainError();
                final l lVar2 = l.this;
                gb2.a.b.Error error = new gb2.a.b.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: gb2.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l.f.O(lVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f71641f = vq.j.a(onError);
                this.f71640e = 1;
                if (lVar.F(error, this) == objE) {
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
        public final Object w(gb2.a.OnError onError, gb2.b.Initial initial, tq.e<? super i0> eVar) {
            f fVar = l.this.new f(eVar);
            fVar.f71641f = onError;
            return fVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, ml0.l lVar, ac4.a aVar2, gb2.d dVar, ib4.c cVar, IdCardCollectingResultModel idCardCollectingResultModel) {
        this.getIdCardCollectingStatusUC = lVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.mapper = dVar;
        this.genericErrorMapper = cVar;
        this.setupData = idCardCollectingResultModel;
        gb2.b.Initial initial = new gb2.b.Initial(idCardCollectingResultModel.getApplicationNumber());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initial, new er.l() { // from class: gb2.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.r9(this.f71604a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gb2.c.a p9(gb2.b state) {
        return this.mapper.b(new gb2.d.Params(state, b9(gb2.a.c.f71584a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final l lVar, v vVar) {
        vVar.c(q0.c(gb2.b.Result.class), new er.l() { // from class: gb2.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.s9(this.f71602a, (z) obj);
            }
        });
        vVar.c(q0.c(gb2.b.Initial.class), new er.l() { // from class: gb2.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.t9(this.f71603a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(gb2.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(l lVar, z zVar) {
        zVar.C(lVar.new c(null));
        d dVar = lVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gb2.a.c.class), oVar, dVar);
        zVar.v(q0.c(gb2.a.C1630a.class), oVar, lVar.new e(null));
        zVar.x(q0.c(gb2.a.OnError.class), oVar, lVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<gb2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<gb2.b, gb2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gb2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gb2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(IdCardCollectingResultModel idCardCollectingResultModel) {
        super.P5(idCardCollectingResultModel);
    }
}
