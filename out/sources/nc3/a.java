package nc3;

import fr.k;
import gx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lnc3/a;", "Lgx/b;", "<init>", "()V", "a", "Lnc3/a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {
    public /* synthetic */ a(k kVar) {
        this();
    }

    /* JADX INFO: renamed from: nc3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnc3/a$a;", "Lnc3/a;", "", "forceFetchNewPassports", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToUserData extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean forceFetchNewPassports;

        public ToUserData(boolean z15) {
            super(null);
            this.forceFetchNewPassports = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getForceFetchNewPassports() {
            return this.forceFetchNewPassports;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToUserData) && this.forceFetchNewPassports == ((ToUserData) other).forceFetchNewPassports;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceFetchNewPassports);
        }

        public String toString() {
            return "ToUserData(forceFetchNewPassports=" + this.forceFetchNewPassports + ")";
        }

        public /* synthetic */ ToUserData(boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15);
        }
    }

    private a() {
    }
}
