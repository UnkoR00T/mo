package ka2;

import dx.i;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lka2/f;", "Lz92/e;", "Lja2/a;", "repository", "Lha2/a;", "historyDocumentsInteractor", "<init>", "(Lja2/a;Lha2/a;)V", "Lz92/e$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lz92/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lja2/a;", "b", "Lha2/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements z92.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ja2.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ha2.a historyDocumentsInteractor;

    public f(ja2.a aVar, ha2.a aVar2) {
        this.repository = aVar;
        this.historyDocumentsInteractor = aVar2;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(z92.e.Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.historyDocumentsInteractor.a() ? this.repository.b(params.getHistoryEntry(), eVar) : this.historyDocumentsInteractor.b(params.getHistoryEntry(), eVar);
    }
}
