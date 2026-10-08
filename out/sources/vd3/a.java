package vd3;

import dx.b;
import dx.i;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tq.e;
import yd3.PersonalDataContainer;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u0005H¦@¢\u0006\u0004\b\u0014\u0010\tJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lvd3/a;", "", "", "a", "()Z", "Ldx/i;", "Ldx/b;", "Lyd3/e;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lsv0/y;", "processId", "", "savedDraftCollision", "Loq/i0;", "f", "(Lsv0/y;[BLtq/e;)Ljava/lang/Object;", "c", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "", "b", "d", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    boolean a();

    Object b(e<? super i<? extends b, ? extends List<ProcessId>>> eVar);

    Object c(ProcessId processId, e<? super i<? extends b, byte[]>> eVar);

    Object d(ProcessId processId, e<? super i<? extends b, i0>> eVar);

    Object e(e<? super i<? extends b, PersonalDataContainer>> eVar);

    Object f(ProcessId processId, byte[] bArr, e<? super i<? extends b, i0>> eVar);
}
