package l61;

import i61.ChildPassportApplicationDraft;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll61/l;", "", "Lgz/b$a$a;", "Li61/e;", "Lk61/b;", "draftStorageRepository", "Lh61/a;", "childPassportApplicationContainersInteractor", "<init>", "(Lk61/b;Lh61/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lk61/b;", "b", "Lh61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k61.b draftStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h61.a childPassportApplicationContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116436g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116437h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f116438j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f116439k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f116440l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f116441m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f116442n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f116443p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f116444q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f116446s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116444q = obj;
            this.f116446s |= PKIFailureInfo.systemUnavail;
            return l.this.a(null, this);
        }
    }

    public l(k61.b bVar, h61.a aVar) {
        this.draftStorageRepository = bVar;
        this.childPassportApplicationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ChildPassportApplicationDraft>> eVar) throws Throwable {
        a aVar;
        Object objB;
        dx.j<dx.b> jVarA;
        ex.b aVar2;
        int i15;
        gz.b.a.C1792a c1792a2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f116446s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f116446s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objL = aVar.f116444q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f116446s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objL);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    i15 = 0;
                    if (this.childPassportApplicationContainersInteractor.a()) {
                        k61.b bVar5 = this.draftStorageRepository;
                        aVar.f116433d = vq.j.a(c1792a);
                        aVar.f116434e = jVarA;
                        aVar.f116435f = vq.j.a(aVar2);
                        aVar.f116436g = vq.j.a(aVar2);
                        aVar.f116437h = aVar2;
                        aVar.f116439k = 0;
                        aVar.f116440l = 0;
                        aVar.f116441m = 0;
                        aVar.f116442n = 0;
                        aVar.f116443p = 0;
                        aVar.f116446s = 1;
                        objL = bVar5.e(aVar);
                        if (objL != objE) {
                            bVar4 = aVar2;
                            iVar = (dx.i) objL;
                        }
                    } else {
                        h61.a aVar3 = this.childPassportApplicationContainersInteractor;
                        aVar.f116433d = vq.j.a(c1792a);
                        aVar.f116434e = jVarA;
                        aVar.f116435f = vq.j.a(aVar2);
                        aVar.f116436g = vq.j.a(aVar2);
                        aVar.f116437h = aVar2;
                        aVar.f116438j = aVar2;
                        aVar.f116439k = 0;
                        aVar.f116440l = 0;
                        aVar.f116441m = 0;
                        aVar.f116442n = 0;
                        aVar.f116443p = 0;
                        aVar.f116446s = 2;
                        objL = aVar3.l(aVar);
                        if (objL != objE) {
                            c1792a2 = c1792a;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            bVar3 = bVar2;
                            byte[] bArr = (byte[]) bVar.a((dx.i) objL);
                            k61.b bVar6 = this.draftStorageRepository;
                            aVar.f116433d = vq.j.a(c1792a2);
                            aVar.f116434e = jVarA;
                            aVar.f116435f = vq.j.a(bVar3);
                            aVar.f116436g = vq.j.a(bVar2);
                            aVar.f116437h = aVar2;
                            aVar.f116438j = vq.j.a(bArr);
                            aVar.f116439k = i19;
                            aVar.f116440l = i18;
                            aVar.f116441m = i17;
                            aVar.f116442n = i16;
                            aVar.f116443p = i15;
                            aVar.f116446s = 3;
                            objL = bVar6.g(bArr, aVar);
                            if (objL != objE) {
                                bVar4 = aVar2;
                                iVar = (dx.i) objL;
                            }
                        }
                    }
                    return objE;
                }
                if (r15 != 1) {
                    try {
                        if (r15 == 2) {
                            int i26 = aVar.f116443p;
                            i16 = aVar.f116442n;
                            i17 = aVar.f116441m;
                            int i27 = aVar.f116440l;
                            int i28 = aVar.f116439k;
                            ex.b bVar7 = (ex.b) aVar.f116438j;
                            ex.b bVar8 = (ex.b) aVar.f116437h;
                            ex.b bVar9 = (ex.b) aVar.f116436g;
                            ex.b bVar10 = (ex.b) aVar.f116435f;
                            dx.j<dx.b> jVar = (dx.j) aVar.f116434e;
                            c1792a2 = (gz.b.a.C1792a) aVar.f116433d;
                            try {
                                oq.u.b(objL);
                                i15 = i26;
                                jVarA = jVar;
                                bVar3 = bVar10;
                                bVar2 = bVar9;
                                bVar = bVar7;
                                aVar2 = bVar8;
                                i19 = i28;
                                i18 = i27;
                                byte[] bArr2 = (byte[]) bVar.a((dx.i) objL);
                                k61.b bVar11 = this.draftStorageRepository;
                                aVar.f116433d = vq.j.a(c1792a2);
                                aVar.f116434e = jVarA;
                                aVar.f116435f = vq.j.a(bVar3);
                                aVar.f116436g = vq.j.a(bVar2);
                                aVar.f116437h = aVar2;
                                aVar.f116438j = vq.j.a(bArr2);
                                aVar.f116439k = i19;
                                aVar.f116440l = i18;
                                aVar.f116441m = i17;
                                aVar.f116442n = i16;
                                aVar.f116443p = i15;
                                aVar.f116446s = 3;
                                objL = bVar11.g(bArr2, aVar);
                                if (objL != objE) {
                                    bVar4 = aVar2;
                                }
                                return objE;
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
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) aVar.f116437h;
                        oq.u.b(objL);
                        iVar = (dx.i) objL;
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } else {
                    bVar4 = (ex.b) aVar.f116437h;
                    oq.u.b(objL);
                    iVar = (dx.i) objL;
                }
                return new dx.i.Right((ChildPassportApplicationDraft) bVar4.a(iVar));
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
