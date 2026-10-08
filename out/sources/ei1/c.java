package ei1;

import gi1.ServicesFavouritesScreenModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lei1/c;", "Ll00/e;", "Lei1/c$a;", "Loq/i0;", "d", "()V", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: ei1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lei1/c$a;", "", "Lgi1/b;", "screenState", "<init>", "(Lgi1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi1/b;", "()Lgi1/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ServicesFavouritesScreenModel screenState;

        public Data(ServicesFavouritesScreenModel servicesFavouritesScreenModel) {
            this.screenState = servicesFavouritesScreenModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ServicesFavouritesScreenModel getScreenState() {
            return this.screenState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && fr.t.c(this.screenState, ((Data) other).screenState);
        }

        public int hashCode() {
            return this.screenState.hashCode();
        }

        public String toString() {
            return "Data(screenState=" + this.screenState + ')';
        }
    }

    void d();
}
