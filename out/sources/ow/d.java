package ow;

import fr.t;
import java.util.List;
import nw.LocalParsingResult;
import nw.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Low/d;", "Lnw/f;", "<init>", "()V", "Lnw/i;", "tokens", "", "Llr/i;", "rangesToGlue", "Lnw/f$b;", "a", "(Lnw/i;Ljava/util/List;)Lnw/f$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class d implements nw.f {
    @Override // nw.f
    public nw.f.b a(i tokens, List<lr.i> rangesToGlue) {
        nw.f.c cVar = new nw.f.c();
        nw.e eVar = new nw.e();
        i.a bVar = new i.b(tokens, rangesToGlue);
        while (bVar.h() != null) {
            if (t.c(bVar.h(), yv.e.f229934o) && t.c(bVar.j(1), yv.e.f229929j)) {
                LocalParsingResult localParsingResultA = e.INSTANCE.a(bVar.a());
                if (localParsingResultA == null) {
                    localParsingResultA = g.INSTANCE.b(bVar.a());
                }
                if (localParsingResultA != null) {
                    cVar = cVar.d(new nw.f.Node(new lr.i(bVar.getIndex(), localParsingResultA.getIteratorPosition().getIndex() + 1), yv.c.IMAGE)).e(localParsingResultA);
                    bVar = localParsingResultA.getIteratorPosition().a();
                }
            }
            eVar.b(bVar.getIndex());
            bVar = bVar.a();
        }
        return cVar.c(eVar.a());
    }
}
