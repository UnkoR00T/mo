package zs1;

import bt1.RefugeeDocumentBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o20.BaseDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lzs1/t0;", "Ll00/e;", "Lzs1/t0$a;", "Li70/n;", "a", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t0 extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lzs1/t0$a;", "", "c", "b", "a", "Lzs1/t0$a$a;", "Lzs1/t0$a$b;", "Lzs1/t0$a$c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zs1.t0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzs1/t0$a$a;", "Lzs1/t0$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0013\u000fB;\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lzs1/t0$a$b;", "Lzs1/t0$a;", "Li50/a;", "scaffoldData", "Ly30/n$b;", "controllersData", "Lbt1/c;", "bottomSheetData", "Lcb4/i;", "dialogVMS", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Ly30/n$b;Lbt1/c;Lcb4/i;Ler/a;)V", "a", "Li50/a;", "e", "()Li50/a;", "b", "Ly30/n$b;", "()Ly30/n$b;", "c", "Lbt1/c;", "()Lbt1/c;", "d", "Lcb4/i;", "()Lcb4/i;", "Ler/a;", "()Ler/a;", "Lzs1/t0$a$b$a;", "Lzs1/t0$a$b$b;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final RefugeeDocumentBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final cb4.i dialogVMS;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: zs1.t0$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b8\u0010?R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b4\u0010?R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\b<\u0010?R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\b,\u0010?R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\b@\u0010?R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\b0\u0010?R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010HR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b(\u0010K¨\u0006L"}, d2 = {"Lzs1/t0$a$b$a;", "Lzs1/t0$a$b;", "Li50/a;", "scaffoldData", "Ly30/n$b;", "controllersData", "Lbt1/c;", "bottomSheetData", "Lcb4/i;", "dialogVMS", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lmx/a;", "emptyStateHeader", "emptyStateDescriptionPart1", "emptyStateDescriptionButton", "emptyStateDescriptionPart2", "emptyStateConditionHeader", "emptyStateFirstCondition", "emptyStateSecondCondition", "emptyStateConditionInfo", "", "Ln50/k;", "list", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Ly30/n$b;Lbt1/c;Lcb4/i;Ler/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ljava/util/List;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Li50/a;", "e", "()Li50/a;", "g", "Ly30/n$b;", "b", "()Ly30/n$b;", "h", "Lbt1/c;", "a", "()Lbt1/c;", "i", "Lcb4/i;", "c", "()Lcb4/i;", "j", "Ler/a;", "d", "()Ler/a;", "k", "Lmx/a;", "m", "()Lmx/a;", "l", "n", "o", "p", "q", "r", "s", "Ljava/util/List;", "()Ljava/util/List;", "t", "Lh30/a;", "()Lh30/a;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ChildrenList extends b {

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData scaffoldData;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final y30.n.Switch controllersData;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                private final RefugeeDocumentBottomSheetData bottomSheetData;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVMS;

                /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackAction;

                /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateHeader;

                /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateDescriptionPart1;

                /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateDescriptionButton;

                /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateDescriptionPart2;

                /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateConditionHeader;

                /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateFirstCondition;

                /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateSecondCondition;

                /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label emptyStateConditionInfo;

                /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<n50.k> list;

                /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData buttonData;

                /* JADX WARN: Multi-variable type inference failed */
                public ChildrenList(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, RefugeeDocumentBottomSheetData refugeeDocumentBottomSheetData, cb4.i iVar, er.a<oq.i0> aVar, Label label, Label label2, Label label3, Label label4, Label label5, Label label6, Label label7, Label label8, List<? extends n50.k> list, ButtonData buttonData) {
                    super(baseScaffoldData, r15, refugeeDocumentBottomSheetData, iVar, aVar, null);
                    this.scaffoldData = baseScaffoldData;
                    this.controllersData = r15;
                    this.bottomSheetData = refugeeDocumentBottomSheetData;
                    this.dialogVMS = iVar;
                    this.onBackAction = aVar;
                    this.emptyStateHeader = label;
                    this.emptyStateDescriptionPart1 = label2;
                    this.emptyStateDescriptionButton = label3;
                    this.emptyStateDescriptionPart2 = label4;
                    this.emptyStateConditionHeader = label5;
                    this.emptyStateFirstCondition = label6;
                    this.emptyStateSecondCondition = label7;
                    this.emptyStateConditionInfo = label8;
                    this.list = list;
                    this.buttonData = buttonData;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public RefugeeDocumentBottomSheetData getBottomSheetData() {
                    return this.bottomSheetData;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public y30.n.Switch getControllersData() {
                    return this.controllersData;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public cb4.i getDialogVMS() {
                    return this.dialogVMS;
                }

                @Override // zs1.t0.a.b
                public er.a<oq.i0> d() {
                    return this.onBackAction;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: e, reason: from getter */
                public BaseScaffoldData getScaffoldData() {
                    return this.scaffoldData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ChildrenList)) {
                        return false;
                    }
                    ChildrenList childrenList = (ChildrenList) other;
                    return fr.t.c(this.scaffoldData, childrenList.scaffoldData) && fr.t.c(this.controllersData, childrenList.controllersData) && fr.t.c(this.bottomSheetData, childrenList.bottomSheetData) && fr.t.c(this.dialogVMS, childrenList.dialogVMS) && fr.t.c(this.onBackAction, childrenList.onBackAction) && fr.t.c(this.emptyStateHeader, childrenList.emptyStateHeader) && fr.t.c(this.emptyStateDescriptionPart1, childrenList.emptyStateDescriptionPart1) && fr.t.c(this.emptyStateDescriptionButton, childrenList.emptyStateDescriptionButton) && fr.t.c(this.emptyStateDescriptionPart2, childrenList.emptyStateDescriptionPart2) && fr.t.c(this.emptyStateConditionHeader, childrenList.emptyStateConditionHeader) && fr.t.c(this.emptyStateFirstCondition, childrenList.emptyStateFirstCondition) && fr.t.c(this.emptyStateSecondCondition, childrenList.emptyStateSecondCondition) && fr.t.c(this.emptyStateConditionInfo, childrenList.emptyStateConditionInfo) && fr.t.c(this.list, childrenList.list) && fr.t.c(this.buttonData, childrenList.buttonData);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final ButtonData getButtonData() {
                    return this.buttonData;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final Label getEmptyStateConditionHeader() {
                    return this.emptyStateConditionHeader;
                }

                /* JADX INFO: renamed from: h, reason: from getter */
                public final Label getEmptyStateConditionInfo() {
                    return this.emptyStateConditionInfo;
                }

                public int hashCode() {
                    int iHashCode = this.scaffoldData.hashCode() * 31;
                    y30.n.Switch r15 = this.controllersData;
                    int iHashCode2 = (((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.bottomSheetData.hashCode()) * 31;
                    cb4.i iVar = this.dialogVMS;
                    return ((((((((((((((((((((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.onBackAction.hashCode()) * 31) + this.emptyStateHeader.hashCode()) * 31) + this.emptyStateDescriptionPart1.hashCode()) * 31) + this.emptyStateDescriptionButton.hashCode()) * 31) + this.emptyStateDescriptionPart2.hashCode()) * 31) + this.emptyStateConditionHeader.hashCode()) * 31) + this.emptyStateFirstCondition.hashCode()) * 31) + this.emptyStateSecondCondition.hashCode()) * 31) + this.emptyStateConditionInfo.hashCode()) * 31) + this.list.hashCode()) * 31) + this.buttonData.hashCode();
                }

                /* JADX INFO: renamed from: i, reason: from getter */
                public final Label getEmptyStateDescriptionButton() {
                    return this.emptyStateDescriptionButton;
                }

                /* JADX INFO: renamed from: j, reason: from getter */
                public final Label getEmptyStateDescriptionPart1() {
                    return this.emptyStateDescriptionPart1;
                }

                /* JADX INFO: renamed from: k, reason: from getter */
                public final Label getEmptyStateDescriptionPart2() {
                    return this.emptyStateDescriptionPart2;
                }

                /* JADX INFO: renamed from: l, reason: from getter */
                public final Label getEmptyStateFirstCondition() {
                    return this.emptyStateFirstCondition;
                }

                /* JADX INFO: renamed from: m, reason: from getter */
                public final Label getEmptyStateHeader() {
                    return this.emptyStateHeader;
                }

                /* JADX INFO: renamed from: n, reason: from getter */
                public final Label getEmptyStateSecondCondition() {
                    return this.emptyStateSecondCondition;
                }

                public final List<n50.k> o() {
                    return this.list;
                }

                public String toString() {
                    return "ChildrenList(scaffoldData=" + this.scaffoldData + ", controllersData=" + this.controllersData + ", bottomSheetData=" + this.bottomSheetData + ", dialogVMS=" + this.dialogVMS + ", onBackAction=" + this.onBackAction + ", emptyStateHeader=" + this.emptyStateHeader + ", emptyStateDescriptionPart1=" + this.emptyStateDescriptionPart1 + ", emptyStateDescriptionButton=" + this.emptyStateDescriptionButton + ", emptyStateDescriptionPart2=" + this.emptyStateDescriptionPart2 + ", emptyStateConditionHeader=" + this.emptyStateConditionHeader + ", emptyStateFirstCondition=" + this.emptyStateFirstCondition + ", emptyStateSecondCondition=" + this.emptyStateSecondCondition + ", emptyStateConditionInfo=" + this.emptyStateConditionInfo + ", list=" + this.list + ", buttonData=" + this.buttonData + ')';
                }
            }

            /* JADX INFO: renamed from: zs1.t0$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001c\u00102¨\u00063"}, d2 = {"Lzs1/t0$a$b$b;", "Lzs1/t0$a$b;", "Li50/a;", "scaffoldData", "Ly30/n$b;", "controllersData", "Lbt1/c;", "bottomSheetData", "Lcb4/i;", "dialogVMS", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lo20/k;", "baseDocumentData", "<init>", "(Li50/a;Ly30/n$b;Lbt1/c;Lcb4/i;Ler/a;Lo20/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Li50/a;", "e", "()Li50/a;", "g", "Ly30/n$b;", "b", "()Ly30/n$b;", "h", "Lbt1/c;", "a", "()Lbt1/c;", "i", "Lcb4/i;", "c", "()Lcb4/i;", "j", "Ler/a;", "d", "()Ler/a;", "k", "Lo20/k;", "()Lo20/k;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DocumentView extends b {

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData scaffoldData;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final y30.n.Switch controllersData;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                private final RefugeeDocumentBottomSheetData bottomSheetData;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVMS;

                /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackAction;

                /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseDocumentData baseDocumentData;

                public DocumentView(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, RefugeeDocumentBottomSheetData refugeeDocumentBottomSheetData, cb4.i iVar, er.a<oq.i0> aVar, BaseDocumentData baseDocumentData) {
                    super(baseScaffoldData, r15, refugeeDocumentBottomSheetData, iVar, aVar, null);
                    this.scaffoldData = baseScaffoldData;
                    this.controllersData = r15;
                    this.bottomSheetData = refugeeDocumentBottomSheetData;
                    this.dialogVMS = iVar;
                    this.onBackAction = aVar;
                    this.baseDocumentData = baseDocumentData;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public RefugeeDocumentBottomSheetData getBottomSheetData() {
                    return this.bottomSheetData;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public y30.n.Switch getControllersData() {
                    return this.controllersData;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public cb4.i getDialogVMS() {
                    return this.dialogVMS;
                }

                @Override // zs1.t0.a.b
                public er.a<oq.i0> d() {
                    return this.onBackAction;
                }

                @Override // zs1.t0.a.b
                /* JADX INFO: renamed from: e, reason: from getter */
                public BaseScaffoldData getScaffoldData() {
                    return this.scaffoldData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentView)) {
                        return false;
                    }
                    DocumentView documentView = (DocumentView) other;
                    return fr.t.c(this.scaffoldData, documentView.scaffoldData) && fr.t.c(this.controllersData, documentView.controllersData) && fr.t.c(this.bottomSheetData, documentView.bottomSheetData) && fr.t.c(this.dialogVMS, documentView.dialogVMS) && fr.t.c(this.onBackAction, documentView.onBackAction) && fr.t.c(this.baseDocumentData, documentView.baseDocumentData);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final BaseDocumentData getBaseDocumentData() {
                    return this.baseDocumentData;
                }

                public int hashCode() {
                    int iHashCode = this.scaffoldData.hashCode() * 31;
                    y30.n.Switch r15 = this.controllersData;
                    int iHashCode2 = (((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.bottomSheetData.hashCode()) * 31;
                    cb4.i iVar = this.dialogVMS;
                    return ((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.onBackAction.hashCode()) * 31) + this.baseDocumentData.hashCode();
                }

                public String toString() {
                    return "DocumentView(scaffoldData=" + this.scaffoldData + ", controllersData=" + this.controllersData + ", bottomSheetData=" + this.bottomSheetData + ", dialogVMS=" + this.dialogVMS + ", onBackAction=" + this.onBackAction + ", baseDocumentData=" + this.baseDocumentData + ')';
                }
            }

            public /* synthetic */ b(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, RefugeeDocumentBottomSheetData refugeeDocumentBottomSheetData, cb4.i iVar, er.a aVar, fr.k kVar) {
                this(baseScaffoldData, r15, refugeeDocumentBottomSheetData, iVar, aVar);
            }

            /* JADX INFO: renamed from: a */
            public abstract RefugeeDocumentBottomSheetData getBottomSheetData();

            /* JADX INFO: renamed from: b */
            public abstract y30.n.Switch getControllersData();

            /* JADX INFO: renamed from: c */
            public abstract cb4.i getDialogVMS();

            public abstract er.a<oq.i0> d();

            /* JADX INFO: renamed from: e */
            public abstract BaseScaffoldData getScaffoldData();

            private b(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, RefugeeDocumentBottomSheetData refugeeDocumentBottomSheetData, cb4.i iVar, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.controllersData = r15;
                this.bottomSheetData = refugeeDocumentBottomSheetData;
                this.dialogVMS = iVar;
                this.onBackAction = aVar;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzs1/t0$a$c;", "Lzs1/t0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f236914a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 143346568;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
