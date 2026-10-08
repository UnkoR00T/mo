package wf3;

import dx.b;
import dx.i;
import er.l;
import java.util.List;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tq.e;
import tv0.BENewCollisionData;
import tv0.BEPersonalData;
import tv0.YourDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH¦@¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lwf3/a;", "", "Lkotlin/Function1;", "Ltv0/f;", "personalData", "Loq/i0;", "D3", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "", "Ltv0/b$a;", "photos", "w3", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "Lsv0/y;", "e", "()Ldx/i;", "processId", "Lmu/g;", "i", "()Lmu/g;", "g6", "()Ltv0/f;", "currentPersonalData", "Ltv0/e;", "X", "()Ltv0/e;", "currentData", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object D3(l<? super BEPersonalData, BEPersonalData> lVar, e<? super i0> eVar);

    BENewCollisionData X();

    i<b, ProcessId> e();

    BEPersonalData g6();

    g<BEPersonalData> i();

    Object w3(List<YourDetails.Photo> list, e<? super i0> eVar);
}
