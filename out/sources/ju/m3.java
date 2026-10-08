package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m3 {
    public static final Object a(tq.e<? super oq.i0> eVar) {
        Object objE;
        tq.i context = eVar.getContext();
        g2.j(context);
        tq.e eVarC = uq.b.c(eVar);
        ou.i iVar = eVarC instanceof ou.i ? (ou.i) eVarC : null;
        if (iVar == null) {
            objE = oq.i0.f148189a;
        } else {
            if (ou.j.d(iVar.dispatcher, context)) {
                iVar.n(context, oq.i0.f148189a);
            } else {
                l3 l3Var = new l3();
                tq.i iVarN0 = context.n0(l3Var);
                oq.i0 i0Var = oq.i0.f148189a;
                iVar.n(iVarN0, i0Var);
                objE = (!l3Var.dispatcherWasUnconfined || ou.j.e(iVar)) ? uq.b.e() : i0Var;
            }
            objE = uq.b.e();
        }
        if (objE == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }
}
