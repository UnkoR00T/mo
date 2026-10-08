package h32;

import eo0.Directory;
import eo0.OwnerAddress;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lh32/b;", "", "a", "b", "Lh32/b$a;", "Lh32/b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh32/b$a;", "Lh32/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80518a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 612895849;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: h32.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lh32/b$b;", "Lh32/b;", "", "Leo0/q;", "directoryList", "", "faq", "Leo0/j0;", "ownerAddress", "", "isAlertInfoVisible", "<init>", "(Ljava/util/List;Ljava/lang/String;Leo0/j0;Z)V", "a", "(Ljava/util/List;Ljava/lang/String;Leo0/j0;Z)Lh32/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "d", "Leo0/j0;", "e", "()Leo0/j0;", "Z", "f", "()Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Directory> directoryList;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String faq;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwnerAddress ownerAddress;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAlertInfoVisible;

        public Initialized(List<Directory> list, String str, OwnerAddress ownerAddress, boolean z15) {
            this.directoryList = list;
            this.faq = str;
            this.ownerAddress = ownerAddress;
            this.isAlertInfoVisible = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, String str, OwnerAddress ownerAddress, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.directoryList;
            }
            if ((i15 & 2) != 0) {
                str = initialized.faq;
            }
            if ((i15 & 4) != 0) {
                ownerAddress = initialized.ownerAddress;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.isAlertInfoVisible;
            }
            return initialized.a(list, str, ownerAddress, z15);
        }

        public final Initialized a(List<Directory> directoryList, String faq, OwnerAddress ownerAddress, boolean isAlertInfoVisible) {
            return new Initialized(directoryList, faq, ownerAddress, isAlertInfoVisible);
        }

        public final List<Directory> c() {
            return this.directoryList;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFaq() {
            return this.faq;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final OwnerAddress getOwnerAddress() {
            return this.ownerAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.directoryList, initialized.directoryList) && fr.t.c(this.faq, initialized.faq) && fr.t.c(this.ownerAddress, initialized.ownerAddress) && this.isAlertInfoVisible == initialized.isAlertInfoVisible;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsAlertInfoVisible() {
            return this.isAlertInfoVisible;
        }

        public int hashCode() {
            return (((((this.directoryList.hashCode() * 31) + this.faq.hashCode()) * 31) + this.ownerAddress.hashCode()) * 31) + Boolean.hashCode(this.isAlertInfoVisible);
        }

        public String toString() {
            return "Initialized(directoryList=" + this.directoryList + ", faq=" + this.faq + ", ownerAddress=" + this.ownerAddress + ", isAlertInfoVisible=" + this.isAlertInfoVisible + ')';
        }
    }
}
