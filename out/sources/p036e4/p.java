package p036e4;

import c5.r;
import er.l;
import n3.a2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Le4/p;", "Le4/a2;", "", "width", "height", "<init>", "(II)V", "Le4/a;", "alignmentLine", "I", "(Le4/a;)I", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "layerBlock", "W0", "(JFLer/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p extends a2 {
    public p(int i15, int i16) {
        d1(r.c((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32)));
    }

    @Override // p036e4.z0
    public int I(a alignmentLine) {
        return PKIFailureInfo.systemUnavail;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void W0(long position, float zIndex, l<? super a2, i0> layerBlock) {
    }
}
