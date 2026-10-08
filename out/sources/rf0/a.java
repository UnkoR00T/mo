package rf0;

import a80.e;
import a80.h;
import eg0.l;
import eg0.s;
import eg0.y;
import p071kotlin.Metadata;
import sf0.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lrf0/a;", "", "<init>", "()V", "La80/e;", "generateChallengeUC", "Leg0/a;", "changeUserCertStatusUC", "Lsf0/b;", "getJwtTokenUC", "Lwy/b;", "networkSessionManager", "Lez/a;", "currentTimeProvider", "Leg0/s;", "refreshDocumentsStatusesUC", "Lqf0/a;", "a", "(La80/e;Leg0/a;Lsf0/b;Lwy/b;Lez/a;Leg0/s;)Lqf0/a;", "Leg0/l;", "getUserCertUC", "La80/h;", "updateJuniorCertificateUC", "Leg0/y;", "updateUserCertUC", "Lqf0/b;", "b", "(Leg0/l;La80/h;Leg0/y;Leg0/a;)Lqf0/b;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f173673a = new a();

    private a() {
    }

    public final qf0.a a(e generateChallengeUC, eg0.a changeUserCertStatusUC, sf0.b getJwtTokenUC, wy.b networkSessionManager, ez.a currentTimeProvider, s refreshDocumentsStatusesUC) {
        return new sf0.c(generateChallengeUC, changeUserCertStatusUC, getJwtTokenUC, networkSessionManager, currentTimeProvider, refreshDocumentsStatusesUC);
    }

    public final qf0.b b(l getUserCertUC, h updateJuniorCertificateUC, y updateUserCertUC, eg0.a changeUserCertStatusUC) {
        return new d(getUserCertUC, updateJuniorCertificateUC, updateUserCertUC, changeUserCertStatusUC);
    }
}
