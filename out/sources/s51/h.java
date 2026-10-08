package s51;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ls51/h;", "Ll00/e;", "Ls51/h$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ls51/h$a;", "", "a", "c", "b", "Ls51/h$a$a;", "Ls51/h$a$b;", "Ls51/h$a$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: s51.h$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls51/h$a$a;", "Ls51/h$a;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMSAdapter, ((Error) other).errorVMSAdapter);
            }

            public int hashCode() {
                return this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: s51.h$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Ls51/h$a$b;", "Ls51/h$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Lt51/c;", "Lq40/f;", "iconPageData", "<init>", "(Ler/a;Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Result implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f178077d = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<t51.c, IconPageBottomContentData> iconPageData;

            public Result(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, IconPageData<t51.c, IconPageBottomContentData> iconPageData) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<t51.c, IconPageBottomContentData> b() {
                return this.iconPageData;
            }

            public final er.a<i0> c() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Result)) {
                    return false;
                }
                Result result = (Result) other;
                return fr.t.c(this.onBack, result.onBack) && fr.t.c(this.baseScaffoldData, result.baseScaffoldData) && fr.t.c(this.iconPageData, result.iconPageData);
            }

            public int hashCode() {
                return (((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "Result(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: s51.h$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b%\u0010)¨\u0006*"}, d2 = {"Ls51/h$a$c;", "Ls51/h$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "", "Ls51/e;", "accordionsData", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "e", "()Lmx/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Summary implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<AccordionDataLabeled> accordionsData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            public Summary(BaseScaffoldData baseScaffoldData, Label label, List<AccordionDataLabeled> list, ButtonData buttonData, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.accordionsData = list;
                this.nextButtonData = buttonData;
                this.onBack = aVar;
            }

            public final List<AccordionDataLabeled> a() {
                return this.accordionsData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final er.a<i0> d() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Summary)) {
                    return false;
                }
                Summary summary = (Summary) other;
                return fr.t.c(this.baseScaffoldData, summary.baseScaffoldData) && fr.t.c(this.title, summary.title) && fr.t.c(this.accordionsData, summary.accordionsData) && fr.t.c(this.nextButtonData, summary.nextButtonData) && fr.t.c(this.onBack, summary.onBack);
            }

            public int hashCode() {
                return (((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.accordionsData.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "Summary(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", accordionsData=" + this.accordionsData + ", nextButtonData=" + this.nextButtonData + ", onBack=" + this.onBack + ')';
            }
        }
    }
}
