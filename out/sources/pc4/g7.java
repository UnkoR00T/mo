package pc4;

import b03.PermanentPersonalAddress;
import i24.PersonalAddressContainer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpc4/g7;", "", "<init>", "()V", "Ljr0/k;", "Lb03/a;", "e", "(Ljr0/k;)Lb03/a;", "Li24/f0;", "d", "(Li24/f0;)Lb03/a;", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/e;", "getMIdCardDataUC", "Lq34/w0;", "getMIdCardDataUseCase", "La03/a;", "c", "(Lc54/b;Lk24/e;Lq34/w0;)La03/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g7 {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/g7$a", "La03/a;", "Ldx/i;", "Ldx/b;", "Lb03/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements a03.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f154657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.e f154658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.w0 f154659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g7 f154660d;

        /* JADX INFO: renamed from: pc4.g7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3836a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f154661d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f154663f;

            C3836a(tq.e<? super C3836a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154661d = obj;
                this.f154663f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        a(c54.b bVar, k24.e eVar, q34.w0 w0Var, g7 g7Var) {
            this.f154657a = bVar;
            this.f154658b = eVar;
            this.f154659c = w0Var;
            this.f154660d = g7Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            if (r7 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
        
            if (r7 == r1) goto L36;
         */
        @Override // a03.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(tq.e<? super dx.i<? extends dx.b, b03.PermanentPersonalAddress>> r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.g7.a.a(tq.e):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermanentPersonalAddress d(PersonalAddressContainer personalAddressContainer) {
        return new PermanentPersonalAddress(personalAddressContainer.getStreetName(), personalAddressContainer.getHouseNumber(), personalAddressContainer.getPostalCode(), personalAddressContainer.getMunicipality(), personalAddressContainer.getVoivodeship(), personalAddressContainer.getApartmentNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermanentPersonalAddress e(jr0.PersonalAddressContainer personalAddressContainer) {
        return new PermanentPersonalAddress(personalAddressContainer.getStreetName(), personalAddressContainer.getHouseNumber(), personalAddressContainer.getPostalCode(), personalAddressContainer.getLocality(), personalAddressContainer.getVoivodeship(), personalAddressContainer.getApartmentNumber());
    }

    public final a03.a c(c54.b isFeatureEnabledUseCase, k24.e getMIdCardDataUC, q34.w0 getMIdCardDataUseCase) {
        return new a(isFeatureEnabledUseCase, getMIdCardDataUC, getMIdCardDataUseCase, this);
    }
}
