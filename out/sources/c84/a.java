package c84;

import d84.NotificationSettingsSection;
import d84.NotificationSettingsUpdateEntry;
import dx.b;
import dx.i;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lc84/a;", "", "Ldx/i;", "Ldx/b;", "", "Ld84/c;", "d", "(Ltq/e;)Ljava/lang/Object;", "Ld84/d;", "settings", "Loq/i0;", "c", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "isEnabled", "f", "(ZLtq/e;)Ljava/lang/Object;", "Lw74/a;", "b", "()Lw74/a;", "featureConfig", "", "e", "()Ljava/lang/String;", "appPzGovUrl", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    w74.a b();

    Object c(List<NotificationSettingsUpdateEntry> list, e<? super i<? extends b, i0>> eVar);

    Object d(e<? super i<? extends b, ? extends List<NotificationSettingsSection>>> eVar);

    String e();

    Object f(boolean z15, e<? super i0> eVar);
}
