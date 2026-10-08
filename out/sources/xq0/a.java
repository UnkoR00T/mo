package xq0;

import dx.i;
import ex.d;
import iy.c0;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tq0.BELandRegisterDocumentCumulatedSubtypeFee;
import tq0.BEOrderDocumentRequest;
import tq0.BEOrderDocumentResponse;
import tq0.LandRegisterDocument;
import tq0.LandRegisterDocumentTypesFee;
import tq0.LandRegisterSubDocument;
import tq0.MyRegistry;
import tq0.OrderedDocumentByNumber;
import tq0.g;
import tq0.k;
import tq0.l;
import tq0.m;
import tq0.n;
import tq0.o;
import tq0.q;
import tq0.t;
import xw.c;
import yq0.LandRegisterDocumentCumulatedSubtypeFeeDto;
import yq0.LandRegisterDocumentSubtypeFeeDto;
import yq0.LandRegisterDocumentTypeFeeDto;
import yq0.LandRegisterDocumentTypesFeeResponse;
import yq0.LandRegisterEntriesResponse;
import yq0.LandRegisterEntryDto;
import yq0.LandRegisterOrderedDocumentByNumberDto;
import yq0.LandRegisterOrderedDocumentDto;
import yq0.LandRegisterOrderedDocumentsResponse;
import yq0.LandRegisterReadyOrderedDocumentResponse;
import yq0.LandRegisterVerifyDocumentResponse;
import yq0.OrderLandRegisterDocumentRequestDto;
import yq0.OrderLandRegisterDocumentResponse;
import yq0.b0;
import yq0.f;
import yq0.h;
import yq0.j;
import yq0.s;
import yq0.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00010\u0006*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0006*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0006*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u0006*\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0\u0006*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010(\u001a\u00020'*\u00020&¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020+0\u0006*\u00020*¢\u0006\u0004\b,\u0010-\u001a\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/0\u0006*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0011\u00102\u001a\u00020.*\u00020/¢\u0006\u0004\b2\u00103\u001a\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002050\u0006*\u000204¢\u0006\u0004\b6\u00107\u001a\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002090\u0006*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010<\u001a\u000208*\u000209¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010@\u001a\u00020?*\u00020>¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020C0\u0006*\u00020B¢\u0006\u0004\bD\u0010E\u001a\u001d\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020G0\u0006*\u00020F¢\u0006\u0004\bH\u0010I\u001a\u001d\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020K0\u0006*\u00020J¢\u0006\u0004\bL\u0010M\u001a\u001d\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020O0\u0006*\u00020N¢\u0006\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lyq0/m;", "", "Ltq0/u;", "q", "(Lyq0/m;)Ljava/util/List;", "Lyq0/n;", "Ldx/i;", "Ldx/b;", "h", "(Lyq0/n;)Ldx/i;", "Lyq0/s;", "Ltq0/t;", "l", "(Lyq0/s;)Ldx/i;", "Lyq0/q;", "Ltq0/v;", "j", "(Lyq0/q;)Ldx/i;", "Lyq0/t;", "Ltq0/n;", "m", "(Lyq0/t;)Ldx/i;", "Lyq0/u;", "Ltq0/o;", "n", "(Lyq0/u;)Ldx/i;", "Lyq0/p;", "Ltq0/k;", "i", "(Lyq0/p;)Ldx/i;", "Lyq0/l;", "Ltq0/r;", "g", "(Lyq0/l;)Ldx/i;", "Lyq0/k;", "Ltq0/p;", "f", "(Lyq0/k;)Ldx/i;", "Lyq0/e;", "Ltq0/e;", "r", "(Lyq0/e;)Ltq0/e;", "Lyq0/i;", "Ltq0/s;", "d", "(Lyq0/i;)Ldx/i;", "Lyq0/j;", "Ltq0/g;", "e", "(Lyq0/j;)Ldx/i;", "t", "(Ltq0/g;)Lyq0/j;", "Lyq0/g;", "Ltq0/q;", "b", "(Lyq0/g;)Ldx/i;", "Lyq0/h;", "Ltq0/f;", "c", "(Lyq0/h;)Ldx/i;", "s", "(Ltq0/f;)Lyq0/h;", "Ltq0/h;", "Lyq0/z;", "u", "(Ltq0/h;)Lyq0/z;", "Lyq0/a0;", "Ltq0/i;", "o", "(Lyq0/a0;)Ldx/i;", "Lyq0/b0;", "", "p", "(Lyq0/b0;)Ldx/i;", "Lyq0/a;", "Ltq0/i$a;", "a", "(Lyq0/a;)Ldx/i;", "Lyq0/r;", "Ltq0/c;", "k", "(Lyq0/r;)Ldx/i;", "nationalcourtregistryservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: xq0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5892a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f220502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f220503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f220504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f220505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f220506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f220507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f220508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f220509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f220510j;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.LAND_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.LAND_GRANTED_FOR_PERPETUAL_USE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.LAND_GRANTED_FOR_PERPETUAL_USE_WITH_BUILDING_AS_SEPARATE_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.LAND_GRANTED_FOR_PERPETUAL_USE_WITH_EQUIPMENT_AS_SEPARATE_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.LAND_GRANTED_FOR_PERPETUAL_USE_WITH_EQUIPMENT_AND_BUILDING_AS_SEPARATE_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.BUILDING_AS_SEPARATE_PROPERTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.PREMISES_AS_SEPARATE_PROPERTY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s.COOPERATIVE_PROPERTY_OWNERSHIP_RIGHT_TO_RESIDENTIAL_PREMISES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s.COOPERATIVE_PROPERTY_RIGHT_TO_COMMERCIAL_PREMISES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s.COOPERATIVE_PROPERTY_RIGHT_TO_DETACHED_HOUSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s.COOPERATIVE_PROPERTY_OWNERSHIP_RIGHT_TO_PREMISES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f220501a = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[j.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[j.TRANSCRIPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[j.FULL_TRANSCRIPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[j.EXTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[j.CLOSING_CERTIFICATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            f220502b = iArr2;
            int[] iArr3 = new int[u.values().length];
            try {
                iArr3[u.UP_TO_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[u.OUT_OF_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[u.NON_EXISTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[u.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[u.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            f220503c = iArr3;
            int[] iArr4 = new int[q.values().length];
            try {
                iArr4[q.Generating.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[q.Rejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[q.SendingToMsError.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[q.PaymentError.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[q.ToDownload.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[q.AboutToExpire.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[q.Expired.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            f220504d = iArr4;
            int[] iArr5 = new int[h.values().length];
            try {
                iArr5[h.PROPERTY_DESIGNATION_AND_OWNERSHIP_RIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[h.OWNERSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[h.RIGHTS_CLAIMS_AND_LIMITATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[h.MORTGAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[h.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            f220505e = iArr5;
            int[] iArr6 = new int[g.values().length];
            try {
                iArr6[g.Transcript.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr6[g.FullTranscript.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[g.Extract.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[g.ClosingCertificate.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            f220506f = iArr6;
            int[] iArr7 = new int[yq0.g.values().length];
            try {
                iArr7[yq0.g.GENERATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr7[yq0.g.TO_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr7[yq0.g.ABOUT_TO_EXPIRE.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr7[yq0.g.REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr7[yq0.g.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr7[yq0.g.SENDING_TO_MS_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr7[yq0.g.PAYMENT_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr7[yq0.g.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused46) {
            }
            f220507g = iArr7;
            int[] iArr8 = new int[b0.values().length];
            try {
                iArr8[b0.PLN.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr8[b0.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            f220508h = iArr8;
            int[] iArr9 = new int[yq0.a.values().length];
            try {
                iArr9[yq0.a.BLIK_T6_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr9[yq0.a.BLIK_ONE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr9[yq0.a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr9[yq0.a.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr9[yq0.a.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr9[yq0.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused54) {
            }
            f220509i = iArr9;
            int[] iArr10 = new int[f.values().length];
            try {
                iArr10[f.READY_TO_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr10[f.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr10[f.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused57) {
            }
            f220510j = iArr10;
        }
    }

    public static final i<dx.b, BEOrderDocumentResponse.a> a(yq0.a aVar) {
        Object objB;
        BEOrderDocumentResponse.a aVar2;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    switch (C5892a.f220509i[aVar.ordinal()]) {
                        case 1:
                            aVar2 = BEOrderDocumentResponse.a.BLIK_T6_CODE;
                            break;
                        case 2:
                            aVar2 = BEOrderDocumentResponse.a.BLIK_ONE_CLICK;
                            break;
                        case 3:
                            aVar2 = BEOrderDocumentResponse.a.CARD;
                            break;
                        case 4:
                            aVar2 = BEOrderDocumentResponse.a.WALLET_GP;
                            break;
                        case 5:
                            aVar2 = BEOrderDocumentResponse.a.WALLET_AP;
                            break;
                        case 6:
                            aVar2 = BEOrderDocumentResponse.a.UNKNOWN;
                            break;
                        default:
                            throw new p();
                    }
                    return new i.Right(aVar2);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, q> b(yq0.g gVar) {
        Object objB;
        q qVar;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (C5892a.f220507g[gVar.ordinal()]) {
                        case 1:
                            qVar = q.Generating;
                            break;
                        case 2:
                            qVar = q.ToDownload;
                            break;
                        case 3:
                            qVar = q.AboutToExpire;
                            break;
                        case 4:
                            qVar = q.Rejected;
                            break;
                        case 5:
                            qVar = q.Expired;
                            break;
                        case 6:
                            qVar = q.SendingToMsError;
                            break;
                        case 7:
                            qVar = q.PaymentError;
                            break;
                        case 8:
                            aVar.b(new dx.b.Parsing(new IllegalStateException(gVar + " is not supported")));
                            throw new oq.g();
                        default:
                            throw new p();
                    }
                    return new i.Right(qVar);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, tq0.f> c(h hVar) {
        Object objB;
        Object obj;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5892a.f220505e[hVar.ordinal()];
                    if (i15 == 1) {
                        obj = tq0.f.c.f191423a;
                    } else if (i15 == 2) {
                        obj = tq0.f.b.f191421a;
                    } else if (i15 == 3) {
                        obj = tq0.f.d.f191425a;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new IllegalStateException(hVar + " is not supported")));
                            throw new oq.g();
                        }
                        obj = tq0.f.a.f191419a;
                    }
                    return new i.Right(obj);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, LandRegisterSubDocument> d(LandRegisterDocumentSubtypeFeeDto landRegisterDocumentSubtypeFeeDto) {
        Object objB;
        tq0.f fVar;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BigDecimal amount = landRegisterDocumentSubtypeFeeDto.getAmount();
                    int i15 = C5892a.f220505e[landRegisterDocumentSubtypeFeeDto.getType().ordinal()];
                    if (i15 == 1) {
                        fVar = tq0.f.c.f191423a;
                    } else if (i15 == 2) {
                        fVar = tq0.f.b.f191421a;
                    } else if (i15 == 3) {
                        fVar = tq0.f.d.f191425a;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new IllegalStateException(landRegisterDocumentSubtypeFeeDto + " is not supported")));
                            throw new oq.g();
                        }
                        fVar = tq0.f.a.f191419a;
                    }
                    return new i.Right(new LandRegisterSubDocument(amount, fVar));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar2 = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar2.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, g> e(j jVar) {
        Object objB;
        g gVar;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5892a.f220502b[jVar.ordinal()];
                    if (i15 == 1) {
                        aVar.b(new dx.b.Parsing(new IllegalStateException(jVar + " is not supported")));
                        throw new oq.g();
                    }
                    if (i15 == 2) {
                        gVar = g.Transcript;
                    } else if (i15 == 3) {
                        gVar = g.FullTranscript;
                    } else if (i15 == 4) {
                        gVar = g.Extract;
                    } else {
                        if (i15 != 5) {
                            throw new p();
                        }
                        gVar = g.ClosingCertificate;
                    }
                    return new i.Right(gVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, LandRegisterDocument> f(LandRegisterDocumentTypeFeeDto landRegisterDocumentTypeFeeDto) {
        Object objB;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    g gVar = (g) aVar.a(e(landRegisterDocumentTypeFeeDto.getType()));
                    List<LandRegisterDocumentSubtypeFeeDto> listC = landRegisterDocumentTypeFeeDto.c();
                    ArrayList arrayList = new ArrayList(v.y(listC, 10));
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add((LandRegisterSubDocument) aVar.a(d((LandRegisterDocumentSubtypeFeeDto) it.next())));
                    }
                    BigDecimal amount = landRegisterDocumentTypeFeeDto.getAmount();
                    List<LandRegisterDocumentCumulatedSubtypeFeeDto> listB = landRegisterDocumentTypeFeeDto.b();
                    ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
                    Iterator<T> it4 = listB.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(r((LandRegisterDocumentCumulatedSubtypeFeeDto) it4.next()));
                    }
                    return new i.Right(new LandRegisterDocument(arrayList2, gVar, arrayList, amount));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, LandRegisterDocumentTypesFee> g(LandRegisterDocumentTypesFeeResponse landRegisterDocumentTypesFeeResponse) {
        Object objB;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<LandRegisterDocumentTypeFeeDto> listA = landRegisterDocumentTypesFeeResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((LandRegisterDocument) aVar.a(f((LandRegisterDocumentTypeFeeDto) it.next())));
                    }
                    List<LandRegisterDocumentTypeFeeDto> listB = landRegisterDocumentTypesFeeResponse.b();
                    ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
                    Iterator<T> it4 = listB.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add((LandRegisterDocument) aVar.a(f((LandRegisterDocumentTypeFeeDto) it4.next())));
                    }
                    return new i.Right(new LandRegisterDocumentTypesFee(arrayList, arrayList2));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, MyRegistry> h(LandRegisterEntryDto landRegisterEntryDto) {
        Object objB;
        MyRegistry.b bVar;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    iy.b0 b0VarG = c0.g(landRegisterEntryDto.getCourt());
                    iy.b0 b0VarG2 = c0.g(landRegisterEntryDto.getDepartment());
                    iy.b0 b0VarG3 = c0.g(landRegisterEntryDto.getId());
                    iy.b0 b0VarG4 = c0.g(landRegisterEntryDto.getNumber());
                    t tVar = (t) aVar.a(l(landRegisterEntryDto.getType()));
                    List<String> listE = landRegisterEntryDto.e();
                    ArrayList arrayList = new ArrayList(v.y(listE, 10));
                    Iterator<T> it = listE.iterator();
                    while (it.hasNext()) {
                        arrayList.add(MyRegistry.a.a(MyRegistry.a.b(c0.g((String) it.next()))));
                    }
                    List<iy.b0> listB = c0.b(landRegisterEntryDto.h());
                    OffsetDateTime closingDate = landRegisterEntryDto.getClosingDate();
                    fz.b.OffsetDateTime offsetDateTime = closingDate != null ? new fz.b.OffsetDateTime(closingDate) : null;
                    boolean open = landRegisterEntryDto.getOpen();
                    if (open) {
                        bVar = MyRegistry.b.Open;
                    } else {
                        if (open) {
                            throw new p();
                        }
                        bVar = MyRegistry.b.Closed;
                    }
                    return new i.Right(new MyRegistry(b0VarG, b0VarG2, b0VarG3, arrayList, b0VarG4, bVar, listB, tVar, offsetDateTime));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c8  */
    public static final i<dx.b, k> i(LandRegisterOrderedDocumentDto landRegisterOrderedDocumentDto) {
        Object objB;
        Object generating;
        Object toDownload;
        tq0.b.Main main;
        tq0.b.Confirmation confirmation;
        tq0.b.Main main2;
        tq0.b.Confirmation confirmation2;
        tq0.b.Main main3;
        tq0.b.Confirmation confirmation3;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (C5892a.f220504d[((q) aVar.a(b(landRegisterOrderedDocumentDto.getStatus()))).ordinal()]) {
                        case 1:
                            String strB = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            List<iy.b0> listB = c0.b(landRegisterOrderedDocumentDto.h());
                            g gVar = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            String verificationCode = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode == null) {
                                verificationCode = "";
                            }
                            String strB2 = l.b(verificationCode);
                            String number = landRegisterOrderedDocumentDto.getNumber();
                            List<h> listJ = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList = new ArrayList(v.y(listJ, 10));
                            Iterator<T> it = listJ.iterator();
                            while (it.hasNext()) {
                                arrayList.add((tq0.f) aVar.a(c((h) it.next())));
                            }
                            generating = new k.Generating(strB, strB2, listB, gVar, number, arrayList, null);
                            toDownload = generating;
                            return new i.Right(toDownload);
                        case 2:
                            String strB3 = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            List<iy.b0> listB2 = c0.b(landRegisterOrderedDocumentDto.h());
                            g gVar2 = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            String verificationCode2 = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode2 == null) {
                                verificationCode2 = "";
                            }
                            String strB4 = l.b(verificationCode2);
                            String number2 = landRegisterOrderedDocumentDto.getNumber();
                            List<h> listJ2 = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList2 = new ArrayList(v.y(listJ2, 10));
                            Iterator<T> it4 = listJ2.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add((tq0.f) aVar.a(c((h) it4.next())));
                            }
                            generating = new k.Rejected(strB3, strB4, listB2, gVar2, number2, arrayList2, null);
                            toDownload = generating;
                            return new i.Right(toDownload);
                        case 3:
                            String strB5 = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            List<iy.b0> listB3 = c0.b(landRegisterOrderedDocumentDto.h());
                            g gVar3 = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            String verificationCode3 = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode3 == null) {
                                verificationCode3 = "";
                            }
                            String strB6 = l.b(verificationCode3);
                            String number3 = landRegisterOrderedDocumentDto.getNumber();
                            List<h> listJ3 = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList3 = new ArrayList(v.y(listJ3, 10));
                            Iterator<T> it5 = listJ3.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add((tq0.f) aVar.a(c((h) it5.next())));
                            }
                            generating = new k.GenericError(strB5, strB6, listB3, gVar3, number3, arrayList3, null);
                            toDownload = generating;
                            return new i.Right(toDownload);
                        case 4:
                            String strB7 = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            List<iy.b0> listB4 = c0.b(landRegisterOrderedDocumentDto.h());
                            g gVar4 = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            String verificationCode4 = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode4 == null) {
                                verificationCode4 = "";
                            }
                            String strB8 = l.b(verificationCode4);
                            String number4 = landRegisterOrderedDocumentDto.getNumber();
                            List<h> listJ4 = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList4 = new ArrayList(v.y(listJ4, 10));
                            Iterator<T> it6 = listJ4.iterator();
                            while (it6.hasNext()) {
                                arrayList4.add((tq0.f) aVar.a(c((h) it6.next())));
                            }
                            generating = new k.PaymentError(strB7, strB8, listB4, gVar4, number4, arrayList4, null);
                            toDownload = generating;
                            return new i.Right(toDownload);
                        case 5:
                            String strB9 = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            String documentId = landRegisterOrderedDocumentDto.getDocumentId();
                            if (documentId == null) {
                                main = null;
                            } else {
                                Boolean documentDownloadValid = landRegisterOrderedDocumentDto.getDocumentDownloadValid();
                                if (!(documentDownloadValid != null ? documentDownloadValid.booleanValue() : false)) {
                                    documentId = null;
                                }
                                if (documentId != null) {
                                    main = new tq0.b.Main(documentId);
                                } else {
                                    main = null;
                                }
                            }
                            String confirmationId = landRegisterOrderedDocumentDto.getConfirmationId();
                            if (confirmationId == null) {
                                confirmation = null;
                            } else {
                                Boolean confirmationDownloadValid = landRegisterOrderedDocumentDto.getConfirmationDownloadValid();
                                if (!(confirmationDownloadValid != null ? confirmationDownloadValid.booleanValue() : false)) {
                                    confirmationId = null;
                                }
                                if (confirmationId != null) {
                                    confirmation = new tq0.b.Confirmation(confirmationId);
                                } else {
                                    confirmation = null;
                                }
                            }
                            List<iy.b0> listB5 = c0.b(landRegisterOrderedDocumentDto.h());
                            List<h> listJ5 = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList5 = new ArrayList(v.y(listJ5, 10));
                            Iterator<T> it7 = listJ5.iterator();
                            while (it7.hasNext()) {
                                arrayList5.add((tq0.f) aVar.a(c((h) it7.next())));
                            }
                            g gVar5 = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            fz.b.OffsetDateTime offsetDateTime = landRegisterOrderedDocumentDto.getDocumentDownloadValidUntil() != null ? new fz.b.OffsetDateTime(landRegisterOrderedDocumentDto.getDocumentDownloadValidUntil()) : null;
                            String verificationCode5 = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode5 == null) {
                                verificationCode5 = "";
                            }
                            toDownload = new k.ToDownload(strB9, main, confirmation, listB5, arrayList5, offsetDateTime, l.b(verificationCode5), gVar5, landRegisterOrderedDocumentDto.getNumber(), null);
                            return new i.Right(toDownload);
                        case 6:
                            String strB10 = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            String documentId2 = landRegisterOrderedDocumentDto.getDocumentId();
                            if (documentId2 == null) {
                                main2 = null;
                            } else {
                                Boolean documentDownloadValid2 = landRegisterOrderedDocumentDto.getDocumentDownloadValid();
                                if (!(documentDownloadValid2 != null ? documentDownloadValid2.booleanValue() : false)) {
                                    documentId2 = null;
                                }
                                if (documentId2 != null) {
                                    main2 = new tq0.b.Main(documentId2);
                                } else {
                                    main2 = null;
                                }
                            }
                            String confirmationId2 = landRegisterOrderedDocumentDto.getConfirmationId();
                            if (confirmationId2 == null) {
                                confirmation2 = null;
                            } else {
                                Boolean confirmationDownloadValid2 = landRegisterOrderedDocumentDto.getConfirmationDownloadValid();
                                if (!(confirmationDownloadValid2 != null ? confirmationDownloadValid2.booleanValue() : false)) {
                                    confirmationId2 = null;
                                }
                                if (confirmationId2 != null) {
                                    confirmation2 = new tq0.b.Confirmation(confirmationId2);
                                } else {
                                    confirmation2 = null;
                                }
                            }
                            List<iy.b0> listB6 = c0.b(landRegisterOrderedDocumentDto.h());
                            List<h> listJ6 = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList6 = new ArrayList(v.y(listJ6, 10));
                            Iterator<T> it8 = listJ6.iterator();
                            while (it8.hasNext()) {
                                arrayList6.add((tq0.f) aVar.a(c((h) it8.next())));
                            }
                            g gVar6 = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            fz.b.OffsetDateTime offsetDateTime2 = landRegisterOrderedDocumentDto.getDocumentDownloadValidUntil() != null ? new fz.b.OffsetDateTime(landRegisterOrderedDocumentDto.getDocumentDownloadValidUntil()) : null;
                            String verificationCode6 = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode6 == null) {
                                verificationCode6 = "";
                            }
                            toDownload = new k.AboutToExpire(strB10, main2, confirmation2, listB6, arrayList6, offsetDateTime2, l.b(verificationCode6), gVar6, landRegisterOrderedDocumentDto.getNumber(), null);
                            return new i.Right(toDownload);
                        case 7:
                            String strB11 = tq0.j.b(landRegisterOrderedDocumentDto.getId());
                            String documentId3 = landRegisterOrderedDocumentDto.getDocumentId();
                            if (documentId3 == null) {
                                main3 = null;
                            } else {
                                Boolean documentDownloadValid3 = landRegisterOrderedDocumentDto.getDocumentDownloadValid();
                                if (!(documentDownloadValid3 != null ? documentDownloadValid3.booleanValue() : false)) {
                                    documentId3 = null;
                                }
                                if (documentId3 != null) {
                                    main3 = new tq0.b.Main(documentId3);
                                } else {
                                    main3 = null;
                                }
                            }
                            String confirmationId3 = landRegisterOrderedDocumentDto.getConfirmationId();
                            if (confirmationId3 == null) {
                                confirmation3 = null;
                            } else {
                                Boolean confirmationDownloadValid3 = landRegisterOrderedDocumentDto.getConfirmationDownloadValid();
                                if (!(confirmationDownloadValid3 != null ? confirmationDownloadValid3.booleanValue() : false)) {
                                    confirmationId3 = null;
                                }
                                if (confirmationId3 != null) {
                                    confirmation3 = new tq0.b.Confirmation(confirmationId3);
                                } else {
                                    confirmation3 = null;
                                }
                            }
                            List<iy.b0> listB7 = c0.b(landRegisterOrderedDocumentDto.h());
                            List<h> listJ7 = landRegisterOrderedDocumentDto.j();
                            ArrayList arrayList7 = new ArrayList(v.y(listJ7, 10));
                            Iterator<T> it9 = listJ7.iterator();
                            while (it9.hasNext()) {
                                arrayList7.add((tq0.f) aVar.a(c((h) it9.next())));
                            }
                            g gVar7 = (g) aVar.a(e(landRegisterOrderedDocumentDto.getType()));
                            fz.b.OffsetDateTime offsetDateTime3 = landRegisterOrderedDocumentDto.getDocumentDownloadValidUntil() != null ? new fz.b.OffsetDateTime(landRegisterOrderedDocumentDto.getDocumentDownloadValidUntil()) : null;
                            String verificationCode7 = landRegisterOrderedDocumentDto.getVerificationCode();
                            if (verificationCode7 == null) {
                                verificationCode7 = "";
                            }
                            toDownload = new k.Expired(strB11, main3, confirmation3, listB7, arrayList7, offsetDateTime3, l.b(verificationCode7), gVar7, landRegisterOrderedDocumentDto.getNumber(), null);
                            return new i.Right(toDownload);
                        default:
                            throw new p();
                    }
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    fVar.d(message != null ? message : "", e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, List<OrderedDocumentByNumber>> j(LandRegisterOrderedDocumentsResponse landRegisterOrderedDocumentsResponse) {
        Object objB;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<LandRegisterOrderedDocumentByNumberDto> listA = landRegisterOrderedDocumentsResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    for (LandRegisterOrderedDocumentByNumberDto landRegisterOrderedDocumentByNumberDto : listA) {
                        String number = landRegisterOrderedDocumentByNumberDto.getNumber();
                        List<LandRegisterOrderedDocumentDto> listB = landRegisterOrderedDocumentByNumberDto.b();
                        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((k) aVar.a(i((LandRegisterOrderedDocumentDto) it.next())));
                        }
                        arrayList.add(new OrderedDocumentByNumber(number, arrayList2));
                    }
                    return new i.Right(arrayList);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, tq0.c> k(LandRegisterReadyOrderedDocumentResponse landRegisterReadyOrderedDocumentResponse) {
        Object objB;
        Object document;
        i<dx.b, k> iVarI;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5892a.f220510j[landRegisterReadyOrderedDocumentResponse.getGenerationStatus().ordinal()];
                    if (i15 == 1) {
                        LandRegisterOrderedDocumentDto document2 = landRegisterReadyOrderedDocumentResponse.getDocument();
                        document = new tq0.c.Document((k.b) ((document2 == null || (iVarI = i(document2)) == null) ? null : (k) aVar.a(iVarI)));
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new IllegalStateException(landRegisterReadyOrderedDocumentResponse.getGenerationStatus() + " is not supported")));
                            throw new oq.g();
                        }
                        document = tq0.c.b.f191415a;
                    }
                    return new i.Right(document);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, t> l(s sVar) {
        Object objB;
        t tVar;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (C5892a.f220501a[sVar.ordinal()]) {
                        case 1:
                            tVar = t.LandProperty;
                            break;
                        case 2:
                            tVar = t.LandGrantedForPerpetualUse;
                            break;
                        case 3:
                            tVar = t.LandGrantedForPerpetualUseWithBuildingAsSeparateProperty;
                            break;
                        case 4:
                            tVar = t.LandGrantedForPerpetualUseWithEquipmentAsSeparateProperty;
                            break;
                        case 5:
                            tVar = t.LandGrantedForPerpetualUseWithEquipmentAndBuildingAsSeparateProperty;
                            break;
                        case 6:
                            tVar = t.BuildingAsSeparateProperty;
                            break;
                        case 7:
                            tVar = t.PremisesAsSeparateProperty;
                            break;
                        case 8:
                            tVar = t.CooperativePropertyOwnershipRightToResidentialPremises;
                            break;
                        case 9:
                            tVar = t.CooperativePropertyRightToCommercialPremises;
                            break;
                        case 10:
                            tVar = t.CooperativePropertyRightToDetachedHouse;
                            break;
                        case 11:
                            tVar = t.CooperativePropertyOwnershipRightToPremises;
                            break;
                        case 12:
                            aVar.b(new dx.b.Parsing(new IllegalStateException(sVar + " is not supported")));
                            throw new oq.g();
                        default:
                            throw new p();
                    }
                    return new i.Right(tVar);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, n> m(LandRegisterVerifyDocumentResponse landRegisterVerifyDocumentResponse) {
        Object objB;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    o oVar = (o) aVar.a(n(landRegisterVerifyDocumentResponse.getStatus()));
                    fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(landRegisterVerifyDocumentResponse.getVerificationDate());
                    String strA = m.a(landRegisterVerifyDocumentResponse.getVerificationId());
                    String number = landRegisterVerifyDocumentResponse.getNumber();
                    String documentCopyId = landRegisterVerifyDocumentResponse.getDocumentCopyId();
                    g gVar = null;
                    String strA2 = documentCopyId != null ? tq0.a.a(documentCopyId) : null;
                    j type = landRegisterVerifyDocumentResponse.getType();
                    int i15 = type == null ? -1 : C5892a.f220502b[type.ordinal()];
                    if (i15 != -1 && i15 != 1) {
                        gVar = (g) aVar.a(e(landRegisterVerifyDocumentResponse.getType()));
                    }
                    return new i.Right(new n(oVar, offsetDateTime, strA, strA2, number, gVar, null));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, o> n(u uVar) {
        Object objB;
        o oVar;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5892a.f220503c[uVar.ordinal()];
                    if (i15 == 1) {
                        oVar = o.UP_TO_DATE;
                    } else if (i15 == 2) {
                        oVar = o.OUT_OF_DATE;
                    } else if (i15 == 3) {
                        oVar = o.NON_EXISTENT;
                    } else {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new IllegalStateException(uVar + " is not supported")));
                            throw new oq.g();
                        }
                        oVar = o.EXPIRED;
                    }
                    return new i.Right(oVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, BEOrderDocumentResponse> o(OrderLandRegisterDocumentResponse orderLandRegisterDocumentResponse) {
        Object objB;
        i right;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BigDecimal amount = orderLandRegisterDocumentResponse.getAmount();
                    List<yq0.a> listB = orderLandRegisterDocumentResponse.b();
                    ArrayList arrayList = new ArrayList(v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        i<dx.b, BEOrderDocumentResponse.a> iVarA = a((yq0.a) it.next());
                        if (iVarA instanceof i.Left) {
                            right = new i.Left(((i.Left) iVarA).b());
                            return new i.Right(new BEOrderDocumentResponse(amount, (List) aVar.a(right), (String) aVar.a(p(orderLandRegisterDocumentResponse.getCurrency())), orderLandRegisterDocumentResponse.getDescription(), orderLandRegisterDocumentResponse.getInstitutionId(), orderLandRegisterDocumentResponse.getInstitutionName(), tq0.j.b(orderLandRegisterDocumentResponse.getOrderId()), orderLandRegisterDocumentResponse.getPaymentId(), null));
                        }
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        arrayList.add(((i.Right) iVarA).b());
                    }
                    right = new i.Right(arrayList);
                    return new i.Right(new BEOrderDocumentResponse(amount, (List) aVar.a(right), (String) aVar.a(p(orderLandRegisterDocumentResponse.getCurrency())), orderLandRegisterDocumentResponse.getDescription(), orderLandRegisterDocumentResponse.getInstitutionId(), orderLandRegisterDocumentResponse.getInstitutionName(), tq0.j.b(orderLandRegisterDocumentResponse.getOrderId()), orderLandRegisterDocumentResponse.getPaymentId(), null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, String> p(b0 b0Var) {
        Object objB;
        dx.j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5892a.f220508h[b0Var.ordinal()];
                    if (i15 == 1) {
                        return new i.Right(b0Var.getValue());
                    }
                    if (i15 != 2) {
                        throw new p();
                    }
                    aVar.b(new dx.b.Parsing(new IllegalStateException(b0Var + " is not supported")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final List<MyRegistry> q(LandRegisterEntriesResponse landRegisterEntriesResponse) {
        List<LandRegisterEntryDto> listA = landRegisterEntriesResponse.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            MyRegistry myRegistryA = h((LandRegisterEntryDto) it.next()).a();
            if (myRegistryA != null) {
                arrayList.add(myRegistryA);
            }
        }
        return arrayList;
    }

    public static final BELandRegisterDocumentCumulatedSubtypeFee r(LandRegisterDocumentCumulatedSubtypeFeeDto landRegisterDocumentCumulatedSubtypeFeeDto) {
        return new BELandRegisterDocumentCumulatedSubtypeFee(landRegisterDocumentCumulatedSubtypeFeeDto.getAmount(), landRegisterDocumentCumulatedSubtypeFeeDto.getTotal());
    }

    public static final h s(tq0.f fVar) {
        if (fr.t.c(fVar, tq0.f.c.f191423a)) {
            return h.PROPERTY_DESIGNATION_AND_OWNERSHIP_RIGHTS;
        }
        if (fr.t.c(fVar, tq0.f.b.f191421a)) {
            return h.OWNERSHIP;
        }
        if (fr.t.c(fVar, tq0.f.d.f191425a)) {
            return h.RIGHTS_CLAIMS_AND_LIMITATIONS;
        }
        if (fr.t.c(fVar, tq0.f.a.f191419a)) {
            return h.MORTGAGE;
        }
        throw new p();
    }

    public static final j t(g gVar) {
        int i15 = C5892a.f220506f[gVar.ordinal()];
        if (i15 == 1) {
            return j.TRANSCRIPT;
        }
        if (i15 == 2) {
            return j.FULL_TRANSCRIPT;
        }
        if (i15 == 3) {
            return j.EXTRACT;
        }
        if (i15 == 4) {
            return j.CLOSING_CERTIFICATE;
        }
        throw new p();
    }

    public static final OrderLandRegisterDocumentRequestDto u(BEOrderDocumentRequest bEOrderDocumentRequest) {
        BigDecimal amount = bEOrderDocumentRequest.getAmount();
        j jVarT = t(bEOrderDocumentRequest.getDocumentType());
        String entryId = bEOrderDocumentRequest.getEntryId();
        List<tq0.f> listB = bEOrderDocumentRequest.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(s((tq0.f) it.next()));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new OrderLandRegisterDocumentRequestDto(amount, jVarT, entryId, arrayList);
    }
}
