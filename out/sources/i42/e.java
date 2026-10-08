package i42;

import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import ja.n0;
import mx.Label;
import p071kotlin.Metadata;
import v60.PaymentStatusCardData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Li42/e;", "Ll00/e;", "Li42/e$a;", "Lmu/g;", "Lja/n0;", "Lv60/a;", "U2", "()Lmu/g;", "pendingPaymentsPagingData", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Li42/e$a;", "", "a", "b", "Li42/e$a$a;", "Li42/e$a$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: i42.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li42/e$a$a;", "Li42/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2103a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2103a f89162a = new C2103a();

            private C2103a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2103a);
            }

            public int hashCode() {
                return -897194510;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: i42.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"Li42/e$a$b;", "Li42/e$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lh70/a;", "shortcutsLayoutData", "Lmx/a;", "paymentsListTitle", "Lk42/a;", "paymentsListContentData", "<init>", "(Li50/a;Lo40/a;Lh70/a;Lmx/a;Lk42/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "()Lo40/a;", "c", "Lh70/a;", "e", "()Lh70/a;", "d", "Lmx/a;", "()Lmx/a;", "Lk42/a;", "()Lk42/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShortcutsLayoutData shortcutsLayoutData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentsListTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final k42.a paymentsListContentData;

            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, ShortcutsLayoutData shortcutsLayoutData, Label label, k42.a aVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.shortcutsLayoutData = shortcutsLayoutData;
                this.paymentsListTitle = label;
                this.paymentsListContentData = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final k42.a getPaymentsListContentData() {
                return this.paymentsListContentData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getPaymentsListTitle() {
                return this.paymentsListTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ShortcutsLayoutData getShortcutsLayoutData() {
                return this.shortcutsLayoutData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.shortcutsLayoutData, initialized.shortcutsLayoutData) && fr.t.c(this.paymentsListTitle, initialized.paymentsListTitle) && fr.t.c(this.paymentsListContentData, initialized.paymentsListContentData);
            }

            public int hashCode() {
                return (((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.shortcutsLayoutData.hashCode()) * 31) + this.paymentsListTitle.hashCode()) * 31) + this.paymentsListContentData.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", shortcutsLayoutData=" + this.shortcutsLayoutData + ", paymentsListTitle=" + this.paymentsListTitle + ", paymentsListContentData=" + this.paymentsListContentData + ')';
            }
        }
    }

    mu.g<n0<PaymentStatusCardData>> U2();
}
