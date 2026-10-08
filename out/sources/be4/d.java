package be4;

import b30.AccordionData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lbe4/d;", "Ll00/e;", "Lbe4/d$a;", "a", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\u0007B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lbe4/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "a", "Ler/a;", "()Ler/a;", "b", "c", "Lbe4/d$a$a;", "Lbe4/d$a$b;", "Lbe4/d$a$c;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: be4.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lbe4/d$a$a;", "Lbe4/d$a;", "Lhb4/c;", "errorVMS", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Lhb4/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lhb4/c;", "()Lhb4/c;", "c", "Ler/a;", "a", "()Ler/a;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Error(hb4.c cVar, er.a<i0> aVar) {
                super(aVar, null);
                this.errorVMS = cVar;
                this.onBackClick = aVar;
            }

            @Override // be4.d.a
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
                return fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.onBackClick, error.onBackClick);
            }

            public int hashCode() {
                return (this.errorVMS.hashCode() * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        /* JADX INFO: renamed from: be4.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lbe4/d$a$b;", "Lbe4/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "a", "()Ler/a;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initial(er.a<i0> aVar) {
                super(aVar, null);
                this.onBackClick = aVar;
            }

            @Override // be4.d.a
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

        /* JADX INFO: renamed from: be4.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001e\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b(\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b\"\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lbe4/d$a$c;", "Lbe4/d$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "header", "Ln30/b;", "agreementDetails", "Lb30/a;", "parentData", "childData", "attachments", "Lh30/a;", "withdrawAgreementButton", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Ln30/b;Lb30/a;Lb30/a;Lb30/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li50/a;", "d", "()Li50/a;", "c", "Lmx/a;", "f", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "e", "Lb30/a;", "g", "()Lb30/a;", "h", "Lh30/a;", "()Lh30/a;", "i", "Ler/a;", "a", "()Ler/a;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends a {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f19017j = AccordionData.f16343b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData agreementDetails;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData parentData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData childData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData attachments;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData withdrawAgreementButton;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, CardListData cardListData, AccordionData accordionData, AccordionData accordionData2, AccordionData accordionData3, ButtonData buttonData, er.a<i0> aVar) {
                super(aVar, null);
                this.baseScaffoldData = baseScaffoldData;
                this.header = label;
                this.agreementDetails = cardListData;
                this.parentData = accordionData;
                this.childData = accordionData2;
                this.attachments = accordionData3;
                this.withdrawAgreementButton = buttonData;
                this.onBackClick = aVar;
            }

            @Override // be4.d.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getAgreementDetails() {
                return this.agreementDetails;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final AccordionData getAttachments() {
                return this.attachments;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final AccordionData getChildData() {
                return this.childData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.header, initialized.header) && fr.t.c(this.agreementDetails, initialized.agreementDetails) && fr.t.c(this.parentData, initialized.parentData) && fr.t.c(this.childData, initialized.childData) && fr.t.c(this.attachments, initialized.attachments) && fr.t.c(this.withdrawAgreementButton, initialized.withdrawAgreementButton) && fr.t.c(this.onBackClick, initialized.onBackClick);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final AccordionData getParentData() {
                return this.parentData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getWithdrawAgreementButton() {
                return this.withdrawAgreementButton;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.baseScaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.agreementDetails.hashCode()) * 31) + this.parentData.hashCode()) * 31) + this.childData.hashCode()) * 31;
                AccordionData accordionData = this.attachments;
                int iHashCode2 = (iHashCode + (accordionData == null ? 0 : accordionData.hashCode())) * 31;
                ButtonData buttonData = this.withdrawAgreementButton;
                return ((iHashCode2 + (buttonData != null ? buttonData.hashCode() : 0)) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", header=" + this.header + ", agreementDetails=" + this.agreementDetails + ", parentData=" + this.parentData + ", childData=" + this.childData + ", attachments=" + this.attachments + ", withdrawAgreementButton=" + this.withdrawAgreementButton + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        public /* synthetic */ a(er.a aVar, fr.k kVar) {
            this(aVar);
        }

        public er.a<i0> a() {
            return this.onBackClick;
        }

        private a(er.a<i0> aVar) {
            this.onBackClick = aVar;
        }
    }
}
