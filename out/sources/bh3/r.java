package bh3;

import fr.q0;
import java.util.concurrent.CancellationException;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.StatementReady;
import sv0.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030<8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010N\u001a\b\u0012\u0004\u0012\u00020'0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lbh3/r;", "Ll00/g;", "Lbh3/g;", "Lbh3/e;", "Lbh3/h;", "", "Lyy/a;", "stateMachineFactory", "Lch3/a;", "mapper", "Lae3/q;", "requestStoragePermissionUC", "Law0/r;", "getCollisionStatementUC", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "loaderUC", "Lae3/n;", "regenerateStatementUC", "Lbh3/f;", "setupData", "<init>", "(Lyy/a;Lch3/a;Lae3/q;Law0/r;Lib4/c;Lac4/a;Lae3/n;Lbh3/f;)V", "Lsv0/g0;", "statementReady", "Lbh3/g$b$a;", "v9", "(Lsv0/g0;)Lbh3/g$b$a;", "Lbh3/e$b;", "action", "Loq/i0;", "y9", "(Lbh3/e$b;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "retryAction", "w9", "(Ldx/b;Lbh3/e;)V", "Lbh3/h$a;", "x9", "(Lbh3/g;)Lbh3/h$a;", "b", "Lch3/a;", "c", "Lae3/q;", "d", "Law0/r;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lae3/n;", "h", "Lbh3/f;", "Lbh3/g$a;", "j", "Lbh3/g$a;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbh3/e$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<bh3.g, bh3.e> implements bh3.h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ch3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.q requestStoragePermissionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.r getCollisionStatementUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ae3.n regenerateStatementUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bh3.f setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final bh3.g.a initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bh3.g, bh3.e> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bh3.e.InterfaceC0504e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<bh3.h.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19683a;

        static {
            int[] iArr = new int[sv0.l.values().length];
            try {
                iArr[sv0.l.VICTIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sv0.l.PERPETRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19683a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19684e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f19686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ bh3.e f19687h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dx.b bVar, bh3.e eVar, tq.e<? super b> eVar2) {
            super(1, eVar2);
            this.f19686g = bVar;
            this.f19687h = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(r rVar, bh3.e eVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
                rVar.d9(eVar);
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close)) {
                    throw new oq.p();
                }
                rVar.d9(bh3.e.a.f19633a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f19684e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<bh3.e.InterfaceC0504e> bVarY1 = r.this.Y1();
                ib4.c cVar = r.this.genericDomainErrorMapper;
                dx.b bVar = this.f19686g;
                final r rVar = r.this;
                final bh3.e eVar = this.f19687h;
                bh3.e.InterfaceC0504e.ShowError showError = new bh3.e.InterfaceC0504e.ShowError(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: bh3.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.b.V(rVar, eVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f19684e = 1;
                if (bVarY1.F(showError, this) == objE) {
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

        public final tq.e<i0> N(tq.e<?> eVar) {
            return r.this.new b(this.f19686g, this.f19687h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f19688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f19689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f19690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f19691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f19692h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f19693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f19694k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f19695l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f19696m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19697n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f19698p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19699q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f19700r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f19701s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f19703v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f19701s = obj;
            this.f19703v |= PKIFailureInfo.systemUnavail;
            return r.this.y9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<bh3.h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f19704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f19705b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f19706a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f19707b;

            /* JADX INFO: renamed from: bh3.r$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0509a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f19708d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f19709e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f19710f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f19712h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f19713j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f19714k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f19715l;

                public C0509a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f19708d = obj;
                    this.f19709e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f19706a = hVar;
                this.f19707b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0509a c0509a;
                if (eVar instanceof C0509a) {
                    c0509a = (C0509a) eVar;
                    int i15 = c0509a.f19709e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0509a.f19709e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0509a = new C0509a(eVar);
                    }
                } else {
                    c0509a = new C0509a(eVar);
                }
                Object obj2 = c0509a.f19708d;
                Object objE = uq.b.e();
                int i16 = c0509a.f19709e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f19706a;
                    bh3.h.a aVarX9 = this.f19707b.x9((bh3.g) obj);
                    c0509a.f19710f = vq.j.a(obj);
                    c0509a.f19712h = vq.j.a(c0509a);
                    c0509a.f19713j = vq.j.a(obj);
                    c0509a.f19714k = vq.j.a(hVar);
                    c0509a.f19715l = 0;
                    c0509a.f19709e = 1;
                    if (hVar.F(aVarX9, c0509a) == objE) {
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

        public d(mu.g gVar, r rVar) {
            this.f19704a = gVar;
            this.f19705b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bh3.h.a> hVar, tq.e eVar) {
            Object objA = this.f19704a.a(new a(hVar, this.f19705b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbh3/e$a;", "<unused var>", "Lbh3/g;", "Loq/i0;", "<anonymous>", "(Lbh3/e$a;Lbh3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bh3.e.a, bh3.g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19716e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f19716e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<bh3.e.InterfaceC0504e> bVarY1 = r.this.Y1();
                bh3.e.InterfaceC0504e.b bVar = bh3.e.InterfaceC0504e.b.f19639a;
                this.f19716e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(bh3.e.a aVar, bh3.g gVar, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbh3/g$a;", "state", "Lk10/l;", "Lbh3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<bh3.g.a>, tq.e<? super k10.l<? extends bh3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19719f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bh3.g.Initialized O(r rVar, bh3.g.a aVar) {
            return new bh3.g.Initialized(((bh3.f.FromStatus) rVar.setupData).getProcessId(), ((bh3.f.FromStatus) rVar.setupData).getStatementReady(), rVar.v9(((bh3.f.FromStatus) rVar.setupData).getStatementReady()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f19719f;
            uq.b.e();
            if (this.f19718e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            bh3.f fVar = r.this.setupData;
            if (fVar instanceof bh3.f.FromStatus) {
                final r rVar = r.this;
                return c0Var.d(new er.l() { // from class: bh3.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.f.O(rVar, (g.a) obj2);
                    }
                });
            }
            if (!(fVar instanceof bh3.f.FromExpiredTokenError)) {
                throw new oq.p();
            }
            r.this.d9(bh3.e.g.f19646a);
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<bh3.g.a> c0Var, tq.e<? super k10.l<? extends bh3.g>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f19719f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbh3/e$g;", "action", "Lk10/c0;", "Lbh3/g$a;", "state", "Lk10/l;", "Lbh3/g;", "<anonymous>", "(Lbh3/e$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bh3.e.g, c0<bh3.g.a>, tq.e<? super k10.l<? extends bh3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f19723g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lbh3/g$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends bh3.g.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f19725e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f19726f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f19727g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f19728h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f19729j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f19730k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f19731l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f19732m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f19733n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f19734p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f19735q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f19736r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ r f19737s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ c0<bh3.g.a> f19738t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ bh3.e.g f19739v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<bh3.g.a> c0Var, bh3.e.g gVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f19737s = rVar;
                this.f19738t = c0Var;
                this.f19739v = gVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bh3.g.Initialized V(r rVar, StatementReady statementReady, bh3.g.a aVar) {
                return new bh3.g.Initialized(rVar.setupData.getProcessId(), statementReady, rVar.v9(statementReady));
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [dx.j, int, java.lang.Object] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
            	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
            	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
            	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
            	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i left;
                Object objB;
                final r rVar;
                c0<bh3.g.a> c0Var;
                ex.b bVar;
                Object objE = uq.b.e();
                ?? r15 = this.f19736r;
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(obj);
                            rVar = this.f19737s;
                            c0<bh3.g.a> c0Var2 = this.f19738t;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            ex.a aVar = new ex.a();
                            aw0.r rVar2 = rVar.getCollisionStatementUC;
                            aw0.r.Params params = new aw0.r.Params(rVar.setupData.getProcessId());
                            this.f19725e = rVar;
                            this.f19726f = c0Var2;
                            this.f19727g = jVarA;
                            this.f19728h = vq.j.a(aVar);
                            this.f19729j = vq.j.a(aVar);
                            this.f19730k = aVar;
                            this.f19731l = 0;
                            this.f19732m = 0;
                            this.f19733n = 0;
                            this.f19734p = 0;
                            this.f19735q = 0;
                            this.f19736r = 1;
                            Object objC = rVar2.c(params, this);
                            if (objC == objE) {
                                return objE;
                            }
                            c0Var = c0Var2;
                            obj = objC;
                            bVar = aVar;
                        } else {
                            if (r15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) this.f19730k;
                            c0Var = (c0) this.f19726f;
                            rVar = (r) this.f19725e;
                            try {
                                oq.u.b(obj);
                            } catch (CancellationException e15) {
                                throw e15;
                            }
                        }
                        sv0.c0.b bVar2 = (sv0.c0.b) bVar.a((dx.i) obj);
                        final StatementReady statementReady = new StatementReady(false, s0.StatementCreated, bVar2.getCollisionRole(), bVar2.getPdfsFile(), bVar2.getStatementNumber());
                        left = new dx.i.Right(c0Var.d(new er.l() { // from class: bh3.u
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return r.g.a.V(rVar, statementReady, (g.a) obj2);
                            }
                        }));
                    } catch (Exception e16) {
                        px.f fVar = px.f.f163100a;
                        String message = e16.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e16, px.c.a(r15));
                        dx.i iVarA = r15.a(e16);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        left = new dx.i.Left(objB);
                    }
                } catch (ex.c e17) {
                    left = new dx.i.Left((dx.b) ex.d.a(e17));
                } catch (CancellationException e18) {
                    throw e18;
                }
                r rVar3 = this.f19737s;
                bh3.e.g gVar = this.f19739v;
                c0<bh3.g.a> c0Var3 = this.f19738t;
                if (left instanceof dx.i.Left) {
                    rVar3.w9((dx.b) ((dx.i.Left) left).b(), gVar);
                    return c0Var3.c();
                }
                if (left instanceof dx.i.Right) {
                    return ((dx.i.Right) left).b();
                }
                throw new oq.p();
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f19737s, this.f19738t, this.f19739v, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<bh3.g.Initialized>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh3.e.g gVar = (bh3.e.g) this.f19722f;
            c0 c0Var = (c0) this.f19723g;
            Object objE = uq.b.e();
            int i15 = this.f19721e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.loaderUC;
            a aVar2 = new a(r.this, c0Var, gVar, null);
            this.f19722f = vq.j.a(gVar);
            this.f19723g = vq.j.a(c0Var);
            this.f19721e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh3.e.g gVar, c0<bh3.g.a> c0Var, tq.e<? super k10.l<? extends bh3.g>> eVar) {
            g gVar2 = r.this.new g(eVar);
            gVar2.f19722f = gVar;
            gVar2.f19723g = c0Var;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbh3/e$h;", "action", "Lk10/c0;", "Lbh3/g$b;", "state", "Lk10/l;", "Lbh3/g;", "<anonymous>", "(Lbh3/e$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bh3.e.Update, c0<bh3.g.Initialized>, tq.e<? super k10.l<? extends bh3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19741f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bh3.g.Initialized O(bh3.g.Initialized initialized) {
            return bh3.g.Initialized.b(initialized, null, initialized.getStatementReady(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f19741f;
            uq.b.e();
            if (this.f19740e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bh3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.h.O((g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bh3.e.Update update, c0<bh3.g.Initialized> c0Var, tq.e<? super k10.l<? extends bh3.g>> eVar) {
            h hVar = new h(eVar);
            hVar.f19741f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh3/e$c;", "<unused var>", "Lbh3/g$b;", "state", "Loq/i0;", "<anonymous>", "(Lbh3/e$c;Lbh3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bh3.e.c, bh3.g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19743f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh3.g.Initialized initialized = (bh3.g.Initialized) this.f19743f;
            uq.b.e();
            if (this.f19742e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(new bh3.e.DownloadPdf(initialized.getProcessId(), initialized.getStatementReady()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh3.e.c cVar, bh3.g.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f19743f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh3/e$b;", "action", "Lbh3/g$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbh3/e$b;Lbh3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<bh3.e.DownloadPdf, bh3.g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19746f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh3.e.DownloadPdf downloadPdf = (bh3.e.DownloadPdf) this.f19746f;
            Object objE = uq.b.e();
            int i15 = this.f19745e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (downloadPdf.getStatementReady().getRegenerateStatement()) {
                    r.this.d9(new bh3.e.RegenerateStatement(downloadPdf.getProcessId()));
                } else {
                    r rVar = r.this;
                    this.f19746f = vq.j.a(downloadPdf);
                    this.f19745e = 1;
                    if (rVar.y9(downloadPdf, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh3.e.DownloadPdf downloadPdf, bh3.g.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f19746f = downloadPdf;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh3/e$f;", "action", "Lbh3/g$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbh3/e$f;Lbh3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<bh3.e.RegenerateStatement, bh3.g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19749f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f19751e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f19752f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ bh3.e.RegenerateStatement f19753g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, bh3.e.RegenerateStatement regenerateStatement, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f19752f = rVar;
                this.f19753g = regenerateStatement;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f19751e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ae3.n nVar = this.f19752f.regenerateStatementUC;
                    ae3.n.Params params = new ae3.n.Params(this.f19753g.getProcessId());
                    this.f19751e = 1;
                    obj = nVar.d(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                r rVar = this.f19752f;
                bh3.e.RegenerateStatement regenerateStatement = this.f19753g;
                if (iVar instanceof dx.i.Right) {
                    sv0.c0.b.RegeneratedStatement regeneratedStatement = (sv0.c0.b.RegeneratedStatement) ((dx.i.Right) iVar).b();
                    StatementReady statementReady = new StatementReady(false, s0.StatementCreated, regeneratedStatement.getCollisionRole(), regeneratedStatement.getPdfsFile(), regeneratedStatement.getStatementNumber());
                    rVar.d9(new bh3.e.Update(statementReady));
                    rVar.d9(new bh3.e.DownloadPdf(regenerateStatement.getProcessId(), statementReady));
                }
                r rVar2 = this.f19752f;
                bh3.e.RegenerateStatement regenerateStatement2 = this.f19753g;
                if (iVar instanceof dx.i.Left) {
                    rVar2.w9((dx.b) ((dx.i.Left) iVar).b(), regenerateStatement2);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f19752f, this.f19753g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh3.e.RegenerateStatement regenerateStatement = (bh3.e.RegenerateStatement) this.f19749f;
            Object objE = uq.b.e();
            int i15 = this.f19748e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = r.this.loaderUC;
                a aVar2 = new a(r.this, regenerateStatement, null);
                this.f19749f = vq.j.a(regenerateStatement);
                this.f19748e = 1;
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
        public final Object w(bh3.e.RegenerateStatement regenerateStatement, bh3.g.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f19749f = regenerateStatement;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh3/e$d;", "<unused var>", "Lbh3/g$b;", "state", "Loq/i0;", "<anonymous>", "(Lbh3/e$d;Lbh3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<bh3.e.d, bh3.g.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19755f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh3.g.Initialized initialized = (bh3.g.Initialized) this.f19755f;
            Object objE = uq.b.e();
            int i15 = this.f19754e;
            if (i15 == 0) {
                oq.u.b(obj);
                bh3.g.Initialized.a successScreenType = initialized.getSuccessScreenType();
                if (fr.t.c(successScreenType, bh3.g.Initialized.a.C0507b.f19656a)) {
                    r rVar = r.this;
                    bh3.e.InterfaceC0504e.GoToAutomaticReport goToAutomaticReport = new bh3.e.InterfaceC0504e.GoToAutomaticReport(initialized.getProcessId(), initialized.getStatementReady().getStatus());
                    this.f19755f = vq.j.a(initialized);
                    this.f19754e = 1;
                    if (rVar.F(goToAutomaticReport, this) == objE) {
                        return objE;
                    }
                } else {
                    if (!fr.t.c(successScreenType, bh3.g.Initialized.a.C0506a.f19655a)) {
                        throw new oq.p();
                    }
                    px.f.e(px.f.f163100a, "Can't GoToReport as perpetrator", null, px.c.a(r.this), 2, null);
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
        public final Object w(bh3.e.d dVar, bh3.g.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = r.this.new l(eVar);
            lVar.f19755f = initialized;
            return lVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ch3.a aVar2, ae3.q qVar, aw0.r rVar, ib4.c cVar, ac4.a aVar3, ae3.n nVar, bh3.f fVar) {
        this.mapper = aVar2;
        this.requestStoragePermissionUC = qVar;
        this.getCollisionStatementUC = rVar;
        this.genericDomainErrorMapper = cVar;
        this.loaderUC = aVar3;
        this.regenerateStatementUC = nVar;
        this.setupData = fVar;
        bh3.g.a aVar4 = bh3.g.a.f19651a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: bh3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f19671a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), x9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(bh3.g.class), new er.l() { // from class: bh3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f19668a, (z) obj);
            }
        });
        vVar.c(q0.c(bh3.g.a.class), new er.l() { // from class: bh3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f19669a, (z) obj);
            }
        });
        vVar.c(q0.c(bh3.g.Initialized.class), new er.l() { // from class: bh3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f19670a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, z zVar) {
        e eVar = rVar.new e(null);
        zVar.x(q0.c(bh3.e.a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, z zVar) {
        zVar.A(rVar.new f(null));
        g gVar = rVar.new g(null);
        zVar.v(q0.c(bh3.e.g.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(bh3.e.Update.class), oVar, hVar);
        zVar.x(q0.c(bh3.e.c.class), oVar, rVar.new i(null));
        zVar.x(q0.c(bh3.e.DownloadPdf.class), oVar, rVar.new j(null));
        zVar.x(q0.c(bh3.e.RegenerateStatement.class), oVar, rVar.new k(null));
        zVar.x(q0.c(bh3.e.d.class), oVar, rVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bh3.g.Initialized.a v9(StatementReady statementReady) {
        int i15 = a.f19683a[statementReady.getCollisionRole().ordinal()];
        if (i15 == 1) {
            return bh3.g.Initialized.a.C0507b.f19656a;
        }
        if (i15 == 2) {
            return bh3.g.Initialized.a.C0506a.f19655a;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w9(dx.b domainError, bh3.e retryAction) {
        i00.a.a(this, new b(domainError, retryAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bh3.h.a x9(bh3.g gVar) {
        ch3.a aVar = this.mapper;
        er.a<i0> aVarB9 = b9(bh3.e.a.f19633a);
        return aVar.b(new ch3.a.Params(gVar, b9(bh3.e.d.f19637a), b9(bh3.e.c.f19636a), aVarB9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
    
        if (r2.F(r4, r0) == r1) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [bh3.e$b] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bh3.r$c, tq.e] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [bh3.e] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [bh3.r] */
    /* JADX WARN: Type inference failed for: r14v0, types: [bh3.e$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [bh3.e$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r15v9, types: [ae3.q] */
    /* JADX WARN: Type inference failed for: r2v8, types: [xw.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y9(bh3.e.DownloadPdf r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.r.y9(bh3.e$b, tq.e):java.lang.Object");
    }

    @Override // zx.b
    public xw.b<bh3.e.InterfaceC0504e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bh3.g, bh3.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bh3.h.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bh3.e.InterfaceC0504e interfaceC0504e, tq.e<? super i0> eVar) {
        return super.F(interfaceC0504e, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(bh3.f fVar) {
        super.P5(fVar);
    }
}
