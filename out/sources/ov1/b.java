package ov1;

import a14.a0;
import az.d;
import dx.i;
import dx.j;
import fv0.BEFile;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import xw.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lov1/b;", "Lov1/a;", "Lgv0/a;", "downloadDiplomaUC", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "<init>", "(Lgv0/a;La14/a0;Laz/d;)V", "Lov1/a$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lov1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgv0/a;", "b", "La14/a0;", "getSaveFilesOnDeviceUseCase", "()La14/a0;", "c", "Laz/d;", "getFileConverter", "()Laz/d;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ov1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gv0.a downloadDiplomaUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d fileConverter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f150226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f150227h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f150228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f150229k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f150230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f150231m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f150232n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f150233p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f150234q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f150236s;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150234q = obj;
            this.f150236s |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(gv0.a aVar, a0 a0Var, d dVar) {
        this.downloadDiplomaUC = aVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.fileConverter = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ov1.a.Params params, e<? super i<? extends dx.b, String>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        ov1.a.Params params2;
        int i18;
        j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i19;
        ex.b bVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f150236s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f150236s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f150234q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f150236s;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = c.f221622a.a();
                    aVar2 = new ex.a();
                    gv0.a aVar3 = this.downloadDiplomaUC;
                    gv0.a.Params params3 = new gv0.a.Params(params.getDiplomaType(), params.getDiplomaSubtype(), params.getDiplomaUuid());
                    aVar.f150223d = params;
                    aVar.f150224e = jVarA;
                    aVar.f150225f = vq.j.a(aVar2);
                    aVar.f150226g = aVar2;
                    aVar.f150227h = aVar2;
                    i18 = 0;
                    aVar.f150229k = 0;
                    aVar.f150230l = 0;
                    aVar.f150231m = 0;
                    aVar.f150232n = 0;
                    aVar.f150233p = 0;
                    aVar.f150236s = 1;
                    objC = aVar3.c(params3, aVar);
                    if (objC != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i19 = 0;
                        bVar2 = aVar2;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f150233p;
                        i15 = aVar.f150232n;
                        i16 = aVar.f150231m;
                        i17 = aVar.f150230l;
                        int i27 = aVar.f150229k;
                        ex.b bVar4 = (ex.b) aVar.f150227h;
                        ex.b bVar5 = (ex.b) aVar.f150226g;
                        ex.b bVar6 = (ex.b) aVar.f150225f;
                        j<dx.b> jVar = (j) aVar.f150224e;
                        params2 = (ov1.a.Params) aVar.f150223d;
                        try {
                            u.b(objC);
                            i18 = i26;
                            jVarA = jVar;
                            bVar = bVar6;
                            bVar2 = bVar4;
                            aVar2 = bVar5;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            f fVar = f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            i iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) aVar.f150227h;
                        u.b(objC);
                    }
                    return new i.Right(this.fileConverter.a(new File((String) bVar3.a((i) objC))));
                } catch (CancellationException e18) {
                    throw e18;
                }
                BEFile bEFile = (BEFile) bVar2.a((i) objC);
                a0 a0Var = this.saveFilesOnDeviceUseCase;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bEFile.getContent().getBytes());
                String strJ = wx.d.INSTANCE.J();
                StringBuilder sb5 = new StringBuilder();
                ex.b bVar7 = bVar;
                sb5.append(params2.getDiplomaUuid());
                sb5.append(".pdf");
                a0.Params params4 = new a0.Params(byteArrayInputStream, sb5.toString(), strJ);
                aVar.f150223d = vq.j.a(params2);
                aVar.f150224e = jVarA;
                aVar.f150225f = vq.j.a(bVar7);
                aVar.f150226g = vq.j.a(aVar2);
                aVar.f150227h = aVar2;
                aVar.f150228j = vq.j.a(bEFile);
                aVar.f150229k = i19;
                aVar.f150230l = i17;
                aVar.f150231m = i16;
                aVar.f150232n = i15;
                aVar.f150233p = i18;
                aVar.f150236s = 2;
                objC = a0Var.c(params4, aVar);
                if (objC != objE) {
                    bVar3 = aVar2;
                    return new i.Right(this.fileConverter.a(new File((String) bVar3.a((i) objC))));
                }
                return objE;
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
