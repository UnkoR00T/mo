package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import k34.PensionerCardDocumentData;
import ns2.PensionerCardData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpc4/s6;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/y0;", "getPensionerCardDataUC", "Lw24/f1;", "containersGetPensionerCardDataUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/n;", "deleteDocumentByTypeUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lms2/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;Lq34/y0;Lw24/f1;Lw24/k0;Lq34/j0;Lk24/a;Lq34/w;Lw24/n;Lr34/e;Lq34/d;Lj34/d;)Lms2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s6 f156126a = new s6();

    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\fJ&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\fJ*\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"pc4/s6$a", "Lms2/a;", "", "documentId", "Ljava/util/Date;", "expirationDate", "Ldx/i;", "Ldx/b;", "Lns2/c;", "i", "(Ljava/lang/String;Ljava/util/Date;Ltq/e;)Ljava/lang/Object;", "j", "(Ltq/e;)Ljava/lang/Object;", "Lns2/e;", "f", "e", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "d", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements ms2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.f1 f156128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.y0 f156129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r34.e f156130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w24.n f156131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k24.a f156132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.w f156133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q34.d f156134h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ j34.d f156135i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w24.k0 f156136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q34.j0 f156137k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ w24.x0 f156138l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q34.x0 f156139m;

        /* JADX INFO: renamed from: pc4.s6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3869a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156140d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156141e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156142f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156143g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156144h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156145j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156146k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156147l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156148m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156149n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156150p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156152r;

            C3869a(tq.e<? super C3869a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156150p = obj;
                this.f156152r |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156153d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156154e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156155f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156156g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156157h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156158j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156159k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156160l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156161m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156162n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156163p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156164q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156166s;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156164q = obj;
                this.f156166s |= PKIFailureInfo.systemUnavail;
                return a.this.i(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156167d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156169f;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156167d = obj;
                this.f156169f |= PKIFailureInfo.systemUnavail;
                return a.this.j(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156170d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156171e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156172f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156173g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156174h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156175j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156176k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156177l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156178m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156179n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156180p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156181q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156182r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156183s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f156184t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f156185v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f156187x;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156185v = obj;
                this.f156187x |= PKIFailureInfo.systemUnavail;
                return a.this.f(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156188d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156189e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156190f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156191g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156192h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156193j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156194k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156195l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f156196m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156198p;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156196m = obj;
                this.f156198p |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        a(c54.b bVar, w24.f1 f1Var, q34.y0 y0Var, r34.e eVar, w24.n nVar, k24.a aVar, q34.w wVar, q34.d dVar, j34.d dVar2, w24.k0 k0Var, q34.j0 j0Var, w24.x0 x0Var, q34.x0 x0Var2) {
            this.f156127a = bVar;
            this.f156128b = f1Var;
            this.f156129c = y0Var;
            this.f156130d = eVar;
            this.f156131e = nVar;
            this.f156132f = aVar;
            this.f156133g = wVar;
            this.f156134h = dVar;
            this.f156135i = dVar2;
            this.f156136j = k0Var;
            this.f156137k = j0Var;
            this.f156138l = x0Var;
            this.f156139m = x0Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x015a  */
        /* JADX WARN: Code duplicated, block: B:59:0x015b A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x015f A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x017d A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #5 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0154, B:62:0x0171, B:63:0x0177, B:59:0x015b, B:61:0x015f, B:64:0x017d, B:65:0x0182, B:68:0x0189, B:71:0x0197, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Date] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        public final Object i(String str, Date date, tq.e<? super dx.i<? extends dx.b, ? extends ns2.c>> eVar) throws Throwable {
            b bVar;
            Object objB;
            ex.b bVar2;
            ex.b bVar3;
            dx.i right;
            ns2.c cVar;
            dx.i right2;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156166s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156166s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f156164q;
            Object objE = uq.b.e();
            int i16 = bVar.f156166s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f156127a;
                            w24.k0 k0Var = this.f156136j;
                            q34.j0 j0Var = this.f156137k;
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
                                    bVar.f156153d = vq.j.a(str);
                                    bVar.f156154e = vq.j.a(date);
                                    bVar.f156155f = jVarA;
                                    bVar.f156156g = vq.j.a(aVar);
                                    bVar.f156157h = vq.j.a(aVar);
                                    bVar.f156158j = aVar;
                                    bVar.f156159k = 0;
                                    bVar.f156160l = 0;
                                    bVar.f156161m = 0;
                                    bVar.f156162n = 0;
                                    bVar.f156163p = 0;
                                    bVar.f156166s = 1;
                                    objC = k0Var.c(params, bVar);
                                    if (objC != objE) {
                                        bVar3 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(t6.i((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        cVar = (ns2.c) bVar3.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.PENSIONER_CARD, date);
                                    bVar.f156153d = vq.j.a(str);
                                    bVar.f156154e = vq.j.a(date);
                                    bVar.f156155f = jVarA;
                                    bVar.f156156g = vq.j.a(aVar);
                                    bVar.f156157h = vq.j.a(aVar);
                                    bVar.f156158j = aVar;
                                    bVar.f156159k = 0;
                                    bVar.f156160l = 0;
                                    bVar.f156161m = 0;
                                    bVar.f156162n = 0;
                                    bVar.f156163p = 0;
                                    bVar.f156166s = 2;
                                    objC = j0Var.c(allDocumentStatus, bVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(t6.h((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        cVar = (ns2.c) bVar2.a(right2);
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
                                date = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(date));
                                dx.i iVarA = date.a(e);
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
                            bVar3 = (ex.b) bVar.f156158j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(t6.i((f24.h) ((dx.i.Right) right).b()));
                            }
                            cVar = (ns2.c) bVar3.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar2 = (ex.b) bVar.f156158j;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(t6.h((er0.h) ((dx.i.Right) right2).b()));
                            }
                            cVar = (ns2.c) bVar2.a(right2);
                        }
                        return new dx.i.Right(cVar);
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

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r6 == r1) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object j(tq.e<? super dx.i<? extends dx.b, java.lang.String>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.s6.a.c
                if (r0 == 0) goto L13
                r0 = r6
                pc4.s6$a$c r0 = (pc4.s6.a.c) r0
                int r1 = r0.f156169f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f156169f = r1
                goto L18
            L13:
                pc4.s6$a$c r0 = new pc4.s6$a$c
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f156167d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f156169f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r6)
                goto L8a
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
                c54.b r6 = r5.f156127a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7b
                w24.x0 r6 = r5.f156138l
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156169f = r4
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L58
                goto L89
            L58:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L5f
                return r6
            L5f:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L75
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                u24.c r6 = (u24.UserDocumentData) r6
                java.lang.String r6 = r6.getPhoto()
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            L75:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L7b:
                if (r6 != 0) goto Lb1
                q34.x0 r6 = r5.f156139m
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156169f = r3
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L8a
            L89:
                return r1
            L8a:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L91
                return r6
            L91:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto Lab
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                k34.f0 r6 = (k34.UserDocumentData) r6
                iy.b0 r6 = r6.getPhoto()
                java.lang.String r6 = iy.c0.e(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: pc4.s6.a.j(tq.e):java.lang.Object");
        }

        @Override // ms2.a
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
        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v5, types: [dx.j, java.lang.Object] */
        @Override // ms2.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3869a c3869a;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            ex.b bVar2;
            if (eVar instanceof C3869a) {
                c3869a = (C3869a) eVar;
                int i15 = c3869a.f156152r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3869a.f156152r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3869a = new C3869a(eVar);
                }
            } else {
                c3869a = new C3869a(eVar);
            }
            Object objC = c3869a.f156150p;
            Object objE = uq.b.e();
            int i16 = c3869a.f156152r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f156127a;
                            w24.n nVar = this.f156131e;
                            k24.a aVar = this.f156132f;
                            q34.w wVar = this.f156133g;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        w24.n.Params params = new w24.n.Params(f24.i.PENSIONER_CARD);
                                        c3869a.f156140d = vq.j.a(str);
                                        c3869a.f156141e = jVarA;
                                        c3869a.f156142f = vq.j.a(aVar2);
                                        c3869a.f156143g = vq.j.a(aVar2);
                                        c3869a.f156144h = aVar2;
                                        c3869a.f156145j = 0;
                                        c3869a.f156146k = 0;
                                        c3869a.f156147l = 0;
                                        c3869a.f156148m = 0;
                                        c3869a.f156149n = 0;
                                        c3869a.f156152r = 1;
                                        objC = nVar.c(params, c3869a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar2 = aVar2;
                                            bVar2.a((dx.i) objC);
                                        }
                                    } else {
                                        k24.a.Params params2 = new k24.a.Params(str);
                                        c3869a.f156140d = vq.j.a(str);
                                        c3869a.f156141e = jVarA;
                                        c3869a.f156142f = vq.j.a(aVar2);
                                        c3869a.f156143g = vq.j.a(aVar2);
                                        c3869a.f156144h = aVar2;
                                        c3869a.f156145j = 0;
                                        c3869a.f156146k = 0;
                                        c3869a.f156147l = 0;
                                        c3869a.f156148m = 0;
                                        c3869a.f156149n = 0;
                                        c3869a.f156152r = 2;
                                        objC = aVar.c(params2, c3869a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar = aVar2;
                                            bVar.a((dx.i) objC);
                                        }
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.w.Params params3 = new q34.w.Params(rq0.b.d.PENSIONER_CARD);
                                    c3869a.f156140d = vq.j.a(str);
                                    c3869a.f156141e = jVarA;
                                    c3869a.f156142f = vq.j.a(aVar2);
                                    c3869a.f156143g = vq.j.a(aVar2);
                                    c3869a.f156145j = 0;
                                    c3869a.f156146k = 0;
                                    c3869a.f156147l = 0;
                                    c3869a.f156148m = 0;
                                    c3869a.f156149n = 0;
                                    c3869a.f156152r = 3;
                                    if (wVar.c(params3, c3869a) != objE) {
                                        return new dx.i.Right(oq.i0.f148189a);
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
                        if (i16 == 1) {
                            bVar2 = (ex.b) c3869a.f156144h;
                            jVar = (dx.j) c3869a.f156141e;
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } else {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                try {
                                    oq.u.b(objC);
                                    return new dx.i.Right(oq.i0.f148189a);
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            }
                            bVar = (ex.b) c3869a.f156144h;
                            jVar = (dx.j) c3869a.f156141e;
                            oq.u.b(objC);
                            bVar.a((dx.i) objC);
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (Exception e25) {
                        e = e25;
                    }
                } catch (CancellationException e26) {
                    throw e26;
                }
            } catch (ex.c e27) {
                e = e27;
            } catch (CancellationException e28) {
                throw e28;
            } catch (Exception e29) {
                e = e29;
                str = objE;
            }
        }

        @Override // ms2.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f156135i.c(new j34.d.Params(rq0.b.d.PENSIONER_CARD, aVar, null, 4, null), eVar);
        }

        @Override // ms2.a
        public Object d(tq.e<? super dx.i<oq.i0, DialogData>> eVar) {
            return this.f156134h.c(new q34.d.Params(rq0.c.ZUS_VISIT), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.s6$a$e, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // ms2.a
        public Object e(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? eVar2;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof e) {
                e eVar3 = (e) eVar;
                int i15 = eVar3.f156198p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar3.f156198p = i15 - PKIFailureInfo.systemUnavail;
                    eVar2 = eVar3;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objC = eVar2.f156196m;
            Object objE = uq.b.e();
            int i16 = eVar2.f156198p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) eVar2.f156195l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for pensioner card is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar4 = this.f156130d;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.PENSIONER_CARD);
                        eVar2.f156193j = jVarA;
                        eVar2.f156194k = vq.j.a(aVar);
                        eVar2.f156195l = aVar;
                        eVar2.f156188d = 0;
                        eVar2.f156189e = 0;
                        eVar2.f156190f = 0;
                        eVar2.f156191g = 0;
                        eVar2.f156192h = 0;
                        eVar2.f156198p = 1;
                        objC = eVar4.c(params, eVar2);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for pensioner card is null")));
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

        /* JADX WARN: Code duplicated, block: B:100:0x02d5  */
        /* JADX WARN: Code duplicated, block: B:105:0x02f7 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_ENTER, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:107:0x02fd A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:115:0x031a  */
        /* JADX WARN: Code duplicated, block: B:118:0x032b  */
        /* JADX WARN: Code duplicated, block: B:119:0x0339  */
        /* JADX WARN: Code duplicated, block: B:121:0x033d  */
        /* JADX WARN: Code duplicated, block: B:124:0x0349  */
        /* JADX WARN: Code duplicated, block: B:63:0x019a A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:70:0x01d1 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:72:0x01d5 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_LEAVE, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:75:0x021d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:85:0x0249 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_ENTER, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:87:0x024f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:88:0x0251 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0279  */
        /* JADX WARN: Code duplicated, block: B:91:0x027a  */
        /* JADX WARN: Code duplicated, block: B:94:0x0288  */
        /* JADX WARN: Code duplicated, block: B:95:0x028a A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:97:0x028e A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_LEAVE, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02f7, B:106:0x02fc, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02fd, B:108:0x0302, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0, types: [pc4.s6$a] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2, types: [pc4.s6$a$d, tq.e] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // ms2.a
        public Object f(tq.e<? super dx.i<? extends dx.b, PensionerCardData>> eVar) throws Throwable {
            ?? dVar;
            String message;
            dx.i iVarA;
            Object objB;
            c54.b bVar;
            w24.f1 f1Var;
            q34.y0 y0Var;
            dx.j<dx.b> jVarA;
            ex.b aVar;
            ex.b bVar2;
            ex.b bVar3;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            String str;
            boolean zBooleanValue;
            Object objC;
            ex.b bVar4;
            ex.b bVar5;
            String str2;
            int i25;
            int i26;
            int i27;
            ex.b bVar6;
            Object objC2;
            ex.b bVar7;
            ex.b bVar8;
            String str3;
            int i28;
            dx.i right;
            i24.PensionerCardData pensionerCardData;
            i24.PensionerCardData pensionerCardData2;
            String str4;
            ex.b bVar9;
            ex.b bVar10;
            PensionerCardData pensionerCardData3;
            dx.i right2;
            PensionerCardDocumentData pensionerCardDocumentData;
            PensionerCardDocumentData pensionerCardDocumentData2;
            String str5;
            ex.b bVar11;
            if (eVar instanceof d) {
                d dVar2 = (d) eVar;
                int i29 = dVar2.f156187x;
                if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar2.f156187x = i29 - PKIFailureInfo.systemUnavail;
                    dVar = dVar2;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objJ = dVar.f156185v;
            Object objE = uq.b.e();
            int i35 = dVar.f156187x;
            try {
                try {
                    try {
                        if (i35 == 0) {
                            oq.u.b(objJ);
                            bVar = this.f156127a;
                            f1Var = this.f156128b;
                            y0Var = this.f156129c;
                            jVarA = xw.c.f221622a.a();
                            try {
                                aVar = new ex.a();
                                dVar.f156170d = bVar;
                                dVar.f156171e = f1Var;
                                dVar.f156172f = y0Var;
                                dVar.f156173g = jVarA;
                                dVar.f156174h = vq.j.a(aVar);
                                dVar.f156175j = aVar;
                                dVar.f156176k = aVar;
                                dVar.f156178m = 0;
                                dVar.f156179n = 0;
                                dVar.f156180p = 0;
                                dVar.f156181q = 0;
                                dVar.f156182r = 0;
                                dVar.f156187x = 1;
                                objJ = j(dVar);
                                if (objJ != objE) {
                                    bVar2 = aVar;
                                    bVar3 = bVar2;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    str = (String) aVar.a((dx.i) objJ);
                                    zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                    if (zBooleanValue) {
                                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                        dVar.f156170d = jVarA;
                                        dVar.f156171e = vq.j.a(bVar2);
                                        dVar.f156172f = bVar3;
                                        dVar.f156173g = bVar3;
                                        dVar.f156174h = str;
                                        dVar.f156175j = null;
                                        dVar.f156176k = null;
                                        dVar.f156178m = i19;
                                        dVar.f156179n = i18;
                                        dVar.f156180p = i17;
                                        dVar.f156181q = i16;
                                        dVar.f156182r = i15;
                                        dVar.f156187x = 2;
                                        objC2 = f1Var.c(c1792a, dVar);
                                        if (objC2 == objE) {
                                            bVar7 = bVar2;
                                            bVar8 = bVar3;
                                            str3 = str;
                                            objJ = objC2;
                                            i28 = i19;
                                            right = (dx.i) objJ;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (!(right instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                pensionerCardData = (i24.PensionerCardData) ((dx.i.Right) right).b();
                                                String documentId = pensionerCardData.getDocument().getDocumentId();
                                                dVar.f156170d = jVarA;
                                                dVar.f156171e = vq.j.a(bVar7);
                                                dVar.f156172f = vq.j.a(bVar8);
                                                dVar.f156173g = bVar3;
                                                dVar.f156174h = str3;
                                                dVar.f156175j = vq.j.a(right);
                                                dVar.f156176k = pensionerCardData;
                                                dVar.f156177l = bVar8;
                                                dVar.f156178m = i28;
                                                dVar.f156179n = i18;
                                                dVar.f156180p = i17;
                                                dVar.f156181q = i16;
                                                dVar.f156182r = i15;
                                                dVar.f156183s = 0;
                                                dVar.f156184t = 0;
                                                dVar.f156187x = 3;
                                                objJ = i(documentId, null, dVar);
                                                if (objJ != objE) {
                                                    pensionerCardData2 = pensionerCardData;
                                                    str4 = str3;
                                                    bVar9 = bVar8;
                                                    bVar10 = bVar3;
                                                    right = new dx.i.Right(t6.f(pensionerCardData2, (ns2.c) bVar9.a((dx.i) objJ), str4));
                                                    bVar3 = bVar10;
                                                }
                                            }
                                            pensionerCardData3 = (PensionerCardData) bVar3.a(right);
                                        }
                                    } else {
                                        if (!zBooleanValue) {
                                            throw new oq.p();
                                        }
                                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                        dVar.f156170d = jVarA;
                                        dVar.f156171e = vq.j.a(bVar2);
                                        dVar.f156172f = bVar3;
                                        dVar.f156173g = bVar3;
                                        dVar.f156174h = str;
                                        dVar.f156175j = null;
                                        dVar.f156176k = null;
                                        dVar.f156178m = i19;
                                        dVar.f156179n = i18;
                                        dVar.f156180p = i17;
                                        dVar.f156181q = i16;
                                        dVar.f156182r = i15;
                                        dVar.f156187x = 4;
                                        objC = y0Var.c(c1792a2, dVar);
                                        if (objC == objE) {
                                            bVar4 = bVar3;
                                            bVar5 = bVar2;
                                            str2 = str;
                                            objJ = objC;
                                            i25 = i18;
                                            i26 = i17;
                                            i27 = i16;
                                            bVar6 = bVar4;
                                            right2 = (dx.i) objJ;
                                            if (!(right2 instanceof dx.i.Left)) {
                                                if (!(right2 instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                pensionerCardDocumentData = (PensionerCardDocumentData) ((dx.i.Right) right2).b();
                                                Date expiredData = pensionerCardDocumentData.getPensionerCardDataModel().getExpiredData();
                                                dVar.f156170d = jVarA;
                                                dVar.f156171e = vq.j.a(bVar5);
                                                dVar.f156172f = vq.j.a(bVar4);
                                                dVar.f156173g = bVar6;
                                                dVar.f156174h = str2;
                                                dVar.f156175j = vq.j.a(right2);
                                                dVar.f156176k = pensionerCardDocumentData;
                                                dVar.f156177l = bVar4;
                                                dVar.f156178m = i19;
                                                dVar.f156179n = i25;
                                                dVar.f156180p = i26;
                                                dVar.f156181q = i27;
                                                dVar.f156182r = i15;
                                                dVar.f156183s = 0;
                                                dVar.f156184t = 0;
                                                dVar.f156187x = 5;
                                                objJ = i(null, expiredData, dVar);
                                                if (objJ != objE) {
                                                    pensionerCardDocumentData2 = pensionerCardDocumentData;
                                                    str5 = str2;
                                                    bVar11 = bVar4;
                                                    right2 = new dx.i.Right(t6.g(pensionerCardDocumentData2, (ns2.c) bVar11.a((dx.i) objJ), str5));
                                                }
                                            }
                                            pensionerCardData3 = (PensionerCardData) bVar6.a(right2);
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
                                dVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(dVar));
                                iVarA = dVar.a(e);
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
                        if (i35 == 1) {
                            int i36 = dVar.f156182r;
                            int i37 = dVar.f156181q;
                            i17 = dVar.f156180p;
                            int i38 = dVar.f156179n;
                            i19 = dVar.f156178m;
                            aVar = (ex.b) dVar.f156176k;
                            bVar3 = (ex.b) dVar.f156175j;
                            ex.b bVar12 = (ex.b) dVar.f156174h;
                            dx.j<dx.b> jVar = (dx.j) dVar.f156173g;
                            y0Var = (q34.y0) dVar.f156172f;
                            f1Var = (w24.f1) dVar.f156171e;
                            bVar = (c54.b) dVar.f156170d;
                            try {
                                oq.u.b(objJ);
                                i15 = i36;
                                jVarA = jVar;
                                i18 = i38;
                                bVar2 = bVar12;
                                i16 = i37;
                                str = (String) aVar.a((dx.i) objJ);
                                zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                    dVar.f156170d = jVarA;
                                    dVar.f156171e = vq.j.a(bVar2);
                                    dVar.f156172f = bVar3;
                                    dVar.f156173g = bVar3;
                                    dVar.f156174h = str;
                                    dVar.f156175j = null;
                                    dVar.f156176k = null;
                                    dVar.f156178m = i19;
                                    dVar.f156179n = i18;
                                    dVar.f156180p = i17;
                                    dVar.f156181q = i16;
                                    dVar.f156182r = i15;
                                    dVar.f156187x = 2;
                                    objC2 = f1Var.c(c1792a3, dVar);
                                    if (objC2 == objE) {
                                        bVar7 = bVar2;
                                        bVar8 = bVar3;
                                        str3 = str;
                                        objJ = objC2;
                                        i28 = i19;
                                        right = (dx.i) objJ;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            pensionerCardData = (i24.PensionerCardData) ((dx.i.Right) right).b();
                                            String documentId2 = pensionerCardData.getDocument().getDocumentId();
                                            dVar.f156170d = jVarA;
                                            dVar.f156171e = vq.j.a(bVar7);
                                            dVar.f156172f = vq.j.a(bVar8);
                                            dVar.f156173g = bVar3;
                                            dVar.f156174h = str3;
                                            dVar.f156175j = vq.j.a(right);
                                            dVar.f156176k = pensionerCardData;
                                            dVar.f156177l = bVar8;
                                            dVar.f156178m = i28;
                                            dVar.f156179n = i18;
                                            dVar.f156180p = i17;
                                            dVar.f156181q = i16;
                                            dVar.f156182r = i15;
                                            dVar.f156183s = 0;
                                            dVar.f156184t = 0;
                                            dVar.f156187x = 3;
                                            objJ = i(documentId2, null, dVar);
                                            if (objJ != objE) {
                                                pensionerCardData2 = pensionerCardData;
                                                str4 = str3;
                                                bVar9 = bVar8;
                                                bVar10 = bVar3;
                                                right = new dx.i.Right(t6.f(pensionerCardData2, (ns2.c) bVar9.a((dx.i) objJ), str4));
                                                bVar3 = bVar10;
                                            }
                                        }
                                        pensionerCardData3 = (PensionerCardData) bVar3.a(right);
                                    }
                                } else {
                                    if (!zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                    dVar.f156170d = jVarA;
                                    dVar.f156171e = vq.j.a(bVar2);
                                    dVar.f156172f = bVar3;
                                    dVar.f156173g = bVar3;
                                    dVar.f156174h = str;
                                    dVar.f156175j = null;
                                    dVar.f156176k = null;
                                    dVar.f156178m = i19;
                                    dVar.f156179n = i18;
                                    dVar.f156180p = i17;
                                    dVar.f156181q = i16;
                                    dVar.f156182r = i15;
                                    dVar.f156187x = 4;
                                    objC = y0Var.c(c1792a4, dVar);
                                    if (objC == objE) {
                                        bVar4 = bVar3;
                                        bVar5 = bVar2;
                                        str2 = str;
                                        objJ = objC;
                                        i25 = i18;
                                        i26 = i17;
                                        i27 = i16;
                                        bVar6 = bVar4;
                                        right2 = (dx.i) objJ;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (!(right2 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            pensionerCardDocumentData = (PensionerCardDocumentData) ((dx.i.Right) right2).b();
                                            Date expiredData2 = pensionerCardDocumentData.getPensionerCardDataModel().getExpiredData();
                                            dVar.f156170d = jVarA;
                                            dVar.f156171e = vq.j.a(bVar5);
                                            dVar.f156172f = vq.j.a(bVar4);
                                            dVar.f156173g = bVar6;
                                            dVar.f156174h = str2;
                                            dVar.f156175j = vq.j.a(right2);
                                            dVar.f156176k = pensionerCardDocumentData;
                                            dVar.f156177l = bVar4;
                                            dVar.f156178m = i19;
                                            dVar.f156179n = i25;
                                            dVar.f156180p = i26;
                                            dVar.f156181q = i27;
                                            dVar.f156182r = i15;
                                            dVar.f156183s = 0;
                                            dVar.f156184t = 0;
                                            dVar.f156187x = 5;
                                            objJ = i(null, expiredData2, dVar);
                                            if (objJ != objE) {
                                                pensionerCardDocumentData2 = pensionerCardDocumentData;
                                                str5 = str2;
                                                bVar11 = bVar4;
                                                right2 = new dx.i.Right(t6.g(pensionerCardDocumentData2, (ns2.c) bVar11.a((dx.i) objJ), str5));
                                            }
                                        }
                                        pensionerCardData3 = (PensionerCardData) bVar6.a(right2);
                                    }
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                dVar = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(dVar));
                                iVarA = dVar.a(e);
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
                        if (i35 == 2) {
                            int i39 = dVar.f156182r;
                            int i45 = dVar.f156181q;
                            int i46 = dVar.f156180p;
                            i18 = dVar.f156179n;
                            i28 = dVar.f156178m;
                            str3 = (String) dVar.f156174h;
                            ex.b bVar13 = (ex.b) dVar.f156173g;
                            bVar8 = (ex.b) dVar.f156172f;
                            ex.b bVar14 = (ex.b) dVar.f156171e;
                            dx.j<dx.b> jVar2 = (dx.j) dVar.f156170d;
                            try {
                                oq.u.b(objJ);
                                i15 = i39;
                                jVarA = jVar2;
                                i17 = i46;
                                i16 = i45;
                                bVar7 = bVar14;
                                bVar3 = bVar13;
                                right = (dx.i) objJ;
                                if (!(right instanceof dx.i.Left)) {
                                    if (!(right instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    pensionerCardData = (i24.PensionerCardData) ((dx.i.Right) right).b();
                                    String documentId3 = pensionerCardData.getDocument().getDocumentId();
                                    dVar.f156170d = jVarA;
                                    dVar.f156171e = vq.j.a(bVar7);
                                    dVar.f156172f = vq.j.a(bVar8);
                                    dVar.f156173g = bVar3;
                                    dVar.f156174h = str3;
                                    dVar.f156175j = vq.j.a(right);
                                    dVar.f156176k = pensionerCardData;
                                    dVar.f156177l = bVar8;
                                    dVar.f156178m = i28;
                                    dVar.f156179n = i18;
                                    dVar.f156180p = i17;
                                    dVar.f156181q = i16;
                                    dVar.f156182r = i15;
                                    dVar.f156183s = 0;
                                    dVar.f156184t = 0;
                                    dVar.f156187x = 3;
                                    objJ = i(documentId3, null, dVar);
                                    if (objJ != objE) {
                                        pensionerCardData2 = pensionerCardData;
                                        str4 = str3;
                                        bVar9 = bVar8;
                                        bVar10 = bVar3;
                                        right = new dx.i.Right(t6.f(pensionerCardData2, (ns2.c) bVar9.a((dx.i) objJ), str4));
                                        bVar3 = bVar10;
                                    }
                                    return objE;
                                }
                                pensionerCardData3 = (PensionerCardData) bVar3.a(right);
                            } catch (ex.c e26) {
                                e = e26;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                dVar = jVar2;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(dVar));
                                iVarA = dVar.a(e);
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
                        } else if (i35 != 3) {
                            if (i35 == 4) {
                                int i47 = dVar.f156182r;
                                int i48 = dVar.f156181q;
                                int i49 = dVar.f156180p;
                                int i55 = dVar.f156179n;
                                int i56 = dVar.f156178m;
                                str2 = (String) dVar.f156174h;
                                ex.b bVar15 = (ex.b) dVar.f156173g;
                                bVar4 = (ex.b) dVar.f156172f;
                                bVar5 = (ex.b) dVar.f156171e;
                                dx.j<dx.b> jVar3 = (dx.j) dVar.f156170d;
                                try {
                                    oq.u.b(objJ);
                                    i15 = i47;
                                    jVarA = jVar3;
                                    i27 = i48;
                                    bVar6 = bVar15;
                                    i19 = i56;
                                    i25 = i55;
                                    i26 = i49;
                                    right2 = (dx.i) objJ;
                                    if (!(right2 instanceof dx.i.Left)) {
                                        if (!(right2 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        pensionerCardDocumentData = (PensionerCardDocumentData) ((dx.i.Right) right2).b();
                                        Date expiredData3 = pensionerCardDocumentData.getPensionerCardDataModel().getExpiredData();
                                        dVar.f156170d = jVarA;
                                        dVar.f156171e = vq.j.a(bVar5);
                                        dVar.f156172f = vq.j.a(bVar4);
                                        dVar.f156173g = bVar6;
                                        dVar.f156174h = str2;
                                        dVar.f156175j = vq.j.a(right2);
                                        dVar.f156176k = pensionerCardDocumentData;
                                        dVar.f156177l = bVar4;
                                        dVar.f156178m = i19;
                                        dVar.f156179n = i25;
                                        dVar.f156180p = i26;
                                        dVar.f156181q = i27;
                                        dVar.f156182r = i15;
                                        dVar.f156183s = 0;
                                        dVar.f156184t = 0;
                                        dVar.f156187x = 5;
                                        objJ = i(null, expiredData3, dVar);
                                        if (objJ != objE) {
                                            pensionerCardDocumentData2 = pensionerCardDocumentData;
                                            str5 = str2;
                                            bVar11 = bVar4;
                                        }
                                        return objE;
                                    }
                                    pensionerCardData3 = (PensionerCardData) bVar6.a(right2);
                                } catch (ex.c e29) {
                                    e = e29;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e35) {
                                    throw e35;
                                } catch (Exception e36) {
                                    e = e36;
                                    dVar = jVar3;
                                    px.f fVar4 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar4.d(message, e, px.c.a(dVar));
                                    iVarA = dVar.a(e);
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
                                if (i35 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar11 = (ex.b) dVar.f156177l;
                                pensionerCardDocumentData2 = (PensionerCardDocumentData) dVar.f156176k;
                                str5 = (String) dVar.f156174h;
                                bVar6 = (ex.b) dVar.f156173g;
                                oq.u.b(objJ);
                            }
                            right2 = new dx.i.Right(t6.g(pensionerCardDocumentData2, (ns2.c) bVar11.a((dx.i) objJ), str5));
                            pensionerCardData3 = (PensionerCardData) bVar6.a(right2);
                        } else {
                            bVar9 = (ex.b) dVar.f156177l;
                            pensionerCardData2 = (i24.PensionerCardData) dVar.f156176k;
                            str4 = (String) dVar.f156174h;
                            bVar10 = (ex.b) dVar.f156173g;
                            oq.u.b(objJ);
                            right = new dx.i.Right(t6.f(pensionerCardData2, (ns2.c) bVar9.a((dx.i) objJ), str4));
                            bVar3 = bVar10;
                            pensionerCardData3 = (PensionerCardData) bVar3.a(right);
                        }
                        return new dx.i.Right(pensionerCardData3);
                    } catch (CancellationException e37) {
                        throw e37;
                    }
                } catch (Exception e38) {
                    e = e38;
                }
            } catch (ex.c e39) {
                e = e39;
            } catch (CancellationException e45) {
                throw e45;
            }
        }
    }

    private s6() {
    }

    public final ms2.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, q34.y0 getPensionerCardDataUC, w24.f1 containersGetPensionerCardDataUC, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, w24.n deleteDocumentByTypeUC, r34.e getValueFromDocumentConfigUC, q34.d checkServiceTemporaryInterruptionUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, containersGetPensionerCardDataUC, getPensionerCardDataUC, getValueFromDocumentConfigUC, deleteDocumentByTypeUC, deleteDocumentByIdUC, deleteDocumentUseCase, checkServiceTemporaryInterruptionUC, getDocumentDeletionDialogUC, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase);
    }
}
