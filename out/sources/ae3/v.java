package ae3;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lae3/v;", "Lgz/b;", "Lae3/v$a;", "Loq/i0;", "Lzd3/d;", "statementRepository", "<init>", "(Lzd3/d;)V", "params", "d", "(Lae3/v$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzd3/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements gz.b<a, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zd3.d statementRepository;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lae3/v$a;", "Lgz/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a implements gz.b.a {
        NEXT_PAGE,
        REFRESH;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f6031d = wq.b.a(b());
    }

    public v(zd3.d dVar) {
        this.statementRepository = dVar;
    }

    public Object d(a aVar, tq.e<? super i0> eVar) {
        if (aVar == a.REFRESH) {
            this.statementRepository.reset();
        }
        this.statementRepository.b();
        return i0.f148189a;
    }
}
