package lx3;

import android.net.Uri;
import android.net.http.SslCertificate;
import eo0.CentralTokens;
import eo0.OAuthConfiguration;
import eo0.OwTokens;
import fr.q0;
import go0.d0;
import hx3.KeycloakAuthData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ju.h2;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w70.ExecutionData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ³\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002´\u0001B³\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202H\u0082@¢\u0006\u0004\b3\u00104J$\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u000202072\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b9\u0010:J(\u0010>\u001a\u0002022\u0006\u0010;\u001a\u0002052\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u000205H\u0082@¢\u0006\u0004\b>\u0010?J(\u0010D\u001a\u0002022\u0006\u0010;\u001a\u0002052\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0082@¢\u0006\u0004\bD\u0010EJ0\u0010H\u001a\u0002022\u0006\u0010;\u001a\u0002052\u0006\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0082@¢\u0006\u0004\bH\u0010IJ7\u0010M\u001a\u0002022\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@2\u0006\u0010L\u001a\u0002052\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bM\u0010NJ\u0018\u0010Q\u001a\u0002022\u0006\u0010P\u001a\u00020OH\u0082@¢\u0006\u0004\bQ\u0010RJ/\u0010W\u001a\u0002022\u0006\u0010;\u001a\u00020S2\u0006\u0010T\u001a\u0002052\u0006\u0010U\u001a\u0002052\u0006\u0010V\u001a\u000205H\u0002¢\u0006\u0004\bW\u0010XJ'\u0010\\\u001a\u0002052\u0006\u0010Y\u001a\u00020S2\u0006\u0010Z\u001a\u0002052\u0006\u0010[\u001a\u000205H\u0002¢\u0006\u0004\b\\\u0010]J=\u0010c\u001a\u0004\u0018\u0001022\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002020a2\b\u0010;\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u0002022\u0006\u0010e\u001a\u000208H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u0002022\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bj\u0010kJ#\u0010o\u001a\u00020n*\u00020S2\u0006\u0010l\u001a\u0002052\u0006\u0010m\u001a\u000205H\u0002¢\u0006\u0004\bo\u0010pJ\u0018\u0010s\u001a\u0002022\u0006\u0010r\u001a\u00020qH\u0096\u0001¢\u0006\u0004\bs\u0010tJ\u0010\u0010u\u001a\u000202H\u0096\u0001¢\u0006\u0004\bu\u0010vR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R+\u0010¥\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030¡\u00018\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bs\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R&\u0010P\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R'\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001¨\u0006µ\u0001"}, d2 = {"Llx3/p;", "Ll00/g;", "Llx3/c;", "Llx3/a;", "Llx3/d;", "Lhx3/c;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lk54/l;", "sendCodeToInstitutionUC", "Lgo0/a0;", "getWebViewConfigurationUC", "Lgo0/x;", "getOwTokenUC", "Lgo0/n;", "getCentralTokenUC", "Lgo0/d0;", "refreshOwTokensUseCase", "Lk54/j;", "saveKeycloakCentralAccessTokenUC", "Lkx3/g;", "saveKeycloakTokensUC", "Lkx3/b;", "fetchOwnerAddressUC", "La14/c;", "clearWebViewUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lox3/c;", "mapper", "Lox3/b;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Lu04/a;", "commonEndpoints", "Lez/g;", "ticker", "Lkx3/c;", "generateSecretPropertiesUC", "Lhx3/a;", "setupData", "<init>", "(Lyy/a;Lmx/c;Lk54/l;Lgo0/a0;Lgo0/x;Lgo0/n;Lgo0/d0;Lk54/j;Lkx3/g;Lkx3/b;La14/c;Lc54/b;Lox3/c;Lox3/b;Lhb4/d;La14/w;Li70/e;Lu04/a;Lez/g;Lkx3/c;Lhx3/a;)V", "Loq/i0;", "I9", "(Ltq/e;)Ljava/lang/Object;", "", "qrCode", "Ldx/i;", "Ldx/b;", "R9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "url", "code", "codeVerifier", "H9", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Leo0/k$a;", "centralAccessToken", "Leo0/i0$c;", "owRefreshToken", "J9", "(Ljava/lang/String;Leo0/k$a;Leo0/i0$c;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "edorAddress", "P9", "(Ljava/lang/String;Liy/b0;Leo0/i0$c;Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "owAccessToken", "refreshOwTokenUrl", "Q9", "(Leo0/i0$a;Leo0/i0$c;Leo0/k$a;Ljava/lang/String;Liy/b0;)V", "Llx3/c$c;", "state", "N9", "(Llx3/c$c;Ltq/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "scheme", "tokenUrl", "stateParameter", "O9", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "stateParameterValue", "codeChallenge", "E9", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "Lw70/a;", "scriptsList", "Lkotlin/Function1;", "callback", "G9", "(Ljava/util/List;Ler/l;Ljava/lang/String;)Loq/i0;", "domainError", "L9", "(Ldx/b;)V", "Lnx3/a;", "error", "M9", "(Lnx3/a;)V", "key", "value", "Landroid/net/Uri$Builder;", "D9", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lk54/l;", "c", "Lgo0/a0;", "d", "Lgo0/x;", "e", "Lgo0/n;", "f", "Lgo0/d0;", "g", "Lk54/j;", "h", "Lkx3/g;", "j", "Lkx3/b;", "k", "La14/c;", "l", "Lc54/b;", "m", "Lox3/c;", "n", "Lox3/b;", "p", "Lhb4/d;", "q", "La14/w;", "r", "Li70/e;", "s", "Lu04/a;", "t", "Lez/g;", "v", "Lkx3/c;", "w", "Lhx3/a;", "Ldx/b$c;", "x", "Ldx/b$c;", "generalError", "Lk10/t;", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Llx3/d$a;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lhx3/c$a;", "A", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "B", "a", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<lx3.c, lx3.a> implements lx3.d, hx3.c, i70.e {
    private static final a B = new a(null);
    public static final int C = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k54.l sendCodeToInstitutionUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final go0.a0 getWebViewConfigurationUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go0.x getOwTokenUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final go0.n getCentralTokenUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d0 refreshOwTokensUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k54.j saveKeycloakCentralAccessTokenUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kx3.g saveKeycloakTokensUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final kx3.b fetchOwnerAddressUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.c clearWebViewUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ox3.c mapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ox3.b errorMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ez.g ticker;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final kx3.c generateSecretPropertiesUC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final KeycloakAuthData setupData;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business generalError;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final k10.t<lx3.c, lx3.a> stateMachine;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p0<lx3.d.a> state = a9(new h(e9().getState(), this), lx3.d.a.b.f121211a);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final xw.b<hx3.c.a> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Llx3/p$a;", "", "<init>", "()V", "", "INITIAL_TIMEOUT_SEC", "I", "COUNTER_STEP_VALUE", "", "CUSTOM_USER_AGENT", "Ljava/lang/String;", "SCHEME", "INSTITUTION_PREFIX", "E_DELIVERY_PREFIX", "QR_CODE_PARAMETER", "CODE_PARAMETER", "STATE_PARAMETER_KEY", "CODE_CHALLENGE_METHOD_PARAMETER", "CODE_CHALLENGE_METHOD", "CODE_CHALLENGE_PARAMETER", "LOGIN_JS_SCRIPT_CLICK", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llx3/a$o;", "<unused var>", "Lk10/c0;", "Llx3/c$c;", "state", "Lk10/l;", "Llx3/c;", "<anonymous>", "(Llx3/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<lx3.a.o, c0<lx3.c.Redirecting>, tq.e<? super k10.l<? extends lx3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121251f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lx3.c.Redirecting O(InitializedData initializedData, lx3.c.Redirecting redirecting) {
            return redirecting.a(initializedData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f121251f;
            uq.b.e();
            if (this.f121250e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final InitializedData initializedDataB = InitializedData.b(((lx3.c.Redirecting) c0Var.a()).getData(), ((lx3.c.Redirecting) c0Var.a()).getData().getTimeOutLeftTimeSec() - 1, null, null, null, null, null, false, false, null, null, 1022, null);
            return c0Var.b(new er.l() { // from class: lx3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.a0.O(initializedDataB, (c.Redirecting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.o oVar, c0<lx3.c.Redirecting> c0Var, tq.e<? super k10.l<? extends lx3.c>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f121251f = c0Var;
            return a0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121252a;

        static {
            int[] iArr = new int[i54.a.AddressData.b.values().length];
            try {
                iArr[i54.a.AddressData.b.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i54.a.AddressData.b.RESERVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i54.a.AddressData.b.STRUCK_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i54.a.AddressData.b.CLOSED_RECOVERABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i54.a.AddressData.b.CLOSED_UNRECOVERABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i54.a.AddressData.b.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f121252a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$h;", "action", "Llx3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Llx3/a$h;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<lx3.a.HandleUrl, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121255g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.HandleUrl handleUrl = (lx3.a.HandleUrl) this.f121254f;
            lx3.c.Redirecting redirecting = (lx3.c.Redirecting) this.f121255g;
            uq.b.e();
            if (this.f121253e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.O9(handleUrl.getUrl(), handleUrl.getScheme(), redirecting.getData().getIamOwTokenUrl(), redirecting.getData().getStateParameterValue());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.HandleUrl handleUrl, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            b0 b0Var = p.this.new b0(eVar);
            b0Var.f121254f = handleUrl;
            b0Var.f121255g = redirecting;
            return b0Var.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f121260g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f121261h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121262j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f121263k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f121264l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121266n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121264l = obj;
            this.f121266n |= PKIFailureInfo.systemUnavail;
            return p.this.H9(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f121270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f121271h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121272j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f121273k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f121274l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f121275m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f121276n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f121278q;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121276n = obj;
            this.f121278q |= PKIFailureInfo.systemUnavail;
            return p.this.I9(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121282g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121284j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121282g = obj;
            this.f121284j |= PKIFailureInfo.systemUnavail;
            return p.this.J9(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f121288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f121289h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f121291k;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121289h = obj;
            this.f121291k |= PKIFailureInfo.systemUnavail;
            return p.this.P9(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121293e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121295g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121293e = obj;
            this.f121295g |= PKIFailureInfo.systemUnavail;
            return p.this.R9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements mu.g<lx3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f121296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f121297b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f121298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f121299b;

            /* JADX INFO: renamed from: lx3.p$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2969a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f121300d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f121301e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f121302f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f121304h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f121305j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f121306k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f121307l;

                public C2969a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f121300d = obj;
                    this.f121301e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f121298a = hVar;
                this.f121299b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2969a c2969a;
                if (eVar instanceof C2969a) {
                    c2969a = (C2969a) eVar;
                    int i15 = c2969a.f121301e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2969a.f121301e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2969a = new C2969a(eVar);
                    }
                } else {
                    c2969a = new C2969a(eVar);
                }
                Object obj2 = c2969a.f121300d;
                Object objE = uq.b.e();
                int i16 = c2969a.f121301e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f121298a;
                    lx3.d.a aVarC = this.f121299b.mapper.b(new ox3.c.Params((lx3.c) obj, this.f121299b.new i(), this.f121299b.new j(), this.f121299b.new k()));
                    c2969a.f121302f = vq.j.a(obj);
                    c2969a.f121304h = vq.j.a(c2969a);
                    c2969a.f121305j = vq.j.a(obj);
                    c2969a.f121306k = vq.j.a(hVar);
                    c2969a.f121307l = 0;
                    c2969a.f121301e = 1;
                    if (hVar.F(aVarC, c2969a) == objE) {
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

        public h(mu.g gVar, p pVar) {
            this.f121296a = gVar;
            this.f121297b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super lx3.d.a> hVar, tq.e eVar) {
            Object objA = this.f121296a.a(new a(hVar, this.f121297b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements er.p<Uri, String, i0> {
        i() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(Uri uri, String str) {
            c(uri, str);
            return i0.f148189a;
        }

        public final void c(Uri uri, String str) {
            p.this.d9(new lx3.a.HandleUrl(uri, str));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements er.p<String, er.l<? super String, ? extends i0>, i0> {
        j() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(String str, er.l<? super String, ? extends i0> lVar) {
            c(str, lVar);
            return i0.f148189a;
        }

        public final void c(String str, er.l<? super String, i0> lVar) {
            Uri uri;
            nx3.a.b bVarA = nx3.a.b.INSTANCE.a((str == null || (uri = Uri.parse(str)) == null) ? null : uri.getLastPathSegment());
            if (bVarA != null) {
                p.this.M9(bVarA);
            } else {
                p.this.d9(new lx3.a.ScriptExecution(str, lVar));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k implements er.q<String, Integer, SslCertificate, i0> {
        k() {
        }

        public final void c(String str, int i15, SslCertificate sslCertificate) {
            p.this.d9(lx3.a.f.f121176a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(String str, Integer num, SslCertificate sslCertificate) {
            c(str, num.intValue(), sslCertificate);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llx3/a$b;", "<unused var>", "Llx3/c;", "Loq/i0;", "<anonymous>", "(Llx3/a$b;Llx3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<lx3.a.b, lx3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121311e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121311e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                hx3.c.a.b bVar = hx3.c.a.b.f86830a;
                this.f121311e = 1;
                if (pVar.F(bVar, this) == objE) {
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
        public final Object w(lx3.a.b bVar, lx3.c cVar, tq.e<? super i0> eVar) {
            return p.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llx3/a$a;", "<unused var>", "Llx3/c;", "Loq/i0;", "<anonymous>", "(Llx3/a$a;Llx3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<lx3.a.C2966a, lx3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121313e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121313e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                hx3.c.a.C2035a c2035a = hx3.c.a.C2035a.f86829a;
                this.f121313e = 1;
                if (pVar.F(c2035a, this) == objE) {
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
        public final Object w(lx3.a.C2966a c2966a, lx3.c cVar, tq.e<? super i0> eVar) {
            return p.this.new m(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llx3/a$f;", "<unused var>", "Llx3/c;", "Loq/i0;", "<anonymous>", "(Llx3/a$f;Llx3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<lx3.a.f, lx3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121315e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f121315e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p pVar = p.this;
            pVar.L9(pVar.generalError);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.f fVar, lx3.c cVar, tq.e<? super i0> eVar) {
            return p.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llx3/a$c;", "action", "Lk10/c0;", "Llx3/c;", "state", "Lk10/l;", "<anonymous>", "(Llx3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<lx3.a.Fail, c0<lx3.c>, tq.e<? super k10.l<? extends lx3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121319g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lx3.c.Error O(p pVar, lx3.a.Fail fail, lx3.c cVar) {
            return new lx3.c.Error(pVar.errorVMSFactory.a(fail.getErrorData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lx3.a.Fail fail = (lx3.a.Fail) this.f121318f;
            c0 c0Var = (c0) this.f121319g;
            uq.b.e();
            if (this.f121317e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            er.a<i0> aVarA = p.this.setupData.a();
            if (aVarA == null) {
                final p pVar = p.this;
                return c0Var.d(new er.l() { // from class: lx3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.o.O(pVar, fail, (c) obj2);
                    }
                });
            }
            p pVar2 = p.this;
            aVarA.a();
            pVar2.d9(lx3.a.C2966a.f121169a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.Fail fail, c0<lx3.c> c0Var, tq.e<? super k10.l<? extends lx3.c>> eVar) {
            o oVar = p.this.new o(eVar);
            oVar.f121318f = fail;
            oVar.f121319g = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: lx3.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llx3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2970p extends vq.k implements er.p<lx3.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121321e;

        C2970p(tq.e<? super C2970p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121321e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f121321e = 1;
                if (pVar.I9(this) == objE) {
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
        public final Object B(lx3.c.b bVar, tq.e<? super i0> eVar) {
            return ((C2970p) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new C2970p(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llx3/a$j;", "action", "Lk10/c0;", "Llx3/c$b;", "state", "Lk10/l;", "Llx3/c;", "<anonymous>", "(Llx3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<lx3.a.Redirect, c0<lx3.c.b>, tq.e<? super k10.l<? extends lx3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121325g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lx3.c.Redirecting O(lx3.a.Redirect redirect, lx3.c.b bVar) {
            return new lx3.c.Redirecting(redirect.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lx3.a.Redirect redirect = (lx3.a.Redirect) this.f121324f;
            c0 c0Var = (c0) this.f121325g;
            uq.b.e();
            if (this.f121323e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lx3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.q.O(redirect, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.Redirect redirect, c0<lx3.c.b> c0Var, tq.e<? super k10.l<? extends lx3.c>> eVar) {
            q qVar = new q(eVar);
            qVar.f121324f = redirect;
            qVar.f121325g = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$i;", "action", "Llx3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx3/a$i;Llx3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<lx3.a.OpenUrl, lx3.c.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121327f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.OpenUrl openUrl = (lx3.a.OpenUrl) this.f121327f;
            Object objE = uq.b.e();
            int i15 = this.f121326e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = p.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f121327f = vq.j.a(openUrl);
                this.f121326e = 1;
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
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.OpenUrl openUrl, lx3.c.Error error, tq.e<? super i0> eVar) {
            r rVar = p.this.new r(eVar);
            rVar.f121327f = openUrl;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$m;", "action", "Llx3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Llx3/a$m;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<lx3.a.ScriptExecution, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121331g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.ScriptExecution scriptExecution = (lx3.a.ScriptExecution) this.f121330f;
            lx3.c.Redirecting redirecting = (lx3.c.Redirecting) this.f121331g;
            uq.b.e();
            if (this.f121329e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.G9(redirecting.getData().g(), scriptExecution.a(), scriptExecution.getUrl());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.ScriptExecution scriptExecution, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            s sVar = p.this.new s(eVar);
            sVar.f121330f = scriptExecution;
            sVar.f121331g = redirecting;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgu/b;", "step", "Llx3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lgu/b;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<gu.b, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121334f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.c.Redirecting redirecting = (lx3.c.Redirecting) this.f121334f;
            Object objE = uq.b.e();
            int i15 = this.f121333e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f121334f = vq.j.a(redirecting);
                this.f121333e = 1;
                if (pVar.N9(redirecting, this) == objE) {
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

        public final Object M(long j15, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            t tVar = p.this.new t(eVar);
            tVar.f121334f = redirecting;
            return tVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(gu.b bVar, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            return M(bVar.getRawValue(), redirecting, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$e;", "action", "Llx3/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx3/a$e;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<lx3.a.Finish, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121337f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.Finish finish = (lx3.a.Finish) this.f121337f;
            uq.b.e();
            if (this.f121336e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.setupData.b().b(finish.getEdorAddress());
            p.this.d9(lx3.a.C2966a.f121169a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.Finish finish, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            u uVar = p.this.new u(eVar);
            uVar.f121337f = finish;
            return uVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$n;", "action", "Llx3/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx3/a$n;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<lx3.a.SendDataToInstitution, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121340f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.SendDataToInstitution sendDataToInstitution = (lx3.a.SendDataToInstitution) this.f121340f;
            Object objE = uq.b.e();
            int i15 = this.f121339e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                String qrCode = sendDataToInstitution.getQrCode();
                this.f121340f = vq.j.a(sendDataToInstitution);
                this.f121339e = 1;
                if (pVar.R9(qrCode, this) == objE) {
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
        public final Object w(lx3.a.SendDataToInstitution sendDataToInstitution, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            v vVar = p.this.new v(eVar);
            vVar.f121340f = sendDataToInstitution;
            return vVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$l;", "action", "Llx3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Llx3/a$l;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<lx3.a.SaveTokens, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121344g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.SaveTokens saveTokens = (lx3.a.SaveTokens) this.f121343f;
            lx3.c.Redirecting redirecting = (lx3.c.Redirecting) this.f121344g;
            uq.b.e();
            if (this.f121342e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.Q9(saveTokens.getOwAccessToken(), saveTokens.getOwRefreshToken(), saveTokens.getCentralAccessToken(), redirecting.getData().getIamOwTokenUrl(), saveTokens.getEdorAddress());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lx3.a.SaveTokens saveTokens, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            w wVar = p.this.new w(eVar);
            wVar.f121343f = saveTokens;
            wVar.f121344g = redirecting;
            return wVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$d;", "action", "Llx3/c$c;", "state", "Loq/i0;", "<anonymous>", "(Llx3/a$d;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<lx3.a.FetchTokens, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f121348g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.FetchTokens fetchTokens = (lx3.a.FetchTokens) this.f121347f;
            lx3.c.Redirecting redirecting = (lx3.c.Redirecting) this.f121348g;
            Object objE = uq.b.e();
            int i15 = this.f121346e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                String url = fetchTokens.getUrl();
                String code = fetchTokens.getCode();
                String strE = iy.c0.e(redirecting.getData().getCodeVerifier());
                this.f121347f = vq.j.a(fetchTokens);
                this.f121348g = vq.j.a(redirecting);
                this.f121346e = 1;
                if (pVar.H9(url, code, strE, this) == objE) {
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
        public final Object w(lx3.a.FetchTokens fetchTokens, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            x xVar = p.this.new x(eVar);
            xVar.f121347f = fetchTokens;
            xVar.f121348g = redirecting;
            return xVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$k;", "action", "Llx3/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx3/a$k;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<lx3.a.RefreshOwTokens, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121351f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.RefreshOwTokens refreshOwTokens = (lx3.a.RefreshOwTokens) this.f121351f;
            Object objE = uq.b.e();
            int i15 = this.f121350e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                String url = refreshOwTokens.getUrl();
                iy.b0 edorAddress = refreshOwTokens.getEdorAddress();
                OwTokens.Refresh owRefreshToken = refreshOwTokens.getOwRefreshToken();
                CentralTokens.Access centralAccessToken = refreshOwTokens.getCentralAccessToken();
                this.f121351f = vq.j.a(refreshOwTokens);
                this.f121350e = 1;
                if (pVar.P9(url, edorAddress, owRefreshToken, centralAccessToken, this) == objE) {
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
        public final Object w(lx3.a.RefreshOwTokens refreshOwTokens, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            y yVar = p.this.new y(eVar);
            yVar.f121351f = refreshOwTokens;
            return yVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llx3/a$g;", "action", "Llx3/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llx3/a$g;Llx3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<lx3.a.GetElectronicDeliveryAddress, lx3.c.Redirecting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121354f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lx3.a.GetElectronicDeliveryAddress getElectronicDeliveryAddress = (lx3.a.GetElectronicDeliveryAddress) this.f121354f;
            Object objE = uq.b.e();
            int i15 = this.f121353e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                String url = getElectronicDeliveryAddress.getUrl();
                CentralTokens.Access centralAccessToken = getElectronicDeliveryAddress.getCentralAccessToken();
                OwTokens.Refresh owRefreshToken = getElectronicDeliveryAddress.getOwRefreshToken();
                this.f121354f = vq.j.a(getElectronicDeliveryAddress);
                this.f121353e = 1;
                if (pVar.J9(url, centralAccessToken, owRefreshToken, this) == objE) {
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
        public final Object w(lx3.a.GetElectronicDeliveryAddress getElectronicDeliveryAddress, lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
            z zVar = p.this.new z(eVar);
            zVar.f121354f = getElectronicDeliveryAddress;
            return zVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, mx.c cVar, k54.l lVar, go0.a0 a0Var, go0.x xVar, go0.n nVar, d0 d0Var, k54.j jVar, kx3.g gVar, kx3.b bVar, a14.c cVar2, c54.b bVar2, ox3.c cVar3, ox3.b bVar3, hb4.d dVar, a14.w wVar, i70.e eVar, u04.a aVar2, ez.g gVar2, kx3.c cVar4, KeycloakAuthData keycloakAuthData) {
        this.sendCodeToInstitutionUC = lVar;
        this.getWebViewConfigurationUC = a0Var;
        this.getOwTokenUC = xVar;
        this.getCentralTokenUC = nVar;
        this.refreshOwTokensUseCase = d0Var;
        this.saveKeycloakCentralAccessTokenUC = jVar;
        this.saveKeycloakTokensUC = gVar;
        this.fetchOwnerAddressUC = bVar;
        this.clearWebViewUC = cVar2;
        this.isFeatureEnabledUseCase = bVar2;
        this.mapper = cVar3;
        this.errorMapper = bVar3;
        this.errorVMSFactory = dVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.commonEndpoints = aVar2;
        this.ticker = gVar2;
        this.generateSecretPropertiesUC = cVar4;
        this.setupData = keycloakAuthData;
        this.generalError = new dx.b.Business(jx3.a.GENERAL, null, cVar.c(gx3.a.f78221c), cVar.c(gx3.a.f78221c), null, cVar.c(gx3.a.f78219a), null, 82, null);
        this.stateMachine = aVar.a(lx3.c.b.f121208a, new er.l() { // from class: lx3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.T9(this.f121227a, (k10.v) obj);
            }
        });
    }

    private final Uri.Builder D9(Uri uri, String str, String str2) {
        String queryParameter;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (!queryParameterNames.contains(str)) {
            return uri.buildUpon().appendQueryParameter(str, str2);
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str3 : queryParameterNames) {
            boolean zEquals = str3.equals(str);
            if (zEquals) {
                queryParameter = str2;
            } else {
                if (zEquals) {
                    throw new oq.p();
                }
                queryParameter = uri.getQueryParameter(str3);
            }
            builderClearQuery.appendQueryParameter(str3, queryParameter);
        }
        return builderClearQuery;
    }

    private final String E9(Uri uri, String stateParameterValue, String codeChallenge) {
        return D9(uri, "state", stateParameterValue).appendQueryParameter("code_challenge", codeChallenge).appendQueryParameter("code_challenge_method", "S256").toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 G9(List<ExecutionData> scriptsList, er.l<? super String, i0> callback, String url) {
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
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H9(String str, String str2, String str3, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        String str4;
        OwTokens owTokens;
        dx.i iVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f121266n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f121266n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f121264l;
        Object objE = uq.b.e();
        int i16 = cVar.f121266n;
        if (i16 == 0) {
            oq.u.b(objC);
            go0.x xVar = this.getOwTokenUC;
            go0.x.Params params = new go0.x.Params(str, str2, str3);
            cVar.f121257d = str;
            cVar.f121258e = vq.j.a(str2);
            cVar.f121259f = vq.j.a(str3);
            cVar.f121266n = 1;
            objC = xVar.c(params, cVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            str3 = (String) cVar.f121259f;
            str2 = (String) cVar.f121258e;
            str = (String) cVar.f121257d;
            oq.u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            owTokens = (OwTokens) cVar.f121261h;
            str4 = (String) cVar.f121257d;
            oq.u.b(objC);
        }
        iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            L9(this.generalError);
        } else {
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            CentralTokens centralTokens = (CentralTokens) ((dx.i.Right) iVar).b();
            this.saveKeycloakCentralAccessTokenUC.a(new k54.j.Params(ix3.a.i(centralTokens.getAccess())));
            d9(new lx3.a.GetElectronicDeliveryAddress(str4, centralTokens.getAccess(), owTokens.getRefresh(), owTokens.getAccess()));
        }
        return i0.f148189a;
        dx.i iVar2 = (dx.i) objC;
        if (!(iVar2 instanceof dx.i.Left)) {
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokens owTokens2 = (OwTokens) ((dx.i.Right) iVar2).b();
            go0.n nVar = this.getCentralTokenUC;
            go0.n.Params params2 = new go0.n.Params(str, owTokens2.getAccess());
            cVar.f121257d = str;
            cVar.f121258e = vq.j.a(str2);
            cVar.f121259f = vq.j.a(str3);
            cVar.f121260g = vq.j.a(iVar2);
            cVar.f121261h = owTokens2;
            cVar.f121262j = 0;
            cVar.f121263k = 0;
            cVar.f121266n = 2;
            objC = nVar.c(params2, cVar);
            if (objC != objE) {
                str4 = str;
                owTokens = owTokens2;
                iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Left) {
                    L9(this.generalError);
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    CentralTokens centralTokens2 = (CentralTokens) ((dx.i.Right) iVar).b();
                    this.saveKeycloakCentralAccessTokenUC.a(new k54.j.Params(ix3.a.i(centralTokens2.getAccess())));
                    d9(new lx3.a.GetElectronicDeliveryAddress(str4, centralTokens2.getAccess(), owTokens.getRefresh(), owTokens.getAccess()));
                }
            }
            return objE;
        }
        L9(this.generalError);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(tq.e<? super i0> eVar) throws Throwable {
        d dVar;
        dx.i iVar;
        List listE;
        OAuthConfiguration oAuthConfiguration;
        int i15;
        int i16;
        dx.i iVar2;
        kx3.c.SecretProperties secretProperties;
        a14.c cVar;
        gz.b.a.C1792a c1792a;
        OAuthConfiguration oAuthConfiguration2;
        kx3.c.SecretProperties secretProperties2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i17 = dVar.f121278q;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f121278q = i17 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f121276n;
        Object objE = uq.b.e();
        int i18 = dVar.f121278q;
        if (i18 == 0) {
            oq.u.b(objC);
            go0.a0 a0Var = this.getWebViewConfigurationUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            dVar.f121278q = 1;
            objC = a0Var.c(c1792a2, dVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            oq.u.b(objC);
        } else {
            if (i18 == 2) {
                int i19 = dVar.f121273k;
                int i25 = dVar.f121272j;
                List list = (List) dVar.f121269f;
                oAuthConfiguration = (OAuthConfiguration) dVar.f121268e;
                iVar = (dx.i) dVar.f121267d;
                oq.u.b(objC);
                i15 = i19;
                listE = list;
                i16 = i25;
                iVar2 = (dx.i) objC;
                if (!(iVar2 instanceof dx.i.Left)) {
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    secretProperties = (kx3.c.SecretProperties) ((dx.i.Right) iVar2).b();
                    cVar = this.clearWebViewUC;
                    c1792a = gz.b.a.C1792a.f78542a;
                    dVar.f121267d = vq.j.a(iVar);
                    dVar.f121268e = oAuthConfiguration;
                    dVar.f121269f = listE;
                    dVar.f121270g = vq.j.a(iVar2);
                    dVar.f121271h = secretProperties;
                    dVar.f121272j = i16;
                    dVar.f121273k = i15;
                    dVar.f121274l = 0;
                    dVar.f121275m = 0;
                    dVar.f121278q = 3;
                    if (cVar.c(c1792a, dVar) != objE) {
                        oAuthConfiguration2 = oAuthConfiguration;
                        secretProperties2 = secretProperties;
                    }
                    return objE;
                }
                d9(lx3.a.f.f121176a);
                return i0.f148189a;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            secretProperties2 = (kx3.c.SecretProperties) dVar.f121271h;
            listE = (List) dVar.f121269f;
            oAuthConfiguration2 = (OAuthConfiguration) dVar.f121268e;
            oq.u.b(objC);
        }
        d9(new lx3.a.Redirect(new InitializedData(15, "mobywatel", E9(Uri.parse(oAuthConfiguration2.getEdorUrl()), secretProperties2.getStateParameterValue(), secretProperties2.getCodeChallenge()), "Firefox", oAuthConfiguration2.getIamOwTokenUrl(), listE, this.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue(), this.isFeatureEnabledUseCase.a(b54.c.EDOR_OAUTH_WEB_VIEW_VISIBLE).booleanValue(), secretProperties2.getStateParameterValue(), iy.c0.g(secretProperties2.getCodeVerifier()))));
        return i0.f148189a;
        iVar = (dx.i) objC;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OAuthConfiguration oAuthConfiguration3 = (OAuthConfiguration) ((dx.i.Right) iVar).b();
            listE = pq.v.e(new ExecutionData(oAuthConfiguration3.getSsoUrl(), "document.getElementById(\"go-mobywatel\").click()"));
            kx3.c cVar2 = this.generateSecretPropertiesUC;
            gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
            dVar.f121267d = vq.j.a(iVar);
            dVar.f121268e = oAuthConfiguration3;
            dVar.f121269f = listE;
            dVar.f121272j = 0;
            dVar.f121273k = 0;
            dVar.f121278q = 2;
            Object objA = cVar2.a(c1792a3, dVar);
            if (objA != objE) {
                oAuthConfiguration = oAuthConfiguration3;
                objC = objA;
                i15 = 0;
                i16 = 0;
                iVar2 = (dx.i) objC;
                if (!(iVar2 instanceof dx.i.Left)) {
                    d9(lx3.a.f.f121176a);
                } else {
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    secretProperties = (kx3.c.SecretProperties) ((dx.i.Right) iVar2).b();
                    cVar = this.clearWebViewUC;
                    c1792a = gz.b.a.C1792a.f78542a;
                    dVar.f121267d = vq.j.a(iVar);
                    dVar.f121268e = oAuthConfiguration;
                    dVar.f121269f = listE;
                    dVar.f121270g = vq.j.a(iVar2);
                    dVar.f121271h = secretProperties;
                    dVar.f121272j = i16;
                    dVar.f121273k = i15;
                    dVar.f121274l = 0;
                    dVar.f121275m = 0;
                    dVar.f121278q = 3;
                    if (cVar.c(c1792a, dVar) != objE) {
                        oAuthConfiguration2 = oAuthConfiguration;
                        secretProperties2 = secretProperties;
                        d9(new lx3.a.Redirect(new InitializedData(15, "mobywatel", E9(Uri.parse(oAuthConfiguration2.getEdorUrl()), secretProperties2.getStateParameterValue(), secretProperties2.getCodeChallenge()), "Firefox", oAuthConfiguration2.getIamOwTokenUrl(), listE, this.isFeatureEnabledUseCase.a(b54.c.WEB_VIEW_SSL).booleanValue(), this.isFeatureEnabledUseCase.a(b54.c.EDOR_OAUTH_WEB_VIEW_VISIBLE).booleanValue(), secretProperties2.getStateParameterValue(), iy.c0.g(secretProperties2.getCodeVerifier()))));
                    }
                }
            }
            return objE;
        }
        d9(lx3.a.f.f121176a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J9(String str, CentralTokens.Access access, OwTokens.Refresh refresh, tq.e<? super i0> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f121284j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f121284j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f121282g;
        Object objE = uq.b.e();
        int i16 = eVar2.f121284j;
        if (i16 == 0) {
            oq.u.b(objA);
            kx3.b bVar = this.fetchOwnerAddressUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f121279d = str;
            eVar2.f121280e = access;
            eVar2.f121281f = refresh;
            eVar2.f121284j = 1;
            objA = bVar.a(c1792a, eVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            refresh = (OwTokens.Refresh) eVar2.f121281f;
            access = (CentralTokens.Access) eVar2.f121280e;
            str = (String) eVar2.f121279d;
            oq.u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            d9(lx3.a.f.f121176a);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            i54.a aVar = (i54.a) ((dx.i.Right) iVar).b();
            if (aVar instanceof i54.a.EmptyState) {
                d9(lx3.a.f.f121176a);
            } else if (aVar instanceof i54.a.AddressData) {
                i54.a.AddressData addressData = (i54.a.AddressData) aVar;
                iy.b0 userEdorAddress = addressData.getUserEdorAddress();
                if (userEdorAddress != null) {
                    switch (b.f121252a[addressData.getStatus().ordinal()]) {
                        case 1:
                            d9(new lx3.a.RefreshOwTokens(str, userEdorAddress, refresh, access));
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            d9(lx3.a.f.f121176a);
                            break;
                        default:
                            throw new oq.p();
                    }
                } else {
                    d9(new lx3.a.Fail(this.errorMapper.b(new ox3.b.a.MissingEdorAddress(b9(new lx3.a.OpenUrl(this.commonEndpoints.W())), new er.a() { // from class: lx3.n
                        @Override // er.a
                        public final Object a() {
                            return p.K9(this.f121226a);
                        }
                    }))));
                }
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(p pVar) {
        pVar.d9(lx3.a.b.f121170a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L9(dx.b domainError) {
        d9(new lx3.a.Fail(this.errorMapper.b(new ox3.b.a.Domain(domainError, b9(lx3.a.b.f121170a)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M9(nx3.a error) {
        d9(new lx3.a.Fail(this.errorMapper.b(new ox3.b.a.WebView(error, b9(lx3.a.b.f121170a)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N9(lx3.c.Redirecting redirecting, tq.e<? super i0> eVar) {
        if (redirecting.getData().getTimeOutLeftTimeSec() > 0) {
            d9(lx3.a.o.f121196a);
        } else {
            h2.f(eVar.getContext(), null, 1, null);
            d9(lx3.a.f.f121176a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9(Uri url, String scheme, String tokenUrl, String stateParameter) {
        String path = url.getPath();
        if (path == null || !fr.t.c(scheme, "mobywatel")) {
            return;
        }
        if (fu.r.V(path, "/institution", false, 2, null)) {
            String queryParameter = url.getQueryParameter("qrCode");
            if (queryParameter != null) {
                d9(new lx3.a.SendDataToInstitution(queryParameter));
            } else {
                d9(lx3.a.f.f121176a);
            }
        }
        if (fu.r.V(path, "/edelivery", false, 2, null)) {
            if (!fr.t.c(stateParameter, url.getQueryParameter("state"))) {
                d9(lx3.a.f.f121176a);
                return;
            }
            String queryParameter2 = url.getQueryParameter("code");
            if (queryParameter2 != null) {
                d9(new lx3.a.FetchTokens(tokenUrl, queryParameter2));
            } else {
                d9(lx3.a.f.f121176a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P9(String str, iy.b0 b0Var, OwTokens.Refresh refresh, CentralTokens.Access access, tq.e<? super i0> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f121291k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f121291k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objC = fVar.f121289h;
        Object objE = uq.b.e();
        int i16 = fVar.f121291k;
        if (i16 == 0) {
            oq.u.b(objC);
            d0 d0Var = this.refreshOwTokensUseCase;
            d0.Params params = new d0.Params(str, eo0.x.a(b0Var), refresh, null);
            fVar.f121285d = vq.j.a(str);
            fVar.f121286e = b0Var;
            fVar.f121287f = vq.j.a(refresh);
            fVar.f121288g = access;
            fVar.f121291k = 1;
            objC = d0Var.c(params, fVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            access = (CentralTokens.Access) fVar.f121288g;
            b0Var = (iy.b0) fVar.f121286e;
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(lx3.a.f.f121176a);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            OwTokens owTokens = (OwTokens) ((dx.i.Right) iVar).b();
            d9(new lx3.a.SaveTokens(owTokens.getAccess(), owTokens.getRefresh(), access, b0Var));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q9(OwTokens.Access owAccessToken, OwTokens.Refresh owRefreshToken, CentralTokens.Access centralAccessToken, String refreshOwTokenUrl, iy.b0 edorAddress) {
        this.saveKeycloakTokensUC.b(new kx3.g.Params(ix3.a.h(owAccessToken), ix3.a.i(centralAccessToken), ix3.a.j(owRefreshToken, refreshOwTokenUrl)));
        d9(new lx3.a.Finish(edorAddress));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R9(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f121295g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f121295g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objC = gVar.f121293e;
        Object objE = uq.b.e();
        int i16 = gVar.f121295g;
        if (i16 == 0) {
            oq.u.b(objC);
            k54.l lVar = this.sendCodeToInstitutionUC;
            k54.l.Params params = new k54.l.Params(str);
            gVar.f121292d = vq.j.a(str);
            gVar.f121295g = 1;
            objC = lVar.c(params, gVar);
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
            L9(this.generalError);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(lx3.c.class), new er.l() { // from class: lx3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.U9(this.f121222a, (z) obj);
            }
        });
        vVar.c(q0.c(lx3.c.b.class), new er.l() { // from class: lx3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.V9(this.f121223a, (z) obj);
            }
        });
        vVar.c(q0.c(lx3.c.Error.class), new er.l() { // from class: lx3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.W9(this.f121224a, (z) obj);
            }
        });
        vVar.c(q0.c(lx3.c.Redirecting.class), new er.l() { // from class: lx3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.X9(this.f121225a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(p pVar, k10.z zVar) {
        l lVar = pVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lx3.a.b.class), oVar, lVar);
        zVar.x(q0.c(lx3.a.C2966a.class), oVar, pVar.new m(null));
        zVar.x(q0.c(lx3.a.f.class), oVar, pVar.new n(null));
        zVar.v(q0.c(lx3.a.Fail.class), oVar, pVar.new o(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(p pVar, k10.z zVar) {
        zVar.C(pVar.new C2970p(null));
        q qVar = new q(null);
        zVar.v(q0.c(lx3.a.Redirect.class), k10.o.CANCEL_PREVIOUS, qVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(p pVar, k10.z zVar) {
        r rVar = pVar.new r(null);
        zVar.x(q0.c(lx3.a.OpenUrl.class), k10.o.CANCEL_PREVIOUS, rVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(p pVar, k10.z zVar) {
        k10.k.s(zVar, ez.g.b(pVar.ticker, 0L, 1, null), null, pVar.new t(null), 2, null);
        u uVar = pVar.new u(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lx3.a.Finish.class), oVar, uVar);
        zVar.x(q0.c(lx3.a.SendDataToInstitution.class), oVar, pVar.new v(null));
        zVar.x(q0.c(lx3.a.SaveTokens.class), oVar, pVar.new w(null));
        zVar.x(q0.c(lx3.a.FetchTokens.class), oVar, pVar.new x(null));
        zVar.x(q0.c(lx3.a.RefreshOwTokens.class), oVar, pVar.new y(null));
        zVar.x(q0.c(lx3.a.GetElectronicDeliveryAddress.class), oVar, pVar.new z(null));
        zVar.v(q0.c(lx3.a.o.class), oVar, new a0(null));
        zVar.x(q0.c(lx3.a.HandleUrl.class), oVar, pVar.new b0(null));
        zVar.x(q0.c(lx3.a.ScriptExecution.class), oVar, pVar.new s(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hx3.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: S9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(KeycloakAuthData keycloakAuthData) {
        super.P5(keycloakAuthData);
    }

    @Override // zx.b
    public xw.b<hx3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<lx3.c, lx3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<lx3.d.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
