package vr1;

import er.l;
import fr.k;
import fr.t;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lvr1/d;", "", "<init>", "()V", "a", "b", "Lvr1/d$a;", "Lvr1/d$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: vr1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\rR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvr1/d$a;", "Lvr1/d;", "", "", "notificationListHeaders", "documentDate", "Lkotlin/Function1;", "Lvr1/a;", "Loq/i0;", "openDatePickerDialog", "<init>", "(Ljava/util/List;Ljava/lang/String;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocalDocumentNotificationConfig extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> notificationListHeaders;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<a, i0> openDatePickerDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public LocalDocumentNotificationConfig(List<String> list, String str, l<? super a, i0> lVar) {
            super(null);
            this.notificationListHeaders = list;
            this.documentDate = str;
            this.openDatePickerDialog = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentDate() {
            return this.documentDate;
        }

        public final List<String> b() {
            return this.notificationListHeaders;
        }

        public final l<a, i0> c() {
            return this.openDatePickerDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalDocumentNotificationConfig)) {
                return false;
            }
            LocalDocumentNotificationConfig localDocumentNotificationConfig = (LocalDocumentNotificationConfig) other;
            return t.c(this.notificationListHeaders, localDocumentNotificationConfig.notificationListHeaders) && t.c(this.documentDate, localDocumentNotificationConfig.documentDate) && t.c(this.openDatePickerDialog, localDocumentNotificationConfig.openDatePickerDialog);
        }

        public int hashCode() {
            return (((this.notificationListHeaders.hashCode() * 31) + this.documentDate.hashCode()) * 31) + this.openDatePickerDialog.hashCode();
        }

        public String toString() {
            return "LocalDocumentNotificationConfig(notificationListHeaders=" + this.notificationListHeaders + ", documentDate=" + this.documentDate + ", openDatePickerDialog=" + this.openDatePickerDialog + ')';
        }
    }

    /* JADX INFO: renamed from: vr1.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010\u0010R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Lvr1/d$b;", "Lvr1/d;", "", "", "notificationListHeaders", "Lv50/c$g;", "registerNo", "insuranceDate", "technicalExaminationDate", "Lkotlin/Function1;", "Lvr1/a;", "Loq/i0;", "openDatePickerDialog", "<init>", "(Ljava/util/List;Lv50/c$g;Ljava/lang/String;Ljava/lang/String;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lv50/c$g;", "d", "()Lv50/c$g;", "c", "Ljava/lang/String;", "e", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocalVehicleNotificationConfig extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> notificationListHeaders;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text registerNo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String insuranceDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String technicalExaminationDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<a, i0> openDatePickerDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public LocalVehicleNotificationConfig(List<String> list, v50.c.Text text, String str, String str2, l<? super a, i0> lVar) {
            super(null);
            this.notificationListHeaders = list;
            this.registerNo = text;
            this.insuranceDate = str;
            this.technicalExaminationDate = str2;
            this.openDatePickerDialog = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInsuranceDate() {
            return this.insuranceDate;
        }

        public final List<String> b() {
            return this.notificationListHeaders;
        }

        public final l<a, i0> c() {
            return this.openDatePickerDialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v50.c.Text getRegisterNo() {
            return this.registerNo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTechnicalExaminationDate() {
            return this.technicalExaminationDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalVehicleNotificationConfig)) {
                return false;
            }
            LocalVehicleNotificationConfig localVehicleNotificationConfig = (LocalVehicleNotificationConfig) other;
            return t.c(this.notificationListHeaders, localVehicleNotificationConfig.notificationListHeaders) && t.c(this.registerNo, localVehicleNotificationConfig.registerNo) && t.c(this.insuranceDate, localVehicleNotificationConfig.insuranceDate) && t.c(this.technicalExaminationDate, localVehicleNotificationConfig.technicalExaminationDate) && t.c(this.openDatePickerDialog, localVehicleNotificationConfig.openDatePickerDialog);
        }

        public int hashCode() {
            return (((((((this.notificationListHeaders.hashCode() * 31) + this.registerNo.hashCode()) * 31) + this.insuranceDate.hashCode()) * 31) + this.technicalExaminationDate.hashCode()) * 31) + this.openDatePickerDialog.hashCode();
        }

        public String toString() {
            return "LocalVehicleNotificationConfig(notificationListHeaders=" + this.notificationListHeaders + ", registerNo=" + this.registerNo + ", insuranceDate=" + this.insuranceDate + ", technicalExaminationDate=" + this.technicalExaminationDate + ", openDatePickerDialog=" + this.openDatePickerDialog + ')';
        }
    }

    public /* synthetic */ d(k kVar) {
        this();
    }

    private d() {
    }
}
