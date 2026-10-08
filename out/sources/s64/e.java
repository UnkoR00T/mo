package s64;

import iq0.FeatureFlag;
import java.util.List;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls64/e;", "Lh64/e;", "Lq64/b;", "remoteSettingsLocalRepository", "<init>", "(Lq64/b;)V", "Lgz/b$a$a;", "params", "", "Liq0/u;", "b", "(Lgz/b$a$a;)Ljava/util/List;", "a", "Lq64/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements h64.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.b remoteSettingsLocalRepository;

    public e(q64.b bVar) {
        this.remoteSettingsLocalRepository = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<FeatureFlag> a(gz.b.a.C1792a params) {
        List<FeatureFlag> listB;
        RemoteSettingsData value = this.remoteSettingsLocalRepository.j0().getValue();
        return (value == null || (listB = value.b()) == null) ? pq.v.n() : listB;
    }
}
