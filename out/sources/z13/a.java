package z13;

import fr.k;
import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lz13/a;", "", "<init>", "()V", "a", "b", "Lz13/a$a;", "Lz13/a$b;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: z13.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lz13/a$a;", "Lz13/a;", "", "groupId", "Lmx/a;", "name", "", "iconResId", "", "items", "<init>", "(Ljava/lang/String;Lmx/a;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "I", "Ljava/util/List;", "()Ljava/util/List;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String groupId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a> items;

        /* JADX WARN: Multi-variable type inference failed */
        public Group(String str, Label label, int i15, List<? extends a> list) {
            super(null);
            this.groupId = str;
            this.name = label;
            this.iconResId = i15;
            this.items = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        public final List<a> c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return t.c(this.groupId, group.groupId) && t.c(this.name, group.name) && this.iconResId == group.iconResId && t.c(this.items, group.items);
        }

        public int hashCode() {
            return (((((this.groupId.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.iconResId)) * 31) + this.items.hashCode();
        }

        public String toString() {
            return "Group(groupId=" + this.groupId + ", name=" + this.name + ", iconResId=" + this.iconResId + ", items=" + this.items + ')';
        }
    }

    /* JADX INFO: renamed from: z13.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz13/a$b;", "Lz13/a;", "", "itemId", "Lmx/a;", "name", "description", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lmx/a;", "c", "()Lmx/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String itemId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        public Item(String str, Label label, Label label2) {
            super(null);
            this.itemId = str;
            this.name = label;
            this.description = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return t.c(this.itemId, item.itemId) && t.c(this.name, item.name) && t.c(this.description, item.description);
        }

        public int hashCode() {
            int iHashCode = ((this.itemId.hashCode() * 31) + this.name.hashCode()) * 31;
            Label label = this.description;
            return iHashCode + (label == null ? 0 : label.hashCode());
        }

        public String toString() {
            return "Item(itemId=" + this.itemId + ", name=" + this.name + ", description=" + this.description + ')';
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
