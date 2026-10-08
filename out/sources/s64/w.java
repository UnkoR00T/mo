package s64;

import g64.GlobalSearchEntry;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls64/w;", "Lh64/s;", "Lr64/a;", "globalSearchRepository", "<init>", "(Lr64/a;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Lg64/b;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lr64/a;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements h64.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r64.a globalSearchRepository;

    public w(r64.a aVar) {
        this.globalSearchRepository = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<List<GlobalSearchEntry>> a(gz.b.a.C1792a params) {
        return this.globalSearchRepository.c(5);
    }
}
