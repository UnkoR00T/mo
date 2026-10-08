package pc4;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpc4/m1;", "", "<init>", "()V", "Lk24/o;", "saveUserCertificateUC", "Lq34/z1;", "saveNewGeneratedCertUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/b;", "getCertKeyPairUC", "Lk24/m;", "revokeMainCertificateUC", "Lk24/i;", "hasAnyActiveCertificateUC", "Lzz3/a;", "b", "(Lk24/o;Lq34/z1;Lk24/g;Lg34/c;Lc54/b;Lk24/b;Lk24/m;Lk24/i;)Lzz3/a;", "Lfc4/b;", "serverTimeLocalRepository", "Lzz3/c;", "c", "(Lfc4/b;)Lzz3/c;", "La84/b;", "clearNotificationsDeviceTokenUseCase", "Lzz3/b;", "a", "(La84/b;)Lzz3/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f155231a = new m1();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/m1$a", "Lzz3/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements zz3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.b f155232a;

        a(a84.b bVar) {
            this.f155232a = bVar;
        }

        @Override // zz3.b
        public Object a(tq.e<? super oq.i0> eVar) throws Throwable {
            Object objA = this.f155232a.a(gz.b.a.C1792a.f78542a, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0004H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"pc4/m1$b", "Lzz3/a;", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Lry/c;", "b", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Liy/b0;", "peselTicket", "Liy/a0;", "decryptedCert", "password", "Loq/i0;", "c", "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "d", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements zz3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.b f155234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f155235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.o f155236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.z1 f155237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k24.m f155238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k24.i f155239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k24.g f155240h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f155242b;

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
                f155241a = iArr;
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
                f155242b = iArr2;
            }
        }

        /* JADX INFO: renamed from: pc4.m1$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3848b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f155243d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155244e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155246g;

            C3848b(tq.e<? super C3848b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155244e = obj;
                this.f155246g |= PKIFailureInfo.systemUnavail;
                return b.this.a(false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155247d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155248e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155249f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155250g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155251h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155252j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155253k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155254l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f155255m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155257p;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155255m = obj;
                this.f155257p |= PKIFailureInfo.systemUnavail;
                return b.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155258d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155259e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155260f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155261g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155262h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155263j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155264k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155265l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155266m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155267n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155268p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155269q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f155270r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f155272t;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155270r = obj;
                this.f155272t |= PKIFailureInfo.systemUnavail;
                return b.this.c(null, null, null, null, this);
            }
        }

        b(c54.b bVar, k24.b bVar2, g34.c cVar, k24.o oVar, q34.z1 z1Var, k24.m mVar, k24.i iVar, k24.g gVar) {
            this.f155233a = bVar;
            this.f155234b = bVar2;
            this.f155235c = cVar;
            this.f155236d = oVar;
            this.f155237e = z1Var;
            this.f155238f = mVar;
            this.f155239g = iVar;
            this.f155240h = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // zz3.a
        public Object a(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            C3848b c3848b;
            k34.u uVar;
            if (eVar instanceof C3848b) {
                c3848b = (C3848b) eVar;
                int i15 = c3848b.f155246g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3848b.f155246g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3848b = new C3848b(eVar);
                }
            } else {
                c3848b = new C3848b(eVar);
            }
            Object objC = c3848b.f155244e;
            Object objE = uq.b.e();
            int i16 = c3848b.f155246g;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f155233a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return this.f155235c.g(z15);
                }
                k24.g gVar = this.f155240h;
                k24.g.Params params = new k24.g.Params(z15);
                c3848b.f155243d = z15;
                c3848b.f155246g = 1;
                objC = gVar.c(params, c3848b);
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
            int i17 = a.f155242b[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
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

        @Override // zz3.a
        public Object b(k34.u uVar, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            f24.c cVar;
            boolean zBooleanValue = this.f155233a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f155235c.m(uVar);
            }
            k24.b bVar = this.f155234b;
            int i15 = a.f155241a[uVar.ordinal()];
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
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // zz3.a
        public Object c(rq0.b bVar, iy.b0 b0Var, iy.a0 a0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            d dVar;
            Object objB;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f155272t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f155272t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objC = dVar.f155270r;
            Object objE = uq.b.e();
            int i16 = dVar.f155272t;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar2 = this.f155233a;
                            k24.o oVar = this.f155236d;
                            q34.z1 z1Var = this.f155237e;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    k24.o.Params params = new k24.o.Params((f24.c) aVar.a(t24.a.a((f24.i) aVar.a(j1.l(bVar)))), b0Var, a0Var, b0Var2);
                                    dVar.f155258d = vq.j.a(bVar);
                                    dVar.f155259e = vq.j.a(b0Var);
                                    dVar.f155260f = vq.j.a(a0Var);
                                    dVar.f155261g = vq.j.a(b0Var2);
                                    dVar.f155262h = jVarA;
                                    dVar.f155263j = vq.j.a(aVar);
                                    dVar.f155264k = vq.j.a(aVar);
                                    dVar.f155265l = 0;
                                    dVar.f155266m = 0;
                                    dVar.f155267n = 0;
                                    dVar.f155268p = 0;
                                    dVar.f155269q = 0;
                                    dVar.f155272t = 1;
                                    objC = oVar.c(params, dVar);
                                    if (objC != objE) {
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.z1.a aVar2 = new q34.z1.a(bVar, iy.c0.e(b0Var), a0Var, b0Var2);
                                    dVar.f155258d = vq.j.a(bVar);
                                    dVar.f155259e = vq.j.a(b0Var);
                                    dVar.f155260f = vq.j.a(a0Var);
                                    dVar.f155261g = vq.j.a(b0Var2);
                                    dVar.f155262h = jVarA;
                                    dVar.f155263j = vq.j.a(aVar);
                                    dVar.f155264k = vq.j.a(aVar);
                                    dVar.f155265l = 0;
                                    dVar.f155266m = 0;
                                    dVar.f155267n = 0;
                                    dVar.f155268p = 0;
                                    dVar.f155269q = 0;
                                    dVar.f155272t = 2;
                                    objC = z1Var.c(aVar2, dVar);
                                    if (objC != objE) {
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
                            oq.u.b(objC);
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

        @Override // zz3.a
        public Object d(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            boolean zBooleanValue = this.f155233a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (zBooleanValue) {
                return this.f155239g.c(gz.b.a.C1792a.f78542a, eVar);
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            return this.f155235c.c();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.m1$b$c, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r5v0, types: [g34.c] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // zz3.a
        public Object e(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? cVar;
            Object objB;
            if (eVar instanceof c) {
                c cVar2 = (c) eVar;
                int i15 = cVar2.f155257p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar2.f155257p = i15 - PKIFailureInfo.systemUnavail;
                    cVar = cVar2;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object obj = cVar.f155255m;
            Object objE = uq.b.e();
            int i16 = cVar.f155257p;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(obj);
                            c54.b bVar = this.f155233a;
                            k24.m mVar = this.f155238f;
                            ?? r15 = this.f155235c;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    cVar.f155252j = jVarA;
                                    cVar.f155253k = vq.j.a(aVar);
                                    cVar.f155254l = vq.j.a(aVar);
                                    cVar.f155247d = 0;
                                    cVar.f155248e = 0;
                                    cVar.f155249f = 0;
                                    cVar.f155250g = 0;
                                    cVar.f155251h = 0;
                                    cVar.f155257p = 1;
                                    if (mVar.c(c1792a, cVar) == objE) {
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    cVar.f155252j = jVarA;
                                    cVar.f155253k = vq.j.a(aVar);
                                    cVar.f155254l = vq.j.a(aVar);
                                    cVar.f155247d = 0;
                                    cVar.f155248e = 0;
                                    cVar.f155249f = 0;
                                    cVar.f155250g = 0;
                                    cVar.f155251h = 0;
                                    cVar.f155257p = 2;
                                    if (r15.k(cVar) != objE) {
                                        oq.i0 i0Var = oq.i0.f148189a;
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
                        }
                        if (i16 == 1) {
                            oq.u.b(obj);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                            oq.i0 i0Var2 = oq.i0.f148189a;
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
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/m1$c", "Lzz3/c;", "Lfz/b$f;", "serverCurrentTime", "Loq/i0;", "a", "(Lfz/b$f;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements zz3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fc4.b f155273a;

        c(fc4.b bVar) {
            this.f155273a = bVar;
        }

        @Override // zz3.c
        public Object a(fz.b.OffsetDateTime offsetDateTime, tq.e<? super oq.i0> eVar) {
            this.f155273a.o(offsetDateTime);
            return oq.i0.f148189a;
        }
    }

    private m1() {
    }

    public final zz3.b a(a84.b clearNotificationsDeviceTokenUseCase) {
        return new a(clearNotificationsDeviceTokenUseCase);
    }

    public final zz3.a b(k24.o saveUserCertificateUC, q34.z1 saveNewGeneratedCertUseCase, k24.g getMainCertificateTypeUC, g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.b getCertKeyPairUC, k24.m revokeMainCertificateUC, k24.i hasAnyActiveCertificateUC) {
        return new b(isFeatureEnabledUseCase, getCertKeyPairUC, identityManager, saveUserCertificateUC, saveNewGeneratedCertUseCase, revokeMainCertificateUC, hasAnyActiveCertificateUC, getMainCertificateTypeUC);
    }

    public final zz3.c c(fc4.b serverTimeLocalRepository) {
        return new c(serverTimeLocalRepository);
    }
}
