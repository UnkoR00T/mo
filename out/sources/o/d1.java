package o;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lo/d1;", "Lo/u1;", "", "Lo/j2;", "useCases", "Lo/k2;", "viewPort", "Lo/k;", "effects", "<init>", "(Ljava/util/List;Lo/k2;Ljava/util/List;)V", "", "m", "Z", "p", "()Z", "isLegacy", "n", "i", "requireNonEmptyUseCases", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isLegacy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean requireNonEmptyUseCases;

    public d1(List<? extends j2> list, k2 k2Var, List<? extends k> list2) {
        super(list, k2Var, list2, null, null, null, 56, null);
        this.isLegacy = true;
    }

    @Override // o.u1
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getRequireNonEmptyUseCases() {
        return this.requireNonEmptyUseCases;
    }

    @Override // o.u1
    /* JADX INFO: renamed from: p, reason: from getter */
    public boolean getIsLegacy() {
        return this.isLegacy;
    }

    public /* synthetic */ d1(List list, k2 k2Var, List list2, int i15, fr.k kVar) {
        this(list, (i15 & 2) != 0 ? null : k2Var, (i15 & 4) != 0 ? pq.v.n() : list2);
    }
}
