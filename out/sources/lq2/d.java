package lq2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Llq2/d;", "Ll00/e;", "Llq2/d$a;", "a", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\b\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Llq2/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackClick", "b", "c", "Llq2/d$a$a;", "Llq2/d$a$b;", "Llq2/d$a$c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: lq2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Llq2/d$a$a;", "Llq2/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lhb4/c;", "errorVMS", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "()Lhb4/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(er.a<i0> aVar, hb4.c cVar) {
                this.onBackClick = aVar;
                this.errorVMS = cVar;
            }

            @Override // lq2.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.onBackClick, error.onBackClick) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (this.onBackClick.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(onBackClick=" + this.onBackClick + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: lq2.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Llq2/d$a$b;", "Llq2/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initial(er.a<i0> aVar) {
                this.onBackClick = aVar;
            }

            @Override // lq2.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && fr.t.c(this.onBackClick, ((Initial) other).onBackClick);
            }

            public int hashCode() {
                return this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initial(onBackClick=" + this.onBackClick + ')';
            }
        }

        /* JADX INFO: renamed from: lq2.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b,\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b%\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;¨\u0006<"}, d2 = {"Llq2/d$a$c;", "Llq2/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "Ln30/b;", "list", "Lj40/a;", "documentTypeDropDownData", "Lv50/c;", "idCardSeriesAndNumberStateFieldData", "idCardNameFieldData", "birthPlaceFieldData", "Lc30/b;", "alertData", "Lh30/a;", "nextButtonData", "<init>", "(Ler/a;Li50/a;Lmx/a;Ln30/b;Lj40/a;Lv50/c;Lv50/c;Lv50/c;Lc30/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "c", "()Li50/a;", "Lmx/a;", "f", "()Lmx/a;", "d", "Ln30/b;", "i", "()Ln30/b;", "e", "Lj40/a;", "()Lj40/a;", "Lv50/c;", "h", "()Lv50/c;", "g", "Lc30/b;", "()Lc30/b;", "j", "Lh30/a;", "()Lh30/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f119527k;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData list;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData documentTypeDropDownData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c idCardSeriesAndNumberStateFieldData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c idCardNameFieldData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c birthPlaceFieldData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            static {
                int i15 = c30.b.f22944i;
                int i16 = v50.c.f203957t;
                f119527k = i15 | i16 | i16 | i16 | DropDownButtonData.f99359i | BaseScaffoldData.f89350g;
            }

            public Initialized(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, DropDownButtonData dropDownButtonData, v50.c cVar, v50.c cVar2, v50.c cVar3, c30.b bVar, ButtonData buttonData) {
                this.onBackClick = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.headerLabel = label;
                this.list = cardListData;
                this.documentTypeDropDownData = dropDownButtonData;
                this.idCardSeriesAndNumberStateFieldData = cVar;
                this.idCardNameFieldData = cVar2;
                this.birthPlaceFieldData = cVar3;
                this.alertData = bVar;
                this.nextButtonData = buttonData;
            }

            @Override // lq2.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final v50.c getBirthPlaceFieldData() {
                return this.birthPlaceFieldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final DropDownButtonData getDocumentTypeDropDownData() {
                return this.documentTypeDropDownData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.list, initialized.list) && fr.t.c(this.documentTypeDropDownData, initialized.documentTypeDropDownData) && fr.t.c(this.idCardSeriesAndNumberStateFieldData, initialized.idCardSeriesAndNumberStateFieldData) && fr.t.c(this.idCardNameFieldData, initialized.idCardNameFieldData) && fr.t.c(this.birthPlaceFieldData, initialized.birthPlaceFieldData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.nextButtonData, initialized.nextButtonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final v50.c getIdCardNameFieldData() {
                return this.idCardNameFieldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final v50.c getIdCardSeriesAndNumberStateFieldData() {
                return this.idCardSeriesAndNumberStateFieldData;
            }

            public int hashCode() {
                int iHashCode = ((((((this.onBackClick.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.list.hashCode()) * 31;
                DropDownButtonData dropDownButtonData = this.documentTypeDropDownData;
                int iHashCode2 = (iHashCode + (dropDownButtonData == null ? 0 : dropDownButtonData.hashCode())) * 31;
                v50.c cVar = this.idCardSeriesAndNumberStateFieldData;
                int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
                v50.c cVar2 = this.idCardNameFieldData;
                int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
                v50.c cVar3 = this.birthPlaceFieldData;
                return ((((iHashCode4 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31) + this.alertData.hashCode()) * 31) + this.nextButtonData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final CardListData getList() {
                return this.list;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public String toString() {
                return "Initialized(onBackClick=" + this.onBackClick + ", baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", list=" + this.list + ", documentTypeDropDownData=" + this.documentTypeDropDownData + ", idCardSeriesAndNumberStateFieldData=" + this.idCardSeriesAndNumberStateFieldData + ", idCardNameFieldData=" + this.idCardNameFieldData + ", birthPlaceFieldData=" + this.birthPlaceFieldData + ", alertData=" + this.alertData + ", nextButtonData=" + this.nextButtonData + ')';
            }
        }

        er.a<i0> a();
    }
}
