package re2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lre2/e;", "", "a", "Lre2/e$a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lre2/e$a;", "Lre2/e;", "Lre2/b;", "a", "()Lre2/b;", "initializedData", "b", "Lre2/e$a$a;", "Lre2/e$a$b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends e {

        /* JADX INFO: renamed from: re2.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lre2/e$a$a;", "Lre2/e$a;", "Lre2/b;", "initializedData", "Lcb4/i;", "dialog", "<init>", "(Lre2/b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lre2/b;", "()Lre2/b;", "b", "Lcb4/i;", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedData initializedData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Dialog(InitializedData initializedData, cb4.i iVar) {
                this.initializedData = initializedData;
                this.dialog = iVar;
            }

            @Override // re2.e.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public InitializedData getInitializedData() {
                return this.initializedData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialog() {
                return this.dialog;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.initializedData, dialog.initializedData) && fr.t.c(this.dialog, dialog.dialog);
            }

            public int hashCode() {
                return (this.initializedData.hashCode() * 31) + this.dialog.hashCode();
            }

            public String toString() {
                return "Dialog(initializedData=" + this.initializedData + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: re2.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lre2/e$a$b;", "Lre2/e$a;", "Lre2/b;", "initializedData", "<init>", "(Lre2/b;)V", "b", "(Lre2/b;)Lre2/e$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lre2/b;", "()Lre2/b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedData initializedData;

            public Screen(InitializedData initializedData) {
                this.initializedData = initializedData;
            }

            @Override // re2.e.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public InitializedData getInitializedData() {
                return this.initializedData;
            }

            public final Screen b(InitializedData initializedData) {
                return new Screen(initializedData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.initializedData, ((Screen) other).initializedData);
            }

            public int hashCode() {
                return this.initializedData.hashCode();
            }

            public String toString() {
                return "Screen(initializedData=" + this.initializedData + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        InitializedData getInitializedData();
    }
}
