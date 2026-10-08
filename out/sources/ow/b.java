package ow;

import fr.t;
import java.util.List;
import nw.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0018\u00010\u0004R\u00020\u00052\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Low/b;", "Lnw/f;", "<init>", "()V", "Lnw/i$a;", "Lnw/i;", "it", "", "length", "b", "(Lnw/i$a;I)Lnw/i$a;", "info", "", "canEscape", "c", "(Lnw/i$a;Z)I", "tokens", "", "Llr/i;", "rangesToGlue", "Lnw/f$b;", "a", "(Lnw/i;Ljava/util/List;)Lnw/f$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class b implements nw.f {
    private final i.a b(i.a it, int length) {
        while (it.h() != null) {
            if ((t.c(it.h(), yv.e.f229944y) || t.c(it.h(), yv.e.f229945z)) && c(it, false) == length) {
                return it;
            }
            it = it.a();
        }
        return null;
    }

    private final int c(i.a info, boolean canEscape) {
        int i15;
        if (t.c(info.h(), yv.e.f229945z)) {
            i15 = canEscape ? 2 : 1;
        } else {
            i15 = 0;
        }
        return info.f() - i15;
    }

    @Override // nw.f
    public nw.f.b a(i tokens, List<lr.i> rangesToGlue) {
        i.a aVarB;
        nw.f.c cVar = new nw.f.c();
        nw.e eVar = new nw.e();
        i.a bVar = new i.b(tokens, rangesToGlue);
        while (bVar.h() != null) {
            if ((t.c(bVar.h(), yv.e.f229944y) || t.c(bVar.h(), yv.e.f229945z)) && (aVarB = b(bVar.a(), c(bVar, true))) != null) {
                cVar.d(new nw.f.Node(new lr.i(bVar.getIndex(), aVarB.getIndex() + 1), yv.c.CODE_SPAN));
                bVar = aVarB.a();
            } else {
                eVar.b(bVar.getIndex());
                bVar = bVar.a();
            }
        }
        return cVar.c(eVar.a());
    }
}
