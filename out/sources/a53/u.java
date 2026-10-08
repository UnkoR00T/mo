package a53;

import android.net.Uri;
import android.webkit.ValueCallback;
import bz.DownloadFileData;
import f00.j0;
import fr.q0;
import java.util.UUID;
import mu.p0;
import mu.r0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w43.TokenResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001}B\u0083\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J+\u00101\u001a\b\u0012\u0004\u0012\u00020\u0002002\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u000203*\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0018\u00108\u001a\u00020(2\u0006\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b:\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010_\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030`8\u0014X\u0094\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR \u0010/\u001a\b\u0012\u0004\u0012\u0002030m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR \u0010x\u001a\b\u0012\u0004\u0012\u00020s0m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010o\u001a\u0004\bw\u0010qR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020z0y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010{¨\u0006~"}, d2 = {"La53/u;", "Ll00/g;", "La53/b;", "La53/a;", "Li70/n;", "La53/c;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lc54/b;", "isFeatureEnabledUseCase", "La14/h;", "downloadFileUseCase", "Ly43/b;", "prepareDataForGetContentUseCase", "Ly43/c;", "preparePostDataForGetTokenUseCase", "Ly43/a;", "getTokenResponseFromResponseUseCase", "La14/c;", "clearWebViewUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lb53/b;", "mapper", "Lt43/b;", "onlineServiceTypeToUrlsMapper", "Lbc4/h;", "pickFileUseCase", "La53/u$a$a;", "setupData", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lmx/c;Lc54/b;La14/h;Ly43/b;Ly43/c;Ly43/a;La14/c;Lhb4/d;Lib4/c;Lb53/b;Lt43/b;Lbc4/h;La53/u$a$a;Li70/n;)V", "Lu04/b;", "downloadStatus", "Loq/i0;", "O9", "(Lu04/b;)V", "Ldx/b;", "domainError", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "G9", "(Ldx/b;Lk10/c0;)Lk10/l;", "La53/c$a;", "J9", "(La53/b;)La53/c$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "c", "Lmx/c;", "d", "Lc54/b;", "e", "La14/h;", "f", "Ly43/b;", "g", "Ly43/c;", "h", "Ly43/a;", "j", "La14/c;", "k", "Lhb4/d;", "l", "Lib4/c;", "m", "Lb53/b;", "n", "Lt43/b;", "p", "Lbc4/h;", "q", "La53/u$a$a;", "La53/b$b;", "r", "La53/b$b;", "initialState", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "s", "Landroid/webkit/ValueCallback;", "filePathCallback", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "La53/a$j;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/b0;", "", "x", "Lmu/b0;", "_loaderState", "F9", "loaderState", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<a53.b, a53.a> implements i70.n, a53.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.n f3752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.h downloadFileUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y43.b prepareDataForGetContentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final y43.c preparePostDataForGetTokenUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y43.a getTokenResponseFromResponseUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.c clearWebViewUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b53.b mapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t43.b onlineServiceTypeToUrlsMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a53.b.Initial initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private ValueCallback<Uri[]> filePathCallback;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<a53.b, a53.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a53.a.j> navAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<a53.c.a> state;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<Boolean> _loaderState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p0<Boolean> loaderState;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"La53/u$a;", "Lf00/j0;", "La53/u$a$a;", "La53/u;", "a", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<SetupData, u> {

        /* JADX INFO: renamed from: a53.u$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"La53/u$a$a;", "", "Lw43/c;", "data", "<init>", "(Lw43/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw43/c;", "()Lw43/c;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final w43.c data;

            public SetupData(w43.c cVar) {
                this.data = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final w43.c getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && fr.t.c(this.data, ((SetupData) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "SetupData(data=" + this.data + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3774a;

        static {
            int[] iArr = new int[u04.b.values().length];
            try {
                iArr[u04.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3774a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<a53.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f3775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f3776b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f3777a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f3778b;

            /* JADX INFO: renamed from: a53.u$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0069a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3779d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f3780e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f3781f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f3783h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f3784j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f3785k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f3786l;

                public C0069a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f3779d = obj;
                    this.f3780e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f3777a = hVar;
                this.f3778b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0069a c0069a;
                if (eVar instanceof C0069a) {
                    c0069a = (C0069a) eVar;
                    int i15 = c0069a.f3780e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0069a.f3780e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0069a = new C0069a(eVar);
                    }
                } else {
                    c0069a = new C0069a(eVar);
                }
                Object obj2 = c0069a.f3779d;
                Object objE = uq.b.e();
                int i16 = c0069a.f3780e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f3777a;
                    a53.c.a aVarJ9 = this.f3778b.J9((a53.b) obj);
                    c0069a.f3781f = vq.j.a(obj);
                    c0069a.f3783h = vq.j.a(c0069a);
                    c0069a.f3784j = vq.j.a(obj);
                    c0069a.f3785k = vq.j.a(hVar);
                    c0069a.f3786l = 0;
                    c0069a.f3780e = 1;
                    if (hVar.F(aVarJ9, c0069a) == objE) {
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

        public c(mu.g gVar, u uVar) {
            this.f3775a = gVar;
            this.f3776b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a53.c.a> hVar, tq.e eVar) {
            Object objA = this.f3775a.a(new a(hVar, this.f3776b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La53/a$a;", "<unused var>", "La53/b;", "state", "Loq/i0;", "<anonymous>", "(La53/a$a;La53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a53.a.C0064a, a53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3787e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f3787e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(a53.a.b.f3691a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.C0064a c0064a, a53.b bVar, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La53/a$h;", "<unused var>", "Lk10/c0;", "La53/b;", "state", "Lk10/l;", "<anonymous>", "(La53/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a53.a.h, k10.c0<a53.b>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3790f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a53.b.Initial O(u uVar, a53.b bVar) {
            return uVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f3790f;
            uq.b.e();
            if (this.f3789e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: a53.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(uVar, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.h hVar, k10.c0<a53.b> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f3790f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La53/a$b;", "<unused var>", "La53/b;", "Loq/i0;", "<anonymous>", "(La53/a$b;La53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a53.a.b, a53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3792e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3792e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a53.a.j> bVarY1 = u.this.Y1();
                a53.a.j.C0065a c0065a = a53.a.j.C0065a.f3700a;
                this.f3792e = 1;
                if (bVarY1.F(c0065a, this) == objE) {
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
        public final Object w(a53.a.b bVar, a53.b bVar2, tq.e<? super i0> eVar) {
            return u.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La53/b$b;", "state", "Loq/i0;", "<anonymous>", "(La53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<a53.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3795f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a53.b.Initial initial = (a53.b.Initial) this.f3795f;
            uq.b.e();
            if (this.f3794e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(new a53.a.Setup(initial.getOnlineServiceType()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a53.b.Initial initial, tq.e<? super i0> eVar) {
            return ((g) v(initial, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f3795f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$p;", "action", "Lk10/c0;", "La53/b$b;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a53.a.Setup, k10.c0<a53.b.Initial>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3799g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a53.b.WebView O(a53.a.Setup setup, u uVar, a53.b.Initial initial) {
            return new a53.b.WebView(UUID.randomUUID().toString(), uVar.onlineServiceTypeToUrlsMapper.b(setup.getOnlineServiceType()), setup.getOnlineServiceType(), true, null, uVar.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a53.a.Setup setup = (a53.a.Setup) this.f3798f;
            k10.c0 c0Var = (k10.c0) this.f3799g;
            Object objE = uq.b.e();
            int i15 = this.f3797e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.c cVar = u.this.clearWebViewUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f3798f = setup;
                this.f3799g = c0Var;
                this.f3797e = 1;
                if (cVar.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: a53.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(setup, uVar, (b.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.Setup setup, k10.c0<a53.b.Initial> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f3798f = setup;
            hVar.f3799g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$k;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a53.a.OnFilePickerRequested, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3803g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objC;
            a53.a.OnFilePickerRequested onFilePickerRequested = (a53.a.OnFilePickerRequested) this.f3802f;
            k10.c0 c0Var = (k10.c0) this.f3803g;
            Object objE = uq.b.e();
            int i15 = this.f3801e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.filePathCallback = onFilePickerRequested.a();
                bc4.h hVar = u.this.pickFileUseCase;
                bc4.h.Params params = new bc4.h.Params(pq.v.q(wx.f.PDF, wx.f.JPG, wx.f.JPEG, wx.f.PNG, wx.f.TIFF, wx.f.TIF, wx.f.DOC, wx.f.DOCX, wx.f.ODT, wx.f.XML), 1.0E8f, null, 4, null);
                this.f3802f = vq.j.a(onFilePickerRequested);
                this.f3803g = c0Var;
                this.f3801e = 1;
                objC = hVar.c(params, this);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                objC = obj;
            }
            dx.i iVar = (dx.i) objC;
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                return uVar.G9((dx.b) ((dx.i.Left) iVar).b(), c0Var);
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            bc4.h.Result result = (bc4.h.Result) ((dx.i.Right) iVar).b();
            ValueCallback valueCallback = uVar.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(new Uri[]{Uri.parse(result.getFile().getMetadata().getUri())});
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.OnFilePickerRequested onFilePickerRequested, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f3802f = onFilePickerRequested;
            iVar.f3803g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$n;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a53.a.n, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3806f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f3806f;
            uq.b.e();
            if (this.f3805e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return u.this.G9(new dx.b.g.SslCertificate(false), c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.n nVar, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f3806f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$i;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a53.a.Loader, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3810g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a53.b.WebView O(a53.a.Loader loader, a53.b.WebView webView) {
            return a53.b.WebView.b(webView, null, null, null, loader.getVisible(), null, false, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a53.a.Loader loader = (a53.a.Loader) this.f3809f;
            k10.c0 c0Var = (k10.c0) this.f3810g;
            uq.b.e();
            if (this.f3808e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a53.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O(loader, (b.WebView) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.Loader loader, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f3809f = loader;
            kVar.f3810g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La53/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La53/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<a53.b.WebView, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3811e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f3811e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(a53.a.e.f3695a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a53.b.WebView webView, tq.e<? super i0> eVar) {
            return ((l) v(webView, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$g;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a53.a.GetUrl, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3815g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a53.b.WebView O(a53.a.GetUrl getUrl, a53.b.WebView webView) {
            return a53.b.WebView.b(webView, null, null, null, false, new w43.a.C5526a(getUrl.getUrl()), false, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a53.a.GetUrl getUrl = (a53.a.GetUrl) this.f3814f;
            k10.c0 c0Var = (k10.c0) this.f3815g;
            uq.b.e();
            if (this.f3813e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a53.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O(getUrl, (b.WebView) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.GetUrl getUrl, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f3814f = getUrl;
            mVar.f3815g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$o;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a53.a.PostUrl, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3818g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a53.b.WebView O(a53.a.PostUrl postUrl, a53.b.WebView webView) {
            return a53.b.WebView.b(webView, null, null, null, false, new w43.a.b(postUrl.getUrl(), postUrl.getPostData()), false, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a53.a.PostUrl postUrl = (a53.a.PostUrl) this.f3817f;
            k10.c0 c0Var = (k10.c0) this.f3818g;
            uq.b.e();
            if (this.f3816e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a53.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.n.O(postUrl, (b.WebView) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.PostUrl postUrl, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f3817f = postUrl;
            nVar.f3818g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La53/a$e;", "<unused var>", "La53/b$c;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(La53/a$e;La53/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a53.a.e, a53.b.WebView, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3820f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a53.b.WebView webView = (a53.b.WebView) this.f3820f;
            uq.b.e();
            if (this.f3819e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(new a53.a.GetUrl(webView.getServiceUrls().getInit()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.e eVar, a53.b.WebView webView, tq.e<? super i0> eVar2) {
            o oVar = u.this.new o(eVar2);
            oVar.f3820f = webView;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$f;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a53.a.f, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3823f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f3823f;
            uq.b.e();
            if (this.f3822e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<dx.b, byte[]> iVarB = u.this.preparePostDataForGetTokenUseCase.b(new y43.c.Params(((a53.b.WebView) c0Var.a()).getRequestId(), ((a53.b.WebView) c0Var.a()).getOnlineServiceType().getOrigin()));
            u uVar = u.this;
            if (iVarB instanceof dx.i.Left) {
                return uVar.G9((dx.b) ((dx.i.Left) iVarB).b(), c0Var);
            }
            if (!(iVarB instanceof dx.i.Right)) {
                throw new oq.p();
            }
            uVar.d9(new a53.a.PostUrl(((a53.b.WebView) c0Var.a()).getServiceUrls().getGetToken(), iy.c0.f((byte[]) ((dx.i.Right) iVarB).b()), true));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.f fVar, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            p pVar = u.this.new p(eVar);
            pVar.f3823f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$l;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a53.a.OnGetTokenLoaded, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3827g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a53.a.OnGetTokenLoaded onGetTokenLoaded = (a53.a.OnGetTokenLoaded) this.f3826f;
            k10.c0 c0Var = (k10.c0) this.f3827g;
            Object objE = uq.b.e();
            int i15 = this.f3825e;
            if (i15 == 0) {
                oq.u.b(obj);
                y43.a aVar = u.this.getTokenResponseFromResponseUseCase;
                y43.a.Params params = new y43.a.Params(onGetTokenLoaded.getContent());
                this.f3826f = vq.j.a(onGetTokenLoaded);
                this.f3827g = c0Var;
                this.f3825e = 1;
                obj = aVar.f(params, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                return uVar.G9((dx.b) ((dx.i.Left) iVar).b(), c0Var);
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            uVar.d9(new a53.a.GetContent((TokenResponse) ((dx.i.Right) iVar).b()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.OnGetTokenLoaded onGetTokenLoaded, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            q qVar = u.this.new q(eVar);
            qVar.f3826f = onGetTokenLoaded;
            qVar.f3827g = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La53/a$d;", "action", "Lk10/c0;", "La53/b$c;", "state", "Lk10/l;", "La53/b;", "<anonymous>", "(La53/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a53.a.GetContent, k10.c0<a53.b.WebView>, tq.e<? super k10.l<? extends a53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3831g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a53.a.GetContent getContent = (a53.a.GetContent) this.f3830f;
            k10.c0 c0Var = (k10.c0) this.f3831g;
            Object objE = uq.b.e();
            int i15 = this.f3829e;
            if (i15 == 0) {
                oq.u.b(obj);
                y43.b bVar = u.this.prepareDataForGetContentUseCase;
                y43.b.Params params = new y43.b.Params(((a53.b.WebView) c0Var.a()).getRequestId(), ((a53.b.WebView) c0Var.a()).getOnlineServiceType().getOrigin(), getContent.getTokenResponse());
                this.f3830f = vq.j.a(getContent);
                this.f3831g = c0Var;
                this.f3829e = 1;
                obj = bVar.d(params, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                return uVar.G9((dx.b) ((dx.i.Left) iVar).b(), c0Var);
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            uVar.d9(new a53.a.PostUrl(((a53.b.WebView) c0Var.a()).getServiceUrls().getGetContent(), (iy.a0) ((dx.i.Right) iVar).b(), false));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.GetContent getContent, k10.c0<a53.b.WebView> c0Var, tq.e<? super k10.l<? extends a53.b>> eVar) {
            r rVar = u.this.new r(eVar);
            rVar.f3830f = getContent;
            rVar.f3831g = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La53/a$m;", "action", "La53/b$c;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(La53/a$m;La53/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a53.a.OnPageLoaded, a53.b.WebView, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3835g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a53.a.OnPageLoaded onPageLoaded = (a53.a.OnPageLoaded) this.f3834f;
            a53.b.WebView webView = (a53.b.WebView) this.f3835g;
            Object objE = uq.b.e();
            int i15 = this.f3833e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fu.r.d0(onPageLoaded.getUrl(), webView.getServiceUrls().getInit(), false, 2, null)) {
                    u.this.d9(a53.a.f.f3696a);
                } else if (fu.r.d0(onPageLoaded.getUrl(), webView.getServiceUrls().getGetToken(), false, 2, null)) {
                    u.this.d9(new a53.a.OnGetTokenLoaded(onPageLoaded.getContent()));
                } else {
                    mu.b0 b0Var = u.this._loaderState;
                    Boolean boolA = vq.b.a(false);
                    this.f3834f = vq.j.a(onPageLoaded);
                    this.f3835g = vq.j.a(webView);
                    this.f3833e = 1;
                    if (b0Var.F(boolA, this) == objE) {
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
        public final Object w(a53.a.OnPageLoaded onPageLoaded, a53.b.WebView webView, tq.e<? super i0> eVar) {
            s sVar = u.this.new s(eVar);
            sVar.f3834f = onPageLoaded;
            sVar.f3835g = webView;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La53/a$c;", "action", "La53/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La53/a$c;La53/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a53.a.DownloadFile, a53.b.WebView, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3839g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u uVar;
            a53.a.DownloadFile downloadFile = (a53.a.DownloadFile) this.f3839g;
            Object objE = uq.b.e();
            int i15 = this.f3838f;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar2 = u.this;
                a14.h hVar = uVar2.downloadFileUseCase;
                a14.h.Params params = new a14.h.Params(downloadFile.getDownloadFileData());
                this.f3839g = vq.j.a(downloadFile);
                this.f3837e = uVar2;
                this.f3838f = 1;
                Object objC = hVar.c(params, this);
                if (objC == objE) {
                    return objE;
                }
                uVar = uVar2;
                obj = objC;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = (u) this.f3837e;
                oq.u.b(obj);
            }
            uVar.O9((u04.b) obj);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a53.a.DownloadFile downloadFile, a53.b.WebView webView, tq.e<? super i0> eVar) {
            t tVar = u.this.new t(eVar);
            tVar.f3839g = downloadFile;
            return tVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, mx.c cVar, c54.b bVar, a14.h hVar, y43.b bVar2, y43.c cVar2, y43.a aVar2, a14.c cVar3, hb4.d dVar, ib4.c cVar4, b53.b bVar3, t43.b bVar4, bc4.h hVar2, a.SetupData setupData, i70.n nVar) {
        this.f3752b = nVar;
        this.labelProvider = cVar;
        this.isFeatureEnabledUseCase = bVar;
        this.downloadFileUseCase = hVar;
        this.prepareDataForGetContentUseCase = bVar2;
        this.preparePostDataForGetTokenUseCase = cVar2;
        this.getTokenResponseFromResponseUseCase = aVar2;
        this.clearWebViewUC = cVar3;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar4;
        this.mapper = bVar3;
        this.onlineServiceTypeToUrlsMapper = bVar4;
        this.pickFileUseCase = hVar2;
        this.setupData = setupData;
        a53.b.Initial initial = new a53.b.Initial(setupData.getData());
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: a53.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f3751a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), J9(initial));
        mu.b0<Boolean> b0VarA = r0.a(Boolean.TRUE);
        this._loaderState = b0VarA;
        this.loaderState = b0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<a53.b> G9(final dx.b domainError, k10.c0<a53.b.WebView> state) {
        return state.d(new er.l() { // from class: a53.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f3748a, domainError, (b.WebView) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a53.b.Error H9(final u uVar, dx.b bVar, a53.b.WebView webView) {
        return new a53.b.Error(uVar.errorVMSFactory.a(uVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: a53.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f3750a, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(u uVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.AbstractC2161b.a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Primary)) {
            uVar.d9(a53.a.b.f3691a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            uVar.d9(a53.a.h.f3698a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a53.c.a J9(a53.b bVar) {
        return this.mapper.b(new b53.b.Params(bVar, new er.p() { // from class: a53.l
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return u.K9(this.f3742a, (String) obj, (iy.b0) obj2);
            }
        }, new er.l() { // from class: a53.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f3743a, (DownloadFileData) obj);
            }
        }, b9(a53.a.n.f3707a), new er.l() { // from class: a53.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9(this.f3744a, (ValueCallback) obj);
            }
        }, b9(a53.a.C0064a.f3690a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, String str, iy.b0 b0Var) {
        uVar.d9(new a53.a.OnPageLoaded(str, b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, DownloadFileData downloadFileData) {
        uVar.d9(new a53.a.DownloadFile(downloadFileData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(u uVar, ValueCallback valueCallback) {
        uVar.d9(new a53.a.OnFilePickerRequested(valueCallback));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9(u04.b downloadStatus) {
        int i15;
        int i16 = b.f3774a[downloadStatus.ordinal()];
        if (i16 != 1) {
            i15 = i16 != 2 ? q43.a.f164720d : q43.a.f164721e;
        } else {
            i15 = q43.a.f164718b;
        }
        y(new p50.a.DefaultWithIcon(this.labelProvider.c(i15), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(a53.b.class), new er.l() { // from class: a53.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9(this.f3745a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a53.b.Initial.class), new er.l() { // from class: a53.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f3746a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a53.b.WebView.class), new er.l() { // from class: a53.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.S9(this.f3747a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(u uVar, k10.z zVar) {
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a53.a.C0064a.class), oVar, dVar);
        zVar.v(q0.c(a53.a.h.class), oVar, uVar.new e(null));
        zVar.x(q0.c(a53.a.b.class), oVar, uVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(u uVar, k10.z zVar) {
        zVar.C(uVar.new g(null));
        h hVar = uVar.new h(null);
        zVar.v(q0.c(a53.a.Setup.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(u uVar, k10.z zVar) {
        zVar.C(uVar.new l(null));
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a53.a.GetUrl.class), oVar, mVar);
        zVar.v(q0.c(a53.a.PostUrl.class), oVar, new n(null));
        zVar.x(q0.c(a53.a.e.class), oVar, uVar.new o(null));
        zVar.v(q0.c(a53.a.f.class), oVar, uVar.new p(null));
        zVar.v(q0.c(a53.a.OnGetTokenLoaded.class), oVar, uVar.new q(null));
        zVar.v(q0.c(a53.a.GetContent.class), oVar, uVar.new r(null));
        zVar.x(q0.c(a53.a.OnPageLoaded.class), oVar, uVar.new s(null));
        zVar.x(q0.c(a53.a.DownloadFile.class), oVar, uVar.new t(null));
        zVar.v(q0.c(a53.a.OnFilePickerRequested.class), oVar, uVar.new i(null));
        zVar.v(q0.c(a53.a.n.class), oVar, uVar.new j(null));
        zVar.v(q0.c(a53.a.Loader.class), oVar, new k(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.f3752b.B0();
    }

    @Override // a53.c
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public p0<Boolean> d2() {
        return this.loaderState;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w43.c cVar) {
        super.P5(cVar);
    }

    @Override // zx.b
    public xw.b<a53.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<a53.b, a53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a53.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.f3752b.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.f3752b.y(snackBarData);
    }
}
