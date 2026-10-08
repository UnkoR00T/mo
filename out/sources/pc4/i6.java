package pc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpc4/i6;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/b;", "getCertKeyPairUC", "Lk24/g;", "getMainCertificateTypeUC", "Lg34/c;", "identityManager", "Llo2/a;", "a", "(Lc54/b;Lk24/b;Lk24/g;Lg34/c;)Llo2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6 f154932a = new i6();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"pc4/i6$a", "Llo2/a;", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Lry/c;", "b", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements lo2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.b f154934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f154935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k24.g f154936d;

        /* JADX INFO: renamed from: pc4.i6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3840a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f154937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f154938b;

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
                f154937a = iArr;
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
                f154938b = iArr2;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f154939d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f154940e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154942g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154940e = obj;
                this.f154942g |= PKIFailureInfo.systemUnavail;
                return a.this.a(false, this);
            }
        }

        a(c54.b bVar, k24.b bVar2, g34.c cVar, k24.g gVar) {
            this.f154933a = bVar;
            this.f154934b = bVar2;
            this.f154935c = cVar;
            this.f154936d = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lo2.a
        public Object a(boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            b bVar;
            k34.u uVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f154942g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f154942g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f154940e;
            Object objE = uq.b.e();
            int i16 = bVar.f154942g;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f154933a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return this.f154935c.g(z15);
                }
                k24.g gVar = this.f154936d;
                k24.g.Params params = new k24.g.Params(z15);
                bVar.f154939d = z15;
                bVar.f154942g = 1;
                objC = gVar.c(params, bVar);
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
            int i17 = C3840a.f154938b[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
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

        @Override // lo2.a
        public Object b(k34.u uVar, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) {
            f24.c cVar;
            boolean zBooleanValue = this.f154933a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return this.f154935c.m(uVar);
            }
            k24.b bVar = this.f154934b;
            int i15 = C3840a.f154937a[uVar.ordinal()];
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
    }

    private i6() {
    }

    public final lo2.a a(c54.b isFeatureEnabledUseCase, k24.b getCertKeyPairUC, k24.g getMainCertificateTypeUC, g34.c identityManager) {
        return new a(isFeatureEnabledUseCase, getCertKeyPairUC, identityManager, getMainCertificateTypeUC);
    }
}
