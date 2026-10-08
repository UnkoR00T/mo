package g01;

import h64.e;
import h64.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg01/a;", "", "<init>", "()V", "Lh64/e;", "getFeatureFlagListUseCase", "Lf01/a;", "a", "(Lh64/e;)Lf01/a;", "Lix/a;", "inAppReviewPromptRunner", "isAppRatingFeatureFlagActiveUC", "Lh64/i;", "getRateConfigurationUseCase", "Lf01/b;", "b", "(Lix/a;Lf01/a;Lh64/i;)Lf01/b;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69178a = new a();

    private a() {
    }

    public final f01.a a(e getFeatureFlagListUseCase) {
        return new h01.a(getFeatureFlagListUseCase);
    }

    public final f01.b b(ix.a inAppReviewPromptRunner, f01.a isAppRatingFeatureFlagActiveUC, i getRateConfigurationUseCase) {
        return new h01.b(inAppReviewPromptRunner, isAppRatingFeatureFlagActiveUC, getRateConfigurationUseCase);
    }
}
