package z21;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wv0.VehicleInsuranceVerificationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lz21/t;", "Ll00/g;", "Lz21/f;", "Lz21/e;", "Lz21/g;", "", "Lyy/a;", "stateMachineFactory", "Lc31/e;", "mapper", "Lc31/a;", "fileAccessPermissionDialogMapper", "La14/d;", "copyToClipboardUseCase", "Lv21/a;", "interactor", "La14/y;", "requestPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "Lmx/c;", "labelProvider", "Li70/e;", "globalSnackBarManager", "Lwv0/f;", "insuranceData", "<init>", "(Lyy/a;Lc31/e;Lc31/a;La14/d;Lv21/a;La14/y;La14/m;Lcb4/j;Lmx/c;Li70/e;Lwv0/f;)V", "state", "Lz21/g$a;", "v9", "(Lz21/f;)Lz21/g$a;", "b", "Lc31/e;", "c", "Lc31/a;", "d", "La14/d;", "e", "Lv21/a;", "f", "La14/y;", "g", "La14/m;", "h", "Lcb4/j;", "j", "Lmx/c;", "k", "Li70/e;", "l", "Lwv0/f;", "Lz21/f$b;", "m", "Lz21/f$b;", "initialState", "Lxw/b;", "Lz21/e$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<z21.f, z21.e> implements z21.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c31.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c31.a fileAccessPermissionDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v21.a interactor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final VehicleInsuranceVerificationData insuranceData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z21.f.Initialized initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<z21.e.a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<z21.f, z21.e> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<z21.g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<z21.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f232420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f232421b;

        /* JADX INFO: renamed from: z21.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6239a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f232422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f232423b;

            /* JADX INFO: renamed from: z21.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6240a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f232424d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f232425e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f232426f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f232428h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f232429j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f232430k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f232431l;

                public C6240a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f232424d = obj;
                    this.f232425e |= PKIFailureInfo.systemUnavail;
                    return C6239a.this.F(null, this);
                }
            }

            public C6239a(mu.h hVar, t tVar) {
                this.f232422a = hVar;
                this.f232423b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6240a c6240a;
                if (eVar instanceof C6240a) {
                    c6240a = (C6240a) eVar;
                    int i15 = c6240a.f232425e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6240a.f232425e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6240a = new C6240a(eVar);
                    }
                } else {
                    c6240a = new C6240a(eVar);
                }
                Object obj2 = c6240a.f232424d;
                Object objE = uq.b.e();
                int i16 = c6240a.f232425e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f232422a;
                    z21.g.Data dataV9 = this.f232423b.v9((z21.f) obj);
                    c6240a.f232426f = vq.j.a(obj);
                    c6240a.f232428h = vq.j.a(c6240a);
                    c6240a.f232429j = vq.j.a(obj);
                    c6240a.f232430k = vq.j.a(hVar);
                    c6240a.f232431l = 0;
                    c6240a.f232425e = 1;
                    if (hVar.F(dataV9, c6240a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f232420a = gVar;
            this.f232421b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super z21.g.Data> hVar, tq.e eVar) {
            Object objA = this.f232420a.a(new C6239a(hVar, this.f232421b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz21/e$b;", "<unused var>", "Lz21/f$b;", "Loq/i0;", "<anonymous>", "(Lz21/e$b;Lz21/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<z21.e.b, z21.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232432e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232432e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                z21.e.a.C6234a c6234a = z21.e.a.C6234a.f232361a;
                this.f232432e = 1;
                if (tVar.F(c6234a, this) == objE) {
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
        public final Object w(z21.e.b bVar, z21.f.Initialized initialized, tq.e<? super i0> eVar) {
            return t.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz21/e$c;", "action", "Lz21/f$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz21/e$c;Lz21/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<z21.e.OnCopyToClipboard, z21.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232435f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z21.e.OnCopyToClipboard onCopyToClipboard = (z21.e.OnCopyToClipboard) this.f232435f;
            Object objE = uq.b.e();
            int i15 = this.f232434e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d dVar = t.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(onCopyToClipboard.getValue(), onCopyToClipboard.getMessage());
                this.f232435f = vq.j.a(onCopyToClipboard);
                this.f232434e = 1;
                if (dVar.c(params, this) == objE) {
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
        public final Object w(z21.e.OnCopyToClipboard onCopyToClipboard, z21.f.Initialized initialized, tq.e<? super i0> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f232435f = onCopyToClipboard;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz21/e$e;", "action", "Lz21/f$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz21/e$e;Lz21/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<z21.e.OnMoreInfo, z21.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232438f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z21.e.OnMoreInfo onMoreInfo = (z21.e.OnMoreInfo) this.f232438f;
            Object objE = uq.b.e();
            int i15 = this.f232437e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                z21.e.a.MoreInfo moreInfo = new z21.e.a.MoreInfo(onMoreInfo.getInfoPageType());
                this.f232438f = vq.j.a(onMoreInfo);
                this.f232437e = 1;
                if (tVar.F(moreInfo, this) == objE) {
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
        public final Object w(z21.e.OnMoreInfo onMoreInfo, z21.f.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f232438f = onMoreInfo;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz21/e$d;", "<unused var>", "Lk10/c0;", "Lz21/f$b;", "state", "Lk10/l;", "Lz21/f;", "<anonymous>", "(Lz21/e$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<z21.e.d, c0<z21.f.Initialized>, tq.e<? super k10.l<? extends z21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f232440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f232441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f232442g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z21.f.Dialog O(t tVar, c0 c0Var, z21.f.Initialized initialized) {
            return new z21.f.Dialog(tVar.dialogVMSFactory.a(tVar.fileAccessPermissionDialogMapper.b(new c31.a.Params(tVar.b9(z21.d.f232360a), tVar.b9(z21.c.f232359a)))), ((z21.f.Initialized) c0Var.a()).getInsuranceData());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        
            if (r2.F(r4, r6) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f232442g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f232441f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r6.f232440e
                u04.c r1 = (u04.c) r1
                oq.u.b(r7)
                goto L71
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L41
            L26:
                oq.u.b(r7)
                z21.t r7 = z21.t.this
                a14.y r7 = z21.t.s9(r7)
                a14.y$a r2 = new a14.y$a
                gy.d r5 = gy.d.EXTERNAL_STORAGE
                r2.<init>(r5)
                r6.f232442g = r0
                r6.f232441f = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L41
                goto L70
            L41:
                u04.c r7 = (u04.c) r7
                u04.c$a r2 = u04.c.a.f194071a
                boolean r2 = fr.t.c(r7, r2)
                if (r2 == 0) goto L76
                z21.t r2 = z21.t.this
                z21.e$a$b r4 = new z21.e$a$b
                java.lang.Object r5 = r0.a()
                z21.f$b r5 = (z21.f.Initialized) r5
                wv0.f r5 = r5.getInsuranceData()
                java.lang.String r5 = r5.getQueryUuid()
                r4.<init>(r5)
                r6.f232442g = r0
                java.lang.Object r7 = vq.j.a(r7)
                r6.f232440e = r7
                r6.f232441f = r3
                java.lang.Object r7 = r2.F(r4, r6)
                if (r7 != r1) goto L71
            L70:
                return r1
            L71:
                k10.l r7 = r0.c()
                return r7
            L76:
                boolean r7 = r7 instanceof u04.c.b
                if (r7 == 0) goto L86
                z21.t r7 = z21.t.this
                z21.u r1 = new z21.u
                r1.<init>()
                k10.l r7 = r0.d(r1)
                return r7
            L86:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: z21.t.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(z21.e.d dVar, c0<z21.f.Initialized> c0Var, tq.e<? super k10.l<? extends z21.f>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f232442g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz21/c;", "<unused var>", "Lk10/c0;", "Lz21/f$a;", "state", "Lk10/l;", "Lz21/f;", "<anonymous>", "(Lz21/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<z21.c, c0<z21.f.Dialog>, tq.e<? super k10.l<? extends z21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232445f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z21.f.Initialized O(z21.f.Dialog dialog) {
            return new z21.f.Initialized(dialog.getInsuranceData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f232445f;
            uq.b.e();
            if (this.f232444e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z21.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O((f.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(z21.c cVar, c0<z21.f.Dialog> c0Var, tq.e<? super k10.l<? extends z21.f>> eVar) {
            f fVar = new f(eVar);
            fVar.f232445f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz21/d;", "<unused var>", "Lk10/c0;", "Lz21/f$a;", "state", "Lk10/l;", "Lz21/f;", "<anonymous>", "(Lz21/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<z21.d, c0<z21.f.Dialog>, tq.e<? super k10.l<? extends z21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232447f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z21.f.Initialized O(c0 c0Var, z21.f.Dialog dialog) {
            return new z21.f.Initialized(((z21.f.Dialog) c0Var.a()).getInsuranceData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f232447f;
            uq.b.e();
            if (this.f232446e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = t.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            t tVar = t.this;
            if (iVarA instanceof dx.i.Left) {
                tVar.globalSnackBarManager.y(new p50.a.Default(tVar.labelProvider.c(t21.a.f187176n0), false, null, 6, null));
            }
            return c0Var.d(new er.l() { // from class: z21.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(c0Var, (f.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(z21.d dVar, c0<z21.f.Dialog> c0Var, tq.e<? super k10.l<? extends z21.f>> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f232447f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, c31.e eVar, c31.a aVar2, a14.d dVar, v21.a aVar3, a14.y yVar, a14.m mVar, cb4.j jVar, mx.c cVar, i70.e eVar2, VehicleInsuranceVerificationData vehicleInsuranceVerificationData) {
        this.mapper = eVar;
        this.fileAccessPermissionDialogMapper = aVar2;
        this.copyToClipboardUseCase = dVar;
        this.interactor = aVar3;
        this.requestPermissionUseCase = yVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.labelProvider = cVar;
        this.globalSnackBarManager = eVar2;
        this.insuranceData = vehicleInsuranceVerificationData;
        z21.f.Initialized initialized = new z21.f.Initialized(vehicleInsuranceVerificationData);
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: z21.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f232405a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), v9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(z21.e.b.class), oVar, bVar);
        zVar.x(q0.c(z21.e.OnCopyToClipboard.class), oVar, tVar.new c(null));
        zVar.x(q0.c(z21.e.OnMoreInfo.class), oVar, tVar.new d(null));
        zVar.v(q0.c(z21.e.d.class), oVar, tVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(z21.c.class), oVar, fVar);
        zVar.v(q0.c(z21.d.class), oVar, tVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z21.g.Data v9(z21.f state) {
        return this.mapper.b(new c31.e.Params(state, b9(z21.e.b.f232364a), new er.l() { // from class: z21.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f232403a, (String) obj);
            }
        }, new er.l() { // from class: z21.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f232404a, (f31.a) obj);
            }
        }, b9(z21.e.d.f232367a), this.interactor.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(t tVar, String str) {
        tVar.d9(new z21.e.OnCopyToClipboard(str, tVar.mapper.v()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, f31.a aVar) {
        tVar.d9(new z21.e.OnMoreInfo(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(z21.f.Initialized.class), new er.l() { // from class: z21.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f232401a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(z21.f.Dialog.class), new er.l() { // from class: z21.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f232402a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<z21.e.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<z21.f, z21.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<z21.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(z21.e.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(VehicleInsuranceVerificationData vehicleInsuranceVerificationData) {
        super.P5(vehicleInsuranceVerificationData);
    }
}
