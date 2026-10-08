package ot3;

import ge4.x;
import ie4.o;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lot3/a;", "", "", "taskId", "Lge4/x;", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentId", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @o("offline-document/mobile/api/documents/download-async/terminate/{taskId}/{documentId}")
    Object a(@s("taskId") String str, @s("documentId") String str2, e<? super x<i0>> eVar);

    @o("offline-document/mobile/api/documents/download-async/ack/{taskId}")
    Object b(@s("taskId") String str, e<? super x<i0>> eVar);
}
