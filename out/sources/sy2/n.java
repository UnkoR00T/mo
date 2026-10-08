package sy2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lsy2/n;", "", "d", "a", "c", "b", "Lsy2/n$a;", "Lsy2/n$b;", "Lsy2/n$c;", "Lsy2/n$d;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lsy2/n$a;", "Lsy2/n;", "Lsy2/l;", "documentStateData", "<init>", "(Lsy2/l;)V", "a", "Lsy2/l;", "()Lsy2/l;", "b", "Lsy2/n$a$a;", "Lsy2/n$a$b;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData documentStateData;

        /* JADX INFO: renamed from: sy2.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsy2/n$a$a;", "Lsy2/n$a;", "Lsy2/l;", "documentStateData", "Lcb4/i;", "dialogVMS", "<init>", "(Lsy2/l;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsy2/l;", "a", "()Lsy2/l;", "c", "Lcb4/i;", "()Lcb4/i;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Dialog(DocumentStateData documentStateData, cb4.i iVar) {
                super(documentStateData, null);
                this.documentStateData = documentStateData;
                this.dialogVMS = iVar;
            }

            @Override // sy2.n.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.documentStateData, dialog.documentStateData) && fr.t.c(this.dialogVMS, dialog.dialogVMS);
            }

            public int hashCode() {
                return (this.documentStateData.hashCode() * 31) + this.dialogVMS.hashCode();
            }

            public String toString() {
                return "Dialog(documentStateData=" + this.documentStateData + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        /* JADX INFO: renamed from: sy2.n$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsy2/n$a$b;", "Lsy2/n$a;", "Lsy2/l;", "documentStateData", "<init>", "(Lsy2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsy2/l;", "a", "()Lsy2/l;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            public Screen(DocumentStateData documentStateData) {
                super(documentStateData, null);
                this.documentStateData = documentStateData;
            }

            @Override // sy2.n.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.documentStateData, ((Screen) other).documentStateData);
            }

            public int hashCode() {
                return this.documentStateData.hashCode();
            }

            public String toString() {
                return "Screen(documentStateData=" + this.documentStateData + ')';
            }
        }

        public /* synthetic */ a(DocumentStateData documentStateData, fr.k kVar) {
            this(documentStateData);
        }

        /* JADX INFO: renamed from: a */
        public abstract DocumentStateData getDocumentStateData();

        private a(DocumentStateData documentStateData) {
            this.documentStateData = documentStateData;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lsy2/n$b;", "Lsy2/n;", "Lsy2/l;", "documentStateData", "<init>", "(Lsy2/l;)V", "a", "Lsy2/l;", "()Lsy2/l;", "Lsy2/n$b$a;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData documentStateData;

        /* JADX INFO: renamed from: sy2.n$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsy2/n$b$a;", "Lsy2/n$b;", "Lsy2/l;", "documentStateData", "<init>", "(Lsy2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsy2/l;", "a", "()Lsy2/l;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            public Screen(DocumentStateData documentStateData) {
                super(documentStateData, null);
                this.documentStateData = documentStateData;
            }

            @Override // sy2.n.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.documentStateData, ((Screen) other).documentStateData);
            }

            public int hashCode() {
                return this.documentStateData.hashCode();
            }

            public String toString() {
                return "Screen(documentStateData=" + this.documentStateData + ')';
            }
        }

        public /* synthetic */ b(DocumentStateData documentStateData, fr.k kVar) {
            this(documentStateData);
        }

        /* JADX INFO: renamed from: a */
        public abstract DocumentStateData getDocumentStateData();

        private b(DocumentStateData documentStateData) {
            this.documentStateData = documentStateData;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsy2/n$c;", "Lsy2/n;", "Lmz3/z$b;", "updateMethodType", "Lsy2/l;", "documentStateData", "<init>", "(Lmz3/z$b;Lsy2/l;)V", "a", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "b", "Lsy2/l;", "getDocumentStateData", "()Lsy2/l;", "Lsy2/n$c$a;", "Lsy2/n$c$b;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mz3.z.b updateMethodType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData documentStateData;

        /* JADX INFO: renamed from: sy2.n$c$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsy2/n$c$a;", "Lsy2/n$c;", "Lmz3/z$b;", "updateMethodType", "Lsy2/l;", "documentStateData", "<init>", "(Lmz3/z$b;Lsy2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmz3/z$b;", "b", "()Lmz3/z$b;", "d", "Lsy2/l;", "a", "()Lsy2/l;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            public Screen(mz3.z.b bVar, DocumentStateData documentStateData) {
                super(bVar, documentStateData, null);
                this.updateMethodType = bVar;
                this.documentStateData = documentStateData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public mz3.z.b getUpdateMethodType() {
                return this.updateMethodType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return this.updateMethodType == screen.updateMethodType && fr.t.c(this.documentStateData, screen.documentStateData);
            }

            public int hashCode() {
                return (this.updateMethodType.hashCode() * 31) + this.documentStateData.hashCode();
            }

            public String toString() {
                return "Screen(updateMethodType=" + this.updateMethodType + ", documentStateData=" + this.documentStateData + ')';
            }
        }

        /* JADX INFO: renamed from: sy2.n$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lsy2/n$c$b;", "Lsy2/n$c;", "Lmz3/z$b;", "updateMethodType", "Lsy2/l;", "documentStateData", "Lhb4/c;", "errorVMS", "<init>", "(Lmz3/z$b;Lsy2/l;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "d", "Lsy2/l;", "a", "()Lsy2/l;", "e", "Lhb4/c;", "b", "()Lhb4/c;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateError extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public UpdateError(mz3.z.b bVar, DocumentStateData documentStateData, hb4.c cVar) {
                super(bVar, documentStateData, null);
                this.updateMethodType = bVar;
                this.documentStateData = documentStateData;
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateError)) {
                    return false;
                }
                UpdateError updateError = (UpdateError) other;
                return this.updateMethodType == updateError.updateMethodType && fr.t.c(this.documentStateData, updateError.documentStateData) && fr.t.c(this.errorVMS, updateError.errorVMS);
            }

            public int hashCode() {
                return (((this.updateMethodType.hashCode() * 31) + this.documentStateData.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "UpdateError(updateMethodType=" + this.updateMethodType + ", documentStateData=" + this.documentStateData + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        public /* synthetic */ c(mz3.z.b bVar, DocumentStateData documentStateData, fr.k kVar) {
            this(bVar, documentStateData);
        }

        private c(mz3.z.b bVar, DocumentStateData documentStateData) {
            this.updateMethodType = bVar;
            this.documentStateData = documentStateData;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsy2/n$d;", "Lsy2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f185820a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1385744495;
        }

        public String toString() {
            return "Initial";
        }
    }
}
