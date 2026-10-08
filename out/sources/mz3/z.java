package mz3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmz3/z;", "", "Lmz3/z$a;", "Lmz3/z$c;", "a", "c", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface z extends gz.b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmz3/z$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        UPDATE,
        DOWNLOAD;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f129730d = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmz3/z$c;", "", "<init>", "()V", "b", "a", "Lmz3/z$c$a;", "Lmz3/z$c$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmz3/z$c$a;", "Lmz3/z$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f129731a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1185226005;
            }

            public String toString() {
                return "Cooldown";
            }
        }

        /* JADX INFO: renamed from: mz3.z$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"Lmz3/z$c$b;", "Lmz3/z$c;", "", "taskID", "newDocumentID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTaskID", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateStarted extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String taskID;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String newDocumentID;

            public UpdateStarted(String str, String str2) {
                super(null);
                this.taskID = str;
                this.newDocumentID = str2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNewDocumentID() {
                return this.newDocumentID;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateStarted)) {
                    return false;
                }
                UpdateStarted updateStarted = (UpdateStarted) other;
                return fr.t.c(this.taskID, updateStarted.taskID) && fr.t.c(this.newDocumentID, updateStarted.newDocumentID);
            }

            public int hashCode() {
                return (this.taskID.hashCode() * 31) + this.newDocumentID.hashCode();
            }

            public String toString() {
                return "UpdateStarted(taskID=" + this.taskID + ", newDocumentID=" + this.newDocumentID + ")";
            }
        }

        public /* synthetic */ c(fr.k kVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: mz3.z$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"Lmz3/z$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "Lmz3/z$b;", "updateMethodType", "", "documentIID", "", "ignoreCooldown", "<init>", "(Lrq0/b;Lmz3/z$b;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "b", "Lmz3/z$b;", "c", "()Lmz3/z$b;", "Ljava/lang/String;", "d", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b updateMethodType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentIID;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean ignoreCooldown;

        public Params(rq0.b bVar, b bVar2, String str, boolean z15) {
            this.documentType = bVar;
            this.updateMethodType = bVar2;
            this.documentIID = str;
            this.ignoreCooldown = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentIID() {
            return this.documentIID;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIgnoreCooldown() {
            return this.ignoreCooldown;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getUpdateMethodType() {
            return this.updateMethodType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.documentType, params.documentType) && this.updateMethodType == params.updateMethodType && fr.t.c(this.documentIID, params.documentIID) && this.ignoreCooldown == params.ignoreCooldown;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            int iHashCode = ((this.documentType.hashCode() * 31) + this.updateMethodType.hashCode()) * 31;
            String str = this.documentIID;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.ignoreCooldown);
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ", updateMethodType=" + this.updateMethodType + ", documentIID=" + this.documentIID + ", ignoreCooldown=" + this.ignoreCooldown + ")";
        }

        public /* synthetic */ Params(rq0.b bVar, b bVar2, String str, boolean z15, int i15, fr.k kVar) {
            this(bVar, bVar2, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? false : z15);
        }
    }
}
