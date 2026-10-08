package p00;

import fr.k;
import fr.t;
import fv.w;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lp00/h;", "", "<init>", "()V", "a", "b", "Lp00/h$a;", "Lp00/h$b;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h {
    public /* synthetic */ h(k kVar) {
        this();
    }

    /* JADX INFO: renamed from: p00.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp00/h$b;", "Lp00/h;", "Ltv/a$a;", "loggingInterceptorLevel", "<init>", "(Ltv/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv/a$a;", "()Ltv/a$a;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Internal extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tv.a.EnumC5026a loggingInterceptorLevel;

        public Internal(tv.a.EnumC5026a enumC5026a) {
            super(null);
            this.loggingInterceptorLevel = enumC5026a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final tv.a.EnumC5026a getLoggingInterceptorLevel() {
            return this.loggingInterceptorLevel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && this.loggingInterceptorLevel == ((Internal) other).loggingInterceptorLevel;
        }

        public int hashCode() {
            return this.loggingInterceptorLevel.hashCode();
        }

        public String toString() {
            return "Internal(loggingInterceptorLevel=" + this.loggingInterceptorLevel + ')';
        }

        public /* synthetic */ Internal(tv.a.EnumC5026a enumC5026a, int i15, k kVar) {
            this((i15 & 1) != 0 ? tv.a.EnumC5026a.BODY : enumC5026a);
        }
    }

    private h() {
    }

    /* JADX INFO: renamed from: p00.h$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lp00/h$a;", "Lp00/h;", "Ltv/a$a;", "loggingInterceptorLevel", "", "Lfv/w;", "additionalInterceptors", "", "blockHttpCleartext", "<init>", "(Ltv/a$a;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv/a$a;", "c", "()Ltv/a$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class External extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tv.a.EnumC5026a loggingInterceptorLevel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<w> additionalInterceptors;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean blockHttpCleartext;

        /* JADX WARN: Multi-variable type inference failed */
        public External(tv.a.EnumC5026a enumC5026a, List<? extends w> list, boolean z15) {
            super(null);
            this.loggingInterceptorLevel = enumC5026a;
            this.additionalInterceptors = list;
            this.blockHttpCleartext = z15;
        }

        public final List<w> a() {
            return this.additionalInterceptors;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getBlockHttpCleartext() {
            return this.blockHttpCleartext;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final tv.a.EnumC5026a getLoggingInterceptorLevel() {
            return this.loggingInterceptorLevel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof External)) {
                return false;
            }
            External external = (External) other;
            return this.loggingInterceptorLevel == external.loggingInterceptorLevel && t.c(this.additionalInterceptors, external.additionalInterceptors) && this.blockHttpCleartext == external.blockHttpCleartext;
        }

        public int hashCode() {
            return (((this.loggingInterceptorLevel.hashCode() * 31) + this.additionalInterceptors.hashCode()) * 31) + Boolean.hashCode(this.blockHttpCleartext);
        }

        public String toString() {
            return "External(loggingInterceptorLevel=" + this.loggingInterceptorLevel + ", additionalInterceptors=" + this.additionalInterceptors + ", blockHttpCleartext=" + this.blockHttpCleartext + ')';
        }

        public /* synthetic */ External(tv.a.EnumC5026a enumC5026a, List list, boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? tv.a.EnumC5026a.BODY : enumC5026a, (i15 & 2) != 0 ? v.n() : list, (i15 & 4) != 0 ? true : z15);
        }
    }
}
