package m02;

import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lm02/a;", "", "c0", "b", "d", "c", "a", "Lm02/a$a;", "Lm02/a$c;", "Lm02/a$d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f122002a;

    /* JADX INFO: renamed from: m02.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lm02/a$a;", "Lm02/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC2987a implements a {
        PUBLIC_NAME,
        CITY,
        STREET,
        BUILDING_NUMBER,
        APARTMENT_NUMBER,
        POSTCODE,
        COUNTRY,
        NAME,
        SURNAME;


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ wq.a f122001l = wq.b.a(b());
    }

    /* JADX INFO: renamed from: m02.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u0015"}, d2 = {"Lm02/a$b;", "", "<init>", "()V", "", "Lm02/a$c;", "b", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "publicIdentifierFields", "Lm02/a$a;", "c", "d", "publicAddressFields", "bailiffIdentifierFields", "a", "bailiffAddressFields", "Lm02/a$d;", "f", "bailiffNamesFields", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f122002a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Set<c> publicIdentifierFields;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final Set<EnumC2987a> publicAddressFields;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final Set<c> bailiffIdentifierFields;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final Set<EnumC2987a> bailiffAddressFields;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Set<d> bailiffNamesFields;

        static {
            c cVar = c.PESEL;
            c cVar2 = c.NIP;
            c cVar3 = c.REGON;
            publicIdentifierFields = e1.i(cVar, cVar2, cVar3, c.KRS, c.EUROPEAN_ID);
            EnumC2987a enumC2987a = EnumC2987a.PUBLIC_NAME;
            EnumC2987a enumC2987a2 = EnumC2987a.CITY;
            EnumC2987a enumC2987a3 = EnumC2987a.STREET;
            EnumC2987a enumC2987a4 = EnumC2987a.BUILDING_NUMBER;
            EnumC2987a enumC2987a5 = EnumC2987a.APARTMENT_NUMBER;
            EnumC2987a enumC2987a6 = EnumC2987a.POSTCODE;
            EnumC2987a enumC2987a7 = EnumC2987a.COUNTRY;
            publicAddressFields = e1.i(enumC2987a, enumC2987a2, enumC2987a3, enumC2987a4, enumC2987a5, enumC2987a6, enumC2987a7);
            bailiffIdentifierFields = e1.i(cVar2, cVar3);
            bailiffAddressFields = e1.i(EnumC2987a.NAME, EnumC2987a.SURNAME, enumC2987a2, enumC2987a3, enumC2987a4, enumC2987a5, enumC2987a6, enumC2987a7);
            bailiffNamesFields = e1.i(d.NAME, d.SURNAME);
        }

        private Companion() {
        }

        public final Set<EnumC2987a> a() {
            return bailiffAddressFields;
        }

        public final Set<c> b() {
            return bailiffIdentifierFields;
        }

        public final Set<d> c() {
            return bailiffNamesFields;
        }

        public final Set<EnumC2987a> d() {
            return publicAddressFields;
        }

        public final Set<c> e() {
            return publicIdentifierFields;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lm02/a$c;", "Lm02/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c implements a {
        PESEL,
        NIP,
        REGON,
        KRS,
        EUROPEAN_ID;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f122014g = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lm02/a$d;", "Lm02/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum d implements a {
        NAME,
        SURNAME;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f122018d = wq.b.a(b());
    }
}
