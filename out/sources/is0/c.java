package is0;

import as0.BETransaction;
import as0.BETransactionCardDetails;
import as0.BETransactionDetailsDomain;
import as0.e;
import fr.t;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import js0.AddressDto;
import js0.AliasDto;
import js0.BlikTransactionDto;
import js0.InterestDto;
import js0.PaymentDetailsDto;
import js0.PaymentDto;
import js0.PaymentPackageSummaryDto;
import js0.PaymentPartDto;
import js0.PaymentWidgetDataDto;
import js0.PaymentWidgetDataResponse;
import js0.PaymentsPackageDto;
import js0.ProlongationDto;
import js0.ReminderPaymentDto;
import js0.StartBlikPaymentRequestDto;
import js0.StartOneClickBlikPaymentRequestDto;
import js0.StartPaymentResultDto;
import js0.TransactionCardDetailsDto;
import js0.TransactionDetailsDto;
import js0.TransactionDto;
import js0.a0;
import js0.d0;
import js0.e1;
import js0.f;
import js0.g;
import js0.g0;
import js0.h0;
import js0.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ur0.BEAlias;
import ur0.BEStartBlikPaymentRequest;
import ur0.BEStartOneClickBlikPaymentRequest;
import ur0.BEStartPaymentResult;
import wr0.BEPaymentAddress;
import yr0.BEInterest;
import yr0.BEPaymentDetails;
import yr0.BEPaymentInfo;
import yr0.BEPaymentPackage;
import yr0.BEPaymentPackageSummary;
import yr0.BEPaymentPart;
import yr0.BEPaymentReminder;
import yr0.BEPaymentWidgetData;
import yr0.BEPaymentWidgetDataResponse;
import yr0.BEProlongation;
import yr0.m;
import yr0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0011\u00101\u001a\u000200*\u00020/¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00109\u001a\u000208*\u000207¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010=\u001a\u00020<*\u00020;¢\u0006\u0004\b=\u0010>\u001a\u0011\u0010A\u001a\u00020@*\u00020?¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020?*\u00020@¢\u0006\u0004\bC\u0010D\u001a\u0011\u0010G\u001a\u00020F*\u00020E¢\u0006\u0004\bG\u0010H\u001a\u0011\u0010K\u001a\u00020J*\u00020I¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0011\u0010S\u001a\u00020R*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010W\u001a\u00020V*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010[\u001a\u00020Z*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0011\u0010_\u001a\u00020^*\u00020]¢\u0006\u0004\b_\u0010`\u001a\u0011\u0010c\u001a\u00020b*\u00020a¢\u0006\u0004\bc\u0010d\u001a\u0011\u0010g\u001a\u00020f*\u00020e¢\u0006\u0004\bg\u0010h\u001a\u0011\u0010k\u001a\u00020j*\u00020i¢\u0006\u0004\bk\u0010l\u001a\u0011\u0010o\u001a\u00020n*\u00020m¢\u0006\u0004\bo\u0010p\u001a\u0011\u0010s\u001a\u00020r*\u00020q¢\u0006\u0004\bs\u0010t\u001a\u0011\u0010w\u001a\u00020v*\u00020u¢\u0006\u0004\bw\u0010x¨\u0006y"}, d2 = {"Ljs0/c0;", "Lyr0/h;", "r", "(Ljs0/c0;)Lyr0/h;", "", "g", "(Ljava/util/List;)Ljava/util/List;", "Ljs0/b0;", "Lyr0/e;", "q", "(Ljs0/b0;)Lyr0/e;", "Ljs0/e0;", "Lyr0/j;", "t", "(Ljs0/e0;)Lyr0/j;", "Ljs0/p0;", "Lyr0/l;", "v", "(Ljs0/p0;)Lyr0/l;", "Ljs0/a;", "Lwr0/a;", "l", "(Ljs0/a;)Lwr0/a;", "Ljs0/y;", "Lyr0/b;", "n", "(Ljs0/y;)Lyr0/b;", "Ljs0/m0;", "Lyr0/q;", "A", "(Ljs0/m0;)Lyr0/q;", "Ljs0/c;", "Lyr0/c;", "o", "(Ljs0/c;)Lyr0/c;", "Ljs0/d;", "Lyr0/a;", "m", "(Ljs0/d;)Lyr0/a;", "Ljs0/a1;", "Lur0/g;", "k", "(Ljs0/a1;)Lur0/g;", "Ljs0/e;", "Lur0/b;", "i", "(Ljs0/e;)Lur0/b;", "Ljs0/l0;", "Lyr0/i;", "s", "(Ljs0/l0;)Lyr0/i;", "Ljs0/f0;", "Lyr0/k;", "u", "(Ljs0/f0;)Lyr0/k;", "Ljs0/f;", "Lur0/c;", "j", "(Ljs0/f;)Lur0/c;", "Lur0/e;", "Ljs0/s0;", ip.a.f96138c, "(Lur0/e;)Ljs0/s0;", "Ljs0/b;", "Lur0/a;", "h", "(Ljs0/b;)Lur0/a;", "B", "(Lur0/a;)Ljs0/b;", "Lur0/f;", "Ljs0/z0;", "E", "(Lur0/f;)Ljs0/z0;", "Lyr0/g;", "Ljs0/h0;", "C", "(Lyr0/g;)Ljs0/h0;", "Ljs0/d1;", "Las0/a;", "a", "(Ljs0/d1;)Las0/a;", "Ljs0/d1$a;", "Las0/e;", "e", "(Ljs0/d1$a;)Las0/e;", "Ljs0/c1;", "Las0/c;", "c", "(Ljs0/c1;)Las0/c;", "Ljs0/c1$a;", "Las0/d;", "d", "(Ljs0/c1$a;)Las0/d;", "Ljs0/e1;", "Las0/f;", "f", "(Ljs0/e1;)Las0/f;", "Ljs0/b1;", "Las0/b;", "b", "(Ljs0/b1;)Las0/b;", "Ljs0/i0;", "Lyr0/n;", "x", "(Ljs0/i0;)Lyr0/n;", "Ljs0/k0;", "Lyr0/p;", "z", "(Ljs0/k0;)Lyr0/p;", "Ljs0/j0;", "Lyr0/o;", "y", "(Ljs0/j0;)Lyr0/o;", "Ljs0/g0;", "Lyr0/m;", "w", "(Ljs0/g0;)Lyr0/m;", "Ljs0/a0;", "Lyr0/d;", "p", "(Ljs0/a0;)Lyr0/d;", "paymentservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f96878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f96879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f96880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f96881f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f96882g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f96883h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f96884i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f96885j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f96886k;

        static {
            int[] iArr = new int[js0.c.values().length];
            try {
                iArr[js0.c.START_PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[js0.c.DOWNLOAD_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[js0.c.CHOOSE_INSTALLMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[js0.c.ACCEPT_INSTANT_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[js0.c.REJECT_INSTANT_PAYMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[js0.c.WITHDRAW_PAYMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[js0.c.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f96876a = iArr;
            int[] iArr2 = new int[js0.d.values().length];
            try {
                iArr2[js0.d.BLIK_T6_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[js0.d.BLIK_ONE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[js0.d.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[js0.d.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[js0.d.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[js0.d.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f96877b = iArr2;
            int[] iArr3 = new int[g.values().length];
            try {
                iArr3[g.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[g.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[g.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[g.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            f96878c = iArr3;
            int[] iArr4 = new int[f.values().length];
            try {
                iArr4[f.INVALID_BLIK_ALIAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[f.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            f96879d = iArr4;
            int[] iArr5 = new int[yr0.g.values().length];
            try {
                iArr5[yr0.g.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[yr0.g.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[yr0.g.HISTORIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f96880e = iArr5;
            int[] iArr6 = new int[TransactionDto.a.values().length];
            try {
                iArr6[TransactionDto.a.BLIK.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[TransactionDto.a.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[TransactionDto.a.WALLET_GP.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[TransactionDto.a.WALLET_AP.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[TransactionDto.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            f96881f = iArr6;
            int[] iArr7 = new int[TransactionDetailsDto.a.values().length];
            try {
                iArr7[TransactionDetailsDto.a.BLIK.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[TransactionDetailsDto.a.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[TransactionDetailsDto.a.WALLET_GP.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[TransactionDetailsDto.a.WALLET_AP.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[TransactionDetailsDto.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            f96882g = iArr7;
            int[] iArr8 = new int[e1.values().length];
            try {
                iArr8[e1.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr8[e1.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr8[e1.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[e1.REVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[e1.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            f96883h = iArr8;
            int[] iArr9 = new int[i0.values().length];
            try {
                iArr9[i0.MASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr9[i0.INSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr9[i0.STAMP_DUTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr9[i0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused41) {
            }
            f96884i = iArr9;
            int[] iArr10 = new int[g0.values().length];
            try {
                iArr10[g0.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr10[g0.IN_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr10[g0.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr10[g0.OVERDUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr10[g0.REMITTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr10[g0.ENFORCEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr10[g0.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr10[g0.WITHDRAWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr10[g0.REGISTERED.ordinal()] = 9;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr10[g0.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused51) {
            }
            f96885j = iArr10;
            int[] iArr11 = new int[a0.values().length];
            try {
                iArr11[a0.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr11[a0.MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr11[a0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            f96886k = iArr11;
        }
    }

    public static final BEProlongation A(ProlongationDto prolongationDto) {
        return new BEProlongation(prolongationDto.getAmount());
    }

    public static final AliasDto B(BEAlias bEAlias) {
        String oneClickAliasId = bEAlias.getOneClickAliasId();
        return new AliasDto(bEAlias.getAliasLabel(), bEAlias.getAliasValue(), bEAlias.getAppLabel(), oneClickAliasId);
    }

    public static final h0 C(yr0.g gVar) {
        int i15 = a.f96880e[gVar.ordinal()];
        if (i15 == 1) {
            return h0.ALL;
        }
        if (i15 == 2) {
            return h0.PENDING;
        }
        if (i15 == 3) {
            return h0.HISTORIC;
        }
        throw new p();
    }

    public static final StartBlikPaymentRequestDto D(BEStartBlikPaymentRequest bEStartBlikPaymentRequest) {
        return new StartBlikPaymentRequestDto(bEStartBlikPaymentRequest.getBlikCode(), bEStartBlikPaymentRequest.b());
    }

    public static final StartOneClickBlikPaymentRequestDto E(BEStartOneClickBlikPaymentRequest bEStartOneClickBlikPaymentRequest) {
        return new StartOneClickBlikPaymentRequestDto(B(bEStartOneClickBlikPaymentRequest.getAlias()), bEStartOneClickBlikPaymentRequest.b());
    }

    public static final BETransaction a(TransactionDto transactionDto) {
        return new BETransaction(transactionDto.getTransactionId(), e(transactionDto.getPaymentMethod()), f(transactionDto.getTransactionStatus()), transactionDto.getCreatedAt());
    }

    public static final BETransactionCardDetails b(TransactionCardDetailsDto transactionCardDetailsDto) {
        return new BETransactionCardDetails(transactionCardDetailsDto.getCardNumberMasked());
    }

    public static final BETransactionDetailsDomain c(TransactionDetailsDto transactionDetailsDto) {
        String transactionId = transactionDetailsDto.getTransactionId();
        as0.d dVarD = d(transactionDetailsDto.getPaymentMethod());
        as0.f fVarF = f(transactionDetailsDto.getTransactionStatus());
        OffsetDateTime createdAt = transactionDetailsDto.getCreatedAt();
        BigDecimal amount = transactionDetailsDto.getAmount();
        boolean isEpoAvailable = transactionDetailsDto.getIsEpoAvailable();
        TransactionCardDetailsDto cardDetails = transactionDetailsDto.getCardDetails();
        return new BETransactionDetailsDomain(transactionId, dVarD, fVarF, createdAt, amount, isEpoAvailable, cardDetails != null ? b(cardDetails) : null);
    }

    public static final as0.d d(TransactionDetailsDto.a aVar) {
        int i15 = a.f96882g[aVar.ordinal()];
        if (i15 == 1) {
            return as0.d.BLIK;
        }
        if (i15 == 2) {
            return as0.d.CARD;
        }
        if (i15 == 3) {
            return as0.d.WALLET_GP;
        }
        if (i15 == 4) {
            return as0.d.WALLET_AP;
        }
        if (i15 == 5) {
            return as0.d.UNKNOWN;
        }
        throw new p();
    }

    public static final e e(TransactionDto.a aVar) {
        int i15 = a.f96881f[aVar.ordinal()];
        if (i15 == 1) {
            return e.BLIK;
        }
        if (i15 == 2) {
            return e.CARD;
        }
        if (i15 == 3) {
            return e.WALLET_GP;
        }
        if (i15 == 4) {
            return e.WALLET_AP;
        }
        if (i15 == 5) {
            return e.UNKNOWN;
        }
        throw new p();
    }

    public static final as0.f f(e1 e1Var) {
        int i15 = a.f96883h[e1Var.ordinal()];
        if (i15 == 1) {
            return as0.f.PENDING;
        }
        if (i15 == 2) {
            return as0.f.ACCEPTED;
        }
        if (i15 == 3) {
            return as0.f.REJECTED;
        }
        if (i15 == 4) {
            return as0.f.REVERSAL;
        }
        if (i15 == 5) {
            return as0.f.UNKNOWN;
        }
        throw new p();
    }

    public static final List<BEPaymentInfo> g(List<PaymentDto> list) {
        List<PaymentDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(r((PaymentDto) it.next()));
        }
        return arrayList;
    }

    public static final BEAlias h(AliasDto aliasDto) {
        return new BEAlias(aliasDto.getOneClickAliasId(), aliasDto.getAliasLabel(), aliasDto.getAppLabel(), aliasDto.getAliasValue());
    }

    public static final ur0.b i(BlikTransactionDto blikTransactionDto) {
        int i15 = a.f96878c[blikTransactionDto.getStatus().ordinal()];
        if (i15 == 1) {
            return ur0.b.C5206b.f200127a;
        }
        if (i15 == 2) {
            return ur0.b.c.f200128a;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return new ur0.b.Failure(null, null);
            }
            throw new p();
        }
        String errorMessage = blikTransactionDto.getErrorMessage();
        f errorCode = blikTransactionDto.getErrorCode();
        return new ur0.b.Failure(errorMessage, errorCode != null ? j(errorCode) : null);
    }

    public static final ur0.c j(f fVar) {
        int i15 = a.f96879d[fVar.ordinal()];
        if (i15 == 1) {
            return ur0.c.INVALID_BLIK_ALIAS;
        }
        if (i15 == 2) {
            return ur0.c.UNKNOWN;
        }
        throw new p();
    }

    public static final BEStartPaymentResult k(StartPaymentResultDto startPaymentResultDto) {
        return new BEStartPaymentResult(startPaymentResultDto.getTransactionId());
    }

    public static final BEPaymentAddress l(AddressDto addressDto) {
        return new BEPaymentAddress(addressDto.getStreet(), addressDto.getBuildingNumber(), addressDto.getApartmentNumber(), addressDto.getCity(), addressDto.getPostalCode(), addressDto.getCountry());
    }

    public static final yr0.a m(js0.d dVar) {
        switch (a.f96877b[dVar.ordinal()]) {
            case 1:
                return yr0.a.BLIK_T6_CODE;
            case 2:
                return yr0.a.BLIK_ONE_CLICK;
            case 3:
                return yr0.a.CARD;
            case 4:
                return yr0.a.WALLET_GP;
            case 5:
            case 6:
                return yr0.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEInterest n(InterestDto interestDto) {
        return new BEInterest(interestDto.getAmount(), interestDto.getDateFor());
    }

    public static final yr0.c o(js0.c cVar) {
        switch (a.f96876a[cVar.ordinal()]) {
            case 1:
                return yr0.c.START_PAYMENT;
            case 2:
                return yr0.c.DOWNLOAD_CONFIRMATION;
            case 3:
                return yr0.c.CHOOSE_INSTALLMENTS;
            case 4:
                return yr0.c.ACCEPT_INSTANT_PAYMENT;
            case 5:
                return yr0.c.REJECT_INSTANT_PAYMENT;
            case 6:
                return yr0.c.WITHDRAW_PAYMENT;
            case 7:
                return yr0.c.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final yr0.d p(a0 a0Var) {
        int i15 = a.f96886k[a0Var.ordinal()];
        if (i15 == 1) {
            return yr0.d.EXACTLY;
        }
        if (i15 == 2) {
            return yr0.d.MORE;
        }
        if (i15 == 3) {
            return yr0.d.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPaymentDetails q(PaymentDetailsDto paymentDetailsDto) {
        BigDecimal amount = paymentDetailsDto.getAmount();
        List<js0.c> listC = paymentDetailsDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(o((js0.c) it.next()));
        }
        String currency = paymentDetailsDto.getCurrency();
        String description = paymentDetailsDto.getDescription();
        LocalDate dueDate = paymentDetailsDto.getDueDate();
        OffsetDateTime dueDateTime = paymentDetailsDto.getDueDateTime();
        String externalId = paymentDetailsDto.getExternalId();
        String id5 = paymentDetailsDto.getId();
        BEPaymentAddress bEPaymentAddressL = l(paymentDetailsDto.getInstitutionAddress());
        String institutionId = paymentDetailsDto.getInstitutionId();
        String institutionName = paymentDetailsDto.getInstitutionName();
        m mVarW = w(paymentDetailsDto.getStatus());
        String title = paymentDetailsDto.getTitle();
        BigDecimal baseAmount = paymentDetailsDto.getBaseAmount();
        String dueDateMessage = paymentDetailsDto.getDueDateMessage();
        InterestDto interest = paymentDetailsDto.getInterest();
        BEInterest bEInterestN = interest != null ? n(interest) : null;
        d0 paymentMethod = paymentDetailsDto.getPaymentMethod();
        yr0.f fVarM = paymentMethod != null ? is0.a.m(paymentMethod) : null;
        PaymentPackageSummaryDto paymentPackageSummary = paymentDetailsDto.getPaymentPackageSummary();
        BEPaymentPackageSummary bEPaymentPackageSummaryT = paymentPackageSummary != null ? t(paymentPackageSummary) : null;
        ProlongationDto prolongation = paymentDetailsDto.getProlongation();
        BEProlongation bEProlongationA = prolongation != null ? A(prolongation) : null;
        ReminderPaymentDto reminderPayment = paymentDetailsDto.getReminderPayment();
        BEPaymentReminder bEPaymentReminderV = reminderPayment != null ? v(reminderPayment) : null;
        String statusDetails = paymentDetailsDto.getStatusDetails();
        Set<js0.d> setD = paymentDetailsDto.d();
        ArrayList arrayList2 = new ArrayList(v.y(setD, 10));
        Iterator<T> it4 = setD.iterator();
        while (it4.hasNext()) {
            arrayList2.add(m((js0.d) it4.next()));
        }
        return new BEPaymentDetails(amount, arrayList, currency, description, dueDate, dueDateTime, externalId, id5, bEPaymentAddressL, institutionId, institutionName, mVarW, title, baseAmount, dueDateMessage, bEInterestN, fVarM, bEPaymentPackageSummaryT, bEProlongationA, bEPaymentReminderV, statusDetails, arrayList2, t.c(paymentDetailsDto.getHasTransactions(), Boolean.TRUE), x(paymentDetailsDto.getPaymentType()), paymentDetailsDto.getAdditionalInfo());
    }

    public static final BEPaymentInfo r(PaymentDto paymentDto) {
        String id5 = paymentDto.getId();
        String institutionName = paymentDto.getInstitutionName();
        String description = paymentDto.getDescription();
        BigDecimal amount = paymentDto.getAmount();
        String currency = paymentDto.getCurrency();
        m mVarW = w(paymentDto.getStatus());
        PaymentPackageSummaryDto paymentPackageSummary = paymentDto.getPaymentPackageSummary();
        return new BEPaymentInfo(id5, institutionName, description, amount, currency, mVarW, paymentPackageSummary != null ? t(paymentPackageSummary) : null, x(paymentDto.getPaymentType()));
    }

    public static final BEPaymentPackage s(PaymentsPackageDto paymentsPackageDto) {
        List<PaymentPartDto> listA = paymentsPackageDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(u((PaymentPartDto) it.next()));
        }
        List<ReminderPaymentDto> listB = paymentsPackageDto.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(v((ReminderPaymentDto) it4.next()));
        }
        return new BEPaymentPackage(arrayList, arrayList2);
    }

    public static final BEPaymentPackageSummary t(PaymentPackageSummaryDto paymentPackageSummaryDto) {
        return new BEPaymentPackageSummary(paymentPackageSummaryDto.getPaymentPackageId(), paymentPackageSummaryDto.getPartNumber(), paymentPackageSummaryDto.getNumberOfParts());
    }

    public static final BEPaymentPart u(PaymentPartDto paymentPartDto) {
        return new BEPaymentPart(paymentPartDto.getAmount(), paymentPartDto.getCurrency(), paymentPartDto.getDescription(), paymentPartDto.getDueDate(), paymentPartDto.getExternalId(), paymentPartDto.getNumberOfParts(), paymentPartDto.getPartNumber(), paymentPartDto.getPaymentId(), paymentPartDto.getReminderPaymentId());
    }

    public static final BEPaymentReminder v(ReminderPaymentDto reminderPaymentDto) {
        return new BEPaymentReminder(reminderPaymentDto.getId(), reminderPaymentDto.getDescription(), reminderPaymentDto.getAmount());
    }

    public static final m w(g0 g0Var) {
        switch (a.f96885j[g0Var.ordinal()]) {
            case 1:
                return m.NEW;
            case 2:
                return m.IN_PAYMENT;
            case 3:
                return m.COMPLETED;
            case 4:
                return m.OVERDUE;
            case 5:
                return m.REMITTED;
            case 6:
                return m.ENFORCEMENT;
            case 7:
                return m.EXPIRED;
            case 8:
                return m.WITHDRAWN;
            case 9:
                return m.REGISTERED;
            case 10:
                return m.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final n x(i0 i0Var) {
        int i15 = a.f96884i[i0Var.ordinal()];
        if (i15 == 1) {
            return n.MASS;
        }
        if (i15 == 2) {
            return n.INSTANT;
        }
        if (i15 == 3) {
            return n.STAMP_DUTY;
        }
        if (i15 == 4) {
            return n.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPaymentWidgetData y(PaymentWidgetDataDto paymentWidgetDataDto) {
        return new BEPaymentWidgetData(p(paymentWidgetDataDto.getPaymentCounterType()), paymentWidgetDataDto.getNextPaymentDescription(), w(paymentWidgetDataDto.getNextPaymentStatus()), new fz.b.LocalDate(paymentWidgetDataDto.getNextPaymentDate()), paymentWidgetDataDto.getPaymentCounter());
    }

    public static final BEPaymentWidgetDataResponse z(PaymentWidgetDataResponse paymentWidgetDataResponse) {
        PaymentWidgetDataDto paymentWidgetData = paymentWidgetDataResponse.getPaymentWidgetData();
        return new BEPaymentWidgetDataResponse(paymentWidgetData != null ? y(paymentWidgetData) : null);
    }
}
