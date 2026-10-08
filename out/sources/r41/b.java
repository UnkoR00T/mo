package r41;

import iy.b0;
import p071kotlin.Metadata;
import u41.ContactInfoWriteFieldsData;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\t\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0006\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lr41/b;", "", "", "isValid", "()Z", "Lu41/a;", "fieldsData", "b", "(Lu41/a;)Lr41/b;", "a", "()Lu41/a;", "Liy/b0;", "o", "()Liy/b0;", "address", "Lr41/b$a;", "Lr41/b$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: r41.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr41/b$a;", "Lr41/b;", "Lu41/a;", "fieldsData", "Liy/b0;", "address", "<init>", "(Lu41/a;Liy/b0;)V", "c", "(Lu41/a;Liy/b0;)Lr41/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu41/a;", "()Lu41/a;", "b", "Liy/b0;", "o", "()Liy/b0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f171578c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactInfoWriteFieldsData fieldsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 address;

        static {
            int i15 = b0.f97726c;
            int i16 = PhoneNumber.f221634d | i15;
            int i17 = hz.b.f86845b;
            f171578c = i15 | i16 | i17 | i17 | i17;
        }

        public Loading(ContactInfoWriteFieldsData contactInfoWriteFieldsData, b0 b0Var) {
            this.fieldsData = contactInfoWriteFieldsData;
            this.address = b0Var;
        }

        public static /* synthetic */ Loading d(Loading loading, ContactInfoWriteFieldsData contactInfoWriteFieldsData, b0 b0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                contactInfoWriteFieldsData = loading.fieldsData;
            }
            if ((i15 & 2) != 0) {
                b0Var = loading.address;
            }
            return loading.c(contactInfoWriteFieldsData, b0Var);
        }

        @Override // r41.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public ContactInfoWriteFieldsData getFieldsData() {
            return this.fieldsData;
        }

        @Override // r41.b
        public /* bridge */ b b(ContactInfoWriteFieldsData contactInfoWriteFieldsData) {
            return super.b(contactInfoWriteFieldsData);
        }

        public final Loading c(ContactInfoWriteFieldsData fieldsData, b0 address) {
            return new Loading(fieldsData, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return fr.t.c(this.fieldsData, loading.fieldsData) && fr.t.c(this.address, loading.address);
        }

        public int hashCode() {
            int iHashCode = this.fieldsData.hashCode() * 31;
            b0 b0Var = this.address;
            return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
        }

        @Override // r41.b
        public /* bridge */ boolean isValid() {
            return super.isValid();
        }

        @Override // r41.b
        /* JADX INFO: renamed from: o, reason: from getter */
        public b0 getAddress() {
            return this.address;
        }

        public String toString() {
            return "Loading(fieldsData=" + this.fieldsData + ", address=" + this.address + ')';
        }
    }

    /* JADX INFO: renamed from: r41.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr41/b$b;", "Lr41/b;", "Lu41/a;", "fieldsData", "Liy/b0;", "address", "<init>", "(Lu41/a;Liy/b0;)V", "c", "(Lu41/a;Liy/b0;)Lr41/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu41/a;", "()Lu41/a;", "b", "Liy/b0;", "o", "()Liy/b0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotLoading implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f171581c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactInfoWriteFieldsData fieldsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 address;

        static {
            int i15 = b0.f97726c;
            int i16 = PhoneNumber.f221634d | i15;
            int i17 = hz.b.f86845b;
            f171581c = i15 | i16 | i17 | i17 | i17;
        }

        public NotLoading(ContactInfoWriteFieldsData contactInfoWriteFieldsData, b0 b0Var) {
            this.fieldsData = contactInfoWriteFieldsData;
            this.address = b0Var;
        }

        public static /* synthetic */ NotLoading d(NotLoading notLoading, ContactInfoWriteFieldsData contactInfoWriteFieldsData, b0 b0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                contactInfoWriteFieldsData = notLoading.fieldsData;
            }
            if ((i15 & 2) != 0) {
                b0Var = notLoading.address;
            }
            return notLoading.c(contactInfoWriteFieldsData, b0Var);
        }

        @Override // r41.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public ContactInfoWriteFieldsData getFieldsData() {
            return this.fieldsData;
        }

        @Override // r41.b
        public /* bridge */ b b(ContactInfoWriteFieldsData contactInfoWriteFieldsData) {
            return super.b(contactInfoWriteFieldsData);
        }

        public final NotLoading c(ContactInfoWriteFieldsData fieldsData, b0 address) {
            return new NotLoading(fieldsData, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotLoading)) {
                return false;
            }
            NotLoading notLoading = (NotLoading) other;
            return fr.t.c(this.fieldsData, notLoading.fieldsData) && fr.t.c(this.address, notLoading.address);
        }

        public int hashCode() {
            int iHashCode = this.fieldsData.hashCode() * 31;
            b0 b0Var = this.address;
            return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
        }

        @Override // r41.b
        public /* bridge */ boolean isValid() {
            return super.isValid();
        }

        @Override // r41.b
        /* JADX INFO: renamed from: o, reason: from getter */
        public b0 getAddress() {
            return this.address;
        }

        public String toString() {
            return "NotLoading(fieldsData=" + this.fieldsData + ", address=" + this.address + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    ContactInfoWriteFieldsData getFieldsData();

    default b b(ContactInfoWriteFieldsData fieldsData) {
        if (this instanceof Loading) {
            return Loading.d((Loading) this, fieldsData, null, 2, null);
        }
        if (this instanceof NotLoading) {
            return NotLoading.d((NotLoading) this, fieldsData, null, 2, null);
        }
        throw new oq.p();
    }

    default boolean isValid() {
        return getFieldsData().f();
    }

    /* JADX INFO: renamed from: o */
    b0 getAddress();
}
