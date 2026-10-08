package pl.gov.mc.fringers.mobywatel;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.FragmentManager;
import androidx.p016lifecycle.v0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import com.google.firebase.messaging.FirebaseMessaging;
import fr.q0;
import id4.e4;
import java.util.Collection;
import java.util.Iterator;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import p7.CreationExtras;
import pq.s0;
import q34.r1;
import w0.g0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R!\u0010¹\u0001\u001a\u00030´\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001¨\u0006º\u0001"}, d2 = {"Lpl/gov/mc/fringers/mobywatel/MainActivity;", "Loz/f;", "<init>", "()V", "Loq/i0;", "n1", "p1", "s1", "", "m1", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lrh2/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lrh2/a;", "c1", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lmz/l;", "O", "Lmz/l;", "getIntentManager", "()Lmz/l;", "setIntentManager", "(Lmz/l;)V", "intentManager", "Lpd4/g;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Lpd4/g;", "j1", "()Lpd4/g;", "setRegisterIntentHandlersUseCase", "(Lpd4/g;)V", "registerIntentHandlersUseCase", "Lpd4/h;", "R", "Lpd4/h;", "l1", "()Lpd4/h;", "setUnregisterIntentHandlersUseCase", "(Lpd4/h;)V", "unregisterIntentHandlersUseCase", "Lgx/d;", "T", "Lgx/d;", "d1", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lsw/a;", "X", "Lsw/a;", "b1", "()Lsw/a;", "setDeveloperSettingsManager", "(Lsw/a;)V", "developerSettingsManager", "Lc54/b;", "Y", "Lc54/b;", "q1", "()Lc54/b;", "setFeatureEnabledUseCase", "(Lc54/b;)V", "isFeatureEnabledUseCase", "Luj2/c;", "Z", "Luj2/c;", "k1", "()Luj2/c;", "setScheduleInactivityLogoutUseCase", "(Luj2/c;)V", "scheduleInactivityLogoutUseCase", "Loz/c;", "h0", "Loz/c;", "Y0", "()Loz/c;", "setActivityLifecycleConnector", "(Loz/c;)V", "activityLifecycleConnector", "Lq54/a;", "q0", "Lq54/a;", "e1", "()Lq54/a;", "setLocalNotificationManager", "(Lq54/a;)V", "localNotificationManager", "La14/s;", "r0", "La14/s;", "getLaunchAppUseCase", "()La14/s;", "setLaunchAppUseCase", "(La14/s;)V", "launchAppUseCase", "Ls54/k;", "s0", "Ls54/k;", "getSetLocalNotificationUseCase", "()Ls54/k;", "setSetLocalNotificationUseCase", "(Ls54/k;)V", "setLocalNotificationUseCase", "Lsj2/a;", "t0", "Lsj2/a;", "getLoginInteractor", "()Lsj2/a;", "setLoginInteractor", "(Lsj2/a;)V", "loginInteractor", "La14/q;", "u0", "La14/q;", "getGoToStoreIntentUseCase", "()La14/q;", "setGoToStoreIntentUseCase", "(La14/q;)V", "goToStoreIntentUseCase", "Li70/e;", "v0", "Li70/e;", "getGlobalSnackBarManager", "()Li70/e;", "setGlobalSnackBarManager", "(Li70/e;)V", "globalSnackBarManager", "Lay/k;", "w0", "Lay/k;", "i1", "()Lay/k;", "setNetworkConnectionManager", "(Lay/k;)V", "networkConnectionManager", "Lmz3/r;", "x0", "Lmz3/r;", "h1", "()Lmz3/r;", "setManageDocumentDownloadInternetConnectionUC", "(Lmz3/r;)V", "manageDocumentDownloadInternetConnectionUC", "Lq34/r1;", "y0", "Lq34/r1;", "g1", "()Lq34/r1;", "setManageDocumentContainerChangedUC", "(Lq34/r1;)V", "manageDocumentContainerChangedUC", "La14/c;", "z0", "La14/c;", "a1", "()La14/c;", "setClearWebViewUC", "(La14/c;)V", "clearWebViewUC", "Lv64/q;", "A0", "Lv64/q;", "f1", "()Lv64/q;", "setLogoutUC", "(Lv64/q;)V", "logoutUC", "Lid4/e4;", "B0", "Loq/k;", "Z0", "()Lid4/e4;", "appViewModel", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity extends pl.gov.mc.fringers.mobywatel.f {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public v64.q logoutUC;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private final oq.k appViewModel = new v0(q0.c(e4.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public mz.l intentManager;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public pd4.g registerIntentHandlersUseCase;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public pd4.h unregisterIntentHandlersUseCase;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public sw.a developerSettingsManager;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public uj2.c scheduleInactivityLogoutUseCase;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public oz.c activityLifecycleConnector;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public q54.a localNotificationManager;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public a14.s launchAppUseCase;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public s54.k setLocalNotificationUseCase;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public sj2.a loginInteractor;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    public i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public ay.k networkConnectionManager;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public mz3.r manageDocumentDownloadInternetConnectionUC;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public r1 manageDocumentContainerChangedUC;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    public a14.c clearWebViewUC;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159311e;

        /* JADX INFO: renamed from: pl.gov.mc.fringers.mobywatel.MainActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C3947a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f159313e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f159314f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ MainActivity f159315g;

            /* JADX INFO: renamed from: pl.gov.mc.fringers.mobywatel.MainActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C3948a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f159316e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ MainActivity f159317f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3948a(MainActivity mainActivity, tq.e<? super C3948a> eVar) {
                    super(2, eVar);
                    this.f159317f = mainActivity;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f159316e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        mz3.r rVarH1 = this.f159317f.h1();
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        this.f159316e = 1;
                        if (rVarH1.c(c1792a, this) == objE) {
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
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((C3948a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C3948a(this.f159317f, eVar);
                }
            }

            /* JADX INFO: renamed from: pl.gov.mc.fringers.mobywatel.MainActivity$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f159318e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ MainActivity f159319f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(MainActivity mainActivity, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f159319f = mainActivity;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f159318e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        r1 r1VarG1 = this.f159319f.g1();
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        this.f159318e = 1;
                        if (r1VarG1.c(c1792a, this) == objE) {
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
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((b) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new b(this.f159319f, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3947a(MainActivity mainActivity, tq.e<? super C3947a> eVar) {
                super(2, eVar);
                this.f159315g = mainActivity;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                p0 p0Var = (p0) this.f159314f;
                uq.b.e();
                if (this.f159313e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                ju.k.d(p0Var, null, null, new C3948a(this.f159315g, null), 3, null);
                ju.k.d(p0Var, null, null, new b(this.f159315g, null), 3, null);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C3947a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C3947a c3947a = new C3947a(this.f159315g, eVar);
                c3947a.f159314f = obj;
                return c3947a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (androidx.p016lifecycle.g0.b(r6, r1, r3, r5) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f159311e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                oq.u.b(r6)
                goto L64
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                oq.u.b(r6)
                goto L51
            L21:
                oq.u.b(r6)
                goto L39
            L25:
                oq.u.b(r6)
                pl.gov.mc.fringers.mobywatel.MainActivity r6 = pl.gov.mc.fringers.mobywatel.MainActivity.this
                a14.c r6 = r6.a1()
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f159311e = r4
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L39
                goto L63
            L39:
                pl.gov.mc.fringers.mobywatel.MainActivity r6 = pl.gov.mc.fringers.mobywatel.MainActivity.this
                ay.k r6 = r6.i1()
                r6.a()
                pl.gov.mc.fringers.mobywatel.MainActivity r6 = pl.gov.mc.fringers.mobywatel.MainActivity.this
                q54.a r6 = r6.e1()
                r5.f159311e = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L51
                goto L63
            L51:
                pl.gov.mc.fringers.mobywatel.MainActivity r6 = pl.gov.mc.fringers.mobywatel.MainActivity.this
                androidx.lifecycle.j$b r1 = androidx.lifecycle.j.b.STARTED
                pl.gov.mc.fringers.mobywatel.MainActivity$a$a r3 = new pl.gov.mc.fringers.mobywatel.MainActivity$a$a
                r4 = 0
                r3.<init>(r6, r4)
                r5.f159311e = r2
                java.lang.Object r6 = androidx.p016lifecycle.g0.b(r6, r1, r3, r5)
                if (r6 != r0) goto L64
            L63:
                return r0
            L64:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.gov.mc.fringers.mobywatel.MainActivity.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return MainActivity.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159320e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f159320e;
            if (i15 == 0) {
                oq.u.b(obj);
                uj2.c cVarK1 = MainActivity.this.k1();
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f159320e = 1;
                if (cVarK1.c(c1792a, this) == objE) {
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
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return MainActivity.this.new b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<Boolean> {
        c(Object obj) {
            super(0, obj, MainActivity.class, "hasOnboardingInBackStack", "hasOnboardingInBackStack()Z", 0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(((MainActivity) this.f66391b).m1());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159322e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f159322e;
            if (i15 == 0) {
                oq.u.b(obj);
                v64.q qVarF1 = MainActivity.this.f1();
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f159322e = 1;
                if (qVarF1.c(c1792a, this) == objE) {
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
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return MainActivity.this.new d(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements er.a<w0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CON.p f159324a;

        public e(CON.p pVar) {
            this.f159324a = pVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w0.c a() {
            return this.f159324a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements er.a<x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CON.p f159325a;

        public f(CON.p pVar) {
            this.f159325a = pVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final x0 a() {
            return this.f159325a.h();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements er.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a f159326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CON.p f159327b;

        public g(er.a aVar, CON.p pVar) {
            this.f159326a = aVar;
            this.f159327b = pVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CreationExtras a() {
            CreationExtras creationExtras;
            er.a aVar = this.f159326a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.a()) == null) ? this.f159327b.x() : creationExtras;
        }
    }

    private final e4 Z0() {
        return (e4) this.appViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m1() {
        FragmentManager fragmentManagerW0 = w0();
        if (fragmentManagerW0.j0("TAG_ONBOARDING") != null) {
            return true;
        }
        Iterable iterableW = lr.m.w(0, fragmentManagerW0.r0());
        if ((iterableW instanceof Collection) && ((Collection) iterableW).isEmpty()) {
            return false;
        }
        Iterator it = iterableW.iterator();
        while (it.hasNext()) {
            if (fr.t.c(fragmentManagerW0.q0(((s0) it).nextInt()).getName(), "TAG_ONBOARDING")) {
                return true;
            }
        }
        return false;
    }

    private final void n1() {
        FirebaseMessaging.q().t().c(new vh.f() { // from class: pl.gov.mc.fringers.mobywatel.w
            @Override // vh.f
            public final void a(vh.l lVar) {
                MainActivity.o1(this.f160797a, lVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(MainActivity mainActivity, vh.l lVar) {
        if (lVar.q()) {
            String str = (String) lVar.m();
            px.f.f163100a.b("FCM token: " + str, px.c.a(mainActivity));
        }
    }

    private final void p1() {
        if (q1().a(b54.c.WEB_VIEW_DEBUGGING).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r1(MainActivity mainActivity, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(212024591, i15, -1, "pl.gov.mc.fringers.mobywatel.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:152)");
            }
            e4 e4VarZ0 = mainActivity.Z0();
            rh2.a aVarC1 = mainActivity.c1();
            boolean zG = rVar.G(mainActivity);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new c(mainActivity);
                rVar.v(objE);
            }
            jd4.c.c(mainActivity, e4VarZ0, aVarC1, (er.a) ((mr.g) objE), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private final void s1() {
        b1().a((RelativeLayout) findViewById(rh2.d.f173876b), new er.a() { // from class: pl.gov.mc.fringers.mobywatel.x
            @Override // er.a
            public final Object a() {
                return MainActivity.t1(this.f160798a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t1(MainActivity mainActivity) {
        mainActivity.d1().c(jo1.a.C2477a.f104240a);
        return i0.f148189a;
    }

    public final oz.c Y0() {
        oz.c cVar = this.activityLifecycleConnector;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final a14.c a1() {
        a14.c cVar = this.clearWebViewUC;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final sw.a b1() {
        sw.a aVar = this.developerSettingsManager;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final rh2.a c1() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d d1() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final q54.a e1() {
        q54.a aVar = this.localNotificationManager;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final v64.q f1() {
        v64.q qVar = this.logoutUC;
        if (qVar != null) {
            return qVar;
        }
        return null;
    }

    public final r1 g1() {
        r1 r1Var = this.manageDocumentContainerChangedUC;
        if (r1Var != null) {
            return r1Var;
        }
        return null;
    }

    public final mz3.r h1() {
        mz3.r rVar = this.manageDocumentDownloadInternetConnectionUC;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    public final ay.k i1() {
        ay.k kVar = this.networkConnectionManager;
        if (kVar != null) {
            return kVar;
        }
        return null;
    }

    public final pd4.g j1() {
        pd4.g gVar = this.registerIntentHandlersUseCase;
        if (gVar != null) {
            return gVar;
        }
        return null;
    }

    public final uj2.c k1() {
        uj2.c cVar = this.scheduleInactivityLogoutUseCase;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final pd4.h l1() {
        pd4.h hVar = this.unregisterIntentHandlersUseCase;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Override // pl.gov.mc.fringers.mobywatel.f, oz.f, androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g0.isNewContextMenuEnabled = false;
        g6.c.INSTANCE.a(this);
        sh2.a.j(this);
        Y0().e(this);
        j1().b(gz.b.a.C1792a.f78542a);
        ju.k.d(androidx.p016lifecycle.r.a(this), null, null, new a(null), 3, null);
        n1();
        Z0().z9(getIntent());
        p1();
        s1();
        ju.k.d(androidx.p016lifecycle.r.a(this), null, null, new b(null), 3, null);
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setViewCompositionStrategy(b3.c.f10417b);
        composeView.setContent(y2.m.b(212024591, true, new er.p() { // from class: pl.gov.mc.fringers.mobywatel.v
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return MainActivity.r1(this.f160796a, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }));
        ((RelativeLayout) findViewById(rh2.d.f173876b)).addView(composeView);
    }

    @Override // pl.gov.mc.fringers.mobywatel.f, androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            l1().b(gz.b.a.C1792a.f78542a);
            ju.k.d(androidx.p016lifecycle.r.a(this), null, null, new d(null), 3, null);
        }
        super.onDestroy();
    }

    @Override // CON.p, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Z0().z9(intent);
    }

    public final c54.b q1() {
        c54.b bVar = this.isFeatureEnabledUseCase;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
