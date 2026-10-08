package vs0;

import ge4.x;
import ie4.f;
import ie4.o;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import xs0.AuthorizedRequest;
import xs0.RestrictionDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lvs0/a;", "", "Lxs0/a;", "authorizedRequest", "Lge4/x;", "Loq/i0;", "b", "(Lxs0/a;Ltq/e;)Ljava/lang/Object;", "d", "c", "Lxs0/j;", "a", "(Ltq/e;)Ljava/lang/Object;", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("pesel-restriction/mobile/api/pesel/restrictions")
    Object a(e<? super x<RestrictionDto>> eVar);

    @o("pesel-restriction/mobile/api/pesel/restrictions/cancel-planned")
    Object b(@ie4.a AuthorizedRequest authorizedRequest, e<? super x<i0>> eVar);

    @o("pesel-restriction/mobile/api/pesel/restrictions/enable")
    Object c(@ie4.a AuthorizedRequest authorizedRequest, e<? super x<i0>> eVar);

    @o("pesel-restriction/mobile/api/pesel/restrictions/disable")
    Object d(@ie4.a AuthorizedRequest authorizedRequest, e<? super x<i0>> eVar);
}
