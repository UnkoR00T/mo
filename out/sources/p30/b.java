package p30;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp30/x$b;", "Lmx/a;", "c", "(Lp30/x$b;)Lmx/a;", "", "d", "(Lp30/x$b;)I", "iconResId", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Label c(x.b bVar) {
        Label labelH0;
        Label labelB = bVar.g() ? c70.a.f23835a.a().B() : c70.a.f23835a.a().n0();
        if (bVar instanceof x.b.C3752b) {
            labelH0 = c70.a.f23835a.a().j();
        } else {
            if (!(bVar instanceof x.b.a)) {
                throw new oq.p();
            }
            labelH0 = c70.a.f23835a.a().H0();
        }
        return mx.b.b(labelH0.getText() + ". " + labelB.getText() + '.', labelH0.getTag() + '_' + labelB.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(x.b bVar) {
        if (bVar instanceof x.b.C3752b) {
            boolean zG = ((x.b.C3752b) bVar).g();
            if (zG) {
                return jz.a.E1;
            }
            if (zG) {
                throw new oq.p();
            }
            return jz.a.f106761e1;
        }
        if (!(bVar instanceof x.b.a)) {
            throw new oq.p();
        }
        boolean zG2 = ((x.b.a) bVar).g();
        if (zG2) {
            return jz.a.F1;
        }
        if (zG2) {
            throw new oq.p();
        }
        return jz.a.f106769f1;
    }
}
