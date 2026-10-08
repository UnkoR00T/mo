package mx1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import lw1.j0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u001eH\u0082@¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lmx1/u;", "Ll00/g;", "Lmx1/b;", "Lmx1/a;", "Lmx1/c;", "", "Lyy/a;", "stateMachineFactory", "Lnx1/a;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lac4/n;", "openUriIntentUseCase", "Lbc4/h;", "pickFileUseCase", "Lxw1/c;", "processInterruptDialogMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Lnx1/a;Lib4/c;Lac4/n;Lbc4/h;Lxw1/c;Lyw/b;Lmx/c;Lhb4/d;)V", "state", "Lmx1/c$a;", "B9", "(Lmx1/b;)Lmx1/c$a;", "Ldx/b;", "Ljb4/b;", "y9", "(Ldx/b;)Ljb4/b;", "Loq/i0;", "A9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "Lcb4/d;", "I9", "(Ldx/b$c;)Lcb4/d;", "b", "Lnx1/a;", "c", "Lib4/c;", "d", "Lac4/n;", "e", "Lbc4/h;", "f", "Lxw1/c;", "g", "Lyw/b;", "h", "Lmx/c;", "j", "Lhb4/d;", "Lmx1/b$a;", "k", "Lmx1/b$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lmx1/a$g;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<mx1.b, mx1.a> implements mx1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nx1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw1.c processInterruptDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx1.b.AddFile initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mx1.b, mx1.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mx1.a.g> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<mx1.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<mx1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f129239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f129240b;

        /* JADX INFO: renamed from: mx1.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3212a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f129241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f129242b;

            /* JADX INFO: renamed from: mx1.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3213a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129243d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f129244e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f129245f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f129247h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f129248j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f129249k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f129250l;

                public C3213a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f129243d = obj;
                    this.f129244e |= PKIFailureInfo.systemUnavail;
                    return C3212a.this.F(null, this);
                }
            }

            public C3212a(mu.h hVar, u uVar) {
                this.f129241a = hVar;
                this.f129242b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3213a c3213a;
                if (eVar instanceof C3213a) {
                    c3213a = (C3213a) eVar;
                    int i15 = c3213a.f129244e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3213a.f129244e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3213a = new C3213a(eVar);
                    }
                } else {
                    c3213a = new C3213a(eVar);
                }
                Object obj2 = c3213a.f129243d;
                Object objE = uq.b.e();
                int i16 = c3213a.f129244e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f129241a;
                    mx1.c.a aVarB9 = this.f129242b.B9((mx1.b) obj);
                    c3213a.f129245f = vq.j.a(obj);
                    c3213a.f129247h = vq.j.a(c3213a);
                    c3213a.f129248j = vq.j.a(obj);
                    c3213a.f129249k = vq.j.a(hVar);
                    c3213a.f129250l = 0;
                    c3213a.f129244e = 1;
                    if (hVar.F(aVarB9, c3213a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f129239a = gVar;
            this.f129240b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mx1.c.a> hVar, tq.e eVar) {
            Object objA = this.f129239a.a(new C3212a(hVar, this.f129240b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx1/a$c;", "<unused var>", "Lmx1/b;", "Loq/i0;", "<anonymous>", "(Lmx1/a$c;Lmx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<mx1.a.c, mx1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129251e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129251e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mx1.a.g> bVarY1 = u.this.Y1();
                mx1.a.g.b bVar = mx1.a.g.b.f129173a;
                this.f129251e = 1;
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
        public final Object w(mx1.a.c cVar, mx1.b bVar, tq.e<? super i0> eVar) {
            return u.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx1/a$i;", "<unused var>", "Lmx1/b;", "Loq/i0;", "<anonymous>", "(Lmx1/a$i;Lmx1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<mx1.a.i, mx1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129253e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129253e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mx1.a.g> bVarY1 = u.this.Y1();
                mx1.a.g.ShowDialog showDialog = new mx1.a.g.ShowDialog(u.this.processInterruptDialogMapper.b(new xw1.c.Params(u.this.labelProvider.c(j0.f120812z), new er.a() { // from class: mx1.v
                    @Override // er.a
                    public final Object a() {
                        return u.c.O();
                    }
                }, u.this.b9(mx1.a.c.f129168a))));
                this.f129253e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.i iVar, mx1.b bVar, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx1/a$b;", "<unused var>", "Lmx1/b$a;", "Loq/i0;", "<anonymous>", "(Lmx1/a$b;Lmx1/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<mx1.a.b, mx1.b.AddFile, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129255e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129255e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mx1.a.g> bVarY1 = u.this.Y1();
                mx1.a.g.C3208a c3208a = mx1.a.g.C3208a.f129172a;
                this.f129255e = 1;
                if (bVarY1.F(c3208a, this) == objE) {
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
        public final Object w(mx1.a.b bVar, mx1.b.AddFile addFile, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx1/a$d;", "<unused var>", "Lk10/c0;", "Lmx1/b$a;", "state", "Lk10/l;", "Lmx1/b;", "<anonymous>", "(Lmx1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<mx1.a.d, k10.c0<mx1.b.AddFile>, tq.e<? super k10.l<? extends mx1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k10.z<mx1.b.AddFile, mx1.b, mx1.a> f129259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u f129260h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k10.z<mx1.b.AddFile, mx1.b, mx1.a> zVar, u uVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f129259g = zVar;
            this.f129260h = uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.FilePreview V(wx.i.Regular regular, mx1.b.AddFile addFile) {
            return new mx1.b.FilePreview(regular);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.AddFile X(mx1.b.AddFile addFile) {
            return mx1.b.AddFile.b(addFile, null, true, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            k10.c0 c0Var = (k10.c0) this.f129258f;
            uq.b.e();
            if (this.f129257e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final wx.i.Regular pickedFile = ((mx1.b.AddFile) c0Var.a()).getPickedFile();
            if (pickedFile != null && (lVarD = c0Var.d(new er.l() { // from class: mx1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.V(pickedFile, (b.AddFile) obj2);
                }
            })) != null) {
                return lVarD;
            }
            u uVar = this.f129260h;
            uVar.accessibilityTalkBackManager.a(uVar.labelProvider.c(j0.f120745k).getText());
            return c0Var.b(new er.l() { // from class: mx1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.X((b.AddFile) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.d dVar, k10.c0<mx1.b.AddFile> c0Var, tq.e<? super k10.l<? extends mx1.b>> eVar) {
            e eVar2 = new e(this.f129259g, this.f129260h, eVar);
            eVar2.f129258f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx1/a$e;", "<unused var>", "Lk10/c0;", "Lmx1/b$a;", "state", "Lk10/l;", "Lmx1/b;", "<anonymous>", "(Lmx1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mx1.a.e, k10.c0<mx1.b.AddFile>, tq.e<? super k10.l<? extends mx1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129262f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.AddFile O(mx1.b.AddFile addFile) {
            return addFile.a(null, false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f129262f;
            uq.b.e();
            if (this.f129261e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mx1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O((b.AddFile) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.e eVar, k10.c0<mx1.b.AddFile> c0Var, tq.e<? super k10.l<? extends mx1.b>> eVar2) {
            f fVar = new f(eVar2);
            fVar.f129262f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx1/a$a;", "<unused var>", "Lk10/c0;", "Lmx1/b$a;", "state", "Lk10/l;", "Lmx1/b;", "<anonymous>", "(Lmx1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mx1.a.C3207a, k10.c0<mx1.b.AddFile>, tq.e<? super k10.l<? extends mx1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f129265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129266h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129267j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f129268k;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.AddFile O(bc4.h.Result result, mx1.b.AddFile addFile) {
            return addFile.a(result.getFile(), false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
        
            if (r2.A9(r4, r11) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f129268k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f129267j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r1 = r11.f129264f
                dx.b r1 = (dx.b) r1
                java.lang.Object r1 = r11.f129263e
                dx.i r1 = (dx.i) r1
                oq.u.b(r12)
                goto L7d
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                oq.u.b(r12)
                goto L50
            L2a:
                oq.u.b(r12)
                mx1.u r12 = mx1.u.this
                bc4.h r12 = mx1.u.s9(r12)
                bc4.h$a r5 = new bc4.h$a
                wx.f r2 = wx.f.PDF
                java.util.List r6 = pq.v.e(r2)
                float r7 = mx1.g0.b()
                r9 = 4
                r10 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r11.f129268k = r0
                r11.f129267j = r4
                java.lang.Object r12 = r12.c(r5, r11)
                if (r12 != r1) goto L50
                goto L7c
            L50:
                dx.i r12 = (dx.i) r12
                mx1.u r2 = mx1.u.this
                boolean r4 = r12 instanceof dx.i.Left
                if (r4 == 0) goto L82
                r4 = r12
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                r11.f129268k = r0
                java.lang.Object r12 = vq.j.a(r12)
                r11.f129263e = r12
                java.lang.Object r12 = vq.j.a(r4)
                r11.f129264f = r12
                r12 = 0
                r11.f129265g = r12
                r11.f129266h = r12
                r11.f129267j = r3
                java.lang.Object r12 = mx1.u.v9(r2, r4, r11)
                if (r12 != r1) goto L7d
            L7c:
                return r1
            L7d:
                k10.l r12 = r0.c()
                return r12
            L82:
                boolean r1 = r12 instanceof dx.i.Right
                if (r1 == 0) goto Lad
                dx.i$c r12 = (dx.i.Right) r12
                java.lang.Object r12 = r12.b()
                bc4.h$b r12 = (bc4.h.Result) r12
                yw.b r1 = mx1.u.o9(r2)
                c70.a r2 = c70.a.f23835a
                yw.a r2 = r2.a()
                mx.a r2 = r2.q0()
                java.lang.String r2 = r2.getText()
                r1.a(r2)
                mx1.z r1 = new mx1.z
                r1.<init>()
                k10.l r12 = r0.b(r1)
                return r12
            Lad:
                oq.p r12 = new oq.p
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mx1.u.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.C3207a c3207a, k10.c0<mx1.b.AddFile> c0Var, tq.e<? super k10.l<? extends mx1.b>> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f129268k = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx1/a$b;", "<unused var>", "Lk10/c0;", "Lmx1/b$c;", "state", "Lk10/l;", "Lmx1/b;", "<anonymous>", "(Lmx1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mx1.a.b, k10.c0<mx1.b.FilePreview>, tq.e<? super k10.l<? extends mx1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129271f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.AddFile O(k10.c0 c0Var, mx1.b.FilePreview filePreview) {
            return new mx1.b.AddFile(((mx1.b.FilePreview) c0Var.a()).getPickedFile(), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f129271f;
            uq.b.e();
            if (this.f129270e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mx1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(c0Var, (b.FilePreview) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.b bVar, k10.c0<mx1.b.FilePreview> c0Var, tq.e<? super k10.l<? extends mx1.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f129271f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx1/a$f;", "<unused var>", "Lmx1/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lmx1/a$f;Lmx1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mx1.a.f, mx1.b.FilePreview, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129273f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mx1.b.FilePreview filePreview = (mx1.b.FilePreview) this.f129273f;
            Object objE = uq.b.e();
            int i15 = this.f129272e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mx1.a.g> bVarY1 = u.this.Y1();
                mx1.a.g.GoToNextScreen goToNextScreen = new mx1.a.g.GoToNextScreen(wx.j.a(filePreview.getPickedFile()), filePreview.getPickedFile().getFileContent().getBytes());
                this.f129273f = vq.j.a(filePreview);
                this.f129272e = 1;
                if (bVarY1.F(goToNextScreen, this) == objE) {
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
        public final Object w(mx1.a.f fVar, mx1.b.FilePreview filePreview, tq.e<? super i0> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f129273f = filePreview;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx1/a$h;", "<unused var>", "Lk10/c0;", "Lmx1/b$c;", "state", "Lk10/l;", "Lmx1/b;", "<anonymous>", "(Lmx1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<mx1.a.h, k10.c0<mx1.b.FilePreview>, tq.e<? super k10.l<? extends mx1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129276f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.Error O(k10.c0 c0Var, u uVar, dx.b.Business business, mx1.b.FilePreview filePreview) {
            return new mx1.b.Error(((mx1.b.FilePreview) c0Var.a()).getPickedFile(), uVar.errorVMSFactory.a(uVar.y9(business)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f129276f;
            Object objE = uq.b.e();
            int i15 = this.f129275e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.n nVar = u.this.openUriIntentUseCase;
                ac4.n.Params params = new ac4.n.Params(((mx1.b.FilePreview) c0Var.a()).getPickedFile().getMetadata().getUri());
                this.f129276f = c0Var;
                this.f129275e = 1;
                obj = nVar.c(params, this);
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
            final u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: mx1.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.j.O(c0Var, uVar, business, (b.FilePreview) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.h hVar, k10.c0<mx1.b.FilePreview> c0Var, tq.e<? super k10.l<? extends mx1.b>> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f129276f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx1/a$c;", "<unused var>", "Lk10/c0;", "Lmx1/b$b;", "state", "Lk10/l;", "Lmx1/b;", "<anonymous>", "(Lmx1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<mx1.a.c, k10.c0<mx1.b.Error>, tq.e<? super k10.l<? extends mx1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129279f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx1.b.FilePreview O(k10.c0 c0Var, mx1.b.Error error) {
            return new mx1.b.FilePreview(((mx1.b.Error) c0Var.a()).getPickedFile());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f129279f;
            uq.b.e();
            if (this.f129278e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mx1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O(c0Var, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx1.a.c cVar, k10.c0<mx1.b.Error> c0Var, tq.e<? super k10.l<? extends mx1.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f129279f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, nx1.a aVar2, ib4.c cVar, ac4.n nVar, bc4.h hVar, xw1.c cVar2, yw.b bVar, mx.c cVar3, hb4.d dVar) {
        this.mapper = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.openUriIntentUseCase = nVar;
        this.pickFileUseCase = hVar;
        this.processInterruptDialogMapper = cVar2;
        this.accessibilityTalkBackManager = bVar;
        this.labelProvider = cVar3;
        this.errorVMSFactory = dVar;
        mx1.b.AddFile addFile = new mx1.b.AddFile(null, false, 3, null);
        this.initialState = addFile;
        this.stateMachine = aVar.a(addFile, new er.l() { // from class: mx1.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f129222a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), B9(addFile));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(dx.b bVar, tq.e<? super i0> eVar) {
        DialogData dialogDataI9;
        if (!(bVar instanceof dx.b.Business) || ((dx.b.Business) bVar).getType() == zb4.b.NO_FILE_PICKED) {
            bVar = null;
        }
        if (bVar == null || (dialogDataI9 = I9((dx.b.Business) bVar)) == null) {
            return null;
        }
        Object objF = F(new mx1.a.g.ShowDialog(dialogDataI9), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mx1.c.a B9(mx1.b state) {
        nx1.a aVar = this.mapper;
        er.a<i0> aVarB9 = b9(mx1.a.i.f129178a);
        er.a<i0> aVarB10 = b9(mx1.a.d.f129169a);
        er.a<i0> aVarB11 = b9(mx1.a.b.f129167a);
        er.a<i0> aVarB12 = b9(mx1.a.C3207a.f129166a);
        er.a<i0> aVarB13 = b9(mx1.a.f.f129171a);
        return aVar.b(new nx1.a.Params(state, aVarB11, aVarB9, aVarB10, aVarB12, b9(mx1.a.h.f129177a), b9(mx1.a.e.f129170a), aVarB13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(mx1.b.class), new er.l() { // from class: mx1.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f129223a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx1.b.AddFile.class), new er.l() { // from class: mx1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f129224a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx1.b.FilePreview.class), new er.l() { // from class: mx1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f129225a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx1.b.Error.class), new er.l() { // from class: mx1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mx1.a.c.class), oVar, bVar);
        zVar.x(q0.c(mx1.a.i.class), oVar, uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, k10.z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mx1.a.b.class), oVar, dVar);
        zVar.v(q0.c(mx1.a.d.class), oVar, new e(zVar, uVar, null));
        zVar.v(q0.c(mx1.a.e.class), oVar, new f(null));
        zVar.v(q0.c(mx1.a.C3207a.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(u uVar, k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(mx1.a.b.class), oVar, hVar);
        zVar.x(q0.c(mx1.a.f.class), oVar, uVar.new i(null));
        zVar.v(q0.c(mx1.a.h.class), oVar, uVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(k10.z zVar) {
        k kVar = new k(null);
        zVar.v(q0.c(mx1.a.c.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    private final DialogData I9(dx.b.Business business) {
        return new DialogData(cb4.h.b.f24985a, business.getTitle(), business.getMessage(), new DialogButtonTextData(business.getPrimaryActionLabel(), null, new er.a() { // from class: mx1.s
            @Override // er.a
            public final Object a() {
                return u.J9();
            }
        }, 2, null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b y9(dx.b bVar) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: mx1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.z9(this.f129226a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(u uVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.AbstractC2161b.a)) {
                throw new oq.p();
            }
            uVar.d9(mx1.a.c.f129168a);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<mx1.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mx1.b, mx1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mx1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(mx1.a.g gVar, tq.e<? super i0> eVar) {
        return super.F(gVar, eVar);
    }
}
