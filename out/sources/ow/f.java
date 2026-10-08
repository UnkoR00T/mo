package ow;

import fr.k;
import fr.t;
import java.util.Collection;
import nw.LocalParsingResult;
import nw.h;
import nw.i;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Low/f;", "", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ow.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Low/f$a;", "", "<init>", "()V", "Lnw/i$a;", "Lnw/i;", "iterator", "Lnw/d;", "a", "(Lnw/i$a;)Lnw/d;", "b", "c", "d", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final LocalParsingResult a(i.a iterator) {
            if (t.c(iterator.h(), yv.e.f229936q) || t.c(iterator.h(), yv.e.f229928i)) {
                return null;
            }
            int index = iterator.getIndex();
            boolean zC = t.c(iterator.h(), yv.e.f229931l);
            if (zC) {
                iterator = iterator.a();
            }
            boolean z15 = false;
            while (iterator.h() != null && (!zC || !t.c(iterator.h(), yv.e.f229932m))) {
                if (!zC) {
                    if (t.c(iterator.h(), yv.e.f229927h)) {
                        if (z15) {
                            break;
                        }
                        z15 = true;
                    }
                    yv.a aVarJ = iterator.j(1);
                    if (h.INSTANCE.c(iterator, 1) || aVarJ == null) {
                        break;
                    }
                    if (!t.c(aVarJ, yv.e.f229928i)) {
                        continue;
                    } else {
                        if (!z15) {
                            break;
                        }
                        z15 = false;
                    }
                }
                iterator = iterator.a();
            }
            if (iterator.h() == null || z15) {
                return null;
            }
            return new LocalParsingResult(iterator, v.e(new nw.f.Node(new lr.i(index, iterator.getIndex() + 1), yv.c.LINK_DESTINATION)));
        }

        public final LocalParsingResult b(i.a iterator) {
            yv.a aVar;
            int index;
            if (!t.c(iterator.h(), yv.e.f229929j)) {
                return null;
            }
            int index2 = iterator.getIndex();
            nw.e eVar = new nw.e();
            i.a aVarA = iterator.a();
            while (true) {
                yv.a aVarH = aVarA.h();
                aVar = yv.e.f229930k;
                if (t.c(aVarH, aVar) || aVarA.h() == null) {
                    break;
                }
                eVar.b(aVarA.getIndex());
                if (t.c(aVarA.h(), yv.e.f229929j)) {
                    break;
                }
                aVarA = aVarA.a();
            }
            if (!t.c(aVarA.h(), aVar) || (index = aVarA.getIndex()) == index2 + 1) {
                return null;
            }
            return new LocalParsingResult(aVarA, (Collection<nw.f.Node>) v.e(new nw.f.Node(new lr.i(index2, index + 1), yv.c.LINK_LABEL)), eVar.a());
        }

        public final LocalParsingResult c(i.a iterator) {
            if (!t.c(iterator.h(), yv.e.f229929j)) {
                return null;
            }
            int index = iterator.getIndex();
            nw.e eVar = new nw.e();
            i.a aVarA = iterator.a();
            int i15 = 1;
            while (aVarA.h() != null && (!t.c(aVarA.h(), yv.e.f229930k) || (i15 = i15 - 1) != 0)) {
                eVar.b(aVarA.getIndex());
                if (t.c(aVarA.h(), yv.e.f229929j)) {
                    i15++;
                }
                aVarA = aVarA.a();
            }
            if (t.c(aVarA.h(), yv.e.f229930k)) {
                return new LocalParsingResult(aVarA, (Collection<nw.f.Node>) v.e(new nw.f.Node(new lr.i(index, aVarA.getIndex() + 1), yv.c.LINK_TEXT)), eVar.a());
            }
            return null;
        }

        public final LocalParsingResult d(i.a iterator) {
            yv.a aVarH;
            if (t.c(iterator.h(), yv.e.f229936q)) {
                return null;
            }
            int index = iterator.getIndex();
            if (t.c(iterator.h(), yv.e.f229925f) || t.c(iterator.h(), yv.e.f229926g)) {
                aVarH = iterator.h();
            } else {
                if (!t.c(iterator.h(), yv.e.f229927h)) {
                    return null;
                }
                aVarH = yv.e.f229928i;
            }
            i.a aVarA = iterator.a();
            while (aVarA.h() != null && !t.c(aVarA.h(), aVarH)) {
                aVarA = aVarA.a();
            }
            if (aVarA.h() != null) {
                return new LocalParsingResult(aVarA, v.e(new nw.f.Node(new lr.i(index, aVarA.getIndex() + 1), yv.c.LINK_TITLE)));
            }
            return null;
        }

        private Companion() {
        }
    }
}
