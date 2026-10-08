package s64;

import iq0.RateConfigurationEntry;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls64/i;", "Lh64/i;", "Lq64/b;", "remoteSettingsLocalRepository", "<init>", "(Lq64/b;)V", "Lgz/b$a$a;", "params", "Liq0/x;", "b", "(Lgz/b$a$a;)Liq0/x;", "a", "Lq64/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements h64.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.b remoteSettingsLocalRepository;

    public i(q64.b bVar) {
        this.remoteSettingsLocalRepository = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RateConfigurationEntry a(gz.b.a.C1792a params) {
        RateConfigurationEntry rateConfiguration;
        RemoteSettingsData value = this.remoteSettingsLocalRepository.j0().getValue();
        return (value == null || (rateConfiguration = value.getRateConfiguration()) == null) ? RateConfigurationEntry.INSTANCE.a() : rateConfiguration;
    }
}
