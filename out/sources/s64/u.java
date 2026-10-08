package s64;

import iq0.MobileSettings;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ls64/u;", "Lh64/q;", "Ljq0/e;", "bEGetRemoteSettingUseCase", "Lq64/b;", "settingsHolder", "<init>", "(Ljq0/e;Lq64/b;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Liq0/w;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljq0/e;", "b", "Lq64/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements h64.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jq0.e bEGetRemoteSettingUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q64.b settingsHolder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178535e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178537g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178535e = obj;
            this.f178537g |= PKIFailureInfo.systemUnavail;
            return u.this.c(null, this);
        }
    }

    public u(jq0.e eVar, q64.b bVar) {
        this.bEGetRemoteSettingUseCase = eVar;
        this.settingsHolder = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, MobileSettings>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178537g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178537g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f178535e;
        Object objE = uq.b.e();
        int i16 = aVar.f178537g;
        if (i16 == 0) {
            oq.u.b(objC);
            jq0.e eVar2 = this.bEGetRemoteSettingUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f178534d = vq.j.a(c1792a);
            aVar.f178537g = 1;
            objC = eVar2.c(c1792a2, aVar);
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
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            MobileSettings mobileSettings = (MobileSettings) ((dx.i.Right) iVar).b();
            this.settingsHolder.j(new RemoteSettingsData(mobileSettings.e(), mobileSettings.a(), mobileSettings.d(), mobileSettings.getRateConfiguration(), mobileSettings.getUpdateRecommended(), mobileSettings.b()));
            return new dx.i.Right(mobileSettings);
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        this.settingsHolder.E();
        px.f.f163100a.b("Network ERROR: " + bVar, px.c.a(this));
        return new dx.i.Left(bVar);
    }
}
