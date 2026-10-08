package xv1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxv1/d;", "Ll00/e;", "Lxv1/d$a;", "a", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lxv1/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackClick", "b", "Lxv1/d$a$a;", "Lxv1/d$a$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: xv1.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxv1/d$a$a;", "Lxv1/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initial(er.a<i0> aVar) {
                this.onBackClick = aVar;
            }

            @Override // xv1.d.a
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

        /* JADX INFO: renamed from: xv1.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"Lxv1/d$a$b;", "Lxv1/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Li50/a;", "baseScaffoldData", "Lh30/a;", "addButtonData", "Ln30/b;", "documentsList", "Lcb4/i;", "dialogVMS", "<init>", "(Ler/a;Li50/a;Lh30/a;Ln30/b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "c", "()Li50/a;", "Lh30/a;", "()Lh30/a;", "d", "Ln30/b;", "e", "()Ln30/b;", "Lcb4/i;", "()Lcb4/i;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData addButtonData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData documentsList;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Initialized(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, ButtonData buttonData, CardListData cardListData, cb4.i iVar) {
                this.onBackClick = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.addButtonData = buttonData;
                this.documentsList = cardListData;
                this.dialogVMS = iVar;
            }

            @Override // xv1.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getAddButtonData() {
                return this.addButtonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getDocumentsList() {
                return this.documentsList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.addButtonData, initialized.addButtonData) && fr.t.c(this.documentsList, initialized.documentsList) && fr.t.c(this.dialogVMS, initialized.dialogVMS);
            }

            public int hashCode() {
                int iHashCode = ((((((this.onBackClick.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.addButtonData.hashCode()) * 31) + this.documentsList.hashCode()) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Initialized(onBackClick=" + this.onBackClick + ", baseScaffoldData=" + this.baseScaffoldData + ", addButtonData=" + this.addButtonData + ", documentsList=" + this.documentsList + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        er.a<i0> a();
    }
}
