package pc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpc4/h4;", "", "<init>", "()V", "Lh64/e;", "getFeatureFlagListUC", "Li44/a;", "b", "(Lh64/e;)Li44/a;", "Lrv3/d;", "refreshEdorAuthOwTokenUC", "Ll44/c;", "getOwAccessTokenUC", "Lnv3/c;", "interactor", "Lk54/a;", "callActionWithKeycloakAccessTokenUC", "Ll44/a;", "a", "(Lrv3/d;Ll44/c;Lnv3/c;Lk54/a;)Ll44/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h4 {
    public final l44.a a(rv3.d refreshEdorAuthOwTokenUC, l44.c getOwAccessTokenUC, nv3.c interactor, k54.a callActionWithKeycloakAccessTokenUC) {
        return new rv3.a(interactor, callActionWithKeycloakAccessTokenUC, refreshEdorAuthOwTokenUC, getOwAccessTokenUC);
    }

    public final i44.a b(h64.e getFeatureFlagListUC) {
        return new ad4.a(getFeatureFlagListUC);
    }
}
