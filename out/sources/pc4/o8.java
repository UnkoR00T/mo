package pc4;

import i24.StudentCardData;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpc4/o8;", "", "<init>", "()V", "Lk24/c;", "getCertificatePeselTicketUC", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/b;", "getCertKeyPairUC", "Lk24/h;", "getStudentCardDataUC", "Lk24/g;", "getMainCertificateTypeUC", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Liy/a;", "base64Coder", "Lk24/l;", "refreshDocumentsStatusesUC", "Lq34/v1;", "refreshDocumentsStatusesUseCase", "Lq34/a;", "activateStudentCardDocumentUseCase", "Lw24/a;", "activateStudentCardUC", "Ls73/a;", "a", "(Lk24/c;Lg34/c;Lc54/b;Lk24/b;Lk24/h;Lk24/g;Liy/l;Liy/a;Lk24/l;Lq34/v1;Lq34/a;Lw24/a;)Ls73/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o8 f155337a = new o8();

    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"pc4/o8$a", "Ls73/a;", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Liy/b0;", "g", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "b", "e", "", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "packageData", "password", "d", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements s73.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.c f155339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f155340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.b f155341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k24.h f155342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ iy.l f155343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.a f155344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k24.g f155345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k24.l f155346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q34.v1 f155347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w24.a f155348k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q34.a f155349l;

        /* JADX INFO: renamed from: pc4.o8$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3853a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155351b;

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
                f155350a = iArr;
                int[] iArr2 = new int[f24.c.values().length];
                try {
                    iArr2[f24.c.CITIZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[f24.c.REFUGEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f24.c.UNIVERSITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                f155351b = iArr2;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155352d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155353e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155354f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155355g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155356h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155357j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155358k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155359l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155360m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155361n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155362p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155363q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f155364r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f155366t;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155364r = obj;
                this.f155366t |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f155367d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155368e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155370g;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155368e = obj;
                this.f155370g |= PKIFailureInfo.systemUnavail;
                return a.this.a(false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155371d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155372e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155374g;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155372e = obj;
                this.f155374g |= PKIFailureInfo.systemUnavail;
                return a.this.g(null, this);
            }
        }

        a(c54.b bVar, k24.c cVar, g34.c cVar2, k24.b bVar2, k24.h hVar, iy.l lVar, iy.a aVar, k24.g gVar, k24.l lVar2, q34.v1 v1Var, w24.a aVar2, q34.a aVar3) {
            this.f155338a = bVar;
            this.f155339b = cVar;
            this.f155340c = cVar2;
            this.f155341d = bVar2;
            this.f155342e = hVar;
            this.f155343f = lVar;
            this.f155344g = aVar;
            this.f155345h = gVar;
            this.f155346i = lVar2;
            this.f155347j = v1Var;
            this.f155348k = aVar2;
            this.f155349l = aVar3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // s73.a
        public Object a(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            c cVar;
            k34.u uVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f155370g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155370g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f155368e;
            Object objE = uq.b.e();
            int i16 = cVar.f155370g;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f155338a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return this.f155340c.g(z15);
                }
                k24.g gVar = this.f155345h;
                k24.g.Params params = new k24.g.Params(z15);
                cVar.f155367d = z15;
                cVar.f155370g = 1;
                objC = gVar.c(params, cVar);
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
            int i17 = C3853a.f155351b[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
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

        @Override // s73.a
        public Object b(k34.u uVar, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            f24.c cVar;
            boolean zBooleanValue = this.f155338a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f155340c.m(uVar);
            }
            k24.b bVar = this.f155341d;
            int i15 = C3853a.f155350a[uVar.ordinal()];
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

        @Override // s73.a
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            boolean zBooleanValue = this.f155338a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f155346i.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f155347j.c(gz.b.a.C1792a.f78542a, eVar);
        }

        @Override // s73.a
        public Object d(String str, iy.b0 b0Var, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            boolean zBooleanValue = this.f155338a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f155348k.c(new w24.a.Params(str, b0Var), eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f155349l.c(new q34.a.Params(str, b0Var), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:67:0x0199  */
        /* JADX WARN: Code duplicated, block: B:70:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:73:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // s73.a
        public Object e(k34.u uVar, tq.e<? super dx.i<? extends dx.b, iy.b0>> eVar) throws Throwable {
            b bVar;
            String message;
            dx.i iVarA;
            Object objB;
            iy.l lVar;
            ex.b bVar2;
            iy.a aVar;
            dx.j<dx.b> jVar;
            ex.b bVar3;
            ex.b bVar4;
            String strE;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f155366t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f155366t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objE = bVar.f155364r;
            ?? E = uq.b.e();
            int i16 = bVar.f155366t;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objE);
                        c54.b bVar5 = this.f155338a;
                        k24.h hVar = this.f155342e;
                        lVar = this.f155343f;
                        iy.a aVar2 = this.f155344g;
                        g34.c cVar = this.f155340c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar3 = new ex.a();
                            boolean zBooleanValue = bVar5.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                if (C3853a.f155350a[uVar.ordinal()] != 3) {
                                    aVar3.b(new dx.b.Generic(new UnsupportedOperationException(uVar + " is not a supported type")));
                                    throw new oq.g();
                                }
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                bVar.f155352d = vq.j.a(uVar);
                                bVar.f155353e = lVar;
                                bVar.f155354f = aVar2;
                                bVar.f155355g = jVarA;
                                bVar.f155356h = vq.j.a(aVar3);
                                bVar.f155357j = aVar3;
                                bVar.f155358k = aVar3;
                                bVar.f155359l = 0;
                                bVar.f155360m = 0;
                                bVar.f155361n = 0;
                                bVar.f155362p = 0;
                                bVar.f155363q = 0;
                                bVar.f155366t = 1;
                                objE = hVar.c(c1792a, bVar);
                                if (objE != E) {
                                    aVar = aVar2;
                                    jVar = jVarA;
                                    bVar3 = aVar3;
                                    bVar4 = bVar3;
                                    strE = iy.a.e(aVar, (byte[]) bVar4.a(lVar.b(((StudentCardData) bVar3.a((dx.i) objE)).getScope().getData().getCardNumber().getBytes(StandardCharsets.UTF_8), iy.o.SHA_256)), null, 2, null);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                bVar.f155352d = vq.j.a(uVar);
                                bVar.f155353e = jVarA;
                                bVar.f155354f = vq.j.a(aVar3);
                                bVar.f155355g = vq.j.a(aVar3);
                                bVar.f155356h = aVar3;
                                bVar.f155359l = 0;
                                bVar.f155360m = 0;
                                bVar.f155361n = 0;
                                bVar.f155362p = 0;
                                bVar.f155363q = 0;
                                bVar.f155366t = 2;
                                objE = cVar.e(uVar, bVar);
                                if (objE != E) {
                                    bVar2 = aVar3;
                                    strE = (String) bVar2.a((dx.i) objE);
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
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
                        bVar3 = (ex.b) bVar.f155358k;
                        bVar4 = (ex.b) bVar.f155357j;
                        jVar = (dx.j) bVar.f155355g;
                        aVar = (iy.a) bVar.f155354f;
                        lVar = (iy.l) bVar.f155353e;
                        try {
                            oq.u.b(objE);
                            strE = iy.a.e(aVar, (byte[]) bVar4.a(lVar.b(((StudentCardData) bVar3.a((dx.i) objE)).getScope().getData().getCardNumber().getBytes(StandardCharsets.UTF_8), iy.o.SHA_256)), null, 2, null);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            E = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
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
                        bVar2 = (ex.b) bVar.f155356h;
                        try {
                            oq.u.b(objE);
                            strE = (String) bVar2.a((dx.i) objE);
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(iy.c0.g(strE));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (r7 == r1) goto L26;
         */
        @Override // s73.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(k34.u r6, tq.e<? super dx.i<? extends dx.b, iy.b0>> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pc4.o8.a.d
                if (r0 == 0) goto L13
                r0 = r7
                pc4.o8$a$d r0 = (pc4.o8.a.d) r0
                int r1 = r0.f155374g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f155374g = r1
                goto L18
            L13:
                pc4.o8$a$d r0 = new pc4.o8$a$d
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f155372e
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f155374g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f155371d
                k34.u r6 = (k34.u) r6
                oq.u.b(r7)
                goto L7a
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                java.lang.Object r6 = r0.f155371d
                k34.u r6 = (k34.u) r6
                oq.u.b(r7)
                return r7
            L40:
                oq.u.b(r7)
                c54.b r7 = r5.f155338a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r7 = r7.a(r2)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != r4) goto L67
                k24.c r7 = r5.f155339b
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Object r6 = vq.j.a(r6)
                r0.f155371d = r6
                r0.f155374g = r4
                java.lang.Object r6 = r7.c(r2, r0)
                if (r6 != r1) goto L66
                goto L79
            L66:
                return r6
            L67:
                if (r7 != 0) goto L9d
                g34.c r7 = r5.f155340c
                java.lang.Object r2 = vq.j.a(r6)
                r0.f155371d = r2
                r0.f155374g = r3
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
            throw new UnsupportedOperationException("Method not decompiled: pc4.o8.a.g(k34.u, tq.e):java.lang.Object");
        }
    }

    private o8() {
    }

    public final s73.a a(k24.c getCertificatePeselTicketUC, g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.b getCertKeyPairUC, k24.h getStudentCardDataUC, k24.g getMainCertificateTypeUC, iy.l digest, iy.a base64Coder, k24.l refreshDocumentsStatusesUC, q34.v1 refreshDocumentsStatusesUseCase, q34.a activateStudentCardDocumentUseCase, w24.a activateStudentCardUC) {
        return new a(isFeatureEnabledUseCase, getCertificatePeselTicketUC, identityManager, getCertKeyPairUC, getStudentCardDataUC, digest, base64Coder, getMainCertificateTypeUC, refreshDocumentsStatusesUC, refreshDocumentsStatusesUseCase, activateStudentCardUC, activateStudentCardDocumentUseCase);
    }
}
