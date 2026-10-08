package tz3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltz3/o;", "Ltz3/n;", "Lsz3/a;", "downloadDocumentRepository", "<init>", "(Lsz3/a;)V", "Ltz3/n$a;", "params", "Ldx/i;", "Ldx/b;", "Lfr0/a;", "d", "(Ltz3/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Lsz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    public o(sz3.a aVar) {
        this.downloadDocumentRepository = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(n.Params params, tq.e<? super dx.i<? extends dx.b, ? extends fr0.a>> eVar) {
        return params.getAuthToken() == null ? this.downloadDocumentRepository.e(params.getTaskId(), eVar) : this.downloadDocumentRepository.f(params.getTaskId(), params.getAuthToken(), eVar);
    }
}
