package zq3;

import fr.k;
import gx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lzq3/a;", "Lgx/b;", "<init>", "()V", "a", "Lzq3/a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {

    /* JADX INFO: renamed from: zq3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lzq3/a$a;", "Lzq3/a;", "", "licenceCode", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToWruDocument extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int licenceCode;

        public ToWruDocument(int i15) {
            super(null);
            this.licenceCode = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLicenceCode() {
            return this.licenceCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToWruDocument) && this.licenceCode == ((ToWruDocument) other).licenceCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.licenceCode);
        }

        public String toString() {
            return "ToWruDocument(licenceCode=" + this.licenceCode + ")";
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
