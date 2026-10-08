package jv3;

import mz3.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Ljv3/b;", "", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "a", "Ldx/b;", "()Ldx/b;", "c", "b", "Ljv3/b$a;", "Ljv3/b$b;", "Ljv3/b$c;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dx.b domainError;

    /* JADX INFO: renamed from: jv3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljv3/b$a;", "Ljv3/b;", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownloadError extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        public DownloadError(dx.b bVar) {
            super(bVar, null);
            this.domainError = bVar;
        }

        @Override // jv3.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public dx.b getDomainError() {
            return this.domainError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadError) && fr.t.c(this.domainError, ((DownloadError) other).domainError);
        }

        public int hashCode() {
            return this.domainError.hashCode();
        }

        public String toString() {
            return "DownloadError(domainError=" + this.domainError + ')';
        }
    }

    /* JADX INFO: renamed from: jv3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljv3/b$b;", "Ljv3/b;", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializationError extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        public InitializationError(dx.b bVar) {
            super(bVar, null);
            this.domainError = bVar;
        }

        @Override // jv3.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public dx.b getDomainError() {
            return this.domainError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializationError) && fr.t.c(this.domainError, ((InitializationError) other).domainError);
        }

        public int hashCode() {
            return this.domainError.hashCode();
        }

        public String toString() {
            return "InitializationError(domainError=" + this.domainError + ')';
        }
    }

    /* JADX INFO: renamed from: jv3.b$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljv3/b$c;", "Ljv3/b;", "Ldx/b;", "domainError", "Lmz3/z$b;", "updateMethodType", "<init>", "(Ldx/b;Lmz3/z$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "c", "Lmz3/z$b;", "()Lmz3/z$b;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateError extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final z.b updateMethodType;

        public UpdateError(dx.b bVar, z.b bVar2) {
            super(bVar, null);
            this.domainError = bVar;
            this.updateMethodType = bVar2;
        }

        @Override // jv3.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public dx.b getDomainError() {
            return this.domainError;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final z.b getUpdateMethodType() {
            return this.updateMethodType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateError)) {
                return false;
            }
            UpdateError updateError = (UpdateError) other;
            return fr.t.c(this.domainError, updateError.domainError) && this.updateMethodType == updateError.updateMethodType;
        }

        public int hashCode() {
            return (this.domainError.hashCode() * 31) + this.updateMethodType.hashCode();
        }

        public String toString() {
            return "UpdateError(domainError=" + this.domainError + ", updateMethodType=" + this.updateMethodType + ')';
        }
    }

    public /* synthetic */ b(dx.b bVar, fr.k kVar) {
        this(bVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public dx.b getDomainError() {
        return this.domainError;
    }

    private b(dx.b bVar) {
        this.domainError = bVar;
    }
}
