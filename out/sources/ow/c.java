package ow;

import fr.k;
import fr.t;
import java.util.List;
import nw.i;
import oq.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\u0006R\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\u0006R\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Low/c;", "Lnw/a;", "<init>", "()V", "Lnw/i;", "tokens", "Lnw/i$a;", "iterator", "", "Lnw/a$b;", "delimiters", "", "g", "(Lnw/i;Lnw/i$a;Ljava/util/List;)I", "Lnw/f$c;", "result", "Loq/i0;", "f", "(Lnw/i;Lnw/i$a;Ljava/util/List;Lnw/f$c;)V", "b", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class c extends nw.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ow.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Low/c$a;", "", "<init>", "()V", "", "Lnw/a$b;", "delimiters", "", "openerIndex", "closerIndex", "", "a", "(Ljava/util/List;II)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(List<nw.a.Info> delimiters, int openerIndex, int closerIndex) {
            nw.a.Info info = delimiters.get(openerIndex);
            nw.a.Info info2 = delimiters.get(closerIndex);
            if (openerIndex <= 0) {
                return false;
            }
            int i15 = openerIndex - 1;
            return delimiters.get(i15).getCloserIndex() == info.getCloserIndex() + 1 && delimiters.get(i15).getMarker() == info.getMarker() && delimiters.get(i15).getPosition() == info.getPosition() - 1 && delimiters.get(info.getCloserIndex() + 1).getPosition() == info2.getPosition() + 1;
        }

        private Companion() {
        }
    }

    @Override // nw.a
    public void f(i tokens, i.a iterator, List<nw.a.Info> delimiters, nw.f.c result) {
        int size = delimiters.size() - 1;
        if (size < 0) {
            return;
        }
        boolean zA = false;
        while (true) {
            int i15 = size - 1;
            if (zA) {
                zA = false;
            } else {
                nw.a.Info info = delimiters.get(size);
                if (t.c(info.getTokenType(), yv.e.f229943x) && info.getCloserIndex() != -1) {
                    zA = INSTANCE.a(delimiters, size, info.getCloserIndex());
                    nw.a.Info info2 = delimiters.get(info.getCloserIndex());
                    result.d(zA ? new nw.f.Node(new lr.i(info.getPosition() - 1, info2.getPosition() + 2), yv.c.STRONG) : new nw.f.Node(new lr.i(info.getPosition(), info2.getPosition() + 1), yv.c.EMPH));
                }
            }
            if (i15 < 0) {
                return;
            } else {
                size = i15;
            }
        }
    }

    @Override // nw.a
    public int g(i tokens, i.a iterator, List<nw.a.Info> delimiters) {
        if (!t.c(iterator.h(), yv.e.f229943x)) {
            return 0;
        }
        char cA = nw.a.INSTANCE.a(iterator);
        i.a aVarA = iterator;
        int i15 = 1;
        for (int i16 = 0; i16 < 50 && t.c(aVarA.j(1), yv.e.f229943x) && nw.a.INSTANCE.a(aVarA.a()) == cA; i16++) {
            aVarA = aVarA.a();
            i15++;
        }
        r<Boolean, Boolean> rVarA = a(tokens, iterator, aVarA, cA == '*');
        boolean zBooleanValue = rVarA.a().booleanValue();
        boolean zBooleanValue2 = rVarA.b().booleanValue();
        for (int i17 = 0; i17 < i15; i17++) {
            delimiters.add(new nw.a.Info(yv.e.f229943x, iterator.getIndex() + i17, i15, zBooleanValue, zBooleanValue2, cA, 0, 64, null));
        }
        return i15;
    }
}
