package ja;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0001\fBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lja/m0;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSize", "maxSize", "jumpThreshold", "<init>", "(IIZIII)V", "a", "I", "b", "c", "Z", "d", "e", "f", "g", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int pageSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int prefetchDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean enablePlaceholders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int initialLoadSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int maxSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int jumpThreshold;

    public m0(int i15, int i16, boolean z15, int i17, int i18, int i19) {
        this.pageSize = i15;
        this.prefetchDistance = i16;
        this.enablePlaceholders = z15;
        this.initialLoadSize = i17;
        this.maxSize = i18;
        this.jumpThreshold = i19;
        if (!z15 && i16 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i18 == Integer.MAX_VALUE || i18 >= (i16 * 2) + i15) {
            if (i19 != Integer.MIN_VALUE && i19 <= 0) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
            }
            return;
        }
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i15 + ", prefetchDist=" + i16 + ", maxSize=" + i18);
    }

    public /* synthetic */ m0(int i15, int i16, boolean z15, int i17, int i18, int i19, int i25, fr.k kVar) {
        this(i15, (i25 & 2) != 0 ? i15 : i16, (i25 & 4) != 0 ? true : z15, (i25 & 8) != 0 ? i15 * 3 : i17, (i25 & 16) != 0 ? Integer.MAX_VALUE : i18, (i25 & 32) != 0 ? PKIFailureInfo.systemUnavail : i19);
    }
}
