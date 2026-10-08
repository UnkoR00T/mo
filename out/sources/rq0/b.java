package rq0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import fr.t;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t2\u00020\u0001:\u0005\n\u0003\u0006\u000b\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lrq0/b;", "Lrq0/a;", "", "e", "()Z", "", "b", "()Ljava/lang/String;", "referenceName", "m0", "d", "c", "a", "Lrq0/b$b;", "Lrq0/b$c;", "Lrq0/b$d;", "Lrq0/b$e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends a {

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f175412a;

    /* JADX INFO: renamed from: rq0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrq0/b$a;", "", "<init>", "()V", "", "value", "Lrq0/b;", "a", "(Ljava/lang/String;)Lrq0/b;", "", "b", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f175412a = new Companion();

        private Companion() {
        }

        public final b a(String value) {
            c cVar;
            d next;
            e next2;
            EnumC4479b next3;
            Iterator<d> it = d.j().iterator();
            do {
                cVar = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(next.getReferenceName(), value));
            d dVar = next;
            if (dVar != null) {
                return dVar;
            }
            Iterator<e> it4 = e.j().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!t.c(next2.getReferenceName(), value));
            e eVar = next2;
            if (eVar != null) {
                return eVar;
            }
            Iterator<EnumC4479b> it5 = EnumC4479b.j().iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (!t.c(next3.getReferenceName(), value));
            EnumC4479b enumC4479b = next3;
            if (enumC4479b != null) {
                return enumC4479b;
            }
            for (c cVar2 : c.j()) {
                if (t.c(cVar2.getReferenceName(), value)) {
                    cVar = cVar2;
                    break;
                }
            }
            return cVar;
        }

        public final List<b> b() {
            List<b> listI1 = v.i1(v.L0(v.L0(v.L0(d.j(), e.j()), EnumC4479b.j()), c.j()));
            listI1.remove(EnumC4479b.DEFAULT);
            listI1.remove(c.DEFAULT);
            return listI1;
        }
    }

    /* JADX INFO: renamed from: rq0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lrq0/b$b;", "Lrq0/b;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "referenceName", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC4479b implements b {
        DOCTOR("DOCTOR"),
        DENTIST("DENTIST"),
        ATTORNEY_AT_LAW("ATTORNEY_AT_LAW"),
        TRAINEE_ATTORNEY_AT_LAW("TRAINEE_ATTORNEY_AT_LAW"),
        CIVIL_ENGINEER("CIVIL_ENGINEER"),
        TAX_ADVISOR("TAX_ADVISOR"),
        JUNIOR_SCHOOL_CARD_MOBYWATEL_APP("JUNIOR_SCHOOL_CARD_MOBYWATEL_APP"),
        AUDITOR("AUDITOR"),
        SOLIDARITY_CARD("SOLIDARITY_CARD"),
        PHD_STUDENT("PHD_STUDENT"),
        PHYSIOTHERAPIST("PHYSIOTHERAPIST"),
        PHARMACIST("PHARMACIST"),
        SHOOTING_LICENCE("SHOOTING_LICENCE"),
        SPORT_SHOOTING_COMPETITOR_LICENCE("SPORT_SHOOTING_COMPETITOR_LICENCE"),
        SPORT_SHOOTING_COACH_LICENCE("SPORT_SHOOTING_COACH_LICENCE"),
        SPORT_SHOOTING_INSTRUCTOR_LICENCE("SPORT_SHOOTING_INSTRUCTOR_LICENCE"),
        SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING("SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING"),
        SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING("SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING"),
        SPORT_SHOOTING_RANGE_OFFICER_LICENCE("SPORT_SHOOTING_RANGE_OFFICER_LICENCE"),
        LABORATORY_DIAGNOSTICIAN("LABORATORY_DIAGNOSTICIAN"),
        PENSIONER_MSWIA("PENSIONER_MSWIA"),
        DEFAULT("DEFAULT");

        private static final /* synthetic */ wq.a C = wq.b.a(g());

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String referenceName;

        /* JADX INFO: renamed from: rq0.b$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrq0/b$b$a;", "", "<init>", "()V", "", "value", "Lrq0/b$b;", "a", "(Ljava/lang/String;)Lrq0/b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final EnumC4479b a(String value) {
                EnumC4479b next;
                Iterator<EnumC4479b> it = EnumC4479b.j().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!t.c(next.getReferenceName(), value));
                EnumC4479b enumC4479b = next;
                return enumC4479b == null ? EnumC4479b.DEFAULT : enumC4479b;
            }

            private Companion() {
            }
        }

        EnumC4479b(String str) {
            this.referenceName = str;
        }

        public static wq.a<EnumC4479b> j() {
            return C;
        }

        @Override // rq0.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getReferenceName() {
            return this.referenceName;
        }

        @Override // rq0.b
        public /* bridge */ boolean e() {
            return super.e();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lrq0/b$c;", "Lrq0/b;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "referenceName", "c", "d", "e", "f", "g", "h", "j", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c implements b {
        DISABLED_PERSON_IDENTIFICATION_CARD("DISABLED_PERSON_IDENTIFICATION_CARD"),
        TEACHER("TEACHER"),
        BAILIFF_CARD("BAILIFF_CARD"),
        ELECTRONIC_DIPLOMA_GRADUATION("ELECTRONIC_DIPLOMA_GRADUATION"),
        ELECTRONIC_DIPLOMA_PHD("ELECTRONIC_DIPLOMA_PHD"),
        ELECTRONIC_DIPLOMA_DSC("ELECTRONIC_DIPLOMA_DSC"),
        DEFAULT("DEFAULT");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String referenceName;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ wq.a f175445l = wq.b.a(g());

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: rq0.b$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrq0/b$c$a;", "", "<init>", "()V", "", "value", "Lrq0/b$c;", "a", "(Ljava/lang/String;)Lrq0/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final c a(String value) {
                c next;
                Iterator<c> it = c.j().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!t.c(next.getReferenceName(), value));
                c cVar = next;
                return cVar == null ? c.DEFAULT : cVar;
            }

            private Companion() {
            }
        }

        c(String str) {
            this.referenceName = str;
        }

        public static wq.a<c> j() {
            return f175445l;
        }

        @Override // rq0.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getReferenceName() {
            return this.referenceName;
        }

        @Override // rq0.b
        public /* bridge */ boolean e() {
            return super.e();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lrq0/b$d;", "Lrq0/b;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "referenceName", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum d implements b {
        ID_CARD("ID_CARD"),
        DRIVING_LICENCE("DRIVING_LICENCE"),
        VEHICLE_CARD("VEHICLE_CARD"),
        FAMILY_CARD("FAMILY_CARD"),
        DIIA_REFUGEE_CARD("DIIA_REFUGEE_CARD"),
        DIIA_REFUGEE_CHILD_CARD("DIIA_REFUGEE_CHILD_CARD"),
        SCHOOL_CARD("SCHOOL_CARD"),
        STUDENT_CARD("STUDENT_CARD"),
        RAILWAY_CARD("RAILWAY_CARD"),
        PENSIONER_CARD("PENSIONER_CARD"),
        DEPUTY_CARD("DEPUTY_CARD"),
        ADVOCATE_CARD("ADVOCATE_CARD"),
        MIDWIFE_CARD("MIDWIFE_CARD"),
        NURSE_CARD("NURSE_CARD");


        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ wq.a f175462s = wq.b.a(g());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String referenceName;

        d(String str) {
            this.referenceName = str;
        }

        public static wq.a<d> j() {
            return f175462s;
        }

        @Override // rq0.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getReferenceName() {
            return this.referenceName;
        }

        @Override // rq0.b
        public /* bridge */ boolean e() {
            return super.e();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u000bj\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b\nj\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00063"}, d2 = {"Lrq0/b$e;", "Lrq0/b;", "", "", "name", "", "licenceCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "I", "k", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "referenceName", "c", "d", "e", "f", "g", "h", "j", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", i.f37087n, "K", i.f37094u, "O", i.f37086m, "R", "T", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum e implements b {
        RASKA_SENIOR_LICENCE("RASKA_SENIOR_LICENCE", 7000001),
        ZDUNSKOWOLSKA_RESIDENT_LICENCE("ZDUNSKOWOLSKA_RESIDENT_LICENCE", 7000002),
        OLAWA_RESIDENT_LICENCE("OLAWA_RESIDENT_LICENCE", 7000003),
        OLAWA_FAMILY_LICENCE("OLAWA_FAMILY_LICENCE", 7000004),
        OLAWA_SENIOR_LICENCE("OLAWA_SENIOR_LICENCE", 7000005),
        ZDUNSKOWOLSKA_FAMILY_LICENCE("ZDUNSKOWOLSKA_FAMILY_LICENCE", 7000006),
        ZDUNSKOWOLSKA_SENIOR_LICENCE("ZDUNSKOWOLSKA_SENIOR_LICENCE", 7000007),
        SUCHY_LAS_FAMILY_LICENCE("SUCHY_LAS_FAMILY_LICENCE", 7000008),
        MIEJSKA_AUGUSTOW_TOURIST_LICENCE("MIEJSKA_AUGUSTOW_TOURIST_LICENCE", 7000009),
        CHELM_FAMILY_LICENCE("CHELM_FAMILY_LICENCE", 7000010),
        CHELM_SENIOR_LICENCE("CHELM_SENIOR_LICENCE", 7000011),
        CHELM_RESIDENT_LICENCE("CHELM_RESIDENT_LICENCE", 7000012),
        LODZ_SENIOR_LICENCE("LODZ_SENIOR_LICENCE", 7000013),
        LODZ_FAMILY_LICENCE("LODZ_FAMILY_LICENCE", 7000014),
        SENATOR_CARD("SENATOR_CARD", 7000015),
        RACIBORSKA_RESIDENT_LICENCE("RACIBORSKA_RESIDENT_LICENCE", 7000016),
        RACIBORSKA_SENIOR_LICENCE("RACIBORSKA_SENIOR_LICENCE", 7000017),
        RACIBORSKA_FAMILY_LICENCE("RACIBORSKA_FAMILY_LICENCE", 7000018),
        GIZYCKA_RESIDENT_LICENCE("GIZYCKA_RESIDENT_LICENCE", 7000019),
        PZPN_LICENCE("PZPN_LICENCE", 7000020),
        KOBYLKA_RESIDENT_LICENCE("KOBYLKA_RESIDENT_LICENCE", 7000021),
        WROCLAWSKA_SENIOR_LICENCE("WROCLAWSKA_SENIOR_LICENCE", 7000022),
        MIEKINIA_SENIOR_LICENCE("MIEKINIA_SENIOR_LICENCE", 7000023),
        MIEKINIA_FAMILY_LICENCE("MIEKINIA_FAMILY_LICENCE", 7000024),
        TOPR_LICENCE("TOPR", 7000025),
        MAZOVIA_LICENCE("MAZOVIA", 7000026),
        GENERAL_COUNSEL_LICENCE("GENERAL_COUNSEL_LICENCE", 7000027),
        OLECKO_RESIDENT_LICENCE("OLECKO_RESIDENT_LICENCE", 7000028),
        BYDGOSZCZ_FAMILY_LICENCE("BYDGOSZCZ_FAMILY_LICENCE", 7000029),
        WODZISLAW_FAMILY_LICENCE("WODZISLAW_FAMILY_LICENCE", 7000030),
        MICHALOWICE_RESIDENT_LICENCE("MICHALOWICE_RESIDENT_LICENCE", 7000031),
        KOLEJE_DOLNOSLASKIE_LICENCE("KOLEJE_DOLNOSLASKIE_LICENCE", 7000032),
        WISLA_RESIDENT_LICENCE("WISLA_RESIDENT_LICENCE", 7000033),
        JASTRZEBIA_GORA_RESIDENT_LICENCE("JASTRZEBIA_GORA_RESIDENT_LICENCE", 7000034),
        FIREFIGHTER_OSP_LICENCE("FIREFIGHTER_OSP_LICENCE", 7000035);

        private static final /* synthetic */ wq.a Y = wq.b.a(g());

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int licenceCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String referenceName;

        /* JADX INFO: renamed from: rq0.b$e$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrq0/b$e$a;", "", "<init>", "()V", "", "licenceCode", "Lrq0/b$e;", "a", "(I)Lrq0/b$e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final e a(int licenceCode) {
                e next;
                Iterator<e> it = e.j().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next.getLicenceCode() == licenceCode) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        e(String str, int i15) {
            this.licenceCode = i15;
            this.referenceName = str;
        }

        public static wq.a<e> j() {
            return Y;
        }

        @Override // rq0.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getReferenceName() {
            return this.referenceName;
        }

        @Override // rq0.b
        public /* bridge */ boolean e() {
            return super.e();
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getLicenceCode() {
            return this.licenceCode;
        }
    }

    /* JADX INFO: renamed from: b */
    String getReferenceName();

    default boolean e() {
        return this == d.ID_CARD || this == d.DIIA_REFUGEE_CARD || this == d.SCHOOL_CARD || this == d.STUDENT_CARD;
    }
}
