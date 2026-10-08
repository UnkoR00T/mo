package xp1;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxp1/f;", "Ll00/e;", "Lxp1/f$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: xp1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lxp1/f$a;", "", "Ly30/n$b;", "controllersSwitch", "Ly30/n$a;", "controllersFilter", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Ly30/n$b;Ly30/n$a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly30/n$b;", "b", "()Ly30/n$b;", "Ly30/n$a;", "()Ly30/n$a;", "c", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f220436d = y30.n.Filter.f223689d | y30.n.Switch.f223693f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch controllersSwitch;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Filter controllersFilter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Data(y30.n.Switch r15, y30.n.Filter filter, er.a<i0> aVar) {
            this.controllersSwitch = r15;
            this.controllersFilter = filter;
            this.onCloseClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y30.n.Filter getControllersFilter() {
            return this.controllersFilter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y30.n.Switch getControllersSwitch() {
            return this.controllersSwitch;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.controllersSwitch, data.controllersSwitch) && t.c(this.controllersFilter, data.controllersFilter) && t.c(this.onCloseClick, data.onCloseClick);
        }

        public int hashCode() {
            return (((this.controllersSwitch.hashCode() * 31) + this.controllersFilter.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Data(controllersSwitch=" + this.controllersSwitch + ", controllersFilter=" + this.controllersFilter + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }
}
