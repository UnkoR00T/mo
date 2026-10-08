package ky3;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import ly3.OneClickPaymentBottomSheetData;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import ur0.BEAlias;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lky3/j;", "Ll00/e;", "Lky3/j$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lky3/j$a;", "", "d", "a", "b", "c", "Lky3/j$a$a;", "Lky3/j$a$b;", "Lky3/j$a$c;", "Lky3/j$a$d;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ky3.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010)R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b7\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b5\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b.\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b&\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b,\u0010=\u001a\u0004\b3\u0010>R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b:\u0010A¨\u0006B"}, d2 = {"Lky3/j$a$a;", "Lky3/j$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "screenDescriptionHeader", "screenDescription", "", "Lur0/a;", "aliasesData", "payWithOneClickButtonTitle", "payWithOneClickButtonAction", "payWithBlikButtonTitle", "payWithBlikButtonAction", "Lg30/n;", "bottomSheetData", "Lly3/a;", "bottomSheetContentData", "Ln50/g;", "aliases", "Lc30/b;", "oneClickPaymentAlertInfoData", "Li50/a;", "scaffoldData", "<init>", "(Ler/a;Lmx/a;Lmx/a;Ljava/util/List;Lmx/a;Ler/a;Lmx/a;Ler/a;Lg30/n;Lly3/a;Ljava/util/List;Lc30/b;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "d", "()Ler/a;", "b", "Lmx/a;", "l", "()Lmx/a;", "c", "k", "Ljava/util/List;", "getAliasesData", "()Ljava/util/List;", "e", "i", "f", "h", "g", "Lg30/n;", "()Lg30/n;", "j", "Lly3/a;", "()Lly3/a;", "Lc30/b;", "()Lc30/b;", "m", "Li50/a;", "()Li50/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Aliases implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label screenDescriptionHeader;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label screenDescription;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<BEAlias> aliasesData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label payWithOneClickButtonTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> payWithOneClickButtonAction;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label payWithBlikButtonTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> payWithBlikButtonAction;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final OneClickPaymentBottomSheetData bottomSheetContentData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DefaultSingleCardData> aliases;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b oneClickPaymentAlertInfoData;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Aliases(er.a<oq.i0> aVar, Label label, Label label2, List<BEAlias> list, Label label3, er.a<oq.i0> aVar2, Label label4, er.a<oq.i0> aVar3, ModalBottomSheetData modalBottomSheetData, OneClickPaymentBottomSheetData oneClickPaymentBottomSheetData, List<DefaultSingleCardData> list2, c30.b bVar, BaseScaffoldData baseScaffoldData) {
                this.onBackClick = aVar;
                this.screenDescriptionHeader = label;
                this.screenDescription = label2;
                this.aliasesData = list;
                this.payWithOneClickButtonTitle = label3;
                this.payWithOneClickButtonAction = aVar2;
                this.payWithBlikButtonTitle = label4;
                this.payWithBlikButtonAction = aVar3;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = oneClickPaymentBottomSheetData;
                this.aliases = list2;
                this.oneClickPaymentAlertInfoData = bVar;
                this.scaffoldData = baseScaffoldData;
            }

            public final List<DefaultSingleCardData> a() {
                return this.aliases;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final OneClickPaymentBottomSheetData getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            public final er.a<oq.i0> d() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final c30.b getOneClickPaymentAlertInfoData() {
                return this.oneClickPaymentAlertInfoData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Aliases)) {
                    return false;
                }
                Aliases aliases = (Aliases) other;
                return fr.t.c(this.onBackClick, aliases.onBackClick) && fr.t.c(this.screenDescriptionHeader, aliases.screenDescriptionHeader) && fr.t.c(this.screenDescription, aliases.screenDescription) && fr.t.c(this.aliasesData, aliases.aliasesData) && fr.t.c(this.payWithOneClickButtonTitle, aliases.payWithOneClickButtonTitle) && fr.t.c(this.payWithOneClickButtonAction, aliases.payWithOneClickButtonAction) && fr.t.c(this.payWithBlikButtonTitle, aliases.payWithBlikButtonTitle) && fr.t.c(this.payWithBlikButtonAction, aliases.payWithBlikButtonAction) && fr.t.c(this.bottomSheetData, aliases.bottomSheetData) && fr.t.c(this.bottomSheetContentData, aliases.bottomSheetContentData) && fr.t.c(this.aliases, aliases.aliases) && fr.t.c(this.oneClickPaymentAlertInfoData, aliases.oneClickPaymentAlertInfoData) && fr.t.c(this.scaffoldData, aliases.scaffoldData);
            }

            public final er.a<oq.i0> f() {
                return this.payWithBlikButtonAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getPayWithBlikButtonTitle() {
                return this.payWithBlikButtonTitle;
            }

            public final er.a<oq.i0> h() {
                return this.payWithOneClickButtonAction;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((this.onBackClick.hashCode() * 31) + this.screenDescriptionHeader.hashCode()) * 31) + this.screenDescription.hashCode()) * 31) + this.aliasesData.hashCode()) * 31) + this.payWithOneClickButtonTitle.hashCode()) * 31) + this.payWithOneClickButtonAction.hashCode()) * 31) + this.payWithBlikButtonTitle.hashCode()) * 31) + this.payWithBlikButtonAction.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.aliases.hashCode()) * 31;
                c30.b bVar = this.oneClickPaymentAlertInfoData;
                return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.scaffoldData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getPayWithOneClickButtonTitle() {
                return this.payWithOneClickButtonTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getScreenDescription() {
                return this.screenDescription;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getScreenDescriptionHeader() {
                return this.screenDescriptionHeader;
            }

            public String toString() {
                return "Aliases(onBackClick=" + this.onBackClick + ", screenDescriptionHeader=" + this.screenDescriptionHeader + ", screenDescription=" + this.screenDescription + ", aliasesData=" + this.aliasesData + ", payWithOneClickButtonTitle=" + this.payWithOneClickButtonTitle + ", payWithOneClickButtonAction=" + this.payWithOneClickButtonAction + ", payWithBlikButtonTitle=" + this.payWithBlikButtonTitle + ", payWithBlikButtonAction=" + this.payWithBlikButtonAction + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", aliases=" + this.aliases + ", oneClickPaymentAlertInfoData=" + this.oneClickPaymentAlertInfoData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }

        /* JADX INFO: renamed from: ky3.j$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lky3/j$a$b;", "Lky3/j$a;", "Lmx/a;", "screenTitleText", "Li50/a;", "scaffoldData", "<init>", "(Lmx/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Li50/a;", "()Li50/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Confirmation implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f113301c = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label screenTitleText;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Confirmation(Label label, BaseScaffoldData baseScaffoldData) {
                this.screenTitleText = label;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getScreenTitleText() {
                return this.screenTitleText;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Confirmation)) {
                    return false;
                }
                Confirmation confirmation = (Confirmation) other;
                return fr.t.c(this.screenTitleText, confirmation.screenTitleText) && fr.t.c(this.scaffoldData, confirmation.scaffoldData);
            }

            public int hashCode() {
                return (this.screenTitleText.hashCode() * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Confirmation(screenTitleText=" + this.screenTitleText + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }

        /* JADX INFO: renamed from: ky3.j$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lky3/j$a$c;", "Lky3/j$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: ky3.j$a$d, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lky3/j$a$d;", "Lky3/j$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "getOnBackClick", "()Ler/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            public Initial(er.a<oq.i0> aVar) {
                this.onBackClick = aVar;
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
    }

    oz.j a();
}
