package nf0;

import cf0.AsyncDocumentToGenerate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnf0/j;", "Ldf0/j;", "Lmf0/a;", "downloadTaskDataRepository", "<init>", "(Lmf0/a;)V", "Ldf0/j$a;", "params", "Lmu/g;", "Lcf0/b;", "b", "(Ldf0/j$a;)Lmu/g;", "a", "Lmf0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements df0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    public j(mf0.a aVar) {
        this.downloadTaskDataRepository = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<AsyncDocumentToGenerate> a(df0.j.Params params) {
        return this.downloadTaskDataRepository.h(params.getDocumentToGenerateId());
    }
}
