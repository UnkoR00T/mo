package st3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: st3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lst3/i;", "", "Lst3/i$b;", "mode", "", "cleanWhiteSpace", "Lst3/i$a;", "formData", "<init>", "(Lst3/i$b;ZLst3/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/i$b;", "c", "()Lst3/i$b;", "b", "Z", "()Z", "Lst3/i$a;", "()Lst3/i$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressFormVMSSetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cleanWhiteSpace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a formData;

    /* JADX INFO: renamed from: st3.i$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u000f¨\u0006 "}, d2 = {"Lst3/i$a;", "", "Lst3/l$a;", "province", "county", "community", "city", "", "postalCode", "street", "buildingNumber", "apartmentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "e", "c", "d", "f", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String province;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String county;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String community;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String city;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String postalCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String street;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String buildingNumber;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String apartmentNumber;

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, fr.k kVar) {
            this(str, str2, str3, str4, str5, str6, str7, str8);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApartmentNumber() {
            return this.apartmentNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBuildingNumber() {
            return this.buildingNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCommunity() {
            return this.community;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCounty() {
            return this.county;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0016  */
        /* JADX WARN: Code duplicated, block: B:22:0x002c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0042  */
        /* JADX WARN: Code duplicated, block: B:42:0x0058  */
        /* JADX WARN: Code duplicated, block: B:55:0x0079  */
        public boolean equals(Object other) {
            boolean zB;
            boolean zB2;
            boolean zB3;
            boolean zB4;
            boolean zB5;
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            String str = this.province;
            String str2 = aVar.province;
            if (str == null) {
                if (str2 == null) {
                    zB = true;
                } else {
                    zB = false;
                }
            } else if (str2 == null) {
                zB = false;
            } else {
                zB = AddressTerytDetail.a.b(str, str2);
            }
            if (!zB) {
                return false;
            }
            String str3 = this.county;
            String str4 = aVar.county;
            if (str3 == null) {
                if (str4 == null) {
                    zB2 = true;
                } else {
                    zB2 = false;
                }
            } else if (str4 == null) {
                zB2 = false;
            } else {
                zB2 = AddressTerytDetail.a.b(str3, str4);
            }
            if (!zB2) {
                return false;
            }
            String str5 = this.community;
            String str6 = aVar.community;
            if (str5 == null) {
                if (str6 == null) {
                    zB3 = true;
                } else {
                    zB3 = false;
                }
            } else if (str6 == null) {
                zB3 = false;
            } else {
                zB3 = AddressTerytDetail.a.b(str5, str6);
            }
            if (!zB3) {
                return false;
            }
            String str7 = this.city;
            String str8 = aVar.city;
            if (str7 == null) {
                if (str8 == null) {
                    zB4 = true;
                } else {
                    zB4 = false;
                }
            } else if (str8 == null) {
                zB4 = false;
            } else {
                zB4 = AddressTerytDetail.a.b(str7, str8);
            }
            if (!zB4 || !t.c(this.postalCode, aVar.postalCode)) {
                return false;
            }
            String str9 = this.street;
            String str10 = aVar.street;
            if (str9 == null) {
                if (str10 == null) {
                    zB5 = true;
                } else {
                    zB5 = false;
                }
            } else if (str10 == null) {
                zB5 = false;
            } else {
                zB5 = AddressTerytDetail.a.b(str9, str10);
            }
            return zB5 && t.c(this.buildingNumber, aVar.buildingNumber) && t.c(this.apartmentNumber, aVar.apartmentNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getProvince() {
            return this.province;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getStreet() {
            return this.street;
        }

        public int hashCode() {
            String str = this.province;
            int iC = (str == null ? 0 : AddressTerytDetail.a.c(str)) * 31;
            String str2 = this.county;
            int iC2 = (iC + (str2 == null ? 0 : AddressTerytDetail.a.c(str2))) * 31;
            String str3 = this.community;
            int iC3 = (iC2 + (str3 == null ? 0 : AddressTerytDetail.a.c(str3))) * 31;
            String str4 = this.city;
            int iC4 = (iC3 + (str4 == null ? 0 : AddressTerytDetail.a.c(str4))) * 31;
            String str5 = this.postalCode;
            int iHashCode = (iC4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.street;
            int iC5 = (iHashCode + (str6 == null ? 0 : AddressTerytDetail.a.c(str6))) * 31;
            String str7 = this.buildingNumber;
            int iHashCode2 = (iC5 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.apartmentNumber;
            return iHashCode2 + (str8 != null ? str8.hashCode() : 0);
        }

        public String toString() {
            String str = this.province;
            String strD = str == null ? "null" : AddressTerytDetail.a.d(str);
            String str2 = this.county;
            String strD2 = str2 == null ? "null" : AddressTerytDetail.a.d(str2);
            String str3 = this.community;
            String strD3 = str3 == null ? "null" : AddressTerytDetail.a.d(str3);
            String str4 = this.city;
            String strD4 = str4 == null ? "null" : AddressTerytDetail.a.d(str4);
            String str5 = this.postalCode;
            String str6 = this.street;
            return "FormData(province=" + strD + ", county=" + strD2 + ", community=" + strD3 + ", city=" + strD4 + ", postalCode=" + str5 + ", street=" + (str6 != null ? AddressTerytDetail.a.d(str6) : "null") + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ")";
        }

        private a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.province = str;
            this.county = str2;
            this.community = str3;
            this.city = str4;
            this.postalCode = str5;
            this.street = str6;
            this.buildingNumber = str7;
            this.apartmentNumber = str8;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6, (i15 & 64) != 0 ? null : str7, (i15 & 128) == 0 ? str8 : null, null);
        }
    }

    /* JADX INFO: renamed from: st3.i$b */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lst3/i$b;", "", "b", "d", "c", "a", "Lst3/i$b$a;", "Lst3/i$b$b;", "Lst3/i$b$c;", "Lst3/i$b$d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: st3.i$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lst3/i$b$a;", "Lst3/i$b;", "Lkotlin/Function1;", "", "Lhz/g;", "validateBuildings", "validateApartment", "<init>", "(Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "()Ler/l;", "b", "getValidateApartment", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<String, hz.g> validateBuildings;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<String, hz.g> validateApartment;

            /* JADX WARN: Multi-variable type inference failed */
            public Custom(er.l<? super String, ? extends hz.g> lVar, er.l<? super String, ? extends hz.g> lVar2) {
                this.validateBuildings = lVar;
                this.validateApartment = lVar2;
            }

            public final er.l<String, hz.g> a() {
                return this.validateBuildings;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) other;
                return t.c(this.validateBuildings, custom.validateBuildings) && t.c(this.validateApartment, custom.validateApartment);
            }

            public int hashCode() {
                return (this.validateBuildings.hashCode() * 31) + this.validateApartment.hashCode();
            }

            public String toString() {
                return "Custom(validateBuildings=" + this.validateBuildings + ", validateApartment=" + this.validateApartment + ")";
            }
        }

        /* JADX INFO: renamed from: st3.i$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lst3/i$b$b;", "Lst3/i$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4761b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4761b f184325a = new C4761b();

            private C4761b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4761b);
            }

            public int hashCode() {
                return 1637651591;
            }

            public String toString() {
                return "Full";
            }
        }

        /* JADX INFO: renamed from: st3.i$b$c */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lst3/i$b$c;", "Lst3/i$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f184326a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1573325361;
            }

            public String toString() {
                return "OptionalFields";
            }
        }

        /* JADX INFO: renamed from: st3.i$b$d */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lst3/i$b$d;", "Lst3/i$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f184327a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1449830585;
            }

            public String toString() {
                return "RestrictedToCity";
            }
        }
    }

    public AddressFormVMSSetupData(b bVar, boolean z15, a aVar) {
        this.mode = bVar;
        this.cleanWhiteSpace = z15;
        this.formData = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCleanWhiteSpace() {
        return this.cleanWhiteSpace;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getFormData() {
        return this.formData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getMode() {
        return this.mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFormVMSSetupData)) {
            return false;
        }
        AddressFormVMSSetupData addressFormVMSSetupData = (AddressFormVMSSetupData) other;
        return t.c(this.mode, addressFormVMSSetupData.mode) && this.cleanWhiteSpace == addressFormVMSSetupData.cleanWhiteSpace && t.c(this.formData, addressFormVMSSetupData.formData);
    }

    public int hashCode() {
        int iHashCode = ((this.mode.hashCode() * 31) + Boolean.hashCode(this.cleanWhiteSpace)) * 31;
        a aVar = this.formData;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AddressFormVMSSetupData(mode=" + this.mode + ", cleanWhiteSpace=" + this.cleanWhiteSpace + ", formData=" + this.formData + ")";
    }

    public /* synthetic */ AddressFormVMSSetupData(b bVar, boolean z15, a aVar, int i15, fr.k kVar) {
        this(bVar, (i15 & 2) != 0 ? false : z15, aVar);
    }
}
