package yy1;

import p071kotlin.Metadata;
import yi0.CitizenElectoralData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyy1/b;", "", "a", "b", "Lyy1/b$a;", "Lyy1/b$b;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyy1/b$a;", "Lyy1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f230670a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 271980529;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: yy1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyy1/b$b;", "Lyy1/b;", "b", "a", "Lyy1/b$b$a;", "Lyy1/b$b$b;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC6199b extends b {

        /* JADX INFO: renamed from: yy1.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lyy1/b$b$a;", "Lyy1/b$b;", "Lyi0/c;", "citizenElectoralData", "", "isBottomSheetVisible", "<init>", "(Lyi0/c;Z)V", "a", "(Lyi0/c;Z)Lyy1/b$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lyi0/c;", "c", "()Lyi0/c;", "b", "Z", "d", "()Z", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displayed implements InterfaceC6199b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CitizenElectoralData citizenElectoralData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isBottomSheetVisible;

            public Displayed(CitizenElectoralData citizenElectoralData, boolean z15) {
                this.citizenElectoralData = citizenElectoralData;
                this.isBottomSheetVisible = z15;
            }

            public static /* synthetic */ Displayed b(Displayed displayed, CitizenElectoralData citizenElectoralData, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    citizenElectoralData = displayed.citizenElectoralData;
                }
                if ((i15 & 2) != 0) {
                    z15 = displayed.isBottomSheetVisible;
                }
                return displayed.a(citizenElectoralData, z15);
            }

            public final Displayed a(CitizenElectoralData citizenElectoralData, boolean isBottomSheetVisible) {
                return new Displayed(citizenElectoralData, isBottomSheetVisible);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CitizenElectoralData getCitizenElectoralData() {
                return this.citizenElectoralData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsBottomSheetVisible() {
                return this.isBottomSheetVisible;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displayed)) {
                    return false;
                }
                Displayed displayed = (Displayed) other;
                return fr.t.c(this.citizenElectoralData, displayed.citizenElectoralData) && this.isBottomSheetVisible == displayed.isBottomSheetVisible;
            }

            public int hashCode() {
                return (this.citizenElectoralData.hashCode() * 31) + Boolean.hashCode(this.isBottomSheetVisible);
            }

            public String toString() {
                return "Displayed(citizenElectoralData=" + this.citizenElectoralData + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ')';
            }
        }

        /* JADX INFO: renamed from: yy1.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyy1/b$b$b;", "Lyy1/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6200b implements InterfaceC6199b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6200b f230673a = new C6200b();

            private C6200b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6200b);
            }

            public int hashCode() {
                return -129975567;
            }

            public String toString() {
                return "NoDataAvailable";
            }
        }
    }
}
