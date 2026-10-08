package cq0;

import dq0.AvailableDefenceTrainingsDto;
import dq0.DefenceTrainingDayDto;
import dq0.DefenceTrainingDto;
import dq0.DefenceTrainingTypeDto;
import dq0.DefenceUnitDto;
import dq0.GroupedAvailableDefenceTrainingsResponse;
import dq0.PhoneNumberDto;
import dq0.RegisterForDefenceTrainingDataDto;
import dq0.RegisterForDefenceTrainingDataRegisteredChildDto;
import dq0.RegisterForDefenceTrainingResponseChildRegistrationDto;
import dq0.RegisterForDefenceTrainingResponseDto;
import dq0.RegisteredDefenceTrainingDto;
import dq0.RegisteredDefenceTrainingUnitDto;
import dq0.ReportIncidentLocationDto;
import dq0.ReportIncidentPhoneNumberDto;
import dq0.ReportIncidentRequestAttachments;
import dq0.ReportIncidentRequestAttachmentsImage;
import dq0.ReportIncidentRequestAttachmentsImageAxis;
import dq0.ReportIncidentRequestAttachmentsImageDimension;
import dq0.ReportIncidentRequestAttachmentsImageTiltAngle;
import dq0.ReportIncidentRequestDto;
import dq0.ReportIncidentTypeDto;
import dq0.ReportIncidentTypesResponse;
import dq0.ReportIncidentTypesResponseImageConfiguration;
import dq0.ReportIncidentTypesResponseIncidentTypeConfig;
import dq0.ReportedIncidentsResponse;
import dq0.ReportedIncidentsResponseReportedIncidentDto;
import dq0.UnitDefenceTrainingsByTypeDto;
import dq0.UserDefenceTrainingDto;
import dq0.UserDefenceTrainingRegistrationChildRegistrationDto;
import dq0.UserDefenceTrainingRegistrationDto;
import dq0.UserDefenceTrainingUnitDto;
import dq0.UserDefenceTrainingsRegistrationsSummaryDto;
import dq0.d;
import dq0.e;
import dq0.f;
import dq0.g;
import dq0.g0;
import dx.b;
import dx.i;
import dx.j;
import ez.c;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import vy.Axis;
import vy.Coordinates;
import vy.OrientationAngle;
import zp0.AvailableDefenceTrainings;
import zp0.BEDefenceTrainingType;
import zp0.BEGroupedAvailableDefenceTrainingsResponse;
import zp0.BEIncidentReportFileImageConfiguration;
import zp0.BEIncidentReportFileServiceConfiguration;
import zp0.BERegisterForDefenceTraining;
import zp0.BERegisteredChildParticipant;
import zp0.BEReportIncidentAttachments;
import zp0.BEReportIncidentAttachmentsImage;
import zp0.BEReportIncidentRequest;
import zp0.BEReportIncidentType;
import zp0.BEReportIncidentTypes;
import zp0.BEReportIncidentTypesIncidentTypeConfig;
import zp0.BEReportedIncidents;
import zp0.BEReportedIncidentsReportedIncident;
import zp0.BEUnitDefenceTrainingsByType;
import zp0.BEUserDefenceTrainingRegistration;
import zp0.BEUserRegisteredDefenceTraining;
import zp0.DefenceTraining;
import zp0.DefenceTrainingDay;
import zp0.DefenceUnit;
import zp0.RegisteredDefenceTrainingDate;
import zp0.UserDefenceTraining;
import zp0.UserDefenceTrainingsRegistration;
import zp0.k;
import zp0.x;
import zp0.y;
import zp0.z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u0001*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0\u0001*\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0\u0001*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010(\u001a\u00020'*\u00020&¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0\u0001*\u00020*¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0\u0001*\u00020.¢\u0006\u0004\b/\u00100\u001a\u0011\u00103\u001a\u000202*\u000201¢\u0006\u0004\b3\u00104\u001a\u001d\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002060\u0001*\u000205¢\u0006\u0004\b7\u00108\u001a\u0011\u0010;\u001a\u00020:*\u000209¢\u0006\u0004\b;\u0010<\u001a\u0011\u0010>\u001a\u00020+*\u00020=¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020E0\u0001*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u001d\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020I0\u0001*\u00020H¢\u0006\u0004\bJ\u0010K\u001a%\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020O0\u0001*\u00020L2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bP\u0010Q\u001a\u001d\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020S0\u0001*\u00020R¢\u0006\u0004\bT\u0010U\u001a\u001d\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020W0\u0001*\u00020V¢\u0006\u0004\bX\u0010Y\u001a%\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[0\u0001*\u00020Z2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\b\\\u0010]\u001a\u001d\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020_0\u0001*\u00020^¢\u0006\u0004\b`\u0010a\u001a\u001d\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020c0\u0001*\u00020b¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020g0\u0001*\u00020f¢\u0006\u0004\bh\u0010i\u001a%\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020m0\u0001*\u00020j2\u0006\u0010l\u001a\u00020k¢\u0006\u0004\bn\u0010o\u001a%\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020q0\u0001*\u00020p2\u0006\u0010l\u001a\u00020k¢\u0006\u0004\br\u0010s\u001a%\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020u0\u0001*\u00020t2\u0006\u0010l\u001a\u00020k¢\u0006\u0004\bv\u0010w\u001a\u001d\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020y0\u0001*\u00020x¢\u0006\u0004\bz\u0010{¨\u0006|"}, d2 = {"Ldq0/a;", "Ldx/i;", "Ldx/b;", "Lzp0/a;", "a", "(Ldq0/a;)Ldx/i;", "Ldq0/c;", "Lzp0/v;", "b", "(Ldq0/c;)Ldx/i;", "Ldq0/h;", "Lzp0/c;", "t", "(Ldq0/h;)Lzp0/c;", "Ldq0/d;", "Lzp0/b;", "c", "(Ldq0/d;)Ldx/i;", "Ldq0/r0;", "Lzp0/d0;", "s", "(Ldq0/r0;)Ldx/i;", "Ldq0/f;", "Lzp0/y;", "v", "(Ldq0/f;)Lzp0/y;", "Ldq0/p0;", "Lzp0/t;", "q", "(Ldq0/p0;)Ldx/i;", "Ldq0/g;", "Lzp0/z;", "e", "(Ldq0/g;)Ldx/i;", "Ldq0/e;", "Lzp0/x;", "d", "(Ldq0/e;)Ldx/i;", "Ldq0/n0;", "Lzp0/c0;", "y", "(Ldq0/n0;)Lzp0/c0;", "Ldq0/q0;", "Lzp0/a0;", "r", "(Ldq0/q0;)Ldx/i;", "Ldq0/i;", "f", "(Ldq0/i;)Ldx/i;", "Lzp0/g;", "Ldq0/l;", "z", "(Lzp0/g;)Ldq0/l;", "Ldq0/p;", "Lzp0/u;", "h", "(Ldq0/p;)Ldx/i;", "Ldq0/r;", "Lzp0/b0;", "x", "(Ldq0/r;)Lzp0/b0;", "Ldq0/s;", "w", "(Ldq0/s;)Lzp0/a0;", "Ldq0/b;", "Lzp0/w;", "u", "(Ldq0/b;)Lzp0/w;", "Ldq0/j;", "Lzp0/d;", "g", "(Ldq0/j;)Ldx/i;", "Ldq0/j0;", "Lzp0/s;", "p", "(Ldq0/j0;)Ldx/i;", "Ldq0/c0;", "Lez/a;", "currentTimeProvider", "Lzp0/n;", "j", "(Ldq0/c0;Lez/a;)Ldx/i;", "Ldq0/f0;", "Lzp0/o;", "l", "(Ldq0/f0;)Ldx/i;", "Ldq0/b0;", "Lzp0/m;", "i", "(Ldq0/b0;)Ldx/i;", "Ldq0/d0;", "Lzp0/e;", "k", "(Ldq0/d0;Lez/a;)Ldx/i;", "Ldq0/h0;", "Lzp0/q;", "n", "(Ldq0/h0;)Ldx/i;", "Ldq0/i0;", "Lzp0/r;", "o", "(Ldq0/i0;)Ldx/i;", "Ldq0/g0;", "Lzp0/p;", "m", "(Ldq0/g0;)Ldx/i;", "Lzp0/l;", "Lez/c;", "dateConverter", "Ldq0/a0;", ip.a.f96138c, "(Lzp0/l;Lez/c;)Ldx/i;", "Lzp0/i;", "Ldq0/v;", "A", "(Lzp0/i;Lez/c;)Ldx/i;", "Lzp0/j;", "Ldq0/w;", "B", "(Lzp0/j;Lez/c;)Ldx/i;", "Lzp0/k;", "Ldq0/y;", "C", "(Lzp0/k;)Ldx/i;", "militaryservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: cq0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0771a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f37255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f37256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f37257e;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f37253a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.BANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f.WRONG_AGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[f.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f37254b = iArr2;
            int[] iArr3 = new int[g.values().length];
            try {
                iArr3[g.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[g.RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[g.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[g.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[g.ABSENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[g.DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[g.IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[g.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            f37255c = iArr3;
            int[] iArr4 = new int[e.values().length];
            try {
                iArr4[e.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[e.RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[e.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            f37256d = iArr4;
            int[] iArr5 = new int[g0.values().length];
            try {
                iArr5[g0.SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[g0.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[g0.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[g0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            f37257e = iArr5;
        }
    }

    public static final i<b, ReportIncidentRequestAttachments> A(BEReportIncidentAttachments bEReportIncidentAttachments, c cVar) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String strE = c0.e(bEReportIncidentAttachments.getFileEncryptionKey());
                    List<BEReportIncidentAttachmentsImage> listB = bEReportIncidentAttachments.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add((ReportIncidentRequestAttachmentsImage) aVar.a(B((BEReportIncidentAttachmentsImage) it.next(), cVar)));
                    }
                    return new i.Right(new ReportIncidentRequestAttachments(strE, arrayList));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, ReportIncidentRequestAttachmentsImage> B(BEReportIncidentAttachmentsImage bEReportIncidentAttachmentsImage, c cVar) {
        Object objB;
        ReportIncidentLocationDto reportIncidentLocationDto;
        ReportIncidentRequestAttachmentsImageTiltAngle reportIncidentRequestAttachmentsImageTiltAngle;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    String strE = c0.e(bEReportIncidentAttachmentsImage.getFileEncryptionIV());
                    String fileName = bEReportIncidentAttachmentsImage.getFileName();
                    Axis accelerometer = bEReportIncidentAttachmentsImage.getAccelerometer();
                    ReportIncidentRequestAttachmentsImageAxis reportIncidentRequestAttachmentsImageAxis = accelerometer != null ? new ReportIncidentRequestAttachmentsImageAxis(accelerometer.getX(), accelerometer.getY(), accelerometer.getZ()) : null;
                    fz.b.LocalDateTime date = bEReportIncidentAttachmentsImage.getDate();
                    OffsetDateTime date2 = date != null ? cVar.j(date).getDate() : null;
                    bEReportIncidentAttachmentsImage.getDimension();
                    Axis gyroscope = bEReportIncidentAttachmentsImage.getGyroscope();
                    ReportIncidentRequestAttachmentsImageAxis reportIncidentRequestAttachmentsImageAxis2 = gyroscope != null ? new ReportIncidentRequestAttachmentsImageAxis(gyroscope.getX(), gyroscope.getY(), gyroscope.getZ()) : null;
                    Integer heading = bEReportIncidentAttachmentsImage.getHeading();
                    Coordinates location = bEReportIncidentAttachmentsImage.getLocation();
                    if (location != null) {
                        reportIncidentLocationDto = new ReportIncidentLocationDto(location.getLatitude(), location.getLongitude());
                    } else {
                        reportIncidentLocationDto = null;
                    }
                    OrientationAngle tiltAngle = bEReportIncidentAttachmentsImage.getTiltAngle();
                    if (tiltAngle != null) {
                        reportIncidentRequestAttachmentsImageTiltAngle = new ReportIncidentRequestAttachmentsImageTiltAngle(tiltAngle.getPitchDegrees(), tiltAngle.getRollDegrees(), tiltAngle.getAzimuthDegrees());
                    } else {
                        reportIncidentRequestAttachmentsImageTiltAngle = null;
                    }
                    return new i.Right(new ReportIncidentRequestAttachmentsImage(strE, fileName, reportIncidentRequestAttachmentsImageAxis, date2, null, reportIncidentRequestAttachmentsImageAxis2, heading, reportIncidentLocationDto, reportIncidentRequestAttachmentsImageTiltAngle));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, ReportIncidentRequestAttachmentsImageDimension> C(k kVar) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(new ReportIncidentRequestAttachmentsImageDimension(kVar.a(), kVar.b()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, ReportIncidentRequestDto> D(BEReportIncidentRequest bEReportIncidentRequest, c cVar) {
        Object objB;
        i<b, ReportIncidentRequestAttachments> iVarA;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String code = bEReportIncidentRequest.getCode();
                    OffsetDateTime date = cVar.j(bEReportIncidentRequest.getDate()).getDate();
                    ReportIncidentLocationDto reportIncidentLocationDto = new ReportIncidentLocationDto(bEReportIncidentRequest.getSelectedLocation().getLatitude(), bEReportIncidentRequest.getSelectedLocation().getLongitude());
                    BEReportIncidentAttachments attachments = bEReportIncidentRequest.getAttachments();
                    ReportIncidentRequestAttachments reportIncidentRequestAttachments = (attachments == null || (iVarA = A(attachments, cVar)) == null) ? null : (ReportIncidentRequestAttachments) aVar.a(iVarA);
                    b0 description = bEReportIncidentRequest.getDescription();
                    return new i.Right(new ReportIncidentRequestDto(code, date, reportIncidentLocationDto, new ReportIncidentPhoneNumberDto(c0.e(bEReportIncidentRequest.getPhoneNumber().g()), c0.e(bEReportIncidentRequest.getPhoneNumber().h())), new ReportIncidentLocationDto(bEReportIncidentRequest.getLastLocation().getLatitude(), bEReportIncidentRequest.getLastLocation().getLongitude()), reportIncidentRequestAttachments, description != null ? c0.e(description) : null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, AvailableDefenceTrainings> a(AvailableDefenceTrainingsDto availableDefenceTrainingsDto) {
        Object objB;
        i right;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<DefenceTrainingDto> listA = availableDefenceTrainingsDto.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        i<b, DefenceTraining> iVarB = b((DefenceTrainingDto) it.next());
                        if (iVarB instanceof i.Left) {
                            right = new i.Left(((i.Left) iVarB).b());
                            return new i.Right(new AvailableDefenceTrainings((List) aVar.a(right), (DefenceUnit) aVar.a(f(availableDefenceTrainingsDto.getUnit()))));
                        }
                        if (!(iVarB instanceof i.Right)) {
                            throw new p();
                        }
                        arrayList.add(((i.Right) iVarB).b());
                    }
                    right = new i.Right(arrayList);
                    return new i.Right(new AvailableDefenceTrainings((List) aVar.a(right), (DefenceUnit) aVar.a(f(availableDefenceTrainingsDto.getUnit()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, DefenceTraining> b(DefenceTrainingDto defenceTrainingDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int id5 = defenceTrainingDto.getId();
                    List<DefenceTrainingDayDto> listA = defenceTrainingDto.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(u((DefenceTrainingDayDto) it.next()));
                    }
                    return new i.Right(new DefenceTraining(id5, arrayList, t(defenceTrainingDto.getType()), (zp0.b) aVar.a(c(defenceTrainingDto.getOccupancy()))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, zp0.b> c(d dVar) {
        Object objB;
        zp0.b bVar;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C0771a.f37253a[dVar.ordinal()];
                    if (i15 == 1) {
                        bVar = zp0.b.LOW;
                    } else if (i15 == 2) {
                        bVar = zp0.b.MEDIUM;
                    } else if (i15 == 3) {
                        bVar = zp0.b.HIGH;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new b.Generic(new IllegalStateException("DefenceTrainingOccupancyDto is UNKNOWN")));
                            throw new oq.g();
                        }
                        bVar = zp0.b.FULL;
                    }
                    return new i.Right(bVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, x> d(e eVar) {
        Object objB;
        x xVar;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C0771a.f37256d[eVar.ordinal()];
                    if (i15 == 1) {
                        xVar = x.APPROVED;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new b.Generic(new IllegalStateException("status is UNKNOWN")));
                            throw new oq.g();
                        }
                        xVar = x.RESERVE;
                    }
                    return new i.Right(xVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, z> e(g gVar) {
        Object objB;
        z zVar;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (C0771a.f37255c[gVar.ordinal()]) {
                        case 1:
                            zVar = z.APPROVED;
                            break;
                        case 2:
                            zVar = z.RESERVE;
                            break;
                        case 3:
                            zVar = z.REJECTED;
                            break;
                        case 4:
                            zVar = z.CANCELLED;
                            break;
                        case 5:
                            zVar = z.ABSENCE;
                            break;
                        case 6:
                            zVar = z.DONE;
                            break;
                        case 7:
                            zVar = z.IN_PROGRESS;
                            break;
                        case 8:
                            aVar.b(new b.Generic(new IllegalStateException("status is UNKNOWN")));
                            throw new oq.g();
                        default:
                            throw new p();
                    }
                    return new i.Right(zVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, DefenceUnit> f(DefenceUnitDto defenceUnitDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(new DefenceUnit(defenceUnitDto.getAddress(), defenceUnitDto.getName(), new Coordinates(Double.parseDouble(defenceUnitDto.getLatitude()), Double.parseDouble(defenceUnitDto.getLongitude()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, BEGroupedAvailableDefenceTrainingsResponse> g(GroupedAvailableDefenceTrainingsResponse groupedAvailableDefenceTrainingsResponse) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<UnitDefenceTrainingsByTypeDto> listA = groupedAvailableDefenceTrainingsResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEUnitDefenceTrainingsByType) aVar.a(p((UnitDefenceTrainingsByTypeDto) it.next())));
                    }
                    return new i.Right(new BEGroupedAvailableDefenceTrainingsResponse(arrayList));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, BEUserRegisteredDefenceTraining> h(RegisterForDefenceTrainingResponseDto registerForDefenceTrainingResponseDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    x xVar = (x) new ex.a().a(d(registerForDefenceTrainingResponseDto.getStatus()));
                    RegisteredDefenceTrainingDate registeredDefenceTrainingDateX = x(registerForDefenceTrainingResponseDto.getTraining());
                    DefenceUnit defenceUnitW = w(registerForDefenceTrainingResponseDto.getUnit());
                    List<RegisterForDefenceTrainingResponseChildRegistrationDto> listA = registerForDefenceTrainingResponseDto.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    for (RegisterForDefenceTrainingResponseChildRegistrationDto registerForDefenceTrainingResponseChildRegistrationDto : listA) {
                        arrayList.add(new BERegisteredChildParticipant(c0.g(registerForDefenceTrainingResponseChildRegistrationDto.getFirstName()), c0.g(registerForDefenceTrainingResponseChildRegistrationDto.getLastName())));
                    }
                    return new i.Right(new BEUserRegisteredDefenceTraining(xVar, registeredDefenceTrainingDateX, defenceUnitW, arrayList));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, BEReportIncidentType> i(ReportIncidentTypeDto reportIncidentTypeDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(new BEReportIncidentType(reportIncidentTypeDto.getCode(), reportIncidentTypeDto.getName()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, BEReportIncidentTypes> j(ReportIncidentTypesResponse reportIncidentTypesResponse, ez.a aVar) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    BEIncidentReportFileImageConfiguration bEIncidentReportFileImageConfiguration = (BEIncidentReportFileImageConfiguration) aVar2.a(k(reportIncidentTypesResponse.getImageConfig(), aVar));
                    List<ReportIncidentTypesResponseIncidentTypeConfig> listB = reportIncidentTypesResponse.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEReportIncidentTypesIncidentTypeConfig) aVar2.a(l((ReportIncidentTypesResponseIncidentTypeConfig) it.next())));
                    }
                    return new i.Right(new BEReportIncidentTypes(bEIncidentReportFileImageConfiguration, arrayList));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, BEIncidentReportFileImageConfiguration> k(ReportIncidentTypesResponseImageConfiguration reportIncidentTypesResponseImageConfiguration, ez.a aVar) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(new BEIncidentReportFileImageConfiguration(reportIncidentTypesResponseImageConfiguration.getCompressionLevel(), reportIncidentTypesResponseImageConfiguration.getMaxFileAmount(), reportIncidentTypesResponseImageConfiguration.getMaxImageResolution(), new BEIncidentReportFileServiceConfiguration(ry.a.b(c0.g(reportIncidentTypesResponseImageConfiguration.getFileEncryptionKey())), ry.a.b(c0.g(reportIncidentTypesResponseImageConfiguration.getSslPinningCert())), reportIncidentTypesResponseImageConfiguration.getUrlToFileUpload(), c0.g(reportIncidentTypesResponseImageConfiguration.getJwtFileService().getToken()), new fz.b.OffsetDateTime(aVar.f().plusSeconds(reportIncidentTypesResponseImageConfiguration.getJwtFileService().getValidityInSeconds())), null)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, BEReportIncidentTypesIncidentTypeConfig> l(ReportIncidentTypesResponseIncidentTypeConfig reportIncidentTypesResponseIncidentTypeConfig) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(new BEReportIncidentTypesIncidentTypeConfig(reportIncidentTypesResponseIncidentTypeConfig.getDescription(), (BEReportIncidentType) new ex.a().a(i(reportIncidentTypesResponseIncidentTypeConfig.getType()))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, zp0.p> m(g0 g0Var) {
        Object objB;
        zp0.p pVar;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    int i15 = C0771a.f37257e[g0Var.ordinal()];
                    if (i15 == 1) {
                        pVar = zp0.p.SENT;
                    } else if (i15 == 2) {
                        pVar = zp0.p.ACCEPTED;
                    } else if (i15 == 3) {
                        pVar = zp0.p.COMPLETED;
                    } else {
                        if (i15 != 4) {
                            throw new p();
                        }
                        pVar = zp0.p.UNKNOWN;
                    }
                    return new i.Right(pVar);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, BEReportedIncidents> n(ReportedIncidentsResponse reportedIncidentsResponse) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<ReportedIncidentsResponseReportedIncidentDto> listA = reportedIncidentsResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEReportedIncidentsReportedIncident) aVar.a(o((ReportedIncidentsResponseReportedIncidentDto) it.next())));
                    }
                    return new i.Right(new BEReportedIncidents(arrayList));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, BEReportedIncidentsReportedIncident> o(ReportedIncidentsResponseReportedIncidentDto reportedIncidentsResponseReportedIncidentDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new i.Right(new BEReportedIncidentsReportedIncident(new fz.b.OffsetDateTime(reportedIncidentsResponseReportedIncidentDto.getIncidentDate()), reportedIncidentsResponseReportedIncidentDto.getDescription(), reportedIncidentsResponseReportedIncidentDto.getId(), new fz.b.OffsetDateTime(reportedIncidentsResponseReportedIncidentDto.getReportedDate()), (zp0.p) aVar.a(m(reportedIncidentsResponseReportedIncidentDto.getState())), (BEReportIncidentType) aVar.a(i(reportedIncidentsResponseReportedIncidentDto.getType())), reportedIncidentsResponseReportedIncidentDto.getAttachmentsNumber(), new Coordinates(reportedIncidentsResponseReportedIncidentDto.getLocation().getLatitude(), reportedIncidentsResponseReportedIncidentDto.getLocation().getLongitude())));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, BEUnitDefenceTrainingsByType> p(UnitDefenceTrainingsByTypeDto unitDefenceTrainingsByTypeDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEDefenceTrainingType bEDefenceTrainingTypeT = t(unitDefenceTrainingsByTypeDto.getType());
                    List<AvailableDefenceTrainingsDto> listB = unitDefenceTrainingsByTypeDto.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add((AvailableDefenceTrainings) aVar.a(a((AvailableDefenceTrainingsDto) it.next())));
                    }
                    return new i.Right(new BEUnitDefenceTrainingsByType(bEDefenceTrainingTypeT, arrayList));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, BEUserDefenceTrainingRegistration> q(UserDefenceTrainingRegistrationDto userDefenceTrainingRegistrationDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    z zVar = (z) aVar.a(e(userDefenceTrainingRegistrationDto.getStatus()));
                    UserDefenceTraining userDefenceTrainingY = y(userDefenceTrainingRegistrationDto.getTraining());
                    DefenceUnit defenceUnit = (DefenceUnit) aVar.a(r(userDefenceTrainingRegistrationDto.getUnit()));
                    List<UserDefenceTrainingRegistrationChildRegistrationDto> listA = userDefenceTrainingRegistrationDto.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    for (UserDefenceTrainingRegistrationChildRegistrationDto userDefenceTrainingRegistrationChildRegistrationDto : listA) {
                        arrayList.add(new BERegisteredChildParticipant(c0.g(userDefenceTrainingRegistrationChildRegistrationDto.getFirstName()), c0.g(userDefenceTrainingRegistrationChildRegistrationDto.getLastName())));
                    }
                    return new i.Right(new BEUserDefenceTrainingRegistration(zVar, userDefenceTrainingY, defenceUnit, arrayList));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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

    public static final i<b, DefenceUnit> r(UserDefenceTrainingUnitDto userDefenceTrainingUnitDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(new DefenceUnit(userDefenceTrainingUnitDto.getAddress(), userDefenceTrainingUnitDto.getName(), new Coordinates(Double.parseDouble(userDefenceTrainingUnitDto.getLatitude()), Double.parseDouble(userDefenceTrainingUnitDto.getLongitude()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final i<b, UserDefenceTrainingsRegistration> s(UserDefenceTrainingsRegistrationsSummaryDto userDefenceTrainingsRegistrationsSummaryDto) {
        Object objB;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<UserDefenceTrainingRegistrationDto> listD = userDefenceTrainingsRegistrationsSummaryDto.d();
                    ArrayList arrayList = new ArrayList(v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEUserDefenceTrainingRegistration) aVar.a(q((UserDefenceTrainingRegistrationDto) it.next())));
                    }
                    boolean registrationAvailable = userDefenceTrainingsRegistrationsSummaryDto.getRegistrationAvailable();
                    f registrationDisabledReason = userDefenceTrainingsRegistrationsSummaryDto.getRegistrationDisabledReason();
                    y yVarV = registrationDisabledReason != null ? v(registrationDisabledReason) : null;
                    List<DefenceTrainingTypeDto> listA = userDefenceTrainingsRegistrationsSummaryDto.a();
                    ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
                    Iterator<T> it4 = listA.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(t((DefenceTrainingTypeDto) it4.next()));
                    }
                    return new i.Right(new UserDefenceTrainingsRegistration(arrayList, registrationAvailable, yVarV, arrayList2));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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

    public static final BEDefenceTrainingType t(DefenceTrainingTypeDto defenceTrainingTypeDto) {
        return new BEDefenceTrainingType(defenceTrainingTypeDto.getCode(), defenceTrainingTypeDto.getDescription());
    }

    public static final DefenceTrainingDay u(DefenceTrainingDayDto defenceTrainingDayDto) {
        return new DefenceTrainingDay(new fz.b.OffsetDateTime(defenceTrainingDayDto.getEndDate()), new fz.b.OffsetDateTime(defenceTrainingDayDto.getStartDate()));
    }

    public static final y v(f fVar) {
        int i15 = C0771a.f37254b[fVar.ordinal()];
        if (i15 == 1) {
            return y.BANNED;
        }
        if (i15 == 2) {
            return y.WRONG_AGE;
        }
        if (i15 == 3) {
            return y.OTHER;
        }
        if (i15 == 4) {
            return null;
        }
        throw new p();
    }

    public static final DefenceUnit w(RegisteredDefenceTrainingUnitDto registeredDefenceTrainingUnitDto) {
        return new DefenceUnit(registeredDefenceTrainingUnitDto.getAddress(), registeredDefenceTrainingUnitDto.getName(), new Coordinates(Double.parseDouble(registeredDefenceTrainingUnitDto.getLatitude()), Double.parseDouble(registeredDefenceTrainingUnitDto.getLongitude())));
    }

    public static final RegisteredDefenceTrainingDate x(RegisteredDefenceTrainingDto registeredDefenceTrainingDto) {
        String name = registeredDefenceTrainingDto.getName();
        List<DefenceTrainingDayDto> listA = registeredDefenceTrainingDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(u((DefenceTrainingDayDto) it.next()));
        }
        return new RegisteredDefenceTrainingDate(name, arrayList);
    }

    public static final UserDefenceTraining y(UserDefenceTrainingDto userDefenceTrainingDto) {
        int id5 = userDefenceTrainingDto.getId();
        String name = userDefenceTrainingDto.getName();
        List<DefenceTrainingDayDto> listA = userDefenceTrainingDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(u((DefenceTrainingDayDto) it.next()));
        }
        return new UserDefenceTraining(id5, name, arrayList);
    }

    public static final RegisterForDefenceTrainingDataDto z(BERegisterForDefenceTraining bERegisterForDefenceTraining) {
        int trainingId = bERegisterForDefenceTraining.getTrainingId();
        String strE = c0.e(bERegisterForDefenceTraining.getEmail());
        PhoneNumberDto phoneNumberDto = new PhoneNumberDto(c0.e(bERegisterForDefenceTraining.getPhoneNumber().g()), c0.e(bERegisterForDefenceTraining.getPhoneNumber().h()));
        List<BERegisterForDefenceTraining.BEChildParticipant> listA = bERegisterForDefenceTraining.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (BERegisterForDefenceTraining.BEChildParticipant bEChildParticipant : listA) {
            arrayList.add(new RegisterForDefenceTrainingDataRegisteredChildDto(c0.e(bEChildParticipant.getFirstName()), c0.e(bEChildParticipant.getLastName()), c0.e(bEChildParticipant.getPesel())));
        }
        return new RegisterForDefenceTrainingDataDto(strE, phoneNumberDto, trainingId, arrayList);
    }
}
