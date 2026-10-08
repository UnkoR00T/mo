package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.CancellationException;
import jr0.MnemonicHeaderContainer;
import jr0.PersonalDataScope9;
import lk2.Document;
import lk2.MIdCardData;
import lk2.MIdCardScope;
import lk2.MidCardScopeDataContainer;
import lk2.MnemonicHeader;
import lk2.MobileIdCardContainer;
import lk2.PersonalAddressContainer;
import lk2.PersonalDataContainer;
import lk2.PersonalIdCardContainer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018Jo\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lpc4/v5;", "", "<init>", "()V", "Lj24/c;", "Llk2/f;", "f", "(Lj24/c;)Llk2/f;", "Ljr0/f;", "g", "(Ljr0/f;)Llk2/f;", "Li24/f0;", "Llk2/h;", "d", "(Li24/f0;)Llk2/h;", "Ljr0/k;", "e", "(Ljr0/k;)Llk2/h;", "Li24/v;", "Llk2/c;", "h", "(Li24/v;)Llk2/c;", "Ljr0/o;", "i", "(Ljr0/o;)Llk2/c;", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/l;", "refreshDocumentsStatusesUC", "Lq34/v1;", "refreshDocumentsStatusesUseCase", "Lk24/e;", "getMIdCardDataUC", "Lq34/w0;", "getMIdCardDataUseCase", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lr34/e;", "getValueFromDocumentConfigUC", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lkk2/a;", "c", "(Lc54/b;Lk24/l;Lq34/v1;Lk24/e;Lq34/w0;Lq34/j0;Lk24/a;Lq34/w;Lr34/e;Lq34/d;Lw24/k0;Lj34/d;)Lkk2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5 f156422a = new v5();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f156424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f156425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f156426d;

        static {
            int[] iArr = new int[f24.h.values().length];
            try {
                iArr[f24.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.h.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f24.h.INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f156423a = iArr;
            int[] iArr2 = new int[i24.i0.values().length];
            try {
                iArr2[i24.i0.SUSPENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i24.i0.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[i24.i0.NOT_ISSUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[i24.i0.ISSUED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[i24.i0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f156424b = iArr2;
            int[] iArr3 = new int[er0.g.values().length];
            try {
                iArr3[er0.g.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[er0.g.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f156425c = iArr3;
            int[] iArr4 = new int[jr0.r.values().length];
            try {
                iArr4[jr0.r.SUSPENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[jr0.r.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[jr0.r.NOT_ISSUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[jr0.r.ISSUED.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[jr0.r.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            f156426d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006J.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0006J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0096@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"pc4/v5$b", "Lkk2/a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Llk2/c;", "l", "Ljava/util/Date;", "expirationDate", "", "documentId", "Llk2/b;", "f", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "b", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "m", "Lrq0/c;", "service", "Lcb4/d;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "onClose", "n", "(Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements kk2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.l f156428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.v1 f156429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.e f156430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.w0 f156431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.k0 f156432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.j0 f156433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k24.a f156434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q34.w f156435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r34.e f156436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q34.d f156437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ j34.d f156438l;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f156440b;

            static {
                int[] iArr = new int[f24.h.values().length];
                try {
                    iArr[f24.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f24.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f156439a = iArr;
                int[] iArr2 = new int[er0.h.values().length];
                try {
                    iArr2[er0.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[er0.h.REVOKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[er0.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[er0.h.INACTIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[er0.h.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                f156440b = iArr2;
            }
        }

        /* JADX INFO: renamed from: pc4.v5$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3874b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156441d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156442e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156443f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156444g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156445h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156446j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156447k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156448l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156449m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156450n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156451p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156452q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156454s;

            C3874b(tq.e<? super C3874b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156452q = obj;
                this.f156454s |= PKIFailureInfo.systemUnavail;
                return b.this.b(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156455d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156456e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156457f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156458g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156459h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156460j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156461k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156462l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156463m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156464n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156465p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156466q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156468s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156466q = obj;
                this.f156468s |= PKIFailureInfo.systemUnavail;
                return b.this.f(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156469d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156471f;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156469d = obj;
                this.f156471f |= PKIFailureInfo.systemUnavail;
                return b.this.l(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156472d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156473e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156474f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156475g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156476h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156477j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156478k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156479l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f156480m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156482p;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156480m = obj;
                this.f156482p |= PKIFailureInfo.systemUnavail;
                return b.this.m(this);
            }
        }

        b(c54.b bVar, k24.l lVar, q34.v1 v1Var, k24.e eVar, q34.w0 w0Var, w24.k0 k0Var, q34.j0 j0Var, k24.a aVar, q34.w wVar, r34.e eVar2, q34.d dVar, j34.d dVar2) {
            this.f156427a = bVar;
            this.f156428b = lVar;
            this.f156429c = v1Var;
            this.f156430d = eVar;
            this.f156431e = w0Var;
            this.f156432f = k0Var;
            this.f156433g = j0Var;
            this.f156434h = aVar;
            this.f156435i = wVar;
            this.f156436j = eVar2;
            this.f156437k = dVar;
            this.f156438l = dVar2;
        }

        @Override // kk2.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:65:0x015c  */
        /* JADX WARN: Code duplicated, block: B:68:0x016d  */
        /* JADX WARN: Code duplicated, block: B:69:0x017b  */
        /* JADX WARN: Code duplicated, block: B:71:0x017f  */
        /* JADX WARN: Code duplicated, block: B:74:0x018b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // kk2.a
        public Object b(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3874b c3874b;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            if (eVar instanceof C3874b) {
                c3874b = (C3874b) eVar;
                int i15 = c3874b.f156454s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3874b.f156454s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3874b = new C3874b(eVar);
                }
            } else {
                c3874b = new C3874b(eVar);
            }
            Object objC = c3874b.f156452q;
            Object objE = uq.b.e();
            int i16 = c3874b.f156454s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f156427a;
                        k24.a aVar = this.f156434h;
                        q34.w wVar = this.f156435i;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                if (str == 0) {
                                    aVar2.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                    throw new oq.g();
                                }
                                k24.a.Params params = new k24.a.Params(str);
                                c3874b.f156441d = vq.j.a(str);
                                c3874b.f156442e = vq.j.a(bVar);
                                c3874b.f156443f = jVarA;
                                c3874b.f156444g = vq.j.a(aVar2);
                                c3874b.f156445h = vq.j.a(aVar2);
                                c3874b.f156446j = aVar2;
                                c3874b.f156447k = 0;
                                c3874b.f156448l = 0;
                                c3874b.f156449m = 0;
                                c3874b.f156450n = 0;
                                c3874b.f156451p = 0;
                                c3874b.f156454s = 1;
                                objC = aVar.c(params, c3874b);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar2 = aVar2;
                                    bVar2.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(bVar);
                                c3874b.f156441d = vq.j.a(str);
                                c3874b.f156442e = vq.j.a(bVar);
                                c3874b.f156443f = jVarA;
                                c3874b.f156444g = vq.j.a(aVar2);
                                c3874b.f156445h = vq.j.a(aVar2);
                                c3874b.f156447k = 0;
                                c3874b.f156448l = 0;
                                c3874b.f156449m = 0;
                                c3874b.f156450n = 0;
                                c3874b.f156451p = 0;
                                c3874b.f156454s = 2;
                                if (wVar.c(params2, c3874b) != objE) {
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            str = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar2 = (ex.b) c3874b.f156446j;
                        jVar = (dx.j) c3874b.f156443f;
                        try {
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            dx.j<dx.b> jVar2 = jVar;
                            e = e25;
                            str = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        @Override // kk2.a
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            boolean zBooleanValue = this.f156427a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f156428b.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f156429c.c(gz.b.a.C1792a.f78542a, eVar);
        }

        @Override // kk2.a
        public Object d(rq0.c cVar, tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.f156437k.c(new q34.d.Params(cVar), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d8 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00dc A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00ee A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00f0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x00f4 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00fd A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0100 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0103 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x010d A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0174  */
        /* JADX WARN: Code duplicated, block: B:70:0x0175 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0179 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x018b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:75:0x018d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:76:0x018f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:77:0x0191  */
        /* JADX WARN: Code duplicated, block: B:79:0x0194 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x0197 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x019d A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x01a0 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x01a3 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x01a6 A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01bb A[Catch: Exception -> 0x0047, c -> 0x004a, CancellationException -> 0x004d, TryCatch #4 {Exception -> 0x0047, blocks: (B:13:0x0042, B:67:0x016e, B:87:0x01af, B:70:0x0175, B:72:0x0179, B:79:0x0194, B:86:0x01a8, B:80:0x0197, B:81:0x019c, B:82:0x019d, B:83:0x01a0, B:84:0x01a3, B:85:0x01a6, B:88:0x01bb, B:89:0x01c0, B:92:0x01c7, B:95:0x01d5, B:24:0x0070, B:34:0x00d0, B:37:0x00d8, B:39:0x00dc, B:44:0x00f4, B:50:0x0105, B:45:0x00f7, B:46:0x00fc, B:47:0x00fd, B:48:0x0100, B:49:0x0103, B:52:0x010d, B:53:0x0112), top: B:110:0x0024 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v7 */
        @Override // kk2.a
        public Object f(Date date, String str, tq.e<? super dx.i<? extends dx.b, ? extends lk2.b>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            dx.i iVar;
            int i15;
            lk2.b bVar2;
            dx.i.Right right;
            int i16;
            lk2.b bVar3;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i17 = cVar.f156468s;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f156468s = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f156466q;
            Object objE = uq.b.e();
            int i18 = cVar.f156468s;
            try {
                try {
                    try {
                        if (i18 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f156427a;
                            w24.k0 k0Var = this.f156432f;
                            q34.j0 j0Var = this.f156433g;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    cVar.f156455d = vq.j.a(date);
                                    cVar.f156456e = vq.j.a(str);
                                    cVar.f156457f = jVarA;
                                    cVar.f156458g = vq.j.a(aVar);
                                    cVar.f156459h = vq.j.a(aVar);
                                    cVar.f156460j = aVar;
                                    cVar.f156461k = 0;
                                    cVar.f156462l = 0;
                                    cVar.f156463m = 0;
                                    cVar.f156464n = 0;
                                    cVar.f156465p = 0;
                                    cVar.f156468s = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i15 = a.f156439a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i15 != 1) {
                                                bVar2 = lk2.b.ACTIVE;
                                            } else if (i15 != 2) {
                                                bVar2 = lk2.b.REVOKED;
                                            } else if (i15 != 3) {
                                                bVar2 = lk2.b.EXPIRED;
                                            } else {
                                                if (i15 == 4) {
                                                    throw new oq.p();
                                                }
                                                bVar2 = lk2.b.INACTIVE;
                                            }
                                            right = new dx.i.Right(bVar2);
                                            iVar = right;
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.ID_CARD, date);
                                    cVar.f156455d = vq.j.a(date);
                                    cVar.f156456e = vq.j.a(str);
                                    cVar.f156457f = jVarA;
                                    cVar.f156458g = vq.j.a(aVar);
                                    cVar.f156459h = vq.j.a(aVar);
                                    cVar.f156460j = aVar;
                                    cVar.f156461k = 0;
                                    cVar.f156462l = 0;
                                    cVar.f156463m = 0;
                                    cVar.f156464n = 0;
                                    cVar.f156465p = 0;
                                    cVar.f156468s = 2;
                                    objC = j0Var.c(allDocumentStatus, cVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        iVar = (dx.i) objC;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            if (iVar instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i16 = a.f156440b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                            if (i16 != 1) {
                                                bVar3 = lk2.b.ACTIVE;
                                            } else if (i16 != 2) {
                                                bVar3 = lk2.b.REVOKED;
                                            } else if (i16 != 3) {
                                                bVar3 = lk2.b.EXPIRED;
                                            } else if (i16 != 4) {
                                                bVar3 = lk2.b.INACTIVE;
                                            } else {
                                                if (i16 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar3 = lk2.b.ACTIVE;
                                            }
                                            right = new dx.i.Right(bVar3);
                                            iVar = right;
                                        }
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                str = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(str));
                                dx.i iVarA = str.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i18 == 1) {
                            bVar = (ex.b) cVar.f156460j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = a.f156439a[((f24.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i15 != 1) {
                                    bVar2 = lk2.b.ACTIVE;
                                } else if (i15 != 2) {
                                    bVar2 = lk2.b.REVOKED;
                                } else if (i15 != 3) {
                                    bVar2 = lk2.b.EXPIRED;
                                } else {
                                    if (i15 == 4) {
                                        throw new oq.p();
                                    }
                                    bVar2 = lk2.b.INACTIVE;
                                }
                                right = new dx.i.Right(bVar2);
                                iVar = right;
                            }
                        } else {
                            if (i18 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f156460j;
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Left)) {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i16 = a.f156440b[((er0.h) ((dx.i.Right) iVar).b()).ordinal()];
                                if (i16 != 1) {
                                    bVar3 = lk2.b.ACTIVE;
                                } else if (i16 != 2) {
                                    bVar3 = lk2.b.REVOKED;
                                } else if (i16 != 3) {
                                    bVar3 = lk2.b.EXPIRED;
                                } else if (i16 != 4) {
                                    bVar3 = lk2.b.INACTIVE;
                                } else {
                                    if (i16 == 5) {
                                        throw new oq.p();
                                    }
                                    bVar3 = lk2.b.ACTIVE;
                                }
                                right = new dx.i.Right(bVar3);
                                iVar = right;
                            }
                        }
                        return new dx.i.Right((lk2.b) bVar.a(iVar));
                    } catch (Exception e18) {
                        e = e18;
                    }
                } catch (CancellationException e19) {
                    throw e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // kk2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object l(tq.e<? super dx.i<? extends dx.b, lk2.MIdCardData>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.v5.b.d
                if (r0 == 0) goto L13
                r0 = r6
                pc4.v5$b$d r0 = (pc4.v5.b.d) r0
                int r1 = r0.f156471f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f156471f = r1
                goto L18
            L13:
                pc4.v5$b$d r0 = new pc4.v5$b$d
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f156469d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f156471f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r6)
                goto L8c
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L34:
                oq.u.b(r6)
                goto L58
            L38:
                oq.u.b(r6)
                c54.b r6 = r5.f156427a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7d
                k24.e r6 = r5.f156430d
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156471f = r4
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L58
                goto L8b
            L58:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L5f
                return r6
            L5f:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L77
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                i24.v r6 = (i24.MIdCardData) r6
                pc4.v5 r0 = pc4.v5.f156422a
                lk2.c r6 = pc4.v5.a(r0, r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            L77:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L7d:
                if (r6 != 0) goto Lb1
                q34.w0 r6 = r5.f156431e
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156471f = r3
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L8c
            L8b:
                return r1
            L8c:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L93
                return r6
            L93:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto Lab
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                jr0.o r6 = (jr0.PersonalDataScope9) r6
                pc4.v5 r0 = pc4.v5.f156422a
                lk2.c r6 = pc4.v5.b(r0, r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            Lab:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            Lb1:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.v5.b.l(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.v5$b$e, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // kk2.a
        public Object m(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? eVar2;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof e) {
                e eVar3 = (e) eVar;
                int i15 = eVar3.f156482p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar3.f156482p = i15 - PKIFailureInfo.systemUnavail;
                    eVar2 = eVar3;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f156480m;
            Object objE = uq.b.e();
            int i16 = eVar2.f156482p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) eVar2.f156479l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for ID card document type is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar4 = this.f156436j;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.ID_CARD);
                        eVar2.f156477j = jVarA;
                        eVar2.f156478k = vq.j.a(aVar);
                        eVar2.f156479l = aVar;
                        eVar2.f156472d = 0;
                        eVar2.f156473e = 0;
                        eVar2.f156474f = 0;
                        eVar2.f156475g = 0;
                        eVar2.f156476h = 0;
                        eVar2.f156482p = 1;
                        objC = eVar4.c(params, eVar2);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for ID card document type is null")));
                        throw new oq.g();
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
                        eVar2 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(eVar2));
                        dx.i iVarA = eVar2.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // kk2.a
        public Object n(er.a<oq.i0> aVar, er.a<oq.i0> aVar2, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f156438l.c(new j34.d.Params(rq0.b.d.ID_CARD, aVar, aVar2), eVar);
        }
    }

    private v5() {
    }

    private final PersonalAddressContainer d(i24.PersonalAddressContainer personalAddressContainer) {
        if (personalAddressContainer != null) {
            return new PersonalAddressContainer(personalAddressContainer.getStreetPrefix(), personalAddressContainer.getStreetName(), personalAddressContainer.getHouseNumber(), personalAddressContainer.getPostalCode(), personalAddressContainer.getLocalityTerritoryCode(), personalAddressContainer.getLocality(), personalAddressContainer.getMunicipality(), personalAddressContainer.getVoivodeship(), personalAddressContainer.getPermanentAddressRegistrationDate(), personalAddressContainer.getApartmentNumber());
        }
        return null;
    }

    private final PersonalAddressContainer e(jr0.PersonalAddressContainer personalAddressContainer) {
        if (personalAddressContainer == null) {
            return null;
        }
        iy.b0 streetPrefix = personalAddressContainer.getStreetPrefix();
        iy.b0 streetName = personalAddressContainer.getStreetName();
        iy.b0 houseNumber = personalAddressContainer.getHouseNumber();
        iy.b0 postalCode = personalAddressContainer.getPostalCode();
        iy.b0 localityTerritoryCode = personalAddressContainer.getLocalityTerritoryCode();
        iy.b0 locality = personalAddressContainer.getLocality();
        iy.b0 municipality = personalAddressContainer.getMunicipality();
        iy.b0 voivodeship = personalAddressContainer.getVoivodeship();
        LocalDate permanentAddressRegistrationDate = personalAddressContainer.getPermanentAddressRegistrationDate();
        return new PersonalAddressContainer(streetPrefix, streetName, houseNumber, postalCode, localityTerritoryCode, locality, municipality, voivodeship, permanentAddressRegistrationDate != null ? new fz.b.LocalDate(permanentAddressRegistrationDate) : null, personalAddressContainer.getApartmentNumber());
    }

    private final MnemonicHeader f(j24.MnemonicHeader mnemonicHeader) {
        return new MnemonicHeader(mnemonicHeader.getTp(), mnemonicHeader.getStp(), mnemonicHeader.getVer(), mnemonicHeader.getDn(), mnemonicHeader.getSn(), mnemonicHeader.getIsr(), mnemonicHeader.getTs(), mnemonicHeader.getRId(), mnemonicHeader.getIid(), mnemonicHeader.getPe(), mnemonicHeader.getIn(), mnemonicHeader.getId());
    }

    private final MnemonicHeader g(MnemonicHeaderContainer mnemonicHeaderContainer) {
        return new MnemonicHeader(mnemonicHeaderContainer.getTp(), mnemonicHeaderContainer.getStp(), mnemonicHeaderContainer.getVer(), mnemonicHeaderContainer.getDn(), mnemonicHeaderContainer.getSn(), mnemonicHeaderContainer.getIsr(), mnemonicHeaderContainer.getTs(), mnemonicHeaderContainer.getRId(), mnemonicHeaderContainer.getIid(), mnemonicHeaderContainer.getPe(), mnemonicHeaderContainer.getIn(), mnemonicHeaderContainer.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MIdCardData h(i24.MIdCardData mIdCardData) {
        lk2.b bVar;
        lk2.k kVar;
        String documentId = mIdCardData.getDocument().getDocumentId();
        int parentCertificateId = mIdCardData.getDocument().getParentCertificateId();
        int i15 = a.f156423a[mIdCardData.getDocument().getDocumentStatus().ordinal()];
        if (i15 == 1) {
            bVar = lk2.b.ACTIVE;
        } else if (i15 == 2) {
            bVar = lk2.b.REVOKED;
        } else if (i15 == 3) {
            bVar = lk2.b.EXPIRED;
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            bVar = lk2.b.INACTIVE;
        }
        Document document = new Document(documentId, parentCertificateId, bVar, mIdCardData.getDocument().getExpirationDate(), mIdCardData.getDocument().getLastUpdateTimestamp(), mIdCardData.getDocument().getIsChild());
        MnemonicHeader mnemonicHeaderF = f(mIdCardData.getScope().getDataHeader());
        MobileIdCardContainer mobileIdCardContainer = new MobileIdCardContainer(mIdCardData.getScope().getData().getMobileIdCard().getNumber(), mIdCardData.getScope().getData().getMobileIdCard().getValidFrom(), mIdCardData.getScope().getData().getMobileIdCard().getValidTo());
        PersonalDataContainer personalDataContainer = new PersonalDataContainer(mIdCardData.getScope().getData().getPersonalData().getName(), mIdCardData.getScope().getData().getPersonalData().getSecondName(), mIdCardData.getScope().getData().getPersonalData().getSurname(), mIdCardData.getScope().getData().getPersonalData().getFamilyName(), mIdCardData.getScope().getData().getPersonalData().getFatherName(), mIdCardData.getScope().getData().getPersonalData().getFatherFamilySurname(), mIdCardData.getScope().getData().getPersonalData().getMotherName(), mIdCardData.getScope().getData().getPersonalData().getMotherFamilySurname(), mIdCardData.getScope().getData().getPersonalData().getPesel(), mIdCardData.getScope().getData().getPersonalData().getBirthDate(), mIdCardData.getScope().getData().getPersonalData().getBirthPlace(), mIdCardData.getScope().getData().getPersonalData().getBirthCountry(), mIdCardData.getScope().getData().getPersonalData().getGender(), mIdCardData.getScope().getData().getPersonalData().getCitizenship(), d(mIdCardData.getScope().getData().getPersonalData().getPermanentAddress()));
        iy.b0 picture = mIdCardData.getScope().getData().getPersonalIdCard().getPicture();
        String number = mIdCardData.getScope().getData().getPersonalIdCard().getNumber();
        String issuer = mIdCardData.getScope().getData().getPersonalIdCard().getIssuer();
        fz.b.LocalDate validTo = mIdCardData.getScope().getData().getPersonalIdCard().getValidTo();
        fz.b.LocalDate creationDate = mIdCardData.getScope().getData().getPersonalIdCard().getCreationDate();
        fz.b.LocalDate suspensionDate = mIdCardData.getScope().getData().getPersonalIdCard().getSuspensionDate();
        fz.b.LocalDate revocationDate = mIdCardData.getScope().getData().getPersonalIdCard().getRevocationDate();
        i24.i0 status = mIdCardData.getScope().getData().getPersonalIdCard().getStatus();
        int i16 = status == null ? -1 : a.f156424b[status.ordinal()];
        if (i16 == -1) {
            kVar = null;
        } else if (i16 == 1) {
            kVar = lk2.k.SUSPENDED;
        } else if (i16 == 2) {
            kVar = lk2.k.REVOKED;
        } else if (i16 == 3) {
            kVar = lk2.k.NOT_ISSUED;
        } else if (i16 == 4) {
            kVar = lk2.k.ISSUED;
        } else {
            if (i16 != 5) {
                throw new oq.p();
            }
            kVar = lk2.k.UNKNOWN;
        }
        return new MIdCardData(document, new MIdCardScope(mnemonicHeaderF, new MidCardScopeDataContainer(mobileIdCardContainer, personalDataContainer, new PersonalIdCardContainer(picture, number, issuer, validTo, creationDate, suspensionDate, revocationDate, kVar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MIdCardData i(PersonalDataScope9 personalDataScope9) {
        xw.e eVar;
        lk2.k kVar;
        lk2.k kVar2;
        xw.e eVar2;
        MnemonicHeader mnemonicHeaderG = g(personalDataScope9.getDh());
        MobileIdCardContainer mobileIdCardContainer = new MobileIdCardContainer(personalDataScope9.getData().getMobileIdCard().getNumber(), new fz.b.OffsetDateTime(personalDataScope9.getData().getMobileIdCard().getValidFrom()), new fz.b.OffsetDateTime(personalDataScope9.getData().getMobileIdCard().getValidTo()));
        iy.b0 name = personalDataScope9.getData().getPersonalData().getName();
        iy.b0 secondName = personalDataScope9.getData().getPersonalData().getSecondName();
        iy.b0 surname = personalDataScope9.getData().getPersonalData().getSurname();
        iy.b0 familyName = personalDataScope9.getData().getPersonalData().getFamilyName();
        iy.b0 fatherName = personalDataScope9.getData().getPersonalData().getFatherName();
        iy.b0 fatherFamilySurname = personalDataScope9.getData().getPersonalData().getFatherFamilySurname();
        iy.b0 motherName = personalDataScope9.getData().getPersonalData().getMotherName();
        iy.b0 motherFamilySurname = personalDataScope9.getData().getPersonalData().getMotherFamilySurname();
        iy.b0 pesel = personalDataScope9.getData().getPersonalData().getPesel();
        LocalDate birthDate = personalDataScope9.getData().getPersonalData().getBirthDate();
        fz.b.LocalDate localDate = birthDate != null ? new fz.b.LocalDate(birthDate) : null;
        String birthPlace = personalDataScope9.getData().getPersonalData().getBirthPlace();
        String birthCountry = personalDataScope9.getData().getPersonalData().getBirthCountry();
        er0.g gender = personalDataScope9.getData().getPersonalData().getGender();
        if (gender != null) {
            int i15 = a.f156425c[gender.ordinal()];
            if (i15 != 1) {
                eVar2 = i15 != 2 ? null : xw.e.FEMALE;
            } else {
                eVar2 = xw.e.MALE;
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        PersonalDataContainer personalDataContainer = new PersonalDataContainer(name, secondName, surname, familyName, fatherName, fatherFamilySurname, motherName, motherFamilySurname, pesel, localDate, birthPlace, birthCountry, eVar, personalDataScope9.getData().getPersonalData().getCitizenship(), e(personalDataScope9.getData().getPersonalData().getPermanentAddress()));
        iy.b0 picture = personalDataScope9.getData().getPersonalIdCard().getPicture();
        String number = personalDataScope9.getData().getPersonalIdCard().getNumber();
        String issuer = personalDataScope9.getData().getPersonalIdCard().getIssuer();
        LocalDate validTo = personalDataScope9.getData().getPersonalIdCard().getValidTo();
        fz.b.LocalDate localDate2 = validTo != null ? new fz.b.LocalDate(validTo) : null;
        LocalDate creationDate = personalDataScope9.getData().getPersonalIdCard().getCreationDate();
        fz.b.LocalDate localDate3 = creationDate != null ? new fz.b.LocalDate(creationDate) : null;
        LocalDate suspensionDate = personalDataScope9.getData().getPersonalIdCard().getSuspensionDate();
        fz.b.LocalDate localDate4 = suspensionDate != null ? new fz.b.LocalDate(suspensionDate) : null;
        LocalDate revocationDate = personalDataScope9.getData().getPersonalIdCard().getRevocationDate();
        fz.b.LocalDate localDate5 = revocationDate != null ? new fz.b.LocalDate(revocationDate) : null;
        jr0.r status = personalDataScope9.getData().getPersonalIdCard().getStatus();
        int i16 = status == null ? -1 : a.f156426d[status.ordinal()];
        if (i16 != -1) {
            if (i16 == 1) {
                kVar2 = lk2.k.SUSPENDED;
            } else if (i16 == 2) {
                kVar2 = lk2.k.REVOKED;
            } else if (i16 == 3) {
                kVar2 = lk2.k.NOT_ISSUED;
            } else if (i16 == 4) {
                kVar2 = lk2.k.ISSUED;
            } else {
                if (i16 != 5) {
                    throw new oq.p();
                }
                kVar2 = lk2.k.UNKNOWN;
            }
            kVar = kVar2;
        } else {
            kVar = null;
        }
        return new MIdCardData(null, new MIdCardScope(mnemonicHeaderG, new MidCardScopeDataContainer(mobileIdCardContainer, personalDataContainer, new PersonalIdCardContainer(picture, number, issuer, localDate2, localDate3, localDate4, localDate5, kVar))));
    }

    public final kk2.a c(c54.b isFeatureEnabledUseCase, k24.l refreshDocumentsStatusesUC, q34.v1 refreshDocumentsStatusesUseCase, k24.e getMIdCardDataUC, q34.w0 getMIdCardDataUseCase, q34.j0 getDocumentValidityStatusUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, r34.e getValueFromDocumentConfigUC, q34.d checkServiceTemporaryInterruptionUC, w24.k0 getDocumentValidityStatusUC, j34.d getDocumentDeletionDialogUC) {
        return new b(isFeatureEnabledUseCase, refreshDocumentsStatusesUC, refreshDocumentsStatusesUseCase, getMIdCardDataUC, getMIdCardDataUseCase, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, deleteDocumentByIdUC, deleteDocumentUseCase, getValueFromDocumentConfigUC, checkServiceTemporaryInterruptionUC, getDocumentDeletionDialogUC);
    }
}
