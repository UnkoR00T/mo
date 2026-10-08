package pc4;

import cb4.DialogData;
import i34.DocumentMaintenanceBreakError;
import java.util.Date;
import java.util.concurrent.CancellationException;
import k34.AdvocateDataModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vx0.AdvocateCardData;
import vx0.UserDocumentData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpc4/e;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lq34/a0;", "getAdvocateCardDataUC", "Lw24/t;", "containersGetAdvocateCardDataUC", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lw24/n;", "deleteDocumentByTypeUC", "Lr34/e;", "getValueFromDocumentConfigUC", "Lj34/d;", "getDocumentDeletionDialogUC", "Lux0/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;Lq34/a0;Lw24/t;Lw24/k0;Lq34/j0;Lk24/a;Lq34/w;Lw24/n;Lr34/e;Lj34/d;)Lux0/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f154494a = new e();

    @Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\rJ&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"pc4/e$a", "Lux0/a;", "", "documentId", "Ljava/util/Date;", "expirationDate", "Ldx/i;", "Ldx/b;", "Lvx0/f;", "h", "(Ljava/lang/String;Ljava/util/Date;Ltq/e;)Ljava/lang/Object;", "Lvx0/g;", "i", "(Ltq/e;)Ljava/lang/Object;", "Lvx0/b;", "e", "d", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements ux0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.t f154496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.a0 f154497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r34.e f154498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w24.n f154499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k24.a f154500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.w f154501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j34.d f154502h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w24.k0 f154503i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.j0 f154504j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.x0 f154505k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.x0 f154506l;

        /* JADX INFO: renamed from: pc4.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3832a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154507d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154508e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154509f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154510g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154511h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f154512j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154513k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154514l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154515m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154516n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f154517p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154519r;

            C3832a(tq.e<? super C3832a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154517p = obj;
                this.f154519r |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154520d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154521e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154522f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154523g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154524h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154525j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154526k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154527l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154528m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154529n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154530p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f154531q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f154532r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154533s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f154534t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f154535v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f154537x;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154535v = obj;
                this.f154537x |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f154538d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f154539e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154540f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154541g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f154542h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154543j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f154544k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f154545l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f154546m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154548p;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154546m = obj;
                this.f154548p |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154549d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f154550e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f154551f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f154552g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f154553h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f154554j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f154555k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f154556l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f154557m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f154558n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f154559p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f154560q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f154562s;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154560q = obj;
                this.f154562s |= PKIFailureInfo.systemUnavail;
                return a.this.h(null, null, this);
            }
        }

        /* JADX INFO: renamed from: pc4.e$a$e, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3833e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154563d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154565f;

            C3833e(tq.e<? super C3833e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154563d = obj;
                this.f154565f |= PKIFailureInfo.systemUnavail;
                return a.this.i(this);
            }
        }

        a(c54.b bVar, w24.t tVar, q34.a0 a0Var, r34.e eVar, w24.n nVar, k24.a aVar, q34.w wVar, j34.d dVar, w24.k0 k0Var, q34.j0 j0Var, w24.x0 x0Var, q34.x0 x0Var2) {
            this.f154495a = bVar;
            this.f154496b = tVar;
            this.f154497c = a0Var;
            this.f154498d = eVar;
            this.f154499e = nVar;
            this.f154500f = aVar;
            this.f154501g = wVar;
            this.f154502h = dVar;
            this.f154503i = k0Var;
            this.f154504j = j0Var;
            this.f154505k = x0Var;
            this.f154506l = x0Var2;
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
        public final Object h(String str, Date date, tq.e<? super dx.i<? extends dx.b, ? extends vx0.f>> eVar) throws Throwable {
            d dVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            vx0.f fVar;
            dx.i right2;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f154562s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f154562s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f154560q;
            Object objE = uq.b.e();
            int i16 = dVar.f154562s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154495a;
                            w24.k0 k0Var = this.f154503i;
                            q34.j0 j0Var = this.f154504j;
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
                                    dVar.f154549d = vq.j.a(str);
                                    dVar.f154550e = vq.j.a(date);
                                    dVar.f154551f = jVarA;
                                    dVar.f154552g = vq.j.a(aVar);
                                    dVar.f154553h = vq.j.a(aVar);
                                    dVar.f154554j = aVar;
                                    dVar.f154555k = 0;
                                    dVar.f154556l = 0;
                                    dVar.f154557m = 0;
                                    dVar.f154558n = 0;
                                    dVar.f154559p = 0;
                                    dVar.f154562s = 1;
                                    objC = k0Var.c(params, dVar);
                                    if (objC != objE) {
                                        bVar2 = aVar;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(f.i((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        fVar = (vx0.f) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(rq0.b.d.ADVOCATE_CARD, date);
                                    dVar.f154549d = vq.j.a(str);
                                    dVar.f154550e = vq.j.a(date);
                                    dVar.f154551f = jVarA;
                                    dVar.f154552g = vq.j.a(aVar);
                                    dVar.f154553h = vq.j.a(aVar);
                                    dVar.f154554j = aVar;
                                    dVar.f154555k = 0;
                                    dVar.f154556l = 0;
                                    dVar.f154557m = 0;
                                    dVar.f154558n = 0;
                                    dVar.f154559p = 0;
                                    dVar.f154562s = 2;
                                    objC = j0Var.c(allDocumentStatus, dVar);
                                    if (objC != objE) {
                                        bVar = aVar;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(f.h((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        fVar = (vx0.f) bVar.a(right2);
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
                            bVar2 = (ex.b) dVar.f154554j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(f.i((f24.h) ((dx.i.Right) right).b()));
                            }
                            fVar = (vx0.f) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) dVar.f154554j;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(f.h((er0.h) ((dx.i.Right) right2).b()));
                            }
                            fVar = (vx0.f) bVar.a(right2);
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
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
        
            if (r6 == r1) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object i(tq.e<? super dx.i<? extends dx.b, vx0.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.e.a.i(tq.e):java.lang.Object");
        }

        @Override // ux0.a
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
        @Override // ux0.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3832a c3832a;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar;
            ex.b bVar2;
            if (eVar instanceof C3832a) {
                c3832a = (C3832a) eVar;
                int i15 = c3832a.f154519r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3832a.f154519r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3832a = new C3832a(eVar);
                }
            } else {
                c3832a = new C3832a(eVar);
            }
            Object objC = c3832a.f154517p;
            Object objE = uq.b.e();
            int i16 = c3832a.f154519r;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar3 = this.f154495a;
                            w24.n nVar = this.f154499e;
                            k24.a aVar = this.f154500f;
                            q34.w wVar = this.f154501g;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        w24.n.Params params = new w24.n.Params(f24.i.ADVOCATE_CARD);
                                        c3832a.f154507d = vq.j.a(str);
                                        c3832a.f154508e = jVarA;
                                        c3832a.f154509f = vq.j.a(aVar2);
                                        c3832a.f154510g = vq.j.a(aVar2);
                                        c3832a.f154511h = aVar2;
                                        c3832a.f154512j = 0;
                                        c3832a.f154513k = 0;
                                        c3832a.f154514l = 0;
                                        c3832a.f154515m = 0;
                                        c3832a.f154516n = 0;
                                        c3832a.f154519r = 1;
                                        objC = nVar.c(params, c3832a);
                                        if (objC != objE) {
                                            jVar = jVarA;
                                            bVar2 = aVar2;
                                            bVar2.a((dx.i) objC);
                                        }
                                    } else {
                                        k24.a.Params params2 = new k24.a.Params(str);
                                        c3832a.f154507d = vq.j.a(str);
                                        c3832a.f154508e = jVarA;
                                        c3832a.f154509f = vq.j.a(aVar2);
                                        c3832a.f154510g = vq.j.a(aVar2);
                                        c3832a.f154511h = aVar2;
                                        c3832a.f154512j = 0;
                                        c3832a.f154513k = 0;
                                        c3832a.f154514l = 0;
                                        c3832a.f154515m = 0;
                                        c3832a.f154516n = 0;
                                        c3832a.f154519r = 2;
                                        objC = aVar.c(params2, c3832a);
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
                                    q34.w.Params params3 = new q34.w.Params(rq0.b.d.ADVOCATE_CARD);
                                    c3832a.f154507d = vq.j.a(str);
                                    c3832a.f154508e = jVarA;
                                    c3832a.f154509f = vq.j.a(aVar2);
                                    c3832a.f154510g = vq.j.a(aVar2);
                                    c3832a.f154512j = 0;
                                    c3832a.f154513k = 0;
                                    c3832a.f154514l = 0;
                                    c3832a.f154515m = 0;
                                    c3832a.f154516n = 0;
                                    c3832a.f154519r = 3;
                                    if (wVar.c(params3, c3832a) != objE) {
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
                            bVar2 = (ex.b) c3832a.f154511h;
                            jVar = (dx.j) c3832a.f154508e;
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
                            bVar = (ex.b) c3832a.f154511h;
                            jVar = (dx.j) c3832a.f154508e;
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

        @Override // ux0.a
        public Object c(er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f154502h.c(new j34.d.Params(rq0.b.d.ADVOCATE_CARD, aVar, null, 4, null), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #3 {Exception -> 0x0035, blocks: (B:12:0x0031, B:27:0x007f, B:29:0x0083, B:30:0x0089, B:31:0x009d, B:38:0x00a7, B:41:0x00b5), top: B:56:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.e$a$c, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // ux0.a
        public Object d(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            ?? cVar;
            Object objB;
            ex.b bVar;
            String str;
            if (eVar instanceof c) {
                c cVar2 = (c) eVar;
                int i15 = cVar2.f154548p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar2.f154548p = i15 - PKIFailureInfo.systemUnavail;
                    cVar = cVar2;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f154546m;
            Object objE = uq.b.e();
            int i16 = cVar.f154548p;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) cVar.f154545l;
                        try {
                            oq.u.b(objC);
                            str = (String) objC;
                            if (str != null) {
                                return new dx.i.Right(str);
                            }
                            bVar.b(new dx.b.Generic(new IllegalStateException("Short name for advocate card is null")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    r34.e eVar2 = this.f154498d;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r34.e.Params params = new r34.e.Params(r34.e.a.ShortName, rq0.b.d.ADVOCATE_CARD);
                        cVar.f154543j = jVarA;
                        cVar.f154544k = vq.j.a(aVar);
                        cVar.f154545l = aVar;
                        cVar.f154538d = 0;
                        cVar.f154539e = 0;
                        cVar.f154540f = 0;
                        cVar.f154541g = 0;
                        cVar.f154542h = 0;
                        cVar.f154548p = 1;
                        objC = eVar2.c(params, cVar);
                        if (objC == objE) {
                            return objE;
                        }
                        bVar = aVar;
                        str = (String) objC;
                        if (str != null) {
                            return new dx.i.Right(str);
                        }
                        bVar.b(new dx.b.Generic(new IllegalStateException("Short name for advocate card is null")));
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
        /* JADX WARN: Type inference failed for: r17v0, types: [pc4.e$a] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2, types: [pc4.e$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // ux0.a
        public Object e(tq.e<? super dx.i<? extends dx.b, AdvocateCardData>> eVar) throws Throwable {
            ?? bVar;
            String message;
            dx.i iVarA;
            Object objB;
            c54.b bVar2;
            w24.t tVar;
            q34.a0 a0Var;
            dx.j<dx.b> jVarA;
            ex.b aVar;
            ex.b bVar3;
            ex.b bVar4;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            UserDocumentData userDocumentData;
            boolean zBooleanValue;
            Object objC;
            ex.b bVar5;
            ex.b bVar6;
            UserDocumentData userDocumentData2;
            int i25;
            int i26;
            int i27;
            ex.b bVar7;
            Object objC2;
            ex.b bVar8;
            ex.b bVar9;
            UserDocumentData userDocumentData3;
            int i28;
            dx.i right;
            i24.AdvocateCardData advocateCardData;
            i24.AdvocateCardData advocateCardData2;
            UserDocumentData userDocumentData4;
            ex.b bVar10;
            ex.b bVar11;
            AdvocateCardData advocateCardData3;
            dx.i right2;
            AdvocateDataModel advocateDataModel;
            AdvocateDataModel advocateDataModel2;
            UserDocumentData userDocumentData5;
            ex.b bVar12;
            if (eVar instanceof b) {
                b bVar13 = (b) eVar;
                int i29 = bVar13.f154537x;
                if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar13.f154537x = i29 - PKIFailureInfo.systemUnavail;
                    bVar = bVar13;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objI = bVar.f154535v;
            Object objE = uq.b.e();
            int i35 = bVar.f154537x;
            try {
                try {
                    try {
                        if (i35 == 0) {
                            oq.u.b(objI);
                            bVar2 = this.f154495a;
                            tVar = this.f154496b;
                            a0Var = this.f154497c;
                            jVarA = xw.c.f221622a.a();
                            try {
                                aVar = new ex.a();
                                bVar.f154520d = bVar2;
                                bVar.f154521e = tVar;
                                bVar.f154522f = a0Var;
                                bVar.f154523g = jVarA;
                                bVar.f154524h = vq.j.a(aVar);
                                bVar.f154525j = aVar;
                                bVar.f154526k = aVar;
                                bVar.f154528m = 0;
                                bVar.f154529n = 0;
                                bVar.f154530p = 0;
                                bVar.f154531q = 0;
                                bVar.f154532r = 0;
                                bVar.f154537x = 1;
                                objI = i(bVar);
                                if (objI != objE) {
                                    bVar3 = aVar;
                                    bVar4 = bVar3;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    userDocumentData = (UserDocumentData) aVar.a((dx.i) objI);
                                    zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                    if (zBooleanValue) {
                                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                        bVar.f154520d = jVarA;
                                        bVar.f154521e = vq.j.a(bVar3);
                                        bVar.f154522f = bVar4;
                                        bVar.f154523g = bVar4;
                                        bVar.f154524h = userDocumentData;
                                        bVar.f154525j = null;
                                        bVar.f154526k = null;
                                        bVar.f154528m = i19;
                                        bVar.f154529n = i18;
                                        bVar.f154530p = i17;
                                        bVar.f154531q = i16;
                                        bVar.f154532r = i15;
                                        bVar.f154537x = 2;
                                        objC2 = tVar.c(c1792a, bVar);
                                        if (objC2 == objE) {
                                            bVar8 = bVar3;
                                            bVar9 = bVar4;
                                            userDocumentData3 = userDocumentData;
                                            objI = objC2;
                                            i28 = i19;
                                            right = (dx.i) objI;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (!(right instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                advocateCardData = (i24.AdvocateCardData) ((dx.i.Right) right).b();
                                                String documentId = advocateCardData.getDocument().getDocumentId();
                                                bVar.f154520d = jVarA;
                                                bVar.f154521e = vq.j.a(bVar8);
                                                bVar.f154522f = vq.j.a(bVar9);
                                                bVar.f154523g = bVar4;
                                                bVar.f154524h = userDocumentData3;
                                                bVar.f154525j = vq.j.a(right);
                                                bVar.f154526k = advocateCardData;
                                                bVar.f154527l = bVar9;
                                                bVar.f154528m = i28;
                                                bVar.f154529n = i18;
                                                bVar.f154530p = i17;
                                                bVar.f154531q = i16;
                                                bVar.f154532r = i15;
                                                bVar.f154533s = 0;
                                                bVar.f154534t = 0;
                                                bVar.f154537x = 3;
                                                objI = h(documentId, null, bVar);
                                                if (objI != objE) {
                                                    advocateCardData2 = advocateCardData;
                                                    userDocumentData4 = userDocumentData3;
                                                    bVar10 = bVar9;
                                                    bVar11 = bVar4;
                                                    right = new dx.i.Right(f.e(advocateCardData2, (vx0.f) bVar10.a((dx.i) objI), userDocumentData4));
                                                    bVar4 = bVar11;
                                                }
                                            }
                                            advocateCardData3 = (AdvocateCardData) bVar4.a(right);
                                        }
                                    } else {
                                        if (!zBooleanValue) {
                                            throw new oq.p();
                                        }
                                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                        bVar.f154520d = jVarA;
                                        bVar.f154521e = vq.j.a(bVar3);
                                        bVar.f154522f = bVar4;
                                        bVar.f154523g = bVar4;
                                        bVar.f154524h = userDocumentData;
                                        bVar.f154525j = null;
                                        bVar.f154526k = null;
                                        bVar.f154528m = i19;
                                        bVar.f154529n = i18;
                                        bVar.f154530p = i17;
                                        bVar.f154531q = i16;
                                        bVar.f154532r = i15;
                                        bVar.f154537x = 4;
                                        objC = a0Var.c(c1792a2, bVar);
                                        if (objC == objE) {
                                            bVar5 = bVar4;
                                            bVar6 = bVar3;
                                            userDocumentData2 = userDocumentData;
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
                                                advocateDataModel = (AdvocateDataModel) ((dx.i.Right) right2).b();
                                                Date expiredData = advocateDataModel.getAdvocateCardDataModel().getExpiredData();
                                                bVar.f154520d = jVarA;
                                                bVar.f154521e = vq.j.a(bVar6);
                                                bVar.f154522f = vq.j.a(bVar5);
                                                bVar.f154523g = bVar7;
                                                bVar.f154524h = userDocumentData2;
                                                bVar.f154525j = vq.j.a(right2);
                                                bVar.f154526k = advocateDataModel;
                                                bVar.f154527l = bVar5;
                                                bVar.f154528m = i19;
                                                bVar.f154529n = i25;
                                                bVar.f154530p = i26;
                                                bVar.f154531q = i27;
                                                bVar.f154532r = i15;
                                                bVar.f154533s = 0;
                                                bVar.f154534t = 0;
                                                bVar.f154537x = 5;
                                                objI = h(null, expiredData, bVar);
                                                if (objI != objE) {
                                                    advocateDataModel2 = advocateDataModel;
                                                    userDocumentData5 = userDocumentData2;
                                                    bVar12 = bVar5;
                                                    right2 = new dx.i.Right(f.f(advocateDataModel2, (vx0.f) bVar12.a((dx.i) objI), userDocumentData5));
                                                }
                                            }
                                            advocateCardData3 = (AdvocateCardData) bVar7.a(right2);
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
                            int i36 = bVar.f154532r;
                            int i37 = bVar.f154531q;
                            i17 = bVar.f154530p;
                            int i38 = bVar.f154529n;
                            i19 = bVar.f154528m;
                            aVar = (ex.b) bVar.f154526k;
                            bVar4 = (ex.b) bVar.f154525j;
                            ex.b bVar14 = (ex.b) bVar.f154524h;
                            dx.j<dx.b> jVar = (dx.j) bVar.f154523g;
                            a0Var = (q34.a0) bVar.f154522f;
                            tVar = (w24.t) bVar.f154521e;
                            bVar2 = (c54.b) bVar.f154520d;
                            try {
                                oq.u.b(objI);
                                i15 = i36;
                                jVarA = jVar;
                                i18 = i38;
                                bVar3 = bVar14;
                                i16 = i37;
                                userDocumentData = (UserDocumentData) aVar.a((dx.i) objI);
                                zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                    bVar.f154520d = jVarA;
                                    bVar.f154521e = vq.j.a(bVar3);
                                    bVar.f154522f = bVar4;
                                    bVar.f154523g = bVar4;
                                    bVar.f154524h = userDocumentData;
                                    bVar.f154525j = null;
                                    bVar.f154526k = null;
                                    bVar.f154528m = i19;
                                    bVar.f154529n = i18;
                                    bVar.f154530p = i17;
                                    bVar.f154531q = i16;
                                    bVar.f154532r = i15;
                                    bVar.f154537x = 2;
                                    objC2 = tVar.c(c1792a3, bVar);
                                    if (objC2 == objE) {
                                        bVar8 = bVar3;
                                        bVar9 = bVar4;
                                        userDocumentData3 = userDocumentData;
                                        objI = objC2;
                                        i28 = i19;
                                        right = (dx.i) objI;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            advocateCardData = (i24.AdvocateCardData) ((dx.i.Right) right).b();
                                            String documentId2 = advocateCardData.getDocument().getDocumentId();
                                            bVar.f154520d = jVarA;
                                            bVar.f154521e = vq.j.a(bVar8);
                                            bVar.f154522f = vq.j.a(bVar9);
                                            bVar.f154523g = bVar4;
                                            bVar.f154524h = userDocumentData3;
                                            bVar.f154525j = vq.j.a(right);
                                            bVar.f154526k = advocateCardData;
                                            bVar.f154527l = bVar9;
                                            bVar.f154528m = i28;
                                            bVar.f154529n = i18;
                                            bVar.f154530p = i17;
                                            bVar.f154531q = i16;
                                            bVar.f154532r = i15;
                                            bVar.f154533s = 0;
                                            bVar.f154534t = 0;
                                            bVar.f154537x = 3;
                                            objI = h(documentId2, null, bVar);
                                            if (objI != objE) {
                                                advocateCardData2 = advocateCardData;
                                                userDocumentData4 = userDocumentData3;
                                                bVar10 = bVar9;
                                                bVar11 = bVar4;
                                                right = new dx.i.Right(f.e(advocateCardData2, (vx0.f) bVar10.a((dx.i) objI), userDocumentData4));
                                                bVar4 = bVar11;
                                            }
                                        }
                                        advocateCardData3 = (AdvocateCardData) bVar4.a(right);
                                    }
                                } else {
                                    if (!zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                    bVar.f154520d = jVarA;
                                    bVar.f154521e = vq.j.a(bVar3);
                                    bVar.f154522f = bVar4;
                                    bVar.f154523g = bVar4;
                                    bVar.f154524h = userDocumentData;
                                    bVar.f154525j = null;
                                    bVar.f154526k = null;
                                    bVar.f154528m = i19;
                                    bVar.f154529n = i18;
                                    bVar.f154530p = i17;
                                    bVar.f154531q = i16;
                                    bVar.f154532r = i15;
                                    bVar.f154537x = 4;
                                    objC = a0Var.c(c1792a4, bVar);
                                    if (objC == objE) {
                                        bVar5 = bVar4;
                                        bVar6 = bVar3;
                                        userDocumentData2 = userDocumentData;
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
                                            advocateDataModel = (AdvocateDataModel) ((dx.i.Right) right2).b();
                                            Date expiredData2 = advocateDataModel.getAdvocateCardDataModel().getExpiredData();
                                            bVar.f154520d = jVarA;
                                            bVar.f154521e = vq.j.a(bVar6);
                                            bVar.f154522f = vq.j.a(bVar5);
                                            bVar.f154523g = bVar7;
                                            bVar.f154524h = userDocumentData2;
                                            bVar.f154525j = vq.j.a(right2);
                                            bVar.f154526k = advocateDataModel;
                                            bVar.f154527l = bVar5;
                                            bVar.f154528m = i19;
                                            bVar.f154529n = i25;
                                            bVar.f154530p = i26;
                                            bVar.f154531q = i27;
                                            bVar.f154532r = i15;
                                            bVar.f154533s = 0;
                                            bVar.f154534t = 0;
                                            bVar.f154537x = 5;
                                            objI = h(null, expiredData2, bVar);
                                            if (objI != objE) {
                                                advocateDataModel2 = advocateDataModel;
                                                userDocumentData5 = userDocumentData2;
                                                bVar12 = bVar5;
                                                right2 = new dx.i.Right(f.f(advocateDataModel2, (vx0.f) bVar12.a((dx.i) objI), userDocumentData5));
                                            }
                                        }
                                        advocateCardData3 = (AdvocateCardData) bVar7.a(right2);
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
                            int i39 = bVar.f154532r;
                            int i45 = bVar.f154531q;
                            int i46 = bVar.f154530p;
                            i18 = bVar.f154529n;
                            i28 = bVar.f154528m;
                            userDocumentData3 = (UserDocumentData) bVar.f154524h;
                            ex.b bVar15 = (ex.b) bVar.f154523g;
                            bVar9 = (ex.b) bVar.f154522f;
                            ex.b bVar16 = (ex.b) bVar.f154521e;
                            dx.j<dx.b> jVar2 = (dx.j) bVar.f154520d;
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
                                    advocateCardData = (i24.AdvocateCardData) ((dx.i.Right) right).b();
                                    String documentId3 = advocateCardData.getDocument().getDocumentId();
                                    bVar.f154520d = jVarA;
                                    bVar.f154521e = vq.j.a(bVar8);
                                    bVar.f154522f = vq.j.a(bVar9);
                                    bVar.f154523g = bVar4;
                                    bVar.f154524h = userDocumentData3;
                                    bVar.f154525j = vq.j.a(right);
                                    bVar.f154526k = advocateCardData;
                                    bVar.f154527l = bVar9;
                                    bVar.f154528m = i28;
                                    bVar.f154529n = i18;
                                    bVar.f154530p = i17;
                                    bVar.f154531q = i16;
                                    bVar.f154532r = i15;
                                    bVar.f154533s = 0;
                                    bVar.f154534t = 0;
                                    bVar.f154537x = 3;
                                    objI = h(documentId3, null, bVar);
                                    if (objI != objE) {
                                        advocateCardData2 = advocateCardData;
                                        userDocumentData4 = userDocumentData3;
                                        bVar10 = bVar9;
                                        bVar11 = bVar4;
                                        right = new dx.i.Right(f.e(advocateCardData2, (vx0.f) bVar10.a((dx.i) objI), userDocumentData4));
                                        bVar4 = bVar11;
                                    }
                                    return objE;
                                }
                                advocateCardData3 = (AdvocateCardData) bVar4.a(right);
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
                                int i47 = bVar.f154532r;
                                int i48 = bVar.f154531q;
                                int i49 = bVar.f154530p;
                                int i55 = bVar.f154529n;
                                int i56 = bVar.f154528m;
                                userDocumentData2 = (UserDocumentData) bVar.f154524h;
                                ex.b bVar17 = (ex.b) bVar.f154523g;
                                bVar5 = (ex.b) bVar.f154522f;
                                bVar6 = (ex.b) bVar.f154521e;
                                dx.j<dx.b> jVar3 = (dx.j) bVar.f154520d;
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
                                        advocateDataModel = (AdvocateDataModel) ((dx.i.Right) right2).b();
                                        Date expiredData3 = advocateDataModel.getAdvocateCardDataModel().getExpiredData();
                                        bVar.f154520d = jVarA;
                                        bVar.f154521e = vq.j.a(bVar6);
                                        bVar.f154522f = vq.j.a(bVar5);
                                        bVar.f154523g = bVar7;
                                        bVar.f154524h = userDocumentData2;
                                        bVar.f154525j = vq.j.a(right2);
                                        bVar.f154526k = advocateDataModel;
                                        bVar.f154527l = bVar5;
                                        bVar.f154528m = i19;
                                        bVar.f154529n = i25;
                                        bVar.f154530p = i26;
                                        bVar.f154531q = i27;
                                        bVar.f154532r = i15;
                                        bVar.f154533s = 0;
                                        bVar.f154534t = 0;
                                        bVar.f154537x = 5;
                                        objI = h(null, expiredData3, bVar);
                                        if (objI != objE) {
                                            advocateDataModel2 = advocateDataModel;
                                            userDocumentData5 = userDocumentData2;
                                            bVar12 = bVar5;
                                        }
                                        return objE;
                                    }
                                    advocateCardData3 = (AdvocateCardData) bVar7.a(right2);
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
                                bVar12 = (ex.b) bVar.f154527l;
                                advocateDataModel2 = (AdvocateDataModel) bVar.f154526k;
                                userDocumentData5 = (UserDocumentData) bVar.f154524h;
                                bVar7 = (ex.b) bVar.f154523g;
                                oq.u.b(objI);
                            }
                            right2 = new dx.i.Right(f.f(advocateDataModel2, (vx0.f) bVar12.a((dx.i) objI), userDocumentData5));
                            advocateCardData3 = (AdvocateCardData) bVar7.a(right2);
                        } else {
                            bVar10 = (ex.b) bVar.f154527l;
                            advocateCardData2 = (i24.AdvocateCardData) bVar.f154526k;
                            userDocumentData4 = (UserDocumentData) bVar.f154524h;
                            bVar11 = (ex.b) bVar.f154523g;
                            oq.u.b(objI);
                            right = new dx.i.Right(f.e(advocateCardData2, (vx0.f) bVar10.a((dx.i) objI), userDocumentData4));
                            bVar4 = bVar11;
                            advocateCardData3 = (AdvocateCardData) bVar4.a(right);
                        }
                        return new dx.i.Right(advocateCardData3);
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

    private e() {
    }

    public final ux0.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, q34.a0 getAdvocateCardDataUC, w24.t containersGetAdvocateCardDataUC, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, w24.n deleteDocumentByTypeUC, r34.e getValueFromDocumentConfigUC, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, containersGetAdvocateCardDataUC, getAdvocateCardDataUC, getValueFromDocumentConfigUC, deleteDocumentByTypeUC, deleteDocumentByIdUC, deleteDocumentUseCase, getDocumentDeletionDialogUC, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase);
    }
}
