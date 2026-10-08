package it2;

import iy.b0;
import java.time.OffsetDateTime;
import mx.Label;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lit2/b;", "", "a", "b", "Lit2/b$a;", "Lit2/b$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lit2/b$a;", "Lit2/b;", "Ln50/k;", "cardItemData", "Ljava/time/OffsetDateTime;", "itemDate", "Liy/b0;", "userPesel", "<init>", "(Ln50/k;Ljava/time/OffsetDateTime;Liy/b0;)V", "a", "Ln50/k;", "()Ln50/k;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "Liy/b0;", "()Liy/b0;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k cardItemData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final OffsetDateTime itemDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final b0 userPesel;

        public a(k kVar, OffsetDateTime offsetDateTime, b0 b0Var) {
            this.cardItemData = kVar;
            this.itemDate = offsetDateTime;
            this.userPesel = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k getCardItemData() {
            return this.cardItemData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getItemDate() {
            return this.itemDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getUserPesel() {
            return this.userPesel;
        }
    }

    /* JADX INFO: renamed from: it2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lit2/b$b;", "Lit2/b;", "Lmx/a;", "date", "<init>", "(Lmx/a;)V", "a", "Lmx/a;", "()Lmx/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2272b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label date;

        public C2272b(Label label) {
            this.date = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDate() {
            return this.date;
        }
    }
}
