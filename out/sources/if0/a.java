package if0;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import ub.p0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J/\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u0002002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010D\u001a\u00020C2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020F2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\bM\u0010NJ'\u0010O\u001a\u00020A2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00152\u0006\u0010U\u001a\u00020TH\u0007¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020XH\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\\2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lif0/a;", "", "<init>", "()V", "Lz70/h;", "mJuniorAsyncEndpoints", "Lay/o;", "sseManagerFactory", "Lay/j;", "jsonSerializer", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Ljx/d;", "deviceInfo", "Ljf0/a;", "e", "(Lz70/h;Lay/o;Lay/j;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/w;Ljx/d;)Ljf0/a;", "Lmf0/a;", "downloadTaskDataRepository", "Lof0/a;", "asyncDownloadDocumentsManager", "Lez/a;", "currentTimeProvider", "Ldf0/f;", "i", "(Lmf0/a;Lof0/a;Lez/a;)Ldf0/f;", "documentDownloadRepository", "initDownloadTaskWorkUC", "Ldf0/m;", "p", "(Ljf0/a;Ldf0/f;)Ldf0/m;", "Ly80/d;", "updateSchoolCardUC", "Llf0/a;", "documentStorageInteractor", "Ldf0/n;", "q", "(Ljf0/a;Ldf0/f;Ly80/d;Llf0/a;)Ldf0/n;", "La80/c;", "asyncMainDocumentTerminationUC", "Ldf0/g;", "j", "(Lmf0/a;Lof0/a;La80/c;Ljf0/a;)Ldf0/g;", "Ldf0/q;", "t", "(Lmf0/a;Ljf0/a;)Ldf0/q;", "Ldf0/a;", "b", "(Lmf0/a;Lof0/a;Ljf0/a;)Ldf0/a;", "Ldf0/b;", "c", "(Lmf0/a;)Ldf0/b;", "Ldf0/o;", "r", "(Lof0/a;)Ldf0/o;", "Ldf0/d;", "g", "(Lmf0/a;)Ldf0/d;", "Ldf0/c;", "d", "(Lmf0/a;)Ldf0/c;", "Lay/k;", "networkConnectionManager", "Ldf0/h;", "manageDownloadTasksUC", "Ldf0/p;", "s", "(Lay/k;Ldf0/h;)Ldf0/p;", "Ldf0/l;", "o", "(Lmf0/a;)Ldf0/l;", "Ldf0/j;", "m", "(Lmf0/a;)Ldf0/j;", "Ldf0/k;", "n", "(Lmf0/a;)Ldf0/k;", "k", "(Lmf0/a;Ljf0/a;Lof0/a;)Ldf0/h;", "Ldf0/i;", "l", "(Lof0/a;)Ldf0/i;", "Lub/p0;", "workManager", "a", "(Lub/p0;)Lof0/a;", "Lp10/f;", "dbProvider", "f", "(Lp10/f;)Lmf0/a;", "Ldf0/e;", "h", "(Lmf0/a;)Ldf0/e;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92078a = new a();

    private a() {
    }

    public final of0.a a(p0 workManager) {
        return new of0.b(workManager);
    }

    public final df0.a b(mf0.a downloadTaskDataRepository, of0.a asyncDownloadDocumentsManager, jf0.a documentDownloadRepository) {
        return new nf0.a(documentDownloadRepository, downloadTaskDataRepository, asyncDownloadDocumentsManager);
    }

    public final df0.b c(mf0.a downloadTaskDataRepository) {
        return new nf0.b(downloadTaskDataRepository);
    }

    public final df0.c d(mf0.a downloadTaskDataRepository) {
        return new nf0.c(downloadTaskDataRepository);
    }

    public final jf0.a e(z70.h mJuniorAsyncEndpoints, ay.o sseManagerFactory, ay.j jsonSerializer, g0 networkCallMediator, w httpServiceFactory, jx.d deviceInfo) {
        return new ef0.d(sseManagerFactory.a(new ay.l.New(gu.d.q(6, gu.e.MINUTES), null)), jsonSerializer, networkCallMediator, httpServiceFactory, mJuniorAsyncEndpoints, deviceInfo);
    }

    public final mf0.a f(p10.f dbProvider) {
        return new pl.gov.coi.mjunior.technical.async.data.storage.b(dbProvider);
    }

    public final df0.d g(mf0.a downloadTaskDataRepository) {
        return new nf0.d(downloadTaskDataRepository);
    }

    public final df0.e h(mf0.a downloadTaskDataRepository) {
        return new nf0.e(downloadTaskDataRepository);
    }

    public final df0.f i(mf0.a downloadTaskDataRepository, of0.a asyncDownloadDocumentsManager, ez.a currentTimeProvider) {
        return new nf0.f(downloadTaskDataRepository, asyncDownloadDocumentsManager, currentTimeProvider);
    }

    public final df0.g j(mf0.a downloadTaskDataRepository, of0.a asyncDownloadDocumentsManager, a80.c asyncMainDocumentTerminationUC, jf0.a documentDownloadRepository) {
        return new nf0.g(documentDownloadRepository, downloadTaskDataRepository, asyncMainDocumentTerminationUC, asyncDownloadDocumentsManager);
    }

    public final df0.h k(mf0.a downloadTaskDataRepository, jf0.a documentDownloadRepository, of0.a asyncDownloadDocumentsManager) {
        return new nf0.h(documentDownloadRepository, downloadTaskDataRepository, asyncDownloadDocumentsManager);
    }

    public final df0.i l(of0.a asyncDownloadDocumentsManager) {
        return new nf0.i(asyncDownloadDocumentsManager);
    }

    public final df0.j m(mf0.a downloadTaskDataRepository) {
        return new nf0.j(downloadTaskDataRepository);
    }

    public final df0.k n(mf0.a downloadTaskDataRepository) {
        return new nf0.k(downloadTaskDataRepository);
    }

    public final df0.l o(mf0.a downloadTaskDataRepository) {
        return new nf0.l(downloadTaskDataRepository);
    }

    public final df0.m p(jf0.a documentDownloadRepository, df0.f initDownloadTaskWorkUC) {
        return new nf0.m(documentDownloadRepository, initDownloadTaskWorkUC);
    }

    public final df0.n q(jf0.a documentDownloadRepository, df0.f initDownloadTaskWorkUC, y80.d updateSchoolCardUC, lf0.a documentStorageInteractor) {
        return new nf0.n(documentDownloadRepository, initDownloadTaskWorkUC, updateSchoolCardUC, documentStorageInteractor);
    }

    public final df0.o r(of0.a asyncDownloadDocumentsManager) {
        return new nf0.o(asyncDownloadDocumentsManager);
    }

    public final df0.p s(ay.k networkConnectionManager, df0.h manageDownloadTasksUC) {
        return new nf0.p(networkConnectionManager, manageDownloadTasksUC);
    }

    public final df0.q t(mf0.a downloadTaskDataRepository, jf0.a documentDownloadRepository) {
        return new nf0.q(documentDownloadRepository, downloadTaskDataRepository);
    }
}
