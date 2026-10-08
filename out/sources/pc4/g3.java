package pc4;

import cb4.DialogData;
import do1.DeputyCardData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import k34.DeputyCardModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpc4/g3;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/f0;", "getDeputyCardDataUC", "Lw24/c0;", "containersGetDeputyCardDataUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/n;", "deleteDocumentByTypeUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lco1/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;Lq34/f0;Lw24/c0;Lw24/k0;Lq34/j0;Lk24/a;Lq34/w;Lw24/n;Lr34/e;Lj34/d;)Lco1/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f154585a = new g3();

    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\fJ&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"pc4/g3$a", "Lco1/a;", "", "documentId", "Ljava/util/Date;", "expirationDate", "Ldx/i;", "Ldx/b;", "Ldo1/f;", "h", "(Ljava/lang/String;Ljava/util/Date;Ltq/e;)Ljava/lang/Object;", "i", "(Ltq/e;)Ljava/lang/Object;", "Ldo1/c;", "d", "e", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements co1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.c0 f154587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.f0 f154588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r34.e f154589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w24.n f154590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k24.a f154591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.w f154592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j34.d f154593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w24.k0 f154594i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.j0 f154595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.x0 f154596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.x0 f154597l;

        /* JADX INFO: renamed from: pc4.g3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3835a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154598d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154599e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154600f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154601g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154602h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154603j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154604k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154605l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154606m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154607n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154608p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154610r;

            C3835a(tq.e<? super C3835a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154608p = obj;
                this.f154610r |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154611d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154612e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154613f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154614g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154615h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154616j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154617k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154618l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154619m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154620n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154621p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154622q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154623r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154624s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f154625t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f154626v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f154628x;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154626v = obj;
                this.f154628x |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f154629d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154630e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154631f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154632g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154633h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154634j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154635k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154636l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f154637m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154639p;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154637m = obj;
                this.f154639p |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154640d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154641e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154642f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154643g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154644h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154645j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154646k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154647l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154648m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154649n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154650p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154651q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154653s;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154651q = obj;
                this.f154653s |= PKIFailureInfo.systemUnavail;
                return a.this.h(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154654d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154656f;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154654d = obj;
                this.f154656f |= PKIFailureInfo.systemUnavail;
                return a.this.i(this);
            }
        }

        a(c54.b bVar, w24.c0 c0Var, q34.f0 f0Var, r34.e eVar, w24.n nVar, k24.a aVar, q34.w wVar, j34.d dVar, w24.k0 k0Var, q34.j0 j0Var, w24.x0 x0Var, q34.x0 x0Var2) {
            this.f154586a = bVar;
            this.f154587b = c0Var;
            this.f154588c = f0Var;
            this.f154589d = eVar;
            this.f154590e = nVar;
            this.f154591f = aVar;
            this.f154592g = wVar;
            this.f154593h = dVar;
            this.f154594i = k0Var;
            this.f154595j = j0Var;
            this.f154596k = x0Var;
            this.f154597l = x0Var2;
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
        public final Object h(String str, Date date, tq.e<? super dx.i<? extends dx.b, ? extends do1.f>> eVar) throws Throwable {
            d dVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            do1.f fVar;
            dx.i right2;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f154653s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f154653s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f154651q;
            Object objE = uq.b.e();
            int i16 = dVar.f154653s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154586a;
                            w24.k0 k0Var = this.f154594i;
                            q34.j0 j0Var = this.f154595j;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == null) {
                                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    dVar.f154640d = vq.j.a(str);
                                    dVar.f154641e = vq.j.a(date);
                                    dVar.f154642f = jVarA;
                                    dVar.f154643g = vq.j.a(aVar);
                                    dVar.f154644h = vq.j.a(aVar);
                                    dVar.f154645j = aVar;
                                    dVar.f154646k = 0;
                                    dVar.f154647l = 0;
                                    dVar.f154648m = 0;
                                    dVar.f154649n = 0;
                                    dVar.f154650p = 0;
                                    dVar.f154653s = 1;
                                    objC = k0Var.c(params, dVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(h3.i((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        fVar = (do1.f) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.DEPUTY_CARD, date);
                                    dVar.f154640d = vq.j.a(str);
                                    dVar.f154641e = vq.j.a(date);
                                    dVar.f154642f = jVarA;
                                    dVar.f154643g = vq.j.a(aVar);
                                    dVar.f154644h = vq.j.a(aVar);
                                    dVar.f154645j = aVar;
                                    dVar.f154646k = 0;
                                    dVar.f154647l = 0;
                                    dVar.f154648m = 0;
                                    dVar.f154649n = 0;
                                    dVar.f154650p = 0;
                                    dVar.f154653s = 2;
                                    objC = j0Var.c(allDocumentStatus, dVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(h3.h((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        fVar = (do1.f) bVar.a(right2);
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
                                px.f fVar2 = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(date));
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
                            bVar2 = (ex.b) dVar.f154645j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(h3.i((f24.h) ((dx.i.Right) right).b()));
                            }
                            fVar = (do1.f) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) dVar.f154645j;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(h3.h((er0.h) ((dx.i.Right) right2).b()));
                            }
                            fVar = (do1.f) bVar.a(right2);
                        }
                        return new dx.i.Right(fVar);
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
        public final java.lang.Object i(tq.e<? super dx.i<? extends dx.b, java.lang.String>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.g3.a.e
                if (r0 == 0) goto L13
                r0 = r6
                pc4.g3$a$e r0 = (pc4.g3.a.e) r0
                int r1 = r0.f154656f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f154656f = r1
                goto L18
            L13:
                pc4.g3$a$e r0 = new pc4.g3$a$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f154654d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f154656f
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
                c54.b r6 = r5.f154586a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7b
                w24.x0 r6 = r5.f154596k
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f154656f = r4
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
                q34.x0 r6 = r5.f154597l
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f154656f = r3
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
            throw new UnsupportedOperationException("Method not decompiled: pc4.g3.a.i(tq.e):java.lang.Object");
        }

        @Override // co1.a
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
        @Override // co1.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3835a c3835a;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            ex.b bVar2;
            if (eVar instanceof C3835a) {
                c3835a = (C3835a) eVar;
                int i15 = c3835a.f154610r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3835a.f154610r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3835a = new C3835a(eVar);
                }
            } else {
                c3835a = new C3835a(eVar);
            }
            Object objC = c3835a.f154608p;
            Object objE = uq.b.e();
            int i16 = c3835a.f154610r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154586a;
                            w24.n nVar = this.f154590e;
                            k24.a aVar = this.f154591f;
                            q34.w wVar = this.f154592g;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        w24.n.Params params = new w24.n.Params(f24.i.DEPUTY_CARD);
                                        c3835a.f154598d = vq.j.a(str);
                                        c3835a.f154599e = jVarA;
                                        c3835a.f154600f = vq.j.a(aVar2);
                                        c3835a.f154601g = vq.j.a(aVar2);
                                        c3835a.f154602h = aVar2;
                                        c3835a.f154603j = 0;
                                        c3835a.f154604k = 0;
                                        c3835a.f154605l = 0;
                                        c3835a.f154606m = 0;
                                        c3835a.f154607n = 0;
                                        c3835a.f154610r = 1;
                                        objC = nVar.c(params, c3835a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar2 = aVar2;
                                            bVar2.a((dx.i) objC);
                                        }
                                    } else {
                                        k24.a.Params params2 = new k24.a.Params(str);
                                        c3835a.f154598d = vq.j.a(str);
                                        c3835a.f154599e = jVarA;
                                        c3835a.f154600f = vq.j.a(aVar2);
                                        c3835a.f154601g = vq.j.a(aVar2);
                                        c3835a.f154602h = aVar2;
                                        c3835a.f154603j = 0;
                                        c3835a.f154604k = 0;
                                        c3835a.f154605l = 0;
                                        c3835a.f154606m = 0;
                                        c3835a.f154607n = 0;
                                        c3835a.f154610r = 2;
                                        objC = aVar.c(params2, c3835a);
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
                                    q34.w.Params params3 = new q34.w.Params(rq0.b.d.DEPUTY_CARD);
                                    c3835a.f154598d = vq.j.a(str);
                                    c3835a.f154599e = jVarA;
                                    c3835a.f154600f = vq.j.a(aVar2);
                                    c3835a.f154601g = vq.j.a(aVar2);
                                    c3835a.f154603j = 0;
                                    c3835a.f154604k = 0;
                                    c3835a.f154605l = 0;
                                    c3835a.f154606m = 0;
                                    c3835a.f154607n = 0;
                                    c3835a.f154610r = 3;
                                    if (wVar.c(params3, c3835a) != objE) {
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
                            bVar2 = (ex.b) c3835a.f154602h;
                            jVar = (dx.j) c3835a.f154599e;
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
                            bVar = (ex.b) c3835a.f154602h;
                            jVar = (dx.j) c3835a.f154599e;
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

        @Override // co1.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f154593h.c(new j34.d.Params(rq0.b.d.DEPUTY_CARD, aVar, null, 4, null), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02cd  */
        /* JADX WARN: Code duplicated, block: B:105:0x02ef A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_ENTER, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:107:0x02f5 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:115:0x0312  */
        /* JADX WARN: Code duplicated, block: B:118:0x0323  */
        /* JADX WARN: Code duplicated, block: B:119:0x0331  */
        /* JADX WARN: Code duplicated, block: B:121:0x0335  */
        /* JADX WARN: Code duplicated, block: B:124:0x0341  */
        /* JADX WARN: Code duplicated, block: B:63:0x019a A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:70:0x01d1 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:72:0x01d5 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_LEAVE, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:75:0x021d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:85:0x0249 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_ENTER, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:87:0x024f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:88:0x0251 A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0279  */
        /* JADX WARN: Code duplicated, block: B:91:0x027a  */
        /* JADX WARN: Code duplicated, block: B:94:0x0288  */
        /* JADX WARN: Code duplicated, block: B:95:0x028a A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Code duplicated, block: B:97:0x028e A[Catch: Exception -> 0x023d, c -> 0x0241, CancellationException -> 0x0245, TRY_LEAVE, TryCatch #9 {c -> 0x0241, CancellationException -> 0x0245, Exception -> 0x023d, blocks: (B:92:0x0282, B:95:0x028a, B:97:0x028e, B:105:0x02ef, B:106:0x02f4, B:67:0x01c9, B:70:0x01d1, B:72:0x01d5, B:85:0x0249, B:86:0x024e, B:61:0x0183, B:63:0x019a, B:88:0x0251, B:107:0x02f5, B:108:0x02fa, B:57:0x014f), top: B:133:0x014f }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0, types: [pc4.g3$a] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2, types: [pc4.g3$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // co1.a
        public Object d(tq.e<? super dx.i<? extends dx.b, DeputyCardData>> eVar) throws Throwable {
            ?? bVar;
            String message;
            dx.i iVarA;
            Object objB;
            c54.b bVar2;
            w24.c0 c0Var;
            q34.f0 f0Var;
            dx.j<dx.b> jVarA;
            ex.b aVar;
            ex.b bVar3;
            ex.b bVar4;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            String str;
            boolean zBooleanValue;
            Object objC;
            ex.b bVar5;
            ex.b bVar6;
            String str2;
            int i25;
            int i26;
            int i27;
            ex.b bVar7;
            Object objC2;
            ex.b bVar8;
            ex.b bVar9;
            String str3;
            int i28;
            dx.i right;
            i24.DeputyCardData deputyCardData;
            i24.DeputyCardData deputyCardData2;
            String str4;
            ex.b bVar10;
            ex.b bVar11;
            DeputyCardData deputyCardData3;
            dx.i right2;
            DeputyCardModel deputyCardModel;
            DeputyCardModel deputyCardModel2;
            String str5;
            ex.b bVar12;
            if (eVar instanceof b) {
                b bVar13 = (b) eVar;
                int i29 = bVar13.f154628x;
                if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar13.f154628x = i29 - PKIFailureInfo.systemUnavail;
                    bVar = bVar13;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objI = bVar.f154626v;
            Object objE = uq.b.e();
            int i35 = bVar.f154628x;
            try {
                try {
                    try {
                        if (i35 == 0) {
                            oq.u.b(objI);
                            bVar2 = this.f154586a;
                            c0Var = this.f154587b;
                            f0Var = this.f154588c;
                            jVarA = xw.c.f221622a.a();
                            try {
                                aVar = new ex.a();
                                bVar.f154611d = bVar2;
                                bVar.f154612e = c0Var;
                                bVar.f154613f = f0Var;
                                bVar.f154614g = jVarA;
                                bVar.f154615h = vq.j.a(aVar);
                                bVar.f154616j = aVar;
                                bVar.f154617k = aVar;
                                bVar.f154619m = 0;
                                bVar.f154620n = 0;
                                bVar.f154621p = 0;
                                bVar.f154622q = 0;
                                bVar.f154623r = 0;
                                bVar.f154628x = 1;
                                objI = i(bVar);
                                if (objI != objE) {
                                    bVar3 = aVar;
                                    bVar4 = bVar3;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    str = (String) aVar.a((dx.i) objI);
                                    zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                    if (zBooleanValue) {
                                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                        bVar.f154611d = jVarA;
                                        bVar.f154612e = vq.j.a(bVar3);
                                        bVar.f154613f = bVar4;
                                        bVar.f154614g = bVar4;
                                        bVar.f154615h = str;
                                        bVar.f154616j = null;
                                        bVar.f154617k = null;
                                        bVar.f154619m = i19;
                                        bVar.f154620n = i18;
                                        bVar.f154621p = i17;
                                        bVar.f154622q = i16;
                                        bVar.f154623r = i15;
                                        bVar.f154628x = 2;
                                        objC2 = c0Var.c(c1792a, bVar);
                                        if (objC2 == objE) {
                                            bVar8 = bVar3;
                                            bVar9 = bVar4;
                                            str3 = str;
                                            objI = objC2;
                                            i28 = i19;
                                            right = (dx.i) objI;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (!(right instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                deputyCardData = (i24.DeputyCardData) ((dx.i.Right) right).b();
                                                String documentId = deputyCardData.getDocument().getDocumentId();
                                                bVar.f154611d = jVarA;
                                                bVar.f154612e = vq.j.a(bVar8);
                                                bVar.f154613f = vq.j.a(bVar9);
                                                bVar.f154614g = bVar4;
                                                bVar.f154615h = str3;
                                                bVar.f154616j = vq.j.a(right);
                                                bVar.f154617k = deputyCardData;
                                                bVar.f154618l = bVar9;
                                                bVar.f154619m = i28;
                                                bVar.f154620n = i18;
                                                bVar.f154621p = i17;
                                                bVar.f154622q = i16;
                                                bVar.f154623r = i15;
                                                bVar.f154624s = 0;
                                                bVar.f154625t = 0;
                                                bVar.f154628x = 3;
                                                objI = h(documentId, null, bVar);
                                                if (objI != objE) {
                                                    deputyCardData2 = deputyCardData;
                                                    str4 = str3;
                                                    bVar10 = bVar9;
                                                    bVar11 = bVar4;
                                                    right = new dx.i.Right(h3.e(deputyCardData2, (do1.f) bVar10.a((dx.i) objI), str4));
                                                    bVar4 = bVar11;
                                                }
                                            }
                                            deputyCardData3 = (DeputyCardData) bVar4.a(right);
                                        }
                                    } else {
                                        if (!zBooleanValue) {
                                            throw new oq.p();
                                        }
                                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                        bVar.f154611d = jVarA;
                                        bVar.f154612e = vq.j.a(bVar3);
                                        bVar.f154613f = bVar4;
                                        bVar.f154614g = bVar4;
                                        bVar.f154615h = str;
                                        bVar.f154616j = null;
                                        bVar.f154617k = null;
                                        bVar.f154619m = i19;
                                        bVar.f154620n = i18;
                                        bVar.f154621p = i17;
                                        bVar.f154622q = i16;
                                        bVar.f154623r = i15;
                                        bVar.f154628x = 4;
                                        objC = f0Var.c(c1792a2, bVar);
                                        if (objC == objE) {
                                            bVar5 = bVar4;
                                            bVar6 = bVar3;
                                            str2 = str;
                                            objI = objC;
                                            i25 = i18;
                                            i26 = i17;
                                            i27 = i16;
                                            bVar7 = bVar5;
                                            right2 = (dx.i) objI;
                                            if (!(right2 instanceof dx.i.Left)) {
                                                if (!(right2 instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                deputyCardModel = (DeputyCardModel) ((dx.i.Right) right2).b();
                                                bVar.f154611d = jVarA;
                                                bVar.f154612e = vq.j.a(bVar6);
                                                bVar.f154613f = vq.j.a(bVar5);
                                                bVar.f154614g = bVar7;
                                                bVar.f154615h = str2;
                                                bVar.f154616j = vq.j.a(right2);
                                                bVar.f154617k = deputyCardModel;
                                                bVar.f154618l = bVar5;
                                                bVar.f154619m = i19;
                                                bVar.f154620n = i25;
                                                bVar.f154621p = i26;
                                                bVar.f154622q = i27;
                                                bVar.f154623r = i15;
                                                bVar.f154624s = 0;
                                                bVar.f154625t = 0;
                                                bVar.f154628x = 5;
                                                objI = h(null, null, bVar);
                                                if (objI != objE) {
                                                    deputyCardModel2 = deputyCardModel;
                                                    str5 = str2;
                                                    bVar12 = bVar5;
                                                    right2 = new dx.i.Right(h3.f(deputyCardModel2, (do1.f) bVar12.a((dx.i) objI), str5));
                                                }
                                            }
                                            deputyCardData3 = (DeputyCardData) bVar7.a(right2);
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
                                bVar = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(bVar));
                                iVarA = bVar.a(e);
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
                            int i36 = bVar.f154623r;
                            int i37 = bVar.f154622q;
                            i17 = bVar.f154621p;
                            int i38 = bVar.f154620n;
                            i19 = bVar.f154619m;
                            aVar = (ex.b) bVar.f154617k;
                            bVar4 = (ex.b) bVar.f154616j;
                            ex.b bVar14 = (ex.b) bVar.f154615h;
                            dx.j<dx.b> jVar = (dx.j) bVar.f154614g;
                            f0Var = (q34.f0) bVar.f154613f;
                            c0Var = (w24.c0) bVar.f154612e;
                            bVar2 = (c54.b) bVar.f154611d;
                            try {
                                oq.u.b(objI);
                                i15 = i36;
                                jVarA = jVar;
                                i18 = i38;
                                bVar3 = bVar14;
                                i16 = i37;
                                str = (String) aVar.a((dx.i) objI);
                                zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                    bVar.f154611d = jVarA;
                                    bVar.f154612e = vq.j.a(bVar3);
                                    bVar.f154613f = bVar4;
                                    bVar.f154614g = bVar4;
                                    bVar.f154615h = str;
                                    bVar.f154616j = null;
                                    bVar.f154617k = null;
                                    bVar.f154619m = i19;
                                    bVar.f154620n = i18;
                                    bVar.f154621p = i17;
                                    bVar.f154622q = i16;
                                    bVar.f154623r = i15;
                                    bVar.f154628x = 2;
                                    objC2 = c0Var.c(c1792a3, bVar);
                                    if (objC2 == objE) {
                                        bVar8 = bVar3;
                                        bVar9 = bVar4;
                                        str3 = str;
                                        objI = objC2;
                                        i28 = i19;
                                        right = (dx.i) objI;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            deputyCardData = (i24.DeputyCardData) ((dx.i.Right) right).b();
                                            String documentId2 = deputyCardData.getDocument().getDocumentId();
                                            bVar.f154611d = jVarA;
                                            bVar.f154612e = vq.j.a(bVar8);
                                            bVar.f154613f = vq.j.a(bVar9);
                                            bVar.f154614g = bVar4;
                                            bVar.f154615h = str3;
                                            bVar.f154616j = vq.j.a(right);
                                            bVar.f154617k = deputyCardData;
                                            bVar.f154618l = bVar9;
                                            bVar.f154619m = i28;
                                            bVar.f154620n = i18;
                                            bVar.f154621p = i17;
                                            bVar.f154622q = i16;
                                            bVar.f154623r = i15;
                                            bVar.f154624s = 0;
                                            bVar.f154625t = 0;
                                            bVar.f154628x = 3;
                                            objI = h(documentId2, null, bVar);
                                            if (objI != objE) {
                                                deputyCardData2 = deputyCardData;
                                                str4 = str3;
                                                bVar10 = bVar9;
                                                bVar11 = bVar4;
                                                right = new dx.i.Right(h3.e(deputyCardData2, (do1.f) bVar10.a((dx.i) objI), str4));
                                                bVar4 = bVar11;
                                            }
                                        }
                                        deputyCardData3 = (DeputyCardData) bVar4.a(right);
                                    }
                                } else {
                                    if (!zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                    bVar.f154611d = jVarA;
                                    bVar.f154612e = vq.j.a(bVar3);
                                    bVar.f154613f = bVar4;
                                    bVar.f154614g = bVar4;
                                    bVar.f154615h = str;
                                    bVar.f154616j = null;
                                    bVar.f154617k = null;
                                    bVar.f154619m = i19;
                                    bVar.f154620n = i18;
                                    bVar.f154621p = i17;
                                    bVar.f154622q = i16;
                                    bVar.f154623r = i15;
                                    bVar.f154628x = 4;
                                    objC = f0Var.c(c1792a4, bVar);
                                    if (objC == objE) {
                                        bVar5 = bVar4;
                                        bVar6 = bVar3;
                                        str2 = str;
                                        objI = objC;
                                        i25 = i18;
                                        i26 = i17;
                                        i27 = i16;
                                        bVar7 = bVar5;
                                        right2 = (dx.i) objI;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (!(right2 instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            deputyCardModel = (DeputyCardModel) ((dx.i.Right) right2).b();
                                            bVar.f154611d = jVarA;
                                            bVar.f154612e = vq.j.a(bVar6);
                                            bVar.f154613f = vq.j.a(bVar5);
                                            bVar.f154614g = bVar7;
                                            bVar.f154615h = str2;
                                            bVar.f154616j = vq.j.a(right2);
                                            bVar.f154617k = deputyCardModel;
                                            bVar.f154618l = bVar5;
                                            bVar.f154619m = i19;
                                            bVar.f154620n = i25;
                                            bVar.f154621p = i26;
                                            bVar.f154622q = i27;
                                            bVar.f154623r = i15;
                                            bVar.f154624s = 0;
                                            bVar.f154625t = 0;
                                            bVar.f154628x = 5;
                                            objI = h(null, null, bVar);
                                            if (objI != objE) {
                                                deputyCardModel2 = deputyCardModel;
                                                str5 = str2;
                                                bVar12 = bVar5;
                                                right2 = new dx.i.Right(h3.f(deputyCardModel2, (do1.f) bVar12.a((dx.i) objI), str5));
                                            }
                                        }
                                        deputyCardData3 = (DeputyCardData) bVar7.a(right2);
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
                                bVar = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(bVar));
                                iVarA = bVar.a(e);
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
                            int i39 = bVar.f154623r;
                            int i45 = bVar.f154622q;
                            int i46 = bVar.f154621p;
                            i18 = bVar.f154620n;
                            i28 = bVar.f154619m;
                            str3 = (String) bVar.f154615h;
                            ex.b bVar15 = (ex.b) bVar.f154614g;
                            bVar9 = (ex.b) bVar.f154613f;
                            ex.b bVar16 = (ex.b) bVar.f154612e;
                            dx.j<dx.b> jVar2 = (dx.j) bVar.f154611d;
                            try {
                                oq.u.b(objI);
                                i15 = i39;
                                jVarA = jVar2;
                                i17 = i46;
                                i16 = i45;
                                bVar8 = bVar16;
                                bVar4 = bVar15;
                                right = (dx.i) objI;
                                if (!(right instanceof dx.i.Left)) {
                                    if (!(right instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    deputyCardData = (i24.DeputyCardData) ((dx.i.Right) right).b();
                                    String documentId3 = deputyCardData.getDocument().getDocumentId();
                                    bVar.f154611d = jVarA;
                                    bVar.f154612e = vq.j.a(bVar8);
                                    bVar.f154613f = vq.j.a(bVar9);
                                    bVar.f154614g = bVar4;
                                    bVar.f154615h = str3;
                                    bVar.f154616j = vq.j.a(right);
                                    bVar.f154617k = deputyCardData;
                                    bVar.f154618l = bVar9;
                                    bVar.f154619m = i28;
                                    bVar.f154620n = i18;
                                    bVar.f154621p = i17;
                                    bVar.f154622q = i16;
                                    bVar.f154623r = i15;
                                    bVar.f154624s = 0;
                                    bVar.f154625t = 0;
                                    bVar.f154628x = 3;
                                    objI = h(documentId3, null, bVar);
                                    if (objI != objE) {
                                        deputyCardData2 = deputyCardData;
                                        str4 = str3;
                                        bVar10 = bVar9;
                                        bVar11 = bVar4;
                                        right = new dx.i.Right(h3.e(deputyCardData2, (do1.f) bVar10.a((dx.i) objI), str4));
                                        bVar4 = bVar11;
                                    }
                                    return objE;
                                }
                                deputyCardData3 = (DeputyCardData) bVar4.a(right);
                            } catch (ex.c e26) {
                                e = e26;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                bVar = jVar2;
                                px.f fVar3 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar3.d(message, e, px.c.a(bVar));
                                iVarA = bVar.a(e);
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
                                int i47 = bVar.f154623r;
                                int i48 = bVar.f154622q;
                                int i49 = bVar.f154621p;
                                int i55 = bVar.f154620n;
                                int i56 = bVar.f154619m;
                                str2 = (String) bVar.f154615h;
                                ex.b bVar17 = (ex.b) bVar.f154614g;
                                bVar5 = (ex.b) bVar.f154613f;
                                bVar6 = (ex.b) bVar.f154612e;
                                dx.j<dx.b> jVar3 = (dx.j) bVar.f154611d;
                                try {
                                    oq.u.b(objI);
                                    i15 = i47;
                                    jVarA = jVar3;
                                    i27 = i48;
                                    bVar7 = bVar17;
                                    i19 = i56;
                                    i25 = i55;
                                    i26 = i49;
                                    right2 = (dx.i) objI;
                                    if (!(right2 instanceof dx.i.Left)) {
                                        if (!(right2 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        deputyCardModel = (DeputyCardModel) ((dx.i.Right) right2).b();
                                        bVar.f154611d = jVarA;
                                        bVar.f154612e = vq.j.a(bVar6);
                                        bVar.f154613f = vq.j.a(bVar5);
                                        bVar.f154614g = bVar7;
                                        bVar.f154615h = str2;
                                        bVar.f154616j = vq.j.a(right2);
                                        bVar.f154617k = deputyCardModel;
                                        bVar.f154618l = bVar5;
                                        bVar.f154619m = i19;
                                        bVar.f154620n = i25;
                                        bVar.f154621p = i26;
                                        bVar.f154622q = i27;
                                        bVar.f154623r = i15;
                                        bVar.f154624s = 0;
                                        bVar.f154625t = 0;
                                        bVar.f154628x = 5;
                                        objI = h(null, null, bVar);
                                        if (objI != objE) {
                                            deputyCardModel2 = deputyCardModel;
                                            str5 = str2;
                                            bVar12 = bVar5;
                                        }
                                        return objE;
                                    }
                                    deputyCardData3 = (DeputyCardData) bVar7.a(right2);
                                } catch (ex.c e29) {
                                    e = e29;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e35) {
                                    throw e35;
                                } catch (Exception e36) {
                                    e = e36;
                                    bVar = jVar3;
                                    px.f fVar4 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar4.d(message, e, px.c.a(bVar));
                                    iVarA = bVar.a(e);
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
                                bVar12 = (ex.b) bVar.f154618l;
                                deputyCardModel2 = (DeputyCardModel) bVar.f154617k;
                                str5 = (String) bVar.f154615h;
                                bVar7 = (ex.b) bVar.f154614g;
                                oq.u.b(objI);
                            }
                            right2 = new dx.i.Right(h3.f(deputyCardModel2, (do1.f) bVar12.a((dx.i) objI), str5));
                            deputyCardData3 = (DeputyCardData) bVar7.a(right2);
                        } else {
                            bVar10 = (ex.b) bVar.f154618l;
                            deputyCardData2 = (i24.DeputyCardData) bVar.f154617k;
                            str4 = (String) bVar.f154615h;
                            bVar11 = (ex.b) bVar.f154614g;
                            oq.u.b(objI);
                            right = new dx.i.Right(h3.e(deputyCardData2, (do1.f) bVar10.a((dx.i) objI), str4));
                            bVar4 = bVar11;
                            deputyCardData3 = (DeputyCardData) bVar4.a(right);
                        }
                        return new dx.i.Right(deputyCardData3);
                    } catch (Exception e37) {
                        e = e37;
                    }
                } catch (CancellationException e38) {
                    throw e38;
                }
            } catch (ex.c e39) {
                e = e39;
            } catch (CancellationException e45) {
                throw e45;
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.g3$a$c, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // co1.a
        public Object e(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? cVar;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof c) {
                c cVar2 = (c) eVar;
                int i15 = cVar2.f154639p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar2.f154639p = i15 - PKIFailureInfo.systemUnavail;
                    cVar = cVar2;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f154637m;
            Object objE = uq.b.e();
            int i16 = cVar.f154639p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) cVar.f154636l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for deputy card is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar2 = this.f154589d;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.DEPUTY_CARD);
                        cVar.f154634j = jVarA;
                        cVar.f154635k = vq.j.a(aVar);
                        cVar.f154636l = aVar;
                        cVar.f154629d = 0;
                        cVar.f154630e = 0;
                        cVar.f154631f = 0;
                        cVar.f154632g = 0;
                        cVar.f154633h = 0;
                        cVar.f154639p = 1;
                        objC = eVar2.c(params, cVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for deputy card is null")));
                        throw new oq.g();
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
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
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }
    }

    private g3() {
    }

    public final co1.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, q34.f0 getDeputyCardDataUC, w24.c0 containersGetDeputyCardDataUC, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, w24.n deleteDocumentByTypeUC, r34.e getValueFromDocumentConfigUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, containersGetDeputyCardDataUC, getDeputyCardDataUC, getValueFromDocumentConfigUC, deleteDocumentByTypeUC, deleteDocumentByIdUC, deleteDocumentUseCase, getDocumentDeletionDialogUC, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase);
    }
}
