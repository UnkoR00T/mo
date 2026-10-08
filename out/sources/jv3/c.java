package jv3;

import lz3.DownloadTaskData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ljv3/c;", "", "<init>", "()V", "a", "b", "Ljv3/c$a;", "Ljv3/c$b;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljv3/c$a;", "Ljv3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f106103a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 596537439;
        }

        public String toString() {
            return "Initial";
        }
    }

    public /* synthetic */ c(fr.k kVar) {
        this();
    }

    private c() {
    }

    /* JADX INFO: renamed from: jv3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Ljv3/c$b;", "Ljv3/c;", "", "documentName", "Llz3/i;", "taskData", "", "showTakesTooLong", "terminated", "<init>", "(Ljava/lang/String;Llz3/i;ZZ)V", "a", "(Ljava/lang/String;Llz3/i;ZZ)Ljv3/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Llz3/i;", "e", "()Llz3/i;", "Z", "d", "()Z", "f", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loader extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DownloadTaskData taskData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showTakesTooLong;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean terminated;

        public Loader(String str, DownloadTaskData downloadTaskData, boolean z15, boolean z16) {
            super(null);
            this.documentName = str;
            this.taskData = downloadTaskData;
            this.showTakesTooLong = z15;
            this.terminated = z16;
        }

        public static /* synthetic */ Loader b(Loader loader, String str, DownloadTaskData downloadTaskData, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = loader.documentName;
            }
            if ((i15 & 2) != 0) {
                downloadTaskData = loader.taskData;
            }
            if ((i15 & 4) != 0) {
                z15 = loader.showTakesTooLong;
            }
            if ((i15 & 8) != 0) {
                z16 = loader.terminated;
            }
            return loader.a(str, downloadTaskData, z15, z16);
        }

        public final Loader a(String documentName, DownloadTaskData taskData, boolean showTakesTooLong, boolean terminated) {
            return new Loader(documentName, taskData, showTakesTooLong, terminated);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDocumentName() {
            return this.documentName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowTakesTooLong() {
            return this.showTakesTooLong;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DownloadTaskData getTaskData() {
            return this.taskData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loader)) {
                return false;
            }
            Loader loader = (Loader) other;
            return fr.t.c(this.documentName, loader.documentName) && fr.t.c(this.taskData, loader.taskData) && this.showTakesTooLong == loader.showTakesTooLong && this.terminated == loader.terminated;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getTerminated() {
            return this.terminated;
        }

        public int hashCode() {
            String str = this.documentName;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.taskData.hashCode()) * 31) + Boolean.hashCode(this.showTakesTooLong)) * 31) + Boolean.hashCode(this.terminated);
        }

        public String toString() {
            return "Loader(documentName=" + this.documentName + ", taskData=" + this.taskData + ", showTakesTooLong=" + this.showTakesTooLong + ", terminated=" + this.terminated + ')';
        }

        public /* synthetic */ Loader(String str, DownloadTaskData downloadTaskData, boolean z15, boolean z16, int i15, fr.k kVar) {
            this(str, downloadTaskData, z15, (i15 & 8) != 0 ? false : z16);
        }
    }
}
