package xv1;

import java.util.List;
import lv1.DynamicDocument;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lxv1/c;", "", "a", "b", "Lxv1/c$a;", "Lxv1/c$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxv1/c$a;", "Lxv1/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f221466a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -381077257;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\tB!\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lxv1/c$b;", "Lxv1/c;", "", "Llv1/c;", "documentsList", "", "documentShortName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lxv1/c$b$a;", "Lxv1/c$b$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<DynamicDocument> documentsList;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String documentShortName;

        /* JADX INFO: renamed from: xv1.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxv1/c$b$a;", "Lxv1/c$b;", "", "Llv1/c;", "documentsList", "", "documentShortName", "Lcb4/i;", "dialog", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "Ljava/lang/String;", "a", "e", "Lcb4/i;", "()Lcb4/i;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DynamicDocument> documentsList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentShortName;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Dialog(List<DynamicDocument> list, String str, cb4.i iVar) {
                super(list, str, null);
                this.documentsList = list;
                this.documentShortName = str;
                this.dialog = iVar;
            }

            @Override // xv1.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getDocumentShortName() {
                return this.documentShortName;
            }

            @Override // xv1.c.b
            public List<DynamicDocument> b() {
                return this.documentsList;
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
                return fr.t.c(this.documentsList, dialog.documentsList) && fr.t.c(this.documentShortName, dialog.documentShortName) && fr.t.c(this.dialog, dialog.dialog);
            }

            public int hashCode() {
                int iHashCode = this.documentsList.hashCode() * 31;
                String str = this.documentShortName;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dialog.hashCode();
            }

            public String toString() {
                return "Dialog(documentsList=" + this.documentsList + ", documentShortName=" + this.documentShortName + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: xv1.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lxv1/c$b$b;", "Lxv1/c$b;", "", "Llv1/c;", "documentsList", "", "documentShortName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "c", "(Ljava/util/List;Ljava/lang/String;)Lxv1/c$b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "Ljava/lang/String;", "a", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DynamicDocument> documentsList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentShortName;

            public Screen(List<DynamicDocument> list, String str) {
                super(list, str, null);
                this.documentsList = list;
                this.documentShortName = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Screen d(Screen screen, List list, String str, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    list = screen.documentsList;
                }
                if ((i15 & 2) != 0) {
                    str = screen.documentShortName;
                }
                return screen.c(list, str);
            }

            @Override // xv1.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getDocumentShortName() {
                return this.documentShortName;
            }

            @Override // xv1.c.b
            public List<DynamicDocument> b() {
                return this.documentsList;
            }

            public final Screen c(List<DynamicDocument> documentsList, String documentShortName) {
                return new Screen(documentsList, documentShortName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.documentsList, screen.documentsList) && fr.t.c(this.documentShortName, screen.documentShortName);
            }

            public int hashCode() {
                int iHashCode = this.documentsList.hashCode() * 31;
                String str = this.documentShortName;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Screen(documentsList=" + this.documentsList + ", documentShortName=" + this.documentShortName + ')';
            }
        }

        public /* synthetic */ b(List list, String str, fr.k kVar) {
            this(list, str);
        }

        /* JADX INFO: renamed from: a */
        public abstract String getDocumentShortName();

        public abstract List<DynamicDocument> b();

        private b(List<DynamicDocument> list, String str) {
            this.documentsList = list;
            this.documentShortName = str;
        }
    }
}
