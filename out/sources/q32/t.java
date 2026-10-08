package q32;

import android.net.Uri;
import android.net.http.SslCertificate;
import d12.OAuthWebViewData;
import eo0.AddressData;
import eo0.CentralTokens;
import eo0.EmptyState;
import eo0.OAuthConfiguration;
import eo0.OwTokens;
import eo0.OwnerAddress;
import fr.q0;
import java.util.Iterator;
import java.util.List;
import ju.h2;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w70.ExecutionData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0099\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002\u009a\u0001B£\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0001\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.H\u0082@¢\u0006\u0004\b/\u00100J$\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020.032\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b5\u00106J \u00109\u001a\u00020.2\u0006\u00107\u001a\u0002012\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\b9\u0010:J0\u0010A\u001a\u00020.2\u0006\u00107\u001a\u0002012\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0082@¢\u0006\u0004\bA\u0010BJ0\u0010E\u001a\u00020.2\u0006\u00107\u001a\u0002012\u0006\u0010D\u001a\u00020C2\u0006\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;H\u0082@¢\u0006\u0004\bE\u0010FJ(\u0010G\u001a\u00020.2\u0006\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;H\u0082@¢\u0006\u0004\bG\u0010HJ\u0018\u0010K\u001a\u00020.2\u0006\u0010J\u001a\u00020IH\u0082@¢\u0006\u0004\bK\u0010LJ'\u0010P\u001a\u00020.2\u0006\u00107\u001a\u00020M2\u0006\u0010N\u001a\u0002012\u0006\u0010O\u001a\u000201H\u0002¢\u0006\u0004\bP\u0010QJ=\u0010W\u001a\u0004\u0018\u00010.2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020.0U2\b\u00107\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020.2\u0006\u0010Y\u001a\u000204H\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020.2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R,\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0086\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010J\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R'\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009b\u0001"}, d2 = {"Lq32/t;", "Ll00/g;", "Lq32/e;", "Lq32/c;", "Lq32/f;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lxn3/a;", "sendCodeToInstitutionUseCase", "Lgo0/a0;", "getOAuthConfigurationUseCase", "Lgo0/x;", "getOwTokenUC", "Lgo0/n;", "getCentralTokenUC", "Lgo0/d0;", "refreshOwTokensUseCase", "Ls02/k;", "saveTokensUseCase", "Lp02/w;", "getOwnerAddressUseCase", "La14/w;", "openUrlIntentUseCase", "Ls02/h;", "saveCentralAccessTokenUseCase", "La14/c;", "clearWebViewUC", "Lc54/b;", "isFeatureEnabledUseCase", "Ls32/c;", "oAuthWebViewScreenMapper", "Li70/e;", "globalSnackBarManager", "Ls32/e;", "webViewErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lez/g;", "ticker", "Ld12/c;", "setupData", "<init>", "(Lyy/a;Lmx/c;Lxn3/a;Lgo0/a0;Lgo0/x;Lgo0/n;Lgo0/d0;Ls02/k;Lp02/w;La14/w;Ls02/h;La14/c;Lc54/b;Ls32/c;Li70/e;Ls32/e;Lhb4/d;Lez/g;Ld12/c;)V", "Loq/i0;", "F9", "(Ltq/e;)Ljava/lang/Object;", "", "qrCode", "Ldx/i;", "Ldx/b;", "O9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "url", "code", "G9", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Leo0/k$a;", "centralAccessToken", "Leo0/i0$c;", "owRefreshToken", "Leo0/i0$a;", "owAccessToken", "H9", "(Ljava/lang/String;Leo0/k$a;Leo0/i0$c;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "edorAddress", "M9", "(Ljava/lang/String;Liy/b0;Leo0/i0$c;Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "N9", "(Leo0/i0$a;Leo0/i0$c;Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "Lq32/e$d;", "state", "K9", "(Lq32/e$d;Ltq/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "scheme", "tokenUrl", "L9", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "", "Lw70/a;", "scriptsList", "Lkotlin/Function1;", "callback", "E9", "(Ljava/util/List;Ler/l;Ljava/lang/String;)Loq/i0;", "domainError", "I9", "(Ldx/b;)V", "Lr32/a;", "error", "J9", "(Lr32/a;)V", "b", "Lxn3/a;", "c", "Lgo0/a0;", "d", "Lgo0/x;", "e", "Lgo0/n;", "f", "Lgo0/d0;", "g", "Ls02/k;", "h", "Lp02/w;", "j", "La14/w;", "k", "Ls02/h;", "l", "La14/c;", "m", "Lc54/b;", "n", "Ls32/c;", "p", "Li70/e;", "q", "Ls32/e;", "r", "Lhb4/d;", "s", "Lez/g;", "t", "Ld12/c;", "Ldx/b$c;", "v", "Ldx/b$c;", "generalError", "Lk10/t;", "w", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lq32/f$a;", "x", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lq32/c$j;", "y", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "z", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<q32.e, q32.c> implements q32.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xn3.a sendCodeToInstitutionUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final go0.a0 getOAuthConfigurationUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go0.x getOwTokenUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final go0.n getCentralTokenUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final go0.d0 refreshOwTokensUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s02.k saveTokensUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p02.w getOwnerAddressUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final s02.h saveCentralAccessTokenUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.c clearWebViewUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final s32.c oAuthWebViewScreenMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final s32.e webViewErrorMapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ez.g ticker;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final OAuthWebViewData setupData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business generalError;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final k10.t<q32.e, q32.c> stateMachine;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p0<q32.f.a> state = a9(new i(e9().getState(), this), q32.f.a.c.f164172a);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q32.c.j> navAction = new xw.b<>();
    public static final int A = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq32/c$f;", "<unused var>", "Lq32/e$d;", "Loq/i0;", "<anonymous>", "(Lq32/c$f;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<q32.c.f, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164213e;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f164213e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            er.a<i0> aVarA = t.this.setupData.a();
            if (aVarA != null) {
                t tVar = t.this;
                aVarA.a();
                tVar.d9(q32.c.a.f164124a);
            } else {
                t.this.d9(q32.c.q.f164153a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.f fVar, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            return t.this.new a0(eVar).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164215a;

        static {
            int[] iArr = new int[eo0.p.values().length];
            try {
                iArr[eo0.p.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eo0.p.RESERVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eo0.p.STRUCK_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eo0.p.CLOSED_RECOVERABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[eo0.p.CLOSED_UNRECOVERABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[eo0.p.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f164215a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$p;", "action", "Lq32/e$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/c$p;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<q32.c.SendDataToInstitution, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164217f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.SendDataToInstitution sendDataToInstitution = (q32.c.SendDataToInstitution) this.f164217f;
            Object objE = uq.b.e();
            int i15 = this.f164216e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                String qrCode = sendDataToInstitution.getQrCode();
                this.f164217f = vq.j.a(sendDataToInstitution);
                this.f164216e = 1;
                if (tVar.O9(qrCode, this) == objE) {
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
        public final Object w(q32.c.SendDataToInstitution sendDataToInstitution, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            b0 b0Var = t.this.new b0(eVar);
            b0Var.f164217f = sendDataToInstitution;
            return b0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f164219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f164220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f164221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f164222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f164223h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f164224j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f164226l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f164224j = obj;
            this.f164226l |= PKIFailureInfo.systemUnavail;
            return t.this.F9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$n;", "action", "Lq32/e$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/c$n;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<q32.c.SaveTokens, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164228f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.SaveTokens saveTokens = (q32.c.SaveTokens) this.f164228f;
            Object objE = uq.b.e();
            int i15 = this.f164227e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                OwTokens.Access owAccessToken = saveTokens.getOwAccessToken();
                OwTokens.Refresh owRefreshToken = saveTokens.getOwRefreshToken();
                CentralTokens.Access centralAccessToken = saveTokens.getCentralAccessToken();
                this.f164228f = vq.j.a(saveTokens);
                this.f164227e = 1;
                if (tVar.N9(owAccessToken, owRefreshToken, centralAccessToken, this) == objE) {
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
        public final Object w(q32.c.SaveTokens saveTokens, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            c0 c0Var = t.this.new c0(eVar);
            c0Var.f164228f = saveTokens;
            return c0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f164230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f164231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f164232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f164233g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f164234h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f164235j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f164236k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f164237l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f164238m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f164239n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f164240p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f164242r;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f164240p = obj;
            this.f164242r |= PKIFailureInfo.systemUnavail;
            return t.this.G9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$e;", "action", "Lq32/e$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/c$e;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<q32.c.FetchTokens, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164244f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.FetchTokens fetchTokens = (q32.c.FetchTokens) this.f164244f;
            Object objE = uq.b.e();
            int i15 = this.f164243e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                String url = fetchTokens.getUrl();
                String code = fetchTokens.getCode();
                this.f164244f = vq.j.a(fetchTokens);
                this.f164243e = 1;
                if (tVar.G9(url, code, this) == objE) {
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
        public final Object w(q32.c.FetchTokens fetchTokens, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            d0 d0Var = t.this.new d0(eVar);
            d0Var.f164244f = fetchTokens;
            return d0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f164246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f164247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f164248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f164249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f164250h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f164252k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f164250h = obj;
            this.f164252k |= PKIFailureInfo.systemUnavail;
            return t.this.H9(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$m;", "action", "Lq32/e$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/c$m;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<q32.c.RefreshOwTokens, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164254f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.RefreshOwTokens refreshOwTokens = (q32.c.RefreshOwTokens) this.f164254f;
            Object objE = uq.b.e();
            int i15 = this.f164253e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                String url = refreshOwTokens.getUrl();
                iy.b0 edorAddress = refreshOwTokens.getEdorAddress();
                OwTokens.Refresh owRefreshToken = refreshOwTokens.getOwRefreshToken();
                CentralTokens.Access centralAccessToken = refreshOwTokens.getCentralAccessToken();
                this.f164254f = vq.j.a(refreshOwTokens);
                this.f164253e = 1;
                if (tVar.M9(url, edorAddress, owRefreshToken, centralAccessToken, this) == objE) {
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
        public final Object w(q32.c.RefreshOwTokens refreshOwTokens, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            e0 e0Var = t.this.new e0(eVar);
            e0Var.f164254f = refreshOwTokens;
            return e0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f164256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f164257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f164258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f164259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f164260h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f164262k;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f164260h = obj;
            this.f164262k |= PKIFailureInfo.systemUnavail;
            return t.this.M9(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$h;", "action", "Lq32/e$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/c$h;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<q32.c.GetElectronicDeliveryAddress, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164264f;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.GetElectronicDeliveryAddress getElectronicDeliveryAddress = (q32.c.GetElectronicDeliveryAddress) this.f164264f;
            Object objE = uq.b.e();
            int i15 = this.f164263e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                String url = getElectronicDeliveryAddress.getUrl();
                CentralTokens.Access centralAccessToken = getElectronicDeliveryAddress.getCentralAccessToken();
                OwTokens.Refresh owRefreshToken = getElectronicDeliveryAddress.getOwRefreshToken();
                OwTokens.Access owAccessToken = getElectronicDeliveryAddress.getOwAccessToken();
                this.f164264f = vq.j.a(getElectronicDeliveryAddress);
                this.f164263e = 1;
                if (tVar.H9(url, centralAccessToken, owRefreshToken, owAccessToken, this) == objE) {
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
        public final Object w(q32.c.GetElectronicDeliveryAddress getElectronicDeliveryAddress, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            f0 f0Var = t.this.new f0(eVar);
            f0Var.f164264f = getElectronicDeliveryAddress;
            return f0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f164266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f164267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f164268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164269g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f164271j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f164269g = obj;
            this.f164271j |= PKIFailureInfo.systemUnavail;
            return t.this.N9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$k;", "action", "Lq32/e$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/c$k;Lq32/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<q32.c.OnLinkClick, q32.e.EmptyState, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164273f;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.OnLinkClick onLinkClick = (q32.c.OnLinkClick) this.f164273f;
            Object objE = uq.b.e();
            int i15 = this.f164272e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = t.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(onLinkClick.getUrl(), false, 2, null);
                this.f164273f = vq.j.a(onLinkClick);
                this.f164272e = 1;
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
                tVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.OnLinkClick onLinkClick, q32.e.EmptyState emptyState, tq.e<? super i0> eVar) {
            g0 g0Var = t.this.new g0(eVar);
            g0Var.f164273f = onLinkClick;
            return g0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f164275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f164276e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f164278g;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f164276e = obj;
            this.f164278g |= PKIFailureInfo.systemUnavail;
            return t.this.O9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements mu.g<q32.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f164279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f164280b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f164281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f164282b;

            /* JADX INFO: renamed from: q32.t$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4080a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f164283d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f164284e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f164285f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f164287h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f164288j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f164289k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f164290l;

                public C4080a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f164283d = obj;
                    this.f164284e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f164281a = hVar;
                this.f164282b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4080a c4080a;
                if (eVar instanceof C4080a) {
                    c4080a = (C4080a) eVar;
                    int i15 = c4080a.f164284e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4080a.f164284e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4080a = new C4080a(eVar);
                    }
                } else {
                    c4080a = new C4080a(eVar);
                }
                Object obj2 = c4080a.f164283d;
                Object objE = uq.b.e();
                int i16 = c4080a.f164284e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f164281a;
                    q32.f.a aVarB = this.f164282b.oAuthWebViewScreenMapper.b(new s32.c.Params((q32.e) obj, this.f164282b.new j(), this.f164282b.new k(), this.f164282b.new l(), this.f164282b.new m(), this.f164282b.new n()));
                    c4080a.f164285f = vq.j.a(obj);
                    c4080a.f164287h = vq.j.a(c4080a);
                    c4080a.f164288j = vq.j.a(obj);
                    c4080a.f164289k = vq.j.a(hVar);
                    c4080a.f164290l = 0;
                    c4080a.f164284e = 1;
                    if (hVar.F(aVarB, c4080a) == objE) {
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

        public i(mu.g gVar, t tVar) {
            this.f164279a = gVar;
            this.f164280b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super q32.f.a> hVar, tq.e eVar) {
            Object objA = this.f164279a.a(new a(hVar, this.f164280b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements er.a<i0> {
        j() {
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            if (t.this.setupData.a() != null) {
                t.this.d9(q32.c.a.f164124a);
            } else {
                t.this.d9(q32.c.b.f164125a);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k implements er.l<String, i0> {
        k() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(String str) {
            c(str);
            return i0.f148189a;
        }

        public final void c(String str) {
            t.this.d9(new q32.c.OnLinkClick(str));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l implements er.p<Uri, String, i0> {
        l() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(Uri uri, String str) {
            c(uri, str);
            return i0.f148189a;
        }

        public final void c(Uri uri, String str) {
            t.this.d9(new q32.c.HandleUrl(uri, str));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m implements er.p<String, er.l<? super String, ? extends i0>, i0> {
        m() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(String str, er.l<? super String, ? extends i0> lVar) {
            c(str, lVar);
            return i0.f148189a;
        }

        public final void c(String str, er.l<? super String, i0> lVar) {
            Uri uri;
            r32.a.b bVarA = r32.a.b.INSTANCE.a((str == null || (uri = Uri.parse(str)) == null) ? null : uri.getLastPathSegment());
            if (bVarA != null) {
                t.this.J9(bVarA);
            } else {
                t.this.d9(new q32.c.ScriptExecution(str, lVar));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n implements er.q<String, Integer, SslCertificate, i0> {
        n() {
        }

        public final void c(String str, int i15, SslCertificate sslCertificate) {
            t.this.d9(q32.c.g.f164131a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(String str, Integer num, SslCertificate sslCertificate) {
            c(str, num.intValue(), sslCertificate);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq32/c$b;", "<unused var>", "Lq32/e;", "Loq/i0;", "<anonymous>", "(Lq32/c$b;Lq32/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<q32.c.b, q32.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164296e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164296e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q32.c.j> bVarY1 = t.this.Y1();
                q32.c.j.b bVar = q32.c.j.b.f164139a;
                this.f164296e = 1;
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
        public final Object w(q32.c.b bVar, q32.e eVar, tq.e<? super i0> eVar2) {
            return t.this.new o(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq32/c$a;", "<unused var>", "Lq32/e;", "Loq/i0;", "<anonymous>", "(Lq32/c$a;Lq32/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<q32.c.a, q32.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164298e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164298e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q32.c.j> bVarY1 = t.this.Y1();
                q32.c.j.a aVar = q32.c.j.a.f164138a;
                this.f164298e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(q32.c.a aVar, q32.e eVar, tq.e<? super i0> eVar2) {
            return t.this.new p(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq32/c$g;", "<unused var>", "Lq32/e;", "Loq/i0;", "<anonymous>", "(Lq32/c$g;Lq32/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<q32.c.g, q32.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164300e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f164300e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t tVar = t.this;
            tVar.I9(tVar.generalError);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.g gVar, q32.e eVar, tq.e<? super i0> eVar2) {
            return t.this.new q(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq32/c$d;", "action", "Lk10/c0;", "Lq32/e;", "state", "Lk10/l;", "<anonymous>", "(Lq32/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<q32.c.Fail, k10.c0<q32.e>, tq.e<? super k10.l<? extends q32.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164304g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q32.e.Error O(t tVar, q32.c.Fail fail, q32.e eVar) {
            return new q32.e.Error(tVar.errorVMSFactory.a(fail.getErrorData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q32.c.Fail fail = (q32.c.Fail) this.f164303f;
            k10.c0 c0Var = (k10.c0) this.f164304g;
            uq.b.e();
            if (this.f164302e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: q32.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.r.O(tVar, fail, (e) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.Fail fail, k10.c0<q32.e> c0Var, tq.e<? super k10.l<? extends q32.e>> eVar) {
            r rVar = t.this.new r(eVar);
            rVar.f164303f = fail;
            rVar.f164304g = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq32/e$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq32/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.p<q32.e.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164306e;

        s(tq.e<? super s> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164306e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                this.f164306e = 1;
                if (tVar.F9(this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(q32.e.c cVar, tq.e<? super i0> eVar) {
            return ((s) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new s(eVar);
        }
    }

    /* JADX INFO: renamed from: q32.t$t, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq32/c$l;", "action", "Lk10/c0;", "Lq32/e$c;", "state", "Lk10/l;", "Lq32/e;", "<anonymous>", "(Lq32/c$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C4081t extends vq.k implements er.q<q32.c.Redirect, k10.c0<q32.e.c>, tq.e<? super k10.l<? extends q32.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164310g;

        C4081t(tq.e<? super C4081t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q32.e.Redirecting O(q32.c.Redirect redirect, q32.e.c cVar) {
            return new q32.e.Redirecting(redirect.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q32.c.Redirect redirect = (q32.c.Redirect) this.f164309f;
            k10.c0 c0Var = (k10.c0) this.f164310g;
            uq.b.e();
            if (this.f164308e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q32.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.C4081t.O(redirect, (e.c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.Redirect redirect, k10.c0<q32.e.c> c0Var, tq.e<? super k10.l<? extends q32.e>> eVar) {
            C4081t c4081t = new C4081t(eVar);
            c4081t.f164309f = redirect;
            c4081t.f164310g = c0Var;
            return c4081t.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq32/c$r;", "action", "Lk10/c0;", "Lq32/e$d;", "state", "Lk10/l;", "Lq32/e;", "<anonymous>", "(Lq32/c$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<q32.c.r, k10.c0<q32.e.Redirecting>, tq.e<? super k10.l<? extends q32.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164312f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q32.e.Redirecting O(InitializedData initializedData, q32.e.Redirecting redirecting) {
            return redirecting.a(initializedData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f164312f;
            uq.b.e();
            if (this.f164311e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final InitializedData initializedDataB = InitializedData.b(((q32.e.Redirecting) c0Var.a()).getData(), ((q32.e.Redirecting) c0Var.a()).getData().getTimeOutLeftTimeSec() - 1, null, null, null, null, null, false, false, 254, null);
            return c0Var.b(new er.l() { // from class: q32.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.u.O(initializedDataB, (e.Redirecting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.r rVar, k10.c0<q32.e.Redirecting> c0Var, tq.e<? super k10.l<? extends q32.e>> eVar) {
            u uVar = new u(eVar);
            uVar.f164312f = c0Var;
            return uVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$i;", "action", "Lq32/e$d;", "state", "Loq/i0;", "<anonymous>", "(Lq32/c$i;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<q32.c.HandleUrl, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164315g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.HandleUrl handleUrl = (q32.c.HandleUrl) this.f164314f;
            q32.e.Redirecting redirecting = (q32.e.Redirecting) this.f164315g;
            uq.b.e();
            if (this.f164313e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.L9(handleUrl.getUrl(), handleUrl.getScheme(), redirecting.getData().getIamOwTokenUrl());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.HandleUrl handleUrl, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            v vVar = t.this.new v(eVar);
            vVar.f164314f = handleUrl;
            vVar.f164315g = redirecting;
            return vVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq32/c$o;", "action", "Lq32/e$d;", "state", "Loq/i0;", "<anonymous>", "(Lq32/c$o;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<q32.c.ScriptExecution, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164319g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.c.ScriptExecution scriptExecution = (q32.c.ScriptExecution) this.f164318f;
            q32.e.Redirecting redirecting = (q32.e.Redirecting) this.f164319g;
            uq.b.e();
            if (this.f164317e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.E9(redirecting.getData().f(), scriptExecution.a(), scriptExecution.getUrl());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.ScriptExecution scriptExecution, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            w wVar = t.this.new w(eVar);
            wVar.f164318f = scriptExecution;
            wVar.f164319g = redirecting;
            return wVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgu/b;", "step", "Lq32/e$d;", "state", "Loq/i0;", "<anonymous>", "(Lgu/b;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<gu.b, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164322f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q32.e.Redirecting redirecting = (q32.e.Redirecting) this.f164322f;
            Object objE = uq.b.e();
            int i15 = this.f164321e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                this.f164322f = vq.j.a(redirecting);
                this.f164321e = 1;
                if (tVar.K9(redirecting, this) == objE) {
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

        public final Object M(long j15, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            x xVar = t.this.new x(eVar);
            xVar.f164322f = redirecting;
            return xVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(gu.b bVar, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            return M(bVar.getRawValue(), redirecting, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq32/c$c;", "action", "Lk10/c0;", "Lq32/e$d;", "state", "Lk10/l;", "Lq32/e;", "<anonymous>", "(Lq32/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<q32.c.DisplayEmptyState, k10.c0<q32.e.Redirecting>, tq.e<? super k10.l<? extends q32.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f164325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f164326g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q32.e.EmptyState O(q32.c.DisplayEmptyState displayEmptyState, q32.e.Redirecting redirecting) {
            return new q32.e.EmptyState(displayEmptyState.getEmptyState());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q32.c.DisplayEmptyState displayEmptyState = (q32.c.DisplayEmptyState) this.f164325f;
            k10.c0 c0Var = (k10.c0) this.f164326g;
            uq.b.e();
            if (this.f164324e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: q32.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.y.O(displayEmptyState, (e.Redirecting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q32.c.DisplayEmptyState displayEmptyState, k10.c0<q32.e.Redirecting> c0Var, tq.e<? super k10.l<? extends q32.e>> eVar) {
            y yVar = new y(eVar);
            yVar.f164325f = displayEmptyState;
            yVar.f164326g = c0Var;
            return yVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq32/c$q;", "<unused var>", "Lq32/e$d;", "Loq/i0;", "<anonymous>", "(Lq32/c$q;Lq32/e$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<q32.c.q, q32.e.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f164327e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f164327e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q32.c.j> bVarY1 = t.this.Y1();
                q32.c.j.C4078c c4078c = q32.c.j.C4078c.f164140a;
                this.f164327e = 1;
                if (bVarY1.F(c4078c, this) == objE) {
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
        public final Object w(q32.c.q qVar, q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
            return t.this.new z(eVar).J(i0.f148189a);
        }
    }

    public t(yy.a aVar, mx.c cVar, xn3.a aVar2, go0.a0 a0Var, go0.x xVar, go0.n nVar, go0.d0 d0Var, s02.k kVar, p02.w wVar, a14.w wVar2, s02.h hVar, a14.c cVar2, c54.b bVar, s32.c cVar3, i70.e eVar, s32.e eVar2, hb4.d dVar, ez.g gVar, OAuthWebViewData oAuthWebViewData) {
        this.sendCodeToInstitutionUseCase = aVar2;
        this.getOAuthConfigurationUseCase = a0Var;
        this.getOwTokenUC = xVar;
        this.getCentralTokenUC = nVar;
        this.refreshOwTokensUseCase = d0Var;
        this.saveTokensUseCase = kVar;
        this.getOwnerAddressUseCase = wVar;
        this.openUrlIntentUseCase = wVar2;
        this.saveCentralAccessTokenUseCase = hVar;
        this.clearWebViewUC = cVar2;
        this.isFeatureEnabledUseCase = bVar;
        this.oAuthWebViewScreenMapper = cVar3;
        this.globalSnackBarManager = eVar;
        this.webViewErrorMapper = eVar2;
        this.errorVMSFactory = dVar;
        this.ticker = gVar;
        this.setupData = oAuthWebViewData;
        this.generalError = new dx.b.Business(n02.a.GENERAL, null, cVar.c(e02.a.f46646z), cVar.c(e02.a.W1), null, cVar.c(e02.a.f46550j), null, 82, null);
        this.stateMachine = aVar.a(q32.e.c.f164165a, new er.l() { // from class: q32.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.Q9(this.f164190a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 E9(List<ExecutionData> scriptsList, er.l<? super String, i0> callback, String url) {
        Object next;
        Iterator<T> it = scriptsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ExecutionData executionData = (ExecutionData) next;
            if (url != null && fu.r.V(url, executionData.getDestUrl(), false, 2, null)) {
                break;
            }
        }
        ExecutionData executionData2 = (ExecutionData) next;
        if (executionData2 == null) {
            return null;
        }
        callback.b(executionData2.getScriptToExecute());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F9(tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        OAuthConfiguration oAuthConfiguration;
        List list;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f164226l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f164226l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f164224j;
        Object objE = uq.b.e();
        int i16 = cVar.f164226l;
        if (i16 == 0) {
            oq.u.b(objC);
            go0.a0 a0Var = this.getOAuthConfigurationUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f164226l = 1;
            objC = a0Var.c(c1792a, cVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            oq.u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) cVar.f164221f;
            oAuthConfiguration = (OAuthConfiguration) cVar.f164220e;
            oq.u.b(objC);
            list = list2;
        }
        d9(new q32.c.Redirect(new InitializedData(15, "mobywatel", oAuthConfiguration.getEdorUrl(), "Firefox", oAuthConfiguration.getIamOwTokenUrl(), list, this.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue(), this.isFeatureEnabledUseCase.a(b54.c.EDOR_OAUTH_WEB_VIEW_VISIBLE).booleanValue())));
        return i0.f148189a;
        dx.i iVar = (dx.i) objC;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            oAuthConfiguration = (OAuthConfiguration) ((dx.i.Right) iVar).b();
            List listE = pq.v.e(new ExecutionData(oAuthConfiguration.getSsoUrl(), "document.getElementById(\"go-mobywatel\").click()"));
            a14.c cVar2 = this.clearWebViewUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            cVar.f164219d = vq.j.a(iVar);
            cVar.f164220e = oAuthConfiguration;
            cVar.f164221f = listE;
            cVar.f164222g = 0;
            cVar.f164223h = 0;
            cVar.f164226l = 2;
            if (cVar2.c(c1792a2, cVar) != objE) {
                list = listE;
                d9(new q32.c.Redirect(new InitializedData(15, "mobywatel", oAuthConfiguration.getEdorUrl(), "Firefox", oAuthConfiguration.getIamOwTokenUrl(), list, this.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue(), this.isFeatureEnabledUseCase.a(b54.c.EDOR_OAUTH_WEB_VIEW_VISIBLE).booleanValue())));
            }
            return objE;
        }
        d9(q32.c.g.f164131a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object G9(String str, String str2, tq.e<? super i0> eVar) throws Throwable {
        d dVar;
        String str3;
        dx.i iVar;
        OwTokens owTokens;
        int i15;
        String str4;
        String str5;
        int i16;
        dx.i iVar2;
        CentralTokens centralTokens;
        s02.h hVar;
        s02.h.Params params;
        OwTokens owTokens2;
        String str6;
        CentralTokens centralTokens2;
        String str7 = str;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i17 = dVar.f164242r;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f164242r = i17 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f164240p;
        Object objE = uq.b.e();
        int i18 = dVar.f164242r;
        if (i18 == 0) {
            oq.u.b(objC);
            go0.x xVar = this.getOwTokenUC;
            str3 = str2;
            go0.x.Params params2 = new go0.x.Params(str7, str3, null);
            dVar.f164230d = str7;
            dVar.f164231e = vq.j.a(str3);
            dVar.f164242r = 1;
            objC = xVar.c(params2, dVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            String str8 = (String) dVar.f164231e;
            String str9 = (String) dVar.f164230d;
            oq.u.b(objC);
            str3 = str8;
            str7 = str9;
        } else {
            if (i18 == 2) {
                i16 = dVar.f164237l;
                i15 = dVar.f164236k;
                owTokens = (OwTokens) dVar.f164233g;
                iVar = (dx.i) dVar.f164232f;
                str4 = (String) dVar.f164231e;
                str5 = (String) dVar.f164230d;
                oq.u.b(objC);
                iVar2 = (dx.i) objC;
                if (!(iVar2 instanceof dx.i.Left)) {
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    centralTokens = (CentralTokens) ((dx.i.Right) iVar2).b();
                    hVar = this.saveCentralAccessTokenUseCase;
                    params = new s02.h.Params(centralTokens.getAccess());
                    dVar.f164230d = str5;
                    dVar.f164231e = vq.j.a(str4);
                    dVar.f164232f = vq.j.a(iVar);
                    dVar.f164233g = owTokens;
                    dVar.f164234h = vq.j.a(iVar2);
                    dVar.f164235j = centralTokens;
                    dVar.f164236k = i15;
                    dVar.f164237l = i16;
                    dVar.f164238m = 0;
                    dVar.f164239n = 0;
                    dVar.f164242r = 3;
                    if (hVar.d(params, dVar) != objE) {
                        owTokens2 = owTokens;
                        str6 = str5;
                        centralTokens2 = centralTokens;
                    }
                    return objE;
                }
                I9(this.generalError);
                return i0.f148189a;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            centralTokens2 = (CentralTokens) dVar.f164235j;
            owTokens2 = (OwTokens) dVar.f164233g;
            str6 = (String) dVar.f164230d;
            oq.u.b(objC);
        }
        d9(new q32.c.GetElectronicDeliveryAddress(str6, centralTokens2.getAccess(), owTokens2.getRefresh(), owTokens2.getAccess()));
        return i0.f148189a;
        iVar = (dx.i) objC;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokens owTokens3 = (OwTokens) ((dx.i.Right) iVar).b();
            go0.n nVar = this.getCentralTokenUC;
            go0.n.Params params3 = new go0.n.Params(str7, owTokens3.getAccess());
            dVar.f164230d = str7;
            dVar.f164231e = vq.j.a(str3);
            dVar.f164232f = vq.j.a(iVar);
            dVar.f164233g = owTokens3;
            dVar.f164236k = 0;
            dVar.f164237l = 0;
            dVar.f164242r = 2;
            Object objC2 = nVar.c(params3, dVar);
            if (objC2 != objE) {
                owTokens = owTokens3;
                objC = objC2;
                i15 = 0;
                str4 = str3;
                str5 = str7;
                i16 = 0;
                iVar2 = (dx.i) objC;
                if (!(iVar2 instanceof dx.i.Left)) {
                    I9(this.generalError);
                } else {
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    centralTokens = (CentralTokens) ((dx.i.Right) iVar2).b();
                    hVar = this.saveCentralAccessTokenUseCase;
                    params = new s02.h.Params(centralTokens.getAccess());
                    dVar.f164230d = str5;
                    dVar.f164231e = vq.j.a(str4);
                    dVar.f164232f = vq.j.a(iVar);
                    dVar.f164233g = owTokens;
                    dVar.f164234h = vq.j.a(iVar2);
                    dVar.f164235j = centralTokens;
                    dVar.f164236k = i15;
                    dVar.f164237l = i16;
                    dVar.f164238m = 0;
                    dVar.f164239n = 0;
                    dVar.f164242r = 3;
                    if (hVar.d(params, dVar) != objE) {
                        owTokens2 = owTokens;
                        str6 = str5;
                        centralTokens2 = centralTokens;
                        d9(new q32.c.GetElectronicDeliveryAddress(str6, centralTokens2.getAccess(), owTokens2.getRefresh(), owTokens2.getAccess()));
                    }
                }
            }
            return objE;
        }
        I9(this.generalError);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H9(String str, CentralTokens.Access access, OwTokens.Refresh refresh, OwTokens.Access access2, tq.e<? super i0> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f164252k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f164252k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f164250h;
        Object objE = uq.b.e();
        int i16 = eVar2.f164252k;
        if (i16 == 0) {
            oq.u.b(objA);
            p02.w wVar = this.getOwnerAddressUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f164246d = str;
            eVar2.f164247e = access;
            eVar2.f164248f = refresh;
            eVar2.f164249g = access2;
            eVar2.f164252k = 1;
            objA = wVar.a(c1792a, eVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            access2 = (OwTokens.Access) eVar2.f164249g;
            refresh = (OwTokens.Refresh) eVar2.f164248f;
            access = (CentralTokens.Access) eVar2.f164247e;
            str = (String) eVar2.f164246d;
            oq.u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            d9(q32.c.g.f164131a);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwnerAddress ownerAddress = (OwnerAddress) ((dx.i.Right) iVar).b();
            if (ownerAddress.getAddressData() == null && ownerAddress.getEmptyState() == null) {
                d9(q32.c.g.f164131a);
            }
            AddressData addressData = ownerAddress.getAddressData();
            if (addressData != null) {
                iy.b0 edorAddress = addressData.getEdorAddress();
                if (edorAddress != null) {
                    switch (b.f164215a[addressData.getStatus().ordinal()]) {
                        case 1:
                            d9(new q32.c.RefreshOwTokens(str, edorAddress, refresh, access));
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            EmptyState emptyState = ownerAddress.getEmptyState();
                            if (emptyState == null) {
                                d9(q32.c.g.f164131a);
                            } else {
                                d9(new q32.c.DisplayEmptyState(emptyState));
                            }
                            break;
                        default:
                            throw new oq.p();
                    }
                } else {
                    d9(new q32.c.SaveTokens(access2, refresh, access));
                }
            } else {
                EmptyState emptyState2 = ownerAddress.getEmptyState();
                if (emptyState2 != null) {
                    d9(new q32.c.DisplayEmptyState(emptyState2));
                } else {
                    d9(q32.c.g.f164131a);
                }
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I9(dx.b domainError) {
        d9(new q32.c.Fail(this.webViewErrorMapper.b(new s32.e.a.Domain(domainError, b9(q32.c.b.f164125a)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(r32.a error) {
        d9(new q32.c.Fail(this.webViewErrorMapper.b(new s32.e.a.WebView(error, b9(q32.c.b.f164125a)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K9(q32.e.Redirecting redirecting, tq.e<? super i0> eVar) {
        if (redirecting.getData().getTimeOutLeftTimeSec() > 0) {
            d9(q32.c.r.f164154a);
        } else {
            h2.f(eVar.getContext(), null, 1, null);
            d9(q32.c.g.f164131a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L9(Uri url, String scheme, String tokenUrl) {
        String path = url.getPath();
        if (path == null || !fr.t.c(scheme, "mobywatel")) {
            return;
        }
        if (fu.r.V(path, "/institution", false, 2, null)) {
            String queryParameter = url.getQueryParameter("qrCode");
            if (queryParameter != null) {
                d9(new q32.c.SendDataToInstitution(queryParameter));
            } else {
                d9(q32.c.g.f164131a);
            }
        }
        if (fu.r.V(path, "/edelivery", false, 2, null)) {
            String queryParameter2 = url.getQueryParameter("code");
            if (queryParameter2 != null) {
                d9(new q32.c.FetchTokens(tokenUrl, queryParameter2));
            } else {
                d9(q32.c.g.f164131a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M9(String str, iy.b0 b0Var, OwTokens.Refresh refresh, CentralTokens.Access access, tq.e<? super i0> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f164262k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f164262k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objC = fVar.f164260h;
        Object objE = uq.b.e();
        int i16 = fVar.f164262k;
        if (i16 == 0) {
            oq.u.b(objC);
            go0.d0 d0Var = this.refreshOwTokensUseCase;
            go0.d0.Params params = new go0.d0.Params(str, eo0.x.a(b0Var), refresh, null);
            fVar.f164256d = vq.j.a(str);
            fVar.f164257e = vq.j.a(b0Var);
            fVar.f164258f = vq.j.a(refresh);
            fVar.f164259g = access;
            fVar.f164262k = 1;
            objC = d0Var.c(params, fVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            access = (CentralTokens.Access) fVar.f164259g;
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(q32.c.g.f164131a);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokens owTokens = (OwTokens) ((dx.i.Right) iVar).b();
            owTokens.getRefresh();
            d9(new q32.c.SaveTokens(owTokens.getAccess(), owTokens.getRefresh(), access));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N9(OwTokens.Access access, OwTokens.Refresh refresh, CentralTokens.Access access2, tq.e<? super i0> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f164271j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f164271j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f164269g;
        Object objE = uq.b.e();
        int i16 = gVar.f164271j;
        if (i16 == 0) {
            oq.u.b(obj);
            s02.k kVar = this.saveTokensUseCase;
            s02.k.Params params = new s02.k.Params(access, refresh, access2);
            gVar.f164266d = vq.j.a(access);
            gVar.f164267e = vq.j.a(refresh);
            gVar.f164268f = vq.j.a(access2);
            gVar.f164271j = 1;
            if (kVar.d(params, gVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        d9(q32.c.f.f164130a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O9(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f164278g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f164278g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objC = hVar.f164276e;
        Object objE = uq.b.e();
        int i16 = hVar.f164278g;
        if (i16 == 0) {
            oq.u.b(objC);
            xn3.a aVar = this.sendCodeToInstitutionUseCase;
            xn3.a.Params params = new xn3.a.Params(str);
            hVar.f164275d = vq.j.a(str);
            hVar.f164278g = 1;
            objC = aVar.c(params, hVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            I9(this.generalError);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(q32.e.class), new er.l() { // from class: q32.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.R9(this.f164186a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(q32.e.c.class), new er.l() { // from class: q32.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.S9(this.f164187a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(q32.e.Error.class), new er.l() { // from class: q32.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.T9((k10.z) obj);
            }
        });
        vVar.c(q0.c(q32.e.Redirecting.class), new er.l() { // from class: q32.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.U9(this.f164188a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(q32.e.EmptyState.class), new er.l() { // from class: q32.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.V9(this.f164189a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(t tVar, k10.z zVar) {
        o oVar = tVar.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q32.c.b.class), oVar2, oVar);
        zVar.x(q0.c(q32.c.a.class), oVar2, tVar.new p(null));
        zVar.x(q0.c(q32.c.g.class), oVar2, tVar.new q(null));
        zVar.v(q0.c(q32.c.Fail.class), oVar2, tVar.new r(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(t tVar, k10.z zVar) {
        zVar.C(tVar.new s(null));
        C4081t c4081t = new C4081t(null);
        zVar.v(q0.c(q32.c.Redirect.class), k10.o.CANCEL_PREVIOUS, c4081t);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(k10.z zVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(t tVar, k10.z zVar) {
        k10.k.s(zVar, ez.g.b(tVar.ticker, 0L, 1, null), null, tVar.new x(null), 2, null);
        y yVar = new y(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(q32.c.DisplayEmptyState.class), oVar, yVar);
        zVar.x(q0.c(q32.c.q.class), oVar, tVar.new z(null));
        zVar.x(q0.c(q32.c.f.class), oVar, tVar.new a0(null));
        zVar.x(q0.c(q32.c.SendDataToInstitution.class), oVar, tVar.new b0(null));
        zVar.x(q0.c(q32.c.SaveTokens.class), oVar, tVar.new c0(null));
        zVar.x(q0.c(q32.c.FetchTokens.class), oVar, tVar.new d0(null));
        zVar.x(q0.c(q32.c.RefreshOwTokens.class), oVar, tVar.new e0(null));
        zVar.x(q0.c(q32.c.GetElectronicDeliveryAddress.class), oVar, tVar.new f0(null));
        zVar.v(q0.c(q32.c.r.class), oVar, new u(null));
        zVar.x(q0.c(q32.c.HandleUrl.class), oVar, tVar.new v(null));
        zVar.x(q0.c(q32.c.ScriptExecution.class), oVar, tVar.new w(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(t tVar, k10.z zVar) {
        g0 g0Var = tVar.new g0(null);
        zVar.x(q0.c(q32.c.OnLinkClick.class), k10.o.CANCEL_PREVIOUS, g0Var);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(OAuthWebViewData oAuthWebViewData) {
        super.P5(oAuthWebViewData);
    }

    @Override // zx.b
    public xw.b<q32.c.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<q32.e, q32.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<q32.f.a> getState() {
        return this.state;
    }
}
