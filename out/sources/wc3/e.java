package wc3;

import dx.j;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uc3.PassportsData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwc3/e;", "", "Lgz/b$a$a;", "Luc3/i;", "Lvc3/a;", "passportStorageRepository", "Ltc3/b;", "userDataDocumentsInteractor", "<init>", "(Lvc3/a;Ltc3/b;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lvc3/a;", "b", "Ltc3/b;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vc3.a passportStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tc3.b userDataDocumentsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212100h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f212101j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f212102k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212103l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212104m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f212105n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f212106p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f212107q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f212109s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212107q = obj;
            this.f212109s |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, this);
        }
    }

    public e(vc3.a aVar, tc3.b bVar) {
        this.passportStorageRepository = aVar;
        this.userDataDocumentsInteractor = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0139  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, PassportsData>> eVar) {
        a aVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        ex.b bVar;
        gz.b.a.C1792a c1792a2;
        int i18;
        j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i19;
        ex.b bVar5;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f212109s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212109s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objE = aVar.f212107q;
        Object objE2 = uq.b.e();
        ?? r15 = aVar.f212109s;
        try {
            try {
                if (r15 == 0) {
                    u.b(objE);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    i18 = 0;
                    if (this.userDataDocumentsInteractor.a()) {
                        vc3.a aVar3 = this.passportStorageRepository;
                        aVar.f212096d = vq.j.a(c1792a);
                        aVar.f212097e = jVarA;
                        aVar.f212098f = vq.j.a(aVar2);
                        aVar.f212099g = vq.j.a(aVar2);
                        aVar.f212100h = aVar2;
                        aVar.f212102k = 0;
                        aVar.f212103l = 0;
                        aVar.f212104m = 0;
                        aVar.f212105n = 0;
                        aVar.f212106p = 0;
                        aVar.f212109s = 3;
                        Object objB2 = aVar3.b(aVar);
                        if (objB2 != objE2) {
                            bVar5 = aVar2;
                            objE = objB2;
                            iVar = (dx.i) objE;
                        }
                    } else {
                        tc3.b bVar6 = this.userDataDocumentsInteractor;
                        aVar.f212096d = vq.j.a(c1792a);
                        aVar.f212097e = jVarA;
                        aVar.f212098f = vq.j.a(aVar2);
                        aVar.f212099g = vq.j.a(aVar2);
                        aVar.f212100h = aVar2;
                        aVar.f212101j = aVar2;
                        aVar.f212102k = 0;
                        aVar.f212103l = 0;
                        aVar.f212104m = 0;
                        aVar.f212105n = 0;
                        aVar.f212106p = 0;
                        aVar.f212109s = 1;
                        Object objB3 = bVar6.b(aVar);
                        if (objB3 != objE2) {
                            c1792a2 = c1792a;
                            bVar = aVar2;
                            bVar4 = bVar;
                            bVar3 = bVar4;
                            bVar2 = bVar3;
                            objE = objB3;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i19 = 0;
                            byte[] bArr = (byte[]) bVar4.a((dx.i) objE);
                            vc3.a aVar4 = this.passportStorageRepository;
                            aVar.f212096d = vq.j.a(c1792a2);
                            aVar.f212097e = jVarA;
                            aVar.f212098f = vq.j.a(bVar2);
                            aVar.f212099g = vq.j.a(bVar3);
                            aVar.f212100h = bVar;
                            aVar.f212101j = vq.j.a(bArr);
                            aVar.f212102k = i19;
                            aVar.f212103l = i17;
                            aVar.f212104m = i16;
                            aVar.f212105n = i15;
                            aVar.f212106p = i18;
                            aVar.f212109s = 2;
                            objE = aVar4.e(bArr, aVar);
                            if (objE != objE2) {
                                bVar5 = bVar;
                                iVar = (dx.i) objE;
                            }
                        }
                    }
                    return objE2;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f212106p;
                        i15 = aVar.f212105n;
                        i16 = aVar.f212104m;
                        i17 = aVar.f212103l;
                        int i27 = aVar.f212102k;
                        bVar = (ex.b) aVar.f212101j;
                        ex.b bVar7 = (ex.b) aVar.f212100h;
                        ex.b bVar8 = (ex.b) aVar.f212099g;
                        ex.b bVar9 = (ex.b) aVar.f212098f;
                        j<dx.b> jVar = (j) aVar.f212097e;
                        c1792a2 = (gz.b.a.C1792a) aVar.f212096d;
                        try {
                            u.b(objE);
                            i18 = i26;
                            jVarA = jVar;
                            bVar2 = bVar9;
                            bVar3 = bVar8;
                            bVar4 = bVar7;
                            i19 = i27;
                            byte[] bArr2 = (byte[]) bVar4.a((dx.i) objE);
                            vc3.a aVar5 = this.passportStorageRepository;
                            aVar.f212096d = vq.j.a(c1792a2);
                            aVar.f212097e = jVarA;
                            aVar.f212098f = vq.j.a(bVar2);
                            aVar.f212099g = vq.j.a(bVar3);
                            aVar.f212100h = bVar;
                            aVar.f212101j = vq.j.a(bArr2);
                            aVar.f212102k = i19;
                            aVar.f212103l = i17;
                            aVar.f212104m = i16;
                            aVar.f212105n = i15;
                            aVar.f212106p = i18;
                            aVar.f212109s = 2;
                            objE = aVar5.e(bArr2, aVar);
                            if (objE != objE2) {
                                return objE2;
                            }
                            bVar5 = bVar;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else if (r15 == 2) {
                        bVar5 = (ex.b) aVar.f212100h;
                        u.b(objE);
                    } else {
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar5 = (ex.b) aVar.f212100h;
                        u.b(objE);
                        iVar = (dx.i) objE;
                    }
                    iVar = (dx.i) objE;
                } catch (CancellationException e18) {
                    throw e18;
                }
                return new dx.i.Right((PassportsData) bVar5.a(iVar));
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
