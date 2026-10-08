package w31;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010C\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010I\u001a\b\u0012\u0004\u0012\u00020\"0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lw31/p;", "Ll00/g;", "Lw31/b;", "Lw31/a;", "Lw31/c;", "", "Lyy/a;", "stateMachineFactory", "Ly31/a;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljj0/b;", "hasTrustedProfileUseCase", "Lib4/c;", "genericDomainErrorMapper", "Ll44/e;", "getUserEdorAddressUC", "Lx31/a;", "contract", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Ly31/a;Lac4/a;Ljj0/b;Lib4/c;Ll44/e;Lx31/a;Lmx/c;)V", "Ldx/b$c;", "u9", "()Ldx/b$c;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetryAction", "w9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lw31/c$a;", "z9", "(Lw31/b;)Lw31/c$a;", "b", "Ly31/a;", "c", "Lac4/a;", "d", "Ljj0/b;", "e", "Lib4/c;", "f", "Ll44/e;", "g", "Lx31/a;", "h", "Lmx/c;", "Lw31/b$b;", "j", "Lw31/b$b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lw31/a$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<w31.b, w31.a> implements w31.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y31.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x31.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final w31.b.C5519b initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<w31.b, w31.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w31.a.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<w31.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<w31.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f210137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f210138b;

        /* JADX INFO: renamed from: w31.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5520a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f210139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f210140b;

            /* JADX INFO: renamed from: w31.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5521a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f210141d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f210142e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f210143f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f210145h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f210146j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f210147k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f210148l;

                public C5521a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f210141d = obj;
                    this.f210142e |= PKIFailureInfo.systemUnavail;
                    return C5520a.this.F(null, this);
                }
            }

            public C5520a(mu.h hVar, p pVar) {
                this.f210139a = hVar;
                this.f210140b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5521a c5521a;
                if (eVar instanceof C5521a) {
                    c5521a = (C5521a) eVar;
                    int i15 = c5521a.f210142e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5521a.f210142e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5521a = new C5521a(eVar);
                    }
                } else {
                    c5521a = new C5521a(eVar);
                }
                Object obj2 = c5521a.f210141d;
                Object objE = uq.b.e();
                int i16 = c5521a.f210142e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f210139a;
                    w31.c.Data dataZ9 = this.f210140b.z9((w31.b) obj);
                    c5521a.f210143f = vq.j.a(obj);
                    c5521a.f210145h = vq.j.a(c5521a);
                    c5521a.f210146j = vq.j.a(obj);
                    c5521a.f210147k = vq.j.a(hVar);
                    c5521a.f210148l = 0;
                    c5521a.f210142e = 1;
                    if (hVar.F(dataZ9, c5521a) == objE) {
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
            this.f210137a = gVar;
            this.f210138b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super w31.c.Data> hVar, tq.e eVar) {
            Object objA = this.f210137a.a(new C5520a(hVar, this.f210138b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw31/a$a;", "<unused var>", "Lw31/b;", "Loq/i0;", "<anonymous>", "(Lw31/a$a;Lw31/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<w31.a.C5517a, w31.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210149e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f210149e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w31.a.e> bVarY1 = p.this.Y1();
                w31.a.e.C5518a c5518a = w31.a.e.C5518a.f210101a;
                this.f210149e = 1;
                if (bVarY1.F(c5518a, this) == objE) {
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
        public final Object w(w31.a.C5517a c5517a, w31.b bVar, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw31/a$f;", "<unused var>", "Lk10/c0;", "Lw31/b$b;", "state", "Lk10/l;", "Lw31/b;", "<anonymous>", "(Lw31/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<w31.a.f, c0<w31.b.C5519b>, tq.e<? super k10.l<? extends w31.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f210152f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w31.b.a O(w31.b.C5519b c5519b) {
            return w31.b.a.f210106a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f210152f;
            uq.b.e();
            if (this.f210151e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w31.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O((b.C5519b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w31.a.f fVar, c0<w31.b.C5519b> c0Var, tq.e<? super k10.l<? extends w31.b>> eVar) {
            c cVar = new c(eVar);
            cVar.f210152f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw31/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw31/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<w31.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210153e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f210153e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(w31.a.c.f210099a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(w31.b.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw31/a$c;", "action", "Lw31/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw31/a$c;Lw31/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<w31.a.c, w31.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f210156f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f210158e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f210159f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f210160g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f210161h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f210162j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f210163k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ p f210164l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ w31.a.c f210165m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, w31.a.c cVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f210164l = pVar;
                this.f210165m = cVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
            
                if (r5.w9(r2, r1, r11) == r0) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
            
                if (w31.p.x9(r5, r6, null, r11, 2, null) == r0) goto L29;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f210163k
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2b
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1e
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    java.lang.Object r0 = r11.f210159f
                    dx.b r0 = (dx.b) r0
                L1e:
                    java.lang.Object r0 = r11.f210158e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r12)
                    goto La8
                L27:
                    oq.u.b(r12)
                    goto L3f
                L2b:
                    oq.u.b(r12)
                    w31.p r12 = r11.f210164l
                    jj0.b r12 = w31.p.r9(r12)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r11.f210163k = r4
                    java.lang.Object r12 = r12.c(r1, r11)
                    if (r12 != r0) goto L3f
                    goto La7
                L3f:
                    dx.i r12 = (dx.i) r12
                    w31.p r5 = r11.f210164l
                    w31.a$c r1 = r11.f210165m
                    boolean r6 = r12 instanceof dx.i.Left
                    r7 = 0
                    if (r6 == 0) goto L70
                    r2 = r12
                    dx.i$b r2 = (dx.i.Left) r2
                    java.lang.Object r2 = r2.b()
                    dx.b r2 = (dx.b) r2
                    er.a r1 = w31.p.m9(r5, r1)
                    java.lang.Object r12 = vq.j.a(r12)
                    r11.f210158e = r12
                    java.lang.Object r12 = vq.j.a(r2)
                    r11.f210159f = r12
                    r11.f210160g = r7
                    r11.f210161h = r7
                    r11.f210163k = r3
                    java.lang.Object r12 = w31.p.s9(r5, r2, r1, r11)
                    if (r12 != r0) goto La8
                    goto La7
                L70:
                    boolean r1 = r12 instanceof dx.i.Right
                    if (r1 == 0) goto Lb1
                    r1 = r12
                    dx.i$c r1 = (dx.i.Right) r1
                    java.lang.Object r1 = r1.b()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != r4) goto L89
                    w31.a$d r12 = w31.a.d.f210100a
                    w31.p.n9(r5, r12)
                    goto La8
                L89:
                    if (r1 != 0) goto Lab
                    dx.b$c r6 = w31.p.l9(r5)
                    java.lang.Object r12 = vq.j.a(r12)
                    r11.f210158e = r12
                    r11.f210160g = r7
                    r11.f210162j = r1
                    r11.f210161h = r7
                    r11.f210163k = r2
                    r7 = 0
                    r9 = 2
                    r10 = 0
                    r8 = r11
                    java.lang.Object r12 = w31.p.x9(r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto La8
                La7:
                    return r0
                La8:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                Lab:
                    oq.p r12 = new oq.p
                    r12.<init>()
                    throw r12
                Lb1:
                    oq.p r12 = new oq.p
                    r12.<init>()
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: w31.p.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f210164l, this.f210165m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w31.a.c cVar = (w31.a.c) this.f210156f;
            Object objE = uq.b.e();
            int i15 = this.f210155e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p.this, cVar, null);
                this.f210156f = vq.j.a(cVar);
                this.f210155e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(w31.a.c cVar, w31.b.a aVar, tq.e<? super i0> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f210156f = cVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw31/a$d;", "<unused var>", "Lw31/b$a;", "Loq/i0;", "<anonymous>", "(Lw31/a$d;Lw31/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<w31.a.d, w31.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210166e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f210168e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f210169f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f210169f = pVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 V(p pVar, b0 b0Var) {
                pVar.d9(new w31.a.CheckSuccess(b0Var));
                return i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f210168e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    b0 b0VarA = this.f210169f.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
                    if (b0VarA != null) {
                        this.f210169f.d9(new w31.a.CheckSuccess(b0VarA));
                    } else {
                        xw.b<w31.a.e> bVarY1 = this.f210169f.Y1();
                        final p pVar = this.f210169f;
                        w31.a.e.GoToEdorAuth goToEdorAuth = new w31.a.e.GoToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: w31.r
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return p.f.a.V(pVar, (b0) obj2);
                            }
                        }, null, 2, null));
                        this.f210168e = 1;
                        if (bVarY1.F(goToEdorAuth, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f210169f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f210166e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p.this, null);
                this.f210166e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(w31.a.d dVar, w31.b.a aVar, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw31/a$b;", "action", "Lk10/c0;", "Lw31/b$a;", "state", "Lk10/l;", "Lw31/b;", "<anonymous>", "(Lw31/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<w31.a.CheckSuccess, c0<w31.b.a>, tq.e<? super k10.l<? extends w31.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f210170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f210171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f210172g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w31.b.C5519b O(w31.b.a aVar) {
            return w31.b.C5519b.f210107a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w31.a.CheckSuccess checkSuccess = (w31.a.CheckSuccess) this.f210171f;
            c0 c0Var = (c0) this.f210172g;
            Object objE = uq.b.e();
            int i15 = this.f210170e;
            if (i15 == 0) {
                oq.u.b(obj);
                p.this.contract.U(checkSuccess.getEdorAddress());
                xw.b<w31.a.e> bVarY1 = p.this.Y1();
                w31.a.e.d dVar = w31.a.e.d.f210104a;
                this.f210171f = vq.j.a(checkSuccess);
                this.f210172g = c0Var;
                this.f210170e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: w31.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O((b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w31.a.CheckSuccess checkSuccess, c0<w31.b.a> c0Var, tq.e<? super k10.l<? extends w31.b>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f210171f = checkSuccess;
            gVar.f210172g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, y31.a aVar2, ac4.a aVar3, jj0.b bVar, ib4.c cVar, l44.e eVar, x31.a aVar4, mx.c cVar2) {
        this.mapper = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.hasTrustedProfileUseCase = bVar;
        this.genericDomainErrorMapper = cVar;
        this.getUserEdorAddressUC = eVar;
        this.contract = aVar4;
        this.labelProvider = cVar2;
        w31.b.C5519b c5519b = w31.b.C5519b.f210107a;
        this.initialState = c5519b;
        this.stateMachine = aVar.a(c5519b, new er.l() { // from class: w31.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f210125a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), z9(c5519b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(w31.b.class), new er.l() { // from class: w31.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f210121a, (z) obj);
            }
        });
        vVar.c(q0.c(w31.b.C5519b.class), new er.l() { // from class: w31.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.D9((z) obj);
            }
        });
        vVar.c(q0.c(w31.b.a.class), new er.l() { // from class: w31.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f210122a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(w31.a.C5517a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(z zVar) {
        c cVar = new c(null);
        zVar.v(q0.c(w31.a.f.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, z zVar) {
        zVar.C(pVar.new d(null));
        e eVar = pVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(w31.a.c.class), oVar, eVar);
        zVar.x(q0.c(w31.a.d.class), oVar, pVar.new f(null));
        zVar.v(q0.c(w31.a.CheckSuccess.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business u9() {
        return new dx.b.Business(null, dx.b.f.WARNING, this.labelProvider.c(j31.a.f99211s2), this.labelProvider.c(j31.a.f99219u0), this.labelProvider.c(j31.a.f99206r2), this.labelProvider.c(j31.a.f99171k2), null, 65, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = F(new w31.a.e.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: w31.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f210123a, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object x9(p pVar, dx.b bVar, er.a aVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar = null;
        }
        return pVar.w9(bVar, aVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, er.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            pVar.d9(w31.a.C5517a.f210096a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            if (aVar != null) {
                aVar.a();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w31.c.Data z9(w31.b bVar) {
        return this.mapper.b(new y31.a.Params(bVar, b9(w31.a.f.f210105a), b9(w31.a.C5517a.f210096a)));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(x31.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<w31.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<w31.b, w31.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<w31.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(w31.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
