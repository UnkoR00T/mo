package ow;

import fr.t;
import java.util.List;
import nw.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Low/a;", "Lnw/f;", "", "Lyv/a;", "typesAfterLT", "<init>", "(Ljava/util/List;)V", "Lnw/i;", "tokens", "Llr/i;", "rangesToGlue", "Lnw/f$b;", "a", "(Lnw/i;Ljava/util/List;)Lnw/f$b;", "Ljava/util/List;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a implements nw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<yv.a> typesAfterLT;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends yv.a> list) {
        this.typesAfterLT = list;
    }

    @Override // nw.f
    public nw.f.b a(i tokens, List<lr.i> rangesToGlue) {
        yv.a aVarJ;
        yv.a aVar;
        nw.f.c cVar = new nw.f.c();
        nw.e eVar = new nw.e();
        i.b bVar = new i.b(tokens, rangesToGlue);
        while (bVar.h() != null) {
            if (t.c(bVar.h(), yv.e.f229931l) && (aVarJ = bVar.j(1)) != null && this.typesAfterLT.contains(aVarJ)) {
                int index = bVar.getIndex();
                while (true) {
                    yv.a aVarH = bVar.h();
                    aVar = yv.e.f229932m;
                    if (t.c(aVarH, aVar) || bVar.h() == null) {
                        break;
                    }
                    bVar = bVar.a();
                }
                if (t.c(bVar.h(), aVar)) {
                    cVar.d(new nw.f.Node(new lr.i(index, bVar.getIndex() + 1), yv.c.AUTOLINK));
                }
            } else {
                eVar.b(bVar.getIndex());
            }
            bVar = bVar.a();
        }
        return cVar.c(eVar.a());
    }
}
