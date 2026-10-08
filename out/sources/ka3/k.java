package ka3;

import ia3.SummaryData;
import p071kotlin.Metadata;
import y93.TripDetailsEditableData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lka3/k;", "", "b", "c", "a", "Lka3/k$a;", "Lka3/k$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lka3/k$a;", "Lka3/k;", "Ly93/a;", "a", "()Ly93/a;", "detailsData", "b", "Lka3/k$a$a;", "Lka3/k$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends k {

        /* JADX INFO: renamed from: ka3.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lka3/k$a$a;", "Lka3/k$a;", "Ly93/a;", "a", "()Ly93/a;", "detailsData", "Lcb4/i;", "e", "()Lcb4/i;", "dialogVmsAdapter", "b", "c", "Lka3/k$a$a$a;", "Lka3/k$a$a$b;", "Lka3/k$a$a$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC2614a extends a {

            /* JADX INFO: renamed from: ka3.k$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lka3/k$a$a$a;", "Lka3/k$a$a;", "Ly93/a;", "detailsData", "Lcb4/i;", "dialogVmsAdapter", "<init>", "(Ly93/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly93/a;", "()Ly93/a;", "b", "Lcb4/i;", "e", "()Lcb4/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Delete implements InterfaceC2614a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final TripDetailsEditableData detailsData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVmsAdapter;

                public Delete(TripDetailsEditableData tripDetailsEditableData, cb4.i iVar) {
                    this.detailsData = tripDetailsEditableData;
                    this.dialogVmsAdapter = iVar;
                }

                @Override // ka3.k.a.InterfaceC2614a, ka3.k.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public TripDetailsEditableData getDetailsData() {
                    return this.detailsData;
                }

                @Override // ka3.k.a.InterfaceC2614a
                /* JADX INFO: renamed from: e, reason: from getter */
                public cb4.i getDialogVmsAdapter() {
                    return this.dialogVmsAdapter;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Delete)) {
                        return false;
                    }
                    Delete delete = (Delete) other;
                    return fr.t.c(this.detailsData, delete.detailsData) && fr.t.c(this.dialogVmsAdapter, delete.dialogVmsAdapter);
                }

                public int hashCode() {
                    return (this.detailsData.hashCode() * 31) + this.dialogVmsAdapter.hashCode();
                }

                public String toString() {
                    return "Delete(detailsData=" + this.detailsData + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ')';
                }
            }

            /* JADX INFO: renamed from: ka3.k$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lka3/k$a$a$b;", "Lka3/k$a$a;", "Ly93/a;", "detailsData", "Lcb4/i;", "dialogVmsAdapter", "<init>", "(Ly93/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly93/a;", "()Ly93/a;", "b", "Lcb4/i;", "e", "()Lcb4/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DeviceStoragePermission implements InterfaceC2614a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final TripDetailsEditableData detailsData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVmsAdapter;

                public DeviceStoragePermission(TripDetailsEditableData tripDetailsEditableData, cb4.i iVar) {
                    this.detailsData = tripDetailsEditableData;
                    this.dialogVmsAdapter = iVar;
                }

                @Override // ka3.k.a.InterfaceC2614a, ka3.k.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public TripDetailsEditableData getDetailsData() {
                    return this.detailsData;
                }

                @Override // ka3.k.a.InterfaceC2614a
                /* JADX INFO: renamed from: e, reason: from getter */
                public cb4.i getDialogVmsAdapter() {
                    return this.dialogVmsAdapter;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DeviceStoragePermission)) {
                        return false;
                    }
                    DeviceStoragePermission deviceStoragePermission = (DeviceStoragePermission) other;
                    return fr.t.c(this.detailsData, deviceStoragePermission.detailsData) && fr.t.c(this.dialogVmsAdapter, deviceStoragePermission.dialogVmsAdapter);
                }

                public int hashCode() {
                    return (this.detailsData.hashCode() * 31) + this.dialogVmsAdapter.hashCode();
                }

                public String toString() {
                    return "DeviceStoragePermission(detailsData=" + this.detailsData + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ')';
                }
            }

            /* JADX INFO: renamed from: ka3.k$a$a$c, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lka3/k$a$a$c;", "Lka3/k$a$a;", "Ly93/a;", "detailsData", "Lcb4/i;", "dialogVmsAdapter", "<init>", "(Ly93/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly93/a;", "()Ly93/a;", "b", "Lcb4/i;", "e", "()Lcb4/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TooManyTripStages implements InterfaceC2614a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final TripDetailsEditableData detailsData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVmsAdapter;

                public TooManyTripStages(TripDetailsEditableData tripDetailsEditableData, cb4.i iVar) {
                    this.detailsData = tripDetailsEditableData;
                    this.dialogVmsAdapter = iVar;
                }

                @Override // ka3.k.a.InterfaceC2614a, ka3.k.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public TripDetailsEditableData getDetailsData() {
                    return this.detailsData;
                }

                @Override // ka3.k.a.InterfaceC2614a
                /* JADX INFO: renamed from: e, reason: from getter */
                public cb4.i getDialogVmsAdapter() {
                    return this.dialogVmsAdapter;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TooManyTripStages)) {
                        return false;
                    }
                    TooManyTripStages tooManyTripStages = (TooManyTripStages) other;
                    return fr.t.c(this.detailsData, tooManyTripStages.detailsData) && fr.t.c(this.dialogVmsAdapter, tooManyTripStages.dialogVmsAdapter);
                }

                public int hashCode() {
                    return (this.detailsData.hashCode() * 31) + this.dialogVmsAdapter.hashCode();
                }

                public String toString() {
                    return "TooManyTripStages(detailsData=" + this.detailsData + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ')';
                }
            }

            @Override // ka3.k.a
            /* JADX INFO: renamed from: a */
            TripDetailsEditableData getDetailsData();

            /* JADX INFO: renamed from: e */
            cb4.i getDialogVmsAdapter();
        }

        /* JADX INFO: renamed from: ka3.k$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lka3/k$a$b;", "Lka3/k$a;", "Ly93/a;", "detailsData", "<init>", "(Ly93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly93/a;", "()Ly93/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedDetails implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TripDetailsEditableData detailsData;

            public InitializedDetails(TripDetailsEditableData tripDetailsEditableData) {
                this.detailsData = tripDetailsEditableData;
            }

            @Override // ka3.k.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public TripDetailsEditableData getDetailsData() {
                return this.detailsData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InitializedDetails) && fr.t.c(this.detailsData, ((InitializedDetails) other).detailsData);
            }

            public int hashCode() {
                return this.detailsData.hashCode();
            }

            public String toString() {
                return "InitializedDetails(detailsData=" + this.detailsData + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        TripDetailsEditableData getDetailsData();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0001\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lka3/k$c;", "Lka3/k;", "Lia3/a;", "c", "()Lia3/a;", "summaryData", "Lka3/k$b;", "b", "()Lka3/k$b;", "statementData", "Lmb3/a;", "d", "()Lmb3/a;", "tripContext", "a", "Lka3/k$c$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends k {

        /* JADX INFO: renamed from: ka3.k$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lka3/k$c$a;", "Lka3/k$c;", "Lia3/a;", "summaryData", "Lka3/k$b;", "statementData", "Lmb3/a;", "tripContext", "<init>", "(Lia3/a;Lka3/k$b;Lmb3/a;)V", "f", "(Lia3/a;Lka3/k$b;Lmb3/a;)Lka3/k$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lia3/a;", "c", "()Lia3/a;", "b", "Lka3/k$b;", "()Lka3/k$b;", "Lmb3/a;", "d", "()Lmb3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedSummary implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummaryData summaryData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StatementData statementData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final mb3.a tripContext;

            public InitializedSummary(SummaryData summaryData, StatementData statementData, mb3.a aVar) {
                this.summaryData = summaryData;
                this.statementData = statementData;
                this.tripContext = aVar;
            }

            public static /* synthetic */ InitializedSummary g(InitializedSummary initializedSummary, SummaryData summaryData, StatementData statementData, mb3.a aVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    summaryData = initializedSummary.summaryData;
                }
                if ((i15 & 2) != 0) {
                    statementData = initializedSummary.statementData;
                }
                if ((i15 & 4) != 0) {
                    aVar = initializedSummary.tripContext;
                }
                return initializedSummary.f(summaryData, statementData, aVar);
            }

            @Override // ka3.k.c
            /* JADX INFO: renamed from: b, reason: from getter */
            public StatementData getStatementData() {
                return this.statementData;
            }

            @Override // ka3.k.c
            /* JADX INFO: renamed from: c, reason: from getter */
            public SummaryData getSummaryData() {
                return this.summaryData;
            }

            @Override // ka3.k.c
            /* JADX INFO: renamed from: d, reason: from getter */
            public mb3.a getTripContext() {
                return this.tripContext;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializedSummary)) {
                    return false;
                }
                InitializedSummary initializedSummary = (InitializedSummary) other;
                return fr.t.c(this.summaryData, initializedSummary.summaryData) && fr.t.c(this.statementData, initializedSummary.statementData) && fr.t.c(this.tripContext, initializedSummary.tripContext);
            }

            public final InitializedSummary f(SummaryData summaryData, StatementData statementData, mb3.a tripContext) {
                return new InitializedSummary(summaryData, statementData, tripContext);
            }

            public int hashCode() {
                return (((this.summaryData.hashCode() * 31) + this.statementData.hashCode()) * 31) + this.tripContext.hashCode();
            }

            public String toString() {
                return "InitializedSummary(summaryData=" + this.summaryData + ", statementData=" + this.statementData + ", tripContext=" + this.tripContext + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        StatementData getStatementData();

        /* JADX INFO: renamed from: c */
        SummaryData getSummaryData();

        /* JADX INFO: renamed from: d */
        mb3.a getTripContext();
    }

    /* JADX INFO: renamed from: ka3.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lka3/k$b;", "", "Lka3/k$b$a;", "statementState", "", "scrollTo", "<init>", "(Lka3/k$b$a;Z)V", "a", "(Lka3/k$b$a;Z)Lka3/k$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lka3/k$b$a;", "d", "()Lka3/k$b$a;", "b", "Z", "c", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a statementState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollTo;

        /* JADX INFO: renamed from: ka3.k$b$a */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lka3/k$b$a;", "", "c", "a", "b", "Lka3/k$b$a$a;", "Lka3/k$b$a$b;", "Lka3/k$b$a$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: ka3.k$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lka3/k$b$a$a;", "Lka3/k$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C2616a implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C2616a f109448a = new C2616a();

                private C2616a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C2616a);
                }

                public int hashCode() {
                    return 1533521484;
                }

                public String toString() {
                    return "Checked";
                }
            }

            /* JADX INFO: renamed from: ka3.k$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lka3/k$b$a$b;", "Lka3/k$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C2617b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C2617b f109449a = new C2617b();

                private C2617b() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C2617b);
                }

                public int hashCode() {
                    return -1234233875;
                }

                public String toString() {
                    return "Error";
                }
            }

            /* JADX INFO: renamed from: ka3.k$b$a$c */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lka3/k$b$a$c;", "Lka3/k$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class c implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f109450a = new c();

                private c() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                public int hashCode() {
                    return -1699570605;
                }

                public String toString() {
                    return "Unchecked";
                }
            }
        }

        public StatementData(a aVar, boolean z15) {
            this.statementState = aVar;
            this.scrollTo = z15;
        }

        public static /* synthetic */ StatementData b(StatementData statementData, a aVar, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = statementData.statementState;
            }
            if ((i15 & 2) != 0) {
                z15 = statementData.scrollTo;
            }
            return statementData.a(aVar, z15);
        }

        public final StatementData a(a statementState, boolean scrollTo) {
            return new StatementData(statementState, scrollTo);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getScrollTo() {
            return this.scrollTo;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a getStatementState() {
            return this.statementState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatementData)) {
                return false;
            }
            StatementData statementData = (StatementData) other;
            return fr.t.c(this.statementState, statementData.statementState) && this.scrollTo == statementData.scrollTo;
        }

        public int hashCode() {
            return (this.statementState.hashCode() * 31) + Boolean.hashCode(this.scrollTo);
        }

        public String toString() {
            return "StatementData(statementState=" + this.statementState + ", scrollTo=" + this.scrollTo + ')';
        }

        public /* synthetic */ StatementData(a aVar, boolean z15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? a.c.f109450a : aVar, (i15 & 2) != 0 ? false : z15);
        }
    }
}
