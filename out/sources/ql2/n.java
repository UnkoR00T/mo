package ql2;

import fr.q0;
import jb4.PayloadErrorData;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl2.EntryDetailsData;
import sq0.BENationalCourtRegisterEntry;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010W\u001a\b\u0012\u0004\u0012\u00020&0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lql2/n;", "Ll00/g;", "Lql2/b;", "Lql2/a;", "Lql2/c;", "", "Lyy/a;", "stateMachineFactory", "Lpl2/a;", "entry", "Lrl2/a;", "mapper", "Lml2/a;", "downloadDocumentUC", "Lac4/a;", "callActionWithLoaderUC", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lmx/c;", "labelProvider", "Li70/e;", "globalSnackBarManager", "Lml2/c;", "monitorSubscriptionUC", "Lml2/e;", "requestStoragePermissionUC", "Lac4/n;", "openUriIntentUseCase", "<init>", "(Lyy/a;Lpl2/a;Lrl2/a;Lml2/a;Lac4/a;Lhb4/d;Lcb4/j;Lib4/c;Lmx/c;Li70/e;Lml2/c;Lml2/e;Lac4/n;)V", "Ldx/b;", "Ljb4/f;", "A9", "(Ldx/b;)Ljb4/f;", "Lql2/c$a;", "B9", "(Lql2/b;)Lql2/c$a;", "b", "Lpl2/a;", "c", "Lrl2/a;", "d", "Lml2/a;", "e", "Lac4/a;", "f", "Lhb4/d;", "g", "Lcb4/j;", "h", "Lib4/c;", "j", "Lmx/c;", "k", "Li70/e;", "l", "Lml2/c;", "m", "Lml2/e;", "n", "Lac4/n;", "Lql2/b$a;", "p", "Lql2/b$a;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lql2/a$c;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<ql2.b, ql2.a> implements ql2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EntryDetailsData entry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rl2.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ml2.a downloadDocumentUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ml2.c monitorSubscriptionUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ml2.e requestStoragePermissionUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ql2.b.Content initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ql2.b, ql2.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ql2.a.c> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<ql2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ql2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f167227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f167228b;

        /* JADX INFO: renamed from: ql2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4210a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f167229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f167230b;

            /* JADX INFO: renamed from: ql2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4211a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f167231d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f167232e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f167233f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f167235h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f167236j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f167237k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f167238l;

                public C4211a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f167231d = obj;
                    this.f167232e |= PKIFailureInfo.systemUnavail;
                    return C4210a.this.F(null, this);
                }
            }

            public C4210a(mu.h hVar, n nVar) {
                this.f167229a = hVar;
                this.f167230b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4211a c4211a;
                if (eVar instanceof C4211a) {
                    c4211a = (C4211a) eVar;
                    int i15 = c4211a.f167232e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4211a.f167232e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4211a = new C4211a(eVar);
                    }
                } else {
                    c4211a = new C4211a(eVar);
                }
                Object obj2 = c4211a.f167231d;
                Object objE = uq.b.e();
                int i16 = c4211a.f167232e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f167229a;
                    ql2.c.a aVarB9 = this.f167230b.B9((ql2.b) obj);
                    c4211a.f167233f = vq.j.a(obj);
                    c4211a.f167235h = vq.j.a(c4211a);
                    c4211a.f167236j = vq.j.a(obj);
                    c4211a.f167237k = vq.j.a(hVar);
                    c4211a.f167238l = 0;
                    c4211a.f167232e = 1;
                    if (hVar.F(aVarB9, c4211a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f167227a = gVar;
            this.f167228b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ql2.c.a> hVar, tq.e eVar) {
            Object objA = this.f167227a.a(new C4210a(hVar, this.f167228b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lql2/a$c;", "action", "Lql2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lql2/a$c;Lql2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ql2.a.c, ql2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167240f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ql2.a.c cVar = (ql2.a.c) this.f167240f;
            Object objE = uq.b.e();
            int i15 = this.f167239e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ql2.a.c> bVarY1 = n.this.Y1();
                this.f167240f = vq.j.a(cVar);
                this.f167239e = 1;
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
        public final Object w(ql2.a.c cVar, ql2.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = n.this.new b(eVar);
            bVar2.f167240f = cVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lql2/a$b;", "<unused var>", "Lk10/c0;", "Lql2/b;", "state", "Lk10/l;", "<anonymous>", "(Lql2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ql2.a.b, c0<ql2.b>, tq.e<? super k10.l<? extends ql2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167243f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ql2.b.Dialog V(n nVar, ml2.e.b bVar, ql2.b bVar2) {
            return new ql2.b.Dialog(bVar2.getEntry(), nVar.dialogVMSFactory.a(((ml2.e.b.ShowPermissionsSettingsDialog) bVar).getDialogData()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ql2.b.Download X(ql2.b bVar) {
            return new ql2.b.Download(bVar.getEntry());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167243f;
            Object objE = uq.b.e();
            int i15 = this.f167242e;
            if (i15 == 0) {
                oq.u.b(obj);
                ml2.e eVar = n.this.requestStoragePermissionUC;
                ml2.e.Params params = new ml2.e.Params(n.this.b9(ql2.a.C4206a.f167178a));
                this.f167243f = c0Var;
                this.f167242e = 1;
                obj = eVar.g(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final ml2.e.b bVar = (ml2.e.b) obj;
            if (bVar instanceof ml2.e.b.ShowPermissionsSettingsDialog) {
                final n nVar = n.this;
                return c0Var.d(new er.l() { // from class: ql2.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.c.V(nVar, bVar, (b) obj2);
                    }
                });
            }
            if (fr.t.c(bVar, ml2.e.b.a.f127096a)) {
                return c0Var.d(new er.l() { // from class: ql2.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.c.X((b) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ql2.a.b bVar, c0<ql2.b> c0Var, tq.e<? super k10.l<? extends ql2.b>> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f167243f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lql2/a$d;", "<unused var>", "Lql2/b;", "state", "Loq/i0;", "<anonymous>", "(Lql2/a$d;Lql2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ql2.a.d, ql2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167246f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ql2.b bVar = (ql2.b) this.f167246f;
            uq.b.e();
            if (this.f167245e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n.this.d9(new ql2.a.c.ToNotifications(bVar.getEntry()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ql2.a.d dVar, ql2.b bVar, tq.e<? super i0> eVar) {
            d dVar2 = n.this.new d(eVar);
            dVar2.f167246f = bVar;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsq0/h;", "entry", "Lql2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lsq0/h;Lql2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<BENationalCourtRegisterEntry, ql2.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167250g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BENationalCourtRegisterEntry bENationalCourtRegisterEntry = (BENationalCourtRegisterEntry) this.f167249f;
            ql2.b.Content content = (ql2.b.Content) this.f167250g;
            uq.b.e();
            if (this.f167248e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (sq0.d.b(content.getEntry().getEntry().getIdKrs(), bENationalCourtRegisterEntry.getIdKrs())) {
                n.this.d9(new ql2.a.UpdateEntry(bENationalCourtRegisterEntry));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(BENationalCourtRegisterEntry bENationalCourtRegisterEntry, ql2.b.Content content, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f167249f = bENationalCourtRegisterEntry;
            eVar2.f167250g = content;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lql2/a$g;", "action", "Lk10/c0;", "Lql2/b$a;", "state", "Lk10/l;", "Lql2/b;", "<anonymous>", "(Lql2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ql2.a.UpdateEntry, c0<ql2.b.Content>, tq.e<? super k10.l<? extends ql2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167254g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ql2.b.Content O(ql2.a.UpdateEntry updateEntry, ql2.b.Content content) {
            return content.b(EntryDetailsData.b(content.getEntry(), updateEntry.getEntry(), 0, 0, false, 14, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ql2.a.UpdateEntry updateEntry = (ql2.a.UpdateEntry) this.f167253f;
            c0 c0Var = (c0) this.f167254g;
            uq.b.e();
            if (this.f167252e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ql2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.O(updateEntry, (b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ql2.a.UpdateEntry updateEntry, c0<ql2.b.Content> c0Var, tq.e<? super k10.l<? extends ql2.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f167253f = updateEntry;
            fVar.f167254g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lql2/b$c;", "state", "Lk10/l;", "Lql2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<ql2.b.Download>, tq.e<? super k10.l<? extends ql2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167256f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lql2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ql2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f167258e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f167259f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f167260g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f167261h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f167262j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f167263k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f167264l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ n f167265m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<ql2.b.Download> f167266n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<ql2.b.Download> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f167265m = nVar;
                this.f167266n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ql2.b.Content V(c0 c0Var, ql2.b.Download download) {
                return new ql2.b.Content(((ql2.b.Download) c0Var.a()).getEntry());
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0095  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                n nVar;
                final c0<ql2.b.Download> c0Var;
                dx.i iVar;
                Object objE = uq.b.e();
                int i15 = this.f167264l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml2.a aVar = this.f167265m.downloadDocumentUC;
                    ml2.a.Params params = new ml2.a.Params(this.f167265m.entry.getEntry().getIdKrs(), null);
                    this.f167264l = 1;
                    obj = aVar.d(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f167260g;
                    nVar = (n) this.f167259f;
                    oq.u.b(obj);
                }
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    nVar.globalSnackBarManager.y(new p50.a.Default(nVar.labelProvider.c(hl2.a.f85263h), false, null, 6, null));
                }
                return c0Var.d(new er.l() { // from class: ql2.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.g.a.V(c0Var, (b.Download) obj2);
                    }
                });
                dx.i iVar2 = (dx.i) obj;
                nVar = this.f167265m;
                c0<ql2.b.Download> c0Var2 = this.f167266n;
                if (!(iVar2 instanceof dx.i.Right)) {
                    if (iVar2 instanceof dx.i.Left) {
                        nVar.d9(new ql2.a.SetDownloadError((dx.b) ((dx.i.Left) iVar2).b()));
                    }
                    return this.f167266n.c();
                }
                String str = (String) ((dx.i.Right) iVar2).b();
                ac4.n nVar2 = nVar.openUriIntentUseCase;
                ac4.n.Params params2 = new ac4.n.Params(str);
                this.f167258e = vq.j.a(iVar2);
                this.f167259f = nVar;
                this.f167260g = c0Var2;
                this.f167261h = vq.j.a(str);
                this.f167262j = 0;
                this.f167263k = 0;
                this.f167264l = 2;
                obj = nVar2.c(params2, this);
                if (obj != objE) {
                    c0Var = c0Var2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        nVar.globalSnackBarManager.y(new p50.a.Default(nVar.labelProvider.c(hl2.a.f85263h), false, null, 6, null));
                    }
                    return c0Var.d(new er.l() { // from class: ql2.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.g.a.V(c0Var, (b.Download) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f167265m, this.f167266n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ql2.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167256f;
            Object objE = uq.b.e();
            int i15 = this.f167255e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = n.this.callActionWithLoaderUC;
            a aVar2 = new a(n.this, c0Var, null);
            this.f167256f = vq.j.a(c0Var);
            this.f167255e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ql2.b.Download> c0Var, tq.e<? super k10.l<? extends ql2.b>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = n.this.new g(eVar);
            gVar.f167256f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lql2/a$f;", "action", "Lk10/c0;", "Lql2/b$c;", "state", "Lk10/l;", "Lql2/b;", "<anonymous>", "(Lql2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ql2.a.SetDownloadError, c0<ql2.b.Download>, tq.e<? super k10.l<? extends ql2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167269g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ql2.b.Error V(c0 c0Var, final n nVar, ql2.a.SetDownloadError setDownloadError, final boolean z15, ql2.b.Download download) {
            return new ql2.b.Error(((ql2.b.Download) c0Var.a()).getEntry(), nVar.errorVMSFactory.a(nVar.genericDomainErrorMapper.b(new ib4.c.Params(setDownloadError.getError(), false, new er.l() { // from class: ql2.t
                @Override // er.l
                public final Object b(Object obj) {
                    return n.h.X(nVar, z15, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(n nVar, boolean z15, ib4.c.b bVar) {
            nVar.d9(new ql2.a.ResultDownloadError(bVar, z15));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ql2.a.SetDownloadError setDownloadError = (ql2.a.SetDownloadError) this.f167268f;
            final c0 c0Var = (c0) this.f167269g;
            uq.b.e();
            if (this.f167267e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            PayloadErrorData payloadErrorDataA9 = n.this.A9(setDownloadError.getError());
            final boolean zC = fr.t.c(payloadErrorDataA9 != null ? payloadErrorDataA9.getCode() : null, "NATIONAL_COURT_REGISTER_DOCUMENT_ACCESS_DENIED");
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: ql2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.h.V(c0Var, nVar, setDownloadError, zC, (b.Download) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ql2.a.SetDownloadError setDownloadError, c0<ql2.b.Download> c0Var, tq.e<? super k10.l<? extends ql2.b>> eVar) {
            h hVar = n.this.new h(eVar);
            hVar.f167268f = setDownloadError;
            hVar.f167269g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lql2/a$e;", "action", "Lk10/c0;", "Lql2/b$d;", "state", "Lk10/l;", "Lql2/b;", "<anonymous>", "(Lql2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ql2.a.ResultDownloadError, c0<ql2.b.Error>, tq.e<? super k10.l<? extends ql2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f167273g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ql2.b O(ql2.a.ResultDownloadError resultDownloadError, c0 c0Var, n nVar, ql2.b.Error error) {
            if (fr.t.c(resultDownloadError.getAction(), ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                return new ql2.b.Download(((ql2.b.Error) c0Var.a()).getEntry());
            }
            if (!resultDownloadError.getIsAccessDeniedError()) {
                return new ql2.b.Content(((ql2.b.Error) c0Var.a()).getEntry());
            }
            nVar.d9(ql2.a.c.C4207a.f167180a);
            return (ql2.b) c0Var.a();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ql2.a.ResultDownloadError resultDownloadError = (ql2.a.ResultDownloadError) this.f167272f;
            final c0 c0Var = (c0) this.f167273g;
            uq.b.e();
            if (this.f167271e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: ql2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.i.O(resultDownloadError, c0Var, nVar, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ql2.a.ResultDownloadError resultDownloadError, c0<ql2.b.Error> c0Var, tq.e<? super k10.l<? extends ql2.b>> eVar) {
            i iVar = n.this.new i(eVar);
            iVar.f167272f = resultDownloadError;
            iVar.f167273g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lql2/a$a;", "<unused var>", "Lk10/c0;", "Lql2/b$b;", "state", "Lk10/l;", "Lql2/b;", "<anonymous>", "(Lql2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ql2.a.C4206a, c0<ql2.b.Dialog>, tq.e<? super k10.l<? extends ql2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167276f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ql2.b.Content O(ql2.b.Dialog dialog) {
            return new ql2.b.Content(dialog.getEntry());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167276f;
            uq.b.e();
            if (this.f167275e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ql2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.j.O((b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ql2.a.C4206a c4206a, c0<ql2.b.Dialog> c0Var, tq.e<? super k10.l<? extends ql2.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f167276f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, EntryDetailsData entryDetailsData, rl2.a aVar2, ml2.a aVar3, ac4.a aVar4, hb4.d dVar, cb4.j jVar, ib4.c cVar, mx.c cVar2, i70.e eVar, ml2.c cVar3, ml2.e eVar2, ac4.n nVar) {
        this.entry = entryDetailsData;
        this.mapper = aVar2;
        this.downloadDocumentUC = aVar3;
        this.callActionWithLoaderUC = aVar4;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar;
        this.genericDomainErrorMapper = cVar;
        this.labelProvider = cVar2;
        this.globalSnackBarManager = eVar;
        this.monitorSubscriptionUC = cVar3;
        this.requestStoragePermissionUC = eVar2;
        this.openUriIntentUseCase = nVar;
        ql2.b.Content content = new ql2.b.Content(entryDetailsData);
        this.initialState = content;
        this.stateMachine = aVar.a(content, new er.l() { // from class: ql2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.D9(this.f167210a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), B9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData A9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ql2.c.a B9(ql2.b bVar) {
        return this.mapper.b(new rl2.a.Params(bVar, b9(ql2.a.c.C4207a.f167180a), b9(ql2.a.d.f167182a), b9(ql2.a.b.f167179a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final n nVar, k10.v vVar) {
        vVar.c(q0.c(ql2.b.class), new er.l() { // from class: ql2.h
            @Override // er.l
            public final Object b(Object obj) {
                return n.E9(this.f167206a, (z) obj);
            }
        });
        vVar.c(q0.c(ql2.b.Content.class), new er.l() { // from class: ql2.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.F9(this.f167207a, (z) obj);
            }
        });
        vVar.c(q0.c(ql2.b.Download.class), new er.l() { // from class: ql2.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.G9(this.f167208a, (z) obj);
            }
        });
        vVar.c(q0.c(ql2.b.Error.class), new er.l() { // from class: ql2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.H9(this.f167209a, (z) obj);
            }
        });
        vVar.c(q0.c(ql2.b.Dialog.class), new er.l() { // from class: ql2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.I9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ql2.a.c.class), oVar, bVar);
        zVar.v(q0.c(ql2.a.b.class), oVar, nVar.new c(null));
        zVar.x(q0.c(ql2.a.d.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(n nVar, z zVar) {
        k10.k.s(zVar, nVar.monitorSubscriptionUC.b(gz.b.a.C1792a.f78542a), null, nVar.new e(null), 2, null);
        f fVar = new f(null);
        zVar.v(q0.c(ql2.a.UpdateEntry.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(n nVar, z zVar) {
        zVar.A(nVar.new g(null));
        h hVar = nVar.new h(null);
        zVar.v(q0.c(ql2.a.SetDownloadError.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(n nVar, z zVar) {
        i iVar = nVar.new i(null);
        zVar.v(q0.c(ql2.a.ResultDownloadError.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(z zVar) {
        j jVar = new j(null);
        zVar.v(q0.c(ql2.a.C4206a.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(EntryDetailsData entryDetailsData) {
        super.P5(entryDetailsData);
    }

    @Override // zx.b
    public xw.b<ql2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ql2.b, ql2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ql2.c.a> getState() {
        return this.state;
    }
}
