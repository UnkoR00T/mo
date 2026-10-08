package st3;

import fr.t;
import p071kotlin.Metadata;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lst3/f;", "Lzx/d;", "Lst3/f$a;", "Lst3/d;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends zx.d<a, AddressFormData> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lst3/f$a;", "", "<init>", "()V", "e", "d", "c", "a", "b", "Lst3/f$a$a;", "Lst3/f$a$b;", "Lst3/f$a$c;", "Lst3/f$a$d;", "Lst3/f$a$e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: st3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lst3/f$a$a;", "Lst3/f$a;", "Lst3/b;", "addressData", "<init>", "(Lst3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "()Lst3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Back extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressData addressData;

            public Back(AddressData addressData) {
                super(null);
                this.addressData = addressData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AddressData getAddressData() {
                return this.addressData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Back) && t.c(this.addressData, ((Back) other).addressData);
            }

            public int hashCode() {
                AddressData addressData = this.addressData;
                if (addressData == null) {
                    return 0;
                }
                return addressData.hashCode();
            }

            public String toString() {
                return "Back(addressData=" + this.addressData + ")";
            }
        }

        /* JADX INFO: renamed from: st3.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lst3/f$a$b;", "Lst3/f$a;", "Lst3/b;", "addressData", "<init>", "(Lst3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "()Lst3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Close extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressData addressData;

            public Close(AddressData addressData) {
                super(null);
                this.addressData = addressData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AddressData getAddressData() {
                return this.addressData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Close) && t.c(this.addressData, ((Close) other).addressData);
            }

            public int hashCode() {
                AddressData addressData = this.addressData;
                if (addressData == null) {
                    return 0;
                }
                return addressData.hashCode();
            }

            public String toString() {
                return "Close(addressData=" + this.addressData + ")";
            }
        }

        /* JADX INFO: renamed from: st3.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lst3/f$a$c;", "Lst3/f$a;", "Ljb4/b;", "errorData", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GoToError extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b errorData;

            public GoToError(jb4.b bVar) {
                super(null);
                this.errorData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jb4.b getErrorData() {
                return this.errorData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToError) && t.c(this.errorData, ((GoToError) other).errorData);
            }

            public int hashCode() {
                return this.errorData.hashCode();
            }

            public String toString() {
                return "GoToError(errorData=" + this.errorData + ")";
            }
        }

        /* JADX INFO: renamed from: st3.f$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lst3/f$a$d;", "Lst3/f$a;", "Lst3/b;", "result", "<init>", "(Lst3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "()Lst3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GoToNextScreen extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressData result;

            public GoToNextScreen(AddressData addressData) {
                super(null);
                this.result = addressData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AddressData getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToNextScreen) && t.c(this.result, ((GoToNextScreen) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "GoToNextScreen(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: st3.f$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lst3/f$a$e;", "Lst3/f$a;", "Ltt3/b;", "model", "<init>", "(Ltt3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt3/b;", "()Ltt3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GoToSearch extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AddressSearchData model;

            public GoToSearch(AddressSearchData addressSearchData) {
                super(null);
                this.model = addressSearchData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AddressSearchData getModel() {
                return this.model;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToSearch) && t.c(this.model, ((GoToSearch) other).model);
            }

            public int hashCode() {
                return this.model.hashCode();
            }

            public String toString() {
                return "GoToSearch(model=" + this.model + ")";
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
