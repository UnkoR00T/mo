package y30;

import fr.t;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ly30/n;", "", "<init>", "()V", "b", "a", "Ly30/n$a;", "Ly30/n$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class n {

    /* JADX INFO: renamed from: y30.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Ly30/n$a;", "Ly30/n;", "", "Lmx/a;", "items", "", "selectedItemIndex", "Lkotlin/Function1;", "Loq/i0;", "onClick", "<init>", "(Ljava/util/List;ILer/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "Ler/l;", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Filter extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f223689d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Label> items;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int selectedItemIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Filter(List<Label> list, int i15, er.l<? super Integer, i0> lVar) {
            super(null);
            this.items = list;
            this.selectedItemIndex = i15;
            this.onClick = lVar;
        }

        public final List<Label> a() {
            return this.items;
        }

        public final er.l<Integer, i0> b() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSelectedItemIndex() {
            return this.selectedItemIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return t.c(this.items, filter.items) && this.selectedItemIndex == filter.selectedItemIndex && t.c(this.onClick, filter.onClick);
        }

        public int hashCode() {
            return (((this.items.hashCode() * 31) + Integer.hashCode(this.selectedItemIndex)) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "Filter(items=" + this.items + ", selectedItemIndex=" + this.selectedItemIndex + ", onClick=" + this.onClick + ')';
        }
    }

    public /* synthetic */ n(fr.k kVar) {
        this();
    }

    private n() {
    }

    /* JADX INFO: renamed from: y30.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u001aB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u0018\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Ly30/n$b;", "Ly30/n;", "Ly30/n$b$a;", "leftItem", "rightItem", "Ly30/n$b$b;", "selectedItemType", "", "autoFocusOnSelectedTab", "Lkotlin/Function1;", "Loq/i0;", "onClick", "<init>", "(Ly30/n$b$a;Ly30/n$b$a;Ly30/n$b$b;ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly30/n$b$a;", "b", "()Ly30/n$b$a;", "d", "c", "Ly30/n$b$b;", "e", "()Ly30/n$b$b;", "Z", "()Z", "Ler/l;", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Switch extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f223693f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TabItem leftItem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TabItem rightItem;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC5973b selectedItemType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean autoFocusOnSelectedTab;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<EnumC5973b, i0> onClick;

        /* JADX INFO: renamed from: y30.n$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly30/n$b$a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Ly30/n$b$b;", "type", "<init>", "(Lmx/a;Ly30/n$b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ly30/n$b$b;", "()Ly30/n$b$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TabItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label label;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC5973b type;

            public TabItem(Label label, EnumC5973b enumC5973b) {
                this.label = label;
                this.type = enumC5973b;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EnumC5973b getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TabItem)) {
                    return false;
                }
                TabItem tabItem = (TabItem) other;
                return t.c(this.label, tabItem.label) && this.type == tabItem.type;
            }

            public int hashCode() {
                return (this.label.hashCode() * 31) + this.type.hashCode();
            }

            public String toString() {
                return "TabItem(label=" + this.label + ", type=" + this.type + ')';
            }
        }

        /* JADX INFO: renamed from: y30.n$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ly30/n$b$b;", "", "", "tabIndex", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC5973b {
            LEFT(0),
            RIGHT(1);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ wq.a f223704e = wq.b.a(b());

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int tabIndex;

            EnumC5973b(int i15) {
                this.tabIndex = i15;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final int getTabIndex() {
                return this.tabIndex;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Switch(TabItem tabItem, TabItem tabItem2, EnumC5973b enumC5973b, boolean z15, er.l<? super EnumC5973b, i0> lVar) {
            super(null);
            this.leftItem = tabItem;
            this.rightItem = tabItem2;
            this.selectedItemType = enumC5973b;
            this.autoFocusOnSelectedTab = z15;
            this.onClick = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAutoFocusOnSelectedTab() {
            return this.autoFocusOnSelectedTab;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TabItem getLeftItem() {
            return this.leftItem;
        }

        public final er.l<EnumC5973b, i0> c() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TabItem getRightItem() {
            return this.rightItem;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC5973b getSelectedItemType() {
            return this.selectedItemType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Switch)) {
                return false;
            }
            Switch r15 = (Switch) other;
            return t.c(this.leftItem, r15.leftItem) && t.c(this.rightItem, r15.rightItem) && this.selectedItemType == r15.selectedItemType && this.autoFocusOnSelectedTab == r15.autoFocusOnSelectedTab && t.c(this.onClick, r15.onClick);
        }

        public int hashCode() {
            return (((((((this.leftItem.hashCode() * 31) + this.rightItem.hashCode()) * 31) + this.selectedItemType.hashCode()) * 31) + Boolean.hashCode(this.autoFocusOnSelectedTab)) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "Switch(leftItem=" + this.leftItem + ", rightItem=" + this.rightItem + ", selectedItemType=" + this.selectedItemType + ", autoFocusOnSelectedTab=" + this.autoFocusOnSelectedTab + ", onClick=" + this.onClick + ')';
        }

        public /* synthetic */ Switch(TabItem tabItem, TabItem tabItem2, EnumC5973b enumC5973b, boolean z15, er.l lVar, int i15, fr.k kVar) {
            this(tabItem, tabItem2, enumC5973b, (i15 & 8) != 0 ? false : z15, lVar);
        }
    }
}
