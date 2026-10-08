package iz2;

import f70.QrScannerData;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001TBq\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J1\u0010(\u001a\u00020'*\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002020.H\u0096\u0001¢\u0006\u0004\b3\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010V\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030W8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010*\u001a\b\u0012\u0004\u0012\u00020+0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006b"}, d2 = {"Liz2/x;", "Ll00/g;", "Liz2/b;", "Liz2/a;", "Liz2/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Ljz2/g;", "mapper", "Lsz/d;", "cameraScannerPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "La14/x;", "requestCameraPermissionUseCase", "La14/b;", "checkCameraPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Loz/q;", "ownerViewLifecycleManager", "Ljz2/b;", "qrScannerErrorMapper", "Lyy2/e;", "validateCodeUseCase", "Lhb4/d;", "errorVMSFactory", "Liz2/d;", "setupContract", "<init>", "(Lyy/a;Ljz2/g;Lsz/d;Lac4/r;La14/x;La14/b;La14/m;Loz/q;Ljz2/b;Lyy2/e;Lhb4/d;Liz2/d;)V", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "v9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "state", "Liz2/c$a;", "x9", "(Liz2/b;)Liz2/c$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Ljz2/g;", "c", "Lsz/d;", "d", "Lac4/r;", "e", "La14/x;", "f", "La14/b;", "g", "La14/m;", "h", "Loz/q;", "j", "Ljz2/b;", "k", "Lyy2/e;", "l", "Lhb4/d;", "m", "Liz2/d;", "Lxw/b;", "Liz2/a$g;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Loz/j;", "p", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<iz2.b, iz2.a> implements iz2.c, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jz2.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sz.d cameraScannerPreviewViewConnector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.b checkCameraPermissionUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final jz2.b qrScannerErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final yy2.e validateCodeUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final iz2.d setupContract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<iz2.b, iz2.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<iz2.a.g> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<iz2.c.a> state = a9(new b(e9().getState(), this), x9(new iz2.b.ScannerQrCode(new iz2.b.StateData(false, new QrScannerData(null, null, 3, null), null, null, null, null, false, false, 253, null))));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Liz2/x$a;", "Lf00/j0;", "Liz2/d;", "Liz2/x;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<iz2.d, x> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<iz2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f98178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f98179b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f98180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f98181b;

            /* JADX INFO: renamed from: iz2.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2305a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f98182d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f98183e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f98184f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f98186h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f98187j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f98188k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f98189l;

                public C2305a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f98182d = obj;
                    this.f98183e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f98180a = hVar;
                this.f98181b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2305a c2305a;
                if (eVar instanceof C2305a) {
                    c2305a = (C2305a) eVar;
                    int i15 = c2305a.f98183e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2305a.f98183e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2305a = new C2305a(eVar);
                    }
                } else {
                    c2305a = new C2305a(eVar);
                }
                Object obj2 = c2305a.f98182d;
                Object objE = uq.b.e();
                int i16 = c2305a.f98183e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f98180a;
                    iz2.c.a aVarX9 = this.f98181b.x9((iz2.b) obj);
                    c2305a.f98184f = vq.j.a(obj);
                    c2305a.f98186h = vq.j.a(c2305a);
                    c2305a.f98187j = vq.j.a(obj);
                    c2305a.f98188k = vq.j.a(hVar);
                    c2305a.f98189l = 0;
                    c2305a.f98183e = 1;
                    if (hVar.F(aVarX9, c2305a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, x xVar) {
            this.f98178a = gVar;
            this.f98179b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super iz2.c.a> hVar, tq.e eVar) {
            Object objA = this.f98178a.a(new a(hVar, this.f98179b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liz2/a$c;", "<unused var>", "Liz2/b;", "Loq/i0;", "<anonymous>", "(Liz2/a$c;Liz2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<iz2.a.c, iz2.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98190e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98190e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iz2.a.g> bVarY1 = x.this.Y1();
                iz2.a.g.C2302a c2302a = iz2.a.g.C2302a.f98075a;
                this.f98190e = 1;
                if (bVarY1.F(c2302a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.c cVar, iz2.b bVar, tq.e<? super oq.i0> eVar) {
            return x.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$a;", "<unused var>", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<iz2.a.C2301a, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98193f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(scannerQrCode.getData(), false, null, null, null, null, null, false, false, 254, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f98193f;
            uq.b.e();
            if (this.f98192e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((iz2.b.ScannerQrCode) c0Var.a()).getData().getShowCodeBottomSheetDialog()) {
                return c0Var.b(new er.l() { // from class: iz2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.d.O((b.ScannerQrCode) obj2);
                    }
                });
            }
            x.this.d9(iz2.a.c.f98070a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.C2301a c2301a, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            d dVar = x.this.new d(eVar);
            dVar.f98193f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$e;", "<unused var>", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<iz2.a.e, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98196f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.Error O(k10.c0 c0Var, x xVar, dx.b.Business business, iz2.b.ScannerQrCode scannerQrCode) {
            return new iz2.b.Error(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, null, false, false, GF2Field.MASK, null), xVar.errorVMSFactory.a(x.w9(xVar, business, xVar.b9(iz2.a.j.f98079a), null, 2, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98196f;
            uq.b.e();
            if (this.f98195e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = x.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            final x xVar = x.this;
            if (iVarA instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVarA).b();
                return c0Var.d(new er.l() { // from class: iz2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.e.O(c0Var, xVar, business, (b.ScannerQrCode) obj2);
                    }
                });
            }
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.e eVar, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar2) {
            e eVar3 = x.this.new e(eVar2);
            eVar3.f98196f = c0Var;
            return eVar3.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$d;", "<unused var>", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<iz2.a.d, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98199f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, null, false, false, CertificateBody.profileType, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98199f;
            uq.b.e();
            if (this.f98198e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iz2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.O(c0Var, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.d dVar, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f98199f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98201f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, boolean z15, iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, null, z15, false, 191, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98201f;
            Object objE = uq.b.e();
            int i15 = this.f98200e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = x.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f98201f = c0Var;
                this.f98200e = 1;
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
            return c0Var.b(new er.l() { // from class: iz2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O(c0Var, zC, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f98201f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Liz2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Liz2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<nx.a, iz2.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98204f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f98204f;
            uq.b.e();
            if (this.f98203e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                x.this.d9(iz2.a.b.f98069a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, iz2.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f98204f = aVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$b;", "<unused var>", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<iz2.a.b, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98207f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, boolean z15, iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, null, z15, false, 191, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98207f;
            Object objE = uq.b.e();
            int i15 = this.f98206e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.b bVar = x.this.checkCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f98207f = c0Var;
                this.f98206e = 1;
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
            return c0Var.b(new er.l() { // from class: iz2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O(c0Var, zC, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.b bVar, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f98207f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$k;", "action", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<iz2.a.UpdateBottomSheetState, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98211g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, iz2.a.UpdateBottomSheetState updateBottomSheetState, iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), updateBottomSheetState.getVisibility(), null, null, null, null, null, false, false, 254, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iz2.a.UpdateBottomSheetState updateBottomSheetState = (iz2.a.UpdateBottomSheetState) this.f98210f;
            final k10.c0 c0Var = (k10.c0) this.f98211g;
            uq.b.e();
            if (this.f98209e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iz2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.j.O(c0Var, updateBottomSheetState, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.UpdateBottomSheetState updateBottomSheetState, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f98210f = updateBottomSheetState;
            jVar.f98211g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$h;", "action", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<iz2.a.OnCodeChange, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98214g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, iz2.a.OnCodeChange onCodeChange, iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), false, null, onCodeChange.getCode(), null, null, hz.b.C2039b.f86846c, false, false, 219, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iz2.a.OnCodeChange onCodeChange = (iz2.a.OnCodeChange) this.f98213f;
            final k10.c0 c0Var = (k10.c0) this.f98214g;
            uq.b.e();
            if (this.f98212e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iz2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.k.O(c0Var, onCodeChange, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.OnCodeChange onCodeChange, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f98213f = onCodeChange;
            kVar.f98214g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$l;", "<unused var>", "Lk10/c0;", "Liz2/b$b;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<iz2.a.l, k10.c0<iz2.b.ScannerQrCode>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f98215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f98216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98217g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, hz.b bVar, iz2.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.a(iz2.b.StateData.b(((iz2.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, bVar, false, false, 223, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String str;
            final hz.b invalid;
            final k10.c0 c0Var = (k10.c0) this.f98217g;
            Object objE = uq.b.e();
            int i15 = this.f98216f;
            if (i15 == 0) {
                oq.u.b(obj);
                String enteredCode = ((iz2.b.ScannerQrCode) c0Var.a()).getData().getEnteredCode();
                yy2.e eVar = x.this.validateCodeUseCase;
                yy2.e.Params params = new yy2.e.Params(enteredCode);
                this.f98217g = c0Var;
                this.f98215e = enteredCode;
                this.f98216f = 1;
                Object objF = eVar.f(params, this);
                if (objF == objE) {
                    return objE;
                }
                str = enteredCode;
                obj = objF;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f98215e;
                oq.u.b(obj);
            }
            hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                invalid = new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage());
            } else {
                if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                    throw new oq.p();
                }
                invalid = hz.b.d.f86848c;
            }
            if (invalid.a()) {
                x.this.d9(new iz2.a.GoToNextStep(iy.c0.g(str)));
            }
            return c0Var.b(new er.l() { // from class: iz2.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O(c0Var, invalid, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.l lVar, k10.c0<iz2.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            l lVar2 = x.this.new l(eVar);
            lVar2.f98217g = c0Var;
            return lVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "", "action", "Liz2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Liz2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, iz2.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98220f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f98220f;
            uq.b.e();
            if (this.f98219e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x xVar = x.this;
            if (iVar instanceof dx.i.Right) {
                xVar.d9(new iz2.a.OnScannedQrCode((String) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, iz2.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            m mVar = x.this.new m(eVar);
            mVar.f98220f = iVar;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liz2/a$i;", "action", "Liz2/b$b;", "state", "Loq/i0;", "<anonymous>", "(Liz2/a$i;Liz2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<iz2.a.OnScannedQrCode, iz2.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f98224g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iz2.a.OnScannedQrCode onScannedQrCode = (iz2.a.OnScannedQrCode) this.f98223f;
            iz2.b.ScannerQrCode scannerQrCode = (iz2.b.ScannerQrCode) this.f98224g;
            uq.b.e();
            if (this.f98222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!fr.t.c(onScannedQrCode.getCode(), scannerQrCode.getData().getLastScannedCode())) {
                x.this.d9(new iz2.a.GoToNextStep(iy.c0.g(onScannedQrCode.getCode())));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.OnScannedQrCode onScannedQrCode, iz2.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            n nVar = x.this.new n(eVar);
            nVar.f98223f = onScannedQrCode;
            nVar.f98224g = scannerQrCode;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liz2/a$f;", "action", "Liz2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liz2/a$f;Liz2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<iz2.a.GoToNextStep, iz2.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98227f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iz2.a.GoToNextStep goToNextStep = (iz2.a.GoToNextStep) this.f98227f;
            Object objE = uq.b.e();
            int i15 = this.f98226e;
            if (i15 == 0) {
                oq.u.b(obj);
                x.this.setupContract.u5(new QrScannerSharedData(goToNextStep.getCode()));
                xw.b<iz2.a.g> bVarY1 = x.this.Y1();
                iz2.a.g.b bVar = iz2.a.g.b.f98076a;
                this.f98227f = vq.j.a(goToNextStep);
                this.f98226e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.GoToNextStep goToNextStep, iz2.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            o oVar = x.this.new o(eVar);
            oVar.f98227f = goToNextStep;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liz2/a$j;", "<unused var>", "Lk10/c0;", "Liz2/b$a;", "state", "Lk10/l;", "Liz2/b;", "<anonymous>", "(Liz2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<iz2.a.j, k10.c0<iz2.b.Error>, tq.e<? super k10.l<? extends iz2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f98230f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iz2.b.ScannerQrCode O(k10.c0 c0Var, iz2.b.Error error) {
            return new iz2.b.ScannerQrCode(((iz2.b.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f98230f;
            uq.b.e();
            if (this.f98229e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: iz2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.p.O(c0Var, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iz2.a.j jVar, k10.c0<iz2.b.Error> c0Var, tq.e<? super k10.l<? extends iz2.b>> eVar) {
            p pVar = new p(eVar);
            pVar.f98230f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, jz2.g gVar, sz.d dVar, ac4.r<String> rVar, a14.x xVar, a14.b bVar, a14.m mVar, oz.q qVar, jz2.b bVar2, yy2.e eVar, hb4.d dVar2, iz2.d dVar3) {
        this.mapper = gVar;
        this.cameraScannerPreviewViewConnector = dVar;
        this.scanCameraUseCase = rVar;
        this.requestCameraPermissionUseCase = xVar;
        this.checkCameraPermissionUseCase = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.ownerViewLifecycleManager = qVar;
        this.qrScannerErrorMapper = bVar2;
        this.validateCodeUseCase = eVar;
        this.errorVMSFactory = dVar2;
        this.setupContract = dVar3;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(new iz2.b.ScannerQrCode(new iz2.b.StateData(false, new QrScannerData(null, null, 3, null), null, null, null, null, false, false, 253, null)), new er.l() { // from class: iz2.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.B9(this.f98162a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(iz2.b.class), new er.l() { // from class: iz2.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f98158a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iz2.b.ScannerQrCode.class), new er.l() { // from class: iz2.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f98159a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iz2.b.Error.class), new er.l() { // from class: iz2.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        zVar.x(q0.c(iz2.a.c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(x xVar, k10.z zVar) {
        zVar.A(xVar.new g(null));
        k10.k.s(zVar, xVar.x8(), null, xVar.new h(null), 2, null);
        i iVar = xVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(iz2.a.b.class), oVar, iVar);
        zVar.v(q0.c(iz2.a.UpdateBottomSheetState.class), oVar, new j(null));
        zVar.v(q0.c(iz2.a.OnCodeChange.class), oVar, new k(null));
        zVar.v(q0.c(iz2.a.l.class), oVar, xVar.new l(null));
        k10.k.s(zVar, (mu.g) xVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.SingleQrScanner(null, 1, null), 2, null)), null, xVar.new m(null), 2, null);
        zVar.x(q0.c(iz2.a.OnScannedQrCode.class), oVar, xVar.new n(null));
        zVar.x(q0.c(iz2.a.GoToNextStep.class), oVar, xVar.new o(null));
        zVar.v(q0.c(iz2.a.C2301a.class), oVar, xVar.new d(null));
        zVar.v(q0.c(iz2.a.e.class), oVar, xVar.new e(null));
        zVar.v(q0.c(iz2.a.d.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(k10.z zVar) {
        p pVar = new p(null);
        zVar.v(q0.c(iz2.a.j.class), k10.o.CANCEL_PREVIOUS, pVar);
        return oq.i0.f148189a;
    }

    private final jb4.b v9(dx.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
        return this.qrScannerErrorMapper.b(new jz2.b.Params(bVar, aVar2, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ jb4.b w9(x xVar, dx.b bVar, er.a aVar, er.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = xVar.b9(iz2.a.c.f98070a);
        }
        return xVar.v9(bVar, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iz2.c.a x9(iz2.b state) {
        return this.mapper.b(new jz2.g.Params(state, this.cameraScannerPreviewViewConnector, b9(new iz2.a.UpdateBottomSheetState(true)), new er.l() { // from class: iz2.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.y9(this.f98160a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: iz2.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.z9(this.f98161a, (String) obj);
            }
        }, b9(iz2.a.l.f98081a), b9(iz2.a.e.f98072a), b9(iz2.a.d.f98071a), b9(iz2.a.C2301a.f98068a), b9(iz2.a.c.f98070a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(x xVar, boolean z15) {
        xVar.d9(new iz2.a.UpdateBottomSheetState(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(x xVar, String str) {
        xVar.d9(new iz2.a.OnCodeChange(str));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<iz2.a.g> Y1() {
        return this.navAction;
    }

    @Override // iz2.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<iz2.b, iz2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<iz2.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
