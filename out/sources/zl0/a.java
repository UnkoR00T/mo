package zl0;

import al0.ChildData;
import al0.z;
import cl0.BEChildPassportApplicationApplicant;
import cl0.BEFileServiceJwtToken;
import cl0.BEPassportChildApplicationAttachment;
import cl0.BEPassportChildApplicationAttachmentConfigResponse;
import cl0.BEPassportChildApplicationAttachments;
import cl0.BEPassportChildApplicationChild;
import cl0.BEPassportChildApplicationContact;
import cl0.BEPassportChildApplicationCorrespondenceAddress;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationForeignCorrespondenceAddress;
import cl0.BEPassportChildApplicationParentData;
import cl0.BEPassportChildApplicationPayment;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddress;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddressCity;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddressStreet;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship;
import cl0.BEPassportChildApplicationStatusResponse;
import cl0.BEPassportChildApplicationSubmitOnlinePaymentResponse;
import cl0.BEPassportChildApplicationSubmitOnlinePaymentResponsePayment;
import cl0.BEPassportChildApplicationXmlRequest;
import cl0.BEPassportChildApplicationXmlRequestPassportDocumentVisualizationData;
import cl0.PassportChildApplicationGetChildData;
import cl0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddress;
import cl0.c;
import cl0.d;
import cl0.f0;
import cl0.h0;
import cl0.j0;
import cl0.m;
import cl0.t;
import cl0.u;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fz.b;
import gm0.PassportChildApplicationApplicantDto;
import gm0.PassportChildApplicationAttachmentConfigResponse;
import gm0.PassportChildApplicationAttachmentDto;
import gm0.PassportChildApplicationAttachmentsDto;
import gm0.PassportChildApplicationChildDto;
import gm0.PassportChildApplicationContactDto;
import gm0.PassportChildApplicationCorrespondenceAddressDto;
import gm0.PassportChildApplicationCountryDictionaryDto;
import gm0.PassportChildApplicationForeignCorrespondenceAddressDto;
import gm0.PassportChildApplicationGetChildDataResponse;
import gm0.PassportChildApplicationGetChildrenResponseChildDataDto;
import gm0.PassportChildApplicationGetParentDataResponse;
import gm0.PassportChildApplicationPaymentDto;
import gm0.PassportChildApplicationPolishCorrespondenceAddressCityDto;
import gm0.PassportChildApplicationPolishCorrespondenceAddressDto;
import gm0.PassportChildApplicationPolishCorrespondenceAddressStreetDto;
import gm0.PassportChildApplicationPolishCorrespondenceAddressVoivodeshipDto;
import gm0.PassportChildApplicationStatusResponse;
import gm0.PassportChildApplicationSubmitOnlinePaymentResponse;
import gm0.PassportChildApplicationSubmitOnlinePaymentResponsePayment;
import gm0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto;
import gm0.PassportChildApplicationXmlRequest;
import gm0.PassportChildApplicationXmlRequestPassportDocumentVisualizationData;
import gm0.b4;
import gm0.f5;
import gm0.g2;
import gm0.g4;
import gm0.g7;
import gm0.j;
import gm0.k3;
import gm0.n5;
import gm0.p4;
import gm0.r4;
import gm0.v1;
import gm0.w4;
import gm0.y1;
import iy.b0;
import iy.c0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import xw.e;
import xw.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009e\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001f\u001a\u00020\u001e*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010#\u001a\u00020\"*\u00020!¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010+\u001a\u00020**\u00020)¢\u0006\u0004\b+\u0010,\u001a\u0011\u0010/\u001a\u00020.*\u00020-¢\u0006\u0004\b/\u00100\u001a\u0011\u00103\u001a\u000202*\u000201¢\u0006\u0004\b3\u00104\u001a\u0011\u00107\u001a\u000206*\u000205¢\u0006\u0004\b7\u00108\u001a\u0011\u0010;\u001a\u00020:*\u000209¢\u0006\u0004\b;\u0010<\u001a\u0011\u0010?\u001a\u00020>*\u00020=¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010C\u001a\u00020B*\u00020A¢\u0006\u0004\bC\u0010D\u001a\u0011\u0010G\u001a\u00020F*\u00020E¢\u0006\u0004\bG\u0010H\u001a\u0011\u0010K\u001a\u00020J*\u00020I¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0011\u0010S\u001a\u00020R*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010W\u001a\u00020V*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010[\u001a\u00020Z*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0011\u0010_\u001a\u00020^*\u00020]¢\u0006\u0004\b_\u0010`\u001a\u0011\u0010b\u001a\u00020\u0004*\u00020a¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010j\u001a\u00020i*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u0011\u0010n\u001a\u00020m*\u00020l¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010r\u001a\u00020q*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0011\u0010v\u001a\u00020u*\u00020t¢\u0006\u0004\bv\u0010w\u001a\u0011\u0010z\u001a\u00020y*\u00020x¢\u0006\u0004\bz\u0010{\u001a\u0011\u0010~\u001a\u00020}*\u00020|¢\u0006\u0004\b~\u0010\u007f\u001a\u0016\u0010\u0082\u0001\u001a\u00030\u0081\u0001*\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0016\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008c\u0001"}, d2 = {"Lgm0/n4;", "Lcl0/r;", "g", "(Lgm0/n4;)Lcl0/r;", "Lgm0/g2;", "Lal0/z;", "b", "(Lgm0/g2;)Lal0/z;", "", "Lgm0/m4;", "Lal0/u;", "n", "(Ljava/util/List;)Ljava/util/List;", "a", "(Lgm0/m4;)Lal0/u;", "Lgm0/k4;", "Lcl0/k0;", "l", "(Lgm0/k4;)Lcl0/k0;", "Lgm0/i4;", "Lcl0/o;", "f", "(Lgm0/i4;)Lcl0/o;", "Lgm0/b5;", "Lcl0/l0;", "m", "(Lgm0/b5;)Lcl0/l0;", "Lgm0/z3;", "Lez/a;", "currentTimeProvider", "Lcl0/h;", "e", "(Lgm0/z3;Lez/a;)Lcl0/h;", "Lcl0/c;", "Lgm0/k3;", "q", "(Lcl0/c;)Lgm0/k3;", "Lcl0/d;", "Lgm0/y1;", "o", "(Lcl0/d;)Lgm0/y1;", "Lcl0/b;", "Lgm0/y3;", "r", "(Lcl0/b;)Lgm0/y3;", "Lcl0/k;", "Lgm0/e4;", "v", "(Lcl0/k;)Lgm0/e4;", "Lcl0/m;", "Lgm0/g4;", "x", "(Lcl0/m;)Lgm0/g4;", "Lcl0/l;", "Lgm0/f4;", "w", "(Lcl0/l;)Lgm0/f4;", "Lcl0/w;", "Lgm0/s4;", "C", "(Lcl0/w;)Lgm0/s4;", "Lcl0/x;", "Lgm0/u4;", ip.a.f96138c, "(Lcl0/x;)Lgm0/u4;", "Lcl0/y;", "Lgm0/v4;", "E", "(Lcl0/y;)Lgm0/v4;", "Lcl0/n;", "Lgm0/h4;", "y", "(Lcl0/n;)Lgm0/h4;", "Lcl0/f0;", "Lgm0/f5;", i.f37087n, "(Lcl0/f0;)Lgm0/f5;", "Lcl0/t;", "Lgm0/p4;", "z", "(Lcl0/t;)Lgm0/p4;", "Lcl0/u;", "Lgm0/r4;", "B", "(Lcl0/u;)Lgm0/r4;", "Lcl0/s;", "Lgm0/q4;", "A", "(Lcl0/s;)Lgm0/q4;", "Lcl0/e0;", "Lgm0/d5;", "G", "(Lcl0/e0;)Lgm0/d5;", "Lcl0/h0;", "Lgm0/g7;", "I", "(Lcl0/h0;)Lgm0/g7;", "Lxw/e;", "p", "(Lxw/e;)Lgm0/g2;", "Lcl0/i;", "Lgm0/b4;", "t", "(Lcl0/i;)Lgm0/b4;", "Lcl0/g;", "Lgm0/a4;", "s", "(Lcl0/g;)Lgm0/a4;", "Lcl0/j;", "Lgm0/c4;", "u", "(Lcl0/j;)Lgm0/c4;", "Lcl0/d0;", "Lgm0/c5;", "F", "(Lcl0/d0;)Lgm0/c5;", "Lgm0/y4;", "Lcl0/b0;", "j", "(Lgm0/y4;)Lcl0/b0;", "Lgm0/z4;", "Lcl0/c0;", "k", "(Lgm0/z4;)Lcl0/c0;", "Lgm0/j;", "Lcl0/a;", "c", "(Lgm0/j;)Lcl0/a;", "Lgm0/v1;", "Lcl0/e;", "d", "(Lgm0/v1;)Lcl0/e;", "Lgm0/x4;", "Lcl0/a0;", "i", "(Lgm0/x4;)Lcl0/a0;", "Lgm0/w4;", "Lcl0/z;", "h", "(Lgm0/w4;)Lcl0/z;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: zl0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6361a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f235625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f235626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f235627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f235628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f235629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f235630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f235631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f235632h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f235633i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f235634j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f235635k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f235636l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int[] f235637m;

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
            f235625a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f235626b = iArr2;
            int[] iArr3 = new int[d.values().length];
            try {
                iArr3[d.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[d.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[d.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f235627c = iArr3;
            int[] iArr4 = new int[m.values().length];
            try {
                iArr4[m.PHONE_AND_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[m.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[m.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f235628d = iArr4;
            int[] iArr5 = new int[f0.values().length];
            try {
                iArr5[f0.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[f0.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[f0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f235629e = iArr5;
            int[] iArr6 = new int[t.values().length];
            try {
                iArr6[t.SCHOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[t.LARGE_FAMILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[t.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[t.TREATMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[t.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[t.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            f235630f = iArr6;
            int[] iArr7 = new int[u.values().length];
            try {
                iArr7[u.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[u.BANK_OR_POSTAL_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[u.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f235631g = iArr7;
            int[] iArr8 = new int[h0.values().length];
            try {
                iArr8[h0.MEDICAL_EMERGENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr8[h0.WORK_EMERGENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr8[h0.PERMANENT_RESIDENCE_RETURN.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[h0.PASSPORT_AWAIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[h0.LEARN_OBLIGATION_AND_SKILLS_DEVELOPMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr8[h0.FUNERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[h0.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            f235632h = iArr8;
            int[] iArr9 = new int[e.values().length];
            try {
                iArr9[e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr9[e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            f235633i = iArr9;
            int[] iArr10 = new int[cl0.i.values().length];
            try {
                iArr10[cl0.i.TEMPORARY_PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr10[cl0.i.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr10[cl0.i.GLASSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr10[cl0.i.AGREEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr10[cl0.i.DISCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr10[cl0.i.BANK_TRANSFER.ordinal()] = 6;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr10[cl0.i.HEAD_COVERING.ordinal()] = 7;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr10[cl0.i.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused39) {
            }
            f235634j = iArr10;
            int[] iArr11 = new int[j.values().length];
            try {
                iArr11[j.BLIK_T6_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr11[j.BLIK_ONE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr11[j.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr11[j.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr11[j.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr11[j.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused45) {
            }
            f235635k = iArr11;
            int[] iArr12 = new int[v1.values().length];
            try {
                iArr12[v1.PLN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr12[v1.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            f235636l = iArr12;
            int[] iArr13 = new int[w4.values().length];
            try {
                iArr13[w4.PAYMENT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr13[w4.PAYMENT_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr13[w4.SUBMIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr13[w4.SUBMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr13[w4.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr13[w4.PAYMENT_NOT_STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused53) {
            }
            f235637m = iArr13;
        }
    }

    public static final PassportChildApplicationPaymentDto A(BEPassportChildApplicationPayment bEPassportChildApplicationPayment) {
        p4 p4VarZ = z(bEPassportChildApplicationPayment.getDiscountType());
        u paymentType = bEPassportChildApplicationPayment.getPaymentType();
        return new PassportChildApplicationPaymentDto(p4VarZ, paymentType != null ? B(paymentType) : null);
    }

    public static final r4 B(u uVar) {
        int i15 = C6361a.f235631g[uVar.ordinal()];
        if (i15 == 1) {
            return r4.ONLINE;
        }
        if (i15 == 2) {
            return r4.BANK_OR_POSTAL_TRANSFER;
        }
        if (i15 == 3) {
            return r4.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportChildApplicationPolishCorrespondenceAddressCityDto C(BEPassportChildApplicationPolishCorrespondenceAddressCity bEPassportChildApplicationPolishCorrespondenceAddressCity) {
        return new PassportChildApplicationPolishCorrespondenceAddressCityDto(c0.e(bEPassportChildApplicationPolishCorrespondenceAddressCity.getCommunity()), c0.e(bEPassportChildApplicationPolishCorrespondenceAddressCity.getName()), c0.e(bEPassportChildApplicationPolishCorrespondenceAddressCity.getTerritorialCode()));
    }

    public static final PassportChildApplicationPolishCorrespondenceAddressStreetDto D(BEPassportChildApplicationPolishCorrespondenceAddressStreet bEPassportChildApplicationPolishCorrespondenceAddressStreet) {
        return new PassportChildApplicationPolishCorrespondenceAddressStreetDto(c0.e(bEPassportChildApplicationPolishCorrespondenceAddressStreet.getName()), c0.e(bEPassportChildApplicationPolishCorrespondenceAddressStreet.getTerritorialCode()));
    }

    public static final PassportChildApplicationPolishCorrespondenceAddressVoivodeshipDto E(BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship bEPassportChildApplicationPolishCorrespondenceAddressVoivodeship) {
        return new PassportChildApplicationPolishCorrespondenceAddressVoivodeshipDto(c0.e(bEPassportChildApplicationPolishCorrespondenceAddressVoivodeship.getName()), c0.e(bEPassportChildApplicationPolishCorrespondenceAddressVoivodeship.getTerritorialCode()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PassportChildApplicationXmlRequest F(BEPassportChildApplicationXmlRequest bEPassportChildApplicationXmlRequest) {
        PassportChildApplicationAttachmentsDto passportChildApplicationAttachmentsDtoU;
        g7 g7VarI;
        PassportChildApplicationApplicantDto passportChildApplicationApplicantDtoR = r(bEPassportChildApplicationXmlRequest.getApplicant());
        PassportChildApplicationChildDto passportChildApplicationChildDtoV = v(bEPassportChildApplicationXmlRequest.getChild());
        PassportChildApplicationContactDto passportChildApplicationContactDtoW = w(bEPassportChildApplicationXmlRequest.getContact());
        PassportChildApplicationCorrespondenceAddressDto passportChildApplicationCorrespondenceAddressDtoY = y(bEPassportChildApplicationXmlRequest.getCorrespondenceAddress());
        boolean firstEServiceAttempt = bEPassportChildApplicationXmlRequest.getFirstEServiceAttempt();
        f5 f5VarH = H(bEPassportChildApplicationXmlRequest.getPassportCollectPlace());
        n5 n5VarG = em0.a.g(bEPassportChildApplicationXmlRequest.getPassportType());
        PassportChildApplicationPaymentDto passportChildApplicationPaymentDtoA = A(bEPassportChildApplicationXmlRequest.getPayment());
        String strE = c0.e(bEPassportChildApplicationXmlRequest.getRecipientOfficeUnitCode());
        boolean shipmentByCourier = bEPassportChildApplicationXmlRequest.getShipmentByCourier();
        BEPassportChildApplicationAttachments attachments = bEPassportChildApplicationXmlRequest.getAttachments();
        if (attachments != null) {
            passportChildApplicationAttachmentsDtoU = u(attachments);
            g7VarI = null;
        } else {
            passportChildApplicationAttachmentsDtoU = null;
            g7VarI = null;
        }
        Boolean parentalStatement = bEPassportChildApplicationXmlRequest.getParentalStatement();
        BEPassportChildApplicationXmlRequestPassportDocumentVisualizationData passportDocumentVisualizationData = bEPassportChildApplicationXmlRequest.getPassportDocumentVisualizationData();
        Object objG = passportDocumentVisualizationData != null ? G(passportDocumentVisualizationData) : g7VarI;
        h0 temporaryPassportApplicationReason = bEPassportChildApplicationXmlRequest.getTemporaryPassportApplicationReason();
        if (temporaryPassportApplicationReason != null) {
            g7VarI = I(temporaryPassportApplicationReason);
        }
        return new PassportChildApplicationXmlRequest(passportChildApplicationApplicantDtoR, passportChildApplicationChildDtoV, passportChildApplicationContactDtoW, passportChildApplicationCorrespondenceAddressDtoY, firstEServiceAttempt, f5VarH, n5VarG, passportChildApplicationPaymentDtoA, strE, shipmentByCourier, passportChildApplicationAttachmentsDtoU, parentalStatement, objG, g7VarI);
    }

    public static final PassportChildApplicationXmlRequestPassportDocumentVisualizationData G(BEPassportChildApplicationXmlRequestPassportDocumentVisualizationData bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData) {
        b0 birthPlaceFirstLine = bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData.getBirthPlaceFirstLine();
        String strE = birthPlaceFirstLine != null ? c0.e(birthPlaceFirstLine) : null;
        b0 birthPlaceSecondLine = bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData.getBirthPlaceSecondLine();
        String strE2 = birthPlaceSecondLine != null ? c0.e(birthPlaceSecondLine) : null;
        b0 firstNameFirstLine = bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData.getFirstNameFirstLine();
        String strE3 = firstNameFirstLine != null ? c0.e(firstNameFirstLine) : null;
        b0 firstNameSecondLine = bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData.getFirstNameSecondLine();
        String strE4 = firstNameSecondLine != null ? c0.e(firstNameSecondLine) : null;
        b0 surnameFirstLine = bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData.getSurnameFirstLine();
        String strE5 = surnameFirstLine != null ? c0.e(surnameFirstLine) : null;
        b0 surnameSecondLine = bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData.getSurnameSecondLine();
        return new PassportChildApplicationXmlRequestPassportDocumentVisualizationData(strE, strE2, strE3, strE4, strE5, surnameSecondLine != null ? c0.e(surnameSecondLine) : null);
    }

    public static final f5 H(f0 f0Var) {
        int i15 = C6361a.f235629e[f0Var.ordinal()];
        if (i15 == 1) {
            return f5.POLAND;
        }
        if (i15 == 2) {
            return f5.ABROAD;
        }
        if (i15 == 3) {
            return f5.UNKNOWN;
        }
        throw new p();
    }

    public static final g7 I(h0 h0Var) {
        switch (C6361a.f235632h[h0Var.ordinal()]) {
            case 1:
                return g7.MEDICAL_EMERGENCY;
            case 2:
                return g7.WORK_EMERGENCY;
            case 3:
                return g7.PERMANENT_RESIDENCE_RETURN;
            case 4:
                return g7.PASSPORT_AWAIT;
            case 5:
                return g7.LEARN_OBLIGATION_AND_SKILLS_DEVELOPMENT;
            case 6:
                return g7.FUNERAL;
            case 7:
                return g7.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final ChildData a(PassportChildApplicationGetChildrenResponseChildDataDto passportChildApplicationGetChildrenResponseChildDataDto) {
        return new ChildData(passportChildApplicationGetChildrenResponseChildDataDto.getId(), passportChildApplicationGetChildrenResponseChildDataDto.getFirstName(), g.c(c0.g(passportChildApplicationGetChildrenResponseChildDataDto.getPesel())), passportChildApplicationGetChildrenResponseChildDataDto.getSurname(), passportChildApplicationGetChildrenResponseChildDataDto.getSecondName(), null);
    }

    public static final z b(g2 g2Var) {
        int i15 = g2Var == null ? -1 : C6361a.f235625a[g2Var.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? z.UNKNOWN : z.FEMALE;
        }
        return z.MALE;
    }

    public static final cl0.a c(j jVar) {
        switch (C6361a.f235635k[jVar.ordinal()]) {
            case 1:
                return cl0.a.BLIK_T6_CODE;
            case 2:
                return cl0.a.BLIK_ONE_CLICK;
            case 3:
                return cl0.a.CARD;
            case 4:
                return cl0.a.WALLET_GP;
            case 5:
                return cl0.a.WALLET_AP;
            case 6:
                return cl0.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final cl0.e d(v1 v1Var) {
        int i15 = C6361a.f235636l[v1Var.ordinal()];
        if (i15 == 1) {
            return cl0.e.PLN;
        }
        if (i15 == 2) {
            return cl0.e.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPassportChildApplicationAttachmentConfigResponse e(PassportChildApplicationAttachmentConfigResponse passportChildApplicationAttachmentConfigResponse, ez.a aVar) {
        return new BEPassportChildApplicationAttachmentConfigResponse(ry.a.b(c0.g(passportChildApplicationAttachmentConfigResponse.getFileEncryptionKey())), new BEFileServiceJwtToken(new b.OffsetDateTime(aVar.f().plusSeconds(passportChildApplicationAttachmentConfigResponse.getJwtFileServiceToken().getValidityInSeconds())), c0.g(passportChildApplicationAttachmentConfigResponse.getJwtFileServiceToken().getValue())), ry.a.b(c0.g(passportChildApplicationAttachmentConfigResponse.getSslPinningCert())), c0.g(passportChildApplicationAttachmentConfigResponse.getUrlToFileUpload()), null);
    }

    public static final BEPassportChildApplicationCountryDictionary f(PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDto) {
        return new BEPassportChildApplicationCountryDictionary(passportChildApplicationCountryDictionaryDto.getIsoCode(), passportChildApplicationCountryDictionaryDto.getName());
    }

    public static final BEPassportChildApplicationParentData g(PassportChildApplicationGetParentDataResponse passportChildApplicationGetParentDataResponse) {
        b0 b0VarG = c0.g(passportChildApplicationGetParentDataResponse.getChecksum());
        b.LocalDate localDate = new b.LocalDate(passportChildApplicationGetParentDataResponse.getDateOfBirth());
        b0 b0VarG2 = c0.g(passportChildApplicationGetParentDataResponse.getFirstName());
        z zVarB = b(passportChildApplicationGetParentDataResponse.getGender());
        b0 b0VarG3 = c0.g(passportChildApplicationGetParentDataResponse.getPesel());
        b0 b0VarG4 = c0.g(passportChildApplicationGetParentDataResponse.getSurname());
        String idCardSeriesAndNumber = passportChildApplicationGetParentDataResponse.getIdCardSeriesAndNumber();
        b0 b0VarG5 = idCardSeriesAndNumber != null ? c0.g(idCardSeriesAndNumber) : null;
        String placeOfBirth = passportChildApplicationGetParentDataResponse.getPlaceOfBirth();
        b0 b0VarG6 = placeOfBirth != null ? c0.g(placeOfBirth) : null;
        String secondName = passportChildApplicationGetParentDataResponse.getSecondName();
        return new BEPassportChildApplicationParentData(b0VarG, localDate, b0VarG2, b0VarG3, zVarB, b0VarG4, b0VarG5, b0VarG6, secondName != null ? c0.g(secondName) : null);
    }

    public static final cl0.z h(w4 w4Var) {
        switch (C6361a.f235637m[w4Var.ordinal()]) {
            case 1:
                return cl0.z.PAYMENT_ERROR;
            case 2:
                return cl0.z.PAYMENT_SUCCESS;
            case 3:
                return cl0.z.SUBMIT_IN_PROGRESS;
            case 4:
                return cl0.z.SUBMITTED;
            case 5:
                return cl0.z.UNKNOWN;
            case 6:
                return cl0.z.PAYMENT_NOT_STARTED;
            default:
                throw new p();
        }
    }

    public static final BEPassportChildApplicationStatusResponse i(PassportChildApplicationStatusResponse passportChildApplicationStatusResponse) {
        return new BEPassportChildApplicationStatusResponse(h(passportChildApplicationStatusResponse.getStatus()), passportChildApplicationStatusResponse.getApplicationNumber());
    }

    public static final BEPassportChildApplicationSubmitOnlinePaymentResponse j(PassportChildApplicationSubmitOnlinePaymentResponse passportChildApplicationSubmitOnlinePaymentResponse) {
        return new BEPassportChildApplicationSubmitOnlinePaymentResponse(passportChildApplicationSubmitOnlinePaymentResponse.getApplicationId(), k(passportChildApplicationSubmitOnlinePaymentResponse.getPayment()));
    }

    public static final BEPassportChildApplicationSubmitOnlinePaymentResponsePayment k(PassportChildApplicationSubmitOnlinePaymentResponsePayment passportChildApplicationSubmitOnlinePaymentResponsePayment) {
        BigDecimal amount = passportChildApplicationSubmitOnlinePaymentResponsePayment.getAmount();
        List<j> listB = passportChildApplicationSubmitOnlinePaymentResponsePayment.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(c((j) it.next()));
        }
        return new BEPassportChildApplicationSubmitOnlinePaymentResponsePayment(amount, arrayList, d(passportChildApplicationSubmitOnlinePaymentResponsePayment.getCurrency()), passportChildApplicationSubmitOnlinePaymentResponsePayment.getDescription(), passportChildApplicationSubmitOnlinePaymentResponsePayment.getInstitutionId(), passportChildApplicationSubmitOnlinePaymentResponsePayment.getInstitutionName(), passportChildApplicationSubmitOnlinePaymentResponsePayment.getPaymentId());
    }

    public static final PassportChildApplicationGetChildData l(PassportChildApplicationGetChildDataResponse passportChildApplicationGetChildDataResponse) {
        b0 b0VarG = c0.g(passportChildApplicationGetChildDataResponse.getChecksum());
        j0 j0Var = j0.PICKER;
        b0 b0VarG2 = c0.g(passportChildApplicationGetChildDataResponse.getFirstName());
        String secondName = passportChildApplicationGetChildDataResponse.getSecondName();
        b0 b0VarG3 = secondName != null ? c0.g(secondName) : null;
        String anotherNames = passportChildApplicationGetChildDataResponse.getAnotherNames();
        b0 b0VarG4 = anotherNames != null ? c0.g(anotherNames) : null;
        b0 b0VarG5 = c0.g(passportChildApplicationGetChildDataResponse.getSurname());
        b0 b0VarC = g.c(c0.g(passportChildApplicationGetChildDataResponse.getPesel()));
        b0 b0VarG6 = null;
        b0 b0Var = b0VarG4;
        b.LocalDate localDate = new b.LocalDate(passportChildApplicationGetChildDataResponse.getDateOfBirth());
        String placeOfBirth = passportChildApplicationGetChildDataResponse.getPlaceOfBirth();
        if (placeOfBirth != null) {
            b0VarG6 = c0.g(placeOfBirth);
        }
        return new PassportChildApplicationGetChildData(b0VarG, j0Var, b0VarG2, b0VarG3, b0Var, b0VarG5, b0VarC, localDate, b0VarG6, null);
    }

    public static final PassportChildApplicationVerifyOfficeElectronicDeliveryAddress m(PassportChildApplicationVerifyOfficeElectronicDeliveryAddressDto passportChildApplicationVerifyOfficeElectronicDeliveryAddressDto) {
        return new PassportChildApplicationVerifyOfficeElectronicDeliveryAddress(passportChildApplicationVerifyOfficeElectronicDeliveryAddressDto.getHasElectronicDeliveryAddress());
    }

    public static final List<ChildData> n(List<PassportChildApplicationGetChildrenResponseChildDataDto> list) {
        List<PassportChildApplicationGetChildrenResponseChildDataDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((PassportChildApplicationGetChildrenResponseChildDataDto) it.next()));
        }
        return arrayList;
    }

    public static final y1 o(d dVar) {
        int i15 = C6361a.f235627c[dVar.ordinal()];
        if (i15 == 1) {
            return y1.PHYSICAL_ID_CARD;
        }
        if (i15 == 2) {
            return y1.PASSPORT;
        }
        if (i15 == 3) {
            return y1.OTHER;
        }
        throw new p();
    }

    public static final g2 p(e eVar) {
        int i15 = C6361a.f235633i[eVar.ordinal()];
        if (i15 == 1) {
            return g2.MALE;
        }
        if (i15 == 2) {
            return g2.FEMALE;
        }
        throw new p();
    }

    public static final k3 q(c cVar) {
        int i15 = C6361a.f235626b[cVar.ordinal()];
        if (i15 == 1) {
            return k3.PARENT;
        }
        if (i15 == 2) {
            return k3.GUARDIAN;
        }
        throw new p();
    }

    public static final PassportChildApplicationApplicantDto r(BEChildPassportApplicationApplicant bEChildPassportApplicationApplicant) {
        k3 k3VarQ = q(bEChildPassportApplicationApplicant.getApplicantType());
        String strE = c0.e(bEChildPassportApplicationApplicant.getChecksum());
        y1 y1VarO = o(bEChildPassportApplicationApplicant.getDocumentType());
        String strE2 = c0.e(bEChildPassportApplicationApplicant.getFirstName());
        String strE3 = c0.e(bEChildPassportApplicationApplicant.getPesel());
        String strE4 = c0.e(bEChildPassportApplicationApplicant.getSurname());
        String strE5 = c0.e(bEChildPassportApplicationApplicant.getDocumentAndSeries());
        b0 otherDocumentTypeDescription = bEChildPassportApplicationApplicant.getOtherDocumentTypeDescription();
        String strE6 = otherDocumentTypeDescription != null ? c0.e(otherDocumentTypeDescription) : null;
        b0 secondName = bEChildPassportApplicationApplicant.getSecondName();
        return new PassportChildApplicationApplicantDto(k3VarQ, strE, y1VarO, strE2, strE3, strE4, strE5, strE6, secondName != null ? c0.e(secondName) : null);
    }

    public static final PassportChildApplicationAttachmentDto s(BEPassportChildApplicationAttachment bEPassportChildApplicationAttachment) {
        return new PassportChildApplicationAttachmentDto(t(bEPassportChildApplicationAttachment.getAttachmentType()), c0.e(bEPassportChildApplicationAttachment.getFileEncryptionIV()), c0.e(bEPassportChildApplicationAttachment.getFileName()));
    }

    public static final b4 t(cl0.i iVar) {
        switch (C6361a.f235634j[iVar.ordinal()]) {
            case 1:
                return b4.TEMPORARY_PASSPORT;
            case 2:
                return b4.IMAGE;
            case 3:
                return b4.GLASSES;
            case 4:
                return b4.AGREEMENT;
            case 5:
                return b4.DISCOUNT;
            case 6:
                return b4.BANK_TRANSFER;
            case 7:
                return b4.HEAD_COVERING;
            case 8:
                return b4.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final PassportChildApplicationAttachmentsDto u(BEPassportChildApplicationAttachments bEPassportChildApplicationAttachments) {
        String strE = c0.e(bEPassportChildApplicationAttachments.getFileEncryptionKey());
        List<BEPassportChildApplicationAttachment> listB = bEPassportChildApplicationAttachments.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(s((BEPassportChildApplicationAttachment) it.next()));
        }
        return new PassportChildApplicationAttachmentsDto(strE, arrayList);
    }

    public static final PassportChildApplicationChildDto v(BEPassportChildApplicationChild bEPassportChildApplicationChild) {
        LocalDate date = bEPassportChildApplicationChild.getBirthDate().getDate();
        String strE = c0.e(bEPassportChildApplicationChild.getBirthPlace());
        b0 checksum = bEPassportChildApplicationChild.getChecksum();
        String strE2 = checksum != null ? c0.e(checksum) : null;
        b0 firstName = bEPassportChildApplicationChild.getFirstName();
        String strE3 = firstName != null ? c0.e(firstName) : null;
        g2 g2VarP = p(bEPassportChildApplicationChild.getGender());
        b0 lastName = bEPassportChildApplicationChild.getLastName();
        String strE4 = lastName != null ? c0.e(lastName) : null;
        boolean polishCitizenship = bEPassportChildApplicationChild.getPolishCitizenship();
        b0 otherNames = bEPassportChildApplicationChild.getOtherNames();
        String strE5 = otherNames != null ? c0.e(otherNames) : null;
        String strE6 = c0.e(bEPassportChildApplicationChild.getPesel());
        b0 secondName = bEPassportChildApplicationChild.getSecondName();
        return new PassportChildApplicationChildDto(date, strE, g2VarP, strE6, polishCitizenship, strE2, strE3, strE4, strE5, secondName != null ? c0.e(secondName) : null);
    }

    public static final PassportChildApplicationContactDto w(BEPassportChildApplicationContact bEPassportChildApplicationContact) {
        g4 g4VarX = x(bEPassportChildApplicationContact.getContactType());
        b0 email = bEPassportChildApplicationContact.getEmail();
        String strE = email != null ? c0.e(email) : null;
        b0 phoneNumber = bEPassportChildApplicationContact.getPhoneNumber();
        return new PassportChildApplicationContactDto(g4VarX, strE, phoneNumber != null ? c0.e(phoneNumber) : null);
    }

    public static final g4 x(m mVar) {
        int i15 = C6361a.f235628d[mVar.ordinal()];
        if (i15 == 1) {
            return g4.PHONE_AND_EMAIL;
        }
        if (i15 == 2) {
            return g4.POST;
        }
        if (i15 == 3) {
            return g4.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportChildApplicationCorrespondenceAddressDto y(BEPassportChildApplicationCorrespondenceAddress bEPassportChildApplicationCorrespondenceAddress) {
        BEPassportChildApplicationForeignCorrespondenceAddress foreignAddress = bEPassportChildApplicationCorrespondenceAddress.getForeignAddress();
        PassportChildApplicationPolishCorrespondenceAddressDto passportChildApplicationPolishCorrespondenceAddressDto = null;
        PassportChildApplicationForeignCorrespondenceAddressDto passportChildApplicationForeignCorrespondenceAddressDto = foreignAddress != null ? new PassportChildApplicationForeignCorrespondenceAddressDto(c0.e(foreignAddress.getAddress()), c0.e(foreignAddress.getCountry()), c0.e(foreignAddress.getIsoCode())) : null;
        BEPassportChildApplicationPolishCorrespondenceAddress polishAddress = bEPassportChildApplicationCorrespondenceAddress.getPolishAddress();
        if (polishAddress != null) {
            PassportChildApplicationPolishCorrespondenceAddressCityDto passportChildApplicationPolishCorrespondenceAddressCityDtoC = C(polishAddress.getCity());
            String strE = c0.e(polishAddress.getHouseNumber());
            String strE2 = c0.e(polishAddress.getPostCode());
            BEPassportChildApplicationPolishCorrespondenceAddressStreet street = polishAddress.getStreet();
            PassportChildApplicationPolishCorrespondenceAddressStreetDto passportChildApplicationPolishCorrespondenceAddressStreetDtoD = street != null ? D(street) : null;
            PassportChildApplicationPolishCorrespondenceAddressVoivodeshipDto passportChildApplicationPolishCorrespondenceAddressVoivodeshipDtoE = E(polishAddress.getVoivodeship());
            b0 apartmentNumber = polishAddress.getApartmentNumber();
            passportChildApplicationPolishCorrespondenceAddressDto = new PassportChildApplicationPolishCorrespondenceAddressDto(passportChildApplicationPolishCorrespondenceAddressCityDtoC, strE, strE2, passportChildApplicationPolishCorrespondenceAddressVoivodeshipDtoE, apartmentNumber != null ? c0.e(apartmentNumber) : null, passportChildApplicationPolishCorrespondenceAddressStreetDtoD);
        }
        return new PassportChildApplicationCorrespondenceAddressDto(passportChildApplicationForeignCorrespondenceAddressDto, passportChildApplicationPolishCorrespondenceAddressDto);
    }

    public static final p4 z(t tVar) {
        switch (C6361a.f235630f[tVar.ordinal()]) {
            case 1:
                return p4.SCHOOL;
            case 2:
                return p4.LARGE_FAMILY;
            case 3:
                return p4.TECHNICAL_ISSUE;
            case 4:
                return p4.TREATMENT;
            case 5:
                return p4.TEMPORARY_PASSPORT;
            case 6:
                return p4.UNKNOWN;
            default:
                throw new p();
        }
    }
}
