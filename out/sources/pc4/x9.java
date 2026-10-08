package pc4;

import cb4.DialogData;
import cr3.Document;
import cr3.UserDocumentData;
import cr3.WruDocumentData;
import cr3.WruDocumentScope;
import hr3.LicenceCode;
import i24.WruDocumentItem;
import i34.DocumentMaintenanceBreakError;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0005*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000f*\u00020 2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u0087\u0001\u0010B\u001a\u00020A2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lpc4/x9;", "", "<init>", "()V", "Lk34/l0;", "Lcr3/f;", "k", "(Lk34/l0;)Lcr3/f;", "Lk34/d0;", "Lcr3/c;", "g", "(Lk34/d0;)Lcr3/c;", "Lk34/k0;", "Lcr3/d;", "userDocumentData", "Lcr3/e;", "i", "(Lk34/k0;Lcr3/d;)Lcr3/e;", "Li24/u0;", "f", "(Li24/u0;)Lcr3/c;", "Lf24/h;", "Lcr3/b;", "e", "(Lf24/h;)Lcr3/b;", "Lf24/e;", "Lcr3/a;", "d", "(Lf24/e;)Lcr3/a;", "Li24/c1;", "j", "(Li24/c1;)Lcr3/f;", "Li24/b1;", "h", "(Li24/b1;Lcr3/d;)Lcr3/e;", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/l;", "refreshDocumentsStatusesUC", "Lq34/v1;", "refreshDocumentsStatusesUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lw24/f2;", "isDocumentAddedByTypeUC", "Lq34/n1;", "isWruDocumentAddedUseCase", "Lq34/f1;", "getWruDocumentDataUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/s1;", "getWruDocumentDataUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lar3/a;", "c", "(Lc54/b;Lk24/l;Lq34/v1;Lq34/x0;Lw24/x0;Lr34/e;Lw24/k0;Lq34/j0;Lw24/f2;Lq34/n1;Lq34/f1;Lk24/a;Lq34/w;Lw24/s1;Lj34/d;)Lar3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x9 f156754a = new x9();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f156756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f156757c;

        static {
            int[] iArr = new int[k34.d0.values().length];
            try {
                iArr[k34.d0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k34.d0.SENATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k34.d0.PZPN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f156755a = iArr;
            int[] iArr2 = new int[i24.u0.values().length];
            try {
                iArr2[i24.u0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[i24.u0.SENATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i24.u0.PZPN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f156756b = iArr2;
            int[] iArr3 = new int[f24.h.values().length];
            try {
                iArr3[f24.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[f24.h.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[f24.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[f24.h.INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f156757c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000g\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00022\u0006\u0010\n\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u00022\u0006\u0010\n\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001bJ.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"H\u0096@¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"pc4/x9$b", "Lar3/a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Lcr3/d;", "b", "Lhr3/d;", "licenceCode", "", "h", "(Lhr3/d;Ltq/e;)Ljava/lang/Object;", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ljava/util/Date;", "expirationDate", "documentId", "Lcr3/b;", "g", "(Ljava/util/Date;Lhr3/d;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "", "j", "(ILtq/e;)Ljava/lang/Object;", "Lcr3/e;", "k", "i", "(Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Lkotlin/Function0;", "onDelete", "f", "(Lrq0/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements ar3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.l f156759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.v1 f156760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.x0 f156761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.x0 f156762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r34.e f156763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w24.k0 f156764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q34.j0 f156765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w24.f2 f156766i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.n1 f156767j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.s1 f156768k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.f1 f156769l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ k24.a f156770m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q34.w f156771n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j34.d f156772o;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156773a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f156774b;

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
                f156773a = iArr;
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
                f156774b = iArr2;
            }
        }

        /* JADX INFO: renamed from: pc4.x9$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3884b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156775d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156776e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156777f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156778g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156779h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156780j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156781k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156782l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156783m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156784n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156785p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156786q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156788s;

            C3884b(tq.e<? super C3884b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156786q = obj;
                this.f156788s |= PKIFailureInfo.systemUnavail;
                return b.this.i(null, 0, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156789d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156790e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156791f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156792g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156793h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156794j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156795k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156796l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156797m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156798n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156799p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156801r;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156799p = obj;
                this.f156801r |= PKIFailureInfo.systemUnavail;
                return b.this.h(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156802d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156803e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156804f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156805g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156806h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156807j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156808k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156809l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156810m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156811n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156812p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156813q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156814r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f156815s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f156817v;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156815s = obj;
                this.f156817v |= PKIFailureInfo.systemUnavail;
                return b.this.g(null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156818d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156820f;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156818d = obj;
                this.f156820f |= PKIFailureInfo.systemUnavail;
                return b.this.b(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156821d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156822e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156823f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156824g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156825h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156826j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156827k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156828l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156829m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f156830n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f156831p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f156832q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f156833r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f156834s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f156836v;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156834s = obj;
                this.f156836v |= PKIFailureInfo.systemUnavail;
                return b.this.k(0, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156837d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156838e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156839f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156840g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156841h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156842j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156843k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156844l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156845m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f156846n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f156847p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156848q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156850s;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156848q = obj;
                this.f156850s |= PKIFailureInfo.systemUnavail;
                return b.this.j(0, this);
            }
        }

        b(c54.b bVar, k24.l lVar, q34.v1 v1Var, w24.x0 x0Var, q34.x0 x0Var2, r34.e eVar, w24.k0 k0Var, q34.j0 j0Var, w24.f2 f2Var, q34.n1 n1Var, w24.s1 s1Var, q34.f1 f1Var, k24.a aVar, q34.w wVar, j34.d dVar) {
            this.f156758a = bVar;
            this.f156759b = lVar;
            this.f156760c = v1Var;
            this.f156761d = x0Var;
            this.f156762e = x0Var2;
            this.f156763f = eVar;
            this.f156764g = k0Var;
            this.f156765h = j0Var;
            this.f156766i = f2Var;
            this.f156767j = n1Var;
            this.f156768k = s1Var;
            this.f156769l = f1Var;
            this.f156770m = aVar;
            this.f156771n = wVar;
            this.f156772o = dVar;
        }

        @Override // ar3.a
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
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r8 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        
            if (r8 == r1) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(tq.e<? super dx.i<? extends dx.b, cr3.UserDocumentData>> r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.x9.b.b(tq.e):java.lang.Object");
        }

        @Override // ar3.a
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            boolean zBooleanValue = this.f156758a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f156759b.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f156760c.c(gz.b.a.C1792a.f78542a, eVar);
        }

        @Override // ar3.a
        public Object f(rq0.b bVar, er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f156772o.c(new j34.d.Params(bVar, aVar, null, 4, null), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ea A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ee A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0100 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x0102 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x0104 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x0106 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x010f A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0112 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0115 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x011e A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x019b  */
        /* JADX WARN: Code duplicated, block: B:71:0x019c A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x01a0 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:76:0x01b4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:77:0x01b6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x01bb A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x01be A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x01c4 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x01c7 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x01ca A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x01cd A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x01e1 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x004a, B:68:0x0195, B:88:0x01d4, B:71:0x019c, B:73:0x01a0, B:80:0x01bb, B:87:0x01cf, B:81:0x01be, B:82:0x01c3, B:83:0x01c4, B:84:0x01c7, B:85:0x01ca, B:86:0x01cd, B:89:0x01e1, B:90:0x01e6, B:95:0x021a, B:98:0x0228, B:24:0x007c, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:44:0x0106, B:50:0x0117, B:45:0x0109, B:46:0x010e, B:47:0x010f, B:48:0x0112, B:49:0x0115, B:51:0x011e, B:52:0x0123), top: B:113:0x0024 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [hr3.d, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v7 */
        @Override // ar3.a
        public Object g(Date date, LicenceCode licenceCode, String str, tq.e<? super dx.i<? extends dx.b, ? extends cr3.b>> eVar) throws Throwable {
            d dVar;
            Object objB;
            ex.b bVar;
            Object right;
            int i15;
            cr3.b bVar2;
            int i16;
            cr3.b bVar3;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i17 = dVar.f156817v;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f156817v = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f156815s;
            Object objE = uq.b.e();
            int i18 = dVar.f156817v;
            try {
                try {
                    try {
                        if (i18 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f156758a;
                            w24.k0 k0Var = this.f156764g;
                            q34.j0 j0Var = this.f156765h;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == null) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    dVar.f156802d = vq.j.a(date);
                                    dVar.f156803e = vq.j.a(licenceCode);
                                    dVar.f156804f = vq.j.a(str);
                                    dVar.f156805g = jVarA;
                                    dVar.f156806h = vq.j.a(aVar);
                                    dVar.f156807j = vq.j.a(aVar);
                                    dVar.f156808k = aVar;
                                    dVar.f156810m = 0;
                                    dVar.f156811n = 0;
                                    dVar.f156812p = 0;
                                    dVar.f156813q = 0;
                                    dVar.f156814r = 0;
                                    dVar.f156817v = 1;
                                    objC = k0Var.c(params, dVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i15 = a.f156773a[((f24.h) ((dx.i.Right) right).b()).ordinal()];
                                            if (i15 != 1) {
                                                bVar2 = cr3.b.ACTIVE;
                                            } else if (i15 != 2) {
                                                bVar2 = cr3.b.REVOKED;
                                            } else if (i15 != 3) {
                                                bVar2 = cr3.b.EXPIRED;
                                            } else {
                                                if (i15 == 4) {
                                                    throw new oq.p();
                                                }
                                                bVar2 = cr3.b.INACTIVE;
                                            }
                                            right = new dx.i.Right(bVar2);
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    rq0.b.e eVarA = rq0.b.e.INSTANCE.a(licenceCode.getLicenceCode());
                                    if (eVarA == null) {
                                        aVar.b(new dx.b.Generic(new IllegalStateException("Document type for " + licenceCode.getLicenceCode() + " licence code is null")));
                                        throw new oq.g();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(eVarA, date);
                                    dVar.f156802d = vq.j.a(date);
                                    dVar.f156803e = vq.j.a(licenceCode);
                                    dVar.f156804f = vq.j.a(str);
                                    dVar.f156805g = jVarA;
                                    dVar.f156806h = vq.j.a(aVar);
                                    dVar.f156807j = vq.j.a(aVar);
                                    dVar.f156808k = aVar;
                                    dVar.f156809l = vq.j.a(eVarA);
                                    dVar.f156810m = 0;
                                    dVar.f156811n = 0;
                                    dVar.f156812p = 0;
                                    dVar.f156813q = 0;
                                    dVar.f156814r = 0;
                                    dVar.f156817v = 2;
                                    objC = j0Var.c(allDocumentStatus, dVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            i16 = a.f156774b[((er0.h) ((dx.i.Right) right).b()).ordinal()];
                                            if (i16 != 1) {
                                                bVar3 = cr3.b.ACTIVE;
                                            } else if (i16 != 2) {
                                                bVar3 = cr3.b.REVOKED;
                                            } else if (i16 != 3) {
                                                bVar3 = cr3.b.EXPIRED;
                                            } else if (i16 != 4) {
                                                bVar3 = cr3.b.INACTIVE;
                                            } else {
                                                if (i16 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar3 = cr3.b.ACTIVE;
                                            }
                                            right = new dx.i.Right(bVar3);
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
                                licenceCode = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(licenceCode));
                                dx.i iVarA = licenceCode.a(e);
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
                            bVar = (ex.b) dVar.f156808k;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = a.f156773a[((f24.h) ((dx.i.Right) right).b()).ordinal()];
                                if (i15 != 1) {
                                    bVar2 = cr3.b.ACTIVE;
                                } else if (i15 != 2) {
                                    bVar2 = cr3.b.REVOKED;
                                } else if (i15 != 3) {
                                    bVar2 = cr3.b.EXPIRED;
                                } else {
                                    if (i15 == 4) {
                                        throw new oq.p();
                                    }
                                    bVar2 = cr3.b.INACTIVE;
                                }
                                right = new dx.i.Right(bVar2);
                            }
                        } else {
                            if (i18 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) dVar.f156808k;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i16 = a.f156774b[((er0.h) ((dx.i.Right) right).b()).ordinal()];
                                if (i16 != 1) {
                                    bVar3 = cr3.b.ACTIVE;
                                } else if (i16 != 2) {
                                    bVar3 = cr3.b.REVOKED;
                                } else if (i16 != 3) {
                                    bVar3 = cr3.b.EXPIRED;
                                } else if (i16 != 4) {
                                    bVar3 = cr3.b.INACTIVE;
                                } else {
                                    if (i16 == 5) {
                                        throw new oq.p();
                                    }
                                    bVar3 = cr3.b.ACTIVE;
                                }
                                right = new dx.i.Right(bVar3);
                            }
                        }
                        return new dx.i.Right((cr3.b) bVar.a(right));
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
        /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
        	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
        	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
        	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
        	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // ar3.a
        public Object h(LicenceCode licenceCode, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            rq0.b.e eVar2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f156801r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f156801r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f156799p;
            Object objE = uq.b.e();
            ?? r15 = cVar.f156801r;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(objC);
                        r34.e eVar3 = this.f156763f;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        ex.a aVar = new ex.a();
                        rq0.b.e eVarA = rq0.b.e.INSTANCE.a(licenceCode.getLicenceCode());
                        if (eVarA == null) {
                            aVar.b(new dx.b.Generic(new IllegalStateException("Document type for " + licenceCode.getLicenceCode() + " licence code is null")));
                            throw new oq.g();
                        }
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, eVarA);
                        cVar.f156789d = vq.j.a(licenceCode);
                        cVar.f156790e = jVarA;
                        cVar.f156791f = vq.j.a(aVar);
                        cVar.f156792g = aVar;
                        cVar.f156793h = eVarA;
                        cVar.f156794j = 0;
                        cVar.f156795k = 0;
                        cVar.f156796l = 0;
                        cVar.f156797m = 0;
                        cVar.f156798n = 0;
                        cVar.f156801r = 1;
                        objC = eVar3.c(params, cVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        eVar2 = eVarA;
                    } else {
                        if (r15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (rq0.b.e) cVar.f156793h;
                        bVar = (ex.b) cVar.f156792g;
                        try {
                            oq.u.b(objC);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    }
                    String str = (String) objC;
                    if (str != null) {
                        return new dx.i.Right(str);
                    }
                    bVar.b(new dx.b.Generic(new IllegalStateException("Short name for " + eVar2.getReferenceName() + " document is null")));
                    throw new oq.g();
                } catch (Exception e16) {
                    px.f fVar = px.f.f163100a;
                    String message = e16.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e16, px.c.a(r15));
                    dx.i iVarA = r15.a(e16);
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
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        /* JADX WARN: Code duplicated, block: B:69:0x018a  */
        /* JADX WARN: Code duplicated, block: B:72:0x019b  */
        /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:75:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // ar3.a
        public Object i(String str, int i15, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3884b c3884b;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            if (eVar instanceof C3884b) {
                c3884b = (C3884b) eVar;
                int i16 = c3884b.f156788s;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    c3884b.f156788s = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    c3884b = new C3884b(eVar);
                }
            } else {
                c3884b = new C3884b(eVar);
            }
            Object objC = c3884b.f156786q;
            Object objE = uq.b.e();
            int i17 = c3884b.f156788s;
            try {
                try {
                    if (i17 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f156758a;
                        k24.a aVar = this.f156770m;
                        q34.w wVar = this.f156771n;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                if (str == 0) {
                                    aVar2.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                    throw new oq.g();
                                }
                                k24.a.Params params = new k24.a.Params(str);
                                c3884b.f156775d = vq.j.a(str);
                                c3884b.f156776e = jVarA;
                                c3884b.f156777f = vq.j.a(aVar2);
                                c3884b.f156778g = vq.j.a(aVar2);
                                c3884b.f156779h = aVar2;
                                c3884b.f156780j = i15;
                                c3884b.f156781k = 0;
                                c3884b.f156782l = 0;
                                c3884b.f156783m = 0;
                                c3884b.f156784n = 0;
                                c3884b.f156785p = 0;
                                c3884b.f156788s = 1;
                                objC = aVar.c(params, c3884b);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar = aVar2;
                                    bVar.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                rq0.b.e eVarA = rq0.b.e.INSTANCE.a(i15);
                                if (eVarA == null) {
                                    aVar2.b(new dx.b.Generic(new IllegalStateException("Document type for " + i15 + " licence code is null")));
                                    throw new oq.g();
                                }
                                q34.w.Params params2 = new q34.w.Params(eVarA);
                                c3884b.f156775d = vq.j.a(str);
                                c3884b.f156776e = jVarA;
                                c3884b.f156777f = vq.j.a(aVar2);
                                c3884b.f156778g = vq.j.a(aVar2);
                                c3884b.f156779h = vq.j.a(eVarA);
                                c3884b.f156780j = i15;
                                c3884b.f156781k = 0;
                                c3884b.f156782l = 0;
                                c3884b.f156783m = 0;
                                c3884b.f156784n = 0;
                                c3884b.f156785p = 0;
                                c3884b.f156788s = 2;
                                if (wVar.c(params2, c3884b) != objE) {
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
                    if (i17 == 1) {
                        bVar = (ex.b) c3884b.f156779h;
                        jVar = (dx.j) c3884b.f156776e;
                        try {
                            oq.u.b(objC);
                            bVar.a((dx.i) objC);
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
                        if (i17 != 2) {
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

        /* JADX WARN: Code duplicated, block: B:72:0x0178  */
        /* JADX WARN: Code duplicated, block: B:75:0x0189  */
        /* JADX WARN: Code duplicated, block: B:76:0x0197  */
        /* JADX WARN: Code duplicated, block: B:78:0x019b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a8  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [int] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v23 */
        @Override // ar3.a
        public Object j(int i15, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            g gVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            dx.i<dx.b, f24.i> iVarL;
            f24.i iVar;
            dx.j<dx.b> jVar2;
            ex.b bVar;
            boolean zBooleanValue;
            if (eVar instanceof g) {
                gVar = (g) eVar;
                int i16 = gVar.f156850s;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    gVar.f156850s = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    gVar = new g(eVar);
                }
            } else {
                gVar = new g(eVar);
            }
            Object objC = gVar.f156848q;
            Object objE = uq.b.e();
            int i17 = gVar.f156850s;
            try {
                try {
                    if (i17 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f156758a;
                        w24.f2 f2Var = this.f156766i;
                        q34.n1 n1Var = this.f156767j;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue2 = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue2) {
                                rq0.b.e eVarA = rq0.b.e.INSTANCE.a(i15);
                                if (eVarA == null || (iVarL = j1.l(eVarA)) == null || (iVar = (f24.i) aVar.a(iVarL)) == null) {
                                    aVar.b(new dx.b.Generic(new IllegalStateException("Document type for " + ((int) i15) + " licence code is null")));
                                    throw new oq.g();
                                }
                                w24.f2.Params params = new w24.f2.Params(iVar);
                                gVar.f156843k = jVarA;
                                gVar.f156844l = vq.j.a(aVar);
                                gVar.f156845m = vq.j.a(aVar);
                                gVar.f156846n = vq.j.a(iVar);
                                gVar.f156847p = aVar;
                                gVar.f156837d = i15;
                                gVar.f156838e = 0;
                                gVar.f156839f = 0;
                                gVar.f156840g = 0;
                                gVar.f156841h = 0;
                                gVar.f156842j = 0;
                                gVar.f156850s = 1;
                                objC = f2Var.c(params, gVar);
                                if (objC != objE) {
                                    jVar2 = jVarA;
                                    bVar = aVar;
                                    zBooleanValue = ((Boolean) bVar.a((dx.i) objC)).booleanValue();
                                }
                            } else {
                                if (zBooleanValue2) {
                                    throw new oq.p();
                                }
                                q34.n1.Params params2 = new q34.n1.Params(i15);
                                gVar.f156843k = jVarA;
                                gVar.f156844l = vq.j.a(aVar);
                                gVar.f156845m = vq.j.a(aVar);
                                gVar.f156837d = i15;
                                gVar.f156838e = 0;
                                gVar.f156839f = 0;
                                gVar.f156840g = 0;
                                gVar.f156841h = 0;
                                gVar.f156842j = 0;
                                gVar.f156850s = 2;
                                objC = n1Var.c(params2, gVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    jVar2 = jVar;
                                    zBooleanValue = ((Boolean) objC).booleanValue();
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
                            i15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(i15));
                            iVarA = i15.a(e);
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
                    if (i17 == 1) {
                        bVar = (ex.b) gVar.f156847p;
                        jVar2 = (dx.j) gVar.f156843k;
                        try {
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) bVar.a((dx.i) objC)).booleanValue();
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            i15 = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(i15));
                            iVarA = i15.a(e);
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
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (dx.j) gVar.f156843k;
                        try {
                            oq.u.b(objC);
                            jVar2 = jVar;
                            zBooleanValue = ((Boolean) objC).booleanValue();
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(vq.b.a(zBooleanValue));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code duplicated, block: B:81:0x0250  */
        /* JADX WARN: Code duplicated, block: B:93:0x0284  */
        /* JADX WARN: Code duplicated, block: B:96:0x0295  */
        /* JADX WARN: Code duplicated, block: B:97:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:99:0x02a7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v0, types: [pc4.x9$b] */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v2, types: [pc4.x9$b$f, tq.e] */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // ar3.a
        public Object k(int i15, tq.e<? super dx.i<? extends dx.b, WruDocumentData>> eVar) throws Throwable {
            ?? fVar;
            String message;
            dx.i iVarA;
            Object objB;
            w24.s1 s1Var;
            q34.f1 f1Var;
            ex.b aVar;
            int i16;
            dx.j<dx.b> jVar;
            int i17;
            int i18;
            int i19;
            int i25;
            ex.b bVar;
            ex.b bVar2;
            dx.i<dx.b, f24.i> iVarL;
            f24.i iVar;
            dx.j<dx.b> jVar2;
            int i26;
            int i27;
            int i28;
            int i29;
            ex.b bVar3;
            ex.b bVar4;
            UserDocumentData userDocumentData;
            x9 x9Var;
            Object objC;
            UserDocumentData userDocumentData2;
            x9 x9Var2;
            ex.b bVar5;
            WruDocumentData wruDocumentDataH;
            UserDocumentData userDocumentData3;
            x9 x9Var3;
            Object objC2;
            UserDocumentData userDocumentData4;
            x9 x9Var4;
            ex.b bVar6;
            int i35 = i15;
            if (eVar instanceof f) {
                f fVar2 = (f) eVar;
                int i36 = fVar2.f156836v;
                if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar2.f156836v = i36 - PKIFailureInfo.systemUnavail;
                    fVar = fVar2;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object objB2 = fVar.f156834s;
            Object objE = uq.b.e();
            int i37 = fVar.f156836v;
            try {
                try {
                    try {
                        if (i37 == 0) {
                            oq.u.b(objB2);
                            c54.b bVar7 = this.f156758a;
                            s1Var = this.f156768k;
                            f1Var = this.f156769l;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                aVar = new ex.a();
                                boolean zBooleanValue = bVar7.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                i16 = 0;
                                if (zBooleanValue) {
                                    rq0.b.e eVarA = rq0.b.e.INSTANCE.a(i35);
                                    if (eVarA == null || (iVarL = j1.l(eVarA)) == null || (iVar = (f24.i) aVar.a(iVarL)) == null) {
                                        aVar.b(new dx.b.Generic(new IllegalStateException("Document type for " + i35 + " licence code is null")));
                                        throw new oq.g();
                                    }
                                    fVar.f156827k = s1Var;
                                    fVar.f156828l = jVarA;
                                    fVar.f156829m = vq.j.a(aVar);
                                    fVar.f156830n = aVar;
                                    fVar.f156831p = iVar;
                                    fVar.f156832q = aVar;
                                    fVar.f156821d = i35;
                                    fVar.f156822e = 0;
                                    fVar.f156823f = 0;
                                    fVar.f156824g = 0;
                                    fVar.f156825h = 0;
                                    fVar.f156826j = 0;
                                    fVar.f156836v = 1;
                                    objB2 = b(fVar);
                                    if (objB2 != objE) {
                                        jVar2 = jVarA;
                                        i26 = 0;
                                        i27 = 0;
                                        i28 = 0;
                                        i29 = 0;
                                        bVar3 = aVar;
                                        bVar4 = bVar3;
                                        userDocumentData = (UserDocumentData) aVar.a((dx.i) objB2);
                                        x9Var = x9.f156754a;
                                        ex.b bVar8 = bVar4;
                                        w24.s1.Params params = new w24.s1.Params(iVar);
                                        fVar.f156827k = jVar2;
                                        fVar.f156828l = vq.j.a(bVar8);
                                        fVar.f156829m = vq.j.a(bVar3);
                                        fVar.f156830n = userDocumentData;
                                        fVar.f156831p = vq.j.a(iVar);
                                        fVar.f156832q = x9Var;
                                        fVar.f156833r = bVar3;
                                        fVar.f156821d = i35;
                                        fVar.f156822e = i29;
                                        fVar.f156823f = i28;
                                        fVar.f156824g = i27;
                                        fVar.f156825h = i26;
                                        fVar.f156826j = i16;
                                        fVar.f156836v = 2;
                                        objC = s1Var.c(params, fVar);
                                        if (objC != objE) {
                                            userDocumentData2 = userDocumentData;
                                            x9Var2 = x9Var;
                                            objB2 = objC;
                                            bVar5 = bVar3;
                                            wruDocumentDataH = x9Var2.h((i24.WruDocumentData) bVar5.a((dx.i) objB2), userDocumentData2);
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    fVar.f156827k = f1Var;
                                    fVar.f156828l = jVarA;
                                    fVar.f156829m = vq.j.a(aVar);
                                    fVar.f156830n = aVar;
                                    fVar.f156831p = aVar;
                                    fVar.f156821d = i35;
                                    fVar.f156822e = 0;
                                    fVar.f156823f = 0;
                                    fVar.f156824g = 0;
                                    fVar.f156825h = 0;
                                    fVar.f156826j = 0;
                                    fVar.f156836v = 3;
                                    objB2 = b(fVar);
                                    if (objB2 != objE) {
                                        jVar = jVarA;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        i25 = 0;
                                        bVar = aVar;
                                        bVar2 = bVar;
                                        userDocumentData3 = (UserDocumentData) bVar.a((dx.i) objB2);
                                        x9Var3 = x9.f156754a;
                                        q34.f1.Params params2 = new q34.f1.Params(i35);
                                        fVar.f156827k = jVar;
                                        fVar.f156828l = vq.j.a(bVar2);
                                        fVar.f156829m = vq.j.a(aVar);
                                        fVar.f156830n = userDocumentData3;
                                        fVar.f156831p = x9Var3;
                                        fVar.f156832q = aVar;
                                        fVar.f156821d = i35;
                                        fVar.f156822e = i25;
                                        fVar.f156823f = i19;
                                        fVar.f156824g = i18;
                                        fVar.f156825h = i17;
                                        fVar.f156826j = i16;
                                        fVar.f156836v = 4;
                                        objC2 = f1Var.c(params2, fVar);
                                        if (objC2 != objE) {
                                            userDocumentData4 = userDocumentData3;
                                            x9Var4 = x9Var3;
                                            objB2 = objC2;
                                            bVar6 = aVar;
                                            wruDocumentDataH = x9Var4.i((k34.WruDocumentData) bVar6.a((dx.i) objB2), userDocumentData4);
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
                                fVar = jVarA;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(fVar));
                                iVarA = fVar.a(e);
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
                        if (i37 == 1) {
                            int i38 = fVar.f156826j;
                            i26 = fVar.f156825h;
                            i27 = fVar.f156824g;
                            i28 = fVar.f156823f;
                            i29 = fVar.f156822e;
                            int i39 = fVar.f156821d;
                            aVar = (ex.b) fVar.f156832q;
                            iVar = (f24.i) fVar.f156831p;
                            bVar3 = (ex.b) fVar.f156830n;
                            bVar4 = (ex.b) fVar.f156829m;
                            jVar2 = (dx.j) fVar.f156828l;
                            s1Var = (w24.s1) fVar.f156827k;
                            try {
                                oq.u.b(objB2);
                                i16 = i38;
                                i35 = i39;
                                userDocumentData = (UserDocumentData) aVar.a((dx.i) objB2);
                                x9Var = x9.f156754a;
                                ex.b bVar9 = bVar4;
                                w24.s1.Params params3 = new w24.s1.Params(iVar);
                                fVar.f156827k = jVar2;
                                fVar.f156828l = vq.j.a(bVar9);
                                fVar.f156829m = vq.j.a(bVar3);
                                fVar.f156830n = userDocumentData;
                                fVar.f156831p = vq.j.a(iVar);
                                fVar.f156832q = x9Var;
                                fVar.f156833r = bVar3;
                                fVar.f156821d = i35;
                                fVar.f156822e = i29;
                                fVar.f156823f = i28;
                                fVar.f156824g = i27;
                                fVar.f156825h = i26;
                                fVar.f156826j = i16;
                                fVar.f156836v = 2;
                                objC = s1Var.c(params3, fVar);
                                if (objC != objE) {
                                    userDocumentData2 = userDocumentData;
                                    x9Var2 = x9Var;
                                    objB2 = objC;
                                    bVar5 = bVar3;
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                fVar = jVar2;
                                px.f fVar4 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar4.d(message, e, px.c.a(fVar));
                                iVarA = fVar.a(e);
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
                        if (i37 != 2) {
                            if (i37 == 3) {
                                int i45 = fVar.f156826j;
                                i17 = fVar.f156825h;
                                i18 = fVar.f156824g;
                                i19 = fVar.f156823f;
                                i25 = fVar.f156822e;
                                int i46 = fVar.f156821d;
                                ex.b bVar10 = (ex.b) fVar.f156831p;
                                ex.b bVar11 = (ex.b) fVar.f156830n;
                                bVar2 = (ex.b) fVar.f156829m;
                                jVar = (dx.j) fVar.f156828l;
                                f1Var = (q34.f1) fVar.f156827k;
                                try {
                                    oq.u.b(objB2);
                                    i16 = i45;
                                    i35 = i46;
                                    bVar = bVar10;
                                    aVar = bVar11;
                                    userDocumentData3 = (UserDocumentData) bVar.a((dx.i) objB2);
                                    x9Var3 = x9.f156754a;
                                    q34.f1.Params params4 = new q34.f1.Params(i35);
                                    fVar.f156827k = jVar;
                                    fVar.f156828l = vq.j.a(bVar2);
                                    fVar.f156829m = vq.j.a(aVar);
                                    fVar.f156830n = userDocumentData3;
                                    fVar.f156831p = x9Var3;
                                    fVar.f156832q = aVar;
                                    fVar.f156821d = i35;
                                    fVar.f156822e = i25;
                                    fVar.f156823f = i19;
                                    fVar.f156824g = i18;
                                    fVar.f156825h = i17;
                                    fVar.f156826j = i16;
                                    fVar.f156836v = 4;
                                    objC2 = f1Var.c(params4, fVar);
                                    if (objC2 != objE) {
                                        userDocumentData4 = userDocumentData3;
                                        x9Var4 = x9Var3;
                                        objB2 = objC2;
                                        bVar6 = aVar;
                                    }
                                    return objE;
                                } catch (ex.c e26) {
                                    e = e26;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e27) {
                                    throw e27;
                                } catch (Exception e28) {
                                    e = e28;
                                    fVar = jVar;
                                    px.f fVar5 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar5.d(message, e, px.c.a(fVar));
                                    iVarA = fVar.a(e);
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
                            if (i37 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar6 = (ex.b) fVar.f156832q;
                            x9Var4 = (x9) fVar.f156831p;
                            userDocumentData4 = (UserDocumentData) fVar.f156830n;
                            oq.u.b(objB2);
                            wruDocumentDataH = x9Var4.i((k34.WruDocumentData) bVar6.a((dx.i) objB2), userDocumentData4);
                        } else {
                            bVar5 = (ex.b) fVar.f156833r;
                            x9Var2 = (x9) fVar.f156832q;
                            userDocumentData2 = (UserDocumentData) fVar.f156830n;
                            oq.u.b(objB2);
                        }
                        wruDocumentDataH = x9Var2.h((i24.WruDocumentData) bVar5.a((dx.i) objB2), userDocumentData2);
                        return new dx.i.Right(wruDocumentDataH);
                    } catch (CancellationException e29) {
                        throw e29;
                    }
                } catch (Exception e35) {
                    e = e35;
                }
            } catch (ex.c e36) {
                e = e36;
            } catch (CancellationException e37) {
                throw e37;
            }
        }
    }

    private x9() {
    }

    private final Document d(f24.Document document) {
        return new Document(document.getDocumentId(), document.getParentCertificateId(), e(document.getDocumentStatus()), document.getExpirationDate(), document.getLastUpdateTimestamp());
    }

    private final cr3.b e(f24.h hVar) {
        int i15 = a.f156757c[hVar.ordinal()];
        if (i15 == 1) {
            return cr3.b.ACTIVE;
        }
        if (i15 == 2) {
            return cr3.b.REVOKED;
        }
        if (i15 == 3) {
            return cr3.b.EXPIRED;
        }
        if (i15 == 4) {
            return cr3.b.INACTIVE;
        }
        throw new oq.p();
    }

    private final cr3.c f(i24.u0 u0Var) {
        int i15 = a.f156756b[u0Var.ordinal()];
        if (i15 == 1) {
            return cr3.c.DEFAULT;
        }
        if (i15 == 2) {
            return cr3.c.SENATOR;
        }
        if (i15 == 3) {
            return cr3.c.PZPN;
        }
        throw new oq.p();
    }

    private final cr3.c g(k34.d0 d0Var) {
        int i15 = a.f156755a[d0Var.ordinal()];
        if (i15 == 1) {
            return cr3.c.DEFAULT;
        }
        if (i15 == 2) {
            return cr3.c.SENATOR;
        }
        if (i15 == 3) {
            return cr3.c.PZPN;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WruDocumentData h(i24.WruDocumentData wruDocumentData, UserDocumentData userDocumentData) {
        Document documentD = d(wruDocumentData.getDocument());
        String documentIid = wruDocumentData.getScope().getDocumentIid();
        String pesel = wruDocumentData.getScope().getPesel();
        int licenceCode = wruDocumentData.getScope().getLicenceCode();
        String documentVersion = wruDocumentData.getScope().getDocumentVersion();
        long lastUpdate = wruDocumentData.getScope().getLastUpdate();
        cr3.c cVarF = f(wruDocumentData.getScope().getTemplateType());
        String documentName = wruDocumentData.getScope().getDocumentName();
        String documentLogo = wruDocumentData.getScope().getDocumentLogo();
        String additionalDescription = wruDocumentData.getScope().getAdditionalDescription();
        List<WruDocumentItem> listC = wruDocumentData.getScope().c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f156754a.j((WruDocumentItem) it.next()));
        }
        List<WruDocumentItem> listB = wruDocumentData.getScope().b();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(f156754a.j((WruDocumentItem) it4.next()));
        }
        return new WruDocumentData(documentD, new WruDocumentScope(documentIid, pesel, licenceCode, documentVersion, lastUpdate, cVarF, documentName, documentLogo, additionalDescription, arrayList, arrayList2, wruDocumentData.getScope().getDetails()), userDocumentData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WruDocumentData i(k34.WruDocumentData wruDocumentData, UserDocumentData userDocumentData) {
        String documentIid = wruDocumentData.getDocumentIid();
        String pesel = wruDocumentData.getPesel();
        int licenceCode = wruDocumentData.getLicenceCode();
        String documentVersion = wruDocumentData.getDocumentVersion();
        long lastUpdate = wruDocumentData.getLastUpdate();
        cr3.c cVarG = g(wruDocumentData.getTemplateType());
        String documentName = wruDocumentData.getDocumentName();
        String documentLogo = wruDocumentData.getDocumentLogo();
        String additionalDescription = wruDocumentData.getAdditionalDescription();
        List<k34.WruDocumentItem> listC = wruDocumentData.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f156754a.k((k34.WruDocumentItem) it.next()));
        }
        List<k34.WruDocumentItem> listB = wruDocumentData.b();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(f156754a.k((k34.WruDocumentItem) it4.next()));
        }
        return new WruDocumentData(null, new WruDocumentScope(documentIid, pesel, licenceCode, documentVersion, lastUpdate, cVarG, documentName, documentLogo, additionalDescription, arrayList, arrayList2, wruDocumentData.getDetails()), userDocumentData);
    }

    private final cr3.WruDocumentItem j(WruDocumentItem wruDocumentItem) {
        return new cr3.WruDocumentItem(wruDocumentItem.getDataType(), wruDocumentItem.getValue(), wruDocumentItem.getLabel(), wruDocumentItem.getType(), wruDocumentItem.getShare());
    }

    private final cr3.WruDocumentItem k(k34.WruDocumentItem wruDocumentItem) {
        return new cr3.WruDocumentItem(wruDocumentItem.getDataType(), wruDocumentItem.getValue(), wruDocumentItem.getLabel(), wruDocumentItem.getType(), wruDocumentItem.getShare());
    }

    public final ar3.a c(c54.b isFeatureEnabledUseCase, k24.l refreshDocumentsStatusesUC, q34.v1 refreshDocumentsStatusesUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, r34.e getValueFromDocumentConfigUC, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, w24.f2 isDocumentAddedByTypeUC, q34.n1 isWruDocumentAddedUseCase, q34.f1 getWruDocumentDataUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, w24.s1 getWruDocumentDataUC, j34.d getDocumentDeletionDialogUC) {
        return new b(isFeatureEnabledUseCase, refreshDocumentsStatusesUC, refreshDocumentsStatusesUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getValueFromDocumentConfigUC, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, isDocumentAddedByTypeUC, isWruDocumentAddedUseCase, getWruDocumentDataUC, getWruDocumentDataUseCase, deleteDocumentByIdUC, deleteDocumentUseCase, getDocumentDeletionDialogUC);
    }
}
