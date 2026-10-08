package nf0;

import cf0.AsyncDocumentToGenerate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnf0/k;", "Ldf0/k;", "Lmf0/a;", "downloadTaskDataRepository", "<init>", "(Lmf0/a;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Lcf0/b;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lmf0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements df0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    public k(mf0.a aVar) {
        this.downloadTaskDataRepository = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<List<AsyncDocumentToGenerate>> a(gz.b.a.C1792a params) {
        return this.downloadTaskDataRepository.d();
    }
}
