package yb3;

import cc3.ScrollableField;
import ga3.StageField;
import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyb3/k;", "", "b", "a", "Lyb3/k$a;", "Lyb3/k$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyb3/k$b;", "Lyb3/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f226243a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1580880723;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: yb3.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010'\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006("}, d2 = {"Lyb3/k$a;", "Lyb3/k;", "", "Lga3/d;", "stages", "Ljava/time/LocalDate;", "oldestChildDateBirth", "Lcc3/a;", "scrollToField", "<init>", "(Ljava/util/List;Ljava/time/LocalDate;Lcc3/a;)V", "a", "(Ljava/util/List;Ljava/time/LocalDate;Lcc3/a;)Lyb3/k$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Ljava/time/LocalDate;", "e", "()Ljava/time/LocalDate;", "c", "Lcc3/a;", "f", "()Lcc3/a;", "d", "Z", "()Z", "canDelete", "canAddNext", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StageField> stages;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate oldestChildDateBirth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ScrollableField scrollToField;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean canDelete;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean canAddNext;

        public Initialized(List<StageField> list, LocalDate localDate, ScrollableField scrollableField) {
            this.stages = list;
            this.oldestChildDateBirth = localDate;
            this.scrollToField = scrollableField;
            this.canDelete = list.size() > 1;
            this.canAddNext = list.size() < 10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, LocalDate localDate, ScrollableField scrollableField, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.stages;
            }
            if ((i15 & 2) != 0) {
                localDate = initialized.oldestChildDateBirth;
            }
            if ((i15 & 4) != 0) {
                scrollableField = initialized.scrollToField;
            }
            return initialized.a(list, localDate, scrollableField);
        }

        public final Initialized a(List<StageField> stages, LocalDate oldestChildDateBirth, ScrollableField scrollToField) {
            return new Initialized(stages, oldestChildDateBirth, scrollToField);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCanAddNext() {
            return this.canAddNext;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCanDelete() {
            return this.canDelete;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getOldestChildDateBirth() {
            return this.oldestChildDateBirth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.stages, initialized.stages) && fr.t.c(this.oldestChildDateBirth, initialized.oldestChildDateBirth) && fr.t.c(this.scrollToField, initialized.scrollToField);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ScrollableField getScrollToField() {
            return this.scrollToField;
        }

        public final List<StageField> g() {
            return this.stages;
        }

        public int hashCode() {
            int iHashCode = this.stages.hashCode() * 31;
            LocalDate localDate = this.oldestChildDateBirth;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            ScrollableField scrollableField = this.scrollToField;
            return iHashCode2 + (scrollableField != null ? scrollableField.hashCode() : 0);
        }

        public String toString() {
            return "Initialized(stages=" + this.stages + ", oldestChildDateBirth=" + this.oldestChildDateBirth + ", scrollToField=" + this.scrollToField + ')';
        }

        public /* synthetic */ Initialized(List list, LocalDate localDate, ScrollableField scrollableField, int i15, fr.k kVar) {
            this(list, localDate, (i15 & 4) != 0 ? null : scrollableField);
        }
    }
}
