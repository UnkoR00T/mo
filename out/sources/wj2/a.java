package wj2;

import a14.t;
import mz3.a0;
import mz3.i;
import mz3.l;
import p071kotlin.Metadata;
import q34.b2;
import v64.k;
import v64.m;
import v64.o;
import v64.p;
import v64.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010(\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)JW\u0010:\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020#2\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\bA\u0010BJ/\u0010K\u001a\u00020.2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020IH\u0007¢\u0006\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lwj2/a;", "", "<init>", "()V", "Lv64/p;", "loginUserToAppUseCase", "Lyj2/a;", "afterAppLoginUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Luj2/b;", "d", "(Lv64/p;Lyj2/a;Lac4/a;)Luj2/b;", "Lg04/c;", "biometricLoginUseCase", "Lg04/g;", "checkBiometricStatusUseCase", "loginToAppUseCase", "Liy/c;", "bytesConverter", "Lpx/d;", "remoteLogger", "Luj2/a;", "b", "(Lg04/c;Lg04/g;Luj2/b;Liy/c;Lpx/d;)Luj2/a;", "La14/t;", "monitorActivityVisibilityUseCase", "Lnx/b;", "loginViewLifecycleManager", "Lxj2/a;", "inactivityLogoutManager", "Lv64/o;", "isUserLoggedInUseCase", "Lv64/c;", "checkIsActivatedUseCase", "Lv64/k;", "consumeLoggedOutUseCase", "Lgx/d;", "globalEventManager", "Luj2/c;", "f", "(La14/t;Lnx/b;Lxj2/a;Lv64/o;Lv64/c;Lv64/k;Lgx/d;)Luj2/c;", "Lsj2/a;", "loginInteractor", "Lug1/e;", "setUpdateRecommendationDisplayedUseCase", "Lyj2/f;", "manageDocumentsDownloadStatusesAfterLoginUC", "Lax0/c;", "isAnyMainDocumentDownloadingUC", "Lv64/h;", "clearUnusedLegacyDataUC", "Lq34/b2;", "updateNeededDocumentSummaryDataUC", "Lz92/g;", "storeLocalAppActivityLogUC", "Lv64/m;", "doAfterUserLoginUseCase", "a", "(Lac4/a;Lsj2/a;Lug1/e;Lyj2/f;Lax0/c;Lv64/h;Lq34/b2;Lz92/g;Lv64/m;)Lyj2/a;", "Lvj2/a;", "loggingOutDataSource", "c", "(Lvj2/a;)Lv64/k;", "Lv64/r;", "g", "(Lvj2/a;)Lv64/r;", "Lmz3/i;", "deleteAllSpecificDocumentsDownloadStatusesUC", "Lmz3/l;", "getAllDocumentsDownloadStatusesUC", "Lmz3/m;", "getAllDownloadTaskDataUC", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "e", "(Lmz3/i;Lmz3/l;Lmz3/m;Lmz3/a0;)Lyj2/f;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f213869a = new a();

    private a() {
    }

    public final yj2.a a(ac4.a callActionWithLoaderUseCase, sj2.a loginInteractor, ug1.e setUpdateRecommendationDisplayedUseCase, yj2.f manageDocumentsDownloadStatusesAfterLoginUC, ax0.c isAnyMainDocumentDownloadingUC, v64.h clearUnusedLegacyDataUC, b2 updateNeededDocumentSummaryDataUC, z92.g storeLocalAppActivityLogUC, m doAfterUserLoginUseCase) {
        return new yj2.b(callActionWithLoaderUseCase, loginInteractor, setUpdateRecommendationDisplayedUseCase, manageDocumentsDownloadStatusesAfterLoginUC, isAnyMainDocumentDownloadingUC, clearUnusedLegacyDataUC, updateNeededDocumentSummaryDataUC, storeLocalAppActivityLogUC, doAfterUserLoginUseCase);
    }

    public final uj2.a b(g04.c biometricLoginUseCase, g04.g checkBiometricStatusUseCase, uj2.b loginToAppUseCase, iy.c bytesConverter, px.d remoteLogger) {
        return new yj2.c(biometricLoginUseCase, checkBiometricStatusUseCase, loginToAppUseCase, bytesConverter, remoteLogger);
    }

    public final k c(vj2.a loggingOutDataSource) {
        return new yj2.d(loggingOutDataSource);
    }

    public final uj2.b d(p loginUserToAppUseCase, yj2.a afterAppLoginUseCase, ac4.a callActionWithLoaderUseCase) {
        return new yj2.e(loginUserToAppUseCase, afterAppLoginUseCase, callActionWithLoaderUseCase);
    }

    public final yj2.f e(i deleteAllSpecificDocumentsDownloadStatusesUC, l getAllDocumentsDownloadStatusesUC, mz3.m getAllDownloadTaskDataUC, a0 updateDocumentDownloadStatusUseCase) {
        return new yj2.g(deleteAllSpecificDocumentsDownloadStatusesUC, getAllDocumentsDownloadStatusesUC, getAllDownloadTaskDataUC, updateDocumentDownloadStatusUseCase);
    }

    public final uj2.c f(t monitorActivityVisibilityUseCase, nx.b loginViewLifecycleManager, xj2.a inactivityLogoutManager, o isUserLoggedInUseCase, v64.c checkIsActivatedUseCase, k consumeLoggedOutUseCase, gx.d globalEventManager) {
        return new yj2.h(monitorActivityVisibilityUseCase, loginViewLifecycleManager, inactivityLogoutManager, isUserLoggedInUseCase, checkIsActivatedUseCase, consumeLoggedOutUseCase, globalEventManager);
    }

    public final r g(vj2.a loggingOutDataSource) {
        return new yj2.i(loggingOutDataSource);
    }
}
