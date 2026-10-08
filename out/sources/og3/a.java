package og3;

import p071kotlin.Metadata;
import sv0.ProcessId;
import tv0.BENewCollisionData;
import tv0.Description;
import tv0.YourDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000eJ$\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH¦@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u000fH¦@¢\u0006\u0004\b\u0016\u0010\u0014J$\u0010\u0018\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u000fH¦@¢\u0006\u0004\b\u0018\u0010\u0014R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\"À\u0006\u0003"}, d2 = {"Log3/a;", "Lif3/a;", "Lcg3/a;", "Lhh3/a;", "Lpf3/a;", "Llf3/c;", "Lth3/a;", "Lnh3/a;", "Lqh3/a;", "Lwf3/a;", "Lxh3/a;", "Lbi3/a;", "Llg3/a;", "Ltf3/c;", "Lkh3/a;", "Lkotlin/Function1;", "Ltv0/e;", "update", "Loq/i0;", "e7", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltv0/b;", "f3", "Ltv0/a;", "J6", "Ldx/i;", "Ldx/b;", "Lsv0/y;", "e", "()Ldx/i;", "processId", "X", "()Ltv0/e;", "currentData", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends if3.a, cg3.a, hh3.a, pf3.a, lf3.c, th3.a, nh3.a, qh3.a, wf3.a, xh3.a, bi3.a, lg3.a, tf3.c, kh3.a {
    Object J6(er.l<? super Description, Description> lVar, tq.e<? super oq.i0> eVar);

    @Override // wf3.a
    BENewCollisionData X();

    @Override // pf3.a, wf3.a, bi3.a, kh3.a
    dx.i<dx.b, ProcessId> e();

    Object e7(er.l<? super BENewCollisionData, BENewCollisionData> lVar, tq.e<? super oq.i0> eVar);

    Object f3(er.l<? super YourDetails, YourDetails> lVar, tq.e<? super oq.i0> eVar);
}
