package g4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/j;", "Le4/a;", "alignmentLine", "", "b", "(Landroidx/compose/ui/node/j;Le4/a;)I", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(androidx.compose.ui.node.j jVar, p036e4.a aVar) {
        androidx.compose.ui.node.j jVarE1 = jVar.E1();
        if (!(jVarE1 != null)) {
            d4.a.c("Child of " + jVar + " cannot be null when calculating alignment line");
        }
        if (jVar.J1().i().containsKey(aVar)) {
            Integer num = jVar.J1().i().get(aVar);
            return num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
        }
        int I = jVarE1.I(aVar);
        if (I == Integer.MIN_VALUE) {
            return PKIFailureInfo.systemUnavail;
        }
        jVarE1.r2(true);
        jVar.p2(true);
        jVar.h2();
        jVarE1.r2(false);
        jVar.p2(false);
        return I + (aVar instanceof p036e4.q ? c5.n.j(jVarE1.getPosition()) : c5.n.i(jVarE1.getPosition()));
    }
}
