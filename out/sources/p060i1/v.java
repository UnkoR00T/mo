package p060i1;

import c5.d;
import er.a;
import er.l;
import er.p;
import java.util.List;
import lr.m;
import oq.i0;
import p056h1.CachedItem;
import p056h1.j;
import p056h1.l1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0014\u00100\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010/R\u0014\u00102\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0014\u00104\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u0014\u00106\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0018R\u0014\u00108\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0018R\u0014\u0010:\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0018R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0018¨\u0006A"}, d2 = {"Li1/v;", "Lh1/j;", "Lkotlin/Function0;", "", "itemCount", "<init>", "(Ler/a;)V", "lineIndex", "Lkotlin/Function2;", "Loq/i0;", "onItemPrefetched", "", "Lh1/l1$b;", "c", "(ILer/p;)Ljava/util/List;", "indexInVisibleLines", "k", "(I)I", "f", "", "o", "(I)Ljava/lang/Object;", "h", "n", "()I", "a", "Ler/a;", "getItemCount", "()Ler/a;", "Li1/u0;", "b", "Li1/u0;", "p", "()Li1/u0;", "s", "(Li1/u0;)V", "layoutInfo", "Lh1/l1;", "Lh1/l1;", "q", "()Lh1/l1;", "t", "(Lh1/l1;)V", "state", "e", "totalItemsCount", "", "()Z", "hasVisibleItems", "j", "mainAxisExtraSpaceStart", "m", "mainAxisExtraSpaceEnd", "d", "firstVisibleLineIndex", "i", "lastVisibleLineIndex", "l", "mainAxisViewportSize", "Lc5/d;", "getDensity", "()Lc5/d;", "density", "g", "visibleLineCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<Integer> itemCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public u0 layoutInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public l1 state;

    public v(a<Integer> aVar) {
        this.itemCount = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(p pVar, v vVar, l1.c cVar) {
        pVar.B(Integer.valueOf(cVar.getIndex()), Integer.valueOf(vVar.p().getPageSize()));
        return i0.f148189a;
    }

    @Override // p056h1.j
    public boolean b() {
        return !p().j().isEmpty();
    }

    @Override // p056h1.j
    public List<l1.b> c(int lineIndex, final p<? super Integer, ? super Integer, i0> onItemPrefetched) {
        return pq.v.e(q().i(lineIndex, p().getChildConstraints(), true, new l() { // from class: i1.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.r(onItemPrefetched, this, (l1.c) obj);
            }
        }));
    }

    @Override // p056h1.j
    public int d() {
        if (p().j().isEmpty()) {
            return -1;
        }
        return (int) m.f(((long) ((n) pq.v.l0(p().j())).getIndex()) - ((long) p().getBeyondViewportPageCount()), 0L);
    }

    @Override // p056h1.j
    public int e() {
        return this.itemCount.a().intValue();
    }

    @Override // p056h1.j
    public int f(int indexInVisibleLines) {
        int size = p().z().size();
        int size2 = p().j().size();
        if (indexInVisibleLines < size) {
            return p().z().get(indexInVisibleLines).getIndex();
        }
        if (indexInVisibleLines >= size && indexInVisibleLines < size + size2) {
            return p().j().get(indexInVisibleLines - size).getIndex();
        }
        if (indexInVisibleLines >= size + size2) {
            return p().y().get((indexInVisibleLines - size) - size2).getIndex();
        }
        return -1;
    }

    @Override // p056h1.j
    public int g() {
        return p().z().size() + p().j().size() + p().y().size();
    }

    @Override // p056h1.j
    public d getDensity() {
        return p().getDensity();
    }

    @Override // p056h1.j
    public int h(int lineIndex) {
        return lineIndex;
    }

    @Override // p056h1.j
    public int i() {
        if (p().j().isEmpty()) {
            return -1;
        }
        return (int) m.k(((long) ((n) pq.v.x0(p().j())).getIndex()) + ((long) p().getBeyondViewportPageCount()), ((long) e()) - 1);
    }

    @Override // p056h1.j
    public int j() {
        if (p().j().isEmpty()) {
            return 0;
        }
        return Math.abs(m.j(((n) pq.v.l0(p().j())).getOffset() + p().f(), 0));
    }

    @Override // p056h1.j
    public int k(int indexInVisibleLines) {
        return p().getPageSize();
    }

    @Override // p056h1.j
    public int l() {
        return h0.a(p());
    }

    @Override // p056h1.j
    public int m() {
        if (p().j().isEmpty()) {
            return 0;
        }
        return Math.abs(((((n) pq.v.x0(p().j())).getOffset() + p().getPageSize()) + p().getPageSpacing()) - p().getViewportEndOffset());
    }

    @Override // p056h1.j
    public int n() {
        if (p().j().isEmpty()) {
            return -1;
        }
        return e() - 1;
    }

    @Override // p056h1.j
    public Object o(int indexInVisibleLines) {
        int size = p().z().size();
        int size2 = p().j().size();
        if (indexInVisibleLines < size) {
            return p().z().get(indexInVisibleLines).getKey();
        }
        if (indexInVisibleLines < size || indexInVisibleLines >= size + size2) {
            return indexInVisibleLines >= size + size2 ? p().y().get((indexInVisibleLines - size) - size2).getKey() : CachedItem.INSTANCE;
        }
        return p().j().get(indexInVisibleLines - size).getKey();
    }

    public final u0 p() {
        u0 u0Var = this.layoutInfo;
        if (u0Var != null) {
            return u0Var;
        }
        return null;
    }

    public final l1 q() {
        l1 l1Var = this.state;
        if (l1Var != null) {
            return l1Var;
        }
        return null;
    }

    public final void s(u0 u0Var) {
        this.layoutInfo = u0Var;
    }

    public final void t(l1 l1Var) {
        this.state = l1Var;
    }
}
