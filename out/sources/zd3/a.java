package zd3;

import dx.i;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tv0.BESavedDraftCollision;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u0006H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\fJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0015\u0010\n¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lzd3/a;", "", "Lsv0/y;", "processId", "Ltv0/g;", "savedDraftCollision", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Lsv0/y;Ltv0/g;Ltq/e;)Ljava/lang/Object;", "c", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "d", "", "collisionDraftData", "a", "(Lsv0/y;[BLtq/e;)Ljava/lang/Object;", "f", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(ProcessId processId, byte[] bArr, tq.e<? super i<? extends dx.b, BESavedDraftCollision>> eVar);

    Object b(tq.e<? super i<? extends dx.b, ? extends List<ProcessId>>> eVar);

    Object c(ProcessId processId, tq.e<? super i<? extends dx.b, BESavedDraftCollision>> eVar);

    Object d(ProcessId processId, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object e(ProcessId processId, BESavedDraftCollision bESavedDraftCollision, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object f(ProcessId processId, BESavedDraftCollision bESavedDraftCollision, tq.e<? super i<? extends dx.b, byte[]>> eVar);
}
