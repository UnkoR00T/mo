package hc4;

import java.util.concurrent.CancellationException;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhc4/o;", "Lbc4/p;", "Lb00/c;", "imageConverter", "Lqx/a;", "imagePropertiesProvider", "<init>", "(Lb00/c;Lqx/a;)V", "Lbc4/p$a;", "params", "Ldx/i;", "Ldx/b;", "Lwx/i$a;", "d", "(Lbc4/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Lb00/c;", "b", "Lqx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements bc4.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f83551h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f83552j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f83553k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f83554l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f83555m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f83556n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83558q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83556n = obj;
            this.f83558q |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    public o(b00.c cVar, qx.a aVar) {
        this.imageConverter = cVar;
        this.imagePropertiesProvider = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d1 A[Catch: Exception -> 0x003d, c -> 0x0041, CancellationException -> 0x0045, TryCatch #2 {Exception -> 0x003d, blocks: (B:13:0x0038, B:42:0x00cb, B:44:0x00d1, B:46:0x00d5, B:47:0x0140, B:48:0x0145, B:49:0x0146, B:50:0x0156, B:51:0x0157, B:54:0x0166), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[Catch: Exception -> 0x003d, c -> 0x0041, CancellationException -> 0x0045, TryCatch #2 {Exception -> 0x003d, blocks: (B:13:0x0038, B:42:0x00cb, B:44:0x00d1, B:46:0x00d5, B:47:0x0140, B:48:0x0145, B:49:0x0146, B:50:0x0156, B:51:0x0157, B:54:0x0166), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0140 A[Catch: Exception -> 0x003d, c -> 0x0041, CancellationException -> 0x0045, TryCatch #2 {Exception -> 0x003d, blocks: (B:13:0x0038, B:42:0x00cb, B:44:0x00d1, B:46:0x00d5, B:47:0x0140, B:48:0x0145, B:49:0x0146, B:50:0x0156, B:51:0x0157, B:54:0x0166), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0146 A[Catch: Exception -> 0x003d, c -> 0x0041, CancellationException -> 0x0045, TryCatch #2 {Exception -> 0x003d, blocks: (B:13:0x0038, B:42:0x00cb, B:44:0x00d1, B:46:0x00d5, B:47:0x0140, B:48:0x0145, B:49:0x0146, B:50:0x0156, B:51:0x0157, B:54:0x0166), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00d5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.p.Params params, tq.e<? super dx.i<? extends dx.b, wx.i.Image>> eVar) throws Throwable {
        a aVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        bc4.p.Params params2;
        ex.b bVar;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f83558q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f83558q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f83556n;
        Object objE = uq.b.e();
        int i16 = aVar2.f83558q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar2.f83550g;
                    params2 = (bc4.p.Params) aVar2.f83547d;
                    try {
                        u.b(obj);
                        iVar = (dx.i) obj;
                        if (!(iVar instanceof dx.i.Left)) {
                            bVar.b((dx.b) ((dx.i.Left) iVar).b());
                            throw new oq.g();
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        byte[] bArr = (byte[]) ((dx.i.Right) iVar).b();
                        FilePickerMetadata filePickerMetadataB = FilePickerMetadata.b(params2.getImage().getMetadata(), null, wx.d.INSTANCE.u(), bArr.length, null, 9, null);
                        px.f.f163100a.b("Transformed image:\noriginal file size: " + params2.getImage().getMetadata().d() + " MB\nnew file size: " + filePickerMetadataB.d() + " MB", px.c.a(bVar));
                        return new dx.i.Right(params2.getImage().b(filePickerMetadataB, new FileContent(bArr)));
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar3 = new ex.a();
                    b00.c cVar2 = this.imageConverter;
                    byte[] bytes = params.getImage().getFileContent().getBytes();
                    Integer defaultImageMaxSideOverride = params.getDefaultImageMaxSideOverride();
                    int iIntValue = defaultImageMaxSideOverride != null ? defaultImageMaxSideOverride.intValue() : this.imagePropertiesProvider.getDefaultImageMaxSide();
                    Integer defaultImageQualityOverride = params.getDefaultImageQualityOverride();
                    int iIntValue2 = defaultImageQualityOverride != null ? defaultImageQualityOverride.intValue() : this.imagePropertiesProvider.getDefaultImageQuality();
                    xw.a maxSize = params.getMaxSize();
                    aVar2.f83547d = params;
                    aVar2.f83548e = jVarA;
                    aVar2.f83549f = vq.j.a(aVar3);
                    aVar2.f83550g = aVar3;
                    aVar2.f83551h = 0;
                    aVar2.f83552j = 0;
                    aVar2.f83553k = 0;
                    aVar2.f83554l = 0;
                    aVar2.f83555m = 0;
                    aVar2.f83558q = 1;
                    Object objA = b00.c.a(cVar2, bytes, 0.0f, iIntValue, iIntValue2, maxSize, aVar2, 2, null);
                    if (objA == objE) {
                        return objE;
                    }
                    obj = objA;
                    params2 = params;
                    bVar = aVar3;
                    iVar = (dx.i) obj;
                    if (!(iVar instanceof dx.i.Left)) {
                        bVar.b((dx.b) ((dx.i.Left) iVar).b());
                        throw new oq.g();
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    byte[] bArr2 = (byte[]) ((dx.i.Right) iVar).b();
                    FilePickerMetadata filePickerMetadataB2 = FilePickerMetadata.b(params2.getImage().getMetadata(), null, wx.d.INSTANCE.u(), bArr2.length, null, 9, null);
                    px.f.f163100a.b("Transformed image:\noriginal file size: " + params2.getImage().getMetadata().d() + " MB\nnew file size: " + filePickerMetadataB2.d() + " MB", px.c.a(bVar));
                    return new dx.i.Right(params2.getImage().b(filePickerMetadataB2, new FileContent(bArr2)));
                } catch (ex.c e17) {
                    cVar = e17;
                    return new dx.i.Left((dx.b) ex.d.a(cVar));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    exc = e19;
                    r15 = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, exc, px.c.a(r15));
                    dx.i iVarA = r15.a(exc);
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
            } catch (Exception e25) {
                exc = e25;
                r15 = i16;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
