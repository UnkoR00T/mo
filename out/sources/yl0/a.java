package yl0;

import bl0.BEChildBirthApplicationResponse;
import bl0.BEChildBirthChildData;
import bl0.BEChildBirthParents;
import bl0.BEChildBirthPlaceOfBirthOffices;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationApplicantAddress;
import bl0.BEChildBirthRegistrationAuthority;
import bl0.BEChildBirthRegistrationBirth;
import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEChildBirthRegistrationInitial;
import bl0.BEChildBirthRegistrationMarital;
import bl0.BEChildBirthRegistrationMunicipalOffice;
import bl0.BEChildBirthRegistrationSubmitApplication;
import bl0.BEChildBirthRegistrationSubmitApplicationXml;
import bl0.BEGeneratedXmlChildBirth;
import bl0.d;
import bl0.g;
import bl0.m;
import bl0.s;
import bl0.t;
import dx.b;
import dx.i;
import dx.j;
import gm0.ChildBirthRegistrationAddressCityDto;
import gm0.ChildBirthRegistrationAddressCommunityDto;
import gm0.ChildBirthRegistrationAddressCountyDto;
import gm0.ChildBirthRegistrationAddressDataDto;
import gm0.ChildBirthRegistrationAddressStreetDto;
import gm0.ChildBirthRegistrationAddressVoivodeshipDto;
import gm0.ChildBirthRegistrationAuthorityDataDto;
import gm0.ChildBirthRegistrationBirthDataDto;
import gm0.ChildBirthRegistrationCivilRegistryOfficesOfficeDto;
import gm0.ChildBirthRegistrationCivilRegistryOfficesResponse;
import gm0.ChildBirthRegistrationGenerateXmlBirthCertificateData;
import gm0.ChildBirthRegistrationGenerateXmlChildAddress;
import gm0.ChildBirthRegistrationGenerateXmlChildAddressDetailsData;
import gm0.ChildBirthRegistrationGenerateXmlChildBirthPlace;
import gm0.ChildBirthRegistrationGenerateXmlChildData;
import gm0.ChildBirthRegistrationGenerateXmlCityTerytName;
import gm0.ChildBirthRegistrationGenerateXmlCommunityTerytName;
import gm0.ChildBirthRegistrationGenerateXmlCountyTerytName;
import gm0.ChildBirthRegistrationGenerateXmlDocumentReceivedAddress;
import gm0.ChildBirthRegistrationGenerateXmlDocumentReceivedAddressContactAddress;
import gm0.ChildBirthRegistrationGenerateXmlDocumentRegistrationOfficeCode;
import gm0.ChildBirthRegistrationGenerateXmlMaritalData;
import gm0.ChildBirthRegistrationGenerateXmlParentsData;
import gm0.ChildBirthRegistrationGenerateXmlParentsDataApplicantData;
import gm0.ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData;
import gm0.ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber;
import gm0.ChildBirthRegistrationGenerateXmlParentsDataSecondParentData;
import gm0.ChildBirthRegistrationGenerateXmlParentsDataSecondParentDataPersonalDetailsData;
import gm0.ChildBirthRegistrationGenerateXmlRequest;
import gm0.ChildBirthRegistrationGenerateXmlResponse;
import gm0.ChildBirthRegistrationGenerateXmlStreetTerytName;
import gm0.ChildBirthRegistrationGenerateXmlVoivodeshipTerytName;
import gm0.ChildBirthRegistrationInitialDataResponse;
import gm0.ChildBirthRegistrationMaritalDataDto;
import gm0.ChildBirthRegistrationMunicipalOfficesOfficeDto;
import gm0.ChildBirthRegistrationMunicipalOfficesResponse;
import gm0.ChildBirthRegistrationSubmitApplicationRequest;
import gm0.ChildBirthRegistrationSubmitApplicationResponse;
import gm0.ChildBirthRegistrationSubmitApplicationResponseResultDto;
import gm0.ChildBirthRegistrationSubmitApplicationXmlDataDto;
import gm0.ChildBirthRegistrationTemporaryAddressDataDto;
import gm0.GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse;
import gm0.e0;
import gm0.g2;
import gm0.i1;
import gm0.m0;
import gm0.s0;
import gm0.v2;
import gm0.w0;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import px.f;
import xw.PhoneNumber;
import xw.c;
import xw.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0001*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&\u001a#\u0010-\u001a\u00020,*\u00020'2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b-\u0010.\u001a\u0011\u00100\u001a\u00020/*\u00020(¢\u0006\u0004\b0\u00101\u001a#\u00107\u001a\u000206*\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u000b2\u0006\u00105\u001a\u000204¢\u0006\u0004\b7\u00108\u001a\u0019\u0010:\u001a\u000209*\u0002042\u0006\u00103\u001a\u00020\u000b¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010H\u001a\u00020G*\u0004\u0018\u00010D2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010K\u001a\u00020J*\u00020E¢\u0006\u0004\bK\u0010L\u001a\u0019\u0010P\u001a\u00020O*\u00020M2\u0006\u0010N\u001a\u00020\u000b¢\u0006\u0004\bP\u0010Q\u001a\u0013\u0010S\u001a\u0004\u0018\u00010R*\u00020*¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010W\u001a\u00020V*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u001b*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0011\u0010^\u001a\u00020Z*\u00020]¢\u0006\u0004\b^\u0010_\u001a\u0011\u0010b\u001a\u00020a*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u001d\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020i0\u0001*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u001d\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020m0\u0001*\u00020l¢\u0006\u0004\bn\u0010o\u001a\u001d\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020q0\u0001*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0013\u0010v\u001a\u0004\u0018\u00010u*\u00020t¢\u0006\u0004\bv\u0010w¨\u0006x"}, d2 = {"Lgm0/b1;", "Ldx/i;", "Ldx/b;", "Lbl0/n;", "e", "(Lgm0/b1;)Ldx/i;", "Lgm0/y;", "Lbl0/k;", "d", "(Lgm0/y;)Ldx/i;", "Lgm0/g2;", "Lxw/e;", "A", "(Lgm0/g2;)Ldx/i;", "Lgm0/x;", "Lbl0/j;", "a", "(Lgm0/x;)Lbl0/j;", "Lgm0/c1;", "Lbl0/o;", "f", "(Lgm0/c1;)Ldx/i;", "Lgm0/v2;", "Lbl0/c;", "j", "(Lgm0/v2;)Ldx/i;", "Lgm0/e1;", "", "Lbl0/p;", "l", "(Lgm0/e1;)Ljava/util/List;", "Lgm0/a0;", "Lbl0/l;", "b", "(Lgm0/a0;)Lbl0/l;", "Lbl0/h;", "Lgm0/x0;", "x", "(Lbl0/h;)Lgm0/x0;", "Lbl0/h$a;", "Lbl0/m;", "contactData", "Lbl0/e;", "parentData", "Lgm0/q0;", "t", "(Lbl0/h$a;Lbl0/m;Lbl0/e;)Lgm0/q0;", "Lgm0/r0;", "u", "(Lbl0/m;)Lgm0/r0;", "Lbl0/h$d;", "firstParentGender", "Lbl0/s;", "typeAddressChild", "Lgm0/c0;", "m", "(Lbl0/h$d;Lxw/e;Lbl0/s;)Lgm0/c0;", "Lgm0/e0;", "n", "(Lbl0/s;Lxw/e;)Lgm0/e0;", "Lbl0/h$b;", "Lgm0/f0;", "o", "(Lbl0/h$b;)Lgm0/f0;", "Lbl0/b;", "Lgm0/g0;", "p", "(Lbl0/b;)Lgm0/g0;", "Lbl0/h$e;", "Lbl0/g;", "receivedDocumentsMethod", "Lgm0/k0;", "q", "(Lbl0/h$e;Lbl0/g;)Lgm0/k0;", "Lgm0/m0;", "r", "(Lbl0/g;)Lgm0/m0;", "Lbl0/d;", "gender", "Lgm0/w0;", "w", "(Lbl0/d;Lxw/e;)Lgm0/w0;", "Lgm0/u0;", "v", "(Lbl0/e;)Lgm0/u0;", "Lbl0/f;", "Lgm0/n0;", "s", "(Lbl0/f;)Lgm0/n0;", "Lgm0/y0;", "Lbl0/u;", "k", "(Lgm0/y0;)Ljava/util/List;", "Lgm0/m2;", "c", "(Lgm0/m2;)Lbl0/u;", "Lbl0/q;", "Lgm0/f1;", "y", "(Lbl0/q;)Lgm0/f1;", "Lbl0/r;", "Lgm0/j1;", "z", "(Lbl0/r;)Lgm0/j1;", "Lgm0/g1;", "Lbl0/a;", "g", "(Lgm0/g1;)Ldx/i;", "Lgm0/h1;", "Lbl0/a$a;", "h", "(Lgm0/h1;)Ldx/i;", "Lgm0/i1;", "Lbl0/t;", "i", "(Lgm0/i1;)Ldx/i;", "Liy/b0;", "", "B", "(Liy/b0;)Ljava/lang/String;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: yl0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6106a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f227627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f227628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f227629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f227630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f227631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f227632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f227633g;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f227627a = iArr;
            int[] iArr2 = new int[v2.values().length];
            try {
                iArr2[v2.MARRIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[v2.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[v2.DIVORCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[v2.WIDOWED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[v2.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f227628b = iArr2;
            int[] iArr3 = new int[e.values().length];
            try {
                iArr3[e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f227629c = iArr3;
            int[] iArr4 = new int[s.values().length];
            try {
                iArr4[s.MyPermanentAddress.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[s.MyTemporaryAddress.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[s.PermanentFatherAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[s.TemporaryFatherAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[s.PermanentMotherAddress.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[s.TemporaryMotherAddress.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[s.MeAndMotherAreNotRegistered.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[s.MeAndFatherAreNotRegistered.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[s.IAmNotRegistered.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[s.DoesNotRegisterChild.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            f227630d = iArr4;
            int[] iArr5 = new int[g.values().length];
            try {
                iArr5[g.InOffice.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[g.MyEdorBox.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[g.MyRegisteredAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[g.SpecifiedAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            f227631e = iArr5;
            int[] iArr6 = new int[d.values().length];
            try {
                iArr6[d.InMarriage.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[d.NoMarriageAndAcceptChild.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[d.NoMarriageAndNoAcceptChild.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[d.MarriageEnded.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            f227632f = iArr6;
            int[] iArr7 = new int[i1.values().length];
            try {
                iArr7[i1.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[i1.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[i1.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f227633g = iArr7;
        }
    }

    public static final i<b, e> A(g2 g2Var) {
        Object objB;
        e eVar;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C6106a.f227627a[g2Var.ordinal()];
                    if (i15 == 1) {
                        eVar = e.MALE;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new b.Generic(new IllegalStateException(g2Var + " is not supported")));
                            throw new oq.g();
                        }
                        eVar = e.FEMALE;
                    }
                    return new i.Right(eVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final String B(b0 b0Var) {
        b0 b0VarC = c0.c(b0Var);
        if (b0VarC != null) {
            return c0.e(b0VarC);
        }
        return null;
    }

    public static final BEChildBirthRegistrationAuthority a(ChildBirthRegistrationAuthorityDataDto childBirthRegistrationAuthorityDataDto) {
        String civilStatusOfficeNumber = childBirthRegistrationAuthorityDataDto.getCivilStatusOfficeNumber();
        String officeType = childBirthRegistrationAuthorityDataDto.getOfficeType();
        String territorialCode = childBirthRegistrationAuthorityDataDto.getTerritorialCode();
        String place = childBirthRegistrationAuthorityDataDto.getPlace();
        return new BEChildBirthRegistrationAuthority(civilStatusOfficeNumber, officeType, territorialCode, place != null ? c0.g(place) : null);
    }

    public static final BEChildBirthRegistrationCivilRegistryOffices b(ChildBirthRegistrationCivilRegistryOfficesResponse childBirthRegistrationCivilRegistryOfficesResponse) {
        List<ChildBirthRegistrationCivilRegistryOfficesOfficeDto> listB = childBirthRegistrationCivilRegistryOfficesResponse.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        for (ChildBirthRegistrationCivilRegistryOfficesOfficeDto childBirthRegistrationCivilRegistryOfficesOfficeDto : listB) {
            arrayList.add(new BEChildBirthRegistrationCivilRegistryOffices.Office(childBirthRegistrationCivilRegistryOfficesOfficeDto.getName(), childBirthRegistrationCivilRegistryOfficesOfficeDto.getOfficeCode()));
        }
        List<ChildBirthRegistrationCivilRegistryOfficesOfficeDto> listA = childBirthRegistrationCivilRegistryOfficesResponse.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        for (ChildBirthRegistrationCivilRegistryOfficesOfficeDto childBirthRegistrationCivilRegistryOfficesOfficeDto2 : listA) {
            arrayList2.add(new BEChildBirthRegistrationCivilRegistryOffices.Office(childBirthRegistrationCivilRegistryOfficesOfficeDto2.getName(), childBirthRegistrationCivilRegistryOfficesOfficeDto2.getOfficeCode()));
        }
        return new BEChildBirthRegistrationCivilRegistryOffices(arrayList, arrayList2);
    }

    public static final BEGeneratedXmlChildBirth c(GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse generatedXmlDtoChildBirthRegistrationGenerateXmlResponse) {
        b0 b0VarB = ry.a.b(c0.g(generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.getBase64Xml()));
        b0 b0VarG = c0.g(generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.getChildFirstName());
        String childSecondName = generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.getChildSecondName();
        return new BEGeneratedXmlChildBirth(b0VarB, b0VarG, c0.g(generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.getChildSurname()), c0.g(generatedXmlDtoChildBirthRegistrationGenerateXmlResponse.getXmlId()), childSecondName != null ? c0.g(childSecondName) : null, null);
    }

    public static final i<b, BEChildBirthRegistrationBirth> d(ChildBirthRegistrationBirthDataDto childBirthRegistrationBirthDataDto) {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    fz.b.LocalDate localDate = new fz.b.LocalDate(childBirthRegistrationBirthDataDto.getDate());
                    e eVar = (e) aVar.a(A(childBirthRegistrationBirthDataDto.getGender()));
                    b0 b0VarG = c0.g(childBirthRegistrationBirthDataDto.getPlace());
                    String certificateNumber = childBirthRegistrationBirthDataDto.getCertificateNumber();
                    b0 b0VarG2 = certificateNumber != null ? c0.g(certificateNumber) : null;
                    ChildBirthRegistrationAuthorityDataDto registrationAuthority = childBirthRegistrationBirthDataDto.getRegistrationAuthority();
                    return new i.Right(new BEChildBirthRegistrationBirth(localDate, eVar, b0VarG, b0VarG2, registrationAuthority != null ? a(registrationAuthority) : null));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<b, BEChildBirthRegistrationInitial> e(ChildBirthRegistrationInitialDataResponse childBirthRegistrationInitialDataResponse) {
        Object objB;
        BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress;
        BEChildBirthRegistrationApplicantAddress bEChildBirthRegistrationApplicantAddress2;
        LocalDate dateEnd;
        String territorialCode;
        String territorialCode2;
        String territorialCode3;
        String addressServiceId;
        String territorialCode4;
        String territorialCode5;
        String territorialCode6;
        String territorialCode7;
        String addressServiceId2;
        String territorialCode8;
        i<b, BEChildBirthRegistrationMarital> iVarF;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEChildBirthRegistrationBirth bEChildBirthRegistrationBirth = (BEChildBirthRegistrationBirth) aVar.a(d(childBirthRegistrationInitialDataResponse.getBirth()));
                    b0 b0VarG = c0.g(childBirthRegistrationInitialDataResponse.getFamilyName());
                    b0 b0VarG2 = c0.g(childBirthRegistrationInitialDataResponse.getFirstName());
                    b0 b0VarG3 = c0.g(childBirthRegistrationInitialDataResponse.getNationality());
                    b0 b0VarC = xw.g.c(c0.g(childBirthRegistrationInitialDataResponse.getPesel()));
                    b0 b0VarG4 = c0.g(childBirthRegistrationInitialDataResponse.getSurname());
                    String followingNames = childBirthRegistrationInitialDataResponse.getFollowingNames();
                    fz.b.LocalDate localDate = null;
                    b0 b0VarG5 = followingNames != null ? c0.g(followingNames) : null;
                    ChildBirthRegistrationMaritalDataDto maritalData = childBirthRegistrationInitialDataResponse.getMaritalData();
                    BEChildBirthRegistrationMarital bEChildBirthRegistrationMarital = (maritalData == null || (iVarF = f(maritalData)) == null) ? null : (BEChildBirthRegistrationMarital) aVar.a(iVarF);
                    ChildBirthRegistrationAddressDataDto permanentAddress = childBirthRegistrationInitialDataResponse.getPermanentAddress();
                    if (permanentAddress != null) {
                        String apartmentNumber = permanentAddress.getApartmentNumber();
                        b0 b0VarG6 = apartmentNumber != null ? c0.g(apartmentNumber) : null;
                        ChildBirthRegistrationAddressCityDto city = permanentAddress.getCity();
                        b0 b0VarG7 = (city == null || (territorialCode8 = city.getTerritorialCode()) == null) ? null : c0.g(territorialCode8);
                        ChildBirthRegistrationAddressCommunityDto community = permanentAddress.getCommunity();
                        b0 b0VarG8 = (community == null || (addressServiceId2 = community.getAddressServiceId()) == null) ? null : c0.g(addressServiceId2);
                        ChildBirthRegistrationAddressCountyDto county = permanentAddress.getCounty();
                        b0 b0VarG9 = (county == null || (territorialCode7 = county.getTerritorialCode()) == null) ? null : c0.g(territorialCode7);
                        String houseNumber = permanentAddress.getHouseNumber();
                        b0 b0VarG10 = houseNumber != null ? c0.g(houseNumber) : null;
                        String postCode = permanentAddress.getPostCode();
                        b0 b0VarG11 = postCode != null ? c0.g(postCode) : null;
                        ChildBirthRegistrationAddressStreetDto street = permanentAddress.getStreet();
                        b0 b0VarG12 = (street == null || (territorialCode6 = street.getTerritorialCode()) == null) ? null : c0.g(territorialCode6);
                        ChildBirthRegistrationAddressVoivodeshipDto voivodeship = permanentAddress.getVoivodeship();
                        bEChildBirthRegistrationApplicantAddress = new BEChildBirthRegistrationApplicantAddress(b0VarG6, b0VarG7, b0VarG8, b0VarG9, b0VarG10, b0VarG11, b0VarG12, (voivodeship == null || (territorialCode5 = voivodeship.getTerritorialCode()) == null) ? null : c0.g(territorialCode5));
                    } else {
                        bEChildBirthRegistrationApplicantAddress = null;
                    }
                    String secondName = childBirthRegistrationInitialDataResponse.getSecondName();
                    b0 b0VarG13 = secondName != null ? c0.g(secondName) : null;
                    ChildBirthRegistrationTemporaryAddressDataDto temporaryAddressData = childBirthRegistrationInitialDataResponse.getTemporaryAddressData();
                    if (temporaryAddressData != null) {
                        String apartmentNumber2 = temporaryAddressData.getApartmentNumber();
                        b0 b0VarG14 = apartmentNumber2 != null ? c0.g(apartmentNumber2) : null;
                        ChildBirthRegistrationAddressCityDto city2 = temporaryAddressData.getCity();
                        b0 b0VarG15 = (city2 == null || (territorialCode4 = city2.getTerritorialCode()) == null) ? null : c0.g(territorialCode4);
                        ChildBirthRegistrationAddressCommunityDto community2 = temporaryAddressData.getCommunity();
                        b0 b0VarG16 = (community2 == null || (addressServiceId = community2.getAddressServiceId()) == null) ? null : c0.g(addressServiceId);
                        ChildBirthRegistrationAddressCountyDto county2 = temporaryAddressData.getCounty();
                        b0 b0VarG17 = (county2 == null || (territorialCode3 = county2.getTerritorialCode()) == null) ? null : c0.g(territorialCode3);
                        String houseNumber2 = temporaryAddressData.getHouseNumber();
                        b0 b0VarG18 = houseNumber2 != null ? c0.g(houseNumber2) : null;
                        String postCode2 = temporaryAddressData.getPostCode();
                        b0 b0VarG19 = postCode2 != null ? c0.g(postCode2) : null;
                        ChildBirthRegistrationAddressStreetDto street2 = temporaryAddressData.getStreet();
                        b0 b0VarG20 = (street2 == null || (territorialCode2 = street2.getTerritorialCode()) == null) ? null : c0.g(territorialCode2);
                        ChildBirthRegistrationAddressVoivodeshipDto voivodeship2 = temporaryAddressData.getVoivodeship();
                        bEChildBirthRegistrationApplicantAddress2 = new BEChildBirthRegistrationApplicantAddress(b0VarG14, b0VarG15, b0VarG16, b0VarG17, b0VarG18, b0VarG19, b0VarG20, (voivodeship2 == null || (territorialCode = voivodeship2.getTerritorialCode()) == null) ? null : c0.g(territorialCode));
                    } else {
                        bEChildBirthRegistrationApplicantAddress2 = null;
                    }
                    String requiredPeselDataChecksum = childBirthRegistrationInitialDataResponse.getRequiredPeselDataChecksum();
                    ChildBirthRegistrationTemporaryAddressDataDto temporaryAddressData2 = childBirthRegistrationInitialDataResponse.getTemporaryAddressData();
                    if (temporaryAddressData2 != null && (dateEnd = temporaryAddressData2.getDateEnd()) != null) {
                        localDate = new fz.b.LocalDate(dateEnd);
                    }
                    return new i.Right(new BEChildBirthRegistrationInitial(bEChildBirthRegistrationBirth, b0VarG, b0VarG2, b0VarG3, b0VarC, b0VarG4, b0VarG5, bEChildBirthRegistrationMarital, bEChildBirthRegistrationApplicantAddress, b0VarG13, bEChildBirthRegistrationApplicantAddress2, requiredPeselDataChecksum, localDate, null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<b, BEChildBirthRegistrationMarital> f(ChildBirthRegistrationMaritalDataDto childBirthRegistrationMaritalDataDto) {
        Object objB;
        i<b, bl0.c> iVarJ;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String certificateNumber = childBirthRegistrationMaritalDataDto.getCertificateNumber();
                    bl0.c cVar = null;
                    b0 b0VarG = certificateNumber != null ? c0.g(certificateNumber) : null;
                    ChildBirthRegistrationAuthorityDataDto registrationAuthority = childBirthRegistrationMaritalDataDto.getRegistrationAuthority();
                    BEChildBirthRegistrationAuthority bEChildBirthRegistrationAuthorityA = registrationAuthority != null ? a(registrationAuthority) : null;
                    v2 status = childBirthRegistrationMaritalDataDto.getStatus();
                    if (status != null && (iVarJ = j(status)) != null) {
                        cVar = (bl0.c) aVar.a(iVarJ);
                    }
                    return new i.Right(new BEChildBirthRegistrationMarital(b0VarG, bEChildBirthRegistrationAuthorityA, cVar));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<b, BEChildBirthApplicationResponse> g(ChildBirthRegistrationSubmitApplicationResponse childBirthRegistrationSubmitApplicationResponse) {
        Object objB;
        i right;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<ChildBirthRegistrationSubmitApplicationResponseResultDto> listB = childBirthRegistrationSubmitApplicationResponse.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        i<b, BEChildBirthApplicationResponse.BEXmlResult> iVarH = h((ChildBirthRegistrationSubmitApplicationResponseResultDto) it.next());
                        if (iVarH instanceof i.Left) {
                            right = new i.Left(((i.Left) iVarH).b());
                            return new i.Right(new BEChildBirthApplicationResponse((List) aVar.a(right), childBirthRegistrationSubmitApplicationResponse.getInstitutionName()));
                        }
                        if (!(iVarH instanceof i.Right)) {
                            throw new p();
                        }
                        arrayList.add(((i.Right) iVarH).b());
                    }
                    right = new i.Right(arrayList);
                    return new i.Right(new BEChildBirthApplicationResponse((List) aVar.a(right), childBirthRegistrationSubmitApplicationResponse.getInstitutionName()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<b, BEChildBirthApplicationResponse.BEXmlResult> h(ChildBirthRegistrationSubmitApplicationResponseResultDto childBirthRegistrationSubmitApplicationResponseResultDto) {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(new BEChildBirthApplicationResponse.BEXmlResult((t) new ex.a().a(i(childBirthRegistrationSubmitApplicationResponseResultDto.getStatus())), c0.g(childBirthRegistrationSubmitApplicationResponseResultDto.getXmlId())));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<b, t> i(i1 i1Var) {
        Object objB;
        t tVar;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C6106a.f227633g[i1Var.ordinal()];
                    if (i15 == 1) {
                        tVar = t.Success;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new b.Generic(new IllegalStateException(i1Var + " is not supported")));
                            throw new oq.g();
                        }
                        tVar = t.Error;
                    }
                    return new i.Right(tVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<b, bl0.c> j(v2 v2Var) {
        Object objB;
        bl0.c cVar;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C6106a.f227628b[v2Var.ordinal()];
                    if (i15 == 1) {
                        cVar = bl0.c.Married;
                    } else if (i15 == 2) {
                        cVar = bl0.c.Single;
                    } else if (i15 == 3) {
                        cVar = bl0.c.Divorced;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new b.Generic(new IllegalStateException(v2Var + " is not supported")));
                            throw new oq.g();
                        }
                        cVar = bl0.c.Widowed;
                    }
                    return new i.Right(cVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final List<BEGeneratedXmlChildBirth> k(ChildBirthRegistrationGenerateXmlResponse childBirthRegistrationGenerateXmlResponse) {
        List<GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse> listA = childBirthRegistrationGenerateXmlResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((GeneratedXmlDtoChildBirthRegistrationGenerateXmlResponse) it.next()));
        }
        return arrayList;
    }

    public static final List<BEChildBirthRegistrationMunicipalOffice> l(ChildBirthRegistrationMunicipalOfficesResponse childBirthRegistrationMunicipalOfficesResponse) {
        List<ChildBirthRegistrationMunicipalOfficesOfficeDto> listA = childBirthRegistrationMunicipalOfficesResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (ChildBirthRegistrationMunicipalOfficesOfficeDto childBirthRegistrationMunicipalOfficesOfficeDto : listA) {
            arrayList.add(new BEChildBirthRegistrationMunicipalOffice(childBirthRegistrationMunicipalOfficesOfficeDto.getElectronicDeliveryAddress(), childBirthRegistrationMunicipalOfficesOfficeDto.getName(), childBirthRegistrationMunicipalOfficesOfficeDto.getTercCode()));
        }
        return arrayList;
    }

    public static final ChildBirthRegistrationGenerateXmlChildAddress m(BEChildBirthRegistration.BEChildRegisteredAddress bEChildRegisteredAddress, e eVar, s sVar) {
        ChildBirthRegistrationGenerateXmlStreetTerytName childBirthRegistrationGenerateXmlStreetTerytName;
        if (bEChildRegisteredAddress == null) {
            return new ChildBirthRegistrationGenerateXmlChildAddress(n(sVar, eVar), null, null, 6, null);
        }
        e0 e0VarN = n(sVar, eVar);
        ChildBirthRegistrationGenerateXmlCityTerytName childBirthRegistrationGenerateXmlCityTerytName = new ChildBirthRegistrationGenerateXmlCityTerytName(bEChildRegisteredAddress.getAddress().getCity().getName(), bEChildRegisteredAddress.getAddress().getCity().getId());
        String strE = c0.e(bEChildRegisteredAddress.getAddress().getPostalCode());
        ChildBirthRegistrationGenerateXmlCountyTerytName childBirthRegistrationGenerateXmlCountyTerytName = new ChildBirthRegistrationGenerateXmlCountyTerytName(bEChildRegisteredAddress.getAddress().getCounty().getName(), bEChildRegisteredAddress.getAddress().getCounty().getId());
        BEChildBirthRegistration.BETerytLocationXml street = bEChildRegisteredAddress.getAddress().getStreet();
        if (street != null) {
            String name = street.getName();
            String id5 = street.getId();
            String description = street.getDescription();
            if (description == null || description.length() <= 0) {
                description = null;
            }
            childBirthRegistrationGenerateXmlStreetTerytName = new ChildBirthRegistrationGenerateXmlStreetTerytName(name, id5, description);
        } else {
            childBirthRegistrationGenerateXmlStreetTerytName = null;
        }
        ChildBirthRegistrationGenerateXmlVoivodeshipTerytName childBirthRegistrationGenerateXmlVoivodeshipTerytName = new ChildBirthRegistrationGenerateXmlVoivodeshipTerytName(bEChildRegisteredAddress.getAddress().getProvince().getName(), bEChildRegisteredAddress.getAddress().getProvince().getId());
        ChildBirthRegistrationGenerateXmlCommunityTerytName childBirthRegistrationGenerateXmlCommunityTerytName = new ChildBirthRegistrationGenerateXmlCommunityTerytName(bEChildRegisteredAddress.getAddress().getCommunity().getName(), bEChildRegisteredAddress.getAddress().getCommunity().getId());
        String strE2 = c0.e(bEChildRegisteredAddress.getAddress().getBuildingNumber());
        b0 apartmentNumber = bEChildRegisteredAddress.getAddress().getApartmentNumber();
        ChildBirthRegistrationGenerateXmlChildAddressDetailsData childBirthRegistrationGenerateXmlChildAddressDetailsData = new ChildBirthRegistrationGenerateXmlChildAddressDetailsData(childBirthRegistrationGenerateXmlCityTerytName, childBirthRegistrationGenerateXmlCommunityTerytName, childBirthRegistrationGenerateXmlCountyTerytName, strE2, strE, childBirthRegistrationGenerateXmlVoivodeshipTerytName, apartmentNumber != null ? B(apartmentNumber) : null, childBirthRegistrationGenerateXmlStreetTerytName);
        fz.b.LocalDate temporaryAddressEndDate = bEChildRegisteredAddress.getTemporaryAddressEndDate();
        return new ChildBirthRegistrationGenerateXmlChildAddress(e0VarN, childBirthRegistrationGenerateXmlChildAddressDetailsData, temporaryAddressEndDate != null ? temporaryAddressEndDate.getDate() : null);
    }

    public static final e0 n(s sVar, e eVar) {
        switch (C6106a.f227630d[sVar.ordinal()]) {
            case 1:
                int i15 = C6106a.f227629c[eVar.ordinal()];
                if (i15 == 1) {
                    return e0.FATHER_PERMANENT;
                }
                if (i15 == 2) {
                    return e0.MOTHER_PERMANENT;
                }
                throw new p();
            case 2:
                int i16 = C6106a.f227629c[eVar.ordinal()];
                if (i16 == 1) {
                    return e0.FATHER_TEMPORARY;
                }
                if (i16 == 2) {
                    return e0.MOTHER_TEMPORARY;
                }
                throw new p();
            case 3:
                return e0.FATHER_PERMANENT;
            case 4:
                return e0.FATHER_TEMPORARY;
            case 5:
                return e0.MOTHER_PERMANENT;
            case 6:
                return e0.MOTHER_TEMPORARY;
            case 7:
                return e0.PARENTS_NOT_REGISTERED;
            case 8:
                return e0.PARENTS_NOT_REGISTERED;
            case 9:
                return e0.PARENTS_NOT_REGISTERED;
            case 10:
                return e0.DO_NOT_REGISTER;
            default:
                throw new p();
        }
    }

    public static final ChildBirthRegistrationGenerateXmlChildBirthPlace o(BEChildBirthRegistration.BEChildBirthPlace bEChildBirthPlace) {
        return new ChildBirthRegistrationGenerateXmlChildBirthPlace(new ChildBirthRegistrationGenerateXmlCityTerytName(bEChildBirthPlace.getCity().getName(), bEChildBirthPlace.getCity().getId()), new ChildBirthRegistrationGenerateXmlCommunityTerytName(bEChildBirthPlace.getCommunity().getName(), bEChildBirthPlace.getCommunity().getId()), new ChildBirthRegistrationGenerateXmlCountyTerytName(bEChildBirthPlace.getCounty().getName(), bEChildBirthPlace.getCounty().getId()), new ChildBirthRegistrationGenerateXmlVoivodeshipTerytName(bEChildBirthPlace.getProvince().getName(), bEChildBirthPlace.getProvince().getId()), bEChildBirthPlace.getMedicalFacilityName());
    }

    public static final ChildBirthRegistrationGenerateXmlChildData p(BEChildBirthChildData bEChildBirthChildData) {
        return new ChildBirthRegistrationGenerateXmlChildData(bEChildBirthChildData.getBirthDate().getDate(), c0.e(bEChildBirthChildData.getName()), c0.e(bEChildBirthChildData.getNationality()), c0.e(bEChildBirthChildData.getSurname()), B(bEChildBirthChildData.getSecondName()));
    }

    public static final ChildBirthRegistrationGenerateXmlDocumentReceivedAddress q(BEChildBirthRegistration.BEReceiveDocumentAddress bEReceiveDocumentAddress, g gVar) {
        ChildBirthRegistrationGenerateXmlStreetTerytName childBirthRegistrationGenerateXmlStreetTerytName;
        m0 m0VarR = r(gVar);
        ChildBirthRegistrationGenerateXmlDocumentReceivedAddressContactAddress childBirthRegistrationGenerateXmlDocumentReceivedAddressContactAddress = null;
        if (bEReceiveDocumentAddress != null) {
            String strE = c0.e(bEReceiveDocumentAddress.getName());
            String strE2 = c0.e(bEReceiveDocumentAddress.getName());
            ChildBirthRegistrationGenerateXmlCityTerytName childBirthRegistrationGenerateXmlCityTerytName = new ChildBirthRegistrationGenerateXmlCityTerytName(bEReceiveDocumentAddress.getAddress().getCity().getName(), bEReceiveDocumentAddress.getAddress().getCity().getId());
            String strE3 = c0.e(bEReceiveDocumentAddress.getAddress().getPostalCode());
            ChildBirthRegistrationGenerateXmlCountyTerytName childBirthRegistrationGenerateXmlCountyTerytName = new ChildBirthRegistrationGenerateXmlCountyTerytName(bEReceiveDocumentAddress.getAddress().getCounty().getName(), bEReceiveDocumentAddress.getAddress().getCounty().getId());
            BEChildBirthRegistration.BETerytLocationXml street = bEReceiveDocumentAddress.getAddress().getStreet();
            if (street != null) {
                String name = street.getName();
                String id5 = street.getId();
                String description = street.getDescription();
                if (description == null || description.length() <= 0) {
                    description = null;
                }
                childBirthRegistrationGenerateXmlStreetTerytName = new ChildBirthRegistrationGenerateXmlStreetTerytName(name, id5, description);
            } else {
                childBirthRegistrationGenerateXmlStreetTerytName = null;
            }
            ChildBirthRegistrationGenerateXmlVoivodeshipTerytName childBirthRegistrationGenerateXmlVoivodeshipTerytName = new ChildBirthRegistrationGenerateXmlVoivodeshipTerytName(bEReceiveDocumentAddress.getAddress().getProvince().getName(), bEReceiveDocumentAddress.getAddress().getProvince().getId());
            ChildBirthRegistrationGenerateXmlCommunityTerytName childBirthRegistrationGenerateXmlCommunityTerytName = new ChildBirthRegistrationGenerateXmlCommunityTerytName(bEReceiveDocumentAddress.getAddress().getCommunity().getName(), bEReceiveDocumentAddress.getAddress().getCommunity().getId());
            String strE4 = c0.e(bEReceiveDocumentAddress.getAddress().getBuildingNumber());
            b0 apartmentNumber = bEReceiveDocumentAddress.getAddress().getApartmentNumber();
            childBirthRegistrationGenerateXmlDocumentReceivedAddressContactAddress = new ChildBirthRegistrationGenerateXmlDocumentReceivedAddressContactAddress(childBirthRegistrationGenerateXmlCityTerytName, childBirthRegistrationGenerateXmlCommunityTerytName, childBirthRegistrationGenerateXmlCountyTerytName, strE, strE4, strE3, strE2, childBirthRegistrationGenerateXmlVoivodeshipTerytName, apartmentNumber != null ? c0.e(apartmentNumber) : null, childBirthRegistrationGenerateXmlStreetTerytName);
        }
        return new ChildBirthRegistrationGenerateXmlDocumentReceivedAddress(m0VarR, childBirthRegistrationGenerateXmlDocumentReceivedAddressContactAddress);
    }

    public static final m0 r(g gVar) {
        int i15 = C6106a.f227631e[gVar.ordinal()];
        if (i15 == 1) {
            return m0.PERSONAL_COLLECTION;
        }
        if (i15 == 2) {
            return m0.EDOR;
        }
        if (i15 != 3 && i15 != 4) {
            throw new p();
        }
        return m0.POST_OFFICE;
    }

    public static final ChildBirthRegistrationGenerateXmlDocumentRegistrationOfficeCode s(BEChildBirthPlaceOfBirthOffices bEChildBirthPlaceOfBirthOffices) {
        return new ChildBirthRegistrationGenerateXmlDocumentRegistrationOfficeCode(bEChildBirthPlaceOfBirthOffices.getChosenCivilRegistryOffice().getOfficeCode(), bEChildBirthPlaceOfBirthOffices.getChosenMunicipalOffice().getTerritorialCode());
    }

    public static final ChildBirthRegistrationGenerateXmlParentsDataApplicantData t(BEChildBirthRegistration.BEApplicantData bEApplicantData, m mVar, BEChildBirthParents bEChildBirthParents) {
        ChildBirthRegistrationGenerateXmlMaritalData childBirthRegistrationGenerateXmlMaritalData;
        ChildBirthRegistrationGenerateXmlBirthCertificateData childBirthRegistrationGenerateXmlBirthCertificateData;
        BEChildBirthParents.BirthCertificate yourBirthPlaceOfBirthCertificate;
        BEChildBirthParents.MarriageCertificate marriageCertificate;
        LocalDate date = bEApplicantData.getBirthDate().getDate();
        String strE = c0.e(bEApplicantData.getBirthPlace());
        String strE2 = c0.e(bEApplicantData.getNationality());
        String strE3 = c0.e(bEApplicantData.getPesel());
        ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataU = u(mVar);
        String strE4 = c0.e(bEApplicantData.getSurname());
        String strE5 = c0.e(bEApplicantData.getFirstName());
        String strE6 = c0.e(bEApplicantData.getFamilyName());
        b0 nextNames = bEApplicantData.getNextNames();
        String strE7 = nextNames != null ? c0.e(nextNames) : null;
        b0 secondName = bEApplicantData.getSecondName();
        String strE8 = secondName != null ? c0.e(secondName) : null;
        if (bEChildBirthParents == null || (marriageCertificate = bEChildBirthParents.getMarriageCertificate()) == null) {
            childBirthRegistrationGenerateXmlMaritalData = null;
        } else {
            String strE9 = c0.e(marriageCertificate.getPlace());
            b0 number = marriageCertificate.getNumber();
            childBirthRegistrationGenerateXmlMaritalData = new ChildBirthRegistrationGenerateXmlMaritalData(strE9, number != null ? B(number) : null);
        }
        if (bEChildBirthParents == null || (yourBirthPlaceOfBirthCertificate = bEChildBirthParents.getYourBirthPlaceOfBirthCertificate()) == null) {
            childBirthRegistrationGenerateXmlBirthCertificateData = null;
        } else {
            String strE10 = c0.e(yourBirthPlaceOfBirthCertificate.getPlace());
            b0 number2 = yourBirthPlaceOfBirthCertificate.getNumber();
            childBirthRegistrationGenerateXmlBirthCertificateData = new ChildBirthRegistrationGenerateXmlBirthCertificateData(strE10, number2 != null ? B(number2) : null);
        }
        return new ChildBirthRegistrationGenerateXmlParentsDataApplicantData(date, strE, childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataU, strE6, strE5, strE2, strE3, bEApplicantData.getRequiredPeselDataChecksum(), strE4, childBirthRegistrationGenerateXmlBirthCertificateData, childBirthRegistrationGenerateXmlMaritalData, strE7, strE8);
    }

    public static final ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData u(m mVar) {
        if (!(mVar instanceof m.EmailOrPhone)) {
            if (mVar instanceof m.b) {
                return new ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData(s0.NO_CONTACT, null, null, 6, null);
            }
            throw new p();
        }
        s0 s0Var = s0.EMAIL_AND_PHONE;
        m.EmailOrPhone emailOrPhone = (m.EmailOrPhone) mVar;
        String strB = B(emailOrPhone.getEmail());
        PhoneNumber phoneNumber = emailOrPhone.getPhoneNumber();
        return new ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData(s0Var, strB, phoneNumber != null ? new ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber(c0.e(phoneNumber.g()), c0.e(phoneNumber.h())) : null);
    }

    public static final ChildBirthRegistrationGenerateXmlParentsDataSecondParentData v(BEChildBirthParents bEChildBirthParents) {
        b0 firstName;
        b0 placeOfBirth;
        fz.b.LocalDate dateOfBirth;
        b0 familyName;
        b0 nextName;
        b0 secondName;
        b0 citizenship;
        b0 pesel;
        b0 lastName;
        BEChildBirthParents.SecondParent secondParent = bEChildBirthParents.getSecondParent();
        ChildBirthRegistrationGenerateXmlBirthCertificateData childBirthRegistrationGenerateXmlBirthCertificateData = null;
        if (secondParent != null && (firstName = secondParent.getFirstName()) != null) {
            if (c0.e(firstName).length() <= 0) {
                firstName = null;
            }
            if (firstName != null) {
                BEChildBirthParents.BirthCertificate birthCertificateG = bEChildBirthParents.g();
                String strE = c0.e(firstName);
                BEChildBirthParents.SecondParent secondParent2 = bEChildBirthParents.getSecondParent();
                String strB = (secondParent2 == null || (lastName = secondParent2.getLastName()) == null) ? null : B(lastName);
                BEChildBirthParents.SecondParent secondParent3 = bEChildBirthParents.getSecondParent();
                String strB2 = (secondParent3 == null || (pesel = secondParent3.getPesel()) == null) ? null : B(pesel);
                BEChildBirthParents.SecondParent secondParent4 = bEChildBirthParents.getSecondParent();
                String strB3 = (secondParent4 == null || (citizenship = secondParent4.getCitizenship()) == null) ? null : B(citizenship);
                BEChildBirthParents.SecondParent secondParent5 = bEChildBirthParents.getSecondParent();
                String strB4 = (secondParent5 == null || (secondName = secondParent5.getSecondName()) == null) ? null : B(secondName);
                BEChildBirthParents.SecondParent secondParent6 = bEChildBirthParents.getSecondParent();
                String strB5 = (secondParent6 == null || (nextName = secondParent6.getNextName()) == null) ? null : B(nextName);
                BEChildBirthParents.SecondParent secondParent7 = bEChildBirthParents.getSecondParent();
                String strB6 = (secondParent7 == null || (familyName = secondParent7.getFamilyName()) == null) ? null : B(familyName);
                BEChildBirthParents.SecondParent secondParent8 = bEChildBirthParents.getSecondParent();
                LocalDate date = (secondParent8 == null || (dateOfBirth = secondParent8.getDateOfBirth()) == null) ? null : dateOfBirth.getDate();
                BEChildBirthParents.SecondParent secondParent9 = bEChildBirthParents.getSecondParent();
                ChildBirthRegistrationGenerateXmlParentsDataSecondParentDataPersonalDetailsData childBirthRegistrationGenerateXmlParentsDataSecondParentDataPersonalDetailsData = new ChildBirthRegistrationGenerateXmlParentsDataSecondParentDataPersonalDetailsData(date, (secondParent9 == null || (placeOfBirth = secondParent9.getPlaceOfBirth()) == null) ? null : B(placeOfBirth), strB6, strE, strB3, strB5, strB2, strB4, strB);
                if (birthCertificateG != null) {
                    b0 number = birthCertificateG.getNumber();
                    childBirthRegistrationGenerateXmlBirthCertificateData = new ChildBirthRegistrationGenerateXmlBirthCertificateData(c0.e(birthCertificateG.getPlace()), number != null ? B(number) : null);
                }
                return new ChildBirthRegistrationGenerateXmlParentsDataSecondParentData(childBirthRegistrationGenerateXmlBirthCertificateData, childBirthRegistrationGenerateXmlParentsDataSecondParentDataPersonalDetailsData);
            }
        }
        return null;
    }

    public static final w0 w(d dVar, e eVar) {
        int i15 = C6106a.f227629c[eVar.ordinal()];
        if (i15 == 1) {
            int i16 = C6106a.f227632f[dVar.ordinal()];
            if (i16 == 1) {
                return w0.FATHER_MARITAL_RELATIONSHIP;
            }
            if (i16 == 2) {
                return w0.FATHER_ACKNOWLEDGMENT_OF_PATERNITY;
            }
            if (i16 == 3) {
                return w0.MOTHER_NO_MARITAL_RELATIONSHIP_NO_ACKNOWLEDGMENT_OF_PATERNITY;
            }
            if (i16 == 4) {
                return w0.FATHER_BORN_BEFORE_300_DAYS_FROM_MARRIAGE_TERMINATION;
            }
            throw new p();
        }
        if (i15 != 2) {
            throw new p();
        }
        int i17 = C6106a.f227632f[dVar.ordinal()];
        if (i17 == 1) {
            return w0.MOTHER_MARITAL_RELATIONSHIP;
        }
        if (i17 == 2) {
            return w0.MOTHER_ACKNOWLEDGMENT_OF_PATERNITY;
        }
        if (i17 == 3) {
            return w0.MOTHER_NO_MARITAL_RELATIONSHIP_NO_ACKNOWLEDGMENT_OF_PATERNITY;
        }
        if (i17 == 4) {
            return w0.MOTHER_BORN_BEFORE_300_DAYS_FROM_MARRIAGE_TERMINATION;
        }
        throw new p();
    }

    public static final ChildBirthRegistrationGenerateXmlRequest x(BEChildBirthRegistration bEChildBirthRegistration) {
        ChildBirthRegistrationGenerateXmlParentsData childBirthRegistrationGenerateXmlParentsData = new ChildBirthRegistrationGenerateXmlParentsData(t(bEChildBirthRegistration.getApplicantData(), bEChildBirthRegistration.getContactData(), bEChildBirthRegistration.getParentData()), w(bEChildBirthRegistration.getMaritalStatusType(), bEChildBirthRegistration.getApplicantData().getGender()), v(bEChildBirthRegistration.getParentData()));
        ChildBirthRegistrationGenerateXmlChildAddress childBirthRegistrationGenerateXmlChildAddressM = m(bEChildBirthRegistration.getRegisteredAddress(), bEChildBirthRegistration.getApplicantData().getGender(), bEChildBirthRegistration.getTypeAddressChild());
        ChildBirthRegistrationGenerateXmlChildBirthPlace childBirthRegistrationGenerateXmlChildBirthPlaceO = o(bEChildBirthRegistration.getBirthPlace());
        List<BEChildBirthChildData> listC = bEChildBirthRegistration.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(p((BEChildBirthChildData) it.next()));
        }
        return new ChildBirthRegistrationGenerateXmlRequest(childBirthRegistrationGenerateXmlChildAddressM, childBirthRegistrationGenerateXmlChildBirthPlaceO, arrayList, q(bEChildBirthRegistration.getReceiveDocumentAddress(), bEChildBirthRegistration.getReceivedDocumentsMethod()), childBirthRegistrationGenerateXmlParentsData, s(bEChildBirthRegistration.getRegistrationOffice()));
    }

    public static final ChildBirthRegistrationSubmitApplicationRequest y(BEChildBirthRegistrationSubmitApplication bEChildBirthRegistrationSubmitApplication) {
        List<BEChildBirthRegistrationSubmitApplicationXml> listA = bEChildBirthRegistrationSubmitApplication.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(z((BEChildBirthRegistrationSubmitApplicationXml) it.next()));
        }
        return new ChildBirthRegistrationSubmitApplicationRequest(arrayList);
    }

    public static final ChildBirthRegistrationSubmitApplicationXmlDataDto z(BEChildBirthRegistrationSubmitApplicationXml bEChildBirthRegistrationSubmitApplicationXml) {
        return new ChildBirthRegistrationSubmitApplicationXmlDataDto(c0.e(bEChildBirthRegistrationSubmitApplicationXml.getSignedBase64Xml()), c0.e(bEChildBirthRegistrationSubmitApplicationXml.getXmlId()));
    }
}
