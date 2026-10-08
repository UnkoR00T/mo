package n50;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ln50/b;", "", "<init>", "()V", "b", "a", "Ln50/b$a;", "Ln50/b$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: n50.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln50/b$a;", "Ln50/b;", "Lr50/a;", "statusBadgeData", "<init>", "(Lr50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr50/a;", "()Lr50/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusBadge extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r50.a statusBadgeData;

        public StatusBadge(r50.a aVar) {
            super(null);
            this.statusBadgeData = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final r50.a getStatusBadgeData() {
            return this.statusBadgeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusBadge) && fr.t.c(this.statusBadgeData, ((StatusBadge) other).statusBadgeData);
        }

        public int hashCode() {
            return this.statusBadgeData.hashCode();
        }

        public String toString() {
            return "StatusBadge(statusBadgeData=" + this.statusBadgeData + ')';
        }
    }

    /* JADX INFO: renamed from: n50.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln50/b$b;", "Ln50/b;", "Ln50/i0;", "singleCardLabel", "<init>", "(Ln50/i0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/i0;", "()Ln50/i0;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Title extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SingleCardLabel singleCardLabel;

        public Title(SingleCardLabel singleCardLabel) {
            super(null);
            this.singleCardLabel = singleCardLabel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SingleCardLabel getSingleCardLabel() {
            return this.singleCardLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Title) && fr.t.c(this.singleCardLabel, ((Title) other).singleCardLabel);
        }

        public int hashCode() {
            return this.singleCardLabel.hashCode();
        }

        public String toString() {
            return "Title(singleCardLabel=" + this.singleCardLabel + ')';
        }
    }

    public /* synthetic */ b(fr.k kVar) {
        this();
    }

    private b() {
    }
}
