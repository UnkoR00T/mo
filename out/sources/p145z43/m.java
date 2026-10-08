package p145z43;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lz43/m;", "", "e", "c", "a", "b", "d", "Lz43/m$a;", "Lz43/m$b;", "Lz43/m$c;", "Lz43/m$d;", "Lz43/m$e;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz43/m$a;", "Lz43/m;", "<init>", "()V", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f232878a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz43/m$b;", "Lz43/m;", "<init>", "()V", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f232879a = new b();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz43/m$c;", "Lz43/m;", "<init>", "()V", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f232880a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: z43.m$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lz43/m$d;", "Lz43/m;", "", "originSupplement", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MakeProposalService implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originSupplement;

        public MakeProposalService(String str) {
            this.originSupplement = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOriginSupplement() {
            return this.originSupplement;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MakeProposalService) && t.c(this.originSupplement, ((MakeProposalService) other).originSupplement);
        }

        public int hashCode() {
            String str = this.originSupplement;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MakeProposalService(originSupplement=" + this.originSupplement + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz43/m$e;", "Lz43/m;", "<init>", "()V", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f232882a = new e();

        private e() {
        }
    }
}
