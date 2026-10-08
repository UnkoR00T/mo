package wd3;

import dx.i;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.a0;
import sv0.n;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lwd3/a;", "", "Lsv0/y;", "processId", "Loq/i0;", "a", "(Lsv0/y;)V", "Ldx/i;", "Ldx/b;", "d", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lsv0/a0;", "reason", "c", "(Lsv0/y;Lsv0/a0;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lsv0/n;", "b", "()Lmu/g;", "cancel", "()V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(ProcessId processId);

    g<n> b();

    Object c(ProcessId processId, a0 a0Var, e<? super i<? extends dx.b, i0>> eVar);

    void cancel();

    Object d(ProcessId processId, e<? super i<? extends dx.b, i0>> eVar);
}
