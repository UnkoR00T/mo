package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc5/n;", "offset", "Lc5/r;", "size", "Lc5/p;", "a", "(JJ)Lc5/p;", "Lm3/g;", "c", "(Lc5/p;)Lm3/g;", "b", "(Lm3/g;)Lc5/p;", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final p a(long j15, long j16) {
        return new p(n.i(j15), n.j(j15), n.i(j15) + ((int) (j16 >> 32)), n.j(j15) + ((int) (j16 & BodyPartID.bodyIdMax)));
    }

    public static final p b(m3.g gVar) {
        return new p(Math.round(gVar.getLeft()), Math.round(gVar.getTop()), Math.round(gVar.getRight()), Math.round(gVar.getBottom()));
    }

    public static final m3.g c(p pVar) {
        return new m3.g(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
    }
}
