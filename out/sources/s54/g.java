package s54;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ls54/g;", "Lgz/b;", "Ls54/g$a;", "Loq/i0;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends gz.b<Params, i0> {

    /* JADX INFO: renamed from: s54.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls54/g$a;", "Lgz/b$a;", "Ls54/g$b;", "removeOperation", "<init>", "(Ls54/g$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls54/g$b;", "()Ls54/g$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b removeOperation;

        public Params(b bVar) {
            this.removeOperation = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getRemoveOperation() {
            return this.removeOperation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.removeOperation, ((Params) other).removeOperation);
        }

        public int hashCode() {
            return this.removeOperation.hashCode();
        }

        public String toString() {
            return "Params(removeOperation=" + this.removeOperation + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Ls54/g$b;", "", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "a", "Lrq0/b;", "getDocumentType", "()Lrq0/b;", "b", "Ls54/g$b$a;", "Ls54/g$b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: s54.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Ls54/g$b$a;", "Ls54/g$b;", "Lrq0/b;", "documentType", "", "containerId", "<init>", "(Lrq0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "()Lrq0/b;", "c", "Ljava/lang/String;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByContainerId extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b documentType;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String containerId;

            public ByContainerId(rq0.b bVar, String str) {
                super(bVar, null);
                this.documentType = bVar;
                this.containerId = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getContainerId() {
                return this.containerId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public rq0.b getDocumentType() {
                return this.documentType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ByContainerId)) {
                    return false;
                }
                ByContainerId byContainerId = (ByContainerId) other;
                return t.c(this.documentType, byContainerId.documentType) && t.c(this.containerId, byContainerId.containerId);
            }

            public int hashCode() {
                return (this.documentType.hashCode() * 31) + this.containerId.hashCode();
            }

            public String toString() {
                return "ByContainerId(documentType=" + this.documentType + ", containerId=" + this.containerId + ")";
            }
        }

        /* JADX INFO: renamed from: s54.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls54/g$b$b;", "Ls54/g$b;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b;", "a", "()Lrq0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByDocumentType extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b documentType;

            public ByDocumentType(rq0.b bVar) {
                super(bVar, null);
                this.documentType = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public rq0.b getDocumentType() {
                return this.documentType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ByDocumentType) && t.c(this.documentType, ((ByDocumentType) other).documentType);
            }

            public int hashCode() {
                return this.documentType.hashCode();
            }

            public String toString() {
                return "ByDocumentType(documentType=" + this.documentType + ")";
            }
        }

        public /* synthetic */ b(rq0.b bVar, fr.k kVar) {
            this(bVar);
        }

        private b(rq0.b bVar) {
            this.documentType = bVar;
        }
    }
}
