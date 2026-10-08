package a44;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"La44/i0;", "Lq34/i0;", "<init>", "()V", "Lrq0/b$e;", "type", "", "name", "Lk34/g$p;", "wruCardType", "Lk34/g$q;", "e", "(Lrq0/b$e;ILk34/g$p;)Lk34/g$q;", "d", "(Lk34/g$p;)I", "Lq34/i0$a;", "params", "Lk34/g;", "f", "(Lq34/i0$a;Ltq/e;)Ljava/lang/Object;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 implements q34.i0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3092a;

        static {
            int[] iArr = new int[k34.g.p.values().length];
            try {
                iArr[k34.g.p.SENATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k34.g.p.FAMILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k34.g.p.PZPN_COACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3092a = iArr;
        }
    }

    private final int d(k34.g.p pVar) {
        int i15 = a.f3092a[pVar.ordinal()];
        if (i15 == 1) {
            return jz.a.f106739b3;
        }
        if (i15 != 2) {
            return i15 != 3 ? jz.a.f106755d3 : jz.a.f106755d3;
        }
        return jz.a.f106801j3;
    }

    private final k34.g.q e(rq0.b.e type, int name, k34.g.p wruCardType) {
        return new k34.g.q(type, name, wruCardType, d(wruCardType));
    }

    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(q34.i0.Params params, tq.e<? super k34.g> eVar) {
        rq0.b documentType = params.getDocumentType();
        if (documentType == rq0.b.d.ID_CARD) {
            return new k34.g.h(jz.a.K2, f34.a.J);
        }
        if (documentType == rq0.b.d.DRIVING_LICENCE) {
            return new k34.g.d(jz.a.M2, f34.a.C, f34.a.B);
        }
        if (documentType == rq0.b.d.VEHICLE_CARD) {
            return new k34.g.o(jz.a.N2, f34.a.B0);
        }
        if (documentType == rq0.b.d.FAMILY_CARD) {
            return new k34.g.C2571g(jz.a.O2, f34.a.Q);
        }
        if (documentType == rq0.b.d.DIIA_REFUGEE_CARD) {
            return new k34.g.c(jz.a.U2, f34.a.f59050y);
        }
        if (documentType == rq0.b.d.SCHOOL_CARD) {
            return new k34.g.m(jz.a.P2, f34.a.f59025l0);
        }
        if (documentType == rq0.b.d.STUDENT_CARD) {
            return new k34.g.n(jz.a.Q2, f34.a.f59045v0);
        }
        if (documentType == rq0.b.d.RAILWAY_CARD) {
            return new k34.g.l(jz.a.T2, f34.a.A0, vq.b.e(f34.a.f59053z0));
        }
        if (documentType == rq0.b.d.PENSIONER_CARD) {
            return new k34.g.k(jz.a.L2, f34.a.f59009d0);
        }
        if (documentType == rq0.b.d.DEPUTY_CARD) {
            return new k34.g.b(jz.a.S2, f34.a.f59048x);
        }
        if (documentType == rq0.b.d.ADVOCATE_CARD) {
            return new k34.g.a(jz.a.R2, f34.a.f59028n);
        }
        if (documentType == rq0.b.d.MIDWIFE_CARD) {
            return new k34.g.i(jz.a.W2, f34.a.T);
        }
        if (documentType == rq0.b.d.NURSE_CARD) {
            return new k34.g.j(jz.a.V2, f34.a.Y);
        }
        rq0.b.e eVar2 = rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
        if (documentType == eVar2) {
            return e(eVar2, f34.a.H0, k34.g.p.CITY);
        }
        rq0.b.e eVar3 = rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE;
        if (documentType == eVar3) {
            return e(eVar3, f34.a.W, k34.g.p.FAMILY);
        }
        rq0.b.e eVar4 = rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE;
        if (documentType == eVar4) {
            return e(eVar4, f34.a.G0, k34.g.p.SENIOR);
        }
        rq0.b.e eVar5 = rq0.b.e.RASKA_SENIOR_LICENCE;
        if (documentType == eVar5) {
            return e(eVar5, f34.a.f59023k0, k34.g.p.SENIOR);
        }
        rq0.b.e eVar6 = rq0.b.e.OLAWA_RESIDENT_LICENCE;
        if (documentType == eVar6) {
            return e(eVar6, f34.a.f59003a0, k34.g.p.CITY);
        }
        rq0.b.e eVar7 = rq0.b.e.OLAWA_FAMILY_LICENCE;
        if (documentType == eVar7) {
            return e(eVar7, f34.a.Z, k34.g.p.FAMILY);
        }
        rq0.b.e eVar8 = rq0.b.e.OLAWA_SENIOR_LICENCE;
        if (documentType == eVar8) {
            return e(eVar8, f34.a.f59005b0, k34.g.p.SENIOR);
        }
        rq0.b.e eVar9 = rq0.b.e.SUCHY_LAS_FAMILY_LICENCE;
        if (documentType == eVar9) {
            return e(eVar9, f34.a.L, k34.g.p.FAMILY);
        }
        rq0.b.e eVar10 = rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
        if (documentType == eVar10) {
            return e(eVar10, f34.a.f59024l, k34.g.p.TOURIST);
        }
        rq0.b.e eVar11 = rq0.b.e.CHELM_FAMILY_LICENCE;
        if (documentType == eVar11) {
            return e(eVar11, f34.a.f59038s, k34.g.p.FAMILY);
        }
        rq0.b.e eVar12 = rq0.b.e.CHELM_SENIOR_LICENCE;
        if (documentType == eVar12) {
            return e(eVar12, f34.a.f59042u, k34.g.p.SENIOR);
        }
        rq0.b.e eVar13 = rq0.b.e.CHELM_RESIDENT_LICENCE;
        if (documentType == eVar13) {
            return e(eVar13, f34.a.f59040t, k34.g.p.CITY);
        }
        rq0.b.e eVar14 = rq0.b.e.LODZ_SENIOR_LICENCE;
        if (documentType == eVar14) {
            return e(eVar14, f34.a.O, k34.g.p.SENIOR);
        }
        rq0.b.e eVar15 = rq0.b.e.LODZ_FAMILY_LICENCE;
        if (documentType == eVar15) {
            return e(eVar15, f34.a.D0, k34.g.p.FAMILY);
        }
        rq0.b.e eVar16 = rq0.b.e.SENATOR_CARD;
        if (documentType == eVar16) {
            return e(eVar16, f34.a.f59027m0, k34.g.p.SENATOR);
        }
        rq0.b.e eVar17 = rq0.b.e.PZPN_LICENCE;
        if (documentType == eVar17) {
            return e(eVar17, f34.a.f59044v, k34.g.p.PZPN_COACH);
        }
        rq0.b.e eVar18 = rq0.b.e.GIZYCKA_RESIDENT_LICENCE;
        if (documentType == eVar18) {
            return e(eVar18, f34.a.I, k34.g.p.CITY);
        }
        rq0.b.e eVar19 = rq0.b.e.RACIBORSKA_RESIDENT_LICENCE;
        if (documentType == eVar19) {
            return e(eVar19, f34.a.f59019i0, k34.g.p.CITY);
        }
        rq0.b.e eVar20 = rq0.b.e.RACIBORSKA_SENIOR_LICENCE;
        if (documentType == eVar20) {
            return e(eVar20, f34.a.f59021j0, k34.g.p.SENIOR);
        }
        rq0.b.e eVar21 = rq0.b.e.RACIBORSKA_FAMILY_LICENCE;
        if (documentType == eVar21) {
            return e(eVar21, f34.a.f59017h0, k34.g.p.FAMILY);
        }
        rq0.b.e eVar22 = rq0.b.e.WROCLAWSKA_SENIOR_LICENCE;
        if (documentType == eVar22) {
            return e(eVar22, f34.a.F0, k34.g.p.SENIOR);
        }
        rq0.b.e eVar23 = rq0.b.e.KOBYLKA_RESIDENT_LICENCE;
        if (documentType == eVar23) {
            return e(eVar23, f34.a.M, k34.g.p.CITY);
        }
        rq0.b.e eVar24 = rq0.b.e.MIEKINIA_SENIOR_LICENCE;
        if (documentType == eVar24) {
            return e(eVar24, f34.a.V, k34.g.p.SENIOR);
        }
        rq0.b.e eVar25 = rq0.b.e.MIEKINIA_FAMILY_LICENCE;
        if (documentType == eVar25) {
            return e(eVar25, f34.a.U, k34.g.p.FAMILY);
        }
        rq0.b.e eVar26 = rq0.b.e.TOPR_LICENCE;
        if (documentType == eVar26) {
            return e(eVar26, f34.a.f59049x0, k34.g.p.UNIVERSAL);
        }
        rq0.b.e eVar27 = rq0.b.e.MAZOVIA_LICENCE;
        if (documentType == eVar27) {
            return e(eVar27, f34.a.R, k34.g.p.UNIVERSAL);
        }
        rq0.b.e eVar28 = rq0.b.e.GENERAL_COUNSEL_LICENCE;
        if (documentType == eVar28) {
            return e(eVar28, f34.a.H, k34.g.p.UNIVERSAL);
        }
        rq0.b.e eVar29 = rq0.b.e.OLECKO_RESIDENT_LICENCE;
        if (documentType == eVar29) {
            return e(eVar29, f34.a.f59007c0, k34.g.p.CITY);
        }
        rq0.b.e eVar30 = rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE;
        if (documentType == eVar30) {
            return e(eVar30, f34.a.f59034q, k34.g.p.FAMILY);
        }
        rq0.b.e eVar31 = rq0.b.e.WODZISLAW_FAMILY_LICENCE;
        if (documentType == eVar31) {
            return e(eVar31, f34.a.E0, k34.g.p.FAMILY);
        }
        rq0.b.e eVar32 = rq0.b.e.MICHALOWICE_RESIDENT_LICENCE;
        if (documentType == eVar32) {
            return e(eVar32, f34.a.S, k34.g.p.CITY);
        }
        rq0.b.e eVar33 = rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE;
        if (documentType == eVar33) {
            return e(eVar33, f34.a.N, k34.g.p.UNIVERSAL);
        }
        rq0.b.e eVar34 = rq0.b.e.WISLA_RESIDENT_LICENCE;
        if (documentType == eVar34) {
            return e(eVar34, f34.a.C0, k34.g.p.CITY);
        }
        rq0.b.e eVar35 = rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE;
        if (documentType == eVar35) {
            return e(eVar35, f34.a.K, k34.g.p.CITY);
        }
        rq0.b.e eVar36 = rq0.b.e.FIREFIGHTER_OSP_LICENCE;
        if (documentType == eVar36) {
            return e(eVar36, f34.a.G, k34.g.p.UNIVERSAL);
        }
        rq0.b.EnumC4479b enumC4479b = rq0.b.EnumC4479b.DOCTOR;
        if (documentType == enumC4479b) {
            return new k34.g.e(f34.a.A, jz.a.X2, enumC4479b);
        }
        rq0.b.EnumC4479b enumC4479b2 = rq0.b.EnumC4479b.DENTIST;
        if (documentType == enumC4479b2) {
            return new k34.g.e(f34.a.f59046w, jz.a.Y2, enumC4479b2);
        }
        rq0.b.EnumC4479b enumC4479b3 = rq0.b.EnumC4479b.ATTORNEY_AT_LAW;
        if (documentType == enumC4479b3) {
            return new k34.g.e(f34.a.f59026m, jz.a.Z2, enumC4479b3);
        }
        rq0.b.EnumC4479b enumC4479b4 = rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW;
        if (documentType == enumC4479b4) {
            return new k34.g.e(f34.a.f59051y0, jz.a.Z2, enumC4479b4);
        }
        rq0.b.EnumC4479b enumC4479b5 = rq0.b.EnumC4479b.CIVIL_ENGINEER;
        if (documentType == enumC4479b5) {
            return new k34.g.e(f34.a.f59036r, jz.a.f106755d3, enumC4479b5);
        }
        rq0.b.EnumC4479b enumC4479b6 = rq0.b.EnumC4479b.TAX_ADVISOR;
        if (documentType == enumC4479b6) {
            return new k34.g.e(f34.a.I0, jz.a.f106771f3, enumC4479b6);
        }
        rq0.b.EnumC4479b enumC4479b7 = rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
        if (documentType == enumC4479b7) {
            return new k34.g.e(f34.a.f59025l0, jz.a.P2, enumC4479b7);
        }
        rq0.b.c cVar = rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD;
        if (documentType == cVar) {
            return new k34.g.f(f34.a.f59052z, jz.a.f106731a3, cVar);
        }
        rq0.b.c cVar2 = rq0.b.c.TEACHER;
        if (documentType == cVar2) {
            return new k34.g.f(f34.a.f59047w0, jz.a.f106747c3, cVar2);
        }
        rq0.b.c cVar3 = rq0.b.c.BAILIFF_CARD;
        if (documentType == cVar3) {
            return new k34.g.f(f34.a.f59032p, jz.a.f106763e3, cVar3);
        }
        rq0.b.c cVar4 = rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION;
        if (documentType == cVar4) {
            return new k34.g.f(f34.a.F, jz.a.f106899x3, cVar4);
        }
        rq0.b.c cVar5 = rq0.b.c.ELECTRONIC_DIPLOMA_PHD;
        if (documentType == cVar5) {
            return new k34.g.f(f34.a.E, jz.a.f106892w3, cVar5);
        }
        rq0.b.c cVar6 = rq0.b.c.ELECTRONIC_DIPLOMA_DSC;
        if (documentType == cVar6) {
            return new k34.g.f(f34.a.D, jz.a.f106906y3, cVar6);
        }
        rq0.b.EnumC4479b enumC4479b8 = rq0.b.EnumC4479b.AUDITOR;
        if (documentType == enumC4479b8) {
            return new k34.g.e(f34.a.f59030o, jz.a.f106794i3, enumC4479b8);
        }
        rq0.b.EnumC4479b enumC4479b9 = rq0.b.EnumC4479b.SOLIDARITY_CARD;
        if (documentType == enumC4479b9) {
            return new k34.g.e(f34.a.f59031o0, jz.a.f106808k3, enumC4479b9);
        }
        rq0.b.EnumC4479b enumC4479b10 = rq0.b.EnumC4479b.PHD_STUDENT;
        if (documentType == enumC4479b10) {
            return new k34.g.e(f34.a.f59013f0, jz.a.f106815l3, enumC4479b10);
        }
        rq0.b.EnumC4479b enumC4479b11 = rq0.b.EnumC4479b.PHYSIOTHERAPIST;
        if (documentType == enumC4479b11) {
            return new k34.g.e(f34.a.f59015g0, jz.a.f106822m3, enumC4479b11);
        }
        rq0.b.EnumC4479b enumC4479b12 = rq0.b.EnumC4479b.PHARMACIST;
        if (documentType == enumC4479b12) {
            return new k34.g.e(f34.a.f59011e0, jz.a.f106829n3, enumC4479b12);
        }
        rq0.b.EnumC4479b enumC4479b13 = rq0.b.EnumC4479b.SHOOTING_LICENCE;
        if (documentType == enumC4479b13) {
            return new k34.g.e(f34.a.f59029n0, jz.a.f106878u3, enumC4479b13);
        }
        rq0.b.EnumC4479b enumC4479b14 = rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE;
        if (documentType == enumC4479b14) {
            return new k34.g.e(f34.a.f59035q0, jz.a.f106857r3, enumC4479b14);
        }
        rq0.b.EnumC4479b enumC4479b15 = rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE;
        if (documentType == enumC4479b15) {
            return new k34.g.e(f34.a.f59033p0, jz.a.f106864s3, enumC4479b15);
        }
        rq0.b.EnumC4479b enumC4479b16 = rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
        if (documentType == enumC4479b16) {
            return new k34.g.e(f34.a.f59037r0, jz.a.f106871t3, enumC4479b16);
        }
        rq0.b.EnumC4479b enumC4479b17 = rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
        if (documentType == enumC4479b17) {
            return new k34.g.e(f34.a.f59043u0, jz.a.f106843p3, enumC4479b17);
        }
        rq0.b.EnumC4479b enumC4479b18 = rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
        if (documentType == enumC4479b18) {
            return new k34.g.e(f34.a.f59041t0, jz.a.f106850q3, enumC4479b18);
        }
        rq0.b.EnumC4479b enumC4479b19 = rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
        if (documentType == enumC4479b19) {
            return new k34.g.e(f34.a.f59039s0, jz.a.f106885v3, enumC4479b19);
        }
        rq0.b.EnumC4479b enumC4479b20 = rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN;
        if (documentType == enumC4479b20) {
            return new k34.g.e(f34.a.P, jz.a.f106836o3, enumC4479b20);
        }
        rq0.b.EnumC4479b enumC4479b21 = rq0.b.EnumC4479b.PENSIONER_MSWIA;
        if (documentType == enumC4479b21) {
            return new k34.g.e(f34.a.X, jz.a.f106779g3, enumC4479b21);
        }
        if (documentType == rq0.b.d.DIIA_REFUGEE_CHILD_CARD || documentType == rq0.b.EnumC4479b.DEFAULT || documentType == rq0.b.c.DEFAULT) {
            return null;
        }
        throw new oq.p();
    }
}
