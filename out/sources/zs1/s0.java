package zs1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lzs1/s0;", "", "f", "d", "b", "e", "c", "a", "Lzs1/s0$a;", "Lzs1/s0$b;", "Lzs1/s0$c;", "Lzs1/s0$d;", "Lzs1/s0$e;", "Lzs1/s0$f;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface s0 {

    /* JADX INFO: renamed from: zs1.s0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzs1/s0$a;", "Lzs1/s0;", "", "childrenDownloadTaskId", "Lzs1/r0;", "documentStateData", "<init>", "(Ljava/lang/String;Lzs1/r0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzs1/r0;", "()Lzs1/r0;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildrenLoader implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String childrenDownloadTaskId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentStateData documentStateData;

        public ChildrenLoader(String str, DocumentStateData documentStateData) {
            this.childrenDownloadTaskId = str;
            this.documentStateData = documentStateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getChildrenDownloadTaskId() {
            return this.childrenDownloadTaskId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DocumentStateData getDocumentStateData() {
            return this.documentStateData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildrenLoader)) {
                return false;
            }
            ChildrenLoader childrenLoader = (ChildrenLoader) other;
            return fr.t.c(this.childrenDownloadTaskId, childrenLoader.childrenDownloadTaskId) && fr.t.c(this.documentStateData, childrenLoader.documentStateData);
        }

        public int hashCode() {
            return (this.childrenDownloadTaskId.hashCode() * 31) + this.documentStateData.hashCode();
        }

        public String toString() {
            return "ChildrenLoader(childrenDownloadTaskId=" + this.childrenDownloadTaskId + ", documentStateData=" + this.documentStateData + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\b\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzs1/s0$b;", "Lzs1/s0;", "Lzs1/r0;", "documentStateData", "Lzs1/o0;", "bottomSheetState", "<init>", "(Lzs1/r0;Lzs1/o0;)V", "a", "Lzs1/r0;", "b", "()Lzs1/r0;", "Lzs1/o0;", "()Lzs1/o0;", "c", "Lzs1/s0$b$a;", "Lzs1/s0$b$b;", "Lzs1/s0$b$c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData documentStateData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o0 bottomSheetState;

        /* JADX INFO: renamed from: zs1.s0$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lzs1/s0$b$a;", "Lzs1/s0$b;", "Lzs1/r0;", "documentStateData", "Lzs1/o0;", "bottomSheetState", "Lcb4/i;", "dialog", "<init>", "(Lzs1/r0;Lzs1/o0;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lzs1/r0;", "b", "()Lzs1/r0;", "d", "Lzs1/o0;", "a", "()Lzs1/o0;", "e", "Lcb4/i;", "()Lcb4/i;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final o0 bottomSheetState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Dialog(DocumentStateData documentStateData, o0 o0Var, cb4.i iVar) {
                super(documentStateData, o0Var, null);
                this.documentStateData = documentStateData;
                this.bottomSheetState = o0Var;
                this.dialog = iVar;
            }

            @Override // zs1.s0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public o0 getBottomSheetState() {
                return this.bottomSheetState;
            }

            @Override // zs1.s0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
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
                return fr.t.c(this.documentStateData, dialog.documentStateData) && fr.t.c(this.bottomSheetState, dialog.bottomSheetState) && fr.t.c(this.dialog, dialog.dialog);
            }

            public int hashCode() {
                return (((this.documentStateData.hashCode() * 31) + this.bottomSheetState.hashCode()) * 31) + this.dialog.hashCode();
            }

            public String toString() {
                return "Dialog(documentStateData=" + this.documentStateData + ", bottomSheetState=" + this.bottomSheetState + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: zs1.s0$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lzs1/s0$b$b;", "Lzs1/s0$b;", "Lzs1/r0;", "documentStateData", "Lzs1/o0;", "bottomSheetState", "Lhb4/c;", "errorVMS", "<init>", "(Lzs1/r0;Lzs1/o0;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lzs1/r0;", "b", "()Lzs1/r0;", "d", "Lzs1/o0;", "a", "()Lzs1/o0;", "e", "Lhb4/c;", "()Lhb4/c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final o0 bottomSheetState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(DocumentStateData documentStateData, o0 o0Var, hb4.c cVar) {
                super(documentStateData, o0Var, null);
                this.documentStateData = documentStateData;
                this.bottomSheetState = o0Var;
                this.errorVMS = cVar;
            }

            @Override // zs1.s0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public o0 getBottomSheetState() {
                return this.bottomSheetState;
            }

            @Override // zs1.s0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.documentStateData, error.documentStateData) && fr.t.c(this.bottomSheetState, error.bottomSheetState) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (((this.documentStateData.hashCode() * 31) + this.bottomSheetState.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(documentStateData=" + this.documentStateData + ", bottomSheetState=" + this.bottomSheetState + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: zs1.s0$b$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzs1/s0$b$c;", "Lzs1/s0$b;", "Lzs1/r0;", "documentStateData", "Lzs1/o0;", "bottomSheetState", "<init>", "(Lzs1/r0;Lzs1/o0;)V", "c", "(Lzs1/r0;Lzs1/o0;)Lzs1/s0$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzs1/r0;", "b", "()Lzs1/r0;", "d", "Lzs1/o0;", "a", "()Lzs1/o0;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final o0 bottomSheetState;

            public Screen(DocumentStateData documentStateData, o0 o0Var) {
                super(documentStateData, o0Var, null);
                this.documentStateData = documentStateData;
                this.bottomSheetState = o0Var;
            }

            public static /* synthetic */ Screen d(Screen screen, DocumentStateData documentStateData, o0 o0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    documentStateData = screen.documentStateData;
                }
                if ((i15 & 2) != 0) {
                    o0Var = screen.bottomSheetState;
                }
                return screen.c(documentStateData, o0Var);
            }

            @Override // zs1.s0.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public o0 getBottomSheetState() {
                return this.bottomSheetState;
            }

            @Override // zs1.s0.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
            }

            public final Screen c(DocumentStateData documentStateData, o0 bottomSheetState) {
                return new Screen(documentStateData, bottomSheetState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.documentStateData, screen.documentStateData) && fr.t.c(this.bottomSheetState, screen.bottomSheetState);
            }

            public int hashCode() {
                return (this.documentStateData.hashCode() * 31) + this.bottomSheetState.hashCode();
            }

            public String toString() {
                return "Screen(documentStateData=" + this.documentStateData + ", bottomSheetState=" + this.bottomSheetState + ')';
            }
        }

        public /* synthetic */ b(DocumentStateData documentStateData, o0 o0Var, fr.k kVar) {
            this(documentStateData, o0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public o0 getBottomSheetState() {
            return this.bottomSheetState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public DocumentStateData getDocumentStateData() {
            return this.documentStateData;
        }

        private b(DocumentStateData documentStateData, o0 o0Var) {
            this.documentStateData = documentStateData;
            this.bottomSheetState = o0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lzs1/s0$c;", "Lzs1/s0;", "Lzs1/r0;", "documentStateData", "<init>", "(Lzs1/r0;)V", "a", "Lzs1/r0;", "getDocumentStateData", "()Lzs1/r0;", "Lzs1/s0$c$a;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData documentStateData;

        /* JADX INFO: renamed from: zs1.s0$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzs1/s0$c$a;", "Lzs1/s0$c;", "Lzs1/r0;", "documentStateData", "<init>", "(Lzs1/r0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lzs1/r0;", "a", "()Lzs1/r0;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            public Screen(DocumentStateData documentStateData) {
                super(documentStateData, null);
                this.documentStateData = documentStateData;
            }

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

        public /* synthetic */ c(DocumentStateData documentStateData, fr.k kVar) {
            this(documentStateData);
        }

        private c(DocumentStateData documentStateData) {
            this.documentStateData = documentStateData;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\bB\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzs1/s0$d;", "Lzs1/s0;", "", "bundleId", "Ly30/n$b$b;", "selectedItem", "<init>", "(Ljava/lang/String;Ly30/n$b$b;)V", "a", "Ljava/lang/String;", "getBundleId", "()Ljava/lang/String;", "b", "Ly30/n$b$b;", "getSelectedItem", "()Ly30/n$b$b;", "Lzs1/s0$d$a;", "Lzs1/s0$d$b;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String bundleId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: zs1.s0$d$a, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzs1/s0$d$a;", "Lzs1/s0$d;", "", "bundleId", "Ly30/n$b$b;", "selectedItem", "Lhb4/c;", "errorVMS", "<init>", "(Ljava/lang/String;Ly30/n$b$b;Lhb4/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "Ly30/n$b$b;", "()Ly30/n$b$b;", "e", "Lhb4/c;", "b", "()Lhb4/c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String bundleId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch.EnumC5973b selectedItem;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(String str, y30.n.Switch.EnumC5973b enumC5973b, hb4.c cVar) {
                super(str, enumC5973b, null);
                this.bundleId = str;
                this.selectedItem = enumC5973b;
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBundleId() {
                return this.bundleId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public y30.n.Switch.EnumC5973b getSelectedItem() {
                return this.selectedItem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.bundleId, error.bundleId) && this.selectedItem == error.selectedItem && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                String str = this.bundleId;
                return ((((str == null ? 0 : str.hashCode()) * 31) + this.selectedItem.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(bundleId=" + this.bundleId + ", selectedItem=" + this.selectedItem + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        public /* synthetic */ d(String str, y30.n.Switch.EnumC5973b enumC5973b, fr.k kVar) {
            this(str, enumC5973b);
        }

        private d(String str, y30.n.Switch.EnumC5973b enumC5973b) {
            this.bundleId = str;
            this.selectedItem = enumC5973b;
        }

        /* JADX INFO: renamed from: zs1.s0$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzs1/s0$d$b;", "Lzs1/s0$d;", "", "bundleId", "Ly30/n$b$b;", "selectedItem", "<init>", "(Ljava/lang/String;Ly30/n$b$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "Ly30/n$b$b;", "b", "()Ly30/n$b$b;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String bundleId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch.EnumC5973b selectedItem;

            public Screen(String str, y30.n.Switch.EnumC5973b enumC5973b) {
                super(str, enumC5973b, null);
                this.bundleId = str;
                this.selectedItem = enumC5973b;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBundleId() {
                return this.bundleId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public y30.n.Switch.EnumC5973b getSelectedItem() {
                return this.selectedItem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.bundleId, screen.bundleId) && this.selectedItem == screen.selectedItem;
            }

            public int hashCode() {
                String str = this.bundleId;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.selectedItem.hashCode();
            }

            public String toString() {
                return "Screen(bundleId=" + this.bundleId + ", selectedItem=" + this.selectedItem + ')';
            }

            public /* synthetic */ Screen(String str, y30.n.Switch.EnumC5973b enumC5973b, int i15, fr.k kVar) {
                this(str, (i15 & 2) != 0 ? y30.n.Switch.EnumC5973b.LEFT : enumC5973b);
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000f\b\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lzs1/s0$e;", "Lzs1/s0;", "Lzs1/r0;", "documentStateData", "Lmz3/z$b;", "updateMethodType", "<init>", "(Lzs1/r0;Lmz3/z$b;)V", "a", "Lzs1/r0;", "()Lzs1/r0;", "b", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "c", "Lzs1/s0$e$a;", "Lzs1/s0$e$b;", "Lzs1/s0$e$c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class e implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DocumentStateData documentStateData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mz3.z.b updateMethodType;

        /* JADX INFO: renamed from: zs1.s0$e$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lzs1/s0$e$a;", "Lzs1/s0$e;", "Lzs1/r0;", "documentStateData", "Lmz3/z$b;", "updateMethodType", "Lcb4/i;", "dialog", "<init>", "(Lzs1/r0;Lmz3/z$b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lzs1/r0;", "a", "()Lzs1/r0;", "d", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "e", "Lcb4/i;", "b", "()Lcb4/i;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Dialog(DocumentStateData documentStateData, mz3.z.b bVar, cb4.i iVar) {
                super(documentStateData, bVar, null);
                this.documentStateData = documentStateData;
                this.updateMethodType = bVar;
                this.dialog = iVar;
            }

            @Override // zs1.s0.e
            /* JADX INFO: renamed from: a, reason: from getter */
            public DocumentStateData getDocumentStateData() {
                return this.documentStateData;
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
                return fr.t.c(this.documentStateData, dialog.documentStateData) && this.updateMethodType == dialog.updateMethodType && fr.t.c(this.dialog, dialog.dialog);
            }

            public int hashCode() {
                return (((this.documentStateData.hashCode() * 31) + this.updateMethodType.hashCode()) * 31) + this.dialog.hashCode();
            }

            public String toString() {
                return "Dialog(documentStateData=" + this.documentStateData + ", updateMethodType=" + this.updateMethodType + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: zs1.s0$e$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lzs1/s0$e$b;", "Lzs1/s0$e;", "Lzs1/r0;", "documentStateData", "Lmz3/z$b;", "updateMethodType", "Lhb4/c;", "errorVMS", "<init>", "(Lzs1/r0;Lmz3/z$b;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lzs1/r0;", "a", "()Lzs1/r0;", "d", "Lmz3/z$b;", "getUpdateMethodType", "()Lmz3/z$b;", "e", "Lhb4/c;", "b", "()Lhb4/c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(DocumentStateData documentStateData, mz3.z.b bVar, hb4.c cVar) {
                super(documentStateData, bVar, null);
                this.documentStateData = documentStateData;
                this.updateMethodType = bVar;
                this.errorVMS = cVar;
            }

            @Override // zs1.s0.e
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
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.documentStateData, error.documentStateData) && this.updateMethodType == error.updateMethodType && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (((this.documentStateData.hashCode() * 31) + this.updateMethodType.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(documentStateData=" + this.documentStateData + ", updateMethodType=" + this.updateMethodType + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: zs1.s0$e$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzs1/s0$e$c;", "Lzs1/s0$e;", "Lzs1/r0;", "documentStateData", "Lmz3/z$b;", "updateMethodType", "<init>", "(Lzs1/r0;Lmz3/z$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lzs1/r0;", "a", "()Lzs1/r0;", "d", "Lmz3/z$b;", "b", "()Lmz3/z$b;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DocumentStateData documentStateData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mz3.z.b updateMethodType;

            public Screen(DocumentStateData documentStateData, mz3.z.b bVar) {
                super(documentStateData, bVar, null);
                this.documentStateData = documentStateData;
                this.updateMethodType = bVar;
            }

            @Override // zs1.s0.e
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
                return fr.t.c(this.documentStateData, screen.documentStateData) && this.updateMethodType == screen.updateMethodType;
            }

            public int hashCode() {
                return (this.documentStateData.hashCode() * 31) + this.updateMethodType.hashCode();
            }

            public String toString() {
                return "Screen(documentStateData=" + this.documentStateData + ", updateMethodType=" + this.updateMethodType + ')';
            }
        }

        public /* synthetic */ e(DocumentStateData documentStateData, mz3.z.b bVar, fr.k kVar) {
            this(documentStateData, bVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public DocumentStateData getDocumentStateData() {
            return this.documentStateData;
        }

        private e(DocumentStateData documentStateData, mz3.z.b bVar) {
            this.documentStateData = documentStateData;
            this.updateMethodType = bVar;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzs1/s0$f;", "Lzs1/s0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f236883a = new f();

        private f() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 820797395;
        }

        public String toString() {
            return "Init";
        }
    }
}
