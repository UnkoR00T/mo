package l61;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll61/w;", "Lgz/b;", "Ll61/w$a;", "Loq/i0;", "Lk61/a;", "faceDetectionDataSource", "<init>", "(Lk61/a;)V", "params", "d", "(Ll61/w$a;Ltq/e;)Ljava/lang/Object;", "a", "Lk61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements gz.b<Params, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k61.a faceDetectionDataSource;

    /* JADX INFO: renamed from: l61.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll61/w$a;", "Lgz/b$a;", "Li61/a;", "installationState", "<init>", "(Li61/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li61/a;", "()Li61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i61.a installationState;

        public Params(i61.a aVar) {
            this.installationState = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i61.a getInstallationState() {
            return this.installationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.installationState == ((Params) other).installationState;
        }

        public int hashCode() {
            return this.installationState.hashCode();
        }

        public String toString() {
            return "Params(installationState=" + this.installationState + ')';
        }
    }

    public w(k61.a aVar) {
        this.faceDetectionDataSource = aVar;
    }

    public Object d(Params params, tq.e<? super i0> eVar) {
        this.faceDetectionDataSource.a(params.getInstallationState());
        return i0.f148189a;
    }
}
