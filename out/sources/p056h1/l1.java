package p056h1;

import er.l;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a&\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B-\b\u0017\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u0012\u0004\b$\u0010\u0003R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R*\u00101\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00109\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b&\u00104\"\u0004\b8\u00106R\"\u0010;\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b*\u00104\"\u0004\b:\u00106¨\u0006<"}, d2 = {"Lh1/l1;", "", "<init>", "()V", "Lh1/z2;", "prefetchScheduler", "Lkotlin/Function1;", "Lh1/r2;", "Loq/i0;", "onNestedPrefetch", "(Lh1/z2;Ler/l;)V", "", "index", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lh1/l1$c;", "onItemPremeasured", "Lh1/l1$b;", "g", "(IJLer/l;)Lh1/l1$b;", "", "isHighPriority", "i", "(IJZLer/l;)Lh1/l1$b;", "", "Lh1/x2;", "b", "()Ljava/util/List;", "a", "Lh1/z2;", "f", "()Lh1/z2;", "setPrefetchScheduler$foundation", "(Lh1/z2;)V", "getPrefetchScheduler$foundation$annotations", "Ler/l;", "getOnNestedPrefetch$annotations", "Lh1/w2;", "c", "Lh1/w2;", "prefetchMetrics", "Lh1/v2;", "d", "Lh1/v2;", "e", "()Lh1/v2;", "k", "(Lh1/v2;)V", "getPrefetchHandleProvider$foundation$annotations", "prefetchHandleProvider", "I", "getRealizedNestedPrefetchCount$foundation", "()I", "l", "(I)V", "realizedNestedPrefetchCount", "j", "idealNestedPrefetchCount", "setLastNumberOfNestedPrefetchItems$foundation", "lastNumberOfNestedPrefetchItems", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private z2 prefetchScheduler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l<? super r2, i0> onNestedPrefetch;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w2 prefetchMetrics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private v2 prefetchHandleProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int realizedNestedPrefetchCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int idealNestedPrefetchCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int lastNumberOfNestedPrefetchItems;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lh1/l1$a;", "Lh1/r2;", "", "nestedPrefetchItemCount", "<init>", "(Lh1/l1;I)V", "index", "Loq/i0;", "a", "(I)V", "I", "b", "()I", "", "Lh1/x2;", "Ljava/util/List;", "_requests", "", "c", "()Ljava/util/List;", "requests", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements r2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int nestedPrefetchItemCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<x2> _requests = new ArrayList();

        public a(int i15) {
            this.nestedPrefetchItemCount = i15;
        }

        @Override // p056h1.r2
        public void a(int index) {
            v2 prefetchHandleProvider = l1.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider.d(index, l1.this.prefetchMetrics));
        }

        @Override // p056h1.r2
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getNestedPrefetchItemCount() {
            return this.nestedPrefetchItemCount;
        }

        public final List<x2> c() {
            return this._requests;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lh1/l1$b;", "", "Loq/i0;", "cancel", "()V", "a", "Lh1/m;", "Lh1/v2$a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void a();

        void cancel();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0001\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lh1/l1$c;", "", "", "placeableIndex", "Lc5/r;", "d", "(I)J", "c", "()I", "placeablesCount", "getIndex", "index", "Lh1/v2$a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        int c();

        long d(int placeableIndex);

        int getIndex();
    }

    public l1() {
        this.prefetchMetrics = new w2();
        this.realizedNestedPrefetchCount = -1;
        this.idealNestedPrefetchCount = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b h(l1 l1Var, int i15, long j15, l lVar, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            lVar = null;
        }
        return l1Var.g(i15, j15, lVar);
    }

    public final List<x2> b() {
        l<? super r2, i0> lVar = this.onNestedPrefetch;
        if (lVar == null) {
            return v.n();
        }
        a aVar = new a(this.realizedNestedPrefetchCount);
        lVar.b(aVar);
        List<x2> listC = aVar.c();
        this.lastNumberOfNestedPrefetchItems = listC.size();
        return listC;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIdealNestedPrefetchCount() {
        return this.idealNestedPrefetchCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLastNumberOfNestedPrefetchItems() {
        return this.lastNumberOfNestedPrefetchItems;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final v2 getPrefetchHandleProvider() {
        return this.prefetchHandleProvider;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final z2 getPrefetchScheduler() {
        return this.prefetchScheduler;
    }

    public final b g(int index, long constraints, l<? super c, i0> onItemPremeasured) {
        return i(index, constraints, true, onItemPremeasured);
    }

    public final b i(int index, long constraints, boolean isHighPriority, l<? super c, i0> onItemPremeasured) {
        b bVarH;
        v2 v2Var = this.prefetchHandleProvider;
        return (v2Var == null || (bVarH = v2Var.h(index, constraints, this.prefetchMetrics, isHighPriority, onItemPremeasured)) == null) ? m.f79483a : bVarH;
    }

    public final void j(int i15) {
        this.idealNestedPrefetchCount = i15;
    }

    public final void k(v2 v2Var) {
        this.prefetchHandleProvider = v2Var;
    }

    public final void l(int i15) {
        this.realizedNestedPrefetchCount = i15;
    }

    @oq.a
    public l1(z2 z2Var, l<? super r2, i0> lVar) {
        this();
        this.prefetchScheduler = z2Var;
        this.onNestedPrefetch = lVar;
    }
}
