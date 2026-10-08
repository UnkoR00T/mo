package uk2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Luk2/u;", "", "a", "c", "b", "Luk2/u$a;", "Luk2/u$b;", "Luk2/u$c;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface u {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Luk2/u$a;", "Luk2/u;", "Luk2/t;", "stateData", "<init>", "(Luk2/t;)V", "a", "Luk2/t;", "()Luk2/t;", "b", "Luk2/u$a$a;", "Luk2/u$a$b;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData stateData;

        /* JADX INFO: renamed from: uk2.u$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Luk2/u$a$a;", "Luk2/u$a;", "Luk2/t;", "stateData", "Lcb4/i;", "dialogVMS", "<init>", "(Luk2/t;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Luk2/t;", "a", "()Luk2/t;", "c", "Lcb4/i;", "()Lcb4/i;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData stateData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Dialog(DocumentStateData documentStateData, cb4.i iVar) {
                super(documentStateData, null);
                this.stateData = documentStateData;
                this.dialogVMS = iVar;
            }

            @Override // uk2.u.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getStateData() {
                return this.stateData;
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
                return fr.t.c(this.stateData, dialog.stateData) && fr.t.c(this.dialogVMS, dialog.dialogVMS);
            }

            public int hashCode() {
                return (this.stateData.hashCode() * 31) + this.dialogVMS.hashCode();
            }

            public String toString() {
                return "Dialog(stateData=" + this.stateData + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        /* JADX INFO: renamed from: uk2.u$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Luk2/u$a$b;", "Luk2/u$a;", "Luk2/t;", "stateData", "<init>", "(Luk2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Luk2/t;", "a", "()Luk2/t;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData stateData;

            public Screen(DocumentStateData documentStateData) {
                super(documentStateData, null);
                this.stateData = documentStateData;
            }

            @Override // uk2.u.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.stateData, ((Screen) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "Screen(stateData=" + this.stateData + ')';
            }
        }

        public /* synthetic */ a(DocumentStateData documentStateData, fr.k kVar) {
            this(documentStateData);
        }

        /* JADX INFO: renamed from: a */
        public abstract DocumentStateData getStateData();

        private a(DocumentStateData documentStateData) {
            this.stateData = documentStateData;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Luk2/u$b;", "Luk2/u;", "Luk2/t;", "stateData", "<init>", "(Luk2/t;)V", "a", "Luk2/t;", "()Luk2/t;", "Luk2/u$b$a;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData stateData;

        /* JADX INFO: renamed from: uk2.u$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Luk2/u$b$a;", "Luk2/u$b;", "Luk2/t;", "stateData", "<init>", "(Luk2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Luk2/t;", "a", "()Luk2/t;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData stateData;

            public Screen(DocumentStateData documentStateData) {
                super(documentStateData, null);
                this.stateData = documentStateData;
            }

            @Override // uk2.u.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.stateData, ((Screen) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "Screen(stateData=" + this.stateData + ')';
            }
        }

        public /* synthetic */ b(DocumentStateData documentStateData, fr.k kVar) {
            this(documentStateData);
        }

        /* JADX INFO: renamed from: a */
        public abstract DocumentStateData getStateData();

        private b(DocumentStateData documentStateData) {
            this.stateData = documentStateData;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000f\b\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Luk2/u$c;", "Luk2/u;", "Luk2/t;", "stateData", "Lmz3/z$b;", "updateMethodType", "<init>", "(Luk2/t;Lmz3/z$b;)V", "a", "Luk2/t;", "()Luk2/t;", "b", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "c", "Luk2/u$c$a;", "Luk2/u$c$b;", "Luk2/u$c$c;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData stateData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mz3.z.b updateMethodType;

        /* JADX INFO: renamed from: uk2.u$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Luk2/u$c$a;", "Luk2/u$c;", "Luk2/t;", "stateData", "Lmz3/z$b;", "updateMethodType", "Lcb4/i;", "dialogVMS", "<init>", "(Luk2/t;Lmz3/z$b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Luk2/t;", "a", "()Luk2/t;", "d", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "e", "Lcb4/i;", "b", "()Lcb4/i;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData stateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Dialog(DocumentStateData documentStateData, mz3.z.b bVar, cb4.i iVar) {
                super(documentStateData, bVar, null);
                this.stateData = documentStateData;
                this.updateMethodType = bVar;
                this.dialogVMS = iVar;
            }

            @Override // uk2.u.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getStateData() {
                return this.stateData;
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
                return fr.t.c(this.stateData, dialog.stateData) && this.updateMethodType == dialog.updateMethodType && fr.t.c(this.dialogVMS, dialog.dialogVMS);
            }

            public int hashCode() {
                return (((this.stateData.hashCode() * 31) + this.updateMethodType.hashCode()) * 31) + this.dialogVMS.hashCode();
            }

            public String toString() {
                return "Dialog(stateData=" + this.stateData + ", updateMethodType=" + this.updateMethodType + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        /* JADX INFO: renamed from: uk2.u$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Luk2/u$c$b;", "Luk2/u$c;", "Luk2/t;", "stateData", "Lmz3/z$b;", "updateMethodType", "Lhb4/c;", "errorVMS", "<init>", "(Luk2/t;Lmz3/z$b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Luk2/t;", "a", "()Luk2/t;", "d", "Lmz3/z$b;", "()Lmz3/z$b;", "e", "Lhb4/c;", "b", "()Lhb4/c;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData stateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(DocumentStateData documentStateData, mz3.z.b bVar, hb4.c cVar) {
                super(documentStateData, bVar, null);
                this.stateData = documentStateData;
                this.updateMethodType = bVar;
                this.errorVMS = cVar;
            }

            @Override // uk2.u.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getStateData() {
                return this.stateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public mz3.z.b getUpdateMethodType() {
                return this.updateMethodType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.stateData, error.stateData) && this.updateMethodType == error.updateMethodType && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (((this.stateData.hashCode() * 31) + this.updateMethodType.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(stateData=" + this.stateData + ", updateMethodType=" + this.updateMethodType + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: uk2.u$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Luk2/u$c$c;", "Luk2/u$c;", "Luk2/t;", "stateData", "Lmz3/z$b;", "updateMethodType", "<init>", "(Luk2/t;Lmz3/z$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Luk2/t;", "a", "()Luk2/t;", "d", "Lmz3/z$b;", "b", "()Lmz3/z$b;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData stateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            public Screen(DocumentStateData documentStateData, mz3.z.b bVar) {
                super(documentStateData, bVar, null);
                this.stateData = documentStateData;
                this.updateMethodType = bVar;
            }

            @Override // uk2.u.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getStateData() {
                return this.stateData;
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
                return fr.t.c(this.stateData, screen.stateData) && this.updateMethodType == screen.updateMethodType;
            }

            public int hashCode() {
                return (this.stateData.hashCode() * 31) + this.updateMethodType.hashCode();
            }

            public String toString() {
                return "Screen(stateData=" + this.stateData + ", updateMethodType=" + this.updateMethodType + ')';
            }
        }

        public /* synthetic */ c(DocumentStateData documentStateData, mz3.z.b bVar, fr.k kVar) {
            this(documentStateData, bVar);
        }

        /* JADX INFO: renamed from: a */
        public abstract DocumentStateData getStateData();

        private c(DocumentStateData documentStateData, mz3.z.b bVar) {
            this.stateData = documentStateData;
            this.updateMethodType = bVar;
        }
    }
}
