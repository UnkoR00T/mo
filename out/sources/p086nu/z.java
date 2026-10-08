package p086nu;

import er.p;
import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou.a0;
import p071kotlin.Metadata;
import tq.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnu/w;", "Ltq/i;", "currentContext", "Loq/i0;", "b", "(Lnu/w;Ltq/i;)V", "Lju/d2;", "collectJob", "d", "(Lju/d2;Lju/d2;)Lju/d2;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final void b(final w<?> wVar, i iVar) {
        if (((Number) iVar.s1(0, new p() { // from class: nu.y
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(z.c(wVar, ((Integer) obj).intValue(), (i.b) obj2));
            }
        })).intValue() == wVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + wVar.collectContext + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(w wVar, int i15, i.b bVar) {
        i.c<?> key = bVar.getKey();
        i.b bVarM = wVar.collectContext.m(key);
        if (key != d2.INSTANCE) {
            return bVar != bVarM ? PKIFailureInfo.systemUnavail : i15 + 1;
        }
        d2 d2Var = (d2) bVarM;
        d2 d2VarD = d((d2) bVar, d2Var);
        if (d2VarD == d2Var) {
            return d2Var == null ? i15 : i15 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d2VarD + ", expected child of " + d2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final d2 d(d2 d2Var, d2 d2Var2) {
        while (d2Var != null) {
            if (d2Var == d2Var2 || !(d2Var instanceof a0)) {
                return d2Var;
            }
            d2Var = ((a0) d2Var).q0();
        }
        return null;
    }
}
