package z62;

import java.time.OffsetDateTime;
import mx.Label;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lz62/a;", "", "a", "b", "Lz62/a$a;", "Lz62/a$b;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: z62.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lz62/a$a;", "Lz62/a;", "Ln50/k;", "cardItem", "Ljava/time/OffsetDateTime;", "itemDate", "<init>", "(Ln50/k;Ljava/time/OffsetDateTime;)V", "a", "Ln50/k;", "()Ln50/k;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C6275a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k cardItem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final OffsetDateTime itemDate;

        public C6275a(k kVar, OffsetDateTime offsetDateTime) {
            this.cardItem = kVar;
            this.itemDate = offsetDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k getCardItem() {
            return this.cardItem;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getItemDate() {
            return this.itemDate;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lz62/a$b;", "Lz62/a;", "Lmx/a;", "date", "<init>", "(Lmx/a;)V", "a", "Lmx/a;", "()Lmx/a;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label date;

        public b(Label label) {
            this.date = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDate() {
            return this.date;
        }
    }
}
