package ja;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lja/q0;", "", "T", "<init>", "()V", "d", "a", "e", "c", "b", "Lja/q0$a;", "Lja/q0$b;", "Lja/q0$c;", "Lja/q0$d;", "Lja/q0$e;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class q0<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lja/q0$a;", "", "T", "Lja/q0;", "", "startIndex", "", "inserted", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(ILjava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getStartIndex", "b", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "c", "getNewPlaceholdersAfter", "d", "getOldPlaceholdersAfter", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> extends q0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int startIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<T> inserted;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int newPlaceholdersAfter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int oldPlaceholdersAfter;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i15, List<? extends T> list, int i16, int i17) {
            super(null);
            this.startIndex = i15;
            this.inserted = list;
            this.newPlaceholdersAfter = i16;
            this.oldPlaceholdersAfter = i17;
        }

        public boolean equals(Object other) {
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.startIndex == aVar.startIndex && fr.t.c(this.inserted, aVar.inserted) && this.newPlaceholdersAfter == aVar.newPlaceholdersAfter && this.oldPlaceholdersAfter == aVar.oldPlaceholdersAfter;
        }

        public int hashCode() {
            return Integer.hashCode(this.startIndex) + this.inserted.hashCode() + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public String toString() {
            return fu.r.p("PagingDataEvent.Append loaded " + this.inserted.size() + " items (\n                    |   startIndex: " + this.startIndex + "\n                    |   first item: " + pq.v.n0(this.inserted) + "\n                    |   last item: " + pq.v.z0(this.inserted) + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersAfter + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersAfter + "\n                    |)\n                    |", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lja/q0$b;", "", "T", "Lja/q0;", "", "startIndex", "dropCount", "newPlaceholdersAfter", "oldPlaceholdersAfter", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getStartIndex", "b", "getDropCount", "c", "getNewPlaceholdersAfter", "d", "getOldPlaceholdersAfter", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> extends q0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int startIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int dropCount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int newPlaceholdersAfter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int oldPlaceholdersAfter;

        public b(int i15, int i16, int i17, int i18) {
            super(null);
            this.startIndex = i15;
            this.dropCount = i16;
            this.newPlaceholdersAfter = i17;
            this.oldPlaceholdersAfter = i18;
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.startIndex == bVar.startIndex && this.dropCount == bVar.dropCount && this.newPlaceholdersAfter == bVar.newPlaceholdersAfter && this.oldPlaceholdersAfter == bVar.oldPlaceholdersAfter;
        }

        public int hashCode() {
            return Integer.hashCode(this.startIndex) + Integer.hashCode(this.dropCount) + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public String toString() {
            return fu.r.p("PagingDataEvent.DropAppend dropped " + this.dropCount + " items (\n                    |   startIndex: " + this.startIndex + "\n                    |   dropCount: " + this.dropCount + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersAfter + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersAfter + "\n                    |)\n                    |", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lja/q0$c;", "", "T", "Lja/q0;", "", "dropCount", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(III)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getDropCount", "b", "getNewPlaceholdersBefore", "c", "getOldPlaceholdersBefore", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> extends q0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int dropCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int newPlaceholdersBefore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int oldPlaceholdersBefore;

        public c(int i15, int i16, int i17) {
            super(null);
            this.dropCount = i15;
            this.newPlaceholdersBefore = i16;
            this.oldPlaceholdersBefore = i17;
        }

        public boolean equals(Object other) {
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.dropCount == cVar.dropCount && this.newPlaceholdersBefore == cVar.newPlaceholdersBefore && this.oldPlaceholdersBefore == cVar.oldPlaceholdersBefore;
        }

        public int hashCode() {
            return Integer.hashCode(this.dropCount) + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public String toString() {
            return fu.r.p("PagingDataEvent.DropPrepend dropped " + this.dropCount + " items (\n                    |   dropCount: " + this.dropCount + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersBefore + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersBefore + "\n                    |)\n                    |", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lja/q0$d;", "", "T", "Lja/q0;", "", "inserted", "", "newPlaceholdersBefore", "oldPlaceholdersBefore", "<init>", "(Ljava/util/List;II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getInserted", "()Ljava/util/List;", "b", "I", "getNewPlaceholdersBefore", "c", "getOldPlaceholdersBefore", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d<T> extends q0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> inserted;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int newPlaceholdersBefore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int oldPlaceholdersBefore;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends T> list, int i15, int i16) {
            super(null);
            this.inserted = list;
            this.newPlaceholdersBefore = i15;
            this.oldPlaceholdersBefore = i16;
        }

        public boolean equals(Object other) {
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return fr.t.c(this.inserted, dVar.inserted) && this.newPlaceholdersBefore == dVar.newPlaceholdersBefore && this.oldPlaceholdersBefore == dVar.oldPlaceholdersBefore;
        }

        public int hashCode() {
            return this.inserted.hashCode() + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public String toString() {
            return fu.r.p("PagingDataEvent.Prepend loaded " + this.inserted.size() + " items (\n                    |   first item: " + pq.v.n0(this.inserted) + "\n                    |   last item: " + pq.v.z0(this.inserted) + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersBefore + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersBefore + "\n                    |)\n                    |", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B%\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lja/q0$e;", "", "T", "Lja/q0;", "Lja/z0;", "newList", "previousList", "<init>", "(Lja/z0;Lja/z0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lja/z0;", "getNewList", "()Lja/z0;", "b", "getPreviousList", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e<T> extends q0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final z0<T> newList;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final z0<T> previousList;

        public e(z0<T> z0Var, z0<T> z0Var2) {
            super(null);
            this.newList = z0Var;
            this.previousList = z0Var2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.newList.b() == eVar.newList.b() && this.newList.c() == eVar.newList.c() && this.newList.getSize() == eVar.newList.getSize() && this.newList.a() == eVar.newList.a() && this.previousList.b() == eVar.previousList.b() && this.previousList.c() == eVar.previousList.c() && this.previousList.getSize() == eVar.previousList.getSize() && this.previousList.a() == eVar.previousList.a();
        }

        public int hashCode() {
            return this.newList.hashCode() + this.previousList.hashCode();
        }

        public String toString() {
            return fu.r.p("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.newList.b() + "\n                    |       placeholdersAfter: " + this.newList.c() + "\n                    |       size: " + this.newList.getSize() + "\n                    |       dataCount: " + this.newList.a() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.previousList.b() + "\n                    |       placeholdersAfter: " + this.previousList.c() + "\n                    |       size: " + this.previousList.getSize() + "\n                    |       dataCount: " + this.previousList.a() + "\n                    |   )\n                    |", null, 1, null);
        }
    }

    public /* synthetic */ q0(fr.k kVar) {
        this();
    }

    private q0() {
    }
}
