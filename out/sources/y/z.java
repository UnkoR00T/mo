package y;

import java.util.Collection;
import java.util.Iterator;
import o.e1;
import o.j2;
import p071kotlin.Metadata;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly/z;", "", "<init>", "()V", "", "Lo/j2;", "", "b", "(Ljava/util/Collection;)Z", "h", "(Lo/j2;)Z", "Lkotlin/Function1;", "Lv/w3;", "configProvider", "Lx/a;", "d", "(Ljava/util/Collection;Ler/l;)Lx/a;", "", "c", "(Ljava/util/Collection;Ler/l;)I", "g", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f222517a = new z();

    private z() {
    }

    public static final boolean b(Collection<? extends j2> collection) {
        for (j2 j2Var : collection) {
            if (j2Var != null && h(j2Var)) {
                return true;
            }
        }
        return false;
    }

    private final int c(Collection<? extends j2> collection, er.l<? super j2, ? extends w3<?>> lVar) {
        Iterator<T> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            int iD = lVar.b((j2) it.next()).D();
            if (iD != 0) {
                if (i15 != iD && i15 != 0) {
                    e1.o("UseCaseUtil", "Unexpected configurations: Overwriting current previewStabilizationMode(" + i15 + ") with useCasePreviewStabilization(" + iD + ")!");
                }
                i15 = iD;
            }
        }
        return i15;
    }

    public static final x.a d(Collection<? extends j2> collection, er.l<? super j2, ? extends w3<?>> lVar) {
        x.a.Companion companion = x.a.INSTANCE;
        z zVar = f222517a;
        return companion.a(zVar.c(collection, lVar), zVar.g(collection, lVar));
    }

    public static /* synthetic */ x.a e(Collection collection, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = new er.l() { // from class: y.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f((j2) obj2);
                }
            };
        }
        return d(collection, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w3 f(j2 j2Var) {
        return j2Var.l();
    }

    private final int g(Collection<? extends j2> collection, er.l<? super j2, ? extends w3<?>> lVar) {
        Iterator<T> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            int iY = lVar.b((j2) it.next()).y();
            if (iY != 0) {
                if (i15 != iY && i15 != 0) {
                    e1.o("UseCaseUtil", "Unexpected configurations: Overwriting current videoStabilizationMode(" + i15 + ") with useCaseVideoStabilization(" + iY + ")!");
                }
                i15 = iY;
            }
        }
        return i15;
    }

    public static final boolean h(j2 j2Var) {
        if (j2Var.l().h(w3.L)) {
            return j2Var.l().W() == x3.b.VIDEO_CAPTURE;
        }
        e1.c("UseCaseUtil", j2Var + " UseCase does not have capture type.");
        return false;
    }
}
