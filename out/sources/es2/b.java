package es2;

import p071kotlin.Metadata;
import qv0.PenaltyPoints;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Les2/b;", "", "b", "a", "Les2/b$a;", "Les2/b$b;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: es2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les2/b$b;", "Les2/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1255b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1255b f53276a = new C1255b();

        private C1255b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1255b);
        }

        public int hashCode() {
            return 355235930;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: es2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Les2/b$a;", "Les2/b;", "Ly30/n$b$b;", "selectedType", "Lqv0/c;", "penaltyPoints", "<init>", "(Ly30/n$b$b;Lqv0/c;)V", "a", "(Ly30/n$b$b;Lqv0/c;)Les2/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly30/n$b$b;", "d", "()Ly30/n$b$b;", "b", "Lqv0/c;", "c", "()Lqv0/c;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataSet implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PenaltyPoints penaltyPoints;

        public DataSet(y30.n.Switch.EnumC5973b enumC5973b, PenaltyPoints penaltyPoints) {
            this.selectedType = enumC5973b;
            this.penaltyPoints = penaltyPoints;
        }

        public static /* synthetic */ DataSet b(DataSet dataSet, y30.n.Switch.EnumC5973b enumC5973b, PenaltyPoints penaltyPoints, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                enumC5973b = dataSet.selectedType;
            }
            if ((i15 & 2) != 0) {
                penaltyPoints = dataSet.penaltyPoints;
            }
            return dataSet.a(enumC5973b, penaltyPoints);
        }

        public final DataSet a(y30.n.Switch.EnumC5973b selectedType, PenaltyPoints penaltyPoints) {
            return new DataSet(selectedType, penaltyPoints);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PenaltyPoints getPenaltyPoints() {
            return this.penaltyPoints;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedType() {
            return this.selectedType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataSet)) {
                return false;
            }
            DataSet dataSet = (DataSet) other;
            return this.selectedType == dataSet.selectedType && fr.t.c(this.penaltyPoints, dataSet.penaltyPoints);
        }

        public int hashCode() {
            return (this.selectedType.hashCode() * 31) + this.penaltyPoints.hashCode();
        }

        public String toString() {
            return "DataSet(selectedType=" + this.selectedType + ", penaltyPoints=" + this.penaltyPoints + ')';
        }

        public /* synthetic */ DataSet(y30.n.Switch.EnumC5973b enumC5973b, PenaltyPoints penaltyPoints, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? y30.n.Switch.EnumC5973b.LEFT : enumC5973b, penaltyPoints);
        }
    }
}
