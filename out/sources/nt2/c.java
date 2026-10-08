package nt2;

import p071kotlin.Metadata;
import ts0.Restriction;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lnt2/c;", "", "a", "b", "c", "Lnt2/c$a;", "Lnt2/c$b;", "Lnt2/c$c;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: nt2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnt2/c$a;", "Lnt2/c;", "Lcb4/i;", "dialog", "<init>", "(Lcb4/i;)V", "d", "(Lcb4/i;)Lnt2/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "b", "()Lcb4/i;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialog;

        public Initial(cb4.i iVar) {
            this.dialog = iVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final cb4.i getDialog() {
            return this.dialog;
        }

        public final Initial d(cb4.i dialog) {
            return new Initial(dialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.dialog, ((Initial) other).dialog);
        }

        public int hashCode() {
            cb4.i iVar = this.dialog;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public String toString() {
            return "Initial(dialog=" + this.dialog + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lnt2/c$b;", "Lnt2/c;", "Lts0/f;", "c", "()Lts0/f;", "restriction", "", "a", "()Z", "isRefreshing", "Lcb4/i;", "b", "()Lcb4/i;", "dialog", "Lnt2/c$b$a;", "Lnt2/c$b$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends c {

        /* JADX INFO: renamed from: nt2.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnt2/c$b$a;", "Lnt2/c$b;", "Lts0/f;", "restriction", "", "isRefreshing", "Lcb4/i;", "dialog", "<init>", "(Lts0/f;ZLcb4/i;)V", "d", "(Lts0/f;ZLcb4/i;)Lnt2/c$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lts0/f;", "c", "()Lts0/f;", "b", "Z", "()Z", "Lcb4/i;", "()Lcb4/i;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Restricted implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Restriction restriction;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRefreshing;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Restricted(Restriction restriction, boolean z15, cb4.i iVar) {
                this.restriction = restriction;
                this.isRefreshing = z15;
                this.dialog = iVar;
            }

            public static /* synthetic */ Restricted e(Restricted restricted, Restriction restriction, boolean z15, cb4.i iVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    restriction = restricted.restriction;
                }
                if ((i15 & 2) != 0) {
                    z15 = restricted.isRefreshing;
                }
                if ((i15 & 4) != 0) {
                    iVar = restricted.dialog;
                }
                return restricted.d(restriction, z15, iVar);
            }

            @Override // nt2.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getIsRefreshing() {
                return this.isRefreshing;
            }

            @Override // nt2.c.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public cb4.i getDialog() {
                return this.dialog;
            }

            @Override // nt2.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Restriction getRestriction() {
                return this.restriction;
            }

            public final Restricted d(Restriction restriction, boolean isRefreshing, cb4.i dialog) {
                return new Restricted(restriction, isRefreshing, dialog);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Restricted)) {
                    return false;
                }
                Restricted restricted = (Restricted) other;
                return fr.t.c(this.restriction, restricted.restriction) && this.isRefreshing == restricted.isRefreshing && fr.t.c(this.dialog, restricted.dialog);
            }

            public int hashCode() {
                int iHashCode = ((this.restriction.hashCode() * 31) + Boolean.hashCode(this.isRefreshing)) * 31;
                cb4.i iVar = this.dialog;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Restricted(restriction=" + this.restriction + ", isRefreshing=" + this.isRefreshing + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: nt2.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnt2/c$b$b;", "Lnt2/c$b;", "Lts0/f;", "restriction", "", "isRefreshing", "Lcb4/i;", "dialog", "<init>", "(Lts0/f;ZLcb4/i;)V", "d", "(Lts0/f;ZLcb4/i;)Lnt2/c$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lts0/f;", "c", "()Lts0/f;", "b", "Z", "()Z", "Lcb4/i;", "()Lcb4/i;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unrestricted implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Restriction restriction;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRefreshing;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialog;

            public Unrestricted(Restriction restriction, boolean z15, cb4.i iVar) {
                this.restriction = restriction;
                this.isRefreshing = z15;
                this.dialog = iVar;
            }

            public static /* synthetic */ Unrestricted e(Unrestricted unrestricted, Restriction restriction, boolean z15, cb4.i iVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    restriction = unrestricted.restriction;
                }
                if ((i15 & 2) != 0) {
                    z15 = unrestricted.isRefreshing;
                }
                if ((i15 & 4) != 0) {
                    iVar = unrestricted.dialog;
                }
                return unrestricted.d(restriction, z15, iVar);
            }

            @Override // nt2.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getIsRefreshing() {
                return this.isRefreshing;
            }

            @Override // nt2.c.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public cb4.i getDialog() {
                return this.dialog;
            }

            @Override // nt2.c.b
            /* JADX INFO: renamed from: c, reason: from getter */
            public Restriction getRestriction() {
                return this.restriction;
            }

            public final Unrestricted d(Restriction restriction, boolean isRefreshing, cb4.i dialog) {
                return new Unrestricted(restriction, isRefreshing, dialog);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unrestricted)) {
                    return false;
                }
                Unrestricted unrestricted = (Unrestricted) other;
                return fr.t.c(this.restriction, unrestricted.restriction) && this.isRefreshing == unrestricted.isRefreshing && fr.t.c(this.dialog, unrestricted.dialog);
            }

            public int hashCode() {
                int iHashCode = ((this.restriction.hashCode() * 31) + Boolean.hashCode(this.isRefreshing)) * 31;
                cb4.i iVar = this.dialog;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Unrestricted(restriction=" + this.restriction + ", isRefreshing=" + this.isRefreshing + ", dialog=" + this.dialog + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        boolean getIsRefreshing();

        /* JADX INFO: renamed from: b */
        cb4.i getDialog();

        /* JADX INFO: renamed from: c */
        Restriction getRestriction();
    }

    /* JADX INFO: renamed from: nt2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnt2/c$c;", "Lnt2/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3421c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3421c f138430a = new C3421c();

        private C3421c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3421c);
        }

        public int hashCode() {
            return -1821839221;
        }

        public String toString() {
            return "UnderAge";
        }
    }
}
