package ow;

import fr.k;
import fr.t;
import java.util.Collection;
import java.util.List;
import nw.LocalParsingResult;
import nw.i;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Low/g;", "Lnw/f;", "<init>", "()V", "Lnw/i;", "tokens", "", "Llr/i;", "rangesToGlue", "Lnw/f$b;", "a", "(Lnw/i;Ljava/util/List;)Lnw/f$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class g implements nw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ow.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Low/g$a;", "", "<init>", "()V", "Lnw/i$a;", "Lnw/i;", "iterator", "Lnw/d;", "a", "(Lnw/i$a;)Lnw/d;", "c", "b", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final LocalParsingResult a(i.a iterator) {
            int index = iterator.getIndex();
            f.Companion companion = f.INSTANCE;
            LocalParsingResult localParsingResultC = companion.c(iterator);
            if (localParsingResultC == null) {
                return null;
            }
            i.a aVarA = localParsingResultC.getIteratorPosition().a();
            if (t.c(aVarA.h(), yv.e.f229936q)) {
                aVarA = aVarA.a();
            }
            LocalParsingResult localParsingResultB = companion.b(aVarA);
            if (localParsingResultB == null) {
                return null;
            }
            i.a iteratorPosition = localParsingResultB.getIteratorPosition();
            return new LocalParsingResult(iteratorPosition, (Collection<nw.f.Node>) v.M0(v.L0(localParsingResultC.b(), localParsingResultB.b()), new nw.f.Node(new lr.i(index, iteratorPosition.getIndex() + 1), yv.c.FULL_REFERENCE_LINK)), (Collection<? extends List<lr.i>>) v.L0(localParsingResultC.a(), localParsingResultB.a()));
        }

        private final LocalParsingResult c(i.a iterator) {
            int index = iterator.getIndex();
            LocalParsingResult localParsingResultB = f.INSTANCE.b(iterator);
            if (localParsingResultB == null) {
                return null;
            }
            i.a iteratorPosition = localParsingResultB.getIteratorPosition();
            i.a aVarA = iteratorPosition.a();
            if (t.c(aVarA.h(), yv.e.f229936q)) {
                aVarA = aVarA.a();
            }
            if (t.c(aVarA.h(), yv.e.f229929j) && t.c(aVarA.j(1), yv.e.f229930k)) {
                iteratorPosition = aVarA.a();
            }
            return new LocalParsingResult(iteratorPosition, v.M0(localParsingResultB.b(), new nw.f.Node(new lr.i(index, iteratorPosition.getIndex() + 1), yv.c.SHORT_REFERENCE_LINK)), localParsingResultB.a());
        }

        public final LocalParsingResult b(i.a iterator) {
            LocalParsingResult localParsingResultA = a(iterator);
            return localParsingResultA == null ? c(iterator) : localParsingResultA;
        }

        private Companion() {
        }
    }

    @Override // nw.f
    public nw.f.b a(i tokens, List<lr.i> rangesToGlue) {
        LocalParsingResult localParsingResultB;
        nw.f.c cVar = new nw.f.c();
        nw.e eVar = new nw.e();
        i.a bVar = new i.b(tokens, rangesToGlue);
        while (bVar.h() != null) {
            if (!t.c(bVar.h(), yv.e.f229929j) || (localParsingResultB = INSTANCE.b(bVar)) == null) {
                eVar.b(bVar.getIndex());
                bVar = bVar.a();
            } else {
                bVar = localParsingResultB.getIteratorPosition().a();
                cVar = cVar.e(localParsingResultB);
            }
        }
        return cVar.c(eVar.a());
    }
}
