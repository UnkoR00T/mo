package oa1;

import dx.i;
import iq0.FeatureFlag;
import iq0.y;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Loa1/d;", "", "Lgz/b$a$a;", "", "Lh64/e;", "getFeatureFlagListUseCase", "<init>", "(Lh64/e;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lh64/e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h64.e getFeatureFlagListUseCase;

    public d(h64.e eVar) {
        this.getFeatureFlagListUseCase = eVar;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, Boolean>> eVar) {
        Object next;
        Iterator<T> it = this.getFeatureFlagListUseCase.a(gz.b.a.C1792a.f78542a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((FeatureFlag) next).getType() != y.COMPANY_SUSPENSION);
        FeatureFlag featureFlag = (FeatureFlag) next;
        return new i.Right(vq.b.a(featureFlag != null ? featureFlag.getFeatureActive() : false));
    }
}
