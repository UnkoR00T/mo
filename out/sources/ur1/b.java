package ur1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lur1/b;", "", "<init>", "()V", "b", "a", "Lur1/b$a;", "Lur1/b$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lur1/b$a;", "Lur1/b;", "Lur1/c;", "data", "<init>", "(Lur1/c;)V", "a", "Lur1/c;", "()Lur1/c;", "b", "Lur1/b$a$a;", "Lur1/b$a$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData data;

        /* JADX INFO: renamed from: ur1.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lur1/b$a$a;", "Lur1/b$a;", "Lur1/c;", "data", "Lcb4/i;", "dialog", "<init>", "(Lur1/c;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lur1/c;", "a", "()Lur1/c;", "c", "Lcb4/i;", "()Lcb4/i;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Dialog(StateData stateData, cb4.i iVar) {
                super(stateData, null);
                this.data = stateData;
                this.dialog = iVar;
            }

            @Override // ur1.b.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public StateData getData() {
                return this.data;
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
                return fr.t.c(this.data, dialog.data) && fr.t.c(this.dialog, dialog.dialog);
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.dialog.hashCode();
            }

            public String toString() {
                return "Dialog(data=" + this.data + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: ur1.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lur1/b$a$b;", "Lur1/b$a;", "Lur1/c;", "data", "<init>", "(Lur1/c;)V", "b", "(Lur1/c;)Lur1/b$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lur1/c;", "a", "()Lur1/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public Screen(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // ur1.b.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public final Screen b(StateData data) {
                return new Screen(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.data, ((Screen) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Screen(data=" + this.data + ')';
            }
        }

        public /* synthetic */ a(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        /* JADX INFO: renamed from: a */
        public abstract StateData getData();

        private a(StateData stateData) {
            super(null);
            this.data = stateData;
        }
    }

    /* JADX INFO: renamed from: ur1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lur1/b$b;", "Lur1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5211b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5211b f200170a = new C5211b();

        private C5211b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C5211b);
        }

        public int hashCode() {
            return 1834063663;
        }

        public String toString() {
            return "Initial";
        }
    }

    public /* synthetic */ b(fr.k kVar) {
        this();
    }

    private b() {
    }
}
