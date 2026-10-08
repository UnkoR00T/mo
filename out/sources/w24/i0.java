package w24;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lw24/i0;", "", "Lw24/i0$a;", "", "", "a", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i0 extends gz.b {

    /* JADX INFO: renamed from: w24.i0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lw24/i0$a;", "Lgz/b$a;", "Lf24/i;", "documentType", "", "ignoreParent", "<init>", "(Lf24/i;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lf24/i;", "()Lf24/i;", "b", "Z", "()Z", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final f24.i documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean ignoreParent;

        public Params(f24.i iVar, boolean z15) {
            this.documentType = iVar;
            this.ignoreParent = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f24.i getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIgnoreParent() {
            return this.ignoreParent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.documentType == params.documentType && this.ignoreParent == params.ignoreParent;
        }

        public int hashCode() {
            return (this.documentType.hashCode() * 31) + Boolean.hashCode(this.ignoreParent);
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ", ignoreParent=" + this.ignoreParent + ')';
        }

        public /* synthetic */ Params(f24.i iVar, boolean z15, int i15, fr.k kVar) {
            this(iVar, (i15 & 2) != 0 ? false : z15);
        }
    }
}
