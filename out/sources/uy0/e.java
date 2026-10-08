package uy0;

import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import wy0.PmIndicatorTable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Luy0/e;", "Ll00/e;", "Luy0/e$a;", "a", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Luy0/e$a;", "", "a", "b", "Luy0/e$a$a;", "Luy0/e$a$b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: uy0.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luy0/e$a$a;", "Luy0/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5259a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5259a f202169a = new C5259a();

            private C5259a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5259a);
            }

            public int hashCode() {
                return -900602746;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: uy0.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006&"}, d2 = {"Luy0/e$a$b;", "Luy0/e$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lwy0/d;", "pmIndicatorTable", "Lmx/a;", "dustIndicatorDescription", "bottomScreenInfoLabel", "<init>", "(Li50/a;Ler/a;Lwy0/d;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Lwy0/d;", "e", "()Lwy0/d;", "Lmx/a;", "()Lmx/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PmIndicatorTable pmIndicatorTable;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label dustIndicatorDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label bottomScreenInfoLabel;

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, PmIndicatorTable pmIndicatorTable, Label label, Label label2) {
                this.baseScaffoldData = baseScaffoldData;
                this.onBackClick = aVar;
                this.pmIndicatorTable = pmIndicatorTable;
                this.dustIndicatorDescription = label;
                this.bottomScreenInfoLabel = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getBottomScreenInfoLabel() {
                return this.bottomScreenInfoLabel;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDustIndicatorDescription() {
                return this.dustIndicatorDescription;
            }

            public final er.a<i0> d() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PmIndicatorTable getPmIndicatorTable() {
                return this.pmIndicatorTable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.pmIndicatorTable, initialized.pmIndicatorTable) && fr.t.c(this.dustIndicatorDescription, initialized.dustIndicatorDescription) && fr.t.c(this.bottomScreenInfoLabel, initialized.bottomScreenInfoLabel);
            }

            public int hashCode() {
                int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31;
                PmIndicatorTable pmIndicatorTable = this.pmIndicatorTable;
                return ((((iHashCode + (pmIndicatorTable == null ? 0 : pmIndicatorTable.hashCode())) * 31) + this.dustIndicatorDescription.hashCode()) * 31) + this.bottomScreenInfoLabel.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", pmIndicatorTable=" + this.pmIndicatorTable + ", dustIndicatorDescription=" + this.dustIndicatorDescription + ", bottomScreenInfoLabel=" + this.bottomScreenInfoLabel + ')';
            }
        }
    }
}
