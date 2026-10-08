package pc4;

import bn3.DistanceMeter;
import bn3.Document;
import bn3.DocumentModel;
import bn3.IdentityDataHeader;
import bn3.TimeMeter;
import bn3.VehicleDocumentContainerData;
import bn3.VehicleDocumentData;
import bn3.VehicleDocumentScope;
import bn3.VehicleDocumentsFullData;
import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k34.IdentityDataHeaderModel;
import k34.VehicleDocumentDataModel;
import k34.VehicleInsuranceModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpc4/q9;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/e1;", "getVehiclesDataUseCase", "Lw24/q1;", "getVehiclesDataUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/n;", "deleteDocumentByTypeUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lvm3/a;", "vehicleTypeMapper", "Lj34/d;", "getDocumentDeletionDialogUC", "Lzm3/a;", "a", "(Lc54/b;Lq34/e1;Lw24/q1;Lq34/w;Lw24/n;Lr34/e;Lq34/d;Lvm3/a;Lj34/d;)Lzm3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q9 f155656a = new q9();

    @Metadata(d1 = {"\u0000\u0083\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\u0005*\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020\u0015*\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020\u0019*\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00106\u001a\u00020\u001d*\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0013\u00109\u001a\u00020!*\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020%*\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020)*\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010C\u001a\u00020B*\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0013\u0010F\u001a\u00020B*\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001c\u0010K\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J0HH\u0096@¢\u0006\u0004\bK\u0010LJ\u001c\u0010N\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020M0HH\u0096@¢\u0006\u0004\bN\u0010LJ\u001e\u0010O\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0006\u0012\u0004\u0018\u00010\u00030HH\u0096@¢\u0006\u0004\bO\u0010LJ\u001a\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020IH\u0096@¢\u0006\u0004\bR\u0010SJ$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020Q0H2\u0006\u0010U\u001a\u00020TH\u0096@¢\u0006\u0004\bV\u0010WJ*\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020Q0H2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020M0XH\u0096@¢\u0006\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"pc4/q9$a", "Lzm3/a;", "Li24/x0;", "", "parentId", "Lbn3/h;", "t", "(Li24/x0;Ljava/lang/String;)Lbn3/h;", "Lf24/e;", "Lbn3/b;", "h", "(Lf24/e;Ljava/lang/String;)Lbn3/b;", "Lf24/h;", "Lbn3/d;", "j", "(Lf24/h;)Lbn3/d;", "Li24/y0;", "Lbn3/i;", "v", "(Li24/y0;)Lbn3/i;", "Lj24/b;", "Lbn3/e;", "k", "(Lj24/b;)Lbn3/e;", "Li24/w0;", "Lbn3/g;", "s", "(Li24/w0;)Lbn3/g;", "Li24/a1;", "Lbn3/k;", "w", "(Li24/a1;)Lbn3/k;", "Li24/h;", "Lbn3/c;", "i", "(Li24/h;)Lbn3/c;", "Li24/g;", "Lbn3/a;", "g", "(Li24/g;)Lbn3/a;", "Li24/v0;", "Lbn3/f;", "r", "(Li24/v0;)Lbn3/f;", "Lk34/g0;", "u", "(Lk34/g0;)Lbn3/h;", "Lk34/t;", "n", "(Lk34/t;)Lbn3/e;", "Lk34/h0;", "p", "(Lk34/h0;)Lbn3/g;", "Lk34/i0;", "q", "(Lk34/i0;)Lbn3/k;", "Lk34/m;", "m", "(Lk34/m;)Lbn3/c;", "Lk34/f;", "l", "(Lk34/f;)Lbn3/a;", "Lk34/e0;", "o", "(Lk34/e0;)Lbn3/f;", "Lk34/j0;", "Lbn3/l;", "x", "(Lk34/j0;)Lbn3/l;", "Lwm3/b;", "y", "(Lwm3/b;)Lbn3/l;", "Ldx/i;", "Ldx/b;", "Lbn3/j;", "f", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "e", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lrq0/c;", "service", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements zm3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.q1 f155658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.e1 f155659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.n f155660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.w f155661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r34.e f155662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.d f155663g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j34.d f155664h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ vm3.a f155665i;

        /* JADX INFO: renamed from: pc4.q9$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3860a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155667b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f155668c;

            static {
                int[] iArr = new int[f24.h.values().length];
                try {
                    iArr[f24.h.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.h.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.h.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f24.h.REVOKED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f155666a = iArr;
                int[] iArr2 = new int[k34.j0.values().length];
                try {
                    iArr2[k34.j0.Ambulance.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[k34.j0.Bus.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[k34.j0.Motorcycle.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[k34.j0.StandardCar.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[k34.j0.Tractor.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[k34.j0.Trailer.ordinal()] = 6;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[k34.j0.Truck.ordinal()] = 7;
                } catch (NoSuchFieldError unused11) {
                }
                f155667b = iArr2;
                int[] iArr3 = new int[wm3.b.values().length];
                try {
                    iArr3[wm3.b.Ambulance.ordinal()] = 1;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[wm3.b.Bus.ordinal()] = 2;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[wm3.b.Motorcycle.ordinal()] = 3;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[wm3.b.StandardCar.ordinal()] = 4;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[wm3.b.Tractor.ordinal()] = 5;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr3[wm3.b.Trailer.ordinal()] = 6;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr3[wm3.b.Truck.ordinal()] = 7;
                } catch (NoSuchFieldError unused18) {
                }
                f155668c = iArr3;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155669d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155670e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155671f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155672g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155673h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155674j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155675k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155676l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155677m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155678n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155680q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155678n = obj;
                this.f155680q |= PKIFailureInfo.systemUnavail;
                return a.this.b(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155681d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155682e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155683f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155684g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155685h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155686j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155687k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155688l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f155689m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155691p;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155689m = obj;
                this.f155691p |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155692d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155693e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155694f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155695g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155696h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155697j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155698k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155699l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155700m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155701n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155703q;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155701n = obj;
                this.f155703q |= PKIFailureInfo.systemUnavail;
                return a.this.f(this);
            }
        }

        a(c54.b bVar, w24.q1 q1Var, q34.e1 e1Var, w24.n nVar, q34.w wVar, r34.e eVar, q34.d dVar, j34.d dVar2, vm3.a aVar) {
            this.f155657a = bVar;
            this.f155658b = q1Var;
            this.f155659c = e1Var;
            this.f155660d = nVar;
            this.f155661e = wVar;
            this.f155662f = eVar;
            this.f155663g = dVar;
            this.f155664h = dVar2;
            this.f155665i = aVar;
        }

        private final DistanceMeter g(i24.DistanceMeter distanceMeter) {
            return new DistanceMeter(distanceMeter.getUnit(), distanceMeter.getDataImporter(), distanceMeter.getSaveDate(), distanceMeter.getValue());
        }

        private final Document h(f24.Document document, String str) {
            return new Document(str, document.getDocumentId(), document.getParentCertificateId(), j(document.getDocumentStatus()), document.getExpirationDate(), document.getLastUpdateTimestamp());
        }

        private final DocumentModel i(i24.DocumentModel documentModel) {
            return new DocumentModel(documentModel.getInstitutionName(), documentModel.getDocumentType(), documentModel.getDocumentId(), documentModel.getIsDuplicate(), documentModel.getDistributionDate(), documentModel.getExpireDate(), documentModel.getIssueReason());
        }

        private final bn3.d j(f24.h hVar) {
            int i15 = C3860a.f155666a[hVar.ordinal()];
            if (i15 == 1) {
                return bn3.d.ACTIVE;
            }
            if (i15 == 2) {
                return bn3.d.INACTIVE;
            }
            if (i15 == 3) {
                return bn3.d.EXPIRED;
            }
            if (i15 == 4) {
                return bn3.d.REVOKED;
            }
            throw new oq.p();
        }

        private final IdentityDataHeader k(j24.IdentityDataHeader identityDataHeader) {
            return new IdentityDataHeader(identityDataHeader.getDn(), identityDataHeader.getSerialNumber(), identityDataHeader.getIssuer(), identityDataHeader.getTimestamp(), identityDataHeader.getRequestId(), identityDataHeader.getDataRequester(), identityDataHeader.getDataType(), identityDataHeader.getInternalDocumentId());
        }

        private final DistanceMeter l(k34.DistanceMeter distanceMeter) {
            return new DistanceMeter(distanceMeter.getUnit(), distanceMeter.getDataImporter(), distanceMeter.getSaveDate(), distanceMeter.getValue());
        }

        private final DocumentModel m(k34.DocumentModel documentModel) {
            return new DocumentModel(documentModel.getInstitutionName(), documentModel.getDocumentType(), documentModel.getDocumentId(), documentModel.getIsDuplicate(), documentModel.getDistributionDate(), documentModel.getExpireDate(), documentModel.getIssueReason());
        }

        private final IdentityDataHeader n(IdentityDataHeaderModel identityDataHeaderModel) {
            return new IdentityDataHeader(identityDataHeaderModel.getDn(), identityDataHeaderModel.getSn(), identityDataHeaderModel.getIssuer(), identityDataHeaderModel.getTimestamp(), identityDataHeaderModel.getRequestId(), identityDataHeaderModel.getDataRequester(), identityDataHeaderModel.getDataType(), identityDataHeaderModel.getInternalDocumentId());
        }

        private final TimeMeter o(k34.TimeMeter timeMeter) {
            return new TimeMeter(timeMeter.getUnit(), timeMeter.getDataImporter(), timeMeter.getSaveDate(), timeMeter.getValue());
        }

        private final VehicleDocumentContainerData p(VehicleDocumentDataModel vehicleDocumentDataModel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String make = vehicleDocumentDataModel.getMake();
            String model = vehicleDocumentDataModel.getModel();
            String registrationNumber = vehicleDocumentDataModel.getRegistrationNumber();
            String vin = vehicleDocumentDataModel.getVin();
            String productionYear = vehicleDocumentDataModel.getProductionYear();
            BigDecimal engineCapacity = vehicleDocumentDataModel.getEngineCapacity();
            BigDecimal maxPower = vehicleDocumentDataModel.getMaxPower();
            String kind = vehicleDocumentDataModel.getKind();
            Date firstRegistrationDate = vehicleDocumentDataModel.getFirstRegistrationDate();
            Date technicalExaminationActivityDate = vehicleDocumentDataModel.getTechnicalExaminationActivityDate();
            Date technicalExaminationExpireDate = vehicleDocumentDataModel.getTechnicalExaminationExpireDate();
            List<VehicleInsuranceModel> listP = vehicleDocumentDataModel.p();
            if (listP != null) {
                List<VehicleInsuranceModel> list = listP;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(q((VehicleInsuranceModel) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<k34.DocumentModel> listK = vehicleDocumentDataModel.K();
            if (listK != null) {
                List<k34.DocumentModel> list2 = listK;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(m((k34.DocumentModel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            ArrayList arrayList3 = arrayList;
            String subKind = vehicleDocumentDataModel.getSubKind();
            String vehicleCategory = vehicleDocumentDataModel.getVehicleCategory();
            String vehicleApprovalCategoryCertificate = vehicleDocumentDataModel.getVehicleApprovalCategoryCertificate();
            String purpose = vehicleDocumentDataModel.getPurpose();
            String type = vehicleDocumentDataModel.getType();
            String origin = vehicleDocumentDataModel.getOrigin();
            String isIdNumberStamped = vehicleDocumentDataModel.getIsIdNumberStamped();
            String nameplate = vehicleDocumentDataModel.getNameplate();
            String vehicleProductionMethod = vehicleDocumentDataModel.getVehicleProductionMethod();
            String kWperkg = vehicleDocumentDataModel.getKWperkg();
            String fuelType = vehicleDocumentDataModel.getFuelType();
            String firstAlternativeFuelType = vehicleDocumentDataModel.getFirstAlternativeFuelType();
            String secondAlternativeFuelType = vehicleDocumentDataModel.getSecondAlternativeFuelType();
            String isCatalyst = vehicleDocumentDataModel.getIsCatalyst();
            BigDecimal combinedFuelConsumption = vehicleDocumentDataModel.getCombinedFuelConsumption();
            BigDecimal combinedFuelConsumptionWLTP = vehicleDocumentDataModel.getCombinedFuelConsumptionWLTP();
            BigDecimal co2Emission = vehicleDocumentDataModel.getCo2Emission();
            String co2EmissionWLTP = vehicleDocumentDataModel.getCo2EmissionWLTP();
            BigDecimal maxWeight = vehicleDocumentDataModel.getMaxWeight();
            BigDecimal maxAllowedWeight = vehicleDocumentDataModel.getMaxAllowedWeight();
            BigDecimal maxLoad = vehicleDocumentDataModel.getMaxLoad();
            BigDecimal standingPlaces = vehicleDocumentDataModel.getStandingPlaces();
            BigDecimal seats = vehicleDocumentDataModel.getSeats();
            BigDecimal allPlaces = vehicleDocumentDataModel.getAllPlaces();
            BigDecimal axisQuantity = vehicleDocumentDataModel.getAxisQuantity();
            BigDecimal kerbWeight = vehicleDocumentDataModel.getKerbWeight();
            BigDecimal maxAllowedWeightOfCarSet = vehicleDocumentDataModel.getMaxAllowedWeightOfCarSet();
            BigDecimal maxWeigthOfTrailerWithBrake = vehicleDocumentDataModel.getMaxWeigthOfTrailerWithBrake();
            BigDecimal maxWeigthOfTrailerWithoutBrake = vehicleDocumentDataModel.getMaxWeigthOfTrailerWithoutBrake();
            BigDecimal wheelbase = vehicleDocumentDataModel.getWheelbase();
            BigDecimal minTrackWidth = vehicleDocumentDataModel.getMinTrackWidth();
            BigDecimal maxTrackWidth = vehicleDocumentDataModel.getMaxTrackWidth();
            BigDecimal avgTrackWidth = vehicleDocumentDataModel.getAvgTrackWidth();
            BigDecimal maxAllowedAxisEmphasis = vehicleDocumentDataModel.getMaxAllowedAxisEmphasis();
            String isCarHook = vehicleDocumentDataModel.getIsCarHook();
            BigDecimal imageCode = vehicleDocumentDataModel.getImageCode();
            int meterValue = vehicleDocumentDataModel.getMeterValue();
            String meterUnit = vehicleDocumentDataModel.getMeterUnit();
            String dataImporter = vehicleDocumentDataModel.getDataImporter();
            Date meterSavingDate = vehicleDocumentDataModel.getMeterSavingDate();
            boolean isEuroNorm = vehicleDocumentDataModel.getIsEuroNorm();
            String emissionLevelEuro = vehicleDocumentDataModel.getEmissionLevelEuro();
            k34.DistanceMeter distanceMeter = vehicleDocumentDataModel.getDistanceMeter();
            DistanceMeter distanceMeterL = distanceMeter != null ? l(distanceMeter) : null;
            k34.TimeMeter timeMeter = vehicleDocumentDataModel.getTimeMeter();
            return new VehicleDocumentContainerData(make, model, registrationNumber, vin, productionYear, engineCapacity, maxPower, kind, firstRegistrationDate, technicalExaminationActivityDate, technicalExaminationExpireDate, arrayList3, arrayList2, subKind, vehicleCategory, vehicleApprovalCategoryCertificate, purpose, type, origin, isIdNumberStamped, nameplate, vehicleProductionMethod, kWperkg, fuelType, firstAlternativeFuelType, secondAlternativeFuelType, isCatalyst, combinedFuelConsumption, combinedFuelConsumptionWLTP, co2Emission, co2EmissionWLTP, maxWeight, maxAllowedWeight, maxLoad, standingPlaces, seats, allPlaces, axisQuantity, kerbWeight, maxAllowedWeightOfCarSet, maxWeigthOfTrailerWithBrake, maxWeigthOfTrailerWithoutBrake, wheelbase, minTrackWidth, maxTrackWidth, avgTrackWidth, maxAllowedAxisEmphasis, isCarHook, imageCode, meterValue, meterUnit, dataImporter, meterSavingDate, isEuroNorm, emissionLevelEuro, distanceMeterL, timeMeter != null ? o(timeMeter) : null, x(vehicleDocumentDataModel.getVehicleType()));
        }

        private final bn3.VehicleInsuranceModel q(VehicleInsuranceModel vehicleInsuranceModel) {
            return new bn3.VehicleInsuranceModel(vehicleInsuranceModel.getInsuranceExpireDate(), vehicleInsuranceModel.getValidInsuranceDays(), vehicleInsuranceModel.getInsuranceInstitutionName(), vehicleInsuranceModel.getInsuranceId(), vehicleInsuranceModel.getInsuranceType(), vehicleInsuranceModel.getInsuranceSignDay(), vehicleInsuranceModel.getInsurancePeriodStart(), vehicleInsuranceModel.getInsurancePeriodEnd());
        }

        private final TimeMeter r(i24.TimeMeter timeMeter) {
            return new TimeMeter(timeMeter.getUnit(), timeMeter.getDataImporter(), timeMeter.getSaveDate(), timeMeter.getValue());
        }

        private final VehicleDocumentContainerData s(i24.VehicleDocumentContainerData vehicleDocumentContainerData) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String make = vehicleDocumentContainerData.getMake();
            String model = vehicleDocumentContainerData.getModel();
            String registrationNumber = vehicleDocumentContainerData.getRegistrationNumber();
            String vin = vehicleDocumentContainerData.getVin();
            String productionYear = vehicleDocumentContainerData.getProductionYear();
            BigDecimal engineCapacity = vehicleDocumentContainerData.getEngineCapacity();
            BigDecimal maxPower = vehicleDocumentContainerData.getMaxPower();
            String kind = vehicleDocumentContainerData.getKind();
            Date firstRegistrationDate = vehicleDocumentContainerData.getFirstRegistrationDate();
            Date technicalExaminationActivityDate = vehicleDocumentContainerData.getTechnicalExaminationActivityDate();
            Date technicalExaminationExpireDate = vehicleDocumentContainerData.getTechnicalExaminationExpireDate();
            List<i24.VehicleInsuranceModel> listP = vehicleDocumentContainerData.p();
            if (listP != null) {
                List<i24.VehicleInsuranceModel> list = listP;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(w((i24.VehicleInsuranceModel) it.next()));
                }
            } else {
                arrayList = null;
            }
            List<i24.DocumentModel> listK = vehicleDocumentContainerData.K();
            if (listK != null) {
                List<i24.DocumentModel> list2 = listK;
                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(i((i24.DocumentModel) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            ArrayList arrayList3 = arrayList;
            String subKind = vehicleDocumentContainerData.getSubKind();
            String vehicleCategory = vehicleDocumentContainerData.getVehicleCategory();
            String vehicleApprovalCategoryCertificate = vehicleDocumentContainerData.getVehicleApprovalCategoryCertificate();
            String purpose = vehicleDocumentContainerData.getPurpose();
            String type = vehicleDocumentContainerData.getType();
            String origin = vehicleDocumentContainerData.getOrigin();
            String isIdNumberStamped = vehicleDocumentContainerData.getIsIdNumberStamped();
            String nameplate = vehicleDocumentContainerData.getNameplate();
            String vehicleProductionMethod = vehicleDocumentContainerData.getVehicleProductionMethod();
            String kWperkg = vehicleDocumentContainerData.getKWperkg();
            String fuelType = vehicleDocumentContainerData.getFuelType();
            String firstAlternativeFuelType = vehicleDocumentContainerData.getFirstAlternativeFuelType();
            String secondAlternativeFuelType = vehicleDocumentContainerData.getSecondAlternativeFuelType();
            String isCatalyst = vehicleDocumentContainerData.getIsCatalyst();
            BigDecimal combinedFuelConsumption = vehicleDocumentContainerData.getCombinedFuelConsumption();
            BigDecimal combinedFuelConsumptionWLTP = vehicleDocumentContainerData.getCombinedFuelConsumptionWLTP();
            BigDecimal co2Emission = vehicleDocumentContainerData.getCo2Emission();
            String co2EmissionWLTP = vehicleDocumentContainerData.getCo2EmissionWLTP();
            BigDecimal maxWeight = vehicleDocumentContainerData.getMaxWeight();
            BigDecimal maxAllowedWeight = vehicleDocumentContainerData.getMaxAllowedWeight();
            BigDecimal maxLoad = vehicleDocumentContainerData.getMaxLoad();
            BigDecimal standingPlaces = vehicleDocumentContainerData.getStandingPlaces();
            BigDecimal seats = vehicleDocumentContainerData.getSeats();
            BigDecimal allPlaces = vehicleDocumentContainerData.getAllPlaces();
            BigDecimal axisQuantity = vehicleDocumentContainerData.getAxisQuantity();
            BigDecimal kerbWeight = vehicleDocumentContainerData.getKerbWeight();
            BigDecimal maxAllowedWeightOfCarSet = vehicleDocumentContainerData.getMaxAllowedWeightOfCarSet();
            BigDecimal maxWeigthOfTrailerWithBrake = vehicleDocumentContainerData.getMaxWeigthOfTrailerWithBrake();
            BigDecimal maxWeigthOfTrailerWithoutBrake = vehicleDocumentContainerData.getMaxWeigthOfTrailerWithoutBrake();
            BigDecimal wheelbase = vehicleDocumentContainerData.getWheelbase();
            BigDecimal minTrackWidth = vehicleDocumentContainerData.getMinTrackWidth();
            BigDecimal maxTrackWidth = vehicleDocumentContainerData.getMaxTrackWidth();
            BigDecimal avgTrackWidth = vehicleDocumentContainerData.getAvgTrackWidth();
            BigDecimal maxAllowedAxisEmphasis = vehicleDocumentContainerData.getMaxAllowedAxisEmphasis();
            String isCarHook = vehicleDocumentContainerData.getIsCarHook();
            BigDecimal imageCode = vehicleDocumentContainerData.getImageCode();
            int meterValue = vehicleDocumentContainerData.getMeterValue();
            String meterUnit = vehicleDocumentContainerData.getMeterUnit();
            String dataImporter = vehicleDocumentContainerData.getDataImporter();
            Date meterSavingDate = vehicleDocumentContainerData.getMeterSavingDate();
            boolean isEuroNorm = vehicleDocumentContainerData.getIsEuroNorm();
            String emissionLevelEuro = vehicleDocumentContainerData.getEmissionLevelEuro();
            i24.DistanceMeter distanceMeter = vehicleDocumentContainerData.getDistanceMeter();
            DistanceMeter distanceMeterG = distanceMeter != null ? g(distanceMeter) : null;
            i24.TimeMeter timeMeter = vehicleDocumentContainerData.getTimeMeter();
            return new VehicleDocumentContainerData(make, model, registrationNumber, vin, productionYear, engineCapacity, maxPower, kind, firstRegistrationDate, technicalExaminationActivityDate, technicalExaminationExpireDate, arrayList3, arrayList2, subKind, vehicleCategory, vehicleApprovalCategoryCertificate, purpose, type, origin, isIdNumberStamped, nameplate, vehicleProductionMethod, kWperkg, fuelType, firstAlternativeFuelType, secondAlternativeFuelType, isCatalyst, combinedFuelConsumption, combinedFuelConsumptionWLTP, co2Emission, co2EmissionWLTP, maxWeight, maxAllowedWeight, maxLoad, standingPlaces, seats, allPlaces, axisQuantity, kerbWeight, maxAllowedWeightOfCarSet, maxWeigthOfTrailerWithBrake, maxWeigthOfTrailerWithoutBrake, wheelbase, minTrackWidth, maxTrackWidth, avgTrackWidth, maxAllowedAxisEmphasis, isCarHook, imageCode, meterValue, meterUnit, dataImporter, meterSavingDate, isEuroNorm, emissionLevelEuro, distanceMeterG, timeMeter != null ? r(timeMeter) : null, y(this.f155665i.b(new vm3.a.Params(vehicleDocumentContainerData.getPurpose(), vehicleDocumentContainerData.getKind()))));
        }

        private final VehicleDocumentData t(i24.VehicleDocumentData vehicleDocumentData, String str) {
            return new VehicleDocumentData(h(vehicleDocumentData.getDocument(), str), v(vehicleDocumentData.getScope()));
        }

        private final VehicleDocumentData u(k34.g0 g0Var) {
            IdentityDataHeader identityDataHeaderN = n(g0Var.getDataHeader());
            VehicleDocumentDataModel documentDataModel = g0Var.getDocumentDataModel();
            return new VehicleDocumentData(null, new VehicleDocumentScope(identityDataHeaderN, documentDataModel != null ? p(documentDataModel) : null));
        }

        private final VehicleDocumentScope v(i24.VehicleDocumentScope vehicleDocumentScope) {
            IdentityDataHeader identityDataHeaderK = k(vehicleDocumentScope.getDataHeader());
            i24.VehicleDocumentContainerData data = vehicleDocumentScope.getData();
            return new VehicleDocumentScope(identityDataHeaderK, data != null ? s(data) : null);
        }

        private final bn3.VehicleInsuranceModel w(i24.VehicleInsuranceModel vehicleInsuranceModel) {
            return new bn3.VehicleInsuranceModel(vehicleInsuranceModel.getInsuranceExpireDate(), vehicleInsuranceModel.getValidInsuranceDays(), vehicleInsuranceModel.getInsuranceInstitutionName(), vehicleInsuranceModel.getInsuranceId(), vehicleInsuranceModel.getInsuranceType(), vehicleInsuranceModel.getInsuranceSignDay(), vehicleInsuranceModel.getInsurancePeriodStart(), vehicleInsuranceModel.getInsurancePeriodEnd());
        }

        private final bn3.l x(k34.j0 j0Var) {
            switch (C3860a.f155667b[j0Var.ordinal()]) {
                case 1:
                    return bn3.l.Ambulance;
                case 2:
                    return bn3.l.Bus;
                case 3:
                    return bn3.l.Motorcycle;
                case 4:
                    return bn3.l.StandardCar;
                case 5:
                    return bn3.l.Tractor;
                case 6:
                    return bn3.l.Trailer;
                case 7:
                    return bn3.l.Truck;
                default:
                    throw new oq.p();
            }
        }

        private final bn3.l y(wm3.b bVar) {
            switch (C3860a.f155668c[bVar.ordinal()]) {
                case 1:
                    return bn3.l.Ambulance;
                case 2:
                    return bn3.l.Bus;
                case 3:
                    return bn3.l.Motorcycle;
                case 4:
                    return bn3.l.StandardCar;
                case 5:
                    return bn3.l.Tractor;
                case 6:
                    return bn3.l.Trailer;
                case 7:
                    return bn3.l.Truck;
                default:
                    throw new oq.p();
            }
        }

        @Override // zm3.a
        public Object a(dx.b bVar, tq.e<? super DialogData> eVar) {
            dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
            dx.b.Business.a type = business != null ? business.getType() : null;
            DocumentMaintenanceBreakError documentMaintenanceBreakError = type instanceof DocumentMaintenanceBreakError ? (DocumentMaintenanceBreakError) type : null;
            if (documentMaintenanceBreakError != null) {
                return documentMaintenanceBreakError.getDialogData();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.q9$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // zm3.a
        public Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? bVar;
            Object objB;
            ex.b bVar2;
            if (eVar instanceof b) {
                b bVar3 = (b) eVar;
                int i15 = bVar3.f155680q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar3.f155680q = i15 - PKIFailureInfo.systemUnavail;
                    bVar = bVar3;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f155678n;
            Object objE = uq.b.e();
            int i16 = bVar.f155680q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f155657a;
                            w24.n nVar = this.f155660d;
                            q34.w wVar = this.f155661e;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    w24.n.Params params = new w24.n.Params(f24.i.VEHICLE_CARD);
                                    bVar.f155674j = jVarA;
                                    bVar.f155675k = vq.j.a(aVar);
                                    bVar.f155676l = vq.j.a(aVar);
                                    bVar.f155677m = aVar;
                                    bVar.f155669d = 0;
                                    bVar.f155670e = 0;
                                    bVar.f155671f = 0;
                                    bVar.f155672g = 0;
                                    bVar.f155673h = 0;
                                    bVar.f155680q = 1;
                                    objC = nVar.c(params, bVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        bVar2.a((dx.i) objC);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.w.Params params2 = new q34.w.Params(rq0.b.d.VEHICLE_CARD);
                                    bVar.f155674j = jVarA;
                                    bVar.f155675k = vq.j.a(aVar);
                                    bVar.f155676l = vq.j.a(aVar);
                                    bVar.f155669d = 0;
                                    bVar.f155670e = 0;
                                    bVar.f155671f = 0;
                                    bVar.f155672g = 0;
                                    bVar.f155673h = 0;
                                    bVar.f155680q = 2;
                                    if (wVar.c(params2, bVar) != objE) {
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
                                bVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(bVar));
                                dx.i iVarA = bVar.a(e);
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
                        if (i16 == 1) {
                            bVar2 = (ex.b) bVar.f155677m;
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(objC);
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // zm3.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f155664h.c(new j34.d.Params(rq0.b.d.VEHICLE_CARD, aVar, null, 4, null), eVar);
        }

        @Override // zm3.a
        public Object d(rq0.c cVar, tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.f155663g.c(new q34.d.Params(cVar), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.q9$a$c, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // zm3.a
        public Object e(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? cVar;
            Object objB;
            if (eVar instanceof c) {
                c cVar2 = (c) eVar;
                int i15 = cVar2.f155691p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar2.f155691p = i15 - PKIFailureInfo.systemUnavail;
                    cVar = cVar2;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155689m;
            Object objE = uq.b.e();
            int i16 = cVar.f155691p;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        r34.e eVar2 = this.f155662f;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.VEHICLE_CARD);
                            cVar.f155686j = jVarA;
                            cVar.f155687k = vq.j.a(aVar);
                            cVar.f155688l = vq.j.a(aVar);
                            cVar.f155681d = 0;
                            cVar.f155682e = 0;
                            cVar.f155683f = 0;
                            cVar.f155684g = 0;
                            cVar.f155685h = 0;
                            cVar.f155691p = 1;
                            objC = eVar2.c(params, cVar);
                            if (objC == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            cVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(cVar));
                            dx.i iVarA = cVar.a(e);
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
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right((String) objC);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b6 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00df A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, LOOP:1: B:39:0x00d9->B:41:0x00df, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x0104 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0145  */
        /* JADX WARN: Code duplicated, block: B:60:0x0146 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x014a A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0167 A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, LOOP:0: B:63:0x0161->B:65:0x0167, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x018d A[Catch: Exception -> 0x003f, c -> 0x0042, CancellationException -> 0x0045, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:57:0x013f, B:67:0x0181, B:68:0x0187, B:60:0x0146, B:62:0x014a, B:63:0x0161, B:65:0x0167, B:66:0x0175, B:69:0x018d, B:70:0x0192, B:73:0x0199, B:76:0x01a7, B:24:0x0060, B:33:0x00af, B:43:0x00fc, B:36:0x00b6, B:38:0x00ba, B:39:0x00d9, B:41:0x00df, B:42:0x00f1, B:44:0x0104, B:45:0x0109), top: B:91:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.q9$a$d, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // zm3.a
        public Object f(tq.e<? super dx.i<? extends dx.b, VehicleDocumentsFullData>> eVar) throws Throwable {
            ?? dVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            i24.VehicleDocumentsFullData vehicleDocumentsFullData;
            ArrayList arrayList;
            Iterator it;
            VehicleDocumentsFullData vehicleDocumentsFullData2;
            dx.i right2;
            ArrayList arrayList2;
            Iterator it4;
            if (eVar instanceof d) {
                d dVar2 = (d) eVar;
                int i15 = dVar2.f155703q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar2.f155703q = i15 - PKIFailureInfo.systemUnavail;
                    dVar = dVar2;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f155701n;
            Object objE = uq.b.e();
            int i16 = dVar.f155703q;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f155657a;
                            w24.q1 q1Var = this.f155658b;
                            q34.e1 e1Var = this.f155659c;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    dVar.f155697j = jVarA;
                                    dVar.f155698k = vq.j.a(aVar);
                                    dVar.f155699l = vq.j.a(aVar);
                                    dVar.f155700m = aVar;
                                    dVar.f155692d = 0;
                                    dVar.f155693e = 0;
                                    dVar.f155694f = 0;
                                    dVar.f155695g = 0;
                                    dVar.f155696h = 0;
                                    dVar.f155703q = 1;
                                    objC = q1Var.c(c1792a, dVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            vehicleDocumentsFullData = (i24.VehicleDocumentsFullData) ((dx.i.Right) right).b();
                                            String parentId = vehicleDocumentsFullData.getParentId();
                                            List<i24.VehicleDocumentData> listA = vehicleDocumentsFullData.a();
                                            arrayList = new ArrayList(pq.v.y(listA, 10));
                                            it = listA.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(t((i24.VehicleDocumentData) it.next(), vehicleDocumentsFullData.getParentId()));
                                            }
                                            right = new dx.i.Right(new VehicleDocumentsFullData(parentId, arrayList));
                                        }
                                        vehicleDocumentsFullData2 = (VehicleDocumentsFullData) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                    dVar.f155697j = jVarA;
                                    dVar.f155698k = vq.j.a(aVar);
                                    dVar.f155699l = vq.j.a(aVar);
                                    dVar.f155700m = aVar;
                                    dVar.f155692d = 0;
                                    dVar.f155693e = 0;
                                    dVar.f155694f = 0;
                                    dVar.f155695g = 0;
                                    dVar.f155696h = 0;
                                    dVar.f155703q = 2;
                                    objC = e1Var.c(c1792a2, dVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            List list = (List) ((dx.i.Right) right2).b();
                                            arrayList2 = new ArrayList(pq.v.y(list, 10));
                                            it4 = list.iterator();
                                            while (it4.hasNext()) {
                                                arrayList2.add(u((k34.g0) it4.next()));
                                            }
                                            right2 = new dx.i.Right(new VehicleDocumentsFullData(null, arrayList2));
                                        }
                                        vehicleDocumentsFullData2 = (VehicleDocumentsFullData) bVar.a(right2);
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
                                dVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(dVar));
                                dx.i iVarA = dVar.a(e);
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
                        if (i16 == 1) {
                            bVar2 = (ex.b) dVar.f155700m;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                vehicleDocumentsFullData = (i24.VehicleDocumentsFullData) ((dx.i.Right) right).b();
                                String parentId2 = vehicleDocumentsFullData.getParentId();
                                List<i24.VehicleDocumentData> listA2 = vehicleDocumentsFullData.a();
                                arrayList = new ArrayList(pq.v.y(listA2, 10));
                                it = listA2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(t((i24.VehicleDocumentData) it.next(), vehicleDocumentsFullData.getParentId()));
                                }
                                right = new dx.i.Right(new VehicleDocumentsFullData(parentId2, arrayList));
                            }
                            vehicleDocumentsFullData2 = (VehicleDocumentsFullData) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) dVar.f155700m;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                List list2 = (List) ((dx.i.Right) right2).b();
                                arrayList2 = new ArrayList(pq.v.y(list2, 10));
                                it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(u((k34.g0) it4.next()));
                                }
                                right2 = new dx.i.Right(new VehicleDocumentsFullData(null, arrayList2));
                            }
                            vehicleDocumentsFullData2 = (VehicleDocumentsFullData) bVar.a(right2);
                        }
                        return new dx.i.Right(vehicleDocumentsFullData2);
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
    }

    private q9() {
    }

    public final zm3.a a(c54.b isFeatureEnabledUseCase, q34.e1 getVehiclesDataUseCase, w24.q1 getVehiclesDataUC, q34.w deleteDocumentUseCase, w24.n deleteDocumentByTypeUC, r34.e getValueFromDocumentConfigUC, q34.d checkServiceTemporaryInterruptionUC, vm3.a vehicleTypeMapper, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getVehiclesDataUC, getVehiclesDataUseCase, deleteDocumentByTypeUC, deleteDocumentUseCase, getValueFromDocumentConfigUC, checkServiceTemporaryInterruptionUC, getDocumentDeletionDialogUC, vehicleTypeMapper);
    }
}
