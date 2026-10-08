package p056h1;

import java.util.List;
import lr.i;
import lr.m;
import p071kotlin.Metadata;
import r0.o;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0013\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lh1/e3;", "", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "Lr0/o;", "stickyItems", "b", "(IILr0/o;)Lr0/o;", "", "Lh1/b1;", "visibleStickyItems", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;IIIIIII)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f79364a;

    /* JADX INFO: renamed from: h1.e3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lh1/e3$a;", "", "<init>", "()V", "Lh1/e3;", "b", "Lh1/e3;", "a", "()Lh1/e3;", "StickToTopPlacement", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f79364a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e3 StickToTopPlacement = new C1809a();

        /* JADX INFO: renamed from: h1.e3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"h1/e3$a$a", "Lh1/e3;", "", "Lh1/b1;", "visibleStickyItems", "", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;IIIIIII)I", "firstVisibleItemIndex", "lastVisibleItemIndex", "Lr0/o;", "stickyItems", "b", "(IILr0/o;)Lr0/o;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1809a implements e3 {
            C1809a() {
            }

            @Override // p056h1.e3
            public int a(List<? extends b1> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight) {
                b1 b1Var;
                int size = visibleStickyItems.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        b1Var = null;
                        break;
                    }
                    b1Var = visibleStickyItems.get(i15);
                    if (b1Var.getIndex() != itemIndex) {
                        break;
                    }
                    i15++;
                }
                b1 b1Var2 = b1Var;
                int iC = b1Var2 != null ? c2.c(b1Var2) : Integer.MIN_VALUE;
                int iMax = itemOffset == Integer.MIN_VALUE ? -beforeContentPadding : Math.max(-beforeContentPadding, itemOffset);
                return iC != Integer.MIN_VALUE ? Math.min(iMax, iC - itemSize) : iMax;
            }

            @Override // p056h1.e3
            public o b(int firstVisibleItemIndex, int lastVisibleItemIndex, o stickyItems) {
                int i15;
                if (lastVisibleItemIndex - firstVisibleItemIndex < 0 || (i15 = stickyItems._size) == 0) {
                    return p.a();
                }
                i iVarW = m.w(0, i15);
                int first = iVarW.getFirst();
                int last = iVarW.getLast();
                int iE = -1;
                if (first <= last) {
                    while (stickyItems.e(first) <= firstVisibleItemIndex) {
                        iE = stickyItems.e(first);
                        if (first == last) {
                            break;
                        }
                        first++;
                    }
                }
                return iE == -1 ? p.a() : p.b(iE);
            }
        }

        private Companion() {
        }

        public final e3 a() {
            return StickToTopPlacement;
        }
    }

    int a(List<? extends b1> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight);

    o b(int firstVisibleItemIndex, int lastVisibleItemIndex, o stickyItems);
}
