package h33;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lh33/d;", "Ll00/e;", "Lh33/d$a;", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lh33/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "b", "Lh33/d$a$a;", "Lh33/d$a$b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h33.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b\"\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104¨\u00065"}, d2 = {"Lh33/d$a$a;", "Lh33/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lcb4/i;", "dialogVMSAdapter", "Lh30/a;", "nextButtonData", "Lmx/a;", "headline", "headlineDescription", "Lw30/a;", "anonymousReportCheckBoxData", "Li33/a;", "screenContent", "<init>", "(Ler/a;Li50/a;Lcb4/i;Lh30/a;Lmx/a;Lmx/a;Lw30/a;Li33/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "c", "()Li50/a;", "Lcb4/i;", "d", "()Lcb4/i;", "Lh30/a;", "g", "()Lh30/a;", "e", "Lmx/a;", "()Lmx/a;", "f", "Lw30/a;", "()Lw30/a;", "h", "Li33/a;", "()Li33/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headline;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headlineDescription;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData anonymousReportCheckBoxData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final i33.a screenContent;

            public Content(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, cb4.i iVar, ButtonData buttonData, Label label, Label label2, CheckBoxSingleData checkBoxSingleData, i33.a aVar2) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.dialogVMSAdapter = iVar;
                this.nextButtonData = buttonData;
                this.headline = label;
                this.headlineDescription = label2;
                this.anonymousReportCheckBoxData = checkBoxSingleData;
                this.screenContent = aVar2;
            }

            @Override // h33.d.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CheckBoxSingleData getAnonymousReportCheckBoxData() {
                return this.anonymousReportCheckBoxData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getHeadline() {
                return this.headline;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return fr.t.c(this.onBack, content.onBack) && fr.t.c(this.baseScaffoldData, content.baseScaffoldData) && fr.t.c(this.dialogVMSAdapter, content.dialogVMSAdapter) && fr.t.c(this.nextButtonData, content.nextButtonData) && fr.t.c(this.headline, content.headline) && fr.t.c(this.headlineDescription, content.headlineDescription) && fr.t.c(this.anonymousReportCheckBoxData, content.anonymousReportCheckBoxData) && fr.t.c(this.screenContent, content.screenContent);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getHeadlineDescription() {
                return this.headlineDescription;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final i33.a getScreenContent() {
                return this.screenContent;
            }

            public int hashCode() {
                int iHashCode = ((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return ((((((((((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.nextButtonData.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.headlineDescription.hashCode()) * 31) + this.anonymousReportCheckBoxData.hashCode()) * 31) + this.screenContent.hashCode();
            }

            public String toString() {
                return "Content(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", nextButtonData=" + this.nextButtonData + ", headline=" + this.headline + ", headlineDescription=" + this.headlineDescription + ", anonymousReportCheckBoxData=" + this.anonymousReportCheckBoxData + ", screenContent=" + this.screenContent + ')';
            }
        }

        /* JADX INFO: renamed from: h33.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh33/d$a$b;", "Lh33/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            public Initial(er.a<oq.i0> aVar) {
                this.onBack = aVar;
            }

            @Override // h33.d.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && fr.t.c(this.onBack, ((Initial) other).onBack);
            }

            public int hashCode() {
                return this.onBack.hashCode();
            }

            public String toString() {
                return "Initial(onBack=" + this.onBack + ')';
            }
        }

        er.a<oq.i0> a();
    }
}
