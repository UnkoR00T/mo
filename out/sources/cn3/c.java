package cn3;

import h64.e;
import iq0.FeatureFlag;
import iq0.y;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcn3/c;", "Lgz/b;", "Lgz/b$a$a;", "", "Lh64/e;", "getFeatureFlagListUseCase", "<init>", "(Lh64/e;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lh64/e;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getFeatureFlagListUseCase;

    public c(e eVar) {
        this.getFeatureFlagListUseCase = eVar;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) {
        Object next;
        Iterator<T> it = this.getFeatureFlagListUseCase.a(gz.b.a.C1792a.f78542a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((FeatureFlag) next).getType() != y.VEHICLE_CARD_UPDATE);
        FeatureFlag featureFlag = (FeatureFlag) next;
        return vq.b.a(featureFlag != null ? featureFlag.getFeatureActive() : true);
    }
}
