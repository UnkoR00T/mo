package xg2;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u0019078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lxg2/m;", "Ll00/g;", "Lxg2/c;", "Lxg2/a;", "Lxg2/d;", "", "Lyy/a;", "stateMachineFactory", "Lyg2/c;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lvq0/h;", "getDocumentUC", "Lxg2/b;", "setupData", "<init>", "(Lyy/a;Lyg2/c;Lhb4/d;Lib4/c;Lvq0/h;Lxg2/b;)V", "Ldx/b;", "domainError", "Lhb4/c;", "q9", "(Ldx/b;)Lhb4/c;", "Lxg2/d$a;", "s9", "(Lxg2/c;)Lxg2/d$a;", "b", "Lyg2/c;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lvq0/h;", "f", "Lxg2/b;", "Lxg2/c$a;", "g", "Lxg2/c$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxg2/a$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<xg2.c, xg2.a> implements xg2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yg2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vq0.h getDocumentUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xg2.c.a initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<xg2.c, xg2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xg2.a.InterfaceC5836a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<xg2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<xg2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f218508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f218509b;

        /* JADX INFO: renamed from: xg2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5839a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f218510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f218511b;

            /* JADX INFO: renamed from: xg2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5840a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f218512d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f218513e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f218514f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f218516h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f218517j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f218518k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f218519l;

                public C5840a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f218512d = obj;
                    this.f218513e |= PKIFailureInfo.systemUnavail;
                    return C5839a.this.F(null, this);
                }
            }

            public C5839a(mu.h hVar, m mVar) {
                this.f218510a = hVar;
                this.f218511b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5840a c5840a;
                if (eVar instanceof C5840a) {
                    c5840a = (C5840a) eVar;
                    int i15 = c5840a.f218513e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5840a.f218513e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5840a = new C5840a(eVar);
                    }
                } else {
                    c5840a = new C5840a(eVar);
                }
                Object obj2 = c5840a.f218512d;
                Object objE = uq.b.e();
                int i16 = c5840a.f218513e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f218510a;
                    xg2.d.a aVarS9 = this.f218511b.s9((xg2.c) obj);
                    c5840a.f218514f = vq.j.a(obj);
                    c5840a.f218516h = vq.j.a(c5840a);
                    c5840a.f218517j = vq.j.a(obj);
                    c5840a.f218518k = vq.j.a(hVar);
                    c5840a.f218519l = 0;
                    c5840a.f218513e = 1;
                    if (hVar.F(aVarS9, c5840a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f218508a = gVar;
            this.f218509b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xg2.d.a> hVar, tq.e eVar) {
            Object objA = this.f218508a.a(new C5839a(hVar, this.f218509b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxg2/a$a;", "action", "Lxg2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxg2/a$a;Lxg2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<xg2.a.InterfaceC5836a, xg2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218521f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xg2.a.InterfaceC5836a interfaceC5836a = (xg2.a.InterfaceC5836a) this.f218521f;
            Object objE = uq.b.e();
            int i15 = this.f218520e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xg2.a.InterfaceC5836a> bVarY1 = m.this.Y1();
                this.f218521f = vq.j.a(interfaceC5836a);
                this.f218520e = 1;
                if (bVarY1.F(interfaceC5836a, this) == objE) {
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
        public final Object w(xg2.a.InterfaceC5836a interfaceC5836a, xg2.c cVar, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f218521f = interfaceC5836a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxg2/a$c;", "action", "Lk10/c0;", "Lxg2/c;", "state", "Lk10/l;", "<anonymous>", "(Lxg2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<xg2.a.SetDownloadError, c0<xg2.c>, tq.e<? super k10.l<? extends xg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f218525g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xg2.c.Error O(m mVar, xg2.a.SetDownloadError setDownloadError, xg2.c cVar) {
            return new xg2.c.Error(mVar.q9(setDownloadError.getError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xg2.a.SetDownloadError setDownloadError = (xg2.a.SetDownloadError) this.f218524f;
            c0 c0Var = (c0) this.f218525g;
            uq.b.e();
            if (this.f218523e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final m mVar = m.this;
            return c0Var.d(new er.l() { // from class: xg2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.c.O(mVar, setDownloadError, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xg2.a.SetDownloadError setDownloadError, c0<xg2.c> c0Var, tq.e<? super k10.l<? extends xg2.c>> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f218524f = setDownloadError;
            cVar.f218525g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxg2/a$b;", "<unused var>", "Lk10/c0;", "Lxg2/c;", "state", "Lk10/l;", "<anonymous>", "(Lxg2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xg2.a.b, c0<xg2.c>, tq.e<? super k10.l<? extends xg2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218528f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xg2.c.a O(xg2.c cVar) {
            return xg2.c.a.f218480a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f218528f;
            uq.b.e();
            if (this.f218527e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: xg2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.d.O((c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xg2.a.b bVar, c0<xg2.c> c0Var, tq.e<? super k10.l<? extends xg2.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f218528f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxg2/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxg2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<xg2.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f218530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f218531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f218532h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f218533j;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        
            if (r1.F(r2, r7) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
        
            if (r1.F(r3, r7) == r0) goto L29;
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
                int r1 = r7.f218533j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r0 = r7.f218530f
                tq0.c r0 = (tq0.c) r0
                java.lang.Object r0 = r7.f218529e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto Lbc
            L27:
                oq.u.b(r8)
                goto L4d
            L2b:
                oq.u.b(r8)
                xg2.m r8 = xg2.m.this
                vq0.h r8 = xg2.m.l9(r8)
                vq0.h$a r1 = new vq0.h$a
                xg2.m r5 = xg2.m.this
                xg2.b r5 = xg2.m.m9(r5)
                java.lang.String r5 = r5.getOrderId()
                r6 = 0
                r1.<init>(r5, r6)
                r7.f218533j = r4
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L4d
                goto Lb5
            L4d:
                dx.i r8 = (dx.i) r8
                xg2.m r1 = xg2.m.this
                boolean r4 = r8 instanceof dx.i.Left
                if (r4 == 0) goto L66
                r4 = r8
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                xg2.a$c r5 = new xg2.a$c
                r5.<init>(r4)
                xg2.m.k9(r1, r5)
            L66:
                xg2.m r1 = xg2.m.this
                boolean r4 = r8 instanceof dx.i.Right
                if (r4 == 0) goto Lbc
                r4 = r8
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                tq0.c r4 = (tq0.c) r4
                boolean r5 = r4 instanceof tq0.c.Document
                r6 = 0
                if (r5 == 0) goto L97
                xg2.a$a$b r2 = new xg2.a$a$b
                r5 = r4
                tq0.c$a r5 = (tq0.c.Document) r5
                r2.<init>(r5)
                r7.f218529e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f218530f = r8
                r7.f218531g = r6
                r7.f218532h = r6
                r7.f218533j = r3
                java.lang.Object r8 = r1.F(r2, r7)
                if (r8 != r0) goto Lbc
                goto Lb5
            L97:
                tq0.c$b r3 = tq0.c.b.f191415a
                boolean r3 = fr.t.c(r4, r3)
                if (r3 == 0) goto Lb6
                xg2.a$a$c r3 = xg2.a.InterfaceC5836a.c.f218476a
                r7.f218529e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f218530f = r8
                r7.f218531g = r6
                r7.f218532h = r6
                r7.f218533j = r2
                java.lang.Object r8 = r1.F(r3, r7)
                if (r8 != r0) goto Lbc
            Lb5:
                return r0
            Lb6:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            Lbc:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xg2.m.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(xg2.c.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new e(eVar);
        }
    }

    public m(yy.a aVar, yg2.c cVar, hb4.d dVar, ib4.c cVar2, vq0.h hVar, SetupData setupData) {
        this.mapper = cVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar2;
        this.getDocumentUC = hVar;
        this.setupData = setupData;
        xg2.c.a aVar2 = xg2.c.a.f218480a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: xg2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.u9(this.f218498a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c q9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: xg2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f218497a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(m mVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            mVar.d9(xg2.a.b.f218477a);
        } else {
            mVar.d9(xg2.a.InterfaceC5836a.C5837a.f218474a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xg2.d.a s9(xg2.c cVar) {
        return this.mapper.b(new yg2.c.Params(cVar, b9(xg2.a.InterfaceC5836a.C5837a.f218474a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final m mVar, v vVar) {
        vVar.c(q0.c(xg2.c.class), new er.l() { // from class: xg2.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f218495a, (z) obj);
            }
        });
        vVar.c(q0.c(xg2.c.a.class), new er.l() { // from class: xg2.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f218496a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xg2.a.InterfaceC5836a.class), oVar, bVar);
        zVar.v(q0.c(xg2.a.SetDownloadError.class), oVar, mVar.new c(null));
        zVar.v(q0.c(xg2.a.b.class), oVar, new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, z zVar) {
        zVar.C(mVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xg2.a.InterfaceC5836a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<xg2.c, xg2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xg2.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xg2.a.InterfaceC5836a interfaceC5836a, tq.e<? super i0> eVar) {
        return super.F(interfaceC5836a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
