package tz3;

import fr0.BEAsyncDocumentGenerationResult;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltz3/l0;", "Ltz3/k0;", "Lsz3/a;", "downloadDocumentRepository", "<init>", "(Lsz3/a;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "", "Lfr0/d;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lsz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    public l0(sz3.a aVar) {
        this.downloadDocumentRepository = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<Map<String, BEAsyncDocumentGenerationResult>> a(gz.b.a.C1792a params) {
        return this.downloadDocumentRepository.c();
    }
}
