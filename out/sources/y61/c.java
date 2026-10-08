package y61;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ly61/c;", "", "a", "b", "Ly61/c$a;", "Ly61/c$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ly61/c$a;", "Ly61/c;", "b", "a", "Ly61/c$a$a;", "Ly61/c$a$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends c {

        /* JADX INFO: renamed from: y61.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly61/c$a$a;", "Ly61/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly61/c$a$b;", "Ly61/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f224441a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -714047144;
            }

            public String toString() {
                return "Presentation";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Ly61/c$b;", "Ly61/c;", "Ly61/c$b$c;", "stateData", "<init>", "(Ly61/c$b$c;)V", "a", "Ly61/c$b$c;", "getStateData", "()Ly61/c$b$c;", "b", "c", "Ly61/c$b$a;", "Ly61/c$b$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData stateData;

        /* JADX INFO: renamed from: y61.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly61/c$b$a;", "Ly61/c$b;", "Ly61/c$b$c;", "stateData", "Lhb4/c;", "errorVMS", "<init>", "(Ly61/c$b$c;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ly61/c$b$c;", "()Ly61/c$b$c;", "c", "Lhb4/c;", "a", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(StateData stateData, hb4.c cVar) {
                super(stateData, null);
                this.stateData = stateData;
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.stateData, error.stateData) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (this.stateData.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(stateData=" + this.stateData + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: y61.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly61/c$b$b;", "Ly61/c$b;", "Ly61/c$b$c;", "stateData", "<init>", "(Ly61/c$b$c;)V", "a", "(Ly61/c$b$c;)Ly61/c$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ly61/c$b$c;", "()Ly61/c$b$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presentation extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Presentation(StateData stateData) {
                super(stateData, null);
                this.stateData = stateData;
            }

            public final Presentation a(StateData stateData) {
                return new Presentation(stateData);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Presentation) && fr.t.c(this.stateData, ((Presentation) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "Presentation(stateData=" + this.stateData + ')';
            }
        }

        public /* synthetic */ b(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        private b(StateData stateData) {
            this.stateData = stateData;
        }

        /* JADX INFO: renamed from: y61.c$b$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jf\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Ly61/c$b$c;", "", "Lb71/b;", "attachmentType", "", "Lwx/i;", "attachments", "Ln40/i;", "pickerFiles", "Ly61/c$b$c$a;", "statementData", "Lg30/v;", "bottomSheetValue", "Lz61/a;", "bottomSheetData", "", "showValidationError", "<init>", "(Lb71/b;Ljava/util/List;Ljava/util/List;Ly61/c$b$c$a;Lg30/v;Lz61/a;Z)V", "a", "(Lb71/b;Ljava/util/List;Ljava/util/List;Ly61/c$b$c$a;Lg30/v;Lz61/a;Z)Ly61/c$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lb71/b;", "c", "()Lb71/b;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "g", "Ly61/c$b$c$a;", "i", "()Ly61/c$b$c$a;", "e", "Lg30/v;", "f", "()Lg30/v;", "Lz61/a;", "()Lz61/a;", "Z", "h", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b71.b attachmentType;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<wx.i> attachments;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n40.i> pickerFiles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final StatementData statementData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final g30.v bottomSheetValue;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final z61.a bottomSheetData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showValidationError;

            /* JADX INFO: renamed from: y61.c$b$c$a, reason: from toString */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Ly61/c$b$c$a;", "", "", "isChecked", "showValidationError", "<init>", "(ZZ)V", "a", "(ZZ)Ly61/c$b$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "c", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class StatementData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isChecked;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean showValidationError;

                public StatementData(boolean z15, boolean z16) {
                    this.isChecked = z15;
                    this.showValidationError = z16;
                }

                public static /* synthetic */ StatementData b(StatementData statementData, boolean z15, boolean z16, int i15, Object obj) {
                    if ((i15 & 1) != 0) {
                        z15 = statementData.isChecked;
                    }
                    if ((i15 & 2) != 0) {
                        z16 = statementData.showValidationError;
                    }
                    return statementData.a(z15, z16);
                }

                public final StatementData a(boolean isChecked, boolean showValidationError) {
                    return new StatementData(isChecked, showValidationError);
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final boolean getShowValidationError() {
                    return this.showValidationError;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final boolean getIsChecked() {
                    return this.isChecked;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StatementData)) {
                        return false;
                    }
                    StatementData statementData = (StatementData) other;
                    return this.isChecked == statementData.isChecked && this.showValidationError == statementData.showValidationError;
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.isChecked) * 31) + Boolean.hashCode(this.showValidationError);
                }

                public String toString() {
                    return "StatementData(isChecked=" + this.isChecked + ", showValidationError=" + this.showValidationError + ')';
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public StateData(b71.b bVar, List<? extends wx.i> list, List<? extends n40.i> list2, StatementData statementData, g30.v vVar, z61.a aVar, boolean z15) {
                this.attachmentType = bVar;
                this.attachments = list;
                this.pickerFiles = list2;
                this.statementData = statementData;
                this.bottomSheetValue = vVar;
                this.bottomSheetData = aVar;
                this.showValidationError = z15;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateData b(StateData stateData, b71.b bVar, List list, List list2, StatementData statementData, g30.v vVar, z61.a aVar, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = stateData.attachmentType;
                }
                if ((i15 & 2) != 0) {
                    list = stateData.attachments;
                }
                if ((i15 & 4) != 0) {
                    list2 = stateData.pickerFiles;
                }
                if ((i15 & 8) != 0) {
                    statementData = stateData.statementData;
                }
                if ((i15 & 16) != 0) {
                    vVar = stateData.bottomSheetValue;
                }
                if ((i15 & 32) != 0) {
                    aVar = stateData.bottomSheetData;
                }
                if ((i15 & 64) != 0) {
                    z15 = stateData.showValidationError;
                }
                z61.a aVar2 = aVar;
                boolean z16 = z15;
                g30.v vVar2 = vVar;
                List list3 = list2;
                return stateData.a(bVar, list, list3, statementData, vVar2, aVar2, z16);
            }

            public final StateData a(b71.b attachmentType, List<? extends wx.i> attachments, List<? extends n40.i> pickerFiles, StatementData statementData, g30.v bottomSheetValue, z61.a bottomSheetData, boolean showValidationError) {
                return new StateData(attachmentType, attachments, pickerFiles, statementData, bottomSheetValue, bottomSheetData, showValidationError);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final b71.b getAttachmentType() {
                return this.attachmentType;
            }

            public final List<wx.i> d() {
                return this.attachments;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final z61.a getBottomSheetData() {
                return this.bottomSheetData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateData)) {
                    return false;
                }
                StateData stateData = (StateData) other;
                return this.attachmentType == stateData.attachmentType && fr.t.c(this.attachments, stateData.attachments) && fr.t.c(this.pickerFiles, stateData.pickerFiles) && fr.t.c(this.statementData, stateData.statementData) && this.bottomSheetValue == stateData.bottomSheetValue && fr.t.c(this.bottomSheetData, stateData.bottomSheetData) && this.showValidationError == stateData.showValidationError;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final g30.v getBottomSheetValue() {
                return this.bottomSheetValue;
            }

            public final List<n40.i> g() {
                return this.pickerFiles;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getShowValidationError() {
                return this.showValidationError;
            }

            public int hashCode() {
                int iHashCode = ((((this.attachmentType.hashCode() * 31) + this.attachments.hashCode()) * 31) + this.pickerFiles.hashCode()) * 31;
                StatementData statementData = this.statementData;
                int iHashCode2 = (((iHashCode + (statementData == null ? 0 : statementData.hashCode())) * 31) + this.bottomSheetValue.hashCode()) * 31;
                z61.a aVar = this.bottomSheetData;
                return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.showValidationError);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final StatementData getStatementData() {
                return this.statementData;
            }

            public String toString() {
                return "StateData(attachmentType=" + this.attachmentType + ", attachments=" + this.attachments + ", pickerFiles=" + this.pickerFiles + ", statementData=" + this.statementData + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetData=" + this.bottomSheetData + ", showValidationError=" + this.showValidationError + ')';
            }

            public /* synthetic */ StateData(b71.b bVar, List list, List list2, StatementData statementData, g30.v vVar, z61.a aVar, boolean z15, int i15, fr.k kVar) {
                this(bVar, list, list2, statementData, (i15 & 16) != 0 ? g30.v.HIDDEN : vVar, (i15 & 32) != 0 ? null : aVar, z15);
            }
        }
    }
}
