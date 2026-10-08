package aj2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lr.m;
import p071kotlin.Metadata;
import pq.v0;
import wq.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\bF\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b\u0007j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bG¨\u0006H"}, d2 = {"Laj2/a;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "d", "e", "f", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", i.f37087n, "K", i.f37094u, "O", i.f37086m, "R", "T", "X", "Y", "Z", "h0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "A0", "B0", "C0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    DEFAULT(-1),
    TOZSAMOSC(0),
    SCHOOL_CARD(1),
    STUDENT_CARD(2),
    REFUGEE(16),
    VEHICLE(3),
    PRESCRIPTION(4),
    IPOLAK(5),
    DRIVING_LICENCE(7),
    CITY_CARD_KRAKOW(10),
    FAMILY_CARD(11),
    PKP(13),
    RAILWAY_CARD(15),
    DEPUTY_CARD(18),
    PENSIONER_CARD(21),
    GIOS(22),
    MAKE_PROPOSAL(23),
    NURSE_CARD(25),
    MIDWIFE_CARD(53),
    ADVOCATE_CARD(26),
    RASKA_SENIOR_LICENCE(28),
    ZDUNSKOWOLSKA_RESIDENT_LICENCE(29),
    ZDUNSKOWOLSKA_CITY_FAMILY_LICENCE(30),
    ZDUNSKOWOLSKA_SENIOR_LICENCE(31),
    E_PAYMENTS(33),
    WRU(34),
    REFUGEE_CHILD(35),
    OLAWA_RESIDENT_LICENCE(36),
    OLAWA_FAMILY_LICENCE(37),
    OLAWA_SENIOR_LICENCE(38),
    SUCHY_LAS_FAMILY_LICENCE(39),
    MIEJSKA_AUGUSTOW_TOURIST_LICENCE(40),
    CHELM_FAMILY_LICENCE(41),
    CHELM_SENIOR_LICENCE(42),
    CHELM_RESIDENT_LICENCE(43),
    LODZ_SENIOR_LICENCE(44),
    LODZ_FAMILY_LICENCE(45),
    SENATOR_CARD(46),
    PZPN_LICENCE(47),
    GIZYCKA_RESIDENT_LICENCE(48),
    RACIBORSKA_RESIDENT_LICENCE(49),
    RACIBORSKA_SENIOR_LICENCE(51),
    RACIBORSKA_FAMILY_LICENCE(52),
    WROCLAWSKA_SENIOR_LICENCE(54),
    KOBYLKA_RESIDENT_LICENCE(55),
    MIEKINIA_SENIOR_LICENCE(56),
    MIEKINIA_FAMILY_LICENCE(57),
    TOPR_LICENCE(58),
    MAZOVIA_LICENCE(59),
    OLECKO_RESIDENT_LICENCE(60),
    BYDGOSZCZ_FAMILY_LICENCE(61),
    WODZISLAW_FAMILY_LICENCE(62),
    MICHALOWICE_RESIDENT_LICENCE(63),
    KOLEJE_DOLNOSLASKIE_LICENCE(64),
    WISLA_RESIDENT_LICENCE(65),
    JASTRZEBIA_GORA_RESIDENT_LICENCE(66),
    FIREFIGHTER_OSP_LICENCE(67),
    GENERAL_COUNSEL_LICENCE(68),
    DYNAMIC_DOCUMENTS(1000),
    PASSPORTS_DATA(1001),
    DYNAMIC_MULTI_DOCUMENTS(1002),
    VEHICLE_COLLISION_DATA(1003),
    CHILD_PASSPORT_APPLICATION(1004);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, a> f6736c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;
    private static final /* synthetic */ wq.a P0 = b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: aj2.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laj2/a$a;", "", "<init>", "()V", "", "type", "Laj2/a;", "a", "(I)Laj2/a;", "", "b", "(Ljava/util/List;)Ljava/util/List;", "", "mapById", "Ljava/util/Map;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(int type) {
            return (a) a.f6736c.get(Integer.valueOf(type));
        }

        public final List<a> b(List<Integer> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                a aVarA = a(it.next().intValue());
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    static {
        a[] aVarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(aVarArrValues.length), 16));
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.id), aVar);
        }
        f6736c = linkedHashMap;
    }

    a(int i15) {
        this.id = i15;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getId() {
        return this.id;
    }
}
