package n83;

import a14.b0;
import dx.i;
import fr.t;
import fu.r;
import jx.g;
import oo0.BEReportIssueReason;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x83.VehicleCardInitializedData;
import x83.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 ¨\u0006!"}, d2 = {"Ln83/a;", "", "Ln83/a$a;", "Loq/i0;", "La14/b0;", "sendMailIntentUseCase", "Ljx/d;", "deviceInfo", "Ljx/g;", "systemInfo", "Ljx/a;", "appInfo", "Lmx/c;", "labelProvider", "<init>", "(La14/b0;Ljx/d;Ljx/g;Ljx/a;Lmx/c;)V", "Lx83/f;", "", "e", "(Lx83/f;)Ljava/lang/String;", "params", "Ldx/i;", "Ldx/b;", "d", "(Ln83/a$a;Ltq/e;)Ljava/lang/Object;", "a", "La14/b0;", "b", "Ljx/d;", "c", "Ljx/g;", "Ljx/a;", "Lmx/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 sendMailIntentUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g systemInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jx.a appInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n83.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ln83/a$a;", "Lgz/b$a;", "", "t", "()Ljava/lang/String;", "topic", "k", "emailAddress", "a", "b", "Ln83/a$a$a;", "Ln83/a$a$b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC3303a extends gz.b.a {

        /* JADX INFO: renamed from: n83.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Ln83/a$a$a;", "Ln83/a$a;", "", "topic", "description", "emailAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "t", "b", "c", "k", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Generic implements InterfaceC3303a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String topic;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            public Generic(String str, String str2, String str3) {
                this.topic = str;
                this.description = str2;
                this.emailAddress = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public String getDescription() {
                return this.description;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) other;
                return t.c(this.topic, generic.topic) && t.c(this.description, generic.description) && t.c(this.emailAddress, generic.emailAddress);
            }

            public int hashCode() {
                return (((this.topic.hashCode() * 31) + this.description.hashCode()) * 31) + this.emailAddress.hashCode();
            }

            @Override // n83.a.InterfaceC3303a
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getEmailAddress() {
                return this.emailAddress;
            }

            @Override // n83.a.InterfaceC3303a
            /* JADX INFO: renamed from: t, reason: from getter */
            public String getTopic() {
                return this.topic;
            }

            public String toString() {
                return "Generic(topic=" + this.topic + ", description=" + this.description + ", emailAddress=" + this.emailAddress + ')';
            }
        }

        /* JADX INFO: renamed from: n83.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Ln83/a$a$b;", "Ln83/a$a;", "Lx83/e;", "vehicleData", "", "topic", "description", "emailAddress", "<init>", "(Lx83/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx83/e;", "b", "()Lx83/e;", "Ljava/lang/String;", "t", "c", "d", "k", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class VehicleCard implements InterfaceC3303a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final VehicleCardInitializedData vehicleData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String topic;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            public VehicleCard(VehicleCardInitializedData vehicleCardInitializedData, String str, String str2, String str3) {
                this.vehicleData = vehicleCardInitializedData;
                this.topic = str;
                this.description = str2;
                this.emailAddress = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final VehicleCardInitializedData getVehicleData() {
                return this.vehicleData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VehicleCard)) {
                    return false;
                }
                VehicleCard vehicleCard = (VehicleCard) other;
                return t.c(this.vehicleData, vehicleCard.vehicleData) && t.c(this.topic, vehicleCard.topic) && t.c(this.description, vehicleCard.description) && t.c(this.emailAddress, vehicleCard.emailAddress);
            }

            public int hashCode() {
                return (((((this.vehicleData.hashCode() * 31) + this.topic.hashCode()) * 31) + this.description.hashCode()) * 31) + this.emailAddress.hashCode();
            }

            @Override // n83.a.InterfaceC3303a
            /* JADX INFO: renamed from: k, reason: from getter */
            public String getEmailAddress() {
                return this.emailAddress;
            }

            @Override // n83.a.InterfaceC3303a
            /* JADX INFO: renamed from: t, reason: from getter */
            public String getTopic() {
                return this.topic;
            }

            public String toString() {
                return "VehicleCard(vehicleData=" + this.vehicleData + ", topic=" + this.topic + ", description=" + this.description + ", emailAddress=" + this.emailAddress + ')';
            }
        }

        /* JADX INFO: renamed from: k */
        String getEmailAddress();

        /* JADX INFO: renamed from: t */
        String getTopic();
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133570a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.COOWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133570a = iArr;
        }
    }

    public a(b0 b0Var, jx.d dVar, g gVar, jx.a aVar, mx.c cVar) {
        this.sendMailIntentUseCase = b0Var;
        this.deviceInfo = dVar;
        this.systemInfo = gVar;
        this.appInfo = aVar;
        this.labelProvider = cVar;
    }

    private final String e(f fVar) {
        int i15 = b.f133570a[fVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(l83.a.L0).getText();
        }
        if (i15 == 2) {
            return this.labelProvider.c(l83.a.E0).getText();
        }
        if (i15 == 3) {
            return "";
        }
        throw new p();
    }

    public Object d(InterfaceC3303a interfaceC3303a, tq.e<? super i<? extends dx.b, i0>> eVar) {
        String string;
        if (interfaceC3303a instanceof InterfaceC3303a.Generic) {
            string = this.labelProvider.e(l83.a.P, ((InterfaceC3303a.Generic) interfaceC3303a).getDescription(), this.appInfo.c(), this.deviceInfo.c(), this.deviceInfo.a(), this.systemInfo.c()).getText();
        } else {
            if (!(interfaceC3303a instanceof InterfaceC3303a.VehicleCard)) {
                throw new p();
            }
            StringBuilder sb5 = new StringBuilder();
            InterfaceC3303a.VehicleCard vehicleCard = (InterfaceC3303a.VehicleCard) interfaceC3303a;
            sb5.append(vehicleCard.getDescription());
            sb5.append(this.labelProvider.c(l83.a.R).getText());
            sb5.append(this.labelProvider.e(l83.a.S, vehicleCard.getVehicleData().f().c()).getText());
            sb5.append('\n');
            if (!r.t0(vehicleCard.getVehicleData().h().c())) {
                sb5.append(this.labelProvider.e(l83.a.N, vehicleCard.getVehicleData().h().c()).getText());
                sb5.append('\n');
            }
            sb5.append(this.labelProvider.e(l83.a.O, e(vehicleCard.getVehicleData().e().c())).getText());
            sb5.append('\n');
            BEReportIssueReason bEReportIssueReasonC = vehicleCard.getVehicleData().d().c();
            if (bEReportIssueReasonC != null) {
                sb5.append(this.labelProvider.e(l83.a.M, bEReportIssueReasonC.getLabel()).getText());
                sb5.append('\n');
            }
            sb5.append(this.labelProvider.e(l83.a.Q, this.appInfo.c(), this.deviceInfo.c(), this.deviceInfo.a(), this.systemInfo.c()).getText());
            sb5.append('\n');
            string = sb5.toString();
        }
        return this.sendMailIntentUseCase.c(new b0.Params(string, interfaceC3303a.getEmailAddress(), interfaceC3303a.getTopic(), null, 8, null), eVar);
    }
}
