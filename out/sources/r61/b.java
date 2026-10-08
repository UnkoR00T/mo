package r61;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr61/b;", "", "a", "b", "Lr61/b$a;", "Lr61/b$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr61/b$a;", "Lr61/b;", "b", "a", "Lr61/b$a$a;", "Lr61/b$a$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends b {

        /* JADX INFO: renamed from: r61.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr61/b$a$a;", "Lr61/b$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: r61.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr61/b$a$b;", "Lr61/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4382b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4382b f171995a = new C4382b();

            private C4382b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4382b);
            }

            public int hashCode() {
                return 1370885639;
            }

            public String toString() {
                return "Presentation";
            }
        }
    }

    /* JADX INFO: renamed from: r61.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lr61/b$b;", "Lr61/b;", "Lr61/b$b$c;", "stateData", "<init>", "(Lr61/b$b$c;)V", "a", "Lr61/b$b$c;", "getStateData", "()Lr61/b$b$c;", "b", "c", "Lr61/b$b$a;", "Lr61/b$b$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC4383b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData stateData;

        /* JADX INFO: renamed from: r61.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr61/b$b$a;", "Lr61/b$b;", "Lr61/b$b$c;", "stateData", "Lhb4/c;", "errorVMS", "<init>", "(Lr61/b$b$c;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lr61/b$b$c;", "()Lr61/b$b$c;", "c", "Lhb4/c;", "a", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends AbstractC4383b {

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

        /* JADX INFO: renamed from: r61.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lr61/b$b$b;", "Lr61/b$b;", "Lr61/b$b$c;", "stateData", "<init>", "(Lr61/b$b$c;)V", "a", "(Lr61/b$b$c;)Lr61/b$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lr61/b$b$c;", "()Lr61/b$b$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presentation extends AbstractC4383b {

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

        public /* synthetic */ AbstractC4383b(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        private AbstractC4383b(StateData stateData) {
            this.stateData = stateData;
        }

        /* JADX INFO: renamed from: r61.b$b$c, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lr61/b$b$c;", "", "Lr61/b$b$c$a;", "glassesData", "faceCoverData", "Lg30/v;", "bottomSheetValue", "Ls61/a;", "bottomSheetData", "<init>", "(Lr61/b$b$c$a;Lr61/b$b$c$a;Lg30/v;Ls61/a;)V", "a", "(Lr61/b$b$c$a;Lr61/b$b$c$a;Lg30/v;Ls61/a;)Lr61/b$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr61/b$b$c$a;", "f", "()Lr61/b$b$c$a;", "b", "e", "c", "Lg30/v;", "d", "()Lg30/v;", "Ls61/a;", "()Ls61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilesData glassesData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilesData faceCoverData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final g30.v bottomSheetValue;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final s61.a bottomSheetData;

            /* JADX INFO: renamed from: r61.b$b$c$a, reason: from toString */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lr61/b$b$c$a;", "", "", "Lwx/i;", "attachments", "Ln40/i;", "pickerFiles", "", "showValidationError", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "a", "(Ljava/util/List;Ljava/util/List;Z)Lr61/b$b$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "Z", "e", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class FilesData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<wx.i> attachments;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<n40.i> pickerFiles;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean showValidationError;

                /* JADX WARN: Multi-variable type inference failed */
                public FilesData(List<? extends wx.i> list, List<? extends n40.i> list2, boolean z15) {
                    this.attachments = list;
                    this.pickerFiles = list2;
                    this.showValidationError = z15;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ FilesData b(FilesData filesData, List list, List list2, boolean z15, int i15, Object obj) {
                    if ((i15 & 1) != 0) {
                        list = filesData.attachments;
                    }
                    if ((i15 & 2) != 0) {
                        list2 = filesData.pickerFiles;
                    }
                    if ((i15 & 4) != 0) {
                        z15 = filesData.showValidationError;
                    }
                    return filesData.a(list, list2, z15);
                }

                public final FilesData a(List<? extends wx.i> attachments, List<? extends n40.i> pickerFiles, boolean showValidationError) {
                    return new FilesData(attachments, pickerFiles, showValidationError);
                }

                public final List<wx.i> c() {
                    return this.attachments;
                }

                public final List<n40.i> d() {
                    return this.pickerFiles;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final boolean getShowValidationError() {
                    return this.showValidationError;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FilesData)) {
                        return false;
                    }
                    FilesData filesData = (FilesData) other;
                    return fr.t.c(this.attachments, filesData.attachments) && fr.t.c(this.pickerFiles, filesData.pickerFiles) && this.showValidationError == filesData.showValidationError;
                }

                public int hashCode() {
                    return (((this.attachments.hashCode() * 31) + this.pickerFiles.hashCode()) * 31) + Boolean.hashCode(this.showValidationError);
                }

                public String toString() {
                    return "FilesData(attachments=" + this.attachments + ", pickerFiles=" + this.pickerFiles + ", showValidationError=" + this.showValidationError + ')';
                }
            }

            public StateData(FilesData filesData, FilesData filesData2, g30.v vVar, s61.a aVar) {
                this.glassesData = filesData;
                this.faceCoverData = filesData2;
                this.bottomSheetValue = vVar;
                this.bottomSheetData = aVar;
            }

            public static /* synthetic */ StateData b(StateData stateData, FilesData filesData, FilesData filesData2, g30.v vVar, s61.a aVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    filesData = stateData.glassesData;
                }
                if ((i15 & 2) != 0) {
                    filesData2 = stateData.faceCoverData;
                }
                if ((i15 & 4) != 0) {
                    vVar = stateData.bottomSheetValue;
                }
                if ((i15 & 8) != 0) {
                    aVar = stateData.bottomSheetData;
                }
                return stateData.a(filesData, filesData2, vVar, aVar);
            }

            public final StateData a(FilesData glassesData, FilesData faceCoverData, g30.v bottomSheetValue, s61.a bottomSheetData) {
                return new StateData(glassesData, faceCoverData, bottomSheetValue, bottomSheetData);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final s61.a getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final g30.v getBottomSheetValue() {
                return this.bottomSheetValue;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final FilesData getFaceCoverData() {
                return this.faceCoverData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateData)) {
                    return false;
                }
                StateData stateData = (StateData) other;
                return fr.t.c(this.glassesData, stateData.glassesData) && fr.t.c(this.faceCoverData, stateData.faceCoverData) && this.bottomSheetValue == stateData.bottomSheetValue && fr.t.c(this.bottomSheetData, stateData.bottomSheetData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final FilesData getGlassesData() {
                return this.glassesData;
            }

            public int hashCode() {
                FilesData filesData = this.glassesData;
                int iHashCode = (filesData == null ? 0 : filesData.hashCode()) * 31;
                FilesData filesData2 = this.faceCoverData;
                int iHashCode2 = (((iHashCode + (filesData2 == null ? 0 : filesData2.hashCode())) * 31) + this.bottomSheetValue.hashCode()) * 31;
                s61.a aVar = this.bottomSheetData;
                return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
            }

            public String toString() {
                return "StateData(glassesData=" + this.glassesData + ", faceCoverData=" + this.faceCoverData + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetData=" + this.bottomSheetData + ')';
            }

            public /* synthetic */ StateData(FilesData filesData, FilesData filesData2, g30.v vVar, s61.a aVar, int i15, fr.k kVar) {
                this(filesData, filesData2, (i15 & 4) != 0 ? g30.v.HIDDEN : vVar, (i15 & 8) != 0 ? null : aVar);
            }
        }
    }
}
