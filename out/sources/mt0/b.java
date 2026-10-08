package mt0;

import ge4.x;
import ie4.f;
import ie4.p;
import ie4.s;
import oq.i0;
import ot0.NotDisplayedPushCountDto;
import ot0.PushHistoryDto;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lmt0/b;", "", "Lge4/x;", "Lot0/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lot0/e;", "c", "", "recordId", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @p("push/mobile/api/notifications-history/displayed/{recordId}")
    Object a(@s("recordId") String str, e<? super x<i0>> eVar);

    @f("push/mobile/api/notifications-history/not-displayed-count")
    Object b(e<? super x<NotDisplayedPushCountDto>> eVar);

    @f("push/mobile/api/notifications-history")
    Object c(e<? super x<PushHistoryDto>> eVar);
}
