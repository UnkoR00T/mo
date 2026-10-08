package pc4;

import i24.PersonalDataContainer;
import java.util.concurrent.CancellationException;
import m02.PersonalData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJO\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lpc4/o4;", "", "<init>", "()V", "Li24/g0;", "Lm02/g;", "d", "(Li24/g0;)Lm02/g;", "Ljr0/l;", "e", "(Ljr0/l;)Lm02/g;", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lk24/e;", "getMIdCardDataUC", "Lq34/w0;", "getMIdCardDataUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lk24/b;", "getCertKeyPairUC", "Lk02/a;", "c", "(Lg34/c;Lc54/b;Lk24/g;Lk24/e;Lq34/w0;Lq34/x0;Lw24/x0;Lk24/b;)Lk02/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o4 f155303a = new o4();

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0096@¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u0006J$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"pc4/o4$a", "Lk02/a;", "Ldx/i;", "Ldx/b;", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lm02/g;", "d", "Lm02/i;", "c", "", "withValidCert", "Lk34/u;", "a", "(ZLtq/e;)Ljava/lang/Object;", "identityType", "Lry/c;", "b", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements k02.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.g f155305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f155306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.e f155307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.w0 f155308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w24.x0 f155309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q34.x0 f155310g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k24.b f155311h;

        /* JADX INFO: renamed from: pc4.o4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3852a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155313b;

            static {
                int[] iArr = new int[f24.c.values().length];
                try {
                    iArr[f24.c.CITIZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.c.REFUGEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.c.UNIVERSITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f155312a = iArr;
                int[] iArr2 = new int[k34.u.values().length];
                try {
                    iArr2[k34.u.MOBYWATEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[k34.u.DIIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[k34.u.STUDENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                f155313b = iArr2;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155314d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155316f;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155314d = obj;
                this.f155316f |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155317d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155318e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155319f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155320g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155321h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155322j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155323k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155324l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155325m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155326n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155328q;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155326n = obj;
                this.f155328q |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f155329d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155330e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155332g;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155330e = obj;
                this.f155332g |= PKIFailureInfo.systemUnavail;
                return a.this.a(false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155333d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155335f;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155333d = obj;
                this.f155335f |= PKIFailureInfo.systemUnavail;
                return a.this.c(this);
            }
        }

        a(c54.b bVar, k24.g gVar, g34.c cVar, k24.e eVar, q34.w0 w0Var, w24.x0 x0Var, q34.x0 x0Var2, k24.b bVar2) {
            this.f155304a = bVar;
            this.f155305b = gVar;
            this.f155306c = cVar;
            this.f155307d = eVar;
            this.f155308e = w0Var;
            this.f155309f = x0Var;
            this.f155310g = x0Var2;
            this.f155311h = bVar2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // k02.a
        public Object a(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            d dVar;
            k34.u uVar;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f155332g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f155332g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f155330e;
            Object objE = uq.b.e();
            int i16 = dVar.f155332g;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f155304a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return this.f155306c.g(z15);
                }
                k24.g gVar = this.f155305b;
                k24.g.Params params = new k24.g.Params(z15);
                dVar.f155329d = z15;
                dVar.f155332g = 1;
                objC = gVar.c(params, dVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            int i17 = C3852a.f155312a[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
            if (i17 == 1) {
                uVar = k34.u.MOBYWATEL;
            } else if (i17 == 2) {
                uVar = k34.u.DIIA;
            } else {
                if (i17 != 3) {
                    throw new oq.p();
                }
                uVar = k34.u.STUDENT;
            }
            return new dx.i.Right(uVar);
        }

        @Override // k02.a
        public Object b(k34.u uVar, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            f24.c cVar;
            boolean zBooleanValue = this.f155304a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f155306c.m(uVar);
            }
            k24.b bVar = this.f155311h;
            int i15 = C3852a.f155313b[uVar.ordinal()];
            if (i15 == 1) {
                cVar = f24.c.CITIZEN;
            } else if (i15 == 2) {
                cVar = f24.c.REFUGEE;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                cVar = f24.c.UNIVERSITY;
            }
            return bVar.c(new k24.b.Params(cVar), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // k02.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(tq.e<? super dx.i<? extends dx.b, m02.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.o4.a.c(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // k02.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object d(tq.e<? super dx.i<? extends dx.b, m02.PersonalData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.o4.a.d(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:31:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x009f A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #5 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x0098, B:46:0x00cf, B:59:0x00ee, B:32:0x009f, B:34:0x00a3, B:40:0x00bb, B:45:0x00c9, B:41:0x00be, B:42:0x00c3, B:43:0x00c4, B:44:0x00c7, B:47:0x00d6, B:48:0x00db, B:65:0x010f, B:68:0x011d), top: B:83:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.o4$a$c, tq.e] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // k02.a
        public Object e(tq.e<? super dx.i<? extends dx.b, ? extends rq0.b>> eVar) throws Throwable {
            ?? cVar;
            Object objB;
            rq0.b bVarO;
            ex.b bVar;
            dx.i right;
            int i15;
            rq0.b.d dVar;
            if (eVar instanceof c) {
                c cVar2 = (c) eVar;
                int i16 = cVar2.f155328q;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar2.f155328q = i16 - PKIFailureInfo.systemUnavail;
                    cVar = cVar2;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155326n;
            Object objE = uq.b.e();
            int i17 = cVar.f155328q;
            try {
                try {
                    if (i17 == 0) {
                        oq.u.b(objC);
                        c54.b bVar2 = this.f155304a;
                        k24.g gVar = this.f155305b;
                        g34.c cVar3 = this.f155306c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                k24.g.Params params = new k24.g.Params(false, 1, null);
                                cVar.f155322j = jVarA;
                                cVar.f155323k = vq.j.a(aVar);
                                cVar.f155324l = vq.j.a(aVar);
                                cVar.f155325m = aVar;
                                cVar.f155317d = 0;
                                cVar.f155318e = 0;
                                cVar.f155319f = 0;
                                cVar.f155320g = 0;
                                cVar.f155321h = 0;
                                cVar.f155328q = 1;
                                objC = gVar.c(params, cVar);
                                if (objC == objE) {
                                    return objE;
                                }
                                bVar = aVar;
                                right = (dx.i) objC;
                                if (!(right instanceof dx.i.Left)) {
                                    if (right instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    i15 = C3852a.f155312a[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                    if (i15 != 1) {
                                        dVar = rq0.b.d.ID_CARD;
                                    } else if (i15 != 2) {
                                        dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                    } else {
                                        if (i15 == 3) {
                                            throw new oq.p();
                                        }
                                        dVar = rq0.b.d.STUDENT_CARD;
                                    }
                                    right = new dx.i.Right(dVar);
                                }
                                bVarO = (rq0.b) bVar.a(right);
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                bVarO = g34.c.o(cVar3, false, 1, null);
                                if (bVarO == null) {
                                    aVar.b(new dx.b.Generic(new NullPointerException("Main identity document type not found")));
                                    throw new oq.g();
                                }
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
                        if (i17 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) cVar.f155325m;
                        try {
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                i15 = C3852a.f155312a[((f24.c) ((dx.i.Right) right).b()).ordinal()];
                                if (i15 != 1) {
                                    dVar = rq0.b.d.ID_CARD;
                                } else if (i15 != 2) {
                                    dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                } else {
                                    if (i15 == 3) {
                                        throw new oq.p();
                                    }
                                    dVar = rq0.b.d.STUDENT_CARD;
                                }
                                right = new dx.i.Right(dVar);
                            }
                            bVarO = (rq0.b) bVar.a(right);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(bVarO);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    private o4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalData d(PersonalDataContainer personalDataContainer) {
        return new PersonalData(personalDataContainer.getName(), personalDataContainer.getSecondName(), personalDataContainer.getSurname(), personalDataContainer.getPesel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalData e(jr0.PersonalDataContainer personalDataContainer) {
        return new PersonalData(personalDataContainer.getName(), personalDataContainer.getSecondName(), personalDataContainer.getSurname(), personalDataContainer.getPesel());
    }

    public final k02.a c(g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.g getMainCertificateTypeUC, k24.e getMIdCardDataUC, q34.w0 getMIdCardDataUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, k24.b getCertKeyPairUC) {
        return new a(isFeatureEnabledUseCase, getMainCertificateTypeUC, identityManager, getMIdCardDataUC, getMIdCardDataUseCase, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getCertKeyPairUC);
    }
}
