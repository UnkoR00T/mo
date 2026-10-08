package me1;

import java.util.List;
import ld1.KrusOfficeModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lme1/j;", "", "c", "b", "a", "Lme1/j$b;", "Lme1/j$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lme1/j$b;", "Lme1/j;", "Lme1/j$a;", "formData", "<init>", "(Lme1/j$a;)V", "a", "Lme1/j$a;", "getFormData", "()Lme1/j$a;", "b", "Lme1/j$b$a;", "Lme1/j$b$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FormData formData;

        /* JADX INFO: renamed from: me1.j$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lme1/j$b$a;", "Lme1/j$b;", "Lme1/j$a;", "formData", "<init>", "(Lme1/j$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lme1/j$a;", "a", "()Lme1/j$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoPage extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            public InfoPage(FormData formData) {
                super(formData, null);
                this.formData = formData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InfoPage) && fr.t.c(this.formData, ((InfoPage) other).formData);
            }

            public int hashCode() {
                return this.formData.hashCode();
            }

            public String toString() {
                return "InfoPage(formData=" + this.formData + ')';
            }
        }

        /* JADX INFO: renamed from: me1.j$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lme1/j$b$b;", "Lme1/j$b;", "Lme1/j$a;", "formData", "<init>", "(Lme1/j$a;)V", "a", "(Lme1/j$a;)Lme1/j$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lme1/j$a;", "()Lme1/j$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            public Initialized(FormData formData) {
                super(formData, null);
                this.formData = formData;
            }

            public final Initialized a(FormData formData) {
                return new Initialized(formData);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initialized) && fr.t.c(this.formData, ((Initialized) other).formData);
            }

            public int hashCode() {
                return this.formData.hashCode();
            }

            public String toString() {
                return "Initialized(formData=" + this.formData + ')';
            }
        }

        public /* synthetic */ b(FormData formData, fr.k kVar) {
            this(formData);
        }

        private b(FormData formData) {
            this.formData = formData;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme1/j$c;", "Lme1/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f126001a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1223537526;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: me1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lme1/j$a;", "", "", "Lld1/i;", "krusOfficeSelections", "selectedKrusOfficeSelection", "", "isValid", "isDataLoaded", "<init>", "(Ljava/util/List;Lld1/i;ZZ)V", "a", "(Ljava/util/List;Lld1/i;ZZ)Lme1/j$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lld1/i;", "d", "()Lld1/i;", "Z", "f", "()Z", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<KrusOfficeModel> krusOfficeSelections;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KrusOfficeModel selectedKrusOfficeSelection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValid;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDataLoaded;

        public FormData(List<KrusOfficeModel> list, KrusOfficeModel krusOfficeModel, boolean z15, boolean z16) {
            this.krusOfficeSelections = list;
            this.selectedKrusOfficeSelection = krusOfficeModel;
            this.isValid = z15;
            this.isDataLoaded = z16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormData b(FormData formData, List list, KrusOfficeModel krusOfficeModel, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = formData.krusOfficeSelections;
            }
            if ((i15 & 2) != 0) {
                krusOfficeModel = formData.selectedKrusOfficeSelection;
            }
            if ((i15 & 4) != 0) {
                z15 = formData.isValid;
            }
            if ((i15 & 8) != 0) {
                z16 = formData.isDataLoaded;
            }
            return formData.a(list, krusOfficeModel, z15, z16);
        }

        public final FormData a(List<KrusOfficeModel> krusOfficeSelections, KrusOfficeModel selectedKrusOfficeSelection, boolean isValid, boolean isDataLoaded) {
            return new FormData(krusOfficeSelections, selectedKrusOfficeSelection, isValid, isDataLoaded);
        }

        public final List<KrusOfficeModel> c() {
            return this.krusOfficeSelections;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final KrusOfficeModel getSelectedKrusOfficeSelection() {
            return this.selectedKrusOfficeSelection;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsDataLoaded() {
            return this.isDataLoaded;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormData)) {
                return false;
            }
            FormData formData = (FormData) other;
            return fr.t.c(this.krusOfficeSelections, formData.krusOfficeSelections) && fr.t.c(this.selectedKrusOfficeSelection, formData.selectedKrusOfficeSelection) && this.isValid == formData.isValid && this.isDataLoaded == formData.isDataLoaded;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public int hashCode() {
            int iHashCode = this.krusOfficeSelections.hashCode() * 31;
            KrusOfficeModel krusOfficeModel = this.selectedKrusOfficeSelection;
            return ((((iHashCode + (krusOfficeModel == null ? 0 : krusOfficeModel.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.isDataLoaded);
        }

        public String toString() {
            return "FormData(krusOfficeSelections=" + this.krusOfficeSelections + ", selectedKrusOfficeSelection=" + this.selectedKrusOfficeSelection + ", isValid=" + this.isValid + ", isDataLoaded=" + this.isDataLoaded + ')';
        }

        public /* synthetic */ FormData(List list, KrusOfficeModel krusOfficeModel, boolean z15, boolean z16, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? pq.v.n() : list, (i15 & 2) != 0 ? null : krusOfficeModel, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? false : z16);
        }
    }
}
