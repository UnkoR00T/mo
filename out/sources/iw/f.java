package iw;

import er.p;
import fr.t;
import fr.w;
import iw.f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001/B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nR\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\f\u001a\u00060\nR\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!H$¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00182\n\u0010\f\u001a\u00060\nR\u00020\u000bH$¢\u0006\u0004\b%\u0010&J+\u0010(\u001a\u00020\u00182\n\u0010\f\u001a\u00060\nR\u00020\u000b2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b(\u0010)J)\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140!2\n\u0010\f\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\b\u0018\u00010\nR\u00020\u000b2\n\u0010\f\u001a\u00060\nR\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105R \u00108\u001a\b\u0012\u0004\u0012\u00020\u00140!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010$R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u0014098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b:\u0010$R\"\u0010?\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@R*\u0010D\u001a\u0018\u0012\b\u0012\u00060\nR\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010CR\u0014\u0010G\u001a\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Liw/f;", "Liw/f$a;", "T", "", "Liw/h;", "productionHolder", "Ljw/b;", "startConstraints", "<init>", "(Liw/h;Ljw/b;)V", "Liw/d$a;", "Liw/d;", "pos", "", "c", "(Liw/d$a;)I", "", "n", "(Liw/d$a;)Z", "index", "Lkw/b;", "markerBlock", "Lkw/b$c;", "processingResult", "Loq/i0;", "b", "(ILkw/b;Lkw/b$c;)V", "Lkw/b$a;", "childrenAction", "d", "(ILkw/b$a;)V", "p", "()V", "", "Lkw/d;", "g", "()Ljava/util/List;", "q", "(Liw/d$a;)V", CryptoServicesPermission.CONSTRAINTS, "m", "(Liw/d$a;Ljw/b;Liw/h;)V", "e", "(Liw/d$a;Liw/h;)Ljava/util/List;", "o", "(Liw/d$a;)Liw/d$a;", "newMarkerBlock", "a", "(Lkw/b;)V", "f", "Liw/h;", "Ljw/b;", "j", "()Ljw/b;", "Ljava/util/List;", "i", "NO_BLOCKS", "", "h", "markersStack", "l", "setTopBlockConstraints", "(Ljw/b;)V", "topBlockConstraints", "I", "nextInterestingPosForExistingMarkers", "Lkotlin/Function2;", "Ler/p;", "interruptsParagraph", "k", "()Liw/f$a;", "stateInfo", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class f<T extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h productionHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jw.b startConstraints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private jw.b topBlockConstraints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<kw.b> NO_BLOCKS = v.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<kw.b> markersStack = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextInterestingPosForExistingMarkers = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p<d.a, jw.b, Boolean> interruptsParagraph = new b(this);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001d"}, d2 = {"Liw/f$a;", "", "Ljw/b;", "currentConstraints", "nextConstraints", "", "Lkw/b;", "markersStack", "<init>", "(Ljw/b;Ljw/b;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljw/b;", "()Ljw/b;", "b", "c", "Ljava/util/List;", "Llw/j;", "d", "()Llw/j;", "paragraphBlock", "()Lkw/b;", "lastBlock", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final jw.b currentConstraints;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final jw.b nextConstraints;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<kw.b> markersStack;

        /* JADX WARN: Multi-variable type inference failed */
        public a(jw.b bVar, jw.b bVar2, List<? extends kw.b> list) {
            this.currentConstraints = bVar;
            this.nextConstraints = bVar2;
            this.markersStack = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jw.b getCurrentConstraints() {
            return this.currentConstraints;
        }

        public final kw.b b() {
            return (kw.b) v.z0(this.markersStack);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jw.b getNextConstraints() {
            return this.nextConstraints;
        }

        public final lw.j d() {
            Object next;
            Iterator<T> it = this.markersStack.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((kw.b) next) instanceof lw.j) {
                    return (lw.j) next;
                }
            }
            next = null;
            return (lw.j) next;
        }

        public boolean equals(Object other) {
            a aVar = other instanceof a ? (a) other : null;
            return aVar != null && t.c(this.currentConstraints, aVar.currentConstraints) && t.c(this.nextConstraints, aVar.nextConstraints) && t.c(this.markersStack, aVar.markersStack);
        }

        public int hashCode() {
            return (((this.currentConstraints.hashCode() * 37) + this.nextConstraints.hashCode()) * 37) + this.markersStack.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Liw/f$a;", "T", "Liw/d$a;", "Liw/d;", "position", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "c", "(Liw/d$a;Ljw/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0})
    static final class b extends w implements p<d.a, jw.b, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f97242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar) {
            super(2);
            this.f97242b = fVar;
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean B(d.a aVar, jw.b bVar) {
            boolean z15;
            Iterator<kw.d<T>> it = this.f97242b.g().iterator();
            while (it.hasNext()) {
                if (it.next().a(aVar, bVar)) {
                    z15 = true;
                    return Boolean.valueOf(z15);
                }
            }
            z15 = false;
            return Boolean.valueOf(z15);
        }
    }

    public f(h hVar, jw.b bVar) {
        this.productionHolder = hVar;
        this.startConstraints = bVar;
        this.topBlockConstraints = bVar;
    }

    private final void b(int index, kw.b markerBlock, kw.b.c processingResult) {
        d(index, processingResult.getChildrenAction());
        if (markerBlock.c(processingResult.getSelfAction())) {
            this.markersStack.remove(index);
            p();
        }
    }

    private final int c(d.a pos) {
        kw.b bVar = (kw.b) v.z0(this.markersStack);
        int iA = bVar != null ? bVar.a(pos) : pos.g();
        if (iA == -1) {
            return Integer.MAX_VALUE;
        }
        return iA;
    }

    private final void d(int index, kw.b.a childrenAction) {
        if (childrenAction != kw.b.a.f112856d) {
            for (int size = this.markersStack.size() - 1; size > index; size--) {
                boolean zC = this.markersStack.get(size).c(childrenAction);
                hw.a aVar = hw.a.f86718a;
                if (!zC) {
                    throw new yv.d("If closing action is not NOTHING, marker should be gone");
                }
                this.markersStack.remove(size);
            }
            p();
        }
    }

    private final boolean n(d.a pos) {
        int size = this.markersStack.size();
        while (size > 0) {
            size--;
            if (size < this.markersStack.size()) {
                kw.b bVar = this.markersStack.get(size);
                kw.b.c cVarF = bVar.f(pos, k().getCurrentConstraints());
                if (t.c(cVarF, kw.b.c.INSTANCE.c())) {
                    continue;
                } else {
                    b(size, bVar, cVarF);
                    if (cVarF.getEventAction() == kw.b.EnumC2732b.CANCEL) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void p() {
        this.topBlockConstraints = this.markersStack.isEmpty() ? this.startConstraints : ((kw.b) v.x0(this.markersStack)).b();
    }

    public final void a(kw.b newMarkerBlock) {
        this.markersStack.add(newMarkerBlock);
        p();
    }

    public List<kw.b> e(d.a pos, h productionHolder) {
        hw.a aVar = hw.a.f86718a;
        if (!kw.d.INSTANCE.a(pos, k().getCurrentConstraints())) {
            throw new yv.d("");
        }
        Iterator<kw.d<T>> it = g().iterator();
        while (it.hasNext()) {
            List<kw.b> listB = it.next().b(pos, productionHolder, k());
            if (!listB.isEmpty()) {
                return listB;
            }
        }
        return (pos.getLocalPos() < jw.c.f(k().getNextConstraints(), pos.getCurrentLine()) || pos.a() == null) ? v.n() : v.e(new lw.j(k().getCurrentConstraints(), productionHolder.e(), this.interruptsParagraph));
    }

    public final void f() {
        d(-1, kw.b.a.f112855c);
    }

    protected abstract List<kw.d<T>> g();

    protected final List<kw.b> h() {
        return this.markersStack;
    }

    protected final List<kw.b> i() {
        return this.NO_BLOCKS;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    protected final jw.b getStartConstraints() {
        return this.startConstraints;
    }

    protected abstract T k();

    /* JADX INFO: renamed from: l, reason: from getter */
    protected final jw.b getTopBlockConstraints() {
        return this.topBlockConstraints;
    }

    protected abstract void m(d.a pos, jw.b constraints, h productionHolder);

    public final d.a o(d.a pos) {
        boolean z15;
        int iF;
        kw.b bVar;
        q(pos);
        if (pos.getGlobalPos() >= this.nextInterestingPosForExistingMarkers) {
            n(pos);
            z15 = true;
        } else {
            z15 = false;
        }
        if (kw.d.INSTANCE.a(pos, k().getCurrentConstraints()) && ((bVar = (kw.b) v.z0(this.markersStack)) == null || bVar.e())) {
            Iterator<kw.b> it = e(pos, this.productionHolder).iterator();
            while (it.hasNext()) {
                a(it.next());
                z15 = true;
            }
        }
        if (z15) {
            this.nextInterestingPosForExistingMarkers = c(pos);
        }
        if ((pos.getLocalPos() != -1 && !kw.d.INSTANCE.a(pos, k().getCurrentConstraints())) || (iF = jw.c.f(k().getNextConstraints(), pos.getCurrentLine()) - pos.getLocalPos()) <= 0) {
            return pos.m(this.nextInterestingPosForExistingMarkers - pos.getGlobalPos());
        }
        if (pos.getLocalPos() != -1 && k().getNextConstraints().a() <= this.topBlockConstraints.a()) {
            m(pos, k().getNextConstraints(), this.productionHolder);
        }
        return pos.m(iF);
    }

    protected abstract void q(d.a pos);
}
