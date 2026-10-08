package ev0;

import cv0.BETravelRequestModel;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lev0/m;", "", "Lev0/m$a;", "Loq/i0;", "a", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m extends gz.b {

    /* JADX INFO: renamed from: ev0.m$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lev0/m$a;", "Lgz/b$a;", "Lcv0/q;", "travelUuid", "Lcv0/o;", "model", "<init>", "(Ljava/lang/String;Lcv0/o;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcv0/o;", "()Lcv0/o;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String travelUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BETravelRequestModel model;

        public /* synthetic */ Params(String str, BETravelRequestModel bETravelRequestModel, fr.k kVar) {
            this(str, bETravelRequestModel);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BETravelRequestModel getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTravelUuid() {
            return this.travelUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return cv0.q.b(this.travelUuid, params.travelUuid) && t.c(this.model, params.model);
        }

        public int hashCode() {
            return (cv0.q.c(this.travelUuid) * 31) + this.model.hashCode();
        }

        public String toString() {
            return "Params(travelUuid=" + ((Object) cv0.q.d(this.travelUuid)) + ", model=" + this.model + ')';
        }

        private Params(String str, BETravelRequestModel bETravelRequestModel) {
            this.travelUuid = str;
            this.model = bETravelRequestModel;
        }
    }
}
