package ni3;

import fr.t;
import k40.EmptyStateData;
import mx.Label;
import n50.k;
import p071kotlin.Metadata;
import u60.PagingListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lni3/a;", "", "a", "b", "Lni3/a$a;", "Lni3/a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: ni3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lni3/a$a;", "Lni3/a;", "Lk40/a;", "emptyState", "Lo40/a;", "collisionHeaderData", "<init>", "(Lk40/a;Lo40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk40/a;", "b", "()Lk40/a;", "Lo40/a;", "()Lo40/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EmptyStateData emptyState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a collisionHeaderData;

        public Empty(EmptyStateData emptyStateData, o40.a aVar) {
            this.emptyState = emptyStateData;
            this.collisionHeaderData = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o40.a getCollisionHeaderData() {
            return this.collisionHeaderData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EmptyStateData getEmptyState() {
            return this.emptyState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return t.c(this.emptyState, empty.emptyState) && t.c(this.collisionHeaderData, empty.collisionHeaderData);
        }

        public int hashCode() {
            return (this.emptyState.hashCode() * 31) + this.collisionHeaderData.hashCode();
        }

        public String toString() {
            return "Empty(emptyState=" + this.emptyState + ", collisionHeaderData=" + this.collisionHeaderData + ')';
        }
    }

    /* JADX INFO: renamed from: ni3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lni3/a$b;", "Lni3/a;", "Lmx/a;", "title", "Lu60/c;", "Lni3/a$b$a;", "pagingListData", "<init>", "(Lmx/a;Lu60/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "Lu60/c;", "()Lu60/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementListByPaging implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f136516c = PagingListData.f195779i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PagingListData<AbstractC3368a> pagingListData;

        /* JADX INFO: renamed from: ni3.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lni3/a$b$a;", "", "<init>", "()V", "a", "c", "b", "Lni3/a$b$a$a;", "Lni3/a$b$a$b;", "Lni3/a$b$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class AbstractC3368a {

            /* JADX INFO: renamed from: ni3.a$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lni3/a$b$a$a;", "Lni3/a$b$a;", "Lo40/a;", "collisionHeaderData", "<init>", "(Lo40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo40/a;", "()Lo40/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Header extends AbstractC3368a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final o40.a collisionHeaderData;

                public Header(o40.a aVar) {
                    super(null);
                    this.collisionHeaderData = aVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final o40.a getCollisionHeaderData() {
                    return this.collisionHeaderData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Header) && t.c(this.collisionHeaderData, ((Header) other).collisionHeaderData);
                }

                public int hashCode() {
                    return this.collisionHeaderData.hashCode();
                }

                public String toString() {
                    return "Header(collisionHeaderData=" + this.collisionHeaderData + ')';
                }
            }

            /* JADX INFO: renamed from: ni3.a$b$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lni3/a$b$a$b;", "Lni3/a$b$a;", "Ln50/k;", "card", "<init>", "(Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/k;", "()Ln50/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Item extends AbstractC3368a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final k card;

                public Item(k kVar) {
                    super(null);
                    this.card = kVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final k getCard() {
                    return this.card;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Item) && t.c(this.card, ((Item) other).card);
                }

                public int hashCode() {
                    return this.card.hashCode();
                }

                public String toString() {
                    return "Item(card=" + this.card + ')';
                }
            }

            /* JADX INFO: renamed from: ni3.a$b$a$c, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lni3/a$b$a$c;", "Lni3/a$b$a;", "Lmx/a;", "title", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Section extends AbstractC3368a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                public Section(Label label) {
                    super(null);
                    this.title = label;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Section) && t.c(this.title, ((Section) other).title);
                }

                public int hashCode() {
                    return this.title.hashCode();
                }

                public String toString() {
                    return "Section(title=" + this.title + ')';
                }
            }

            public /* synthetic */ AbstractC3368a(fr.k kVar) {
                this();
            }

            private AbstractC3368a() {
            }
        }

        public StatementListByPaging(Label label, PagingListData<AbstractC3368a> pagingListData) {
            this.title = label;
            this.pagingListData = pagingListData;
        }

        public final PagingListData<AbstractC3368a> a() {
            return this.pagingListData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatementListByPaging)) {
                return false;
            }
            StatementListByPaging statementListByPaging = (StatementListByPaging) other;
            return t.c(this.title, statementListByPaging.title) && t.c(this.pagingListData, statementListByPaging.pagingListData);
        }

        public int hashCode() {
            Label label = this.title;
            return ((label == null ? 0 : label.hashCode()) * 31) + this.pagingListData.hashCode();
        }

        public String toString() {
            return "StatementListByPaging(title=" + this.title + ", pagingListData=" + this.pagingListData + ')';
        }
    }
}
