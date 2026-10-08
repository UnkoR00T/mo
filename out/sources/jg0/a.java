package jg0;

import iy.i0;
import p071kotlin.Metadata;
import q34.z0;
import y00.h0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010.\u001a\u00020%H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b9\u0010:JI\u0010F\u001a\u00020E2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;2\b\b\u0001\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020H2\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\bI\u0010JJ?\u0010X\u001a\u00020W2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0007¢\u0006\u0004\bX\u0010YJ'\u0010^\u001a\u00020\u00182\u0006\u0010[\u001a\u00020Z2\u0006\u0010N\u001a\u00020M2\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\b^\u0010_J'\u0010d\u001a\u00020c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010`\u001a\u00020W2\u0006\u0010b\u001a\u00020aH\u0007¢\u0006\u0004\bd\u0010eJ'\u0010g\u001a\u00020f2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010`\u001a\u00020W2\u0006\u0010b\u001a\u00020aH\u0007¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020i2\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020l2\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\bm\u0010nJ'\u0010s\u001a\u00020r2\u0006\u0010o\u001a\u00020\u00132\u0006\u0010p\u001a\u00020\f2\u0006\u0010q\u001a\u00020CH\u0007¢\u0006\u0004\bs\u0010tJ'\u0010z\u001a\u00020y2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020wH\u0007¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020|2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J8\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0086\u0001\u001a\u00020iH\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0006\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0006\u0010\u0016\u001a\u00020\fH\u0007¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\"\u0010\u0096\u0001\u001a\u00020w2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u0098\u0001"}, d2 = {"Ljg0/a;", "", "<init>", "()V", "Lp10/f;", "dbProvider", "Liy/e0;", "signedDataDecoder", "Lez/c;", "dateConverter", "Lay/h;", "jsonFactory", "Lmg0/b;", "h", "(Lp10/f;Liy/e0;Lez/c;Lay/h;)Lmg0/b;", "Liy/i0;", "certificateDecoder", "Lpy/m;", "rsaKeyDecoder", "Lmg0/a;", "a", "(Lp10/f;Liy/i0;Lpy/m;)Lmg0/a;", "documentsRepository", "certificateRepository", "Lng0/c;", "decryptListOfScopesUC", "Leg0/t;", "z", "(Lmg0/b;Lmg0/a;Lng0/c;)Leg0/t;", "repository", "Leg0/k;", "p", "(Lmg0/b;)Leg0/k;", "Leg0/i;", "n", "(Lmg0/b;)Leg0/i;", "getOldestSchoolCardUC", "Leg0/j;", "o", "(Leg0/i;)Leg0/j;", "Leg0/f;", "k", "(Lmg0/b;)Leg0/f;", "Leg0/h;", "m", "(Lmg0/b;)Leg0/h;", "getPhotoFromMainDocumentUC", "Leg0/g;", "l", "(Lmg0/b;Leg0/j;)Leg0/g;", "Leg0/m;", "r", "(Lmg0/b;)Leg0/m;", "Leg0/q;", "v", "(Lmg0/b;)Leg0/q;", "Leg0/r;", "w", "(Lmg0/a;)Leg0/r;", "La80/g;", "revokeUserCertificateUC", "Lwy/b;", "networkSessionManager", "Lg80/a;", "notifyAboutDocumentDeleteUC", "Luf0/a;", "documentDownloadInteractor", "Lkg0/a;", "containersNotificationsInteractor", "Leg0/d;", "g", "(Lmg0/b;Lmg0/a;La80/g;Lwy/b;Lg80/a;Luf0/a;Lkg0/a;)Leg0/d;", "Leg0/o;", "u", "(Lmg0/b;)Leg0/o;", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Liy/c;", "bytesConverter", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "Lng0/d;", "e", "(Lpy/a;Liy/a;Liy/c;Ly00/h0;Liy/i;Liy/g;)Lng0/d;", "Liy/j;", "cmsManager", "Lay/j;", "jsonSerializer", "d", "(Liy/j;Liy/a;Lay/j;)Lng0/c;", "decryptUserCertificateUseCase", "Liy/v;", "pkcs12Manager", "Leg0/w;", "B", "(Lmg0/a;Lng0/d;Liy/v;)Leg0/w;", "Leg0/y;", ip.a.f96138c, "(Lmg0/a;Lng0/d;Liy/v;)Leg0/y;", "Leg0/l;", "q", "(Lmg0/a;)Leg0/l;", "Leg0/p;", "t", "(Lmg0/a;)Leg0/p;", "certRepository", "docRepository", "notificationsInteractor", "Leg0/a;", "b", "(Lmg0/a;Lmg0/b;Lkg0/a;)Leg0/a;", "Ly80/a;", "getDocumentsStatusesUC", "Lng0/g;", "getDocumentParentIdWithoutActiveTaskUC", "Leg0/s;", "x", "(Lmg0/b;Ly80/a;Lng0/g;)Leg0/s;", "Leg0/b;", "c", "(Lp10/f;)Leg0/b;", "Leg0/c;", "f", "(Lp10/f;)Leg0/c;", "Lq34/z0;", "getPeselFromPersonalIdCertificateUC", "Lg14/a;", "getInfoFromPeselUC", "getUserCertUC", "Leg0/x;", "C", "(Lmg0/a;Lq34/z0;Lg14/a;Leg0/l;)Leg0/x;", "Leg0/v;", "A", "(Lmg0/a;)Leg0/v;", "Leg0/u;", "y", "(Lmg0/b;)Leg0/u;", "Leg0/e;", "j", "(Lmg0/b;)Leg0/e;", "Leg0/n;", "s", "(Lmg0/b;)Leg0/n;", "i", "(Lmg0/b;Luf0/a;)Lng0/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102579a = new a();

    private a() {
    }

    public final eg0.v A(mg0.a repository) {
        return new ng0.y(repository);
    }

    public final eg0.w B(mg0.a repository, ng0.d decryptUserCertificateUseCase, iy.v pkcs12Manager) {
        return new ng0.z(repository, decryptUserCertificateUseCase, pkcs12Manager);
    }

    public final eg0.x C(mg0.a repository, z0 getPeselFromPersonalIdCertificateUC, g14.a getInfoFromPeselUC, eg0.l getUserCertUC) {
        return new ng0.a0(getPeselFromPersonalIdCertificateUC, getInfoFromPeselUC, getUserCertUC, repository);
    }

    public final eg0.y D(mg0.a repository, ng0.d decryptUserCertificateUseCase, iy.v pkcs12Manager) {
        return new ng0.b0(repository, decryptUserCertificateUseCase, pkcs12Manager);
    }

    public final mg0.a a(p10.f dbProvider, i0 certificateDecoder, py.m rsaKeyDecoder) {
        return new fg0.a(dbProvider, certificateDecoder, rsaKeyDecoder);
    }

    public final eg0.a b(mg0.a certRepository, mg0.b docRepository, kg0.a notificationsInteractor) {
        return new ng0.a(certRepository, docRepository, notificationsInteractor);
    }

    public final eg0.b c(p10.f dbProvider) {
        return new ng0.b(dbProvider);
    }

    public final ng0.c d(iy.j cmsManager, iy.a base64Coder, ay.j jsonSerializer) {
        return new ng0.c(cmsManager, base64Coder, jsonSerializer);
    }

    public final ng0.d e(py.a aesKeyDecoder, iy.a base64Coder, iy.c bytesConverter, h0 securityProviderFactory, iy.i cipherRsa, iy.g cipherAes) {
        return new ng0.d(aesKeyDecoder, base64Coder, bytesConverter, securityProviderFactory, cipherRsa, cipherAes);
    }

    public final eg0.c f(p10.f dbProvider) {
        return new ng0.e(dbProvider);
    }

    public final eg0.d g(mg0.b documentsRepository, mg0.a certificateRepository, a80.g revokeUserCertificateUC, wy.b networkSessionManager, g80.a notifyAboutDocumentDeleteUC, uf0.a documentDownloadInteractor, kg0.a containersNotificationsInteractor) {
        return new ng0.f(documentsRepository, certificateRepository, revokeUserCertificateUC, networkSessionManager, notifyAboutDocumentDeleteUC, documentDownloadInteractor, containersNotificationsInteractor);
    }

    public final mg0.b h(p10.f dbProvider, iy.e0 signedDataDecoder, ez.c dateConverter, ay.h jsonFactory) {
        return new fg0.c(dbProvider, signedDataDecoder, dateConverter, jsonFactory);
    }

    public final ng0.g i(mg0.b documentsRepository, uf0.a documentDownloadInteractor) {
        return new ng0.g(documentDownloadInteractor, documentsRepository);
    }

    public final eg0.e j(mg0.b repository) {
        return new ng0.h(repository);
    }

    public final eg0.f k(mg0.b repository) {
        return new ng0.i(repository);
    }

    public final eg0.g l(mg0.b repository, eg0.j getPhotoFromMainDocumentUC) {
        return new ng0.j(repository, getPhotoFromMainDocumentUC);
    }

    public final eg0.h m(mg0.b repository) {
        return new ng0.k(repository);
    }

    public final eg0.i n(mg0.b repository) {
        return new ng0.l(repository);
    }

    public final eg0.j o(eg0.i getOldestSchoolCardUC) {
        return new ng0.m(getOldestSchoolCardUC);
    }

    public final eg0.k p(mg0.b repository) {
        return new ng0.n(repository);
    }

    public final eg0.l q(mg0.a repository) {
        return new ng0.o(repository);
    }

    public final eg0.m r(mg0.b repository) {
        return new ng0.p(repository);
    }

    public final eg0.n s(mg0.b documentsRepository) {
        return new ng0.q(documentsRepository);
    }

    public final eg0.p t(mg0.a repository) {
        return new ng0.s(repository);
    }

    public final eg0.o u(mg0.b repository) {
        return new ng0.r(repository);
    }

    public final eg0.q v(mg0.b repository) {
        return new ng0.t(repository);
    }

    public final eg0.r w(mg0.a repository) {
        return new ng0.u(repository);
    }

    public final eg0.s x(mg0.b repository, y80.a getDocumentsStatusesUC, ng0.g getDocumentParentIdWithoutActiveTaskUC) {
        return new ng0.v(repository, getDocumentsStatusesUC, getDocumentParentIdWithoutActiveTaskUC);
    }

    public final eg0.u y(mg0.b repository) {
        return new ng0.x(repository);
    }

    public final eg0.t z(mg0.b documentsRepository, mg0.a certificateRepository, ng0.c decryptListOfScopesUC) {
        return new ng0.w(documentsRepository, certificateRepository, decryptListOfScopesUC);
    }
}
