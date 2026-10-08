package nb;

import fr.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: nb.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001c"}, d2 = {"Lnb/a;", "", "", "minWidthDp", "minHeightDp", "<init>", "(II)V", "", "widthDp", "heightDp", "(FF)V", "widthDpBreakpoint", "", "a", "(I)Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getMinWidthDp", "b", "getMinHeightDp", "c", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowSizeClass {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<Integer> f133823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<Integer> f133824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<Integer> f133825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Integer> f133826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<WindowSizeClass> f133827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set<WindowSizeClass> f133828i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minWidthDp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minHeightDp;

    /* JADX INFO: renamed from: nb.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lnb/a$a;", "", "<init>", "()V", "", "", "widthBreakpoints", "heightBreakpoints", "", "Lnb/a;", "b", "(Ljava/util/List;Ljava/util/List;)Ljava/util/Set;", "WIDTH_DP_MEDIUM_LOWER_BOUND", "I", "WIDTH_DP_EXPANDED_LOWER_BOUND", "WIDTH_DP_LARGE_LOWER_BOUND", "WIDTH_DP_EXTRA_LARGE_LOWER_BOUND", "HEIGHT_DP_MEDIUM_LOWER_BOUND", "HEIGHT_DP_EXPANDED_LOWER_BOUND", "WIDTH_DP_BREAKPOINTS_V1", "Ljava/util/List;", "WIDTH_DP_BREAKPOINTS_V2", "HEIGHT_DP_BREAKPOINTS_V1", "HEIGHT_DP_BREAKPOINTS_V2", "BREAKPOINTS_V1", "Ljava/util/Set;", "BREAKPOINTS_V2", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<WindowSizeClass> b(List<Integer> widthBreakpoints, List<Integer> heightBreakpoints) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = widthBreakpoints.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                List<Integer> list = heightBreakpoints;
                ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(new WindowSizeClass(iIntValue, ((Number) it4.next()).intValue()));
                }
                v.D(arrayList, arrayList2);
            }
            return v.k1(arrayList);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        List<Integer> listQ = v.q(0, 600, 840);
        f133823d = listQ;
        List<Integer> listL0 = v.L0(listQ, v.q(1200, 1600));
        f133824e = listL0;
        List<Integer> listQ2 = v.q(0, 480, 900);
        f133825f = listQ2;
        f133826g = listQ2;
        f133827h = companion.b(listQ, listQ2);
        f133828i = companion.b(listL0, listQ2);
    }

    public WindowSizeClass(int i15, int i16) {
        this.minWidthDp = i15;
        this.minHeightDp = i16;
        if (i15 < 0) {
            throw new IllegalArgumentException(("Expected minWidthDp to be at least 0, minWidthDp: " + i15 + '.').toString());
        }
        if (i16 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected minHeightDp to be at least 0, minHeightDp: " + i16 + '.').toString());
    }

    public final boolean a(int widthDpBreakpoint) {
        return this.minWidthDp >= widthDpBreakpoint;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WindowSizeClass.class != other.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) other;
        return this.minWidthDp == windowSizeClass.minWidthDp && this.minHeightDp == windowSizeClass.minHeightDp;
    }

    public int hashCode() {
        return (this.minWidthDp * 31) + this.minHeightDp;
    }

    public String toString() {
        return "WindowSizeClass(minWidthDp=" + this.minWidthDp + ", minHeightDp=" + this.minHeightDp + ')';
    }

    public WindowSizeClass(float f15, float f16) {
        this((int) f15, (int) f16);
    }
}
