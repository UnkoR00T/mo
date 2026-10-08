package yn3;

import co3.i;
import fr.t;
import k34.a0;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00152\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyn3/c;", "Lco3/i;", "<init>", "()V", "Lrq0/b;", "identityDocumentType", "Lk34/a0$o;", "d", "(Lrq0/b;)Lk34/a0$o;", "Lk34/a0;", "f", "(Lrq0/b;)Lk34/a0;", "e", "", "value", "a", "(I)Lk34/a0;", "b", "(Lk34/a0;)I", "documentType", "godfatherDocument", "Loq/r;", "c", "(Lrq0/b;Lrq0/b;Lrq0/b;)Loq/r;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f228256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f228257b;

        static {
            int[] iArr = new int[rq0.b.EnumC4479b.values().length];
            try {
                iArr[rq0.b.EnumC4479b.DOCTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rq0.b.EnumC4479b.DENTIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rq0.b.EnumC4479b.ATTORNEY_AT_LAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rq0.b.EnumC4479b.CIVIL_ENGINEER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rq0.b.EnumC4479b.TAX_ADVISOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rq0.b.EnumC4479b.AUDITOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SOLIDARITY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[rq0.b.EnumC4479b.PHD_STUDENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[rq0.b.EnumC4479b.PHYSIOTHERAPIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[rq0.b.EnumC4479b.PHARMACIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SHOOTING_LICENCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[rq0.b.EnumC4479b.PENSIONER_MSWIA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f228256a = iArr;
            int[] iArr2 = new int[rq0.b.c.values().length];
            try {
                iArr2[rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[rq0.b.c.TEACHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[rq0.b.c.BAILIFF_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[rq0.b.c.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[rq0.b.c.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f228257b = iArr2;
        }
    }

    private final a0.o d(rq0.b identityDocumentType) {
        if (identityDocumentType == rq0.b.d.ID_CARD) {
            return a0.o.f107882a;
        }
        return null;
    }

    private final a0 e(rq0.b identityDocumentType) throws Exception {
        if (identityDocumentType == rq0.b.d.ID_CARD) {
            return a0.o.f107882a;
        }
        if (identityDocumentType == rq0.b.d.DIIA_REFUGEE_CARD) {
            return a0.x.f107900a;
        }
        throw new Exception("Second scope for: " + identityDocumentType + " it's not defined yet.");
    }

    private final a0 f(rq0.b bVar) {
        if (bVar != rq0.b.d.ID_CARD && bVar == rq0.b.d.STUDENT_CARD) {
            return a0.b0.f107850a;
        }
        return a0.o.f107882a;
    }

    @Override // co3.i
    public a0 a(int value) throws Exception {
        if (value == 2000) {
            return a0.C2570a0.f107847a;
        }
        if (value == 2001) {
            return a0.b0.f107850a;
        }
        switch (value) {
            case 0:
                return a0.m.f107878a;
            case 1:
                return a0.n.f107880a;
            case 2:
                return a0.o.f107882a;
            case 3:
                return a0.p.f107884a;
            case 4:
                return a0.q.f107886a;
            case 5:
                return a0.r.f107888a;
            case 6:
                return a0.s.f107890a;
            case 7:
                return a0.t.f107892a;
            case 8:
                return a0.u.f107894a;
            case 9:
                return a0.v.f107896a;
            default:
                switch (value) {
                    case 1003:
                        return new a0.DynamicDocument(rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP);
                    case 1000000:
                        return a0.z.f107904a;
                    case 1002000:
                        return new a0.DynamicMultiDocument(rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD);
                    case 3001000:
                        return a0.a.f107846a;
                    case 3004000:
                        return new a0.DynamicMultiDocument(rq0.b.c.TEACHER);
                    case 3005000:
                        return new a0.DynamicDocument(rq0.b.EnumC4479b.CIVIL_ENGINEER);
                    case 3006000:
                        return new a0.DynamicMultiDocument(rq0.b.c.BAILIFF_CARD);
                    case 3007000:
                        return new a0.DynamicDocument(rq0.b.EnumC4479b.TAX_ADVISOR);
                    default:
                        switch (value) {
                            case 3000:
                                return a0.w.f107898a;
                            case 3001:
                                return a0.x.f107900a;
                            case 3002:
                                return a0.y.f107902a;
                            default:
                                switch (value) {
                                    case 1005000:
                                        return new a0.DynamicMultiDocument(rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION);
                                    case 1005001:
                                        return new a0.DynamicMultiDocument(rq0.b.c.ELECTRONIC_DIPLOMA_PHD);
                                    case 1005002:
                                        return new a0.DynamicMultiDocument(rq0.b.c.ELECTRONIC_DIPLOMA_DSC);
                                    default:
                                        switch (value) {
                                            case 3000000:
                                                return a0.n0.f107881a;
                                            case 3000001:
                                                return a0.h0.f107868a;
                                            default:
                                                switch (value) {
                                                    case 3002000:
                                                        return new a0.DynamicDocument(rq0.b.EnumC4479b.DOCTOR);
                                                    case 3002001:
                                                        return new a0.DynamicDocument(rq0.b.EnumC4479b.DENTIST);
                                                    default:
                                                        switch (value) {
                                                            case 3003000:
                                                                return new a0.DynamicDocument(rq0.b.EnumC4479b.ATTORNEY_AT_LAW);
                                                            case 3003001:
                                                                return new a0.DynamicDocument(rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW);
                                                            default:
                                                                switch (value) {
                                                                    case 7000001:
                                                                        return a0.y0.f107903a;
                                                                    case 7000002:
                                                                        return a0.g1.f107866a;
                                                                    case 7000003:
                                                                        return a0.p0.f107885a;
                                                                    case 7000004:
                                                                        return a0.o0.f107883a;
                                                                    case 7000005:
                                                                        return a0.q0.f107887a;
                                                                    case 7000006:
                                                                        return a0.f1.f107863a;
                                                                    case 7000007:
                                                                        return a0.h1.f107869a;
                                                                    case 7000008:
                                                                        return a0.a1.f107848a;
                                                                    case 7000009:
                                                                        return a0.i0.f107871a;
                                                                    case 7000010:
                                                                        return a0.c.f107852a;
                                                                    case 7000011:
                                                                        return a0.e.f107858a;
                                                                    case 7000012:
                                                                        return a0.d.f107855a;
                                                                    case 7000013:
                                                                        return a0.g0.f107865a;
                                                                    case 7000014:
                                                                        return a0.f0.f107862a;
                                                                    case 7000015:
                                                                        return a0.z0.f107905a;
                                                                    case 7000016:
                                                                        return a0.v0.f107897a;
                                                                    case 7000017:
                                                                        return a0.w0.f107899a;
                                                                    case 7000018:
                                                                        return a0.u0.f107895a;
                                                                    case 7000019:
                                                                        return a0.k.f107874a;
                                                                    case 7000020:
                                                                        return a0.t0.f107893a;
                                                                    case 7000021:
                                                                        return a0.d0.f107856a;
                                                                    case 7000022:
                                                                        return a0.c1.f107854a;
                                                                    case 7000023:
                                                                        return a0.k0.f107875a;
                                                                    case 7000024:
                                                                        return a0.j0.f107873a;
                                                                    case 7000025:
                                                                        return a0.b1.f107851a;
                                                                    case 7000026:
                                                                        return a0.l0.f107877a;
                                                                    case 7000027:
                                                                        return a0.l.f107876a;
                                                                    case 7000028:
                                                                        return a0.r0.f107889a;
                                                                    case 7000029:
                                                                        return a0.b.f107849a;
                                                                    case 7000030:
                                                                        return a0.e1.f107860a;
                                                                    case 7000031:
                                                                        return a0.m0.f107879a;
                                                                    case 7000032:
                                                                        return a0.e0.f107859a;
                                                                    case 7000033:
                                                                        return a0.d1.f107857a;
                                                                    case 7000034:
                                                                        return a0.c0.f107853a;
                                                                    case 7000035:
                                                                        return a0.j.f107872a;
                                                                    default:
                                                                        throw new Exception();
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // co3.i
    public int b(a0 value) throws Exception {
        if (t.c(value, a0.m.f107878a)) {
            return 0;
        }
        if (t.c(value, a0.n.f107880a)) {
            return 1;
        }
        if (t.c(value, a0.o.f107882a)) {
            return 2;
        }
        if (t.c(value, a0.p.f107884a)) {
            return 3;
        }
        if (t.c(value, a0.q.f107886a)) {
            return 4;
        }
        if (t.c(value, a0.r.f107888a)) {
            return 5;
        }
        if (t.c(value, a0.s.f107890a)) {
            return 6;
        }
        if (t.c(value, a0.t.f107892a)) {
            return 7;
        }
        if (t.c(value, a0.u.f107894a)) {
            return 8;
        }
        if (t.c(value, a0.v.f107896a)) {
            return 9;
        }
        if (t.c(value, a0.C2570a0.f107847a)) {
            return 2000;
        }
        if (t.c(value, a0.b0.f107850a)) {
            return 2001;
        }
        if (t.c(value, a0.w.f107898a)) {
            return 3000;
        }
        if (t.c(value, a0.x.f107900a)) {
            return 3001;
        }
        if (t.c(value, a0.y.f107902a)) {
            return 3002;
        }
        if (t.c(value, a0.z.f107904a)) {
            return 1000000;
        }
        if (t.c(value, a0.s0.f107891a)) {
            return 1003000;
        }
        if (t.c(value, a0.h1.f107869a)) {
            return 7000007;
        }
        if (t.c(value, a0.g1.f107866a)) {
            return 7000002;
        }
        if (t.c(value, a0.f1.f107863a)) {
            return 7000006;
        }
        if (t.c(value, a0.y0.f107903a)) {
            return 7000001;
        }
        if (t.c(value, a0.p0.f107885a)) {
            return 7000003;
        }
        if (t.c(value, a0.o0.f107883a)) {
            return 7000004;
        }
        if (t.c(value, a0.q0.f107887a)) {
            return 7000005;
        }
        if (t.c(value, a0.a1.f107848a)) {
            return 7000008;
        }
        if (t.c(value, a0.i0.f107871a)) {
            return 7000009;
        }
        if (t.c(value, a0.c.f107852a)) {
            return 7000010;
        }
        if (t.c(value, a0.e.f107858a)) {
            return 7000011;
        }
        if (t.c(value, a0.d.f107855a)) {
            return 7000012;
        }
        if (t.c(value, a0.g0.f107865a)) {
            return 7000013;
        }
        if (t.c(value, a0.f0.f107862a)) {
            return 7000014;
        }
        if (t.c(value, a0.i.f107870a)) {
            return 1001000;
        }
        if (t.c(value, a0.a.f107846a)) {
            return 3001000;
        }
        if (t.c(value, a0.f.f107861a)) {
            return 1000400;
        }
        if (t.c(value, a0.x0.f107901a)) {
            return 5000000;
        }
        if (t.c(value, a0.z0.f107905a)) {
            return 7000015;
        }
        if (t.c(value, a0.t0.f107893a)) {
            return 7000020;
        }
        if (t.c(value, a0.k.f107874a)) {
            return 7000019;
        }
        if (t.c(value, a0.v0.f107897a)) {
            return 7000016;
        }
        if (t.c(value, a0.w0.f107899a)) {
            return 7000017;
        }
        if (t.c(value, a0.u0.f107895a)) {
            return 7000018;
        }
        if (t.c(value, a0.n0.f107881a)) {
            return 3000000;
        }
        if (t.c(value, a0.h0.f107868a)) {
            return 3000001;
        }
        if (value instanceof a0.DynamicDocument) {
            switch (a.f228256a[((a0.DynamicDocument) value).getDocumentType().ordinal()]) {
                case 1:
                    return 3002000;
                case 2:
                    return 3002001;
                case 3:
                    return 3003000;
                case 4:
                    return 3003001;
                case 5:
                    return 3005000;
                case 6:
                    return 3007000;
                case 7:
                    return 3008000;
                case 8:
                    return 5001000;
                case 9:
                    return 1003;
                case 10:
                    return 1004000;
                case 11:
                    return 3009000;
                case 12:
                    return 3010000;
                case 13:
                    return 5002000;
                case 14:
                    return 5003000;
                case 15:
                    return 5004000;
                case 16:
                    return 5005000;
                case 17:
                    return 5006000;
                case 18:
                    return 5007000;
                case 19:
                    return 5008000;
                case 20:
                    return 3011000;
                case 21:
                    return 3012000;
                default:
                    throw new Exception();
            }
        }
        if (value instanceof a0.DynamicMultiDocument) {
            switch (a.f228257b[((a0.DynamicMultiDocument) value).getDocumentType().ordinal()]) {
                case 1:
                    return 1002000;
                case 2:
                    return 3004000;
                case 3:
                    return 3006000;
                case 4:
                    return 1005000;
                case 5:
                    return 1005001;
                case 6:
                    return 1005002;
                default:
                    throw new Exception();
            }
        }
        if (t.c(value, a0.c1.f107854a)) {
            return 7000022;
        }
        if (t.c(value, a0.d0.f107856a)) {
            return 7000021;
        }
        if (t.c(value, a0.k0.f107875a)) {
            return 7000023;
        }
        if (t.c(value, a0.j0.f107873a)) {
            return 7000024;
        }
        if (t.c(value, a0.b1.f107851a)) {
            return 7000025;
        }
        if (t.c(value, a0.l0.f107877a)) {
            return 7000026;
        }
        if (t.c(value, a0.l.f107876a)) {
            return 7000027;
        }
        if (t.c(value, a0.r0.f107889a)) {
            return 7000028;
        }
        if (t.c(value, a0.b.f107849a)) {
            return 7000029;
        }
        if (t.c(value, a0.e1.f107860a)) {
            return 7000030;
        }
        if (t.c(value, a0.m0.f107879a)) {
            return 7000031;
        }
        if (t.c(value, a0.e0.f107859a)) {
            return 7000032;
        }
        if (t.c(value, a0.d1.f107857a)) {
            return 7000033;
        }
        if (t.c(value, a0.c0.f107853a)) {
            return 7000034;
        }
        if (t.c(value, a0.j.f107872a)) {
            return 7000035;
        }
        throw new p();
    }

    @Override // co3.i
    public r<a0, a0> c(rq0.b documentType, rq0.b identityDocumentType, rq0.b godfatherDocument) throws Exception {
        if (documentType == rq0.b.d.ID_CARD) {
            return y.a(a0.u.f107894a, null);
        }
        if (documentType == rq0.b.d.STUDENT_CARD) {
            return y.a(a0.b0.f107850a, null);
        }
        if (documentType == rq0.b.d.DIIA_REFUGEE_CARD) {
            return y.a(a0.x.f107900a, null);
        }
        if (documentType == rq0.b.d.DRIVING_LICENCE) {
            return y.a(a0.z.f107904a, f(godfatherDocument));
        }
        if (documentType == rq0.b.d.PENSIONER_CARD) {
            return y.a(a0.s0.f107891a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE) {
            return y.a(a0.h1.f107869a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE) {
            return y.a(a0.g1.f107866a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE) {
            return y.a(a0.f1.f107863a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.RASKA_SENIOR_LICENCE) {
            return y.a(a0.y0.f107903a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.OLAWA_RESIDENT_LICENCE) {
            return y.a(a0.p0.f107885a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.OLAWA_FAMILY_LICENCE) {
            return y.a(a0.o0.f107883a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.OLAWA_SENIOR_LICENCE) {
            return y.a(a0.q0.f107887a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.SUCHY_LAS_FAMILY_LICENCE) {
            return y.a(a0.a1.f107848a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE) {
            return y.a(a0.i0.f107871a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.CHELM_FAMILY_LICENCE) {
            return y.a(a0.c.f107852a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.CHELM_SENIOR_LICENCE) {
            return y.a(a0.e.f107858a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.CHELM_RESIDENT_LICENCE) {
            return y.a(a0.d.f107855a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.LODZ_SENIOR_LICENCE) {
            return y.a(a0.g0.f107865a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.LODZ_FAMILY_LICENCE) {
            return y.a(a0.f0.f107862a, a0.o.f107882a);
        }
        if (documentType == rq0.b.d.FAMILY_CARD) {
            return y.a(a0.i.f107870a, a0.o.f107882a);
        }
        if (documentType == rq0.b.d.ADVOCATE_CARD) {
            return y.a(a0.a.f107846a, a0.o.f107882a);
        }
        if (documentType == rq0.b.d.DEPUTY_CARD) {
            return y.a(a0.f.f107861a, a0.o.f107882a);
        }
        if (documentType == rq0.b.d.RAILWAY_CARD) {
            return y.a(a0.x0.f107901a, d(identityDocumentType));
        }
        if (documentType == rq0.b.e.SENATOR_CARD) {
            return y.a(a0.z0.f107905a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.PZPN_LICENCE) {
            return y.a(a0.t0.f107893a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.GIZYCKA_RESIDENT_LICENCE) {
            return y.a(a0.k.f107874a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.RACIBORSKA_RESIDENT_LICENCE) {
            return y.a(a0.v0.f107897a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.RACIBORSKA_SENIOR_LICENCE) {
            return y.a(a0.w0.f107899a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.RACIBORSKA_FAMILY_LICENCE) {
            return y.a(a0.u0.f107895a, a0.o.f107882a);
        }
        if (documentType == rq0.b.d.NURSE_CARD) {
            return y.a(a0.n0.f107881a, e(identityDocumentType));
        }
        if (documentType == rq0.b.d.MIDWIFE_CARD) {
            return y.a(a0.h0.f107868a, e(identityDocumentType));
        }
        if (documentType == rq0.b.e.WROCLAWSKA_SENIOR_LICENCE) {
            return y.a(a0.c1.f107854a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.KOBYLKA_RESIDENT_LICENCE) {
            return y.a(a0.d0.f107856a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.MIEKINIA_SENIOR_LICENCE) {
            return y.a(a0.k0.f107875a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.MIEKINIA_FAMILY_LICENCE) {
            return y.a(a0.j0.f107873a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.TOPR_LICENCE) {
            return y.a(a0.b1.f107851a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.MAZOVIA_LICENCE) {
            return y.a(a0.l0.f107877a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.GENERAL_COUNSEL_LICENCE) {
            return y.a(a0.l.f107876a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.OLECKO_RESIDENT_LICENCE) {
            return y.a(a0.r0.f107889a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE) {
            return y.a(a0.b.f107849a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.WODZISLAW_FAMILY_LICENCE) {
            return y.a(a0.e1.f107860a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.MICHALOWICE_RESIDENT_LICENCE) {
            return y.a(a0.m0.f107879a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE) {
            return y.a(a0.e0.f107859a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.WISLA_RESIDENT_LICENCE) {
            return y.a(a0.d1.f107857a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE) {
            return y.a(a0.c0.f107853a, a0.o.f107882a);
        }
        if (documentType == rq0.b.e.FIREFIGHTER_OSP_LICENCE) {
            return y.a(a0.j.f107872a, a0.o.f107882a);
        }
        if (documentType instanceof rq0.b.EnumC4479b) {
            return y.a(new a0.DynamicDocument((rq0.b.EnumC4479b) documentType), e(identityDocumentType));
        }
        if (documentType instanceof rq0.b.c) {
            return y.a(new a0.DynamicMultiDocument((rq0.b.c) documentType), e(identityDocumentType));
        }
        throw new Exception("Scope for: " + documentType + " it's not defined yet.");
    }
}
