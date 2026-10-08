package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpc4/f5;", "", "<init>", "()V", "Lk24/c;", "getCertificatePeselTicketUC", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/b;", "getCertKeyPairUC", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Ly72/a;", "a", "(Lk24/c;Lg34/c;Lc54/b;Lk24/b;Lq34/x0;Lw24/x0;)Ly72/a;", "Lac4/d;", "getCurrentServerTimeUseCase", "Ly72/b;", "b", "(Lac4/d;)Ly72/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f5 f154569a = new f5();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0004H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"pc4/f5$a", "Ly72/a;", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Liy/b0;", "g", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "b", "Lz72/c;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements y72.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.c f154571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f154572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.b f154573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w24.x0 f154574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q34.x0 f154575f;

        /* JADX INFO: renamed from: pc4.f5$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3834a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f154576a;

            static {
                int[] iArr = new int[k34.u.values().length];
                try {
                    iArr[k34.u.MOBYWATEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k34.u.DIIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k34.u.STUDENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f154576a = iArr;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154577d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154579f;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154577d = obj;
                this.f154579f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154580d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f154581e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154583g;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154581e = obj;
                this.f154583g |= PKIFailureInfo.systemUnavail;
                return a.this.g(null, this);
            }
        }

        a(c54.b bVar, k24.c cVar, g34.c cVar2, k24.b bVar2, w24.x0 x0Var, q34.x0 x0Var2) {
            this.f154570a = bVar;
            this.f154571b = cVar;
            this.f154572c = cVar2;
            this.f154573d = bVar2;
            this.f154574e = x0Var;
            this.f154575f = x0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r6 == r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
        
            if (r6 == r1) goto L38;
         */
        @Override // y72.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(tq.e<? super dx.i<? extends dx.b, z72.UserDocumentData>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.f5.a.a(tq.e):java.lang.Object");
        }

        @Override // y72.a
        public Object b(k34.u uVar, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            f24.c cVar;
            boolean zBooleanValue = this.f154570a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f154572c.m(uVar);
            }
            k24.b bVar = this.f154573d;
            int i15 = C3834a.f154576a[uVar.ordinal()];
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
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (r7 == r1) goto L26;
         */
        @Override // y72.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(k34.u r6, tq.e<? super dx.i<? extends dx.b, iy.b0>> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pc4.f5.a.c
                if (r0 == 0) goto L13
                r0 = r7
                pc4.f5$a$c r0 = (pc4.f5.a.c) r0
                int r1 = r0.f154583g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f154583g = r1
                goto L18
            L13:
                pc4.f5$a$c r0 = new pc4.f5$a$c
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f154581e
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f154583g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f154580d
                k34.u r6 = (k34.u) r6
                oq.u.b(r7)
                goto L7a
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                java.lang.Object r6 = r0.f154580d
                k34.u r6 = (k34.u) r6
                oq.u.b(r7)
                return r7
            L40:
                oq.u.b(r7)
                c54.b r7 = r5.f154570a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r7 = r7.a(r2)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != r4) goto L67
                k24.c r7 = r5.f154571b
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Object r6 = vq.j.a(r6)
                r0.f154580d = r6
                r0.f154583g = r4
                java.lang.Object r6 = r7.c(r2, r0)
                if (r6 != r1) goto L66
                goto L79
            L66:
                return r6
            L67:
                if (r7 != 0) goto L9d
                g34.c r7 = r5.f154572c
                java.lang.Object r2 = vq.j.a(r6)
                r0.f154580d = r2
                r0.f154583g = r3
                java.lang.Object r7 = r7.l(r6, r0)
                if (r7 != r1) goto L7a
            L79:
                return r1
            L7a:
                dx.i r7 = (dx.i) r7
                boolean r6 = r7 instanceof dx.i.Left
                if (r6 == 0) goto L81
                return r7
            L81:
                boolean r6 = r7 instanceof dx.i.Right
                if (r6 == 0) goto L97
                dx.i$c r7 = (dx.i.Right) r7
                java.lang.Object r6 = r7.b()
                java.lang.String r6 = (java.lang.String) r6
                iy.b0 r6 = iy.c0.g(r6)
                dx.i$c r7 = new dx.i$c
                r7.<init>(r6)
                return r7
            L97:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L9d:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.f5.a.g(k34.u, tq.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/f5$b", "Ly72/b;", "Lfz/b$f;", "a", "()Lfz/b$f;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements y72.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ac4.d f154584a;

        b(ac4.d dVar) {
            this.f154584a = dVar;
        }

        @Override // y72.b
        public fz.b.OffsetDateTime a() {
            return new fz.b.OffsetDateTime(this.f154584a.a(gz.b.a.C1792a.f78542a));
        }
    }

    private f5() {
    }

    public final y72.a a(k24.c getCertificatePeselTicketUC, g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.b getCertKeyPairUC, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC) {
        return new a(isFeatureEnabledUseCase, getCertificatePeselTicketUC, identityManager, getCertKeyPairUC, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase);
    }

    public final y72.b b(ac4.d getCurrentServerTimeUseCase) {
        return new b(getCurrentServerTimeUseCase);
    }
}
