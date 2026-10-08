package ys2;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lys2/e;", "Ll00/e;", "Lys2/e$a;", "a", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lys2/e$a;", "", "a", "b", "Lys2/e$a$a;", "Lys2/e$a$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ys2.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lys2/e$a$a;", "Lys2/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6153a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6153a f229232a = new C6153a();

            private C6153a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6153a);
            }

            public int hashCode() {
                return -535431521;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: ys2.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Lys2/e$a$b;", "Lys2/e$a;", "Lmx/a;", "institutionNameLabel", "verifiedAtDateLabel", "Ln30/b;", "additionalData", "Lb30/a;", "timelineAccordionData", "Li50/a;", "scaffoldData", "<init>", "(Lmx/a;Lmx/a;Ln30/b;Lb30/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "e", "c", "Ln30/b;", "()Ln30/b;", "d", "Lb30/a;", "()Lb30/a;", "Li50/a;", "()Li50/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f229233f = BaseScaffoldData.f89350g | AccordionData.f16343b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label institutionNameLabel;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label verifiedAtDateLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData additionalData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData timelineAccordionData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(Label label, Label label2, CardListData cardListData, AccordionData accordionData, BaseScaffoldData baseScaffoldData) {
                this.institutionNameLabel = label;
                this.verifiedAtDateLabel = label2;
                this.additionalData = cardListData;
                this.timelineAccordionData = accordionData;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CardListData getAdditionalData() {
                return this.additionalData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getInstitutionNameLabel() {
                return this.institutionNameLabel;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final AccordionData getTimelineAccordionData() {
                return this.timelineAccordionData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getVerifiedAtDateLabel() {
                return this.verifiedAtDateLabel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.institutionNameLabel, initialized.institutionNameLabel) && t.c(this.verifiedAtDateLabel, initialized.verifiedAtDateLabel) && t.c(this.additionalData, initialized.additionalData) && t.c(this.timelineAccordionData, initialized.timelineAccordionData) && t.c(this.scaffoldData, initialized.scaffoldData);
            }

            public int hashCode() {
                Label label = this.institutionNameLabel;
                int iHashCode = (((((label == null ? 0 : label.hashCode()) * 31) + this.verifiedAtDateLabel.hashCode()) * 31) + this.additionalData.hashCode()) * 31;
                AccordionData accordionData = this.timelineAccordionData;
                return ((iHashCode + (accordionData != null ? accordionData.hashCode() : 0)) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(institutionNameLabel=" + this.institutionNameLabel + ", verifiedAtDateLabel=" + this.verifiedAtDateLabel + ", additionalData=" + this.additionalData + ", timelineAccordionData=" + this.timelineAccordionData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }
}
