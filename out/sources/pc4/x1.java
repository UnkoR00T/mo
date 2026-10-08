package pc4;

import iq0.FeatureFlag;
import java.io.InputStream;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpc4/x1;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lg34/c;", "identityManager", "Lh64/e;", "getFeatureFlagListUseCase", "Lcw0/b;", "getInsuranceConfirmationUC", "Lv21/a;", "a", "(Lc54/b;Lk24/g;Lg34/c;Lh64/e;Lcw0/b;)Lv21/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x1 {

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pc4/x1$a", "Lv21/a;", "Ldx/i;", "Ldx/b;", "Lk34/u;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "queryUuid", "Ljava/io/InputStream;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "c", "()Z", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements v21.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.g f156621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f156622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ cw0.b f156623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h64.e f156624e;

        /* JADX INFO: renamed from: pc4.x1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3881a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156625a;

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
                f156625a = iArr;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156626d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156628f;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156626d = obj;
                this.f156628f |= PKIFailureInfo.systemUnavail;
                return a.this.b(this);
            }
        }

        a(c54.b bVar, k24.g gVar, g34.c cVar, cw0.b bVar2, h64.e eVar) {
            this.f156620a = bVar;
            this.f156621b = gVar;
            this.f156622c = cVar;
            this.f156623d = bVar2;
            this.f156624e = eVar;
        }

        @Override // v21.a
        public Object a(String str, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar) {
            return this.f156623d.c(new cw0.b.Params(str), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v21.a
        public Object b(tq.e<? super dx.i<? extends dx.b, ? extends k34.u>> eVar) throws Throwable {
            b bVar;
            k34.u uVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156628f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156628f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f156626d;
            Object objE = uq.b.e();
            int i16 = bVar.f156628f;
            if (i16 == 0) {
                oq.u.b(objC);
                boolean zBooleanValue = this.f156620a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                if (!zBooleanValue) {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    return g34.c.b(this.f156622c, false, 1, null);
                }
                k24.g gVar = this.f156621b;
                k24.g.Params params = new k24.g.Params(false, 1, null);
                bVar.f156628f = 1;
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
            int i17 = C3881a.f156625a[((f24.c) ((dx.i.Right) iVar).b()).ordinal()];
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

        @Override // v21.a
        public boolean c() {
            Object next;
            Iterator<T> it = this.f156624e.a(gz.b.a.C1792a.f78542a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((FeatureFlag) next).getType() != iq0.y.VEHICLE_INSURANCE_VERIFICATION_CONFIRMATION);
            FeatureFlag featureFlag = (FeatureFlag) next;
            if (featureFlag != null) {
                return featureFlag.getFeatureActive();
            }
            return false;
        }
    }

    public final v21.a a(c54.b isFeatureEnabledUseCase, k24.g getMainCertificateTypeUC, g34.c identityManager, h64.e getFeatureFlagListUseCase, cw0.b getInsuranceConfirmationUC) {
        return new a(isFeatureEnabledUseCase, getMainCertificateTypeUC, identityManager, getInsuranceConfirmationUC, getFeatureFlagListUseCase);
    }
}
