package fh2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfh2/d;", "", "a", "b", "Lfh2/d$a;", "Lfh2/d$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lfh2/d$a;", "Lfh2/d;", "Lfh2/b;", "getData", "()Lfh2/b;", "data", "a", "Lfh2/d$a$a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends d {

        /* JADX INFO: renamed from: fh2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfh2/d$a$a;", "Lfh2/d$a;", "Lfh2/b;", "data", "<init>", "(Lfh2/b;)V", "b", "(Lfh2/b;)Lfh2/d$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfh2/b;", "getData", "()Lfh2/b;", "Loq/k;", "c", "()Z", "showKeyboard", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Scanner implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentModelData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final oq.k showKeyboard = oq.l.a(new er.a() { // from class: fh2.c
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(d.a.Scanner.d(this.f63827a));
                }
            });

            public Scanner(ContentModelData contentModelData) {
                this.data = contentModelData;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean d(Scanner scanner) {
                return scanner.getData().getCode().length() == 0;
            }

            public final Scanner b(ContentModelData data) {
                return new Scanner(data);
            }

            public final boolean c() {
                return ((Boolean) this.showKeyboard.getValue()).booleanValue();
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Scanner) && fr.t.c(this.data, ((Scanner) other).data);
            }

            @Override // fh2.d.a
            public ContentModelData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Scanner(data=" + this.data + ')';
            }
        }

        ContentModelData getData();
    }

    /* JADX INFO: renamed from: fh2.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfh2/d$b;", "Lfh2/d;", "Lfh2/b;", "data", "", "isFromQrScan", "Lhb4/c;", "adapter", "<init>", "(Lfh2/b;ZLhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfh2/b;", "getData", "()Lfh2/b;", "b", "Z", "()Z", "c", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContentModelData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromQrScan;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c adapter;

        public Error(ContentModelData contentModelData, boolean z15, hb4.c cVar) {
            this.data = contentModelData;
            this.isFromQrScan = z15;
            this.adapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getAdapter() {
            return this.adapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.data, error.data) && this.isFromQrScan == error.isFromQrScan && fr.t.c(this.adapter, error.adapter);
        }

        public final ContentModelData getData() {
            return this.data;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + Boolean.hashCode(this.isFromQrScan)) * 31) + this.adapter.hashCode();
        }

        public String toString() {
            return "Error(data=" + this.data + ", isFromQrScan=" + this.isFromQrScan + ", adapter=" + this.adapter + ')';
        }
    }
}
