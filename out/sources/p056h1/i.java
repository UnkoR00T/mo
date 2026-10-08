package p056h1;

import c5.d;
import e5.a;
import er.p;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r0.h0;
import r0.j0;
import r0.k0;
import r0.m;
import r0.r;
import r0.t;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010\u001f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 JG\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u0017*\u00020\u000b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020-2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0001H\u0002¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u0010+J\u001f\u00105\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u0010+J#\u00107\u001a\u00020\b*\u00020\u000b2\u0006\u0010%\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010\rJ\u0019\u0010:\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b:\u0010\u0012J\u0011\u0010;\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b;\u0010\rJ\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020-0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010GR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u0016\u0010S\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010BR$\u0010Y\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010XR$\u0010\\\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010XR\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010RR\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010RR\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010BR\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006`"}, d2 = {"Lh1/i;", "", "Lh1/y;", "cacheWindow", "", "enableInitialPrefetch", "<init>", "(Lh1/y;Z)V", "Loq/i0;", "A", "()V", "Lh1/j;", "o", "(Lh1/j;)V", "p", "", "delta", "g", "(Lh1/j;F)V", "h", "refillForward", "v", "(Lh1/j;Z)V", "", "visibleWindowStart", "visibleWindowEnd", "prefetchForwardWindow", "mainAxisExtraSpaceEnd", "mainAxisExtraSpaceStart", "scrollDelta", "applyForwardPrefetch", "s", "(Lh1/j;IIIIIFZ)V", "keepAroundWindow", "itemsCount", "r", "(IIIIIFI)V", "index", "isUrgent", "i", "(Lh1/j;IZ)I", "size", "d", "(II)V", "key", "Lh1/k;", "B", "(IILjava/lang/Object;)Lh1/k;", "e", "(ILjava/lang/Object;I)V", "f", "startLine", "endLine", "w", "itemSize", "q", "(Lh1/j;II)V", "y", "t", "u", "n", "()Z", "x", "a", "Lh1/y;", "b", "Z", "Lr0/j0;", "", "Lh1/l1$b;", "c", "Lr0/j0;", "prefetchWindowHandles", "Lr0/k0;", "Lr0/k0;", "indicesToRemove", "Lr0/h0;", "Lr0/h0;", "windowCache", "windowCacheWithItems", "F", "previousPassDelta", "I", "previousPassItemCount", "hasUpdatedVisibleItemsOnce", "value", "j", "m", "()I", "prefetchWindowStartLine", "k", "l", "prefetchWindowEndLine", "prefetchWindowStartExtraSpace", "prefetchWindowEndExtraSpace", "shouldRefillWindow", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y cacheWindow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enableInitialPrefetch;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdatedVisibleItemsOnce;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int prefetchWindowStartExtraSpace;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int prefetchWindowEndExtraSpace;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean shouldRefillWindow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int itemsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j0<List<l1.b>> prefetchWindowHandles = r.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k0 indicesToRemove = t.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h0 windowCache = m.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j0<CachedItem> windowCacheWithItems = r.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int previousPassItemCount = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int prefetchWindowStartLine = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int prefetchWindowEndLine = PKIFailureInfo.systemUnavail;

    public i(y yVar, boolean z15) {
        this.cacheWindow = yVar;
        this.enableInitialPrefetch = z15;
    }

    private final void A() {
        a.a("prefetchWindowStartExtraSpace", this.prefetchWindowStartExtraSpace);
        a.a("prefetchWindowEndExtraSpace", this.prefetchWindowEndExtraSpace);
        a.a("prefetchWindowStartIndex", this.prefetchWindowStartLine);
        a.a("prefetchWindowEndIndex", this.prefetchWindowEndLine);
    }

    private final CachedItem B(int index, int size, Object key) {
        CachedItem cachedItemB = this.windowCacheWithItems.b(index);
        if (cachedItemB == null) {
            return new CachedItem(key, size);
        }
        cachedItemB.d(size);
        cachedItemB.c(key);
        return cachedItemB;
    }

    private final void d(int index, int size) {
        if (g0.isCacheWindowRefillFixEnabled) {
            this.windowCacheWithItems.r(index, B(index, size, CachedItem.INSTANCE));
        } else {
            this.windowCache.u(index, size);
        }
        if (index > this.prefetchWindowEndLine) {
            this.prefetchWindowEndLine = index;
            this.prefetchWindowEndExtraSpace -= size;
        } else if (index < this.prefetchWindowStartLine) {
            this.prefetchWindowStartLine = index;
            this.prefetchWindowStartExtraSpace -= size;
        }
    }

    private final void e(int index, Object key, int size) {
        if (this.windowCacheWithItems.a(index)) {
            int mainAxisSize = this.windowCacheWithItems.b(index).getMainAxisSize();
            Object key2 = this.windowCacheWithItems.b(index).getKey();
            if (mainAxisSize != size || !fr.t.c(key2, key)) {
                this.shouldRefillWindow = true;
            }
        }
        this.windowCacheWithItems.r(index, B(index, size, key));
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, index);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, index);
        List<l1.b> listO = this.prefetchWindowHandles.o(index);
        if (listO != null) {
            int size2 = listO.size();
            for (int i15 = 0; i15 < size2; i15++) {
                listO.get(i15).cancel();
            }
        }
    }

    private final void f(int index, int size) {
        if (this.windowCache.a(index) && this.windowCache.c(index) != size) {
            this.shouldRefillWindow = true;
        }
        this.windowCache.u(index, size);
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, index);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, index);
        List<l1.b> listO = this.prefetchWindowHandles.o(index);
        if (listO != null) {
            int size2 = listO.size();
            for (int i15 = 0; i15 < size2; i15++) {
                listO.get(i15).cancel();
            }
        }
    }

    private final void g(j jVar, float f15) {
        if (jVar.b()) {
            int iL = jVar.l();
            y yVar = this.cacheWindow;
            d density = jVar.getDensity();
            int iA = density != null ? yVar.a(density, iL) : 0;
            this.itemsCount = jVar.e();
            r(jVar.d(), jVar.i(), jVar.m(), jVar.j(), iA, f15, jVar.e());
        }
    }

    private final void h(j jVar, float f15) {
        if (jVar.b()) {
            int iL = jVar.l();
            y yVar = this.cacheWindow;
            d density = jVar.getDensity();
            int iB = density != null ? yVar.b(density, iL) : 0;
            s(jVar, jVar.d(), jVar.i(), iB, jVar.m(), jVar.j(), f15, f15 <= 0.0f);
        }
    }

    private final int i(final j jVar, int i15, boolean z15) {
        List<l1.b> listB;
        List<l1.b> listB2;
        List<l1.b> listB3;
        List<l1.b> listB4;
        int i16 = 0;
        if (g0.isCacheWindowRefillFixEnabled) {
            if (this.windowCacheWithItems.a(i15)) {
                return this.windowCacheWithItems.b(i15).getMainAxisSize();
            }
            if (this.prefetchWindowHandles.a(i15)) {
                if (z15 && (listB4 = this.prefetchWindowHandles.b(i15)) != null) {
                    int size = listB4.size();
                    while (i16 < size) {
                        listB4.get(i16).a();
                        i16++;
                    }
                }
                return -1;
            }
            this.prefetchWindowHandles.r(i15, jVar.c(i15, new p() { // from class: h1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(this.f79366a, jVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            }));
            if (z15 && (listB3 = this.prefetchWindowHandles.b(i15)) != null) {
                int size2 = listB3.size();
                while (i16 < size2) {
                    listB3.get(i16).a();
                    i16++;
                }
            }
            return -1;
        }
        if (this.windowCache.a(i15)) {
            return this.windowCache.c(i15);
        }
        if (this.prefetchWindowHandles.a(i15)) {
            if (z15 && (listB2 = this.prefetchWindowHandles.b(i15)) != null) {
                int size3 = listB2.size();
                while (i16 < size3) {
                    listB2.get(i16).a();
                    i16++;
                }
            }
            return -1;
        }
        this.prefetchWindowHandles.r(i15, jVar.c(i15, new p() { // from class: h1.g
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return i.j(this.f79400a, jVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
        if (z15 && (listB = this.prefetchWindowHandles.b(i15)) != null) {
            int size4 = listB.size();
            while (i16 < size4) {
                listB.get(i16).a();
                i16++;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(i iVar, j jVar, int i15, int i16) {
        iVar.q(jVar, i15, i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(i iVar, j jVar, int i15, int i16) {
        iVar.q(jVar, i15, i16);
        return i0.f148189a;
    }

    private final void o(j jVar) {
        this.shouldRefillWindow = true;
        if (jVar.b()) {
            this.prefetchWindowStartLine = lr.m.e(this.prefetchWindowStartLine, 0);
            int iN = jVar.n();
            if (iN != -1) {
                this.prefetchWindowEndLine = lr.m.j(this.prefetchWindowEndLine, iN);
            }
            if (this.previousPassDelta <= 0.0f) {
                w(jVar.i(), this.itemsCount - 1);
            } else {
                w(0, jVar.d());
            }
        }
    }

    private final void p(j jVar) {
        this.shouldRefillWindow = true;
        this.prefetchWindowStartLine = lr.m.e(this.prefetchWindowStartLine, 0);
        int iN = jVar.n();
        if (iN != -1) {
            this.prefetchWindowEndLine = lr.m.j(this.prefetchWindowEndLine, iN);
        }
        w(this.prefetchWindowEndLine, this.itemsCount - 1);
    }

    private final void q(j jVar, int i15, int i16) {
        d(i15, i16);
        y(jVar);
        A();
    }

    private final void r(int visibleWindowStart, int visibleWindowEnd, int mainAxisExtraSpaceEnd, int mainAxisExtraSpaceStart, int keepAroundWindow, float scrollDelta, int itemsCount) {
        int i15;
        int iC;
        int i16;
        int iC2;
        if (scrollDelta <= 0.0f) {
            this.prefetchWindowStartExtraSpace = keepAroundWindow - mainAxisExtraSpaceStart;
            this.prefetchWindowStartLine = visibleWindowStart;
            while (this.prefetchWindowStartExtraSpace > 0 && (i16 = this.prefetchWindowStartLine) > 0) {
                if (!g0.isCacheWindowRefillFixEnabled) {
                    if (!this.windowCache.a(i16 - 1)) {
                        break;
                    }
                    iC2 = this.windowCache.c(this.prefetchWindowStartLine - 1);
                    this.prefetchWindowStartLine--;
                    this.prefetchWindowStartExtraSpace -= iC2;
                } else {
                    if (!this.windowCacheWithItems.a(i16 - 1)) {
                        break;
                    }
                    iC2 = this.windowCacheWithItems.b(this.prefetchWindowStartLine - 1).getMainAxisSize();
                    this.prefetchWindowStartLine--;
                    this.prefetchWindowStartExtraSpace -= iC2;
                }
            }
            w(0, this.prefetchWindowStartLine - 1);
            return;
        }
        this.prefetchWindowEndExtraSpace = keepAroundWindow - mainAxisExtraSpaceEnd;
        this.prefetchWindowEndLine = visibleWindowEnd;
        while (this.prefetchWindowEndExtraSpace > 0 && (i15 = this.prefetchWindowEndLine) < itemsCount - 1) {
            if (!g0.isCacheWindowRefillFixEnabled) {
                if (!this.windowCache.a(i15 + 1)) {
                    break;
                }
                iC = this.windowCache.c(this.prefetchWindowEndLine + 1);
                this.prefetchWindowEndLine++;
                this.prefetchWindowEndExtraSpace -= iC;
            } else {
                if (!this.windowCacheWithItems.a(i15 + 1)) {
                    break;
                }
                iC = this.windowCacheWithItems.b(this.prefetchWindowEndLine + 1).getMainAxisSize();
                this.prefetchWindowEndLine++;
                this.prefetchWindowEndExtraSpace -= iC;
            }
        }
        w(this.prefetchWindowEndLine + 1, itemsCount - 1);
    }

    private final void s(j jVar, int i15, int i16, int i17, int i18, int i19, float f15, boolean z15) {
        int i25;
        boolean z16 = Math.signum(f15) == Math.signum(this.previousPassDelta);
        if (!z15) {
            if (!z16 || this.shouldRefillWindow) {
                this.prefetchWindowStartExtraSpace = i17 - i19;
                this.prefetchWindowStartLine = i15;
            } else {
                this.prefetchWindowStartExtraSpace = lr.m.j(this.prefetchWindowStartExtraSpace + hr.a.d(Math.abs(f15)), i17 - i19);
            }
            while (this.prefetchWindowStartExtraSpace > 0 && (i25 = this.prefetchWindowStartLine) > 0) {
                int i26 = i(jVar, this.prefetchWindowStartLine - 1, i25 + (-1) == i15 + (-1) && (!g0.isCacheWindowRefillFixEnabled || (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1)) != 0) && Math.abs(f15) >= ((float) i19));
                if (i26 == -1) {
                    return;
                }
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= i26;
            }
            return;
        }
        if (!z16 || this.shouldRefillWindow) {
            this.prefetchWindowEndExtraSpace = i17 - i18;
            this.prefetchWindowEndLine = i16;
        } else {
            this.prefetchWindowEndExtraSpace = lr.m.j(this.prefetchWindowEndExtraSpace + hr.a.d(Math.abs(f15)), i17 - i18);
        }
        while (this.prefetchWindowEndExtraSpace > 0 && jVar.h(this.prefetchWindowEndLine) != -1 && jVar.h(this.prefetchWindowEndLine) < this.itemsCount - 1) {
            int i27 = i(jVar, this.prefetchWindowEndLine + 1, this.prefetchWindowEndLine + 1 == i16 + 1 && (!g0.isCacheWindowRefillFixEnabled || (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1)) != 0) && Math.abs(f15) >= ((float) i18));
            if (i27 == -1) {
                return;
            }
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= i27;
        }
    }

    private final void v(j jVar, boolean z15) {
        if (jVar.b()) {
            int iL = jVar.l();
            y yVar = this.cacheWindow;
            d density = jVar.getDensity();
            s(jVar, jVar.d(), jVar.i(), density != null ? yVar.b(density, iL) : 0, jVar.m(), jVar.j(), 0.0f, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[LOOP:2: B:28:0x0086->B:41:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[LOOP:4: B:45:0x00c7->B:58:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb A[EDGE_INSN: B:85:0x00bb->B:42:0x00bb BREAK  A[LOOP:2: B:28:0x0086->B:41:0x00b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc A[EDGE_INSN: B:92:0x00fc->B:59:0x00fc BREAK  A[LOOP:4: B:45:0x00c7->B:58:0x00f9], SYNTHETIC] */
    private final void w(int startLine, int endLine) {
        char c15;
        long j15;
        long j16;
        long j17;
        int i15;
        int i16;
        char c16;
        this.indicesToRemove.k();
        j0<List<l1.b>> j0Var = this.prefetchWindowHandles;
        int[] iArr = j0Var.keys;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        char c17 = 7;
        long j18 = -9187201950435737472L;
        if (length >= 0) {
            int i17 = 0;
            j16 = 128;
            while (true) {
                long j19 = jArr[i17];
                j17 = 255;
                if ((((~j19) << c17) & j19 & j18) != j18) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j19 & 255) < 128) {
                            c16 = c17;
                            int i25 = iArr[(i17 << 3) + i19];
                            if (startLine <= i25 && i25 <= endLine) {
                                this.indicesToRemove.h(i25);
                            }
                            j19 >>= 8;
                            i19++;
                            c17 = c16;
                            j18 = j18;
                        } else {
                            c16 = c17;
                        }
                        j19 >>= 8;
                        i19++;
                        c17 = c16;
                        j18 = j18;
                    }
                    c15 = c17;
                    j15 = j18;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    c15 = c17;
                    j15 = j18;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
                c17 = c15;
                j18 = j15;
            }
        } else {
            c15 = 7;
            j15 = -9187201950435737472L;
            j16 = 128;
            j17 = 255;
        }
        h0 h0Var = this.windowCache;
        int[] iArr2 = h0Var.keys;
        long[] jArr2 = h0Var.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i26 = 0;
            while (true) {
                long j25 = jArr2[i26];
                if ((((~j25) << c15) & j25 & j15) == j15) {
                    if (i26 != length2) {
                        break;
                        break;
                    }
                    i26++;
                } else {
                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j25 & j17) < j16 && startLine <= (i16 = iArr2[(i26 << 3) + i28]) && i16 <= endLine) {
                            this.indicesToRemove.h(i16);
                        }
                        j25 >>= 8;
                    }
                    if (i27 != 8) {
                        break;
                    } else if (i26 != length2) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
        }
        j0<CachedItem> j0Var2 = this.windowCacheWithItems;
        int[] iArr3 = j0Var2.keys;
        long[] jArr3 = j0Var2.metadata;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i29 = 0;
            while (true) {
                long j26 = jArr3[i29];
                if ((((~j26) << c15) & j26 & j15) == j15) {
                    if (i29 != length3) {
                        break;
                        break;
                    }
                    i29++;
                } else {
                    int i35 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i36 = 0; i36 < i35; i36++) {
                        if ((j26 & j17) < j16 && startLine <= (i15 = iArr3[(i29 << 3) + i36]) && i15 <= endLine) {
                            this.indicesToRemove.h(i15);
                        }
                        j26 >>= 8;
                    }
                    if (i35 != 8) {
                        break;
                    } else if (i29 != length3) {
                        break;
                    } else {
                        i29++;
                    }
                }
            }
        }
        k0 k0Var = this.indicesToRemove;
        int[] iArr4 = k0Var.elements;
        long[] jArr4 = k0Var.metadata;
        int length4 = jArr4.length - 2;
        if (length4 < 0) {
            return;
        }
        int i37 = 0;
        while (true) {
            long j27 = jArr4[i37];
            if ((((~j27) << c15) & j27 & j15) != j15) {
                int i38 = 8 - ((~(i37 - length4)) >>> 31);
                for (int i39 = 0; i39 < i38; i39++) {
                    if ((j27 & j17) < j16) {
                        int i45 = iArr4[(i37 << 3) + i39];
                        List<l1.b> listO = this.prefetchWindowHandles.o(i45);
                        if (listO != null) {
                            int size = listO.size();
                            for (int i46 = 0; i46 < size; i46++) {
                                listO.get(i46).cancel();
                            }
                        }
                        this.windowCache.r(i45);
                        this.windowCacheWithItems.o(i45);
                    }
                    j27 >>= 8;
                }
                if (i38 != 8) {
                    return;
                }
            }
            if (i37 == length4) {
                return;
            } else {
                i37++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    private final void y(final j jVar) {
        int i15;
        if (Math.signum(this.previousPassDelta) <= 0.0f) {
            if (this.prefetchWindowEndExtraSpace > 0) {
                i15 = this.prefetchWindowEndLine + 1;
            } else {
                i15 = -1;
            }
        } else if (Math.signum(this.previousPassDelta) <= 0.0f || this.prefetchWindowStartExtraSpace <= 0) {
            i15 = -1;
        } else {
            i15 = this.prefetchWindowStartLine - 1;
        }
        if (i15 <= 0 || jVar.h(i15) == -1 || jVar.h(i15) >= this.itemsCount) {
            return;
        }
        this.prefetchWindowHandles.r(i15, jVar.c(i15, new p() { // from class: h1.h
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return i.z(this.f79412a, jVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(i iVar, j jVar, int i15, int i16) {
        iVar.q(jVar, i15, i16);
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPrefetchWindowEndLine() {
        return this.prefetchWindowEndLine;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getPrefetchWindowStartLine() {
        return this.prefetchWindowStartLine;
    }

    public final boolean n() {
        return (this.prefetchWindowStartLine == Integer.MAX_VALUE || this.prefetchWindowEndLine == Integer.MIN_VALUE) ? false : true;
    }

    public final void t(j jVar, float f15) {
        A();
        g(jVar, f15);
        h(jVar, f15);
        this.previousPassDelta = f15;
        A();
    }

    public final void u(j jVar) {
        if (!this.hasUpdatedVisibleItemsOnce && this.enableInitialPrefetch) {
            y yVar = this.cacheWindow;
            d density = jVar.getDensity();
            if ((density != null ? yVar.b(density, jVar.l()) : 0) != 0) {
                this.shouldRefillWindow = true;
            }
            this.hasUpdatedVisibleItemsOnce = true;
        }
        int i15 = this.previousPassItemCount;
        if (i15 != -1 && i15 != jVar.e()) {
            if (g0.isCacheWindowRefillFixEnabled) {
                o(jVar);
            } else {
                p(jVar);
            }
        }
        this.itemsCount = jVar.e();
        if (jVar.b()) {
            int iG = jVar.g();
            for (int i16 = 0; i16 < iG; i16++) {
                int iF = jVar.f(i16);
                Object objO = jVar.o(i16);
                int iK = jVar.k(i16);
                if (g0.isCacheWindowRefillFixEnabled) {
                    if (iF != -1) {
                        e(iF, objO, iK);
                    }
                } else if (iF != -1) {
                    f(iF, iK);
                }
            }
            if (this.shouldRefillWindow) {
                v(jVar, this.previousPassDelta <= 0.0f);
                this.shouldRefillWindow = false;
            }
        } else {
            x();
        }
        this.previousPassItemCount = jVar.e();
    }

    public final void x() {
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = PKIFailureInfo.systemUnavail;
        this.prefetchWindowStartExtraSpace = 0;
        this.prefetchWindowEndExtraSpace = 0;
        this.shouldRefillWindow = false;
        this.windowCache.j();
        this.windowCacheWithItems.g();
        j0<List<l1.b>> j0Var = this.prefetchWindowHandles;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        int i19 = j0Var.keys[i18];
                        List list = (List) j0Var.values[i18];
                        int size = list.size();
                        for (int i25 = 0; i25 < size; i25++) {
                            ((l1.b) list.get(i25)).cancel();
                        }
                        j0Var.p(i18);
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }
}
