package x90;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bw\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030/H\u0096\u0001¢\u0006\u0004\b4\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010V\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\\\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030]8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006h"}, d2 = {"Lx90/t;", "Ll00/g;", "Lx90/b;", "Lx90/a;", "Lx90/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Ly90/j;", "mapper", "Lu04/a;", "commonEndpoints", "Lsz/d;", "cameraScannerPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "La14/w;", "openUrlIntentUseCase", "La14/x;", "requestCameraPermissionUseCase", "La14/b;", "checkCameraPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Loz/q;", "ownerViewLifecycleManager", "Ly90/c;", "qrScannerErrorMapper", "Ls90/c;", "validateQrCodeUC", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Ly90/j;Lu04/a;Lsz/d;Lac4/r;La14/w;La14/x;La14/b;La14/m;Loz/q;Ly90/c;Ls90/c;Lhb4/d;)V", "Ly90/c$b;", "Ljb4/b;", "v9", "(Ly90/c$b;)Ljb4/b;", "state", "Lx90/c$a;", "x9", "(Lx90/b;)Lx90/c$a;", "Lx90/b$b;", "w9", "()Lx90/b$b;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Ly90/j;", "c", "Lu04/a;", "d", "Lsz/d;", "e", "Lac4/r;", "f", "La14/w;", "g", "La14/x;", "h", "La14/b;", "j", "La14/m;", "k", "Loz/q;", "l", "Ly90/c;", "m", "Ls90/c;", "n", "Lhb4/d;", "p", "Lx90/b$b;", "initialState", "Lxw/b;", "Lx90/a$d;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Loz/j;", "r", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<x90.b, x90.a> implements x90.c, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y90.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sz.d cameraScannerPreviewViewConnector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.b checkCameraPermissionUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final y90.c qrScannerErrorMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final s90.c validateQrCodeUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final x90.b.ScannerQrCode initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x90.a.d> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<x90.b, x90.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<x90.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<x90.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f217530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f217531b;

        /* JADX INFO: renamed from: x90.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5807a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f217532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f217533b;

            /* JADX INFO: renamed from: x90.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5808a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f217534d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f217535e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f217536f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f217538h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f217539j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f217540k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f217541l;

                public C5808a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f217534d = obj;
                    this.f217535e |= PKIFailureInfo.systemUnavail;
                    return C5807a.this.F(null, this);
                }
            }

            public C5807a(mu.h hVar, t tVar) {
                this.f217532a = hVar;
                this.f217533b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5808a c5808a;
                if (eVar instanceof C5808a) {
                    c5808a = (C5808a) eVar;
                    int i15 = c5808a.f217535e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5808a.f217535e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5808a = new C5808a(eVar);
                    }
                } else {
                    c5808a = new C5808a(eVar);
                }
                Object obj2 = c5808a.f217534d;
                Object objE = uq.b.e();
                int i16 = c5808a.f217535e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f217532a;
                    x90.c.a aVarX9 = this.f217533b.x9((x90.b) obj);
                    c5808a.f217536f = vq.j.a(obj);
                    c5808a.f217538h = vq.j.a(c5808a);
                    c5808a.f217539j = vq.j.a(obj);
                    c5808a.f217540k = vq.j.a(hVar);
                    c5808a.f217541l = 0;
                    c5808a.f217535e = 1;
                    if (hVar.F(aVarX9, c5808a) == objE) {
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
            this.f217530a = gVar;
            this.f217531b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super x90.c.a> hVar, tq.e eVar) {
            Object objA = this.f217530a.a(new C5807a(hVar, this.f217531b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx90/a$b;", "<unused var>", "Lx90/b;", "Loq/i0;", "<anonymous>", "(Lx90/a$b;Lx90/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<x90.a.b, x90.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217542e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217542e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x90.a.d> bVarY1 = t.this.Y1();
                x90.a.d.C5804a c5804a = x90.a.d.C5804a.f217441a;
                this.f217542e = 1;
                if (bVarY1.F(c5804a, this) == objE) {
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
        public final Object w(x90.a.b bVar, x90.b bVar2, tq.e<? super i0> eVar) {
            return t.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx90/a$h;", "action", "Lx90/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx90/a$h;Lx90/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<x90.a.OpenLink, x90.b.ScannerQrCode, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217545f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x90.a.OpenLink openLink = (x90.a.OpenLink) this.f217545f;
            Object objE = uq.b.e();
            int i15 = this.f217544e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = t.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openLink.getUrl(), false, 2, null);
                this.f217545f = vq.j.a(openLink);
                this.f217544e = 1;
                obj = wVar.c(params, this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.v9(new y90.c.b.GeneralError((dx.b.Business) ((dx.i.Left) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.OpenLink openLink, x90.b.ScannerQrCode scannerQrCode, tq.e<? super i0> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f217545f = openLink;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx90/a$c;", "<unused var>", "Lx90/b$b;", "Loq/i0;", "<anonymous>", "(Lx90/a$c;Lx90/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<x90.a.c, x90.b.ScannerQrCode, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217547e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f217547e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = t.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            t tVar = t.this;
            if (iVarA instanceof dx.i.Left) {
                tVar.v9(new y90.c.b.GeneralError((dx.b.Business) ((dx.i.Left) iVarA).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.c cVar, x90.b.ScannerQrCode scannerQrCode, tq.e<? super i0> eVar) {
            return t.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx90/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx90/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<x90.b.ScannerQrCode, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217549e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f217549e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(x90.a.i.f217450a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(x90.b.ScannerQrCode scannerQrCode, tq.e<? super i0> eVar) {
            return ((e) v(scannerQrCode, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lx90/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lx90/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nx.a, x90.b.ScannerQrCode, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217552f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f217552f;
            uq.b.e();
            if (this.f217551e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                t.this.d9(x90.a.C5803a.f217438a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, x90.b.ScannerQrCode scannerQrCode, tq.e<? super i0> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f217552f = aVar;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx90/a$i;", "<unused var>", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Lx90/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<x90.a.i, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217555f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.ScannerQrCode O(boolean z15, x90.b.ScannerQrCode scannerQrCode) {
            return x90.b.ScannerQrCode.b(scannerQrCode, false, null, null, z15, null, null, null, 119, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f217555f;
            Object objE = uq.b.e();
            int i15 = this.f217554e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = t.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f217555f = c0Var;
                this.f217554e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zC = fr.t.c(obj, u04.c.a.f194071a);
            return c0Var.b(new er.l() { // from class: x90.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(zC, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.i iVar, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f217555f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx90/a$a;", "<unused var>", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Lx90/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<x90.a.C5803a, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217558f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.ScannerQrCode O(boolean z15, x90.b.ScannerQrCode scannerQrCode) {
            return x90.b.ScannerQrCode.b(scannerQrCode, false, null, null, z15, null, null, null, 119, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f217558f;
            Object objE = uq.b.e();
            int i15 = this.f217557e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.b bVar = t.this.checkCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f217558f = c0Var;
                this.f217557e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zC = fr.t.c(obj, gy.c.a.f78236a);
            return c0Var.b(new er.l() { // from class: x90.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O(zC, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.C5803a c5803a, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f217558f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx90/a$j;", "action", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Lx90/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<x90.a.UpdateBottomSheetState, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217562g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.ScannerQrCode O(x90.a.UpdateBottomSheetState updateBottomSheetState, x90.b.ScannerQrCode scannerQrCode) {
            return x90.b.ScannerQrCode.b(scannerQrCode, updateBottomSheetState.getVisibility(), null, null, false, null, null, null, 126, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final x90.a.UpdateBottomSheetState updateBottomSheetState = (x90.a.UpdateBottomSheetState) this.f217561f;
            k10.c0 c0Var = (k10.c0) this.f217562g;
            uq.b.e();
            if (this.f217560e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: x90.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i.O(updateBottomSheetState, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.UpdateBottomSheetState updateBottomSheetState, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f217561f = updateBottomSheetState;
            iVar.f217562g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx90/a$e;", "action", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Lx90/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<x90.a.OnCodeChange, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217565g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.ScannerQrCode O(x90.a.OnCodeChange onCodeChange, x90.b.ScannerQrCode scannerQrCode) {
            return x90.b.ScannerQrCode.b(scannerQrCode, false, onCodeChange.getCode(), hz.b.C2039b.f86846c, false, null, null, null, 121, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final x90.a.OnCodeChange onCodeChange = (x90.a.OnCodeChange) this.f217564f;
            k10.c0 c0Var = (k10.c0) this.f217565g;
            uq.b.e();
            if (this.f217563e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: x90.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.j.O(onCodeChange, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.OnCodeChange onCodeChange, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f217564f = onCodeChange;
            jVar.f217565g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx90/a$f;", "<unused var>", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Lx90/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<x90.a.f, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f217566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f217567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f217568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f217569h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f217570j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f217571k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f217572l;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.ScannerQrCode O(hz.b bVar, x90.b.ScannerQrCode scannerQrCode) {
            return x90.b.ScannerQrCode.b(scannerQrCode, false, null, bVar, false, null, null, null, 123, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f217572l;
            Object objE = uq.b.e();
            int i15 = this.f217571k;
            if (i15 == 0) {
                oq.u.b(obj);
                s90.c cVar = t.this.validateQrCodeUC;
                s90.c.Params params = new s90.c.Params(((x90.b.ScannerQrCode) c0Var.a()).getCode());
                this.f217572l = c0Var;
                this.f217571k = 1;
                obj = cVar.h(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f217568g;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            hz.g gVar = (hz.g) obj;
            final hz.b bVarA = hz.b.INSTANCE.a(gVar);
            k10.l lVarB = c0Var.b(new er.l() { // from class: x90.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.k.O(bVarA, (b.ScannerQrCode) obj2);
                }
            });
            t tVar = t.this;
            if (bVarA.a()) {
                xw.b<x90.a.d> bVarY1 = tVar.Y1();
                x90.a.d.GoToNextStep goToNextStep = new x90.a.d.GoToNextStep(((x90.b.ScannerQrCode) c0Var.a()).getCode());
                this.f217572l = vq.j.a(c0Var);
                this.f217566e = vq.j.a(gVar);
                this.f217567f = vq.j.a(bVarA);
                this.f217568g = lVarB;
                this.f217569h = vq.j.a(lVarB);
                this.f217570j = 0;
                this.f217571k = 2;
                if (bVarY1.F(goToNextStep, this) == objE) {
                    return objE;
                }
            }
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.f fVar, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            k kVar = t.this.new k(eVar);
            kVar.f217572l = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ldx/i;", "Ldx/b;", "", "action", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Ldx/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217576g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.Error O(t tVar, dx.b bVar, x90.b.ScannerQrCode scannerQrCode) {
            return new x90.b.Error(tVar.errorVMSFactory.a(tVar.v9(new y90.c.b.GeneralError(bVar))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f217575f;
            k10.c0 c0Var = (k10.c0) this.f217576g;
            uq.b.e();
            if (this.f217574e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: x90.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.l.O(tVar, bVar, (b.ScannerQrCode) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            tVar.d9(new x90.a.OnScannedQrCode(iy.c0.g((String) ((dx.i.Right) iVar).b())));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            l lVar = t.this.new l(eVar);
            lVar.f217575f = iVar;
            lVar.f217576g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx90/a$g;", "action", "Lk10/c0;", "Lx90/b$b;", "state", "Lk10/l;", "Lx90/b;", "<anonymous>", "(Lx90/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<x90.a.OnScannedQrCode, k10.c0<x90.b.ScannerQrCode>, tq.e<? super k10.l<? extends x90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f217578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f217579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f217580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f217581h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f217582j;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.ScannerQrCode V(x90.a.OnScannedQrCode onScannedQrCode, x90.b.ScannerQrCode scannerQrCode) {
            return x90.b.ScannerQrCode.b(scannerQrCode, false, null, null, false, null, onScannedQrCode.getCode(), null, 95, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x90.b.Error X(t tVar, x90.b.ScannerQrCode scannerQrCode) {
            return new x90.b.Error(tVar.errorVMSFactory.a(tVar.v9(y90.c.b.C6042b.f225583a)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
        
            if (r5.F(r6, r8) == r2) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f217581h
                x90.a$g r0 = (x90.a.OnScannedQrCode) r0
                java.lang.Object r1 = r8.f217582j
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f217580g
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2f
                if (r3 == r5) goto L2b
                if (r3 != r4) goto L23
                java.lang.Object r2 = r8.f217579f
                hz.b r2 = (hz.b) r2
                java.lang.Object r2 = r8.f217578e
                hz.g r2 = (hz.g) r2
                oq.u.b(r9)
                goto L98
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                oq.u.b(r9)
                goto L62
            L2f:
                oq.u.b(r9)
                iy.b0 r9 = r0.getCode()
                java.lang.Object r3 = r1.a()
                x90.b$b r3 = (x90.b.ScannerQrCode) r3
                iy.b0 r3 = r3.getLastScannedCode()
                boolean r9 = fr.t.c(r9, r3)
                if (r9 != 0) goto Lb6
                x90.t r9 = x90.t.this
                s90.c r9 = x90.t.s9(r9)
                s90.c$c r3 = new s90.c$c
                iy.b0 r6 = r0.getCode()
                r3.<init>(r6)
                r8.f217581h = r0
                r8.f217582j = r1
                r8.f217580g = r5
                java.lang.Object r9 = r9.h(r3, r8)
                if (r9 != r2) goto L62
                goto L97
            L62:
                hz.g r9 = (hz.g) r9
                hz.b$a r3 = hz.b.INSTANCE
                hz.b r3 = r3.a(r9)
                boolean r6 = r3.a()
                if (r6 != r5) goto La2
                x90.t r5 = x90.t.this
                xw.b r5 = r5.Y1()
                x90.a$d$b r6 = new x90.a$d$b
                iy.b0 r7 = r0.getCode()
                r6.<init>(r7)
                r8.f217581h = r0
                r8.f217582j = r1
                java.lang.Object r9 = vq.j.a(r9)
                r8.f217578e = r9
                java.lang.Object r9 = vq.j.a(r3)
                r8.f217579f = r9
                r8.f217580g = r4
                java.lang.Object r9 = r5.F(r6, r8)
                if (r9 != r2) goto L98
            L97:
                return r2
            L98:
                x90.a0 r9 = new x90.a0
                r9.<init>()
                k10.l r9 = r1.b(r9)
                return r9
            La2:
                if (r6 != 0) goto Lb0
                x90.t r9 = x90.t.this
                x90.b0 r0 = new x90.b0
                r0.<init>()
                k10.l r9 = r1.d(r0)
                return r9
            Lb0:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            Lb6:
                k10.l r9 = r1.c()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x90.t.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(x90.a.OnScannedQrCode onScannedQrCode, k10.c0<x90.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends x90.b>> eVar) {
            m mVar = t.this.new m(eVar);
            mVar.f217581h = onScannedQrCode;
            mVar.f217582j = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, y90.j jVar, u04.a aVar2, sz.d dVar, ac4.r<String> rVar, a14.w wVar, a14.x xVar, a14.b bVar, a14.m mVar, oz.q qVar, y90.c cVar, s90.c cVar2, hb4.d dVar2) {
        this.mapper = jVar;
        this.commonEndpoints = aVar2;
        this.cameraScannerPreviewViewConnector = dVar;
        this.scanCameraUseCase = rVar;
        this.openUrlIntentUseCase = wVar;
        this.requestCameraPermissionUseCase = xVar;
        this.checkCameraPermissionUseCase = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.ownerViewLifecycleManager = qVar;
        this.qrScannerErrorMapper = cVar;
        this.validateQrCodeUC = cVar2;
        this.errorVMSFactory = dVar2;
        x90.b.ScannerQrCode scannerQrCodeW9 = w9();
        this.initialState = scannerQrCodeW9;
        this.navAction = new xw.b<>();
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(scannerQrCodeW9, new er.l() { // from class: x90.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f217507a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(scannerQrCodeW9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(t tVar, String str) {
        tVar.d9(new x90.a.OpenLink(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(x90.b.class), new er.l() { // from class: x90.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.D9(this.f217508a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(x90.b.ScannerQrCode.class), new er.l() { // from class: x90.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f217509a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        zVar.x(q0.c(x90.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(t tVar, k10.z zVar) {
        zVar.C(tVar.new e(null));
        k10.k.s(zVar, tVar.x8(), null, tVar.new f(null), 2, null);
        g gVar = tVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(x90.a.i.class), oVar, gVar);
        zVar.v(q0.c(x90.a.C5803a.class), oVar, tVar.new h(null));
        zVar.v(q0.c(x90.a.UpdateBottomSheetState.class), oVar, new i(null));
        zVar.v(q0.c(x90.a.OnCodeChange.class), oVar, new j(null));
        zVar.v(q0.c(x90.a.f.class), oVar, tVar.new k(null));
        k10.k.m(zVar, (mu.g) tVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.SingleQrScanner(null, 1, null), 2, null)), null, tVar.new l(null), 2, null);
        zVar.v(q0.c(x90.a.OnScannedQrCode.class), oVar, tVar.new m(null));
        zVar.x(q0.c(x90.a.OpenLink.class), oVar, tVar.new c(null));
        zVar.x(q0.c(x90.a.c.class), oVar, tVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b v9(y90.c.b bVar) {
        return this.qrScannerErrorMapper.b(new y90.c.Params(bVar, b9(x90.a.b.f217439a)));
    }

    private final x90.b.ScannerQrCode w9() {
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        iy.b0.Companion companion = iy.b0.INSTANCE;
        return new x90.b.ScannerQrCode(false, companion.a(), c2039b, false, this.cameraScannerPreviewViewConnector, companion.a(), this.commonEndpoints.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x90.c.a x9(x90.b state) {
        return this.mapper.b(new y90.j.Params(state, b9(new x90.a.UpdateBottomSheetState(true)), new er.l() { // from class: x90.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f217510a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: x90.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f217511a, (iy.b0) obj);
            }
        }, b9(x90.a.f.f217446a), b9(x90.a.c.f217440a), new er.l() { // from class: x90.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f217512a, (String) obj);
            }
        }, b9(x90.a.b.f217439a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, boolean z15) {
        tVar.d9(new x90.a.UpdateBottomSheetState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, iy.b0 b0Var) {
        tVar.d9(new x90.a.OnCodeChange(b0Var));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<x90.a.d> Y1() {
        return this.navAction;
    }

    @Override // x90.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<x90.b, x90.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<x90.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
