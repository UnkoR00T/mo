package v32;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lv32/b;", "Lgx/b;", "<init>", "()V", "a", "Lv32/b$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b implements gx.b {

    /* JADX INFO: renamed from: v32.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv32/b$a;", "Lv32/b;", "Lv32/a;", "data", "Lw32/a;", "entryPoint", "<init>", "(Lv32/a;Lw32/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv32/a;", "()Lv32/a;", "b", "Lw32/a;", "()Lw32/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToInstantPaymentsDetails extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstantPaymentNotificationDetailsData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w32.a entryPoint;

        public ToInstantPaymentsDetails(InstantPaymentNotificationDetailsData instantPaymentNotificationDetailsData, w32.a aVar) {
            super(null);
            this.data = instantPaymentNotificationDetailsData;
            this.entryPoint = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InstantPaymentNotificationDetailsData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final w32.a getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToInstantPaymentsDetails)) {
                return false;
            }
            ToInstantPaymentsDetails toInstantPaymentsDetails = (ToInstantPaymentsDetails) other;
            return t.c(this.data, toInstantPaymentsDetails.data) && this.entryPoint == toInstantPaymentsDetails.entryPoint;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "ToInstantPaymentsDetails(data=" + this.data + ", entryPoint=" + this.entryPoint + ")";
        }
    }

    public /* synthetic */ b(k kVar) {
        this();
    }

    private b() {
    }
}
