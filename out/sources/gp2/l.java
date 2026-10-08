package gp2;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgp2/l;", "", "a", "b", "Lgp2/l$a;", "Lgp2/l$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgp2/l$a;", "Lgp2/l;", "b", "a", "Lgp2/l$a$a;", "Lgp2/l$a$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends l {

        /* JADX INFO: renamed from: gp2.l$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgp2/l$a$a;", "Lgp2/l$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgp2/l$a$b;", "Lgp2/l$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f76060a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -419427732;
            }

            public String toString() {
                return "Presentation";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lgp2/l$b;", "Lgp2/l;", "Lgp2/l$b$c;", "stateData", "<init>", "(Lgp2/l$b$c;)V", "a", "Lgp2/l$b$c;", "getStateData", "()Lgp2/l$b$c;", "b", "c", "Lgp2/l$b$a;", "Lgp2/l$b$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData stateData;

        /* JADX INFO: renamed from: gp2.l$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgp2/l$b$a;", "Lgp2/l$b;", "Lgp2/l$b$c;", "stateData", "Lhb4/c;", "errorVMS", "<init>", "(Lgp2/l$b$c;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lgp2/l$b$c;", "()Lgp2/l$b$c;", "c", "Lhb4/c;", "a", "()Lhb4/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: gp2.l$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgp2/l$b$b;", "Lgp2/l$b;", "Lgp2/l$b$c;", "stateData", "Ljp2/b;", "attachmentType", "<init>", "(Lgp2/l$b$c;Ljp2/b;)V", "a", "(Lgp2/l$b$c;Ljp2/b;)Lgp2/l$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lgp2/l$b$c;", "d", "()Lgp2/l$b$c;", "c", "Ljp2/b;", "()Ljp2/b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presentation extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final jp2.b attachmentType;

            public Presentation(StateData stateData, jp2.b bVar) {
                super(stateData, null);
                this.stateData = stateData;
                this.attachmentType = bVar;
            }

            public static /* synthetic */ Presentation b(Presentation presentation, StateData stateData, jp2.b bVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    stateData = presentation.stateData;
                }
                if ((i15 & 2) != 0) {
                    bVar = presentation.attachmentType;
                }
                return presentation.a(stateData, bVar);
            }

            public final Presentation a(StateData stateData, jp2.b attachmentType) {
                return new Presentation(stateData, attachmentType);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jp2.b getAttachmentType() {
                return this.attachmentType;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Presentation)) {
                    return false;
                }
                Presentation presentation = (Presentation) other;
                return fr.t.c(this.stateData, presentation.stateData) && this.attachmentType == presentation.attachmentType;
            }

            public int hashCode() {
                return (this.stateData.hashCode() * 31) + this.attachmentType.hashCode();
            }

            public String toString() {
                return "Presentation(stateData=" + this.stateData + ", attachmentType=" + this.attachmentType + ')';
            }
        }

        public /* synthetic */ b(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        private b(StateData stateData) {
            this.stateData = stateData;
        }

        /* JADX INFO: renamed from: gp2.l$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lgp2/l$b$c;", "", "", "Lwx/i;", "attachments", "Ln40/i;", "pickerFiles", "Lg30/v;", "bottomSheetValue", "Lhp2/a;", "bottomSheetData", "", "showValidationError", "<init>", "(Ljava/util/List;Ljava/util/List;Lg30/v;Lhp2/a;Z)V", "a", "(Ljava/util/List;Ljava/util/List;Lg30/v;Lhp2/a;Z)Lgp2/l$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "f", "Lg30/v;", "e", "()Lg30/v;", "d", "Lhp2/a;", "()Lhp2/a;", "Z", "g", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<wx.i> attachments;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n40.i> pickerFiles;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final g30.v bottomSheetValue;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final hp2.a bottomSheetData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showValidationError;

            /* JADX WARN: Multi-variable type inference failed */
            public StateData(List<? extends wx.i> list, List<? extends n40.i> list2, g30.v vVar, hp2.a aVar, boolean z15) {
                this.attachments = list;
                this.pickerFiles = list2;
                this.bottomSheetValue = vVar;
                this.bottomSheetData = aVar;
                this.showValidationError = z15;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateData b(StateData stateData, List list, List list2, g30.v vVar, hp2.a aVar, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    list = stateData.attachments;
                }
                if ((i15 & 2) != 0) {
                    list2 = stateData.pickerFiles;
                }
                if ((i15 & 4) != 0) {
                    vVar = stateData.bottomSheetValue;
                }
                if ((i15 & 8) != 0) {
                    aVar = stateData.bottomSheetData;
                }
                if ((i15 & 16) != 0) {
                    z15 = stateData.showValidationError;
                }
                boolean z16 = z15;
                g30.v vVar2 = vVar;
                return stateData.a(list, list2, vVar2, aVar, z16);
            }

            public final StateData a(List<? extends wx.i> attachments, List<? extends n40.i> pickerFiles, g30.v bottomSheetValue, hp2.a bottomSheetData, boolean showValidationError) {
                return new StateData(attachments, pickerFiles, bottomSheetValue, bottomSheetData, showValidationError);
            }

            public final List<wx.i> c() {
                return this.attachments;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hp2.a getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final g30.v getBottomSheetValue() {
                return this.bottomSheetValue;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateData)) {
                    return false;
                }
                StateData stateData = (StateData) other;
                return fr.t.c(this.attachments, stateData.attachments) && fr.t.c(this.pickerFiles, stateData.pickerFiles) && this.bottomSheetValue == stateData.bottomSheetValue && fr.t.c(this.bottomSheetData, stateData.bottomSheetData) && this.showValidationError == stateData.showValidationError;
            }

            public final List<n40.i> f() {
                return this.pickerFiles;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getShowValidationError() {
                return this.showValidationError;
            }

            public int hashCode() {
                int iHashCode = ((((this.attachments.hashCode() * 31) + this.pickerFiles.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31;
                hp2.a aVar = this.bottomSheetData;
                return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.showValidationError);
            }

            public String toString() {
                return "StateData(attachments=" + this.attachments + ", pickerFiles=" + this.pickerFiles + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetData=" + this.bottomSheetData + ", showValidationError=" + this.showValidationError + ')';
            }

            public /* synthetic */ StateData(List list, List list2, g30.v vVar, hp2.a aVar, boolean z15, int i15, fr.k kVar) {
                this(list, list2, (i15 & 4) != 0 ? g30.v.HIDDEN : vVar, (i15 & 8) != 0 ? null : aVar, z15);
            }
        }
    }
}
